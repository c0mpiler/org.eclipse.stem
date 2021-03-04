package org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl;

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
import org.eclipse.stem.core.predicate.PredicatePackage;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesFactory;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest;
import org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl;
import org.eclipse.stem.populationmodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiseasepredicatesPackageImpl extends EPackageImpl implements DiseasepredicatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelValueTestEClass = null;

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
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiseasepredicatesPackageImpl() {
		super(eNS_URI, DiseasepredicatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DiseasepredicatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiseasepredicatesPackage init() {
		if (isInited) return (DiseasepredicatesPackage)EPackage.Registry.INSTANCE.getEPackage(DiseasepredicatesPackage.eNS_URI);

		// Obtain or create and register package
		DiseasepredicatesPackageImpl theDiseasepredicatesPackage = (DiseasepredicatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiseasepredicatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiseasepredicatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PredicatePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StandardPackageImpl theStandardPackage_1 = (StandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.eclipse.stem.diseasemodels.standard.StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.eclipse.stem.diseasemodels.standard.StandardPackage.eNS_URI) : org.eclipse.stem.diseasemodels.standard.StandardPackage.eINSTANCE);

		// Create package meta-data objects
		theDiseasepredicatesPackage.createPackageContents();
		theStandardPackage_1.createPackageContents();

		// Initialize created meta-data
		theDiseasepredicatesPackage.initializePackageContents();
		theStandardPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiseasepredicatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiseasepredicatesPackage.eNS_URI, theDiseasepredicatesPackage);
		return theDiseasepredicatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelValueTest() {
		return labelValueTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelValueTest_ModelName() {
		return (EAttribute)labelValueTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelValueTest_TargetURI() {
		return (EAttribute)labelValueTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelValueTest_State() {
		return (EAttribute)labelValueTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelValueTest_Threshold() {
		return (EAttribute)labelValueTestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelValueTest_Predicate() {
		return (EAttribute)labelValueTestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelValueTest_PopulationIdentifier() {
		return (EAttribute)labelValueTestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseasepredicatesFactory getDiseasepredicatesFactory() {
		return (DiseasepredicatesFactory)getEFactoryInstance();
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
		labelValueTestEClass = createEClass(LABEL_VALUE_TEST);
		createEAttribute(labelValueTestEClass, LABEL_VALUE_TEST__MODEL_NAME);
		createEAttribute(labelValueTestEClass, LABEL_VALUE_TEST__TARGET_URI);
		createEAttribute(labelValueTestEClass, LABEL_VALUE_TEST__STATE);
		createEAttribute(labelValueTestEClass, LABEL_VALUE_TEST__THRESHOLD);
		createEAttribute(labelValueTestEClass, LABEL_VALUE_TEST__PREDICATE);
		createEAttribute(labelValueTestEClass, LABEL_VALUE_TEST__POPULATION_IDENTIFIER);
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
		PredicatePackage thePredicatePackage = (PredicatePackage)EPackage.Registry.INSTANCE.getEPackage(PredicatePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		labelValueTestEClass.getESuperTypes().add(thePredicatePackage.getTest());

		// Initialize classes and features; add operations and parameters
		initEClass(labelValueTestEClass, LabelValueTest.class, "LabelValueTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLabelValueTest_ModelName(), theEcorePackage.getEString(), "modelName", null, 0, 1, LabelValueTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLabelValueTest_TargetURI(), theCommonPackage.getURI(), "targetURI", null, 0, 1, LabelValueTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLabelValueTest_State(), theEcorePackage.getEString(), "state", "incidence", 0, 1, LabelValueTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getLabelValueTest_Threshold(), theEcorePackage.getEDouble(), "threshold", "100", 0, 1, LabelValueTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getLabelValueTest_Predicate(), theEcorePackage.getEString(), "predicate", ">", 0, 1, LabelValueTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getLabelValueTest_PopulationIdentifier(), theEcorePackage.getEString(), "populationIdentifier", "human", 0, 1, LabelValueTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Create resource
		createResource(eNS_URI);
	}

} //DiseasepredicatesPackageImpl
