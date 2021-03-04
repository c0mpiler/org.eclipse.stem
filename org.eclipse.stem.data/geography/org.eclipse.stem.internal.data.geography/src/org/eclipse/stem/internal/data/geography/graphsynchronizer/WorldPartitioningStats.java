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


import java.awt.Polygon;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.stem.internal.data.geography.graphsynchronizer.CommonBorderReader.CommonBorderRelation;


/**
  * From the STEM data generates an up to date file containing
  * number of high administrative level nodes by country along with a matrix enumerating edges between every pair of countries i,j
  */
public class WorldPartitioningStats {
	List<String> countryPreIDList;
	static List<File> filtered;
	static File[] retVal;
	private static final String STATS_FILE = "temp/data/statistics/worldPartioningStats.csv"; //$NON-NLS-1$


	static String [] countriesToProcess = null;
	static int NUM_COUNTRIES = -1;
	static int[][] commonBorderMatrix = null;

	static List<String> countries = new ArrayList<String>();
	static final String countryFilesPrefix = "resources/data/country/"; //$NON-NLS-1$ 

	static Map<String, Set<String>> countryIdMap = new HashMap<String, Set<String>>();
	static Map<String, List<String>> idsByCountry= new HashMap<String, List<String>>();
	
	/**
	 * highest admin level of regions for each country
	 */
	static Map<String, Integer> countryLevelMap = new HashMap<String, Integer>();
	
	/**
	 * number of nodes at highest admin level for each country
	 */
	static Map<String, Integer> countryNodeCountMap = new HashMap<String, Integer>();

	Polygon pixPoly;
	
	
	/**
	 * From the STEM data generates an up to date file containing
	 * number of high administrative level nodes by country along with a matrix enumerating edges between every pair of countries i,j
	 */
	@SuppressWarnings("nls")
	public WorldPartitioningStats() {
		
		// must do this first - initialization
		getAllCountriesToProcess();
		
		// read each folder
		readCountries();
		System.out.println("WorldPartioningStats() Updating States for "+countriesToProcess.length+" countries");
		
		for(int i = 0; i < countriesToProcess.length;i++) {
			
			readCountryCodes(countriesToProcess[i]);
			
			// now we need to replace all IDs with just the max level id's
			Set<String> allIDs = countryIdMap.get(countriesToProcess[i]);
			
			int maxAdminLevel = getHighestAdminLevel(allIDs);
			Set<String> highestIDs = getHighestAdminSet(allIDs,maxAdminLevel,countriesToProcess[i]);
			countryLevelMap.put(countriesToProcess[i], Integer.valueOf(maxAdminLevel));
			
			countryIdMap.remove(countriesToProcess[i]);
			countryIdMap.put(countriesToProcess[i], highestIDs);
			
			//Activator.logInformation(""+countriesToProcess[i]+" has "+highestIDs.size()+" low level nodes");
			countryNodeCountMap.put(countriesToProcess[i],Integer.valueOf(highestIDs.size()) );
			
		}// for i countries
		
		// next get the number of common border relations between each country
		populateCommonBorderMatrix();
		writeStats();
	}


	/**
	 * main() method for testing only
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		WorldPartitioningStats partitioningStats = new WorldPartitioningStats();
		
		System.exit(0);
		
	}

	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("nls")
	public void getAllCountriesToProcess() {
		List<String> fileNames = new ArrayList<String>();
		File countryDir = new File(countryFilesPrefix);
		if (countryDir.isDirectory()) {
			File [] files = countryDir.listFiles();
			for(int i =0 ; i < files.length; i ++) {
				if(files[i].isDirectory()) {
					String name = files[i].getName();
					if(name.indexOf(".")==-1) {
						fileNames.add(name);
					}
					
				}
			}
		}
		
		NUM_COUNTRIES = fileNames.size();
		commonBorderMatrix = new int[NUM_COUNTRIES][NUM_COUNTRIES];
		
		countriesToProcess = fileNames.toArray(new String[NUM_COUNTRIES]);
		Arrays.sort(countriesToProcess);
		
		//Activator.logInformation(" *** read "+NUM_COUNTRIES+ "country folders");
	}
	
	/**
	 * 
	 * @param countryIndex
	 */
	@SuppressWarnings("nls")
	public void populateCommonBorderMatrix() {
		
		CommonBorderReader cbr = new CommonBorderReader();
		
		for(int i = 0; i < countriesToProcess.length; i ++) {
			int	countryIndex = i;
			String country = countriesToProcess[i];
			int LVL = countryLevelMap.get(country).intValue();
			String key0 = country+"_"+LVL;
			
			for(int j = 0; j < countriesToProcess.length; j ++) {
				commonBorderMatrix[countryIndex][j] = 0; // init
			
				if(j != countryIndex) {
					String country2 = countriesToProcess[j];
					if(!countryLevelMap.containsKey(country2)) {
						System.out.println("could not find count for "+country2+" ** !!!!");
						System.exit(1);
					}
					int LVL2 = countryLevelMap.get(country2).intValue();
					String key2 = country2+"_"+LVL2;
					
					String[] keyPair = new String[2];
					keyPair[0] = key0;
					keyPair[1] = key2;
					
					// alphabetize
					Arrays.sort(keyPair);
					String query= keyPair[0]+"_"+keyPair[1]+".properties";
					
					if(cbr.getCommonBorderMap().containsKey(query)) {
						List<CommonBorderRelation> relations = cbr.getCommonBorderMap().get(query);
						commonBorderMatrix[countryIndex][j] = relations.size();
						//Activator.logInformation("match checking "+query+"  *** found "+commonBorderMatrix[countryIndex][j]);
					}
					
				}// not self country
			}// for all countries (other
		} //for all i
		
	}//populateCommonBorderMatrix
	
