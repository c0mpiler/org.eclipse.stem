package org.eclipse.stem.diseasemodels.avianinfluenza.impl;

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
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.definitions.functions.CTDLFunctions;
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaFactory;
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9Label;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9LabelValue;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.vector.impl.VectorDiseaseModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>H7N9</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl#getAvianToAvianTransmissionRate <em>Avian To Avian Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl#getAvianRecoveryRate <em>Avian Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl#getAvianToHumanTransmissionRate <em>Avian To Human Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl#getHumanToHumanTransmissionRate <em>Human To Human Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl#getAvianCharacteristicMixingDistance <em>Avian Characteristic Mixing Distance</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl#getHumanRecoveryRate <em>Human Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl#getHumanImmunityLossRate <em>Human Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl#getTemperatureFactor <em>Temperature Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class H7N9Impl extends VectorDiseaseModelImpl implements H7N9 {
	/**
	 * The default value of the '{@link #getAvianToAvianTransmissionRate() <em>Avian To Avian Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvianToAvianTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double AVIAN_TO_AVIAN_TRANSMISSION_RATE_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getAvianToAvianTransmissionRate() <em>Avian To Avian Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvianToAvianTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected double avianToAvianTransmissionRate = AVIAN_TO_AVIAN_TRANSMISSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvianRecoveryRate() <em>Avian Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvianRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected static final double AVIAN_RECOVERY_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvianRecoveryRate() <em>Avian Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvianRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected double avianRecoveryRate = AVIAN_RECOVERY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvianToHumanTransmissionRate() <em>Avian To Human Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvianToHumanTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double AVIAN_TO_HUMAN_TRANSMISSION_RATE_EDEFAULT = 1.2;

	/**
	 * The cached value of the '{@link #getAvianToHumanTransmissionRate() <em>Avian To Human Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvianToHumanTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected double avianToHumanTransmissionRate = AVIAN_TO_HUMAN_TRANSMISSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumanToHumanTransmissionRate() <em>Human To Human Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanToHumanTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double HUMAN_TO_HUMAN_TRANSMISSION_RATE_EDEFAULT = 1.2;

	/**
	 * The cached value of the '{@link #getHumanToHumanTransmissionRate() <em>Human To Human Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanToHumanTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected double humanToHumanTransmissionRate = HUMAN_TO_HUMAN_TRANSMISSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvianCharacteristicMixingDistance() <em>Avian Characteristic Mixing Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvianCharacteristicMixingDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double AVIAN_CHARACTERISTIC_MIXING_DISTANCE_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getAvianCharacteristicMixingDistance() <em>Avian Characteristic Mixing Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvianCharacteristicMixingDistance()
	 * @generated
	 * @ordered
	 */
	protected double avianCharacteristicMixingDistance = AVIAN_CHARACTERISTIC_MIXING_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumanRecoveryRate() <em>Human Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected static final double HUMAN_RECOVERY_RATE_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getHumanRecoveryRate() <em>Human Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected double humanRecoveryRate = HUMAN_RECOVERY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumanImmunityLossRate() <em>Human Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected static final double HUMAN_IMMUNITY_LOSS_RATE_EDEFAULT = 0.0010;

	/**
	 * The cached value of the '{@link #getHumanImmunityLossRate() <em>Human Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected double humanImmunityLossRate = HUMAN_IMMUNITY_LOSS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatureFactor() <em>Temperature Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATURE_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getTemperatureFactor() <em>Temperature Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureFactor()
	 * @generated
	 * @ordered
	 */
	protected double temperatureFactor = TEMPERATURE_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H7N9Impl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvianinfluenzaPackage.Literals.H7N9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvianToAvianTransmissionRate() {
		return avianToAvianTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvianToAvianTransmissionRate(double newAvianToAvianTransmissionRate) {
		avianToAvianTransmissionRate = newAvianToAvianTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvianRecoveryRate() {
		return avianRecoveryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvianRecoveryRate(double newAvianRecoveryRate) {
		avianRecoveryRate = newAvianRecoveryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvianToHumanTransmissionRate() {
		return avianToHumanTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvianToHumanTransmissionRate(double newAvianToHumanTransmissionRate) {
		avianToHumanTransmissionRate = newAvianToHumanTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHumanToHumanTransmissionRate() {
		return humanToHumanTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanToHumanTransmissionRate(double newHumanToHumanTransmissionRate) {
		humanToHumanTransmissionRate = newHumanToHumanTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvianCharacteristicMixingDistance() {
		return avianCharacteristicMixingDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvianCharacteristicMixingDistance(double newAvianCharacteristicMixingDistance) {
		avianCharacteristicMixingDistance = newAvianCharacteristicMixingDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHumanRecoveryRate() {
		return humanRecoveryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanRecoveryRate(double newHumanRecoveryRate) {
		humanRecoveryRate = newHumanRecoveryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHumanImmunityLossRate() {
		return humanImmunityLossRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanImmunityLossRate(double newHumanImmunityLossRate) {
		humanImmunityLossRate = newHumanImmunityLossRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTemperatureFactor() {
		return temperatureFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureFactor(double newTemperatureFactor) {
		temperatureFactor = newTemperatureFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE:
				return getAvianToAvianTransmissionRate();
			case AvianinfluenzaPackage.H7N9__AVIAN_RECOVERY_RATE:
				return getAvianRecoveryRate();
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE:
				return getAvianToHumanTransmissionRate();
			case AvianinfluenzaPackage.H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE:
				return getHumanToHumanTransmissionRate();
			case AvianinfluenzaPackage.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE:
				return getAvianCharacteristicMixingDistance();
			case AvianinfluenzaPackage.H7N9__HUMAN_RECOVERY_RATE:
				return getHumanRecoveryRate();
			case AvianinfluenzaPackage.H7N9__HUMAN_IMMUNITY_LOSS_RATE:
				return getHumanImmunityLossRate();
			case AvianinfluenzaPackage.H7N9__TEMPERATURE_FACTOR:
				return getTemperatureFactor();
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
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE:
				setAvianToAvianTransmissionRate((Double)newValue);
				return;
			case AvianinfluenzaPackage.H7N9__AVIAN_RECOVERY_RATE:
				setAvianRecoveryRate((Double)newValue);
				return;
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE:
				setAvianToHumanTransmissionRate((Double)newValue);
				return;
			case AvianinfluenzaPackage.H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE:
				setHumanToHumanTransmissionRate((Double)newValue);
				return;
			case AvianinfluenzaPackage.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE:
				setAvianCharacteristicMixingDistance((Double)newValue);
				return;
			case AvianinfluenzaPackage.H7N9__HUMAN_RECOVERY_RATE:
				setHumanRecoveryRate((Double)newValue);
				return;
			case AvianinfluenzaPackage.H7N9__HUMAN_IMMUNITY_LOSS_RATE:
				setHumanImmunityLossRate((Double)newValue);
				return;
			case AvianinfluenzaPackage.H7N9__TEMPERATURE_FACTOR:
				setTemperatureFactor((Double)newValue);
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
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE:
				setAvianToAvianTransmissionRate(AVIAN_TO_AVIAN_TRANSMISSION_RATE_EDEFAULT);
				return;
			case AvianinfluenzaPackage.H7N9__AVIAN_RECOVERY_RATE:
				setAvianRecoveryRate(AVIAN_RECOVERY_RATE_EDEFAULT);
				return;
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE:
				setAvianToHumanTransmissionRate(AVIAN_TO_HUMAN_TRANSMISSION_RATE_EDEFAULT);
				return;
			case AvianinfluenzaPackage.H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE:
				setHumanToHumanTransmissionRate(HUMAN_TO_HUMAN_TRANSMISSION_RATE_EDEFAULT);
				return;
			case AvianinfluenzaPackage.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE:
				setAvianCharacteristicMixingDistance(AVIAN_CHARACTERISTIC_MIXING_DISTANCE_EDEFAULT);
				return;
			case AvianinfluenzaPackage.H7N9__HUMAN_RECOVERY_RATE:
				setHumanRecoveryRate(HUMAN_RECOVERY_RATE_EDEFAULT);
				return;
			case AvianinfluenzaPackage.H7N9__HUMAN_IMMUNITY_LOSS_RATE:
				setHumanImmunityLossRate(HUMAN_IMMUNITY_LOSS_RATE_EDEFAULT);
				return;
			case AvianinfluenzaPackage.H7N9__TEMPERATURE_FACTOR:
				setTemperatureFactor(TEMPERATURE_FACTOR_EDEFAULT);
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
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE:
				return avianToAvianTransmissionRate != AVIAN_TO_AVIAN_TRANSMISSION_RATE_EDEFAULT;
			case AvianinfluenzaPackage.H7N9__AVIAN_RECOVERY_RATE:
				return avianRecoveryRate != AVIAN_RECOVERY_RATE_EDEFAULT;
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE:
				return avianToHumanTransmissionRate != AVIAN_TO_HUMAN_TRANSMISSION_RATE_EDEFAULT;
			case AvianinfluenzaPackage.H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE:
				return humanToHumanTransmissionRate != HUMAN_TO_HUMAN_TRANSMISSION_RATE_EDEFAULT;
			case AvianinfluenzaPackage.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE:
				return avianCharacteristicMixingDistance != AVIAN_CHARACTERISTIC_MIXING_DISTANCE_EDEFAULT;
			case AvianinfluenzaPackage.H7N9__HUMAN_RECOVERY_RATE:
				return humanRecoveryRate != HUMAN_RECOVERY_RATE_EDEFAULT;
			case AvianinfluenzaPackage.H7N9__HUMAN_IMMUNITY_LOSS_RATE:
				return humanImmunityLossRate != HUMAN_IMMUNITY_LOSS_RATE_EDEFAULT;
			case AvianinfluenzaPackage.H7N9__TEMPERATURE_FACTOR:
				return temperatureFactor != TEMPERATURE_FACTOR_EDEFAULT;
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
		result.append(" (avianToAvianTransmissionRate: ");
		result.append(avianToAvianTransmissionRate);
		result.append(", avianRecoveryRate: ");
		result.append(avianRecoveryRate);
		result.append(", avianToHumanTransmissionRate: ");
		result.append(avianToHumanTransmissionRate);
		result.append(", humanToHumanTransmissionRate: ");
		result.append(humanToHumanTransmissionRate);
		result.append(", avianCharacteristicMixingDistance: ");
		result.append(avianCharacteristicMixingDistance);
		result.append(", humanRecoveryRate: ");
		result.append(humanRecoveryRate);
		result.append(", humanImmunityLossRate: ");
		result.append(humanImmunityLossRate);
		result.append(", temperatureFactor: ");
		result.append(temperatureFactor);
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
		// TODO Auto-generated stub. Implement applyExternalDeltas(...) for H7N9Impl.
		super.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);
	} // applyExternalDeltas



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel label, long timeDelta) {
		// TODO Auto-generated stub. Implement doStochasticProcess(...) for H7N9Impl.
		super.doStochasticProcess(label, timeDelta);
	} // doStochasticProcess


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		// TODO Auto-generated stub. Implement calculateDeltas(...) for H7N9Impl.

				for(int _i=0;_i<labels.size();++_i) {
					H7N9Label diseaseLabel = (H7N9Label)labels.get(_i);
					H7N9LabelValue currentDiseaseState = (H7N9LabelValue)diseaseLabel.getProbeValue();
					H7N9LabelValue deltaValue = (H7N9LabelValue)diseaseLabel.getDeltaValue();
					deltaValue.reset();
					
					// we don't know about birds yet but we assume the density of birds scales with the density of people
					// bigger markets
					H7N9LabelValue humanDiseaseState = currentDiseaseState;
					if(!diseaseLabel.getPopulationModelLabel().getPopulationIdentifier().equals(this.getPopulationIdentifier()))
						humanDiseaseState = (H7N9LabelValue)(findDiseaseLabel(diseaseLabel.getNode(), this.getPopulationIdentifier())).getCurrentValue();
					double densityFactor = 1.0;
					if(!this.frequencyDependent) {
						double popDensity = humanDiseaseState.getPopulationCount()/CTDLFunctions.area(diseaseLabel.getNode());
						densityFactor *= popDensity/this.referencePopulationDensity;
					}
					
					
					if(diseaseLabel.getPopulationModelLabel().getPopulationIdentifier().equals(this.getPopulationIdentifier())) {
						// Humans
						double deltaS =  0.0, deltaI=0.0, deltaR=0.0;
						
						double effectiveIHumans = this.getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentDiseaseState.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
						
						double effectiveIBirds = 0.0;
						H7N9Label birdsLabel = findDiseaseLabel(diseaseLabel.getNode(), this.getVectorPopulationIdentifier());
						if(birdsLabel != null) {
							H7N9LabelValue birdsLabelValue = (H7N9LabelValue)birdsLabel.getTempValue();
							effectiveIBirds = this.getNormalizedEffectiveInfectious(diseaseLabel.getNode(), birdsLabel, birdsLabelValue.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, AvianinfluenzaPackage.Literals.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION); 
						}
						
						double tFactor = 1.0;
						double dayTemperature = CTDLFunctions.temperature(diseaseLabel.getNode(), time, timeDelta, t);
						if(dayTemperature != CTDLFunctions.MISSING_DATA) {
							tFactor = dayTemperature * this.getTemperatureFactor();
							if(tFactor < 0.0) tFactor = 0.0;
							if(tFactor >1.0) tFactor = 1.0;
						}
						
						double StoI = (densityFactor*this.getHumanToHumanTransmissionRate()*currentDiseaseState.getS()*effectiveIHumans)
								+ (tFactor*densityFactor*this.getAvianToHumanTransmissionRate()*currentDiseaseState.getS()*effectiveIBirds);
						double ItoR = this.getHumanRecoveryRate()*currentDiseaseState.getI();
						double RtoS = this.getHumanImmunityLossRate()*currentDiseaseState.getR();
						
						// S->I
						Exchange siExchange = (Exchange)ExchangePool.POOL.get(); 
						siExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
						siExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
						siExchange.setCount(StoI);
						siExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
						siExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
						deltaValue.getDepartures().add(siExchange);

						// I->R
						Exchange irExchange = (Exchange)ExchangePool.POOL.get(); 
						irExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
						irExchange.setTarget(StandardPackage.eINSTANCE.getSIRLabelValue_R());
						irExchange.setCount(ItoR);
						irExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
						deltaValue.getDepartures().add(irExchange);

						// R->S
						Exchange rsExchange = (Exchange)ExchangePool.POOL.get(); 
						rsExchange.setSource(StandardPackage.eINSTANCE.getSIRLabelValue_R());
						rsExchange.setTarget(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
						rsExchange.setCount(RtoS);
						rsExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
						deltaValue.getDepartures().add(rsExchange);

						
						deltaS = -StoI+RtoS;
						deltaI = StoI-ItoR;
						deltaR = ItoR - RtoS;
						
						deltaValue.setS(deltaS);
						deltaValue.setI(deltaI);
						deltaValue.setR(deltaR);
						deltaValue.setIncidence(StoI);
						
					} else {
						// Birds
						double deltaS =  0.0, deltaI=0.0, deltaR=0.0;
									
						double tFactor = 1.0;
						double dayTemperature = CTDLFunctions.temperature(diseaseLabel.getNode(), time, timeDelta, t);
						if(dayTemperature != CTDLFunctions.MISSING_DATA) {
							tFactor = dayTemperature * this.getTemperatureFactor();
							if(tFactor < 0.0) tFactor = 0.0;
							if(tFactor >1.0) tFactor = 1.0;
						}
						
						
						
						
						double effectiveIBirds = this.getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentDiseaseState.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, AvianinfluenzaPackage.Literals.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);;
						
						double StoI = tFactor*densityFactor*this.getAvianToAvianTransmissionRate()*currentDiseaseState.getS()*effectiveIBirds;
						double ItoR = this.getAvianRecoveryRate()*currentDiseaseState.getI();
						
						deltaS = -StoI;
						deltaI = StoI-ItoR;
						deltaR = ItoR;
						
						// S->I
						Exchange siExchange = (Exchange)ExchangePool.POOL.get(); 
						siExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
						siExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
						siExchange.setCount(StoI);
						siExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
						siExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
						deltaValue.getDepartures().add(siExchange);

						// I->R
						Exchange irExchange = (Exchange)ExchangePool.POOL.get(); 
						irExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
						irExchange.setTarget(StandardPackage.eINSTANCE.getSIRLabelValue_R());
						irExchange.setCount(ItoR);
						irExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
						deltaValue.getDepartures().add(irExchange);

							
						deltaValue.setS(deltaS);
						deltaValue.setI(deltaI);
						deltaValue.setR(deltaR);
						deltaValue.setIncidence(StoI);
					}
					
					deltaValue.scale(((double) timeDelta / (double) getTimePeriod()));
					computeAdditionalDeltasAndExchanges(diseaseLabel, time, t, timeDelta);
				}
	} // calculateDeltas

	H7N9Label findDiseaseLabel(Node n, String identifier) {
		for(NodeLabel nl:n.getLabels()) {
			if(nl instanceof H7N9Label
					&& ((DiseaseModelLabel)nl).getPopulationModelLabel().getPopulationIdentifier().equals(identifier))
				return (H7N9Label)nl;
		}
		return null;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {	

		DiseaseModelLabel label = AvianinfluenzaFactory.eINSTANCE.createH7N9Label(); 
		label.setTypeURI(DiseaseModelLabel.URI_TYPE_DYNAMIC_DISEASE_LABEL);

		return label;
	} // createDiseaseModelLabel


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {	
 
		return AvianinfluenzaFactory.eINSTANCE.createH7N9LabelValue(); 
	}

							

} //H7N9Impl
