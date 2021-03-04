// PropertyStringProviderAdapter.java
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

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This class is extended by classes that provide NLS'd string for disease model
 * properties.
 */
public abstract class PropertyStringProviderAdapter extends AdapterImpl
		implements PropertyStringProvider {

	/**
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(final Object type) {
		return type == PropertyStringProvider.class;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyMissing(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 */
	public String getPropertyMissing(IItemPropertyDescriptor descriptor)
	{
		return "!" + ((EStructuralFeature)descriptor.getFeature(null)).getName() + MISSING_SUFFIX + "!";
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyInvalid(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 */
	public String getPropertyInvalid(IItemPropertyDescriptor descriptor)
	{
		return "!" + ((EStructuralFeature)descriptor.getFeature(null)).getName() + INVALID_SUFFIX + "!";
	}
	
	
	
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyInvalid(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyName(IItemPropertyDescriptor descriptor)
//	{
//		return getPropertyName((EStructuralFeature)descriptor);
//	}
//	
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyMissing(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyName(EStructuralFeature feature)
//	{
//		return "!!" + feature.getName() + "!!";
//	}
//	
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyInvalid(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyToolTip(IItemPropertyDescriptor descriptor)
//	{
//		return getPropertyToolTip((EStructuralFeature)descriptor);
//	}
//	
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyMissing(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyToolTip(EStructuralFeature feature)
//	{
//		return "!!" + feature.getName() + TT_SUFFIX + "!!";
//	}
//	
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyInvalid(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyUnits(IItemPropertyDescriptor descriptor)
//	{
//		return getPropertyInvalid((EStructuralFeature)descriptor);
//	}
//	
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyMissing(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyUnits(EStructuralFeature feature)
//	{
//		return "!!" + feature.getName() + UNIT_SUFFIX + "!!";
//	}
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyMissing(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyMissing(IItemPropertyDescriptor descriptor)
//	{
//		return getPropertyMissing((EStructuralFeature)descriptor);
//	}
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyMissing(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyMissing(EStructuralFeature feature)
//	{
//		return "!!" + feature.getName() + MISSING_SUFFIX + "!!";
//	}
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyInvalid(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyInvalid(IItemPropertyDescriptor descriptor)
//	{
//		return getPropertyInvalid((EStructuralFeature)descriptor);
//	}
//	/* (non-Javadoc)
//	 * @see org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider#getPropertyInvalid(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	public String getPropertyInvalid(EStructuralFeature feature)
//	{
//		return "!!" + feature.getName() + INVALID_SUFFIX + "!!";
//	}

} // PropertyStringProviderAdapter
