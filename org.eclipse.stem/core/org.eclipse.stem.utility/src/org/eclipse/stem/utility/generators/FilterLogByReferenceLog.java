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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


/**
 * Takes the locations from the second log file path passed in and filters out locations not included from the first log file path. The result is stored in any desired output folder
 */

public class FilterLogByReferenceLog {

	static String LS = System.getProperty("line.separator"); //$NON-NLS-1$
	
	
	
	private static Map<Integer, List<String>> keepColumns = new HashMap<Integer, List<String>>();
	
	
	
	private static short NUM_LEAD_COLS = 2;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		if(args.length < 3) {
			System.err.println("Usage: FilterLogByReferenceLog <source log path> <reference log path> <output path>"); //$NON-NLS-1$
			System.exit(-1);
		}
		
		try {
			String inputDir = args[0];
			String refDir = args[1];	
			String outDir = args[2];
				
			retrieveColumns(refDir);
			
			truncateAndCopyFiles(inputDir, outDir);
				
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param refDir
	 * @throws Exception
	 */
	@SuppressWarnings("nls")
	public static void retrieveColumns(String refDir) throws Exception {
		File f = new File(refDir);
        
		if(!f.exists() || !f.isDirectory() ) {
			System.err.println("Error "+refDir+" does not exist or is not a directory");
			System.exit(-1);
		}
		
		for(String file:f.list()) {
			String path = f.getAbsolutePath()+File.separator+file;
			if(f.isHidden() || file.startsWith(".")) continue; // hidden file
			if(!file.contains("_")) continue; // not a logged CSV file
			
			int ind = file.indexOf("_");
			
			String slevel = file.substring(ind+1, ind+2);
		
			int adminLevel = Integer.parseInt(slevel);
			if(keepColumns.containsKey(adminLevel)) continue;
			readHeaders(path, adminLevel);
		}
			
	}
	
	/**
	 * 
	 * @param filePath
	 * @param adminLevel
	 * @throws Exception
	 */
	@SuppressWarnings("nls")
	private static void readHeaders(String filePath, int adminLevel) throws Exception {
		BufferedReader reader = null;
		try {
			// Read header line
			reader = new BufferedReader(new FileReader(filePath));
			String buffer;
			buffer = reader.readLine(); 
							
			if(buffer != null) {
				String [] toks = buffer.split(",");
			//	StringTokenizer stok = new StringTokenizer(buffer,",");//$NON-NLS-1$
					
				if(!keepColumns.containsKey(adminLevel))  {
					ArrayList<String>newL = new ArrayList<String>();
					keepColumns.put(adminLevel, newL);
				}
				List<String> l = keepColumns.get(adminLevel);
				for(int i=NUM_LEAD_COLS;i<toks.length;++i)  
					l.add(toks[i]);
			}		
		} finally {
			if(reader !=null) reader.close();
		}
	}
		

	/**
	 * 
	 * @param logDir
	 * @param outDir
	 * @throws Exception
	 */
	@SuppressWarnings("nls")
	private static void truncateAndCopyFiles(String logDir, String outDir) throws Exception {
		File f = new File(logDir);
	        
		if(!f.exists() || !f.isDirectory() ) {
			System.err.println("Error "+logDir+" does not exist or is not a directory");
			System.exit(-1);
		}
			
		for(String file:f.list()) {
			String path = f.getAbsolutePath()+File.separator+file;
			if(f.isHidden() || file.startsWith(".")) continue; // hidden file
			if(!file.contains("_")) continue; // not a logged CSV file
				
			int ind = file.indexOf("_");
			String slevel = file.substring(ind+1, ind+2);
			
			int adminLevel = Integer.parseInt(slevel);
			
			if(!keepColumns.containsKey(adminLevel)) 
				continue; // admin level not in reference
			
			// Read header line
			BufferedReader reader = new BufferedReader(new FileReader(path));
			File outf = new File(outDir);
			if(!outf.exists())
				outf.mkdirs();
			
			String outFile = outDir+File.separator+file;
			FileWriter fw = new FileWriter(outFile);
	
				
			String buffer;
			buffer = reader.readLine(); // header
			// String s;
			int row = 0;
			HashSet<Integer>keepColNumbers = new HashSet<Integer>();
			if(buffer != null) {
				StringTokenizer stok = new StringTokenizer(buffer,",");//$NON-NLS-1$
				int colNr = 0;
				while(stok.hasMoreTokens()) {
					String tok = stok.nextToken();
					if(colNr >= NUM_LEAD_COLS && keepColumns.get(adminLevel).contains(tok)) {
						// Copy column value
						keepColNumbers.add(colNr);
					}
					++colNr;
				}
			}
		
			
			while(buffer != null) {
				StringTokenizer stok = new StringTokenizer(buffer,",");//$NON-NLS-1$
				int colNr = 0;
				while(stok.hasMoreTokens()) {
					String tok = stok.nextToken();
					if(colNr < NUM_LEAD_COLS || keepColNumbers.contains(colNr)) {
						// Copy column value
						if(colNr > 0) fw.write(",");
						fw.write(tok);
					}
					++colNr;
				}
				fw.write("\n");
				
	UtilLogger.logInformation("Copied row "+row++);
				buffer = reader.readLine();
			}
			fw.flush();
			fw.close();
			reader.close();
		}
	}
}

