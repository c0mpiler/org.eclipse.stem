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
package org.eclipse.stem.gis.proj;

import org.eclipse.stem.gis.coord.Ellipsoid;

public class UTMProjection extends TransverseMercatorProjection 
{
	public static final double DEFAULT_FALSE_EASTING = 500000.0;
	public static final double DEFAULT_SCALE = 0.9996;
	
	public UTMProjection(int utmZoneNumber, boolean isNorthernHemisphere,
			Ellipsoid datum) {
		super(DEFAULT_FALSE_EASTING, // default false easting
				(isNorthernHemisphere ? 0.0 : 10000000.0), // default false northing
				getMeridianOffsetForUTMZone(utmZoneNumber), // central merdian offset
				DEFAULT_SCALE, // default scale
				datum);
	}

	
	public static double getMeridianOffsetForUTMZone(int zoneNumber)
	{
		return ((zoneNumber - 1) * 6 - 177);
	}
	

//	public static void main(String[] args)
//	{
//		UTMProjection proj = new UTMProjection(32, true, Ellipsoid.getDefaultEllipsoid());
//		System.out.println(proj.inverseProject(595000.0, 5740000.0));
//		System.out.println(proj.project(10.377804512727295, 51.802771341166256));
//	}
}
