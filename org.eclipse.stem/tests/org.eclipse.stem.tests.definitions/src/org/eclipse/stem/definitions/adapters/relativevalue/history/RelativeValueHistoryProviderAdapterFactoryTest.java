// RelativeValueHistoryProviderAdapterFactoryTest.java
package org.eclipse.stem.definitions.adapters.relativevalue.history;

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
 * This class is a JUnit test case for
 * RelativeValueHistoryProviderAdapterFactory
 */
abstract public class RelativeValueHistoryProviderAdapterFactoryTest extends TestCase {
	/**
	 * This is the factory under test. The value is set in the
	 * <code>setUp</code> method of a derived class.
	 */
	protected RelativeValueHistoryProviderAdapterFactory fixture = null;

	private RelativeValueHistoryProviderAdapterFactory getFixture() {
		return fixture;
	} // getFixture

	protected void setFixture(final RelativeValueHistoryProviderAdapterFactory fixture) {
		this.fixture = fixture;
	} // setFixture

	/**
	 * Test method for
	 * {@link org.eclipse.stem.definitions.adapters.relativevalue.history.RelativeValueHistoryProviderAdapterFactory.RelativeValueProviderAdapterFactoryImpl#isFactoryForType(java.lang.Object)}.
	 */
	public void testIsFactoryForTypeObject() {
		final RelativeValueHistoryProviderAdapterFactory fixture = getFixture();
		assertTrue(fixture.isFactoryForType(RelativeValueHistoryProvider.class));
	} // testIsFactoryForTypeObject

} // RelativeValueHistoryProviderAdapterFactoryTest
