package org.eclipse.stem.utility.generators;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;


@SuppressWarnings("nls")
public class ParseAndCleanGHCNDaily {

	// The elements to clean. If you add to this list, make sure you include code below if necessary to avoid things like driving constrained value negative etc.
	public final static String []ELEMENTS = {"TMAX", "TMIN", "PRCP"};

	// Missing data code
	public final static double MISSING_DATA = -9999;

	// All station data
	public static Map<String, Map<String, ElementData>> stationData = new HashMap<String, Map<String,ElementData>>();
	// Station data in the time window the user asked for
	public static Map<String, Map<String, ElementData>> windowStationData = new HashMap<String, Map<String,ElementData>>();
	// Used to make sure the dates agree with the date in the input file
	public static Map<String, Calendar> dateChecks = new HashMap<String, Calendar>();
	// The distance between stations, sorted from shortest to longest.
	public static Map<String, Map<Double, String>> stationDist = new HashMap<String, Map<Double, String>>();
	// The elevation of stations
	public static Map<String, Double> stationElev = new HashMap<String,Double>();
	// The lat of stations
	public static Map<String, Double> stationLat = new HashMap<String,Double>();
	// The lon of stations
	public static Map<String, Double> stationLon = new HashMap<String,Double>();
	// Keep track of total number of missing data for each region. We report at the end allowing the user to remove regions with little data.
	public static Map<String, Integer> totalMissingData = new HashMap<String,Integer>();
	// The total number of days outputted
	public static int totalDays=0;
		
	public static String STATIONS_FILE = "stations.txt";
	
	public static double DEFAULT_MAX_DIST = 100; // 100 km max distance to condsider when patching with nearby stations
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if(args.length< 4) {
			System.err.println("Need input folder and output folder, start year, end year <patch flag> <maximum distance in km>");
			System.exit(-1);
		}

		int logStartYear = Integer.parseInt(args[2]);
		int logEndYear = Integer.parseInt(args[3]);
		boolean patchFlag = false;
		double maxDist=DEFAULT_MAX_DIST; 
		if(args.length >=5) {
			patchFlag = Boolean.parseBoolean(args[4]);
			if(args.length >= 6)
				maxDist=Double.parseDouble(args[5]);
		}

