package org.eclipse.stem.jobs.preferences;

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
import org.eclipse.stem.jobs.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.SIMULATION_SLEEP_BOOLEAN,
				SimulationManagementPreferencePage.DEFAULT_SIMULATION_SLEEP);
		store
				.setDefault(
						PreferenceConstants.SIMULATION_SLEEP_MILLISECONDS_INTEGER,
						SimulationManagementPreferencePage.DEFAULT_SIMULATION_SLEEP_MILLISECONDS);
		store
				.setDefault(
						PreferenceConstants.REPORT_EACH_UNRESOLVED_IDENTIFIABLE_BOOLEAN,
						SimulationManagementPreferencePage.DEFAULT_SIMULATION_REPORT_EACH_UNRESOLVED_IDENTIFIABLE);

		store
		.setDefault(
				PreferenceConstants.REPORT_DANGLING_AIR_TRANPORT_EDGES_BOOLEAN,
				SimulationManagementPreferencePage.DEFAULT_SIMULATION_REPORT_DANGLING_AIR_TRANPORT_EDGES);

		store
				.setDefault(
						PreferenceConstants.REPORT_NUMBER_OF_UNRESOLVED_IDENTIFIABLES_BOOLEAN,
						SimulationManagementPreferencePage.DEFAULT_SIMULATION_REPORT_NUMBER_UNRESOLVED_IDENTIFIABLE);
		store
				.setDefault(
						PreferenceConstants.USE_SCENARIOS_CACHING_BOOLEAN,
						SimulationManagementPreferencePage.DEFAULT_USE_SCENARIOS_CACHING);

	} // initializeDefaultPreferences

} // PreferenceInitializer
