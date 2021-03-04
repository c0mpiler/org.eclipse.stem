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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.loggers.IdentifierProperty;
import org.eclipse.stem.loggers.LOGGER_EVENTS;
import org.eclipse.stem.loggers.SimulationLoggerEvent;
import org.eclipse.stem.loggers.SimulationLoggerFactory;
import org.eclipse.stem.loggers.SimulationLoggerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationLoggerFactoryImpl extends EFactoryImpl implements SimulationLoggerFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 IBM Corporation and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    IBM Corporation - initial API and implementation";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimulationLoggerFactory init() {
		try {
			SimulationLoggerFactory theSimulationLoggerFactory = (SimulationLoggerFactory)EPackage.Registry.INSTANCE.getEFactory(SimulationLoggerPackage.eNS_URI);
			if (theSimulationLoggerFactory != null) {
				return theSimulationLoggerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimulationLoggerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationLoggerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimulationLoggerPackage.SIMULATION_LOGGER_EVENT: return createSimulationLoggerEvent();
			case SimulationLoggerPackage.IDENTIFIER_PROPERTY: return createIdentifierProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimulationLoggerPackage.LOGGER_EVENTS:
				return createLOGGER_EVENTSFromString(eDataType, initialValue);
			case SimulationLoggerPackage.SIMULATION_EVENT:
				return createSimulationEventFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimulationLoggerPackage.LOGGER_EVENTS:
				return convertLOGGER_EVENTSToString(eDataType, instanceValue);
			case SimulationLoggerPackage.SIMULATION_EVENT:
				return convertSimulationEventToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationLoggerEvent createSimulationLoggerEvent() {
		SimulationLoggerEventImpl simulationLoggerEvent = new SimulationLoggerEventImpl();
		return simulationLoggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierProperty createIdentifierProperty() {
		IdentifierPropertyImpl identifierProperty = new IdentifierPropertyImpl();
		return identifierProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOGGER_EVENTS createLOGGER_EVENTSFromString(EDataType eDataType, String initialValue) {
		LOGGER_EVENTS result = LOGGER_EVENTS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLOGGER_EVENTSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationEvent createSimulationEventFromString(EDataType eDataType, String initialValue) {
		return (SimulationEvent)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimulationEventToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationLoggerPackage getSimulationLoggerPackage() {
		return (SimulationLoggerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimulationLoggerPackage getPackage() {
		return SimulationLoggerPackage.eINSTANCE;
	}

} //SimulationLoggerFactoryImpl
