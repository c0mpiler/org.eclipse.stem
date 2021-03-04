package org.eclipse.stem.solvers.rk.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.solvers.rk.ApacheCommonsMathODESolver;
import org.eclipse.stem.solvers.rk.DormandPrince54;
import org.eclipse.stem.solvers.rk.DormandPrince853;
import org.eclipse.stem.solvers.rk.FastRungeKutta;
import org.eclipse.stem.solvers.rk.GraggBulirschStoer;
import org.eclipse.stem.solvers.rk.HighamHall54;
import org.eclipse.stem.solvers.rk.RkFactory;
import org.eclipse.stem.solvers.rk.RkPackage;
import org.eclipse.stem.solvers.rk.RungeKutta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RkFactoryImpl extends EFactoryImpl implements RkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RkFactory init() {
		try {
			RkFactory theRkFactory = (RkFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/solvers/rk"); 
			if (theRkFactory != null) {
				return theRkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RkPackage.RUNGE_KUTTA: return createRungeKutta();
			case RkPackage.DORMAND_PRINCE853: return createDormandPrince853();
			case RkPackage.APACHE_COMMONS_MATH_ODE_SOLVER: return createApacheCommonsMathODESolver();
			case RkPackage.DORMAND_PRINCE54: return createDormandPrince54();
			case RkPackage.FAST_RUNGE_KUTTA: return createFastRungeKutta();
			case RkPackage.GRAGG_BULIRSCH_STOER: return createGraggBulirschStoer();
			case RkPackage.HIGHAM_HALL54: return createHighamHall54();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RungeKutta createRungeKutta() {
		RungeKuttaImpl rungeKutta = new RungeKuttaImpl();
		return rungeKutta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DormandPrince853 createDormandPrince853() {
		DormandPrince853Impl dormandPrince853 = new DormandPrince853Impl();
		return dormandPrince853;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApacheCommonsMathODESolver createApacheCommonsMathODESolver() {
		ApacheCommonsMathODESolverImpl apacheCommonsMathODESolver = new ApacheCommonsMathODESolverImpl();
		return apacheCommonsMathODESolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DormandPrince54 createDormandPrince54() {
		DormandPrince54Impl dormandPrince54 = new DormandPrince54Impl();
		return dormandPrince54;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FastRungeKutta createFastRungeKutta() {
		FastRungeKuttaImpl fastRungeKutta = new FastRungeKuttaImpl();
		return fastRungeKutta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraggBulirschStoer createGraggBulirschStoer() {
		GraggBulirschStoerImpl graggBulirschStoer = new GraggBulirschStoerImpl();
		return graggBulirschStoer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighamHall54 createHighamHall54() {
		HighamHall54Impl highamHall54 = new HighamHall54Impl();
		return highamHall54;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RkPackage getRkPackage() {
		return (RkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RkPackage getPackage() {
		return RkPackage.eINSTANCE;
	}

} //RkFactoryImpl
