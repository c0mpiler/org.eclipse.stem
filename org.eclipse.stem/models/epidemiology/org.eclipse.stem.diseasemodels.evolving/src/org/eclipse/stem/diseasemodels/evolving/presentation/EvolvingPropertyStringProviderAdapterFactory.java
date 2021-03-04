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
package org.eclipse.stem.diseasemodels.evolving.presentation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.diseasemodels.evolving.util.EvolvingAdapterFactory;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapterFactory;

/**
 * @generated
 */
public class EvolvingPropertyStringProviderAdapterFactory extends
		EvolvingAdapterFactory implements
		PropertyStringProviderAdapterFactory {
	/**
	 * @generated
	 */
	public EvolvingPropertyStringProviderAdapterFactory() {
		super();
		PropertyStringProviderAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return super.isFactoryForType(type)
				|| type == PropertyStringProvider.class;
	}

	/**
	 * @generated
	 */
	@Override
	public Adapter createEvolvingSIDiseaseModelAdapter() {
		return new EvolvingSIDiseaseModelPropertyEditor.EvolvingSIDiseaseModelPropertyStringProviderAdapter();
	}

	/**
	 * @generated
	 */
	@Override
	public Adapter createEvolvingSIRDiseaseModelAdapter() {
		return new EvolvingSIRDiseaseModelPropertyEditor.EvolvingSIRDiseaseModelPropertyStringProviderAdapter();
	}

	/**
	 * @generated
	 */
	@Override
	public Adapter createEvolvingSEIRDiseaseModelAdapter() {
		return new EvolvingSEIRDiseaseModelPropertyEditor.EvolvingSEIRDiseaseModelPropertyStringProviderAdapter();
	}
	
}