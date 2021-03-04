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
package org.eclipse.stem.gis;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.eclipse.stem.gis.coord.CoordinateSystem;
import org.eclipse.stem.gis.coord.CoordinateSystemLoader;
import org.eclipse.stem.gis.dbf.DbfHeader;
import org.eclipse.stem.gis.dbf.DbfInputStream;
import org.eclipse.stem.gis.shp.ShpHeader;
import org.eclipse.stem.gis.shp.ShpInputStream;
import org.eclipse.stem.gis.shp.ShpRecord;

public class ShapefileReader 
{
	protected ShpInputStream shpIn;
	protected DbfInputStream dbfIn;
	protected ShpRecord bufRecord;
	
	protected CoordinateSystem coordinateSystem;
	
	public ShapefileReader(File file) throws IOException
	{
		load(file);
	}

	public ShapefileReader(ShpInputStream shpis, DbfInputStream dbis, CoordinateSystem cs) throws IOException
	{
		this.shpIn = shpis;
		this.dbfIn = dbis;
		this.coordinateSystem = cs;
	}
	
	private void load(File shpFile) throws IOException
	{	
		try {
			coordinateSystem = CoordinateSystemLoader.loadFromPrj(GisUtils.getProjectionFileForShp(shpFile));
		} catch (Exception e) {
			Activator.logWarning("Unable to load projection definition for the shapefile "+ shpFile, e);
		}
		
		this.shpIn = new ShpInputStream(
				new BufferedInputStream(
						new FileInputStream(shpFile)), coordinateSystem);
		
		this.dbfIn = new DbfInputStream(
				new BufferedInputStream(
						new FileInputStream(GisUtils.getDbfFileForShp(shpFile))));
	}

	public CoordinateSystem getCoordinateSystem()
	{
		return coordinateSystem;
	}
	
	public ShpHeader getShapefileHeader()
	{
		return shpIn.getHeader();
	}
	
	public DbfHeader getTableHeader()
	{
		return dbfIn.getHeader();
	}


	public synchronized boolean hasMoreRecords() throws IOException
	{
		if (bufRecord == null) {
			bufRecord = getNextRecord();
		}
		return (bufRecord != null);
	}
	
	public synchronized ShpRecord getNextRecord() throws IOException
	{
		ShpRecord record = null;
		if (bufRecord == null) {
//			long t1 = System.currentTimeMillis();
			record = shpIn.readNextRecord();
//			long t2 = System.currentTimeMillis();
			if (record != null) {
				record.setTableAttributes(dbfIn.readNextRecord());
				
			}
//			long t3 = System.currentTimeMillis();
//			System.out.println("Read time: "+ (t2-t1) + "/"+ (t3-t2));
		} else {
			record = bufRecord;
			bufRecord = null;
		}

		return record;
	}
	
	public void close()
	{
		GisUtils.safeClose(shpIn);
		GisUtils.safeClose(dbfIn);
	}

}
