// ISimulationManagerListener.java
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

import org.eclipse.stem.jobs.execution.IExecutableManagerListenerSync;

/**
 * This interface is implemented by classes that want to be informed of events
 * generated by a {@link SimulationManager}. The thread running the
 * {@link SimulationManager} will wait until the
 * {@link #simulationsChangedSync(SimulationManagerEvent)} method returns before
 * it continues execution.
 * 
 * @see SimulationManager
 * @see Simulation
 */
public interface ISimulationManagerListenerSync extends
		IExecutableManagerListenerSync {
	/**
	 * @param event
	 *            the event that records what happened to the manager.
	 */
	void simulationsChangedSync(SimulationManagerEvent event);
} // ISimulationManagerListenerSync
