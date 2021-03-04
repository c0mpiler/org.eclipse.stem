package org.eclipse.stem.core;

import java.util.ArrayList;


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


/**
 * A simple object pool used to avoid excessive object creation. The pool allows clients to retrieve pre-initialized objects of a given 
 * kind from a pool of available objects. When retrieved, the object becomes unavailable and other clients cannot use it concurrently.
 * The client must make sure to return the object to the pool when done with it.
 * 
 * You specify the type of the object by passing a sample and the clone() method is used to create new instances.
 * 
 * Clients must implement the createNewObject() method
 * 
 * TODO: Periodically maintain the size of the pool and shrink when not used
 * @author edlund
 *
 */
public abstract class STEMObjectPool {

	ArrayList<Object> freeObjects = new ArrayList<Object>(); 
	int growthInc;
	
	/**
	 * 
	 * @param initialSize
	 * @param growthIncrement
	 */
	public STEMObjectPool(int initialSize, int growthIncrement) {
		this.growthInc = growthIncrement <=0? 1:growthIncrement; // safe
		
		try {
			for(int i=0;i<initialSize;++i)
				freeObjects.add(createNewObject());
		} catch(Exception e) {
			CorePlugin.logError("Error growing STEM object pool", e);
		}
	}
	
	public synchronized Object get()  {
		if(freeObjects.size() > 0)
			return freeObjects.remove(freeObjects.size()-1);
		// Grow pool
		try {
			for(int i=0;i<growthInc;++i) {
				freeObjects.add(createNewObject());
			}
		} catch(Exception e) {
			CorePlugin.logError("Error growing STEM object pool", e);
		}
		return freeObjects.remove(freeObjects.size()-1);
	}
	
	public synchronized void release(Object o) {
		this.resetObject(o);
		freeObjects.add(o);
	}
	
	protected abstract Object createNewObject(); // Must be implemented by subclass
	
	protected abstract void resetObject(Object o); // Must be implemented by subclass
	
}
