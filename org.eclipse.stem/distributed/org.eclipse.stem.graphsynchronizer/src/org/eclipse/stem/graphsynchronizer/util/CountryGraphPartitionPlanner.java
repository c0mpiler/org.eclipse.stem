package org.eclipse.stem.graphsynchronizer.util;

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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.stem.graphsynchronizer.Activator;

public class CountryGraphPartitionPlanner {
	
	static int NUM_COUNTRIES = -1;
	static int[][] commonBorderMatrix = null;
	static final String STATS_FILE = "worldPartioningStats.csv"; //$NON-NLS-1$
	static final String CODES_FILE = "countryCodeMap.csv"; //$NON-NLS-1$
	
	
	private static final String URI_PREFIX = "platform:/plugin/org.eclipse.stem.data.geography/resources/data/statistics/";
	// private static final String URI_PREFIX = "/Users/jhkauf/Documents/workspace/org.eclipse.stem.data.geography/resources/data/statistics/";
	private static final URI CODES_FILE_URI = URI.createURI(URI_PREFIX + CODES_FILE);
	private static final URI STATS_FILE_URI = URI.createURI(URI_PREFIX + STATS_FILE);
	
	static Map<String,String> countryCode2to3 = new HashMap<String,String>();
	static Map<String,String> countryCode3to2 = new HashMap<String,String>();
	
	static final List<Country> worldCountryList = new ArrayList<Country>();
	static final Map<String,Country> worldCountryMap = new HashMap<String,Country>();
	
	/**
	 * 
	 */
	public CountryGraphPartitionPlanner() {
		// step 0, regenerate the stats every time in case the STEM data changes
		//WorldPartitioningStats wps = new WorldPartitioningStats();
		
		// then prepare to do the plan
		mapCodes();
		mapCountryStats();
	}

	/**
	 * Main method for testing only
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * For testing only
		 */
		String[] test =	{ 
				"AFG","AGO","AIA","ALA","ALB","AND","ANT","ARE","ARG","ARM","ASM","ATA","ATF","ATG",
				"AUS","AUT","AZE","BDI","BEL","BEN","BFA","BGD","BGR","BHR","BHS","BIH","BLR","BLZ",
				"BMU","BOL","BRA","BRB","BRN","BTN","BVT","BWA","CAF","CAN","CCK","CHE","CHL","CHN",
				"CIV","CMR","COD","COG","COK","COL","COM","CPV","CRI","CUB","CXR","CYM","CYP","CZE",
				"DEU","DJI","DMA","DNK","DOM","DZA","ECU","EGY","ERI","ESH","ESP","EST","ETH","FIN",
				"FJI","FLK","FRA","FRO","FSM","GAB","GBR","GEO","GGY","GHA","GIB","GIN","GLP","GMB",
				"GNB","GNQ","GRC","GRD","GRL","GTM","GUF","GUM","GUY","HKG","HMD","HND","HRV","HTI",
				"HUN","IDN","IMN","IND","IOT","IRL","IRN","IRQ","ISL","ISR","ITA","JAM","JEY","JOR",
				"JPN","KAZ","KEN","KGZ","KHM","KIR","KNA","KOR","KWT","LAO","LBN","LBR","LBY","LCA",
				"LIE","LKA","LSO","LTU","LUX","LVA","MAC","MAR","MCO","MDA","MDG","MDV","MEX","MHL",
				"MKD","MLI","MLT","MMR","MNE","MNG","MNP","MOZ","MRT","MSR","MTQ","MUS","MWI","MYS",
				"MYT","NAM","NCL","NER","NFK","NGA","NIC","NIU","NLD","NOR","NPL","NRU","NZL","OMN",
				"PAK","PAN","PCN","PER","PHL","PLW","PNG","POL","PRI","PRK","PRT","PRY","PSE","PYF",
				"QAT","REU","ROU","RUS","RWA","SAU","SDN","SEN","SGP","SGS","SHN","SJM","SLB","SLE",
				"SLV","SMR","SOM","SPM","SRB","STP","SUR","SVK","SVN","SWE","SWZ","SYC","SYR","TCA",
				"TCD","TGO","THA","TJK","TKL","TKM","TLS","TMP","TON","TTO","TUN","TUR","TUV","TWN",
				"TZA","UGA","UKR","UMI","URY","USA","UZB","VAT","VCT","VEN","VGB","VIR","VNM","VUT",
				"WLF","WSM","YEM","ZAF","ZMB","ZWE" };
			
		
		Set<String> testSet = new HashSet<String>();
		for (int i = 0; i < test.length; i ++) {
			testSet.add(test[i]);
		}
	
