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

public class SubCountryGraphPartitionPlanner {
	
	static int NUM_COUNTRIES = -1;
	static int NUM_LEVEL_1_IDS = -1;
	static int[][] level0CommonBorderMatrix = null;
	static int[][] level1CommonBorderMatrix = null;
	static final String STATS_FILE_0 = "worldPartioningStats.csv"; //$NON-NLS-1$
	static final String STATS_FILE_1 = "subCountryPartioningStats.csv"; //$NON-NLS-1$
	static final String CODES_FILE = "countryCodeMap.csv"; //$NON-NLS-1$
	
	
	private static final String URI_PREFIX = "platform:/plugin/org.eclipse.stem.data.geography/resources/data/statistics/";
	//private static final String URI_PREFIX = "/Users/jhkauf/Documents/workspace/org.eclipse.stem.data.geography/resources/data/statistics/";
	
	private static final URI CODES_FILE_URI = URI.createURI(URI_PREFIX + CODES_FILE);
	
	private static final URI STATS_FILE_0_URI = URI.createURI(URI_PREFIX + STATS_FILE_0);
	
	private static final URI STATS_FILE_1_URI = URI.createURI(URI_PREFIX + STATS_FILE_1);
	
	
	static Map<String,String> regionCode2to3 = new HashMap<String,String>();
	static Map<String,String> regionCode3to2 = new HashMap<String,String>();
	
	static final List<Country> worldCountryList = new ArrayList<Country>();
	static final Map<String,Country> worldCountryMap = new HashMap<String,Country>();
	
	static final List<Region> worldStateList = new ArrayList<Region>();
	static final List<String> levelOneIDList = new ArrayList<String>();
	
	static final Map<String,Region> worldSubCountryMap = new HashMap<String,Region>();
	static final double DELTA_TOLLERANCE = 0.2;
	static double SIZE_MISSMATCH_TOLLERANCE = 1.0+DELTA_TOLLERANCE;
	
	/**
	 * 
	 */
	public SubCountryGraphPartitionPlanner() {
		// step 0, regenerate the stats every time in case the STEM data changes
		//WorldPartitioningStats wps = new WorldPartitioningStats();
	
		
		// then prepare to do the plan
		mapCodes();
		mapCountryStats();
		mapSubCountryStats();
	}

	/**
	 * Main method for testing only
	 * @param args
	 */
	@SuppressWarnings({ "unused" })
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
	
		SubCountryGraphPartitionPlanner subCtryPartionPlanner = new SubCountryGraphPartitionPlanner();

		int numServers = 7;
		
		// DEBUG
		// subCtryPartionPlanner.checkSumCountryStats();
		
		final List<PartitionGroup> initialPlan = subCtryPartionPlanner.getInitialCountryLevelPlan(numServers, testSet);
		//final List<PartitionGroup> initialPlan = subCtryPartionPlanner.getPlan(numServers, testSet);
		List<PartitionGroup> plan = subCtryPartionPlanner.relaxPartitionPlan(initialPlan);
		
		List<Set<String>> planCodes = subCtryPartionPlanner.planAsCodeStrings(plan);
		
