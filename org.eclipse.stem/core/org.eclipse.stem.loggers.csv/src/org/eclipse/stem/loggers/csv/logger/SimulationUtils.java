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
package org.eclipse.stem.loggers.csv.logger;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.jobs.simulation.SimulationManager;

/**
 * Helper methods for simulation-specific operations in the logger
 *
 */
public class SimulationUtils
{

	/**
	 * Return all nodes and their corresponding level. We use this to log data using 
	 * different resolutions.
	 * 
	 * @param simulation
	 * @return Map with node and level
	 */
	public static Map<Node, Integer> getNodeLevelsForScenario(Scenario scenario) {
		Map<Node, Integer> result = new HashMap<Node, Integer>();
		final Graph graph = scenario.getCanonicalGraph();
		if (graph != null) {
			final EMap<URI,Node> allNodes = graph.getNodes();
		    for (URI uri : allNodes.keySet()) {
		    	Node node = allNodes.get(uri);
		    	
		    	// Fix for distributed STEM. Only log nodes
		    	// that are managed by this instance
		    	if(!SimulationManager.getManager().getGraphPartitioner().isManaged(node)) {
		    		continue;
		    	}
		    	
		    	// Bug fix. Make sure the node has labels
		    	if(node.getLabels().size() == 0) {
		    		continue;
		    	}
		    	String id = node.getURI().toString();
		    	int level = getAdminLevel(id);
		    	result.put(node, level);
		    }
		} // graph not null
		return result;
	}
	
	public static int getAdminLevel(String uriKey) {
		int retVal = 0;
		String test = uriKey;
		while(test.contains("-")) { //$NON-NLS-1$
			retVal ++;
			int idx1 = test.indexOf("-"); //$NON-NLS-1$
			String test2 = test.substring(idx1+1, test.length());
			test = test2;
		}
		return retVal;
	}
}
