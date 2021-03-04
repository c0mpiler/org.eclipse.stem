/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.transform;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin 
{
	public static final String PLUGIN_ID = "org.eclipse.stem.model.transform";
	
	private static BundleContext context;

	private static Activator plugin;
	
	static BundleContext getContext() 
	{
		return context;
	}
	
	public static Activator getPlugin()
	{
		return plugin;
	}
	
	public static void log(IStatus status)
	{
		getPlugin().getLog().log(status);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception 
	{
		Activator.plugin = this;
		Activator.context = bundleContext;
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put("platform", new MetamodelResourceFactory());
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception 
	{
		Activator.context = null;
		Activator.plugin = null;
	}

}
