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
package org.eclipse.stem.evolvingcrossspeciesmodel.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.functions.CTDLFunctions;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelImpl;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.vector.impl.Messages;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelFactory;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.impl.StandardPopulationModelLabelValueImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evolving Cross Species Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl#getOtherToOtherTransmissionRate <em>Other To Other Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl#getOtherRecoveryRate <em>Other Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl#getOtherToHostTransmissionRate <em>Other To Host Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl#getTemperatureFactor <em>Temperature Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl#getOtherPopulationIdentifier <em>Other Population Identifier</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl#getOtherImmunityLossRate <em>Other Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl#getIncubationRate <em>Incubation Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvolvingCrossSpeciesModelImpl extends EvolvingSIRDiseaseModelImpl implements EvolvingCrossSpeciesModel {
	/**
	 * The default value of the '{@link #getOtherToOtherTransmissionRate() <em>Other To Other Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherToOtherTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double OTHER_TO_OTHER_TRANSMISSION_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOtherToOtherTransmissionRate() <em>Other To Other Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherToOtherTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected double otherToOtherTransmissionRate = OTHER_TO_OTHER_TRANSMISSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherRecoveryRate() <em>Other Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected static final double OTHER_RECOVERY_RATE_EDEFAULT = 0.1;
	
	/**
	 * The cached value of the '{@link #getOtherRecoveryRate() <em>Other Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected double otherRecoveryRate = OTHER_RECOVERY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherToHostTransmissionRate() <em>Other To Host Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherToHostTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double OTHER_TO_HOST_TRANSMISSION_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOtherToHostTransmissionRate() <em>Other To Host Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherToHostTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected double otherToHostTransmissionRate = OTHER_TO_HOST_TRANSMISSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatureFactor() <em>Temperature Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATURE_FACTOR_EDEFAULT = 20.0;

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
	 * The default value of the '{@link #getOtherPopulationIdentifier() <em>Other Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_POPULATION_IDENTIFIER_EDEFAULT = "avian";

	/**
	 * The cached value of the '{@link #getOtherPopulationIdentifier() <em>Other Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String otherPopulationIdentifier = OTHER_POPULATION_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherImmunityLossRate() <em>Other Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected static final double OTHER_IMMUNITY_LOSS_RATE_EDEFAULT = 0.001;

	/**
	 * The cached value of the '{@link #getOtherImmunityLossRate() <em>Other Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected double otherImmunityLossRate = OTHER_IMMUNITY_LOSS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncubationRate() <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double INCUBATION_RATE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getIncubationRate() <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected double incubationRate = INCUBATION_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingCrossSpeciesModelImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOtherToOtherTransmissionRate() {
		return otherToOtherTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherToOtherTransmissionRate(double newOtherToOtherTransmissionRate) {
		otherToOtherTransmissionRate = newOtherToOtherTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOtherRecoveryRate() {
		return otherRecoveryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherRecoveryRate(double newOtherRecoveryRate) {
		otherRecoveryRate = newOtherRecoveryRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOtherImmunityLossRate() {
		return otherImmunityLossRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherImmunityLossRate(double newOtherImmunityLossRate) {
		otherImmunityLossRate = newOtherImmunityLossRate;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncubationRate() {
		return incubationRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncubationRate(double newIncubationRate) {
		incubationRate = newIncubationRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOtherToHostTransmissionRate() {
		return otherToHostTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherToHostTransmissionRate(double newOtherToHostTransmissionRate) {
		otherToHostTransmissionRate = newOtherToHostTransmissionRate;
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
	public String getOtherPopulationIdentifier() {
		return otherPopulationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherPopulationIdentifier(String newOtherPopulationIdentifier) {
		otherPopulationIdentifier = newOtherPopulationIdentifier;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * In order to implement vector disease model (Other == Vector)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getVectorPopulationIdentifier() {
		return otherPopulationIdentifier;
	}
	/**
	 * <!-- begin-user-doc -->
	 * In order to implement vector disease model (Other == Vector)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setVectorPopulationIdentifier(String newVectorPopulationIdentifier) {
		otherPopulationIdentifier = newVectorPopulationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE:
				return getOtherToOtherTransmissionRate();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE:
				return getOtherRecoveryRate();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE:
				return getOtherToHostTransmissionRate();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR:
				return getTemperatureFactor();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER:
				return getOtherPopulationIdentifier();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE:
				return getOtherImmunityLossRate();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE:
				return getIncubationRate();
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
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE:
				setOtherToOtherTransmissionRate((Double)newValue);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE:
				setOtherRecoveryRate((Double)newValue);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE:
				setOtherToHostTransmissionRate((Double)newValue);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR:
				setTemperatureFactor((Double)newValue);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER:
				setOtherPopulationIdentifier((String)newValue);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE:
				setOtherImmunityLossRate((Double)newValue);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE:
				setIncubationRate((Double)newValue);
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
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE:
				setOtherToOtherTransmissionRate(OTHER_TO_OTHER_TRANSMISSION_RATE_EDEFAULT);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE:
				setOtherRecoveryRate(OTHER_RECOVERY_RATE_EDEFAULT);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE:
				setOtherToHostTransmissionRate(OTHER_TO_HOST_TRANSMISSION_RATE_EDEFAULT);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR:
				setTemperatureFactor(TEMPERATURE_FACTOR_EDEFAULT);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER:
				setOtherPopulationIdentifier(OTHER_POPULATION_IDENTIFIER_EDEFAULT);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE:
				setOtherImmunityLossRate(OTHER_IMMUNITY_LOSS_RATE_EDEFAULT);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE:
				setIncubationRate(INCUBATION_RATE_EDEFAULT);
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
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE:
				return otherToOtherTransmissionRate != OTHER_TO_OTHER_TRANSMISSION_RATE_EDEFAULT;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE:
				return otherRecoveryRate != OTHER_RECOVERY_RATE_EDEFAULT;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE:
				return otherToHostTransmissionRate != OTHER_TO_HOST_TRANSMISSION_RATE_EDEFAULT;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR:
				return temperatureFactor != TEMPERATURE_FACTOR_EDEFAULT;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER:
				return OTHER_POPULATION_IDENTIFIER_EDEFAULT == null ? otherPopulationIdentifier != null : !OTHER_POPULATION_IDENTIFIER_EDEFAULT.equals(otherPopulationIdentifier);
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE:
				return otherImmunityLossRate != OTHER_IMMUNITY_LOSS_RATE_EDEFAULT;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE:
				return incubationRate != INCUBATION_RATE_EDEFAULT;
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
		result.append(" (otherToOtherTransmissionRate: ");
		result.append(otherToOtherTransmissionRate);
		result.append(", otherRecoveryRate: ");
		result.append(otherRecoveryRate);
		result.append(", otherToHostTransmissionRate: ");
		result.append(otherToHostTransmissionRate);
		result.append(", temperatureFactor: ");
		result.append(temperatureFactor);
		result.append(", otherPopulationIdentifier: ");
		result.append(otherPopulationIdentifier);
		result.append(", otherImmunityLossRate: ");
		result.append(otherImmunityLossRate);
		result.append(", incubationRate: ");
		result.append(incubationRate);
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
		// TODO Auto-generated stub. Implement applyExternalDeltas(...) for EvolvingCrossSpeciesModelImpl.
		super.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);
	} // applyExternalDeltas



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel label, long timeDelta) {
		// TODO Auto-generated stub. Implement doStochasticProcess(...) for EvolvingCrossSpeciesModelImpl.
		super.doStochasticProcess(label, timeDelta);
	} // doStochasticProcess

	
	
	
	/**
	 * 
	 * @param n
	 * @param identifier
	 * @param targetDiseaseName
	 * @return
	 * @generated NOT
	 */
	EvolvingCrossSpeciesModelLabel findDiseaseLabel(Node n, String identifier, String targetDiseaseName) {
		
		for(NodeLabel nl:n.getLabels()) {
			if(nl instanceof EvolvingCrossSpeciesModelLabel && ((DiseaseModelLabel)nl).getPopulationModelLabel().getPopulationIdentifier().equals(identifier)) {
				DiseaseModel disease = (DiseaseModel)(((DiseaseModelLabel)nl).getDecorator());
				if(disease.getDiseaseName().equalsIgnoreCase(targetDiseaseName)) {
					return (EvolvingCrossSpeciesModelLabel)nl;
				}// if disease name matches
			}// if evolving model and correct population
		}// for all labels
		return null;
	}// findDiseaseLabel


	
	

	/**
	 * 
	 * @param time
	 * @param t
	 * @param timeDelta
	 * @param labels
	 * @return
	 * @generated NOT
	 */
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		 
		for(int _i=0;_i<labels.size();++_i) {
			EvolvingCrossSpeciesModelLabel diseaseLabel = (EvolvingCrossSpeciesModelLabel)labels.get(_i);
			EvolvingCrossSpeciesModelLabelValue currentDiseaseState = (EvolvingCrossSpeciesModelLabelValue)diseaseLabel.getProbeValue();
			EvolvingCrossSpeciesModelLabelValue deltaValue = (EvolvingCrossSpeciesModelLabelValue)diseaseLabel.getDeltaValue();
			deltaValue.reset();
			
			double densityFactor = 1.0;
			if(!this.frequencyDependent) {
				double popDensity = currentDiseaseState.getPopulationCount()/CTDLFunctions.area(diseaseLabel.getNode());
				densityFactor *= popDensity/this.referencePopulationDensity;
			}
			
			
			
			
			///////////////
			// Label is PRIMARY e.g. avian vector
			if(diseaseLabel.getPopulationModelLabel().getPopulationIdentifier().equals(this.getPopulationIdentifier())) {
			
				// PRIMARY  
				double deltaS =  0.0, deltaE=0.0,  deltaI=0.0, deltaR=0.0;
				double effectiveIPrimary = this.getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentDiseaseState.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
							
				// get the cross susc matrix term
				double effectiveSusceptible = getEffectiveSuscptible(currentDiseaseState, diseaseLabel, this.getPopulationIdentifier());
				
				///////////////
				// PRIMARY  will be like AVIAN (or vector like) for now. We do not infect OTHER HOST =>AVIAN. Only PRIMARY => OTHER (below)
				//
				double StoE = (densityFactor*this.getTransmissionRate()*effectiveSusceptible*effectiveIPrimary);
				double EtoI = this.getIncubationRate()*currentDiseaseState.getE();
				double ItoR = this.getRecoveryRate()*currentDiseaseState.getI();
				double RtoS = this.getImmunityLossRate()*currentDiseaseState.getR();
				
				
				// S->E
				Exchange seExchange = (Exchange)ExchangePool.POOL.get(); 
				seExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				seExchange.setTarget(EvolvingCrossSpeciesModelPackage.eINSTANCE.getEvolvingCrossSpeciesModelLabelValue_E());
				seExchange.setCount(StoE);
				seExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
				seExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(seExchange);
				
				// E->I
				// Stochastic exchange for e -> i
				Exchange eiExchange = (Exchange)ExchangePool.POOL.get();
				eiExchange.setSource(EvolvingCrossSpeciesModelPackage.eINSTANCE.getEvolvingCrossSpeciesModelLabelValue_E());
				eiExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
				eiExchange.setCount(EtoI);
				eiExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(eiExchange);

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

				
				deltaS = -StoE+RtoS;
				deltaE = StoE-EtoI;
				deltaI = EtoI-ItoR;
				deltaR = ItoR - RtoS;
				
				deltaValue.setS(deltaS);
				deltaValue.setE(deltaE);
				deltaValue.setI(deltaI);
				deltaValue.setR(deltaR);
				deltaValue.setIncidence(StoE);
				
			} else {
				
				///////////////////////////////////////////////////////////
				// OTHER => Like the host/human can be infected by PRIMARY
				//
				double deltaS =  0.0, deltaE=0.0, deltaI=0.0, deltaR = 0.0;
							
				// get "the vector"
				double effectiveIVector = 0.0;
				EvolvingCrossSpeciesModelLabel vectorLabel = findDiseaseLabel(diseaseLabel.getNode(), this.getPopulationIdentifier(), this.getDiseaseName());
				EvolvingCrossSpeciesModelLabelValue vectorLabelValue = null;
				if(vectorLabel != null) {
					vectorLabelValue = (EvolvingCrossSpeciesModelLabelValue)vectorLabel.getTempValue();
					effectiveIVector = this.getNormalizedEffectiveInfectious(diseaseLabel.getNode(), vectorLabel, vectorLabelValue.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION); 
				}
				
				// like the human
				double effectiveIOther = this.getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentDiseaseState.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
		
				
				// get the cross susc matrix term
				double effectiveSusceptible = getEffectiveSuscptible(currentDiseaseState, diseaseLabel, diseaseLabel.getPopulationModelLabel().getPopulationIdentifier());
				
				// here we are OTHER and can be infect by PRIMARY
				double StoE = (densityFactor*this.getOtherToOtherTransmissionRate()*effectiveSusceptible*effectiveIOther)
								+
							  (densityFactor*this.getOtherToHostTransmissionRate()*effectiveSusceptible*effectiveIVector);
				
				double EtoI = this.getIncubationRate()*currentDiseaseState.getE();
				double ItoR = this.getOtherRecoveryRate()*currentDiseaseState.getI();
				double RtoS = this.getOtherImmunityLossRate()*currentDiseaseState.getR();
				
				deltaS = -StoE+RtoS;
				deltaE = StoE-EtoI;
				deltaI = EtoI-ItoR;
				deltaR = ItoR - RtoS;
				
				
				// S->E
				Exchange seExchange = (Exchange)ExchangePool.POOL.get(); 
				seExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				seExchange.setTarget(EvolvingCrossSpeciesModelPackage.eINSTANCE.getEvolvingCrossSpeciesModelLabelValue_E());
				seExchange.setCount(StoE);
				seExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
				seExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(seExchange);

				// E->I
				// Stochastic exchange for e -> i
				Exchange eiExchange = (Exchange)ExchangePool.POOL.get();
				eiExchange.setSource(EvolvingCrossSpeciesModelPackage.eINSTANCE.getEvolvingCrossSpeciesModelLabelValue_E());
				eiExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
				eiExchange.setCount(EtoI);
				eiExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(eiExchange);
				
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

					
				deltaValue.setS(deltaS);
				deltaValue.setE(deltaE);
				deltaValue.setI(deltaI);
				deltaValue.setR(deltaR);
				deltaValue.setIncidence(StoE);
				
			}
			
			deltaValue.scale(((double) timeDelta / (double) getTimePeriod()));
			computeAdditionalDeltasAndExchanges(diseaseLabel, time, t, timeDelta);
		}
		

	} // calculateDeltas

	
	
	
	/**
	 * 
	 * @param currentSIR
	 * @param diseaseLabel
	 * @return
	 */
	public double getEffectiveSuscptible(EvolvingCrossSpeciesModelLabelValue currentSIR, EvolvingCrossSpeciesModelLabel diseaseLabel, String targetPopulationIdentifier) {
		
		////////////////////////////////////////////////////
		// ******* EVOLVING DISEASE MODEL *************** //
		//
		//  Si* = Si   ∏_(j≠i) 〖[1-χji (Rj/N〗)] 
		//
		double effectiveSusceptible = currentSIR.getS();
		double popCount = currentSIR.getS()+currentSIR.getE()+currentSIR.getI()+currentSIR.getR(); 
		double crossProduct = 1.0;
		if((crossImmunityRate>0.0)&&(effectiveSusceptible>1)) {
			// NEED TO CORRECT SUSCEPTIBLES BASED ON CROSS STRAIN IMMUNITY //
			Node thisNode = diseaseLabel.getNode();
			EList<NodeLabel> allLabels = thisNode.getLabels();
			for(NodeLabel nl:allLabels) {
				if(nl instanceof EvolvingSIRDiseaseModelLabel) {
					EvolvingSIRDiseaseModelLabel sirLabel = (EvolvingSIRDiseaseModelLabel) nl;
					Decorator otherDisease = sirLabel.getDecorator();
					
					// need to check both the disease and the target population  
					if( (otherDisease instanceof EvolvingSIRDiseaseModel)&&(sirLabel.getPopulationModelLabel().getPopulationIdentifier().equalsIgnoreCase(targetPopulationIdentifier)) ){
						// should always be true
						EvolvingSIRDiseaseModel otherSIRDiease = (EvolvingSIRDiseaseModel)otherDisease;
						if(!otherSIRDiease.getDiseaseName().equals(this.getDiseaseName())) {
							// ie NOT this DISEASE
							EvolvingSIRDiseaseModelLabelValue otherValue = (EvolvingSIRDiseaseModelLabelValue)sirLabel.getCurrentValue();
							
							
								double immuneTerm = otherValue.getR()/popCount;
								
								// the genetic distance is based on comparing the 2 genomes. Each letter gives a difference of 1
								// the crossImmunityRate is the crossImmunity with 1 nt different
								double geneticDistance = getGeneticDistance(otherSIRDiease);
								
								// for a center of mass distance model uncomment the following....
								// double geneticDistance *= getCMdistance(otherSIR);
								
								if(geneticDistance >= 1 ) {
									immuneTerm *= (crossImmunityRate/ geneticDistance);
								}
								
								
								crossProduct *= (1.0-immuneTerm);
								// prevent round off error
								if(crossProduct < 0) {
									crossProduct = 0.0; // round off error
								}
							
							
						}
					}
				}
			}
		} 
		effectiveSusceptible *= crossProduct;
	    //System.out.println("S = "+currentSIR.getS()+" crossProduct = "+crossProduct+"  Seffective = "+effectiveSusceptible);
		
		
		// ******* EVOLVING DISEASE MODEL *************** //
		////////////////////////////////////////////////////
		
		return effectiveSusceptible;
	}
	
	/**
	 * 
	 * @param genome
	 * @return value between 1 and 2
	 */
	public double getHostTransmissionRate(boolean[] genome) {
		double transRate = 0;
		int len = genome.length;
		for(int i = 0; i < len-1; i ++) {
			if(!genome[i]) {
				transRate = transRate + Math.pow(2.0,(double) i);
			}
		}
		transRate = transRate/Math.pow(2.0,(double) (len-1)); // 0 =>1
		//transRate ++;               // 1 =>2
		 
		return transRate;
	}
	
	/**
	 * 
	 * @param genome
	 * @return
	 */
	public double getCrossTransmissionRate(boolean[] genome) {
		// use all bits for host transmission Cross strain will be constant
//		double transRate = 0;
//		for(int j = 4; j < 8; j ++) {
//			int i = j-4;
//			if(!genome[j]) {
//				transRate = transRate + Math.pow(2.0,(double) i);
//			}
//		}
//		transRate = transRate/16.0; // 0 =>1
//		transRate ++;               // 1 =>2
		double transRate = 1;
		return transRate;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void calculateEvolvedInitialState() {
		EvolvingSIRDiseaseModelImpl parentDiseaseModel = (EvolvingSIRDiseaseModelImpl)getParentDisease();
		DiseaseModelLabel parentEvolutionSource = getEvolvedAt();
		if (parentDiseaseModel == null && parentEvolutionSource == null) {
			// The evolution wasn't initialized correctly.  
			// This should be unreachable but who knows.
			System.err.println("Trying to calculate label state from an improperly initialized evolved model.  Do something.");
			return;	
		} 
		
		Node currentNode = parentEvolutionSource.getNode();
		URI evolutionLocation = currentNode.getURI();
		
		boolean[] genome = getGenome();
		boolean[] parentGenome = parentDiseaseModel.getGenome();

		// Update the genome
		if(genome != null && genome.length > 1) {
			double dMute = Math.random()*genome.length;
			int iMute = (int)Math.round(dMute);
			for(int i = 0; i < genome.length; i ++) {
				genome[i] = parentGenome[i];
				if(i==iMute) {
					genome[i] = !genome[i];
				}
			}
		}
		
		setGenome(genome);
		double otherTransRate = getHostTransmissionRate(genome);// number from 0 -> 1
		double factor = getOtherRecoveryRate()+getOtherImmunityLossRate();
		double newTransRateOther = factor*(1.0+(otherTransRate/4));
		System.out.println(" new transmission = "+newTransRateOther );
		
		setOtherToOtherTransmissionRate(newTransRateOther); // 1->2*factor
		
		// TEST CODE new human transmission rate
		// double primateTransmisionRate = getOtherToOtherTransmissionRate();
		// System.out.println("human transmission new =  "+primateTransmisionRate);
		 
		
		// AVIAN transmission rate will be constant - it is the reservoir
		// double avianTransmissionRate = getTransmissionRate();
		// System.out.println("avian transmission rate fixed at "+avianTransmissionRate);	
		

		//setOtherToHostTransmissionRate(factor*2*getCrossTransmissionRate(genome));
		
		setOtherToHostTransmissionRate(factor*1.05);
		
		
        // create the child labels
		for (DynamicLabel dl : this.getLabelsToUpdate()) {
			if (dl instanceof EvolvingCrossSpeciesModelLabel) {
				double s = 0.0;
				double e = 0.0;
				double i = 0.0;
				double r = 0.0;
				double diseaseDeaths = 0.0;
				
				// this is the new label we need to set
				EvolvingCrossSpeciesModelLabel childLabel = (EvolvingCrossSpeciesModelLabel)dl;
				EvolvingCrossSpeciesModelLabelValue childLabelValues = (EvolvingCrossSpeciesModelLabelValue)childLabel.getCurrentValue();
				// this is the new label we need to set
				EvolvingCrossSpeciesModelLabel parentSIRlabel = (EvolvingCrossSpeciesModelLabel) parentEvolutionSource;
				EvolvingCrossSpeciesModelLabelValue parentSIRLabelValues = (EvolvingCrossSpeciesModelLabelValue)parentSIRlabel.getCurrentValue();
				double parentInfectious = parentSIRLabelValues.getI();
				
				//String parentPop = parentSIRlabel.getPopulationModelLabel().getPopulationIdentifier();
				//StandardPopulationModelLabelValueImpl parentValue = (StandardPopulationModelLabelValueImpl)parentSIRlabel.getPopulationModelLabel().getCurrentValue();
				
				//String childPopulation = childLabel.getPopulationModelLabel().getPopulationIdentifier();
				
				StandardPopulationModelLabelValueImpl childValue = (StandardPopulationModelLabelValueImpl)childLabel.getPopulationModelLabel().getCurrentValue();
				double popCount = childValue.getCount(); // population count of the actually identified type
				s = popCount;
				
				// Do something interesting here to initialize disease state
				if (childLabel.getNode().getURI().equals(evolutionLocation)) {
					// This is where the evolution happened, so you probably need to set your
					// infectious state differently
					
					if(parentEvolutionSource instanceof EvolvingCrossSpeciesModelLabel) {
						// should be true
						if((popCount > 1.0)&&(parentInfectious > 1.0)) {
							// init the child diseases values. if the population is zero or i is zero this is the OTHER population so we do not initialize it.
							e = 1.0;
							s = s - 1.0;
						} // else nothing. It's to be expected
					}
					
				} else {
					// This is everywhere else
					// for now we are already set
				} // if else
				
				childLabelValues.setS(s);
				childLabelValues.setE(e);
				childLabelValues.setI(i);
				childLabelValues.setR(r);
				childLabelValues.setDiseaseDeaths(diseaseDeaths);
			}
		}
	}
	
	
	


	/**
	 * Includes the Vector population in list of populations
	 * @generated NOT
	 */
	@Override
	public EList<String> getAllLabelIdentifiers() {
		EList<String> identifiers = new BasicEList<String>();
		
		identifiers.add(getPopulationIdentifier());
		identifiers.add(getOtherPopulationIdentifier());
		
		return identifiers;
	}
	
	
	/**
	 * We need to override this method to return all population model labels for both humans and the vector
	 * 
	 * @param populationIdentifier
	 *            the population being labeled
	 * @param graph
	 *            the graph to search
	 * @return the PopulationLabel instances of the graph that match the
	 *         identifier.
	 * @generated NOT
	 */
	@Override
	public EList<PopulationModelLabel> getPopulationModelLabels(
			String populationIdentifier, Graph graph) throws ScenarioInitializationException {
		final EList<PopulationModelLabel> retValue = new BasicEList<PopulationModelLabel>();

		// Iterate through all of the population labels in the graph
		EList<NodeLabel> labels = graph.getNodeLabelsByTypeURI(
				PopulationModelLabel.URI_TYPE_DYNAMIC_POPULATION_LABEL);
		
		boolean foundPrimary = false, foundOther = false;
		for (NodeLabel pl:labels) {
			final PopulationModelLabel populationLabel = (PopulationModelLabel) pl;
			// Is this label for the population we're looking for?
			boolean keep = false;
			if(populationLabel.getPopulationIdentifier().equals(populationIdentifier)) 
				{keep=true;foundPrimary = true;}
			else if(populationLabel.getPopulationIdentifier().equals(getVectorPopulationIdentifier())) 
				{keep=true;foundOther = true;}
				
			if (keep) {
				// Yes
				// If there is a problem with the "node uri" of the population
				// label then it would not have been associated with a node
				// instance in the graph at this point. This is a problem for
				// disease models that are trying to label the node (there isn't
				// one!). So filter out those mistakes here.

				// Does the population label have an associated node?
				if (populationLabel.getNode() != null) {
					// Yes
					retValue.add(populationLabel);
				} // if the population label has a node
			} // if the population we're looking for
		} // for each population label

		// If we didn't find both humans and the vector, return an empty list.
		// This will force a retry creating disease labels after all population model labels have
		// had time to decorate the graph
		if(!foundPrimary) 
			throw new ScenarioInitializationException(NLS.bind(Messages.HOST_POP_MOD_LABEL_NOT_FOUND, new Object[] {this.getURI().toString(), this.getPopulationIdentifier()}), this, new Exception());
		if(!foundOther)
			throw new ScenarioInitializationException(NLS.bind(Messages.VECTOR_POP_MOD_LABEL_NOT_FOUND, new Object[] {this.getURI().toString(), this.getVectorPopulationIdentifier()}),this, new Exception());
		
		return retValue;
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {	

		DiseaseModelLabel label = EvolvingCrossSpeciesModelFactory.eINSTANCE.createEvolvingCrossSpeciesModelLabel(); 
		label.setTypeURI(DiseaseModelLabel.URI_TYPE_DYNAMIC_DISEASE_LABEL);

		return label;
	} // createDiseaseModelLabel


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {	
 
		return EvolvingCrossSpeciesModelFactory.eINSTANCE.createEvolvingCrossSpeciesModelLabelValue(); 
	}

							

} //EvolvingCrossSpeciesModelImpl
