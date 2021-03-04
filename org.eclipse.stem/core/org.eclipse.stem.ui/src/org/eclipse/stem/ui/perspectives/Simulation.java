// Simulation.java
package org.eclipse.stem.ui.perspectives;

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

import org.eclipse.stem.core.Constants;
import org.eclipse.stem.ui.views.ActiveBatchesView;
import org.eclipse.stem.ui.views.ActiveSimulationsView;
import org.eclipse.stem.ui.views.ScenariosView;
import org.eclipse.stem.ui.views.SimulationControlView;
import org.eclipse.stem.ui.views.graphmap.GraphMapView;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.navigator.resources.ProjectExplorer;

/**
 * This class implements the "Simulation" perspective of STEM. This Perspective
 * is used to control and visualize simulations.
 */
public class Simulation implements IPerspectiveFactory {

	/**
	 * The identifier of the Simulation Perspective
	 */
	public static final String ID_STEM_SIMULATION_PERSPECTIVE = Constants.ID_ROOT
			+ ".ui.STEMSimulationPerspective"; //$NON-NLS-1$

	/**
	 * Create the initial layout. After the initial invocation, the last window
	 * setup will be used so this is probably a one time setup but it is
	 * important to get the user started on the right foot.
	 * 
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	public void createInitialLayout(final IPageLayout layout) {
		final String editorArea = layout.getEditorArea();

		// Put the Graph Map by itself on the top
		layout.addStandaloneView(GraphMapView.ID_GRAPH_MAP_VIEW, true, IPageLayout.RIGHT,
				0.0f, editorArea);

		// Put the Simulation Control view below the map on the left
		final IFolderLayout left = layout.createFolder(
				"left", IPageLayout.BOTTOM, //$NON-NLS-1$
				0.60f, GraphMapView.ID_GRAPH_MAP_VIEW);
		left.addView(SimulationControlView.ID_SIMULATION_CONTROL_VIEW);
		left.addView(ProjectExplorer.VIEW_ID);
		left.addView(ScenariosView.ID_SCENARIOS_VIEW);
		
		// Put the Scenario View on the bottom right
		// and add all the shortcuts there also.
		final IFolderLayout bottom = layout.createFolder("bottom", //$NON-NLS-1$
				IPageLayout.RIGHT, 0.30f, "left");

		//bottom.addView(ScenariosView.ID_SCENARIOS_VIEW);

		// Add time series view
		bottom.addView("org.eclipse.stem.ui.views.reports");
		// Add phase plot view
		bottom.addView("org.eclipse.stem.ui.views.reports.phaseSpace");
		// Add CSV logger view
		//bottom.addView("org.eclipse.stem.ui.views.reports.phaseSpace");
		// add Error Log view
		//bottom.addView("org.eclipse.stem.util.loggers"); //$NON-NLS-1$

		// Add the Views to "Show View" menu
		layout
				.addShowViewShortcut(SimulationControlView.ID_SIMULATION_CONTROL_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_PROGRESS_VIEW);
		layout.addShowViewShortcut(ScenariosView.ID_SCENARIOS_VIEW);
		layout
				.addShowViewShortcut(ActiveSimulationsView.ID_ACTIVE_SIMULATIONS_VIEW);
		layout.addShowViewShortcut(ActiveBatchesView.ID_ACTIVE_BATCHES_VIEW);
		layout.addShowViewShortcut(GraphMapView.ID_GRAPH_MAP_VIEW);

		layout.addShowViewShortcut("org.eclipse.stem.ui.views.reports");
		layout
				.addShowViewShortcut("org.eclipse.stem.ui.views.reports.phaseSpace");
		// We don't want to see the editor
		layout.setEditorAreaVisible(false);

		// Add the Simulation perspective to the "Open Perspective" menu
		layout.addPerspectiveShortcut(ID_STEM_SIMULATION_PERSPECTIVE);

	} // createInitialLayout

} // Simulation
