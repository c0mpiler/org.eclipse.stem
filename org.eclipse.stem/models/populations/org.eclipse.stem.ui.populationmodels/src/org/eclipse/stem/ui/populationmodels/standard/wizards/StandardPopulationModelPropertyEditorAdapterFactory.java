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
import org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditorAdapter;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditorAdapterFactory;

public class StandardPopulationModelPropertyEditorAdapterFactory extends
		StandardAdapterFactory implements
		PopulationModelPropertyEditorAdapterFactory {

	public StandardPopulationModelPropertyEditorAdapterFactory() {
		super();
		PopulationModelPropertyEditorAdapterFactory.INSTANCE
				.addAdapterFactory(this);
	}

	@Override
	public Adapter createPopulationModelAdapter() {
		return new StandardPopulationModelPropertyEditorAdapter(); // Use the standard for all population models (the mosquito below does this anyway)
	}
	
	@Override
	public Adapter createStandardPopulationModelAdapter() {
		return new StandardPopulationModelPropertyEditorAdapter();
	}


	@Override
	public Adapter createMosquitoPopulationModelAdapter() {
		return new MosquitoPopulationModelPropertyEditorAdapter();
	}
	
	@Override
	public boolean isFactoryForType(Object type) {
		return type == PopulationModelPropertyEditorAdapter.class
				|| super.isFactoryForType(type);
	}

} // StandardPopulationModelPropertyEditorAdapterFactory
