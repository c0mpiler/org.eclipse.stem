// SimulationState.java
package org.eclipse.stem.jobs.simulation;

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
 * This enumeration defines the states that a Simulation can be in.
 * 
 * @see SimulationEvent
 * @see ISimulationListener
 * @see ISimulation
 */
public enum SimulationState {
	/**
	 * When the simulation has been scheduled for execution and is running. This
	 * is the initial state of all newly created Simulations.
	 * <p>
	 * The next state is {@link #COMPLETED_CYCLE}.
	 * 
	 * @see #COMPLETED_CYCLE
	 */
	RUNNING,

	/**
	 * When the simulation has completed one cycle of a simulation sequence.
	 * <p>
	 * The next states are {@link #COMPLETED_CYCLE},
	 * {@link #COMPLETED_SEQUENCE}, {@link #PAUSED}, {@link #RESET},
	 * {@link #STOPPED}.
	 * 
	 * @see #COMPLETED_CYCLE
	 * @see #COMPLETED_SEQUENCE
	 * @see #PAUSED
	 * @see #RESET
	 * @see #STOPPED
	 */
	COMPLETED_CYCLE,

	/**
	 * When the simulation has completed all of the sequences in the simulation.
	 * <p>
	 * The next states are {@link #COMPLETED_CYCLE}, {@link #PAUSED},
	 * {@link #RESET}, {@link #STOPPED}.
	 * 
	 * @see #PAUSED
	 * @see #RESET
	 * @see #STOPPED
	 */
	COMPLETED_SEQUENCE,
	/**
	 * When the simulation is not scheduled for execution, but it still retains
	 * its scenario which maintains its state information. The Simulation can be
	 * scheduled again for execution.
	 * <p>
	 * The next states are {@link #RUNNING}, {@link #RESET}, {@link #STOPPED}
	 * 
	 * @see #RUNNING
	 * @see #RESET
	 * @see #STOPPED
	 */
	PAUSED,

	/**
	 * The Simulation's Scenario is being reset to its initial state. The
	 * Simulation can be scheduled for execution.
	 * <p>
	 * The next states are {@link #PAUSED}, {@link #STOPPED}
	 * 
	 * @see #PAUSED
	 * @see #STOPPED
	 * 
	 * @see org.eclipse.stem.core.scenario.Scenario#reset()
	 */
	RESET,

	/**
	 * The simulation is being removed from the simulation manager and its state
	 * information destroyed.
	 * 
	 * @see SimulationManager
	 */
	STOPPED
} // SimulationState
