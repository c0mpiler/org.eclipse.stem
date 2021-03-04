package org.eclipse.stem.ui.diseasemodels.example.presentation;
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

import org.eclipse.core.resources.IProject;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditor;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditorAdapter;
import org.eclipse.stem.ui.wizards.DiseaseModelPropertyComposite;
import org.eclipse.swt.events.ModifyListener;

/**
 *  
 * Adapter for Property Editor
 *
 */
public class ExampleDiseaseModelAdapter extends
		DiseaseModelPropertyEditorAdapter {

	/**
	 * 
	 */
	@Override
	public DiseaseModelPropertyEditor createDiseaseModelPropertyEditor(
			DiseaseModelPropertyComposite diseaseModelPropertyComposite,
			int style, ModifyListener projectValidator, IProject project) {
		return new ExampleDiseaseModelPropertyEditor(
				diseaseModelPropertyComposite, style,
				(DiseaseModel) getTarget(), projectValidator, project);
	} // createDiseaseModelPropertyEditor

} // ExampleDiseaseModelAdapter