		CountryGraphPartitionPlanner cgpp = new CountryGraphPartitionPlanner();

		int numServers = 7;
		
		List<PartitionGroup> plan = cgpp.getPlan(numServers, testSet);
		List<Set<String>> planCodes = cgpp.planAsCodeStrings(plan);
		
		Activator.logInformation("planning complete.... assignments are:");
		for(int i = 0; i < plan.size(); i ++) {
			
			PartitionGroup pg = plan.get(i);
			Set<String> countrySet = planCodes.get(i);
			double surface = pg.countUnresolvedBorderEdges();
			double surfaceToVolume = surface/(double)pg.totalNodes;
			Activator.logInformation("server number: "+i+"  size is "+pg.totalNodes+" external Edges = "+(int)surface+" surfaceToVolumeRatio= "+surfaceToVolume);
			
			String s = "";
			for(String ctry: countrySet)  {
				s += ctry+"  ";
			}// for all countries on group
			Activator.logInformation("      "+s);
		}// for all groups
		
		//now the the matrix of message size group to group
		int[][] pgMatrix = getPartitionGroupBorderMatrix(plan);
		Activator.logInformation("");
		Activator.logInformation("");
		Activator.logInformation("PartitionGroup Matrix");
		Activator.logInformation("");
		for (int i = 0; i < plan.size(); i ++) {
			String s = "";
			for (int j = 0; j < plan.size(); j ++) {
				if(pgMatrix[i][j]<10) s += " ";
				if(pgMatrix[i][j]<100) s += " ";
				s += pgMatrix[i][j]+"  ";
			}
			Activator.logInformation(s);
		}
	}
	
	/**
	 * Generate a partition plan for a collection of countries to run
	 *  0. validate the number of servers
  	 *  1. initialize an empty plan for numServers
	 *  2. add all countries to an unassigned set
	 *  3. get the countries sorted large to small
	 *  4. GET the total number of nodes for the ENTIRE collection to run
	 *  5. estimate the approximate target size per Partition Group
	 *  6. add the numServers largest countries in order large to small
	 *  7. we have assigned numServers countries
	 *  8. iterate through the unassigned countries until we have no more
	 *  9. check max pg size here
	 *  10. get the highest surface area for all candidates wrt THIS group pg
	 *  11. is it the overall Largest??
	 *  12. if we are not reducing surface area we need to change the plan
	 *  13. assign the selected country
	 *  14. remove it from the unassigned list 
	 *  
	 * @param numServers
	 * @param unassignedSet
	 * @return
	 */
	public List<PartitionGroup> getPlan(int numServers, final Set<String> countries) {
		if(numServers > countries.size()) {
			numServers = countries.size();
			Activator.logInformation("CountryGraphPatitionPlanner.getPlan(): Warning, number of servers can not exceed number of countries. Using "+numServers+" servers for now."); //$NON-NLS-1$ //$NON-NLS-2$
		}
		List<PartitionGroup> partitionPlan = new ArrayList<PartitionGroup>();
		//1. init an empty plan
		for(int i = 0; i < numServers; i ++) {
			PartitionGroup countryGroup = new PartitionGroup(); // set of three letter country codes = plan for one server;
			partitionPlan.add(countryGroup);
		}
		
		// 2. add all countries to an unassigned set
		Set<String> unassignedSet = new HashSet<String>();
		unassignedSet.addAll(countries);
		
		// 3. get the countries sorted large to small
		Country[] unassignedCountries = getSortedCountries(unassignedSet);
		
		//4. GET the total number of nodes for the ENTIRE collection to run
		int totalProblemSize = 0;
		for(int i = 0; i < unassignedCountries.length; i ++) {
			totalProblemSize+= unassignedCountries[i].numNodes;
		}
		
		// 5. estimate the approximate target size per Partition Group
		Activator.logInformation("CountryGraphPatitionPlanner.getPlan(): APPROXIMATE total problem size = "+totalProblemSize);
		int targetGroupSize = totalProblemSize/numServers; // approximate target
		Activator.logInformation("CountryGraphPatitionPlanner.getPlan(): APPROXIMATE target partition size = "+targetGroupSize);
		
		// 6. add the numServers largest countries in order large to small
		for(int i = 0; i < numServers; i ++) {
			PartitionGroup partitionGroup = partitionPlan.get(i);
			partitionGroup.add(unassignedCountries[i]);
			Activator.logInformation(""+i+": added "+unassignedCountries[i].threeLetterCode);
			unassignedSet.remove(unassignedCountries[i].threeLetterCode);
		}
		
		// 7. we have assigned numServers countries
		
		
		// 8. iterate through the unassigned countries until we have no more
		int overAllMaxSurface = -1;
		int planToPick = -1;
		while(unassignedSet.size() > 0) {
			Country[] countriesToProcess=getSortedCountries(unassignedSet);
			overAllMaxSurface = -1; // reset
			// for each partition group
			for(int i = 0; i < partitionPlan.size(); i ++) {
				// iterate through every unassigned country
				PartitionGroup pg = partitionPlan.get(i);
				pg.nextCandidateMember=null;
				// 9. check max pg size here 
				if(pg.totalNodes < targetGroupSize) {
					// 10. get the highest surface area for all candidates wrt THIS group pg
					int highestSurface = pg.getLargestBorderForCountrySet(countriesToProcess);
					
					// 11. is it the overall Largest??
					if(highestSurface >= overAllMaxSurface) {
						overAllMaxSurface = highestSurface;
						planToPick = i;
					}// if new best pick
				}// if partition group is not too big already
			}// for all partitionGroups
			
			
			////////// no surface  ///////
			// 12. if we are not reducing surface area we need to change the plan
			// and instead add the next (largest) country to the Smallest PartitionGroup
			if(overAllMaxSurface<=0) {
				planToPick = getSmallestGroupIndex(partitionPlan);
				PartitionGroup pg = partitionPlan.get(planToPick);
				pg.nextCandidateMember=countriesToProcess[0]; // pick the LARGEST remaining country
			}
			////////// no surface  ///////
			
			
			// assert
			if(planToPick < 0) {
				Activator.logInformation("Houston we have a problem");
				System.exit(1);
			}
			
			// did we get a plan?
			if(planToPick >=0) {
				PartitionGroup nextGroup = partitionPlan.get(planToPick);
				Country selected = nextGroup.nextCandidateMember;
				
				if(selected==null) {
					Activator.logInformation("Houston we have a problem");
					System.exit(1);
				}
				//13. assign the selected country
				nextGroup.add(selected);
				//14. remove it from the unassigned list 
				unassignedSet.remove(selected.threeLetterCode);
			}
			if(unassignedSet.size()==0) break;
			
			
		}// WHILE we have more unassigned countries to process
				
		return partitionPlan;
	}
	
	
	/**
	 * 
	 * @param partitionPlan
	 * @return
	 */
	public List<Set<String>> planAsCodeStrings(List<PartitionGroup> partitionPlan) {
		List<Set<String>> planList = new ArrayList<Set<String>>();
		for(int i = 0; i < partitionPlan.size(); i ++) {
			// iterate through every unassigned country
			PartitionGroup pg = partitionPlan.get(i);
			planList.add(pg.getCountryCodes());
		}// for all partitionGroups
		
		return planList;
	}
	
	
	
	/**
	 * gets the smallest current
	 * @param partitionPlan
	 * @return
	 */
	public int getSmallestGroupIndex(List<PartitionGroup> partitionPlan) {
		int smallest = Integer.MAX_VALUE;
		int index = -1;
		for(int i = 0; i < partitionPlan.size(); i ++) {
			// iterate through every unassigned country
			PartitionGroup pg = partitionPlan.get(i);
			if(pg.totalNodes < smallest) {
				smallest = pg.totalNodes;
				index = i;
			}// if partition group 
		}// for all partitionGroups
		return index;
	}
	
	
	
	
	/**
	 * Sorted Country[] large to small
	 * @param countrySet
	 * @return
	 */
	public Country[] getSortedCountries(Set<String> countrySet) {
		Country[] sortedCountries = new Country[countrySet.size()];
		int icount = 0;
		for(String ctry: countrySet)  {
			Country c = worldCountryMap.get(ctry);
			if(c == null)
				System.err.println("Unable to find country "+ctry);
			sortedCountries[icount] = c;
			icount ++;
		}
		Arrays.sort(sortedCountries);
		return sortedCountries;
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
	 * read in a list of all countries
	 */
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
              Activator.logInformation(" IOException error!" + e.getMessage()); 
           } finally {
        	   try {
        		   d.close();
        	   } catch (Exception e) { }
           }
	} // read codes
	
	/**
	 * read in a list of all countries
	 */
	public void mapCountryStats() {
		  int countryCount = 0;
		  String record;  
          // int recCount = 0;
          
          BufferedReader d = null;
          
          try {         	  
        	  d = new BufferedReader(new InputStreamReader(getInputStreamForURI(STATS_FILE_URI)));

              while ( (record=d.readLine()) != null ) { 
                 // recCount++; 
                 StringTokenizer st = new StringTokenizer(record,",");  
                 
				 String threeLetter = st.nextToken();
				 int numNodes = (Integer.valueOf(st.nextToken().trim())).intValue();
				 if(commonBorderMatrix == null) {
					 NUM_COUNTRIES = st.countTokens();
					 commonBorderMatrix = new int[NUM_COUNTRIES][NUM_COUNTRIES];
				 }
				 for (int i = 0; i < NUM_COUNTRIES; i ++) {
					 int val = (Integer.valueOf(st.nextToken().trim())).intValue();
					 commonBorderMatrix[countryCount][i] = val;
				 }
				 
				 String twoLetter = countryCode3to2.get(threeLetter);
				 Country ctry = new Country(threeLetter, twoLetter, countryCount, numNodes);
				 
				 worldCountryList.add(countryCount,ctry);
				 worldCountryMap.put(threeLetter, ctry);
				 countryCount++;
				 
				 
              } // lines
              
              Activator.logInformation("read matrix "+countryCount+" x "+NUM_COUNTRIES);
              if(countryCount != NUM_COUNTRIES) {
            	  Activator.logInformation("FAIL "+countryCount+" != "+NUM_COUNTRIES);
            	  System.exit(1);
              }

           } catch (IOException e) { 
              // catch io errors from FileInputStream or readLine() 
              Activator.logInformation(" IOException error!" + e.getMessage()); 
           } finally {
        	   try {
        		   d.close();
        	   } catch (Exception e) { };
           }
	} // read codes
	
	/**
	 * inner class
	 * @author jhkauf
	 *
	 */
	public class Country implements Comparable<Country> {
		
		String threeLetterCode;
		String twoLetterCode;
		int index;
		int numNodes;
		
		
		
		
		
		
		/**
		 * 
		 * @param threeLetterCode
		 * @param twoLetterCode
		 * @param index
		 */
		public Country(String threeLetterCode, String twoLetterCode, int index, int numNodes) {
			this.threeLetterCode = threeLetterCode;
			this.twoLetterCode = twoLetterCode;
			this.index = index;
			this.numNodes = numNodes;
		}



		/**
		 * compares two countries for sort
		 * @param other country
		 */
		public int compareTo(Country other) {
			
			// exception - large country with ZERO neighbors
			// TODO check the STEM data here
			// we many note be using all these PNG nodes
			// they have no neighbors
			if(this.threeLetterCode.equalsIgnoreCase("PNG")) return 1; //$NON-NLS-1$
			
			if(this.numNodes > other.numNodes) {
				return -1;
			} else if(this.numNodes < other.numNodes) {
				return 1;
			} else 	return 0;
		}
		
	}
	
	/**
	 * inner class
	 * @author jhkauf
	 *
	 */
	public class PartitionGroup {
		
		Set<Country> countryGroup = new HashSet<Country>();
		
		Country nextCandidateMember = null;
		
		int totalNodes = 0;
	
		/**
		 * 
		 */
		public PartitionGroup() {
		}
		
		/**
		 * returns the group as set of three letter country codes
		 * @return
		 */
		Set<String> getCountryCodes() {
			Set<String> planSet = new HashSet<String>();
			for(Country ctry: countryGroup)  {
				planSet.add(ctry.threeLetterCode);
			}
			return planSet;
		}

		/**
		 * 
		 * @param country
		 */
		public void add(Country country) {
			countryGroup.add(country);
			totalNodes += country.numNodes;
		}

		/**
		 * 
		 * @param other
		 * @return
		 */
		public int getCommonBorderArea(Country other) {
			int surfaceArea = 0;
			for(Country ctry: countryGroup)  {
				surfaceArea += commonBorderMatrix[ctry.index][other.index];
			}
			return surfaceArea;
		}
		
		
		
		
		
		/**
		 * 
		 * Count the unresolved or external edges in a countryGroup
		 * @return
		 */
		public int countUnresolvedBorderEdges() {
			int surfaceArea = 0;
			// for every country in this group
			for(Country ctry: countryGroup)  {
				
				// and for every possible neighbor country
				for(int j = 0; j < NUM_COUNTRIES; j ++) {
					// not diagonal element
					if(j != ctry.index) {
						Country target = worldCountryList.get(j);
						// IF country j is NOT in this group
						if(!countryGroup.contains(target)) {
							surfaceArea += commonBorderMatrix[j][ctry.index];
						}// if target is remote
					}// not diagonal (is target is OTHER country)
			
				}// all other target countries
				
			}// for all countries in this group
			return surfaceArea;
		}//countUnresolvedBorderEdges()
		
		
		
		/**
		 * 
		 * @param countriesToProcess
		 * @return
		 */
		public int getLargestBorderForCountrySet(Country[] countriesToProcess) {
			int maxArea = -1;
			// for each unassigned country
			for(int i = 0; i < countriesToProcess.length; i ++) {
				Country candidate = countriesToProcess[i];
				// get it's total border area with this group
				int surfaceArea = 0;
				for(Country ctry: countryGroup)  {
					surfaceArea += commonBorderMatrix[ctry.index][candidate.index];
				}
				if(surfaceArea > maxArea) {
					maxArea = surfaceArea;
					nextCandidateMember = candidate;
				}
			}//for countriesToProcess
			return maxArea;
		}



		
	}// PartitionGroup
	
	/**
	 * 
	 * @param masterList
	 * @return
	 */
	public static int[][] getPartitionGroupBorderMatrix(List<PartitionGroup> masterList) {
		int numGroups = masterList.size();
		int[][] matrix = new int[numGroups][numGroups];
		
		for(int i = 0; i < numGroups; i ++)  {
			PartitionGroup pgi = masterList.get(i);
			for(int j = 0; j < numGroups; j ++)  {
				matrix[i][j] = 0;
				if(i!=j) {
					PartitionGroup pgj = masterList.get(j);
					for(Country ctry: pgj.countryGroup)  {
						matrix[i][j] += pgi.getCommonBorderArea(ctry);
					}
				}
				
			}// for j
		} // for i
		return matrix;
	}
	

}// CountryGraphPatitionPlanner
