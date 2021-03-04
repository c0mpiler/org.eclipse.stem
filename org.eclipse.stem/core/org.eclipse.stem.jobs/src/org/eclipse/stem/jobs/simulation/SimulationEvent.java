// SimulationEvent.java
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

import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;


/**
 * This class represents an event that has occurred in the operation of the
 * Simulation
 */
public class SimulationEvent extends EventObject {

	private SimulationState simulationState;
	private double iterationProgress = 0.0;
	private IProgressMonitor monitor;
	
	
	/**
	 * @param source
	 *            the Simulation the generated the event
	 * @param simulationState
	 *            the new state of the simulation
	 */
	public SimulationEvent(ISimulation source,
			final SimulationState simulationState) {
		super(source);
		this.simulationState = simulationState;
		this.iterationProgress = 0.0;
	} // SimulationEvent

	/**
	 * @param source
	 *            the Simulation the generated the event
	 * @param simulationState
	 *            the new state of the simulation
	 * @param iprogress Iteration progress
	 */
	public SimulationEvent(ISimulation source,
			final SimulationState simulationState, 
			double iprogress) {
		super(source);
		this.simulationState = simulationState;
		this.iterationProgress = iprogress;
	} // SimulationEvent
	
	/**
	 * Generated serialization ID
	 */
	private static final long serialVersionUID = 7512868955841962331L;

	/**
	 * @return the new state of the simulation
	 */
	public final SimulationState getSimulationState() {
		return simulationState;
	}

	/**
	 * @return the simulation that is the source of the event
	 */
	public ISimulation getSimulation() {
		return (ISimulation) getSource();
	}

	/**
	 * @return double The progress of the current iteration (0-1)
	 */
	public double getIterationProgress() {
		return iterationProgress;
	}
	
	/**
	 * @see java.util.EventObject#toString()
	 */
	@Override
	public String toString() {
		return simulationState.toString();
	}
	
	/**
	 * Sets Job Manager's progress monitor
	 * @param monitor Progress monitor assigned by the Job Manager
	 */
	void setMonitor(IProgressMonitor monitor)
	{
		this.monitor = monitor;
	}
	
	/**
	 * Gets the progress monitor assigned by the job manager, if one is available.
	 * Otherwise, returns null.
	 * @return Progress monitor assigned to the job that called the listener
	 */
	public IProgressMonitor getMonitor()
	{
		return monitor;
	}
	

} // SimulationEvent
