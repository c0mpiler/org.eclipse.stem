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

import org.eclipse.stem.gis.dbf.DbfRecord;

public abstract class ShpRecord 
{
	protected int recordNumber;
	protected int contentLength;

	protected DbfRecord dbfRecord;
	
	protected ShpRecord()
	{
	}
	
	public DbfRecord getTableAttributes()
	{
		return dbfRecord;
	}

	public void setTableAttributes(DbfRecord dbfRecord)
	{
		this.dbfRecord = dbfRecord;
	}
	
	public int getRecordNumber() 
	{
		return recordNumber;
	}

	public void setRecordNumber(int recordNumber) {
		this.recordNumber = recordNumber;
	}

	public int getContentLength() {
		return contentLength;
	}

	public void setContentLength(int contentLength) {
		this.contentLength = contentLength;
	}

	@Override
	public String toString() {
		return "ShpRecord [recordNumber=" + recordNumber + ", contentLength="
				+ contentLength + ", shpType=" + getType() + ", dbfRecord="
				+ dbfRecord + "]";
	}
	
	
	abstract int getType();

}
