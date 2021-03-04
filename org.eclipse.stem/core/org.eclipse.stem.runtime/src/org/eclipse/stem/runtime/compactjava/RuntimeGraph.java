package org.eclipse.stem.runtime.compactjava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RuntimeGraph extends RuntimeIdentifiable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private transient Map<Integer, RuntimeNode> nodes;
	private Map<Integer, RuntimeEdge> edges;
	private Map<Integer, RuntimeLabel> labels;
	
	private RuntimeNode [] allNodes;
	/**
	 * Constructor
	 */
	public RuntimeGraph() {
		super(null); // No type for graphs
		this.nodes = new LinkedHashMap<Integer, RuntimeNode>();
		this.edges = new LinkedHashMap<Integer, RuntimeEdge>();
		this.labels = new LinkedHashMap<Integer, RuntimeLabel>();
	}
	
	/**
	 * getNodeEntries
	 * @return Set<Map.Entry<Integer, RuntimeNode>> Set of node entries
	 */
	public Set<Map.Entry<Integer, RuntimeNode>> getNodeEntries() {
		return nodes.entrySet();
	}
	
	/**
	 * addNode
	 * @param id The id of the node
	 * @param n The node itself
	 */
	public void addNode(int id, RuntimeNode n) {
		nodes.put(id, n);
		if(allNodes == null) {
			allNodes = new RuntimeNode[1];
			allNodes[id] = n;
		} else {
			RuntimeNode [] newArray = new RuntimeNode[allNodes.length+1];
			for(int i=0;i<allNodes.length;++i)newArray[i]=allNodes[i];
			newArray[id] = n;
			allNodes = newArray;
		}
	}
	
	/**
	 * getEdgeEntries
	 * @return Set<Map.Entry<Integer, RuntimeEdge>> Set of edge entries
	 */
	public Set<Map.Entry<Integer, RuntimeEdge>> getEdgeEntries() {
		return edges.entrySet();
	}
	
	/**
	 * addEdge
	 * @param id
	 * @param e The edge
	 */
	public void addEdge(int id, RuntimeEdge e) {
		edges.put(id, e);
	}
	
	
	/**
	 * getLabelEntries
	 * @return Set<Map.Entry<Integer, RuntimeLabel>> Set of label entries
	 */
	public Set<Map.Entry<Integer, RuntimeLabel>> getLabelEntries() {
		return labels.entrySet();
	}
	
	/**
	 * addLabel
	 * @param id The id of the label
	 * @param l The label itself
	 */
	public void addLabel(int id, RuntimeLabel l) {
		labels.put(id, l);
	}

	
	/**
	 * Retrieve a node with the specified id
	 * @param id The id
	 * @return RuntimeNode
	 */
	public RuntimeNode findNode(int id) {
		return allNodes[id];
	}

	/**
	 * Retrieve an edge with the specified id
	 * @param id The id
	 * @return Edge
	 */
	public RuntimeEdge findEdge(int id) {
		return edges.get(id);
	}

	/**
	 * Retrieve a label with the specified id
	 * @param id The id
	 * @return RuntimeLAbel
	 */
	
	public RuntimeLabel findLabel(Integer id) {
		return labels.get(id);
	}

}
