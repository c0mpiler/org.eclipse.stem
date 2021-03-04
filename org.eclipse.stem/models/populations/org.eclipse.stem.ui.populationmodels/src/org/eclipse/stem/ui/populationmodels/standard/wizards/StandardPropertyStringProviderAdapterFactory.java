// StandardPropertyStringProviderAdapterFactory.java
package org.eclipse.stem.ui.populationmodels.standard.wizards;

/******************************************************************************
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

import java.util.MissingResourceException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.populationmodels.standard.util.StandardAdapterFactory;
import org.eclipse.stem.ui.adapters.propertystrings.DecoratorsPropertyStringProviderAdapterFactory;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapter;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapterFactory;

/**
 * This class is used to NLS'd strings for {@link DiseaseModel} properties. 
 */
public class StandardPropertyStringProviderAdapterFactory extends
		StandardAdapterFactory implements PropertyStringProviderAdapterFactory {

	
	PropertyStringProviderAdapter adapter = null;

	/**
	 * Default Constructor
	 */
	public StandardPropertyStringProviderAdapterFactory() {
		super();
		PropertyStringProviderAdapterFactory.INSTANCE.addAdapterFactory(this);
	}
	
	/**
	 * @see org.eclipse.emf.common.notify.impl.AdapterFactoryImpl#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return  super.isFactoryForType(type) || type == PropertyStringProvider.class;
	}

	/**
	 *
	 */
	@Override
	public Adapter createPopulationModelAdapter() {
		// Have we created one before?
		if (adapter == null) {
			// No
			adapter = new StandardPropertyStringProviderAdapter();
		} // if we didn't create one before
		return adapter;
	} // createDiseaseModelAdapter

	/**
	 * 
	 */
	@Override
	public Adapter createPopulationInitializerAdapter() {
		// Have we created one before?
		if (adapter == null) {
			// No
			adapter = new StandardPropertyStringProviderAdapter();
		} // if we didn't create one before
		return adapter;
	} // createDiseaseModelAdapter

	/**
	 * This class represents 
	 */
	public static class StandardPropertyStringProviderAdapter extends
		DecoratorsPropertyStringProviderAdapterFactory.DecoratorsPropertyStringProviderAdapter {

		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return PopulationModelWizardMessages
					.getString(((EStructuralFeature) descriptor
							.getFeature(null)).getName());
			} catch(MissingResourceException mse) {
				return super.getPropertyName(descriptor);
			}
		} // getPropertyName

		/**
		 * @param descriptor
		 * @return the NLS'd tool tip text that describes the property
		 */
		public String getPropertyToolTip(
				IItemPropertyDescriptor descriptor) {
			final EStructuralFeature feature = (EStructuralFeature) descriptor
					.getFeature(null);
			try {
				return PopulationModelWizardMessages.getString(feature.getName()
					+ TT_SUFFIX);
			} catch(MissingResourceException mse) {
				return super.getPropertyToolTip(descriptor);
			}
		} // getPropertyToolTip

		/**
		 * @param descriptor
		 * @return the NLS'd text that represents the units of the
		 *         property
		 */
		public String getPropertyUnits(
				IItemPropertyDescriptor descriptor) {
			final EStructuralFeature feature = (EStructuralFeature) descriptor
					.getFeature(null);
			try {
				return PopulationModelWizardMessages.getString(feature.getName()
					+ UNIT_SUFFIX);
			} catch(MissingResourceException mse) {
				return super.getPropertyUnits(descriptor);
			}
		} // getPropertyUnits

	} // StandardPropertyStringProviderAdapter
} // StandardPropertyStringProviderAdapterFactory