package org.eclipse.stem.definitions.edges.impl;

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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.logger.LoggerPackage;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.sequencer.SequencerPackage;
import org.eclipse.stem.core.solver.SolverPackage;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabel;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabelValue;
import org.eclipse.stem.definitions.edges.MixingEdge;
import org.eclipse.stem.definitions.edges.MixingEdgeLabel;
import org.eclipse.stem.definitions.edges.MixingEdgeLabelValue;
import org.eclipse.stem.definitions.edges.PopulationEdge;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl;
import org.eclipse.stem.definitions.nodes.NodesPackage;
import org.eclipse.stem.definitions.nodes.impl.NodesPackageImpl;
import org.eclipse.stem.definitions.types.TypesPackage;
import org.eclipse.stem.definitions.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgesPackageImpl extends EPackageImpl implements EdgesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationEdgeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationEdgeLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixingEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixingEdgeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixingEdgeLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationEdgeEClass = null;

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
	 * @see org.eclipse.stem.definitions.edges.EdgesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdgesPackageImpl() {
		super(eNS_URI, EdgesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EdgesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EdgesPackage init() {
		if (isInited) return (EdgesPackage)EPackage.Registry.INSTANCE.getEPackage(EdgesPackage.eNS_URI);

		// Obtain or create and register package
		EdgesPackageImpl theEdgesPackage = (EdgesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EdgesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EdgesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GraphPackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LabelsPackageImpl theLabelsPackage = (LabelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LabelsPackage.eNS_URI) instanceof LabelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LabelsPackage.eNS_URI) : LabelsPackage.eINSTANCE);
		NodesPackageImpl theNodesPackage = (NodesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodesPackage.eNS_URI) instanceof NodesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodesPackage.eNS_URI) : NodesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theEdgesPackage.createPackageContents();
		theLabelsPackage.createPackageContents();
		theNodesPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theEdgesPackage.initializePackageContents();
		theLabelsPackage.initializePackageContents();
		theNodesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdgesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdgesPackage.eNS_URI, theEdgesPackage);
		return theEdgesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMigrationEdge() {
		return migrationEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationEdge_UseAbsoluteValues() {
		return (EAttribute)migrationEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMigrationEdgeLabel() {
		return migrationEdgeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMigrationEdgeLabelValue() {
		return migrationEdgeLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationEdgeLabelValue_MigrationRate() {
		return (EAttribute)migrationEdgeLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationEdgeLabelValue_TimePeriod() {
		return (EAttribute)migrationEdgeLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMixingEdge() {
		return mixingEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMixingEdge_UseAbsoluteValues() {
		return (EAttribute)mixingEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMixingEdgeLabel() {
		return mixingEdgeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMixingEdgeLabelValue() {
		return mixingEdgeLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMixingEdgeLabelValue_MixingRate() {
		return (EAttribute)mixingEdgeLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPopulationEdge() {
		return populationEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopulationEdge_PopulationIdentifier() {
		return (EAttribute)populationEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdgesFactory getEdgesFactory() {
		return (EdgesFactory)getEFactoryInstance();
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
		migrationEdgeEClass = createEClass(MIGRATION_EDGE);
		createEAttribute(migrationEdgeEClass, MIGRATION_EDGE__USE_ABSOLUTE_VALUES);

		migrationEdgeLabelEClass = createEClass(MIGRATION_EDGE_LABEL);

		migrationEdgeLabelValueEClass = createEClass(MIGRATION_EDGE_LABEL_VALUE);
		createEAttribute(migrationEdgeLabelValueEClass, MIGRATION_EDGE_LABEL_VALUE__MIGRATION_RATE);
		createEAttribute(migrationEdgeLabelValueEClass, MIGRATION_EDGE_LABEL_VALUE__TIME_PERIOD);

		mixingEdgeEClass = createEClass(MIXING_EDGE);
		createEAttribute(mixingEdgeEClass, MIXING_EDGE__USE_ABSOLUTE_VALUES);

		mixingEdgeLabelEClass = createEClass(MIXING_EDGE_LABEL);

		mixingEdgeLabelValueEClass = createEClass(MIXING_EDGE_LABEL_VALUE);
		createEAttribute(mixingEdgeLabelValueEClass, MIXING_EDGE_LABEL_VALUE__MIXING_RATE);

		populationEdgeEClass = createEClass(POPULATION_EDGE);
		createEAttribute(populationEdgeEClass, POPULATION_EDGE__POPULATION_IDENTIFIER);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		ModifierPackage theModifierPackage = (ModifierPackage)EPackage.Registry.INSTANCE.getEPackage(ModifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		migrationEdgeEClass.getESuperTypes().add(this.getPopulationEdge());
		migrationEdgeLabelEClass.getESuperTypes().add(theGraphPackage.getEdgeLabel());
		migrationEdgeLabelEClass.getESuperTypes().add(theModifierPackage.getModifiable());
		migrationEdgeLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		mixingEdgeEClass.getESuperTypes().add(this.getPopulationEdge());
		mixingEdgeLabelEClass.getESuperTypes().add(theGraphPackage.getEdgeLabel());
		mixingEdgeLabelEClass.getESuperTypes().add(theModifierPackage.getModifiable());
		mixingEdgeLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		populationEdgeEClass.getESuperTypes().add(theGraphPackage.getEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(migrationEdgeEClass, MigrationEdge.class, "MigrationEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMigrationEdge_UseAbsoluteValues(), theEcorePackage.getEBoolean(), "useAbsoluteValues", "0", 0, 1, MigrationEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(migrationEdgeLabelEClass, MigrationEdgeLabel.class, "MigrationEdgeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(migrationEdgeLabelValueEClass, MigrationEdgeLabelValue.class, "MigrationEdgeLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMigrationEdgeLabelValue_MigrationRate(), ecorePackage.getEDouble(), "migrationRate", "0.0", 0, 1, MigrationEdgeLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getMigrationEdgeLabelValue_TimePeriod(), theEcorePackage.getELong(), "timePeriod", "86400000", 0, 1, MigrationEdgeLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(mixingEdgeEClass, MixingEdge.class, "MixingEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMixingEdge_UseAbsoluteValues(), theEcorePackage.getEBoolean(), "useAbsoluteValues", "0", 0, 1, MixingEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(mixingEdgeLabelEClass, MixingEdgeLabel.class, "MixingEdgeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(mixingEdgeLabelValueEClass, MixingEdgeLabelValue.class, "MixingEdgeLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMixingEdgeLabelValue_MixingRate(), ecorePackage.getEDouble(), "mixingRate", null, 0, 1, MixingEdgeLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(populationEdgeEClass, PopulationEdge.class, "PopulationEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPopulationEdge_PopulationIdentifier(), theEcorePackage.getEString(), "populationIdentifier", "human", 0, 1, PopulationEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Create resource
		createResource(eNS_URI);
	}

} //EdgesPackageImpl
