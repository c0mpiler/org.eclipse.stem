package org.eclipse.stem.core.modifier.tests;

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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.stem.core.modifier.IntegerNOPModifier;
import org.eclipse.stem.core.modifier.ModifierFactory;
import org.eclipse.stem.core.modifier.StringNOPModifier;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String NOP Modifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class StringNOPModifierTest extends NOPModifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringNOPModifierTest.class);
	}

	/**
	 * Constructs a new String NOP Modifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringNOPModifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String NOP Modifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringNOPModifier getFixture() {
		return (StringNOPModifier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		setFixture(createFixture());
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
	 * @return a {@link IntegerNOPModifier} ready for testing.
	 */
	public StringNOPModifier createFixture() {
		final StringNOPModifier retValue = ModifierFactory.eINSTANCE.createStringNOPModifier();
		EObject testObject = getTestObject();
		EStructuralFeature feature = testObject.eClass()
		.getEStructuralFeatures().get(0);
		retValue.setEStructuralFeature(feature);
		return retValue;
	} // createFixture
	
	/**
	 * @see org.eclipse.stem.core.modifier.tests.FeatureModifierTest#getTestAttributeEType()
	 */
	@Override
	protected EClassifier getTestAttributeEType() {
		return EcorePackage.eINSTANCE.getEString();
	}
} //StringNOPModifierTest
