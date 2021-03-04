// AggregateDataWriter
package org.eclipse.stem.util.analysis;

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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;

/**
 * writes CSV Files
 * 
 */
public class AggregateDataWriter {

	// private static final DateFormat df =
	// DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.MEDIUM);

	/**
	 * 
	 */
	private final String aggregateFileName;
	
	private static final String keyS = "S";
	private static final String keyE = "E";
	private static final String keyI = "I";
	private static final String keyR = "R";
	
	private static final String keyBirths = "Births";
	private static final String keyDeaths = "Deaths";
	// private static final String keyPopulation = "Population";
	private static final String keyDeltaBirths = "deltaBirths";
	private static final String keyDeltaDeaths = "deltaDeaths";
	private static final String keyIncidence = "Incidence";
	private static List<String> birthsList=null;
	private static List<String> deathsList=null;
	private static List<String> deltaBirthsList=new ArrayList<String>();
	private static List<String> deltaDeathsList=new ArrayList<String>();
	
	/**
	 * indicates if birth counts exist in data set
	 */
	// private boolean haveBirths = false;
	/**
	 * indicates if death counts exist in data set
	 */
	// private boolean haveDeaths = false;
	/** 
	 * Births are stored cumulatively but we want to log the derivative
	 * so we will store the previous value and subtract it to get the instantaneous value
	 */
	private static double pastBirths = 0.0;
	/** 
	 * Deaths are stored cumulatively but we want to log the derivative
	 * so we will store the previous value and subtract it to get the instantaneous value
	 */
	private static double pastDeaths = 0.0;
	
	
	private static final IPath PATH = ResourcesPlugin.getWorkspace().getRoot().getLocation();
	private static final String sep = File.separator;
	
	/**
	 * Directory containing scenario folders
	 */
	public static final String ANALYSISFOLDER = PATH.toOSString();

	/**
	 * Folder name for files containing aggregate data
	 */
	public static final String AGGREGATE_FOLDERNAME = "aggregate";
	private static final String aggregatePathSuffix = AGGREGATE_FOLDERNAME+sep;
	// TODO for now all aggregate data will be in one folder called csv/aggregate
	private String aggregateDirectoryName = PATH.append(sep + aggregatePathSuffix).toOSString();
	
	private FileWriter fw1;

	/**
	 * 
	 * @param dataFolder
	 * @param aggregateDataFileName
	 */
	public AggregateDataWriter(final String dataFolder, final String aggregateDataFileName) {
		// Determine the aggregate folder name from the data folder
		IPath p = new Path(dataFolder);
		p = p.removeLastSegments(1); // get rid of disease folder
		p = p.append(AGGREGATE_FOLDERNAME);
		this.aggregateDirectoryName = p.toOSString();
		// check that the directory exists	
		final File dir = new File(this.aggregateDirectoryName);
		if ((!dir.exists()) || (!dir.isDirectory())) {
			// create it.
			boolean success = dir.mkdirs();
			if (!success) {
				Activator.logError(
						"Failed to Create Directory" + aggregateDirectoryName,
						new IOException("Failed to Create Driectory"
								+ aggregateDirectoryName));
			}
		}
		
		aggregateFileName = aggregateDirectoryName+sep+aggregateDataFileName;
		try {
			fw1 = new FileWriter(aggregateFileName);
		} catch (final IOException e) {
			Activator.logError("Error opening data file"  + aggregateDirectoryName + " "+ aggregateFileName, e);
		}
	} // AggregateDataWriter

