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
package org.eclipse.stem.loggers.imagewriter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MAP PROJECTIONS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getMAP_PROJECTIONS()
 * @model
 * @generated
 */
public enum MAP_PROJECTIONS implements Enumerator {
	/**
	 * The '<em><b>EQUIRECTANGULAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIRECTANGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIRECTANGULAR(0, "EQUIRECTANGULAR", "EQUIRECTANGULAR"),

	/**
	 * The '<em><b>MERCATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERCATOR_VALUE
	 * @generated
	 * @ordered
	 */
	MERCATOR(1, "MERCATOR", "MERCATOR");

	/**
	 * The '<em><b>EQUIRECTANGULAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUIRECTANGULAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUIRECTANGULAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUIRECTANGULAR_VALUE = 0;

	/**
	 * The '<em><b>MERCATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MERCATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MERCATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERCATOR_VALUE = 1;

	/**
	 * An array of all the '<em><b>MAP PROJECTIONS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MAP_PROJECTIONS[] VALUES_ARRAY =
		new MAP_PROJECTIONS[] {
			EQUIRECTANGULAR,
			MERCATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>MAP PROJECTIONS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MAP_PROJECTIONS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MAP PROJECTIONS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MAP_PROJECTIONS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MAP_PROJECTIONS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MAP PROJECTIONS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MAP_PROJECTIONS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MAP_PROJECTIONS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MAP PROJECTIONS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MAP_PROJECTIONS get(int value) {
		switch (value) {
			case EQUIRECTANGULAR_VALUE: return EQUIRECTANGULAR;
			case MERCATOR_VALUE: return MERCATOR;
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
	private MAP_PROJECTIONS(int value, String name, String literal) {
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
	
} //MAP_PROJECTIONS
