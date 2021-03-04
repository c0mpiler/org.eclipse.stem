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


import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.stem.geography.centers.CenterReader;
import org.eclipse.stem.geography.centers.PluginCenterReader;
import org.eclipse.stem.geography.names.NameReader;
import org.eclipse.stem.graphsynchronizer.Activator;
import org.osgi.framework.Bundle;



/**
 * this class creates a tiling of the world and assigns the STEM geographic nodes (at highest admin level)
 * to these tiles. The tiles are later used to partition the global graph.
 * The tiles are in a space of 
 * -90<=lat<=90
 * -180<lng<=180
 * @author jhkauf
 *
 */
public class GlobalTileGenerator {

	static int NUM_COUNTRIES = -1;
	static String [] countriesToProcess = null;
	
	static Map<String, Set<String>> countryHighestIdMap = new HashMap<String, Set<String>>();
	static List<File> filtered;
	static File[] retVal;
	List<Tile> tileList = new ArrayList<Tile>();
	static Map<String,Bond> worldBondMap = new HashMap<String,Bond>();
	static Map<String,Node> worldNodeMap = new HashMap<String,Node>();
	
	private static final String URI_TARGET = "resources/data/statistics/"; //$NON-NLS-1$
	static final String CODES_FILE = "countryCodeMap.csv"; //$NON-NLS-1$
	private static URL CODES_FILE_URI = null;

	
	static Map<String,String> countryCode2to3 = new HashMap<String,String>();
	static Map<String,String> countryCode3to2 = new HashMap<String,String>();
	
	static Tile[][] tileMatrix;
	static int xSize;
	static int ySize;
	
	// the 4 nn and 4 nnn
	static int[] dx = { 1 , -1, 0,  0, 1,  1, -1, -1 };
	static int[] dy = { 0 , 0 , 1, -1, 1, -1, -1,  1 };
	
	static int[] linearLatCount = new int[181];
	static int[] linearLngCount = new int[361];
	
	/** 
	 * the final partition result is an array of rows of partitions (each partition = collection of tiles)
	 */
	static PartitionRow[] rows = null;
	
	
	
