package org.eclipse.stem.runtime.compactjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Runtime Node. Contains id, type and node labels
 * @author edlund
 *
 */
public class RuntimeNode extends RuntimeIdentifiable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private Map<Short, List<RuntimeLabel>> nodeLabelMap;
	private List<RuntimeEdge> edges;
	
	/**
	 * Constructor
	 */
	public RuntimeNode(RuntimeType rt) {
		super(rt);
		nodeLabelMap = new HashMap<Short, List<RuntimeLabel>>();
		edges = new ArrayList<RuntimeEdge>();
	}
	
	/**
	 * Set the unique node id
	 * @param id The id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Return the unique node id
	 * @return int The id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * add A new runtime label of the specified type
	 * @param type The type
	 * @param l The label
	 */
	public void addLabel(short type, RuntimeLabel l) {
		if(nodeLabelMap.containsKey(type))
			nodeLabelMap.get(type).add(l);
		else {
			ArrayList<RuntimeLabel> s = new ArrayList<RuntimeLabel>();
			s.add(l);
			nodeLabelMap.put(type, s);
		}
	}
	
	/**
	 * Retrieve all labels of the specified type
	 * @param type The type
	 * @return Set<RuntimeLabel> The label type
	 */
	public List<RuntimeLabel> getLabels(short type) {
		return nodeLabelMap.get(type);
	}
	
	/**
	 * Retrieve the edges for the node
	 * @return List<RuntimeEdge>
	 */
	public List<RuntimeEdge> getEdges() {
		return edges;
	}
	
	/**
	 * Add a new edge
	 * @param e Edge
	 */
	public void addEdge(RuntimeEdge e) {
		edges.add(e);
	}
}
