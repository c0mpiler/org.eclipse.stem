package org.eclipse.stem.populationmodels;

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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.stem.core.Constants;
import org.eclipse.stem.populationmodels.standard.provider.StandardHistoryProviderAdapterFactory;
import org.eclipse.stem.populationmodels.standard.provider.StandardRelativeValueHistoryProviderAdapterFactory;
import org.eclipse.stem.populationmodels.standard.provider.StandardRelativeValueProviderAdapterFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * The plug-in ID
	 */
	public static final String PLUGIN_ID = Constants.ID_ROOT + ".populationmodels"; //$NON-NLS-1$
	
	/**
	 * 
	 */
	public static final String CLASS_FIELD = "class"; //$NON-NLS-1$

	/**
	 * 
	 */
	private static final String POP_MODEL_UI_PLUGIN_NAME = "org.eclipse.stem.ui.populationmodels"; //$NON-NLS-1$
	
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
		
		// We need to start the ui.populationmodels plugin here
		// to make sure StandardRelativeValueProviderAdapterFactory is
		// registered. It's used by the logger when running headless.
		
		Bundle popBundle = Platform.getBundle(POP_MODEL_UI_PLUGIN_NAME);
		if (popBundle != null) {
			popBundle.start(Bundle.START_TRANSIENT);
		} else {
			System.err.println("Pop Model UI plugin not found.  Distributed mode not enabled.");
		}


		// We create these instances so that their constructors run and they
		// then add themselves to a collection of factories maintained by the
		// factory interfaces they implement respectively.
		
		// Add to RelativeValueProviderAdapterFactory.INSTANCE
		new StandardRelativeValueProviderAdapterFactory();
		
		// Add to RelativeValueHistoryProviderAdapterFactory.INSTANCE
		new StandardRelativeValueHistoryProviderAdapterFactory();
		
		// Add to HistoryProviderAdapterFactory.INSTANCE
		new StandardHistoryProviderAdapterFactory();
	
		
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
		// Running as a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.ERROR, plugin.getBundle()
							.getSymbolicName(), 0, message, exception));
		} else {
			System.err.println(message);
			// Exception?
			if (exception != null) {
				// Yes
				System.err.println(exception.getMessage());
				exception.printStackTrace(System.err);
			}
		}

	} // logError

	/**
	 * Log warning to the ILog for this plugin
	 * 
	 * @param message
	 *            the localized information message text
	 * @param exception
	 *            the associated exception, or null
	 */
	public static void logWarning(String message, Throwable exception) {
		// Running as a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.WARNING, plugin.getBundle()
							.getSymbolicName(), 0, message, exception));
		} else {
			System.out.println(message);
			// Exception?
			if (exception != null) {
				// Yes
				System.out.println(exception.getMessage());
				exception.printStackTrace(System.err);
			}
		}

	} // logInformation
	
	/**
	 * Log information to the ILog for this plugin
	 * 
	 * @param message
	 *            the localized information message text
	 * @param exception
	 *            the associated exception, or null
	 */
	public static void logInformation(String message, Throwable exception) {
		// Running as a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.INFO, plugin.getBundle()
							.getSymbolicName(), 0, message, exception));
		} else {
			System.out.println(message);
			// Exception?
			if (exception != null) {
				// Yes
				System.out.println(exception.getMessage());
				exception.printStackTrace(System.err);
			}
		}

	} // logInformation
	
	/**
	 * Log information to the ILog for this plugin
	 * 
	 * @param message
	 *            the localized information message text
	 * @param exception
	 *            the associated exception, or null
	 */
	public static void logInformation(String message) {
		// Running as a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.INFO, plugin.getBundle()
							.getSymbolicName(), 0, message, null));
		} else {
			System.out.println(message);
		}

	} // logInformation
	
	
} // Activator
