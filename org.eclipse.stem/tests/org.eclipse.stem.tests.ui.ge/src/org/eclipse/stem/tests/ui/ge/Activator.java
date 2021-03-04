package org.eclipse.stem.tests.ui.ge;
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

import org.eclipse.core.runtime.Plugin;
import org.eclipse.stem.core.Constants;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle.
 * It subclasses AbstractUIPlugin which takes care of 
 * restoring and saving Preferences.
 * 
 * It is not clear if we need this class for the ge.tests 
 * plugin project.  So far it has not hurt!
 */
public class Activator extends Plugin {

	/**
	 * The plug-in ID
	 */ 
	public static final String PLUGIN_ID = Constants.ID_ROOT +"tests.ui.gee"; //$NON-NLS-1$

	/** 
	 * The shared instance
	 * 
	 */
	static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	
	/**
	 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}


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
		if (plugin == null) 
			plugin = new Activator();
		return plugin;
	}

	
}
