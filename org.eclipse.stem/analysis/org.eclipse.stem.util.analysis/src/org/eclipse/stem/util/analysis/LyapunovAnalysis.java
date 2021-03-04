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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;


   

/** 
 * this class computes the mean square difference between two scenarios as a function of time
 * 1. It only looks at locations which are COMMON to both scenarios
 * 2. The time series should be the same length. If they are not this will compare of a period equal to
 *    the SHORTEST of all the time series. 
 * 3. It only considers locations where infectious count is nonzero in one or the other - not interested in weighting regions with no disease.
 *
 *
 */
public class LyapunovAnalysis {
	
	/**
	 * input
	 */
	Map<String,List<PhaseSpaceCoordinate>> commonPhaseSpaceA = new HashMap<String,List<PhaseSpaceCoordinate>>();
	Map<String,List<PhaseSpaceCoordinate>> commonPhaseSpaceB = new HashMap<String,List<PhaseSpaceCoordinate>>();
	
	Map<String,List<Double>> totalPopulation = new HashMap<String,List<Double>>();
	
	
	/**
	 * number common locations with nonzero Inf count at time t
	 */
	public double[] locationCount;
	
	/**
	 * Scenario A
	 */
	public PhaseSpaceCoordinate[] trajectoryA;
	
	/**
	 * Scenario B
	 */
	public PhaseSpaceCoordinate[] trajectoryB;
	
	
	/**
	 * time
	 */
	public double[] time;
	
	/**
	 * Determines the MeanSquare difference between two scenario data sets over time each stored in a map
	 * @param scenarioMapA 
	 * @param scenarioMapB 
	 * @param runnableContext For progress indicator
	 */
	public LyapunovAnalysis(ReferenceScenarioDataMapImpl scenarioMapA, ReferenceScenarioDataMapImpl scenarioMapB, IRunnableContext runnableContext) {
		final ReferenceScenarioDataMapImpl mapA = scenarioMapA;
		final ReferenceScenarioDataMapImpl mapB = scenarioMapB;
		
		IRunnableWithProgress task = new IRunnableWithProgress() {
            public void run(IProgressMonitor progress) {
            	progress.beginTask("Calculating common locations...", mapA.getNumLocations());
    
				Iterator<String> iteratorA = mapA.getLocations().iterator();
				int maxTime = -1;
				while(iteratorA.hasNext()) {
					progress.worked(1);
					if(progress.isCanceled()) throw new OperationCanceledException();
					String id = iteratorA.next();
					
					if(mapB.containsLocation(id)) {
						
						// get the lists of data only for those locations that are common to both maps
						ReferenceScenarioDataInstance dataMapA = mapA.getLocation(id);
						List<PhaseSpaceCoordinate> aData = getNormalizedTrajectory(dataMapA);
					
						commonPhaseSpaceA.put(id,aData);
						
						// get the total population from Map A (same as map B for now
						totalPopulation.put(id, getTotalPopulation(dataMapA));
						
						// Map B
						ReferenceScenarioDataInstance dataMapB = mapB.getLocation(id);
						List<PhaseSpaceCoordinate> bData = getNormalizedTrajectory(dataMapB);
						
						commonPhaseSpaceB.put(id,bData);
					
										
						// init the arrays
						if (maxTime == -1) maxTime = aData.size();
						if(aData.size() < maxTime) maxTime = aData.size();
						if(bData.size() < maxTime) maxTime = bData.size();
					}// if
				}// while
				progress.done();
				if(time==null) {
					time = new double[maxTime];
					trajectoryA = new PhaseSpaceCoordinate[maxTime];
					trajectoryB = new PhaseSpaceCoordinate[maxTime];
		
					locationCount = new double[maxTime];
					for(int i = 0; i < maxTime; i ++) {
						time[i] = i;
						trajectoryA[i] = new PhaseSpaceCoordinate(0.0,0.0);
						trajectoryB[i] = new PhaseSpaceCoordinate(0.0,0.0);
						locationCount[i] = 0.0;
					}
				}
            } // run
		};
		try {
			runnableContext.run(true, false, task);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		} catch(InvocationTargetException ive) {
			ive.printStackTrace();
		}
	}// constructor MeanSquareDifference
	
	
	/**
	 * From the dataMap extract a list of normalize infectious (fraction of total population)
	 * @param dataMap
	 * @return normalize list of infectious people
	 */
	public List<PhaseSpaceCoordinate> getNormalizedTrajectory(ReferenceScenarioDataInstance dataMap) {
		// may or may not exist
		List<Double> exposedList = dataMap.getEtotals();
		List<Double> recoveredList = dataMap.getRtotals();
		
		// MUST exist
		List<Double> infectiousList = dataMap.getItotals();
		List<Double> susceptibleList = dataMap.getStotals();	
		 
		assert(infectiousList!=null);
		assert(susceptibleList!=null);
		
		
		List<PhaseSpaceCoordinate> normalizedTrajectory = new ArrayList<PhaseSpaceCoordinate>();
	
		double[] totalPop = new double[infectiousList.size()];
		for (int i = 0; i < infectiousList.size(); i ++) {
			
			double inf = infectiousList.get(i).doubleValue();
			double susc = susceptibleList.get(i).doubleValue();
			double exposed = 0.0;
			double recovered = 0.0;
			if((exposedList!=null)&&(exposedList.size()>0)) {
				exposed = exposedList.get(i).doubleValue();
			}
			if((recoveredList!=null)&&(recoveredList.size()>0)) {
				recovered = recoveredList.get(i).doubleValue();
			}
			
			totalPop[i] = inf+susc+exposed+recovered;
			inf /= totalPop[i];
			susc /= totalPop[i];
			
			PhaseSpaceCoordinate point = new PhaseSpaceCoordinate(susc,inf);
			normalizedTrajectory.add(point);
		}
		return normalizedTrajectory;
	}
	
	
	
