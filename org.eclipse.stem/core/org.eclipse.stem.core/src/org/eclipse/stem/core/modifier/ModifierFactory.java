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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.core.modifier.ModifierPackage
 * @generated
 */
public interface ModifierFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModifierFactory eINSTANCE = org.eclipse.stem.core.modifier.impl.ModifierFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Double NOP Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double NOP Modifier</em>'.
	 * @generated
	 */
	DoubleNOPModifier createDoubleNOPModifier();

	/**
	 * Returns a new object of class '<em>Double Range Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Range Modifier</em>'.
	 * @generated
	 */
	DoubleRangeModifier createDoubleRangeModifier();

	/**
	 * Returns a new object of class '<em>Double Sequence Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Sequence Modifier</em>'.
	 * @generated
	 */
	DoubleSequenceModifier createDoubleSequenceModifier();

	/**
	 * Returns a new object of class '<em>Integer NOP Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer NOP Modifier</em>'.
	 * @generated
	 */
	IntegerNOPModifier createIntegerNOPModifier();

	/**
	 * Returns a new object of class '<em>Integer Range Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Range Modifier</em>'.
	 * @generated
	 */
	IntegerRangeModifier createIntegerRangeModifier();

	/**
	 * Returns a new object of class '<em>Integer Sequence Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Sequence Modifier</em>'.
	 * @generated
	 */
	IntegerSequenceModifier createIntegerSequenceModifier();

	/**
	 * Returns a new object of class '<em>Long NOP Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long NOP Modifier</em>'.
	 * @generated
	 */
	LongNOPModifier createLongNOPModifier();

	/**
	 * Returns a new object of class '<em>Long Range Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Range Modifier</em>'.
	 * @generated
	 */
	LongRangeModifier createLongRangeModifier();

	/**
	 * Returns a new object of class '<em>Long Sequence Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Sequence Modifier</em>'.
	 * @generated
	 */
	LongSequenceModifier createLongSequenceModifier();

	/**
	 * Returns a new object of class '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier</em>'.
	 * @generated
	 */
	Modifier createModifier();

	/**
	 * Returns a new object of class '<em>NOP Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NOP Modifier</em>'.
	 * @generated
	 */
	NOPModifier createNOPModifier();

	/**
	 * Returns a new object of class '<em>STEM Time NOP Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STEM Time NOP Modifier</em>'.
	 * @generated
	 */
	STEMTimeNOPModifier createSTEMTimeNOPModifier();

	/**
	 * Returns a new object of class '<em>STEM Time Range Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STEM Time Range Modifier</em>'.
	 * @generated
	 */
	STEMTimeRangeModifier createSTEMTimeRangeModifier();

	/**
	 * Returns a new object of class '<em>STEM Time Sequence Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STEM Time Sequence Modifier</em>'.
	 * @generated
	 */
	STEMTimeSequenceModifier createSTEMTimeSequenceModifier();

	/**
	 * Returns a new object of class '<em>String NOP Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String NOP Modifier</em>'.
	 * @generated
	 */
	StringNOPModifier createStringNOPModifier();

	/**
	 * Returns a new object of class '<em>String Sequence Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Sequence Modifier</em>'.
	 * @generated
	 */
	StringSequenceModifier createStringSequenceModifier();

	/**
	 * Returns a new object of class '<em>Double Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Modifier</em>'.
	 * @generated
	 */
	DoubleModifier createDoubleModifier();

	/**
	 * Returns a new object of class '<em>Integer Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Modifier</em>'.
	 * @generated
	 */
	IntegerModifier createIntegerModifier();

	/**
	 * Returns a new object of class '<em>Long Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Modifier</em>'.
	 * @generated
	 */
	LongModifier createLongModifier();

	/**
	 * Returns a new object of class '<em>STEM Time Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STEM Time Modifier</em>'.
	 * @generated
	 */
	STEMTimeModifier createSTEMTimeModifier();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModifierPackage getModifierPackage();

} //ModifierFactory
