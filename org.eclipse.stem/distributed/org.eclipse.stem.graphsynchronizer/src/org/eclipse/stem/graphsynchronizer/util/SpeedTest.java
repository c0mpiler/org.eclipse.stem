package org.eclipse.stem.graphsynchronizer.util;
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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.stem.graphsynchronizer.Activator;

/**
 * Network speed test utility
 *
 */
public class SpeedTest {

	static boolean SENDER = true;
	static int COMM_PORT = 1111;
	static String remoteHost;
	
	static int [] LARGE_OBJECT_1GB;
	static int SIZE_OF_INT = 4; // bytes
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length > 0) remoteHost = args[0];
		try {
			if(!SENDER) setupCommunication();
			else  speedTest();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void setupCommunication() throws IOException {
		ServerSocket serverSocket = new ServerSocket(COMM_PORT);
		Job acceptJob = new SocketListenerJob("Socket listener ",serverSocket);
		acceptJob.schedule();
	}
	
	protected static class SocketListenerJob extends Job {
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
				while(true) {
					Socket s = socket.accept();
					new ConnectionHandler("Accepting connection", s);
				}
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
			return Status.OK_STATUS;
		}
		
	}
	
	protected static class ConnectionHandler extends Job {
		private Socket soc;
		public ConnectionHandler(String n) {
			super(n);
		}
		public ConnectionHandler(String n, Socket s) {
			super(n);
			soc = s;
			this.schedule();
		}
		/**
		 * 
		 */
		@SuppressWarnings("unused")
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			ObjectInputStream ois = null;
			String status="OK";
			try {
				ois = new ObjectInputStream(soc.getInputStream());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				String xmi = (String)ois.readObject();
				ByteArrayInputStream bais = new ByteArrayInputStream(xmi.getBytes());
			} catch(Exception e) {
				e.printStackTrace();
				status = "ERROR";
			}
			try {
				ObjectOutputStream oos = new ObjectOutputStream(soc.getOutputStream());
				oos.writeObject(status);
				ois.close();
				oos.close();
				soc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			return Status.OK_STATUS;
		}
		
	}
	
	private static void speedTest() {
		try {
			LARGE_OBJECT_1GB= new int[1024*1024*64/SIZE_OF_INT/*1073741824*/];
			long now = System.currentTimeMillis();
			InetAddress otherHost = InetAddress.getByName(remoteHost);
			Socket soc = new Socket(otherHost.getHostName(), COMM_PORT);
			ObjectOutputStream oos = new ObjectOutputStream(soc.getOutputStream());
			
			oos.writeObject(LARGE_OBJECT_1GB);
			ObjectInputStream ois = new ObjectInputStream(soc.getInputStream());
			String mess = (String)ois.readObject();
			if(!mess.equals("OK"))
				Activator.logInformation("Error received from "+remoteHost+": "+mess);
			
			long then = System.currentTimeMillis();
			
			Activator.logInformation("Total time:"+(then-now));
			
			ois.close();
			oos.close();
			soc.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
