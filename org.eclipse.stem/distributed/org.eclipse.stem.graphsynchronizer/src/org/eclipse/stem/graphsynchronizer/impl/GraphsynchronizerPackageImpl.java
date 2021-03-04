package org.eclipse.stem.graphsynchronizer.impl;

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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.sequencer.SequencerPackage;
import org.eclipse.stem.core.solver.SolverPackage;
import org.eclipse.stem.graphsynchronizer.GraphsynchronizerFactory;
import org.eclipse.stem.graphsynchronizer.GraphsynchronizerPackage;
import org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphsynchronizerPackageImpl extends EPackageImpl implements GraphsynchronizerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchGraphPartitionerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.stem.graphsynchronizer.GraphsynchronizerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphsynchronizerPackageImpl() {
		super(eNS_URI, GraphsynchronizerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GraphsynchronizerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphsynchronizerPackage init() {
		if (isInited) return (GraphsynchronizerPackage)EPackage.Registry.INSTANCE.getEPackage(GraphsynchronizerPackage.eNS_URI);

		// Obtain or create and register package
		GraphsynchronizerPackageImpl theGraphsynchronizerPackage = (GraphsynchronizerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraphsynchronizerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraphsynchronizerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGraphsynchronizerPackage.createPackageContents();

		// Initialize created meta-data
		theGraphsynchronizerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphsynchronizerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphsynchronizerPackage.eNS_URI, theGraphsynchronizerPackage);
		return theGraphsynchronizerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchGraphPartitioner() {
		return synchGraphPartitionerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchGraphPartitioner_NumNodes() {
		return (EAttribute)synchGraphPartitionerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchGraphPartitioner_NodeRank() {
		return (EAttribute)synchGraphPartitionerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphsynchronizerFactory getGraphsynchronizerFactory() {
		return (GraphsynchronizerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		synchGraphPartitionerEClass = createEClass(SYNCH_GRAPH_PARTITIONER);
		createEAttribute(synchGraphPartitionerEClass, SYNCH_GRAPH_PARTITIONER__NUM_NODES);
		createEAttribute(synchGraphPartitionerEClass, SYNCH_GRAPH_PARTITIONER__NODE_RANK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		synchGraphPartitionerEClass.getESuperTypes().add(theGraphPackage.getGraphPartitioner());

		// Initialize classes and features; add operations and parameters
		initEClass(synchGraphPartitionerEClass, SynchGraphPartitioner.class, "SynchGraphPartitioner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchGraphPartitioner_NumNodes(), theEcorePackage.getEInt(), "numNodes", "1", 0, 1, SynchGraphPartitioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchGraphPartitioner_NodeRank(), theEcorePackage.getEInt(), "nodeRank", "0", 0, 1, SynchGraphPartitioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(synchGraphPartitionerEClass, theEcorePackage.getEInt(), "getIdentifiableRank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonPackage.getIdentifiable(), "identifiable", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphsynchronizerPackageImpl
