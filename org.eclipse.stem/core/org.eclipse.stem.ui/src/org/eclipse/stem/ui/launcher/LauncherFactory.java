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

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * Factory class to determine and return the correct 
 * STEM launcher implementation based on the application 
 * context and command line parameters.
 */
public class LauncherFactory 
{
	
	/**
	 * Name of the extension points that plugins will register launchers into
	 */
	public static final String LAUNCHERS_EXTENSION_POINT_ID = "org.eclipse.stem.ui.launchers";

	/**
	 * Parses command line arguments and returns the requested
	 * STEM launcher based on the arguments passed. 
	 * 
	 * Currently only supports the workbench and the headless launchers.
	 * 
	 * @param context Eclipse Application Context
	 * @return Launcher to use for launching the STEM application
	 */
	public static Launcher getLauncher(IApplicationContext context)
	{
		// Parse the command line arugments
		String[] args = (String[])context.getArguments().get("application.args");
		Map<String,List<String>> commandArgs = CommandArgumentParser.parse(args);
	
		// Find the correct launcher based on configuration
		Launcher launcher = getLauncherFromExtensions(commandArgs);
        if (launcher == null) {
        	launcher = new WorkbenchLauncher();
        }
        
        // Set the command line options
        launcher.setContext(context);
        launcher.setCommandArguments(commandArgs);
        
		return launcher;
	}
	
	/**
	 * Finds the correct launcher based on command line inputs from the list of
	 * launchers provided by plugins.
	 * 
	 * @param commandArgs
	 * @return
	 */
	private static Launcher getLauncherFromExtensions(Map<String,List<String>> commandArgs)
	{
		String launcherName = null;
		if (commandArgs.containsKey("launcher") && commandArgs.get("launcher").size() > 0) {
			launcherName = commandArgs.get("launcher").get(0);
		}
		
		Launcher launcher = null;
        IConfigurationElement[] extensions = Platform.getExtensionRegistry().getConfigurationElementsFor(LAUNCHERS_EXTENSION_POINT_ID);
        for (IConfigurationElement e : extensions) {
            try {
            	String name = e.getAttribute("name");
        		if (name != null && (name.equals(launcherName) || commandArgs.containsKey(name))) {
        			launcher = (Launcher)e.createExecutableExtension("class");
        			break;
        		}
            } catch (Exception ce) {
            	// ignore, don't care
            }
        }
        
        return launcher;
	}
}
