// SpatialProviderAdapterFactory.java
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

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

/**
 * This class is extended by classes that create adapters that adapt
 * Identifiables to SpatialProviders.
 * 
 * @see org.eclipse.stem.core.common.Identifiable
 */
public abstract class SpatialProviderAdapterFactory extends AdapterFactoryImpl {

	/**
	 * @see org.eclipse.emf.common.notify.impl.AdapterFactoryImpl#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return type == SpatialProvider.class;
	} // isFactoryForType

} // SpatialProviderAdapterFactory
