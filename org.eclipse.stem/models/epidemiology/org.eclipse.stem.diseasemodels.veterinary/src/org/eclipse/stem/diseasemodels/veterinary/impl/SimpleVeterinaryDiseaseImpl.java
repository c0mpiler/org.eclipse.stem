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

import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;

import org.eclipse.stem.diseasemodels.standard.impl.SIImpl;

import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDisease;
import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabel;
import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabelValue;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryFactory;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Veterinary Disease</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseImpl#getEnvironmentalTransmissionRate <em>Environmental Transmission Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleVeterinaryDiseaseImpl extends SIImpl implements SimpleVeterinaryDisease {
	/**
	 * The default value of the '{@link #getEnvironmentalTransmissionRate() <em>Environmental Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double ENVIRONMENTAL_TRANSMISSION_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEnvironmentalTransmissionRate() <em>Environmental Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected double environmentalTransmissionRate = ENVIRONMENTAL_TRANSMISSION_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleVeterinaryDiseaseImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VeterinaryPackage.Literals.SIMPLE_VETERINARY_DISEASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEnvironmentalTransmissionRate() {
		return environmentalTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmentalTransmissionRate(double newEnvironmentalTransmissionRate) {
		environmentalTransmissionRate = newEnvironmentalTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VeterinaryPackage.SIMPLE_VETERINARY_DISEASE__ENVIRONMENTAL_TRANSMISSION_RATE:
				return getEnvironmentalTransmissionRate();
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
			case VeterinaryPackage.SIMPLE_VETERINARY_DISEASE__ENVIRONMENTAL_TRANSMISSION_RATE:
				setEnvironmentalTransmissionRate((Double)newValue);
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
			case VeterinaryPackage.SIMPLE_VETERINARY_DISEASE__ENVIRONMENTAL_TRANSMISSION_RATE:
				setEnvironmentalTransmissionRate(ENVIRONMENTAL_TRANSMISSION_RATE_EDEFAULT);
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
			case VeterinaryPackage.SIMPLE_VETERINARY_DISEASE__ENVIRONMENTAL_TRANSMISSION_RATE:
				return environmentalTransmissionRate != ENVIRONMENTAL_TRANSMISSION_RATE_EDEFAULT;
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
		result.append(" (environmentalTransmissionRate: ");
		result.append(environmentalTransmissionRate);
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
		// TODO Auto-generated stub. Implement applyExternalDeltas(...) for SimpleVeterinaryDiseaseImpl.
		super.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);
	} // applyExternalDeltas



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel label, long timeDelta) {
		// TODO Auto-generated stub. Implement doStochasticProcess(...) for SimpleVeterinaryDiseaseImpl.
		super.doStochasticProcess(label, timeDelta);
	} // doStochasticProcess


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		// TODO Auto-generated stub. Implement calculateDeltas(...) for SimpleVeterinaryDiseaseImpl.

		// Add common calculations here that needs to be done before we begin.
		// For instance, adjust rate parameters here to take into account the time 
		// step of the sequencer and the time period of the disease model.
		// Here is an example:
		// final double adjustedTransmissionRate = getTransmissionRate() * ((double) timeDelta / (double) getTimePeriod());

		SimpleVeterinaryDiseaseExpressions deltaCalculator = new SimpleVeterinaryDiseaseExpressions();

		for(int _i=0;_i<labels.size();++_i) {
			SimpleVeterinaryDiseaseLabel diseaseLabel = (SimpleVeterinaryDiseaseLabel)labels.get(_i);
			SimpleVeterinaryDiseaseLabelValue currentDiseaseState = (SimpleVeterinaryDiseaseLabelValue)diseaseLabel.getProbeValue();
			SimpleVeterinaryDiseaseLabelValue deltaValue = (SimpleVeterinaryDiseaseLabelValue)diseaseLabel.getDeltaValue();
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
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {	

		DiseaseModelLabel label = VeterinaryFactory.eINSTANCE.createSimpleVeterinaryDiseaseLabel(); 
		label.setTypeURI(DiseaseModelLabel.URI_TYPE_DYNAMIC_DISEASE_LABEL);

		return label;
	} // createDiseaseModelLabel


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {	
 
		return VeterinaryFactory.eINSTANCE.createSimpleVeterinaryDiseaseLabelValue(); 
	}

							

} //SimpleVeterinaryDiseaseImpl
