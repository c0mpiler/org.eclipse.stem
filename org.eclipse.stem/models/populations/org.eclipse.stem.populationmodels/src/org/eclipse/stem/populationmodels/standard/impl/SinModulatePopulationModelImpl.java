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
package org.eclipse.stem.populationmodels.standard.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sin Modulate Population Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.SinModulatePopulationModelImpl#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.SinModulatePopulationModelImpl#getPeriodSin <em>Period Sin</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.SinModulatePopulationModelImpl#getMaxBound <em>Max Bound</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.SinModulatePopulationModelImpl#getMinBound <em>Min Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SinModulatePopulationModelImpl extends StandardPopulationModelImpl implements SinModulatePopulationModel {
	/**
	 * The default value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE_SHIFT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected double phaseShift = PHASE_SHIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriodSin() <em>Period Sin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodSin()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_SIN_EDEFAULT = 365.25;

	/**
	 * The cached value of the '{@link #getPeriodSin() <em>Period Sin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodSin()
	 * @generated
	 * @ordered
	 */
	protected double periodSin = PERIOD_SIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBound() <em>Max Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBound()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_BOUND_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMaxBound() <em>Max Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBound()
	 * @generated
	 * @ordered
	 */
	protected double maxBound = MAX_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinBound() <em>Min Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBound()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinBound() <em>Min Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBound()
	 * @generated
	 * @ordered
	 */
	protected double minBound = MIN_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SinModulatePopulationModelImpl() {
		super();
	}
	
	/**
	 * Compute the changes in the population by sinusoidal modulation 
	 * The birth rate and death rates are modified in each time step by a seasonal modulation function
	 * The birth/death rates are NOT constant
	 * @param time
	 * @param t Continuous time determine by the integrator
	 * @param timeDelta
	 * @param labels
	 * @generated NOT
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta,
			EList<DynamicLabel> labels) {
		
		final double adjustedBirthRate = adjustRate(this.getBirthRate(), this.getTimePeriod(), timeDelta);
		final double adjustedDeathRate = adjustRate(this.getDeathRate(), this.getTimePeriod(), timeDelta);
		double adjustedPeriod = getPeriodSin()*((double)this.getTimePeriod()/(double)timeDelta);
		double adjustedPhase = getPhaseShift()*((double)this.getTimePeriod()/(double)timeDelta);
						
		for(DynamicLabel label:labels) {
			
			StandardPopulationModelLabelImpl slabel = (StandardPopulationModelLabelImpl)label;
			StandardPopulationModelLabelValueImpl delta = (StandardPopulationModelLabelValueImpl)slabel.getDeltaValue();
			StandardPopulationModelLabelValue current = (StandardPopulationModelLabelValue)slabel.getProbeValue();
			
			double currentPopulation = current.getCount();
			double period = adjustedPeriod;
			double max = getMaxBound();
			double min = getMinBound();
			double mean = (max+min)/2;
			double Birth_Rate = adjustedBirthRate;
			double Death_Rate = adjustedDeathRate;
			
			//modulate POP_COUNT by sin wave 
			double POP_COUNT = (max-mean)* (Math.sin(2* Math.PI*(t + adjustedPhase)/period)) + mean;
			double POP_DELTA = POP_COUNT - currentPopulation;
			//at this moment, we force that birthRate equals to deathRate in case user sets them
			//to be different value
			double births = Birth_Rate * currentPopulation;
			double deaths = Death_Rate * currentPopulation;
			
			//update birth and death rate after the modulation
			if(POP_DELTA > 0.0) {
				births = births + (POP_DELTA/2.0);
			    deaths = deaths -  (POP_DELTA/2.0);
			    if(deaths < 0.0) {
			    	births -= deaths;
			    	deaths = 0.0;
			    }
			}
			else if(POP_DELTA < 0.0) {
				births = births + (POP_DELTA/2.0);
			    deaths = deaths -  (POP_DELTA/2.0);
			    if(births < 0.0) {
			    	deaths -= births;
			    	births = 0.0;
			    }
			}
			
			//update delta
			delta.setCount(POP_DELTA);
			delta.setBirths(births);
			delta.setDeaths(deaths);
			
			computeAdditionalDeltasAndExchanges(slabel, time, deaths, timeDelta);
			
		}
	}// calculateDelta
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SIN_MODULATE_POPULATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPhaseShift() {
		return phaseShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseShift(double newPhaseShift) {
		phaseShift = newPhaseShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriodSin() {
		return periodSin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodSin(double newPeriodSin) {
		periodSin = newPeriodSin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxBound() {
		return maxBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBound(double newMaxBound) {
		maxBound = newMaxBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinBound() {
		return minBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinBound(double newMinBound) {
		minBound = newMinBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__PHASE_SHIFT:
				return getPhaseShift();
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__PERIOD_SIN:
				return getPeriodSin();
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__MAX_BOUND:
				return getMaxBound();
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__MIN_BOUND:
				return getMinBound();
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
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__PHASE_SHIFT:
				setPhaseShift((Double)newValue);
				return;
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__PERIOD_SIN:
				setPeriodSin((Double)newValue);
				return;
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__MAX_BOUND:
				setMaxBound((Double)newValue);
				return;
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__MIN_BOUND:
				setMinBound((Double)newValue);
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
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__PHASE_SHIFT:
				setPhaseShift(PHASE_SHIFT_EDEFAULT);
				return;
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__PERIOD_SIN:
				setPeriodSin(PERIOD_SIN_EDEFAULT);
				return;
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__MAX_BOUND:
				setMaxBound(MAX_BOUND_EDEFAULT);
				return;
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__MIN_BOUND:
				setMinBound(MIN_BOUND_EDEFAULT);
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
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__PHASE_SHIFT:
				return phaseShift != PHASE_SHIFT_EDEFAULT;
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__PERIOD_SIN:
				return periodSin != PERIOD_SIN_EDEFAULT;
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__MAX_BOUND:
				return maxBound != MAX_BOUND_EDEFAULT;
			case StandardPackage.SIN_MODULATE_POPULATION_MODEL__MIN_BOUND:
				return minBound != MIN_BOUND_EDEFAULT;
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
		result.append(" (phaseShift: ");
		result.append(phaseShift);
		result.append(", periodSin: ");
		result.append(periodSin);
		result.append(", maxBound: ");
		result.append(maxBound);
		result.append(", minBound: ");
		result.append(minBound);
		result.append(')');
		return result.toString();
	}

} //SinModulatePopulationModelImpl