	/**
	 * get the final result as a list of Set of nodeIDs
	 * @return a list of Set<String>, one for each partition
	 */
	public List<Set<String>> getParitionedNodes() {
		List<Set<String>> result = new ArrayList<Set<String>> ();
		for(PartitionRow row: rows) {
			List<Partition> partitionList = row.partitionList;
			for(Partition partition: partitionList) {
				Set<String> nodeIdSet = partition.getAllNodes();
				
				Activator.logInformation(">>> parition #"+partition.id+" has "+nodeIdSet.size()+" nodeIDs");
				
				result.add(nodeIdSet);
			}// for all partitions in a row
		}// for all rows
		return result;
	}
	
	
	/**
	 * This class reads allows the user to specify the graph data for tiling
	 * 
	 * @param numParitions the number of paritions (machines) to use
	 * @param nodeIdMap a map of all nodes to partition the world into
	 * @param commonBorderIdPairsSet as Set of String[2] pairs representing the id's of all node pairs connected by a border or edge
	 */
	public GlobalTileGenerator(int numParitions, HashMap<String, Set<String>> nodeIdMap, Set<String[]> commonBorderIdPairsSet) {
		// two degree tiles
		int period = 2; 
		// phase is zero from now. We can later optimize this to reduce communications cost
	
		// TODO test at different phase values to see if this provides better optimization of edge communication
		// double phase = 0.0;
		init();

		Activator.logInformation("reading world centers...");
		PluginCenterReader cr = new PluginCenterReader();
		countriesToProcess = getCountryIDs(nodeIdMap);
		Activator.logInformation("got "+countriesToProcess.length+" country ids");
		
		// all the ids to process:
		countryHighestIdMap = nodeIdMap;
		createTiles(period);
		assignAllNodes(cr); // also creates the nodes and fills the worldNodeMap
		
		Activator.logInformation("reading world edges");
		readWorldBonds(commonBorderIdPairsSet);
		Activator.logInformation("read "+worldBondMap.size()+" world edges and "+worldNodeMap.size()+" nodes");
		computeAllEdges();
		rows = getPartitions(period, numParitions);
	}// constructor
	
	
	/** 
	 * This constructor is for testing.
	 * It takes as data the highest resolution nodes for the entire world and all common borders in the 
	 * stem data. Partitioning is called by the main method (also used for testing).
	 */
	
/*	public GlobalTileGenerator(int period, double phase) {
		init();
		
		Activator.logInformation("reading world centers...");
		PluginCenterReader cr = new PluginCenterReader();
		countriesToProcess = getCountryIDs();
		Activator.logInformation("got "+countriesToProcess.length+" country ids");
		
		// read each folder
		readIDsByCountryCode();
		createTiles(period);
		assignAllNodes(cr); // also creates the nodes and fills the worldNodeMap
		
		Activator.logInformation("reading world edges");
		Set<String[]> idPairsSet = getWorldFromCommonBorderReader();
		readWorldBonds(idPairsSet);
		Activator.logInformation("read "+worldBondMap.size()+" world edges and "+worldNodeMap.size()+" nodes");
		computeAllEdges();
		
	}// constructor
*/	
	/**
	 * for testing
	 * @param args
	 */
/*	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int period = 2; // two degree tiles
		double phase = 0.0;
		GlobalTileGenerator gtg = new GlobalTileGenerator(period ,phase);
		int numPartitions = 4;
		rows = gtg.getPartitions(period, numPartitions);
		List<Set<String>> result = gtg.getParitionedNodes();
		System.exit(0);
	}
	*/
	/**
	 * init the static linear density array
	 */
	public void init() {
		
//		File file = new File(".");
//		String filepath = file.getAbsolutePath();
//		int idx = filepath.indexOf(PROJECT_NAME);
//		Bundle bundle = Activator.getDefault().
//		Path path = new Path("../");
//		URL fileURL =  FileLocator.find(bundle, path, null);
//		WORKSPACE = fileURL.getPath();
		//WORKSPACE = filepath.substring(0,idx);
		Bundle geoBundle = Platform.getBundle("org.eclipse.stem.data.geography");
		
		Path path2 = new Path(URI_TARGET+CODES_FILE);
		CODES_FILE_URI = FileLocator.find(geoBundle, path2, null);
		
		
		for (int i = 0; i < linearLatCount.length; i ++) {
			linearLatCount[i] = 0;
		}
		mapCodes();
	}
	
	/**
	 * get ALL country IDs
	 * @return
	 */
	public static String[] getCountryIDs() {
		Set<String> ids = countryCode3to2.keySet();
		String[] retVal = ids.toArray(new String[ids.size()]);
		Arrays.sort(retVal);
		return retVal;
	}
	
	
	
	/**
	 * get the country IDs just send to this class
	 * @return
	 */
	public static String[] getCountryIDs(HashMap<String, Set<String>> countryIdMap) {
		Set<String> ids = countryIdMap.keySet();
		String[] retVal = ids.toArray(new String[ids.size()]);
		Arrays.sort(retVal);
		return retVal;
	}
	
