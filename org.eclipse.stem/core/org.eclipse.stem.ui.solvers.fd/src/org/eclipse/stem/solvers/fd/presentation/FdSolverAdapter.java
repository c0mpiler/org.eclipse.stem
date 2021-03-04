package org.eclipse.stem.solvers.fd.presentation;
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

import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.core.solver.SolverPropertyComposite;
import org.eclipse.stem.core.solver.SolverPropertyEditor;
import org.eclipse.stem.core.solver.SolverPropertyEditorAdapter;
import org.eclipse.swt.events.ModifyListener;

/**
 *  
 * Adapter for Property Editor
 *
 */
public class FdSolverAdapter extends
		SolverPropertyEditorAdapter {

	/**
	 * 
	 */
	@Override
	public SolverPropertyEditor createSolverPropertyEditor(
			SolverPropertyComposite solverPropertyComposite,
			int style, ModifyListener projectValidator) {
		return new FdSolverPropertyEditor(
				solverPropertyComposite, style,
				(Solver) getTarget(), projectValidator);
	} // createSolverPropertyEditor

} // FdSolverAdapter
