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

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.stem.ui.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

/**
 * This class is used to display a "legend" that maps colors to values.
 */
public class ColorsLegendComposite extends Composite {

	Group legendGroup = new Group(this, SWT.NONE);

	/**
	 * @param parent
	 * @param style
	 */
	public ColorsLegendComposite(final Composite parent, final int style) {
		super(parent, style);

		legendGroup.setText("Colors Legend");
		final GridLayout legendLayout = new GridLayout();
		legendLayout.numColumns = 4;
		legendLayout.horizontalSpacing = 10;
		legendLayout.verticalSpacing = 2;
		legendLayout.makeColumnsEqualWidth = false;
		legendLayout.marginBottom = 15;
		legendGroup.setLayout(legendLayout);
	}

	/**
	 * @param colorID
	 * @param text
	 */
	public void addColorEntry(final String colorID, final String text) {
		final Color color = getPreferencesColor(colorID);
		final Label colorLabel = new Label(legendGroup, SWT.BORDER);
		colorLabel.setBackground(color);
		colorLabel.setText("            ");
		final Label colorText = new Label(legendGroup, SWT.NONE);
		colorText.setText(text);
		legendGroup.pack();
		this.layout();
	}

	private Color getPreferencesColor(final String colorId) {
		final IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		final String color = preferenceStore.getString(colorId);
		final RGB rgb = StringConverter.asRGB(color);
		return new Color(getDisplay(), rgb.red, rgb.green, rgb.blue);
	}
} // ColorsLegendComposite