		Activator.logInformation("planning complete.... assignments are:");
		int allNodes = 0;
		for(int i = 0; i < plan.size(); i ++) {
			
			PartitionGroup pg = plan.get(i);
			Set<String> regionSet = planCodes.get(i);
			
			// checksum
			Set<Region> regionS = pg.regionGroup;
			for(Region r:regionS) {
				allNodes += r.numNodes;
			}
			
			double surface = pg.countUnresolvedBorderEdges();
			int totalNodes = pg.getTotalNodes();
			double surfaceToVolume = surface/(double)totalNodes;
			// *** Activator.logInformation(" ");
			Activator.logInformation("server number: "+i+"  size is ["+totalNodes+"] external Edges = "+(int)surface+" surfaceToVolumeRatio= "+surfaceToVolume);
			
			String s = "";
			int icount = 0;
			String[] rgns = regionSet.toArray(new String[regionSet.size()]);
			Arrays.sort(rgns);
			
			for(String region: rgns)  {
				s += region+"  ";
				icount ++;
				if (icount %25 == 0) s += "\n  ";
			}// for all countries on group
			// ***** Activator.logInformation("  "+s);
			
		}// for all groups
		Activator.logInformation("total nodeCount = "+allNodes);
		
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
	 * Generate a partition plan for a collection of level 1 regions to run
	 *  0. validate the number of servers
  	 *  1. initialize an empty plan for numServers
	 *  2. add all level 1 regions to an unassigned set
	 *  3. get the level 1 regions sorted large to small
	 *  4. GET the total number of nodes for the ENTIRE collection to run
	 *  5. estimate the approximate target size per Partition Group
	 *  6. add the numServers largest level 1 regions in order large to small
	 *     6.a. find the numServers largest countries in order large to small
	 *	   6.b.pick the largest regions inside the next largest country
	 *  7. we have assigned numServers level 1 regions
	 *  8. iterate through the unassigned level 1 regions until we have no more
	 *  9. check max pg size here
	 *  10. get the highest surface area for all candidates wrt THIS group pg
	 *  11. is it the overall Largest??
	 *  12. if we are not reducing surface area we need to change the plan
	 *  13. assign the selected region
	 *  14. remove it from the unassigned list 
	 *  
	 * @param numServers
	 * @param unassignedSet
	 * @return
	 */
	@SuppressWarnings({ "unlikely-arg-type" })
	public List<PartitionGroup> getPlan(int numServers, final Set<String> countries) {
		
		//0. The regions are a list of countries
		//   but we really want to study admin 1 regions
		//   so for each country:
		//   i: Get the two letter code from the three letter code
		//   ii: From the levelOneIDList add all the level one ids
		//   ii: or, if there is only the level 0 id add that.
		Set<String> regions = new HashSet<String>();
		for(String threeLetterID: countries)  {
			
			String twoLetterPrefix = regionCode3to2.get(threeLetterID);
			 
			for(int i = 0; i < levelOneIDList.size(); i ++) {
				String levelOneID = levelOneIDList.get(i);
				if((twoLetterPrefix!=null) && (levelOneID.indexOf(twoLetterPrefix)>=0)) regions.add(levelOneID);
				if(levelOneID.equalsIgnoreCase(threeLetterID)) regions.add(threeLetterID);
			}
			
		}
		// we now have the full region set in regions
		
		if(numServers > regions.size()) {
			numServers = regions.size();
			Activator.logInformation("CountryGraphPatitionPlanner.getPlan(): Warning, number of servers can not exceed number of countries. Using "+numServers+" servers for now."); //$NON-NLS-1$ //$NON-NLS-2$
		}
		
		
		
		//1. init an empty plan
		List<PartitionGroup> partitionPlan = new ArrayList<PartitionGroup>();
		for(int i = 0; i < numServers; i ++) {
			PartitionGroup partitionGroup = new PartitionGroup(); // set of three letter region codes = plan for one server;
			partitionPlan.add(partitionGroup);
		}
		
		// 2. add all regions to an unassigned set
		Set<String> unassignedSet = new HashSet<String>();
		unassignedSet.addAll(regions);
		
		// 3. get the regions sorted large to small
		Region[] unassignedRegions = getSortedRegions(unassignedSet);
		
		//4. GET the total number of nodes for the ENTIRE collection to run
		int totalProblemSize = 0;
		for(int i = 0; i < unassignedRegions.length; i ++) {
			totalProblemSize+= unassignedRegions[i].numNodes;
		}
		
		// 5. estimate the approximate target size per Partition Group
		Activator.logInformation("CountryGraphPatitionPlanner.getPlan(): total problem size = "+totalProblemSize);
		double targetGroupSizeD = totalProblemSize/numServers; // approximate target
		Activator.logInformation("CountryGraphPatitionPlanner.getPlan(): IDEAL target partition size = "+Math.round(targetGroupSizeD));
		targetGroupSizeD*= SIZE_MISSMATCH_TOLLERANCE;
		int targetGroupSize = (int)Math.round(targetGroupSizeD);
		Activator.logInformation("CountryGraphPatitionPlanner.getPlan(): Planning for max target partition size ~= "+targetGroupSize);
		
		// 6. seed the first numServer Regions
		// 6.a. find the numServers largest countries in order large to small
		SubCountryGraphPartitionPlanner.Country[] parents = getSortedCountries(worldCountryList);
		Arrays.sort(parents);
		
		
		
		for(int i = 0; i < numServers; i ++) {
			// the group to seed
			PartitionGroup partitionGroup = partitionPlan.get(i);
			String nextLargestCountry = parents[i].threeLetterCode;
			
			Region[] unassigned = getSortedRegions(unassignedSet);
			// 6.b.pick A region inside the next largest country
			Region seedRegion = null;
			for(int j = 0; j < unassigned.length; j ++) {
				seedRegion = unassigned[j];
				if(seedRegion.parentCountryCode.equalsIgnoreCase(nextLargestCountry)) {
					partitionGroup.add(seedRegion);
					Activator.logInformation(""+i+": seeding with  "+seedRegion.regionID+" inside country "+nextLargestCountry);
					unassignedSet.remove(seedRegion);
				}
					
			}
			
			
			
			
		}
		
		// 7. we have assigned numServers regions
		
		
		// 8. iterate through the unassigned regions until we have no more
		double progress = 0;
		
		while(unassignedSet.size() > 0) {
			
			if(progress%100==0) {
				Activator.logInformation("      "+unassignedSet.size()+" regions remaining to be assigned");
			}
			progress ++;
			
			Region[] regionsToProcess=getSortedRegions(unassignedSet);
			
			// for each partition group
			
			Region regionToAssign = null;
			PartitionGroup destinationGroup = null;
			double minFactor = Double.MAX_VALUE;
			
			for(int i = 0; i < partitionPlan.size(); i ++) {
				// iterate through every unassigned region
				PartitionGroup pg = partitionPlan.get(i);
				pg.nextCandidateMember=null;
						
				// 9. check max pg size here 
				if(pg.getTotalNodes() < targetGroupSize) {
					// 10. get the highest surface area for all candidates wrt THIS group pg
					for(Region candidate: regionsToProcess) {
						// for every OTHER group
						
						double worstCaseLoadThisCandidateThisPlan = Double.MIN_VALUE;
						
						for(int j = 0; j < partitionPlan.size(); j ++) {
							// iterate through every unassigned region
							if(j!=i) {
								PartitionGroup pgOther = partitionPlan.get(j);
								double load = getCommunicationsLoadFactor(candidate, pgOther.regionGroup, pg.regionGroup) ;
								if(load > worstCaseLoadThisCandidateThisPlan) {
									worstCaseLoadThisCandidateThisPlan = load;
								}// if new best
							}// if not this group
						}// for all other planGroups
						
						// is this a new best case
						if(worstCaseLoadThisCandidateThisPlan < minFactor) {
							minFactor = worstCaseLoadThisCandidateThisPlan;
							regionToAssign=candidate;
							destinationGroup=pg;
						}
						
					}// for all unassigned regions
							
				}// if partition group is not too big already
			}// for all partitionGroups
			
			//11. add the candidate
			if((regionToAssign !=null)&&(destinationGroup != null)) {
				destinationGroup.add(regionToAssign);
				unassignedSet.remove(regionToAssign.regionID);
			}
			
			
			
			if(unassignedSet.size()==0) break;
			
			
		}// WHILE we have more unassigned regions to process
				
		return partitionPlan;
	}
	
