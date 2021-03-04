package org.eclipse.stem.solvers.rk;

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


import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.eclipse.stem.core.solver.Solver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apache Commons Math ODE Solver</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.stem.solvers.rk.RkPackage#getApacheCommonsMathODESolver()
 * @model
 * @generated
 */
public interface ApacheCommonsMathODESolver extends Solver {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.stem.solvers.rk.FirstOrderIntegrator"
	 * @generated
	 */
	FirstOrderIntegrator createIntegrator();
} // ApacheCommonsMathODESolver
