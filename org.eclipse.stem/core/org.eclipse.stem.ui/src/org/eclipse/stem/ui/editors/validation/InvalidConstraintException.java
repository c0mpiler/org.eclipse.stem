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
package org.eclipse.stem.ui.editors.validation;

/**
 * Runtime exception that is thrown when an invalid constraint is passed to a 
 * constraint handler. Example is when a non-numeric constraint is given to 
 * a constraint handler that requires a numeric value, such as a min/max 
 * value constraint handler
 *
 */
public class InvalidConstraintException extends RuntimeException
{
	/**
	 * serial number
	 */
	private static final long serialVersionUID = 9006621938531204143L;
	
	/**
	 * Creates an exception for the given message
	 * @param message
	 */
	public InvalidConstraintException(String message)
	{
		super(message);
	}
	
	/**
	 * Creates an exception for the given message and throwable instance
	 * @param message
	 * @param t
	 */
	public InvalidConstraintException(String message, Throwable t)
	{
		super(message, t);
	}

}