	/**
	 * 
	 * @param numServers
	 * @param countries
	 * @return
	 */
	
	public List<PartitionGroup> getInitialCountryLevelPlan(int numServers, final Set<String> countries) {
		
		Activator.logInformation("1. Getting initial Country Level Plan");
		// 1. Get an INITIAL plan using the country level plannter
		CountryGraphPartitionPlanner cgpp = new CountryGraphPartitionPlanner();
		List<CountryGraphPartitionPlanner.PartitionGroup> initialPlan = cgpp.getPlan(numServers, countries);
		List<Set<String>> initialPlanCountrySet = cgpp.planAsCodeStrings(initialPlan);
		
		// we now have the full region set in regions
		if(numServers > initialPlanCountrySet.size()) {
			numServers = initialPlanCountrySet.size();
			Activator.logInformation("CountryGraphPatitionPlanner.getPlan(): Warning, number of servers can not exceed number of countries. Using "+numServers+" servers for now."); //$NON-NLS-1$ //$NON-NLS-2$
		}
		Activator.logInformation("2. Executing initial Country Level Plan by level 1 regions");
	   
		// 2. execute this plan by the level one regions regions
		// init the  plan based on the country assignments
		int partitionCount = 0;
		List<PartitionGroup> partitionPlan = new ArrayList<PartitionGroup>();
		for(Set<String> countrySet:initialPlanCountrySet) {
		    // define a level 1 partition group for this set
			PartitionGroup partitionGroup = new PartitionGroup(); // set of three letter region codes = plan for one server;
			partitionPlan.add(partitionGroup);
			Activator.logInformation("");
			System.out.print("Partition "+partitionCount+" adding ");
			partitionCount++;
			// for every country in the plan
			for(String threeLetterID: countrySet) {
				
				System.out.print(" "+threeLetterID);
				String twoLetterPrefix = regionCode3to2.get(threeLetterID);
				for(int i = 0; i < levelOneIDList.size(); i ++) {
					String levelOneID = levelOneIDList.get(i);
					if((twoLetterPrefix!=null) && (levelOneID.indexOf(twoLetterPrefix)==0)) {
						Region region = worldSubCountryMap.get(levelOneID);
						partitionGroup.add(region);
					}
					// or.... if only the country node
					if(levelOneID.equalsIgnoreCase(threeLetterID)) {
						Region region = worldSubCountryMap.get(levelOneID);
						partitionGroup.add(region);
					}
				}
			}
			
		}
		return partitionPlan;
	}
	
	
	/**
	 * 
	 * @param numServers
	 * @param countries
	 * @return
	 */
	public List<PartitionGroup> relaxPartitionPlan(List<PartitionGroup> partitionPlan) {
		
		
		
		//3. get an accurate count of the total nodes
		int problemSize = 0;
		for(int i = 0; i < partitionPlan.size(); i ++) {
			PartitionGroup pg = partitionPlan.get(i);
			problemSize += pg.getTotalNodes();
		}
		
		double idealTargetSize = problemSize/partitionPlan.size();
		// 4. Relaxation. 
		
		
		//int pickIndex = getLargestGroupIndex(partitionPlan);
		//PartitionGroup largeGroup = partitionPlan.get(pickIndex);
		
		SIZE_MISSMATCH_TOLLERANCE = 1.0+DELTA_TOLLERANCE;
		for(int outer = 0; outer < 500; outer ++) {
			// 4.a. do an initial sort of the partitionGroups by size
			PartitionGroup[] sortedPlans = partitionPlan.toArray(new PartitionGroup[partitionPlan.size()]);
			Arrays.sort(sortedPlans);
			
			
			for(int inner = 0; inner < 10; inner ++) {
				// iterate through them
				for(int i = 0; i < sortedPlans.length; i ++) {
					
					PartitionGroup currentGroup= sortedPlans[i];
					int planSize = currentGroup.getTotalNodes();
					
					// for each group with size > target size....
					if(planSize > (idealTargetSize*SIZE_MISSMATCH_TOLLERANCE)) {
						// try to make a move - this really is a largeGroup
						int pickIndex = i; // a large plan
						double maxExternalArea = Double.MIN_VALUE;
						Region regionToMove = null;
						PartitionGroup groupToMoveTo = null;
						//int destinationIndex = 0;
						// 4a. For each region in the largest group
						for(Region candidate: currentGroup.regionGroup) {
							//4b. Find the other partition group with the LARGEST connections to that region
							for(int j  = 0; j < partitionPlan.size(); j ++) {
								if(j!= pickIndex) {
									// other groups only
									PartitionGroup otherGroup = partitionPlan.get(j);
									if(otherGroup.getTotalNodes()<=idealTargetSize){
										// small plan
										double load = getCommunicationsLoadFactor(candidate, otherGroup.regionGroup, currentGroup.regionGroup) ;
										if(load > maxExternalArea) {
											maxExternalArea = load;
											regionToMove = candidate;
											groupToMoveTo = otherGroup;
											//destinationIndex = j;
										}// if new best
									}// if small plan
									
								}// if other group
							} // for j other partitionGroups
						}// for all regions in group
						
						
						// 4c. Make the move
						if((regionToMove !=null)&&(groupToMoveTo != null)) {
							currentGroup.regionGroup.remove(regionToMove);
							groupToMoveTo.regionGroup.add(regionToMove);
						}
					} // if plan size >> avg
					else if(planSize < (idealTargetSize/SIZE_MISSMATCH_TOLLERANCE)) {
							
						// if really small find the best outside region to add
						PartitionGroup groupToMoveTo = currentGroup;
						PartitionGroup groupToMoveFrom = null;
						Region regionToMove = null;
						int maxArea = -1;
						int pickIndex = i;
						
						// iterate through all the OTHER groups
						for(int j  = 0; j < partitionPlan.size(); j ++) {
							if(j!= pickIndex) {
								// other groups only
								PartitionGroup otherGroup = partitionPlan.get(j);
								if(otherGroup.getTotalNodes()>(idealTargetSize*SIZE_MISSMATCH_TOLLERANCE)){
									for(Region candidate: otherGroup.regionGroup) {
										int area = groupToMoveTo.getSurfaceArea(candidate);
										if(area > maxArea) {
											regionToMove = candidate;
											groupToMoveFrom = otherGroup;
										}// if best candidate
									} //for all regions in other group
									
								}//if other group is large
							}//if other group
						}// for all groups
						if((regionToMove !=null)&&(groupToMoveFrom != null)) {
							groupToMoveFrom.regionGroup.remove(regionToMove);
							groupToMoveTo.regionGroup.add(regionToMove);
						}
						
					}// if plan size << average
					
				}// for all plans by size
				
				
			}// relax inner loop
		}// relax outer loop
	
		
		
				
		return partitionPlan;
	} // relaxPlanByCountries
	
	
	/**
	 * We want the minimum communication cost with OTHER RegionGroups and the maximum surface area reduction with THIS one.
	 * we compute the ratio surfaceAreaOTHER/surfaceAreaTHIS. Bigger values are better to move out.
	 * @param regionsToProcess
	 * @return
	 */
	public double getCommunicationsLoadFactor(Region candidate, Set<Region> outsideRegions, Set<Region> homeRegions) {
		double factor = Double.MIN_VALUE;
		
		double outSideSurfaceArea = 0;
		// for each region in OutSide group
		for(Region region: outsideRegions)  {
			outSideSurfaceArea += level1CommonBorderMatrix[candidate.index][region.index];
		}
		
		double inSideSurfaceArea = 0;
		// for each region in OutSide group
		for(Region region: homeRegions)  {
			inSideSurfaceArea += level1CommonBorderMatrix[candidate.index][region.index];
		}
		
		
		// weight the result by the volume of the region
		//surfaceAreaTHIS *= candidate.numNodes;
		if(inSideSurfaceArea <=0 ) inSideSurfaceArea = 0.01;  // avoid divide by zero
		if(outSideSurfaceArea ==0 ) outSideSurfaceArea = 0.1;  // weight only by 0.1/surfaceAreaTHIS;
		double ratio = outSideSurfaceArea/inSideSurfaceArea;
		
		if(ratio > factor) {
			factor = ratio;
		}
		
		return factor;
	}

	
	/**
	 * 
	 * @param partitionPlan
	 * @return
	 */
	
