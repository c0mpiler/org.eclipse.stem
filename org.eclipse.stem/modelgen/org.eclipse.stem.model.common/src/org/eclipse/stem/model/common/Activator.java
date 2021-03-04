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
package org.eclipse.stem.model.common;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	private static BundleContext context;

	private static Activator plugin;
	
	/**
	 */
	public static BundleContext getContext() {
		return context;
	}
	
	
	
	
	public static Activator getPlugin()
	{
		return plugin;
	}

	/**
	 * Logs a status message to the plug-in's logger
	 * @param status status message to log
	 */
	public static void log(IStatus status)
	{
		getPlugin().getLog().log(status);
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.plugin = this;
		Activator.context = bundleContext;
		
		ModelProjectBundleLoadHandler.getInstance().start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		
		ModelProjectBundleLoadHandler.getInstance().stop();
		
		Activator.context = null;
		Activator.plugin = null;
	}

}
