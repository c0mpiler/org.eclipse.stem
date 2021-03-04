package org.eclipse.stem.utility.gml;

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
 * The activator class controls the plug-in life cycle
 */
public class UtilLogger  {

	/**
	 * The plug-in ID
	 */
	public static final String PLUGIN_ID = "org.eclipse.stem.ui.reports"; //$NON-NLS-1$

	// The shared instance
	private static UtilLogger plugin;

	/**
	 * The constructor
	 */
	public UtilLogger() {
		plugin = this;
	}

	

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static UtilLogger getDefault() {
		return plugin;
	}

	
	/**
	 * Log information to the ILog for this plugin
	 * The method is overloaded to allow for logInformation without an error 
	 * method sets the error to null. This should be used instead of UtilLogger.logInformation
	 * throughout the code.
	 * @param message
	 *            the localized information message text
	 *
	 */
	public static void logInformation(String message) {
		System.out.println(message);
	} // logInformation
	
} // Activator
