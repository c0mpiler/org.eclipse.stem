package org.eclipse.stem.geography.centers;

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


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.stem.data.geography.Activator;
import org.eclipse.stem.geography.names.GeographicMapper;

/** 
 * 
 * THIS CLASS is working but still under construction
 * 
 */
public class CenterReader extends GeographicMapper{
	
	public static Map<String, String> regionCentersMap= new HashMap<String, String>();
	
	// TODO: Fix this, this is not the right way
	public static final String DATA_PATH =  "/Users/jhkauf/Documents/workspace/org.eclipse.stem.data.geography/src/org/eclipse/stem/data/geography/centers/"; //$NON-NLS-1$ 
	
	//public static final String dataPath = "./src/org/eclipse/stem/data/geography/centers/"; //$NON-NLS-1$
	public static String root;
	static List<String> allCentersFiles = new ArrayList<String>();
	List<String> allCountryIDs = new ArrayList<String>();
	/** 
	 * This class reads all the centers in STEM
	 */
	public CenterReader() {
		try {
			//String top = parentDir.getCanonicalPath();
			root = DATA_PATH;
		}catch(Exception e) {
		       e.printStackTrace();
	    }
		getAllCenterFileNames();
		for(int i = 0; i < allCentersFiles.size(); i ++) {
			String fileName = allCentersFiles.get(i);
			readCenters(fileName);
			
			int idx = fileName.indexOf("_centers.properties");
			if(idx >3) {
				String id3 = fileName.substring(idx-3,idx);
				if(id3.indexOf("ZZZ")==-1) 	allCountryIDs.add(id3);
			}
			
		}
		
	}
	
	/** 
	 * This class reads all the centers in STEM
	 */
	public CenterReader(List<String> centersFiles) {
		allCentersFiles = centersFiles;
		getAllCenterFileNames();
		for(int i = 0; i < allCentersFiles.size(); i ++) {
			String fileName = allCentersFiles.get(i);
			readCenters(fileName);
			
			int idx = fileName.indexOf("_centers.properties");
			if(idx >3) {
				String id3 = fileName.substring(idx-3,idx);
				if(id3.indexOf("ZZZ")==-1) 	allCountryIDs.add(id3);
			}
		}
	}

	/**
	 * for testing
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		CenterReader cr = new CenterReader();
	}
	
	/**
	 * Get an array of country codes
	 * @return
	 */
	public String[] getCountryIDs() {
		String[] id3s = allCountryIDs.toArray(new String[allCountryIDs.size()]);
		Arrays.sort(id3s);
		return id3s;
	}

