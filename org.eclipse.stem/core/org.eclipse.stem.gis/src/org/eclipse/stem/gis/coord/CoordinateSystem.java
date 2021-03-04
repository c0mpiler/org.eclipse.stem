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

import java.awt.geom.Point2D;

import org.eclipse.stem.gis.proj.Projection;

public class CoordinateSystem 
{
	protected Projection projection;
	protected String name;
	
	
	public CoordinateSystem(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	
	void setProjection(Projection projection)
	{
		this.projection = projection;
	}
	
	public Projection getProjection()
	{
		return projection;
	}
	
	public Point2D project(double lon, double lat)
	{
		if (projection != null) {
			return projection.project(lon,lat);
		} else {
			return new Point2D.Double(lon,lat);
		}
	}
	
	public Point2D inverseProject(double x, double y)
	{
		if (projection != null) {
			return projection.inverseProject(x,y);
		} else {
			return new Point2D.Double(x,y);
		}
	}
}
