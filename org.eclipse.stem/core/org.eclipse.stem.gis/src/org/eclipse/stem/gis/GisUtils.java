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

import java.io.File;
import java.io.InputStream;

import org.eclipse.stem.gis.shp.ShpConstants;

public class GisUtils 
{
	public static void safeClose(InputStream is)
	{
		try {
			is.close();
		} catch (Throwable t) {
			// nothin' doin'
		}
	}
	
	public static File getDbfFileForShp(File shpFile)
	{
		return GisUtils.getShpMetaFile(shpFile, ShpConstants.SHP_DATABASE_FILE_EXT);
	}
	
	public static File getProjectionFileForShp(File shpFile)
	{
		return GisUtils.getShpMetaFile(shpFile, ShpConstants.SHP_PROJECTION_FILE_EXT);
	}
	
	
	public static File getShpMetaFile(File shpFile, String ext)
	{
		String shpFileNameWithExt = shpFile.getName();
		String shpFileName = shpFileNameWithExt.substring(0, shpFileNameWithExt.lastIndexOf('.'));
	
		if (ext.charAt(0) != '.') {
			ext= "." + ext;
		}
		
		return new File(shpFile.getParentFile(), shpFileName + ext);
	}
	
}
