package org.eclipse.stem.ui.populationmodels.standard.wizards;

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
import org.eclipse.stem.populationmodels.standard.util.StandardAdapterFactory;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationInitializerPropertyEditorAdapter;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationInitializerPropertyEditorAdapterFactory;

public class StandardPopulationInitializerPropertyEditorAdapterFactory extends
		StandardAdapterFactory implements
		PopulationInitializerPropertyEditorAdapterFactory {

	public StandardPopulationInitializerPropertyEditorAdapterFactory() {
		super();
		PopulationInitializerPropertyEditorAdapterFactory.INSTANCE
				.addAdapterFactory(this);
	}

	@Override
	public Adapter createStandardPopulationInitializerAdapter() {
		return new StandardPopulationInitializerPropertyEditorAdapter();
	}

	@Override
	public Adapter createYetiPopulationInitializerAdapter() {
		return new StandardPopulationInitializerPropertyEditorAdapter();
	}
	
	@Override
	public Adapter createExternalDataSourcePopulationInitializerAdapter() {
		return new StandardPopulationInitializerPropertyEditorAdapter();
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return type == PopulationInitializerPropertyEditorAdapter.class
				|| super.isFactoryForType(type);
	}

} // StandardPopulationModelPropertyEditorAdapterFactory
