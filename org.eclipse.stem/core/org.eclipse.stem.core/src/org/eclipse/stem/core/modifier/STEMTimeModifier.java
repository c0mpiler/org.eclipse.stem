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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STEM Time Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.modifier.STEMTimeModifier#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.stem.core.modifier.STEMTimeModifier#getOriginalValue <em>Original Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.modifier.ModifierPackage#getSTEMTimeModifier()
 * @model
 * @generated
 */
public interface STEMTimeModifier extends SingleValueModifier {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(STEMTime)
	 * @see org.eclipse.stem.core.modifier.ModifierPackage#getSTEMTimeModifier_Value()
	 * @model
	 * @generated
	 */
	STEMTime getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.STEMTimeModifier#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(STEMTime value);

	/**
	 * Returns the value of the '<em><b>Original Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Value</em>' reference.
	 * @see #setOriginalValue(STEMTime)
	 * @see org.eclipse.stem.core.modifier.ModifierPackage#getSTEMTimeModifier_OriginalValue()
	 * @model transient="true"
	 * @generated
	 */
	STEMTime getOriginalValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.modifier.STEMTimeModifier#getOriginalValue <em>Original Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' reference.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(STEMTime value);
} // STEMTimeModifier
