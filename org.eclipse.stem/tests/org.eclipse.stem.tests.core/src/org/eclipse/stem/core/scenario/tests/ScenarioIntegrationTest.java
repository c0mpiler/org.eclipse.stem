package org.eclipse.stem.core.scenario.tests;

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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;
import org.eclipse.stem.analysis.util.CSVscenarioLoader;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.core.tests.Activator;
import org.eclipse.stem.diseasemodels.standard.AggregatingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.Simulation;
import org.eclipse.stem.util.loggers.views.CSVLoggerFactory;
import org.eclipse.stem.util.loggers.views.CustomCSVLogger;
import org.eclipse.stem.util.loggers.views.LoggerControlFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.scenario.Scenario#step() <em>Step</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.Scenario#reset() <em>Reset</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.Scenario#initialize() <em>Initialize</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.Scenario#produceTitle() <em>Produce Title</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public class ScenarioIntegrationTest extends TestCase {
	/**
	 * for testing scenarios from files
	 */

	
	protected final static String REFERENCE_SUFFIX="_Reference";
	protected final static String sep = File.separator;
	
	protected String scenarioFile;
	static List<File> allProjects = null;
	
	private Scenario fixture;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScenarioIntegrationTest.class);
	}

	/**
	 * To keep junit test runner hapy. 
	 * 
	 * @generated
	 */
	public ScenarioIntegrationTest(String name) {
		super(name);
	}
	
	/**
	 * Constructs a new Scenario test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScenarioIntegrationTest(String name, String file, List<File>projects) {
		super(name);
		scenarioFile =  file;
		allProjects = projects;
	}

	/**
	 * Returns the fixture for this Scenario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected Scenario getFixture() {
		return (Scenario)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		
	} // setUp

	/**
	 * runs all the integration tests
	 */
	public void testScenario() {
		// set up the workspace for all the integration tests
	
		if(this.scenarioFile == null) return;
		String integrationTestLogDir;
		String scenarioName;
		List<String> dataObjectNameList = new ArrayList<String>(); // e.g. list of things being logged the Disease Name or population model name
		List<String>  logDirList = new ArrayList<String>(); // List of the log directories (generated with time stamp)
	
		String scenarioToTest = this.scenarioFile;
		Activator.logInformation("now loading "+scenarioToTest);
			
		scenarioName = getScenarioName(scenarioToTest);
		integrationTestLogDir = getLogDir(scenarioToTest);
			
		Scenario scenario = IntegrationTestUtil.loadScenario(scenarioToTest);
		fixture = scenario;
		try {
			scenario.initialize(); // This step can be slow
		} catch(ScenarioInitializationException sie) {
			sie.printStackTrace();
		}
		assertTrue(scenario.sane());
			
		// Next we have to create a simulation and logger(s) for the scenario
		// and compute the output to prestored outputs
		ISimulation sim = new Simulation(scenario,0, GraphFactory.eINSTANCE.createSimpleGraphPartitioner());
		LoggerControlFactory lcf = CSVLoggerFactory.INSTANCE;
		EList<Decorator> decorators = sim.getScenario().getCanonicalGraph().getDecorators();
		for(Decorator dec:decorators) {
			if(dec instanceof IntegrationDecorator && !(dec instanceof AggregatingSIDiseaseModel)) {
					
				// TODO  For now we only log and test the DiseaseModel Data
				// TODO the CSVscenario loader does not yet parse the PopulationModel Log Files
				if(dec instanceof DiseaseModel) {
					IntegrationDecorator dm = (IntegrationDecorator)dec;
					//String diseaseName = dm.getDiseaseName();
					CustomCSVLogger logWriter = new CustomCSVLogger(integrationTestLogDir+File.separator+scenarioName+File.separator,sim,dm);
					dataObjectNameList.add(logWriter.getLogDataObjectName());
					logDirList.add(logWriter.getDirectoryName());
				}
					
			} // DiseaseModel
		} // For each decorator
			
		// run the simulation and log the data
		Activator.logInformation("Starting simulation....");			
		sim.run();
		try {
			Activator.logInformation("Waiting for simulation to finish...");
			sim.join();
			Activator.logInformation("Simulation finished.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sim.stop();			
			
			
		// Simulation is done. 
		// REFRESH the workspace so we see the new log files
		IntegrationTestUtil.refreshWorkspace(allProjects);
		
			
		// READ all logs for each scenario we ran
//			for (int j = 0; j < logDirList.size(); j ++) {
			//Now read in the log file(s) we just created 
		String logDir = logDirList.get(logDirList.size()-1);
		// this directory is a disease or PopulationModel but we need to look for every leaf folder in it.
		// The leaf folders are populationIdentifiers like 'human'.
		File topDir = new File(logDir);
		File[] allSubFolders = topDir.listFiles();
		for(int k = 0; k < allSubFolders.length; k ++) {
			File leafSubFolder = allSubFolders[k];
			if(leafSubFolder.isDirectory()) {
				String populationIdentifier = leafSubFolder.getName();
				String firstSTR = populationIdentifier.substring(0,1);
				// ignore system folders
				if(!firstSTR.equals(".")) {
						
					int maxResolution = 0;
					ReferenceScenarioDataMapImpl scenarioDataMap = null;
					try {
						Activator.logInformation("Loading post simulation data from Directory "+logDir+populationIdentifier);
						CSVscenarioLoader loaderRUN = new CSVscenarioLoader(logDir+populationIdentifier);
						maxResolution = loaderRUN.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);
						scenarioDataMap = loaderRUN.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, maxResolution);
					} catch (LogInitializationException e) {
						Activator.logError("Error loading run log for  "+logDir+" error= "+e.getMessage(),e);
					}
						
					//Now read in the REFERENCE log file(s) copied in with the projects. We look for the SAME populationIdentifier being tested above
					String dataObjectName = dataObjectNameList.get(dataObjectNameList.size()-1);
					String referenceDataDirectory = integrationTestLogDir+sep+scenarioName+REFERENCE_SUFFIX+sep+dataObjectName+sep+populationIdentifier;
					ReferenceScenarioDataMapImpl referenceDataMap=null;
					try {
						Activator.logInformation("Loading reference data for "+dataObjectName+sep+populationIdentifier);
						CSVscenarioLoader loaderREF = new CSVscenarioLoader(referenceDataDirectory);
						referenceDataMap = loaderREF.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, maxResolution);
					} catch (LogInitializationException e) {
						Activator.logInformation("Warning, No REFERENCE log found or loaded for  "+dataObjectName+" referenceDataDirectory should be:["+referenceDataDirectory+"] error= "+e.getMessage());
					}
						
					// Was the test run Sane??
					assertTrue(scenarioDataMap.sane());
					if(referenceDataMap!=null) {
						assertTrue(referenceDataMap.sane());
						boolean consistent = scenarioDataMap.consistentWith(referenceDataMap);
						assertTrue(consistent);								
					}
					
						
				}// if not system folder
			}// if directory
		}// for all subFolders and Files
				
		
	}// TestAllIntegrationTest
		
	
	/**
	 * 
	 * @param scenarioFolder
	 * @return
	 */
	public static String getLogDir(String scenarioFolder)  {
		int idx = scenarioFolder.indexOf("scenarios");
		String path = scenarioFolder.substring(0,idx);
		String retVal = path+"Recorded Simulations"+sep+"IntegrationTest";
		return retVal;	
	}
	
	/**
	 * 
	 * @param scenarioFolder
	 * @return
	 */
	public static String getScenarioName(String scenarioFolder)  {
		int idx1 = scenarioFolder.indexOf("scenarios");
		int idx2 = scenarioFolder.indexOf(".scenario");
		idx1+=10;
		String name = scenarioFolder.substring(idx1,idx2);
		return name;	
	}
	
	/** This is hacky, just to get the test runner to use a method name that is different from the name of the test
	 * 
	 */
	@Override
	protected void runTest() throws Throwable {
		Method runMethod= null;
		try {
			// use getMethod to get all public inherited
			// methods. getDeclaredMethods returns all
			// methods of this class but excludes the
			// inherited ones.
			runMethod= getClass().getMethod("testScenario", (Class[])null);
		} catch (NoSuchMethodException e) {
			fail("Method \""+"testScenario"+"\" not found");
		}
		if (!Modifier.isPublic(runMethod.getModifiers())) {
			fail("Method \""+"testScenario"+"\" should be public");
		}

		try {
			runMethod.invoke(this);
		}
		catch (InvocationTargetException e) {
			e.fillInStackTrace();
			throw e.getTargetException();
		}
		catch (IllegalAccessException e) {
			e.fillInStackTrace();
			throw e;
		}
	}
	
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		fixture = null;
	//// clean up ////
//		if(allProjects != null) {
//			try {
//				for(int i = 0; i < allProjects.size(); i ++){
//					File project = allProjects.get(i);
//					assertTrue(IntegrationTestUtil.removeDirectory(project));
//				}
//			} catch(CoreException ce) {
//				ce.printStackTrace();
//				fail();
//			}	
//		}
		/////////////////////
	}

	
	


} // ScenarioTest
