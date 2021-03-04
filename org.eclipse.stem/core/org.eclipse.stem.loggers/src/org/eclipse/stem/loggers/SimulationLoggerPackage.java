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

package org.eclipse.stem.loggers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.core.logger.LoggerPackage;

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
 * @see org.eclipse.stem.loggers.SimulationLoggerFactory
 * @model kind="package"
 * @generated
 */
public interface SimulationLoggerPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011 IBM Corporation and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    IBM Corporation - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "loggers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/stem/loggers/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.loggers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulationLoggerPackage eINSTANCE = org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.impl.SimulationLoggerImpl <em>Simulation Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerImpl
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSimulationLogger()
	 * @generated
	 */
	int SIMULATION_LOGGER = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_LOGGER__URI = LoggerPackage.LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_LOGGER__TYPE_URI = LoggerPackage.LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_LOGGER__DUBLIN_CORE = LoggerPackage.LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_LOGGER__ENABLED = LoggerPackage.LOGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_LOGGER__STEP_MOD = LoggerPackage.LOGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_LOGGER__START_STEP = LoggerPackage.LOGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simulation Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_LOGGER_FEATURE_COUNT = LoggerPackage.LOGGER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.SynchronousLogger <em>Synchronous Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.SynchronousLogger
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSynchronousLogger()
	 * @generated
	 */
	int SYNCHRONOUS_LOGGER = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_LOGGER__URI = SIMULATION_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_LOGGER__TYPE_URI = SIMULATION_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_LOGGER__DUBLIN_CORE = SIMULATION_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_LOGGER__ENABLED = SIMULATION_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_LOGGER__STEP_MOD = SIMULATION_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Start Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_LOGGER__START_STEP = SIMULATION_LOGGER__START_STEP;

	/**
	 * The number of structural features of the '<em>Synchronous Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_LOGGER_FEATURE_COUNT = SIMULATION_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.jobs.simulation.ISimulationListener <em>ISimulation Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.jobs.simulation.ISimulationListener
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getISimulationListener()
	 * @generated
	 */
	int ISIMULATION_LISTENER = 2;

	/**
	 * The number of structural features of the '<em>ISimulation Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIMULATION_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.AsynchronousLogger <em>Asynchronous Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.AsynchronousLogger
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getAsynchronousLogger()
	 * @generated
	 */
	int ASYNCHRONOUS_LOGGER = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_LOGGER__URI = SIMULATION_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_LOGGER__TYPE_URI = SIMULATION_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_LOGGER__DUBLIN_CORE = SIMULATION_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_LOGGER__ENABLED = SIMULATION_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_LOGGER__STEP_MOD = SIMULATION_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Start Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_LOGGER__START_STEP = SIMULATION_LOGGER__START_STEP;

	/**
	 * The number of structural features of the '<em>Asynchronous Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_LOGGER_FEATURE_COUNT = SIMULATION_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.impl.SimulationLoggerEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerEventImpl
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSimulationLoggerEvent()
	 * @generated
	 */
	int SIMULATION_LOGGER_EVENT = 4;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_LOGGER_EVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.impl.SynchronousDecoratorPropertyLoggerImpl <em>Synchronous Decorator Property Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.impl.SynchronousDecoratorPropertyLoggerImpl
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSynchronousDecoratorPropertyLogger()
	 * @generated
	 */
	int SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__URI = SYNCHRONOUS_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__TYPE_URI = SYNCHRONOUS_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__DUBLIN_CORE = SYNCHRONOUS_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__ENABLED = SYNCHRONOUS_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__STEP_MOD = SYNCHRONOUS_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Start Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__START_STEP = SYNCHRONOUS_LOGGER__START_STEP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES = SYNCHRONOUS_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Synchronous Decorator Property Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT = SYNCHRONOUS_LOGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.impl.IdentifierPropertyImpl <em>Identifier Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.impl.IdentifierPropertyImpl
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getIdentifierProperty()
	 * @generated
	 */
	int IDENTIFIER_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_PROPERTY__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_PROPERTY__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Identifier Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.LOGGER_EVENTS <em>LOGGER EVENTS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.LOGGER_EVENTS
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getLOGGER_EVENTS()
	 * @generated
	 */
	int LOGGER_EVENTS = 7;

	/**
	 * The meta object id for the '<em>Simulation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.jobs.simulation.ISimulation
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSimulation()
	 * @generated
	 */
	int SIMULATION = 8;


	/**
	 * The meta object id for the '<em>Simulation Event</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.jobs.simulation.SimulationEvent
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSimulationEvent()
	 * @generated
	 */
	int SIMULATION_EVENT = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.SimulationLogger <em>Simulation Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Logger</em>'.
	 * @see org.eclipse.stem.loggers.SimulationLogger
	 * @generated
	 */
	EClass getSimulationLogger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.SimulationLogger#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.stem.loggers.SimulationLogger#isEnabled()
	 * @see #getSimulationLogger()
	 * @generated
	 */
	EAttribute getSimulationLogger_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.SimulationLogger#getStepMod <em>Step Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Mod</em>'.
	 * @see org.eclipse.stem.loggers.SimulationLogger#getStepMod()
	 * @see #getSimulationLogger()
	 * @generated
	 */
	EAttribute getSimulationLogger_StepMod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.SimulationLogger#getStartStep <em>Start Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Step</em>'.
	 * @see org.eclipse.stem.loggers.SimulationLogger#getStartStep()
	 * @see #getSimulationLogger()
	 * @generated
	 */
	EAttribute getSimulationLogger_StartStep();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.SynchronousLogger <em>Synchronous Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Logger</em>'.
	 * @see org.eclipse.stem.loggers.SynchronousLogger
	 * @generated
	 */
	EClass getSynchronousLogger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.jobs.simulation.ISimulationListener <em>ISimulation Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISimulation Listener</em>'.
	 * @see org.eclipse.stem.jobs.simulation.ISimulationListener
	 * @model instanceClass="org.eclipse.stem.jobs.simulation.ISimulationListener"
	 * @generated
	 */
	EClass getISimulationListener();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.AsynchronousLogger <em>Asynchronous Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynchronous Logger</em>'.
	 * @see org.eclipse.stem.loggers.AsynchronousLogger
	 * @generated
	 */
	EClass getAsynchronousLogger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.SimulationLoggerEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.eclipse.stem.loggers.SimulationLoggerEvent
	 * @generated
	 */
	EClass getSimulationLoggerEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger <em>Synchronous Decorator Property Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Decorator Property Logger</em>'.
	 * @see org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger
	 * @generated
	 */
	EClass getSynchronousDecoratorPropertyLogger();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties</em>'.
	 * @see org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger#getProperties()
	 * @see #getSynchronousDecoratorPropertyLogger()
	 * @generated
	 */
	EAttribute getSynchronousDecoratorPropertyLogger_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.IdentifierProperty <em>Identifier Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Property</em>'.
	 * @see org.eclipse.stem.loggers.IdentifierProperty
	 * @generated
	 */
	EClass getIdentifierProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.IdentifierProperty#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.stem.loggers.IdentifierProperty#getIdentifier()
	 * @see #getIdentifierProperty()
	 * @generated
	 */
	EAttribute getIdentifierProperty_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.IdentifierProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.eclipse.stem.loggers.IdentifierProperty#getProperty()
	 * @see #getIdentifierProperty()
	 * @generated
	 */
	EAttribute getIdentifierProperty_Property();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.stem.loggers.LOGGER_EVENTS <em>LOGGER EVENTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LOGGER EVENTS</em>'.
	 * @see org.eclipse.stem.loggers.LOGGER_EVENTS
	 * @generated
	 */
	EEnum getLOGGER_EVENTS();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.stem.jobs.simulation.ISimulation <em>Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simulation</em>'.
	 * @see org.eclipse.stem.jobs.simulation.ISimulation
	 * @model instanceClass="org.eclipse.stem.jobs.simulation.ISimulation" serializeable="false"
	 * @generated
	 */
	EDataType getSimulation();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.stem.jobs.simulation.SimulationEvent <em>Simulation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simulation Event</em>'.
	 * @see org.eclipse.stem.jobs.simulation.SimulationEvent
	 * @model instanceClass="org.eclipse.stem.jobs.simulation.SimulationEvent"
	 * @generated
	 */
	EDataType getSimulationEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimulationLoggerFactory getSimulationLoggerFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.impl.SimulationLoggerImpl <em>Simulation Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerImpl
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSimulationLogger()
		 * @generated
		 */
		EClass SIMULATION_LOGGER = eINSTANCE.getSimulationLogger();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_LOGGER__ENABLED = eINSTANCE.getSimulationLogger_Enabled();

		/**
		 * The meta object literal for the '<em><b>Step Mod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_LOGGER__STEP_MOD = eINSTANCE.getSimulationLogger_StepMod();

		/**
		 * The meta object literal for the '<em><b>Start Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_LOGGER__START_STEP = eINSTANCE.getSimulationLogger_StartStep();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.SynchronousLogger <em>Synchronous Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.SynchronousLogger
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSynchronousLogger()
		 * @generated
		 */
		EClass SYNCHRONOUS_LOGGER = eINSTANCE.getSynchronousLogger();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.jobs.simulation.ISimulationListener <em>ISimulation Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.jobs.simulation.ISimulationListener
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getISimulationListener()
		 * @generated
		 */
		EClass ISIMULATION_LISTENER = eINSTANCE.getISimulationListener();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.AsynchronousLogger <em>Asynchronous Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.AsynchronousLogger
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getAsynchronousLogger()
		 * @generated
		 */
		EClass ASYNCHRONOUS_LOGGER = eINSTANCE.getAsynchronousLogger();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.impl.SimulationLoggerEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerEventImpl
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSimulationLoggerEvent()
		 * @generated
		 */
		EClass SIMULATION_LOGGER_EVENT = eINSTANCE.getSimulationLoggerEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.impl.SynchronousDecoratorPropertyLoggerImpl <em>Synchronous Decorator Property Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.impl.SynchronousDecoratorPropertyLoggerImpl
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSynchronousDecoratorPropertyLogger()
		 * @generated
		 */
		EClass SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER = eINSTANCE.getSynchronousDecoratorPropertyLogger();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES = eINSTANCE.getSynchronousDecoratorPropertyLogger_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.impl.IdentifierPropertyImpl <em>Identifier Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.impl.IdentifierPropertyImpl
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getIdentifierProperty()
		 * @generated
		 */
		EClass IDENTIFIER_PROPERTY = eINSTANCE.getIdentifierProperty();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER_PROPERTY__IDENTIFIER = eINSTANCE.getIdentifierProperty_Identifier();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER_PROPERTY__PROPERTY = eINSTANCE.getIdentifierProperty_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.LOGGER_EVENTS <em>LOGGER EVENTS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.LOGGER_EVENTS
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getLOGGER_EVENTS()
		 * @generated
		 */
		EEnum LOGGER_EVENTS = eINSTANCE.getLOGGER_EVENTS();

		/**
		 * The meta object literal for the '<em>Simulation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.jobs.simulation.ISimulation
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSimulation()
		 * @generated
		 */
		EDataType SIMULATION = eINSTANCE.getSimulation();

		/**
		 * The meta object literal for the '<em>Simulation Event</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.jobs.simulation.SimulationEvent
		 * @see org.eclipse.stem.loggers.impl.SimulationLoggerPackageImpl#getSimulationEvent()
		 * @generated
		 */
		EDataType SIMULATION_EVENT = eINSTANCE.getSimulationEvent();

	}

} //SimulationLoggerPackage
