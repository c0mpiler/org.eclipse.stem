package org.eclipse.stem.analysis.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.eclipse.stem.analysis.Activator;
import org.eclipse.stem.core.common.util.LogInitializationException;

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


/**
 * Adds methods for streaming data instead of loading all data files into memory
 */
public class CSVScenarioStreamer extends CSVscenarioLoader {

	public static final int NUM_LEAD_COLS = 2;

	// The max number of rows to keep in memory
	private int bufferSize;
	// Whether to restart at the end of the file
	private boolean restart = true;
	
	// First Map: Key is population identifier (UNKNOWN_POP_IDENTIFIER_KEY if not known)
	// Second Map: Key is admin level
	// Third Map: Key is compartment
	
	TreeMap<Integer, RowData> rowData = new TreeMap<Integer, RowData>();
	Map<String, Map<Integer, Map<String, BufferedReader>>> streamReaders = new HashMap<String, Map<Integer, Map<String, BufferedReader>>>();
	Map<String, Map<Integer, Map<String, File>>> streamReaderFiles = new HashMap<String, Map<Integer, Map<String, File>>>();
	Map<String, Map<Integer, Map<String, Integer>>> streamReaderCurrentRow = new HashMap<String, Map<Integer, Map<String, Integer>>>();
	Map<String, Map<Integer, Map<String, List<Double>>>> streamReadersAggregateRows = new HashMap<String, Map<Integer, Map<String, List<Double>>>>();
	
	Map<String, Map<Integer, List<String>>> headersMap = new HashMap<String, Map<Integer, List<String>>>();
	
	private long timeStepMS = -1;
	
	private Map<String, Map<String, Map<Integer, List<Double>>>> cumulativeOffsets = new HashMap<String, Map<String, Map<Integer, List<Double>>>>();
	
	// These are the date formats we support. The two last ones are for backwards compatibility. If we change the logging date format again in the future,
	// insert the new format as the first element in the list.
	
	private String [] dateFormatStrings = {"yyyy-MM-dd HH:mm:ss", "EEE d MMM yy", "M/d/yyyy"};
	
	public class RowData {
		Map<String, Map<Integer, Map<String, List<Double>>>> streamReadersRowData = new HashMap<String, Map<Integer, Map<String, List<Double>>>>();
		public RowData() {
			
		}
		
		public void addPopulation(String population) {
			streamReadersRowData.put(population, new HashMap<Integer, Map<String, List<Double>>>());
		}
		
		public boolean hasPopulation(String population) {
			return streamReadersRowData.containsKey(population);
		}
		
		public void addAdminLevel(String population, int adminLevel) {
			streamReadersRowData.get(population).put(adminLevel, new HashMap<String, List<Double>>());
		}
		
		public boolean hasAdminLevel(String population, int adminLevel) {
			return streamReadersRowData.get(population).containsKey(adminLevel);
		}
		
		public void addState(String population, int adminLevel, String state) {
			streamReadersRowData.get(population).get(adminLevel).put(state, new ArrayList<Double>());
		}
		
		public boolean hasState(String population, int adminLevel, String state) {
			return streamReadersRowData.get(population).get(adminLevel).containsKey(state);
		}
		
		public List<Double> getData(String population, int adminLevel, String state) {
			return streamReadersRowData.get(population).get(adminLevel).get(state);
		}
	}
	/**
	 * @param path
	 */
	
	public CSVScenarioStreamer(String path, int bufferSize, boolean restart, String [] cumulativeStates ) throws LogInitializationException {
		super(path);
		this.bufferSize = bufferSize;
		this.restart = restart;
		for(int i=0;i<cumulativeStates.length;++i) {
			cumulativeOffsets.put(cumulativeStates[i], new HashMap<String, Map<Integer, List<Double>>>());
		}
	}
	
	
	/**
	 * prepareForStreaming
	 * 
	 * @param populationId Population identifier
	 * @param resolution The desired resolution, or -1 of all files should be streamed
	 */
	
	public void prepareForStreaming(String populationId, int resolution) throws IOException, LogInitializationException {
		
		if(!csvDataFiles.containsKey(populationId))
			throw new LogInitializationException(POPULATION_NOT_FOUND+populationId);
		
		List<File>fileList = csvDataFiles.get(populationId);
		
		for(int i = 0; i < fileList.size(); i ++) {
			File f = fileList.get(i);
			String name = f.getName();
			if(f.getName().startsWith(".")) continue;//$NON-NLS-1$
			int _idx = name.lastIndexOf('_');
			int dotidx = name.lastIndexOf('.');
			if(_idx <0 || dotidx < 0 || dotidx < _idx) continue; // not a data file
			String state = name.substring(0, _idx);

			// discovered a state
			registerKey(state);
			
			int res = Integer.parseInt(name.substring(_idx+1, dotidx));
			if(resolution != -1 && res != resolution) continue; // wrong resolution
			openFile(populationId, state, f, res);
		}
	}
	
