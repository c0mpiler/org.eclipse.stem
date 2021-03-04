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
package org.eclipse.stem.diseasemodels.veterinary.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;

import org.eclipse.stem.core.model.STEMTime;

import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits;
import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabel;
import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabelValue;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryFactory;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage;

import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabelValue;

import org.eclipse.stem.populationmodels.standard.impl.PopulationModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contaminated Units</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsImpl#getDissapationRate <em>Dissapation Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsImpl#getSheddingFactor <em>Shedding Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContaminatedUnitsImpl extends PopulationModelImpl implements ContaminatedUnits {
	/**
	 * The default value of the '{@link #getDissapationRate() <em>Dissapation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissapationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double DISSAPATION_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDissapationRate() <em>Dissapation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissapationRate()
	 * @generated
	 * @ordered
	 */
	protected double dissapationRate = DISSAPATION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheddingFactor() <em>Shedding Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheddingFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SHEDDING_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSheddingFactor() <em>Shedding Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheddingFactor()
	 * @generated
	 * @ordered
	 */
	protected double sheddingFactor = SHEDDING_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContaminatedUnitsImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VeterinaryPackage.Literals.CONTAMINATED_UNITS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDissapationRate() {
		return dissapationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissapationRate(double newDissapationRate) {
		dissapationRate = newDissapationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSheddingFactor() {
		return sheddingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheddingFactor(double newSheddingFactor) {
		sheddingFactor = newSheddingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VeterinaryPackage.CONTAMINATED_UNITS__DISSAPATION_RATE:
				return getDissapationRate();
			case VeterinaryPackage.CONTAMINATED_UNITS__SHEDDING_FACTOR:
				return getSheddingFactor();
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
			case VeterinaryPackage.CONTAMINATED_UNITS__DISSAPATION_RATE:
				setDissapationRate((Double)newValue);
				return;
			case VeterinaryPackage.CONTAMINATED_UNITS__SHEDDING_FACTOR:
				setSheddingFactor((Double)newValue);
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
			case VeterinaryPackage.CONTAMINATED_UNITS__DISSAPATION_RATE:
				setDissapationRate(DISSAPATION_RATE_EDEFAULT);
				return;
			case VeterinaryPackage.CONTAMINATED_UNITS__SHEDDING_FACTOR:
				setSheddingFactor(SHEDDING_FACTOR_EDEFAULT);
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
			case VeterinaryPackage.CONTAMINATED_UNITS__DISSAPATION_RATE:
				return dissapationRate != DISSAPATION_RATE_EDEFAULT;
			case VeterinaryPackage.CONTAMINATED_UNITS__SHEDDING_FACTOR:
				return sheddingFactor != SHEDDING_FACTOR_EDEFAULT;
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
		result.append(" (dissapationRate: ");
		result.append(dissapationRate);
		result.append(", sheddingFactor: ");
		result.append(sheddingFactor);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void applyExternalDeltas(STEMTime currentTime, double continuousTime, long timeDelta, EList<DynamicLabel> labels) {
		// TODO Auto-generated stub. Implement applyExternalDeltas(...) for ContaminatedUnitsImpl.
		super.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);
	} // applyExternalDeltas



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel label, long timeDelta) {
		// TODO Auto-generated stub. Implement doStochasticProcess(...) for ContaminatedUnitsImpl.
		super.doStochasticProcess(label, timeDelta);
	} // doStochasticProcess


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		// TODO Auto-generated stub. Implement calculateDeltas(...) for ContaminatedUnitsImpl.

		// Add common calculations here that needs to be done before we begin.
		// For instance, adjust rate parameters here to take into account the time 
		// step of the sequencer and the time period of the disease model.
		// Here is an example:
		// final double adjustedTransmissionRate = getTransmissionRate() * ((double) timeDelta / (double) getTimePeriod());

		ContaminatedUnitsExpressions deltaCalculator = new ContaminatedUnitsExpressions();

		for(int _i=0;_i<labels.size();++_i) {
			ContaminatedUnitsLabel diseaseLabel = (ContaminatedUnitsLabel)labels.get(_i);
			ContaminatedUnitsLabelValue currentDiseaseState = (ContaminatedUnitsLabelValue)diseaseLabel.getProbeValue();
			ContaminatedUnitsLabelValue deltaValue = (ContaminatedUnitsLabelValue)diseaseLabel.getDeltaValue();
			deltaValue.reset();
			
			// Calculate deltas for the individual transitions
			deltaCalculator.calculate(t, timeDelta, time, this, diseaseLabel, currentDiseaseState, diseaseLabel.getNode(), deltaValue);

			// If you need to take into account any interventions currently in place for the region, use this 
			// code snippet as a sample:
			
			// StandardInterventionLabel sil = findInterventionLabel((Node)diseaseLabel.getIdentifiable());
			// if(sil != null) {
			//	double vaccinations = ((StandardInterventionLabelValue)sil.getCurrentValue()).getVaccinations();
			//    ... add code to include vaccinations (isolations etc.) into your delta calculation here  
			// }	
			
			// DO NOT REMOVE THIS LINE. It's critical to ensure disease deaths are being reported to 
			// other models that depend on it.
			deltaValue.scale(((double) timeDelta / (double) getTimePeriod()));
			computeAdditionalDeltasAndExchanges(diseaseLabel, time, t, timeDelta);
		}

	} // calculateDeltas

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationModelLabel createPopulationModelLabel(String populationIdentifier) {	

		PopulationModelLabel label = VeterinaryFactory.eINSTANCE.createContaminatedUnitsLabel(); 
		label.setTypeURI(PopulationModelLabel.URI_TYPE_DYNAMIC_POPULATION_LABEL);

		return label;
	} // createPopulationModelLabel


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationModelLabelValue createPopulationModelLabelValue(String populationIdentifier) {	
 
		return VeterinaryFactory.eINSTANCE.createContaminatedUnitsLabelValue(); 
	}

							

} //ContaminatedUnitsImpl
