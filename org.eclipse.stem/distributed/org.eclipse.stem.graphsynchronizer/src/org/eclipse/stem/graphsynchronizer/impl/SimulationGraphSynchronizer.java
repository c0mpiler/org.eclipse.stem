package org.eclipse.stem.graphsynchronizer.impl;

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


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.graphsynchronizer.Activator;
import org.eclipse.stem.graphsynchronizer.Messenger;
import org.eclipse.stem.graphsynchronizer.MessengerException;
import org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationListenerSync;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.stem.jobs.simulation.SimulationState;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;

/** 
 * This class is responsible for synchronizing a STEM simulation across multiple running STEM instances. 
 * It uses the underlying Messenger to send and receive subgraph changes to other worker nodes.
 * 
 *
 */

public class SimulationGraphSynchronizer implements ISimulationListenerSync{

	public final static long RETRY_WAIT = 1000; //ms
	public final static int MAX_SEND_RETRIES = 60; // one minute
	
	/**
	 * EMF Save Options
	 */
	private static final Map<String,Object> EMF_SERIALIZATION_OPTIONS 
		= new HashMap<String,Object>();
	static {
//		EMF_SERIALIZATION_OPTIONS.put(XMLResource.OPTION_ENCODING, "UTF-8");
		EMF_SERIALIZATION_OPTIONS.put(XMLResource.OPTION_ZIP, Boolean.FALSE); // Change to Boolean.FALSE to turn compression of XMI data over network.
	}
	
	public static Messenger messenger;
		
	/**
	 *  The graphs that is shared with other running instances. The index into this array 
	 *  is important. If for instance the node rank of this instance is 3 out of a total number
	 *  of nodes 5, index 0-2 are the nodes with rank 0-2 and index 3 is the node with rank 4.
	 */
	
	private static Graph [] mySharedGraphs;
	
	/**
	 *  Remote graphs received from other running instances. The index follows the same
	 *  rule as for mySharedGraphs.
	 */
	private static Graph [] remoteSharedGraphs;

	// Whether to use binary serialization
	public static boolean BINARYSERIALIZATION;
	// Whether to zip the messages
	public static boolean ZIPMESSAGES;
	
	
	/**
	 * Instrumentation
	 */
	private long totalSendTime = 0;
	private long totalRecvTime = 0;
	private long totalTime = 0;
	
	
	private ISimulation simulation;
	public SimulationGraphSynchronizer(ISimulation sim) {	
		this.simulation = sim;

		SynchGraphPartitioner sgp =  (SynchGraphPartitioner)SimulationManager.getManager().getGraphPartitioner();
		// Clear out from old simulation
		mySharedGraphs = new Graph[sgp.getNumNodes()-1];
		remoteSharedGraphs = new Graph[sgp.getNumNodes()-1];
			
		if(ZIPMESSAGES)
			EMF_SERIALIZATION_OPTIONS.put(XMLResource.OPTION_ZIP, Boolean.TRUE);
		else
			EMF_SERIALIZATION_OPTIONS.put(XMLResource.OPTION_ZIP, Boolean.FALSE);
		
		if(!BINARYSERIALIZATION)
			EMF_SERIALIZATION_OPTIONS.put(XMLResource.OPTION_ENCODING, "UTF-8");
	}
	
