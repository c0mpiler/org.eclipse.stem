package org.eclipse.stem.populationmodels.standard.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/


import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.EarthScienceLabel;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.populationmodels.standard.MosquitoPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabelValue;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mosquito Population Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.MosquitoPopulationModelImpl#getScalingFactor <em>Scaling Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.MosquitoPopulationModelImpl#getMortalityRate <em>Mortality Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.MosquitoPopulationModelImpl#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MosquitoPopulationModelImpl extends PopulationModelImpl implements MosquitoPopulationModel {
	
	final static double TRAP_AREA = Math.PI* 0.05*0.05;
	static double MAX_BITE_RATE = 0.0;
	final static double MISSING_DATA = 99999.0;
	final static int REPEAT_ES_YEAR_CYCLES = 10;
	
	/**
	 * The default value of the '{@link #getScalingFactor() <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALING_FACTOR_EDEFAULT = 1.0;
	
	static double maxPerPersonDen = 0.0;
	static double maxAreaTrapCount = 0.0; // assuming 15m trap radius
	static double maxPop = 0.0;
	static double maxHumans = 1.0;

	/**
	 * The cached value of the '{@link #getScalingFactor() <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingFactor()
	 * @generated
	 * @ordered
	 */
	protected double scalingFactor = SCALING_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMortalityRate() <em>Mortality Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMortalityRate()
	 * @generated
	 * @ordered
	 */
	protected static final double MORTALITY_RATE_EDEFAULT = 0.05;

	/**
	 * The cached value of the '{@link #getMortalityRate() <em>Mortality Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMortalityRate()
	 * @generated
	 * @ordered
	 */
	protected double mortalityRate = MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = "human";

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MosquitoPopulationModelImpl() {
		super();
	}

	
	@Override
	public PopulationModelLabel createPopulationModelLabel(String populationIdentifier) {
		PopulationModelLabel retValue = StandardFactory.eINSTANCE.createStandardPopulationModelLabel();
		retValue.setTypeURI(PopulationModelLabel.URI_TYPE_DYNAMIC_POPULATION_LABEL);
		return retValue;
	}
	
	@Override
	public PopulationModelLabelValue createPopulationModelLabelValue(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue();
	}
	
	SortedSet<Double> densities = new TreeSet<Double>();
	
	double totalTemp;
	double totalRainfal;
	int totalRegions;
	
	/**
	 * Compute the changes in the mosquito population using earth science data
	 * 
	 * @param time
	 * @param t Continous time determine by integrator
	 * @param timeDelta
	 * @param labels
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta,
			EList<DynamicLabel> labels) {
	
		totalRainfal = 0;
		totalRegions = 0;
		totalTemp = 0;
		
		Calendar c = Calendar.getInstance();
		// Date now = time.getTime();
		
		long iPart;
		double fPart;

		// Get the fractional part
		iPart = (long) t;
		fPart = t - iPart;
		
		long fracMillis = (long)((double)timeDelta * fPart);
		
		STEMTime actualTime = time.addIncrement(fracMillis);
		c.setTime(actualTime.getTime());
		int month = c.get(Calendar.MONTH); // deprecated but still works
		int nextMonth = month+1;
		int year = c.get(Calendar.YEAR);
		int nextMonthYear = year;
		if (nextMonth > 11) {
			nextMonth = 0;
			nextMonthYear = year+1;
		}
		
		double dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		double hourOfDay = c.get(Calendar.HOUR_OF_DAY);
		double minOfHour = c.get(Calendar.MINUTE);
		double secondOfMinute = c.get(Calendar.SECOND);
		
		double daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH); 
		
		double preciseDayInMonth = dayOfMonth+hourOfDay/24.0+minOfHour/(24.0*60)+secondOfMinute/(24*60*60);
		
		// Fix for 1.4 RC2 
		// Substract one to get a number between 0 and 31
		preciseDayInMonth -= 1.0;
		
		double fraction = preciseDayInMonth/daysInMonth;
		
		for(DynamicLabel label:labels) {
			StandardPopulationModelLabelImpl slabel = (StandardPopulationModelLabelImpl)label;
			
			if(checkAndAdjustForNegative(slabel))
				continue;
			
			StandardPopulationModelLabelValueImpl delta = (StandardPopulationModelLabelValueImpl)slabel.getDeltaValue();
			StandardPopulationModelLabelValue current = (StandardPopulationModelLabelValue)slabel.getProbeValue();
			
			double currentPopulation = current.getCount();
			
			
			// Get the elevation 
			 Node n = slabel.getNode();
			 double elevation = 0; 
			 double temperature = 0;
			 double rainfall = 0;
			 double vegetation = 0;
			
			 double temperature0 = 0;
			 double rainfall0 = 0;
			 double vegetation0 = 0;
			
			 double temperature1 = 0;
			 double rainfall1 = 0;
			 double vegetation1 = 0;
			 double area = -1.0;
			 // double humans = 1.0;
			 
			 Map<Integer, EarthScienceLabel> tempES = new HashMap<Integer,EarthScienceLabel>();
			 Map<Integer, EarthScienceLabel> rainES = new HashMap<Integer,EarthScienceLabel>();
			 Map<Integer, EarthScienceLabel> vegES = new HashMap<Integer,EarthScienceLabel>();
			 EarthScienceLabel firstTempES = null;
			 EarthScienceLabel firstRainES = null;
			 EarthScienceLabel firstVegES = null;
			 
			 for(NodeLabel nl:n.getLabels()) {
				 
				 if(nl instanceof AreaLabel) {
					 area = ((AreaLabel)nl).getCurrentAreaValue().getArea();
				 } else
				 if(nl instanceof PopulationLabel) {
					 String popType = ((PopulationLabel)nl).getPopulationIdentifier();
					 if(popType.equalsIgnoreCase("human")) {
						// humans= ((PopulationLabel)nl).getCurrentPopulationValue().getCount();
					 }
				 } else
				 if(nl instanceof EarthScienceLabel && ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getDataType().equals("elevation")) {
					 elevation = ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getMean().get(0).doubleValue();
				 } else if(nl instanceof EarthScienceLabel && ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getDataType().equals("nighttemp")) {
					 if(firstTempES == null) firstTempES =  ((EarthScienceLabel)nl);
					 tempES.put(((EarthScienceLabel)nl).getCurrentEarthScienceValue().getValidYear()%REPEAT_ES_YEAR_CYCLES, (EarthScienceLabel)nl);
				 } else if(nl instanceof EarthScienceLabel && ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getDataType().equals("rainfall")) {
					 if(firstRainES == null) firstRainES =  ((EarthScienceLabel)nl);
					 rainES.put(((EarthScienceLabel)nl).getCurrentEarthScienceValue().getValidYear()%REPEAT_ES_YEAR_CYCLES, (EarthScienceLabel)nl); 
				 } else if(nl instanceof EarthScienceLabel && ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getDataType().equals("vegetation")) {
					 if(firstVegES == null) firstVegES =  ((EarthScienceLabel)nl);
					 vegES.put(((EarthScienceLabel)nl).getCurrentEarthScienceValue().getValidYear()%REPEAT_ES_YEAR_CYCLES, (EarthScienceLabel)nl);
				 }
			 }
			
			int modYear = year % REPEAT_ES_YEAR_CYCLES; // If we're running with all 10 years of earth science data cycle through them
			int modNextMonthYear = nextMonthYear % REPEAT_ES_YEAR_CYCLES;
			
			EarthScienceLabel eslYear = tempES.get(modYear);
			EarthScienceLabel eslNextMonthYear = tempES.get(modNextMonthYear);
			if(eslYear == null) eslYear = firstTempES;
			if(eslNextMonthYear == null) eslNextMonthYear = firstTempES;
			if(eslYear != null && eslNextMonthYear != null) {
				temperature0 =eslYear.getCurrentEarthScienceValue().getMean().get(month).doubleValue();
				temperature1 = eslNextMonthYear.getCurrentEarthScienceValue().getMean().get(nextMonth).doubleValue();
				// interpolate
				temperature = (fraction*temperature1) +(1.0-fraction)*temperature0;
			}

			eslYear = rainES.get(modYear);
			eslNextMonthYear = rainES.get(modNextMonthYear);
			if(eslYear == null) eslYear = firstRainES;
			if(eslNextMonthYear == null) eslNextMonthYear = firstRainES;
			if(eslYear != null && eslNextMonthYear != null) {
				rainfall0 =eslYear.getCurrentEarthScienceValue().getMean().get(month).doubleValue();
				rainfall1 = eslNextMonthYear.getCurrentEarthScienceValue().getMean().get(nextMonth).doubleValue();
				// interpolate
				rainfall = (fraction*rainfall1) +(1.0-fraction)*rainfall0;
			}
			
			eslYear = vegES.get(modYear);
			eslNextMonthYear = vegES.get(modNextMonthYear);
			if(eslYear == null) eslYear = firstVegES;
			if(eslNextMonthYear == null) eslNextMonthYear = firstVegES;
			if(eslYear != null && eslNextMonthYear != null) {
				vegetation0 =eslYear.getCurrentEarthScienceValue().getMean().get(month).doubleValue();
				vegetation1 = eslNextMonthYear.getCurrentEarthScienceValue().getMean().get(nextMonth).doubleValue();
				// interpolate
				vegetation = (fraction*vegetation1) +(1.0-fraction)*vegetation0;
			}

			// If the model does not contain the earth science data, the
			// defaults above will be used
			// ELEVATION
			// final double ELEVATION_SLOPE = 0.125;
			final double ElEVATION_PEAK = 400.0;
			double eFactor = 0.0;
			/*
						if (elevation <= ElEVATION_PEAK && elevation > 0.0) {
							eFactor = ELEVATION_SLOPE * elevation;
						} else {
							final double ELEVATION_DOWN_SLOPE = -0.0625; // down to 1200
																			// meters (not
																			// 800) TOM
							eFactor = Math
									.max(0.0,
											(ElEVATION_PEAK * ELEVATION_SLOPE)
													+ (ELEVATION_DOWN_SLOPE * (elevation - ElEVATION_PEAK)));
							// eFactor = Math.max(0.0,(ElEVATION_PEAK*ELEVATION_SLOPE) -
							// (ELEVATION_SLOPE*(elevation-ElEVATION_PEAK)));
						}
			 */
			if (elevation <= ElEVATION_PEAK) {
				eFactor = 1.0;
			} else {
				final double ELEVATION_DOWN_SLOPE = -0.00125; // 0 down to 1200

				eFactor = Math
						.max(0.0,
								1+
								+ (ELEVATION_DOWN_SLOPE * (elevation - ElEVATION_PEAK)));
			}

			// If the model does not contain the earth science data, the defaults above will be used
			// ELEVATION
			/*final double ELEVATION_SLOPE = 0.125;
			final double ElEVATION_PEAK = 400.0;
			double eFactor =0.0;
			if(elevation <= ElEVATION_PEAK && elevation > 0.0) {			
				eFactor = ELEVATION_SLOPE*elevation;
			} else {
				final double ELEVATION_DOWN_SLOPE = -0.0625; //down to 1200 meters (not 800) TOM
				eFactor = Math.max(0.0,(ElEVATION_PEAK*ELEVATION_SLOPE) + (ELEVATION_DOWN_SLOPE*(elevation-ElEVATION_PEAK)));
				//eFactor = Math.max(0.0,(ElEVATION_PEAK*ELEVATION_SLOPE) - (ELEVATION_SLOPE*(elevation-ElEVATION_PEAK)));
			}
			*/
			// RAINFALL - just make it linear
			double rFactor = rainfall;
			
			// The function is  (-4.4 + (1.31*t) - (.03*t.^2)).*(0.00554.*t - 0.06737);
			// Essentially a combination of birth rates and death rate 
			//
			// reference: http://www.cell.com/trends/parasitology/abstract/S0169-4758%2899%2901396-4
			// Trends in Parasitology, Volume 15, Issue 3, 105-111, 1 March 1999
			// A Climate-based Distribution Model of Malaria Transmission in Sub-Saharan Africa
			// M.H. Craig, R.W. Snow and D. le Sueur
			
			//final double TAVG = 30; // ref says 27C
			//final double sigma = 3.0;
			//double arg = -1.0*Math.pow((temperature - TAVG),2) / (2.0*sigma*sigma);
			//double tFactor = 1/Math.sqrt(2*Math.PI*sigma*sigma)*Math.exp(arg);
			
			double tFactor =  (-4.4 + (1.31*temperature) - (.03*Math.pow(temperature, 2)))*(0.00554*temperature - 0.06737);
			tFactor = (temperature<16 || temperature>40)?0:tFactor;
			
			// vegetation linear model above 
			double vFactor = Math.max(0.0, (vegetation-0.3));
			
			//equalize all factors (Tom)
