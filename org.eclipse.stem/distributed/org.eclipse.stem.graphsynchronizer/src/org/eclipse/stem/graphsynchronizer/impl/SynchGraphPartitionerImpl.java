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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.impl.GraphPartitionerImpl;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.geography.names.GeographicMapper;
import org.eclipse.stem.graphsynchronizer.Activator;
import org.eclipse.stem.graphsynchronizer.GraphsynchronizerPackage;
import org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner;
import org.eclipse.stem.graphsynchronizer.util.GlobalTileGenerator;
import org.eclipse.stem.jobs.simulation.ISimulation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synch Graph Partitioner</b></em>'. This class subdivides the graphs
 * among multiple running instances of STEM. The algorithm attempts to minimize the "surface" (# of edges) and maximize 
 * the volume (# of nodes) for each running instance, while also keeping the volume approximately the same for each
 * running instance.
 * 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphsynchronizer.impl.SynchGraphPartitionerImpl#getNumNodes <em>Num Nodes</em>}</li>
 *   <li>{@link org.eclipse.stem.graphsynchronizer.impl.SynchGraphPartitionerImpl#getNodeRank <em>Node Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchGraphPartitionerImpl extends GraphPartitionerImpl implements SynchGraphPartitioner {
	
	/**
	 * This map stores for each decorator, another map where the key is the processor ID and the value is the labels updated by that processor.
	 * -1 is a special key containing all labels updated by the decorator
	 */
	protected Map<Decorator, Map<Integer, EList<DynamicLabel>>> decoratorProcessorNumberLabelMap = new HashMap<Decorator, Map<Integer, EList<DynamicLabel>>>();

	
	/**
	 * The default value of the '{@link #getNumNodes() <em>Num Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_NODES_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getNumNodes() <em>Num Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumNodes()
	 * @generated
	 * @ordered
	 */
	protected int numNodes = NUM_NODES_EDEFAULT;
	/**
	 * The default value of the '{@link #getNodeRank() <em>Node Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeRank()
	 * @generated
	 * @ordered
	 */
	protected static final int NODE_RANK_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNodeRank() <em>Node Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeRank()
	 * @generated
	 * @ordered
	 */
	protected int nodeRank = NODE_RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchGraphPartitionerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphsynchronizerPackage.Literals.SYNCH_GRAPH_PARTITIONER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumNodes() {
		return numNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumNodes(int newNumNodes) {
		int oldNumNodes = numNodes;
		numNodes = newNumNodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NUM_NODES, oldNumNodes, numNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodeRank() {
		return nodeRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeRank(int newNodeRank) {
		int oldNodeRank = nodeRank;
		nodeRank = newNodeRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NODE_RANK, oldNodeRank, nodeRank));
	}

	

	/**
	 * Override to clear map
	 */
	@Override
	public void setNumProcesses(int newNumProcesses) {
		if(getNumProcesses() != newNumProcesses) 
			decoratorProcessorNumberLabelMap.clear();
		super.setNumProcesses(newNumProcesses);
	}
	
	private ISimulation currentSimulation;

	private HashMap<String, Integer> rankCache = new HashMap<String, Integer>();

	
	/**
	 * initialize the partitioner from a simulation
	 * 
	 * @param s ISimulation
	 */
	public void initialize(ISimulation s) {
		if(s.equals(currentSimulation)) return; // done
		
		//HashSet<String>countries = new HashSet<String>();
		HashMap<String, Set<String>> nodeIdMap = new HashMap<String, Set<String>>();
		
		Graph g = s.getScenario().getCanonicalGraph();
		EMap<URI, Node>nodes = g.getNodes();
		for(Entry<URI, Node> entry : nodes.entrySet()) {
			Node n = entry.getValue();		
			String id = n.getURI().lastSegment();
			String ctry = getCountry(id);
			if(ctry != null &&  nodeIdMap.containsKey(ctry))  // It's a country
				nodeIdMap.get(ctry).add(id);
			else if(ctry != null &&  !nodeIdMap.containsKey(ctry)) {
				HashSet<String>ids = new HashSet<String>();
				ids.add(id);
				nodeIdMap.put(ctry, ids);
			}
		}
		
		Set<String[]> commonBorderIdPairsSet = new HashSet<String[]>();
		
		for(Entry<URI, Edge> entry:g.getEdges()) {
			Edge e = entry.getValue();
			if(e.getLabel() instanceof RelativePhysicalRelationshipLabel) 
				continue;	// skip
			String [] st = new String[2];
			if(e.getA() != null && e.getB() != null) {
				st[0] = e.getA().getURI().lastSegment();
				st[1] = e.getB().getURI().lastSegment();
				commonBorderIdPairsSet.add(st);
			}
		}
		// Now determine the partitioning using Jamie's algorithm
		
		
		GlobalTileGenerator gtg = new GlobalTileGenerator(this.getNumNodes(), nodeIdMap, commonBorderIdPairsSet);
		
		List<Set<String>>partitionedNodes = gtg.getParitionedNodes();
		
		int rank = 0;
		for(Set<String> allIds:partitionedNodes) {
			for(String id:allIds) 
				rankCache.put(id, rank);
			++rank;
		}
		currentSimulation = s;
	}
	
		/**
		 * Return the country a given id is inside
		 * @param id 2 or 3 letter admin code
		 * @return
		 */
	private String getCountry(String id) {
		if(Utility.keyLevel(id) == 0 ) // It's a country
			return id;
		else if(Utility.keyLevel(id) == -1 ) // ZZZ
			 return id;
		else {
			// It's higher admin than level 0. We need to find the country the code is in
			String ctrcode = GeographicMapper.getAlpha3(id.substring(0, 2));
			return ctrcode;
		}
	}
	
	/**
	 * 
	 */
	@Override
	public EList<DynamicLabel> partitionDecoratorLabels(Decorator decorator, int processRank) {
		synchronized(decoratorProcessorNumberLabelMap) {

			if(decoratorProcessorNumberLabelMap != null && decoratorProcessorNumberLabelMap.containsKey(decorator)  &&
					decoratorProcessorNumberLabelMap.get(decorator).containsKey(processRank)) {
				EList<DynamicLabel> res = decoratorProcessorNumberLabelMap.get(decorator).get(processRank);
				return res;
			}

			synchronized(this) {
				EList<DynamicLabel> temp = new BasicEList<DynamicLabel>(); 

				// Find the node and partition the labels according to their node.

				// TreeSet guarantees O(log(n)) add/contains
				TreeSet<String>nodeURIs = new TreeSet<String>();

				for(DynamicLabel lab:decorator.getLabelsToUpdate()) {
					String uri = lab.getIdentifiable().getURI().toString();
					if(!nodeURIs.contains(uri) && 
							getNodeRank() == getIdentifiableRank(lab.getIdentifiable()))  
						nodeURIs.add(uri);
				}

				// Use the hash for the URI modulo the number of processors. This ensures
				// that the a node is assigned to the same thread no matter which
				// decorator is updating it.
				
				TreeSet<String>myURIs = new TreeSet<String>();
				
				for(String uri:nodeURIs)  {
					if(Math.abs(uri.hashCode() % getNumProcesses()) == processRank)
						myURIs.add(uri);
				}
				for(DynamicLabel dl:decorator.getLabelsToUpdate()) {
					if(myURIs.contains(dl.getIdentifiable().getURI().toString())) {
						temp.add(dl);
					} 
				}

				Map<Integer, EList<DynamicLabel>> partitionMap = null;

				if(decoratorProcessorNumberLabelMap.containsKey(decorator))
					partitionMap = decoratorProcessorNumberLabelMap.get(decorator);
				else {
					partitionMap = new HashMap<Integer, EList<DynamicLabel>>();
					decoratorProcessorNumberLabelMap.put(decorator, partitionMap);
				}
				partitionMap.put(processRank, temp);
				Activator.logInformation("Decorator decorator updates "+temp.size()+" labels");
				return temp;
			}
		}
	}

	/**
	 * Same as above but return all labels handled by this decorator on this node
	 */
	@Override
	public EList<DynamicLabel> partitionDecoratorLabels(Decorator decorator) {
		if(decoratorProcessorNumberLabelMap != null && decoratorProcessorNumberLabelMap.containsKey(decorator)  &&
				decoratorProcessorNumberLabelMap.get(decorator).containsKey(-1)) { // -1 is special key, it means all labels
			EList<DynamicLabel> res = decoratorProcessorNumberLabelMap.get(decorator).get(-1);
			return res;
		}
		
		synchronized(this) {
			EList<DynamicLabel> temp = new BasicEList<DynamicLabel>(); 
				
			// Find the node and partition the labels according to their node.
			
			ArrayList<String>nodeURIs = new ArrayList<String>();
			for(DynamicLabel lab:decorator.getLabelsToUpdate()) {
				String uri = lab.getIdentifiable().getURI().toString();
				if(!nodeURIs.contains(uri) && 
						getNodeRank() == getIdentifiableRank(lab.getIdentifiable())) 
					temp.add(lab);
			}
						
			Map<Integer, EList<DynamicLabel>> partitionMap = null;
			
			if(decoratorProcessorNumberLabelMap.containsKey(decorator))
				partitionMap = decoratorProcessorNumberLabelMap.get(decorator);
			else {
				partitionMap = new HashMap<Integer, EList<DynamicLabel>>();
				decoratorProcessorNumberLabelMap.put(decorator, partitionMap);
			}
			partitionMap.put(-1, temp);
			return temp;
		}
	}
	
	
	/**
	 * Given an identifiable, return the rank (node number) where the identifiable
	 * is managed.
	 * 
	 * @generated NOT
	 */
	public int getIdentifiableRank(Identifiable identifiable) {
		String key = identifiable.getURI().lastSegment();
		if(rankCache.containsKey(key)) 
			return rankCache.get(key);
		
		Activator.logError("Unable to find server rank for node "+key+". Assigning to first server", new Exception());
		return 0;
		// Random
//		int hash = identifiable.getURI().toString().hashCode();
//		hash = Math.abs(hash);
//		int node = hash % getNumNodes();
//		return node;

		// USA Mexico
//		if((identifiable.getURI().lastSegment().startsWith("MX") || identifiable.getURI().lastSegment().startsWith("MEX"))) return 1; 
//		return 0; // everything else is on the first node.
	}


	
	
	/**
	 *  Check if the identifiable passed in is managed by this STEM instance
	 */
	@Override
	public boolean isManaged(Identifiable identifiable) {
		return this.getNodeRank() == this.getIdentifiableRank(identifiable);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NUM_NODES:
				return getNumNodes();
			case GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NODE_RANK:
				return getNodeRank();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NUM_NODES:
				setNumNodes((Integer)newValue);
				return;
			case GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NODE_RANK:
				setNodeRank((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NUM_NODES:
				setNumNodes(NUM_NODES_EDEFAULT);
				return;
			case GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NODE_RANK:
				setNodeRank(NODE_RANK_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NUM_NODES:
				return numNodes != NUM_NODES_EDEFAULT;
			case GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER__NODE_RANK:
				return nodeRank != NODE_RANK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numNodes: ");
		result.append(numNodes);
		result.append(", nodeRank: ");
		result.append(nodeRank);
		result.append(')');
		return result.toString();
	}

} //SynchGraphPartitionerImpl
