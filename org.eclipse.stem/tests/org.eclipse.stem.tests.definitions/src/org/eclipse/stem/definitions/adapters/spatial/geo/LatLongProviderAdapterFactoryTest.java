// LatLongProviderAdapterFactoryTest.java
package org.eclipse.stem.definitions.adapters.spatial.geo;

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

import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.definitions.adapters.spatial.SpatialProviderAdapterFactoryTest;

/**
 * This class is a JUnit test case for LatLongProviderAdapterFactory.
 */
@SuppressWarnings("all")
public class LatLongProviderAdapterFactoryTest extends
		SpatialProviderAdapterFactoryTest {

	private LatLongProviderAdapterFactory getFixture() {
		return (LatLongProviderAdapterFactory) fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		setFixture(new LatLongProviderAdapterFactory());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Test method for
	 * {@link org.eclipse.stem.definitions.adapters.spatial.LatLongProviderAdapterFactory#isFactoryForType(java.lang.Object)}.
	 */
	public void testIsFactoryForTypeObject() {
		final LatLongProviderAdapterFactory fixture = getFixture();
		assertTrue(fixture.isFactoryForType(LatLongProvider.class));
	} // testIsFactoryForTypeObject

	/**
	 * Test method for
	 * {@link org.eclipse.stem.definitions.adapters.spatial.LatLongProviderAdapterFactory#createAdapter(org.eclipse.emf.common.notify.Notifier)}.
	 */
	public void testCreateAdapterNotifier() {
		final Node node = GraphFactory.eINSTANCE.createNode();
		node.getDublinCore().setSpatial(
				LatLongProviderAdapterTest.SPATIAL_INLINE_TEST_URI_STRING);

		final LatLongProvider latLongProvider = (LatLongProvider) LatLongProviderAdapterFactory.INSTANCE
				.adapt(node, LatLongProvider.class);

		final LatLong result = latLongProvider.getLatLong();
		System.out.println("result = "+result);
		InlineLatLongDataProviderTest.verifyInlineLatLongResult(result);
	} // testCreateAdapterNotifier

} // LatLongProviderAdapterFactoryTest
