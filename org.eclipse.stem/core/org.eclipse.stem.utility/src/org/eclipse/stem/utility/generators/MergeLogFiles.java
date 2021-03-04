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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;


/**
 * Merge two log directories by the union of the locations inside them. Rows are expected to contain the same data for the same location (however, data from the first log path is used in the output for location that intersect)
 */

public class MergeLogFiles {

	static String ITERATION_KEY = "iteration"; //$NON-NLS-1$
	static String TIME_KEY = "time"; //$NON-NLS-1$
	
	static String LS = System.getProperty("line.separator"); //$NON-NLS-1$
	
	
	
	private static Map<String, Map<Short, List<String>>> headers1;
	private static Map<String, Map<Short, List<String>>> headers2;

	
	@SuppressWarnings("unused")
	private static short NUM_LEAD_COLS = 2;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		if(args.length < 3) {
			System.err.println("Usage: MergeLogFiles <log path 1> <log path 2> <output path>"); //$NON-NLS-1$
			System.exit(-1);
		}
		
		try {
			String inputDir1 = args[0];
			String inputDir2 = args[1];
			String outDir = args[2];
				
			headers1 = readHeaders(inputDir1);
			headers2 = readHeaders(inputDir2);
			
			//Map<String, Map<Short, List<List<String>>>> data1 =readLogFiles(inputDir1);
			//Map<String, Map<Short, List<List<String>>>> data2 =readLogFiles(inputDir2);
			mergeFiles(inputDir1, inputDir2, outDir);
				
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
			}finally{
				if(reader !=null) reader.close();
			}
			
			
		}
		return result;
	}
		

	/**
	 * 
	 * @param logDir
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "nls", "unused" })
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
	
	@SuppressWarnings("nls")
	public static void mergeFiles(String in1, String in2, String out) throws Exception {
		
		
		File f = new File(in1);
        
		if(!f.exists() || !f.isDirectory() ) {
			System.err.println("Error "+in1+" does not exist or is not a directory");
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
			
			BufferedReader reader = null;
			BufferedReader reader2 = null;
			BufferedWriter fw = null;
			
			try {
				// Read header line
				reader = new BufferedReader(new FileReader(path));
				
				String buffer;
				buffer = reader.readLine(); // header
				buffer = reader.readLine(); // data
				List<String>data1 = getTokenList(buffer);
				
				
				String path2 = in2+File.separator+state+"_"+slevel+".csv";
				reader2  = new BufferedReader(new FileReader(path2));
				String buffer2 = reader2.readLine(); // header
				buffer2 = reader2.readLine(); // data
				List<String>data2 = getTokenList(buffer2);
			
				List<String>h1 = headers1.get(state).get(adminLevel);
				List<String>h2 = headers2.get(state).get(adminLevel);
					
				TreeSet<String>sortedList = new TreeSet<String>();
				for(String loc:h1)
					sortedList.add(loc);
				for(String loc:h2)
					if(!sortedList.contains(loc))
						sortedList.add(loc);
					
				File oDir = new File(out);
				if(!oDir.exists())
					oDir.mkdirs();
				
				String fname = out+File.separator+state+"_"+adminLevel+".csv";
				fw = new BufferedWriter(new FileWriter(fname), 1024*1024);
					
				// Write header
				fw.write(ITERATION_KEY);
				fw.write(",");
				fw.write(TIME_KEY);
					
				for(String loc:sortedList) {	
					if(loc.equals(ITERATION_KEY) || loc.equals(TIME_KEY)) continue;
					fw.write(",");
					fw.write(loc);
				}
				fw.write("\n");
					
				// Write data
				while(data1 != null && data1.size() > 0) { // First log file controls the number of rows
					fw.write(data1.get(0)); // iteration
					fw.write(",");
					fw.write(data2.get(1)); // time
						
					for(String loc:sortedList) {
						if(loc.equals(ITERATION_KEY) || loc.equals(TIME_KEY)) continue;
						fw.write(",");
						int index = h1.indexOf(loc);
						if(index != -1) 
							fw.write(data1.get(index));
						else {
							index = h2.indexOf(loc);
								if(index != -1) 
									fw.write(data2.get(index));
								else {
									throw new Exception("Cannot find "+loc+" in any of the logs");
								}
							}
							
					} // for each location
					fw.write("\n");
					data1 = getTokenList(reader.readLine());
					data2 = getTokenList(reader2.readLine());
				}
			} finally {
				if(fw!=null) {
					fw.flush();
					fw.close();
				}
				if(reader != null) reader.close();
				if(reader2 != null) reader2.close();	
			} // try finally
			
			
		} // for each file
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

