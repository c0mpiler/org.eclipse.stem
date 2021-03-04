package org.eclipse.stem.definitions.labels.tests;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.stem.definitions.labels.EarthScienceLabel;
import org.eclipse.stem.definitions.labels.EarthScienceLabelValue;
import org.eclipse.stem.definitions.labels.LabelsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Earth Science Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabel#getCurrentEarthScienceValue() <em>Current Earth Science Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EarthScienceLabelTest extends TestCase {

	
	
	protected EarthScienceLabelValue eslv;
	
	/**
	 * The fixture for this Earth Science Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthScienceLabel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EarthScienceLabelTest.class);
	}

	/**
	 * Constructs a new Earth Science Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthScienceLabelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Earth Science Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EarthScienceLabel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Earth Science Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthScienceLabel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		
		EarthScienceLabel esl = LabelsFactory.eINSTANCE.createEarthScienceLabel();
		eslv = LabelsFactory.eINSTANCE.createEarthScienceLabelValue();
		esl.setCurrentValue(eslv);
		setFixture(esl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.stem.definitions.labels.EarthScienceLabel#getCurrentEarthScienceValue() <em>Current Earth Science Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabel#getCurrentEarthScienceValue()
	 * @generated NOT
	 */
	public void testGetCurrentEarthScienceValue() {
		assertTrue(getFixture().sane());
		assertTrue(getFixture().getCurrentEarthScienceValue() == eslv);
	}

} //EarthScienceLabelTest
