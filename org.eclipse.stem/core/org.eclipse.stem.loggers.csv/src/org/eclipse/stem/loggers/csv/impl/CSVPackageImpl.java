/******************************************************************************
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
package org.eclipse.stem.loggers.csv.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.loggers.SimulationLoggerPackage;
import org.eclipse.stem.loggers.csv.CSVFactory;
import org.eclipse.stem.loggers.csv.CSVLogger;
import org.eclipse.stem.loggers.csv.CSVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSVPackageImpl extends EPackageImpl implements CSVPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvLoggerEClass = null;

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
	 * @see org.eclipse.stem.loggers.csv.CSVPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CSVPackageImpl() {
		super(eNS_URI, CSVFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CSVPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CSVPackage init() {
		if (isInited) return (CSVPackage)EPackage.Registry.INSTANCE.getEPackage(CSVPackage.eNS_URI);

		// Obtain or create and register package
		CSVPackageImpl theCSVPackage = (CSVPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CSVPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CSVPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimulationLoggerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCSVPackage.createPackageContents();

		// Initialize created meta-data
		theCSVPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCSVPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CSVPackage.eNS_URI, theCSVPackage);
		return theCSVPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSVLogger() {
		return csvLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSVLogger_UseDefaultLogDirectory() {
		return (EAttribute)csvLoggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSVLogger_DataPath() {
		return (EAttribute)csvLoggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSVLogger_Delimeter() {
		return (EAttribute)csvLoggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSVLogger_LogRunParameters() {
		return (EAttribute)csvLoggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSVLogger_BufferSize() {
		return (EAttribute)csvLoggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSVLogger_LogInitialState() {
		return (EAttribute)csvLoggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSVLogger_LogHtmlSummary() {
		return (EAttribute)csvLoggerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSVFactory getCSVFactory() {
		return (CSVFactory)getEFactoryInstance();
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
		csvLoggerEClass = createEClass(CSV_LOGGER);
		createEAttribute(csvLoggerEClass, CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY);
		createEAttribute(csvLoggerEClass, CSV_LOGGER__DATA_PATH);
		createEAttribute(csvLoggerEClass, CSV_LOGGER__DELIMETER);
		createEAttribute(csvLoggerEClass, CSV_LOGGER__LOG_RUN_PARAMETERS);
		createEAttribute(csvLoggerEClass, CSV_LOGGER__BUFFER_SIZE);
		createEAttribute(csvLoggerEClass, CSV_LOGGER__LOG_INITIAL_STATE);
		createEAttribute(csvLoggerEClass, CSV_LOGGER__LOG_HTML_SUMMARY);
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
		SimulationLoggerPackage theSimulationLoggerPackage = (SimulationLoggerPackage)EPackage.Registry.INSTANCE.getEPackage(SimulationLoggerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		csvLoggerEClass.getESuperTypes().add(theSimulationLoggerPackage.getSynchronousDecoratorPropertyLogger());

		// Initialize classes and features; add operations and parameters
		initEClass(csvLoggerEClass, CSVLogger.class, "CSVLogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSVLogger_UseDefaultLogDirectory(), ecorePackage.getEBoolean(), "useDefaultLogDirectory", "true", 0, 1, CSVLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSVLogger_DataPath(), ecorePackage.getEString(), "dataPath", null, 0, 1, CSVLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSVLogger_Delimeter(), ecorePackage.getEString(), "delimeter", ",", 0, 1, CSVLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSVLogger_LogRunParameters(), ecorePackage.getEBoolean(), "logRunParameters", "true", 0, 1, CSVLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSVLogger_BufferSize(), ecorePackage.getEInt(), "bufferSize", "1024", 0, 1, CSVLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSVLogger_LogInitialState(), ecorePackage.getEBoolean(), "logInitialState", "false", 0, 1, CSVLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSVLogger_LogHtmlSummary(), ecorePackage.getEBoolean(), "logHtmlSummary", "true", 0, 1, CSVLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CSVPackageImpl
