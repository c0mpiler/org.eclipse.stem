// DiseaseModelPropertyEditorAdapterFactory.java
package org.eclipse.stem.solvers.rk.presentation;

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
import org.eclipse.stem.solvers.rk.util.RkAdapterFactory;
import org.eclipse.ui.IStartup;

/**
 *
 */
public class RkSolverPropertyEditorAdapterFactory extends RkAdapterFactory 
	implements SolverPropertyEditorAdapterFactory, IStartup {

	/**
	 * 
	 */
	public RkSolverPropertyEditorAdapterFactory() {
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
	public Adapter createRungeKuttaAdapter() {
		return new RkSolverAdapter();
	}

	
	/**
	 * 
	 */
	@Override
	public Adapter createDormandPrince853Adapter() {
		return new RkSolverAdapter();
	}
	
	/**
	 *
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince54
	 * @generated
	 */
	public Adapter createDormandPrince54Adapter() {
		return new RkSolverAdapter();
	}
	
	public Adapter createFastRungeKuttaAdapter() {
		return new RkSolverAdapter();
	}
	
	public Adapter createGraggBulirschStoerAdapter() {
		return new RkSolverAdapter();
	}

	public Adapter createHighamHall54Adapter() {
		return new RkSolverAdapter();
	}
	
	/**
	 * 
	 */
	public boolean isFactoryForType(Object type) {
		return type == SolverPropertyEditorAdapter.class
				|| super.isFactoryForType(type);
	}
} 
