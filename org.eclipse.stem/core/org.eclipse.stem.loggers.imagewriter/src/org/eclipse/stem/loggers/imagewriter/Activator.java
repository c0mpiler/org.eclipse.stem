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
package org.eclipse.stem.loggers.imagewriter;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.stem.ui.wizards.ImageWriterLoggerPropertyStringProviderAdapterFactory;
import org.eclipse.stem.ui.wizards.ImagewriterLoggerPropertyEditorAdapterFactory;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	/**
	 * The plug-in ID
	 */
	public static final String PLUGIN_ID = "org.eclipse.stem.loggers.imagewriter"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	/**
	 * @param context
	 * @throws Exception
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		new ImageWriterLoggerPropertyStringProviderAdapterFactory();
		new ImagewriterLoggerPropertyEditorAdapterFactory();
	} // start

	/**
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Log an error to the ILog for this plugin
	 * 
	 * @param message
	 *            the localized error message text
	 * @param exception
	 *            the associated exception, or null
	 */
	public static void logError(String message, Throwable exception) {
		getDefault().getLog().log(
				new Status(IStatus.ERROR, PLUGIN_ID,
						0, message, exception));
	} // logError

	/**
	 * Log information to the ILog for this plugin
	 * 
	 * @param message
	 *            the localized information message text
	 * @param exception
	 *            the associated exception, or null
	 */
	public static void logInformation(String message, Throwable exception) {
		getDefault().getLog().log(
				new Status(IStatus.INFO, PLUGIN_ID,
						0, message, exception));
	} // logInformation
	
	
	/**
	 * Log information to the ILog for this plugin
	 * 
	 * @param message
	 *            the localized information message text
	 * @param exception
	 *            the associated exception, or null
	 */
	public static void logWarning(String message, Throwable exception) {
		getDefault().getLog().log(
				new Status(IStatus.WARNING, PLUGIN_ID,
						0, message, exception));
	} // logInformation
} // Activator
