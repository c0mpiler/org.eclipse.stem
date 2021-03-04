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
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;


/**
 * Aggregate the totals for the specified compartment for the list of regions passed in, and write
 * the result to the passed in output file (.csv formatted file)
 */
public class AggregateLogFile {

	static String ITERATION_KEY = "iteration"; //$NON-NLS-1$
	static String TIME_KEY = "time"; //$NON-NLS-1$
	static String LS = System.getProperty("line.separator"); //$NON-NLS-1$
	
	
	// State, admin level, column header
	private static Map<String, Map<Short, List<String>>> headers;

	
	private static short NUM_LEAD_COLS = 2;
	
	/**
	 * 
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String [] args) {
		if(args.length < 4) {
			System.err.println("Usage: AggregateLogFile <input log path> <state> <output file> [list of regions separated by space]"); //$NON-NLS-1$
			System.exit(-1);
		}
		
		try {
			String inputDir = args[0];
			String state = args[1];
			String outFile = args[2];
			String [] regions = new String[args.length - 3];
			for(int i=0;i<args.length-3;++i) regions[i] = args[i+3];
	
			headers = readHeaders(inputDir);
			
			aggregateFiles(inputDir, state, outFile, regions);
				
			System.out.println("Total running sum of "+state+": "+running_sum);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param refDir
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("nls")
	public static  Map<String, Map<Short, List<String>>> readHeaders(String refDir) throws Exception {
		
		 HashMap<String, Map<Short, List<String>>>result = new  HashMap<String, Map<Short, List<String>>>();
		 
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
			
			String state = file.substring(0, ind);
			String slevel = file.substring(ind+1, ind+2);
		
			short adminLevel = Short.parseShort(slevel);
			// Read header line
			BufferedReader reader = null;
			
			try {
				reader = new BufferedReader(new FileReader(path));
				String buffer;
				buffer = reader.readLine(); 
								
				
				if(buffer != null) {
					String [] toks = buffer.split(",");
				//	StringTokenizer stok = new StringTokenizer(buffer,",");//$NON-NLS-1$
						
					Map<Short, List<String>> adminMap;
					
					if(!result.containsKey(state))  {
						adminMap = new HashMap<Short, List<String>>();
						result.put(state, adminMap);
					} else adminMap = result.get(state);
					
					List<String>header = null;
					if(!adminMap.containsKey(adminLevel)) {
						header = new ArrayList<String>();
						adminMap.put(adminLevel, header);
					}
						
					for(int i=0;i<toks.length;++i)  
						header.add(toks[i]);
				}	
			} finally {
				if(reader !=null) reader.close();
			}
			
			
				
		}
		return result;
	}
		

	/*
	private static Map<String, Map<Short, List<List<String>>>> readLogFiles(String logDir) throws Exception {
		
		HashMap<String, Map<Short, List<List<String>>>> result = new HashMap<String, Map<Short, List<List<String>>>>();
		
		File f = new File(logDir);
	        
		if(!f.exists() || !f.isDirectory() ) {
			System.err.println("Error "+logDir+" does not exist or is not a directory");
			System.exit(-1);
		}
			
		for(String file:f.list()) {
			String path = f.getAbsolutePath()+File.separator+file;
System.out.println("Reading "+path);
			if(f.isHidden() || file.startsWith(".")) continue; // hidden file
			if(!file.contains("_")) continue; // not a logged CSV file
				
			int ind = file.indexOf("_");
			String state = file.substring(0, ind);
			String slevel = file.substring(ind+1, ind+2);
			
			short adminLevel = Short.parseShort(slevel);
			
			// Read header line
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String buffer;
			buffer = reader.readLine(); // header
			String s;
			
	
			buffer = reader.readLine(); // First data
			while(buffer != null) {
				List<String> row = new ArrayList<String>();
				StringTokenizer stok = new StringTokenizer(buffer,",");//$NON-NLS-1$
				int colNr = 0;
				while(stok.hasMoreTokens()) {
					String tok = stok.nextToken();
					row.add(tok);
				}
				
				Map<Short, List<List<String>>> adminMap;
				if(!result.containsKey(state))  {
					adminMap = new HashMap<Short, List<List<String>>>();
					result.put(state, adminMap);
				} else adminMap = result.get(state);
				
				List<List<String>>data = null;
				if(!adminMap.containsKey(adminLevel)) {
					data = new ArrayList<List<String>>();
					adminMap.put(adminLevel, data);
				} else data = adminMap.get(adminLevel);

				data.add(row);
				buffer = reader.readLine(); 
			}
		
			
			
			reader.close();
		}
		return result;
	}
	*/
	
	private static double running_sum = 0.0;
	
	@SuppressWarnings("nls")
	public static void aggregateFiles(String inDir, String state, String outFile, String [] regions) throws Exception {
		File f = new File(inDir);

		File outF = new File(outFile);

		FileWriter fw = new FileWriter(outF);
		
		if(!f.exists() || !f.isDirectory() ) {
			System.err.println("Error "+inDir+" does not exist or is not a directory");
			System.exit(-1);
		}
			
		TreeMap<String, Double>totalsMap = new TreeMap<String, Double>();

		
		for(String file:f.list()) {
			String path = f.getAbsolutePath()+File.separator+file;
System.out.println("Reading "+path);
			if(f.isHidden() || file.startsWith(".")) continue; // hidden file
			if(!file.contains("_")) continue; // not a logged CSV file
				
			int ind = file.indexOf("_");
			String filestate = file.substring(0, ind);
			if(!filestate.equals(state))
				continue;
			
			String slevel = file.substring(ind+1, ind+2);
			
			short adminLevel = Short.parseShort(slevel);
			
			// Read header line
			BufferedReader reader = null;
			
			try {
				reader = new BufferedReader(new FileReader(path));
				String buffer;
				buffer = reader.readLine(); // header
				buffer = reader.readLine(); // data
				List<String>data = getTokenList(buffer);
				
				
				
				while(data != null) {
					for(String region:regions) {
						if((adminLevel == 2 || adminLevel == 1) && region.length() > 2) continue;
						if(adminLevel == 0 && region.length() < 3) continue;
						
						double totals = 0.0;
						boolean found = false;
						int col =0;
						for(String header : headers.get(state).get(adminLevel)) {
							
							if(col < NUM_LEAD_COLS) {++col;continue;}
							
							if(header.startsWith(region)) {
								found = true;
								totals += Double.parseDouble(data.get(col));
								
							} else if (found)  break; // optimization, headers are sorted alphabetically	
							++col;	
						}
						if(found) {
							if(totalsMap.containsKey(region))
								totalsMap.put(region, totalsMap.get(region)+totals);
							else totalsMap.put(region, totals);
						}
					}
					buffer = reader.readLine(); // data
					data = getTokenList(buffer);
				}
			} finally {
				if(reader !=null) reader.close();
			}
				
		} // for each file
		
		for(String region:totalsMap.keySet()) {
			fw.write(region+","+totalsMap.get(region)+LS);
		}
		fw.flush();

		fw.close();
	}
			
			
	private static List<String> getTokenList(String s) {
		if(s == null) return null;
		ArrayList<String>result = new ArrayList<String>();
		StringTokenizer stok = new StringTokenizer(s,",");//$NON-NLS-1$
		while(stok.hasMoreTokens()) {
			String tok = stok.nextToken();
			result.add(tok);
		}
		return result;
	}
}

