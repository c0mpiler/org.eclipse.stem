// AreaRelativeValueColorProviderAdapter.java
package org.eclipse.stem.ui.adapters.color;

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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.AreaLabelValue;
import org.eclipse.stem.definitions.nodes.Region;

/**
 * This class adapts {@link org.eclipse.stem.core.graph.Node} objects to
 * <code>AreaRelativeValueColorProvider</code> object.
 */
public class AreaRelativeValueColorProviderAdapter 
	extends AbstractRelativeValueColorProviderAdapter {
	
	@SuppressWarnings("unused")
	private static Map<String, Double> areaValueMap = new HashMap<String, Double>();
	
	/**
	 * Constructor
	 */
	public AreaRelativeValueColorProviderAdapter() {
		super();
	} // AreaRelativeValueColorProviderAdapter
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapter#getRelativeValue()
	 */
	@Override
	public float getRelativeValue() {
		
		//double nodeArea = getArea();
		
		Graph graph = selectedDecorator.getGraph();
		final URI areaLabelURI = STEMURI.createURI(AreaLabel.URI_TYPE_AREA_LABEL_SEGMENT);
		Map<String, Double> tempAreaValueMap = new HashMap<String, Double>();
		for (URI labelUri : graph.getNodeLabels().keySet()) {
			if (labelUri.toString().startsWith(areaLabelURI.toString())) {
				String indexUri = labelUri.segment(2) + "/" + labelUri.segment(3);
				if (tempAreaValueMap.containsKey(indexUri)) {
					Double prevValue = tempAreaValueMap.remove(indexUri);
					AreaLabel areaLabel = (AreaLabel)graph.getNodeLabel(labelUri);
					Double newValue = Double.valueOf(prevValue.doubleValue() + areaLabel.getCurrentAreaValue().getArea());
					tempAreaValueMap.put(indexUri, newValue);
				}
			}
		}
				
		return 0.7f;
		
	} // getRelativeValue
	
	@SuppressWarnings("unused")
	private double getArea() {
		if (!(getTarget() instanceof Region)) {
			return -1;
		}
		
		double retVal = -1;
		Region region = (Region)getTarget();
		for (NodeLabel nodeLabel : region.getLabels()) {
			if (nodeLabel instanceof AreaLabel) {
				AreaLabel label = (AreaLabel)nodeLabel;
				AreaLabelValue value = (AreaLabelValue)label.getCurrentValue();
				retVal = value.getArea();
			}
		}
		return retVal;
	} // getPopulation
	
	@Override
	public void setSelectedProperty(ItemPropertyDescriptor selectedProperty) {
		// Do nothing		
	}
	
} // AreaRelativeValueColorProviderAdapter
