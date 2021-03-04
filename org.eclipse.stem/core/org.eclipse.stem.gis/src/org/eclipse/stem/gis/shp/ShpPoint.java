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
package org.eclipse.stem.gis.shp;

public class ShpPoint extends ShpRecord
{

	protected double x;
	protected double y;

	ShpPoint()
	{
		this(0.0, 0.0);
	}
	
	public ShpPoint(double x, double y)
	{
		super();
		setPoints(x,y);

	}
	
	void setPoints(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}

	public int getType()
	{
		return ShpConstants.SHP_POINT;
	}
	
//	@Override
//	public String toString() {
//		return "ShpPoint [point=" + point + "]";
//	}
	
}
