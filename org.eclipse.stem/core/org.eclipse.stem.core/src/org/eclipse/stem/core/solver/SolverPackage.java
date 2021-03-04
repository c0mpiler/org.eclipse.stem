package org.eclipse.stem.core.solver;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.stem.core.common.CommonPackage;

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
 * @see org.eclipse.stem.core.solver.SolverFactory
 * @model kind="package"
 * @generated
 */
public interface SolverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solver"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/stem/core/solver"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.core.solver"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverPackage eINSTANCE = org.eclipse.stem.core.solver.impl.SolverPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.core.solver.impl.SolverImpl <em>Solver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.solver.impl.SolverImpl
	 * @see org.eclipse.stem.core.solver.impl.SolverPackageImpl#getSolver()
	 * @generated
	 */
	int SOLVER = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__URI = CommonPackage.IDENTIFIABLE__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__TYPE_URI = CommonPackage.IDENTIFIABLE__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__DUBLIN_CORE = CommonPackage.IDENTIFIABLE__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__PARTITIONER = CommonPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__CANONICAL_GRAPH = CommonPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_FEATURE_COUNT = CommonPackage.IDENTIFIABLE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.solver.SolverException
	 * @see org.eclipse.stem.core.solver.impl.SolverPackageImpl#getSolverException()
	 * @generated
	 */
	int SOLVER_EXCEPTION = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.core.solver.Solver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver</em>'.
	 * @see org.eclipse.stem.core.solver.Solver
	 * @generated
	 */
	EClass getSolver();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.core.solver.Solver#getPartitioner <em>Partitioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partitioner</em>'.
	 * @see org.eclipse.stem.core.solver.Solver#getPartitioner()
	 * @see #getSolver()
	 * @generated
	 */
	EReference getSolver_Partitioner();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.core.solver.Solver#getCanonicalGraph <em>Canonical Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canonical Graph</em>'.
	 * @see org.eclipse.stem.core.solver.Solver#getCanonicalGraph()
	 * @see #getSolver()
	 * @generated
	 */
	EReference getSolver_CanonicalGraph();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.stem.core.solver.SolverException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see org.eclipse.stem.core.solver.SolverException
	 * @model instanceClass="org.eclipse.stem.core.solver.SolverException" serializeable="false"
	 * @generated
	 */
	EDataType getSolverException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolverFactory getSolverFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.core.solver.impl.SolverImpl <em>Solver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.core.solver.impl.SolverImpl
		 * @see org.eclipse.stem.core.solver.impl.SolverPackageImpl#getSolver()
		 * @generated
		 */
		EClass SOLVER = eINSTANCE.getSolver();

		/**
		 * The meta object literal for the '<em><b>Partitioner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER__PARTITIONER = eINSTANCE.getSolver_Partitioner();

		/**
		 * The meta object literal for the '<em><b>Canonical Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER__CANONICAL_GRAPH = eINSTANCE.getSolver_CanonicalGraph();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.core.solver.SolverException
		 * @see org.eclipse.stem.core.solver.impl.SolverPackageImpl#getSolverException()
		 * @generated
		 */
		EDataType SOLVER_EXCEPTION = eINSTANCE.getSolverException();

	}

} //SolverPackage
