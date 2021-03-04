package org.eclipse.stem.util.analysis;

import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;



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
 * Factory that creates ParameterEsimator instances
 */
public class ParameterEstimatorFactory {

	/**
	 * Create new ParameterEstimator
	 * 
	 * @param method Method used to estimate parameters
	 * @param data Estimator data
	 * @return ParameterEstimator
	 */
	public static ParameterEstimator createEstimator(
			ParameterEstimatorMethod method, 
			ReferenceScenarioDataInstance data) {
		ParameterEstimator result = null;
		
		switch(method) {
			case SEIR:
				result = new SEIRparameterEstimator(data);
				break;
			case SIR:
				 result = new SIRparameterEstimator(data);
				 break;
			case SI:
				 result = new SIparameterEstimator(data);
				 break;	
			case NONLINEARSEIR:
				 result = new NonLinearSEIRParameterEstimator(data);
				 break;	
			default:
				Activator.logError("Unknown method: "+method, null);
		}
		return result;
	}
}
