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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationManagerListenerSync;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.stem.jobs.simulation.SimulationManagerEvent;
import org.eclipse.stem.loggers.AsynchronousLogger;
import org.eclipse.stem.loggers.LOGGER_EVENTS;
import org.eclipse.stem.loggers.SimulationLogger;

/**
 * Service to manage the logging of STEM Simulations.  This singleton class 
 * handles the addition and removal of loggers for the STEM runtime.  The logger manager
 *  monitors the STEM simulation manager to start/stop loggers as appropriate.  
 * 
 */
public class SimulationLoggerManager implements ISimulationManagerListenerSync
{
	private static SimulationLoggerManager INSTANCE;
	
	private final Map<ISimulation, List<LoggerAdapter>> loggers =
			new HashMap<ISimulation, List<LoggerAdapter>>();
	
	private final List<ISimulationLoggerManagerListener> listeners = new CopyOnWriteArrayList<ISimulationLoggerManagerListener>();
	
	private final List<SimulationLogger> autoAddedLoggers = new CopyOnWriteArrayList<SimulationLogger>();
	
	private final SimulationManager simulationManager;
	
	public synchronized static SimulationLoggerManager getManager()
	{
		if (null == INSTANCE) {
			INSTANCE = new SimulationLoggerManager();
		}
		
		return INSTANCE;
	}
	
	public Collection<ISimulation> getActiveSimulations()
	{
		return Collections.unmodifiableCollection(loggers.keySet());
	}
	
	public void addAutoAddedLogger(SimulationLogger logger)
	{
		autoAddedLoggers.add(logger);
	}
	
	public void removeAutoAddedLogger(SimulationLogger logger)
	{
		autoAddedLoggers.remove(logger);
	}
	
	private SimulationLoggerManager()
	{
		simulationManager = SimulationManager.getManager();
		startup();
	}
	
	
	void startup()
	{
		simulationManager.addSimulationManagerListenerSync(this);
		fireListenerEvent(LOGGER_EVENTS.LOGGER_MANAGER_STARTED, null);
	}
	
	public Collection<SimulationLogger> getLoggersForSimulation(ISimulation simulation)
	{
		if (simulation == null) {
			return null;
		}
		List<LoggerAdapter> adapters = loggers.get(simulation);
		
		List<SimulationLogger> loggers2 = new ArrayList<SimulationLogger>();
		if (adapters != null) {
			for (LoggerAdapter adapter : adapters) {
				loggers2.add(adapter.getLogger());
			}
		}
		
		return Collections.unmodifiableCollection(loggers2);
	}
	
	
	public void addListener(ISimulationLoggerManagerListener listener)
	{
		listeners.add(listener);
	}
	
	public void removeListener(ISimulationLoggerManagerListener listener)
	{
		listeners.remove(listener);
	}
	
	protected void fireListenerEvent(LOGGER_EVENTS event, Object[] targets)
	{
		for (ISimulationLoggerManagerListener listener : listeners) {
			listener.simulationLoggerEvent(event, targets);
		}
	}
	
	
	public void shutdown()
	{
		List<ISimulation> tempList = new LinkedList<ISimulation>();
		tempList.addAll(loggers.keySet());
		
		for (ISimulation simulation : tempList) {
			handleRemovedSimulation(simulation);
		}

		tempList.clear();
		
		fireListenerEvent(LOGGER_EVENTS.LOGGER_MANAGER_STOPPED, null);
		listeners.clear();
	}
	
	
	public void simulationsChangedSync(SimulationManagerEvent event) 
	{			
		for (ISimulation removedSimulation : event.getSimulationsRemoved()) {
			handleRemovedSimulation(removedSimulation);
		}
		
		if (event.getSimulationsRemoved().length > 0) {
			fireListenerEvent(LOGGER_EVENTS.SIMULATIONS_REMOVED, event.getSimulationsRemoved());
		}
		
		for (ISimulation addedSimulation : event.getSimulationsAdded()) {
			handleAddedSimulation(addedSimulation);
		}
		
		if (event.getSimulationsAdded().length > 0) {
			fireListenerEvent(LOGGER_EVENTS.SIMULATIONS_ADDED, event.getSimulationsAdded());
		}

	}
	
	private LoggerAdapter handleAddedLogger(ISimulation simulation, SimulationLogger logger)
	{
		LoggerAdapter wrapper = new LoggerAdapter(simulation, (SimulationLogger)EcoreUtil.copy(logger));			
		wrapper.fireLoggerEvent(LOGGER_EVENTS.LOGGER_STARTED);
		
		if (logger instanceof AsynchronousLogger) {
			simulation.addSimulationListener(wrapper, true);
		} else {
			simulation.addSimulationListenerSync(wrapper, true);
		}
		
		return wrapper;
	}
	
	
	public void addLoggerToSimulation(ISimulation simulation, SimulationLogger logger)
	{
		if (simulation != null && logger != null) {
			List<LoggerAdapter> simulationLoggers = loggers.get(simulation);
			
			if (simulationLoggers == null) {
				return;
			}
			
			LoggerAdapter adapter = handleAddedLogger(simulation, logger);
			simulationLoggers.add(adapter);
			
			fireListenerEvent(LOGGER_EVENTS.SIMULATIONS_ADDED, new Object[] {adapter});
			
		}
	}
	
	private void handleAddedSimulation(ISimulation simulation)
	{
		List<LoggerAdapter> simulationLoggers = new ArrayList<LoggerAdapter>();
		loggers.put(simulation, simulationLoggers);
		
		// First add loggers defined in the underlying scenario
		for (Logger logger : simulation.getScenario().getLoggers()) {
			if (logger instanceof SimulationLogger) {
				simulationLoggers.add(handleAddedLogger(simulation, (SimulationLogger)logger));
			}
		}

		// Next add loggers defined to be auto-added by the manager
		for (SimulationLogger logger : autoAddedLoggers) {
			simulationLoggers.add(handleAddedLogger(simulation, logger));
		}
	}
	
	private void handleRemovedSimulation(ISimulation simulation)
	{
		List<LoggerAdapter> simulationLoggers = loggers.get(simulation);
		if (simulationLoggers != null) {
			
			synchronized (simulationLoggers) {
				for (Iterator<LoggerAdapter> iter = simulationLoggers.iterator(); iter.hasNext(); ) {
					LoggerAdapter wrapper = iter.next();
					simulation.removeSimulationListener(wrapper);
					simulation.removeSimulationListenerSync(wrapper);
					wrapper.fireLoggerEvent(LOGGER_EVENTS.LOGGER_STOPPED);
					wrapper.destroy();
					iter.remove();
				}
			}

			loggers.remove(simulation);
		}
	}
	
}
