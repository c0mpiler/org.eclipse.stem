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
package org.eclipse.stem.jobs.simulation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.stem.jobs.Activator;
import org.eclipse.stem.jobs.execution.IBaseListener;

/**
 * An Eclipse-managed Job to invoke a simulation listener for a simulation event.  This class
 * allows Eclipse to properly manage the schedules of listeners that are invoked 
 * for a given simulation state.
 * 
 * The basic rule is that a listener job should only be schedulable if it is
 * currently not held in another state by the Jobs Manager, e.g. it's not scheduled
 * (waiting) or running.  This prevents redundant asynchronous events from getting
 * scheduled, causing a queue backlog.
 *
 * When this job runs, it simply executes the designated method for the type of 
 * simulation listeners being invoked.  For asynchronous listeners, the job
 * invokes {@link ISimulationListener#simulationChanged(SimulationEvent)}.  For
 * synchronous listeners, then {@link ISimulationListenerSync#simulationChangedSync(SimulationEvent)} is 
 * invoked.
 * 
 * The {@link #run(IProgressMonitor)} method blocks until the invocation completes.  However, for 
 * scheduler purposes, this is asynchronous unless the caller calls {@link #join()} on this job.
 * 
 */
public class SimulationListenerJob extends Job
{

	/**
	 * Whether the assigned listener is synchronous or not
	 */
	protected boolean isSynchronous = false;
	
	/**
	 * Listener this job is assigned to
	 */
	protected IBaseListener listener;
	
	/**
	 * Simulation state this job is assigned to
	 */
	protected SimulationState simulationState;
	
	/**
	 * Simulation event that last invoked this job
	 */
	protected SimulationEvent event;
	
	/**
	 * Creates a simulation listener job for a given simulation-listener-state combination
	 * @param simulation The simulation you're tracking
	 * @param listener The simulation listener to trigger
	 * @param state The state for which this job will be triggered
	 *
	 */
	SimulationListenerJob(Simulation simulation, IBaseListener listener, SimulationState state, boolean synchronous)
	{
		super(simulation.getUniqueIDString() + listener.hashCode() + state.toString());
		this.simulationState = state;
		this.listener = listener;
		
		if (synchronous && listener instanceof ISimulationListenerSync) {
			isSynchronous = true;
		}
		
		setPriority(SHORT);
		setSystem(true);
	}
	
	/**
	 * @return The assigned simulation state for this job
	 */
	public SimulationState getAssignedSimulationState()
	{
		return simulationState;
	}
	
	/**
	 * @param event The simulation event that last invoked this job
	 */
	void setSimulationEvent(SimulationEvent event)
	{
		this.event = event;
	}
	
	/**
	 * Gets the Simulation Event that triggered this job and listener.  While all jobs should contain
	 * the simulation event created and assigned at schedule time, only synchronous 
	 * listeners should assume the information in the event is current and relevant.
	 * Asynchronous listeners should look directly at the simulation contained in the event.
	 * 
	 * @see SimulationEvent#getSimulation()
	 * @return The simulation event that triggered the listener
	 */
	public SimulationEvent getSimulationEvent()
	{
		return event;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#shouldSchedule()
	 */
	public boolean shouldSchedule()
	{
		return getState() == Job.NONE;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) 
	{
		try {
			event.setMonitor(monitor);
			if (isSynchronous()) {
				((ISimulationListenerSync)listener).simulationChangedSync(event);
			} else {
				((ISimulationListener)listener).simulationChanged(event);
			}
		} catch (Throwable t) {
			Activator.logError(t.getMessage(), t);
		}
		return Status.OK_STATUS;
	}
	
	/**
	 * @return Whether the job is associated with a synchronous simulation listener
	 */
	public boolean isSynchronous()
	{
		return isSynchronous;
	}
	
}
