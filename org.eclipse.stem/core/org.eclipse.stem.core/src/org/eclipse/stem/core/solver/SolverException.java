package org.eclipse.stem.core.solver;



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
 * The exception is thrown when a problem is encountered by a solver computing the next step in a simulation 
 *  
 */


public class SolverException extends Exception  {

	/**
	 * Exceptions are serializable because of RMI
	 */
	private static final long serialVersionUID = -4134573574005319270L;

	private String mess;
	private Throwable originalException;
	private String [] params;
	
	/**
	 * Constuctor.
	 * 
	 * @param msgKey The key to use for the resource bundle. The bundle used is plugin-dependent, created using factory.
	 * @param msgParams Parameters for the message
	 * @param e Original exception
	 */
	
	public SolverException(String message, String [] msgParams, Throwable e) {
		super(message);
		this.mess = message;
		this.originalException = e;
		this.params = msgParams;
	}
	
	public String getErrorMessage() {
		return mess;
	}
	
	public Throwable getOriginalException() {
		return originalException;
	}
	
	public String [] getParams() {
		return params;
	}
}
