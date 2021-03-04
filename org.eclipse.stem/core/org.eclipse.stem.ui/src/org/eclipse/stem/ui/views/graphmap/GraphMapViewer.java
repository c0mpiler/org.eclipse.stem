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

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationManagerListener;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.stem.jobs.simulation.SimulationManagerEvent;
import org.eclipse.stem.ui.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * This class presents "views" of the running simulations.
 */
public class GraphMapViewer extends Viewer implements
		ISelectionChangedListener, ISimulationManagerListener {

	/**
	 * This is the collection of
	 * {@link org.eclipse.stem.jobs.simulation.Simulation}s that should be
	 * displayed.
	 */
	private Set<ISimulation> simulationsToDisplay = new LinkedHashSet<ISimulation>();

	/**
	 * This is the {@link SimulationManager} that is the input to the viewer. It
	 * maintains a collection of active
	 * {@link org.eclipse.stem.jobs.simulation.Simulation}s in the system. This
	 * viewer listens to it to discover when new
	 * {@link org.eclipse.stem.jobs.simulation.Simulation}s are created and old
	 * ones disappear.
	 * 
	 * @see #simulationsChanged(SimulationManagerEvent)
	 */
	private SimulationManager simulationManager;

	/**
	 * This is the top-level control of the viewer. It contains the
	 * {@link org.eclipse.stem.ui.views.geographic.map.MapControl}s that display
	 * the current state of the
	 * {@link org.eclipse.stem.jobs.simulation.Simulation}s.
	 */
	private Composite composite;

	private Composite graphMapsComposite;

	private GraphMapView view;

	/**
	 * @param parent
	 *            the SWT parent of the control that makes up the viewer
	 * @param gcf
	 *            the factory that creates instance of {@link GeographicControl}
	 */
	public GraphMapViewer(Composite parent, GraphMapView view) {
		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());
		this.view = view;

		Composite buttonBar = new Composite(composite, SWT.NONE);
		buttonBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		buttonBar.setLayout(new RowLayout());
		
		Button addViewButton = new Button(buttonBar, SWT.PUSH);

		addViewButton.setText(Messages.getString("IMView.AddView"));
		addViewButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();

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

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		graphMapsComposite = new Composite(composite, SWT.NONE);
		graphMapsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		graphMapsComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
		refresh();
		composite.pack();
	}

	@Override
	public Control getControl() {
		return graphMapsComposite;
	}

	@Override
	public ISelection getSelection() {
		return null;
	}

	@Override
	public void refresh() {
		if (simulationManager != null) {
			simulationsToDisplay.clear();
			simulationsToDisplay.addAll(simulationManager
					.getActiveSimulations());
		}
		populateView();
	}

	@Override
	public Object getInput() {
		return simulationManager;
	}

	@Override
	public void setInput(Object input) {
		Object oldInput = simulationManager;
		simulationManager = (SimulationManager) input;
		inputChanged(input, oldInput);
	}

	@Override
	protected void inputChanged(Object input, Object oldInput) {
		// Is there already a simulation manager?
		if (oldInput != null) {
			((SimulationManager) oldInput).removeListener(this);
		}

		// Register with the SimulationManager to listen for changes in the set
		// of active Simulations.
		// Got input?
		if (input != null) {
			((SimulationManager) input).addSimulationManagerListener(this);
		}

		// Update the viewer with the contents of the new input source
		refresh();
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		// Do nothing
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		fireSelectionChanged(event);
	}

	@Override
	public void simulationsChanged(SimulationManagerEvent event) {
		simulationsToDisplay.addAll(Arrays.asList(event.getSimulationsAdded()));

		simulationsToDisplay.removeAll(Arrays.asList(event
				.getSimulationsRemoved()));

		populateView();
	}

	/**
	 * Create and dispose of MapControls as necessary to display the selected
	 * Simulations.
	 */
	private void populateView() {
		// Are we done?
		if (graphMapsComposite.isDisposed()) {
			return;
		}

		// Find the Simulations that are not currently being displayed and put
		// them into the Set undisplayedSimulations.
		Set<ISimulation> undisplayedSimulations = new HashSet<ISimulation>();
		for (ISimulation simulation : simulationsToDisplay) {
			// Is this one associated with a GeographicControl already?
			if (!isDisplayed(simulation)) {
				undisplayedSimulations.add(simulation);
			}
		}

		// Go through the current set of Controls looking for ones that
		// we can reassign
		Control[] controls = graphMapsComposite.getChildren();
		for (Control element : controls) {
			// Does this GeographicControl have a simulation that is still valid
			// to display?
			GraphMapControl geoControl = (GraphMapControl) element;
			if (!simulationsToDisplay.contains(geoControl.getSimulation())
					&& !undisplayedSimulations.isEmpty()) {
				// Reassign it to one that is valid
				ISimulation simulation = (ISimulation) undisplayedSimulations
						.toArray()[0];
				geoControl.setSimulation(simulation);
				// Notify ViewPart that a new context menu has been generated
				undisplayedSimulations.remove(simulation);
			}
		}

		// At this point we still could have map controls with invalid
		// Simulations, let's get rid of them
		for (Control element : controls) {
			GraphMapControl geoControl = (GraphMapControl) element;
			// Does this MapControl have a simulation that is still valid to
			// display?
			ISimulation simulation = geoControl.getSimulation();
			if (simulation != null
					&& !simulationsToDisplay.contains(simulation)) {
				geoControl.removeSelectionChangedListener(this);
				geoControl.dispose();
			}
		}

		// If there're any Simulations not assigned to a GeographicControl,
		// let's take care of that now.
		for (ISimulation simulation2 : undisplayedSimulations) {
			GraphMapControl geoControl = new GraphMapControl(
					graphMapsComposite, SWT.NONE, this.view);
			// propagate view id
			// Notify ViewPart that a new context menu has been generated
			geoControl.addSelectionChangedListener(this);
			geoControl.setSimulation(simulation2);
		}

		// If there are no simulations to display, we just put up a "blank"
		// GeographicControl
		if (graphMapsComposite.getChildren().length == 0) {
			GraphMapControl geoControl = new GraphMapControl(
					graphMapsComposite, SWT.NONE, this.view);
			geoControl.addSelectionChangedListener(this);
		}

		graphMapsComposite.layout(true, true);
		graphMapsComposite.redraw();
	}

	/**
	 * @param simulation
	 * @return
	 */
	private boolean isDisplayed(ISimulation simulation) {
		boolean retValue = false;
		Control[] foo = graphMapsComposite.getChildren();
		for (Control element : foo) {
			GraphMapControl geoControl = (GraphMapControl) element;
			ISimulation testSimulation = geoControl.getSimulation();
			if (testSimulation != null && testSimulation.equals(simulation)) {
				retValue = true;
				break;
			}
		}
		return retValue;
	}

}
