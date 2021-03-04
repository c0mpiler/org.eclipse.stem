// SegmentTest.java
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

import junit.framework.TestCase;

import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment;

/**
 * This class represents
 */
@SuppressWarnings("all")
public class SegmentTest extends TestCase {

	private static final double LAT_0 = 0;

	private static final double LONG_0 = 1.0;

	private static final double LAT_1 = 10.0;

	private static final double LONG_1 = 11.0;

	private static final double LAT_2 = LAT_0;

	private static final double LONG_2 = LONG_0;

	protected Segment fixture = null;

	@SuppressWarnings("unqualified-field-access")
	private Segment getFixture() {
		return fixture;
	}

	protected void setFixture(Segment fixture) {
		this.fixture = fixture;
	}

	/**
	 * @return the fixture for testing
	 */
	public static Segment createFixture() {
		final double[][] data = new double[3][2];
		data[0][Segment.LATITUDE_INDEX] = LAT_0;
		data[0][Segment.LONGITUDE_INDEX] = LONG_0;
		data[1][Segment.LATITUDE_INDEX] = LAT_1;
		data[1][Segment.LONGITUDE_INDEX] = LONG_1;
		data[2][Segment.LATITUDE_INDEX] = LAT_2;
		data[2][Segment.LONGITUDE_INDEX] = LONG_2;
		return new Segment(data);
	} // createFixture

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		setFixture(createFixture());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Test method for
	 * {@link org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment#latitude(int)}.
	 */
	public void testLatitude() {
		final Segment segment = getFixture();
		assertTrue(segment.latitude(0) == LAT_0);
		assertTrue(segment.latitude(1) == LAT_1);
		assertTrue(segment.latitude(2) == LAT_2);
	} // testLatitude

	/**
	 * Test method for
	 * {@link org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment#longitude(int)}.
	 */
	public void testLongitude() {
		final Segment segment = getFixture();
		assertTrue(segment.longitude(0) == LONG_0);
		assertTrue(segment.longitude(1) == LONG_1);
		assertTrue(segment.longitude(2) == LONG_2);
	} // testLongitude

	/**
	 * Test method for
	 * {@link org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment#size()}.
	 */
	public void testSize() {
		final Segment segment = getFixture();
		assertTrue(segment.size() == 3);
	}

	/**
	 * Test method for
	 * {@link org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment#isPolygon()}.
	 */
	public void testIsPolygon() {
		final Segment segment = getFixture();
		assertTrue(segment.isPolygon());
	} // testIsPolygon

} // SegmentTest
