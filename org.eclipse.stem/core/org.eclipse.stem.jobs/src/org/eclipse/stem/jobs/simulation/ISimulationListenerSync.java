// ISimulationListener.java
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

import org.eclipse.stem.jobs.execution.IExecutableListenerSync;

/**
 * This interface is implemented by classes that want to listen to events
 * generated by a {@link Simulation}. The thread running the {@link Simulation}
 * will wait until the {@link #simulationChangedSync(SimulationEvent)} method
 * returns before it continues execution.
 * 
 * @see ISimulation
 */
public interface ISimulationListenerSync extends IExecutableListenerSync {
	/**
	 * @param event
	 *            the event that records what happened to the {@link Simulation}.
	 */
	void simulationChangedSync(SimulationEvent event);
} // ISimulationListenerSync