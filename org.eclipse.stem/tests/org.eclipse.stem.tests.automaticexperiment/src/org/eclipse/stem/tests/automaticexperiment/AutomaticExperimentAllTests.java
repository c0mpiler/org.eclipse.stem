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

package org.eclipse.stem.tests.automaticexperiment;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * Test suite for Automatic Experiment tests
 *
 */
public class AutomaticExperimentAllTests extends TestSuite 
{
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		TestSuite suite = new AutomaticExperimentAllTests("Automatic Experiment Tests");
		suite.addTestSuite(AutomaticExperimentTest.class);
		suite.addTestSuite(NelderMeadAlgorithmTest.class);
		return suite;
	}

	public AutomaticExperimentAllTests(String name) {
		super(name);
	}

}