		try {
			File f = new File(args[0]);

			if(!f.exists() || !f.isDirectory()) {
				System.err.println("Bad input folder");
				System.exit(-1);
			}

			ArrayList<String>ids = new ArrayList<String>();
			String [] datafiles = f.list();
			for(String datafile:datafiles) {
				if(!datafile.endsWith(".dly")) continue;
				String firstTwo = datafile.substring(0, 2);
				if(!ids.contains(firstTwo)) 
					ids.add(firstTwo);
			}
			if(patchFlag)
				processStationsFile(f.getAbsolutePath()+File.separator+STATIONS_FILE, maxDist, ids);
			
			datafiles = f.list();
			for(String datafile:datafiles) {

				if(!datafile.endsWith(".dly")) continue;
				System.out.println("Processing "+datafile);
				BufferedReader br = new BufferedReader(new FileReader(f.getAbsolutePath()+File.separator+datafile));

				// Keep track of the last year and month processed for each element type so that we can fill in gaps with missing data.
				HashMap<String, Integer> lastYear = new HashMap<String, Integer>();
				HashMap<String, Integer> lastMonth = new HashMap<String, Integer>();

				// Also keep track of the start year and month of each type of data

				HashMap<String, Integer> startYear = new HashMap<String, Integer>();
				HashMap<String, Integer> startMonth = new HashMap<String, Integer>();

				// Also keep track of the date we're processing to make sure we don't get out of sync with the data files/

				String line = br.readLine();
				String id=null;
				dateChecks.clear();
				while(line != null) {
					id = line.substring(0, 11);
					int year = Integer.parseInt(line.substring(11, 15));
					int month = Integer.parseInt(line.substring(15, 17));

					String element = line.substring(17, 21);
					// Check 1
					if(!Arrays.asList(ELEMENTS).contains(element)) {
						System.out.println("Skipping element "+element);
						line = br.readLine();
						continue;
					}
					if(year < logStartYear) {
						line = br.readLine();
						continue; // Save memory
					}
					if(!startYear.containsKey(element)) {
						startYear.put(element, year);
						startMonth.put(element, month);
						Calendar cal = (Calendar)Calendar.getInstance().clone();
						cal.set(Calendar.YEAR, year);
						cal.set(Calendar.MONTH, month-1);
						cal.set(Calendar.DAY_OF_MONTH, 1);
						dateChecks.put(element,  cal);
					}
					
					// Do we need to fill in missing data?
					if(lastYear.containsKey(element)) {
						int ly = lastYear.get(element);
						int lm = lastMonth.get(element);

						Calendar cal = Calendar.getInstance();
						cal.set(Calendar.YEAR, ly);
						cal.set(Calendar.MONTH, lm-1);
						cal.set(Calendar.DAY_OF_MONTH, 1);

						// Add one month and make sure we're not missing data

						cal.add(Calendar.MONTH, 1);

						int expectYear = cal.get(Calendar.YEAR);
						int expectMonth = cal.get(Calendar.MONTH)+1;

						if(year != expectYear || month != expectMonth)
							fillInMissingData(stationData.get(id).get(element), ly, lm, year, month);

					}

					// Check that dates agree
					if(dateChecks.get(element).get(Calendar.YEAR) != year ||dateChecks.get(element).get(Calendar.MONTH) != month-1 ) {
						System.err.println(" *** ERROR DATE OUT OF SYNC. EXPECTED FIRST DAY of the month "+month+", "+year+" but saw "+ new SimpleDateFormat("yyyy-MM-dd").format(dateChecks.get(element).getTime())+" for "+element);
					}

					lastYear.put(element, year);
					lastMonth.put(element, month);

					int ind = 21;
					String code = "NOT EMPTY";
					Calendar cal = Calendar.getInstance();
					cal.set(Calendar.YEAR, year);
					cal.set(Calendar.MONTH, month-1);
					cal.set(Calendar.DAY_OF_MONTH, 1);
					int numDaysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

					while( numDaysInMonth-- >= 1) { 
						double val = Double.parseDouble(line.substring(ind, ind+5));
						code = line.substring(ind+5, ind+8);
						
						// If the code indicates that the value fails the bounds check, indicate it as missing instead.
						// Fixes problem where a min temperature of 74 C (!) was reported in Thailand
						
						if(code.charAt(1) == 'X')
							val = MISSING_DATA;
						Map<String, ElementData> ed_map = stationData.get(id);
						if(ed_map == null) {
							ed_map = new HashMap<String, ElementData>();
							stationData.put(id, ed_map);
						}
						ElementData ed = ed_map.get(element);
						if(ed == null) {
							ed = new ElementData(id, element);
							ed.setStartYear(startYear.get(element));
							ed.setStartMonth(startMonth.get(element));
							ed_map.put(element, ed);
						}
						ed.addElementData(val);
						ind += 8;
					}
					line = br.readLine();
				} // For each line

				// Fill in end year and month
				if(stationData.get(id) != null)
					for(String elm:stationData.get(id).keySet()) {
						ElementData ed = stationData.get(id).get(elm);
						ed.setEndYear(lastYear.get(elm));
						ed.setEndMonth(lastMonth.get(elm));
					}
				
				br.close();
			}// For each file

			createWindowStationData(logStartYear, logEndYear);
			// 
			if(patchFlag)
				patchData(maxDist);

			// Write out the result
			outputResult(args[1], logStartYear, logEndYear);
			
			reportMissing();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	private static void reportMissing() {
		TreeMap<Integer, String> sortedReport= new TreeMap<Integer, String>();
		for(String s:totalMissingData.keySet()) {
			int missing = totalMissingData.get(s);
			while(sortedReport.containsKey(missing)) {
				++missing; // ugh. Doesn't have to be exact though, it's just approx. 
			}
			sortedReport.put(missing, s);
		}
		
		for(int m:sortedReport.keySet()) {
			System.out.println(sortedReport.get(m)+" is missing "+100.0*(double)m/(double)(totalDays*ELEMENTS.length)+" % of data points");
		}
	}

	private static void processStationsFile(String sFile, double maxDist, ArrayList<String>ids) throws IOException {
		 File stationsFile = new File(sFile);
		 if(!stationsFile.exists()) {
			 System.err.println("WARNING. No stations.txt file found, won't be able to use distance between stations when patching data");
			 return;
		 }
		 
		 BufferedReader br = new BufferedReader(new FileReader(stationsFile));
		 
		 String line = br.readLine();
		 
		 while(line != null) {
			 String id = line.substring(0, 11);
			 if(!ids.contains(id.substring(0, 2))) {
				 line = br.readLine();
				 continue;
			 }
			 String s_lat = line.substring(12, 20);
			 String s_lon = line.substring(21, 30);
			 String s_elev = line.substring(31, 37);
			 String name = line.substring(38, 69).trim();
			 name = name.replace("\"", "\\\"");
			 System.out.println("\""+id+"\":["+s_lat+", "+s_lon+", "+s_elev+", \""+name+"\"],");
			 double lat = Double.parseDouble(s_lat);
			 double lon = Double.parseDouble(s_lon);
			 double elev = Double.parseDouble(s_elev);
			 
			 stationElev.put(id, elev);
			 stationLat.put(id,  lat);
			 stationLon.put(id,  lon);
			 line = br.readLine();
			 
		 }
		br.close();
		 
		// Figure out the distance between stations (assume all stations have lat/lon/elev). Code above would throw exception if not
		// Future improvement: Only calculate for station within same country and (maybe) neigboring countries
		 for(String station:stationElev.keySet()) {
			 double thisLat = stationLat.get(station);
			 double thisLon = stationLon.get(station);
			 
			 SortedMap<Double, String>distances = new TreeMap<Double, String>();
			 stationDist.put(station, distances);
			 
			 for(String otherStation:stationElev.keySet()) {
				 if(station.equals(otherStation)) continue;
				 double otherLat = stationLat.get(otherStation);
				 double otherLon = stationLon.get(otherStation);
				 
				 // Calculate distance using Haversine formula
				 double R = 6371.0; // km
				 double dLat = Math.toRadians(otherLat-thisLat);
				 double dLon = Math.toRadians(otherLon-thisLon);
				 double lat1 = Math.toRadians(thisLat);
				 double lat2 = Math.toRadians(otherLat);

				 double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
				         Math.sin(dLon/2) * Math.sin(dLon/2) * Math.cos(lat1) * Math.cos(lat2); 
				 double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
				 double d = R * c;
				 
				 if(d<=maxDist)
					 distances.put(d, otherStation); // Sorted by the key which is distance
			 }
		 }
	}

	private static void createWindowStationData(int startYear, int endYear) {
		// First let's skip past data that is before the start year the user asked for
		for(String station:stationData.keySet()) {
			windowStationData.put(station, new HashMap<String, ElementData>());
			System.out.println("processing "+station);
			totalMissingData.put(station, 0);
			for(String element:stationData.get(station).keySet()) {
				totalDays = 0;
				ElementData windowedElementData = new ElementData(station, element);
				windowStationData.get(station).put(element, windowedElementData);
				windowedElementData.setStartYear(startYear);
				windowedElementData.setStartMonth(1);
				windowedElementData.setEndYear(endYear);
				windowedElementData.setEndMonth(12);
				
				
				ElementData ed = stationData.get(station).get(element);
				Calendar cal = Calendar.getInstance();
				cal.set(Calendar.YEAR, ed.getStartYear());
				cal.set(Calendar.MONTH, ed.getStartMonth()-1);
				cal.set(Calendar.DAY_OF_MONTH, 1);
				if(ed.getStartYear() < startYear) {
					while(cal.get(Calendar.YEAR) < startYear) {
						ed.getNextValue(); // skip
						cal.add(Calendar.DAY_OF_MONTH, 1);
					}
				}

				// Pad with missing until the start date of the element data is reached
				cal.set(Calendar.YEAR, startYear);
				cal.set(Calendar.MONTH, 0);
				cal.set(Calendar.DAY_OF_MONTH, 1);

				while(cal.get(Calendar.YEAR) < ed.getStartYear() || 
						(cal.get(Calendar.YEAR) == ed.getStartYear() && cal.get(Calendar.MONTH)<ed.getStartMonth()-1)) {
					windowedElementData.addElementData(MISSING_DATA);
					cal.add(Calendar.DAY_OF_MONTH, 1);
					++totalDays;
					totalMissingData.put(station, totalMissingData.get(station)+1);
				}

				// Add elements until the end year is reached
				while(cal.get(Calendar.YEAR)<=endYear) {
					double nextVal = ed.getNextValue();
					if(nextVal == MISSING_DATA) totalMissingData.put(station, totalMissingData.get(station)+1);
					windowedElementData.addElementData(nextVal); // Will return MISSING if beyond the end date of the element data
					cal.add(Calendar.DAY_OF_MONTH, 1);
					++totalDays;
				}
			}
		}
	}

	/**
	 * Patch data
	 * 
	 * @param maxdist. When using nearby stations to patch data, this is the maximum distance considered. If stations are located beyond this, we do not use their data to patch another station.
	 */
	@SuppressWarnings("unused")
	private static void patchData(double maxDist) {
		System.out.println("Patching...");
		// Step 1. Figure out the averages and standard deviation for each day of the year for each station and element
		Map<String, Map<String, List<Double>>> averages = new HashMap<String, Map<String, List<Double>>>();
		Map<String, Map<String, List<Double>>> stddevs = new HashMap<String, Map<String, List<Double>>>();
		
		for(String station:windowStationData.keySet()) {
			averages.put(station, new HashMap<String, List<Double>>());
			stddevs.put(station, new HashMap<String, List<Double>>());
			for(String element:windowStationData.get(station).keySet()) {
				List<Double>localDayAverages = new ArrayList<Double>();
				List<Double>localDayStdDevs = new ArrayList<Double>();
				averages.get(station).put(element, localDayAverages);
				stddevs.get(station).put(element, localDayStdDevs);
				
				ElementData ed = windowStationData.get(station).get(element);
				List<Double> data = ed.getElementData();
				// We need to use a calendar to make sure shifts doesn't occur due to leap day.
				// Do only 365 days of averages. Patch using Feb 28 or March 1 for Feb 29 on leap years
				Calendar firstDayCalendar = Calendar.getInstance();
				firstDayCalendar.set(Calendar.YEAR, ed.getStartYear());
				firstDayCalendar.set(Calendar.MONTH, 0);
				firstDayCalendar.set(Calendar.DAY_OF_MONTH, 1);
				long startTimeMS = firstDayCalendar.getTime().getTime();
				for(int day=0;day<365;++day) {

					Calendar cal = Calendar.getInstance();
					cal.set(Calendar.YEAR, ed.getStartYear());
					cal.set(Calendar.DAY_OF_YEAR, day+1);
					
					
					double total = 0.0;
					ArrayList<Double>dataElements = new ArrayList<Double>();
					while(cal.get(Calendar.YEAR) < ed.getEndYear() || 
							(cal.get(Calendar.YEAR) == ed.getEndYear() && cal.get(Calendar.MONTH) < ed.getEndMonth())) {
						long currentTimeMS = cal.getTime().getTime();
						int dayIndex = (int)((currentTimeMS - startTimeMS)/(1000 * 60 * 60 * 24));
						double d = data.get(dayIndex);
						if(d!=MISSING_DATA) {
							total += d;
							dataElements.add(d);
						}
						cal.add(Calendar.YEAR, 1);
					}
					if(dataElements.size() > 1) {
						double mean = total/dataElements.size();
						localDayAverages.add(mean);
						// Compute std dev.
						double sumSq = 0;
						for(double d:dataElements) sumSq += Math.pow(d, 2);
						double sum = 0;
						for(double d:dataElements) sum += d;
						double n = dataElements.size();
						double std = Math.sqrt(sumSq/(n-1) - (n/(n-1))*Math.pow(sum/n, 2));
						localDayStdDevs.add(std);
						
					} else if(dataElements.size() == 1) {
						localDayAverages.add(total);
						localDayStdDevs.add(MISSING_DATA);
					} 
					else {
						localDayAverages.add(MISSING_DATA);
						localDayStdDevs.add(MISSING_DATA);
					}
				}
			}	
		}
		// Step 2. For temperature, when TMAX is missing patch with TMIN+average difference on the day for the region
		// Same when TMIN is missing. If both are missing, that's handled in step 3.
		for(String station:windowStationData.keySet()) {
			System.out.println("Patching min/max temp "+station);
			for(String element:windowStationData.get(station).keySet()) {
				if(!element.equals("TMAX") && !element.equals("TMIN"))
					continue;
				ElementData ed = windowStationData.get(station).get(element);
				List<Double> data = ed.getElementData();
				Calendar cal = Calendar.getInstance();
				cal.set(Calendar.YEAR, ed.getStartYear());
				cal.set(Calendar.MONTH, ed.getStartMonth()-1);
				cal.set(Calendar.DAY_OF_MONTH, 1);

				int dataIndex = 0;
				for(double d:data) {
					int day = cal.get(Calendar.DAY_OF_YEAR)-1; // 0-364/365(leap)
					if(day == 365) 
						day = 364; 
					if(d == MISSING_DATA) {
						List<Double>tmaxlist = averages.get(station).get("TMAX");
						if(tmaxlist == null) continue;
						double TMAXaverage = tmaxlist.get(day);
						List<Double>tminlist = averages.get(station).get("TMIN");
						if(tminlist == null) continue;
						double TMINaverage = tminlist.get(day);
						if(TMAXaverage == MISSING_DATA || TMINaverage == MISSING_DATA)
							continue;
						double avgTMaxTMinDiff = TMAXaverage - TMINaverage; 
						if(element.equals("TMAX")) {
							double tminOnSameDay = windowStationData.get(station).get("TMIN").getElementData().get(dataIndex);
							if(tminOnSameDay != MISSING_DATA)
								data.set(dataIndex, tminOnSameDay+avgTMaxTMinDiff);
						}
						if(element.equals("TMIN")) {
							double tmaxOnSameDay = windowStationData.get(station).get("TMAX").getElementData().get(dataIndex);
							if(tmaxOnSameDay != MISSING_DATA)
								data.set(dataIndex, tmaxOnSameDay-avgTMaxTMinDiff);
						}
					}
					cal.add(Calendar.DAY_OF_MONTH, 1);
					++dataIndex;
				}
			}
		}

		if(stationDist.size() == 0) return; // No distance information available, this is the best we can do patching the data.
		
		// Step 3. When a measurement is missing, find the closest geographically located station.
		for(String station:windowStationData.keySet()) {
			for(String element:windowStationData.get(station).keySet()) {
				ElementData ed = windowStationData.get(station).get(element);
				List<Double> data = ed.getElementData();
				Calendar cal = Calendar.getInstance();
				cal.set(Calendar.YEAR, ed.getStartYear());
				cal.set(Calendar.MONTH, ed.getStartMonth()-1);
				cal.set(Calendar.DAY_OF_MONTH, 1);

				int dataIndex = 0;
				for(double d:data) {
					int day = cal.get(Calendar.DAY_OF_YEAR)-1; // 0-364/365(leap)
					if(day == 365) 
						day = 364;
					 
					if(d == MISSING_DATA) {
						if(station.equals("TH000048568") && element.equals("PRCP") && dataIndex == 17550)
							System.out.println("check");
						double myMean = averages.get(station).get(element).get(day);
						double myStd = stddevs.get(station).get(element).get(day);
						if(myMean == MISSING_DATA || myStd == MISSING_DATA) {
							System.err.println("WARNING: Unable to patch "+element+" for station "+station+" on date "+new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime())+" with another station within "+maxDist+" km. I do not know the mean or the std of its measurement on this day");
							continue;
						}
						// Find the closest station with data that'sa also within the maximum distance allowed
						for(Double dist:stationDist.get(station).keySet()) {
							if(dist > maxDist) {
								System.err.println("WARNING: Unable to patch "+element+" for station "+station+" on date "+new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime())+" with another station within "+maxDist+" km. No station found or nearby stations are missing data.");
								break;
							}
							String otherStation = stationDist.get(station).get(dist);
							// Find the mean and std dev of the other station for this day of the year
							if(averages.get(otherStation) == null)
								continue;
							List<Double>mdata = averages.get(otherStation).get(element);
							if(mdata == null) continue;
							double mean = mdata.get(day);
							if(mean == MISSING_DATA) continue; // check the next closest station
							double std = stddevs.get(otherStation).get(element).get(day);
							if(std == MISSING_DATA) continue; // check the next closest station
							ElementData otherED = windowStationData.get(otherStation).get(element);
							double measurement = otherED.getElementData().get(dataIndex);
							if(measurement == MISSING_DATA) continue; // check the next closest station
							// Ok, we found a station with data and all the stats we need. 
							
							double patchMeasure=0.0; // the patched value.
							// The rule is, if we're checking for precipitation, if the nearby station had no rain, it's likely that this station also had no rain. Check for that first.
							if(element.equals("PRCP") && measurement == 0.0)
								patchMeasure = 0.0;
							else {
								// Ok, the nearby station had a measurement (rain, temperature etc.)
								// How many standard deviations from the mean is the measurement on this day?
								double offset = Math.abs(measurement-mean);
								double sign = Math.signum(measurement-mean);
								double numStdDevs = (std != 0.0)? (offset / std) : 0.0; // When there's no variation in measurements for the other station we can either skip to the next station or set the local measurement to the mean. Let's do the latter.
								// Now set the element value for the current station to the same offset from its mean and its standard deviation
								patchMeasure = myMean + sign*myStd*numStdDevs;
								if(element.equals("PRCP") && patchMeasure < 0.0) // It's possible that the close station drives the measurement negative for precip. If so, set to zero. 
									patchMeasure = 0.0;
							}
							data.set(dataIndex, patchMeasure);
							break;
						}
					}
					cal.add(Calendar.DAY_OF_MONTH, 1);
					++dataIndex;
				}
			}
		}
		
