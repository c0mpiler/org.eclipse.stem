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
package org.eclipse.stem.gis.coord;

import java.util.HashMap;
import java.util.Map;

public class Ellipsoid 
{
	private final double majorAxis;
	private final double minorAxis;
	private final double flattening;
	
	public static String DEFAULT_ELLIPSOID_NAME = "WGS_1984";
	
	private static final Map<String,Ellipsoid> COMMON_ELLIPSOIDS = new HashMap<String,Ellipsoid>();
	static {
		COMMON_ELLIPSOIDS.put("WGS_1984", new Ellipsoid(6378137.0,298.257223563));
		COMMON_ELLIPSOIDS.put("GRS_1980", new Ellipsoid(6378137.0,298.257222101));
	}
	
	public Ellipsoid(double majorAxis, double flattening)
	{
		this.majorAxis = majorAxis;
		this.flattening = flattening;
		if (flattening != 0.0) {
			this.minorAxis = (majorAxis - majorAxis/flattening);
		} else {
			this.minorAxis = majorAxis;
		}
	}
	
	public static Ellipsoid getDefaultEllipsoid()
	{
		return COMMON_ELLIPSOIDS.get(DEFAULT_ELLIPSOID_NAME);
	}
	
	public static Ellipsoid getForName(String name)
	{
		return COMMON_ELLIPSOIDS.get(name);
	}

	public double getMajorAxis() {
		return majorAxis;
	}

	public double getMinorAxis() {
		return minorAxis;
	}

	public double getFlattening() {
		return flattening;
	}
	
	public double getEccentricity()
	{
		return Math.sqrt(getEccentricitySquared());
	}
	
	public double getEccentricitySquared()
	{
		return 1.0-((minorAxis*minorAxis)/(majorAxis*majorAxis));
	}

	@Override
	public String toString() {
		return "Ellipsoid [majorAxis=" + majorAxis + ", minorAxis=" + minorAxis
				+ ", flattening=" + flattening + ", eccentricity="+getEccentricitySquared()+"]";
	}
	
	
	
}
