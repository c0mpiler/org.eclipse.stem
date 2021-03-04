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
package org.eclipse.stem.loggers.csv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.loggers.SimulationLoggerPackage;

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
 * @see org.eclipse.stem.loggers.csv.CSVFactory
 * @model kind="package"
 * @generated
 */
public interface CSVPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csv"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/stem/loggers/csv"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.loggers.csv.model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSVPackage eINSTANCE = org.eclipse.stem.loggers.csv.impl.CSVPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl <em>Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl
	 * @see org.eclipse.stem.loggers.csv.impl.CSVPackageImpl#getCSVLogger()
	 * @generated
	 */
	int CSV_LOGGER = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__URI = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__TYPE_URI = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__DUBLIN_CORE = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__ENABLED = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__STEP_MOD = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Start Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__START_STEP = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__START_STEP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__PROPERTIES = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__DATA_PATH = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__DELIMETER = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Log Run Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__LOG_RUN_PARAMETERS = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__BUFFER_SIZE = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Log Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__LOG_INITIAL_STATE = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Log Html Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER__LOG_HTML_SUMMARY = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOGGER_FEATURE_COUNT = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.csv.CSVLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logger</em>'.
	 * @see org.eclipse.stem.loggers.csv.CSVLogger
	 * @generated
	 */
	EClass getCSVLogger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.csv.CSVLogger#isUseDefaultLogDirectory <em>Use Default Log Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Default Log Directory</em>'.
	 * @see org.eclipse.stem.loggers.csv.CSVLogger#isUseDefaultLogDirectory()
	 * @see #getCSVLogger()
	 * @generated
	 */
	EAttribute getCSVLogger_UseDefaultLogDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.csv.CSVLogger#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see org.eclipse.stem.loggers.csv.CSVLogger#getDataPath()
	 * @see #getCSVLogger()
	 * @generated
	 */
	EAttribute getCSVLogger_DataPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.csv.CSVLogger#getDelimeter <em>Delimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimeter</em>'.
	 * @see org.eclipse.stem.loggers.csv.CSVLogger#getDelimeter()
	 * @see #getCSVLogger()
	 * @generated
	 */
	EAttribute getCSVLogger_Delimeter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.csv.CSVLogger#isLogRunParameters <em>Log Run Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Run Parameters</em>'.
	 * @see org.eclipse.stem.loggers.csv.CSVLogger#isLogRunParameters()
	 * @see #getCSVLogger()
	 * @generated
	 */
	EAttribute getCSVLogger_LogRunParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.csv.CSVLogger#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.eclipse.stem.loggers.csv.CSVLogger#getBufferSize()
	 * @see #getCSVLogger()
	 * @generated
	 */
	EAttribute getCSVLogger_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.csv.CSVLogger#isLogInitialState <em>Log Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Initial State</em>'.
	 * @see org.eclipse.stem.loggers.csv.CSVLogger#isLogInitialState()
	 * @see #getCSVLogger()
	 * @generated
	 */
	EAttribute getCSVLogger_LogInitialState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.csv.CSVLogger#isLogHtmlSummary <em>Log Html Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Html Summary</em>'.
	 * @see org.eclipse.stem.loggers.csv.CSVLogger#isLogHtmlSummary()
	 * @see #getCSVLogger()
	 * @generated
	 */
	EAttribute getCSVLogger_LogHtmlSummary();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CSVFactory getCSVFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl <em>Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl
		 * @see org.eclipse.stem.loggers.csv.impl.CSVPackageImpl#getCSVLogger()
		 * @generated
		 */
		EClass CSV_LOGGER = eINSTANCE.getCSVLogger();

		/**
		 * The meta object literal for the '<em><b>Use Default Log Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY = eINSTANCE.getCSVLogger_UseDefaultLogDirectory();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOGGER__DATA_PATH = eINSTANCE.getCSVLogger_DataPath();

		/**
		 * The meta object literal for the '<em><b>Delimeter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOGGER__DELIMETER = eINSTANCE.getCSVLogger_Delimeter();

		/**
		 * The meta object literal for the '<em><b>Log Run Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOGGER__LOG_RUN_PARAMETERS = eINSTANCE.getCSVLogger_LogRunParameters();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOGGER__BUFFER_SIZE = eINSTANCE.getCSVLogger_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Log Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOGGER__LOG_INITIAL_STATE = eINSTANCE.getCSVLogger_LogInitialState();

		/**
		 * The meta object literal for the '<em><b>Log Html Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOGGER__LOG_HTML_SUMMARY = eINSTANCE.getCSVLogger_LogHtmlSummary();

	}

} //CSVPackage
