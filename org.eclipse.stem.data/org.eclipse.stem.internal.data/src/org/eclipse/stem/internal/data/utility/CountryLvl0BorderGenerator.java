package org.eclipse.stem.internal.data.utility;
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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;


/**
 * This class generates Admin Level 0 (country level) common borders.
 * it derives them from the existing higher resolution border property files.
 *
 */
public class CountryLvl0BorderGenerator {

	
		// get the path
		private static final String sep = File.separator;
		/**
		 * the output path
		 */
		public static String outputPath;
		/** 
		 * location of existing files
		 */
		private static String commonBorderPath ;
		
		private static Map<String,String> borderElementMap = new HashMap<String,String>();
		private static Map<String,Double> borderValueMap = new HashMap<String,Double>();
		
	/**
	 * finds and returns the path to the existing property files
	 * @return path to common border files
	 */
	public static String getCommonBorderPath() {
		 URL location = CountryLvl0BorderGenerator.class.getProtectionDomain().getCodeSource().getLocation();
	     String path0 = location.getFile().toString();
		 int tail = path0.indexOf("bin");
		 path0 = path0.substring(0, tail);
		 path0 = path0.replaceAll("org.eclipse.stem.data"+sep, "org.eclipse.stem.data"+sep+"geography"+sep);
		 path0 = path0.replaceAll("org.eclipse.stem.internal.data", "org.eclipse.stem.internal.data.geography");
		 path0 = path0+"resources"+sep+"data"+sep+"relationship"+sep+"commonborder"+sep;
		 outputPath = path0+"level0_files_test_output"+sep;
		 commonBorderPath = path0;
		 return path0;
	}
	
	
	/**
	 * Generates everything
	 */
	@SuppressWarnings("unused")
	public static void generateLvl0PropertyFiles() {
		String path0 = getCommonBorderPath();

		File dir = new File(path0);
		System.out.println("" + dir.toString());
		if (dir.isDirectory()) {
			File[] fileList = dir.listFiles();
			for (File f : fileList) {
				String shortName = f.getName();
				// the countries are already in alphabetic order
				String ctry1 = shortName.substring(0, 3);
				String ctry2 = shortName.substring(6, 9);
				
				double borderLength  = 0.0;
				try {

					// System.out.println("["+ctry1+"] , [" + ctry2+"]");
					if (!ctry1.equals(ctry2)) {
						
						// not the same country
						//System.out.println("" + shortName);
						// remember the headerLines in the original file
						List<String> headerLines = new ArrayList<String>();
						
						// 1. sum the border lengths
						if (shortName.indexOf(".properties") >= 1) {
							BufferedReader fileReader = new BufferedReader(new FileReader(f));

							// Add all the source URLs for this country.
							if (fileReader != null) {
								String buffer = null;
								while (EOF(buffer = fileReader.readLine()) != true) {
									StringTokenizer tokenizer = new StringTokenizer(buffer, ","); //$NON-NLS-1$
									if (tokenizer.countTokens() >= 3) {
										String part1 = tokenizer.nextToken().trim();
										String part2 = tokenizer.nextToken().trim();
										String part3 = tokenizer.nextToken().trim();
										borderLength += (Double.valueOf(part3)).doubleValue();
										//System.out.println("" + buffer);
									} else {
										headerLines.add(buffer);
									}
								}
							}// filereader ! null
							fileReader.close();
						}// properties file
						
						//System.out.println("" + shortName + "  length = "+borderLength);
						
						String fileNameKey = ctry1+"_0_"+ctry2+"_0.properties";
						// eg 0=USA,MEX,   then double
						String nameElement = "0="+ctry1+","+ctry2+",";
						if(borderValueMap.containsKey(fileNameKey)) {
							double oldVal = borderValueMap.get(fileNameKey).doubleValue();
							if(borderLength > oldVal) {
								borderValueMap.put(fileNameKey, Double.valueOf(borderLength)); // take the larger value if there are more than one
							}
						} else {
							borderElementMap.put(fileNameKey,nameElement);
							borderValueMap.put(fileNameKey, Double.valueOf(borderLength));
						}
					} // if not same country

				} catch (Exception e) {
					System.out.println("error reading file " + shortName + " "+ e.getMessage());
					e.printStackTrace();
				}
				 
			}// for Files
		}// if Dir
		
		writeLevel0Files();
		
	}
	
	/**
	 * 	writes the files
	 */
	public static void writeLevel0Files()	 {
		Set<String> filenameSet = borderElementMap.keySet();
		
		File outDir = new File(outputPath);
		  // if the directory does not exist, create it
		  if (!outDir.exists()) {
		    System.out.println("creating directory: " + outputPath);
		    try{
		        outDir.mkdir();
		        
		     } catch(SecurityException se){
		        System.out.println("failed to create directory "+se.getMessage());
		        System.exit(0);
		     }        
		  }
		
		int idx = outputPath.indexOf("org.eclipse.stem.data");
		String commentPath = ".."+sep+commonBorderPath.substring(idx, commonBorderPath.length());
		 
		for(String fileName:filenameSet) {
		
			String ctry1 = fileName.substring(0, 3);
			String ctry2 = fileName.substring(6, 9);
			
			try {
				OutputStream os = null;
				try {
					final File fn = new File(outputPath+fileName);
					os = new FileOutputStream(fn, false);
					String title = "Common Border relationship [LVL=0] between country "	+ ctry1 + " and " + ctry2 ;
					
					String comments = "# " + "\n" + "#  File generated from:"
							+ "\n" + "#   " + commentPath + ctry1 + "/" + ctry1 
							+ "\n" + "#   " + commentPath + ctry2 + "/" + ctry2 
							+ "\n" + "#\n" + "#  Generated by: "
							+ CountryLvl0BorderGenerator.class + "\n" + "# " + "\n";
					
					os.write(comments.getBytes());
					String property = "RECORD_CLASSNAME = org.eclipse.stem.internal.data.geography.specifications.CommonBorderGeographicRelationshipPropertyFileSpecification"
							+ "\n";
					os.write(property.getBytes());
					property = "TITLE = " + title + "\n";
					os.write(property.getBytes());
					property = "VALID = start=2006-01-01;" + "\n";
					os.write(property.getBytes());
					
					String keyInfo = "ISOKEY_0 = " + ctry1 + "\n";
					keyInfo += "ISOKEY_0_LEVEL = 0" + "\n";
					keyInfo += "ISOKEY_1 = " + ctry2 + "\n";
					keyInfo += "ISOKEY_1_LEVEL = 0" + "\n";
					os.write(keyInfo.getBytes());
					
					String name = borderElementMap.get(fileName);
					String value = ""+borderValueMap.get(fileName).doubleValue();
					String s = name+value;
					os.write(s.getBytes());
					os.flush();
					os.close();
				} catch (final FileNotFoundException e) {
					e.printStackTrace();
				}
			} catch (final IOException e) {
				e.printStackTrace();
			}	
		}// for all files
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
	if (buffer == null || buffer.length() == 0)
		return true;
	return false;
}
	
	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String[] args) {
		generateLvl0PropertyFiles();
	}
}
