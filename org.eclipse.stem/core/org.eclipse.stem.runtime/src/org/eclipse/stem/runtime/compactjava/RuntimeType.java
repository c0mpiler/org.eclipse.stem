package org.eclipse.stem.runtime.compactjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Stores attribute names and indices to access vales from instances. Mapped from EMF objects
 * @author edlund
 *
 */
public class RuntimeType implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private short id;
	private Map<String, Short> attributeIndices;
	private Map<String, Short> doubleAttributeIndices;
	private transient short lastIndex;
	private transient short lastDoubleIndex;
	
	/**
	 * Constructor
	 */
	public RuntimeType(String name, short id) {
		this.name = name;
		this.id = id;
		attributeIndices = new LinkedHashMap<String, Short>();
		doubleAttributeIndices = new LinkedHashMap<String, Short>();
		lastIndex = -1;
		lastDoubleIndex = -1;
		
	}
	
	/**
	 * getName
	 * 
	 * @return String The name of the type, or null if not found
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * getTypeId
	 * 
	 * @return short The type id of the runtime type
	 */
	
	public short getTypeId() {
		return id;
	}
	
	/**
	 * addAttribute
	 * 
	 * @param name. The name of the attribute
	 * @return short. The index of the attribute 
	 */
	
	public short addAttribute(String name) {
		attributeIndices.put(name, ++lastIndex);
		return lastIndex;
 	}
	
	/**
	 * addDoubleAttribute
	 * 
	 * @param name. The name of the double attribute
	 * @return short. The index of the double attribute 
	 */
	
	public short addDoubleAttribute(String name) {
		doubleAttributeIndices.put(name, ++lastDoubleIndex);
		return lastDoubleIndex;
 	}
	
	/**
	 * getAttributeIndex
	 * 
	 * @param name
	 * @return short
	 */
	public short getAttributeIndex(String name) {
		if(attributeIndices.containsKey(name))
			return attributeIndices.get(name);
		else return -1;
	}
	
	/**
	 * getDoubleAttributeIndex
	 * @param name
	 * @return short
	 */
	public short getDoubleAttributeIndex(String name) {
		if(doubleAttributeIndices.containsKey(name))
			return doubleAttributeIndices.get(name);
		else return -1;
	}
	
	public Set<String>getAttributeNames() {
		return attributeIndices.keySet();
	}
	
	public Set<String>getDoubleAttributeNames() {
		return doubleAttributeIndices.keySet();
	}
}
