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
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.graphgenerators.GraphGenerator;
import org.eclipse.stem.interventions.presentation.ControlGraphGeneratorPropertyEditor;
import org.eclipse.stem.ui.graphgenerators.adapters.graphgeneratorpropertyeditor.GraphGeneratorPropertyEditor;
import org.eclipse.stem.ui.graphgenerators.adapters.graphgeneratorpropertyeditor.GraphGeneratorPropertyEditorAdapter;
import org.eclipse.stem.ui.graphgenerators.wizards.GraphGeneratorPropertyComposite;
import org.eclipse.swt.events.ModifyListener;

public class ControlGraphGeneratorPropertyEditorAdapter extends GraphGeneratorPropertyEditorAdapter
		implements Adapter {

	public GraphGeneratorPropertyEditor createGraphGeneratorPropertyEditor(
			final GraphGeneratorPropertyComposite graphGeneratorPropertyComposite,
			final int style, final ModifyListener projectValidator, IProject project) {
		return new ControlGraphGeneratorPropertyEditor(
				graphGeneratorPropertyComposite, style,
				(GraphGenerator) getTarget(), projectValidator, project);
	} // createGraphGeneratorPropertyEditor
	
} // GraphGeneratorPropertyEditorAdapter