//			eFactor*=1;
//			rFactor*=.1;
//			tFactor*=10000;
//			vFactor*=100;
			//Another idea: factor matrix of [elevation][rainfall][temperature][vegetation]
			//	double [][][][] factorMatrix = new double[10][10][10][10];
			
			//double newPopulation = scalingFactor * temperature * rainfall / elevation;
			vFactor = 1.0;
			double mosquitoArealDensity = getScalingFactor() * (eFactor*tFactor)*(vFactor*rFactor);
			
			mosquitoArealDensity = mosquitoArealDensity + 1.14;
			// Other Factors
			//Evapo-transpiration
			//wind speed
			//sunlight exposure
			//size of still water
			//size of region
			
			
			//size of its food e.g. humans, cattles,
			
			// Find the host population model label
			// and scale with the population number.
			// If not found, the population model becomes
			// a model of potential mosquitos / person instead.
			
			StandardPopulationModelLabel pml = findStandardPopulationModelLabel(n, getHost());
			double numHuman = 0.0;
			if(pml != null){
					numHuman = ((StandardPopulationModelLabelValue)pml.getTempValue()).getCount();
			}
			
			double humanArealDensity = numHuman/area;
			if(humanArealDensity > 16989.0) { // monaco
//				System.err.println("Density "+humanArealDensity+" Location "+slabel.getIdentifiable().getURI().lastSegment()+" name: "+GeographicNames.getName(slabel.getIdentifiable().getURI().lastSegment()));				
			}
			
			double feedingMosquitos = mosquitoArealDensity * TRAP_AREA;
			
			double humansPerTrapArea = humanArealDensity * TRAP_AREA;
			
			@SuppressWarnings("unused")
			double feedingMosquitosPerPerson = 0.0;
			double mosquitoScaling = 1.0;
			
			// If there are less than 1 person in the trap area
			// mosquito population cannot be sustained and 
			// the population drops of by the actual number of
			// people in the trap area. For human densities
			// higher than that we assume mosquito population
			// can always be sustained.
			if(humansPerTrapArea < 1.0) mosquitoScaling = humansPerTrapArea;
			
			feedingMosquitos = feedingMosquitos * mosquitoScaling;
			
			if(humansPerTrapArea > 0.0)
				feedingMosquitosPerPerson = feedingMosquitos / humansPerTrapArea;
			
			//double newPopulation = feedingMosquitosPerPerson * numHuman;
			double newPopulation = mosquitoArealDensity;
			// double biteRate = feedingMosquitosPerPerson * 8E-3;
	
