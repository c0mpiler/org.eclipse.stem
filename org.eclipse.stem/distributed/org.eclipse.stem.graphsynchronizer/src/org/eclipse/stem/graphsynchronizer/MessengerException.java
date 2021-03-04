package org.eclipse.stem.graphsynchronizer;

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
 * Thrown when a problem with the underlying messenger is detected. The cause
 * of the exception is implementation dependent.
 */
public class MessengerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7123687888747981757L;

	public MessengerException(String msg) {
		super(msg);
	}

	public MessengerException(String msg, Exception e) {
		super(msg, e);
	}

}
