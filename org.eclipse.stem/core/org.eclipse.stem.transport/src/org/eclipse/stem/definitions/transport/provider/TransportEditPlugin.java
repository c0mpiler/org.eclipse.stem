package org.eclipse.stem.definitions.transport.provider;

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
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.stem.core.common.provider.CoreEditPlugin;
import org.eclipse.stem.definitions.edges.provider.DefinitionsEditPlugin;
import org.osgi.framework.Bundle;

/**
 * This is the central singleton for the Transport edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class TransportEditPlugin extends EMFPlugin {
	
	public static String PLUGIN_ID = "org.eclipse.stem.ui.transport";
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TransportEditPlugin INSTANCE = new TransportEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportEditPlugin() {
		super
		  (new ResourceLocator [] {
		     DefinitionsEditPlugin.INSTANCE,
		     CoreEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return getPlugin();
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	public static void setPlugin(Implementation plugin) {
		TransportEditPlugin.plugin = plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			setPlugin(this);
			
			// We need to start the ui plugin here to make sure to register the new graph generator in the UI
			
			Bundle uiBundle = Platform.getBundle(PLUGIN_ID);
			if (uiBundle != null) {
				try {
					uiBundle.start(Bundle.START_TRANSIENT);
				} catch(Exception e) {
					e.printStackTrace();
				}
			} 
		}
	}

}
