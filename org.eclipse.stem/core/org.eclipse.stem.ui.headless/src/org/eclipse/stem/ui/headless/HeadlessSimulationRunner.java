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
package org.eclipse.stem.ui.headless;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticExperimentManager;
import org.eclipse.stem.analysis.automaticexperiment.ErrorAnalysisAlgorithm;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.impl.DublinCoreImpl;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.sequencer.Sequencer;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationListenerSync;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.stem.jobs.simulation.SimulationState;
import org.eclipse.stem.util.loggers.util.Util;
import org.eclipse.stem.util.loggers.views.CustomCSVLogger;

/**
 * Runs simulations for scenarios passed in as command line options. The run
 * method find the correct scenarios, creates simulations for the scenarios,
 * runs the simulations, and attempts to wait for them to finish.
 * 
 */
public class HeadlessSimulationRunner {
	private static final String PROJECT_SCENARIOS_FOLDER_NAME = "scenarios";

	private static final String SCENARIO_FILE_EXTENSION = ".scenario";

	private static final SimulationManager MANAGER = SimulationManager
			.getManager();

	private final HeadlessSimulationStatusLogger logger = new HeadlessSimulationStatusLogger();

	private final Set<URI> scenariosUrisToRun = new HashSet<URI>();

	private boolean log = false;

	private String logDirectory = null;

	/**
	 * 
	 */
	public HeadlessSimulationRunner(boolean log, String logDirectory) 
	{
		this.log = log;
		this.logDirectory = logDirectory;

		refreshWorkspace();
	}

	/**
	 * Refreshes the workspace, loading external resources
	 */
	private void refreshWorkspace() 
	{
		WorkspaceImporter.importProjects();
	}

	/**
	 * Collects the scenarios based on command line options, creates and runs a
	 * simulation for each scenario, and waits for the simulations to finish.
	 * 
	 * @param args
	 */
	public void run(Map<String, List<String>> args) 
	{
		collectScenariosToRun(args);
		runScenarios();
		waitForSimulations();
	}

	private void collectScenariosToRun(Map<String, List<String>> args) 
	{
		if (args.containsKey("uri")) {
			addScenariosForUris(args.get("uri"));
		}
		if (args.containsKey("project") && args.get("project").size() > 0) {
			if (args.containsKey("scenario")) {
				addScenarios(args.get("project").get(0), args.get("scenario"));
			} else {
				addScenariosForProject(args.get("project").get(0));
			}
		}

	}

	private void addScenarios(String projectName, List<String> scenarioNames) {
		for (String scenarioName : scenarioNames) {
			if (!scenarioName.endsWith(SCENARIO_FILE_EXTENSION)) {
				scenarioName = scenarioName.concat(SCENARIO_FILE_EXTENSION);
			}

			scenariosUrisToRun.add(createUriForScenario(projectName,
					scenarioName));
		}
	}

	private void addScenariosForUris(List<String> uris) {
		for (String uri : uris) {
			try {
				scenariosUrisToRun.add(URI.createURI(uri));
			} catch (IllegalArgumentException iae) {
				System.err.println("URI " + uri + " is invalid");
			}
		}
	}

	/**
	 * Attach a logger to the simulation
	 * 
	 * @param sim
	 *            Simulation to attach logger to
	 */
	private void addLogger(ISimulation sim) {
		String logDir = this.logDirectory;
		if (logDir == null) {
			logDir = Util.getLoggingFolder(sim.getScenario().getURI().toString());
		}

		String uniqueID = null;
		
		if (sim != null)  {
			uniqueID = sim.getUniqueIDString();
		} else {
			Date creationTime = Calendar.getInstance().getTime();
			String winSafestmp = DublinCoreImpl.createISO8601DateStringSeconds(creationTime);
			uniqueID  = winSafestmp.replace(":", "_");
		}
		String directoryName = logDir + File.separator+uniqueID + File.separator;
		
		File dir = new File(directoryName);
		if(!dir.exists())
			dir.mkdirs();
		
		EList<Decorator> decorators = sim.getScenario().getCanonicalGraph()
				.getDecorators();
		for (Decorator dec : decorators) {
			if (dec instanceof IntegrationDecorator) {
				@SuppressWarnings("unused")
				CustomCSVLogger logger = new CustomCSVLogger(directoryName, sim,
						(IntegrationDecorator) dec);
			}
		}
	}

