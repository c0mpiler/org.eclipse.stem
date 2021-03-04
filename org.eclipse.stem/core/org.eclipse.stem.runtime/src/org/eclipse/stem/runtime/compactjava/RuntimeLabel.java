package org.eclipse.stem.runtime.compactjava;


public class RuntimeLabel extends RuntimeIdentifiable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int nodeId;
	
	public RuntimeLabel(RuntimeType rt) {
		super(rt);
	}
	
	/**
	 * setId. Set the id of the label.
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
	 * Set the id of the node label is attached to
	 * @param id The id of the node attached to
	 */
	public void setNodeId(int id) {
		this.nodeId = id;
	}
	
	/**
	 * Retrieve the id of the node attached to
	 * @return int The id of the node
	 */
	public int getNodeId() {
		return nodeId;
	}	
	
}
