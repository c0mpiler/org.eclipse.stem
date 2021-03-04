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
package org.eclipse.stem.definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue;


/**
 * Utility to extract node keys from a project
 */
public class LocationUtility {

	@SuppressWarnings("unchecked")
	static Map<String, Set<String>> [] treeISOKeyMaps = new Map[4];
	static Map<String, URI> isoKeyURIMap = new HashMap<String, URI>();
	static List<Model> processedModels = new ArrayList<Model>();
	
	static boolean loaded = false;
	
	@SuppressWarnings("unchecked")
	public static void reset() {treeISOKeyMaps = new Map[4];isoKeyURIMap.clear();processedModels.clear();loaded=false;}

	public static Set<String> getKeys(IProject project, int level, String parent) {
		
		if(!loaded) {
			for(int i=0;i<4;++i) treeISOKeyMaps[i] = new HashMap<String, Set<String>>();
			IContainer modelFolder = project.getFolder("models");
			
			IResource[] models = null;
			try {
				models = modelFolder.members();
			} catch(Exception e) {
				e.printStackTrace();
			}
			if (models != null) {
				for(IResource r:models) {
					// ignore system files
					if(r.getName().startsWith(".")) continue;
					
					try {
						URI uri = URI.createURI(r.getLocationURI().toString());
						Identifiable id = Utility.getIdentifiable(uri);
						if(id instanceof Model) processModel((Model)id);
							
					} catch(Exception e) {
						// Skip bad file
					}
				}
			}
		
			IContainer graphsFolder = project.getFolder("graphs");
			IResource[] graphs = null;
			try {
				graphs = graphsFolder.members();
			} catch(Exception e) {
				e.printStackTrace();
			}
			if (graphs != null) {
				for(IResource r:graphs) {
					// ignore system files
					if(r.getName().startsWith(".")) continue;
					
					try {
						URI uri = URI.createURI(r.getLocationURI().toString());
						Identifiable id = Utility.getIdentifiable(uri);
						if(id instanceof Graph) processGraph((Graph)id);
							
					} catch(Exception e) {
						// Skip bad file
					}
			
				}	
			}
			loaded = true;
		}
		
		Set<String>result = null;
		
		if(parent != null) result = treeISOKeyMaps[level-1].get(parent);
		else result = treeISOKeyMaps[level].keySet();
		if(result!= null) 
			return result;
		return new HashSet<String>(); // return empty array
	}
	
	private static void processModel(Model m) {
		processedModels.add(m);
		// First get sub models
		for(Model m2:m.getModels()) 
			if(!processedModels.contains(m2)) processModel(m2);
	
		// To the graphs in the model
		EList<Graph>graphs = m.getGraphs();
		for(Graph g:graphs) 
			processGraph(g);
	}
	
