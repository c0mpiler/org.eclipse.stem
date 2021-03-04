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
 *     Bundesinstitut f�r Risikobewertung
 *******************************************************************************/

package org.eclipse.stem.ui.views.graphmap;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.stem.ui.views.IContextMenuUpdatesListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

/**
 * This class is a {@link ViewPart} that renders Lat/Long data for active
 * Simulations.
 */
public class GraphMapView extends ViewPart implements
		IContextMenuUpdatesListener {

	public final static String ID_GRAPH_MAP_VIEW = "org.eclipse.stem.ui.views.graphmap";
	
	/**
	 * The viewer that displays the geographic state of the simulations.
	 */
	private GraphMapViewer geographicViewer;

	/**
	 * Default Constructor
	 */
	public GraphMapView() {
		super();
	}

	@Override
	public void createPartControl(Composite parent) {
		geographicViewer = new GraphMapViewer(parent, this);
		
		getSite().setSelectionProvider(geographicViewer);
		IWorkbenchPage page = this.getViewSite().getPage();
		page.addPartListener(new IPartListener() {

			@Override
			public void partOpened(IWorkbenchPart part) {
				if (part == GraphMapView.this) {
					GraphMapRegistry.getInstance().registerView(
							GraphMapView.this);
					// Set this instance to be a listener for context menu updates
					geographicViewer.setInput(SimulationManager.getManager());
					getSite().setSelectionProvider(geographicViewer);
				}
			}

			@Override
			public void partDeactivated(IWorkbenchPart part) {
				// do nothing
			}

			@Override
			public void partClosed(IWorkbenchPart part) {
				if (part == GraphMapView.this) {
					if (!PlatformUI.getWorkbench().isClosing()) {
						GraphMapPreferences prefs = GraphMapPreferences
								.getInstance();
						int viewId = GraphMapRegistry.getInstance().getViewId(
								GraphMapView.this);
						prefs.disposePreferencesForActiveSimulations(viewId);
						GraphMapRegistry.getInstance().unRegisterView(
								GraphMapView.this);
					}
				}
			}

			@Override
			public void partBroughtToTop(IWorkbenchPart part) {
				// do nothing
			}

			@Override
			public void partActivated(IWorkbenchPart part) {
				// do nothing
			}
		});

	}

	@Override
	public void setFocus() {
		// Nothing
	}

	@Override
	public void dispose() {
		getSite().setSelectionProvider(null);
		geographicViewer.setInput(null);
		// if everything is closing, still remember...

		GraphMapPreferences.getInstance().saveMasterSettingsToFile();
	}

	@Override
	public void onContextMenuUpdate(MenuManager menuManager,
			ISelectionProvider selectionProvider) {
		getSite().registerContextMenu(
				"org.eclipse.stem.ui.views.geographic.map.context",
				menuManager, selectionProvider);
	}

}