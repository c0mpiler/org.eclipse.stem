package org.eclipse.stem.interventions.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.interventions.ControlGraphGenerator;
import org.eclipse.stem.interventions.InterventionLabel;
import org.eclipse.stem.interventions.InterventionLabelValue;
import org.eclipse.stem.interventions.InterventionsFactory;
import org.eclipse.stem.interventions.InterventionsPackage;
import org.eclipse.stem.interventions.PeriodicControlGraphGenerator;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;
import org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterventionsPackageImpl extends EPackageImpl implements InterventionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interventionLabelEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardInterventionLabelEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlGraphGeneratorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interventionLabelValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardInterventionLabelValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardPeriodicInterventionLabelValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicControlGraphGeneratorEClass = null;
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
	 * @see org.eclipse.stem.interventions.InterventionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterventionsPackageImpl() {
		super(eNS_URI, InterventionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterventionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterventionsPackage init() {
		if (isInited) return (InterventionsPackage)EPackage.Registry.INSTANCE.getEPackage(InterventionsPackage.eNS_URI);

		// Obtain or create and register package
		InterventionsPackageImpl theInterventionsPackage = (InterventionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterventionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterventionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GraphgeneratorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInterventionsPackage.createPackageContents();

		// Initialize created meta-data
		theInterventionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterventionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterventionsPackage.eNS_URI, theInterventionsPackage);
		return theInterventionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterventionLabel() {
		return interventionLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardInterventionLabel() {
		return standardInterventionLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardInterventionLabel_PopulationIdentifier() {
		return (EAttribute)standardInterventionLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlGraphGenerator() {
		return controlGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlGraphGenerator_VaccinationFraction() {
		return (EAttribute)controlGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlGraphGenerator_IsolationFraction() {
		return (EAttribute)controlGraphGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlGraphGenerator_PopulationIdentifier() {
		return (EAttribute)controlGraphGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlGraphGenerator_Location() {
		return (EAttribute)controlGraphGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterventionLabelValue() {
		return interventionLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardInterventionLabelValue() {
		return standardInterventionLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardInterventionLabelValue_Vaccinations() {
		return (EAttribute)standardInterventionLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardInterventionLabelValue_Isolations() {
		return (EAttribute)standardInterventionLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardPeriodicInterventionLabelValue() {
		return standardPeriodicInterventionLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPeriodicInterventionLabelValue_Absolute() {
		return (EAttribute)standardPeriodicInterventionLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPeriodicInterventionLabelValue_Period() {
		return (EAttribute)standardPeriodicInterventionLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPeriodicInterventionLabelValue_Vaccinations() {
		return (EAttribute)standardPeriodicInterventionLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPeriodicInterventionLabelValue_Isolations() {
		return (EAttribute)standardPeriodicInterventionLabelValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicControlGraphGenerator() {
		return periodicControlGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicControlGraphGenerator_PopulationIdentifier() {
		return (EAttribute)periodicControlGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicControlGraphGenerator_DataPath() {
		return (EAttribute)periodicControlGraphGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicControlGraphGenerator_Period() {
		return (EAttribute)periodicControlGraphGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicControlGraphGenerator_UseVaccinations() {
		return (EAttribute)periodicControlGraphGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicControlGraphGenerator_Fraction() {
		return (EAttribute)periodicControlGraphGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsFactory getInterventionsFactory() {
		return (InterventionsFactory)getEFactoryInstance();
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
		interventionLabelEClass = createEClass(INTERVENTION_LABEL);

		standardInterventionLabelEClass = createEClass(STANDARD_INTERVENTION_LABEL);
		createEAttribute(standardInterventionLabelEClass, STANDARD_INTERVENTION_LABEL__POPULATION_IDENTIFIER);

		controlGraphGeneratorEClass = createEClass(CONTROL_GRAPH_GENERATOR);
		createEAttribute(controlGraphGeneratorEClass, CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION);
		createEAttribute(controlGraphGeneratorEClass, CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION);
		createEAttribute(controlGraphGeneratorEClass, CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER);
		createEAttribute(controlGraphGeneratorEClass, CONTROL_GRAPH_GENERATOR__LOCATION);

		interventionLabelValueEClass = createEClass(INTERVENTION_LABEL_VALUE);

		standardInterventionLabelValueEClass = createEClass(STANDARD_INTERVENTION_LABEL_VALUE);
		createEAttribute(standardInterventionLabelValueEClass, STANDARD_INTERVENTION_LABEL_VALUE__VACCINATIONS);
		createEAttribute(standardInterventionLabelValueEClass, STANDARD_INTERVENTION_LABEL_VALUE__ISOLATIONS);

		standardPeriodicInterventionLabelValueEClass = createEClass(STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE);
		createEAttribute(standardPeriodicInterventionLabelValueEClass, STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE);
		createEAttribute(standardPeriodicInterventionLabelValueEClass, STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD);
		createEAttribute(standardPeriodicInterventionLabelValueEClass, STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS);
		createEAttribute(standardPeriodicInterventionLabelValueEClass, STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS);

		periodicControlGraphGeneratorEClass = createEClass(PERIODIC_CONTROL_GRAPH_GENERATOR);
		createEAttribute(periodicControlGraphGeneratorEClass, PERIODIC_CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER);
		createEAttribute(periodicControlGraphGeneratorEClass, PERIODIC_CONTROL_GRAPH_GENERATOR__DATA_PATH);
		createEAttribute(periodicControlGraphGeneratorEClass, PERIODIC_CONTROL_GRAPH_GENERATOR__PERIOD);
		createEAttribute(periodicControlGraphGeneratorEClass, PERIODIC_CONTROL_GRAPH_GENERATOR__USE_VACCINATIONS);
		createEAttribute(periodicControlGraphGeneratorEClass, PERIODIC_CONTROL_GRAPH_GENERATOR__FRACTION);
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
		GraphgeneratorsPackage theGraphgeneratorsPackage = (GraphgeneratorsPackage)EPackage.Registry.INSTANCE.getEPackage(GraphgeneratorsPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interventionLabelEClass.getESuperTypes().add(theGraphPackage.getStaticNodeLabel());
		standardInterventionLabelEClass.getESuperTypes().add(this.getInterventionLabel());
		controlGraphGeneratorEClass.getESuperTypes().add(theGraphgeneratorsPackage.getGraphGenerator());
		interventionLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		standardInterventionLabelValueEClass.getESuperTypes().add(this.getInterventionLabelValue());
		standardPeriodicInterventionLabelValueEClass.getESuperTypes().add(this.getInterventionLabelValue());
		periodicControlGraphGeneratorEClass.getESuperTypes().add(theGraphgeneratorsPackage.getGraphGenerator());

		// Initialize classes and features; add operations and parameters
		initEClass(interventionLabelEClass, InterventionLabel.class, "InterventionLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardInterventionLabelEClass, StandardInterventionLabel.class, "StandardInterventionLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardInterventionLabel_PopulationIdentifier(), theEcorePackage.getEString(), "populationIdentifier", "human", 0, 1, StandardInterventionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlGraphGeneratorEClass, ControlGraphGenerator.class, "ControlGraphGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlGraphGenerator_VaccinationFraction(), theEcorePackage.getEDouble(), "vaccinationFraction", "0.0", 0, 1, ControlGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlGraphGenerator_IsolationFraction(), theEcorePackage.getEDouble(), "isolationFraction", "0.0", 0, 1, ControlGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlGraphGenerator_PopulationIdentifier(), theEcorePackage.getEString(), "populationIdentifier", "human", 0, 1, ControlGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlGraphGenerator_Location(), theCommonPackage.getURI(), "location", null, 0, 1, ControlGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interventionLabelValueEClass, InterventionLabelValue.class, "InterventionLabelValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardInterventionLabelValueEClass, StandardInterventionLabelValue.class, "StandardInterventionLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardInterventionLabelValue_Vaccinations(), theEcorePackage.getEDouble(), "vaccinations", null, 0, 1, StandardInterventionLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardInterventionLabelValue_Isolations(), theEcorePackage.getEDouble(), "isolations", null, 0, 1, StandardInterventionLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardPeriodicInterventionLabelValueEClass, StandardPeriodicInterventionLabelValue.class, "StandardPeriodicInterventionLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardPeriodicInterventionLabelValue_Absolute(), theEcorePackage.getEBoolean(), "absolute", "true", 0, 1, StandardPeriodicInterventionLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPeriodicInterventionLabelValue_Period(), ecorePackage.getELong(), "period", "86400000", 0, 1, StandardPeriodicInterventionLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPeriodicInterventionLabelValue_Vaccinations(), theEcorePackage.getEDouble(), "vaccinations", null, 0, -1, StandardPeriodicInterventionLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPeriodicInterventionLabelValue_Isolations(), theEcorePackage.getEDouble(), "isolations", null, 0, -1, StandardPeriodicInterventionLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicControlGraphGeneratorEClass, PeriodicControlGraphGenerator.class, "PeriodicControlGraphGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicControlGraphGenerator_PopulationIdentifier(), theEcorePackage.getEString(), "populationIdentifier", "human", 0, 1, PeriodicControlGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicControlGraphGenerator_DataPath(), theEcorePackage.getEString(), "dataPath", null, 0, 1, PeriodicControlGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicControlGraphGenerator_Period(), theEcorePackage.getELong(), "period", "86400000", 0, 1, PeriodicControlGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicControlGraphGenerator_UseVaccinations(), theEcorePackage.getEBoolean(), "useVaccinations", "true", 0, 1, PeriodicControlGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicControlGraphGenerator_Fraction(), theEcorePackage.getEBoolean(), "fraction", "true", 0, 1, PeriodicControlGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InterventionsPackageImpl
