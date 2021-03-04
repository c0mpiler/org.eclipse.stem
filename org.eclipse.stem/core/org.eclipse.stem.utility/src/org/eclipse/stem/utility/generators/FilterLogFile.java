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
 * Read STEM log files and only keep locations from the log file matching a filter criteria, e.g. Incidence > 1 (for any timestamp)
 */
public class FilterLogFile {

	static String LS = System.getProperty("line.separator"); //$NON-NLS-1$
	
	
	
	private static Map<Integer, HashSet<Integer>> keepColumns = new HashMap<Integer, HashSet<Integer>>();
	
	private static short NUM_LEAD_COLS = 2;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		if(args.length < 5) {
			System.err.println("Usage: FilterLogFile <log files dir> <output dir> <Variable> <Predicate> <Value> \nFor example:\nFilterLogFile ~/STEMLogs/MySim/malaria/human Incidence > 1"); //$NON-NLS-1$
			System.exit(-1);
		}
		
		try {
			String logDir = args[0];
			String outDir = args[1];	
			String var = args[2];
			String predicate = args[3];
			String value = args[4];
				
			retrieveColumns(logDir, var, predicate, value);
			
			truncateAndCopyFiles(logDir, outDir);
				
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @param logDir
	 * @param var
	 * @param predicate
	 * @param value
	 * @throws Exception
	 */
	@SuppressWarnings("nls")
	public static void retrieveColumns(String logDir, String var, String predicate, String value) throws Exception {
		File f = new File(logDir);
        
		if(!f.exists() || !f.isDirectory() ) {
			System.err.println("Error "+logDir+" does not exist or is not a directory");
			System.exit(-1);
		}
		
		for(String file:f.list()) {
			String path = f.getAbsolutePath()+File.separator+file;
			if(f.isHidden() || file.startsWith(".")) continue; // hidden file
			if(!file.startsWith(var)) continue;
			if(!file.contains("_")) continue; // not a logged CSV file
			
			int ind = file.indexOf("_");
			
			String slevel = file.substring(ind+1, ind+2);
			
			int adminLevel = Integer.parseInt(slevel);
			
			readAndFilterData(path, predicate, value, adminLevel);
		}
			
	}
	
	
	/**
	 * 
	 * @param filePath
	 * @param predicate
	 * @param value
	 * @param adminLevel
	 * @throws Exception
	 */
	@SuppressWarnings("nls")
	private static void readAndFilterData(String filePath, String predicate, String value, int adminLevel) throws Exception {
		// Read header line
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String buffer;
			buffer = reader.readLine(); // Skip header
							
			int row = 0;
			buffer = reader.readLine();
			
			while(buffer != null) {
				String [] toks = buffer.split(",");
			//	StringTokenizer stok = new StringTokenizer(buffer,",");//$NON-NLS-1$
				List<Integer>keepCols = doFilter(toks, predicate, value);
					
				if(!keepColumns.containsKey(adminLevel))  {
					HashSet<Integer>newHS = new HashSet<Integer>();
					keepColumns.put(adminLevel, newHS);
				}
				HashSet<Integer> hs = keepColumns.get(adminLevel);
				
				for(int keep:keepCols) hs.add(keep);
				
				UtilLogger.logInformation("Processed row "+row++);
				buffer = reader.readLine();
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
			
			// Read header line
			BufferedReader reader = new BufferedReader(new FileReader(path));
			File outf = new File(outDir);
			if(!outf.exists())
				outf.mkdirs();
			
			String outFile = outDir+File.separator+file;
			FileWriter fw = new FileWriter(outFile);
	
				
			String buffer;
			buffer = reader.readLine(); // Skip header						
		
			int row = 0;
			while(buffer != null) {
				StringTokenizer stok = new StringTokenizer(buffer,",");//$NON-NLS-1$
				int colNr = 0;
				while(stok.hasMoreTokens()) {
					String tok = stok.nextToken();
					if(colNr < NUM_LEAD_COLS || keepColumns.get(adminLevel).contains(colNr)) {
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
	
	
	/**
	 * 
	 * @param row
	 * @param predicate
	 * @param value
	 * @return
	 */
	@SuppressWarnings("nls")
	private static List<Integer> doFilter(String [] row, String predicate, String value) {
		
		double val = Double.valueOf(value);
	
		ArrayList<Integer>result = new ArrayList<Integer>();
		
		for(int i = NUM_LEAD_COLS;i<row.length;++i) {
			double cval = Double.parseDouble(row[i]);
					
			boolean predMatch = false;
			if(predicate.equals(">")) {
				if(cval > val) predMatch = true;
			}
			else if(predicate.equals("<")) {
				if(cval < val) predMatch = true;
			}
			else if(predicate.equals(">=")) {
				if(cval >= val) predMatch = true;
			} 
			else if(predicate.equals("<=")) {
				if(cval <= val) predMatch = true;
			}
				
			if(predMatch) result.add(i);
		
		}
		return result;
	}
}

