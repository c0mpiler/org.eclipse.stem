package org.eclipse.stem.runtime.compactjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Runtime Identifiable. Records direct attributes and value from the original identifiable
 * 
 * @author edlund
 *
 */
@SuppressWarnings("serial")
public abstract class RuntimeIdentifiable implements java.io.Serializable {

	private Object[] attributes;
	private double [] doubleAttributes;
	private RuntimeType runtimeType;
	/**
	 * Constructor
	 */
	public RuntimeIdentifiable(RuntimeType rt) {
		runtimeType = rt;
	}
	
	/**
	 * Retrieve the runtime type
	 * @return RuntimeType
	 */
	
	public RuntimeType getRuntimeType() {
		return runtimeType;
	}
	
	/**
	 * addAttributeValue
	 * 
	 * @param name
	 * @param v
	 */
	
	public void addAttributeValue(RuntimeType rt, String name, Object v) {
		short index = rt.getAttributeIndex(name);
		if(index == -1)
			 index = rt.addAttribute(name);

		if(attributes == null) {
			attributes = new Object[1];
			attributes[index]=v;
			return;
		}
		if(attributes.length < index) {
			attributes[index] = v;
			return;
		}
		// Grow array
		Object [] newAttrs = new Object[attributes.length+1];
		int i=0;
		for(i=0;i<attributes.length;++i) newAttrs[i]=attributes[i];
		newAttrs[i] = v;
		attributes = newAttrs;
	}
	
	/**
	 * addDoubleAttributeValue
	 * 
	 * @param name
	 * @param v
	 */
	
	public void addDoubleAttributeValue(RuntimeType rt, String name, double v) {
		short index = rt.getDoubleAttributeIndex(name);
		if(index == -1)
			 index = rt.addDoubleAttribute(name);

		if(doubleAttributes == null) {
			doubleAttributes = new double[1];
			doubleAttributes[index]=v;
			return;
		}
		if(doubleAttributes.length < index) {
			doubleAttributes[index] = v;
			return;
		}
		// Grow array
		double [] newAttrs = new double[doubleAttributes.length+1];
		int i=0;
		for(i=0;i<doubleAttributes.length;++i) newAttrs[i]=doubleAttributes[i];
		newAttrs[i] = v;
		doubleAttributes = newAttrs;
	}
	
	/**
	 * getAttributeValue Return the value of an attirubte
	 * 
	 * @param index The index of the attribute (from the RuntimeType)
	 * @return Object
	 */
	public Object getAttributeValue(short index) {
		return attributes[index];
	}

	/**
	 * getDoubleAttributeValue Return the value of a double attribute
	 * 
	 * @param index The index of the double attribute (from the RuntimeType)
	 * @return double
	 */
	public double getDoubleAttributeValue(short index) {
		return doubleAttributes[index];
	}

	/**
	 * Retrieve the number of attributes
	 * @return int # of attributes
	 */
	public int getNumAttributes() {
		return attributes.length;
	}

	/**
	 * Retrieve the number of double attributes
	 * @return int # of double attributes
	 */
	public int getNumDoubleAttributes() {
		return doubleAttributes.length;
	}

	
	/**
	 * Retrieve the attribute values
	 */
	
	public Object [] getAllAttributeValues() {
		return attributes;
	}

	/**
	 * Retrieve the double attribute values
	 */
	
	public double [] getAllDoubleAttributeValues() {
		return doubleAttributes;
	}
	
	public short getTypeId() {
		return runtimeType.getTypeId();
	}
	
	
}