	private void runScenarios() {
		System.out.println("Scenarios selected: " + scenariosUrisToRun);

		// Loop through the list of scenario URIs found
		for (URI scenarioUri : scenariosUrisToRun) {
			try {
				
				String lastSegment = scenarioUri.lastSegment();
				System.out.println(lastSegment);
				if (lastSegment.indexOf("automaticexperiment")>=0) {
					// process and launch and experiment
					// Attempt to load the scenario by its URI
					System.out.println("Creating automated experiment for " + scenarioUri);
					AutomaticExperiment ac = (AutomaticExperiment) Utility.getIdentifiable(scenarioUri);
					
					AutomaticExperimentManager manager = AutomaticExperimentManager.getInstance();
					ErrorAnalysisAlgorithm algorithm = manager.createAlgorithm(ac);
					try {
						algorithm.init(ac, algorithm);
						algorithm.execute();
						//manager.executeAlgorithm(algorithm, (AutomaticExperiment)ac);
					} catch(LogInitializationException lie) {
						Utility.handleException(lie.getMessage(), true, null);
					}
					
				} else {
					// Attempt to load the scenario by its URI
					System.out.println("Creating simulation for " + scenarioUri);
					Scenario simulationScenario = (Scenario) Utility
							.getIdentifiable(scenarioUri);
					if (simulationScenario != null) {
						// Create the simulation from the scenario
						ISimulation sim = MANAGER.createSimulation(
								simulationScenario, new NullProgressMonitor());
						if (log) {
							addLogger(sim);
						}

						System.out.println("Running simulation "
								+ sim.getUniqueIDString() + " for " + scenarioUri);

						// Add the local simulation logger
						sim.addSimulationListenerSync(logger);

						// Run the simulation
						sim.run();
					} else {
						System.err.println("Scenario " + scenarioUri + " not fond");
					}
				} // else scenario
				
				
				
				
				
				
			} catch (Exception e) {
				System.err.println("Error creating simulation for URI "
						+ scenarioUri);
				e.printStackTrace(System.err);
			}
		}
	}

	private static URI createUriForScenario(String projectName,
			String scenarioName) {
		return URI.createURI("platform:/resource/" + projectName + "/"
				+ PROJECT_SCENARIOS_FOLDER_NAME + "/" + scenarioName);
	}

	private void addScenariosForProject(String projectName) {
		// Get the project from the workspace
		IProject project = getProjectForName(projectName);

		try {
			// Get the "scenarios" folder and check existence
			IFolder scneariosFolder = project
					.getFolder(PROJECT_SCENARIOS_FOLDER_NAME);
			if (scneariosFolder.exists()) {
				// Get the members of the "scenarios" folder and
				IResource[] folderMembers = scneariosFolder.members();
				for (IResource r : folderMembers) {
					// If is a file that ends with ".scenario", then add to the
					// list of URIs to run
					if (r.getName().endsWith(SCENARIO_FILE_EXTENSION)) {
						// Found a scenario
						scenariosUrisToRun.add(createUriForScenario(
								projectName, r.getName()));
					}
				}
			} else {
				System.err.println("Project " + projectName
						+ " is not a valid STEM project");
			}
		} catch (CoreException ce) {
			ce.printStackTrace(System.err);
		}
	}

	private static IProject getProjectForName(String projectName) {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	}

	private void waitForSimulations() {
		while (MANAGER.getActiveSimulations().size() > 0) {
			int activeCount = MANAGER.getActiveSimulations().size();
			for (ISimulation sim : MANAGER.getActiveSimulations()) {
				if (sim.getSimulationState() == SimulationState.STOPPED) {
					activeCount--;
				} else {
					try {
						sim.join();
						sim.stop();
						activeCount--;
					} catch (InterruptedException e) {
						System.err.println("Simulation interrupted.");
					}
				}
			}
			if (activeCount == 0) {
				break;
			}

		}
	}

	/**
	 * Simulation listener that logs the output of simulations to standard out
	 * at the end of each cycle and at the end of the sequence.
	 * 
	 */
	private class HeadlessSimulationStatusLogger implements
			ISimulationListenerSync {
		
		long initialTime;
		long lastTime;
		
		HeadlessSimulationStatusLogger() {
			// nothing
			initialTime = lastTime = System.currentTimeMillis();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.stem.jobs.simulation.ISimulationListenerSync#
		 * simulationChangedSync
		 * (org.eclipse.stem.jobs.simulation.SimulationEvent)
		 */
		public void simulationChangedSync(SimulationEvent event) {
			Sequencer sequencer = event.getSimulation().getScenario()
					.getSequencer();

			switch (event.getSimulationState()) {
			case COMPLETED_CYCLE:
				long time = System.currentTimeMillis();;
				System.out.println("["
						+ event.getSimulation().getUniqueIDString() + "] "
						+ sequencer.getWorkComplete() + "% "
						+ sequencer.getCurrentTime() + "/"
						+ sequencer.getEndTime() + " "
						+ "("+ (time - lastTime) +" ms)");
				lastTime = time;
				break;
			case COMPLETED_SEQUENCE:
				System.out.println("["
						+ event.getSimulation().getUniqueIDString()
						+ "] Finished ("+ (lastTime - initialTime) +" ms)");
				break;
			default:
				break;
			}
		}
	}
}
