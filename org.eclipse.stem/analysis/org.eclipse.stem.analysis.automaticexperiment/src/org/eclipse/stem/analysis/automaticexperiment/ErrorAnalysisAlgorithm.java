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


import java.util.List;

import org.eclipse.stem.analysis.ErrorFunction;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.core.scenario.Scenario;


public interface ErrorAnalysisAlgorithm {
	public void setErrorFunction(final ErrorFunction errorFunction);
	public void setParameters(final List<ModifiableParameter> parameters);
	public void setTolerance(final double tolerance);
	public void setBaseScenario(final Scenario baseScenario);
	public void setReferenceDataDirectory(final String referenceDataDir);
	public void setMaximumNumberOfIterations(final long maxNumOfIterations);
	public double[] getResultParameters();
	public double getResultValue();
	public void execute();
	public void init(AutomaticExperiment automaticExperiment, ErrorAnalysisAlgorithm alg) throws LogInitializationException;
	public void reinitStartParams(AutomaticExperiment exp, double [] vals);
	public void addListener(ErrorAnalysisAlgorithmListener listener);
	public void clearListeners();
	
}
