// ISimulation.java
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

import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.jobs.execution.IExecutable;

/**
 * This interface is implemented by classes that represent {@link Simulation}s
 * of {@link Scenario}s.
 */
public interface ISimulation extends IExecutable {

	/**
	 * @param sequenceNumber
	 *            The sequence number of the {@link Simulation}
	 */
	void setSequenceNumber(int sequenceNumber);

	/**
	 * @return the state of the {@link Simulation}
	 */
	SimulationState getSimulationState();

	/**
	 * Start running the {@link Simulation}.
	 */
	void run();

	/**
	 * Pause the {@link Simulation}
	 */
	void pause();

	/**
	 * Reset the {@link Simulation}.
	 */
	void reset() throws ScenarioInitializationException;

	/**
	 * Step the {@link Simulation} one step/cycle if it hasn't already ended
	 */
	void step();

	/**
	 * Stop the {@link Simulation}
	 */
	void stop();

	/**
	 * Wait for execution to complete.
	 * 
	 * @throws InterruptedException
	 *             if the job is interrupted
	 */
	void join() throws InterruptedException;

	/**
	 * @return <code>true</code> if execution has been canceled.
	 */
	boolean cancel();

	/**
	 * @return the {@link Scenario} being simulated
	 */
	Scenario getScenario();

	/**
	 * Add a {@link ISimulationListener} to those that will be notified of
	 * changes.
	 * 
	 * @param simulationListener
	 */
	void addSimulationListener(ISimulationListener simulationListener);

	void addSimulationListener(ISimulationListener simulationListener, boolean headlessSafe);
	
	
	/**
	 * Remove {@link ISimulationListener} to those that will be notified of
	 * changes.
	 * 
	 * @param simulationListener
	 */
	void removeSimulationListener(ISimulationListener simulationListener);

	/**
	 * Add a {@link ISimulationListener} to those that will be notified of
	 * changes.
	 * 
	 * @param simulationListener
	 */
	void addSimulationListenerSync(ISimulationListenerSync simulationListener);
	
	void addSimulationListenerSync(ISimulationListenerSync simulationListener, boolean headlessSafe);

	/**
	 * Remove {@link ISimulationListener} to those that will be notified of
	 * changes.
	 * 
	 * @param simulationListener
	 */
	void removeSimulationListenerSync(ISimulationListenerSync simulationListener);

	
	/**
	 * Prepares the simulation for garbage collection.  Disassociates with any listeners and
	 * clears memory.
	 */
	void destroy();
	
} // ISimulation
