package org.eclipse.stem.analysis.automaticexperiment.ui;

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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.stem.analysis.automaticexperiment.OptimizerAlgorithm;
import org.eclipse.stem.analysis.automaticexperiment.views.Messages;
import org.eclipse.stem.ui.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

/**
 * This class represents the SWT control for defining a disease.
 */
public class AlgorithmControl extends Composite {

	//private static OptimizerAlgorithm[] algorithms = null;

	StackLayout stackLayout;
	

	private Map<OptimizerAlgorithm, AlgorithmCompositeEditor>compositeMap = new HashMap<OptimizerAlgorithm, AlgorithmCompositeEditor>();
	
	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public AlgorithmControl(final Composite parent, final int style,
			ModifyListener projectValidator, IProject project, OptimizerAlgorithm[]algorithms) {
		super(parent, style);
		stackLayout = new StackLayout();
		setLayout(stackLayout);

		AlgorithmCompositeEditor firstOne = null;
		if (algorithms != null) {
			// Yes
			for (int i = 0; i < algorithms.length; i++) {

				AlgorithmCompositeEditorAdapter acea = (AlgorithmCompositeEditorAdapter) AlgorithmCompositeEditorAdapterFactory.INSTANCE
						.adapt(algorithms[i],
								AlgorithmCompositeEditorAdapter.class);

				final AlgorithmCompositeEditor ace = acea
						.createCompositeEditor(this, SWT.NONE,projectValidator, project);

				compositeMap.put(algorithms[i], ace);
				if (firstOne == null) {
					// Yes
					firstOne = ace;
				} // if
			} // for i
		} // if any disease models?

		stackLayout.topControl = firstOne;
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.stem.doc.newautoexp_contextid");
	}// 

	

	void displayAlgorithm(final OptimizerAlgorithm algorithm) {
		final AlgorithmCompositeEditor ace = compositeMap.get(algorithm);
		// Did we find it?
		if (ace != null) {
			// Yes
			stackLayout.topControl = ace;
			layout();
		} // if
		else {
			Activator.logError(Messages.getString("DMPC2") //$NON-NLS-1$
					+ algorithm.getClass().getName() + "\"", null); //$NON-NLS-1$
		}
	} // 
	
	
	
	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	/**
	 * @return <code>true</code> if the contents of the control are valid,
	 *         <code>false</code> otherwise.
	 */
	public boolean validate() {
		return ((AlgorithmCompositeEditor) (stackLayout.topControl))
		.validate();
	} // validate

	/**
	 * @return the error message set by {@link #validate()}
	 */
	public String getErrorMessage() {
		return ((AlgorithmCompositeEditor) (stackLayout.topControl))
		.getErrorMessage();
	}

	public OptimizerAlgorithm createAutomaticExperiment() {
		return( ((AlgorithmCompositeEditor)(stackLayout.topControl)).createAlgorithm());
	}
} // 
