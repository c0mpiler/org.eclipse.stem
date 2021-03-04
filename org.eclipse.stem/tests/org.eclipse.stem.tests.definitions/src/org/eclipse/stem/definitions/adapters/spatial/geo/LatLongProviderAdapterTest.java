// LatLongProviderAdapterTest.java
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
import org.eclipse.stem.definitions.adapters.spatial.SpatialProviderAdapter;
import org.eclipse.stem.definitions.adapters.spatial.SpatialProviderAdapterTest;

/**
 * This class is a JUnit test case for LatLongProviderAdapter.
 */
@SuppressWarnings("all")
public class LatLongProviderAdapterTest extends SpatialProviderAdapterTest {

	public static final String SPATIAL_INLINE_TEST_URI_STRING = SpatialProviderAdapter.STEM_SPATIAL_SCHEME
			+ ":"
			+ InlineLatLongDataProviderTest.TEST_INLINE_LAT_LONG_URI_STRING1;

	private LatLongProviderAdapter getFixture() {
		return (LatLongProviderAdapter) fixture;
	} // LatLongProviderAdapter

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		final LatLongProviderAdapter temp = new LatLongProviderAdapter();
		final Node node = GraphFactory.eINSTANCE.createNode();
		node.getDublinCore().setSpatial(SPATIAL_INLINE_TEST_URI_STRING);
		temp.setTarget(node);
		setFixture(temp);
	} // setUp

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testIsAdapterForType() {
		final LatLongProviderAdapter fixture = getFixture();
		assertTrue(fixture.isAdapterForType(LatLongProvider.class));
	} // testIsAdapterForType

	/**
	 * Test method for
	 * {@link org.eclipse.stem.definitions.adapters.spatial.LatLongProviderAdapter#getLatLong()}.
	 */
	public void testGetLatLong() {
		final LatLongProviderAdapter fixture = getFixture();
		final LatLong result = fixture.getLatLong();
		InlineLatLongDataProviderTest.verifyInlineLatLongResult(result);
	}

	/**
	 * Test method for
	 * {@link org.eclipse.stem.definitions.adapters.spatial.LatLongProviderAdapter#getCenterLatLong()}.
	 */
	public void testGetCenter() {
		final LatLongProviderAdapter fixture = getFixture();
		final double[] result = fixture.getCenter();
		assertNotNull(result);
	} // testGetCenter

} // LatLongProviderAdapterTest
