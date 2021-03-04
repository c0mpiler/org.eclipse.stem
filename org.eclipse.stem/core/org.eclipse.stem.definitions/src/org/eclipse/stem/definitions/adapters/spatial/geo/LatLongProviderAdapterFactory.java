// LatLongProviderAdapterFactory.java
package org.eclipse.stem.definitions.adapters.spatial.geo;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.stem.definitions.adapters.spatial.SpatialProviderAdapterFactory;

/**
 * This class creates adapters that that adapt <code>Identifiable</code>'s to
 * <code>LatLongProvider</code>'s. The typical <code>LatLongProvider</code>
 * that is returned extracts the lat/long data from the <em>spatial</em>
 * attribute of an <code>Identifiable</code>'s dublin core instance.
 * 
 * @see org.eclipse.stem.core.common.Identifiable
 */
public class LatLongProviderAdapterFactory extends
		SpatialProviderAdapterFactory {

	/**
	 * This is the singleton instance of the adapter.
	 */
	private static LatLongProviderAdapter adapter = null;

	/**
	 * This is a static reference to the adapter factory to use.
	 */
	public final static LatLongProviderAdapterFactory INSTANCE = new LatLongProviderAdapterFactory();

	/**
	 * @see org.eclipse.stem.definitions.adapters.spatial.SpatialProviderAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(final Object type) {
		return type == LatLongProvider.class;
	} // isFactoryForType

	/**
	 * @see org.eclipse.stem.definitions.adapters.spatial.LatLongProviderAdapterFactory#createAdapter(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	protected Adapter createAdapter(final Notifier target) {
//		// Have we already created an adapter?
//		if (adapter == null) {
//			// No
//			adapter = new LatLongProviderAdapter();
//		}
		// 2012-11-29 MAD This is no longer going to be a singleton to make lat long providers thread safe
		return new LatLongProviderAdapter();
	} // createAdapter

} // LatLongProviderAdapterFactory
