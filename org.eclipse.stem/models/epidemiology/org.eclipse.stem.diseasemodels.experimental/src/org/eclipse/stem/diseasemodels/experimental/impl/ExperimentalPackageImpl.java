package org.eclipse.stem.diseasemodels.experimental.impl;

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
import org.eclipse.stem.diseasemodels.experimental.ExperimentalFactory;
import org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage;
import org.eclipse.stem.diseasemodels.experimental.PercolationDiseaseModel;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentalPackageImpl extends EPackageImpl implements ExperimentalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percolationDiseaseModelEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbDiseaseModelLabelEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbDiseaseModelLabelValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbDiseaseModelEClass = null;
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
	 * @see org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExperimentalPackageImpl() {
		super(eNS_URI, ExperimentalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExperimentalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExperimentalPackage init() {
		if (isInited) return (ExperimentalPackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentalPackage.eNS_URI);

		// Obtain or create and register package
		ExperimentalPackageImpl theExperimentalPackage = (ExperimentalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExperimentalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExperimentalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExperimentalPackage.createPackageContents();

		// Initialize created meta-data
		theExperimentalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExperimentalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExperimentalPackage.eNS_URI, theExperimentalPackage);
		return theExperimentalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPercolationDiseaseModel() {
		return percolationDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBDiseaseModelLabel() {
		return tbDiseaseModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBDiseaseModelLabelValue() {
		return tbDiseaseModelLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTBDiseaseModelLabelValue_Il() {
		return (EAttribute)tbDiseaseModelLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTBDiseaseModelLabelValue_Ia() {
		return (EAttribute)tbDiseaseModelLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBDiseaseModel() {
		return tbDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTBDiseaseModel_TransmissionRate() {
		return (EAttribute)tbDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTBDiseaseModel_ActiveInfProb() {
		return (EAttribute)tbDiseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalFactory getExperimentalFactory() {
		return (ExperimentalFactory)getEFactoryInstance();
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
		percolationDiseaseModelEClass = createEClass(PERCOLATION_DISEASE_MODEL);

		tbDiseaseModelLabelEClass = createEClass(TB_DISEASE_MODEL_LABEL);

		tbDiseaseModelLabelValueEClass = createEClass(TB_DISEASE_MODEL_LABEL_VALUE);
		createEAttribute(tbDiseaseModelLabelValueEClass, TB_DISEASE_MODEL_LABEL_VALUE__IL);
		createEAttribute(tbDiseaseModelLabelValueEClass, TB_DISEASE_MODEL_LABEL_VALUE__IA);

		tbDiseaseModelEClass = createEClass(TB_DISEASE_MODEL);
		createEAttribute(tbDiseaseModelEClass, TB_DISEASE_MODEL__TRANSMISSION_RATE);
		createEAttribute(tbDiseaseModelEClass, TB_DISEASE_MODEL__ACTIVE_INF_PROB);
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
		StandardPackage theStandardPackage = (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		percolationDiseaseModelEClass.getESuperTypes().add(theStandardPackage.getSEIR());
		tbDiseaseModelLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		tbDiseaseModelLabelValueEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabelValue());
		tbDiseaseModelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModel());

		// Initialize classes and features; add operations and parameters
		initEClass(percolationDiseaseModelEClass, PercolationDiseaseModel.class, "PercolationDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tbDiseaseModelLabelEClass, TBDiseaseModelLabel.class, "TBDiseaseModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tbDiseaseModelLabelValueEClass, TBDiseaseModelLabelValue.class, "TBDiseaseModelLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTBDiseaseModelLabelValue_Il(), theEcorePackage.getEDouble(), "il", "0.0", 0, 1, TBDiseaseModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTBDiseaseModelLabelValue_Ia(), theEcorePackage.getEDouble(), "ia", "0.0", 0, 1, TBDiseaseModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tbDiseaseModelEClass, TBDiseaseModel.class, "TBDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTBDiseaseModel_TransmissionRate(), theEcorePackage.getEDouble(), "transmissionRate", "1.2", 0, 1, TBDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTBDiseaseModel_ActiveInfProb(), theEcorePackage.getEDouble(), "activeInfProb", "0.8", 0, 1, TBDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ExperimentalPackageImpl
