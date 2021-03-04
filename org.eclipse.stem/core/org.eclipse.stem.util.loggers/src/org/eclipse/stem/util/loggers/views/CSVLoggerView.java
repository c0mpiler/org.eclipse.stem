// CSVLoggerView 
package org.eclipse.stem.util.loggers.views;

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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

/**
 * This view contains BIRT output that plots values of variables in STEM
 * simulations.
 */

public class CSVLoggerView extends ViewPart implements ISelectionListener {

	//private List<Identifiable> selectedIdentifiables = null;

	
	/**
	 * This is the decorator that has been selected by the combo box.
	 */
	protected Decorator selectedDecorator;

	private LoggerViewer loggerViewer;

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(final Composite parent) {

		loggerViewer = new LoggerViewer(parent, CSVLoggerFactory.INSTANCE);
		loggerViewer.setInput(SimulationManager.getManager());
		
	//	loggerViewer.addAllActionButtons(SimulationManager.getManager());

		getSite().setSelectionProvider(loggerViewer);

		// Register with the SelectionService
		// Stefan: Commented out since we don't allow
		// logging of individual locations
		
/*		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(this);
*/
	} // createPartControl

	/**
	 * This method is called whenever ANYTHING is selected in the Eclipse
	 * workbench. It's job is to filter out selections of ISimulation instances
	 * and update the chart in the CSVLoggerCanvas
	 * @param part 
	 * @param selection 
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(final IWorkbenchPart part,
			final ISelection selection) {
	     /*
	      * this method is empty because now we log the entire simulation
	      * we now longer have to track individual locations of identifiables as
	      * logged/not logged	
	      */

	} // selectionChanged

	
	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getSelectionService()
				.removeSelectionListener(this);
	} // dispose

	/**
	 * This is required by the interface, but we're not using it.
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// Nothing
	} // setFocus

} // CSVLoggerView
