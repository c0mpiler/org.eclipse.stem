package org.eclipse.stem.ui.views.graphmap;

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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationManagerListener;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.stem.jobs.simulation.SimulationManagerEvent;
import org.eclipse.stem.ui.Activator;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class GraphMapRegistry {

	private static volatile GraphMapRegistry instance;

	private List<GraphMapView> registeredViews;

	private GraphMapRegistry() {
		this.registeredViews = new ArrayList<GraphMapView>();
		SimulationManager simMan = SimulationManager.getManager();
		simMan.addSimulationManagerListener(new SimulationManagerListener());
	}

	public static final synchronized GraphMapRegistry getInstance() {

		if (GraphMapRegistry.instance == null) {
			GraphMapRegistry.instance = new GraphMapRegistry();
		}
		return GraphMapRegistry.instance;
	}

	public boolean registerView(GraphMapView view) {
		if (this.registeredViews.contains(view)) {
			return false;
		}
		return this.registeredViews.add(view);
	}

	public int getViewId(GraphMapView view) {
		return this.registeredViews.indexOf(view);
	}

	public void unRegisterView(GraphMapView view) {
		this.registeredViews.remove(view);
	}

	private class SimulationManagerListener implements
			ISimulationManagerListener {

		@Override
		public void simulationsChanged(SimulationManagerEvent event) {
			GraphMapPreferences prefs = GraphMapPreferences.getInstance();
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();

			int mxViews = 0;
			for (ISimulation sim : event.getSimulationsAdded()) {
				int x = prefs.getNoOfPreferencesForScenario(sim.getScenario()
						.getURI().toString());
				if (x > mxViews) {
					mxViews = x;
				}
			}
			while (mxViews-- > GraphMapRegistry.this.registeredViews.size()) {
				for (int i = 1;; i++) {
					if (page.findViewReference(
							"org.eclipse.stem.ui.views.graphmap", "" + i) == null) {
						try {
							page.showView("org.eclipse.stem.ui.views.graphmap",
									"" + i, IWorkbenchPage.VIEW_ACTIVATE);
						} catch (PartInitException e1) {
							Activator.logError(
									"Could not instantiate new GraphMapView",
									e1);
						}
						break;
					}
				}
			}
		}
	}

}
