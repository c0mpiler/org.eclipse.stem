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

public class DbfFieldDef
{
	String fieldName;
	char fieldType;
	short fieldSize;
	short fieldDecimalCount;
	byte workAreaId;
	byte mdxFieldFlag;
	

	public String getFieldName() {
		return fieldName;
	}

	public char getFieldType() {
		return fieldType;
	}

	public short getFieldSize() {
		return fieldSize;
	}

	public short getFieldDecimalCount() {
		return fieldDecimalCount;
	}

	public byte getWorkAreaId() {
		return workAreaId;
	}

	public byte getMdxFieldFlag() {
		return mdxFieldFlag;
	}

	@Override
	public String toString() {
		return "DbfFieldDef [fieldName=" + fieldName + ", fieldType="
				+ fieldType + ", fieldSize=" + fieldSize
				+ ", fieldDecimalCount=" + fieldDecimalCount
				+ ", workAreaId=" + workAreaId + ", mdxFieldFlag="
				+ mdxFieldFlag + "]";
	}
	
	
}