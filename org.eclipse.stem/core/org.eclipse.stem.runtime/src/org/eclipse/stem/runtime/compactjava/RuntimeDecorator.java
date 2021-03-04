package org.eclipse.stem.runtime.compactjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Runtime decorator. Simply contains the attributes and associated values, as well as the EMF name of the original decorator. 
 * @author edlund
 *
 */
public class RuntimeDecorator extends RuntimeIdentifiable {

	private String name;
	private List<Integer> labelsToUpdate;
	
	/**
	 * Constructor
	 */
	
	public RuntimeDecorator(RuntimeType rt) {
		super(rt);
		labelsToUpdate = new ArrayList<Integer>();
	}
		
	/**
	 * Set the name. The name is the same as the original EMF decorator
	 * @param n The name
	 */
	
	public void setName(String n) {
		this.name = n;
	}
	
	/**
	 * Get the name (original EMF name)
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Add a new runtime label to update
	 * @param l label id
	 */
	public void addLabelToUpdate(int l) {
		labelsToUpdate.add(l);
	}
	
	/**
	 * Return all runtime labels the decororator updates
	 * @return List<Integer>
	 */
	public List<Integer> getLabelsToUpdate() {
		return labelsToUpdate;
	}
}
