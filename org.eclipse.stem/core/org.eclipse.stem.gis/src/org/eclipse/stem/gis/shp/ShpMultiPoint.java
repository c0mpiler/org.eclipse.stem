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

import org.eclipse.stem.gis.shp.type.Box;
import org.eclipse.stem.gis.shp.type.Part;


public class ShpMultiPoint extends ShpRecord
{
	protected Box boundingBox;
	protected Part part;
	
	ShpMultiPoint()
	{
		this(null,null);
	}
	
	public ShpMultiPoint(Box boundingBox, Part part) 
	{
		super();
		this.boundingBox = boundingBox;
		this.part = part;
	}

	void setPart(Part part)
	{
		this.part = part;
	}
	
	void setBoundingBox(Box boundingBox) 
	{
		this.boundingBox = boundingBox;
	}

	public Box getBoundingBox() 
	{
		return boundingBox;
	}
	
	public double[] getXs()
	{
		return part.getXs();
	}
	
	public double[] getYs()
	{
		return part.getYs();
	}
	
	
	public int getType()
	{
		return ShpConstants.SHP_MULTI_POINT;
	}
	
}
