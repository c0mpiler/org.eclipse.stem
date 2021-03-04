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
package org.eclipse.stem.diseasemodels.vector.presentation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.diseasemodels.vector.util.VectorAdapterFactory;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapterFactory;

/**
 * @generated
 */
public class VectorPropertyStringProviderAdapterFactory extends
		VectorAdapterFactory implements
		PropertyStringProviderAdapterFactory {
	/**
	 * @generated
	 */
	public VectorPropertyStringProviderAdapterFactory() {
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
	public Adapter createMacdonaldRossDiseaseModelAdapter() {
		return new MacdonaldRossDiseaseModelPropertyEditor.MacdonaldRossDiseaseModelPropertyStringProviderAdapter();
	}
	
	/**
	 * @generated
	 */
	@Override
	public Adapter createVectorDiseaseModelAdapter() {
		return new VectorDiseaseModelPropertyEditor.VectorDiseaseModelPropertyStringProviderAdapter();
	}
	
	/**
	 * @generated
	 */
	@Override
	public Adapter createDengueModelAdapter() {
		return new DengueModelPropertyEditor.DengueModelPropertyStringProviderAdapter();
	}
	
	/**
	 * @generated
	 */
	@Override
	public Adapter createSimpleDengueModelAdapter() {
		return new SimpleDengueModelPropertyEditor.SimpleDengueModelPropertyStringProviderAdapter();
	}
	
	/**
	 * @generated
	 */
	@Override
	public Adapter createVerySimpleDengueModelAdapter() {
		return new VerySimpleDengueModelPropertyEditor.VerySimpleDengueModelPropertyStringProviderAdapter();
	}
	
	/**
	 * @generated
	 */
	@Override
	public Adapter createAbstractDengueModelAdapter() {
		return new AbstractDengueModelPropertyEditor.AbstractDengueModelPropertyStringProviderAdapter();
	}
	
}