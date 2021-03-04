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
package org.eclipse.stem.diseasemodels.veterinary.presentation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.diseasemodels.veterinary.util.VeterinaryAdapterFactory;
import org.eclipse.ui.IStartup;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditorAdapter;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditorAdapterFactory;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditorAdapter;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditorAdapterFactory;

/**
 * @generated
 */
public class VeterinaryPropertyEditorAdapterFactory extends
		VeterinaryAdapterFactory implements IStartup, DiseaseModelPropertyEditorAdapterFactory, PopulationModelPropertyEditorAdapterFactory {

	/**
	 * @generated
	 */
	public VeterinaryPropertyEditorAdapterFactory() {
		super();
		DiseaseModelPropertyEditorAdapterFactory.INSTANCE.addAdapterFactory(this);
		PopulationModelPropertyEditorAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @generated
	 */
	public void earlyStartup() {
		new VeterinaryPropertyStringProviderAdapterFactory();
	}

	/**
	 * @generated
	 */
	@Override
	public Adapter createSimpleVeterinaryDiseaseAdapter() {
		return new SimpleVeterinaryDiseasePropertyEditorAdapter();
	}
	

	/**
	 * @generated
	 */
	@Override
	public Adapter createContaminatedUnitsAdapter() {
		return new ContaminatedUnitsPropertyEditorAdapter();
	}

	/**
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		boolean isType = super.isFactoryForType(type);
		isType = isType || type == DiseaseModelPropertyEditorAdapter.class;
		isType = isType || type == PopulationModelPropertyEditorAdapter.class;
		return isType;
	}
}