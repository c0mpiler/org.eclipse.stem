package org.eclipse.stem.definitions.labels.tests;

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

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>labels</b></em>'
 * package. <!-- end-user-doc -->
 * @generated
 */
public class LabelsTests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new LabelsTests("labels Tests"); //$NON-NLS-1$
		suite.addTestSuite(AreaLabelTest.class);
		suite.addTestSuite(AreaLabelValueTest.class);
		suite.addTestSuite(CommonBorderRelationshipLabelTest.class);
		suite.addTestSuite(CommonBorderRelationshipLabelValueTest.class);
		suite.addTestSuite(PopulationLabelTest.class);
		suite.addTestSuite(PopulationLabelValueTest.class);
		suite.addTestSuite(RelativePhysicalRelationshipLabelTest.class);
		suite.addTestSuite(RelativePhysicalRelationshipLabelValueTest.class);
		suite.addTestSuite(TransportRelationshipLabelTest.class);
		suite.addTestSuite(TransportRelationshipLabelValueTest.class);
		suite.addTestSuite(PhysicalRelationshipLabelValueTest.class);
		suite.addTestSuite(RoadTransportRelationshipLabelTest.class);
		suite.addTestSuite(RoadTransportRelationshipLabelValueTest.class);
		suite.addTestSuite(EarthScienceLabelTest.class);
		suite.addTestSuite(EarthScienceLabelValueTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelsTests(String name) {
		super(name);
	}

} // LabelsTests
