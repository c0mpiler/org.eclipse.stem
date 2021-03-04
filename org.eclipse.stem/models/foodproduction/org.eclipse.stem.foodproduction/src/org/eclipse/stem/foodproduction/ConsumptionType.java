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
package org.eclipse.stem.foodproduction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Consumption Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getConsumptionType()
 * @model
 * @generated
 */
public enum ConsumptionType implements Enumerator {
	/**
	 * The '<em><b>RELATIVE CONSUMPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_CONSUMPTION_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_CONSUMPTION(1, "RELATIVE_CONSUMPTION", "RELATIVE_CONSUMPTION"),

	/**
	 * The '<em><b>ABSOLUTE CONSUMPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE_CONSUMPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ABSOLUTE_CONSUMPTION(2, "ABSOLUTE_CONSUMPTION", "ABSOLUTE_CONSUMPTION"),

	/**
	 * The '<em><b>CONSUMPTION PER PERSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUMPTION_PER_PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUMPTION_PER_PERSON(3, "CONSUMPTION_PER_PERSON", "CONSUMPTION_PER_PERSON");

	/**
	 * The '<em><b>RELATIVE CONSUMPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELATIVE CONSUMPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_CONSUMPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_CONSUMPTION_VALUE = 1;

	/**
	 * The '<em><b>ABSOLUTE CONSUMPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABSOLUTE CONSUMPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE_CONSUMPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABSOLUTE_CONSUMPTION_VALUE = 2;

	/**
	 * The '<em><b>CONSUMPTION PER PERSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSUMPTION PER PERSON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSUMPTION_PER_PERSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_PER_PERSON_VALUE = 3;

	/**
	 * An array of all the '<em><b>Consumption Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsumptionType[] VALUES_ARRAY =
		new ConsumptionType[] {
			RELATIVE_CONSUMPTION,
			ABSOLUTE_CONSUMPTION,
			CONSUMPTION_PER_PERSON,
		};

	/**
	 * A public read-only list of all the '<em><b>Consumption Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsumptionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consumption Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConsumptionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsumptionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consumption Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConsumptionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsumptionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consumption Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConsumptionType get(int value) {
		switch (value) {
			case RELATIVE_CONSUMPTION_VALUE: return RELATIVE_CONSUMPTION;
			case ABSOLUTE_CONSUMPTION_VALUE: return ABSOLUTE_CONSUMPTION;
			case CONSUMPTION_PER_PERSON_VALUE: return CONSUMPTION_PER_PERSON;
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
	private ConsumptionType(int value, String name, String literal) {
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
	
} //ConsumptionType
