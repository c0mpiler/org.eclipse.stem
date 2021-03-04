package org.eclipse.stem.analysis.automaticexperiment;

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

/**
 * Implementation was taken from: http://www.ee.ucl.ac.uk/~mflanaga/java/Minimisation.html#simplex
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.analysis.ErrorFunction;
import org.eclipse.stem.analysis.ErrorResult;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;
import org.eclipse.stem.analysis.util.CSVscenarioLoader;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.Simulation;
import org.eclipse.stem.util.loggers.views.CustomCSVLogger;


public class SimplexAlgorithmExecuter 
	extends AbstractErrorAnalysisAlgorithm {
	
	private ISimulation simulation = null;
	private CustomCSVLogger csvLogger = null;
	private final static String SIMULATION_OUTPUT_DIR = Platform.getLocation() + File.separator + "AutoExpTempDir";
	private final static String LOG_FILE_NAME = SIMULATION_OUTPUT_DIR+File.separator+"resultLog.csv";
	static String LS = System.getProperty("line.separator"); 
	private final CustomSimulationManager simMgr = CustomSimulationManager.getManager();
	private ReferenceScenarioDataMapImpl ref;
	// private static AutoExpControl aeControl = null;
	
	
	/**
	 * @see org.eclipse.stem.analysis.automaticexperiment.AbstractErrorAnalysisAlgorithm#execute()
	 */
	@Override
	public void execute() {
		double prevmin = Double.MAX_VALUE;
		double [] prevvals = new double[initialParamsValues.length];
		double [] minvals;
		String [] parameterNames=null;
		if (parameters != null) {
			parameterNames = new String[parameters.size()];
			int i=0;
			for (final ModifiableParameter param:parameters) {
				parameterNames[i++] = param.getFeatureName();
			}
		}
		
		for(;;) {
			for(int i=0;i<initialParamsValues.length;++i) prevvals[i] = initialParamsValues[i];
			// long before = System.currentTimeMillis();
			simplexAlgorithm.execute(simplexFnToMinimize,  initialParamsValues, paramsInitialSteps, tolerance, this.maxNumOfIterations);
			// long after = System.currentTimeMillis();
			if(!this.repeat || AutomaticExperimentManager.QUIT_NOW) {
//				Activator.logInformation("splunge");
//				Activator.logInformation("\n\nTime to execute the Nedler-Mead Algorithm: " + (after-before)/1000 + " seconds");
//				Activator.logInformation("Minimum value: " + simplexAlgorithm.getMinimumFunctionValue());
//				Activator.logInformation("Validation error: " + simplexAlgorithm.getMinimumErrorResult().getValidationError());
//				Activator.logInformation("Parameters values: " + Arrays.toString(simplexAlgorithm.getMinimumParametersValues()));
				minvals = simplexAlgorithm.getMinimumParametersValues();
				break;
			}
			double newmin = simplexAlgorithm.getMinimumFunctionValue();
			if(newmin >= prevmin) {
//				Activator.logInformation("\n\nTime to execute the Nedler-Mead Algorithm: " + (after-before)/1000 + " seconds");
//				Activator.logInformation("Minimum value: " + prevmin);
//				Activator.logInformation("Validation error: " + simplexAlgorithm.getMinimumErrorResult().getValidationError());
//				Activator.logInformation("Parameters values: " + Arrays.toString(prevvals));
				minvals = prevvals;
				break; // we couldn't improve
			}
			// Not same, reinit with new minimum
			prevmin = simplexAlgorithm.getMinimumFunctionValue();
			
			for(int i=0;i<initialParamsValues.length;++i){
				initialParamsValues[i] = simplexAlgorithm.getMinimumParametersValues()[i];
				prevvals[i] =  simplexAlgorithm.getMinimumParametersValues()[i];
			}
			ErrorAnalysisAlgorithmEvent newEvent = new ErrorAnalysisAlgorithmEvent(simplexAlgorithm.getMinimumErrorResult(), ALGORITHM_STATUS.RESTARTED_ALGORITHM);
			newEvent.parameterNames = parameterNames;
			newEvent.parameterValues = simplexAlgorithm.getMinimumParametersValues();
			this.fireEvent(newEvent);

		}
		ErrorAnalysisAlgorithmEvent newEvent = new ErrorAnalysisAlgorithmEvent(simplexAlgorithm.getMinimumErrorResult(), ALGORITHM_STATUS.FINISHED_ALGORITHM);
		newEvent.parameterNames = parameterNames;
		newEvent.parameterValues = minvals;
		this.fireEvent(newEvent);
	}
	
	public void init(AutomaticExperiment automaticExperiment, ErrorAnalysisAlgorithm alg) throws LogInitializationException {
		super.init(automaticExperiment);
		simplexFnToMinimize = new NedlearMeadSimplexFunction(parameters, baseScenario, errorFunction, alg);
		CSVscenarioLoader loader1 = new CSVscenarioLoader(referenceDataDirectory);
		int res = loader1.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);
		ref = loader1.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, res);
	}
	
	@Override
	public void setParameters(List<ModifiableParameter> parameters) {
		super.setParameters(parameters);
		
		//Set lower and upper bounds constraints for the parameters
		int paramIndex=0;
		for (final ModifiableParameter param:parameters) {
			simplexAlgorithm.setParameterLimits(paramIndex, param.getLowerBound(), param.getUpperBound());
			paramIndex++;
		}
	}
	
	/**
	 *
	 */
	public class NedlearMeadSimplexFunction
		implements SimplexFunction 
	{	
	    private ErrorFunction errorFunction = null;
	    private String[] parameterNames = null;
	    private FileWriter resultWriter;
	    private URI[] decoratorURIs = null;
	    private ErrorAnalysisAlgorithm algorithm = null;
	    
		public NedlearMeadSimplexFunction(
				final List<ModifiableParameter> parameters,
				final Scenario pBaseScenario, 
				final ErrorFunction errorFunction, 
				final ErrorAnalysisAlgorithm algorithm) {
			
			try {
				File d= new File(SIMULATION_OUTPUT_DIR);
				if(!d.exists())d.mkdirs();
				resultWriter = new FileWriter(LOG_FILE_NAME);
				baseScenario = pBaseScenario;
				this.errorFunction = errorFunction;
				this.algorithm = algorithm;
				
				if (parameters != null) {
					parameterNames = new String[parameters.size()];
					decoratorURIs = new URI[parameters.size()];
					int i=0;
					for (final ModifiableParameter param:parameters) {
						decoratorURIs[i]=param.getTargetURI();
						parameterNames[i++] = param.getFeatureName();
						resultWriter.write(parameterNames[i-1]);
						resultWriter.write(",");
					}
					resultWriter.write("error");
					resultWriter.write(LS);
				}
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		public ErrorResult getValue(double[] parameters) {
			
			// SED: Fix for multiple trigger problem., Just run with a deep copy of the scenario
			Scenario copyScenario = EcoreUtil.copy(baseScenario);
			
			simulation = createSimulation(copyScenario);
			simulation.setSequenceNumber(simulation.getSequenceNumber()+1);
			
			// Descend into the Scenario looking for something with a double field
			final EList<Decorator> decs = copyScenario.getCanonicalGraph().getDecorators();
	
			Decorator defaultDecorator = null;
			for (Decorator decorator : decs) {
				if (decorator instanceof DiseaseModel) {
					defaultDecorator = decorator; 
					break;
				}
			}
			
			for(int i=0;i<parameterNames.length;++i) {
				Decorator decorator = defaultDecorator;
				if(decoratorURIs[i] != null) 
					for(Decorator scenarioDec:decs) 
						if(decoratorURIs[i].toString().equals(scenarioDec.getURI().toString())) {
							decorator = scenarioDec;
							break;
						}
				for (EAttribute attribute : decorator.eClass().getEAllAttributes()) 
					if(attribute.getName().equals(parameterNames[i])) 
						decorator.eSet(attribute, Double.valueOf(parameters[i]));
			}
			
			
			String uniqueID = null;
			
			if (simulation != null) {
				uniqueID = simulation.getUniqueIDString();
			}
					
			
			String directoryName = SIMULATION_OUTPUT_DIR + File.separator+uniqueID + File.separator;
			
			File dir = new File(directoryName);
			if(!dir.exists())
				dir.mkdirs();
				
			csvLogger = new CustomCSVLogger(directoryName, simulation, (IntegrationDecorator) defaultDecorator);
			
			// This will reinit the infectors/inoc etc to the new values 
			try {
				copyScenario.reset();
			} catch(ScenarioInitializationException sie) {
				Utility.handleException(sie.getErrorMessage(), true, sie);
			}

			//Run the simulation with the new parameters and return the error value
//			Activator.logInformation("Running the simulation with the following parameters: ");
//			Activator.logInformation("\tParameters Names: " + Arrays.toString(parameterNames));
//			Activator.logInformation("\tParameters Values: " + Arrays.toString(parameters));
			double error = 0.0;
			ErrorResult result = null;
			try {
				for(double val:parameters) resultWriter.write(val+",");
				ErrorAnalysisAlgorithmEvent newEvent = new ErrorAnalysisAlgorithmEvent(null, ALGORITHM_STATUS.STARTING_SIMULATION);
				newEvent.parameterNames = parameterNames;
				newEvent.parameterValues = parameters;
				((AbstractErrorAnalysisAlgorithm)algorithm).fireEvent(
						newEvent);
				runSimulation(simulation);
				
				result =  getErrorValue(simulation.getUniqueIDString(), copyScenario);
			
				newEvent = new ErrorAnalysisAlgorithmEvent(result, ALGORITHM_STATUS.FINISHED_SIMULATION);
				newEvent.parameterNames = parameterNames;
				newEvent.parameterValues = parameters;
				
				((AbstractErrorAnalysisAlgorithm)algorithm).fireEvent(
						newEvent);
				
				error = result.getError();
				
//				Activator.logInformation(" Error is: " + error);
//				Activator.logInformation(" Error in validation data set is: " + result.getValidationError());
				resultWriter.write(error+"");
				resultWriter.write(LS);
				
				// after exp is done
				// resultWriter.flush(); 
				
				// TODO: GUI output here
				
				
		 		
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
			cleanup();
			
			return result;
		}
		
		private ErrorResult getErrorValue(String simulationUniqueId, Scenario scenario) {
			ErrorResult result = null;
			try {
				final EList<Decorator> decs = scenario.getCanonicalGraph().getDecorators();
				
				DiseaseModel defaultDecorator = null;
				for (Decorator decorator : decs) {
					if (decorator instanceof DiseaseModel) {
						defaultDecorator = (DiseaseModel)decorator; 
						break;
					}
				}
				
				if (defaultDecorator != null) {
					CSVscenarioLoader loader2 = new CSVscenarioLoader(SIMULATION_OUTPUT_DIR + File.separator + simulationUniqueId +"/"+defaultDecorator.getDiseaseName()+"/"+defaultDecorator.getPopulationIdentifier());
					int maxres = loader2.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);
					ReferenceScenarioDataMapImpl data = loader2.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, maxres);
		
					result = errorFunction.calculateError(ref, data);
				}
			} catch (LogInitializationException e) {
				e.printStackTrace();
			}
			return result;
		}
		
		private void runSimulation(final ISimulation simulationToRun) {
			// long before = System.currentTimeMillis();
			simulationToRun.run();
			try {
				simulationToRun.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			simulationToRun.stop();			
			
			// long after = System.currentTimeMillis();
//			Activator.logInformation("It took " + (after-before)/1000 + " seconds to run the simulation");
		}
		
		private void cleanup() {
			if (csvLogger != null) {
				csvLogger.close();
				csvLogger = null;
			}
			simMgr.removeActiveSimulation(simulation);
			((Simulation)simulation).destroy();
			simulation = null;
			CustomSimulationManager.resetSimulationManager();
		}
		
		private ISimulation createSimulation(Scenario scenario) {
			Simulation simulation = (Simulation)simMgr.createSimulation(scenario, null);
			simulation.simulationSleep = false;
			return simulation;
		}

		/**
		 * flush the logger ONLY when done
		 */
		@Override
		public void done() {
			try {
				resultWriter.flush();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
		} //done
	}
}


