package org.eclipse.stem.fbd.ui.views;

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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class FoodDistributionExperimentView extends ViewPart {

	FoodDistributionExperimentViewer viewer;
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.eclipse.stem.fbd.ui.views.MLExperimentView";

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new FoodDistributionExperimentViewer(parent);
		getSite().setSelectionProvider(viewer);

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		// do nothing
		//viewer.getControl().setFocus();
	}
}