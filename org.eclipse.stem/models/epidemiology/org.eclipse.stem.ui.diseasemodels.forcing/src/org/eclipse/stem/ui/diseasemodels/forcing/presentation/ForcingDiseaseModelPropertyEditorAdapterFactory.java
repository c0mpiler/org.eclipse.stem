package org.eclipse.stem.ui.diseasemodels.forcing.presentation;
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
import org.eclipse.stem.diseasemodels.forcing.util.ForcingAdapterFactory;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditorAdapter;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditorAdapterFactory;

/**
 * @author james
 * 
 */
public class ForcingDiseaseModelPropertyEditorAdapterFactory extends
		ForcingAdapterFactory implements
		DiseaseModelPropertyEditorAdapterFactory {

	/**
	 * 
	 */
	public ForcingDiseaseModelPropertyEditorAdapterFactory() {
		super();
		DiseaseModelPropertyEditorAdapterFactory.INSTANCE
				.addAdapterFactory(this);
	}

	/**
	 * 
	 */
	@Override
	public Adapter createForcingDiseaseModelAdapter() {
		return new ForcingDiseaseModelAdapter();
	}
	
	/**
	 * 
	 */
	@Override
	public Adapter createGaussianForcingDiseaseModelAdapter() {
		return new ForcingDiseaseModelAdapter();
	}

	/**
	 * 
	 * @see org.eclipse.stem.diseasemodels.forcing.util.ForcingAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	public boolean isFactoryForType(Object type) {
		return type == DiseaseModelPropertyEditorAdapter.class
				|| super.isFactoryForType(type);
	}
} // ForcingDiseaseModelPropertyEditorAdapterFactory
