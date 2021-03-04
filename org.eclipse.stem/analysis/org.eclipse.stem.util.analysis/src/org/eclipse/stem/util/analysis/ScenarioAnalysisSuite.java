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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.stem.analysis.ErrorFunction;
import org.eclipse.stem.analysis.ErrorResult;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;
import org.eclipse.stem.analysis.util.CSVscenarioLoader;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.util.analysis.views.AnalysisControl;
import org.eclipse.stem.util.analysis.views.EstimatorControl;
import org.eclipse.stem.util.analysis.views.Messages;
import org.eclipse.swt.widgets.TaskBar;

/**
 * Analyzes a {@link Scenario} and compares scenarios
 */
public class ScenarioAnalysisSuite {
	/**
	 * For testing
	 */
	public static final String REFERENCE_ROOT_DIRECTORY = AggregateDataWriter.ANALYSISFOLDER;

	/**
	 * Where we start looking for recorded scenario files
	 */
	public static String REFERENCE_TESTING_DIRECTORY = REFERENCE_ROOT_DIRECTORY;

	/**
	 * Set to an actual folder below (if found)
	 */
	public static String REFERENCE_TESTING_AGGREGATE_FILE = REFERENCE_ROOT_DIRECTORY+File.separator+AggregateDataWriter.AGGREGATE_FOLDERNAME+File.separator+"aggregate.csv";
	
	private static String DEFAULT_AGGREGATE_FILENAME = "aggregate";
	
	private static String COMPARISON_FILE_NAME = "RMSComparisonResults";
		
	/**
	 * Message if directory not found
	 */
	public static final String NOT_FOUND_MSG = Messages.getString("COMMON.NOTFOUND");
	
	/**
	 * Message if data not valid
	 */
	public static final String INVALID_DATA_MSG = Messages.getString("COMMON.NOTDATA");
	
	/**
	 * Message if done
	 */
	public static final String DONE_MSG = Messages.getString("COMMON.DONE");
	
	/**
	 * Message if Ready
	 */
	public static final String READY_MSG = Messages.getString("COMMON.READY");
	
	/**
	 * Message if Working
	 */
	public static final String WORKING_MSG = Messages.getString("COMMON.WORKING");
	
	
	/**
	 * Contains all reference scenario data
	 */
	ReferenceScenarioDataMapImpl referenceScenarioDataMap = null;
	
	/**
	 * Contains all reference scenario data (for comparison)
	 */
	ReferenceScenarioDataMapImpl comparisonScenarioDataMap = null;
	
	/** 
	 * the Estimator instance
	 */
	ScenarioParameterEstimator estimator = null;
	
	AnalysisControl control = null;
	
	
	/**
	 * @param ctrl 
	 * 
	 */
	public ScenarioAnalysisSuite(AnalysisControl ctrl) {
		control = ctrl;
		// Nothing
	}

	/**
	 * Aggregate data
	 * 
	 * @param folder Scenario folder
	 * @param runnableContext Runnable context
	 * @param alpha the Immunity Loss Rate. This is needed to compute the incidence
	 * @return String[] filename where filename[0] = aggregate data file and filename[1] = incidence data file
	 * @throws LogInitializationException Thrown if problem reading data
	 */
	
