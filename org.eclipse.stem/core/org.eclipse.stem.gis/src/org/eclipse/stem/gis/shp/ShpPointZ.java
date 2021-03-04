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

public class ShpPointZ extends ShpPointM
{
	protected double z;
	
	ShpPointZ()
	{
		this(0.0,0.0,0.0,0.0);
	}
	
	public ShpPointZ(double x, double y, double m, double z) 
	{
		super(x,y,m);
	}
	
	void setZ(double z)
	{
		this.z = z;
	}
	
	public double getZ()
	{
		return z;
	}
	
	public int getType()
	{
		return ShpConstants.SHP_POINT_Z;
	}
	
}
