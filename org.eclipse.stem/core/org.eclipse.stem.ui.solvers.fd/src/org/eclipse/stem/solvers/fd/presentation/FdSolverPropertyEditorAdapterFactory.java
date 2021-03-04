// DiseaseModelPropertyEditorAdapterFactory.java
package org.eclipse.stem.solvers.fd.presentation;

/******************************************************************************
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.core.solver.SolverPropertyEditorAdapter;
import org.eclipse.stem.core.solver.SolverPropertyEditorAdapterFactory;
import org.eclipse.stem.solvers.fd.util.FdAdapterFactory;
import org.eclipse.ui.IStartup;

/**
 *
 */
public class FdSolverPropertyEditorAdapterFactory extends FdAdapterFactory 
	implements SolverPropertyEditorAdapterFactory, IStartup {

	/**
	 * 
	 */
	public FdSolverPropertyEditorAdapterFactory() {
		super();
		SolverPropertyEditorAdapterFactory.INSTANCE
				.addAdapterFactory(this);
	}
	
	/**
	 * @see org.eclipse.ui.IStartup#earlyStartup()
	 */
	public void earlyStartup() {
		// Nothing to do here. This method is called after the constructor has
		// run which is the entire point of early activation which causes the
		// factory to be added to the PropertyStringProviderAdapterFactory.INSTANCE
	}

	/**
	 * 
	 */
	@Override
	public Adapter createFiniteDifferenceAdapter() {
		return new FdSolverAdapter();
	}

	/**
	 * 
	 */
	public boolean isFactoryForType(Object type) {
		return type == SolverPropertyEditorAdapter.class
				|| super.isFactoryForType(type);
	}
} 
