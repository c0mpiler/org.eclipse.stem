/**
 * 
 */
package org.eclipse.stem.analysis.util;

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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.analysis.Activator;
import org.eclipse.stem.analysis.AnalysisFactory;
import org.eclipse.stem.analysis.DiseaseType;
import org.eclipse.stem.analysis.impl.AnalysisFactoryImpl;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.core.model.Decorator;


/**
 * Load logged STEM data
 *
 */

public class CSVscenarioLoader {

	
	private String directory="";//$NON-NLS-1$

	// These are the keys in the map
	public static final String S_TYPE = "S";//$NON-NLS-1$
	public static final String E_TYPE = "E";//$NON-NLS-1$
	public static final String I_TYPE = "I";//$NON-NLS-1$
	public static final String R_TYPE = "R";//$NON-NLS-1$
	public static final String INCIDENCE_TYPE = "Incidence";//$NON-NLS-1$
	
	// These are keys for population models
	public static final String COUNT_TYPE = "Count";//$NON-NLS-1$
	public static final String BIRTHS_TYPE = "Births";//$NON-NLS-1$
	public static final String DEATHS_TYPE = "Deaths";//$NON-NLS-1$
	
	public static final Set<String> S_KEY_SET = new HashSet<String>();
	public static final Set<String> E_KEY_SET = new HashSet<String>();
	public static final Set<String> I_KEY_SET = new HashSet<String>();
	public static final Set<String> R_KEY_SET = new HashSet<String>();
	
	public static final Set<String> COUNT_KEY_SET = new HashSet<String>();
	public static final Set<String> BIRTHS_KEY_SET = new HashSet<String>();
	public static final Set<String> DEATHS_KEY_SET = new HashSet<String>();
	
	public static final String UNKNOWN_POP_IDENTIFIER_KEY = "";
	
	/**
	 * 
	 */
	public static final Set<String> INCIDENCE_KEY_SET = new HashSet<String>();
	
	public static final String POP_COUNT_KEY = "Population Count";//$NON-NLS-1$
	
	public static final String PLATFORM = "platform:";//$NON-NLS-1$
	public static final String FILE = "file:";//$NON-NLS-1$
	public static final String ID_DISEASE_MODEL_EXTENSION_POINT = "org.eclipse.stem.diseasemodels.diseasemodel";
	public static final String ID_POPULATION_MODEL_EXTENSION_POINT = "org.eclipse.stem.populationodels.populationmodel";
	public static final String ID_CLASS = "class";
	public static final String CLASSDEF_ELEMENT = "classdef";
	public static final String DECORATOR_RUNPARAM_COLUMN_HEADER = "decorator";
	
	/**
	 * Error Messages
	 */
	public static final String IO_EXCEPTION_ERROR_MSG = "CVSscenarioLoader: IOException error!";//$NON-NLS-1$
	public static final String NO_FILE_MSG = "CVSscenarioLoader: Cannot find FILE: ";//$NON-NLS-1$
	public static final String NO_DIR_MSG = "CVSscenarioLoader: Cannot find DIRECTORY: ";//$NON-NLS-1$
	public static final String UNKNOWN_DISEASE_MSG = "CVSscenarioLoader: Disease type not recognized in directory: ";//$NON-NLS-1$
	public static final String FORMAT_ERR_MSG = "CVSscenarioLoader: Mismatch between columns and values in run parameter file: ";//$NON-NLS-1$
	public static final String POPULATION_NOT_FOUND = "Population not found: ";//$NON-NLS-1$
	private static final String CSV_EXTENSION = ".csv";//$NON-NLS-1$

	// Key in the map is the population identifier and the value is the list of .csv files with data
	protected Map<String, List<File>> csvDataFiles = new HashMap<String, List<File>>();
	
	private final Map<String, String> runParameters = new HashMap<String, String>();

	private Decorator decorator = null;
	
	private List<String> populationIdentifiers;
	
	

	/**
	 * Name of all run parameter files (one per disease folder
	 */
	public static final String RUN_PARAMETER_FILE_NAME = "runparameters.csv";//$NON-NLS-1$
	public static final String RUN_PARAMETER_FILE_NAME_OLD = "runparamters.csv";//$NON-NLS-1$
	public static final String DECORATOR_FILE_NAME = "decorator.XMI";//$NON-NLS-1$
	
