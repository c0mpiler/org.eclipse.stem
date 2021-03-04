package org.eclipse.stem.core.solver.impl;

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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.common.impl.CommonPackageImpl;
import org.eclipse.stem.core.experiment.ExperimentPackage;
import org.eclipse.stem.core.experiment.impl.ExperimentPackageImpl;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.graph.impl.GraphPackageImpl;
import org.eclipse.stem.core.logger.LoggerPackage;
import org.eclipse.stem.core.logger.impl.LoggerPackageImpl;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.model.impl.ModelPackageImpl;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.modifier.impl.ModifierPackageImpl;
import org.eclipse.stem.core.predicate.PredicatePackage;
import org.eclipse.stem.core.predicate.impl.PredicatePackageImpl;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.scenario.impl.ScenarioPackageImpl;
import org.eclipse.stem.core.sequencer.SequencerPackage;
import org.eclipse.stem.core.sequencer.impl.SequencerPackageImpl;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.core.solver.SolverException;
import org.eclipse.stem.core.solver.SolverFactory;
import org.eclipse.stem.core.solver.SolverPackage;
import org.eclipse.stem.core.trigger.TriggerPackage;
import org.eclipse.stem.core.trigger.impl.TriggerPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverPackageImpl extends EPackageImpl implements SolverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType solverExceptionEDataType = null;

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
	 * @see org.eclipse.stem.core.solver.SolverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverPackageImpl() {
		super(eNS_URI, SolverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverPackage init() {
		if (isInited) return (SolverPackage)EPackage.Registry.INSTANCE.getEPackage(SolverPackage.eNS_URI);

		// Obtain or create and register package
		SolverPackageImpl theSolverPackage = (SolverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolverPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		ExperimentPackageImpl theExperimentPackage = (ExperimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentPackage.eNS_URI) instanceof ExperimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentPackage.eNS_URI) : ExperimentPackage.eINSTANCE);
		GraphPackageImpl theGraphPackage = (GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) instanceof GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) : GraphPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ModifierPackageImpl theModifierPackage = (ModifierPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModifierPackage.eNS_URI) instanceof ModifierPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModifierPackage.eNS_URI) : ModifierPackage.eINSTANCE);
		PredicatePackageImpl thePredicatePackage = (PredicatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PredicatePackage.eNS_URI) instanceof PredicatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PredicatePackage.eNS_URI) : PredicatePackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		SequencerPackageImpl theSequencerPackage = (SequencerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencerPackage.eNS_URI) instanceof SequencerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencerPackage.eNS_URI) : SequencerPackage.eINSTANCE);
		TriggerPackageImpl theTriggerPackage = (TriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) instanceof TriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) : TriggerPackage.eINSTANCE);
		LoggerPackageImpl theLoggerPackage = (LoggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoggerPackage.eNS_URI) instanceof LoggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoggerPackage.eNS_URI) : LoggerPackage.eINSTANCE);

		// Create package meta-data objects
		theSolverPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExperimentPackage.createPackageContents();
		theGraphPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theModifierPackage.createPackageContents();
		thePredicatePackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theSequencerPackage.createPackageContents();
		theTriggerPackage.createPackageContents();
		theLoggerPackage.createPackageContents();

		// Initialize created meta-data
		theSolverPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExperimentPackage.initializePackageContents();
		theGraphPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theModifierPackage.initializePackageContents();
		thePredicatePackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theSequencerPackage.initializePackageContents();
		theTriggerPackage.initializePackageContents();
		theLoggerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverPackage.eNS_URI, theSolverPackage);
		return theSolverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolver() {
		return solverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolver_Partitioner() {
		return (EReference)solverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolver_CanonicalGraph() {
		return (EReference)solverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSolverException() {
		return solverExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverFactory getSolverFactory() {
		return (SolverFactory)getEFactoryInstance();
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
		solverEClass = createEClass(SOLVER);
		createEReference(solverEClass, SOLVER__PARTITIONER);
		createEReference(solverEClass, SOLVER__CANONICAL_GRAPH);

		// Create data types
		solverExceptionEDataType = createEDataType(SOLVER_EXCEPTION);
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
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		solverEClass.getESuperTypes().add(theCommonPackage.getIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(solverEClass, Solver.class, "Solver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSolver_Partitioner(), theGraphPackage.getGraphPartitioner(), null, "partitioner", null, 0, 1, Solver.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSolver_CanonicalGraph(), theGraphPackage.getGraph(), null, "canonicalGraph", null, 0, 1, Solver.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(solverEClass, theEcorePackage.getEBoolean(), "step", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theModelPackage.getSTEMTime(), "time", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getELong(), "timeDelta", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEInt(), "cycle", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getSolverException());

		addEOperation(solverEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		// Initialize data types
		initEDataType(solverExceptionEDataType, SolverException.class, "SolverException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //SolverPackageImpl