	/**
	 * From the dataMap extract a list of the total population)
	 * @param dataMap
	 * @return total population
	 */
	public List<Double> getTotalPopulation(org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance dataMap) {
		// may or may not exist
		List<Double> exposedList = dataMap.getEtotals();
		List<Double> recoveredList = dataMap.getRtotals();
		
		// MUST exist
		List<Double> infectiousList = dataMap.getItotals();
		List<Double> susceptibleList = dataMap.getStotals();	
		 
		assert(infectiousList!=null);
		assert(susceptibleList!=null);
		
		List<Double> population = new ArrayList<Double>();
	
		for (int i = 0; i < infectiousList.size(); i ++) {
			double totalPop = 0.0;

			double inf = infectiousList.get(i).doubleValue();
			double susc = susceptibleList.get(i).doubleValue();
			double exposed = 0.0;
			double recovered = 0.0;
			if((exposedList!=null)&&(exposedList.size()>0)) {
				exposed = exposedList.get(i).doubleValue();
			}
			if((recoveredList!=null)&&(recoveredList.size()>0)) {
				recovered = recoveredList.get(i).doubleValue();
			}
			
			totalPop = inf+susc+exposed+recovered;
			population.add(Double.valueOf(totalPop));
		}
		return population;
	}
	
	/**
	 * solves for the Root MeanSquareDifference vs time
	 * using infectious data only for now
	 * 
	 * @param runnableContext Runnable context for progress indicator
	 * @return comparison time series as double[]
	 */
	