	/**
	 * 
	 * @param numPartitions
	 * @return
	 */
	public PartitionRow[] getPartitions(int period, int numPartitions) {
		
		if(numPartitions==0) {
			Activator.logInformation("Minimum number of partitions is one, not Zero. Resetting to one");
			numPartitions = 1;
		}
		
		int numRows = (int) Math.sqrt((double) numPartitions);
		int targetPartitionSize = worldNodeMap.size()/numPartitions;
		int previousSum = 0;
		Activator.logInformation("calculated target partition size [nodes] is "+targetPartitionSize);
		
		int colsPerRow = numPartitions/numRows;
		double dColsPerRow = ((double)numPartitions)/((double)numRows);
		int firstExtra = 0;
		if(dColsPerRow > (double) colsPerRow) firstExtra = 1; //the first row might get one more 
		
		int targetRowSize = targetPartitionSize*(colsPerRow + firstExtra); // target size for FIRST row // the first row only might have an extra partition
		
		PartitionRow[] partitionRow = new PartitionRow[numRows];
		
		int latMin = -90;
		int lngMin = -180;
		int latSum = 0;
		int latMax = 0;
		for(int i = 0; i < 180; i ++) {
			latSum += linearLatCount[i];
			latMax = i-90;
			if(latSum >= targetRowSize) {
				int d1 = Math.abs(latSum-targetRowSize);
				int d2 = Math.abs(previousSum-targetRowSize);
				if(d2 < d1) latMax -= 1;
				break;
			} else {
				previousSum = latSum;
			}
		}
		
		int lngMax = 0;
		
		int icount = 0;
		Activator.logInformation(" numPartitions = "+numPartitions+"  adding numRows = "+numRows);
		for (int i = 0; i < numRows; i ++) {
			
			
			partitionRow[i] = new PartitionRow();
			int partitionsToAdd = colsPerRow;
			if(i==0) partitionsToAdd += firstExtra;
			Activator.logInformation(" row "+i+" :  adding "+partitionsToAdd+" partitions");
		
			// now divide up by longitude around the glove(360)
			linearLngCount = getLinearLngCount(latMin, latMax);
			lngMin = -180;
			int lngSum = 0;
			int previousLngSum = 0;
			for(int jj = (lngMin+180); jj < 360; jj ++) {
				lngSum += linearLngCount[jj];
				lngMax = jj-180;
				if(lngSum >= targetPartitionSize) {
					int d1 = Math.abs(lngSum-targetPartitionSize);
					int d2 = Math.abs(previousLngSum-targetRowSize);
					if(d2 < d1) lngMax -= 1;
					break;
				} else {
					previousSum = lngSum;
				}
			}
			
			
			Activator.logInformation("1) latmin = "+latMin+"  latmax= "+latMax);
			for(int j = 0; j < partitionsToAdd; j ++) {
				Partition p = new Partition(icount, latMin, lngMin, latMax, lngMax);
				icount ++;
				partitionRow[i].add(p);
				lngMin = lngMax;
				
				if(j < partitionsToAdd-1) {
					lngSum = 0;
					previousLngSum = 0;
					for(int jj = (lngMin+181); jj < 360; jj ++) {
						lngSum += linearLngCount[jj];
						lngMax = jj-180;
						if(lngSum >= targetPartitionSize) {
							int d1 = Math.abs(lngSum-targetPartitionSize);
							int d2 = Math.abs(previousLngSum-targetRowSize);
							if(d2 < d1) lngMax -= 1;
							break;
						} else {
							previousSum = lngSum;
						}
					}
				} else {
					lngMax = 180;
				}
				
				
			}
			
			// get ready for the next row
			// compute delatLat from the linear density count
			targetRowSize = targetPartitionSize*colsPerRow; // the first row only might have an extra partition
			latMin = latMax;
			
			if(i < numRows-1) {
				latSum = 0;
				previousSum = 0;
				for(int ii = (latMin+91); ii < 180; ii ++) {
					latSum += linearLatCount[ii];
					latMax = ii-90;
					if(latSum >= targetRowSize) {
						int d1 = Math.abs(latSum-targetRowSize);
						int d2 = Math.abs(previousSum-targetRowSize);
						if(d2 < d1) latMax -= 1;
						break;
					} else {
						previousSum = latSum;
					}
				}
			} else {
				latMax = 90; // everything
			}
			
			Activator.logInformation("2) latmin = "+latMin+"  latmax= "+latMax);
		}
		
		// now divy up the tiles
		int ix = 0;
		for(int iLat= -90; iLat < 90; iLat += period) {
			
			int iy = 0;
			for(int iLng = -180; iLng <180; iLng += period) {
				
				Tile tile = tileMatrix[ix][iy];
				boolean added = false;
				for(int i = 0; i < partitionRow.length; i ++) {
					PartitionRow row = partitionRow[i];
					for(Partition p: row.partitionList) {
						if((p.latMin<=iLat)&&(iLat < p.latMax)&&(p.lngMin<=iLng)&&(iLng<p.lngMax)) {
							p.addTile(tile);
							added = true;
							break;
						}// if
					}// for all p (cols)
					if(added) break;
				}// for i rows
				
				iy++;
			}// lng
			ix++;
		}// lat
		
		Activator.logInformation("");
		Activator.logInformation("sizes.....");
		// testing
		int avgSize = 0;
		int[] rowSum= new int[partitionRow.length];
		for(int i = 0; i < partitionRow.length; i ++) {
			rowSum[i] = 0;
		}
		
		for(int i = 0; i < partitionRow.length; i ++) {
			PartitionRow row = partitionRow[i];
			System.out.print("row("+i+")  ");
			for(Partition p: row.partitionList) {
				System.out.print(""+p.getSize()+"  ");
				avgSize += p.getSize();
				rowSum[i] += p.getSize();
			}// for all p (cols)
			Activator.logInformation("");
		}// for i rows
		
		avgSize /= numPartitions;
		Activator.logInformation("target partition size is "+avgSize);
		for(int i = 0; i < partitionRow.length; i ++) {
			
			Activator.logInformation("row "+i+" sum is "+rowSum[i]);
		}
		
		
		return partitionRow;
	}
	
	
	/**
	 * 
	 * @param latMin
	 * @param latMax
	 * @param partitionRow
	 * @return
	 */
	public int[] getLinearLngCount(int latMin, int latMax) {
		int[] linearLngCount = new int[361];
		for (int i = 0; i < linearLngCount.length; i ++) {
			linearLngCount[i] = 0;
		}
		
		Iterator<String> iter = worldNodeMap.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Node n = worldNodeMap.get(key);
			// is it in the latitude range for this row?	
			if((latMin<=n.lat)&&(n.lat < latMax)) {
				//yes, add to the histogram
				int idx = (int) (n.lng+180.0);
				linearLngCount[idx] ++;
			}// if
		}// for all nodes
		 
