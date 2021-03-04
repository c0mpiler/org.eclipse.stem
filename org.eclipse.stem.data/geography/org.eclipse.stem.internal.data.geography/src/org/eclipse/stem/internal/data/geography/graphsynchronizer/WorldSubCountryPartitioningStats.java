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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.stem.internal.data.geography.graphsynchronizer.CommonBorderReader.CommonBorderRelation;


/**
  * From the STEM data generates an up to date file containing
  * number of high administrative level nodes by country along with a matrix enumerating edges between every pair of countries i,j
  */
public class WorldSubCountryPartitioningStats {
	List<String> countryPreIDList;
	static List<File> filtered;
	static File[] retVal;
	private static final String LEVEL_1_STATS_FILE = "temp/data/statistics/subCountryPartioningStats.csv"; //$NON-NLS-1$
	static final String CODES_FILE = "countryCodeMap.csv"; //$NON-NLS-1$
	
	// TODO fix this
	private static final URI CODES_FILE_URI = URI.createURI("./resources/data/statistics/" + CODES_FILE);//$NON-NLS-1$

	static Map<String,String> countryCode2to3 = new HashMap<String,String>();
	static Map<String,String> countryCode3to2 = new HashMap<String,String>();
	
	static String [] countriesToProcess = null;
	static int NUM_COUNTRIES = -1;
	
	// the level 1 IDs to process (some are level 0 if no level 1 exists inside);
	static String[] level1IDs = null;
	static int[][] commonBorderMatrix = null;

	static List<String> countries = new ArrayList<String>();
	static final String countryFilesPrefix = "resources/data/country/"; //$NON-NLS-1$ 

	static Map<String, Set<String>> countryIdLevel1Map = new HashMap<String, Set<String>>();
	static Map<String, Set<String>> countryIdHighestMap = new HashMap<String, Set<String>>();

	static Map<String, List<String>> idsByCountry= new HashMap<String, List<String>>();
	
	/**
	 * highest admin level of regions for each country
	 */
	static Map<String, Integer> countryLevelMap = new HashMap<String, Integer>();
	
	/**
	 * number of nodes at highest admin level for each country
	 */
	//static Map<String, Integer> countryLevel0NodeCountMap = new HashMap<String, Integer>();
	static Map<String, Integer> countryLevel1NodeCountMap = new HashMap<String, Integer>();
	Polygon pixPoly;
	
	
	/**
	 * From the STEM data generates an up to date file containing
	 * number of high administrative level nodes by country along with a matrix enumerating edges between every pair of countries i,j
	 */
	@SuppressWarnings("nls")
	public WorldSubCountryPartitioningStats() {
		mapCodes(); // map the three letter to two letter codes
		// must do this first - initialization
		getAllCountriesToProcess();
		
		// read each folder
		readCountries();
		System.out.println("WorldPartioningStats() Updating States for "+countriesToProcess.length+" countries");
		
		for(int i = 0; i < countriesToProcess.length;i++) {
			
			readCountryCodes(countriesToProcess[i]);
			readLevel1CountryCodes(countriesToProcess[i]);
			
			// now we need to replace all IDs with just the max level id's
			Set<String> allIDs = countryIdHighestMap.get(countriesToProcess[i]);
			
			int maxAdminLevel = getHighestAdminLevel(allIDs);
			Set<String> highestIDs = getHighestAdminSet(allIDs,maxAdminLevel,countriesToProcess[i]);
			countryLevelMap.put(countriesToProcess[i], Integer.valueOf(maxAdminLevel));
			
			countryIdHighestMap.remove(countriesToProcess[i]);
			countryIdHighestMap.put(countriesToProcess[i], highestIDs);
			
			//Activator.logInformation(""+countriesToProcess[i]+" has "+highestIDs.size()+" low level nodes");
			// countryLevel0NodeCountMap.put(countriesToProcess[i],Integer.valueOf(highestIDs.size()) );
			
			
			
		}// for i countries
		
		// get the size of the level1 regions
		populateLeve1Level2Map();
		
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
		WorldSubCountryPartitioningStats partitioningStats = new WorldSubCountryPartitioningStats();
		
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
		countriesToProcess = fileNames.toArray(new String[NUM_COUNTRIES]);
		Arrays.sort(countriesToProcess);
		
		//Activator.logInformation(" *** read "+NUM_COUNTRIES+ "country folders");
	}
	