	private static void processGraph(Graph g) {
		// Do the edges first to get the hierarchy
		
		for(Edge e:g.getEdges().values()) {
			if(e.getLabel().getCurrentValue() instanceof RelativePhysicalRelationshipLabelValue) {
				
				int sourceLevel = Utility.keyLevel(e.getNodeAURI().lastSegment());
				int targetLevel = Utility.keyLevel(e.getNodeBURI().lastSegment());
				String sourceKey = e.getNodeAURI().lastSegment();
				String targetKey = e.getNodeBURI().lastSegment();
				
				if(treeISOKeyMaps[sourceLevel].containsKey(sourceKey))
					treeISOKeyMaps[sourceLevel].get(sourceKey).add(targetKey);
				else {
					SortedSet<String>nl = new TreeSet<String>();
					treeISOKeyMaps[sourceLevel].put(sourceKey, nl);
					nl.add(targetKey);
				}
 					
				if(!treeISOKeyMaps[targetLevel].containsKey(targetKey)) {
					// Add with empty child set
					TreeSet<String>nl = new TreeSet<String>();
					treeISOKeyMaps[targetLevel].put(targetKey, nl);
				}
				
				isoKeyURIMap.put(sourceKey, e.getNodeAURI());
				isoKeyURIMap.put(targetKey, e.getNodeBURI());
					
			}
		}
		
		// Now find dangling nodes
		EMap<URI, Node> map = g.getNodes();
		for(URI u:map.keySet()) {
			int l = Utility.keyLevel(u.lastSegment());
			if(l == -1) continue; // no world
			String key = u.lastSegment();
			if(!treeISOKeyMaps[l].containsKey(key)) {
				TreeSet<String>nl = new TreeSet<String>();
				treeISOKeyMaps[l].put(key, nl);
				isoKeyURIMap.put(key, u);
			}			
		}
	}
	
	
	/**
	 * Place the edges from the graph in a Map keyed by the URI of the edge.
	 * This avoids duplicates in case same graph exists in multiple models 
	 * @param project
	 * @return
	 */
	public static Set<Edge> getCommonBorderEdges(IProject project, URI location) {
	    Map<String,Edge> cbEdges = new HashMap<String,Edge>();
	
		IContainer modelFolder = project.getFolder("models");	
		IResource[] models = null;
		try {
			models = modelFolder.members();
		} catch(Exception e) {
			e.printStackTrace();
		}
		if (models != null) {
			for(IResource r:models) {
				// ignore system files
				if(r.getName().startsWith(".")) continue;
				
				try {
					URI uri = URI.createURI(r.getLocationURI().toString());
					Identifiable id = Utility.getIdentifiable(uri);
					Graph g = ((Model)id).getCanonicalGraphNoDecorate(STEMURI.createURI(""), null, null);
					if(id instanceof Model) cbEdges.putAll(getGraphCommonBorderEdges(g, location));
						
				} catch(Exception e) {
					// Skip bad file
				}
			}
		}
	
		// Only do the edges in the graphs folder if the user hasn't specified a
		// location, since we need to resolve the URI's to support locations
		if(location == null || location.toString().trim().equals("")) {
			IContainer graphsFolder = project.getFolder("graphs");
			IResource[] graphs = null;
			try {
				graphs = graphsFolder.members();
			} catch(Exception e) {
				e.printStackTrace();
			}
			if (graphs != null) {
				for(IResource r:graphs) {
					// ignore system files
					if(r.getName().startsWith(".")) continue;
					
					try {
						URI uri = URI.createURI(r.getLocationURI().toString());
						Identifiable id = Utility.getIdentifiable(uri);
						if(id instanceof Graph) cbEdges.putAll(getGraphCommonBorderEdges((Graph)id, location));
							
					} catch(Exception e) {
						// Skip bad file
					}
				}
			}
		}
		Set<Edge> retVal = new HashSet<Edge>();
		retVal.addAll(cbEdges.values());
		return retVal;
	}
	
	/***
	 * Place the edges from the graph in a Map keyed by the URI of the edge.
	 * This avoids duplicates in case same graph exists in multiple models
	 * @param g
	 */
	private static Map<String,Edge> getGraphCommonBorderEdges(Graph g, URI location) {
		
		Map<String,Edge> cbEdges = new HashMap<String,Edge>();
		for(Edge e:g.getEdges().values()) {
			if(e.getLabel().getCurrentValue() instanceof CommonBorderRelationshipLabelValue) {
				String uriKey = e.getURI().lastSegment();
				if(location != null && !location.toString().trim().equals("")  
						&& isSelfOrChild(e.getA(), location.lastSegment()) && isSelfOrChild(e.getB(), location.lastSegment()))
					cbEdges.put(uriKey,e);
				else if(location == null || location.toString().trim().equals(""))
					cbEdges.put(uriKey,e);
			}	
		}
		return cbEdges;
	}//getGraphCommonBorderEdges
	
	/**
	 * Retrieve all nodes in a project
	 * @param project
	 * @param location The parent location
	 * @return Set<Node> All nodes in parent and children
	 */
	public static Set<Node> getNodes(IProject project, URI location) {
	    Set<Node> allNodes = new HashSet<Node>();
	
		IContainer modelFolder = project.getFolder("models");	
		IResource[] models = null;
		try {
			models = modelFolder.members();
		} catch(Exception e) {
			e.printStackTrace();
		}
		if (models != null) {
			for(IResource r:models) {
				// ignore system files
				if(r.getName().startsWith(".")) continue;
				
				try {
					URI uri = URI.createURI(r.getLocationURI().toString());
					Model mod = (Model)Utility.getIdentifiable(uri);
					Graph g = mod.getCanonicalGraphNoDecorate(STEMURI.createURI(""), null, null);
					addGraphNodes(g, allNodes, location);
						
				} catch(Exception e) {
					// Skip bad file
				}
			}
		}
		return allNodes;
	}

	
	
	
	/**
	 * Retrieve all nodes in a project
	 * @param project
	 * @param location The parent location
	 * @return specific Node
	 */
	public static Node getNode(IProject project, URI location) {
		Node retNode = null;
		IContainer modelFolder = project.getFolder("models");	
		IResource[] models = null;
		try {
			models = modelFolder.members();
		} catch(Exception e) {
			e.printStackTrace();
		}
		if (models != null) {
			for(IResource r:models) {
				// ignore system files
				if(r.getName().startsWith(".")) continue;
				
				try {
					URI uri = URI.createURI(r.getLocationURI().toString());
					Model mod = (Model)Utility.getIdentifiable(uri);
					Graph g = mod.getCanonicalGraphNoDecorate(STEMURI.createURI(""), null, null);
					retNode = getGraphNode(g,location);
						
				} catch(Exception e) {
					// Skip bad file
				}
			}
		}
		return retNode;
	}//getNode

	
	
	
	/***
	 * Retrieve all nodes for the location in the graph
	 * @param g
	 * @param allNodes Results are stored here
	 * @param location The location, or null if all nodes should be retrieved
	 */
	private static void addGraphNodes(Graph g, Set<Node>allNodes, URI location) {
		for(Node n:g.getNodes().values()) {
			String uriKey = n.getURI().lastSegment();
			if(location != null && !location.toString().trim().equals("")  
						&& isSelfOrChild(n, location.lastSegment()) &&
						!containsNodeURI(n.getURI(), allNodes))
					allNodes.add(n);
				else if(location == null || location.toString().trim().equals("") && ! allNodes.contains(n)
						&& !containsNodeURI(n.getURI(), allNodes))
					allNodes.add(n);
				
		}
	}//addGraphNodes
	
	
	/**
	 * 
	 * @param g
	 * @param location
	 * @return
	 */
	private static Node getGraphNode(Graph g, URI location) {
		for(Node n:g.getNodes().values()) {
			URI nodeURI = n.getURI();
			
			// TEST CODE
			String uriKey = nodeURI.toString();
			String locKey = location.toString();
			if(nodeURI.equals(location)) {
				return n;
			}
		}
		// ERROR, need to handle....
		return null;
	}//addGraphNodes
	
