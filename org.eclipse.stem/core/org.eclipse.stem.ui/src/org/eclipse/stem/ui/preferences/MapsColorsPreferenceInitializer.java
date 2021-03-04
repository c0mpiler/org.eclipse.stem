package org.eclipse.stem.ui.preferences;

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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.adapters.color.RelativeValueColorPreferences;

/**
 * Class used to initialize default preference values.
 */
public class MapsColorsPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(MapsColorsPreferencePage.FOREGROUND_COLOR_ID, MapsColorsPreferencePage.FOREGROUND_COLOR_DEFAULT_RGB_STRING);
		store.setDefault(MapsColorsPreferencePage.BACKGROUND_COLOR_ID, MapsColorsPreferencePage.BACKGROUND_COLOR_DEFAULT_RGB_STRING);
		store.setDefault(MapsColorsPreferencePage.BORDERS_COLOR_ID, MapsColorsPreferencePage.BORDERS_COLOR_DEFAULT_RGB_STRING);
		store.setDefault(MapsColorsPreferencePage.BORDERS_ALPHA_ID, MapsColorsPreferencePage.BORDERS_ALPHA_DEFAULT_VALUE);
		store.setDefault(MapsColorsPreferencePage.EDGES_COLOR_ID, MapsColorsPreferencePage.EDGES_COLOR_DEFAULT_RGB_STRING);
		
		//This too should be done by using the extension-points mechanism. The color providers are unknown.
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_ZERO_RELATIVE_VALUE_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_ZERO_RELATIVE_VALUE_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_1_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_1_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_2_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_2_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_3_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_3_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_4_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_4_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_5_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_5_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_6_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_6_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_7_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_7_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_8_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_8_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_9_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_9_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_10_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_10_DEFAULT_RGB_STRING);
		store.setDefault(RelativeValueColorPreferences.FOREGROUND_COLOR_MAXIMUM_RELATIVE_VALUE_ID, RelativeValueColorPreferences.FOREGROUND_COLOR_MAXIMUM_RELATIVE_VALUE_DEFAULT_RGB_STRING);
	} // initializeDefaultPreferences

} // PreferenceInitializer
