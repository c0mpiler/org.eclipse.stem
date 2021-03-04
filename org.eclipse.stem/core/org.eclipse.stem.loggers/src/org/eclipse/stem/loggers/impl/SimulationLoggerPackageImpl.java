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
package org.eclipse.stem.loggers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
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
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationListener;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.loggers.AsynchronousLogger;
import org.eclipse.stem.loggers.IdentifierProperty;
import org.eclipse.stem.loggers.SimulationLogger;
import org.eclipse.stem.loggers.SimulationLoggerEvent;
import org.eclipse.stem.loggers.SimulationLoggerFactory;
import org.eclipse.stem.loggers.SimulationLoggerPackage;
import org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger;
import org.eclipse.stem.loggers.SynchronousLogger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationLoggerPackageImpl extends EPackageImpl implements SimulationLoggerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 IBM Corporation and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    IBM Corporation - initial API and implementation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSimulationListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynchronousLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationLoggerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousDecoratorPropertyLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loggeR_EVENTSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simulationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simulationEventEDataType = null;

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
	 * @see org.eclipse.stem.loggers.SimulationLoggerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimulationLoggerPackageImpl() {
		super(eNS_URI, SimulationLoggerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimulationLoggerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimulationLoggerPackage init() {
		if (isInited) return (SimulationLoggerPackage)EPackage.Registry.INSTANCE.getEPackage(SimulationLoggerPackage.eNS_URI);

		// Obtain or create and register package
		SimulationLoggerPackageImpl theSimulationLoggerPackage = (SimulationLoggerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimulationLoggerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimulationLoggerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimulationLoggerPackage.createPackageContents();

		// Initialize created meta-data
		theSimulationLoggerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimulationLoggerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimulationLoggerPackage.eNS_URI, theSimulationLoggerPackage);
		return theSimulationLoggerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationLogger() {
		return simulationLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationLogger_Enabled() {
		return (EAttribute)simulationLoggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationLogger_StepMod() {
		return (EAttribute)simulationLoggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationLogger_StartStep() {
		return (EAttribute)simulationLoggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousLogger() {
		return synchronousLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISimulationListener() {
		return iSimulationListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsynchronousLogger() {
		return asynchronousLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationLoggerEvent() {
		return simulationLoggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousDecoratorPropertyLogger() {
		return synchronousDecoratorPropertyLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousDecoratorPropertyLogger_Properties() {
		return (EAttribute)synchronousDecoratorPropertyLoggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierProperty() {
		return identifierPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierProperty_Identifier() {
		return (EAttribute)identifierPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierProperty_Property() {
		return (EAttribute)identifierPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLOGGER_EVENTS() {
		return loggeR_EVENTSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimulation() {
		return simulationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimulationEvent() {
		return simulationEventEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationLoggerFactory getSimulationLoggerFactory() {
		return (SimulationLoggerFactory)getEFactoryInstance();
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
		simulationLoggerEClass = createEClass(SIMULATION_LOGGER);
		createEAttribute(simulationLoggerEClass, SIMULATION_LOGGER__ENABLED);
		createEAttribute(simulationLoggerEClass, SIMULATION_LOGGER__STEP_MOD);
		createEAttribute(simulationLoggerEClass, SIMULATION_LOGGER__START_STEP);

		synchronousLoggerEClass = createEClass(SYNCHRONOUS_LOGGER);

		iSimulationListenerEClass = createEClass(ISIMULATION_LISTENER);

		asynchronousLoggerEClass = createEClass(ASYNCHRONOUS_LOGGER);

		simulationLoggerEventEClass = createEClass(SIMULATION_LOGGER_EVENT);

		synchronousDecoratorPropertyLoggerEClass = createEClass(SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER);
		createEAttribute(synchronousDecoratorPropertyLoggerEClass, SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES);

		identifierPropertyEClass = createEClass(IDENTIFIER_PROPERTY);
		createEAttribute(identifierPropertyEClass, IDENTIFIER_PROPERTY__IDENTIFIER);
		createEAttribute(identifierPropertyEClass, IDENTIFIER_PROPERTY__PROPERTY);

		// Create enums
		loggeR_EVENTSEEnum = createEEnum(LOGGER_EVENTS);

		// Create data types
		simulationEDataType = createEDataType(SIMULATION);
		simulationEventEDataType = createEDataType(SIMULATION_EVENT);
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
		LoggerPackage theLoggerPackage = (LoggerPackage)EPackage.Registry.INSTANCE.getEPackage(LoggerPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simulationLoggerEClass.getESuperTypes().add(theLoggerPackage.getLogger());
		synchronousLoggerEClass.getESuperTypes().add(this.getSimulationLogger());
		asynchronousLoggerEClass.getESuperTypes().add(this.getSimulationLogger());
		synchronousDecoratorPropertyLoggerEClass.getESuperTypes().add(this.getSynchronousLogger());

		// Initialize classes and features; add operations and parameters
		initEClass(simulationLoggerEClass, SimulationLogger.class, "SimulationLogger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulationLogger_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 0, 1, SimulationLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationLogger_StepMod(), theEcorePackage.getEInt(), "stepMod", "1", 0, 1, SimulationLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationLogger_StartStep(), theEcorePackage.getELong(), "startStep", "0", 0, 1, SimulationLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(simulationLoggerEClass, null, "simulationEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSimulationEvent(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simulationLoggerEClass, null, "loggerEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSimulation(), "simulation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLOGGER_EVENTS(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(synchronousLoggerEClass, SynchronousLogger.class, "SynchronousLogger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSimulationListenerEClass, ISimulationListener.class, "ISimulationListener", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(asynchronousLoggerEClass, AsynchronousLogger.class, "AsynchronousLogger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulationLoggerEventEClass, SimulationLoggerEvent.class, "SimulationLoggerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronousDecoratorPropertyLoggerEClass, SynchronousDecoratorPropertyLogger.class, "SynchronousDecoratorPropertyLogger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchronousDecoratorPropertyLogger_Properties(), theEcorePackage.getEString(), "properties", null, 0, -1, SynchronousDecoratorPropertyLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(synchronousDecoratorPropertyLoggerEClass, null, "getDecoratorProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonPackage.getURI(), "decoratorURI", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEMap());
		EGenericType g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theEcorePackage.getEString());
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		initEClass(identifierPropertyEClass, IdentifierProperty.class, "IdentifierProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifierProperty_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, IdentifierProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifierProperty_Property(), theEcorePackage.getEString(), "property", null, 0, 1, IdentifierProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.class, "LOGGER_EVENTS");
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.LOGGER_MANAGER_STARTED);
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.LOGGER_MANAGER_STOPPED);
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.LOGGER_STARTED);
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.LOGGER_STOPPED);
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.LOGGER_ENABLED);
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.LOGGER_DISABLED);
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.SIMULATIONS_ADDED);
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.SIMULATIONS_REMOVED);
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.LOGGERS_ADDED);
		addEEnumLiteral(loggeR_EVENTSEEnum, org.eclipse.stem.loggers.LOGGER_EVENTS.LOGGERS_REMOVED);

		// Initialize data types
		initEDataType(simulationEDataType, ISimulation.class, "Simulation", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simulationEventEDataType, SimulationEvent.class, "SimulationEvent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SimulationLoggerPackageImpl
