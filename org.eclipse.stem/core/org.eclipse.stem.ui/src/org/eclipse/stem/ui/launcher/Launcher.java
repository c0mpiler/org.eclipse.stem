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
package org.eclipse.stem.ui.launcher;

import java.util.List;
import java.util.Map;

import org.eclipse.equinox.app.IApplicationContext;

/**
 * Abstract class representing a STEM application launcher
 * Implementing classes should populate the abstract 
 * launch() method for invocation.
 *
 */
public abstract class Launcher 
{
	/**
	 * Eclipse Application Context
	 */
	protected IApplicationContext context;
	
	/**
	 * Parsed command line arguments
	 */
	protected Map<String,List<String>> args;
	
	
	public Launcher()
	{
		this(null,null);
	}
	
	/**
	 * Launcher super constructor.  Sets the application context and command
	 * line arguments for all implementations. 
	 * 
	 * @param context Eclipse Application Context (passed to IApplication#start())
	 * @param args Parsed command line arguments
	 */
	public Launcher(IApplicationContext context, Map<String,List<String>> args)
	{
		this.context = context;
		this.args = args;
	}
	
	void setContext(IApplicationContext context)
	{
		this.context = context;
	}
	
	void setCommandArguments(Map<String,List<String>> args)
	{
		this.args = args;
	}
	
	
	/**
	 * @return The Eclipse application context
	 */
	protected IApplicationContext getContext()
	{
		return context;
	}
	
	/**
	 * @return The parsed command line arguments
	 */
	protected Map<String,List<String>> getCommandArguments()
	{
		return args;
	}
	
	/**
	 * Launches the STEM application.  Implementations should 
	 * use this method to prepare, launch, and manage the lifecycle
	 * of the STEM application based on the conditions of the launcher 
	 * implementation.
	 * 
	 * The return from this method represents the intended return from
	 * {@link IApplication#start(IApplicationContext)}, an integer from the set of [{@link IApplication#EXIT_OK},
	 * {@link IApplication#EXIT_RELAUNCH}, {@link IApplication#EXIT_RESTART}].
	 * 
	 * @return See return from IApplication#start(IApplicationContext)
	 */
	public abstract Object launch();
}
