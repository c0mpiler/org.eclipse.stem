// PopulationRelativeValueColorProviderAdapter.java
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

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.AreaLabelValue;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.definitions.nodes.Region;

/**
 * This class adapts {@link org.eclipse.stem.core.graph.Node} objects to
 * {@link PopulationRelativeValueColorProvider} object.
 */
public class PopulationRelativeValueColorProviderAdapter extends
		AbstractRelativeValueColorProviderAdapter {

	/**
	 * Constructor
	 */
	public PopulationRelativeValueColorProviderAdapter() {
		super();
	}

	/**
	 * @see org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapter#getRelativeValue()
	 */
	@Override
	public float getRelativeValue() {
		getPopulation();
		return 0.5f;
		
		// // Is there a decorator and a currently selected property?
		// if (displayData != null) {
		// // Yes
		// // Get the display data for this decorator
		//			
		//			
		// Node node = (Node)getTarget();
		//			
		// RelativeValueProviderAdapter rvp =
		// displayData.getRelativeValueProviderAdapter();
		// for (final DecoratorDisplayData.LabelData labelData :
		// displayData.getLabelData()) {
		// rvp.setTarget(labelData.getLabel());
		// if (labelData.getLabel().getNode() == node) {
		// return (float)rvp.getRelativeValue(decorationHelper.getSelectedProperty());
		// }
		// } // for each LabelData
		// } // if there a decorator and a currently selected property

		// return 0; // We shouldn't reach this point
	} // getRelativeValue
	
	/**
	 * @return
	 */
	private double getPopulation() {
		if (!(getTarget() instanceof Region)) {
			return -1;
		}
		
		double retVal = -1;
		Region region = (Region)getTarget();
		for (NodeLabel nodeLabel : region.getLabels()) {
			if (nodeLabel instanceof PopulationLabel) {
				PopulationLabel label = (PopulationLabel)nodeLabel;
				//if (label.getPopulationIdentifier().equals(PopulationLabel.HUMAN))
				PopulationLabelValue value = (PopulationLabelValue)label.getCurrentValue();
				retVal = value.getCount();
			}
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

} // PopulationRelativeValueColorProviderAdapter
