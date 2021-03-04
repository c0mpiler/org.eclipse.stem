/**
 */
package org.eclipse.stem.analysis.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.analysis.AnalysisFactory;
import org.eclipse.stem.analysis.AnalysisPackage;
import org.eclipse.stem.analysis.CompoundErrorFunction;
import org.eclipse.stem.analysis.ErrorResult;
import org.eclipse.stem.analysis.ReferenceScenarioDataMap;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Error Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.analysis.impl.CompoundErrorFunctionImpl#isUseDeaths <em>Use Deaths</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.impl.CompoundErrorFunctionImpl#isUseCumSum <em>Use Cum Sum</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.impl.CompoundErrorFunctionImpl#isUseDaily <em>Use Daily</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundErrorFunctionImpl extends ErrorFunctionImpl implements CompoundErrorFunction {
	/**
	 * The default value of the '{@link #isUseDeaths() <em>Use Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDeaths()
	 * @generated NOT
	 * @ordered
	 */
	protected static final boolean USE_DEATHS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseDeaths() <em>Use Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDeaths()
	 * @generated
	 * @ordered
	 */
	protected boolean useDeaths = USE_DEATHS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseCumSum() <em>Use Cum Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCumSum()
	 * @generated NOT
	 * @ordered
	 */
	protected static final boolean USE_CUM_SUM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseCumSum() <em>Use Cum Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCumSum()
	 * @generated
	 * @ordered
	 */
	protected boolean useCumSum = USE_CUM_SUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseDaily() <em>Use Daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDaily()
	 * @generated NOT
	 * @ordered
	 */
	protected static final boolean USE_DAILY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseDaily() <em>Use Daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDaily()
	 * @generated
	 * @ordered
	 */
	protected boolean useDaily = USE_DAILY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CompoundErrorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.COMPOUND_ERROR_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseDeaths() {
		return useDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDeaths(boolean newUseDeaths) {
		boolean oldUseDeaths = useDeaths;
		useDeaths = newUseDeaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DEATHS, oldUseDeaths, useDeaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseCumSum() {
		return useCumSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCumSum(boolean newUseCumSum) {
		boolean oldUseCumSum = useCumSum;
		useCumSum = newUseCumSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_CUM_SUM, oldUseCumSum, useCumSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseDaily() {
		return useDaily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDaily(boolean newUseDaily) {
		boolean oldUseDaily = useDaily;
		useDaily = newUseDaily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DAILY, oldUseDaily, useDaily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DEATHS:
				return isUseDeaths();
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_CUM_SUM:
				return isUseCumSum();
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DAILY:
				return isUseDaily();
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
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DEATHS:
				setUseDeaths((Boolean)newValue);
				return;
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_CUM_SUM:
				setUseCumSum((Boolean)newValue);
				return;
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DAILY:
				setUseDaily((Boolean)newValue);
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
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DEATHS:
				setUseDeaths(USE_DEATHS_EDEFAULT);
				return;
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_CUM_SUM:
				setUseCumSum(USE_CUM_SUM_EDEFAULT);
				return;
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DAILY:
				setUseDaily(USE_DAILY_EDEFAULT);
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
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DEATHS:
				return useDeaths != USE_DEATHS_EDEFAULT;
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_CUM_SUM:
				return useCumSum != USE_CUM_SUM_EDEFAULT;
			case AnalysisPackage.COMPOUND_ERROR_FUNCTION__USE_DAILY:
				return useDaily != USE_DAILY_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (useDeaths: ");
		result.append(useDeaths);
		result.append(", useCumSum: ");
		result.append(useCumSum);
		result.append(", useDaily: ");
		result.append(useDaily);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * input
	 */
	Map<String,List<Double>> commonDailyIncidenceLocationsMapA = new HashMap<String,List<Double>>();
	Map<String,List<Double>> commonDailyIncidenceLocationsMapB = new HashMap<String,List<Double>>();
	Map<String,List<Double>> commonCumIncidenceLocationsMapA = new HashMap<String,List<Double>>();
	Map<String,List<Double>> commonCumIncidenceLocationsMapB = new HashMap<String,List<Double>>();
	Map<String,List<Double>> commonCumDeathsLocationsMapA = new HashMap<String,List<Double>>();
	Map<String,List<Double>> commonCumDeathsLocationsMapB = new HashMap<String,List<Double>>();
	Map<String,List<Double>> commonPopulationLocationsA = new HashMap<String,List<Double>>();
	Map<String,List<Double>> commonPopulationLocationsB = new HashMap<String,List<Double>>();

	Map<String,Double> commonAvgPopulationLocationsA = new HashMap<String,Double>();
	Map<String,Double> commonAvgPopulationLocationsB = new HashMap<String,Double>();
	Map<String, Double> commonMaxLocationsA = new HashMap<String, Double>();
	
	/**
	 * number common locations with nonzero Inf count at time t
	 */
	public double[] locationCount;
	/**
	 * The Result
	 */
	public double[] meanSqDiff;
	/*
	 * time
	 */
	public double[] time;
	
	protected AnalysisFactory aFactory = new AnalysisFactoryImpl();

	// Set to true to weight the average by population size
	private static boolean AGGREGATE_NRMSE = true; // True if aggregate signal for locations first, then calculate NRMSE. False if use NRMSE per location then average.
	private static boolean WEIGHTED_AVERAGE = true; // Only used if AGGREGATE_NRMSE = false;
	//private static boolean FIT_INCIDENCE = true;
	private static boolean USE_THRESHOLD = false;
	private static double THRESHOLD = 0.05;
	
	// The year to use to validate and hence exclude from the error calculation(for cross-validation methods)
	// The first year is year 0. If no year should be excluded, set to -1
	
	int validationYear = -1;
	
	/**
	 * calculate delta for a simple error function
	 * 
	 * 
	 * @override
	 */
	
	@Override
	public ErrorResult calculateError(ReferenceScenarioDataMap reference, ReferenceScenarioDataMap data) {
		final ReferenceScenarioDataMapImpl _ref = (ReferenceScenarioDataMapImpl)reference;
		final ReferenceScenarioDataMapImpl _data = (ReferenceScenarioDataMapImpl)data;

		// clear
		time = null;
		
		Iterator<String> iteratorA = _ref.getLocations().iterator();
		int maxTime = -1;
		while(iteratorA.hasNext()) {
			String id = iteratorA.next();
					
			if(_data.containsLocation(id)) {
				// get the lists of data only for those locations that are common to both maps						ReferenceScenarioDataInstance dataMapA = mapA.getLocation(id);
				ReferenceScenarioDataInstance dataMapA = _ref.getLocation(id);
				List<Double> refDailyIncidenceList = null;
				
				refDailyIncidenceList = getData(referenceDataCompartment,dataMapA);
				//Added new
				List<Double> refCumDailyIncidenceList = getCumData(comparisonCompartment,dataMapA);
				List<Double> refCumDailyDeathsList = null;
				if(isUseDeaths()) {
				refCumDailyDeathsList = getDeaths(dataMapA);
				}
				
				List<Double> refPopulationList = getPopulation(dataMapA);
				commonDailyIncidenceLocationsMapA.put(id,refDailyIncidenceList);
				commonCumIncidenceLocationsMapA.put(id,refCumDailyIncidenceList);
				if(isUseDeaths()) {
					commonCumDeathsLocationsMapA.put(id,refCumDailyDeathsList);
				}
				commonPopulationLocationsA.put(id, refPopulationList);							
							
				// Map B
				ReferenceScenarioDataInstance dataMapB = _data.getLocation(id);
				List<Double> predDailyIncidenceList = null;
				
				predDailyIncidenceList = getData(comparisonCompartment,dataMapB);
				
				//Added new
				List<Double> predCumDailyIncidenceList = getCumData(comparisonCompartment,dataMapB);
				List<Double> predCumDailyDeathsList = null;
				if(isUseDeaths()) {
				 predCumDailyDeathsList= getDeaths(dataMapB);
				}
				
				List<Double> predPopulationList = getPopulation(dataMapB);
				commonDailyIncidenceLocationsMapB.put(id,predDailyIncidenceList);
				commonCumIncidenceLocationsMapB.put(id,predCumDailyIncidenceList);
				if(isUseDeaths()) {
				commonCumDeathsLocationsMapB.put(id,predCumDailyDeathsList);
				}
				commonPopulationLocationsB.put(id, predPopulationList);
				
				// init the array size
				if (maxTime == -1) maxTime = refDailyIncidenceList.size();
						
				// dimension the arrays to the length of the SMALLEST array for which we have data
				if(maxTime >= predDailyIncidenceList.size() ) maxTime = predDailyIncidenceList.size();
				if(maxTime >= refDailyIncidenceList.size() ) maxTime = refDailyIncidenceList.size();
			}// if
		}// while
		
		
		if(maxTime<=0) maxTime = 0;
		if(time==null) {
			time = new double[maxTime];
			meanSqDiff = new double[maxTime];
			locationCount = new double[maxTime];
			for(int i = 0; i < maxTime; i ++) {
				time[i] = i;
				meanSqDiff[i] = 0.0;
				locationCount[i] = 0.0;
			}
		}
		
		//call the function to get the error for daily incidence,cumulative and deaths
		
	    //formerly called just list
		BasicEList<Double> errorListDailyIncidence = new BasicEList<Double>();
		BasicEList<Double> errorListCumIncidence = new BasicEList<Double>();
		BasicEList<Double> errorListCumDeaths = new BasicEList<Double>();
		
		double[] errorsDailyIncidence = null, errorsCumIncidence = null,errorsCumDeath = null;
		if(isUseDaily()) {
		errorsDailyIncidence = getSpecificErrors(commonDailyIncidenceLocationsMapA,commonDailyIncidenceLocationsMapB,errorListDailyIncidence);
		}
		if(isUseCumSum()) {
		errorsCumIncidence = getSpecificErrors(commonCumIncidenceLocationsMapA,commonCumIncidenceLocationsMapB,errorListCumIncidence);
		}
		if(isUseDeaths()) {
		errorsCumDeath = getSpecificErrors(commonCumDeathsLocationsMapA,commonCumDeathsLocationsMapB,errorListCumDeaths);
		}
		// Now figure out the actual error
		BasicEList<Double>list = takeAverage(errorListDailyIncidence,errorListCumIncidence,errorListCumDeaths);
		double dailyIncidenceFinalError = 0,cumIncidenceFinalError=0,cumDeathFinalError=0;
		double dailyIncidenceVError = 0,cumIncidenceVError=0,cumDeathVError=0;
		if(errorsDailyIncidence!=null) {
			dailyIncidenceFinalError = errorsDailyIncidence[0];
			dailyIncidenceVError = errorsDailyIncidence[1];
		}
		if(errorsCumIncidence!=null) {
			cumIncidenceFinalError = errorsCumIncidence[0];
			cumIncidenceVError = errorsCumIncidence[1];
		}

		if(errorsCumDeath!=null) {
			cumDeathFinalError = errorsCumDeath[0];
			cumDeathVError = errorsCumDeath[1];
		}
		double finalerror = takeAverage(dailyIncidenceFinalError,cumIncidenceFinalError,cumDeathFinalError);
		double verror = takeAverage(dailyIncidenceVError,cumIncidenceVError,cumDeathVError);
		
		
		ErrorResult resultobj = aFactory.createErrorResult();
		resultobj.setErrorByTimeStep(list);
		resultobj.setError(finalerror);
		resultobj.setValidationError(verror);
		
		EList<Double>refByTime = new BasicEList<Double>();
		EList<Double>dataByTime = new BasicEList<Double>();
		
		// Set the reference and model by time
		for(int icount=0;icount<time.length;++icount) {
			refByTime.add(0.0);dataByTime.add(0.0);}
		for(String loc:commonDailyIncidenceLocationsMapA.keySet()) {
		 	for(int icount =0; icount < time.length; icount ++) {
				List<Double> dataAI = commonDailyIncidenceLocationsMapA.get(loc);
				List<Double> dataBI = commonDailyIncidenceLocationsMapB.get(loc);
												
				double iA = dataAI.get(icount).doubleValue();
				double iB = dataBI.get(icount).doubleValue();
			
				refByTime.set(icount, refByTime.get(icount)+iA);
				dataByTime.set(icount, dataByTime.get(icount)+iB);
			}
		}
		resultobj.setReferenceByTime(refByTime);
		resultobj.setModelByTime(dataByTime);
		return resultobj;	
	}
	
	/***
	 * Function that takes averages of the three double values
	 * @param error1
	 * @param error2
	 * @param error3
	 * @return
	 */
	private double takeAverage(double error1, double error2, double error3) {
		
		int counter=0;
		
		if(isUseCumSum()) {
			counter++;
		}
		if(isUseDaily()) {
			counter++;
		}
		if(isUseDeaths()) {
			counter++;
		}
		
		return (error1+error2+error3)/counter;
	}

	/***
	 * Function that takes average of the individual values across the three list
	 * @param errorListDailyIncidence
	 * @param errorListCumIncidence
	 * @param errorListCumDeaths
	 * @return
	 */
	private BasicEList<Double> takeAverage(BasicEList<Double> errorListDailyIncidence,
			BasicEList<Double> errorListCumIncidence, BasicEList<Double> errorListCumDeaths) {
		int counter=0;
		int dailyIncidenceSize =-1;
		int cumIncidenceSize =-1;
		int cumDeathsSize =-1;
		int totalSize=-1;

		
		if(isUseCumSum()) {
			counter++;
			cumIncidenceSize = errorListCumIncidence.size();
		}
		if(isUseDaily()) {
			counter++;
			dailyIncidenceSize = errorListDailyIncidence.size();
			
		}
		if(isUseDeaths()) {
			counter++;
			cumDeathsSize = errorListCumDeaths.size();
		}
		
		if(dailyIncidenceSize!=-1) {
			totalSize = dailyIncidenceSize;
		}
		if (cumIncidenceSize!=-1) {
			if(totalSize==-1) {
			totalSize  = cumIncidenceSize;
			}else {
				if(totalSize!=cumIncidenceSize) {
					//handle error if the lists are not of same size
				}
			}
		}
		
		if (cumDeathsSize!=-1) {
			if(totalSize==-1) {
				totalSize  = cumDeathsSize;
			}else {
				if(totalSize!=cumDeathsSize) {
						//handle error if the lists are not of same size
				}
			}
		}
		
		BasicEList<Double> avgList=new BasicEList<Double>(Collections.nCopies(totalSize, 0.0));
		
		if(isUseCumSum()) {
			avgList = sumTwoLists(avgList,errorListCumIncidence);
			
		}
		if(isUseDaily()) {
			avgList = sumTwoLists(avgList,errorListDailyIncidence);
		}
		if(isUseDeaths()) {
			avgList = sumTwoLists(avgList,errorListCumDeaths);
		}
		for(int i=0;i<totalSize;i++) {
			avgList.set(i, avgList.get(i)/counter);
		}
		
		
		return avgList;
		
	}

	private BasicEList<Double> sumTwoLists(BasicEList<Double> avgList, BasicEList<Double> errorList) {
		for(int i=0;i<avgList.size();i++) {
			avgList.set(i, avgList.get(i)+ errorList.get(i));
		}
		return avgList;
	}

	
	
	
	/**
	 * calculate the individual error(s) contributing to the compound error function
	 * (a user defined combination of cumulative incidence, daily incidence, and deaths
	 * 
	 */
	public double[] getSpecificErrors(Map<String,List<Double>>commonDailyIncidenceLocationsMapA,Map<String,List<Double>>commonDailyIncidenceLocationsMapB,BasicEList<Double> list) {
		double[] errors 	= new double[2];//contains error and verror
		double[] Xref 		= new double[time.length];
		double[] Xdata 		= new double[time.length];
		double finalerror 	= 0.0;
	    double verror 		= 0.0;
		for(int i=0;i<time.length;++i) list.add(0.0);
		// Get the average population for each location
		for(String loc:commonPopulationLocationsA.keySet()) {
			List<Double>ld = commonPopulationLocationsA.get(loc);
			double sum = 0;for(double d:ld)sum+=d;
			sum /= (double)ld.size();
			commonAvgPopulationLocationsA.put(loc, sum);
		}	
		// Get the average population for each location
		for(String loc:commonPopulationLocationsB.keySet()) {
			List<Double>ld = commonPopulationLocationsB.get(loc);
			double sum = 0;for(double d:ld)sum+=d;
			sum /= (double)ld.size();
			commonAvgPopulationLocationsB.put(loc, sum);
		}	
		// Get the maximum value for the A series (reference)
		for(String loc:commonPopulationLocationsA.keySet()) {
			List<Double>ld = commonDailyIncidenceLocationsMapA.get(loc);
			double max = Double.MIN_VALUE;
			for(double d:ld)if(d >max)max=d;
			commonMaxLocationsA.put(loc, max);
		}
		// Calculate the normalized root mean square error for each location, then
		// divide by the number of locatins
		double weighted_denom = 0.0;
		if(!AGGREGATE_NRMSE) { // Use NRMSE per location first
			for(String loc:commonDailyIncidenceLocationsMapA.keySet()) {
				double maxRef = 0.0;
				double minRef = Double.MAX_VALUE;
				// Get the numbers at each time step for the location
				for(int icount =0; icount < time.length; icount ++) {
					List<Double> dataAI = commonDailyIncidenceLocationsMapA.get(loc);
					List<Double> dataBI = commonDailyIncidenceLocationsMapB.get(loc);
					double iA = dataAI.get(icount).doubleValue();
					double iB = dataBI.get(icount).doubleValue();
					Xref[icount]=iA;
					Xdata[icount]=iB;
				}
				double nominator = 0.0; 
				double timesteps = 0;
				for(int icount =0; icount < time.length; icount ++) {
					if(Xref[icount]>maxRef)maxRef = Xref[icount];
					if(Xref[icount]<minRef)minRef = Xref[icount];
					// If we use the threshold and both the reference and the model is less than
					// the THRESHOLD*MAXref(loc) we don't measure the data point
					if(USE_THRESHOLD && (Xref[icount]<=THRESHOLD*commonMaxLocationsA.get(loc) &&
							Xdata[icount]<=THRESHOLD*commonMaxLocationsA.get(loc))) continue;
					nominator = nominator + Math.pow(Xref[icount]-Xdata[icount], 2);
					list.set(icount, list.get(icount)+Math.abs(Xref[icount]-Xdata[icount]));
					++timesteps;
				}
				double error = Double.MAX_VALUE;
				 BigDecimal maxRefBD = new BigDecimal(maxRef);
				 BigDecimal minRefBD = new BigDecimal(minRef);
			    if(timesteps > 0) {
			    	error = Math.sqrt(nominator/timesteps);
			    	if(maxRefBD.subtract(minRefBD).doubleValue() > 0.0) {
			    		error = error / (maxRef-minRef);
			    	}
			    	// else NOTHING. we still need the unnormalized error to find the minimum
			    	
			    	if(WEIGHTED_AVERAGE) finalerror += commonAvgPopulationLocationsA.get(loc) * error;
			    	else finalerror += error;
			    	if(WEIGHTED_AVERAGE) weighted_denom += commonAvgPopulationLocationsA.get(loc);
			    	else weighted_denom += 1.0;
			    }
			}
			// Divide the error by the number of locations
			finalerror /= weighted_denom; 
		} else { // Aggregate signal, then calculate NRMSE 
			for(int icount =0; icount < time.length; icount ++) {
				for(String loc:commonDailyIncidenceLocationsMapA.keySet()) {
					List<Double> dataAI = commonDailyIncidenceLocationsMapA.get(loc);
					List<Double> dataBI = commonDailyIncidenceLocationsMapB.get(loc);
					double iA = dataAI.get(icount).doubleValue();
					double iB = dataBI.get(icount).doubleValue();
					Xref[icount]+=iA;
					Xdata[icount]+=iB;
				}
			}
			double maxRef 			= Double.MIN_VALUE;
			double minRef 			= Double.MAX_VALUE;
			double maxValidationRef = Double.MIN_VALUE;
			double minValidationRef = Double.MAX_VALUE;
			for(int icount =0; icount < time.length; icount ++) {
				if(icount >= validationYear*365.25 && icount <= (validationYear+1)*365.25) {
					if(Xref[icount]>maxValidationRef)maxValidationRef = Xref[icount];
					if(Xref[icount]<minValidationRef)minValidationRef = Xref[icount];
					continue;
				}
				if(Xref[icount]>maxRef)maxRef = Xref[icount];
				if(Xref[icount]<minRef)minRef = Xref[icount];
			}
			double nominator = 0.0, vnominator = 0.0;
			double timesteps = 0.0, vtimesteps = 0.0;
			for(int icount =0; icount < time.length; icount ++) {
				// Calculate validation error then skip
				if(icount >= validationYear*365.25 && icount <= (validationYear+1)*365.25) {
					if(USE_THRESHOLD && (Xref[icount]<=THRESHOLD*maxValidationRef &&
							Xdata[icount]<=THRESHOLD*maxValidationRef)) continue;
					vnominator = vnominator + Math.pow(Xref[icount]-Xdata[icount], 2);
					list.set(icount, Double.valueOf(0)); // Set to 0 for validation data points
					++vtimesteps;
					continue;
				}
				// If we use the threshold and both the reference and the model is less than
				// the THRESHOLD*MAXref(loc) we don't measure the data point
				if(USE_THRESHOLD && (Xref[icount]<=THRESHOLD*maxRef &&
						Xdata[icount]<=THRESHOLD*maxRef)) continue;
				nominator = nominator + Math.pow(Xref[icount]-Xdata[icount], 2);
				list.set(icount, Math.abs(Xref[icount]-Xdata[icount]));
				++timesteps;
			}
			 BigDecimal maxRefBD = new BigDecimal(maxRef).setScale(5,RoundingMode.DOWN);
			 BigDecimal minRefBD = new BigDecimal(minRef).setScale(5,RoundingMode.DOWN);
			 BigDecimal maxValidationRefBD = new BigDecimal(maxValidationRef).setScale(5,RoundingMode.DOWN);
			 BigDecimal minValidationRefBD = new BigDecimal(minValidationRef).setScale(5,RoundingMode.DOWN);
			double error = Double.MAX_VALUE;
		    if(timesteps > 0) {
		    	error = Math.sqrt(nominator/timesteps);
		    	if(maxRefBD.subtract(minRefBD).doubleValue() > 0.0) {
			    	finalerror = error / (maxRef-minRef);
		    	}
		    	else if(maxRefBD.subtract(minRefBD).doubleValue() ==0) {
		    		// else NOTHING really. we still need the unnormalized error to find the minimum
		    		finalerror=error;// if all values in the reference data is 0
		    	}
		    }
		    // Validation
		    error = Double.MAX_VALUE;
		    if(vtimesteps > 0) {
		    	error = Math.sqrt(vnominator/vtimesteps);
		    	if(maxValidationRefBD.subtract(minValidationRefBD).doubleValue() > 0.0) {
		    		verror = error / (maxValidationRef-minValidationRef);
		    	}else if(maxValidationRefBD.subtract(minValidationRefBD).doubleValue()==0) {
		    		// else NOTHING really. we still need the unnormalized error to find the minimum
		    		verror = error;// if all values in the reference data is 0
		    	}
		    }
		} // else
		errors[0]=finalerror;
		errors[1]=verror;
		return errors;
	}

} //CompoundErrorFunctionImpl