	boolean busy = false;
	int cycle = 0;
	/**
	 * Called by the Simulation whenever the state of a simulation changes. We are interested in the the COMPLETED_CYCLE
	 * event since that's where the graphs are synchronized.
	 */
	public void simulationChangedSync(SimulationEvent event) {
		// Initialize with the current simulation. If this has already been done, the method will return right away
		((SynchGraphPartitioner)SimulationManager.getManager().getGraphPartitioner()).initialize(this.getSimulation());
		
		// At the end of a cycle, we send the graphs around
		if(event.getSimulationState().equals(SimulationState.RUNNING)) {
			
		}
		if(event.getSimulationState().equals(SimulationState.COMPLETED_CYCLE)) {
			if(cycle == 1) { // first cycle has lots of overhead, skip
				totalTime = System.currentTimeMillis(); // resets it
				totalSendTime = 0;
				totalRecvTime = 0;
			}
			++cycle;
			if(((SynchGraphPartitioner) SimulationManager.getManager().getGraphPartitioner()).getNumNodes() == 1) return; // nothing to do
			
			
			if(busy) {
				Activator.logError("Error received re-entrant callback in graph synchronizer", new Exception()); //$NON-NLS-1$
				busy = false;
				return;
			}
			busy = true;

			// Instrumentation
//			long now = System.currentTimeMillis();
			
			EList<Decorator>el = simulation.getScenario().getCanonicalGraph().getDecorators();
			
			// We only synchronize the decorators that calculates deltas, those would
			// be instances of IntegrationDecorator;
			
			EList<Decorator> idecorators = new BasicEList<Decorator>();
			
			for(Decorator d:el)
				if(d instanceof IntegrationDecorator) idecorators.add(d);
			
			if(mySharedGraphs[0] == null) initSharedGraph(idecorators);
			
			// Copy the latest values from the graph labels to the shared graphs
			for(Graph graph:mySharedGraphs)
				for(Map.Entry<URI, NodeLabel>entry : graph.getNodeLabels().entrySet()) {
					URI uri = entry.getKey();
					NodeLabel latestVal = simulation.getScenario().getCanonicalGraph().getNodeLabels().get(uri);
					if(latestVal == null)
						Activator.logError("Cannot find node label with URI "+uri, new Exception());
					else (((IntegrationLabelValue)entry.getValue().getCurrentValue())).set((IntegrationLabelValue)(latestVal.getCurrentValue()));
				}
			
			// Now send the updated graph
			long now = System.currentTimeMillis();
			for(int n=0;n<mySharedGraphs.length;++n) 
				sendGraph(mySharedGraphs[n], n);
			long then = System.currentTimeMillis();
			
			totalSendTime += (then-now);
			// and receive the update from the other running instance
			now = System.currentTimeMillis();
			for(int n=0;n<mySharedGraphs.length;++n) 		
				remoteSharedGraphs[n] = receiveGraph(n);
			then = System.currentTimeMillis();
			totalRecvTime += (then-now);
			// and update local label values from the remote values
			// Copy the latest values from the graph labels to the shared graph
			for(Graph graph:remoteSharedGraphs) {
				if(graph == null) break; // Null value means the simulation was stopped 
				for(Map.Entry<URI, NodeLabel>entry : graph.getNodeLabels().entrySet()) {
					URI uri = entry.getKey();
					NodeLabel latestVal = simulation.getScenario().getCanonicalGraph().getNodeLabels().get(uri);
					if(latestVal == null)
						Activator.logError("Cannot find node label with URI "+uri, new Exception());
					else {
						// Need to set both current and temp value since this instance will only set the temp
						// value to the current value for the nodes it manages.
						((IntegrationLabelValue)(latestVal.getCurrentValue())).set(((IntegrationLabelValue)entry.getValue().getCurrentValue()));
						((IntegrationLabelValue)((IntegrationLabel)latestVal).getTempValue()).set(((IntegrationLabelValue)entry.getValue().getCurrentValue()));
					}
				}
			}
//			long then = System.currentTimeMillis();
//			this.totalCommTime += (then - now);
		} else if(event.getSimulationState().equals(SimulationState.STOPPED)) {
			try {
				messenger.wakeupBlockedRecv();
			} catch(MessengerException me) {
				Activator.logError("Cannot wake up blocked recv", me);
			}
		} else if(event.getSimulationState().equals(SimulationState.PAUSED)) {
			totalTime = System.currentTimeMillis() - totalTime;
			Activator.logInformation("Total send time:"+this.totalSendTime);
			Activator.logInformation("Total recv time:"+this.totalRecvTime);
			Activator.logInformation("Total simulation time:"+this.totalTime);
		}
		busy = false;
	}

	public ISimulation getSimulation() {
		return simulation;
	}
	
