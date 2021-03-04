package org.eclipse.stem.diseasemodels.standard.tests;

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

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.diseasemodels.standard.SIR;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>SIR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.SIR#getAdjustedImmunityLossRate(long) <em>Get Adjusted Immunity Loss Rate</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SIRTest extends SITest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SIRTest.class);
	}

	/**
	 * This coefficient determines the number of population members that lose
	 * their immunity to a disease and become Susceptible to the disease per
	 * population member in the <em>Recovered</em> state. A value of zero
	 * (0.0), the default, means the population members never lose their
	 * immunity. Units: population members
	 * 
	 * @see SIR#getImmunityLossRate()
	 */
	final public static double IMMUNITY_LOSS_RATE = 0.1;

	/**
	 * Constructs a new SIR test case with the given name.
	 * <!-- begin-user-doc
	 * -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIRTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SIR test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected SIR getFixture() {
		return (SIR)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StandardFactory.eINSTANCE.createSIR());
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
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.SIR#getAdjustedImmunityLossRate <em>Get Adjusted Immunity Loss Rate</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.SIR#getAdjustedImmunityLossRate
	 * @generated NOT
	 */
	public void testGetAdjustedImmunityLossRate__long() {
		final SIR fixture = getFixture();
		assertTrue(DiseaseModelTestUtil.closeEnough(fixture
				.getAdjustedImmunityLossRate(2 * fixture.getTimePeriod()),
				(2 * fixture.getImmunityLossRate())));
	} // testGetAdjustedImmunityLossRate__long

	@Override
	protected StandardDiseaseModelLabel createLabelFixture() {
		return SIRLabelTest.createFixture();
	} // createLabelValueFixture

	@Override
	protected EClass getDiseaseModelLabelClass() {
		return StandardPackage.eINSTANCE.getSIRLabel();
	} // getDiseaseModelLabelClass

} // SIRTest
