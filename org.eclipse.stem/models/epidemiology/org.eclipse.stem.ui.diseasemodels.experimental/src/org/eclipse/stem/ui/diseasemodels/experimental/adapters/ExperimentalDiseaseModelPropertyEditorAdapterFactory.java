package org.eclipse.stem.ui.diseasemodels.experimental.adapters;
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
import org.eclipse.stem.diseasemodels.experimental.util.ExperimentalAdapterFactory;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditorAdapter;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditorAdapterFactory;

/**
 * 
 * 
 */
public class ExperimentalDiseaseModelPropertyEditorAdapterFactory extends
		ExperimentalAdapterFactory implements
		DiseaseModelPropertyEditorAdapterFactory {

	/**
	 * 
	 */
	public ExperimentalDiseaseModelPropertyEditorAdapterFactory() {
		super();
		DiseaseModelPropertyEditorAdapterFactory.INSTANCE
				.addAdapterFactory(this);
	}

	@Override
	public Adapter createPercolationDiseaseModelAdapter() {
		return new ExperimentalDiseaseModelAdapter();
	}

	@Override
	public Adapter createTBDiseaseModelAdapter() {
		return new ExperimentalDiseaseModelAdapter();
	}
	

	/**
	 * 
	 * @see org.eclipse.stem.diseasemodels.example.util.ExampleAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	public boolean isFactoryForType(Object type) {
		return type == DiseaseModelPropertyEditorAdapter.class
				|| super.isFactoryForType(type);
	}
} //
