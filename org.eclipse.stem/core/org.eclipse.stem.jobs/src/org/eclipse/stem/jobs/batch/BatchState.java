// BatchState.java
package org.eclipse.stem.jobs.batch;

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
 * This enumeration defines the states that a {@link Batch} can be in.
 * 
 * @see SimulationState
 */
public enum BatchState {
	/**
	 * When the {@link Batch} has been scheduled for execution and is running.
	 * This is the initial state of all newly created {@link Batch}s.
	 * <p>
	 * The next state is: {@link #PAUSED}
	 */
	RUNNING,

	/**
	 * When all of the {@link Simulation}s in a {@link Batch} are not scheduled
	 * for execution.
	 * <p>
	 * The next states are {@link #RUNNING}, {@link #STOPPED}
	 * 
	 * @see #RUNNING
	 * @see #STOPPED
	 */
	PAUSED,

	/**
	 * The simulation is being removed from the {@link SimulationManager} and its state
	 * information destroyed.
	 */
	STOPPED
} // BatchState
