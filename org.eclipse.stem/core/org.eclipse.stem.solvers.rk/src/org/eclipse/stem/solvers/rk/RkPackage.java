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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.core.solver.SolverPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.solvers.rk.RkFactory
 * @model kind="package"
 * @generated
 */
public interface RkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/solvers/rk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.solvers.rk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RkPackage eINSTANCE = org.eclipse.stem.solvers.rk.impl.RkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.solvers.rk.impl.RungeKuttaImpl <em>Runge Kutta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.solvers.rk.impl.RungeKuttaImpl
	 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getRungeKutta()
	 * @generated
	 */
	int RUNGE_KUTTA = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNGE_KUTTA__URI = SolverPackage.SOLVER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNGE_KUTTA__TYPE_URI = SolverPackage.SOLVER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNGE_KUTTA__DUBLIN_CORE = SolverPackage.SOLVER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNGE_KUTTA__PARTITIONER = SolverPackage.SOLVER__PARTITIONER;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNGE_KUTTA__CANONICAL_GRAPH = SolverPackage.SOLVER__CANONICAL_GRAPH;

	/**
	 * The feature id for the '<em><b>Relative Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNGE_KUTTA__RELATIVE_TOLERANCE = SolverPackage.SOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNGE_KUTTA__MIN_STEP = SolverPackage.SOLVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runge Kutta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNGE_KUTTA_FEATURE_COUNT = SolverPackage.SOLVER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.solvers.rk.impl.ApacheCommonsMathODESolverImpl <em>Apache Commons Math ODE Solver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.solvers.rk.impl.ApacheCommonsMathODESolverImpl
	 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getApacheCommonsMathODESolver()
	 * @generated
	 */
	int APACHE_COMMONS_MATH_ODE_SOLVER = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_COMMONS_MATH_ODE_SOLVER__URI = SolverPackage.SOLVER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_COMMONS_MATH_ODE_SOLVER__TYPE_URI = SolverPackage.SOLVER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_COMMONS_MATH_ODE_SOLVER__DUBLIN_CORE = SolverPackage.SOLVER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_COMMONS_MATH_ODE_SOLVER__PARTITIONER = SolverPackage.SOLVER__PARTITIONER;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_COMMONS_MATH_ODE_SOLVER__CANONICAL_GRAPH = SolverPackage.SOLVER__CANONICAL_GRAPH;

	/**
	 * The number of structural features of the '<em>Apache Commons Math ODE Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT = SolverPackage.SOLVER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.solvers.rk.impl.DormandPrince853Impl <em>Dormand Prince853</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.solvers.rk.impl.DormandPrince853Impl
	 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getDormandPrince853()
	 * @generated
	 */
	int DORMAND_PRINCE853 = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853__URI = APACHE_COMMONS_MATH_ODE_SOLVER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853__TYPE_URI = APACHE_COMMONS_MATH_ODE_SOLVER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853__DUBLIN_CORE = APACHE_COMMONS_MATH_ODE_SOLVER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853__PARTITIONER = APACHE_COMMONS_MATH_ODE_SOLVER__PARTITIONER;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853__CANONICAL_GRAPH = APACHE_COMMONS_MATH_ODE_SOLVER__CANONICAL_GRAPH;

	/**
	 * The feature id for the '<em><b>Relative Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853__RELATIVE_TOLERANCE = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Absolute Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853__ABSOLUTE_TOLERANCE = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853__MIN_STEP = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853__MAX_STEP = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dormand Prince853</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE853_FEATURE_COUNT = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.solvers.rk.impl.DormandPrince54Impl <em>Dormand Prince54</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.solvers.rk.impl.DormandPrince54Impl
	 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getDormandPrince54()
	 * @generated
	 */
	int DORMAND_PRINCE54 = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54__URI = APACHE_COMMONS_MATH_ODE_SOLVER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54__TYPE_URI = APACHE_COMMONS_MATH_ODE_SOLVER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54__DUBLIN_CORE = APACHE_COMMONS_MATH_ODE_SOLVER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54__PARTITIONER = APACHE_COMMONS_MATH_ODE_SOLVER__PARTITIONER;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54__CANONICAL_GRAPH = APACHE_COMMONS_MATH_ODE_SOLVER__CANONICAL_GRAPH;

	/**
	 * The feature id for the '<em><b>Relative Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54__RELATIVE_TOLERANCE = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Absolute Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54__ABSOLUTE_TOLERANCE = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54__MIN_STEP = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54__MAX_STEP = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dormand Prince54</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMAND_PRINCE54_FEATURE_COUNT = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.solvers.rk.impl.FastRungeKuttaImpl <em>Fast Runge Kutta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.solvers.rk.impl.FastRungeKuttaImpl
	 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getFastRungeKutta()
	 * @generated
	 */
	int FAST_RUNGE_KUTTA = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAST_RUNGE_KUTTA__URI = SolverPackage.SOLVER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAST_RUNGE_KUTTA__TYPE_URI = SolverPackage.SOLVER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAST_RUNGE_KUTTA__DUBLIN_CORE = SolverPackage.SOLVER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAST_RUNGE_KUTTA__PARTITIONER = SolverPackage.SOLVER__PARTITIONER;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAST_RUNGE_KUTTA__CANONICAL_GRAPH = SolverPackage.SOLVER__CANONICAL_GRAPH;

	/**
	 * The feature id for the '<em><b>Relative Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE = SolverPackage.SOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAST_RUNGE_KUTTA__MIN_STEP = SolverPackage.SOLVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fast Runge Kutta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAST_RUNGE_KUTTA_FEATURE_COUNT = SolverPackage.SOLVER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.solvers.rk.impl.GraggBulirschStoerImpl <em>Gragg Bulirsch Stoer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.solvers.rk.impl.GraggBulirschStoerImpl
	 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getGraggBulirschStoer()
	 * @generated
	 */
	int GRAGG_BULIRSCH_STOER = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER__URI = APACHE_COMMONS_MATH_ODE_SOLVER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER__TYPE_URI = APACHE_COMMONS_MATH_ODE_SOLVER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER__DUBLIN_CORE = APACHE_COMMONS_MATH_ODE_SOLVER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER__PARTITIONER = APACHE_COMMONS_MATH_ODE_SOLVER__PARTITIONER;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER__CANONICAL_GRAPH = APACHE_COMMONS_MATH_ODE_SOLVER__CANONICAL_GRAPH;

	/**
	 * The feature id for the '<em><b>Relative Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER__RELATIVE_TOLERANCE = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Absolute Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER__ABSOLUTE_TOLERANCE = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER__MIN_STEP = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER__MAX_STEP = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gragg Bulirsch Stoer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAGG_BULIRSCH_STOER_FEATURE_COUNT = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.solvers.rk.impl.HighamHall54Impl <em>Higham Hall54</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.solvers.rk.impl.HighamHall54Impl
	 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getHighamHall54()
	 * @generated
	 */
	int HIGHAM_HALL54 = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54__URI = APACHE_COMMONS_MATH_ODE_SOLVER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54__TYPE_URI = APACHE_COMMONS_MATH_ODE_SOLVER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54__DUBLIN_CORE = APACHE_COMMONS_MATH_ODE_SOLVER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54__PARTITIONER = APACHE_COMMONS_MATH_ODE_SOLVER__PARTITIONER;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54__CANONICAL_GRAPH = APACHE_COMMONS_MATH_ODE_SOLVER__CANONICAL_GRAPH;

	/**
	 * The feature id for the '<em><b>Relative Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54__RELATIVE_TOLERANCE = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Absolute Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54__ABSOLUTE_TOLERANCE = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54__MIN_STEP = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54__MAX_STEP = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Higham Hall54</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHAM_HALL54_FEATURE_COUNT = APACHE_COMMONS_MATH_ODE_SOLVER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '<em>First Order Integrator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.commons.math.ode.FirstOrderIntegrator
	 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getFirstOrderIntegrator()
	 * @generated
	 */
	int FIRST_ORDER_INTEGRATOR = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.solvers.rk.RungeKutta <em>Runge Kutta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runge Kutta</em>'.
	 * @see org.eclipse.stem.solvers.rk.RungeKutta
	 * @generated
	 */
	EClass getRungeKutta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.RungeKutta#getRelativeTolerance <em>Relative Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.RungeKutta#getRelativeTolerance()
	 * @see #getRungeKutta()
	 * @generated
	 */
	EAttribute getRungeKutta_RelativeTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.RungeKutta#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.RungeKutta#getMinStep()
	 * @see #getRungeKutta()
	 * @generated
	 */
	EAttribute getRungeKutta_MinStep();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.solvers.rk.DormandPrince853 <em>Dormand Prince853</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dormand Prince853</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince853
	 * @generated
	 */
	EClass getDormandPrince853();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.DormandPrince853#getRelativeTolerance <em>Relative Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince853#getRelativeTolerance()
	 * @see #getDormandPrince853()
	 * @generated
	 */
	EAttribute getDormandPrince853_RelativeTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.DormandPrince853#getAbsoluteTolerance <em>Absolute Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince853#getAbsoluteTolerance()
	 * @see #getDormandPrince853()
	 * @generated
	 */
	EAttribute getDormandPrince853_AbsoluteTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.DormandPrince853#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince853#getMinStep()
	 * @see #getDormandPrince853()
	 * @generated
	 */
	EAttribute getDormandPrince853_MinStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.DormandPrince853#getMaxStep <em>Max Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince853#getMaxStep()
	 * @see #getDormandPrince853()
	 * @generated
	 */
	EAttribute getDormandPrince853_MaxStep();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.solvers.rk.ApacheCommonsMathODESolver <em>Apache Commons Math ODE Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apache Commons Math ODE Solver</em>'.
	 * @see org.eclipse.stem.solvers.rk.ApacheCommonsMathODESolver
	 * @generated
	 */
	EClass getApacheCommonsMathODESolver();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.solvers.rk.DormandPrince54 <em>Dormand Prince54</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dormand Prince54</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince54
	 * @generated
	 */
	EClass getDormandPrince54();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.DormandPrince54#getRelativeTolerance <em>Relative Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince54#getRelativeTolerance()
	 * @see #getDormandPrince54()
	 * @generated
	 */
	EAttribute getDormandPrince54_RelativeTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.DormandPrince54#getAbsoluteTolerance <em>Absolute Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince54#getAbsoluteTolerance()
	 * @see #getDormandPrince54()
	 * @generated
	 */
	EAttribute getDormandPrince54_AbsoluteTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.DormandPrince54#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince54#getMinStep()
	 * @see #getDormandPrince54()
	 * @generated
	 */
	EAttribute getDormandPrince54_MinStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.DormandPrince54#getMaxStep <em>Max Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.DormandPrince54#getMaxStep()
	 * @see #getDormandPrince54()
	 * @generated
	 */
	EAttribute getDormandPrince54_MaxStep();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.solvers.rk.FastRungeKutta <em>Fast Runge Kutta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fast Runge Kutta</em>'.
	 * @see org.eclipse.stem.solvers.rk.FastRungeKutta
	 * @generated
	 */
	EClass getFastRungeKutta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.FastRungeKutta#getRelativeTolerance <em>Relative Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.FastRungeKutta#getRelativeTolerance()
	 * @see #getFastRungeKutta()
	 * @generated
	 */
	EAttribute getFastRungeKutta_RelativeTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.FastRungeKutta#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.FastRungeKutta#getMinStep()
	 * @see #getFastRungeKutta()
	 * @generated
	 */
	EAttribute getFastRungeKutta_MinStep();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.solvers.rk.GraggBulirschStoer <em>Gragg Bulirsch Stoer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gragg Bulirsch Stoer</em>'.
	 * @see org.eclipse.stem.solvers.rk.GraggBulirschStoer
	 * @generated
	 */
	EClass getGraggBulirschStoer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.GraggBulirschStoer#getRelativeTolerance <em>Relative Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.GraggBulirschStoer#getRelativeTolerance()
	 * @see #getGraggBulirschStoer()
	 * @generated
	 */
	EAttribute getGraggBulirschStoer_RelativeTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.GraggBulirschStoer#getAbsoluteTolerance <em>Absolute Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.GraggBulirschStoer#getAbsoluteTolerance()
	 * @see #getGraggBulirschStoer()
	 * @generated
	 */
	EAttribute getGraggBulirschStoer_AbsoluteTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.GraggBulirschStoer#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.GraggBulirschStoer#getMinStep()
	 * @see #getGraggBulirschStoer()
	 * @generated
	 */
	EAttribute getGraggBulirschStoer_MinStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.GraggBulirschStoer#getMaxStep <em>Max Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.GraggBulirschStoer#getMaxStep()
	 * @see #getGraggBulirschStoer()
	 * @generated
	 */
	EAttribute getGraggBulirschStoer_MaxStep();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.solvers.rk.HighamHall54 <em>Higham Hall54</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Higham Hall54</em>'.
	 * @see org.eclipse.stem.solvers.rk.HighamHall54
	 * @generated
	 */
	EClass getHighamHall54();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.HighamHall54#getRelativeTolerance <em>Relative Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.HighamHall54#getRelativeTolerance()
	 * @see #getHighamHall54()
	 * @generated
	 */
	EAttribute getHighamHall54_RelativeTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.HighamHall54#getAbsoluteTolerance <em>Absolute Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Tolerance</em>'.
	 * @see org.eclipse.stem.solvers.rk.HighamHall54#getAbsoluteTolerance()
	 * @see #getHighamHall54()
	 * @generated
	 */
	EAttribute getHighamHall54_AbsoluteTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.HighamHall54#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.HighamHall54#getMinStep()
	 * @see #getHighamHall54()
	 * @generated
	 */
	EAttribute getHighamHall54_MinStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.rk.HighamHall54#getMaxStep <em>Max Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Step</em>'.
	 * @see org.eclipse.stem.solvers.rk.HighamHall54#getMaxStep()
	 * @see #getHighamHall54()
	 * @generated
	 */
	EAttribute getHighamHall54_MaxStep();

	/**
	 * Returns the meta object for data type '{@link org.apache.commons.math.ode.FirstOrderIntegrator <em>First Order Integrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>First Order Integrator</em>'.
	 * @see org.apache.commons.math.ode.FirstOrderIntegrator
	 * @model instanceClass="org.apache.commons.math.ode.FirstOrderIntegrator" serializeable="false"
	 * @generated
	 */
	EDataType getFirstOrderIntegrator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RkFactory getRkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.solvers.rk.impl.RungeKuttaImpl <em>Runge Kutta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.solvers.rk.impl.RungeKuttaImpl
		 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getRungeKutta()
		 * @generated
		 */
		EClass RUNGE_KUTTA = eINSTANCE.getRungeKutta();

		/**
		 * The meta object literal for the '<em><b>Relative Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNGE_KUTTA__RELATIVE_TOLERANCE = eINSTANCE.getRungeKutta_RelativeTolerance();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNGE_KUTTA__MIN_STEP = eINSTANCE.getRungeKutta_MinStep();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.solvers.rk.impl.DormandPrince853Impl <em>Dormand Prince853</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.solvers.rk.impl.DormandPrince853Impl
		 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getDormandPrince853()
		 * @generated
		 */
		EClass DORMAND_PRINCE853 = eINSTANCE.getDormandPrince853();

		/**
		 * The meta object literal for the '<em><b>Relative Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DORMAND_PRINCE853__RELATIVE_TOLERANCE = eINSTANCE.getDormandPrince853_RelativeTolerance();

		/**
		 * The meta object literal for the '<em><b>Absolute Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DORMAND_PRINCE853__ABSOLUTE_TOLERANCE = eINSTANCE.getDormandPrince853_AbsoluteTolerance();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DORMAND_PRINCE853__MIN_STEP = eINSTANCE.getDormandPrince853_MinStep();

		/**
		 * The meta object literal for the '<em><b>Max Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DORMAND_PRINCE853__MAX_STEP = eINSTANCE.getDormandPrince853_MaxStep();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.solvers.rk.impl.ApacheCommonsMathODESolverImpl <em>Apache Commons Math ODE Solver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.solvers.rk.impl.ApacheCommonsMathODESolverImpl
		 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getApacheCommonsMathODESolver()
		 * @generated
		 */
		EClass APACHE_COMMONS_MATH_ODE_SOLVER = eINSTANCE.getApacheCommonsMathODESolver();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.solvers.rk.impl.DormandPrince54Impl <em>Dormand Prince54</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.solvers.rk.impl.DormandPrince54Impl
		 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getDormandPrince54()
		 * @generated
		 */
		EClass DORMAND_PRINCE54 = eINSTANCE.getDormandPrince54();

		/**
		 * The meta object literal for the '<em><b>Relative Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DORMAND_PRINCE54__RELATIVE_TOLERANCE = eINSTANCE.getDormandPrince54_RelativeTolerance();

		/**
		 * The meta object literal for the '<em><b>Absolute Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DORMAND_PRINCE54__ABSOLUTE_TOLERANCE = eINSTANCE.getDormandPrince54_AbsoluteTolerance();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DORMAND_PRINCE54__MIN_STEP = eINSTANCE.getDormandPrince54_MinStep();

		/**
		 * The meta object literal for the '<em><b>Max Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DORMAND_PRINCE54__MAX_STEP = eINSTANCE.getDormandPrince54_MaxStep();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.solvers.rk.impl.FastRungeKuttaImpl <em>Fast Runge Kutta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.solvers.rk.impl.FastRungeKuttaImpl
		 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getFastRungeKutta()
		 * @generated
		 */
		EClass FAST_RUNGE_KUTTA = eINSTANCE.getFastRungeKutta();

		/**
		 * The meta object literal for the '<em><b>Relative Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE = eINSTANCE.getFastRungeKutta_RelativeTolerance();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAST_RUNGE_KUTTA__MIN_STEP = eINSTANCE.getFastRungeKutta_MinStep();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.solvers.rk.impl.GraggBulirschStoerImpl <em>Gragg Bulirsch Stoer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.solvers.rk.impl.GraggBulirschStoerImpl
		 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getGraggBulirschStoer()
		 * @generated
		 */
		EClass GRAGG_BULIRSCH_STOER = eINSTANCE.getGraggBulirschStoer();

		/**
		 * The meta object literal for the '<em><b>Relative Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAGG_BULIRSCH_STOER__RELATIVE_TOLERANCE = eINSTANCE.getGraggBulirschStoer_RelativeTolerance();

		/**
		 * The meta object literal for the '<em><b>Absolute Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAGG_BULIRSCH_STOER__ABSOLUTE_TOLERANCE = eINSTANCE.getGraggBulirschStoer_AbsoluteTolerance();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAGG_BULIRSCH_STOER__MIN_STEP = eINSTANCE.getGraggBulirschStoer_MinStep();

		/**
		 * The meta object literal for the '<em><b>Max Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAGG_BULIRSCH_STOER__MAX_STEP = eINSTANCE.getGraggBulirschStoer_MaxStep();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.solvers.rk.impl.HighamHall54Impl <em>Higham Hall54</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.solvers.rk.impl.HighamHall54Impl
		 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getHighamHall54()
		 * @generated
		 */
		EClass HIGHAM_HALL54 = eINSTANCE.getHighamHall54();

		/**
		 * The meta object literal for the '<em><b>Relative Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGHAM_HALL54__RELATIVE_TOLERANCE = eINSTANCE.getHighamHall54_RelativeTolerance();

		/**
		 * The meta object literal for the '<em><b>Absolute Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGHAM_HALL54__ABSOLUTE_TOLERANCE = eINSTANCE.getHighamHall54_AbsoluteTolerance();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGHAM_HALL54__MIN_STEP = eINSTANCE.getHighamHall54_MinStep();

		/**
		 * The meta object literal for the '<em><b>Max Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGHAM_HALL54__MAX_STEP = eINSTANCE.getHighamHall54_MaxStep();

		/**
		 * The meta object literal for the '<em>First Order Integrator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.commons.math.ode.FirstOrderIntegrator
		 * @see org.eclipse.stem.solvers.rk.impl.RkPackageImpl#getFirstOrderIntegrator()
		 * @generated
		 */
		EDataType FIRST_ORDER_INTEGRATOR = eINSTANCE.getFirstOrderIntegrator();

	}

} //RkPackage
