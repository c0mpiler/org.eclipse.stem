package org.eclipse.stem.graphsynchronizer;

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


import java.util.ArrayList;

import org.eclipse.stem.graphsynchronizer.impl.SimulationGraphSynchronizer;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationManagerListenerSync;
import org.eclipse.stem.jobs.simulation.SimulationManagerEvent;

/**
 * This class registeres with the SimulationManager and is notified whenever a new simulation is started
 * or stopped. It instantiates a new GraphSynchronizer that will synchronizer the running simulation
 * with other running STEM instances.
 * 
 */
public class SimulationManagerDelegate implements ISimulationManagerListenerSync {

	private ArrayList<SimulationGraphSynchronizer> synchronizers = new ArrayList<SimulationGraphSynchronizer>();
	
	public void simulationsChangedSync(SimulationManagerEvent event) {
		Activator.logInformation("Simulation Changed "+event);
		ISimulation [] simsAdded = event.getSimulationsAdded();
		ISimulation [] simsRemoved = event.getSimulationsRemoved();
		
		if(simsAdded != null && simsAdded.length > 0) {
			for(int i=0;i<simsAdded.length;++i) {
				SimulationGraphSynchronizer newSync = new SimulationGraphSynchronizer(simsAdded[i]);
				synchronizers.add(newSync);
				
				
				// MAD 20-June-2011
				// Removing Simulation Adapter
				// We need to work around the ugly simulation callbacks that are forced by the
				// simulation manager. All callbacks goes via the simulation manager and forces 
				// the UI thread to be used. We don't want to use the UI thread so we'll register directly with the 
				// simulation
				//SimulationManager.SimulationAdapter adaptedSim = (SimulationManager.SimulationAdapter)simsAdded[i];			
				//adaptedSim.getSimulation().addSimulationListenerSync(newSync);
				
				simsAdded[i].addSimulationListenerSync(newSync, true);
				
			}
		}
		
		ArrayList<SimulationGraphSynchronizer> remove  = new ArrayList<SimulationGraphSynchronizer>();
		if(simsRemoved != null && simsRemoved.length > 0) {
			for(int i=0;i<simsRemoved.length;++i)
				for(int j=0;j<synchronizers.size();++j)  {
					if(synchronizers.get(j).getSimulation().equals(simsRemoved[i])) {
						remove.add(synchronizers.get(j));
						simsRemoved[i].removeSimulationListenerSync(synchronizers.get(j));
					}
				}
			
			for(SimulationGraphSynchronizer sgs:remove)
				synchronizers.remove(sgs);
		}
	}
}
