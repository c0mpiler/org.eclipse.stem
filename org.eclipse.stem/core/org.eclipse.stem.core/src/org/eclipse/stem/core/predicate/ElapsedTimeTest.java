// ElapsedTimeTest.java
package org.eclipse.stem.core.predicate;

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
 * A <code>ElapsedTimeTest</code> is a {@link TimeTest} that returns a boolean
 * value depending upon the difference between the first time value passed to
 * {@link #evaluate(org.eclipse.stem.core.model.STEMTime, long, org.eclipse.stem.core.model.Decorator)}
 * and subsequent values.
 * 
 * @model
 */
public interface ElapsedTimeTest extends TimeTest {

	/**
	 * @return the time value used for comparison purposes.
	 * @model containment="true"
	 */
	STEMTime getReferenceTime();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.ElapsedTimeTest#getReferenceTime <em>Reference Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Time</em>' containment reference.
	 * @see #getReferenceTime()
	 * @generated
	 */
	void setReferenceTime(STEMTime value);

	/**
	 * @return <code>true</code> if the reference time has been set
	 * @model default="false"
	 */
	boolean isReferenceTimeValid();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.ElapsedTimeTest#isReferenceTimeValid <em>Reference Time Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Time Valid</em>' attribute.
	 * @see #isReferenceTimeValid()
	 * @generated
	 */
	void setReferenceTimeValid(boolean value);

	/**
	 * @return the number of milliseconds of elapsed time to be used for
	 *         comparison between the reference time and the current time.
	 * @model transient="true" changeable="false"
	 */
	long getElapsedMilliseconds();

	/**
	 * @return the number of days of elapsed time to be used for the comparison
	 *         between the reference time and the current time.
	 * @model default="0"
	 */
	int getNumberofDays();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.ElapsedTimeTest#getNumberofDays <em>Numberof Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numberof Days</em>' attribute.
	 * @see #getNumberofDays()
	 * @generated
	 */
	void setNumberofDays(int value);

} // ElapsedTimeTest