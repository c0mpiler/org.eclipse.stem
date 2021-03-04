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

public class ShpConstants 
{
	public static final String SHP_GEOMETRY_FILE_EXT = "shp";
	public static final String SHP_DATABASE_FILE_EXT = "dbf";
	public static final String SHP_INDEX_FILE_EXT = "shx";
	public static final String SHP_PROJECTION_FILE_EXT = "prj";
	
	// Non-standard
	public static final int SHP_UNKNOWN_SHAPE= -1;
	
	public static final int SHP_NULL_SHAPE= 0;
	public static final int SHP_POINT = 1;
	public static final int SHP_POLY_LINE = 3;
	public static final int SHP_POLYGON = 5;
	public static final int SHP_MULTI_POINT = 8;
	public static final int SHP_POINT_Z = 11;
	public static final int SHP_POLY_LINE_Z = 13;
	public static final int SHP_POLYGON_Z = 15;
	public static final int SHP_MULTI_POINT_Z = 18;
	public static final int SHP_POINT_M = 21;
	public static final int SHP_POLY_LINE_M = 23;
	public static final int SHP_POLYGON_M = 25;
	public static final int SHP_MULTI_POINT_M = 28;
	public static final int SHP_MULTI_PATCH = 31;
	
	public static final int SHP_PART_TRIANGLE_STRIP = 0;
	public static final int SHP_PART_TRIANGLE_FAN = 1;
	public static final int SHP_PART_OUTER_RING = 2;
	public static final int SHP_PART_INNER_RING = 3;
	public static final int SHP_PART_FIRST_RING = 4;
	public static final int SHP_PART_RING = 5;
}
