package org.eclipse.stem.populationmodels.standard.impl;

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


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabelValue;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationModelImpl#getBirthRate <em>Birth Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationModelImpl#getDeathRate <em>Death Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardPopulationModelImpl extends PopulationModelImpl implements StandardPopulationModel {
	/**
	 * The default value of the '{@link #getBirthRate() <em>Birth Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthRate()
	 * @generated
	 * @ordered
	 */
	protected static final double BIRTH_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBirthRate() <em>Birth Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthRate()
	 * @generated
	 * @ordered
	 */
	protected double birthRate = BIRTH_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeathRate() <em>Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathRate()
	 * @generated
	 * @ordered
	 */
	protected static final double DEATH_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeathRate() <em>Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathRate()
	 * @generated
	 * @ordered
	 */
	protected double deathRate = DEATH_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StandardPopulationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STANDARD_POPULATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBirthRate() {
		return birthRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthRate(double newBirthRate) {
		birthRate = newBirthRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeathRate() {
		return deathRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeathRate(double newDeathRate) {
		deathRate = newDeathRate;
	}

	/**
	 * Decorate the graph for a standard population model
	 * 
	 */
	@Override
	public void decorateGraph(STEMTime time) throws ScenarioInitializationException {
		if(this.isGraphDecorated()) return;
		super.decorateGraph(time);
		return;
	} // decorateGraph
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.STANDARD_POPULATION_MODEL__BIRTH_RATE:
				return getBirthRate();
			case StandardPackage.STANDARD_POPULATION_MODEL__DEATH_RATE:
				return getDeathRate();
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
			case StandardPackage.STANDARD_POPULATION_MODEL__BIRTH_RATE:
				setBirthRate((Double)newValue);
				return;
			case StandardPackage.STANDARD_POPULATION_MODEL__DEATH_RATE:
				setDeathRate((Double)newValue);
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
			case StandardPackage.STANDARD_POPULATION_MODEL__BIRTH_RATE:
				setBirthRate(BIRTH_RATE_EDEFAULT);
				return;
			case StandardPackage.STANDARD_POPULATION_MODEL__DEATH_RATE:
				setDeathRate(DEATH_RATE_EDEFAULT);
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
			case StandardPackage.STANDARD_POPULATION_MODEL__BIRTH_RATE:
				return birthRate != BIRTH_RATE_EDEFAULT;
			case StandardPackage.STANDARD_POPULATION_MODEL__DEATH_RATE:
				return deathRate != DEATH_RATE_EDEFAULT;
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
		result.append(" (birthRate: ");
		result.append(birthRate);
		result.append(", deathRate: ");
		result.append(deathRate);
		result.append(')');
		return result.toString();
	}


	@Override
	public PopulationModelLabel createPopulationModelLabel(String populationIdentifier) {
		PopulationModelLabel retValue =  StandardFactory.eINSTANCE.createStandardPopulationModelLabel();
		retValue.setTypeURI(PopulationModelLabel.URI_TYPE_DYNAMIC_POPULATION_LABEL);
		return retValue;
	}

	@Override
	public PopulationModelLabelValue createPopulationModelLabelValue(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue();
	}

	
	/**
	 * Compute the changes in the population from the birth/death rate
	 * adjusted for the time period used in the simulation
	 * @param time
	 * @param t Continuous time determined by integrator
	 * @param timeDelta
	 * @param labels
	 */
	
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta,
			EList<DynamicLabel> labels) {
		// We simply calculate the change from the birth/death rate
		// adjusted for the time period used in the simulation
		
		double adjustedBirthRate = adjustRate(this.getBirthRate(), this.getTimePeriod(), timeDelta);
		double adjustedDeathRate = adjustRate(this.getDeathRate(), this.getTimePeriod(), timeDelta);
		
		for(int i=0;i<labels.size();++i) {
			StandardPopulationModelLabelImpl slabel = (StandardPopulationModelLabelImpl)labels.get(i);
			
			if(checkAndAdjustForNegative(slabel))
				continue;
			
			StandardPopulationModelLabelValueImpl delta = (StandardPopulationModelLabelValueImpl)slabel.getDeltaValue();
			StandardPopulationModelLabelValue current = (StandardPopulationModelLabelValue)slabel.getProbeValue();
			
			double currentPopulation = current.getCount();
			double births = currentPopulation * adjustedBirthRate;
			double deaths = currentPopulation * adjustedDeathRate;
			delta.setCount(births-deaths);
			delta.setBirths(births);
			delta.setDeaths(deaths);
			
			computeAdditionalDeltasAndExchanges(slabel, time, t, timeDelta);
			
		}
	}// calculateDeltas
	
	
	protected double adjustRate(double rate, long ratePeriod, long actualPeriod) {
		return rate * ((double)actualPeriod/(double)ratePeriod);
	}

} //StandardPopulationModelImpl
