package org.eclipse.stem.core.model.tests;

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

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.model.EdgeDecorator;
import org.eclipse.stem.core.model.ModelFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Edge Decorator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class EdgeDecoratorTest extends DecoratorTest {
	
	public static URI DECORATOR_URI = STEMURI.createURI("decorator/edgeDecoratorTest.decorator");
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EdgeDecoratorTest.class);
	}

	/**
	 * Constructs a new Edge Decorator test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EdgeDecoratorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edge Decorator test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EdgeDecorator getFixture() {
		return (EdgeDecorator)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
			
		EdgeDecorator d = ModelFactory.eINSTANCE.createEdgeDecorator();
		d.setURI(DECORATOR_URI);
		
		setFixture(d);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Test the sanity of the fixture
	 */
	public void testSane() {
		final EdgeDecorator edgeDecorator = getFixture();
		assertTrue(edgeDecorator.sane());
	} // testSane


} // EdgeDecoratorTest
