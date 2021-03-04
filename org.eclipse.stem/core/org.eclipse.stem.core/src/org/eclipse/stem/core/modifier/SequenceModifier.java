// SequenceModifier.java
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
 * A {@link SequenceModifier} modifies a feature by setting it to a
 * sequence of specific values.
 * 
 * @model abstract="true"
 */
public interface SequenceModifier extends FeatureModifier {
	
	/**
	 * @model
	 */
	Object getOriginalValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.SequenceModifier#getOriginalValue <em>Original Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' attribute.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(Object value);

	/**
	 * @return the number of entries in the collection of values.
	 * @model volatile="true" transient="true" changeable="false"
	 */
	int getSequenceSize();

	/**
	 * @return the index of the current value in the sequence
	 * @model default="0"
	 */
	int getCurrentSequenceIndex();
	
	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.SequenceModifier#getCurrentSequenceIndex <em>Current Sequence Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Sequence Index</em>' attribute.
	 * @see #getCurrentSequenceIndex()
	 * @generated
	 */
	void setCurrentSequenceIndex(int value);

	/**
	 * @return the next value in the sequence
	 * @model volatile="true" transient="true" changeable="true"
	 */
	Object getNextValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.stem.core.modifier.SequenceModifier#getNextValue <em>Next Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Next Value</em>' attribute is set.
	 * @see #getNextValue()
	 * @generated
	 */
	boolean isSetNextValue();
} // SequenceModifier
