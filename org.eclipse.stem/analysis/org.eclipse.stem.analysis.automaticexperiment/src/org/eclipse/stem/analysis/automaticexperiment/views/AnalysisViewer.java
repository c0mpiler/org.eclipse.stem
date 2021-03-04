// AnalysisViewer.java
package org.eclipse.stem.analysis.automaticexperiment.views;

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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.ui.views.geographic.map.MapControl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This class presents "views" of the running simulations.
 */
public class AnalysisViewer extends Viewer  {

	
	
	private static final String URI_PREFIX = "/resources/data/scenario/disease/";
	
	

	/**
	 * This is the top-level control of the viewer. It contains the
	 * {@link MapControl}s that display the current state of the
	 * {@link org.eclipse.stem.jobs.simulation.Simulation}s.
	 */
	final Composite composite;

	


	

	

	// get the path
	//private static final IPath PATH = Activator.getDefault().getStateLocation();

	//private static final String sep = File.separator;
	
	//private static final String pathSuffix = "analysis"+sep;
	
	

	/**
	 * This factory is used to create instances of {@link AnalysisControl} in the
	 * method {@link #populateView()}
	 */
	private final AnalysisControlFactory acf;

	/**
	 * @param parent
	 *            the SWT parent of the control that makes up the viewer
	 * @param acf
	 *            the factory that creates instance of {@link AnalysisControl}
	 */
	public AnalysisViewer(final Composite parent, final AnalysisControlFactory acf) {

		composite = new Composite(parent, SWT.NONE);
		final FillLayout compositeLayout = new FillLayout(SWT.HORIZONTAL);
		composite.setLayout(compositeLayout);

		// Remember the factory that we'll use to create instances of
		// AnalysisControl
		this.acf = acf;
		refresh();
		composite.pack();
		
	} // AnalysisViewer

	/**
	 * @see org.eclipse.jface.viewers.Viewer#getControl()
	 */
	@Override
	public Control getControl() {
		return composite;
	} // getControl



	/**
	 * @see org.eclipse.jface.viewers.Viewer#refresh()
	 */
	@Override
	public void refresh() {
		populateView();
	} // refresh

	
	
	
	/**
	 * Create and dispose of MapControls as necessary to display the selected
	 * Simulations.
	 */
	private void populateView() {
		
		
		// problem here when we start up
		// Are we done?
		if (composite.isDisposed()) {
			// Yes
			return;
		} // if

	   
		final AnalysisControl analysisControl = acf.create(composite);
	
		analysisControl.addDisposeListener(new DisposeListener() {
			/**
			 * @see org.eclipse.swt.events.DisposeListener#widgetDisposed(org.eclipse.swt.events.DisposeEvent)
			 */
			public void widgetDisposed(final DisposeEvent e) {
				composite.layout(true, true);
				composite.redraw();
			}
		});

		composite.layout(true, true);
		composite.redraw();
	} // populateView
	
	
	

	

	

	
	/**
	 * Removes whitespace, ',', '.', etc.
	 * @param s
	 * @return a filtered string
	 */
	public static String nameFilter (String s) {
		String s1 = s.trim();
		s1 = s1.replace('"',' ');
		s1 = s1.replaceAll(" ","");
		s1 = s1.replace(',','_');
		s1 = s1.replace('.','_');
		s1 = s1.replaceAll("_","");
		s = s1;
		
		return s;
	}

	
	
	

	/**
	 * filters the location id prefix from the beginning of
	 *  a nodes ID for generation of a file name
	 * @param unfiltered
	 * @return the filtered file name using location id.
	 */
	public static String filterFilename(String unfiltered) {
		int last = unfiltered.indexOf(URI_PREFIX);
		if (last >=0) {
			last += URI_PREFIX.length();
			return unfiltered.substring(last, unfiltered.length());
		} 
		return unfiltered;

	
	}

	/**
	 * @see org.eclipse.jface.viewers.Viewer#getInput()
	 */
	@Override
	public Object getInput() {
		// not used
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.Viewer#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		// not used
	}

	/**
	 * @see org.eclipse.jface.viewers.Viewer#setSelection(org.eclipse.jface.viewers.ISelection, boolean)
	 */
	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		// not used
	}

	/**
	 * @see org.eclipse.jface.viewers.Viewer#getSelection()
	 */
	@Override
	public ISelection getSelection() {
		// not used
		return null;
	}

	
} // AnalysisViewer