	/**
	 * This is an important method where the graphs (containing a list of dynamic node labels) are calculated
	 * for each remote server this instance is communicating with. The mySharedGraphs array is populated
	 * with the graph. 
	 * 
	 * @param idecorators
	 */
	@SuppressWarnings("unlikely-arg-type")
	private void initSharedGraph(EList<Decorator>idecorators) {
		
		
		// Get the graph partitioner
		SynchGraphPartitioner gp =(SynchGraphPartitioner)SimulationManager.getManager().getGraphPartitioner();
		
		for(int i=0;i<gp.getNumNodes()-1;++i) {
			mySharedGraphs[i] = GraphFactory.eINSTANCE.createGraph();
			// Clear out all unnecessary data to reduce size
			mySharedGraphs[i].setDublinCore(null);
			mySharedGraphs[i].setTime(null);
			mySharedGraphs[i].setURI(null);
			mySharedGraphs[i].setTypeURI(null);
		}
		
		for(Decorator d:idecorators) {
			EList<DynamicLabel>myLabels = gp.partitionDecoratorLabels(d);

			// Retrieve the node edges and see if it points outside the update set
			// for this decorator. If so, we add the label to the shared set
			for(DynamicLabel dl:myLabels) {
				if(dl.getIdentifiable() instanceof Node) { // Always true but be safe
					Node n = (Node)dl.getIdentifiable();
					EList<Edge>edges = n.getEdges();
					for(Edge e:edges) {
						if(e.getLabel() instanceof RelativePhysicalRelationshipLabel) 
							continue;	
						Node otherNode = null;
						// See if the edge connects in any way to a node that is outside the working set
						// of this instance.
						if(gp.getNodeRank() != gp.getIdentifiableRank(e.getB())) otherNode = e.getB();
						if(gp.getNodeRank() != gp.getIdentifiableRank(e.getA())) otherNode = e.getA();
						
						if(otherNode != null) {
							int otherRank = gp.getIdentifiableRank(otherNode);
							// We clone the label so we can get rid of 
							// label values not needed, reducing the size
							// of the sent graph
							DynamicLabel cloneLabel = (DynamicLabel)EcoreUtil.copy(dl);
							// Remember to detach from parent or we'll get duplicate node labels
							((Node)cloneLabel.getIdentifiable()).getLabels().remove(cloneLabel);
							if(cloneLabel instanceof IntegrationLabel) {
								// clean out unnecessary  data
								cloneLabel.setDublinCore(null); // We don't need to pass Dublin core.
								((IntegrationLabel)cloneLabel).setDeltaValue(null);
								((IntegrationLabel)cloneLabel).setTempValue(null);
								((IntegrationLabel)cloneLabel).setProbeValue(null);
								((IntegrationLabel)cloneLabel).setErrorScale(null);
								((IntegrationLabel)cloneLabel).setNextValue(null);
								cloneLabel.setDecorator(null);
								cloneLabel.setIdentifiable(null);
								cloneLabel.setTypeURI(null);
								cloneLabel.setURIOfIdentifiableToBeLabeled(null);	
								
								// Special cleaning
								if(cloneLabel instanceof StandardPopulationModelLabel) {
									((StandardPopulationModelLabel)cloneLabel).setPopulationIdentifier(null);
									((StandardPopulationModelLabel)cloneLabel).setPopulationLabel(null);
								}
								if(cloneLabel instanceof DiseaseModelLabel) {
									((DiseaseModelLabel)cloneLabel).setPopulationModelLabel(null);
									((DiseaseModelLabel)cloneLabel).setPopulationLabel(null);
								}
					
							}
//							Activator.logInformation("Adding "+cloneLabel.getURI()+" to shared graph");
							
							// Make sure we get the right graph. For instance, a node 1 communicating with node
							// 2 and 0 will have two graphs. Node 0 goes in index 0, and Node 2 goes in index 1.
							int index = (otherRank >= mySharedGraphs.length)? otherRank-1:otherRank; 
							mySharedGraphs[index].getNodeLabels().put(cloneLabel.getURI(), (NodeLabel)cloneLabel);
						}
					}
				}
			}
		}
		for(int i=0;i<gp.getNumNodes()-1;++i) 
			Activator.logInformation("Shared graph "+i+" is size "+mySharedGraphs[i].getNodeLabels().keySet().size());
	}
	
	
	

	private void sendGraph(Graph g, int nodeRank) {
		try {
			URI tmpFileURI = URI.createURI("platform:/tmp.xmi"); // does it matter?
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			Utility.serializeIdentifiableToStream(g, tmpFileURI, baos, EMF_SERIALIZATION_OPTIONS, BINARYSERIALIZATION);
			
			int retries = 0;
			do {
				// send it
				try {
					messenger.sendMsg(baos.toByteArray(), nodeRank);
					break;
				} catch(MessengerException me) {
					// A connection was probably refused. Retry until the connection is available or maximum retries have been exceeded.
					try {
						Thread.sleep(RETRY_WAIT);
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			} while(retries++ < MAX_SEND_RETRIES);
			if(retries >= MAX_SEND_RETRIES)
				throw new MessengerException("Unable to send message to node "+nodeRank+", retried "+MAX_SEND_RETRIES+" times", new Exception());
		} catch(MessengerException me) {
			Activator.logError("Exception caught sending message to node "+nodeRank, me);
		} catch(IOException io) {
			Activator.logError("Exception caught seralizing message",io);
		}
	}
	
	private Graph receiveGraph(int nodeRank) {
		byte [] xmi = null;
		try {
			xmi = messenger.recvMsg(nodeRank);
		} catch(MessengerException me) {
			Activator.logError("Exception caught receiving data from node "+nodeRank, me);
			return null;
		}
		if(xmi == null) return null; // Null value is returned when the blocked listener is forced to wake up, e.g. when the simulation stops.
		ByteArrayInputStream bais = new ByteArrayInputStream(xmi);
		URI tmpFileURI = URI.createURI("platform:/tmp.xmi"); // does it matter?
		Graph g = (Graph)Utility.getIdentifiableFromStream(tmpFileURI, bais, EMF_SERIALIZATION_OPTIONS, BINARYSERIALIZATION);
		if(g == null) 
			Activator.logError("Recieved null graph from "+nodeRank, new Exception()); //$NON-NLS-1$
		return g;
	}
}
