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

package org.eclipse.stem.analysis.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.stem.analysis.AnalysisPackage;
import org.eclipse.stem.analysis.ErrorFunction;
import org.eclipse.stem.analysis.ErrorResult;
import org.eclipse.stem.analysis.ReferenceScenarioDataMap;
import org.eclipse.stem.analysis.States;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.analysis.impl.ErrorFunctionImpl#getReferenceDataCompartment <em>Reference Data Compartment</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.impl.ErrorFunctionImpl#getComparisonCompartment <em>Comparison Compartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorFunctionImpl extends EObjectImpl implements ErrorFunction {
	/**
	 * The default value of the '{@link #getReferenceDataCompartment() <em>Reference Data Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDataCompartment()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_DATA_COMPARTMENT_EDEFAULT = "Incidence";
	/**
	 * The cached value of the '{@link #getReferenceDataCompartment() <em>Reference Data Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDataCompartment()
	 * @generated
	 * @ordered
	 */
	protected String referenceDataCompartment = REFERENCE_DATA_COMPARTMENT_EDEFAULT;
	/**
	 * The default value of the '{@link #getComparisonCompartment() <em>Comparison Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonCompartment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARISON_COMPARTMENT_EDEFAULT = "Incidence";
	/**
	 * The cached value of the '{@link #getComparisonCompartment() <em>Comparison Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonCompartment()
	 * @generated
	 * @ordered
	 */
	protected String comparisonCompartment = COMPARISON_COMPARTMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ERROR_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceDataCompartment() {
		return referenceDataCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDataCompartment(String newReferenceDataCompartment) {
		String oldReferenceDataCompartment = referenceDataCompartment;
		referenceDataCompartment = newReferenceDataCompartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ERROR_FUNCTION__REFERENCE_DATA_COMPARTMENT, oldReferenceDataCompartment, referenceDataCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparisonCompartment() {
		return comparisonCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonCompartment(String newComparisonCompartment) {
		String oldComparisonCompartment = comparisonCompartment;
		comparisonCompartment = newComparisonCompartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ERROR_FUNCTION__COMPARISON_COMPARTMENT, oldComparisonCompartment, comparisonCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorResult calculateError(ReferenceScenarioDataMap reference, ReferenceScenarioDataMap data) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.ERROR_FUNCTION__REFERENCE_DATA_COMPARTMENT:
				return getReferenceDataCompartment();
			case AnalysisPackage.ERROR_FUNCTION__COMPARISON_COMPARTMENT:
				return getComparisonCompartment();
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
			case AnalysisPackage.ERROR_FUNCTION__REFERENCE_DATA_COMPARTMENT:
				setReferenceDataCompartment((String)newValue);
				return;
			case AnalysisPackage.ERROR_FUNCTION__COMPARISON_COMPARTMENT:
				setComparisonCompartment((String)newValue);
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
			case AnalysisPackage.ERROR_FUNCTION__REFERENCE_DATA_COMPARTMENT:
				setReferenceDataCompartment(REFERENCE_DATA_COMPARTMENT_EDEFAULT);
				return;
			case AnalysisPackage.ERROR_FUNCTION__COMPARISON_COMPARTMENT:
				setComparisonCompartment(COMPARISON_COMPARTMENT_EDEFAULT);
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
			case AnalysisPackage.ERROR_FUNCTION__REFERENCE_DATA_COMPARTMENT:
				return REFERENCE_DATA_COMPARTMENT_EDEFAULT == null ? referenceDataCompartment != null : !REFERENCE_DATA_COMPARTMENT_EDEFAULT.equals(referenceDataCompartment);
			case AnalysisPackage.ERROR_FUNCTION__COMPARISON_COMPARTMENT:
				return COMPARISON_COMPARTMENT_EDEFAULT == null ? comparisonCompartment != null : !COMPARISON_COMPARTMENT_EDEFAULT.equals(comparisonCompartment);
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
		result.append(" (referenceDataCompartment: ");
		result.append(referenceDataCompartment);
		result.append(", comparisonCompartment: ");
		result.append(comparisonCompartment);
		result.append(')');
		return result.toString();
	}

	/**
	 * From the dataMap extract a list of infectious
	 * @param dataMap
	 * @return list of infectious people
	 */
	public List<Double> getInfectious(ReferenceScenarioDataInstance dataMap) {
		  
		List<Double> infectious = dataMap.getItotals();
		
		return infectious;
	}
	

	/**
	 * From the dataMap extract a list of infectious
	 * @param dataMap
	 * @return list of infectious people
	 */
	public List<Double> getIncidence(ReferenceScenarioDataInstance dataMap) {
		final String INCIDENCE = States.statesToFit[States.INCIDENCE];
		
		 
		// MUST exist
		List<String> incidenceList = dataMap.getData(INCIDENCE);
		assert(incidenceList!=null);
		
		List<Double> infectious = new ArrayList<Double>();
		for (int i = 0; i < incidenceList.size(); i ++) {
			
			double inf = (Double.valueOf(incidenceList.get(i))).doubleValue();
			infectious.add(Double.valueOf(inf));
		}
		return infectious;
	}
	
	/**
	 * From the dataMap extract a list of infectious
	 * @param dataMap
	 * @return list of infectious people
	 */
	public List<Double> getData(String state, ReferenceScenarioDataInstance dataMap) { 
		// MUST exist
		
		List<String> incidenceList = dataMap.getData(state);
		assert(incidenceList!=null);
		
		List<Double> infectious = new ArrayList<Double>();
		for (int i = 0; i < incidenceList.size(); i ++) {
			
			double inf = (Double.valueOf(incidenceList.get(i))).doubleValue();
			infectious.add(Double.valueOf(inf));
		}
		return infectious;
	}
	
	/**
	 * From the dataMap extract a list of infectious
	 * @param dataMap
	 * @return list of infectious people
	 */
	public List<Double> getCumData(String state, ReferenceScenarioDataInstance dataMap) { 
		// MUST exist
		
		List<String> incidenceList = dataMap.getData(state);
		assert(incidenceList!=null);
		
		List<Double> infectious = new ArrayList<Double>();
		for (int i = 0; i < incidenceList.size(); i ++) {
			
			double inf = (Double.valueOf(incidenceList.get(i))).doubleValue();
			infectious.add(Double.valueOf(inf));
		}
		
		List<Double>cumulative = dailyToCum(infectious);
		return cumulative;
	}
	
	/***
	 * Getting cumulative values from the daily incidence data
	 * @param dailyValues
	 * @return list of daily cumulative sum
	 */
	private List<Double> dailyToCum(List<Double> dailyValues) {
        List<Double>cumValues = new ArrayList<>();
        for(int i=0;i<dailyValues.size();i++){
            if(i==0){
                cumValues.add(dailyValues.get(i));
            }else{
                cumValues.add(dailyValues.get(i)+cumValues.get(i-1));
            }
        }
        return cumValues;
    }
	
	/**
	 * From the dataMap extract a list of death values
	 * @param dataMap
	 * @return list of cumulative death by day 
	 */
	public List<Double> getDeaths(ReferenceScenarioDataInstance dataMap) {
		final String DISEASE_DEATHS = States.statesToFit[States.DISEASE_DEATHS];
		// MUST exist
		List<String> deathList = dataMap.getData(DISEASE_DEATHS);
		//we standardize on disease deaths to be "Disease Deaths" as header of 
		assert(deathList!=null);
		
		List<Double> deaths = new ArrayList<Double>();
		for (int i = 0; i < deathList.size(); i ++) {
			
			double d = (Double.valueOf(deathList.get(i))).doubleValue();
			deaths.add(Double.valueOf(d));
		}
		return deaths;
	}
	
	/**
	 * From the dataMap extract a list of population values
	 * @param dataMap
	 * @return list of infectious people
	 */
	public List<Double> getPopulation(ReferenceScenarioDataInstance dataMap) {
		final String POPULATION = States.statesToFit[States.POPULATION];
		
		 
		// MUST exist
		List<String> popList = dataMap.getData(POPULATION);
		// We should standardize on P for population count
		if(popList == null) popList =  dataMap.getData("Population Count");
		assert(popList!=null);
		
		List<Double> populations = new ArrayList<Double>();
		for (int i = 0; i < popList.size(); i ++) {
			
			double p = (Double.valueOf(popList.get(i))).doubleValue();
			populations.add(Double.valueOf(p));
		}
		return populations;
	}
	
} //ErrorFunctionImpl
