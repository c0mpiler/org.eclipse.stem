// StandardColorProvider.java
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
import org.eclipse.stem.ui.preferences.MapsColorsPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.RGB;

/**
 * This class provides standard colors for rendered maps. The colors are based
 * on the colors from the preferences page. This class is being used because
 * taking the values directly from the preferences is time consuming and this is
 * being done many times and the cumulative time may be large.
 */
public class StandardColorProvider {

	private Device device = null;

	private IPreferenceStore preferenceStore;
	/**
	 * The constructor will update the current colors from the preferences and
	 * register this object as a listener to preferences changes.
	 * 
	 * @param device
	 *            A {@link Device} that will be used when creating {@link Color}
	 *            objects.
	 */
	public StandardColorProvider(Device device) {
		this.device = device;
		this.preferenceStore = Activator.getDefault().getPreferenceStore();
	} // StandardColorProvider

	/**
	 * The method will return the background {@link Color}.
	 * 
	 * @return the background {@link Color}
	 */
	public Color getBackgroundColor() {

		return getColorFromString(this.preferenceStore
				.getString(MapsColorsPreferencePage.BACKGROUND_COLOR_ID));
	} // getBackgroundColor

	/**
	 * The method will return the borders {@link Color}.
	 * 
	 * @return the borders {@link Color}
	 */
	public Color getBordersColor() {

		return getColorFromString(this.preferenceStore
				.getString(MapsColorsPreferencePage.BORDERS_COLOR_ID));
	} // getBordersColor

	/**
	 * The method will return the borders alpha value.
	 * 
	 * @return the borders alpha value
	 */
	public int getBordersAlpha() {

		return this.preferenceStore.getInt(MapsColorsPreferencePage.BORDERS_ALPHA_ID);
	} // getBordersAlpha

	/**
	 * The method will return the edges {@link Color}.
	 * 
	 * @return the edges {@link Color}
	 */
	public Color getEdgesColor() {

		return getColorFromString(this.preferenceStore
				.getString(MapsColorsPreferencePage.EDGES_COLOR_ID));
	} // getEdgesColor

	/**
	 * The method will return the foreground {@link Color}.
	 * 
	 * @return the foreground {@link Color}
	 */
	public Color getForegroundColor() {

		return getColorFromString(this.preferenceStore
				.getString(MapsColorsPreferencePage.FOREGROUND_COLOR_ID));
	} // getForegroundColor

	/**
	 * The method is used to convert RGB as string to {@link Color}.
	 * 
	 * @param rgbString
	 *            the RGB string
	 * @return the matching {@link Color}
	 */
	public Color getColorFromString(final String rgbString) {
		if (rgbString.equals("")) {
			return device.getSystemColor(SWT.COLOR_BLACK);
		}
		RGB rgb = StringConverter.asRGB(rgbString);
		// return new Color(rgb.red, rgb.green, rgb.blue);
		return new Color(device, rgb.red, rgb.green, rgb.blue);
	} // getColorFromString

} // StandardColorProvider
