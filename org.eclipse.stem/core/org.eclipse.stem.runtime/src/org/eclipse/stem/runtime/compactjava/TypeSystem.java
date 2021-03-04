package org.eclipse.stem.runtime.compactjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Maps between type id (generated shorts) and the string type (maps to the name of the EMF class)
 * @author edlund
 *
 */
public class TypeSystem implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<Short, RuntimeType> typeSystem;
	
	
	/**
	 * Constructor
	 */
	public TypeSystem() {
		typeSystem = new LinkedHashMap<Short, RuntimeType>();
	}
	
	
	/**
	 * Add a new type to the system
	 * @param typeId The id 
	 * @param name The name (maps to EMF class name)
	 */
	
	public void addType(Short typeId, String name) {
		RuntimeType rt = new RuntimeType(name, typeId);
		typeSystem.put(typeId, rt);
	}
	
	/**
	 * getRuntimeTypeType
	 * 
	 * @param typeId The id of the type
	 * @return RuntimeType
	 */
	
	public RuntimeType getRuntimeType(short typeId) {
		return typeSystem.get(typeId);
	}
	
	/**
	 * findTypeId
	 * 
	 * @param name. The name of the type
	 * @return short. The id of the type, or -1 if not found
	 */
	
	public short findTypeId(String name) {
		for(Map.Entry<Short, RuntimeType> entry:typeSystem.entrySet()) {
			if(entry.getValue().getName().equals(name)) return entry.getKey();
		}
		return -1;
 	}
	
	
}
