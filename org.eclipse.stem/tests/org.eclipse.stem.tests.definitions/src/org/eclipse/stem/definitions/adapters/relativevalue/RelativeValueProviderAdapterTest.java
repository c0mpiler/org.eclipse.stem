// RelativeValueProviderAdapterTest.java
package org.eclipse.stem.definitions.adapters.relativevalue;

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

import junit.framework.TestCase;

/**
 * This class is a JUnit test case for <code>RelativeValueProviderAdapter</code>'s.
 */
abstract public class RelativeValueProviderAdapterTest extends TestCase {

	/**
	 * This is the adapter under test. The value is set in the
	 * <code>setUp</code> method of a derived class.
	 */
	protected RelativeValueProviderAdapter fixture = null;

	private RelativeValueProviderAdapter getFixture() {
		return fixture;
	} // getFixture

	protected void setFixture(final RelativeValueProviderAdapter fixture) {
		this.fixture = fixture;
	} // setFixture

	/**
	 * Test method for
	 * {@link RelativeValueProviderAdapter#isAdapterForType(Object)}
	 */
	public void testIsAdapterForType() {
		final RelativeValueProviderAdapter fixture = getFixture();
		assertTrue(fixture.isAdapterForType(RelativeValueProvider.class));
	} // testIsAdapterForType

} // RelativeValueProviderAdapterTest