	/**
	 * read in a list of all countries
	 */
	@SuppressWarnings("nls")
	public void mapCodes() {
		
		  String record;  
          // int recCount = 0;
          BufferedReader d = null;
          try { 
        	  d = new BufferedReader(new InputStreamReader(getInputStreamForURI(CODES_FILE_URI)));

              while ( (record=d.readLine()) != null ) { 
                 // recCount++; 
                 StringTokenizer st = new StringTokenizer(record );
                 
                 @SuppressWarnings("unused")
				 String name = st.nextToken(",");
                 
				 String twoLetter = st.nextToken(",");
				 String threeLetter = st.nextToken(",");
				 
				 countryCode2to3.put(twoLetter,threeLetter);
				 countryCode3to2.put(threeLetter,twoLetter);
              } // lines
             
           } catch (IOException e) { 
              // catch io errors from FileInputStream or readLine() 
              System.out.println(" IOException error!" + e.getMessage()); 
           } finally {
        	   try {
        		   d.close();
        	   } catch (Exception e) { }
           }
	} // read codes
	
	
	/**
	 * 
	 * @param countryIndex
	 */
	@SuppressWarnings("nls")
	public void populateCommonBorderMatrix() {
		
		CommonBorderReader cbr = new CommonBorderReader();
		Map<String, List<CommonBorderRelation>> commonBorderMap = cbr.getCommonBorderMap();
		String[] relationFiles = commonBorderMap.keySet().toArray(new String[commonBorderMap.keySet().size()]);
		
		for(int i = 0; i < level1IDs.length; i ++) {
			String id1 = level1IDs[i];
			System.out.println("mapping "+id1+" id "+i+" of "+level1IDs.length);
			// set of the highest IDs contained in id1
			Set<String> highestIDs = countryIdLevel1Map.get(id1);
			
			// the country of id1
			String country = "";
			int LVL = getAdminLevel(id1);
			// get the three letter code for the country that contains this state
			if(LVL==0) {
				country = id1;
			} else {
				String id2Letter = id1.substring(0,2);
				country = countryCode2to3.get(id2Letter);
			}
			
			
			// now get the max level of the data
			LVL = countryLevelMap.get(country).intValue();
			String fileKey0 = country+"_"+LVL;
			
			// now find ALL the common border files that contain fileKey0
			for(int k = 0; k < relationFiles.length; k ++) {
				String fileName = relationFiles[k];
				// ignore the Vermont data for now !!
				if(fileName.indexOf("USA_3") == -1) {
					if(fileName.indexOf(fileKey0)>=0) {
						// we have a file
						List<CommonBorderRelation> relationList = commonBorderMap.get(fileName);
						
						// loop through all the possible relations
						for(int kk = 0; kk < relationList.size(); kk ++) {
							CommonBorderRelation edge = relationList.get(kk);
							
							// loop through all the nodes contained inside id1
							Iterator<String> iter = highestIDs.iterator();
							while((iter!=null)&&(iter.hasNext())) {
								String id12 = iter.next();
								String idOther = edge.getNeighborTo(id12);
								String parentOther = idOther; // default. Works for neighborLevel = 2 or 1
								if(idOther != null) {
									// found a neighbor. Get it's level 1 container
									int neighborLevel = getAdminLevel(idOther);
									if(neighborLevel>=2) {
										parentOther = getLevel1Parent(idOther);
									}
									
									// now find the INDEX of the neighbors parent
									for(int j = 0; j < level1IDs.length; j ++) {
										if(level1IDs[j].equalsIgnoreCase(parentOther)) {
											// and increment the matrix
											if(i!=j)  commonBorderMatrix[i][j]++;
										}
									}// for j level1IDs
									
								}
							}
							
						}//for(int kk = 0; kk < relationList.size(); kk ++)
						
					}//if(fileName.indexOf(fileKey0)>=0)
				
				}// ignore the Vermont data for now !!
				
				
			}// for k relationFiles
			
			
			
		} //for all i level 1 ids
		
	}//populateCommonBorderMatrix
	
