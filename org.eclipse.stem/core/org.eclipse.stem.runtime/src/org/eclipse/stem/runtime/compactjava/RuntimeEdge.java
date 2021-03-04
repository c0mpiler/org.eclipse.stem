package org.eclipse.stem.runtime.compactjava;


/**
 * A (memory) compact runtime edge. Simply references ids of the two nodes being connected, as well as a type and label. 
 * @author edlund
 *
 */
public class RuntimeEdge extends RuntimeIdentifiable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private RuntimeLabel edgeLabel;
	
	private int nodeA;
	private int nodeB;

	
	public RuntimeEdge(RuntimeType rt) {
		super(rt);
	}
	
	/**
	 * setId. Set the id of the edge.
	 * 
	 * @param id. The id
	 */
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Retrieve the id.
	 * @return int. The id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set edge label
	 * @param el
	 */
	public void setEdgeLabel(RuntimeLabel el) {
		this.edgeLabel = el;
	}
	

	/**
	 * Retrieve the edge label
	 * @return RuntimeLabel
	 */
	public RuntimeLabel getEdgeLabel() {
		return edgeLabel;
	}

	/**
	 * Set node A
	 * @param id The id
	 */
	public void setNodeA(int id) {
		this.nodeA = id;
	}
	
	/**
	 * getNode A
	 * @return int. The id of node A
	 */
	public int getNodeA() {
		return nodeA;
	}

	/**
	 * Set node B
	 * @param id The id
	 */
	public void setNodeB(int id) {
		this.nodeB = id;
	}
	
	/**
	 * getNode B
	 * @return int. The id of node B
	 */
	public int getNodeB() {
		return nodeB;
	}
	
}