	/**
	 * log the data for an instance
	 * @param data
	 * @param alpha the immunity Loss Rate
	 * @return Filename (including path) of log file
	 */
	public String logDataInstance(final ReferenceScenarioDataInstance data, double alpha) {
		    
		    // String[] retVal = new String[2];
			Map<String,List<String>> instance = data.getInstance();	
			Set<String> keySet = instance.keySet();
			String[] keys = sortKeys(keySet, data);
			
			List<String> dataList = instance.get(keys[0]);
			
			String header = keys[0]; // this is the ITERATION_KEY = "iteration"; column
			StringBuilder strBldr = new StringBuilder(header);
			for (int i = 1; i < keys.length; i ++) {
				// log the header
				strBldr.append(",");
				strBldr.append(keys[i].toString().trim());
			}
			strBldr.append("\n");
			
			try {
				fw1.append(strBldr.toString());
			} catch (final IOException e) {
				Activator.logError("Error writing aggregate data file"  + aggregateDirectoryName + " "+ aggregateFileName, e);
			}
			
			// get the births 
			birthsList = data.getInstance().get(keyBirths);
			data.getInstance().put(keyBirths, birthsList);
			
			// get the deaths list
			deathsList = data.getInstance().get(keyDeaths);
			data.getInstance().put(keyDeaths, deathsList);
			
			
			int dataSize = dataList.size();
			// write the data
			for(int i = 0; i < dataSize; i ++) {
				// get the first column ("iterations")
				String key = keys[0].toString();
				List<String> valueList = data.getInstance().get(key);
				
				strBldr = new StringBuilder();
				strBldr.append(valueList.get(i));
				strBldr.append(" ");

				for (int j = 1; j < keys.length; j++) {
					key = keys[j].toString();
					valueList = data.getInstance().get(key);	
					strBldr.append(", ");
					strBldr.append(valueList.get(i));
				}// for all keys
				strBldr.append("\n");
				try {
					fw1.append(strBldr.toString());
				} catch (final IOException e) {
					Activator.logError("Error writing aggregate data file"  + aggregateDirectoryName + aggregateFileName, e);
				}
			}// for all points
			
			//str = "";
			try {
				if (fw1 != null) {
					fw1.flush();
					fw1.close();
				}
			} catch (final IOException e) {
				// do nothing
			}
			
			//haveBirths = false;
			if(birthsList!=null) {
				//haveBirths = true;
				// get the derivative for the births list
				for (int i = 0;i < birthsList.size(); i ++) {
					deltaBirthsList.add(i,birthsList.get(i));
				}
				if (deltaBirthsList != null) {
					pastBirths = 0;
					for (int ii = 0; ii < deltaBirthsList.size(); ii++) {
						final double births = (Double.valueOf(deltaBirthsList.get(ii))).doubleValue();
						deltaBirthsList.set(ii, "" + (births - pastBirths));
						pastBirths = births;
					}
				}
			}
			
			//haveDeaths = false;
			if(deathsList!=null) {
				//haveDeaths = true;
				// get the derivative for the deaths list
				for (int i = 0;i < deathsList.size(); i ++) {
					deltaDeathsList.add(i,deathsList.get(i));
				}
				if (deltaDeathsList != null) {
					pastDeaths = 0;
					for (int ii = 0; ii < deltaDeathsList.size(); ii++) {
						final double deaths = (Double.valueOf(deltaDeathsList.get(ii))).doubleValue();
						deltaDeathsList.set(ii, "" + (deaths - pastDeaths));
						pastDeaths = deaths;
					}
				}
			}
			
			data.getInstance().put(keyDeltaBirths, deltaBirthsList);
			data.getInstance().put(keyDeltaDeaths, deltaDeathsList);
			
			return this.aggregateFileName;
	}// log the data

	/**
	 * If the keySet contains the preferred keys, return the preferred ones in the preferred order,
	 * otherwise just returns them.
	 * @param keySet
	 * @return the sorted keys
	 */
	private String[] sortKeys(Set<String> keySet, final ReferenceScenarioDataInstance data) {
		
		List<String> preferredKeyOrder = getPreferredKeyOrder(data);
		
		String[] keys = new String[keySet.size()];
		int icount = 0;
		// first add the preferred keys (if they exist) in the correct order
	    Set<String> doneSet = new HashSet<String>();
		for (int i = 0; i < preferredKeyOrder.size(); i ++) {
			if(keySet.contains(preferredKeyOrder.get(i))) {
				keys[icount] = preferredKeyOrder.get(i).trim();
				icount ++;
				doneSet.add(preferredKeyOrder.get(i));
			}
		}
  
		// then add any other keys
		Iterator<String> iter = keySet.iterator();
		while((iter!=null)&&(iter.hasNext())){
			String nextKey = iter.next();
			if(!doneSet.contains(nextKey)) {
				keys[icount] = nextKey;
			    icount ++;
			}
		}
		
		return keys;
	}
	
	/**
	 * 
	 * @param data
	 * @return the preferred key order as a list of strings
	 */
	public List<String> getPreferredKeyOrder(final ReferenceScenarioDataInstance data) {
		List<String> preferredKeyOrder = new ArrayList<String>();
		preferredKeyOrder.add(ReferenceScenarioDataMapImpl.ITERATION_KEY);
		preferredKeyOrder.add(ReferenceScenarioDataMapImpl.TIME_KEY);
		
		String[] sKeys = data.getDataMap().getS_Keys();
		String[] eKeys = data.getDataMap().getE_Keys();
		String[] iKeys = data.getDataMap().getI_Keys();
		String[] rKeys = data.getDataMap().getR_Keys();
		
		
		if(sKeys != null) {
			for(int i = 0; i < sKeys.length; i ++) {
				preferredKeyOrder.add(sKeys[i]);
			}
		}
		
		if(eKeys != null) {
			for(int i = 0; i < eKeys.length; i ++) {
				preferredKeyOrder.add(eKeys[i]);
			}
		}
		
		if(iKeys != null) {
			for(int i = 0; i < iKeys.length; i ++) {
				preferredKeyOrder.add(iKeys[i]);
			}
		}
		
		if(rKeys != null) {
			for(int i = 0; i < rKeys.length; i ++) {
				preferredKeyOrder.add(rKeys[i]);
			}
		}
	
		preferredKeyOrder.add(keyBirths);
		preferredKeyOrder.add(keyDeaths);
		
		return preferredKeyOrder;
	}
	
	/**
	 * get the key use for Susceptible data
	 * @return 'S'
	 */
	public static String getKeyS() {
		return keyS;
	}
	
	/**
	 * get the key use for Exposed data
	 * @return 'E'
	 */
	public static String getKeyE() {
		return keyE;
	}
	/**
	 * get the key use for Infectious data
	 * @return 'I'
	 */
	public static String getKeyI() {
		return keyI;
	}
	/**
	 * get the key use for Recovered data
	 * @return 'R'
	 */
	public static String getKeyR() {
		return keyR;
	}

	

	/**
	 * get the key use for Incidence data
	 * @return 'Incidence'
	 */
	public static String getKeyIncidence() {
		return keyIncidence;
	}


}// AggregateDataWriter
