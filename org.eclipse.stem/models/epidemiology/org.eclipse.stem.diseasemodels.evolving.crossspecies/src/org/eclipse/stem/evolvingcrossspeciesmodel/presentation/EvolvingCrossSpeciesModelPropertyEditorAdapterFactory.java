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
package org.eclipse.stem.evolvingcrossspeciesmodel.presentation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.evolvingcrossspeciesmodel.util.EvolvingCrossSpeciesModelAdapterFactory;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditorAdapter;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditorAdapterFactory;
import org.eclipse.ui.IStartup;

/**
 * @generated
 */
public class EvolvingCrossSpeciesModelPropertyEditorAdapterFactory extends
		EvolvingCrossSpeciesModelAdapterFactory implements IStartup, DiseaseModelPropertyEditorAdapterFactory {

	/**
	 * @generated
	 */
	public EvolvingCrossSpeciesModelPropertyEditorAdapterFactory() {
		super();
		DiseaseModelPropertyEditorAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @generated
	 */
	public void earlyStartup() {
		new EvolvingCrossSpeciesModelPropertyStringProviderAdapterFactory();
	}

	/**
	 * @generated
	 */
	@Override
	public Adapter createEvolvingCrossSpeciesModelAdapter() {
		return new EvolvingCrossSpeciesModelPropertyEditorAdapter();
	}
	

	/**
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		boolean isType = super.isFactoryForType(type);
		isType = isType || type == DiseaseModelPropertyEditorAdapter.class;
		return isType;
	}
}