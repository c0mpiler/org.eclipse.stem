package org.eclipse.stem.utility.generators;

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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//import com.bbn.openmap.dataAccess.shape.EsriGraphicList;
//import com.bbn.openmap.dataAccess.shape.EsriPolygon;
//import com.bbn.openmap.dataAccess.shape.EsriPolygonList;
//import com.bbn.openmap.dataAccess.shape.input.DbfInputStream;
//import com.bbn.openmap.dataAccess.shape.input.ShpInputStream;
//import com.bbn.openmap.dataAccess.shape.input.ShxInputStream;
//import com.bbn.openmap.omGraphics.OMPoly;

/**
 * STEM II Data Migration/Generation Utilities - This class reads ESRI shape
 * files and converts each of them into a plain text file as output.
 */
public class MapReader {

	PrintWriter pw;

	/**
	 * Constructor
	 * 
	 * @param outFile
	 *            the output file
	 */
	public MapReader(String outFile) {

		try {
			this.pw = new PrintWriter(new FileWriter(outFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	/**
	 * read in a given directory
	 * 
	 * @param dir
	 *            the directory we want to read
	 */
	public void readDirectory(String dir) {
		try {

			File f = new File(dir);
			File[] files = f.listFiles();

			int counter = 0;

			String shpFile = null;
			String dbfFile = null;
			String shxFile = null;

			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory())
					readDirectory(files[i].getAbsolutePath());
				String name = files[i].getName();
				name = name.toLowerCase();

				if (name.indexOf(".shp") != -1 && shpFile == null) { //$NON-NLS-1$
					shpFile = files[i].getAbsolutePath();
					counter++;
				} else if (name.indexOf(".dbf") != -1 && dbfFile == null) { //$NON-NLS-1$
					dbfFile = files[i].getAbsolutePath();
					counter++;
				} else if (name.indexOf(".shx") != -1 && shxFile == null) { //$NON-NLS-1$
					shxFile = files[i].getAbsolutePath();
					counter++;
				} else {
					// Ignore .txt and any other kind of files in this folder
					continue;
				}

				if (counter == 3) {
					readFile(shpFile, shxFile, dbfFile);
					counter = 0;
					shpFile = null;
					dbfFile = null;
					shxFile = null;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Read a ESRI shape file
	 * 
	 * @param shpFile
	 *            main shape file
	 * @param shxFile
	 *            index file
	 * @param dbfFile
	 *            dBase table
	 */
	public void readFile(String shpFile, String shxFile, String dbfFile) {

		UtilLogger.logInformation("shpFile is : " + shpFile); //$NON-NLS-1$
		UtilLogger.logInformation("shxFile is : " + shxFile); //$NON-NLS-1$
		UtilLogger.logInformation("dbfFile is : " + dbfFile); //$NON-NLS-1$

//		try {
//			ArrayList aRecord = null;
//			FileInputStream shpFis = new FileInputStream(shpFile);
//			FileInputStream shxFis = new FileInputStream(shxFile);
//			FileInputStream dbfFis = new FileInputStream(dbfFile);
//
//			DbfInputStream dbfIs = new DbfInputStream(dbfFis);
//			// String names[] = dbfIs.getColumnNames();
//			ArrayList records = dbfIs.getRecords();
//			dbfFis.close();
//
//			// Get the index.
//			ShxInputStream shxIs = new ShxInputStream(shxFis);
//			int[][] offSets = shxIs.getIndex();
//
//			// Get the shape data
//			ShpInputStream sis = new ShpInputStream(shpFis);
//			EsriGraphicList egl = sis.getGeometry(offSets);
//
//			// UtilLogger.logInformation("Size="+egl.size());
//
//			for (int i = 0; i < offSets[0].length; i++) {
//
//				/*
//				 * try{ com.bbn.openmap.dataAccess.shape.EsriPolyline polyLine =
//				 * null; polyLine =
//				 * (com.bbn.openmap.dataAccess.shape.EsriPolyline)egl.getOMGraphicAt(i);
//				 * aRecord = (ArrayList)records.get(i);
//				 * 
//				 * for (int j=0;j<aRecord.size();j++){ if (j>0) pw.print(",");
//				 * pw.print(aRecord.get(j)); }
//				 * 
//				 * float latlon[] = polyLine.getLatLonArray(); for (int j=0;j<latlon.length;j++){
//				 * pw.print(","+latlon[j]); } pw.println(); } catch(
//				 * java.lang.ClassCastException e ){ e.printStackTrace(); }
//				 */
//
//				try {
//					OMPoly espg = (EsriPolygon) egl.getOMGraphicAt(i);
//					aRecord = (ArrayList) records.get(i);
//
//					for (int j = 0; j < aRecord.size(); j++) {
//
//						if (this.pw == null) {
//							UtilLogger.logInformation("PrintWriter is null !"); //$NON-NLS-1$							
//							return;
//						}
//
//						if (j > 0)
//							this.pw.print(","); //$NON-NLS-1$
//						this.pw.print(aRecord.get(j));
//					}
//
//					float latlon[] = espg.getLatLonArray();
//					for (int j = 0; j < latlon.length; j++) {
//						this.pw.print("," + latlon[j]); //$NON-NLS-1$
//					}
//					this.pw.println();
//
//				} catch (ClassCastException e) {
//
//					EsriPolygonList epl = (EsriPolygonList) egl
//							.getOMGraphicAt(i);
//					for (int j = 0; j < epl.size(); j++) {
//
//						EsriPolygon espg = (EsriPolygon) epl.getOMGraphicAt(j);
//
//						aRecord = (ArrayList) records.get(i);
//						for (int q = 0; q < aRecord.size(); q++) {
//							if (q > 0)
//								this.pw.print(","); //$NON-NLS-1$
//							this.pw.print(aRecord.get(q));
//						}
//
//						float latlon[] = espg.getLatLonArray();
//						for (int q = 0; q < latlon.length; q++) {
//							this.pw.print("," + latlon[q]); //$NON-NLS-1$
//						}
//
//						this.pw.println();
//
//					} // for
//
//				} // catch
//
//			} // for
//
//			shxIs.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	} // readfile

	/**
	 * Close the writer
	 * 
	 */
	public void closeFile() {
		this.pw.close();
	}

	/**
	 * Execution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final int ESRI_FILE = 0;
		final int OUTPUT_FILE = 1;

		if (args.length < 2) {
			System.out
					.println("Wrong arguments. Provide ESRI file and output filename."); //$NON-NLS-1$
			return;
		}

		MapReader mr = new MapReader(args[OUTPUT_FILE]);
		mr.readDirectory(args[ESRI_FILE]);
		mr.closeFile();

	}

}
