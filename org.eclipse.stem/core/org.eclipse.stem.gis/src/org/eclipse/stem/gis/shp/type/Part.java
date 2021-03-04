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

import org.eclipse.stem.gis.shp.ShpConstants;

public class Part 
{
	protected double[] xs;
	protected double[] ys;
	protected double[] zs;
	protected double[] ms;
	
	protected int pointCount;
	protected int partType;
	
	public Part(double[][] points)
	{
		this(ShpConstants.SHP_PART_RING, points);
	}
	
	public Part(int partType, double[][] points)
	{
		this.xs = points[0];
		this.ys = points[1];
		this.partType = partType;
		this.pointCount = xs.length;
	}
	
	public int getPointCount()
	{
		return pointCount;
	}
	
	public void setZs(double[] zs)
	{
		this.zs = zs;
	}
	
	public void setMs(double[] ms)
	{
		this.ms = ms;
	}
	
	public double[] getZs() 
	{
		return zs;
	}
	
	public double[] getMs() 
	{
		return ms;
	}
	
	public double[] getYs() 
	{
		return ys;
	}
	
	public double[] getXs() 
	{
		return xs;
	}

	public int getPartType() 
	{
		return partType;
	}

	public String arrayToString(double[] values, int maxLen)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for (int idx=0; idx<Math.min(maxLen, values.length); idx++) {
			sb.append(values[idx]);
			sb.append(", ");
		}
		if (maxLen < values.length){
			sb.append("...");
		} else {
			sb.deleteCharAt(sb.length()-1);
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		return sb.toString();
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Part 2D (");
		sb.append(getPointCount());
		sb.append(") [\n");
		if (xs != null) {
			sb.append("Xs: ");
			sb.append(arrayToString(xs, 10));
			sb.append("\n");
		}
		if (ys != null) {
			sb.append("Ys: ");
			sb.append(arrayToString(ys, 10));
			sb.append("\n");
		}
		if (zs != null) {
			sb.append("Zs: ");
			sb.append(arrayToString(zs, 10));
			sb.append("\n");
		}
		if (ms != null) {
			sb.append("Ms: ");
			sb.append(arrayToString(ms, 10));
			sb.append("\n");
		}
		sb.append("]");
		
		return sb.toString();
	}
	
}
