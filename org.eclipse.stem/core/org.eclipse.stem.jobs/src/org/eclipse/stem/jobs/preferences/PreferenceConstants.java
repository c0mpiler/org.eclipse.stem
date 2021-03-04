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

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceConstants {

	/**
	 * The preference for pausing after each simulation cycle
	 */
	public static final String SIMULATION_SLEEP_BOOLEAN = "cyclePause"; //$NON-NLS-1$

	/**
	 * This is the preference that specifies the number of seconds to pause the
	 * simulation at the end of each cycle.
	 */
	public static final String SIMULATION_SLEEP_MILLISECONDS_INTEGER = "cyclePauseMilliSeconds"; //$NON-NLS-1$

	/**
	 * This is the preference that specifies that when the canonical graph is
	 * created at the beginning of a <code>Simulation</code> that each
	 * unresolved <code>Identifiable</code> should be reported in the error
	 * log.
	 */
	public static final String REPORT_EACH_UNRESOLVED_IDENTIFIABLE_BOOLEAN = "reportEachUnresolvedIdentifiable"; //$NON-NLS-1$

	/**
	 * This is the preference to report dangling air transport edges
	 */

	public static final String REPORT_DANGLING_AIR_TRANPORT_EDGES_BOOLEAN = "reportDanglingAirTransportEdges";
	
	/**
	 * This is the preference that specifies that when the canonical graph is
	 * created at the beginning of a <code>Simulation</code> that if there are
	 * unresolved <code>Identifiable</code>s then the number should be
	 * reported in the error log.
	 */
	public static final String REPORT_NUMBER_OF_UNRESOLVED_IDENTIFIABLES_BOOLEAN = "reportNumberOfUnresolvedIdentifiable"; //$NON-NLS-1$
	
	/**
	 * This is the preference enables or disables the use of caching in STEM.
	 * Caching system can cache initialized {@link Scenario}s to save the time
	 * it takes to initialize the {@link Scenario} when running the same scenario
	 * more than once. 
	 */
	public static final String USE_SCENARIOS_CACHING_BOOLEAN = "useScenariosCaching"; //$NON-NLS-1$
} // PreferenceConstants