	/**
	 * openFile. Open data file and prepare for streaming
	 * 
	 * @param population The population id
	 * @param state The state
	 * @param File file
	 * @param adminLevel
	 */
	
	public void openFile(String population, String state, File f, int adminLevel) throws IOException, LogInitializationException {
		BufferedReader reader = new BufferedReader(new FileReader(f));

		// Read two the first two lines to determine the time step (in ms) used in the external file. Use the date
		// information stored in the second column
		String data;
		
		SimpleDateFormat [] dateFormats = new SimpleDateFormat[dateFormatStrings.length];
		for(int i=0;i<dateFormatStrings.length;++i) dateFormats[i] = new SimpleDateFormat(dateFormatStrings[i], Locale.getDefault());
		
		Date date1=null, date2=null;
		
		data = reader.readLine(); // skip header
		if(data==null) {
			if(reader != null) reader.close();
			throw new LogInitializationException("Empty file"+f.getAbsolutePath());
		}
		
		if((data = reader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(data, ",");//$NON-NLS-1$

			st.nextToken();
			String date = st.nextToken().trim();

			for(int i=0;i<dateFormats.length;++i) {
				try {
					date1 = dateFormats[i].parse(date);
				}  catch (ParseException e) {
					// Nothing, keep going
				}
			}
			if(date1 == null){
				if(reader != null) reader.close();
				throw new LogInitializationException("Unable to parse date string "+date);
			}
			
		} else {
			if(reader != null) reader.close();
			throw new LogInitializationException("Unable to determine time step from log file "+f.getAbsolutePath());
		}

		if((data = reader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(data, ",");//$NON-NLS-1$

			st.nextToken().trim();
			String date = st.nextToken().trim();

			for(int i=0;i<dateFormats.length;++i) {
				try {
					date2 = dateFormats[i].parse(date);
				}  catch (ParseException e) {
					// Nothing, keep going
				}
			}
			if(date2 == null) {
				if(reader != null) reader.close();
				throw new LogInitializationException("Unable to parse date string "+date);
			}
		} else {
			if(reader != null) reader.close();
			throw new LogInitializationException("Unable to determine time step from log file "+f.getAbsolutePath());
		}

		if(this.timeStepMS == -1) 
			this.timeStepMS = date2.getTime() - date1.getTime();
		else if(this.timeStepMS != date2.getTime() - date1.getTime()) {
			if(reader != null) reader.close();
			throw new LogInitializationException("Inconsistent time step (compared to other log files) found in "+f.getAbsolutePath());
		}

		reader.close();
		
		// Reopen again
		reader = new BufferedReader(new FileReader(f));

		if(!streamReaders.containsKey(population)) {
			streamReaders.put(population, new HashMap<Integer, Map<String, BufferedReader>>());
			streamReaderFiles.put(population, new HashMap<Integer, Map<String, File>>());
			streamReaderCurrentRow.put(population, new HashMap<Integer, Map<String, Integer>>());
			streamReadersAggregateRows.put(population, new HashMap<Integer, Map<String, List<Double>>>());
			for(String s:cumulativeOffsets.keySet())
				cumulativeOffsets.get(s).put(population, new HashMap<Integer, List<Double>>());
			
		}
		if(!streamReaders.get(population).containsKey(adminLevel)) {
			streamReaders.get(population).put(adminLevel, new HashMap<String, BufferedReader>());
			streamReaderFiles.get(population).put(adminLevel, new HashMap<String, File>());
			streamReaderCurrentRow.get(population).put(adminLevel, new HashMap<String, Integer>());
			streamReadersAggregateRows.get(population).put(adminLevel, new HashMap<String, List<Double>>());
			for(String s:cumulativeOffsets.keySet())
				cumulativeOffsets.get(s).get(population).put(adminLevel, null);
			
		}
		Map<String, BufferedReader>stateReaderMap = streamReaders.get(population).get(adminLevel);
		Map<String, File>stateReadeFilesMap = streamReaderFiles.get(population).get(adminLevel);
		Map<String, Integer>stateRowMap = streamReaderCurrentRow.get(population).get(adminLevel);
		Map<String, List<Double>>stateAggregateRows = streamReadersAggregateRows.get(population).get(adminLevel);
		
		stateReaderMap.put(state, reader);
		stateReadeFilesMap.put(state, f);
		stateRowMap.put(state, -1); // no row read yet, first row is row 0
		stateAggregateRows.put(state, null);
		String header;

		if ( (header=reader.readLine()) != null ) { 
			if(!headersMap.containsKey(population))
				headersMap.put(population, new HashMap<Integer, List<String>>());
			Map<Integer, List<String>> adminMap = headersMap.get(population);
			if(!adminMap.containsKey(adminLevel)) {
				List<String>headerElements = new ArrayList<String>();
				adminMap.put(adminLevel, headerElements);
				StringTokenizer st = new StringTokenizer(header, ",");//$NON-NLS-1$

				int col = 0;
				while (st.hasMoreTokens()) {
					String val = st.nextToken().trim();
					if(col < NUM_LEAD_COLS) {++col;continue;}
					headerElements.add(val);
					++col;
				}
			}
		} // read the header


		/////////////////////
	}
	
	/**
	 * streamRow Stream next row of data
	 * 
	 * @param population The population id
	 * @param adminLevel which admin level
	 * @param state Which state (e.g. S)
	 * @return List<Double> The data, or null if end of line is encountered;
	 */
	
	public List<Double>streamRow(String population, int adminLevel, String state) throws IOException {
		List<Double>internalRow = internalStreamRow(population, adminLevel, state);
		if(internalRow != null) 
			return internalRow;
		else if(restart) {

			// Advance all other buffered readers to the end of file, then close and reopen and reset all streams to the second row
			for(Map.Entry<String, Map<Integer, Map<String, BufferedReader>>> entry:streamReaders.entrySet())
				for(Map.Entry<Integer, Map<String, BufferedReader>> entry2:entry.getValue().entrySet())
					for(Map.Entry<String, BufferedReader> entry3:entry2.getValue().entrySet()) {
						while(internalStreamRow(entry.getKey(), entry2.getKey(), entry3.getKey()) != null); // Advances all readers to EOF
						
						if(entry3.getValue() != null) {
							BufferedReader reader = entry3.getValue();
							File f= streamReaderFiles.get(entry.getKey()).get(entry2.getKey()).get(entry3.getKey());
							reader.close();
							reader = new BufferedReader(new FileReader(f));
							entry3.setValue(reader);
							reader.readLine(); // skip first line
						}
					}
			
			// Set the cumulative numbers
			RowData rd = rowData.lastEntry().getValue();
			for(Map.Entry<String, Map<String, Map<Integer,List<Double>>>> entry:cumulativeOffsets.entrySet())
				for(Map.Entry<String, Map<Integer, List<Double>>> entry2:entry.getValue().entrySet())
					for(Map.Entry<Integer, List<Double>> entry3:entry2.getValue().entrySet()) {
							List<Double>dataList = rd.getData(entry2.getKey(), entry3.getKey(), entry.getKey());
							entry3.setValue(dataList);
						}
							
						
			return streamRow(population, adminLevel, state);
		}
		// No restart
		// Just return the last value read when end-of-stream reached.
		RowData last = rowData.lastEntry().getValue();
		return last.getData(population, adminLevel, state);
	}
	
	private List<Double> internalStreamRow(String population, int adminLevel,
			String state) throws IOException {
		BufferedReader br = streamReaders.get(population).get(adminLevel).get(state);
		if(br == null) 
			return null; // stream is closed
		String data;
		if ( (data=br.readLine()) != null ) { 
			int currentRow = streamReaderCurrentRow.get(population).get(adminLevel).get(state)+1; // Will start at 0
			
			RowData currentRowData = null;
			if(!rowData.containsKey(currentRow)) {
				currentRowData= new RowData();
				rowData.put(currentRow, currentRowData);
				// Check if we're exceeding the size. If so, remove data
				if(rowData.size() > bufferSize) {
					rowData.remove(rowData.firstEntry().getKey());
				}
			} else currentRowData = rowData.get(currentRow);
			
			if(!currentRowData.hasPopulation(population))
				currentRowData.addPopulation(population);
			if(!currentRowData.hasAdminLevel(population, adminLevel))
				currentRowData.addAdminLevel(population, adminLevel);
			if(!currentRowData.hasState(population, adminLevel, state))
				currentRowData.addState(population, adminLevel, state);
			
			if(streamReadersAggregateRows.get(population).get(adminLevel).get(state) == null) 
				streamReadersAggregateRows.get(population).get(adminLevel).put(state, new ArrayList<Double>());
			
			
			List<Double>result = currentRowData.getData(population, adminLevel, state);
			List<Double>aggregateResult = streamReadersAggregateRows.get(population).get(adminLevel).get(state);
			result.clear(); // be safe
			StringTokenizer st = new StringTokenizer(data, ",");//$NON-NLS-1$
			
			int col = 0;
			while (st.hasMoreTokens()) {
				String val = st.nextToken().trim();
				if(col < NUM_LEAD_COLS) {++col;continue;}
				double d = Double.parseDouble(val);
				Map<String, Map<Integer, List<Double>>> offsets = cumulativeOffsets.get(state);
				if(offsets != null)  {
					List<Double>offsetData = cumulativeOffsets.get(state).get(population).get(adminLevel);
					if(offsetData != null)
						d = d + offsetData.get(col-NUM_LEAD_COLS);
				}
				result.add(d);
				if(aggregateResult.size() <= col-NUM_LEAD_COLS) aggregateResult.add(d);
				else aggregateResult.set(col-NUM_LEAD_COLS, aggregateResult.get(col-NUM_LEAD_COLS)+d);
				++col;
			}
			streamReaderCurrentRow.get(population).get(adminLevel).put(state,currentRow);
			
			return result;
		} else return null; // end of file reached
	}


	/**
	 * reset aggregate result for a stream 
	 */
	public void resetAggregate(String population, int adminLevel, String state, List<Double>initState) {
		List<Double>aggregateResult = streamReadersAggregateRows.get(population).get(adminLevel).get(state);
		if(aggregateResult == null) return;
		if(initState == null || initState.size() == 0)
			aggregateResult.clear();
		else {
			aggregateResult.clear();
			for(Double d:initState) aggregateResult.add(d);
		}
	}
	
	/**
	 * Return true if the last line of data has been read from the file matching the parameters
	 * @param population
	 * @param adminLevel
	 * @param state
	 * @return boolean True if EOF reached
	 */
	public boolean reachedEndOfFile(String population, int adminLevel, String state) throws IOException {
		BufferedReader br = streamReaders.get(population).get(adminLevel).get(state);
		if(br == null) 
			return true;
		boolean markSupported = br.markSupported();
		if(!markSupported)
			System.err.println("Stream does not support mark!");
		else {
			char [] c = new char[16];
			br.mark(16);
			int n = br.read(c);
			br.reset();
			if(n == 0 || n == -1) {
				br.close();
				streamReaders.get(population).get(adminLevel).put(state, null);// gc reader
				return true;
			}
		}
		return false;
	}
	
	public int getCurrentRow(String population, int adminLevel, String state) {
		return streamReaderCurrentRow.get(population).get(adminLevel).get(state);
	}
	
	public boolean containsState(String population, int adminLevel, String state) {
		return streamReaderCurrentRow.get(population).get(adminLevel).containsKey(state);
	}
	
	/**
	 * getNthFetchedRow Retrieve the Nth fetched row 
	 * 
	 * @param population Which population id
	 * @param adminLevel which admin level
	 * @param state Which state (e.g. S)
	 * @return List<Double> The data
	 */
	
	public List<Double>getNthFetchedRow(String population, int adminLevel, String state, int row) {
		if(!rowData.containsKey(row))
			Activator.logError("Row not available "+row+". Increasing buffersize is recommended.", new Exception());
		RowData rd = rowData.get(row);
		List<Double>result = rd.getData(population, adminLevel, state);
		return result;
	}

	/**
	 * Get aggregate result
	 * 
	 * @param population Which population id
	 * @param adminLevel which admin level
	 * @param state Which state (e.g. S)
	 * @return List<Double> The data
	 */
	
	public List<Double>getAggregateResult(String population, int adminLevel, String state) {
		List<Double>result = streamReadersAggregateRows.get(population).get(adminLevel).get(state);
		return result;
	}
	
	/**
	 * Return the position of the specified key 
	 * @param population
	 * @param adminLevel
	 * @param key
	 * @return position
	 */
	public int getDataPosition(String population, int adminLevel, String key) {
		return headersMap.get(population).get(adminLevel).indexOf(key);
	}
	
	/**
	 * Close all open files
	 */
	public void close() throws IOException {
		if(streamReaders == null) return;
		for(Map.Entry<String, Map<Integer, Map<String, BufferedReader>>> entry:streamReaders.entrySet())
			for(Map.Entry<Integer, Map<String, BufferedReader>> entry2:entry.getValue().entrySet())
				for(Map.Entry<String, BufferedReader> entry3:entry2.getValue().entrySet())
					if(entry3.getValue() != null) entry3.getValue().close();
		
		rowData.clear();
		streamReaders.clear();
		streamReaderCurrentRow.clear();
		streamReadersAggregateRows.clear();
		
	}


	/**
	 * Retrieve the time step (in ms) used in the log file
	 * @return
	 */
	public long getTimeStepMS() {
		return timeStepMS;
	}
	
}
