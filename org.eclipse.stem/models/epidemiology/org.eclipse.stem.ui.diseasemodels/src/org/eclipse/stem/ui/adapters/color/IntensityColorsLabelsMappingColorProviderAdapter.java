// IntensityColorsLabelsMappingColorProviderAdapter.java
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

import java.awt.AlphaComposite;
import java.util.ConcurrentModificationException;
import java.util.Map;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapterFactory.PropertySelectionListener;
import org.eclipse.stem.ui.preferences.VisualizationPreferencePage;

/**
 * This class adapts {@link Node} objects to
 * {@link IntensityColorsLabelsMappingColorProvider} object.
 */
public class IntensityColorsLabelsMappingColorProviderAdapter extends
		AbstractRelativeValueColorProviderAdapter implements PropertySelectionListener{
	/**
	 * default {@link AlphaComposite}
	 */
	//private static final AlphaComposite ONE_COMPOSITE = makeComposite(1);
	private final Map<String, STEMColor> colorMap = VisualizationPreferencePage.getColorMapping();
	private ItemPropertyDescriptor selectedProperty;

	/**
	 *  Constructor
	 */
	public IntensityColorsLabelsMappingColorProviderAdapter() {
		super();
	} // IntensityColorsLabelsMappingColorProviderAdapter

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

	@Override
	public STEMColor getColorForRelativeValue(final double relativeValue) {		
		updateColorsFromPreferences();
		
		return new STEMColor(foregroundFillColor.getRed(), foregroundFillColor.getGreen(), foregroundFillColor.getBlue(), (float)relativeValue);		
	}
	
	
	public STEMColor getColor(final float gainFactor, final boolean useLogScaling)
	{
		final String selectedPropertyName = selectedProperty.getDisplayName(null);

		// Get the color for the selected property (label)
		if (colorMap.containsKey(selectedPropertyName)) {
			foregroundFillColor = colorMap.get(selectedPropertyName);
		} else {
			// check for complex compartment names and add those to the map if necessary
			// this way we avoid lots of future string manipulation when we want to find the colors
			// Check for a prefix match
						for (String key : colorMap.keySet()) {
							if((selectedPropertyName.startsWith(key))&&(key.length()>=1)) {
								// might be right
								String tail = selectedPropertyName.substring(key.length(), selectedPropertyName.length());
								//if perfect match (should not happen)
								if((tail==null)||(tail.length()==0)) {
									final STEMColor c = colorMap.get(key);
									colorMap.put(selectedPropertyName, c);
									foregroundFillColor = c;
									break;
								}
								// if prefix match
								boolean hit = true;
								for (char c : tail.toCharArray()) {
									if (!Character.isDigit(c)) {
										hit = false;
										break;
									}
								}// all characters in tail
								if(hit){
									// remember the new key in the color map
									final STEMColor c = colorMap.get(key);
									colorMap.put(selectedPropertyName, c);
									foregroundFillColor = c;
									break;
								}
							}
						}
		}

		if (!(getTarget() instanceof Node)) {
			return foregroundFillColor;
		}		
		
		STEMColor retValue = null;
		
		// Update the G2D object with the appropriate intensity of the color
		float alpha = performGainAndLogScaling(getRelativeValue(), gainFactor, useLogScaling);
		
		if (alpha < ZERO_RELATIVE_VALUE_THRESHOLD) {
			alpha = 0.0f;
		}
		
		return new STEMColor(foregroundFillColor.getRed(), foregroundFillColor.getGreen(), foregroundFillColor.getBlue(),  alpha);
	}

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

} // IntensityColorsLabelsMappingColorProviderAdapter
