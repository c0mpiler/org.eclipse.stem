// SequentialSequencer.java
package org.eclipse.stem.core.sequencer;

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
* A <code>SequentialSequencer</code> is a {@link Sequencer} that generates
* sequential time points that are uniformly spaced at a constant interval of
* time.
* 
* @model
*/
public interface SequentialSequencer extends Sequencer {

	/**
	 * @return the number of milliseconds between the time points returned by
	 *         successive calls to {@link Sequencer#getNextTime()}.
	 * 
	 * @model
	 */
	long getTimeIncrement();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.sequencer.SequentialSequencer#getTimeIncrement <em>Time Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Increment</em>' attribute.
	 * @see #getTimeIncrement()
	 * @generated
	 */
	void setTimeIncrement(long value);

} // SequentialSequencer
