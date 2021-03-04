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
package org.eclipse.stem.diseasemodels.multipopulation.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.stem.core.common.DoubleValue;
import org.eclipse.stem.core.common.DoubleValueList;
import org.eclipse.stem.core.common.StringValue;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.SEIRLabel;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Population SEIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSEIRDiseaseModelImpl#getIncubationRate <em>Incubation Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiPopulationSEIRDiseaseModelImpl extends MultiPopulationSIRDiseaseModelImpl implements MultiPopulationSEIRDiseaseModel {
	/**
	 * The cached value of the '{@link #getIncubationRate() <em>Incubation Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected DoubleValueList incubationRate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MultiPopulationSEIRDiseaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultipopulationPackage.Literals.MULTI_POPULATION_SEIR_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleValueList getIncubationRate() {
		return incubationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncubationRate(DoubleValueList newIncubationRate, NotificationChain msgs) {
		// DoubleValueList oldIncubationRate = incubationRate;
		incubationRate = newIncubationRate;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncubationRate(DoubleValueList newIncubationRate) {
		if (newIncubationRate != incubationRate) {
			NotificationChain msgs = null;
			if (incubationRate != null)
				msgs = ((InternalEObject)incubationRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE, null, msgs);
			if (newIncubationRate != null)
				msgs = ((InternalEObject)newIncubationRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE, null, msgs);
			msgs = basicSetIncubationRate(newIncubationRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE:
			return basicSetIncubationRate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			// THIS method gets called multiple times, once for each population identifier
			// in the population model.
			// which population is "this"....
			final SEIRLabelValue currentSEIR = (SEIRLabelValue) currentState;
			String thisPopulation = diseaseLabel.getPopulationModelLabel().getPopulationIdentifier();

			// Compute deaths
			final double adjustedInfectiousMortalityRate = getAdjustedInfectiousMortalityRate(timeDelta, thisPopulation);
			final double diseaseDeaths = adjustedInfectiousMortalityRate
					* currentSEIR.getI();

			// next get it's INDEX in the model
			int populationIndex = this.getPopulationIndex(thisPopulation);	

			// now we know the index of the current population being integrated.
			// Get the correct transmission rate list from the MATRIX
			EList<DoubleValue> transmissionVector = getTransmissionRate().getValueLists().get(populationIndex).getValues();

			// ALL the other disease parameters are also DoubleValueLists. We now iterate through all populations
			// get the specific rate parameters from EACH list based on this population index
			double thisRecoveryRate = 0.0;
			if(getRecoveryRate() != null) thisRecoveryRate = getRecoveryRate().getValues().get(populationIndex).getValue();
			double thisImmunityLossRate = 0.0;
			if(getImmunityLossRate() != null)
				thisImmunityLossRate = getImmunityLossRate().getValues().get(populationIndex).getValue();
			double thisIncubationRate = 0.0;
			if(getIncubationRate() != null) 
				thisIncubationRate = getIncubationRate().getValues().get(populationIndex).getValue();

			//  NOW iterate over every population (including this one) to compute new infections
			//  this includes infections within a population group
			//  and all the cross terms
			double numberOfSusceptibleToExposed = 0.0;
			double numberSusceptible = currentSEIR.getS();
			Node thisNode = diseaseLabel.getNode();

			EList<StringValue> groupList = getPopulationGroups().getValues();

			for(int i = 0; i< transmissionVector.size(); i ++) {
				// We need to get the identifier of the ith population model
				String nextPop = groupList.get(i).getValue();

				//////////////////
				// 1. compute BETA for transmission from the ith population to this population
				double specificTransmission = transmissionVector.get(i).getValue();
				double adjustedTransmission = getAdjustedTransmissionRate(specificTransmission, timeDelta);
				if(!this.isFrequencyDependent()) adjustedTransmission *= getTransmissionRateScaleFactor(diseaseLabel);


				// we need to get the disease label for the ith population as well.
				// to get the on site number of infectios individuals of type i
				EList<NodeLabel> nodeLabels = thisNode.getLabels();
				for(int j = 0; j < nodeLabels.size(); j ++) {
					NodeLabel nlabel = nodeLabels.get(j);
					if(nlabel instanceof SEIRLabel) {
						if (this == ((SEIRLabel)label).getDecorator()) {
							StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) nlabel;
							// now check the popualtion type
							String otherPopulation = otherDiseaseLabel.getPopulationModelLabel().getPopulationIdentifier();
							if(otherPopulation.equals(nextPop)) {
								// Yes?
								// then we found the label for the correct next population


								// for this population we need to get the EFFECTIVE Infectious including
								// ALL neighboring nodes
								double onsiteInfectious = ((SEIRLabelValue) otherDiseaseLabel.getTempValue()).getI();
								final double effectiveInfectious = getNormalizedEffectiveInfectious(
										thisNode, otherDiseaseLabel, onsiteInfectious,
										StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);

								// ADD up the new incidence
								numberOfSusceptibleToExposed += adjustedTransmission * numberSusceptible * effectiveInfectious;
							}
						}
					}// if it's an SI label
				}//for all labels in THIS node
			}// For all population in the model

			double numberOfInfectedToRecovered = getAdjustedRecoveryRate(thisRecoveryRate, timeDelta) * currentSEIR.getI();
			double numberOfRecoveredToSusceptible = getAdjustedImmunityLossRate(thisImmunityLossRate, timeDelta) * currentSEIR.getR();
			double numberOfExposedToInfected = getAdjustedIncubationRate(thisIncubationRate, timeDelta) * currentSEIR.getE();

			// Determine delta S
			final double deltaS = - numberOfSusceptibleToExposed + numberOfRecoveredToSusceptible;
			// Delta E
			final double deltaE = numberOfSusceptibleToExposed - numberOfExposedToInfected;
			// Determine delta I
			final double deltaI = numberOfExposedToInfected - numberOfInfectedToRecovered - diseaseDeaths;
			// Determine delta R	
			final double deltaR = numberOfInfectedToRecovered - numberOfRecoveredToSusceptible;

			SEIRLabelValueImpl ret = (SEIRLabelValueImpl)deltaValue;
			
			/////////////////////////////////////////////////////////////////////////////
			// added to express the transitions. Necessary to support stochastic modeling
			// S->E
			Exchange seExchange = (Exchange)ExchangePool.POOL.get(); 
			seExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			seExchange.setTarget(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
			seExchange.setCount(numberOfSusceptibleToExposed);
			seExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
			seExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(seExchange);
			
			// E->I
			Exchange eiExchange = (Exchange)ExchangePool.POOL.get(); 
			eiExchange.setSource(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
			eiExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
			eiExchange.setCount(numberOfExposedToInfected);
			eiExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(eiExchange);
			
			// I->R
			Exchange irExchange = (Exchange)ExchangePool.POOL.get(); 
			irExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
			irExchange.setTarget(StandardPackage.eINSTANCE.getSIRLabelValue_R());
			irExchange.setCount(numberOfInfectedToRecovered);
			irExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(irExchange);
			
			// R->S
			Exchange rsExchange = (Exchange)ExchangePool.POOL.get(); 
			rsExchange.setSource(StandardPackage.eINSTANCE.getSIRLabelValue_R());
			rsExchange.setTarget(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			rsExchange.setCount(numberOfRecoveredToSusceptible);
			rsExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(rsExchange);
			// added to express the transitions. Necessary to support stochastic modeling
			/////////////////////////////////////////////////////////////////////////////

			
			
			ret.setS(deltaS);
			ret.setE(deltaE);
			ret.setI(deltaI);
			ret.setR(deltaR);
			ret.setIncidence(numberOfSusceptibleToExposed);
			ret.setDiseaseDeaths(diseaseDeaths);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}

	}

	public double getAdjustedIncubationRate(double specificIncRate, long timeDelta) {
		return (specificIncRate * ((double) timeDelta / (double) getTimePeriod()) );
	} // getAdjustedIncubationRate

	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSEIRLabel();
	}

	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSEIRLabelValue();
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE:
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
		case MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE:
			setIncubationRate((DoubleValueList)newValue);
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
		case MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE:
			setIncubationRate((DoubleValueList)null);
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
		case MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE:
			return incubationRate != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiPopulationSEIRDiseaseModelImpl
