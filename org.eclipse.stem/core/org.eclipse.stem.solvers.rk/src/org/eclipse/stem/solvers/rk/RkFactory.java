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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.solvers.rk.RkPackage
 * @generated
 */
public interface RkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RkFactory eINSTANCE = org.eclipse.stem.solvers.rk.impl.RkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Runge Kutta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runge Kutta</em>'.
	 * @generated
	 */
	RungeKutta createRungeKutta();

	/**
	 * Returns a new object of class '<em>Dormand Prince853</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dormand Prince853</em>'.
	 * @generated
	 */
	DormandPrince853 createDormandPrince853();

	/**
	 * Returns a new object of class '<em>Apache Commons Math ODE Solver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apache Commons Math ODE Solver</em>'.
	 * @generated
	 */
	ApacheCommonsMathODESolver createApacheCommonsMathODESolver();

	/**
	 * Returns a new object of class '<em>Dormand Prince54</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dormand Prince54</em>'.
	 * @generated
	 */
	DormandPrince54 createDormandPrince54();

	/**
	 * Returns a new object of class '<em>Fast Runge Kutta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fast Runge Kutta</em>'.
	 * @generated
	 */
	FastRungeKutta createFastRungeKutta();

	/**
	 * Returns a new object of class '<em>Gragg Bulirsch Stoer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gragg Bulirsch Stoer</em>'.
	 * @generated
	 */
	GraggBulirschStoer createGraggBulirschStoer();

	/**
	 * Returns a new object of class '<em>Higham Hall54</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Higham Hall54</em>'.
	 * @generated
	 */
	HighamHall54 createHighamHall54();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RkPackage getRkPackage();

} //RkFactory
