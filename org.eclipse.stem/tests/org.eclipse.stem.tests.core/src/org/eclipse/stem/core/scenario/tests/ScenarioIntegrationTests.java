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

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>scenario</b></em>' package.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class ScenarioIntegrationTests extends TestSuite {
	
	static List<String> scenarioNameList = null;
	static List<File> allProjects = null;
	protected final static String sep = File.separator;
	protected final static String SCENARIO_FOLDER = sep+"scenarios";//$NON-NLS-1$
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Test suite() {
		TestSuite suite = new ScenarioIntegrationTests("Scenario Integration Tests"); //$NON-NLS-1$
		allProjects = IntegrationTestUtil.setUpWorkspace();
		scenarioNameList = IntegrationTestUtil.readScenarios(allProjects, SCENARIO_FOLDER);
		
		for(String scenarioName:scenarioNameList) {
			String fname = scenarioName.substring(scenarioName.lastIndexOf(sep)+1);
			suite.addTest(new ScenarioIntegrationSingleThreadTest("Single-threaded "+fname, scenarioName, allProjects));
			suite.addTest(new ScenarioIntegrationMultipleThreadsTest("Multi-threaded "+fname, scenarioName, allProjects));
		}
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioIntegrationTests(String name) {
		super(name);
	}

} //ScenarioTests
