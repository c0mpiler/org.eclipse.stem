// ExternalDataSourcePackageImpl
package org.eclipse.stem.diseasemodels.externaldatasource.impl;

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
import org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel;
import org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceFactory;
import org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourcePackage;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalDataSourcePackageImpl extends EPackageImpl implements ExternalDataSourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDataSourceDiseaseModelEClass = null;

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
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternalDataSourcePackageImpl() {
		super(eNS_URI, ExternalDataSourceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExternalDataSourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExternalDataSourcePackage init() {
		if (isInited) return (ExternalDataSourcePackage)EPackage.Registry.INSTANCE.getEPackage(ExternalDataSourcePackage.eNS_URI);

		// Obtain or create and register package
		ExternalDataSourcePackageImpl theExternalDataSourcePackage = (ExternalDataSourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExternalDataSourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExternalDataSourcePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExternalDataSourcePackage.createPackageContents();

		// Initialize created meta-data
		theExternalDataSourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternalDataSourcePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExternalDataSourcePackage.eNS_URI, theExternalDataSourcePackage);
		return theExternalDataSourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDataSourceDiseaseModel() {
		return externalDataSourceDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourceDiseaseModel_DataPath() {
		return (EAttribute)externalDataSourceDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourceDiseaseModel_DiseaseType() {
		return (EAttribute)externalDataSourceDiseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourceDiseaseModel_BufferSize() {
		return (EAttribute)externalDataSourceDiseaseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourceDiseaseModel_Restart() {
		return (EAttribute)externalDataSourceDiseaseModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDataSourceFactory getExternalDataSourceFactory() {
		return (ExternalDataSourceFactory)getEFactoryInstance();
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
		externalDataSourceDiseaseModelEClass = createEClass(EXTERNAL_DATA_SOURCE_DISEASE_MODEL);
		createEAttribute(externalDataSourceDiseaseModelEClass, EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH);
		createEAttribute(externalDataSourceDiseaseModelEClass, EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DISEASE_TYPE);
		createEAttribute(externalDataSourceDiseaseModelEClass, EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE);
		createEAttribute(externalDataSourceDiseaseModelEClass, EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART);
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
		externalDataSourceDiseaseModelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModel());

		// Initialize classes and features; add operations and parameters
		initEClass(externalDataSourceDiseaseModelEClass, ExternalDataSourceDiseaseModel.class, "ExternalDataSourceDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExternalDataSourceDiseaseModel_DataPath(), ecorePackage.getEString(), "dataPath", null, 0, 1, ExternalDataSourceDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExternalDataSourceDiseaseModel_DiseaseType(), ecorePackage.getEString(), "diseaseType", null, 0, 1, ExternalDataSourceDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExternalDataSourceDiseaseModel_BufferSize(), theEcorePackage.getEInt(), "bufferSize", "250", 0, 1, ExternalDataSourceDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getExternalDataSourceDiseaseModel_Restart(), theEcorePackage.getEBoolean(), "restart", "false", 0, 1, ExternalDataSourceDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Create resource
		createResource(eNS_URI);
	}

} //ExternalDataSourcePackageImpl
