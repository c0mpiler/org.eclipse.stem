package org.eclipse.stem.graphsynchronizer;

import java.util.Properties;

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
 * This interface is implemented by any class providing messaging functionality used by STEM
 * when synchronizing graphs between running STEM instances. The actual messenger used at
 * runtime is configured in the nodeconfig.properties file. It should be relatively straightforward
 * to implement a Messenger for any special hardware available, e.g. using a native OpenMPI 
 * implementation. 
 */
public interface Messenger {
	
	/**
	 * Initialize the messenger. Configuration parameters are passed in the properties input
	 * 
	 * @param p Configuration parameters
	 */
	
	public void initialize(Properties p) throws MessengerException;
	
	/**
	 * The start method makes the messenger ready 
	 * for sending and receiving messages.
	 */
	
	public void start() throws MessengerException;

	/**
	 * Stop the messenger. The method is called when STEM shuts down
	 */
	
	public void stop() throws MessengerException;

	/**
	 * Send a message to node n
	 * 
	 * @param msg The message
	 * @param n The rank of the node to send the message to
	 */
	
	public void sendMsg(byte [] msg, int n) throws MessengerException;
	
	/**
	 * Receive a message from node n. The method is expected to block until
	 * the message is available
	 * 
	 * @param n The node rank
	 * @return String the message
	 */
	
	public byte [] recvMsg(int n)  throws MessengerException;
	
	/**
	 * wakeupBlockedRecv. The method wakes up any blocked receivers. It is
	 * called before STEM shuts down and also when a user stops a simulation
	 */
	
	public void wakeupBlockedRecv() throws MessengerException;
	
}
