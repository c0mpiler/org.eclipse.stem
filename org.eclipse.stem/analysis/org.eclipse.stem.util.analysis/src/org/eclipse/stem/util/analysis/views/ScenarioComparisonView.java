// EstimatorView 
package org.eclipse.stem.util.analysis.views;

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


import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * This view provides for a Cross PhaseSynchronizer analysis, comparing two scenarios
 */

public class ScenarioComparisonView extends ViewPart {


	/**
	 * The identifier of the Comparison View {@value}
	 */
	public static final String ID_Comparison_VIEW = "org.eclipse.stem.util.analysis.views.comparison"; //$NON-NLS-1$



	private AnalysisViewer analysisViewer;

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(final Composite parent) {

		analysisViewer = new AnalysisViewer(parent, ScenarioComparisonFactory.INSTANCE);
		analysisViewer.setInput(SimulationManager.getManager());

		getSite().setSelectionProvider(analysisViewer);


	} // createPartControl

	

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
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

} // EstimatorView
