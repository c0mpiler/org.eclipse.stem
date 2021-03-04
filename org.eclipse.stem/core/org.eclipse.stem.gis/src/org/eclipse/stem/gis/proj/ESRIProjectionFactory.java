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

import java.util.Properties;

import org.eclipse.stem.gis.Activator;
import org.eclipse.stem.gis.coord.ProjectedCoordinateSystem;

public class ESRIProjectionFactory 
{
	public static Projection getForCoordinateSystem(ProjectedCoordinateSystem cs)
	{
		if ("Transverse_Mercator".equals(cs.getProjectionName())) {
			return getTransverseMercatorProjection(cs);
		}
		
		Activator.logWarning("Warning: Projection "+cs.getProjectionName()+" in coordinate system "+ cs.getName() +" is not supported.", null);
		
		return new NullProjection();
	}
	
	private static Projection getTransverseMercatorProjection(ProjectedCoordinateSystem cs)
	{
		Properties projectionProperties = cs.getProperties();
		
		double falseNorthing = Double.valueOf(projectionProperties.getProperty("False_Northing", "0.0"));
		double falseEasting = Double.valueOf(projectionProperties.getProperty("False_Easting", "0.0"));
		double scale = Double.valueOf(projectionProperties.getProperty("Scale_Factor", "0.0"));
		double centralMeridianLongitude = Double.valueOf(projectionProperties.getProperty("Central_Meridian", "0.0"));
		//double originLatitude = Double.valueOf(projectionProperties.getProperty("Latitude_Of_Origin", "0.0"));

		return new TransverseMercatorProjection(falseEasting, falseNorthing, centralMeridianLongitude, scale, cs.getGeoCoordinateSystem().getDatum());
	}
		
}
