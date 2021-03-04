package org.eclipse.stem.core.graph;

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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exchange Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.core.graph.GraphPackage#getExchangeType()
 * @model
 * @generated
 */
public enum ExchangeType implements Enumerator {
	/**
	 * The '<em><b>BIRTHS AND DEATHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRTHS_AND_DEATHS_VALUE
	 * @generated
	 * @ordered
	 */
	BIRTHS_AND_DEATHS(1, "BIRTHS_AND_DEATHS", "BIRTHS_AND_DEATHS"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>MIGRATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	MIGRATION(2, "MIGRATION", "MIGRATION"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>AGING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGING_VALUE
	 * @generated
	 * @ordered
	 */
	AGING(3, "AGING", "AGING"), /**
	 * The '<em><b>COMPARTMENT TRANSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPARTMENT_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARTMENT_TRANSITION(4, "COMPARTMENT_TRANSITION", "COMPARTMENT_TRANSITION"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>BIRTHS AND DEATHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIRTHS AND DEATHS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIRTHS_AND_DEATHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIRTHS_AND_DEATHS_VALUE = 1;

	/**
	 * The '<em><b>MIGRATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIGRATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIGRATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIGRATION_VALUE = 2;

	/**
	 * The '<em><b>AGING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGING_VALUE = 3;

	/**
	 * The '<em><b>COMPARTMENT TRANSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPARTMENT TRANSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPARTMENT_TRANSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPARTMENT_TRANSITION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Exchange Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExchangeType[] VALUES_ARRAY =
		new ExchangeType[] {
			BIRTHS_AND_DEATHS,
			MIGRATION,
			AGING,
			COMPARTMENT_TRANSITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Exchange Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExchangeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exchange Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExchangeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exchange Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExchangeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exchange Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangeType get(int value) {
		switch (value) {
			case BIRTHS_AND_DEATHS_VALUE: return BIRTHS_AND_DEATHS;
			case MIGRATION_VALUE: return MIGRATION;
			case AGING_VALUE: return AGING;
			case COMPARTMENT_TRANSITION_VALUE: return COMPARTMENT_TRANSITION;
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
	private ExchangeType(int value, String name, String literal) {
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
	
} //ExchangeType
