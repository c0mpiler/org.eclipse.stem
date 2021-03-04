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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.modifier.IntegerModifier#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.stem.core.modifier.IntegerModifier#getOriginalValue <em>Original Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.modifier.ModifierPackage#getIntegerModifier()
 * @model
 * @generated
 */
public interface IntegerModifier extends SingleValueModifier {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.eclipse.stem.core.modifier.ModifierPackage#getIntegerModifier_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.IntegerModifier#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Original Value</b></em>' attribute.
	 * The default value is <code>"-2000000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Value</em>' attribute.
	 * @see #setOriginalValue(int)
	 * @see org.eclipse.stem.core.modifier.ModifierPackage#getIntegerModifier_OriginalValue()
	 * @model default="-2000000000" transient="true"
	 * @generated
	 */
	int getOriginalValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.IntegerModifier#getOriginalValue <em>Original Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' attribute.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(int value);
} // IntegerModifier
