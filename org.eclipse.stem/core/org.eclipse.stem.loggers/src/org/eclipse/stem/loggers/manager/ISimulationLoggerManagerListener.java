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

import org.eclipse.stem.loggers.LOGGER_EVENTS;

/**
 * Interface for classes that want to monitor events
 * in the simulation logger.
 */
public interface ISimulationLoggerManagerListener
{
	/**
	 * Callback for changes in state on the simulation logger manager.  This includes
	 * the addition and removal of simulations from monitoring.
	 * 
	 * @param event The simulation logger manager event
	 * @param targets The targets affected by this state change
	 */
	public void simulationLoggerEvent(LOGGER_EVENTS event, Object[] targets);
}
