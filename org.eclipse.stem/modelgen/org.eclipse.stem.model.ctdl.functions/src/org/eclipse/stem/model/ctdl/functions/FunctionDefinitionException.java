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
package org.eclipse.stem.model.ctdl.functions;

public class FunctionDefinitionException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ExternalFunctionDefinition fd;
	
	public FunctionDefinitionException(String message)
	{
		this(message,null,null);
	}

	public FunctionDefinitionException(String message, Throwable parent)
	{
		this(message, null, parent);
	}
	
	public FunctionDefinitionException(String message, ExternalFunctionDefinition fd)
	{
		this(message,fd,null);
	}

	public FunctionDefinitionException(String message, ExternalFunctionDefinition fd, Throwable parent)
	{
		super(message, parent);
		this.fd = fd;
	}
	
	public ExternalFunctionDefinition getFunctionDefinition()
	{
		return fd;
	}
	
}
