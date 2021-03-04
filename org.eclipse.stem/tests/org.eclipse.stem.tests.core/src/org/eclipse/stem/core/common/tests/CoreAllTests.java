package org.eclipse.stem.core.common.tests;

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

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.eclipse.stem.core.experiment.tests.ExperimentTests;
import org.eclipse.stem.core.graph.tests.GraphTests;
import org.eclipse.stem.core.logger.tests.LoggerTests;
import org.eclipse.stem.core.model.tests.ModelTests;
import org.eclipse.stem.core.modifier.tests.ModifierTests;
import org.eclipse.stem.core.predicate.tests.PredicateTests;
import org.eclipse.stem.core.scenario.tests.ScenarioTests;
import org.eclipse.stem.core.sequencer.tests.SequencerTests;
import org.eclipse.stem.core.solver.tests.SolverTests;
import org.eclipse.stem.core.trigger.tests.TriggerTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Core</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreAllTests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CoreAllTests("Core Tests"); //$NON-NLS-1$
		suite.addTest(CommonTests.suite());
		suite.addTest(ExperimentTests.suite());
		suite.addTest(GraphTests.suite());
		suite.addTest(ModelTests.suite());
		suite.addTest(ModifierTests.suite());
		suite.addTest(PredicateTests.suite());
		suite.addTest(ScenarioTests.suite());
		suite.addTest(SequencerTests.suite());
		suite.addTest(TriggerTests.suite());
		suite.addTest(SolverTests.suite());
		suite.addTest(LoggerTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAllTests(String name) {
		super(name);
	}

} //CoreAllTests
