// ExamplePropertyStringProviderAdapterFactory.java
package org.eclipse.stem.diseasemodels.multipopulation.presentation;

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
import org.eclipse.stem.diseasemodels.multipopulation.util.MultipopulationAdapterFactory;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapter;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapterFactory;
import org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory;
import org.eclipse.ui.IStartup;

/**
 * This class represents
 */
public class MultiPopulationPropertyStringProviderAdapterFactory extends
		MultipopulationAdapterFactory implements
		PropertyStringProviderAdapterFactory, IStartup {

	PropertyStringProviderAdapter adapter = null;

	/**
	 * Default Constructor
	 */
	public MultiPopulationPropertyStringProviderAdapterFactory() {
		super();
		PropertyStringProviderAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @see org.eclipse.ui.IStartup#earlyStartup()
	 */
	public void earlyStartup() {
		// Nothing to do here. This method is called after the constructor has
		// run which is the entire point of early activation which causes the
		// factory to be added to the PropertyStringProviderAdapterFactory.INSTANCE
	}

	/**
	 * @see org.eclipse.emf.common.notify.impl.AdapterFactoryImpl#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return super.isFactoryForType(type)
				|| type == PropertyStringProvider.class;
	}

	/**
	 * @see org.eclipse.stem.diseasemodels.example.util.ExampleAdapterFactory#createExampleDiseaseModelAdapter()
	 */
	@Override
	public Adapter createMultiPopulationSIDiseaseModelAdapter() {
		// Have we created one before?
		if (adapter == null) {
			// No
			adapter = new MultiPopulationPropertyStringProviderAdapter();
		}

		return adapter;
	}// createExampleDiseaseModelAdapter()

	
	public static class MultiPopulationPropertyStringProviderAdapter
			extends
			StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter {

		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return MultipopulationDiseaseWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName());
			} catch (MissingResourceException e) {
				return super.getPropertyName(descriptor);
			}
		} // getPropertyName

		/**
		 * @param descriptor
		 * @return the NLS'd tool tip text that describes the property
		 */
		public String getPropertyToolTip(IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return MultipopulationDiseaseWizardMessages.getString(feature
						.getName() + TT_SUFFIX);
			} catch (MissingResourceException e) {
				return super.getPropertyToolTip(descriptor);
			}
		} // getPropertyToolTip

		/**
		 * @param descriptor
		 * @return the NLS'd text that represents the units of the property
		 */
		public String getPropertyUnits(IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return MultipopulationDiseaseWizardMessages.getString(feature
						.getName() + UNIT_SUFFIX);
			} catch (MissingResourceException e) {
				return super.getPropertyUnits(descriptor);
			}
		} // getPropertyUnits
	}

} // ExamplePropertyStringProviderAdapterFactory
