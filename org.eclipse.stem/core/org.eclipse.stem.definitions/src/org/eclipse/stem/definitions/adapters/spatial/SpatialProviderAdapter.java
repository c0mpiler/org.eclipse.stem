// SpatialProviderAdapter.java
package org.eclipse.stem.definitions.adapters.spatial;

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

import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * This class is extended by classes that adapt Identifiables to
 * SpatialProviders.
 * 
 * @see org.eclipse.stem.core.common.Identifiable
 */
abstract public class SpatialProviderAdapter extends AdapterImpl implements
		SpatialProvider {

	/**
	 * This is the scheme used for specifying URI's that are values for the
	 * <em>spatial</em> attribute of an <code>Identifiable</code>'s dublin
	 * core instance. If the value is a valid URI that conforms to this scheme,
	 * it will be interpreted by the adapter.
	 * 
	 * @see org.eclipse.stem.core.common.Identifiable
	 * @see org.eclipse.stem.core.common.DublinCore#getSpatial()
	 * @see org.eclipse.stem.core.common.DublinCore#setSpatial(String)
	 */
	public static final String STEM_SPATIAL_SCHEME = "stemspatial";

	/**
	 * the scheme with a colon
	 */
	public static final String STEM_SPATIAL_SCHEME_PREFIX = STEM_SPATIAL_SCHEME
			+ ":";

	/**
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return type == SpatialProvider.class;
	} // isAdapterForType
	
	
} // SpatialProviderAdapter
