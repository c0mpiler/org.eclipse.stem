// RelativeValueProviderAdapter.java
package org.eclipse.stem.definitions.adapters.relativevalue;

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

import java.util.List;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This class adapts <code>EObjects</code>'s to
 * <code>RelativeValueProvider</code>'s.
 */
abstract public class RelativeValueProviderAdapter extends AdapterImpl
		implements RelativeValueProvider {

	/**
	 * @see org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider#getProperties()
	 */
	@Override
	public abstract List<IItemPropertyDescriptor> getProperties();

	/**
	 * @see org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider#getRelativeValue(org.eclipse.emf.edit.provider.ItemPropertyDescriptor)
	 */
	@Override
	public double getRelativeValue(ItemPropertyDescriptor property) {
		return getRelativeValue((EStructuralFeature) property.getFeature(null));
	} // getRelativeValue

	/**
	 * @see org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider#getRelativeValue(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	public abstract double getRelativeValue(final EStructuralFeature feature);
	
	/**
	 * This method returns the denominator or scale used to convert to relative
	 * values in the range 0-1. For example, in an Epidemic Compartment model
	 * the state values are normalized by population.
	 * It is required whenever we need to switch between relative and absolute values
	 * or can be used to create a label showing the maximum scale for any relative value.
	 * @return the denominator or scale used to normalize the relative value
	 */
	@Override
	public abstract double getDenominator(final EStructuralFeature feature) ;

	/**
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return type == RelativeValueProvider.class;
	}
	
} // RelativeValueProviderAdapter
