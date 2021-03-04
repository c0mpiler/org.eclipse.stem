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

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.stem.populationmodels.standard.PopulationModel;

import org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditor;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditorAdapter;

import org.eclipse.stem.ui.populationmodels.standard.wizards.PopulationModelPropertyComposite;

/**
 * @generated
 */
public class ContaminatedUnitsPropertyEditorAdapter extends
		PopulationModelPropertyEditorAdapter {

	/**
	 * @generated
	 */
	@Override
	public PopulationModelPropertyEditor createPopulationModelPropertyEditor(
			PopulationModelPropertyComposite composite,
			int style, ModifyListener projectValidator, IProject project) {
		return new ContaminatedUnitsPropertyEditor(
				composite, style,
				(PopulationModel)getTarget(), projectValidator, project);
	}

}