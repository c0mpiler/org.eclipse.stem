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


/**
 * Despite the name, DiffLogFile combines two log states in two directories using any arithmetic operation from +,-,/ or *. The log files are expected to contain an identical set of regions and rows.
 * The result can optionally be normalized by dividing by the total population count (assumed to be the same in both log files)
 */
public class DiffLogFile {

	static String ITERATION_KEY = "iteration"; //$NON-NLS-1$
	static String TIME_KEY = "time"; //$NON-NLS-1$
	
	static String LS = System.getProperty("line.separator"); //$NON-NLS-1$
	
	
	
	private static Map<String, Map<Short, List<String>>> headers;

	
	private static short NUM_LEAD_COLS = 2;
	
	/**
	 * 
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String [] args) {
		if(args.length < 6) {
			System.err.println("Usage: DiffLogFile <log path 1> <log path 2> <state> <arithmetic operation (+,-,/,*)> <output path>"); //$NON-NLS-1$
			System.exit(-1);
		}
		
		try {
			String inputDir1 = args[0];
			String inputDir2 = args[1];
			String state = args[2];
			String op = args[3];
			String outDir = args[4];
			boolean normalize = Boolean.parseBoolean(args[5]);
			headers = readHeaders(inputDir1);
			
			//Map<String, Map<Short, List<List<String>>>> data1 =readLogFiles(inputDir1);
			//Map<String, Map<Short, List<List<String>>>> data2 =readLogFiles(inputDir2);
			diffFiles(inputDir1, inputDir2, state, op, outDir, normalize);
				
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
			BufferedReader reader = new BufferedReader(new FileReader(path));
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
					
				for(int i=0;i<toks.length;++i) header.add(toks[i]);
			}
			if(reader!=null) reader.close();
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
	public static void diffFiles(String in1, String in2, String st, String op, String out, boolean normalize) throws Exception {
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
			String filestate = file.substring(0, ind);
			if(!filestate.equals(st))
				continue;
			
			String slevel = file.substring(ind+1, ind+2);
			
			short adminLevel = Short.parseShort(slevel);
			
			BufferedReader reader = null;
			BufferedReader reader2  = null;
			FileWriter fw = null;
			
			try {
				// Read header line
				reader = new BufferedReader(new FileReader(path));
				
				String buffer;
				buffer = reader.readLine(); // header
				buffer = reader.readLine(); // data
				List<String>data1 = getTokenList(buffer);
				
				
				String path2 = in2+File.separator+filestate+"_"+slevel+".csv";
				reader2  = new BufferedReader(new FileReader(path2));
				String buffer2 = reader2.readLine(); // header
				buffer2 = reader2.readLine(); // data
				List<String>data2 = getTokenList(buffer2);

				BufferedReader nreader = null;
				List<String> ndata=null;
				if(normalize) {
					String ppath = in1+File.separator+"Population Count_"+slevel+".csv";
					nreader  = new BufferedReader(new FileReader(ppath));
					String buffer3 = nreader.readLine(); // header
					buffer3 = nreader.readLine(); // data
					ndata = getTokenList(buffer3);
				}
				
				
				File oDir = new File(out);
				if(!oDir.exists())
					oDir.mkdirs();
				
				String fname = out+File.separator+filestate+"_"+adminLevel+".csv";
				fw = new FileWriter(fname);
					
				// Write header
				fw.write(ITERATION_KEY);
				fw.write(",");
				fw.write(TIME_KEY);
					
				for(String loc:headers.get(filestate).get(adminLevel)) {	
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
						
					
					for(int i=NUM_LEAD_COLS;i<data1.size();++i) {
						String dt1 = data1.get(i);
						String dt2 = data2.get(i);
						String nt = "1";
						if(normalize) nt = ndata.get(i);
						
						double d1 = Double.parseDouble(dt1);
						double d2 = Double.parseDouble(dt2);
						double n = Double.parseDouble(nt);
						
						running_sum += d1;
						fw.write(",");
				
						double d = 0.0;
						if(op.equals("+")) d = d1+d2;
						else if(op.equals("-")) d = d1-d2;
						else if(op.equals("/")) {
							if(d2 == 0) d = Double.POSITIVE_INFINITY;
							else d = d1/d2;
						} else if(op.equals("*")) d = d1*d2;
						else {
							fw.close();
							throw new Exception("Unknown operation "+op);
						}
						fw.write(""+d/n);
						
					} // for each location
					fw.write("\n");
					data1 = getTokenList(reader.readLine());
					data2 = getTokenList(reader2.readLine());
					if(normalize) ndata = getTokenList(nreader.readLine());
				}
				
				
			}finally {
				reader.close();
				reader2.close();
				fw.flush();
				fw.close();
			}
			
			
			
			
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

