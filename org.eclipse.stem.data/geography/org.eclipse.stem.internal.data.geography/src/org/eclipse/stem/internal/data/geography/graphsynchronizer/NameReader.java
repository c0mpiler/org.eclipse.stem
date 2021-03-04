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
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/** 
 * process the raw region names files to obtain a map
 * of names keyed by stemIDs
 * 
 */
public class NameReader {
	


	
	public Map<String, String> regionNamesMap= new HashMap<String, String>();
	
	/** 
	 * process the raw region names files to obtain a map
	 * of names keyed by stemIDs
	 * 
	 */
	public NameReader() {
		
	}

	/**
	 * main method for testing
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String[] args) {
		System.out.println("enter Main ");
	
		NameReader nr = new NameReader();
		String fileName = "../org.eclipse.stem.external.data/resources/data/country/MEX/MEX_names.propoerties";
		nr.readNames(fileName);
	}// main()
	

	/**
	 * read in the level one Names and keys
	 * 
	 */
	@SuppressWarnings("nls")
	public Map<String, String> readNames(String fileName) {
		
			//Activator.logInformation("reading Names for "+fileName);
			BufferedReader fileReader = openReader(fileName);
			try {
				// Add all the source URLs for this country.
				
				if (fileReader != null) {
					String buffer = null;
					while (EOF(buffer = fileReader.readLine()) != true) {

						//Activator.logInformation(" "+buffer);
						// Tokenize
						//
						if((buffer.indexOf("SOURCE")==-1)&&(buffer.indexOf("VALID")==-1)&&(buffer.indexOf("#")==-1)&&(buffer.indexOf("-")>=0)) {
							StringTokenizer tokenizer = new StringTokenizer(buffer, "="); //$NON-NLS-1$

							// Level 2
							
							String stemID2 = tokenizer.nextToken().trim();
							String name = tokenizer.nextToken();
							
							
							regionNamesMap.put(stemID2, name);
							//Activator.logInformation(" mapped "+stemID2+" to "+Name.doubleValue() );
						}
						
						
					}
				} 
				}catch (Exception e) {
					System.out.println("Error reading file"+fileName);
					e.printStackTrace();
					System.exit(1);
				}
				return regionNamesMap;
	
	}// readName(String fileName)
	
	
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


	
	
	
	
	
	
}// class