	private AnalysisFactory aFactory = new AnalysisFactoryImpl();

	/**
	 * This class loads data from a folder containing a saved scenario run data for
	 * a particular disease instance
	 * The data in the folder is a set of csv files, one per disease state
	 * 
	 * @param diseaseDirectory Directory containing disease data 
	 * @throws ScenarioInitializationException
	 */
	public CSVscenarioLoader(String diseaseDirectory) throws LogInitializationException {
		clear();
		directory = diseaseDirectory;
		csvDataFiles = this.getDataFiles();
	}

	/**
	 * Empty constructor used when parsing a single file, e.g. an aggregate file
	 */
	public CSVscenarioLoader() {
		clear();
	}


	public static void clear() {
		S_KEY_SET.clear();
		E_KEY_SET.clear();
		I_KEY_SET.clear();
		R_KEY_SET.clear();
		INCIDENCE_KEY_SET.clear();
		
		BIRTHS_KEY_SET.clear();
		DEATHS_KEY_SET.clear();
		COUNT_KEY_SET.clear();
		
	}
	
	/**
	 * read all the data files in a scenario folder
	 * filter to return just the csv files with data
	 * 
	 * @return  Map<String, List<File>>  Map with population identifier key and list of data files
	 */
	
	private Map<String, List<File>> getDataFiles() throws LogInitializationException {
		Map<String, List<File>> dataFileMap = new HashMap<String, List<File>>();
		File[] files;
		URL fURL=null;
		File dir = null;
	 
		if(directory.startsWith(PLATFORM) || directory.startsWith(FILE)) {
			try {
				URL inURL = new URL(directory);
				fURL = FileLocator.toFileURL(inURL);
			} catch(Exception mue) {
				mue.printStackTrace();
			}
			dir = new File(fURL.getFile());
		} else dir = new File(directory);
		
		if(dir.exists()&&dir.isDirectory()) {
			files = dir.listFiles();
		} else throw new LogInitializationException(NO_FILE_MSG+dir);

		for (int i = 0; i < files.length; i ++)  {
			File f = files[i];
			if(f.isHidden()) 
				continue;
			if (this.isDataFile(f)) {
				if(dataFileMap.get(UNKNOWN_POP_IDENTIFIER_KEY) == null)
					dataFileMap.put(UNKNOWN_POP_IDENTIFIER_KEY, new ArrayList<File>());
				dataFileMap.get(UNKNOWN_POP_IDENTIFIER_KEY).add(f);
			}
			else if (this.isRunParameterFile(f)) readRunParameters(f);
			else if (this.isDecoratorFile(f)) readDecoratorFile(f);
			else if (f.isDirectory()) {
				String pop_id = f.getName();
				List<File> dataFiles = getDataFilesForPopulation(f);
				if(populationIdentifiers == null) populationIdentifiers = new ArrayList<String>();
				populationIdentifiers.add(pop_id);
				dataFileMap.put(pop_id, dataFiles);
				
			}
		}
		if(dataFileMap.size() == 0) throw new LogInitializationException(NO_DIR_MSG+directory);

		return dataFileMap;
	}// getDataFiles
	
	private List<File> getDataFilesForPopulation(File dir) throws LogInitializationException {
		ArrayList<File> result = new ArrayList<File>();
		File [] files = dir.listFiles();
		for (int i = 0; i < files.length; i ++)  {
			File f = files[i];
			if (this.isDataFile(f)) {
				result.add(f);
			}
		}
		if(result.size() == 0)
			throw new LogInitializationException(NO_DIR_MSG+dir);
		return result;
	}

	/**
	 * 
	 * @param directory
	 * @return true is a data directory exists
	 */
	public static boolean validate(String directory) {
		File file = new File(directory);
		return file.exists();
	}

