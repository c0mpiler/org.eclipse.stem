// STEMTime.java
package org.eclipse.stem.core.model;

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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * A <code>STEMTime</code> instance represents a point in time in in the STEM
 * system.
 * 
 * @see org.eclipse.stem.core.sequencer.Sequencer
 * 
 * @model
 */
public interface STEMTime extends EObject, Comparable<STEMTime> {

	/**
	 * This is an enumeration of different common time units with their duration
	 * in milliseconds.
	 */
	enum Units {
		MILLISECOND(1),
		SECOND(1000),
		MINUTE(60*1000), 
		HOUR(60*60*1000), 
		DAY(24*60*60*1000),
		WEEK(7*24*60*60*1000), 
		MONTH((long)(30.43685* 86400.0 * 1000.0)),
		YEAR((long)(365.242199 * 86400.0 * 1000.0));
		private long duration;

		private Units(long duration) {
			this.duration = duration;
		}
		
		/**
		 * @return the number of milliseconds that is equivalent to this time unit.
		 */
		public long getMilliseconds() {
			return duration;
		}
	}; // Units

	/**
	 * @return the time
	 * @model
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.model.STEMTime#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * @param timeIncrement
	 *            the number of milliseconds the new STEMTime is in the future.
	 * @return a new STEMTime that is a specified number of milliseconds from
	 *         the current time.
	 * @model volatile="true" transient="true" changeable="false"
	 */
	STEMTime addIncrement(long timeIncrement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean valueEquals(STEMTime obj);

} // STEMTime