		// Step 4. Fill in what's missing with the mean values for the day (if available, otherwise leave it. Hopefully everything will be filled in.)
		
		
		for(String station:windowStationData.keySet()) {
			for(String element:windowStationData.get(station).keySet()) {
				ElementData ed = windowStationData.get(station).get(element);
				List<Double> data = ed.getElementData();
				Calendar cal = Calendar.getInstance();
				cal.set(Calendar.YEAR, ed.getStartYear());
				cal.set(Calendar.MONTH, ed.getStartMonth()-1);
				cal.set(Calendar.DAY_OF_MONTH, 1);

				
				int dataIndex = 0;
				for(double d:data) {
					int day = cal.get(Calendar.DAY_OF_YEAR)-1; // 0-364/365(leap)
					if(day == 365) 
						day = 364;
					
					if(d == MISSING_DATA) {
						if(station.equals("TH000048568") && element.equals("PRCP") && dataIndex == 17550)
							System.out.println("check");
						double myMean = averages.get(station).get(element).get(day);
						double myStd = stddevs.get(station).get(element).get(day);
						if(myMean == MISSING_DATA) {
							System.err.println("WARNING: Unable to patch "+element+" for station "+station+" on date "+new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime())+", I have no mean value!");
							continue;
						}
						
						data.set(dataIndex, myMean);
					}
					
					cal.add(Calendar.DAY_OF_MONTH, 1);
					++dataIndex;
				}
			}
		}
		
	}

	private static void outputResult(String f, int startYear, int endYear) throws Exception {
		System.out.println("Outputting results...");
		File folder = new File(f);

		if(!folder.exists())
			folder.mkdirs();

		Map<String, FileWriter> fileWriters= new HashMap<String, FileWriter>();

		TreeSet<String> sortedStations = new TreeSet<String>(windowStationData.keySet());
		for(String elem:ELEMENTS) {
			FileWriter fw = new FileWriter(f+File.separator+elem+"_"+startYear+"_"+endYear+".csv");
			fileWriters.put(elem, fw);
			fw.write("time");
			for(String id:sortedStations) fw.write(","+id);
			fw.write("\n");
		}

		for(String elm:ELEMENTS) {
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, startYear);
			cal.set(Calendar.MONTH, 0);
			cal.set(Calendar.DAY_OF_MONTH, 1);


			FileWriter fw = fileWriters.get(elm);

			while(cal.get(Calendar.YEAR) <= endYear) {

				SimpleDateFormat sdm = new SimpleDateFormat("yyyy-MM-dd");
				fw.write(sdm.format(cal.getTime())+",");

				int n=0;
				for(String stationId:sortedStations) {
					ElementData ed = windowStationData.get(stationId).get(elm);
					
					double d = MISSING_DATA;
					if(ed != null) d = ed.getNextValue();
					else totalMissingData.put(stationId, totalMissingData.get(stationId)+1);
					fw.write(""+d);
					if(n < sortedStations.size()-1) fw.write(",");
					++n;
				} // For each station
				fw.write("\n");
				cal.add(Calendar.DAY_OF_MONTH, 1);
			} // For each date
		} // For each element
		for(FileWriter fw:fileWriters.values()) {
			fw.flush();
			fw.close();
		}
	}

	private static void fillInMissingData(ElementData elementData, int ly,
			int lm, int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, ly);
		cal.set(Calendar.MONTH, lm-1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// We already have data for the last month, skip until next month
		cal.add(Calendar.MONTH, 1);

		int calYear = cal.get(Calendar.YEAR);
		int calMonth = cal.get(Calendar.MONTH)+1; // 0 - 11
		int n=0;
		while(calYear != year || calMonth != month) {
			elementData.addElementData(MISSING_DATA);
			cal.add(Calendar.DAY_OF_MONTH, 1);
			calYear = cal.get(Calendar.YEAR);
			calMonth = cal.get(Calendar.MONTH)+1; // 0 - 11
			++n;
		}
		System.err.println("  --> Filled in "+n+" days of missing data for "+elementData.getElement()+" between "+ly+"-"+lm+" and "+year+"-"+month);
	}

	/**
	 * 
	 * @author jhkauf
	 *
	 */
	public static class ElementData {
		private String station;
		private String element;

		private int startYear;
		private int startMonth;

		private int endYear;
		private int endMonth;

		private int currentPosition = 0;
		private List<Double> elementData = new ArrayList<Double>();

		public List<Double> getElementData() {
			return elementData;
		}

		public void setElementData(List<Double> elementData) {
			this.elementData = elementData;
		}

		public String getElement() {
			return element;
		}
		
		public String getStation() {
			return station;
		}

		public void setStation(String station) {
			this.station = station;
		}

		public int getStartYear() {
			return startYear;
		}

		public void setStartYear(int startYear) {
			this.startYear = startYear;
		}

		public int getStartMonth() {
			return startMonth;
		}

		public void setStartMonth(int startMonth) {
			this.startMonth = startMonth;
		}

		public int getEndYear() {
			return endYear;
		}

		public void setEndYear(int endYear) {
			this.endYear = endYear;
		}

		public int getEndMonth() {
			return endMonth;
		}

		public void setEndMonth(int endMonth) {
			this.endMonth = endMonth;
		}

		public void addElementData(double val) {
			elementData.add(val);
			Calendar c = dateChecks.get(element);
			if(c != null)
				c.add(Calendar.DAY_OF_MONTH, 1);
		}
		public double getNextValue() {
			if(currentPosition >= elementData.size()) {
				return MISSING_DATA; // If the user asks for more than available, return missing data
			}
			return elementData.get(currentPosition++);
		}
		public void resetPosition() {
			currentPosition = 0;
		}
		public ElementData(String stationId, String element) {
			station = stationId;
			this.element = element;
		}
	}
}
