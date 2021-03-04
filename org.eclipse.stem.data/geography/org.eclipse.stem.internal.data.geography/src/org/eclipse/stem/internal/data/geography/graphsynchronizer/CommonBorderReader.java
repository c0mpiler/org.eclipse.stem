package org.eclipse.stem.internal.data.geography.graphsynchronizer;

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

/** 
 * processes the raw common border data
 * to populate a map of common border relations by country
 * 
 */
public class CommonBorderReader {
	
	static List<String> allCommonBorderFiles = new ArrayList<String>();
	static final String countryFilesPrefix = "resources/data/relationship/commonborder/"; //$NON-NLS-1$ 
	public static Map<String,List<CommonBorderRelation>> commonBorderMap = new HashMap<String,List<CommonBorderRelation>>();
	static Map<String,List<String>> commonBorderHeaderMap = new HashMap<String,List<String>>();
	int icount = 0;
	/** 
	 * This class reads All the common border relation data in STEM
	 */
	public CommonBorderReader() {
		getAllCommonBorderFileNames();
		readCommonBorders();
	}

	/**
	 * main method for testing only
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("enter Main "); //$NON-NLS-1$ 
		CommonBorderReader cbr = new CommonBorderReader();
	}// main
	
	/**
	 * get the relations
	 * @param id
	 * @return
	 */
	public List<CommonBorderRelation> getRelations(String id) {
		return commonBorderMap.get(id);
	}
	
	
	/**
	 * read in the level one areas and keys
	 * 
	 */
	public void readCommonBorders() {
		for (int i = 0; i < allCommonBorderFiles.size(); i++) {
			String fileName = allCommonBorderFiles.get(i);
			//Activator.logInformation("reading areas for "+fileName);
			BufferedReader fileReader = openReader(fileName);
			try {
				// Add all the source URLs for this country.
				
				if (fileReader != null) {
					String buffer = null;
					
					List<CommonBorderRelation> relationList = new ArrayList<CommonBorderRelation>();
					List<String> headerList = new ArrayList<String>();
					
					while (EOF(buffer = fileReader.readLine()) != true) {

						//Activator.logInformation(" "+buffer);
						// Tokenize
						//
						if((buffer.indexOf("RECORD")==-1)&&(buffer.indexOf("VALID")==-1)&&(buffer.indexOf("#")==-1)&&(buffer.indexOf("TITLE")==-1)&&(buffer.indexOf("ISO")==-1&&(buffer.indexOf("=")>=0))) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$//$NON-NLS-4$//$NON-NLS-5$//$NON-NLS-6$     
								int start = buffer.indexOf("=");//$NON-NLS-1$ 
								String data = buffer.substring(start+1,buffer.length()).trim();
							
								
								StringTokenizer tokenizer = new StringTokenizer(data, ","); //$NON-NLS-1$
								String stemID1 = tokenizer.nextToken().trim();
								String stemID2 = tokenizer.nextToken().trim();
								String val = tokenizer.nextToken();
								
								double lVal = (Double.valueOf(val.trim())).doubleValue(); // zero at first
								//Activator.logInformation("from "+buffer+" /**/ got:"+stemID1+","+stemID2+","+lVal);
								//icount ++;
								CommonBorderRelation relation = new CommonBorderRelation(stemID1, stemID2, lVal);
								relationList.add(relation);
						} else {
							// header line
							headerList.add(buffer);
						}
						
					}// not eof
					File file = new File(fileName);
					
					String key = file.getName().trim();
					commonBorderMap.put(key,relationList);
					icount += relationList.size();
					commonBorderHeaderMap.put(key,headerList);
					
				} 
				}catch (Exception e) {
					System.out.println("Error reading file"+fileName);//$NON-NLS-1$ 
					e.printStackTrace();
					System.exit(1);
				}
		}
	
	}// readLevelOneAreas(String fileName)
	
	
	
	
	/**
	 * 
	 */
	static protected void getAllCommonBorderFileNames() {
		try {
			File f = new File(countryFilesPrefix);
			if(f.isDirectory()) {
				File[] countryDirs = filterAndSortCountryDirs(f.listFiles());
				for (int i = 0; i < countryDirs.length; i ++) {
				
					File dataFile = countryDirs[i];
					
					String name = dataFile.getAbsolutePath();
					if(name.indexOf(".properties")>=1) { //$NON-NLS-1$ 
						// remember the  files
						allCommonBorderFiles.add(name);
					}
						
				}
			}
			}catch (Exception e) {
				System.out.println("Error reading file"+e.getMessage()); //$NON-NLS-1$ 
				e.printStackTrace();
				System.exit(1);
			}
	}
	
	
	
	/**
	 * Create a newBufferedReader
	 * 
	 * @param fileName
	 *            the name of the file we want to open for reading
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
	}//openReader

	
	
	
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
	 * filter the list of files and return a sorted array
	 * @param files
	 * @return
	 */
	private static File[] filterAndSortCountryDirs(File[] files) {
		List<File> filtered = new ArrayList<File>();
		for (int i = 0; i < files.length; i ++) {
			String name = files[i].getName();
			
			if((name.indexOf("svn")<=-1)&&(name.indexOf("ZZZ")<=-1)) { //$NON-NLS-1$  //$NON-NLS-2$ 
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
	 * Inner class
	 * 
	 */
	public class CommonBorderRelation  {

		public String id1;
		public String id2;
		public double borderLength;
		
		/**
		 * 
		 * @param id1
		 * @param id2
		 * @param borderLength
		 */
		public CommonBorderRelation(String id1, String id2, double borderLength) {
			this.id1 = id1;
			this.id2 = id2;
			this.borderLength = borderLength;
		}
		
		/**
		 * 
		 */
		@SuppressWarnings("nls")
		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(id1);
			stringBuilder.append(",");
			stringBuilder.append(id2);
			stringBuilder.append(",");
			stringBuilder.append(borderLength);
			String retVal = stringBuilder.toString();
			return retVal;
		}
		
		/**
		 * test is a relations contains a particular node (by id)
		 * @param id
		 * @return
		 */
		public boolean relationContains(String id) {
			if(id.equalsIgnoreCase(id1)) return true;
			if(id.equalsIgnoreCase(id2)) return true;
			return false;
		}
		
		/**
		 * test is a relations contains a particular node (by id)
		 * and return the other node. Otherwise return null;
		 * @param id
		 * @return
		 */
		public String getNeighborTo(String id) {
			if(id.equalsIgnoreCase(id1)) return id2;
			if(id.equalsIgnoreCase(id2)) return id1;
			return null;
		}
		
		
	}// CommonBorderRelation
		
	

	/**
	 * 
	 * @return
	 */
	public Map<String, List<CommonBorderRelation>> getCommonBorderMap() {
		return commonBorderMap;
	}

	
	
}// class