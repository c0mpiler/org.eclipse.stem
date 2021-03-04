// IntensityColorsLabelsMappingColorProviderAdapterFactory.java
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.ui.preferences.PreferenceConstants;
import org.eclipse.stem.ui.widgets.ColorProviderPropertiesComposite;
import org.eclipse.stem.ui.widgets.ColorProviderPropertiesComposite.PropertySelectionEvent;
import org.eclipse.swt.widgets.Composite;

/**
 * This factory create adapters that adapt
 * {@link  org.eclipse.stem.core.graph.Node}s to
 * {@link IntensityColorsLabelsMappingColorProvider}s.
 */
public class IntensityColorsLabelsMappingColorProviderAdapterFactory extends
		AbstractRelativeValueColorProviderAdapterFactory {
	
	/**
	 * @see org.eclipse.stem.core.graph.util.GraphAdapterFactory#createNodeAdapter()
	 */
	@Override
	public Adapter createNodeAdapter() {
		final IntensityColorsLabelsMappingColorProviderAdapter adapter = 
			new IntensityColorsLabelsMappingColorProviderAdapter();
		addPropertySelectionListener(adapter);
		adapter.propertySelected(selectedProperty);
		return adapter;
	} // createNodeAdapter

	/**
	 * @see org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(final Object type) {
		return type == IntensityColorsLabelsMappingColorProvider.class;
	} // isFactoryForType
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.IColorProviderAdapterFactory#createPropertiesComposite(org.eclipse.swt.widgets.Composite, int, org.eclipse.stem.core.model.Decorator)
	 */
	public Composite createPropertiesComposite(final Composite parent, final int style, final Decorator selectedDecorator, final String populationIdentifier)
	{	
		final ColorProviderPropertiesComposite propertiesComposite = new ColorProviderPropertiesComposite(
				parent, style);
		propertiesComposite.setInitialPropertyName(getPreferenceValue(PreferenceConstants.INITIAL_ATTRIBUTE_NAME_STRING_PREFERENCE));
		propertiesComposite.initialize(selectedDecorator, populationIdentifier);
		selectedProperty = propertiesComposite.getSelectedProperty();
		propertiesComposite
				.addPropertySelectionListener(new ColorProviderPropertiesComposite.PropertySelectionListener() {
					public void propertySelected(
							final PropertySelectionEvent propertySelectionEvent) {
//						firePropertySelectionListener(propertySelectionEvent.getProperty());
					}
				});
		this.propertiesComposite = propertiesComposite;
		return propertiesComposite;
	}

	/**
	 * @see org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapterFactory#createColorsLegendComposite(org.eclipse.swt.widgets.Composite,
	 *      int)
	 */
	@Override
	public Composite createColorsLegendComposite(final Composite parent,
			final int style) {
//		final ColorsLegendComposite colorsLegendComposite = new ColorsLegendComposite(
//				parent, style);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_1,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_1_STRING);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_2,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_2_STRING);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_3,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_3_STRING);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_4,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_4_STRING);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_5,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_5_STRING);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_6,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_6_STRING);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_7,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_7_STRING);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_8,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_8_STRING);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_9,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_9_STRING);
//		colorsLegendComposite.addColorEntry(
//				PreferenceConstants.FOREGROUND_COLOR_LABEL_10,
//				VisualizationPreferencePage.FOREGROUND_ATTRIBUTE_NAME_10_STRING);
//		return colorsLegendComposite;
		
		return null;
	} // createColorsLegendComposite

} // IntensityColorsLabelsMappingColorProviderAdapterFactory
