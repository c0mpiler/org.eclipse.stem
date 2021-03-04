// ActiveSimulationsView.java
package org.eclipse.stem.ui.views;

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

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationManagerListener;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.stem.jobs.simulation.SimulationManagerEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * This class is an Eclipse {@link ViewPart} that displays the currently active
 * {@link org.eclipse.stem.jobs.simulation.Simulation}s and their status.
 * 
 * @see SimulationManager
 */
public class ActiveSimulationsView extends ViewPart {

	/**
	 * The identifier of the Active Simulations View
	 */
	public static final String ID_ACTIVE_SIMULATIONS_VIEW = "org.eclipse.stem.ui.views.activesimulations"; //$NON-NLS-1$

	private ListViewer lv = null;

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(final Composite parent) {
		lv = new ListViewer(parent);
		lv.setContentProvider(new ActiveSimulationsContentProvider());
		lv.setLabelProvider(new ActiveSimulationsLabelProvider());
		lv.setInput(SimulationManager.getManager());

		// Provide our selection listener
		getSite().setSelectionProvider(lv);
	} // createPartControl

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// Nothing
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		getSite().setSelectionProvider(null);
		lv = null;
	} // dispose

	protected static class ActiveSimulationsContentProvider implements
			IStructuredContentProvider, ISimulationManagerListener {

		private ListViewer viewer = null;

		private SimulationManager simulationManager = null;

		/**
		 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
		 */
		public Object[] getElements(final Object inputElement) {
			return ((SimulationManager) inputElement).getActiveSimulations()
					.toArray();
		} // getElements

		/**
		 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
		 */
		public void dispose() {
			viewer = null;
			simulationManager = null;
		}

		/**
		 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
		 *      java.lang.Object, java.lang.Object)
		 */
		public void inputChanged(final Viewer viewer,
				final Object oldInput, final Object newInput) {
			this.viewer = (ListViewer) viewer;
			// Is our simulation manager changing?
			if (simulationManager != null) {
				// Yes
				simulationManager.removeListener(this);
			}
			simulationManager = (SimulationManager) newInput;

			// Do we have a new simulation manager to listen to?
			if (simulationManager != null) {
				// Yes
				simulationManager.addSimulationManagerListener(this);
			}
		} // inputChanged

		/**
		 * @see org.eclipse.stem.jobs.simulation.ISimulationManagerListener#simulationsChanged(org.eclipse.stem.jobs.simulation.SimulationManagerEvent)
		 */
		public void simulationsChanged(final SimulationManagerEvent event) {
			viewer.getList().setRedraw(false);
			try {
				viewer.remove(event.getSimulationsRemoved());
				viewer.add(event.getSimulationsAdded());
			} finally {
				viewer.getList().setRedraw(true);
			}

		} // simulationsChanged

	} // ActiveSimulationsContentProvider

	protected static class ActiveSimulationsLabelProvider implements
			ILabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
		 */
		public Image getImage(final Object element) {
			return null;
		} // getImage

		/**
		 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
		 */
		public String getText(final Object element) {
			final ISimulation simulation = (ISimulation) element;
			return simulation.getNameWithSequenceNumber();
		} // getText

		/**
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
		 */
		public void addListener(final ILabelProviderListener listener) {
			// nothing
		}

		/**
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
		 */
		public void dispose() {
			// nothing
		}

		/**
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object,
		 *      java.lang.String)
		 */
		public boolean isLabelProperty(final Object element, final String property) {
			return false;
		}

		/**
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
		 */
		public void removeListener(final ILabelProviderListener listener) {
			// nothing
		}
	} // ActiveSimulationsLabelProvider
} // ActiveSimulationsView