	private static boolean containsNodeURI(URI uri, Set<Node>nodes) {
		for(Node n:nodes) if(n.getURI().equals(uri)) return true;
		return false;
	}

	
	public static URI getURIFromISOKey(String key) {
		return isoKeyURIMap.get(key);
	}
	
	/**
	 * 
	 * @param n
	 * @param parent
	 * @return
	 */
	protected static boolean isSelfOrChild(Node  n, String parent) {
		if(n.getURI().lastSegment().equals(parent)) return true;
		return hasParent(n, parent);
	}
	
	
	
	protected static boolean hasParent(Node n, String key) {
		for(Edge e:n.getEdges()) {
			// Make sure it's a physical containment edge
			boolean phys = e.getLabel() instanceof RelativePhysicalRelationshipLabel;
			if(!phys) 
				continue;
			if(e.getA().getURI().lastSegment().equals(key)) return true;
			else if(Utility.keyLevel(e.getA().getURI().lastSegment()) < Utility.keyLevel(n.getURI().lastSegment()))
				return hasParent(e.getA(), key);
		}
		return false;
	}
	
	/**
	 * finds all the child nodes of a parent (direct children and children of children etc...)
	 * and returns them in a set. 
	 * Child is defined by a containment relationship
	 * @param parent
	 */
	public static Set<Node> getAllChildren(Node parent) {
		Set<Node> allChildren = new HashSet<Node>();
		Set<Node> toDoSet = getChildSet(parent);
		toDoSet.remove(parent);
		Set<Node> directChildren  = new HashSet<Node>();
		
		while(toDoSet.size() >=1) {
			directChildren.addAll(toDoSet);
			Iterator<Node> iter = directChildren.iterator();
			while(iter!=null && iter.hasNext()) {
				Node next = iter.next();
				allChildren.add(next);
				Set<Node> nextSet = getChildSet(next);
				nextSet.removeAll(allChildren);
				toDoSet.addAll(nextSet);
			}
			toDoSet.removeAll(directChildren);
			directChildren.clear();
		}
		return allChildren;
	}
	
	
	/**
	 * finds all the direct child nodes of a parent and returns them in a set.
	 * Child is defined by a containment relationship
	 * @param parent
	 */
	public static Set<Node> getChildSet(Node parent) {
		Set<Node> children = new HashSet<Node>();
		if(parent == null) return children;
		String parentID = parent.getURI().lastSegment();
		//RelativePhysicalRelationshipLabelValue
		EList<Edge> allEdges = parent.getEdges();
		for (int i = 0; i < allEdges.size(); i ++) {
			Edge e = allEdges.get(i);
			LabelValue lv = e.getLabel().getCurrentValue();
			if(lv instanceof RelativePhysicalRelationshipLabelValue) {
				RelativePhysicalRelationshipLabelValue containment = (RelativePhysicalRelationshipLabelValue)lv;
				Node neighborNode = e.getOtherNode(parent);
				String neighborID= neighborNode.getURI().lastSegment();
				// is it really a child
				if(neighborID.length() > parentID.length() || parentID.equals("ZZZ")) {
					//yes
					children.add(neighborNode);
				}// is child
			}// is containment relationship
		}// for all edges
		//just to be sure
		children.remove(parent);
		return children;
	}
	
}
