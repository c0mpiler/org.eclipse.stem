package org.eclipse.stem.ui.interventions.adapters;

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
import org.eclipse.stem.interventions.util.InterventionsAdapterFactory;
import org.eclipse.stem.ui.graphgenerators.adapters.graphgeneratorpropertyeditor.GraphGeneratorPropertyEditorAdapter;
import org.eclipse.stem.ui.graphgenerators.adapters.graphgeneratorpropertyeditor.IGraphGeneratorPropertyEditorAdapterFactory;


public class ControlGraphGeneratorPropertyEditorAdapterFactory extends
		InterventionsAdapterFactory implements
		IGraphGeneratorPropertyEditorAdapterFactory {

	public ControlGraphGeneratorPropertyEditorAdapterFactory() {
		super();
		ControlGraphGeneratorPropertyEditorAdapterFactory.INSTANCE
				.addAdapterFactory(this);
	}

	@Override
	public Adapter createControlGraphGeneratorAdapter() {
		return new ControlGraphGeneratorPropertyEditorAdapter();
	}

	@Override
	public Adapter createPeriodicControlGraphGeneratorAdapter() {
		return new ControlGraphGeneratorPropertyEditorAdapter();
	}

	public boolean isFactoryForType(Object type) {
		return type == GraphGeneratorPropertyEditorAdapter.class
				|| super.isFactoryForType(type);
	}

} // StandardGraphGeneratorPropertyEditorAdapterFactory
