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
package org.eclipse.stem.loggers.manager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationListener;
import org.eclipse.stem.jobs.simulation.ISimulationListenerSync;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.loggers.LOGGER_EVENTS;
import org.eclipse.stem.loggers.SimulationLogger;
import org.eclipse.stem.loggers.SimulationLoggerPackage;

/**
 * Logger adapter to handle the interactions between the STEM simulation
 * runtime and the individual loggers 
 *
 */
public class LoggerAdapter extends AdapterImpl implements ISimulationListener,
		ISimulationListenerSync {

	/**
	 * Parent logger the adapter wraps
	 */
	SimulationLogger logger;
	
	/**
	 * Simulation the logger logs
	 */
	ISimulation simulation;

	int simulationStepMod;
	
	/**
	 * Constructor for the Logger Adapter
	 * @param simulation The simulation that contains the scenario to log
	 * @param logger Parent logger
	 */
	LoggerAdapter(ISimulation simulation, SimulationLogger logger)
	{
		this.logger = logger;
		this.simulation = simulation;
		
		simulationStepMod = logger.getStepMod();
		if (simulationStepMod < 1) {
			simulationStepMod = 1;
		}

		setTarget(logger);
		logger.eAdapters().add(this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification msg) 
	{
		if (SimulationLoggerPackage.Literals.SIMULATION_LOGGER__ENABLED
				.equals(msg.getFeature())) {
			if (msg.getNewBooleanValue() == true) {
				fireLoggerEvent(LOGGER_EVENTS.LOGGER_ENABLED);
			} else {
				fireLoggerEvent(LOGGER_EVENTS.LOGGER_DISABLED);
			}
		}
	}

	/**
	 * @return The logger tracked by the adapter
	 */
	public SimulationLogger getLogger() {
		return logger;
	}

	/**
	 * @return The simulation tracked by the adapter
	 */
	public ISimulation getSimulation() {
		return simulation;
	}

	/**
	 * Sends a logger state change event to the underlying logger implementation
	 * 
	 * @param event The logger event type
	 */
	void fireLoggerEvent(LOGGER_EVENTS event) {
		logger.loggerEvent(simulation, event);
	}

	/**
	 * Sends a simulation change event to the underlying logger implementation, 
	 * if the logger is enabled
	 * 
	 * @param event The simulation event
	 */
	void fireSimulationEvent(SimulationEvent event)
	{
		int step = event.getSimulation().getScenario().getSequencer().getCycle();
		if (logger != null 
				&& logger.isEnabled()
				&& step >= logger.getStartStep()
				&& step % simulationStepMod == 0) {
			logger.simulationEvent(event);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.stem.jobs.simulation.ISimulationListenerSync#simulationChangedSync(org.eclipse.stem.jobs.simulation.SimulationEvent)
	 */
	public void simulationChangedSync(SimulationEvent event) 
	{
		fireSimulationEvent(event);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.stem.jobs.simulation.ISimulationListener#simulationChanged(org.eclipse.stem.jobs.simulation.SimulationEvent)
	 */
	public void simulationChanged(SimulationEvent event) 
	{
		fireSimulationEvent(event);
	}

	/**
	 * disassociates adapter from EMF listeners
	 */
	void destroy() {
		setTarget(null);
		logger.eAdapters().remove(this);
		logger = null;
		simulation = null;
	}
}