	/**
	 * get the size of the level1 regions (number nodes contained
	 */
	public void populateLeve1Level2Map() {
		Set<String> idSet = countryIdLevel1Map.keySet();
		level1IDs = idSet.toArray(new String[idSet.size()]);
		Arrays.sort(level1IDs);
		int numIDs = level1IDs.length;
		
		System.out.println(" >>> got "+numIDs+" ids at level 1. Zeroing the Matrix");
		commonBorderMatrix = new int[numIDs][numIDs];
		for(int i = 0; i <numIDs; i ++ ) {
			for(int j = 0; j <numIDs; j ++ ) {
				commonBorderMatrix[i][j] = 0;
			}
		}
		
		for(int i = 0; i < numIDs; i ++) {
		
			String id = level1IDs[i];
			
			System.out.println("processing ****  "+id);
			
			int level = getAdminLevel(id);
			if(level == 0) {
				
				// 1. if this is a country node then there were NO level 1 nodes
				if(countryIdHighestMap.containsKey(id)) {
					Set<String> highestNodes = countryIdHighestMap.get(id);
					countryIdLevel1Map.put(id, highestNodes);
					countryLevel1NodeCountMap.put(id,Integer.valueOf(highestNodes.size()) );
				}else {
					System.out.println("ERROR: id="+id+"not found in countryIdHighestMap !!");
					System.exit(1);
				}
				
			} else {
				// this is really a level 1 key
				// so find out what country it is 
				String id2Letter = id.substring(0,2);
				
				String id3Letter = countryCode2to3.get(id2Letter);
				Set<String> highestNodes = countryIdHighestMap.get(id3Letter);
				Set<String> containedNodes = new HashSet<String>();
				for(String node: highestNodes) {
					if(node.indexOf(id)==0) {
						System.out.println(" "+id+" contains "+node);
						containedNodes.add(node);
					}
				}
				
				countryIdLevel1Map.put(id, containedNodes);
				countryLevel1NodeCountMap.put(id,Integer.valueOf(containedNodes.size()) );
			}
		}// all level 1 ids
		
	}//populateLeve1Leve2Map()
	
	
	
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
		return splitID.length-1;
	}
	
	/**
	 * 
	 * @param stemid
	 * @return
	 */
	public String getLevel1Parent(String stemid) {
		String [] splitID = stemid.split("-"); //$NON-NLS-1$
		return splitID[0]+"-"+splitID[1];
	}
	
	/**
	 * Get a map of all the level 1 keys
	 * @param country
	 * @return countryPolygonMap
	 * Key: country name, Value: polygons within country
	 */
	public void readLevel1CountryCodes(String country) {
		
		Set<String> stateIDSet = null;
		NameReader nameReader = new NameReader();
		
		File countryDir = new File(countryFilesPrefix + country);
		if (countryDir.isDirectory()) {
			File [] files = filterAndSortFiles(countryDir.listFiles());
			
			for (int idx = 0; idx < files.length; idx++) {
				File countryFile = files[idx];
				@SuppressWarnings("unused")
				String name = countryFile.getAbsolutePath();
				
				Set<String> idSet = (nameReader.readNames(countryFile.getAbsolutePath())).keySet();
				boolean haveLevel1 = false;
				Iterator<String> iter = idSet.iterator();
				while( (iter!=null)&&(iter.hasNext()) ) {
						String id = iter.next();
						int level = getAdminLevel(id);
						if(level==1) {
							haveLevel1 = true;
							// put the empty set
							countryIdLevel1Map.put(id, stateIDSet);
						}
				}
				if(!haveLevel1) {
					// System.out.println(">>>> "+country+" has no level 1 nodes");
					countryIdLevel1Map.put(country, stateIDSet); // in case there are NO level 1 ids.
				}
				
			}
		} else {
			// should never happen
			System.out.println("problem reading "+country); //$NON-NLS-1$
			System.exit(1);
		}
		
	}// readLevel1CountryCodes
	
	/**
	 * @param country
	 * @return countryPolygonMap
	 * Key: country name, Value: polygons within country
	 */
	public void readCountryCodes(String country) {
		
		Set<String> countryIDSet = null;
		NameReader nameReader = new NameReader();
		if(countryIdHighestMap.containsKey(country)) {
			countryIDSet = countryIdHighestMap.get(country);
		} else {
			countryIDSet = new HashSet<String>();
			countryIdHighestMap.put(country, countryIDSet);
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
	 * Gets a compatible input stream for the given URI
	 * @return
	 * @throws IOException
	 */
	private InputStream getInputStreamForURI(URI uri) throws IOException
	{
		return new ExtensibleURIConverterImpl().createInputStream(uri);
	}


	/**
	 * 
	 */
	@SuppressWarnings("nls")
	private static void writeStats() {
		try {
			
			File statsFile = new File(LEVEL_1_STATS_FILE);
			statsFile.getParentFile().mkdirs();
			
			FileWriter fw = new FileWriter(statsFile);
			System.out.println("saving data to "+statsFile.getAbsolutePath());
			// rows
			for(int j = 0; j < level1IDs.length; j ++) {
				String s = "";
				String id1 = level1IDs[j];
				int nodes = countryLevel1NodeCountMap.get(id1).intValue();
				s += id1+","+nodes;
				
				//columns
				for(int i = 0; i < level1IDs.length; i ++) {
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