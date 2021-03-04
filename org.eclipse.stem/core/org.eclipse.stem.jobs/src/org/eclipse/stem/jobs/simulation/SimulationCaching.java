package org.eclipse.stem.jobs.simulation;

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

import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.jobs.Activator;
import org.eclipse.stem.jobs.preferences.PreferenceConstants;

/**
 * This class implements caching of {@link Scenario}s.
 * 
 * TODO Why isn't this called ScenarioCaching?
 */
public class SimulationCaching {

	/**
	 * Singleton instance of caching manager
	 */
	public final static SimulationCaching INSTANCE = new SimulationCaching();

	/**
	 * Caching uses a {@link WeakHashMap} object to store Scenarios. In the
	 * future this can be replaced with a smarter caching mechanism.
	 */
	private final Map<URI, Scenario> cachedScenarios = new WeakHashMap<URI, Scenario>();

	private boolean toUseCaching = false;

	/**
	 * Private constructor as this is a Singleton object.
	 */
	private SimulationCaching() {
		setPreferences();

		Activator.getDefault().getPreferenceStore()
				.addPropertyChangeListener(new IPropertyChangeListener() {
					public void propertyChange(final PropertyChangeEvent event) {
						setPreferences();
					} // propertyChange
				} // IPropertyChangeListener
				);
	}

	/**
	 * @param scenarioURI
	 * @return <code>true</code> if the {@link Scenario} is in the cache
	 */
	public boolean isScenarioInCache(URI scenarioURI) {
		return cachedScenarios.containsKey(scenarioURI);
	}

	/**
	 * @param scenarioURI
	 * @return the {@link Scenario} identified by the {@link URI} from the
	 *         cache, or <code>null</code> if not found.
	 */
	public Scenario getCachedScenario(URI scenarioURI) {
		return cachedScenarios.get(scenarioURI);
	}

	/**
	 * @param scenario
	 */
	public void addScenarioToCache(Scenario scenario) {
		if (scenario.getURI() == null)
			return;
		cachedScenarios.put(scenario.getURI(), scenario);
	}

	/**
	 * @return <code>true</code> if caching is enabled.
	 */
	public boolean toUseCaching() {
		return toUseCaching;
	}

	protected void setPreferences() {
		//final IEclipsePreferences preferences = InstanceScope.INSTANCE
		//		.getNode(Simulation.class.getPackage().getName());
		final IPreferenceStore preferenceSore = Activator.getDefault()
				.getPreferenceStore();
		toUseCaching = preferenceSore
				.getBoolean(PreferenceConstants.USE_SCENARIOS_CACHING_BOOLEAN);
	} // setPerferences
}
