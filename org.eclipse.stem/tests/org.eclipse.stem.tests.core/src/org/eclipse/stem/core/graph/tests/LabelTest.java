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
import org.eclipse.stem.core.common.tests.IdentifiableTest;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.tests.util.TestUtil;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.graph.Label#getIdentifiable() <em>Identifiable</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public abstract class LabelTest extends IdentifiableTest {

	/**
	 * Constructs a new Label test case with the given name.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public LabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Label getFixture() {
		return (Label)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.stem.core.graph.Label#getIdentifiable() <em>Identifiable</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.graph.Label#getIdentifiable()
	 * @generated NOT
	 */
	public void testGetIdentifiable() {
		final Label fixture = getFixture();
		fixture.setIdentifiable(null);
		assertNull(fixture.getIdentifiable());
	}

	/**
	 * Tests the '{@link org.eclipse.stem.core.graph.Label#setIdentifiable(org.eclipse.stem.core.common.Identifiable) <em>Identifiable</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.graph.Label#setIdentifiable(org.eclipse.stem.core.common.Identifiable)
	 * @generated NOT
	 */
	public void testSetIdentifiable() {
		final Label fixture = getFixture();
		fixture.setIdentifiable(null);
		assertNull(fixture.getIdentifiable());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(createFixture());
	} // setUp

	/**
	 * @return a static label for testing
	 */
	public Label createFixture() {
		return TestUtil.createStaticLabel(TestUtil
				.createNextIdentifiableToLabelURI());
	} // createFixture

	/**
	 * Test the sanity of the fixture
	 */
	@Override
	public void testSane() {
		final Label label = getFixture();
		assertTrue(label.sane());
	} // testSane

	/**
	 * Test the Label has the right type URI.
	 * 
	 * @generated NOT
	 */
	public void testGetTypeURI() {
		final Label label = getFixture();
		assertTrue(label.getTypeURI().equals(Label.URI_TYPE_LABEL));
	} // testGetTypeURI

} // LabelTest
