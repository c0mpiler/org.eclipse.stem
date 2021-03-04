package org.eclipse.stem.core.scenario.tests;

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

import java.io.File;
import java.util.List;

import junit.textui.TestRunner;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.jobs.preferences.PreferenceConstants;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.scenario.Scenario#step() <em>Step</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.Scenario#reset() <em>Reset</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.Scenario#initialize() <em>Initialize</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.Scenario#produceTitle() <em>Produce Title</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public class ScenarioIntegrationMultipleThreadsTest extends ScenarioIntegrationTest {
	
	private Scenario fixture;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScenarioIntegrationMultipleThreadsTest.class);
	}

	/**
	 * Just to keep the JUnit test runner happy
	 * 
	 * @generated
	 */
	public ScenarioIntegrationMultipleThreadsTest(String name) {
		super(name);
	}
	
	/**
	 * Constructs a new Scenario test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ScenarioIntegrationMultipleThreadsTest(String name, String file, List<File>projects) {
		super(name, file, projects);
	}

	/**
	 * Returns the fixture for this Scenario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected Scenario getFixture() {
		return (Scenario)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		// set some preferences
		IPreferenceStore preferenceStore = org.eclipse.stem.jobs.Activator.getDefault().getPreferenceStore();
		preferenceStore.setValue(PreferenceConstants.SIMULATION_SLEEP_BOOLEAN, false);
		preferenceStore = org.eclipse.stem.ui.Activator.getDefault().getPreferenceStore();
		preferenceStore.setValue(org.eclipse.stem.ui.preferences.PreferenceConstants.SIMULATION_THREADS, 2);
		
	} // setUp

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
} // ScenarioTest
