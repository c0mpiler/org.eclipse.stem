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
import org.eclipse.stem.gis.shp.type.Range;

public class ShpPolyLineM extends ShpPolyLine
{
	protected Range mRange;

	ShpPolyLineM()
	{
		this(null,null,null);
	}
	
	public ShpPolyLineM(Box boundingBox, Part[] parts, Range mRange) 
	{
		super(boundingBox, parts);
		this.mRange = mRange;
	}
	
	void setMRange(Range mRange) {
		this.mRange = mRange;
	}

	public Range getMRange() {
		return mRange;
	}
	
	public int getType()
	{
		return ShpConstants.SHP_POLY_LINE_M;
	}
	
	
}
