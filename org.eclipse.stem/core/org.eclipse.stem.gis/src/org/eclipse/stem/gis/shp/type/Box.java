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
package org.eclipse.stem.gis.shp.type;

public class Box 
{
	protected final double xMin;
	protected final double yMin;
	protected final double xMax;
	protected final double yMax;
	
	public Box(double xMin, double yMin, double xMax, double yMax)
	{
		this.xMin = xMin;
		this.yMin = yMin;
		this.xMax = xMax;
		this.yMax = yMax;
	}
	
	public double getXMin() 
	{
		return xMin;
	}

	public double getYMin() 
	{
		return yMin;
	}

	public double getXMax() 
	{
		return xMax;
	}

	public double getYMax() 
	{
		return yMax;
	}

	@Override
	public String toString() {
		return "Box [xMin=" + xMin + ", yMin=" + yMin + ", xMax=" + xMax
				+ ", yMax=" + yMax + "]";
	}
	
	
}
