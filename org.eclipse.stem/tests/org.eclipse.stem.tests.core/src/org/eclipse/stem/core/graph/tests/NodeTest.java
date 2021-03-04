package org.eclipse.stem.core.graph.tests;

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

//import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.tests.IdentifiableTest;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.tests.util.TestUtil;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.graph.Node#getLabel(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EAttribute, java.lang.Object) <em>Get Label</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public class NodeTest extends IdentifiableTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeTest.class);
	}

	/**
	 * Constructs a new Node test case with the given name.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected Node getFixture() {
		return (Node)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	protected void setUp() throws Exception {
		setFixture(TestUtil.createStaticallyLabeledNode());
	} // setUp

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
	 * Tests the '{@link org.eclipse.stem.core.graph.Node#getLabel(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EAttribute, java.lang.Object) <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.graph.Node#getLabel(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EAttribute, java.lang.Object)
	 * @generated
	 */
	public void testGetLabel__EClass_EAttribute_Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.core.graph.Node#getLabel(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EAttribute, java.lang.Object) <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.graph.Node#getLabel(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EAttribute, java.lang.Object)
	 * @generated
	 */
//	public void testGetLabel__EClass_EAttribute_Object() {
//		// TODO: implement this operation test method
//		// Ensure that you remove @generated or mark it @generated NOT
//		fail();
//	}

	/**
	 * Tests the '{@link org.eclipse.stem.core.graph.Node#getLabel(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EAttribute, java.lang.Object) <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.graph.Node#getLabel(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EAttribute, java.lang.Object)
	 * @generated
	 */
//	public void testGetLabel__EClass_EAttribute_Object() {
//		// TODO: implement this operation test method
//		// Ensure that you remove @generated or mark it @generated NOT
//		fail();
//	}

	/**
	 * Test the sanity of the fixture
	 */
	public void testSane() {
		final Node node = getFixture();
		assertTrue(node.sane());
	} // testSane

	/**
	 * Test the Node has the right type URI.
	 * 
	 * @generated NOT
	 */
	public void testGetTypeURI() {
		final Node node = getFixture();
		assertTrue(node.getTypeURI().equals(STEMURI.NODE_TYPE_URI));
	} // testGetTypeURI

} // NodeTest
