package org.eclipse.stem.core.scenario;

import org.eclipse.stem.core.common.Identifiable;


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
 * The exception is thrown when a problem is encountered initializing a scenario, i.e. building of the canonical graph. Typically
 * the designer of the scenario did a mistake composing the scenario.
 *  
 */


public class ScenarioInitializationException extends Exception  {

	/**
	 * Exceptions are serializable because of RMI
	 */
	private static final long serialVersionUID = -4134573574005319250L;

	private String mess;
	private Exception originalException;
	private Identifiable ident;
	
	/**
	 * Constuctor.
	 * 
	 * @param msgKey The key to use for the resource bundle. The bundle used is plugin-dependent, created using factory.
	 * @param msgParams Parameters for the message
	 * @param e Original exception
	 */
	
	public ScenarioInitializationException(String message, Identifiable id, Exception e) {
		this.mess = message;
		this.originalException = e;
		this.ident = id;
	}
	
	public String getErrorMessage() {
		return mess;
	}
	
	public Exception getOriginalException() {
		return originalException;
	}
	
	public Identifiable getIdentifiable() {
		return ident;
	}
}
