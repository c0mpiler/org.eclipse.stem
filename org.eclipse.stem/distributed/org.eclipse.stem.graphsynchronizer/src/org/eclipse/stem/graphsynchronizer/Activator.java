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


import java.io.InputStream;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.stem.graphsynchronizer.impl.SimulationGraphSynchronizer;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.stem.graphsynchronizer"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	// Startup reference
	
	public static String CONFIGFILE = "nodeconfig.properties";
	
	public static String NODERANKKEY = "NODERANK";
	public static String NUMNODESKEY = "NUMNODES";
	public static String MESSENGERCLASSKEY = "MESSENGERCLASS";
	public static String USEBINARYKEY = "BINARYSERIALIZATION";
	public static String USEZIPKEY = "USEZIP";

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		SimulationManager manager = SimulationManager.getManager();
		SimulationManagerDelegate smd = new SimulationManagerDelegate();		
		manager.addSimulationManagerListenerSync(smd);
		SynchGraphPartitioner sgp = GraphsynchronizerFactory.eINSTANCE.createSynchGraphPartitioner();
		manager.setGraphPartitioner(sgp);
		
		int noderank=-1, numnodes=-1;
		String messengerClass = null;
		Properties config = null;
		boolean useBinary, compress;
		
		try {
		
			config = new Properties();
			
			IPath path = new Path(CONFIGFILE);
			InputStream is = FileLocator.openStream(Platform.getBundle(Activator.PLUGIN_ID), path, false);
			config.load(is);
			is.close();
			
			
			try {
				noderank = Integer.parseInt(config.getProperty(NODERANKKEY));
			} catch(NumberFormatException nfe) {
				throw new BadConfigFileException("Invalid or missing "+NODERANKKEY+" in properties file");
			}
			
			try {
				numnodes = Integer.parseInt(config.getProperty(NUMNODESKEY));
			} catch(NumberFormatException nfe) {
				throw new BadConfigFileException("Invalid or missing "+NUMNODESKEY+" in properties file");
			}
			
			if(noderank < 0 || numnodes < 1)
				throw new BadConfigFileException("Invalid configuration, "+NODERANKKEY+" must be 0 or greater and "+NUMNODESKEY+" must be 1 or greater");
			messengerClass = config.getProperty(MESSENGERCLASSKEY);
			if(messengerClass == null) 
				throw new BadConfigFileException("Missing messenger class specification");
			
			useBinary = Boolean.parseBoolean(config.getProperty(USEBINARYKEY));
			compress = Boolean.parseBoolean(config.getProperty(USEZIPKEY));
			
		} catch(Exception e) {
			Activator.logError("Unable to read configuration file for distributed STEM", e);
			return;
		}
		sgp.setNodeRank(noderank);
		sgp.setNumNodes(numnodes);

		Messenger messenger = null;
		try {
		 Class<?> messC = Class.forName(messengerClass);
		 messenger = (Messenger)messC.newInstance();
		} catch(Exception cnfe) {
			Activator.logError("Unable to load or instantiate class "+messengerClass, cnfe);
			return;
		}
		
		SimulationGraphSynchronizer.messenger = messenger;
		SimulationGraphSynchronizer.BINARYSERIALIZATION = useBinary;
		SimulationGraphSynchronizer.ZIPMESSAGES = compress;
		try {
			messenger.initialize(config);
			messenger.start();
		} catch(MessengerException me) {
			Activator.logError("Unable to initialize or start messenger "+messengerClass, me);
			return;
		}


	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		try {
			SimulationGraphSynchronizer.messenger.stop();
		} catch(MessengerException me) {
			// Activator might be down. Just dump the stack trace
			me.printStackTrace();
		}

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
		// Do we have a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(),
							0, message, exception));
		}
		else {
			// No
			System.out.println(message);
			// Exception?
			if (exception != null) {
				// Yes
				System.out.println(exception.getMessage());
			} // if 
		}
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
		// Do we have a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.INFO, plugin.getBundle().getSymbolicName(),
							0, message, exception));
		}
		else {
			// No
			System.out.println(message);
			// Exception?
			if (exception != null) {
				// Yes
				System.out.println(exception.getMessage());
			} // if 
		}
	} // logInformation
	
	
	/**
	 * Log information to the ILog for this plugin
	 * The method is overloaded to allow for logInformation without an error 
	 * method sets the error to null. This should be used instead of System.out.println
	 * throughout the code.
	 * @param message
	 *            the localized information message text
	 *
	 */
	public static void logInformation(String message) {
		// Do we have a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.INFO, plugin.getBundle().getSymbolicName(),
							0, message, null));
		}
		else {
			// No
			System.out.println(message);
		}
	} // logInformation

}
