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



import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.core.graph.GraphPackage;

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
 * @see org.eclipse.stem.graphsynchronizer.GraphsynchronizerFactory
 * @model kind="package"
 * @generated
 */
public interface GraphsynchronizerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphsynchronizer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/graphsynchronizer/graphsynchronizer.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.graphsynchronizer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphsynchronizerPackage eINSTANCE = org.eclipse.stem.graphsynchronizer.impl.GraphsynchronizerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphsynchronizer.impl.SynchGraphPartitionerImpl <em>Synch Graph Partitioner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphsynchronizer.impl.SynchGraphPartitionerImpl
	 * @see org.eclipse.stem.graphsynchronizer.impl.GraphsynchronizerPackageImpl#getSynchGraphPartitioner()
	 * @generated
	 */
	int SYNCH_GRAPH_PARTITIONER = 0;

	/**
	 * The feature id for the '<em><b>Num Processes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_GRAPH_PARTITIONER__NUM_PROCESSES = GraphPackage.GRAPH_PARTITIONER__NUM_PROCESSES;

	/**
	 * The feature id for the '<em><b>Num Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_GRAPH_PARTITIONER__NUM_NODES = GraphPackage.GRAPH_PARTITIONER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_GRAPH_PARTITIONER__NODE_RANK = GraphPackage.GRAPH_PARTITIONER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synch Graph Partitioner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_GRAPH_PARTITIONER_FEATURE_COUNT = GraphPackage.GRAPH_PARTITIONER_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner <em>Synch Graph Partitioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synch Graph Partitioner</em>'.
	 * @see org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner
	 * @generated
	 */
	EClass getSynchGraphPartitioner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner#getNumNodes <em>Num Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Nodes</em>'.
	 * @see org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner#getNumNodes()
	 * @see #getSynchGraphPartitioner()
	 * @generated
	 */
	EAttribute getSynchGraphPartitioner_NumNodes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner#getNodeRank <em>Node Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Rank</em>'.
	 * @see org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner#getNodeRank()
	 * @see #getSynchGraphPartitioner()
	 * @generated
	 */
	EAttribute getSynchGraphPartitioner_NodeRank();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphsynchronizerFactory getGraphsynchronizerFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.graphsynchronizer.impl.SynchGraphPartitionerImpl <em>Synch Graph Partitioner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphsynchronizer.impl.SynchGraphPartitionerImpl
		 * @see org.eclipse.stem.graphsynchronizer.impl.GraphsynchronizerPackageImpl#getSynchGraphPartitioner()
		 * @generated
		 */
		EClass SYNCH_GRAPH_PARTITIONER = eINSTANCE.getSynchGraphPartitioner();
		/**
		 * The meta object literal for the '<em><b>Num Nodes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCH_GRAPH_PARTITIONER__NUM_NODES = eINSTANCE.getSynchGraphPartitioner_NumNodes();
		/**
		 * The meta object literal for the '<em><b>Node Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCH_GRAPH_PARTITIONER__NODE_RANK = eINSTANCE.getSynchGraphPartitioner_NodeRank();

	}

} //GraphsynchronizerPackage