	/**
	 * test file name to see if it is a data file. Must have extension .txt or .csv
	 * must not be the runparameters summary file.
	 * @param file
	 * @return true if data file
	 */
	private boolean isDataFile(File file) {
		boolean retVal = true;
		String name = file.getName();
		if(name.indexOf(RUN_PARAMETER_FILE_NAME)>= 0 || name.indexOf(RUN_PARAMETER_FILE_NAME_OLD) >= 0) retVal = false;
		if(name.indexOf(CSV_EXTENSION) < 0) retVal = false;
		return retVal;
	}
	/**
	 * test file name to see if it is the RunParamtersFile
	 * @param file
	 * @return true if data file
	 */
	private boolean isRunParameterFile(File file) {
		boolean retVal = false;
		String name = file.getName();
		if(name.indexOf(RUN_PARAMETER_FILE_NAME)>= 0 || name.indexOf(RUN_PARAMETER_FILE_NAME_OLD)>= 0) retVal = true;
		return retVal;
	}
	
	/**
	 * test file name to see if it is the serialized EMF decorator
	 * @param file
	 * @return true if data file
	 */
	
	private boolean isDecoratorFile(File file) {
		boolean retVal = false;
		String name = file.getName();
		if(name.indexOf(DECORATOR_FILE_NAME)>= 0) retVal = true;
		return retVal;
	}

