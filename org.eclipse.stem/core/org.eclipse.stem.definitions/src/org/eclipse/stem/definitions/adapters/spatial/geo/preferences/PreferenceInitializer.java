package org.eclipse.stem.definitions.adapters.spatial.geo.preferences;

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
import org.eclipse.stem.definitions.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore store = Activator.getDefault()
				.getPreferenceStore();
		store
				.setDefault(
						PreferenceConstants.LAT_LONG_SAMPLE_FREQUENCY_INTEGER_PREFERENCE,
						MapDataManagementPreferencePage.MIN_SAMPLE_FREQUENCY);
		store
				.setDefault(
						PreferenceConstants.DOWN_SAMPLE_LAT_LONG_DATA_BOOLEAN_PREFERENCE,
						false);
		store.setDefault(
				PreferenceConstants.REPORT_IO_EXCEPTIONS_BOOLEAN_PREFERENCE,
				false);
		store
				.setDefault(
						PreferenceConstants.USE_LOWER_RESOLUTION_LAT_LONG_DATA_BOOLEAN_PREFERENCE,
						true);
	} // initializeDefaultPreferences
} // PreferenceInitializer
