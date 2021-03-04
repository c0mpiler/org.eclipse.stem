// SEIRRelativeValueColorProviderAdapter.java
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

import java.util.ConcurrentModificationException;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapterFactory.PropertySelectionListener;

/**
 * This class adapts {@link Node} objects to
 * {@link SEIRRelativeValueColorProvider} object.
 */
public class SEIRRelativeValueColorProviderAdapter extends
		AbstractRelativeValueColorProviderAdapter  implements PropertySelectionListener{
	
	private ItemPropertyDescriptor selectedProperty;

	/**
	 * Constructor
	 * @param selectedProperty
	 */
	public SEIRRelativeValueColorProviderAdapter(ItemPropertyDescriptor selectedProperty) {
		super();
		this.selectedProperty = selectedProperty;
	} // SEIRRelativeValueColorProviderAdapter

	/**
	 * @see org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapter#getRelativeValue()
	 */
	@Override
	public float getRelativeValue() {
		
		final Node node = (Node) getTarget();
		try {
			for (final NodeLabel label : node.getLabels()) {
				if (label instanceof DynamicNodeLabel) {
					DynamicNodeLabel nodeLabel = (DynamicNodeLabel)label;
					if (nodeLabel.getDecorator() == selectedDecorator) {
						
						if(selectedDecorator instanceof DiseaseModel) {
							if(nodeLabel instanceof DiseaseModelLabel) {
								if(!((DiseaseModelLabel)nodeLabel).getPopulationModelLabel().getPopulationIdentifier().equals(selectedPopulationIdentifier)) {
									continue; // wrong population identifier
								} else {
									setRVPTarget(nodeLabel);
									return (float) rvp.getRelativeValue(selectedProperty);
								}			
							}// if disease model label
						} // if disease model
					
						if(selectedDecorator instanceof PopulationModel) {
							String popId = selectedPopulationIdentifier;
							if(nodeLabel instanceof PopulationModelLabel) {
								if(! ((PopulationModelLabel)nodeLabel).getPopulationIdentifier().equals(popId)) {
									continue; // wrong population identifier
								} else {
									setRVPTarget(nodeLabel);
									return (float) rvp.getRelativeValue(selectedProperty);
								}	
							}// if population model label
						}// if population model
						
					}// if selected
				}// if dynamic label
			}// for all labels
		} catch(ConcurrentModificationException cme) {
			// We expect exception to be rare so we simply retry the getRelativeValue call
			return getRelativeValue();
		}

		return 0; // We shouldn't reach this point
	} // getRelativeValue
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.IntensityColorsLabelsMappingColorProviderAdapterFactory.PropertySelectionListener#propertySelected(org.eclipse.emf.edit.provider.ItemPropertyDescriptor)
	 */
	public void propertySelected(ItemPropertyDescriptor selectedProperty) {
		this.selectedProperty = selectedProperty;		
	}
	
	@Override
	public void setSelectedProperty(ItemPropertyDescriptor selectedProperty) {
		this.selectedProperty = selectedProperty;		
	}

} // SEIRRelativeValueColorProviderAdapter
