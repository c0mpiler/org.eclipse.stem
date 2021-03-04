package org.eclipse.stem.sample;

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

import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment;

/**
 *
 */
public class UtilityTest extends TestCase {
    LatLong polygon1 =null;
    LatLong polygon2 =null;
    LatLong polygon3 =null;
    LatLong polygon4 =null;
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		double[][] d1 = {{0.0, 0.0},
				{10.0, 0.0},
				{10.0, 10.0},
				{0.0, 10.0},
				{0.0, 0.0} };
		Segment s1 = new Segment(d1);
		polygon1 = new LatLong();
		polygon1.add(s1);
		
		double[][] d2 = {{10.0, 0.0},
				{10.0, 20.0},
				{20.0, 0.0},
				{10.0, 0.0} };
		Segment s2 = new Segment(d2);
		polygon2 = new LatLong();
		polygon2.add(s2);
		
		double[][] d3 = {{20.0, 0.0},
				{20.0, 20.0},
				{40.0, 0.0},
				{20.0, 0.0} };
		Segment s3 = new Segment(d3);
		polygon3 = new LatLong();
		polygon3.add(s3);
		
		double[][] d4a = {{-20.0, 0.0},
				{-20.0, -10.0},
				{-40.0, -10.0},
				{-20.0, -10.0},
				{-20.0, 0.0} };
		Segment s4a = new Segment(d4a);
		polygon4 = new LatLong();
		polygon4.add(s4a);
		double[][] d4b = {{00.0, 0.0},
				{-20.0, 0.0},
				{-20.0, -20.0},
				{0.0, -20.0},
				{0.0, 0.0} };
		Segment s4b = new Segment(d4b);		
		polygon4.add(s4b);
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for 
	 * {@link org.eclipse.stem.sample.Utility#setBBox(String, LatLong)}.
	 */
//	public void testGetBBoxLatLong() {
//		Map<String,Rectangle[]> map = new HashMap<String,Rectangle[]>();
//		NeighborUtility.setBBox(map,"Test3",polygon3);
//		NeighborUtility.setBBox(map,"Test1",polygon1);
//		NeighborUtility.setBBox(map,"Test4",polygon4);
//		NeighborUtility.setBBox(map,"Test2",polygon2);
//		List list = NeighborUtility.processBBox(map);
//	    Assert.assertNotNull(list);
//	    Assert.assertEquals(list.size(),3);
//		
//	}

}
