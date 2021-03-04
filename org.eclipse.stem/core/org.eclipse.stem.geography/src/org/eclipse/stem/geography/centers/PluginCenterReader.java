package org.eclipse.stem.geography.centers;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.Platform;
import org.eclipse.stem.data.geography.Activator;
import org.eclipse.stem.geography.names.GeographicMapper;
import org.osgi.framework.Bundle;

/** 
 * 
 * Same as CenterReader but uses OSGI bundle API's to load resources.
 * 
 */
public class PluginCenterReader extends GeographicMapper{
	
	public static Map<String, String> regionCentersMap= new HashMap<String, String>();
	
	public static final String GEOGRAPHY_DATA_PLUGIN = "org.eclipse.stem.data.geography"; //$NON-NLS-1$ 
	public static final String DATA_PATH =  "src/org/eclipse/stem/data/geography/centers/"; //$NON-NLS-1$ 
	
	//public static final String dataPath = "./src/org/eclipse/stem/data/geography/centers/"; //$NON-NLS-1$
	public static Bundle geoBundle;
	static List<URL> allCentersFiles = new ArrayList<URL>();
	List<String> allCountryIDs = new ArrayList<String>();
	/** 
	 * This class reads all the centers in STEM
	 */
	
	public PluginCenterReader() {
		try {
			//String top = parentDir.getCanonicalPath();
			geoBundle=Platform.getBundle(GEOGRAPHY_DATA_PLUGIN);
			
		}catch(Exception e) {
		       e.printStackTrace();
	    }
		getAllCenterFileNames();
		for(int i = 0; i < allCentersFiles.size(); i ++) {
			URL url = allCentersFiles.get(i);
			readCenters(url);
			
			int idx = url.toString().indexOf("_centers.properties");
			if(idx >3) {
				String id3 = url.toString().substring(idx-3,idx);
				if(id3.indexOf("ZZZ")==-1) 	allCountryIDs.add(id3);
			}
			
		}
		
	}
	
	/** 
	 * This class reads all the centers in STEM
	 */
	
	public PluginCenterReader(List<URL> centersFiles) {
		allCentersFiles = centersFiles;
		getAllCenterFileNames();
		for(int i = 0; i < allCentersFiles.size(); i ++) {
			URL url = allCentersFiles.get(i);
			readCenters(url);
			
			int idx = url.toString().indexOf("_centers.properties");
			if(idx >3) {
				String id3 = url.toString().substring(idx-3,idx);
				if(id3.indexOf("ZZZ")==-1) 	allCountryIDs.add(id3);
			}
		}
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		PluginCenterReader pcr = new PluginCenterReader();
	}
	
	/**
	 * Get an array of country codes
	 * @return
	 */
	public String[] getCountryIDs() {
		String[] id3s = allCountryIDs.toArray(new String[allCountryIDs.size()]);
		Arrays.sort(id3s);
		return id3s;
	}

