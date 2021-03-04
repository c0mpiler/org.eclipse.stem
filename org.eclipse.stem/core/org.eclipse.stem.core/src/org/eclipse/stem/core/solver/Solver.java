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

import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphPartitioner;
import org.eclipse.stem.core.model.STEMTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.solver.Solver#getPartitioner <em>Partitioner</em>}</li>
 *   <li>{@link org.eclipse.stem.core.solver.Solver#getCanonicalGraph <em>Canonical Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.solver.SolverPackage#getSolver()
 * @model
 * @generated
 */
public interface Solver extends Identifiable {
	
	public final static String URI_TYPE = "Solver";

	/**
	 * Returns the value of the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitioner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitioner</em>' reference.
	 * @see #setPartitioner(GraphPartitioner)
	 * @see org.eclipse.stem.core.solver.SolverPackage#getSolver_Partitioner()
	 * @model transient="true"
	 * @generated
	 */
	GraphPartitioner getPartitioner();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.solver.Solver#getPartitioner <em>Partitioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partitioner</em>' reference.
	 * @see #getPartitioner()
	 * @generated
	 */
	void setPartitioner(GraphPartitioner value);

	/**
	 * Returns the value of the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonical Graph</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonical Graph</em>' containment reference.
	 * @see #setCanonicalGraph(Graph)
	 * @see org.eclipse.stem.core.solver.SolverPackage#getSolver_CanonicalGraph()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	Graph getCanonicalGraph();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.solver.Solver#getCanonicalGraph <em>Canonical Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonical Graph</em>' containment reference.
	 * @see #getCanonicalGraph()
	 * @generated
	 */
	void setCanonicalGraph(Graph value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.stem.core.solver.SolverException"
	 * @generated
	 */
	boolean step(STEMTime time, long timeDelta, int cycle) throws SolverException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset();

} // Solver
