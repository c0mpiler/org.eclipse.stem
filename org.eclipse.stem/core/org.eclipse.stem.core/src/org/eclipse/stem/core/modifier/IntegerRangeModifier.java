// IntegerRangeModifier.java
package org.eclipse.stem.core.modifier;

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

/**
 * A <code>IntegerRangeModifier</code> modifies an integer valued feature from
 * a starting value to and end value (inclusive> by increments.
 * 
 * @model
 */
public interface IntegerRangeModifier extends RangeModifier {
	
	/**
	 * @model
	 */
	int getOriginalValue();
	
	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.IntegerRangeModifier#getOriginalValue <em>Original Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' attribute.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(int value);

	/**
	 * @model default="-99999999"
	 */
	int getStartValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.IntegerRangeModifier#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Value</em>' attribute.
	 * @see #getStartValue()
	 * @generated
	 */
	void setStartValue(int value);

	/**
	 * @model default="-99999999"
	 */
	int getEndValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.IntegerRangeModifier#getEndValue <em>End Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Value</em>' attribute.
	 * @see #getEndValue()
	 * @generated
	 */
	void setEndValue(int value);

	/**
	 * @model default="-99999999"
	 */
	int getIncrement();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.IntegerRangeModifier#getIncrement <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' attribute.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(int value);
	
	/**
	 * @return the next value of the feature
	 * @model default="-99999999" changeable="true"
	 */
	int getNextValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.IntegerRangeModifier#getNextValue <em>Next Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Value</em>' attribute.
	 * @see #getNextValue()
	 * @generated
	 */
	void setNextValue(int value);
	
} // IntegerRangeModifier
