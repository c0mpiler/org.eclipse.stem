package org.eclipse.stem.runtime.compactjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Runtime solver. Contains name (from EMF name) and attributes 
 * @author edlund
 *
 */
public class RuntimeSolver extends RuntimeIdentifiable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;

	public RuntimeSolver(RuntimeType rt) {
		super(rt);
	}
	/**
	 * Set the name (directly from EMF)
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get name
	 * @return String The name
	 */
	
	public String getName() {
		return name;
	}
	
}

