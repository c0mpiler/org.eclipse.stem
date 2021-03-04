// STEMTimeRangeModifier.java
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

import org.eclipse.stem.core.model.STEMTime;

/**
 * A <code>STEMTimeRangeModifier</code> modifies an {@link STEMTime} valued
 * feature from a starting value to and end value (inclusive> by increments.
 * 
 * @model
 */
public interface STEMTimeRangeModifier extends RangeModifier {
	
	/**
	 * @model
	 */
	STEMTime getOriginalValue();
	
	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.STEMTimeRangeModifier#getOriginalValue <em>Original Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' reference.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(STEMTime value);

	/**
	 * @model
	 */
	STEMTime getStartValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.STEMTimeRangeModifier#getStartValue <em>Start Value</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Value</em>' reference.
	 * @see #getStartValue()
	 * @generated
	 */
	void setStartValue(STEMTime value);

	/**
	 * @model
	 */
	STEMTime getEndValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.STEMTimeRangeModifier#getEndValue <em>End Value</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Value</em>' reference.
	 * @see #getEndValue()
	 * @generated
	 */
	void setEndValue(STEMTime value);

	/**
	 * @model
	 */
	long getIncrement();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.STEMTimeRangeModifier#getIncrement <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' attribute.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(long value);

	/**
	 * @return the next value of the feature
	 * @model changeable="true"
	 */
	STEMTime getNextValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.STEMTimeRangeModifier#getNextValue <em>Next Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Value</em>' reference.
	 * @see #getNextValue()
	 * @generated
	 */
	void setNextValue(STEMTime value);

} // STEMTimeRangeModifier
