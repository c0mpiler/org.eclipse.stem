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
package org.eclipse.stem.gis.dbf;

import java.util.ArrayList;
import java.util.List;

public class DbfHeader
{
	short version;
	int dateYear;
	int dateMonth;
	int dateDay;
	int records;
	int headerSize;
	int recordSize;
	byte incompleteTransactionFlag;
	byte encryptionFlag;
	byte prodMdxFlag;
	byte driverId;
	String driveName;
	List<DbfFieldDef> fieldDefinitions = new ArrayList<DbfFieldDef>();
	

	public short getVersion() {
		return version;
	}

	public int getDateYear() {
		return dateYear;
	}

	public int getDateMonth() {
		return dateMonth;
	}

	public int getDateDay() {
		return dateDay;
	}

	public int getRecords() {
		return records;
	}

	public int getHeaderSize() {
		return headerSize;
	}

	public int getRecordSize() {
		return recordSize;
	}

	public byte getIncompleteTransactionFlag() {
		return incompleteTransactionFlag;
	}

	public byte getEncryptionFlag() {
		return encryptionFlag;
	}

	public byte getProdMdxFlag() {
		return prodMdxFlag;
	}

	public byte getDriverId() {
		return driverId;
	}

	public String getDriveName() {
		return driveName;
	}

	public List<DbfFieldDef> getFieldDefinitions() {
		return fieldDefinitions;
	}



	@Override
	public String toString() {
		final int maxLen = 20;
		return "DbfHeader [version="
				+ version
				+ ", dateYear="
				+ dateYear
				+ ", dateMonth="
				+ dateMonth
				+ ", dateDay="
				+ dateDay
				+ ", records="
				+ records
				+ ", headerSize="
				+ headerSize
				+ ", recordSize="
				+ recordSize
				+ ", incompleteTransactionFlag="
				+ incompleteTransactionFlag
				+ ", encryptionFlag="
				+ encryptionFlag
				+ ", prodMdxFlag="
				+ prodMdxFlag
				+ ", driverId="
				+ driverId
				+ ", driveName="
				+ driveName
				+ ", fieldDefinitions="
				+ (fieldDefinitions != null ? fieldDefinitions.subList(0,
						Math.min(fieldDefinitions.size(), maxLen)) : null)
				+ "]";
	}
	
	
	
}