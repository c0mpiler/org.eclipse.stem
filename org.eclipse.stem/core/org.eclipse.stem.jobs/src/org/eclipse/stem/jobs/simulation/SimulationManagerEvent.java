// SimulationManagerEvent.java
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

/**
 * This class represents an event that has occurred in the operation of the
 * SimulationManager
 * 
 * @see SimulationManager
 * @see ISimulationManagerListener
 */
public class SimulationManagerEvent extends EventObject {

	/**
	 * Generated serialization ID
	 */
	transient private static final long serialVersionUID = 6533682842547235809L;

	/**
	 * This is a collection of the Simulations added to the manager.
	 */
	transient private final ISimulation[] simulationsAdded;

	/**
	 * This is a collection of the Simulations removed from the
	 * SimulationManager.
	 */
	transient private final ISimulation[] simulationsRemoved;

	/**
	 * @param source
	 *            the source of the event
	 * @param simulationsAdded
	 *            the collection of Simulations added to the manager
	 * @param simulationsRemoved
	 *            the collection of Simulations removed from the manager
	 */
	public SimulationManagerEvent(SimulationManager source,
			ISimulation[] simulationsAdded, ISimulation[] simulationsRemoved) {
		super(source);
		this.simulationsAdded = simulationsAdded.clone();
		this.simulationsRemoved = simulationsRemoved.clone();
	} // SimulationManagerEvent

	/**
	 * @return the simulationsAdded
	 */
	public final ISimulation[] getSimulationsAdded() {
		return simulationsAdded.clone();
	}

	/**
	 * @return the simulationsRemoved
	 */
	public final ISimulation[] getSimulationsRemoved() {
		return simulationsRemoved.clone();
	}

	/**
	 * @see java.util.EventObject#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Added:["); //$NON-NLS-1$
		for (int i = 0; i < simulationsAdded.length; i++) {
			sb.append("\""); //$NON-NLS-1$
			sb.append(simulationsAdded[i].toString());
			sb.append("\""); //$NON-NLS-1$
			if (i + 1 < simulationsAdded.length) {
				sb.append(", "); //$NON-NLS-1$
			}
		}
		sb.append("], Removed:["); //$NON-NLS-1$
		for (int i = 0; i < simulationsRemoved.length; i++) {
			sb.append("\""); //$NON-NLS-1$
			sb.append(simulationsRemoved[i].toString());
			sb.append("\""); //$NON-NLS-1$
			if (i + 1 < simulationsRemoved.length) {
				sb.append(", "); //$NON-NLS-1$
			}
		}
		sb.append("]"); //$NON-NLS-1$

		return sb.toString();
	} // toString

} // SimulationManagerEvent
