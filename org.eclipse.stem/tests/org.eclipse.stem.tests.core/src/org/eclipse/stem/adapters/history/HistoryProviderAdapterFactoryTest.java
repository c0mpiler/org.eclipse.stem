// HistoryProviderAdapterFactoryTest.java
package org.eclipse.stem.adapters.history;

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
 * This class is a JUnit test case for {@link HistoryProviderAdapterFactory}.
 */
abstract public class HistoryProviderAdapterFactoryTest extends TestCase {

	/**
	 * This is the factory under test. The value is set in the
	 * <code>setUp</code> method of a derived class.
	 */
	protected HistoryProviderAdapterFactory fixture = null;

	private HistoryProviderAdapterFactory getFixture() {
		return fixture;
	} // SpatialProviderAdapterFactory

	protected void setFixture(final HistoryProviderAdapterFactory fixture) {
		this.fixture = fixture;
	} // setFixture

	/**
	 */
	public void testIsFactoryForTypeObject() {
		final HistoryProviderAdapterFactory fixture = getFixture();
		assertTrue(fixture.isFactoryForType(HistoryProvider.class));
	} // testIsFactoryForTypeObject

} // HistoryProviderAdapterFactoryTest