	/**
	 * read in the Centers and keys
	 * 
	 */
	public Map<String, String> readCenters(URL url) {
		
			BufferedReader fileReader = openReader(url);
			
			try {
				// Add all the source URLs for this country.
				
				if (fileReader != null) {
					String buffer = null;
					while (EOF(buffer = fileReader.readLine()) != true) {
					
						//Activator.logInformation(" "+buffer);
						// Tokenize
						//
						if((buffer.indexOf("SOURCE")==-1)&&(buffer.indexOf("VALID")==-1)&&(buffer.indexOf("#")==-1)&&(buffer.indexOf("=")>=0)) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
							StringTokenizer tokenizer = new StringTokenizer(buffer, "="); //$NON-NLS-1$
							String stemID2 = tokenizer.nextToken().trim();
							String center = tokenizer.nextToken();
							regionCentersMap.put(stemID2, center);
							//Activator.logInformation(" mapped "+stemID2+" to "+Name.doubleValue() );
						}	
					}
				} 
				}catch (Exception e) {
					Activator.logInformation("Error reading file"+url); //$NON-NLS-1$
					e.printStackTrace();
					System.exit(1);
				}
				return regionCentersMap;
	
	}// readName(String fileName)
	
	
	/**
	 * Create a newBufferedReader
	 * 
	 * @param fileName
	 *            the center of the file we want to open for reading
	 * 
	 * @return a reader to a given file
	 */
	static protected BufferedReader openReader(URL url) {

		try {

//			File f = new File(file);

//			if (f.exists() == false) {
//				return null;
//			}

			return new BufferedReader((new InputStreamReader(url.openStream())));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	
	
	
	/**
	 * Indicate End-Of-File
	 * 
	 * @param buffer
	 *            A buffer of diva data
	 * 
	 * @return True if we have reached End-Of-File
	 */
	static protected boolean EOF(String buffer) {
		if (buffer == null )
			return true;
		return false;
	}
	
	/**
	 * 
	 */
	static protected void getAllCenterFileNames() {
		try {
			//Path p = new Path(DATA_PATH);
			Enumeration<URL> allFiles = geoBundle.findEntries(DATA_PATH, "*.properties", false); //$NON-NLS-1$ 
			
			URL[] dataFiles = filterAndSortFiles(allFiles);
				// remember the area files
				for(int j = 0; j < dataFiles.length; j ++) {	
					
					allCentersFiles.add(dataFiles[j]);
				}
			}catch (Exception e) {
				Activator.logInformation("Error reading file"+e.getMessage()); //$NON-NLS-1$
				e.printStackTrace();
				System.exit(1);
			}
	}

	/**
	 * filter the list of files and return a sorted array
	 * @param files
	 * @return
	 */
	static URL[] filterAndSortFiles(Enumeration<URL>allFiles) {
		List<URL> filtered = new ArrayList<URL>();
		while(allFiles.hasMoreElements()) {
			URL url = allFiles.nextElement();
		
			if(url.getPath().indexOf("_centers.properties")>=1) { //$NON-NLS-1$
				filtered.add(url);	
			}
		}
		URL[] retVal = new URL[filtered.size()];
		for (int i = 0; i < filtered.size(); i ++) {
			retVal[i] = filtered.get(i);
		}
		Arrays.sort(retVal, new Comparator<URL>() {
			@Override
			public int compare(URL ua, URL ub) {
				return ua.getPath().compareTo(ub.toString());
			}
		});
		return retVal;
	}
	
	/**
	 * filter the list of files and return a sorted array
	 * @param files
	 * @return
	 */
	
	static File[] filterAndSortCountryDirs(File[] files) {
		List<File> filtered = new ArrayList<File>();
		for (int i = 0; i < files.length; i ++) {
			String name = files[i].getName();
			
			if((name.indexOf("svn")<=-1)&&(name.indexOf("ZZZ")<=-1)&&(name.indexOf("DS_Store")<=-1)) { 
				filtered.add(files[i]);
			}
		}
		File[] retVal = new File[filtered.size()];
		for (int i = 0; i < filtered.size(); i ++) {
			retVal[i] = filtered.get(i);
		}
		Arrays.sort(retVal);
		return retVal;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public double getLatitude(String id) {
		if(regionCentersMap.containsKey(id)) {
			String center = regionCentersMap.get(id); 
			StringTokenizer tokenizer = new StringTokenizer(center, ","); //$NON-NLS-1$ 
			String lat = tokenizer.nextToken().trim();
			double latVal = (Double.valueOf(lat)).doubleValue();
			return latVal;
		} else {
			Activator.logInformation("1. CenterReader(): Error, region "+id+" not found"); //$NON-NLS-1$ //$NON-NLS-2$
			return -999;
		}
		
	}
	
	/**
	 * returns double[2] (lat,lng)
	 * @param id
	 * @return
	 */
	public double[] getLatLong(String id) {
		double[] retVal = new double[2];
		if(regionCentersMap.containsKey(id)) {
			String center = regionCentersMap.get(id); 
			StringTokenizer tokenizer = new StringTokenizer(center, ","); //$NON-NLS-1$ 
			String lat = tokenizer.nextToken().trim();
			String lng = tokenizer.nextToken().trim();
			retVal[0] = (Double.valueOf(lat)).doubleValue();
			retVal[1] = (Double.valueOf(lng)).doubleValue();
			return retVal;
		} else {
			Activator.logInformation("2. CenterReader(): Warning, region "+id+" not found"); //$NON-NLS-1$ //$NON-NLS-2$
			return null;
		}
		
	}
	
	
	
	
}// class