		return linearLngCount;
	}
	
	
	
	/**
	 * this method creates a list of tiles covering the world.
	 * The tiles are later used to partition the global graph.
	 * The tiles are in a space of 
	 * -90<=lat<=90
	 * -180<lng<=180
	 *
	 */
	public void createTiles(int period) {
		
		xSize = 180/period;
		ySize = 360/period;
		tileMatrix = new Tile[xSize][ySize];
		int icount = 0;
		int ix = 0;
		for(int iLat= -90; iLat < 90; iLat += period) {
			
			int iy = 0;
			for(int iLng = -180; iLng <180; iLng += period) {
				String id = "tile("+iLat+","+iLng+")";
				Tile t = new Tile(id, iLat,iLng,period);
				tileList.add(t);
				tileMatrix[ix][iy] = t;
				icount ++;
				iy++;
			}// lng
			ix++;
		}// lat
		Activator.logInformation("tiled world with "+icount+" tiles");
		
	}// createTiles
	
	
	/**
	 * 
	 */
	public void computeAllEdges() {
		
		int largestEdge = -1;
		for(int i=0; i < xSize; i++) {
			
			for(int j = 0; j < ySize; j++) {
				Tile tile = tileMatrix[i][j];
				// 1. iterate through the points
				for(Node n:tile.nodeSet) {
					//2. iterate through the edges
					for(Bond b: n.bondSet) {
						String otherID = b.getOtherID(n.id);
						Node otherNode = worldNodeMap.get(otherID);
						// is the other node in THIS tile?
						if(! tile.nodeSet.contains(otherNode)) {
							
							// No, then check all the neighbors
							for(int nn = 0; nn < 8; nn ++) {
								int di = i +dx[nn];
								int dj = j +dy[nn];
								if(di < 0) di = xSize-1;
								if(dj < 0) dj = ySize-1;
								if(di >= xSize) di = 0;
								if(dj >= ySize) dj = 0;
								Tile neighborTile = tileMatrix[di][dj];
								if(neighborTile.nodeSet.contains(otherNode)) {
									tile.edges[nn].addBondtoEdge(b.bondID);
									int edgeWeight = tile.edges[nn].getSize();
									if(edgeWeight > largestEdge) largestEdge = edgeWeight;
									break;
								}
							}// for all nn's
							
						}// if remote node
					}// for all bonds to node
				}// for all nodes in tile
				
			}// lng
		}// lat
		Activator.logInformation("Largest edge has "+largestEdge+" bonds");
	}//computeAllEdges()
	
	
	/**
	 * Used only for testing... Russia wraps across +/- Lng
	 * @param cr
	 */
	
	public static void testCentersRange(CenterReader cr) {
		
		double latMax = Double.MIN_VALUE;
		double lngMax = Double.MIN_VALUE;
		double latMin = Double.MAX_VALUE;
		double lngMin = Double.MAX_VALUE;
		for(String ctry:countriesToProcess) {
			Set<String> idSet = countryHighestIdMap.get(ctry);
			for(String id: idSet) {
				double[] latlng = cr.getLatLong(id);
				double lat = latlng[0];
				double lng = latlng[1];
				if(lat > latMax) latMax = lat;
				if(lng > lngMax) lngMax = lng;
				if(lat < latMin) latMin = lat;
				if(lng < lngMin) lngMin = lng;
				//if(lng>180) Activator.logInformation(" "+id+ " found at lng "+lng);
			}// for all ids
			
			
		}// for all countries
		Activator.logInformation("lat range is "+latMin+" to "+latMax);
		Activator.logInformation("lng range is "+lngMin+" to "+lngMax);
	}//testCentersRange
	
	/**
	 * 
	 * @param cr
	 */
	
	public void assignAllNodes(PluginCenterReader cr) {
		
		for(String ctry:countriesToProcess) {
			Set<String> idSet = countryHighestIdMap.get(ctry);
			for(String id: idSet) {
				double[] latlng = cr.getLatLong(id);
				if(latlng != null) {
					double lat = latlng[0];
					double lng = latlng[1];
					if(lng >180.0) lng -= 360.0; // fixes some points in russia
					Node node = new Node(id,lat,lng);
					boolean assigned = false;
					for(Tile tile: tileList) {
						if(tile.getBounds2D().contains(node.lat, node.lng) ) {
							tile.addNode(node);
							assigned = true;
							int idx = (int)(node.lat + 90.0);
							linearLatCount[idx] ++;
							break;
						}
					}
					if(!assigned) Activator.logInformation("Error, failed to assign "+id+" at "+lat+", "+lng );
				} 
				
				
			}// for all ids	
		}// for all countries
		
		int largest = 0;
		for(Tile tile: tileList) {
			if(tile.getNumNodes() > largest) largest = tile.getNumNodes();
			
		}
		
		Activator.logInformation("assigned all points. largest tile is "+largest);
	}//assignAllNodes
	


	/**
	 * for testing
	 * @param country
	 * @return countryPolygonMap
	 * Key: country name, Value: polygons within country
	 */
	public void readIDsByCountryCode() {
		
		for (int i = 0; i < countriesToProcess.length; i ++) {	
			String country = countriesToProcess[i];
			Set<String> countryIDSet = null;
			NameReader nameReader = new NameReader();
			if(countryHighestIdMap.containsKey(country)) {
				countryIDSet = countryHighestIdMap.get(country);
			} else {
				countryIDSet = new HashSet<String>();
				countryHighestIdMap.put(country, countryIDSet);
			}
			
			Set<String> idSet = (nameReader.readNamesByCountryCode(country)).keySet();
			
			Iterator<String> iter = idSet.iterator();
			while( (iter!=null)&&(iter.hasNext()) ) {
					String id = iter.next();
					if(!id.equalsIgnoreCase(country)) {
						countryIDSet.add(id);
					}
			}
		
			
			
			
			if(countryIDSet.size()==0) countryIDSet.add(country);
			// Activator.logInformation("country "+country+" has "+countryIDSet.size()+" ids");
			int lvl = getHighestAdminLevel(countryIDSet);
			
			if(lvl >=1) {
				Set<String> reducedIDSet = getHighestAdminSet(countryIDSet, lvl, country);
				countryIDSet = reducedIDSet;
			}
			//Activator.logInformation("   at admin level "+lvl+" country "+country+" has "+countryIDSet.size()+" ids");
			countryHighestIdMap.put(country, countryIDSet);
			
		}// for all countries to process
		
		
	}// readCountryCodes
	
	/**
	 * For testing
	 */
