/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.foodproduction.presentation;


import org.eclipse.core.resources.IProject;
import org.eclipse.stem.foodproduction.FoodTransformer;
import org.eclipse.stem.ui.editors.GenericPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

@SuppressWarnings("all")
abstract public class FoodProductionPropertyEditor extends GenericPropertyEditor {


	public FoodProductionPropertyEditor(Composite parent, int style, IProject project) {
		super(parent,style, project);
	}

	public FoodProductionPropertyEditor(final Composite parent, final int style,
			final FoodTransformer foodTransformer,
			final ModifyListener projectValidator, IProject project) {
		super(parent, style, foodTransformer, projectValidator, project);

	}
		

} // PopulationModelPropertyEditor