/*			synchronized(this) {
				if(biteRate > MAX_BITE_RATE) {
					MAX_BITE_RATE = biteRate;
					System.out.println("MAX BITE RATE: "+MAX_BITE_RATE);
					System.out.println("Temp: "+temperature+" rainfall: "+rainfall+" vegetaton: "+vegetation+" Location "+slabel.getIdentifiable().getURI().lastSegment()+" time: "+time);				
				}
			}
*/			
			// TEST CODE
			/*
			 * 
			if(newPopulation > maxPop) {
				maxHumans = humans;
				maxPop = newPopulation;
				double den = maxPop/(humans*24*10000);
				if(den >=maxPerPersonDen) maxPerPersonDen = den;
				
				double trapped = (675*maxPop)/(area*1000000.0);
				if(trapped > maxAreaTrapCount) {
					maxAreaTrapCount=trapped;
				}
				
				// TESTING
				Activator.logInformation("mosquito Population = "+maxPop+" humans = "+humans);	
				Activator.logInformation("found maxperson mosquito density = "+maxPerPersonDen+ " expected trap count = "+maxAreaTrapCount+" mosquitos / person max:"+maxPop/maxHumans+" "+0.05*maxPop/maxHumans);	
				
			}
			*
			*/
			double pdelta =  newPopulation - currentPopulation;
			
			if(currentPopulation == 0.0 && pdelta < 0)
				System.out.println("Problem");
			// Births and deaths are set to the current population times the mosquito mortality rate.
			// Then we adjust either the births or deaths to grow or shrink the population
					
			double adjustedMortalityRate = this.getMortalityRate() * ((double)timeDelta/(double)getTimePeriod());
			
			double births = current.getCount() * adjustedMortalityRate;
			double deaths = births;
			
			
			if(pdelta > 0) 
				births += pdelta;
				else {
					births +=pdelta; // Subtract from births
					if(births < 0) {
						deaths -=births;
						births = 0;
					}
				}
			
			
			delta.setCount(pdelta);
			delta.setBirths(births);
			delta.setDeaths(deaths);
						
			computeAdditionalDeltasAndExchanges(slabel, time, t, timeDelta);
		}
	}// calculateDelta
	
	
	
	StandardPopulationModelLabel findStandardPopulationModelLabel(Node n, String identifier) {
		for(NodeLabel nl:n.getLabels()) {
			if(nl instanceof StandardPopulationModelLabel
					&& ((StandardPopulationModelLabel)nl).getPopulationIdentifier().equals(identifier))
				return (StandardPopulationModelLabel)nl;
		}
		return null;
	}
	
	public boolean isDeterministic() {
		return true;
	}
	
	public void doModelSpecificAdjustments(LabelValue label) {
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.MOSQUITO_POPULATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScalingFactor() {
		return scalingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalingFactor(double newScalingFactor) {
		scalingFactor = newScalingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMortalityRate() {
		return mortalityRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMortalityRate(double newMortalityRate) {
		mortalityRate = newMortalityRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		host = newHost;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.MOSQUITO_POPULATION_MODEL__SCALING_FACTOR:
				return getScalingFactor();
			case StandardPackage.MOSQUITO_POPULATION_MODEL__MORTALITY_RATE:
				return getMortalityRate();
			case StandardPackage.MOSQUITO_POPULATION_MODEL__HOST:
				return getHost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.MOSQUITO_POPULATION_MODEL__SCALING_FACTOR:
				setScalingFactor((Double)newValue);
				return;
			case StandardPackage.MOSQUITO_POPULATION_MODEL__MORTALITY_RATE:
				setMortalityRate((Double)newValue);
				return;
			case StandardPackage.MOSQUITO_POPULATION_MODEL__HOST:
				setHost((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.MOSQUITO_POPULATION_MODEL__SCALING_FACTOR:
				setScalingFactor(SCALING_FACTOR_EDEFAULT);
				return;
			case StandardPackage.MOSQUITO_POPULATION_MODEL__MORTALITY_RATE:
				setMortalityRate(MORTALITY_RATE_EDEFAULT);
				return;
			case StandardPackage.MOSQUITO_POPULATION_MODEL__HOST:
				setHost(HOST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.MOSQUITO_POPULATION_MODEL__SCALING_FACTOR:
				return scalingFactor != SCALING_FACTOR_EDEFAULT;
			case StandardPackage.MOSQUITO_POPULATION_MODEL__MORTALITY_RATE:
				return mortalityRate != MORTALITY_RATE_EDEFAULT;
			case StandardPackage.MOSQUITO_POPULATION_MODEL__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scalingFactor: ");
		result.append(scalingFactor);
		result.append(", mortalityRate: ");
		result.append(mortalityRate);
		result.append(", host: ");
		result.append(host);
		result.append(')');
		return result.toString();
	}

} //MosquitoPopulationModelImpl