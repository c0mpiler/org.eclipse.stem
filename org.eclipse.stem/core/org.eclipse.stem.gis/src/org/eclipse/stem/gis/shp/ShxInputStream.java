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

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.EndianUtils;

public class ShxInputStream extends ShpInputStream
{
	private static final List<Integer> offsets = new ArrayList<Integer>();
	public ShxInputStream(InputStream is) throws IOException
	{
		super(is);
		readIndexFile();
	}
	
	
	private void readIndexFile() throws IOException
	{
		try {
			while (true) {
				int offset = EndianUtils.swapInteger(readInt()); // record offset in words
				EndianUtils.swapInteger(readInt()); // content length
				
				offsets.add(Integer.valueOf(offset));
			}
		} catch (EOFException ee) {
			// no more records
		}
	}
	
	public int getOffsetForRecord(int recordNumber)
	{
		return offsets.get(recordNumber+1);
	}
	
	

	@Override
	public ShpRecord readNextRecord() throws IOException 
	{
		return null;
	}

	@Override
	public ShpHeader getHeader() 
	{
		return super.getHeader();
	}
	
	
	public static void main(String[] args) throws IOException
	{
		
		ShxInputStream is = null;
		
		try {
			is = new ShxInputStream(new BufferedInputStream(
					new FileInputStream(new File("data/global.shx"))));
			
			System.out.println(is.getHeader());
		} finally {
			if(is!=null) is.close();
		}
		
		
	}
	
	
}
