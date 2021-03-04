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

public class Range
{
	protected final double min;
	protected final double max;
	
	public Range(double min, double max)
	{
		this.min = min;
		this.max = max;
	}

	@Override
	public String toString() 
	{
		return "Range [x=" + min + ", y=" + max + "]";
	}

	public double getMin() 
	{
		return min;
	}

	public double getMax() 
	{
		return max;
	}
	
	
}
