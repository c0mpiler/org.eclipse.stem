/**
 * 
 */
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.stem.analysis.AnalysisFactory;
import org.eclipse.stem.analysis.ErrorFunction;
import org.eclipse.stem.analysis.ErrorResult;
import org.eclipse.stem.analysis.impl.AnalysisFactoryImpl;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;


   

/** 
 * this class computes the mean square difference between two scenarios as a function of time
 * 1. It only looks at locations which are COMMON to both scenarios
 * 2. The time series should be the same length. If they are not this will compare of a period equal to
 *    the SHORTEST of all the time series. 
 * 3. It only considers locations where infectious count is nonzero in one or the other - not interested in weighting regions with no disease.
 * 
 * The simplified version only deals with absolute I comparison
 *
 */

public class ErrorCalculator {
	
	ReferenceScenarioDataMapImpl ref;
	ReferenceScenarioDataMapImpl data;
	ErrorResult result;
	
	static AnalysisFactory aFactory = new AnalysisFactoryImpl();
	ErrorFunction errorFunction;
	
	/**
	 * input
	 */
	//Map<String,List<Double>> commonInfectiousLocationsA = new HashMap<String,List<Double>>();
	//Map<String,List<Double>> commonInfectiousLocationsB = new HashMap<String,List<Double>>();
	
	
	
	
	/**
	 *  Determines the MeanSquare difference between two scenario data sets over time each stored in a map
	 * @param scenarioMapA
	 * @param scenarioMapB
	 * @param errorFunc
	 */
	public ErrorCalculator(ReferenceScenarioDataMapImpl scenarioMapA, ReferenceScenarioDataMapImpl scenarioMapB, ErrorFunction errorFunc) {
		ref = scenarioMapA;
		data = scenarioMapB;
		errorFunction = errorFunc;
	}// constructor MeanSquareDifference
	
	
	
	
	/**
	 * solves for the Root MeanSquareDifference vs time
	 * using infectious data only for now
	 * 
	 * @param runnableContext Runnable context for progress indicator
	 * @return comparison time series as double[]
	 */
	public ErrorResult solve(IRunnableContext runnableContext) {
		final ErrorCalculator self = this;
		IRunnableWithProgress task = new IRunnableWithProgress() {
            public void run(IProgressMonitor progress) {
            	progress.beginTask("Solving...", 100);
            	
            	self.result = errorFunction.calculateError(self.ref, self.data);
            	progress.done();
            }
		};
		
		try {
			runnableContext.run(true, false, task);
		} catch(InterruptedException ie) {
			// Task is not interruptable
		} catch(InvocationTargetException ite) {
			// Task is not interruptable
		}
		return this.result;
	}// solve()

	
	
} // class SimpleMeanSquareDifference