	public int getLargestGroupIndex(List<PartitionGroup> partitionPlan) {
		int pickIndex = 0;
		int maxSize = -1;
		for(int i  = 0; i < partitionPlan.size(); i ++) {
			PartitionGroup pg = partitionPlan.get(i);
			int numNodes = pg.getTotalNodes();
			if(numNodes > maxSize) {
				maxSize = numNodes;
				pickIndex = i;
			}
		}
		Activator.logInformation("**** choosing "+pickIndex+" size = "+maxSize);
		return pickIndex;		
	}//getLargestGroup
	
	/**
	 * 
	 * @param partitionPlan
	 * @return
	 */
	public List<Set<String>> planAsCodeStrings(List<PartitionGroup> partitionPlan) {
		List<Set<String>> planList = new ArrayList<Set<String>>();
		for(int i = 0; i < partitionPlan.size(); i ++) {
			// iterate through every unassigned region
			PartitionGroup pg = partitionPlan.get(i);
			planList.add(pg.getRegionCodes());
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
			// iterate through every unassigned region
			PartitionGroup pg = partitionPlan.get(i);
			int totalNodes = pg.getTotalNodes();
			if(totalNodes < smallest) {
				smallest = totalNodes;
				index = i;
			}// if partition group 
		}// for all partitionGroups
		return index;
	}
	
	
	
	
	/**
	 * Sorted Region[] large to small
	 * @param regionSet
	 * @return
	 */
	
