// DefaultPropertyStringProviderAdapter.java
package org.eclipse.stem.ui.adapters.propertystrings;

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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This class is the PropertyStringProviderAdapter that is returned by the
 * {@link PropertyStringProviderAdapterFactory} when no other
 * {@link PropertyStringProviderAdapter} is found.
 */
public class DefaultPropertyStringProviderAdapter extends
		PropertyStringProviderAdapter {

	/**
	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyName(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 */
	public String getPropertyName(final IItemPropertyDescriptor descriptor) {
		return "!"
				+ ((EStructuralFeature) descriptor.getFeature(null)).getName()
				+ "!";
	}

	/**
	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyToolTip(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 */
	public String getPropertyToolTip(final IItemPropertyDescriptor descriptor) {
		return "!"
				+ ((EStructuralFeature) descriptor.getFeature(null)).getName()
				+ TT_SUFFIX + "!";
	}

	/**
	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyUnits(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 */
	public String getPropertyUnits(final IItemPropertyDescriptor descriptor) {
		return "!"
				+ ((EStructuralFeature) descriptor.getFeature(null)).getName()
				+ UNIT_SUFFIX + "!";
	}

} // DefaultPropertyStringProviderAdapter

