package org.eclipse.stem.graphsynchronizer.impl;

/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/

/**
 * A messenger that sends and receives messages over tcp/ip. Since it's expected to run
 * inside Eclipse it's using Jobs instead of Threads.
 */

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.stem.graphsynchronizer.Messenger;
import org.eclipse.stem.graphsynchronizer.MessengerException;
import org.eclipse.stem.jobs.Activator;

public class NetworkMessenger implements Messenger {

	public static String REMOTEHOSTSKEY = "REMOTEHOSTS";
	public static String PORTKEY = "PORT";
	public static int DEFAULT_PORT = 1211;
	
	private String [] hosts;
	private byte [][] recvMessages;
	protected InetAddress [] hostAddresses;
	
	private int com_port; 

	protected static Job acceptJob;

	// Used to block until data is received from a host;
	protected static CyclicBarrier [] dataReceivedBarriers;

	/**
	 * Initialize the messenger
	 */
	
	public void initialize(Properties p) throws MessengerException {
		String remoteHosts = p.getProperty(REMOTEHOSTSKEY);
		if(remoteHosts == null) 
			throw new MessengerException("Missing remote hosts specification");
		String port = p.getProperty(PORTKEY);
		if(port == null) com_port = DEFAULT_PORT;
		else com_port = Integer.parseInt(port);
		StringTokenizer st = new StringTokenizer(remoteHosts, ";");
		hosts = new String[st.countTokens()];
		int n=0;
		while(st.hasMoreTokens()) hosts[n++] = st.nextToken();
		
		dataReceivedBarriers = new CyclicBarrier[hosts.length];
		recvMessages  = new byte[hosts.length][];
		hostAddresses = new InetAddress[hosts.length];
		for(int i=0;i<hosts.length;++i) {
			dataReceivedBarriers[i] = new CyclicBarrier(2);
			try {
				hostAddresses[i] = InetAddress.getByName(hosts[i]);
			} catch(UnknownHostException e) {
				throw new MessengerException("Unable to resolve host "+hosts[i], e);
			}
		}
		
	}

	
	public void start() throws MessengerException {
		try {
			ServerSocket serverSocket = new ServerSocket(com_port);
			acceptJob = new SocketListenerJob("Socket listener ",serverSocket);
			acceptJob.schedule();
		} catch(Exception e) {
			throw new MessengerException("Unable to start messenger", e);
		}
	}

	public void stop() throws MessengerException {
		wakeupBlockedRecv();
		acceptJob.cancel();
	}

	public void sendMsg(byte [] msg, int n) throws MessengerException {
		try {
			InetAddress otherHost = hostAddresses[n];
			Socket soc = new Socket(otherHost.getHostName(), com_port);
			ObjectOutputStream oos = new ObjectOutputStream(soc.getOutputStream());	
			oos.writeObject(msg);
			oos.close();
			soc.close();
		} catch(Exception e) {
			throw new MessengerException("Exception encountered sending message to "+hostAddresses[n], e);
		}
	}

	public byte [] recvMsg(int n)  throws MessengerException {
		try {
			dataReceivedBarriers[n].await();
		} catch(Exception e) {
			throw new MessengerException("Problem receiving message from host "+n);
		}
		return recvMessages[n];
	}

	protected class SocketListenerJob extends Job {
		ServerSocket socket;
		public SocketListenerJob(String name) {
			super(name);
		}
		public SocketListenerJob(String name, ServerSocket socket) {
			super(name);
			this.socket = socket;
		}
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			
			try {
				while(!socket.isClosed()) {
					Socket s = socket.accept();
					if(socket.isClosed()) break;
					// Which host is connecting?
					InetAddress addr = s.getInetAddress();
					int h = -1;
					for(int i=0;i<hostAddresses.length;++i)
						if(addr.equals(hostAddresses[i])) h = i;
					if(h == -1)
						throw new MessengerException("Unable to determine which host connected, address was "+addr);
					
					new ConnectionHandler("Accepting connection", s, h);
				}
			} catch(SocketException se) {
				// The socket was most likely closed since the user shut down STEM
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}catch(MessengerException me) {
				me.printStackTrace();
			}
			
			return Status.OK_STATUS;
		}
		@Override
		protected void canceling() {
			try {
				socket.close();
				this.join();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected class ConnectionHandler extends Job {
		private Socket soc;
		private int otherRank;
		
		public ConnectionHandler(String n) {
			super(n);
		}
		public ConnectionHandler(String n, Socket s, int h) {
			super(n);
			soc = s;
			otherRank = h;
			this.schedule();
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			ObjectInputStream ois = null;
			try {
				ois = new ObjectInputStream(soc.getInputStream());
			} catch (IOException e1) {
				Activator.logError("Error reading data on socket", e1);
			}
			try {
				byte[] msg = (byte[])ois.readObject();
				recvMessages[otherRank] = msg;
				ois.close();
				soc.close();
			} catch(Exception e) {
				e.printStackTrace(); // What do we do when an exception happens here? 
			}
			
			// Wake up anybody waiting for the message
			try{
				dataReceivedBarriers[otherRank].await();
			} catch(BrokenBarrierException bbe) { 
				Activator.logError("Broken barrier waiting for data", bbe);
			} catch(InterruptedException ie) {
				Activator.logError("Interrupted waiting for data", ie);
			}
			return Status.OK_STATUS;
		}
		
	}
	
	public void wakeupBlockedRecv() throws MessengerException {
		int n=0;
		for(CyclicBarrier cb:dataReceivedBarriers) {
			if(cb.getNumberWaiting() == 1) {
				recvMessages[n] = null; // null means no data or interrupted
				try {
					cb.await(); // will return righ away and wake up the blocked party
				} catch(Exception e) {
					throw new MessengerException("Problem waking up blocked receiver", e);
				}
			}
			++n;
		}
	}
	
}