/*	public Set<String[]> getWorldFromCommonBorderReader() {
		Set<String[]> idPairsSet= new HashSet<String[]>();
		org.eclipse.stem.internal.data.geography.graphsynchronizer.CommonBorderReader cbr = new CommonBorderReader();
		Iterator<String> iter = cbr.getCommonBorderMap().keySet().iterator();
		while((iter!=null)&&(iter.hasNext())) {
			String key = iter.next();
			List<CommonBorderRelation> relations = cbr.commonBorderMap.get(key);
			for(CommonBorderRelation rel:relations) {
				String[] idPair = new String[2];
				idPair[0] =  rel.id1;
				idPair[1] =  rel.id2;
				idPairsSet.add(idPair);
			}
		}
		return idPairsSet;
	}//getWorldFromCommonBorderReader()
*/
	
	/**
	 * 
	 */
	public void readWorldBonds(Set<String[]> idPairsSet) {
		for(String[]idPair: idPairsSet) {
				String id1 = idPair[0];
				String id2 = idPair[1];
				Bond b = new Bond(id1,id2);
				worldBondMap.put(b.bondID, b); // all the bondss in the world
				
				// add the bond to the nodes as well.
				Node n1 = worldNodeMap.get(id1);
				Node n2 = worldNodeMap.get(id2);
				
				if(n1==null) {
					// Activator.logInformation("no node for id "+id1);
					
				} else {
					n1.bondSet.add(b);
				}
				if(n2==null) {
					// Activator.logInformation("2 no node for id "+id2);
					
				} else {
					n2.bondSet.add(b);
				}
				
		}// all idPairs
	}
		

	
	/**
	 * read in a list of all countries
	 */
	
	public void mapCodes() {
		
		  String record;  
          // int recCount = 0;
          BufferedReader d = null;
          try { 
        	  d = new BufferedReader(new InputStreamReader(CODES_FILE_URI.openStream()));

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
	

	
//	/**
//	 * Gets a compatible input stream for the given URI
//	 * @return
//	 * @throws IOException
//	 */
//	private InputStream getInputStreamForURI(URI uri) throws IOException
//	{
//		return new ExtensibleURIConverterImpl().createInputStream(uri);
//	}
		
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
	 * inner class. Bond between two nodes
	 * @author jhkauf
	 *
	 */
	public class Bond  {
		
		String bondID;
		String id1;
		String id2;
		
		/**
		 * Bond between two nodes
		 */
		
		public Bond(String node1, String node2) {
			String[] temp = new String[2];
			temp[0] = node1;
			temp[1] = node2;
			Arrays.sort(temp);
			bondID = temp[0]+"_"+temp[1];
			id1 = temp[0];
			id2 = temp[1];
		}
		
		/**
		 * from one nodes id return the other
		 * @param nodeID
		 * @return
		 */
		public String getOtherID(String nodeID) {
			if(id1.equalsIgnoreCase(nodeID)) {
				return id2;
			} else {
				return id1;
			}
		}
		
	}//Bond
	
	/**
	 * inner class
	 * @author jhkauf
	 *
	 */
	public class Edge  {
		
		Set<String> bondSet = new HashSet<String>();
		int index;
		
		/**
		 * Edge between two tiles
		 */
		public Edge(int idx) {
			index = idx;
		}
		
		
		public void addBondtoEdge(String bondID) {
			this.bondSet.add(bondID);
		}
		
		public int getSize() {
			return bondSet.size();
		}
		
	}//Edge
	
	/**
	 * inner class
	 * @author jhkauf
	 *
	 */
	@SuppressWarnings("serial")
	public class Tile extends Rectangle {
		
		private Set<Node> nodeSet = new HashSet<Node>();
		String  id;
		int numNodes = 0;
		
		Edge[] edges = new Edge[8]; // eight nearest neighbors
	
		/**
		 * 
		 */
		public Tile(String id, int x, int y, int period) {
			super(x,y,period,period);
			this.id = id;
			for(int i = 0; i < 8; i ++) {
				edges[i] = new Edge(i);
			}
		}
		
		/**
		 * 
		 * @param n
		 */
		public void addNode(Node n) {
			nodeSet.add(n);
			numNodes ++;
		}
		
		/**
		 * 
		 */
		public int getNumNodes() {
			return numNodes;
		}
	}// Tile inner class
	
	/**
	 * inner class
	 * @author jhkauf
	 *
	 */
	public class Node {
		
		double lat;
		double lng;
		String id;
		
		Set<Bond> bondSet = new HashSet<Bond>();
		
		/**
		 * 
		 */
		public Node(String id, double lat, double lng) {
			this.id = id;
			this.lat = lat;
			this.lng = lng;
			worldNodeMap.put(id, this);
		}
	}// Node inner class
	
	/**
	 * inner class
	 * @author jhkauf
	 *
	 */
	public class Partition {
		
		double latMin;
		double lngMin;
		double latMax;
		double lngMax;
		int id;
		private Set<Tile> tileSet = new HashSet<Tile>();
		int size = 0;
		
		
		/**
		 * 
		 */
		public Partition(int id, int latMin, int lngMin, int latMax, int lngMax) {
			this.id = id;
			this.latMin = latMin;
			this.lngMin = lngMin;
			this.latMax = latMax;
			this.lngMax = lngMax;
		}
		
		public int getSize() {
			return size;
		}
		
		public void addTile(Tile t) {
			if(t.numNodes > 0 ) {
				tileSet.add(t);
				size += t.numNodes;
			}
		}// addTile
		
		
		/**
		 * 
		 * @return a set of ids corresponding to all nodes in this tile
		 */
		public Set<String> getAllNodes() {
			Set<String> nodeIdSet = new HashSet<String>();
			for(Tile tile: tileSet) {
				for(Node node: tile.nodeSet) {
					nodeIdSet.add(node.id);
				}// all nodes in tile
			}// all tiles in this parition
			return nodeIdSet;
		
		}// getAllNodes
		
		
		
	}// Partition inner class
	
	/**
	 * inner class
	 * @author jhkauf
	 *
	 */
	public class PartitionRow {
		
		List<Partition> partitionList = new ArrayList<Partition>();
		
		/**
		 * 
		 */
		public PartitionRow() {
			
		}// constructor
		
		public void add(Partition p) {
			partitionList.add(p);
		}
		
	}// PartitionRow inner class
		
	
}/// Class GlobalTileGenerator