	public Region[] getSortedRegions(Set<String> regionSet) {
		Region[] sortedRegions = new Region[regionSet.size()];
		int icount = 0;
		for(String region: regionSet)  {
			Region r = worldSubCountryMap.get(region);
			if(r == null)
				System.err.println("Unable to find region "+region);
			sortedRegions[icount] = r;
			icount ++;
		}
		Arrays.sort(sortedRegions);
		return sortedRegions;
	}
	
	/**
	 * Sorted Country[] large to small
	 * @param countryList
	 * @return
	 */
	public Country[] getSortedCountries(List<Country> countryList) {
		Country[] sortedCountries = countryList.toArray(new Country[countryList.size()]);
		Arrays.sort(sortedCountries);
		return sortedCountries;
	}
	
	
	/**
	 * Sorted String[] of county names (alphabetical) large to small
	 * @param countryList
	 * @return
	 */
	public String[] getSortedCountryNames(List<Country> countryList) {
		String[] sortedCountries = new String[countryList.size()];
		int icount = 0;
		for(Country ctry: countryList)  {
			sortedCountries[icount] = ctry.threeLetterCode;
			icount ++;
		}
		Arrays.sort(sortedCountries);
		return sortedCountries;
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
				 
				 regionCode2to3.put(twoLetter,threeLetter);
				 regionCode3to2.put(threeLetter,twoLetter);
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
	 * read in a map of countries and their sizes
	 */
	
	public void mapCountryStats() {
		  int index = 0;
		  String record;  
          // int recCount = 0;
          
          BufferedReader d = null;
          
          try {         	  
        	  d = new BufferedReader(new InputStreamReader(getInputStreamForURI(STATS_FILE_0_URI)));

              while ( (record=d.readLine()) != null ) { 
                 // recCount++; 
                 StringTokenizer st = new StringTokenizer(record,",");  
                 
				 String threeLetter = st.nextToken();
				 int numNodes = (Integer.valueOf(st.nextToken().trim())).intValue();
				
				 
				 String twoLetter = regionCode3to2.get(threeLetter);
				 Country country = new Country(threeLetter, twoLetter, index, numNodes);
				 
				 worldCountryList.add(index,country);
				 worldCountryMap.put(threeLetter, country);
				 index++;
				 
				 
              } // lines
              
              level0CommonBorderMatrix = new int[worldCountryList.size()][worldCountryList.size()];
              Activator.logInformation("read "+index+" countries and their sizes");
              

           } catch (IOException e) { 
              // catch io errors from FileInputStream or readLine() 
              Activator.logInformation(" IOException error!" + e.getMessage()); 
           } finally {
        	   try {
        		   d.close();
        	   } catch (Exception e) { };
           }
	} // map region stats matrix
	
	
	/**
	 * read in a matrix of all region neighbor statistics
	 */
	
	public void mapSubCountryStats() {
		  int levelOneCount = 0;
		  String record;  
          // int recCount = 0;
          
          BufferedReader d = null;
          
          // get the dimension of the Matrix from the first line of data
         
          try {         	  
        	  d = new BufferedReader(new InputStreamReader(getInputStreamForURI(STATS_FILE_1_URI)));

              while ( (record=d.readLine()) != null ) { 
                 // recCount++; 
                 StringTokenizer st = new StringTokenizer(record,",");  
                 
				 String levelOneID = st.nextToken();
				
				 int numNodes = (Integer.valueOf(st.nextToken().trim())).intValue();
				 if(level1CommonBorderMatrix == null) {
					 NUM_LEVEL_1_IDS = st.countTokens();
					 level1CommonBorderMatrix = new int[NUM_LEVEL_1_IDS][NUM_LEVEL_1_IDS];
				 }
				 for (int i = 0; i < NUM_LEVEL_1_IDS; i ++) {
					 int val = (Integer.valueOf(st.nextToken().trim())).intValue();
					 level1CommonBorderMatrix[levelOneCount][i] = val;
				 }
				 
				 String level0Code = "";
				 int lvl = getAdminLevel(levelOneID);
				 if(lvl==0) {
					 level0Code = levelOneID;
				 } else {
					 String twoLetter = levelOneID.substring(0,2);
					 level0Code = regionCode2to3.get(twoLetter);
				 }
				  
				 Country ctry = worldCountryMap.get(level0Code);
				 
				 // never happens if data ok
				 if(ctry==null) {
					 Activator.logInformation("Error, ctry = null for level0Code= "+level0Code);
					 System.exit(1);
				 }
				 
				 Region region = new Region(levelOneID, levelOneCount, numNodes,ctry.threeLetterCode);
				 
				 worldStateList.add(levelOneCount,region);
				 worldSubCountryMap.put(levelOneID, region);
				
				 levelOneIDList.add(levelOneID);
				 levelOneCount++;
				 
				 
              } // lines
              
              Activator.logInformation("read matrix "+levelOneCount+" x "+NUM_LEVEL_1_IDS);
              if(levelOneCount != NUM_LEVEL_1_IDS) {
            	  Activator.logInformation("FAIL "+levelOneCount+" != "+NUM_LEVEL_1_IDS);
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
	} // map region stats matrix
	
	/**
	 * This method is for testing only
	 * to validate the subCountry STATS matrix
	 */
	
	public void checkSumCountryStats() {
		
		String[] world = getSortedCountryNames(worldCountryList);
		for(int i = 0; i < world.length; i ++) {
			for(int j = 0; j < world.length; j ++) {
				level0CommonBorderMatrix[i][j]=0;
			}
		}
		
		for(int i = 0; i < worldStateList.size(); i ++) {
			int ii = getCountryIndex(worldStateList.get(i).parentCountryCode,world);
			for(int j = 0; j < worldStateList.size(); j ++) {
				int jj = getCountryIndex(worldStateList.get(j).parentCountryCode,world);
				if(ii!=jj) level0CommonBorderMatrix[ii][jj]+= level1CommonBorderMatrix[i][j]; // don't report the internal country edges
			}
		}
		Activator.logInformation("");
		Activator.logInformation("CheckSum for Stats Martix - compressed by country");
		Activator.logInformation("");
		for (int i = 0; i < world.length; i ++) {
			String s = world[i]+"  ";
			for (int j = 0; j < 25; j ++) {
				if(level0CommonBorderMatrix[i][j]<10) s += " ";
				if(level0CommonBorderMatrix[i][j]<100) s += " ";
				s += level0CommonBorderMatrix[i][j]+"  ";
			}
			Activator.logInformation(s);
		}
		Activator.logInformation("");
		Activator.logInformation("CheckSum for Stats Martix - compressed by country");
		Activator.logInformation("");
		System.exit(0);
	}
	
	/**
	 * 
	 * @param threeLetterCode
	 * @param world
	 * @return
	 */
	
	public static int getCountryIndex(String threeLetterCode, String[] world) {
		for(int i = 0; i < world.length; i ++) {
			if(world[i].equalsIgnoreCase(threeLetterCode)) return i;
		}
		Activator.logInformation("Error mapping country index");
		System.exit(1);
		return -1; // should never happen so 
	}
	
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
	public class Region implements Comparable<Region> {
		
		String regionID;
		int index;
		int numNodes;
		String parentCountryCode;
		
		
		/**
		 * @param regionID
		 * @param index
		 * @param numNodes
		 * @param parentCountry
		 */
		public Region(String regionID, int index, int numNodes, String parentCountry) {
			this.regionID = regionID;
			this.index = index;
			this.numNodes = numNodes;
			this.parentCountryCode = parentCountry;
		}



		/**
		 * compares two countries for sort
		 * @param other region
		 */
		public int compareTo(Region other) {
			
			// exception - large region with ZERO neighbors
			// TODO check the STEM data here
			// we many note be using all these PNG nodes
			// they have no neighbors
			if(this.regionID.equalsIgnoreCase("PNG")) return 1; //$NON-NLS-1$
			
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
	public class PartitionGroup implements Comparable<PartitionGroup> {
		
		Set<Region> regionGroup = new HashSet<Region>();
		
		Region nextCandidateMember = null;
		
	
		/**
		 * 
		 */
		public PartitionGroup() {
		}
		
		/**
		 * returns the group as set of three letter region codes
		 * @return
		 */
		Set<String> getRegionCodes() {
			Set<String> planSet = new HashSet<String>();
			for(Region region: regionGroup)  {
				planSet.add(region.regionID);
			}
			return planSet;
		}
		
		/**
		 * 
		 * @return
		 */
		public int getTotalNodes() {
			int sum = 0;
			for(Region r:regionGroup) {
				sum += r.numNodes;
			}
			return sum;
		}// getTotalNodes

		/**
		 * 
		 * @param region
		 */
		public void add(Region region) {
			regionGroup.add(region);
		}

		/**
		 * 
		 * @param other
		 * @return
		 */
		public int getCommonBorderArea(Region other) {
			int surfaceArea = 0;
			for(Region region: regionGroup)  {
				surfaceArea += level1CommonBorderMatrix[region.index][other.index];
			}
			return surfaceArea;
		}
		
		
		
		
		
		/**
		 * 
		 * Count the unresolved or external edges in a regionGroup
		 * @return
		 */
		public int countUnresolvedBorderEdges() {
			int surfaceArea = 0;
			// for every region in this group
			for(Region region: regionGroup)  {
				
				// and for every possible neighbor region
				for(int j = 0; j < NUM_LEVEL_1_IDS; j ++) {
					// not diagonal element
					if(j != region.index) {
						Region target = worldStateList.get(j);
						// IF region j is NOT in this group
						if(!regionGroup.contains(target)) {
							surfaceArea += level1CommonBorderMatrix[j][region.index];
						}// if target is remote
					}// not diagonal (is target is OTHER region)
			
				}// all other target countries
				
			}// for all countries in this group
			return surfaceArea;
		}//countUnresolvedBorderEdges()
		
		
		
		
		
		
		/**
		 * 
		 * @param candidate
		 * @return
		 */
		public int getSurfaceArea(Region candidate) {
			int surfaceArea = 0;
			// for each region in THIS group
			for(Region region: regionGroup)  {
				surfaceArea += level1CommonBorderMatrix[candidate.index][region.index];
			}
			return surfaceArea;
		}//getSurfaceArea

		
		/**
		 * compares two countries for sort
		 * @param other region
		 */
		public int compareTo(PartitionGroup other) {
			
			int thisSize = this.getTotalNodes();
			int otherSize = other.getTotalNodes();
			if(thisSize < otherSize) {
				return 1;
			} else if(thisSize > otherSize) {
				return -1;
			} else 	return 0;
		}//compareTo
		
		
		


		
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
					for(Region region: pgj.regionGroup)  {
						matrix[i][j] += pgi.getCommonBorderArea(region);
					}
				}
				
			}// for j
		} // for i
		return matrix;
	}
	

}// CountryGraphPatitionPlanner