	public String aggregateData(String folder, IRunnableContext runnableContext, double alpha) throws LogInitializationException{	
		CSVscenarioLoader loader = new CSVscenarioLoader(folder);
		int maxResolution = loader.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);
        ReferenceScenarioDataMapImpl map = loader.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, maxResolution);
        String aggregateFileName = getAggregateFileName(folder);
        ReferenceScenarioDataInstance aggregatedData = map.aggregateScenarioData(runnableContext);
        AggregateDataWriter writer = new AggregateDataWriter(folder, aggregateFileName);
     
		return writer.logDataInstance(aggregatedData, alpha);
	}
	
	
	/**
	 * Aggregate data but filter the locations that get aggregate to match the locations
	 * in the referenceFolder
	 * @param referenceFolder 
	 * @param folder Scenario folder
	 * @param runnableContext Runnable context
	 * @param alpha the Immunity Loss Rate. This is needed to compute the incidence
	 * @return String[] filename where filename[0] = aggregate data file and filename[1] = incidence data file
	 * @throws LogInitializationException Thrown if problem reading data
	 */
	
	public String aggregateByFilter(String referenceFolder, String folder, IRunnableContext runnableContext, double alpha) throws LogInitializationException{			
		CSVscenarioLoader refLoader = new CSVscenarioLoader(referenceFolder);
		int maxRes = refLoader.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);
		Set<String> locationsToAggregate = refLoader.getLocations(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, maxRes);	
		CSVscenarioLoader loader = new CSVscenarioLoader(folder);
		int maxResolution = loader.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);
        ReferenceScenarioDataMapImpl map = loader.parseAllFiles(locationsToAggregate, CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, maxResolution);
        String aggregateFileName = getAggregateFileName(folder);
        ReferenceScenarioDataInstance aggregatedData = map.aggregateScenarioData(runnableContext);
        AggregateDataWriter writer = new AggregateDataWriter(folder, aggregateFileName);
          
		return writer.logDataInstance(aggregatedData, alpha);
	}
	
	/**
	 * Estimates the model parameters for scenario data located in the referenceDirectory
	 * @param dataMap Data
	 * @param parameterEstimatorMethod Which method do we use to estimate
	 * @param runnableContext Context used for long running tasks
	 * @return a set of fitted model parameters
	 */
	public ModelParameters estimateParameters(ReferenceScenarioDataMapImpl dataMap, ParameterEstimatorMethod parameterEstimatorMethod, IRunnableContext runnableContext) {	
			this.referenceScenarioDataMap = dataMap;
			estimator = new ScenarioParameterEstimator(this.referenceScenarioDataMap, parameterEstimatorMethod);
			
			ModelParameters bestEstimate = new ModelParameters();
			
			// The user can set this
			boolean sumAllLocations = false;
			Map<String,Object> controlParametersMap = control.getControlParametersMap();
			if(controlParametersMap != null) {
				sumAllLocations = ((Boolean) controlParametersMap.get(EstimatorControl.SUM_LOCATIONS_KEY)).booleanValue();
			}
			
			if(sumAllLocations) {
				bestEstimate = estimator.averageThenEstimateParameters(controlParametersMap, runnableContext);
			} else {
				Map<String,ModelParameters> fittedParameters = estimator.estimateParameters(controlParametersMap, runnableContext);		
				bestEstimate.average(fittedParameters);
			}
			
			
		    return bestEstimate;
	}
	
	/**
	 * The aggregate file is named after the data directory under csv
	 * @param dir
	 * @return
	 */
	private static String getAggregateFileName(String dir) {
		int start = dir.lastIndexOf(File.separatorChar);
		
		String filename = DEFAULT_AGGREGATE_FILENAME;
		if(start >=0) {
			filename = dir.substring(start+1,dir.length());
		}
		filename = filename +".csv";
		return filename;
	}
	
	/**
	 * Root Mean Square Difference Comparison
	 * Compares data from two scenarios: the referenceDirectory and the comparisonDirectory
	 * The comparison directory will recursively traverse directories to search for log files.
	 * When found, a comparison is done and the results is written to the comparison directory
	 * including the parameters used for the simulation
	 * 
	 * @param referenceDirectory
	 * @param comparisonDirectory
	 * @param runnableContext Context for long running task
	 * @param errorfunc 
	 * @return ErrorResult
	 * @throws LogInitializationException 
	 */
	public ErrorResult compare(String referenceDirectory, String comparisonDirectory, IRunnableContext runnableContext, ErrorFunction errorfunc) throws LogInitializationException {
		CSVscenarioLoader referenceLoader = new CSVscenarioLoader(referenceDirectory);
		// We will write the result to a file in the comparison directory folder
		String resultFile = COMPARISON_FILE_NAME;
		
		CSVAnalysisWriter resultWriter = new CSVAnalysisWriter(resultFile);	
		Map<Map<String, String>, ErrorResult> result = new HashMap<Map<String, String>, ErrorResult>();
		compareRecursive(referenceLoader, comparisonDirectory, result, runnableContext, errorfunc);
		resultWriter.logData(result);
		resultWriter.flushLoggerData();
		resultWriter.closeLoggerData();
		// Find the smallest RMS difference and return its double list
		double smallestError = Double.MAX_VALUE;
		ErrorResult returnError=null;
		for(Entry<Map<String, String>,ErrorResult> entry : result.entrySet()) {
			ErrorResult res = entry.getValue();
			// Compute average
			double error = 0.0;
			if(res !=null) {
				error = res.getError();
			}
			if(error < smallestError) {smallestError = error;returnError = res;}
		}
		return returnError;
	}
	
	/**
	 * get all the keys
	 * @param directory
	 * @return the keys
	 * @throws LogInitializationException
	 */
	public String[] getKeys(String directory) throws LogInitializationException {
		CSVscenarioLoader referenceLoader = new CSVscenarioLoader(directory);	
		ReferenceScenarioDataMapImpl dataMap = referenceLoader.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, 1);
		return dataMap.getModelLabelKeys();		
	}
	
	/**
	 * Root Mean Square Difference Comparison
	 * Compares data from two scenarios: the referenceDirectory and the comparisonDirectory
	 * The comparison directory will recursively traverse directories to search for log files.
	 * When found, a comparison is done and the results is written to the comparison directory
	 * including the parameters used for the simulation
	 * 
	 * @param referenceLoader
	 * @param comparisonDirectory
	 * @param result
	 * @param runnableContext Context for long running task
	 * @param errorfunc 
	 * @throws LogInitializationException 
	 */
	public void compareRecursive(CSVscenarioLoader referenceLoader, String comparisonDirectory, Map<Map<String, String>, ErrorResult> result, IRunnableContext runnableContext, ErrorFunction errorfunc) throws LogInitializationException {		
		try {
			CSVscenarioLoader comparisonLoader = new CSVscenarioLoader(comparisonDirectory);
			// A valid scenario folder was found. Do the comparison
			ErrorResult res = _compare(referenceLoader, comparisonLoader, runnableContext, errorfunc);
			Map<String, String>runParms = comparisonLoader.getRunParameters();
			result.put(runParms, res);
		} catch(LogInitializationException sie) {
			// The folder did not contain valid log files. Recurse down subdirectories
			// looking for log files
			File f = new File(comparisonDirectory);
			String [] dirs = f.list();
			if(dirs != null) 
				for(String dir : dirs) compareRecursive(referenceLoader, comparisonDirectory+File.separator+dir, result, runnableContext, errorfunc);
		}
	}

		
	/**
	 * Root Mean Square Difference Comparison
	 * Compares data from two scenarios: the referenceDirectory and the comparisonDirectory
	 * @param refLoader
	 * @param compLoader
	 * @param runnableContext Context for long running {@link TaskBar}
	 * @param ErrorFunc Error function
	 * @return the mean square diff
	 * @throws LogInitializationException 
	 */
	private ErrorResult _compare(CSVscenarioLoader refLoader, CSVscenarioLoader compLoader, IRunnableContext runnableContext, ErrorFunction errorfunc) throws LogInitializationException {
			int maxRef = refLoader.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);		
			int maxComp = compLoader.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);				
			// Find the highest resolution common two both locations and 
			// use it for comparison.
			int actualRes = (maxRef > maxComp)?maxComp:maxRef;
				
			this.referenceScenarioDataMap = refLoader.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY,actualRes);
					
			this.comparisonScenarioDataMap = compLoader.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, actualRes);
					
			ErrorCalculator msd = new ErrorCalculator(referenceScenarioDataMap, comparisonScenarioDataMap, errorfunc);
					
			ErrorResult result = 	msd.solve(runnableContext);	
			return result;
	}
	
	/**
	 * 
	 * @param directory
	 * @return true is a data directory exists
	 */
	public boolean validate(String directory) {
		return CSVscenarioLoader.validate(directory);
	}
	
	/**
	 * Root Mean Square Difference Comparison
	 * Compares data from two scenarios: the referenceDirectory and the comparisonDirectory
	 * @param referenceDirectory
	 * @param comparisonDirectory
	 * @param runnableContext Context for long running tasks
	 * @return the mean square diff
	 * @throws LogInitializationException Thrown if problems encountered reading data
	 */
	
	public List<PhaseSpaceCoordinate[]> getLyapunovTrajectory(String referenceDirectory, String comparisonDirectory, IRunnableContext runnableContext) throws LogInitializationException {
		   
			// for reference and for single scenario analysis
			CSVscenarioLoader refLoader = new CSVscenarioLoader(referenceDirectory);
			int maxRef = refLoader.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);
			if(maxRef <=-1) return null;
			// for testing comparison functions
			CSVscenarioLoader compLoader = new CSVscenarioLoader(comparisonDirectory);
			int maxComp = compLoader.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);
			int actualRes = (maxRef > maxComp)?maxComp:maxRef;
			if(actualRes<=-1) return null;
			this.referenceScenarioDataMap = refLoader.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY,actualRes);
			this.comparisonScenarioDataMap = compLoader.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY,actualRes);
			
			LyapunovAnalysis lyap = new LyapunovAnalysis(referenceScenarioDataMap, comparisonScenarioDataMap, runnableContext);
			
			List<PhaseSpaceCoordinate[]> retVal = lyap.getLyapunovTrajectory(runnableContext);	
			return retVal;
	}
	
	/**
	 * 
	 * @param trajectoryList
	 * @return the deviation as List(double[])
	 */
	public static List<EList<Double>> getCumulativePhaseSpaceDeviation(List<PhaseSpaceCoordinate[]> trajectoryList) {
		List<EList<Double>> deviation = LyapunovAnalysis.getCumulativePhaseSpaceDeviation(trajectoryList);
		return deviation;
		
	}
	
	/**
	 * 
	 * @return the current estimator
	 */
	public ParameterEstimator getEstimator() {
		return estimator.getEstimator();
	}



}
