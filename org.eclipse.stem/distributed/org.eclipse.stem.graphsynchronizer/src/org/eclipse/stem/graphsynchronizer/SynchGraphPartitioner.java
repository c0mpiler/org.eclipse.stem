package org.eclipse.stem.graphsynchronizer;

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
import org.eclipse.stem.core.graph.GraphPartitioner;
import org.eclipse.stem.jobs.simulation.ISimulation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synch Graph Partitioner</b></em>'. The class subdivies a model
 * graph among multiple running instances of STEM assigning to each instance a subgraph (set of nodes) to 
 * work on.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner#getNumNodes <em>Num Nodes</em>}</li>
 *   <li>{@link org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner#getNodeRank <em>Node Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.graphsynchronizer.GraphsynchronizerPackage#getSynchGraphPartitioner()
 * @model
 * @generated
 */
public interface SynchGraphPartitioner extends GraphPartitioner {

	/**
	 * Returns the value of the '<em><b>Num Nodes</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Nodes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Nodes</em>' attribute.
	 * @see #setNumNodes(int)
	 * @see org.eclipse.stem.graphsynchronizer.GraphsynchronizerPackage#getSynchGraphPartitioner_NumNodes()
	 * @model default="1"
	 * @generated
	 */
	int getNumNodes();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner#getNumNodes <em>Num Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Nodes</em>' attribute.
	 * @see #getNumNodes()
	 * @generated
	 */
	void setNumNodes(int value);

	/**
	 * Returns the value of the '<em><b>Node Rank</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Rank</em>' attribute.
	 * @see #setNodeRank(int)
	 * @see org.eclipse.stem.graphsynchronizer.GraphsynchronizerPackage#getSynchGraphPartitioner_NodeRank()
	 * @model default="0"
	 * @generated
	 */
	int getNodeRank();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner#getNodeRank <em>Node Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Rank</em>' attribute.
	 * @see #getNodeRank()
	 * @generated
	 */
	void setNodeRank(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getIdentifiableRank(Identifiable identifiable);
	

	/**
	 * initialize the partitioner from a simulation
	 * 
	 * @param s ISimulation
	 */
	public void initialize(ISimulation s); 
} // SynchGraphPartitioner
