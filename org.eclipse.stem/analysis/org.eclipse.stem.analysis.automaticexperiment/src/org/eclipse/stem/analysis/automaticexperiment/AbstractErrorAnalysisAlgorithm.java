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


import java.util.ArrayList;
import java.util.List;

//import org.eclipse.stem.analysis.AnalysisFactory;
import org.eclipse.stem.analysis.ErrorFunction;
import org.eclipse.stem.core.scenario.Scenario;


public abstract class AbstractErrorAnalysisAlgorithm implements
		ErrorAnalysisAlgorithm {
	
	protected Scenario baseScenario = null;
	protected SimplexAlgorithm simplexAlgorithm = new NelderMeadAlgorithm();
	protected SimplexFunction simplexFnToMinimize = null;
	protected ErrorFunction errorFunction = null;
	protected double[] initialParamsValues = null;
	protected double[] paramsInitialSteps = null;
	protected double tolerance = -1;
	protected String referenceDataDirectory = null;
	protected long maxNumOfIterations = -1;
	protected List<ModifiableParameter> parameters = null;
	boolean repeat = false;
	private ArrayList<ErrorAnalysisAlgorithmListener> listeners = new ArrayList<ErrorAnalysisAlgorithmListener>();
	
	abstract public void execute();

	public void setBaseScenario(Scenario baseScenario) {
		this.baseScenario = baseScenario;
	}

	public void setTolerance(double tolerance) {
		this.tolerance = tolerance;
	}

	public void setErrorFunction(ErrorFunction errorFunction) {
		this.errorFunction = errorFunction;
	}

	public void setReferenceDataDirectory(String referenceDataDir) {
		this.referenceDataDirectory = referenceDataDir;
	}

	public void init(AutomaticExperiment automaticExperiment) {
		setBaseScenario(automaticExperiment.getBaseScenario());
		setParameters(automaticExperiment.getParameters());
		
		double tolerance = automaticExperiment.getTolerance();
		setTolerance(tolerance);		
		long maxIterations = automaticExperiment.getMaximumNumberOfIterations();
		setMaximumNumberOfIterations(maxIterations);
		
		boolean repeatUntilNoImprovement = automaticExperiment.isReInit();
		setReInit(repeatUntilNoImprovement);
		
		ErrorFunction errorFunction = null;
		//String errorFunctionName = automaticExperiment.getErrorFunction();
		errorFunction = automaticExperiment.getErrorFunc();
		
		// DEPRECATED CODE
//		if(errorFunction == null) {
//			// This is for backwards compatability with old versions of automated experiments 
//			if (errorFunctionName.equals("Threshold error function")) { //$NON-NLS-1$
//				errorFunction = AnalysisFactory.eINSTANCE.createThresholdErrorFunction();
//			}
//			if (errorFunctionName.equals("Simple error function")) { //$NON-NLS-1$
//				errorFunction = AnalysisFactory.eINSTANCE.createSimpleErrorFunction();
//			}		
//		}
		setErrorFunction(errorFunction);
		
		String refDir = automaticExperiment.getReferanceDataDir();
		setReferenceDataDirectory(refDir);
	}

	public void reinitStartParams(AutomaticExperiment experiment, double [] vals) {
		int i=0;
		for(ModifiableParameter p:experiment.getParameters()) {
			p.setInitialValue(vals[i++]);
		}
		init(experiment);
	}
	public double[] getResultParameters() {
		return simplexAlgorithm.getMinimumParametersValues();
	}

	public double getResultValue() {
		return simplexAlgorithm.getMinimumFunctionValue();
	}

	public void setMaximumNumberOfIterations(long maxNumOfIterations) {
		this.maxNumOfIterations = maxNumOfIterations;
	}

	public void setReInit(boolean repeat) {
		this.repeat = repeat;
	}
	public void setParameters(List<ModifiableParameter> parameters) {
		this.parameters = parameters;
		paramsInitialSteps = new double[parameters.size()];
		initialParamsValues = new double[parameters.size()];
		int i=0;
		for (final ModifiableParameter param:parameters) {
			paramsInitialSteps[i] = param.getStep();
			initialParamsValues[i] = param.getInitialValue();
			i++;
		}
	}
	
	public void addListener(ErrorAnalysisAlgorithmListener l) {this.listeners.add(l);}
	public void clearListeners() {this.listeners.clear();}
	
	protected void fireEvent(ErrorAnalysisAlgorithmEvent evt) {
		for(ErrorAnalysisAlgorithmListener l:listeners) l.eventReceived(evt);
	}
}
