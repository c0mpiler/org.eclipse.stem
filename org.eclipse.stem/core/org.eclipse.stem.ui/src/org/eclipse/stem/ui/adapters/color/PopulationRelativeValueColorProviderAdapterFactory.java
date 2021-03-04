// PopulationRelativeValueColorProviderAdapterFactory.java
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;

/**
 * This factory create adapters that adapt
 * {@link org.eclipse.stem.core.graph.Node}s to
 * {@link PopulationRelativeValueColorProvider}s.
 */
public class PopulationRelativeValueColorProviderAdapterFactory extends
		AbstractRelativeValueColorProviderAdapterFactory {

	/**
	 * Constructor
	 */
	public PopulationRelativeValueColorProviderAdapterFactory() {
		super();
	} // PopulationRelativeValueColorProviderAdapterFactory

	/**
	 * @see org.eclipse.stem.core.graph.util.GraphAdapterFactory#createNodeAdapter()
	 */
	@Override
	public Adapter createNodeAdapter() {
		final PopulationRelativeValueColorProviderAdapter adapter = new PopulationRelativeValueColorProviderAdapter();
		return adapter;
	} // createNodeAdapter

	/**
	 * @see org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(final Object type) {
		return type == PopulationRelativeValueColorProvider.class;
	} // isFactoryForType

	/**
	 * @see org.eclipse.stem.ui.adapters.color.IColorProviderAdapterFactory#createPropertiesComposite(org.eclipse.swt.widgets.Composite, int, org.eclipse.stem.core.model.Decorator)
	 */
	@Override
	public Composite createPropertiesComposite(final Composite parent, final int style, final Decorator selectedDecorator, final String populationIdentifier)
	{
		final Composite composite = new Composite(parent, SWT.NONE);
		final Layout layout = new RowLayout();
		composite.setLayout(layout);
		final Label label = new Label(composite, SWT.NONE);
		label.setText("This color provider is not implemented yet");
		return composite;
	} // createPropertiesComposite

	/**
	 * @see org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapterFactory#createColorsLegendComposite(org.eclipse.swt.widgets.Composite,
	 *      int)
	 */
	@Override
	public Composite createColorsLegendComposite(final Composite parent,
			final int style) {
		final ColorsLegendComposite colorsLegendComposite = new ColorsLegendComposite(
				parent, style);
		colorsLegendComposite.addColorEntry(
				RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_3_ID,
				"Population relative value");
		return colorsLegendComposite;
	} // createColorsLegendComposite

} // PopulationRelativeValueColorProviderAdapterFactory
