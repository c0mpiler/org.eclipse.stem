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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>LOGGER EVENTS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.loggers.SimulationLoggerPackage#getLOGGER_EVENTS()
 * @model
 * @generated
 */
public enum LOGGER_EVENTS implements Enumerator {
	/**
	 * The '<em><b>LOGGER MANAGER STARTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGER_MANAGER_STARTED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGER_MANAGER_STARTED(0, "LOGGER_MANAGER_STARTED", "LOGGER_MANAGER_STARTED"),

	/**
	 * The '<em><b>LOGGER MANAGER STOPPED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGER_MANAGER_STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGER_MANAGER_STOPPED(1, "LOGGER_MANAGER_STOPPED", "LOGGER_MANAGER_STOPPED"),

	/**
	 * The '<em><b>LOGGER STARTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGER_STARTED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGER_STARTED(2, "LOGGER_STARTED", "LOGGER_STARTED"),

	/**
	 * The '<em><b>LOGGER STOPPED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGER_STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGER_STOPPED(3, "LOGGER_STOPPED", "LOGGER_STOPPED"),

	/**
	 * The '<em><b>LOGGER ENABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGER_ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGER_ENABLED(4, "LOGGER_ENABLED", "LOGGER_ENABLED"),

	/**
	 * The '<em><b>LOGGER DISABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGER_DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGER_DISABLED(5, "LOGGER_DISABLED", "LOGGER_DISABLED"), /**
	 * The '<em><b>SIMULATIONS ADDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMULATIONS_ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	SIMULATIONS_ADDED(6, "SIMULATIONS_ADDED", "SIMULATIONS_ADDED"), /**
	 * The '<em><b>SIMULATIONS REMOVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMULATIONS_REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	SIMULATIONS_REMOVED(7, "SIMULATIONS_REMOVED", ""), /**
	 * The '<em><b>LOGGERS ADDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGERS_ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGERS_ADDED(8, "LOGGERS_ADDED", "LOGGERS_ADDED"), /**
	 * The '<em><b>LOGGERS REMOVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGERS_REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGERS_REMOVED(9, "LOGGERS_REMOVED", "LOGGERS_REMOVED");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 IBM Corporation and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    IBM Corporation - initial API and implementation";

	/**
	 * The '<em><b>LOGGER MANAGER STARTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGGER MANAGER STARTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGER_MANAGER_STARTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGGER_MANAGER_STARTED_VALUE = 0;

	/**
	 * The '<em><b>LOGGER MANAGER STOPPED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGGER MANAGER STOPPED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGER_MANAGER_STOPPED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGGER_MANAGER_STOPPED_VALUE = 1;

	/**
	 * The '<em><b>LOGGER STARTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGGER STARTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGER_STARTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGGER_STARTED_VALUE = 2;

	/**
	 * The '<em><b>LOGGER STOPPED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGGER STOPPED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGER_STOPPED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGGER_STOPPED_VALUE = 3;

	/**
	 * The '<em><b>LOGGER ENABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGGER ENABLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGER_ENABLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGGER_ENABLED_VALUE = 4;

	/**
	 * The '<em><b>LOGGER DISABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGGER DISABLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGER_DISABLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGGER_DISABLED_VALUE = 5;

	/**
	 * The '<em><b>SIMULATIONS ADDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMULATIONS ADDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMULATIONS_ADDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMULATIONS_ADDED_VALUE = 6;

	/**
	 * The '<em><b>SIMULATIONS REMOVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMULATIONS REMOVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMULATIONS_REMOVED
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int SIMULATIONS_REMOVED_VALUE = 7;

	/**
	 * The '<em><b>LOGGERS ADDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGGERS ADDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGERS_ADDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGGERS_ADDED_VALUE = 8;

	/**
	 * The '<em><b>LOGGERS REMOVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGGERS REMOVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGERS_REMOVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGGERS_REMOVED_VALUE = 9;

	/**
	 * An array of all the '<em><b>LOGGER EVENTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LOGGER_EVENTS[] VALUES_ARRAY =
		new LOGGER_EVENTS[] {
			LOGGER_MANAGER_STARTED,
			LOGGER_MANAGER_STOPPED,
			LOGGER_STARTED,
			LOGGER_STOPPED,
			LOGGER_ENABLED,
			LOGGER_DISABLED,
			SIMULATIONS_ADDED,
			SIMULATIONS_REMOVED,
			LOGGERS_ADDED,
			LOGGERS_REMOVED,
		};

	/**
	 * A public read-only list of all the '<em><b>LOGGER EVENTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LOGGER_EVENTS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>LOGGER EVENTS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LOGGER_EVENTS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LOGGER_EVENTS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LOGGER EVENTS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LOGGER_EVENTS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LOGGER_EVENTS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LOGGER EVENTS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LOGGER_EVENTS get(int value) {
		switch (value) {
			case LOGGER_MANAGER_STARTED_VALUE: return LOGGER_MANAGER_STARTED;
			case LOGGER_MANAGER_STOPPED_VALUE: return LOGGER_MANAGER_STOPPED;
			case LOGGER_STARTED_VALUE: return LOGGER_STARTED;
			case LOGGER_STOPPED_VALUE: return LOGGER_STOPPED;
			case LOGGER_ENABLED_VALUE: return LOGGER_ENABLED;
			case LOGGER_DISABLED_VALUE: return LOGGER_DISABLED;
			case SIMULATIONS_ADDED_VALUE: return SIMULATIONS_ADDED;
			case SIMULATIONS_REMOVED_VALUE: return SIMULATIONS_REMOVED;
			case LOGGERS_ADDED_VALUE: return LOGGERS_ADDED;
			case LOGGERS_REMOVED_VALUE: return LOGGERS_REMOVED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LOGGER_EVENTS(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LOGGER_EVENTS