	public List<PhaseSpaceCoordinate[]> getLyapunovTrajectory(IRunnableContext runnableContext) {
		final List<PhaseSpaceCoordinate[]> retVal = new ArrayList<PhaseSpaceCoordinate[]>();
		IRunnableWithProgress task = new IRunnableWithProgress() {
            public void run(IProgressMonitor progress) {
            	progress.beginTask("Getting Lyapunov trajectory", time.length);
    
				double[] maxPopulation = new double[time.length];
				for(int icount =0; icount < time.length; icount ++) {
					progress.worked(1);
					if(progress.isCanceled()) throw new OperationCanceledException();
					
					maxPopulation[icount] = 0.0;
					Iterator<String> iter = commonPhaseSpaceA.keySet().iterator();
					////////////////////////
					// all locations
					while(iter.hasNext()) {
						String id = iter.next();
						
						List<PhaseSpaceCoordinate> aData = commonPhaseSpaceA.get(id);
						List<PhaseSpaceCoordinate> bData = commonPhaseSpaceB.get(id);
										
						List<Double> population = totalPopulation.get(id);
						// y axis is Infectious
						double iA = aData.get(icount).getYValue();
						double iB = bData.get(icount).getYValue();
						
						// x axis is Susceptible
						double sA = aData.get(icount).getXValue();
						double sB = bData.get(icount).getXValue();
						
						double pop = population.get(icount).doubleValue();
						
						//double denom = (iA+iB)/2.0;
						// square of the average fraction of infectious people
						//denom *= denom; 
						if((iA>0.0)||(iB>0.0)) {
							// we have a location with nonzero data
							// weight by the total population
							locationCount[icount] += 1.0;
							maxPopulation[icount] += pop;
							trajectoryA[icount].integratePath(sA*pop, iA*pop) ;
							trajectoryB[icount].integratePath(sB*pop, iB*pop) ;
						}
					}// all locations
		            ////////////////////////
					
					// normalize 
					if(locationCount[icount] >= 1.0) {
						trajectoryA[icount].normalize(maxPopulation[icount]);
						trajectoryB[icount].normalize(maxPopulation[icount]);
					}
				}// for all time
		
				retVal.add(trajectoryA);
				retVal.add(trajectoryB);
				progress.done();
            } // run
		};
		
		try {
			runnableContext.run(true, true, task);
		} catch(InterruptedException ie) {
			return null;
		} catch(InvocationTargetException ive) {
			return null;
		}
		
		return retVal;	
	}// getLyapunovTrajectory()
	
	/**
	 * 
	 * @param trajectoryList
	 * @return the cumulative distance between the trajectories
	 */
	@SuppressWarnings("boxing")
	public static List<EList<Double>> getCumulativePhaseSpaceDeviation(List<PhaseSpaceCoordinate[]> trajectoryList) {
		List<EList<Double>> deviationList = new ArrayList<EList<Double>>();
		PhaseSpaceCoordinate[] referenceTrajectory = trajectoryList.get(0);
		
		int refSize = referenceTrajectory.length;
		int showSize = refSize;
		
		if(trajectoryList.size()>=2) {
			for (int i = 1; i < trajectoryList.size(); i ++ ) {
				PhaseSpaceCoordinate[] comparisonTrajectory = trajectoryList.get(i);
				int dataSize = comparisonTrajectory.length;
				if(dataSize< refSize) showSize = dataSize;
				
				EList<Double> deviation = new BasicEList<Double>(showSize);
				
				//double minDeviation = 999999.0;
				for (int j = 0; j < showSize; j ++) {
					deviation.add(j, 0.0);
					PhaseSpaceCoordinate ref = referenceTrajectory[j];
					PhaseSpaceCoordinate comp = comparisonTrajectory[j];
					deviation.set(j, deviation.get(j)+ref.getDistance(comp));
					if (j >= 1) deviation.set(j, deviation.get(j-1) + deviation.get(j));
				}
				/**
				 * take the log
				 */
				for (int j = 0; j < deviation.size(); j ++) {
					if(deviation.get(j) > 0.0) deviation.set(j, Math.log(deviation.get(j)));
				}
				deviationList.add(deviation);
			}
		}
		
		return deviationList;
	}
} // class MeanSquareDifference