	/**
	 * 
	 */
	public void readCountries() {
			for (int i = 0; i < countriesToProcess.length; i ++) {	
				countries.add(countriesToProcess[i]);
				countryPreIDList = new ArrayList<String>(); 
				countryPreIDList.add(countriesToProcess[i]);
				idsByCountry.put(countriesToProcess[i], countryPreIDList);
			}
	}

	/**
	 * @param files
	 * @return retVal
	 */
	public static File[] filterAndSortFiles(File[] files) {
		filtered = new ArrayList<File>();
		for (int i = 0; i < files.length; i ++) {
			String name = files[i].getName();
			if(name.indexOf("_names.properties")>=1) { //$NON-NLS-1$ 
				filtered.add(files[i]);			
			}
		}
		retVal = new File[filtered.size()];
		for (int i = 0; i < filtered.size(); i ++) {
			retVal[i] = filtered.get(i);
		}
		Arrays.sort(retVal);
		return retVal;
	}
	
	/**
	 * @param stemid
	 * @return administration level
	 */
	public int getAdminLevel(String stemid) {
		
		String [] splitID = stemid.split("-"); //$NON-NLS-1$
		if(splitID.length == 4) {
			return 3;
		}
		else if(splitID.length == 3) {
			return 2;
		}
		else if(splitID.length == 2) {
			return 1;
		}
		return 0;
	}
	
	/**
	 * @param country
	 * @return countryPolygonMap
	 * Key: country name, Value: polygons within country
	 */
	public void readCountryCodes(String country) {
		
		Set<String> countryIDSet = null;
		NameReader nameReader = new NameReader();
		if(countryIdMap.containsKey(country)) {
			countryIDSet = countryIdMap.get(country);
		} else {
			countryIDSet = new HashSet<String>();
			countryIdMap.put(country, countryIDSet);
		}
		
		File countryDir = new File(countryFilesPrefix + country);
		if (countryDir.isDirectory()) {
			File [] files = filterAndSortFiles(countryDir.listFiles());
			
			for (int idx = 0; idx < files.length; idx++) {
				File countryFile = files[idx];
				@SuppressWarnings("unused")
				String name = countryFile.getAbsolutePath();
				Set<String> idSet = (nameReader.readNames(countryFile.getAbsolutePath())).keySet();
				
				Iterator<String> iter = idSet.iterator();
				while( (iter!=null)&&(iter.hasNext()) ) {
						String id = iter.next();
						if(!id.equalsIgnoreCase(country)) {
							countryIDSet.add(id);
						}
				}
			}
		} else {
			// should never happen
			System.out.println("problem reading "+country); //$NON-NLS-1$
			System.exit(1);
		}
		
		
		if(countryIDSet.size()==0) countryIDSet.add(country);
	}// readCountryCodes

	
	/**
	 * 
	 * @param allIdSet
	 * @return
	 */
	public  Set<String> getHighestAdminSet(Set<String> allIdSet, int maxAdmin,  String threeLetterCode) {
		Set<String> leveledIDList = new HashSet<String>();
		for(String stemid: allIdSet) {
			//Activator.logInformation("id = "+stemid+" "+threeLetterCode);
			int lvl = getAdminLevel(stemid);
			if((maxAdmin >=1)&&(lvl == maxAdmin)) {
				leveledIDList.add(stemid);
			}
			if((maxAdmin ==0)&&(lvl == maxAdmin)) {
				leveledIDList.add(threeLetterCode);
			}
		}
		return leveledIDList;
	}
	

	/**
	 * 
	 * @param allIdSet
	 * @return the highest admin level of the set
	 */
	public  int getHighestAdminLevel(Set<String> allIdSet) {
		int maxAdmin = 0;
		
		for(String stemid: allIdSet) {
			int lvl = getAdminLevel(stemid);
			if(lvl >= maxAdmin) maxAdmin = lvl;
			if(stemid.indexOf("US-")==0) { //$NON-NLS-1$
				return 2; // ignore the level 3 data for now (vermont)
			}
		}
		
		return maxAdmin;
	}

	/**
	 * 
	 */
	@SuppressWarnings("nls")
	private static void writeStats() {
		try {
			
			File statsFile = new File(STATS_FILE);
			statsFile.getParentFile().mkdirs();
			
			FileWriter fw = new FileWriter(statsFile);
			System.out.println("saving data");
			// rows
			for(int j = 0; j < NUM_COUNTRIES; j ++) {
				String s = "";
				String ctry = countriesToProcess[j];
				int nodes = countryNodeCountMap.get(ctry).intValue();
				s += ctry+","+nodes;
				
				//columns
				for(int i = 0; i < NUM_COUNTRIES; i ++) {
					s+=","+commonBorderMatrix[j][i];
				}// i columns
				
				s += "\n";
				fw.write(s);
			}
			
			fw.flush();
			fw.close();
			System.out.println("DONE");
			
		} catch (Exception e) {
			System.out.println("Error writing file " + e.getMessage());
		}
	} // write CENTERS data
	
}