	/**
	 * read the run parameters file created when running an Experiment
	 * @param file
	 */
	private void readRunParameters(File file) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));

			if (reader != null) {
				String buffer = null;
				int line = 0;
				String [] headerTokens = null;
				String [] valueTokens = null;
				
				while (EOF(buffer = reader.readLine()) != true) {
					if(line == 0) headerTokens = buffer.split(",");
					else valueTokens = buffer.split(",");
					++line;
				}

				if(valueTokens.length != headerTokens.length) {
					Activator.logError(FORMAT_ERR_MSG, new Exception());
					return;
				}
				for(int i=0;i<valueTokens.length;++i)
					runParameters.put(headerTokens[i],valueTokens[i]);
			}
			
			// Discover the decorator from the run parameters
			// NOT USED SINCE THE SERIALIZED decorator EMF is stored now
			/*String decoratorClassName = runParameters.get(DECORATOR_RUNPARAM_COLUMN_HEADER);
			Decorator dec = null;
			if(decoratorClassName != null) {
				final IExtensionRegistry registry = Platform.getExtensionRegistry();
				IConfigurationElement[] configElements = registry.getConfigurationElementsFor(ID_DISEASE_MODEL_EXTENSION_POINT);

				for (int i = 0; i < configElements.length; i++) {
					final IConfigurationElement element = configElements[i];
					
					
					if (element.getName().equals(CLASSDEF_ELEMENT)) {
						// Yes
						dec = (Decorator) element.createExecutableExtension(ID_CLASS);
						if(dec.getClass().getName().equals(decoratorClassName))
							break;
					} // if
				} // for each configuration element
				
				if(dec == null) {
					// Okay, let's see if it's a population model
					configElements = registry.getConfigurationElementsFor(ID_POPULATION_MODEL_EXTENSION_POINT);
					for (int i = 0; i < configElements.length; i++) {
						final IConfigurationElement element = configElements[i];
						
						if (element.getName().equals(CLASSDEF_ELEMENT)) {
							// Yes
							dec = (Decorator) element.createExecutableExtension(ID_CLASS);
							if(dec.getClass().getName().equals(decoratorClassName))
								break;
						} // if
					} // for each configuration element
				}
			}
			this.setDecorator(dec);
			*/
			
		} catch (FileNotFoundException fnfe) {
			Activator
			.logError(NO_FILE_MSG,fnfe);
		} catch (IOException ioe) {
			Activator.logError(IO_EXCEPTION_ERROR_MSG, ioe);
//		} catch(CoreException ce) {
//			Activator.logError(ce.getMessage(), ce); //$NON-NLS-1$
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
			}
		}
	}// readRunParameters
	
	/**
	 * read the run parameters file created when running an Experiment
	 * @param file
	 */
	private void readDecoratorFile(File file) {
		URI readURI = URI.createFileURI(file.getAbsolutePath());
		setDecorator((Decorator)Utility.getIdentifiable(readURI));
	}
	
	public Decorator getDecorator() {
		return decorator;
	}

	public void setDecorator(Decorator decorator) {
		this.decorator = decorator;
	}

	public List<String> getPopulationIdentifiers() {
	   return populationIdentifiers;
	}

	
	/**
	 * from the discovered keys return the disease type or population type
	 * @return
	 */
	public static DiseaseType getDiseaseType() {
		DiseaseType type;
		if( (S_KEY_SET.size()>=1)&&(E_KEY_SET.size()>=1)&&(I_KEY_SET.size()>=1)&&(R_KEY_SET.size()>=1) )
			type = DiseaseType.SEIR;
		else  if( (S_KEY_SET.size()>=1)&&(I_KEY_SET.size()>=1)&&(R_KEY_SET.size()>=1) )
			type = DiseaseType.SIR;
		else  if( (S_KEY_SET.size()>=1)&&(I_KEY_SET.size()>=1) )
			type = DiseaseType.SI;
		else if ((BIRTHS_KEY_SET.size() >=1) &&(DEATHS_KEY_SET.size()>=1&&COUNT_KEY_SET.size()>=1))
			type = DiseaseType.STANDARD_POPULATION;
		else type = DiseaseType.OTHER;
		
		return type;
	}
	
	/**
	 * 
	 * @param state
	 */
	public static void registerKey(String state) {

		if(state.indexOf(INCIDENCE_TYPE)>=0){
			INCIDENCE_KEY_SET.add(state);
			return;
		}
		
		// discovered a state
		if(state.startsWith(BIRTHS_TYPE)) BIRTHS_KEY_SET.add(state);
		else if(state.startsWith(DEATHS_TYPE)) DEATHS_KEY_SET.add(state);
		else if(state.startsWith(COUNT_TYPE)) COUNT_KEY_SET.add(state);
		else if(state.startsWith(S_TYPE)) S_KEY_SET.add(state);
		else if(state.startsWith(E_TYPE)) E_KEY_SET.add(state);
		else if(state.startsWith(I_TYPE)) I_KEY_SET.add(state);
		else if(state.startsWith(R_TYPE)) R_KEY_SET.add(state);
	}

	/**
	 * A single Reference Scenario is stored in a map
	 * for each  key<String> = Region id
	 * the Map contains a Map of data per region.
	 * The region data map is keyed by property (S,E, I, R, etc) and contains Data (mostly Doubles but
	 * STEMTime is stored as a String) so all data is stored as String.
	 * @param filterSet 
	 * @param population id. The population ID, or UNKNOWN_POP_IDENTIFIER_KEY if not known
	 * @param resolution Which map resolution to load, -1 if all
	 * @return the ReferenceScenarioDataMap object
	 * @throws ScenarioInitializationException 
	 */

	public ReferenceScenarioDataMapImpl parseAllFiles(Set<String> filterSet, String populationId, int resolution) throws LogInitializationException {
		ReferenceScenarioDataMapImpl scenarioDataMap = (ReferenceScenarioDataMapImpl)aFactory.createReferenceScenarioDataMap();
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
			processAndFilterFiles(filterSet, scenarioDataMap, state, f);
		}
		scenarioDataMap.setReferenceDirectory(directory);
		scenarioDataMap.setPopulationIdentifier(populationId);
		DiseaseType type = getDiseaseType();
			
		scenarioDataMap.setType(type,S_KEY_SET,E_KEY_SET,I_KEY_SET,R_KEY_SET,INCIDENCE_KEY_SET);
		
		return scenarioDataMap;
	}

	/**
	 * A single Reference Scenario is stored in a map
	 * for each  key<String> = Region id
	 * the Map contains a Map of data per region.
	 * The region data map is keyed by property (S,E, I, R, etc) and contains Data (mostly Doubles but
	 * STEMTime is stored as a String) so all data is stored as String.
	 * 
	 * @param populationIdentifier The population identifier
	 * @param resolution Which map resolution to load, -1 if all
	 * @return the ReferenceScenarioDataMap object
	 * @throws ScenarioInitializationException 
	 */

	public ReferenceScenarioDataMapImpl parseAllFiles(String populationId, int resolution) throws LogInitializationException {
		ReferenceScenarioDataMapImpl scenarioDataMap = (ReferenceScenarioDataMapImpl)aFactory.createReferenceScenarioDataMap();
		if(!csvDataFiles.containsKey(populationId))
			throw new LogInitializationException(POPULATION_NOT_FOUND+populationId);
		
		ArrayList<String>states = new ArrayList<String>(); // keeps track of the states seen 
		List<File>fileList = csvDataFiles.get(populationId);
		for(int i = 0; i < fileList.size(); i ++) {
			File f = fileList.get(i);
			String name = f.getName();

			if(name.startsWith(".")) continue; //$NON-NLS-1$ //skip system files
			int _idx = name.lastIndexOf('_');
			int dotidx = name.lastIndexOf('.');
			if(_idx <0 || dotidx < 0 || dotidx < _idx) continue; // not a data file
			String state = name.substring(0, _idx);
			if(!states.contains(state)) states.add(state);
			
			// discovered a state
			registerKey(state);
			
			int res = Integer.parseInt(name.substring(_idx+1, dotidx));
			if(resolution != -1 && res != resolution) continue; // wrong resolution
			processFile(scenarioDataMap, state, f);
		}
		scenarioDataMap.setReferenceDirectory(directory);
		scenarioDataMap.setPopulationIdentifier(populationId);
		DiseaseType type = getDiseaseType();
		
		scenarioDataMap.setType(type,S_KEY_SET,E_KEY_SET,I_KEY_SET,R_KEY_SET,INCIDENCE_KEY_SET);
		
		return scenarioDataMap;
	}

	/**
	 * Read scenario for all resolutions available
	 * 
	 * @return ReferenceScenarioDataMap Map with all nodes loaded
	 * @throws ScenarioInitializationException
	 */

	public ReferenceScenarioDataMapImpl parseAllFiles() throws LogInitializationException {
		return this.parseAllFiles("", -1);
	}

	/**
	 * Return the type of the logged data.
	 * 
	 * @param populationId The population identifier
	 * @return ParameterEstimator.Type The type of the data
	 * @throws ScenarioInitializationException If the type is not recognized
	 */

	public DiseaseType getType(String populationId) throws LogInitializationException {
		ArrayList<String>states = new ArrayList<String>(); // keeps track of the states seen 
		if(!csvDataFiles.containsKey(populationId))
			throw new LogInitializationException(POPULATION_NOT_FOUND+populationId);
		 
		List<File>fileList = csvDataFiles.get(populationId);
		for(int i = 0; i < fileList.size(); i ++) {
			File f = fileList.get(i);
			String name = f.getName();
			int _idx = name.lastIndexOf('_');
			int dotidx = name.lastIndexOf('.');
			if(_idx <0 || dotidx < 0 || dotidx < _idx) continue; // not a data file
			String state = name.substring(0, _idx);
			if(!states.contains(state)) states.add(state);

			// discovered a state
			registerKey(state);
			
		}

		DiseaseType type = getDiseaseType();

		return type;
	}

	

	/**
	 * Retrieve resolutions available in the disease folder
	 * 
	 * @param populationId Population identifier
	 * @return ArrayList<Integer> Available resolutions
	 */

	public int getMaxResolution(String populationId) {
		int result = -1;
		List<File>fileList = csvDataFiles.get(populationId);
		if(fileList == null) return result;
		for(int i = 0; i < fileList.size(); i ++) {
			File f = fileList.get(i);
			String name = f.getName();
			int _idx = name.lastIndexOf('_');
			int dotidx = name.lastIndexOf('.');
			if(_idx <0 || dotidx < 0 || dotidx < _idx) continue; // not a data file
			int res = Integer.parseInt(name.substring(_idx+1, dotidx));
			if(result < res) result = res;

		}
		return result;
	}

	/**
	 * process the input file
	 * 
	 * @param dataMap Map to store file inside
	 * @param state The state
	 * @param file
	 * 
	 * @throws ScenarioInitializationException 
	 */

	public void processFile(ReferenceScenarioDataMapImpl dataMap, String state, File file) throws LogInitializationException {
		BufferedReader reader = null;
		try {
			String record;  
			String header;
			// int recCount = 0;
			List<String> headerElements = new ArrayList<String>();
			reader = new BufferedReader(new FileReader(file));

			//
			// Read the file header (iter, time, locations...)
			//
			if ( (header=reader.readLine()) != null ) { 

				StringTokenizer st = new StringTokenizer(header, ",");//$NON-NLS-1$

				while (st.hasMoreTokens()) {
					String val = st.nextToken().trim();
					headerElements.add(val);
				}
			} // read the header
			/////////////////////

			// set up the empty lists
			int numColumns = headerElements.size();
			for (int i = 0; i < numColumns; i ++) {
				String key = headerElements.get(i);
				if(key.equals(ReferenceScenarioDataMapImpl.ITERATION_KEY) ||
						key.equals(ReferenceScenarioDataMapImpl.TIME_KEY))
					continue;
				Map<String, List<String>> data;
				ReferenceScenarioDataInstance result = null;
				if(!dataMap.containsLocation(key)) {
					data = new HashMap<String, List<String>>();
					result = dataMap.new ReferenceScenarioDataInstance(data, dataMap);
					dataMap.addInstance(key, result); // Add new location to 
				} else {
					result = dataMap.getLocation(key);
					data = result.getInstance();
				}
				data.put(state, new ArrayList<String>()); // Add the new state
			}

			//////////////////////
			// Read the data
			//
			while ( (record=reader.readLine()) != null ) { 
				// recCount++; 

				StringTokenizer st = new StringTokenizer(record,",");//$NON-NLS-1$
				int tcount = 0;
				while (st.hasMoreTokens() && tcount < headerElements.size() ) {// just to make sure
					String val = st.nextToken();
					String key = headerElements.get(tcount);
					if(key.equals(ReferenceScenarioDataMapImpl.ITERATION_KEY) ||
							key.equals(ReferenceScenarioDataMapImpl.TIME_KEY))
					{++tcount;continue;}
					ReferenceScenarioDataInstance result = dataMap.getLocation(key);
					Map<String, List<String>>data = result.getInstance();
					data.get(state).add(val.trim());
					tcount ++;
				}
			} // while file has data
		} catch (IOException e) { 
			// catch io errors from FileInputStream or readLine()
			Activator.logError(IO_EXCEPTION_ERROR_MSG, e);
			throw new LogInitializationException(e);
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
			}
		}
	}

	/**
	 * process the input file
	 * 
	 * @param populationId Population identifier
	 * @param resolution 
	 * 
	 * @return set of locations in a file
	 * 
	 * @throws ScenarioInitializationException 
	 */
	
	public Set<String> getLocations(String populationId, int resolution) throws LogInitializationException {
		Set<String> locations = new HashSet<String>();
		ArrayList<String>states = new ArrayList<String>(); // keeps track of the states seen 

		if(!csvDataFiles.containsKey(populationId))
			throw new LogInitializationException(POPULATION_NOT_FOUND+populationId);
		 
		List<File>fileList = csvDataFiles.get(populationId);
	
		for(int i = 0; i < fileList.size(); i ++) {
			File file = fileList.get(i);
			String name = file.getName();
			int _idx = name.lastIndexOf('_');
			int dotidx = name.lastIndexOf('.');
			if(_idx <0 || dotidx < 0 || dotidx < _idx) continue; // not a data file
			String state = name.substring(0, _idx);
			if(!states.contains(state)) states.add(state);
			int res = Integer.parseInt(name.substring(_idx+1, dotidx));
			if(resolution != -1 && res != resolution) continue; // wrong resolution
			
			BufferedReader reader = null;
			try {  
				String header;
				List<String> headerElements = new ArrayList<String>();
				reader = new BufferedReader(new FileReader(file));
				// Read the file header (iter, time, locations...)
				//
				if ( (header= reader.readLine()) != null ) { 
					StringTokenizer st = new StringTokenizer(header, ",");//$NON-NLS-1$
					while (st.hasMoreTokens()) {
						String val = st.nextToken().trim();
						headerElements.add(val);
					}
				} // read the header
				///////////////////// 
				// set up the empty lists
				int numColumns = headerElements.size();
				for (int ii = 0; ii < numColumns; ii ++) {
					String key = headerElements.get(ii);
					if(!((key.equals(ReferenceScenarioDataMapImpl.ITERATION_KEY) ||	key.equals(ReferenceScenarioDataMapImpl.TIME_KEY)))) {
						locations.add(key);
					}
				} // while file has data
			} catch (IOException e) { 
				// catch io errors from FileInputStream or readLine()
				Activator.logError(IO_EXCEPTION_ERROR_MSG, e);
				throw new LogInitializationException(e);
			} finally {
				try {
					reader.close();
				} catch (Exception e) {
					
				}
			}
		}

		return locations;
	}


	/**
	 * process the input file
	 * @param locationFilter 
	 * 
	 * @param dataMap Map to store file inside
	 * @param state The state
	 * @param file
	 * 
	 * @throws ScenarioInitializationException 
	 */
	public void processAndFilterFiles(Set<String>locationFilter, ReferenceScenarioDataMapImpl dataMap, String state, File file) throws LogInitializationException {
		
		BufferedReader reader = null;
		try {
			String record;  
			String header;
			// int recCount = 0;
			List<String> headerElements = new ArrayList<String>();

			reader = new BufferedReader(new FileReader(file));

			//
			// Read the file header (iter, time, locations...)
			//
			if ( (header=reader.readLine()) != null ) { 

				StringTokenizer st = new StringTokenizer(header, ",");//$NON-NLS-1$

				while (st.hasMoreTokens()) {
					String val = st.nextToken().trim();
					headerElements.add(val);
				}
			} // read the header
			/////////////////////

			// set up the empty lists
			int numColumns = headerElements.size();
			for (int i = 0; i < numColumns; i ++) {
				String key = headerElements.get(i);
				// if filter is null just don't filter
				if(locationFilter==null || locationFilter.contains(key)) {
					if(key.equals(ReferenceScenarioDataMapImpl.ITERATION_KEY) ||
							key.equals(ReferenceScenarioDataMapImpl.TIME_KEY))
						continue;
					Map<String, List<String>> data;
					ReferenceScenarioDataInstance result = null;
					if(!dataMap.containsLocation(key)) {
						data = new HashMap<String, List<String>>();
						result = dataMap.new ReferenceScenarioDataInstance(data, dataMap);
						dataMap.addInstance(key, result); // Add new location to 
					} else {
						result = dataMap.getLocation(key);
						data = result.getInstance();
					}
					data.put(state, new ArrayList<String>()); // Add the new state
				}
			}

			//////////////////////
			// Read the data
			//
			while ( (record=reader.readLine()) != null ) { 
				// recCount++; 

				StringTokenizer st = new StringTokenizer(record,",");//$NON-NLS-1$
				int tcount = 0;
				while (st.hasMoreTokens() && tcount < headerElements.size() ) {// just to make sure
					String val = st.nextToken();
					String key = headerElements.get(tcount);
					// if filter is null just don't filter
					if(locationFilter==null || locationFilter.contains(key)) {
						if(key.equals(ReferenceScenarioDataMapImpl.ITERATION_KEY) ||
								key.equals(ReferenceScenarioDataMapImpl.TIME_KEY))
						{++tcount;continue;}
						ReferenceScenarioDataInstance result = dataMap.getLocation(key);
						Map<String, List<String>>data = result.getInstance();
						data.get(state).add(val.trim());
					}
					tcount ++;
				}
			} // while file has data
		} catch (IOException e) { 
			// catch io errors from FileInputStream or readLine()
			Activator.logError(IO_EXCEPTION_ERROR_MSG, e);
			throw new LogInitializationException(e);
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
			}
		}
	}// processAndFilterFiles

	/**
	 * Parse a single aggregate data file
	 * 
	 * @param file File to parse
	 * @return the ReferenceScenarioDataMap object
	 * @throws ScenarioInitializationException 
	 */
	public ReferenceScenarioDataMapImpl parseAggregateFile(String file) throws LogInitializationException {
		ReferenceScenarioDataMapImpl scenarioDataMap = (ReferenceScenarioDataMapImpl)aFactory.createReferenceScenarioDataMap();
		File f = new File(file);
		String name = f.getName();  // Disease name
		int idx = name.indexOf(".");//$NON-NLS-1$
		String id = name.substring(0,idx);

		HashMap<String, List<String>> data = new HashMap<String,List<String>>();
		BufferedReader reader = null;
		try {
			String record;  
			String header;
			// int recCount = 0;
			List<String> headerElements = new ArrayList<String>();
			reader = new BufferedReader(new FileReader(file));

			//
			// Read the file header
			//
			if ( (header=reader.readLine()) != null ) { 

				StringTokenizer st = new StringTokenizer(header );

				while (st.hasMoreTokens()) {
					String val = st.nextToken(",");//$NON-NLS-1$
					headerElements.add(val.trim());
				}
			} // read the header
			/////////////////////

			// set up the empty lists
			int numColumns = headerElements.size();
			for (int i = 0; i < numColumns; i ++) {
				String key = headerElements.get(i);
				data.put(key, new ArrayList<String>());
			}

			//////////////////////
			// Read the data
			//
			while ( (record=reader.readLine()) != null ) { 
				// recCount++; 

				StringTokenizer st = new StringTokenizer(record );
				int tcount = 0;
				while (st.hasMoreTokens()) {
					String val = st.nextToken(",");//$NON-NLS-1$
					String key = headerElements.get(tcount);
					(data.get(key)).add(val.trim());
					tcount ++;
				}
			} // while file has data
		} catch (IOException e) { 
			// catch io errors from FileInputStream or readLine()
			Activator.logError(IO_EXCEPTION_ERROR_MSG, e);
			throw new LogInitializationException(e);
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				
			}
		}

		scenarioDataMap.addInstance(
				id,   
				scenarioDataMap.new ReferenceScenarioDataInstance(data, scenarioDataMap));
		return scenarioDataMap;
	}
	/**
	 * process an incidence file
	 * An incidence file does not contain SI data so it can not return 
	 * a ReferenceScenarioDataInstance (it is not used to estimate parameters).
	 * Instead this method returns the raw data in a map
	 * 
	 * @param fileName
	 * @return a map of scenario data keyed by location ID
	 * @throws ScenarioInitializationException 
	 */
	public Map<String, List<String>> processIncidenceFile(String fileName) throws LogInitializationException {
		File file = new File(fileName);
		HashMap<String, List<String>> data = new HashMap<String,List<String>>();

		BufferedReader reader = null;
		try {
			String record;  
			String header;
			// int recCount = 0;
			List<String> headerElements = new ArrayList<String>();
			reader = new BufferedReader(new FileReader(file));

			//
			// Read the file header
			//
			if ( (header=reader.readLine()) != null ) { 

				StringTokenizer st = new StringTokenizer(header );

				while (st.hasMoreTokens()) {
					String val = st.nextToken(",");//$NON-NLS-1$
					headerElements.add(val.trim());
				}
			} // read the header
			/////////////////////

			// set up the empty lists
			int numColumns = headerElements.size();
			for (int i = 0; i < numColumns; i ++) {
				String key = headerElements.get(i);
				data.put(key, new ArrayList<String>());
			}

			// Here we check the type of the data file
			// by checking the header elements




			//////////////////////
			// Read the data
			//
			while ( (record=reader.readLine()) != null ) { 
				// recCount++; 

				StringTokenizer st = new StringTokenizer(record );
				int tcount = 0;
				while (st.hasMoreTokens()) {
					String val = st.nextToken(",");//$NON-NLS-1$
					String key = headerElements.get(tcount);
					(data.get(key)).add(val.trim());
					tcount ++;
				}
			} // while file has data
		} catch (IOException e) { 
			// catch io errors from FileInputStream or readLine()
			Activator.logError(IO_EXCEPTION_ERROR_MSG, e);
			throw new LogInitializationException(e);
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
			}
		}
		return data;
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
		if (buffer == null || buffer.length() == 0)
			return true;
		return false;
	}

	/**
	 * Return the run parameters
	 * 
	 * @return Map<String, String> The run parameters
	 */

	public Map<String, String> getRunParameters() {
		return runParameters;
	}
	
	public static Set<String> getsKeySet() {
		return S_KEY_SET;
	}

	public static Set<String> geteKeySet() {
		return E_KEY_SET;
	}

	public static Set<String> getiKeySet() {
		return I_KEY_SET;
	}

	public static Set<String> getrKeySet() {
		return R_KEY_SET;
	}
	
	public static Set<String> getIncidenceKeySet() {
		return INCIDENCE_KEY_SET;
	}

}