	/**
	 * read in the Centers and keys
	 * 
	 */
	public Map<String, String> readCenters(String fileName) {
		
			BufferedReader fileReader = openReader(fileName);
			
			try {
				// Add all the source URLs for this country.
				
				if (fileReader != null) {
					String buffer = null;
					while (EOF(buffer = fileReader.readLine()) != true) {
					
						//Activator.logInformation(" "+buffer);
						// Tokenize
						//
						if((buffer.indexOf("SOURCE")==-1)&&(buffer.indexOf("VALID")==-1)&&(buffer.indexOf("#")==-1)&&(buffer.indexOf("=")>=0)) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
							StringTokenizer tokenizer = new StringTokenizer(buffer, "="); //$NON-NLS-1$
							String stemID2 = tokenizer.nextToken().trim();
							String center = tokenizer.nextToken();
							regionCentersMap.put(stemID2, center);
							//Activator.logInformation(" mapped "+stemID2+" to "+Name.doubleValue() );
						}	
					}
				} 
				}catch (Exception e) {
					Activator.logInformation("Error reading file"+fileName); //$NON-NLS-1$
					e.printStackTrace();
					System.exit(1);
				}
				return regionCentersMap;
	
	}// readName(String fileName)
	
	
	/**
	 * Create a newBufferedReader
	 * 
	 * @param fileName
	 *            the center of the file we want to open for reading
	 * 
	 * @return a reader to a given file
	 */
	static protected BufferedReader openReader(String file) {

		try {

			File f = new File(file);

			if (f.exists() == false) {
				return null;
			}

			return new BufferedReader(new FileReader(file));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	
	
	
	/**
	 * Indicate End-Of-File
	 * 
	 * @param buffer
	 *            A buffer of diva data
	 * 
	 * @return True if we have reached End-Of-File
	 */
	static protected boolean EOF(String buffer) {
		if (buffer == null )
			return true;
		return false;
	}
	
	/**
	 * 
	 */
	static protected void getAllCenterFileNames() {
		try {
			File f = new File(root);
			
			if(f.isDirectory()) {		
				File[] dataFiles = filterAndSortFiles(f.listFiles());
				// remember the area files
				for(int j = 0; j < dataFiles.length; j ++) {	
					
					allCentersFiles.add(dataFiles[j].getAbsolutePath());
				}
			}
			}catch (Exception e) {
				Activator.logInformation("Error reading file"+e.getMessage()); //$NON-NLS-1$
				e.printStackTrace();
				System.exit(1);
			}
	}

	/**
	 * filter the list of files and return a sorted array
	 * @param files
	 * @return
	 */
	static File[] filterAndSortFiles(File[] files) {
		List<File> filtered = new ArrayList<File>();
		for (int i = 0; i < files.length; i ++) {
			String name = files[i].getName();
		
			if(name.indexOf("_centers.properties")>=1) { //$NON-NLS-1$
				filtered.add(files[i]);	
			}
		}
		File[] retVal = new File[filtered.size()];
		for (int i = 0; i < filtered.size(); i ++) {
			retVal[i] = filtered.get(i);
		}
		Arrays.sort(retVal);
		return retVal;
	}
	
	/**
	 * filter the list of files and return a sorted array
	 * @param files
	 * @return
	 */
	static File[] filterAndSortCountryDirs(File[] files) {
		List<File> filtered = new ArrayList<File>();
		for (int i = 0; i < files.length; i ++) {
			String name = files[i].getName();
			
			if((name.indexOf("svn")<=-1)&&(name.indexOf("ZZZ")<=-1)&&(name.indexOf("DS_Store")<=-1)) { 
				filtered.add(files[i]);
			}
		}
		File[] retVal = new File[filtered.size()];
		for (int i = 0; i < filtered.size(); i ++) {
			retVal[i] = filtered.get(i);
		}
		Arrays.sort(retVal);
		return retVal;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public double getLatitude(String id) {
		if(regionCentersMap.containsKey(id)) {
			String center = regionCentersMap.get(id); 
			StringTokenizer tokenizer = new StringTokenizer(center, ","); //$NON-NLS-1$ 
			String lat = tokenizer.nextToken().trim();
			double latVal = (Double.valueOf(lat)).doubleValue();
			return latVal;
		} else {
			Activator.logInformation("1. CenterReader(): Error, region "+id+" not found"); //$NON-NLS-1$ //$NON-NLS-2$
			return -999;
		}
		
	}
	
	/**
	 * returns double[2] (lat,lng)
	 * @param id
	 * @return
	 */
	public double[] getLatLong(String id) {
		double[] retVal = new double[2];
		if(regionCentersMap.containsKey(id)) {
			String center = regionCentersMap.get(id); 
			StringTokenizer tokenizer = new StringTokenizer(center, ","); //$NON-NLS-1$ 
			String lat = tokenizer.nextToken().trim();
			String lng = tokenizer.nextToken().trim();
			retVal[0] = (Double.valueOf(lat)).doubleValue();
			retVal[1] = (Double.valueOf(lng)).doubleValue();
			return retVal;
		} else {
			Activator.logInformation("2. CenterReader(): Warning, region "+id+" not found"); //$NON-NLS-1$ //$NON-NLS-2$
			return null;
		}
		
	}
	
	
	
	
}// class