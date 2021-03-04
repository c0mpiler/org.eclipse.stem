package org.eclipse.stem.core.graph.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.graph.SimpleGraphPartitioner;
import org.eclipse.stem.core.model.Decorator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Graph Partitioner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SimpleGraphPartitionerImpl extends GraphPartitionerImpl implements SimpleGraphPartitioner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleGraphPartitionerImpl() {
		super();
	}

	protected Map<Decorator, Map<Integer, EList<DynamicLabel>>> labelPartitionMap = new HashMap<Decorator, Map<Integer, EList<DynamicLabel>>>();
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.SIMPLE_GRAPH_PARTITIONER;
	}
	
	/**
	 * Override to clear map
	 */
	@Override
	public void setNumProcesses(int newNumProcesses) {
		if(getNumProcesses() != newNumProcesses) 
			labelPartitionMap.clear();
		super.setNumProcesses(newNumProcesses);
	}
	
	/**
	 * Simply divide the labels the decorator is updating equally among the 
	 * processes alphabetically by the node URI. The method is synchronized
	 * since the labelPartitionMap is shared among the threads, but most of the times
	 * the method will return right away using the already cached results so performance
	 * is not a concern.
	 */
	@SuppressWarnings("boxing")
	@Override
	public EList<DynamicLabel> partitionDecoratorLabels(Decorator decorator, int processRank) {
		synchronized(labelPartitionMap) {
			if(labelPartitionMap != null && labelPartitionMap.containsKey(decorator)  &&
					labelPartitionMap.get(decorator).containsKey(processRank)) {
				EList<DynamicLabel> res = labelPartitionMap.get(decorator).get(processRank);
				return res;
			}

			EList<DynamicLabel> temp = new BasicEList<DynamicLabel>(); 

			// Find the node and partition the labels according to their node.

			// TreeSet guarantees O(log(n)) add/contains
			TreeSet<String>nodeURIs = new TreeSet<String>();
			for(DynamicLabel lab:decorator.getLabelsToUpdate()) {
				String uri = lab.getIdentifiable().getURI().toString();
				if(!nodeURIs.contains(uri)) nodeURIs.add(uri);
			}

			// Use the hash for the URI modulo the number of processors. This ensures
			// that the a node is assigned to the same thread no matter which
			// decorator is updating it.
			
			TreeMap<String, TreeMap<String, DynamicLabel>> myURIs = new TreeMap<String, TreeMap<String, DynamicLabel>>();
			
			for(String uri:nodeURIs)  {
				if(Math.abs(uri.hashCode() % getNumProcesses()) == processRank)
					myURIs.put(uri, new TreeMap<String, DynamicLabel>());
			}
			for(DynamicLabel dl:decorator.getLabelsToUpdate()) {
				String sURI = dl.getIdentifiable().getURI().toString();
				if(myURIs.containsKey(sURI)) {
					myURIs.get(sURI).put(dl.getURI().toString(), dl);
				} 
			}
			
			Map<Integer, EList<DynamicLabel>> partitionMap = null;

			if(labelPartitionMap.containsKey(decorator))
				partitionMap = labelPartitionMap.get(decorator);
			else {
				partitionMap = new HashMap<Integer, EList<DynamicLabel>>();
				labelPartitionMap.put(decorator, partitionMap);
			}

			// Go through the sorted Node URI and Label URI's to get the final sorted list
			for(String nodeURI:myURIs.keySet()) 
				for(String labURI:myURIs.get(nodeURI).keySet())
					temp.add(myURIs.get(nodeURI).get(labURI));
			
			partitionMap.put(processRank, temp);

			return temp;
		}
	}
	
	/**
	 * Same as above but return all labels handled by this decorator
	 */
	@Override
	public EList<DynamicLabel> partitionDecoratorLabels(Decorator decorator) {
		return decorator.getLabelsToUpdate();
	}
	
	/**
	 * Everything is managed by this running STEM instance
	 */
	@Override
	public boolean isManaged(Identifiable identifiable) {
		return true;
	}

} //SimpleGraphPartitionerImpl
