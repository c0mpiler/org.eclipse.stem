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
package org.eclipse.stem.core.predicate;

import org.eclipse.stem.core.model.STEMTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulus Time Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.predicate.ModulusTimeTest#getModulusDays <em>Modulus Days</em>}</li>
 *   <li>{@link org.eclipse.stem.core.predicate.ModulusTimeTest#isReferenceTimeValid <em>Reference Time Valid</em>}</li>
 *   <li>{@link org.eclipse.stem.core.predicate.ModulusTimeTest#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.stem.core.predicate.ModulusTimeTest#getReferenceTime <em>Reference Time</em>}</li>
 *   <li>{@link org.eclipse.stem.core.predicate.ModulusTimeTest#getTriggerTime <em>Trigger Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.predicate.PredicatePackage#getModulusTimeTest()
 * @model
 * @generated
 */
public interface ModulusTimeTest extends TimeTest {
	/**
	 * Returns the value of the '<em><b>Modulus Days</b></em>' attribute.
	 * The default value is <code>"365"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulus Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulus Days</em>' attribute.
	 * @see #setModulusDays(int)
	 * @see org.eclipse.stem.core.predicate.PredicatePackage#getModulusTimeTest_ModulusDays()
	 * @model default="365"
	 * @generated
	 */
	int getModulusDays();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.ModulusTimeTest#getModulusDays <em>Modulus Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulus Days</em>' attribute.
	 * @see #getModulusDays()
	 * @generated
	 */
	void setModulusDays(int value);

	/**
	 * Returns the value of the '<em><b>Reference Time Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Time Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Time Valid</em>' attribute.
	 * @see #setReferenceTimeValid(boolean)
	 * @see org.eclipse.stem.core.predicate.PredicatePackage#getModulusTimeTest_ReferenceTimeValid()
	 * @model
	 * @generated
	 */
	boolean isReferenceTimeValid();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.ModulusTimeTest#isReferenceTimeValid <em>Reference Time Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Time Valid</em>' attribute.
	 * @see #isReferenceTimeValid()
	 * @generated
	 */
	void setReferenceTimeValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see org.eclipse.stem.core.predicate.PredicatePackage#getModulusTimeTest_Duration()
	 * @model default="1"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.ModulusTimeTest#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Reference Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Time</em>' containment reference.
	 * @see #setReferenceTime(STEMTime)
	 * @see org.eclipse.stem.core.predicate.PredicatePackage#getModulusTimeTest_ReferenceTime()
	 * @model containment="true"
	 * @generated
	 */
	STEMTime getReferenceTime();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.ModulusTimeTest#getReferenceTime <em>Reference Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Time</em>' containment reference.
	 * @see #getReferenceTime()
	 * @generated
	 */
	void setReferenceTime(STEMTime value);

	/**
	 * Returns the value of the '<em><b>Trigger Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Time</em>' containment reference.
	 * @see #setTriggerTime(STEMTime)
	 * @see org.eclipse.stem.core.predicate.PredicatePackage#getModulusTimeTest_TriggerTime()
	 * @model containment="true"
	 * @generated
	 */
	STEMTime getTriggerTime();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.ModulusTimeTest#getTriggerTime <em>Trigger Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Time</em>' containment reference.
	 * @see #getTriggerTime()
	 * @generated
	 */
	void setTriggerTime(STEMTime value);

} // ModulusTimeTest
