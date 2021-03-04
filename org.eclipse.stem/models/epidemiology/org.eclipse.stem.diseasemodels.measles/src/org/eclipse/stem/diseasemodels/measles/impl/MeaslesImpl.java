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
package org.eclipse.stem.diseasemodels.measles.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.common.DoubleValue;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.functions.CTDLFunctions;
import org.eclipse.stem.diseasemodels.measles.Measles;
import org.eclipse.stem.diseasemodels.measles.MeaslesFactory;
import org.eclipse.stem.diseasemodels.measles.MeaslesLabel;
import org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue;
import org.eclipse.stem.diseasemodels.measles.MeaslesPackage;
import org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSEIRDiseaseModelImpl;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.AgeGroup;
import org.eclipse.stem.populationmodels.standard.AgingPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl#getVaccineEfficacy <em>Vaccine Efficacy</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl#getInoculationScaling <em>Inoculation Scaling</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl#getSeasonalModulation <em>Seasonal Modulation</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl#getSeasonalModulationPeriod <em>Seasonal Modulation Period</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl#getInoculatedImmunityRate <em>Inoculated Immunity Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl#getNewbornImmunityLossRate <em>Newborn Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl#getTransmissionRateScaling <em>Transmission Rate Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeaslesImpl extends MultiPopulationSEIRDiseaseModelImpl implements Measles {
	/**
	 * The default value of the '{@link #getVaccineEfficacy() <em>Vaccine Efficacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineEfficacy()
	 * @generated
	 * @ordered
	 */
	protected static final double VACCINE_EFFICACY_EDEFAULT = 0.95;

	/**
	 * The cached value of the '{@link #getVaccineEfficacy() <em>Vaccine Efficacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineEfficacy()
	 * @generated
	 * @ordered
	 */
	protected double vaccineEfficacy = VACCINE_EFFICACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInoculationScaling() <em>Inoculation Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInoculationScaling()
	 * @generated
	 * @ordered
	 */
	protected static final double INOCULATION_SCALING_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getInoculationScaling() <em>Inoculation Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInoculationScaling()
	 * @generated
	 * @ordered
	 */
	protected double inoculationScaling = INOCULATION_SCALING_EDEFAULT;

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
	 * The default value of the '{@link #getSeasonalModulation() <em>Seasonal Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonalModulation()
	 * @generated
	 * @ordered
	 */
	protected static final double SEASONAL_MODULATION_EDEFAULT = 1.9;

	/**
	 * The cached value of the '{@link #getSeasonalModulation() <em>Seasonal Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonalModulation()
	 * @generated
	 * @ordered
	 */
	protected double seasonalModulation = SEASONAL_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeasonalModulationPeriod() <em>Seasonal Modulation Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonalModulationPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final long SEASONAL_MODULATION_PERIOD_EDEFAULT = 31556925994L;

	/**
	 * The cached value of the '{@link #getSeasonalModulationPeriod() <em>Seasonal Modulation Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonalModulationPeriod()
	 * @generated
	 * @ordered
	 */
	protected long seasonalModulationPeriod = SEASONAL_MODULATION_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInoculatedImmunityRate() <em>Inoculated Immunity Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInoculatedImmunityRate()
	 * @generated
	 * @ordered
	 */
	protected static final double INOCULATED_IMMUNITY_RATE_EDEFAULT = 0.05;

	/**
	 * The cached value of the '{@link #getInoculatedImmunityRate() <em>Inoculated Immunity Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInoculatedImmunityRate()
	 * @generated
	 * @ordered
	 */
	protected double inoculatedImmunityRate = INOCULATED_IMMUNITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewbornImmunityLossRate() <em>Newborn Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewbornImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected static final double NEWBORN_IMMUNITY_LOSS_RATE_EDEFAULT = 0.0027;

	/**
	 * The cached value of the '{@link #getNewbornImmunityLossRate() <em>Newborn Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewbornImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected double newbornImmunityLossRate = NEWBORN_IMMUNITY_LOSS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmissionRateScaling() <em>Transmission Rate Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRateScaling()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSMISSION_RATE_SCALING_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getTransmissionRateScaling() <em>Transmission Rate Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRateScaling()
	 * @generated
	 * @ordered
	 */
	protected double transmissionRateScaling = TRANSMISSION_RATE_SCALING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeaslesImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeaslesPackage.Literals.MEASLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVaccineEfficacy() {
		return vaccineEfficacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccineEfficacy(double newVaccineEfficacy) {
		vaccineEfficacy = newVaccineEfficacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInoculationScaling() {
		return inoculationScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInoculationScaling(double newInoculationScaling) {
		inoculationScaling = newInoculationScaling;
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
	public double getSeasonalModulation() {
		return seasonalModulation;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeasonalModulation(double newSeasonalModulation) {
		seasonalModulation = newSeasonalModulation;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSeasonalModulationPeriod() {
		return seasonalModulationPeriod;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeasonalModulationPeriod(long newSeasonalModulationPeriod) {
		seasonalModulationPeriod = newSeasonalModulationPeriod;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInoculatedImmunityRate() {
		return inoculatedImmunityRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInoculatedImmunityRate(double newInoculatedImmunityRate) {
		inoculatedImmunityRate = newInoculatedImmunityRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNewbornImmunityLossRate() {
		return newbornImmunityLossRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewbornImmunityLossRate(double newNewbornImmunityLossRate) {
		newbornImmunityLossRate = newNewbornImmunityLossRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransmissionRateScaling() {
		return transmissionRateScaling;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionRateScaling(double newTransmissionRateScaling) {
		transmissionRateScaling = newTransmissionRateScaling;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeaslesPackage.MEASLES__VACCINE_EFFICACY:
				return getVaccineEfficacy();
			case MeaslesPackage.MEASLES__INOCULATION_SCALING:
				return getInoculationScaling();
			case MeaslesPackage.MEASLES__PHASE_SHIFT:
				return getPhaseShift();
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION:
				return getSeasonalModulation();
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION_PERIOD:
				return getSeasonalModulationPeriod();
			case MeaslesPackage.MEASLES__INOCULATED_IMMUNITY_RATE:
				return getInoculatedImmunityRate();
			case MeaslesPackage.MEASLES__NEWBORN_IMMUNITY_LOSS_RATE:
				return getNewbornImmunityLossRate();
			case MeaslesPackage.MEASLES__TRANSMISSION_RATE_SCALING:
				return getTransmissionRateScaling();
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
			case MeaslesPackage.MEASLES__VACCINE_EFFICACY:
				setVaccineEfficacy((Double)newValue);
				return;
			case MeaslesPackage.MEASLES__INOCULATION_SCALING:
				setInoculationScaling((Double)newValue);
				return;
			case MeaslesPackage.MEASLES__PHASE_SHIFT:
				setPhaseShift((Double)newValue);
				return;
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION:
				setSeasonalModulation((Double)newValue);
				return;
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION_PERIOD:
				setSeasonalModulationPeriod((Long)newValue);
				return;
			case MeaslesPackage.MEASLES__INOCULATED_IMMUNITY_RATE:
				setInoculatedImmunityRate((Double)newValue);
				return;
			case MeaslesPackage.MEASLES__NEWBORN_IMMUNITY_LOSS_RATE:
				setNewbornImmunityLossRate((Double)newValue);
				return;
			case MeaslesPackage.MEASLES__TRANSMISSION_RATE_SCALING:
				setTransmissionRateScaling((Double)newValue);
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
			case MeaslesPackage.MEASLES__VACCINE_EFFICACY:
				setVaccineEfficacy(VACCINE_EFFICACY_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES__INOCULATION_SCALING:
				setInoculationScaling(INOCULATION_SCALING_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES__PHASE_SHIFT:
				setPhaseShift(PHASE_SHIFT_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION:
				setSeasonalModulation(SEASONAL_MODULATION_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION_PERIOD:
				setSeasonalModulationPeriod(SEASONAL_MODULATION_PERIOD_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES__INOCULATED_IMMUNITY_RATE:
				setInoculatedImmunityRate(INOCULATED_IMMUNITY_RATE_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES__NEWBORN_IMMUNITY_LOSS_RATE:
				setNewbornImmunityLossRate(NEWBORN_IMMUNITY_LOSS_RATE_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES__TRANSMISSION_RATE_SCALING:
				setTransmissionRateScaling(TRANSMISSION_RATE_SCALING_EDEFAULT);
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
			case MeaslesPackage.MEASLES__VACCINE_EFFICACY:
				return vaccineEfficacy != VACCINE_EFFICACY_EDEFAULT;
			case MeaslesPackage.MEASLES__INOCULATION_SCALING:
				return inoculationScaling != INOCULATION_SCALING_EDEFAULT;
			case MeaslesPackage.MEASLES__PHASE_SHIFT:
				return phaseShift != PHASE_SHIFT_EDEFAULT;
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION:
				return seasonalModulation != SEASONAL_MODULATION_EDEFAULT;
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION_PERIOD:
				return seasonalModulationPeriod != SEASONAL_MODULATION_PERIOD_EDEFAULT;
			case MeaslesPackage.MEASLES__INOCULATED_IMMUNITY_RATE:
				return inoculatedImmunityRate != INOCULATED_IMMUNITY_RATE_EDEFAULT;
			case MeaslesPackage.MEASLES__NEWBORN_IMMUNITY_LOSS_RATE:
				return newbornImmunityLossRate != NEWBORN_IMMUNITY_LOSS_RATE_EDEFAULT;
			case MeaslesPackage.MEASLES__TRANSMISSION_RATE_SCALING:
				return transmissionRateScaling != TRANSMISSION_RATE_SCALING_EDEFAULT;
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
		result.append(" (vaccineEfficacy: ");
		result.append(vaccineEfficacy);
		result.append(", inoculationScaling: ");
		result.append(inoculationScaling);
		result.append(", phaseShift: ");
		result.append(phaseShift);
		result.append(", seasonalModulation: ");
		result.append(seasonalModulation);
		result.append(", seasonalModulationPeriod: ");
		result.append(seasonalModulationPeriod);
		result.append(", inoculatedImmunityRate: ");
		result.append(inoculatedImmunityRate);
		result.append(", newbornImmunityLossRate: ");
		result.append(newbornImmunityLossRate);
		result.append(", transmissionRateScaling: ");
		result.append(transmissionRateScaling);
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
		// TODO Auto-generated stub. Implement applyExternalDeltas(...) for MeaslesImpl.
		super.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);
	} // applyExternalDeltas



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel label, long timeDelta) {
		// Incidence
		super.doStochasticProcess(label,  timeDelta);
				
		// Add stochastic noise to incidences and adjust the next value	
		MeaslesLabelValue nextLV = (MeaslesLabelValue)label.getNextValue(); // NOW 
		MeaslesLabelValue previousV = (MeaslesLabelValue)label.getCurrentValue(); // before the last integration step

		// IncidenceV	
		addNoise(previousV, nextLV, MeaslesPackage.eINSTANCE.getMeaslesLabelValue_Vaccinated(), MeaslesPackage.eINSTANCE.getMeaslesLabelValue_IncidenceV(), StandardPackage.eINSTANCE.getSEIRLabelValue_E(), 1.0);	
	} // doStochasticProcess



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			MeaslesLabel diseaseLabel = (MeaslesLabel)ilabel;
			MeaslesLabelValue currentState = (MeaslesLabelValue)ilabel.getProbeValue();
			MeaslesLabelValue deltaValue = (MeaslesLabelValue)ilabel.getDeltaValue();

			for(EAttribute ea:currentState.eClass().getEAllAttributes()) 
				if(currentState.eGetDouble(ea.getFeatureID()) < 0)
					System.out.println("neg");

			deltaValue.reset();
			
			// THIS method gets called multiple times, once for each population identifier
			// in the population model.
			// which population is "this"....
			final MeaslesLabelValue currentSEIR = (MeaslesLabelValue) currentState;
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
			double numberOfVaccinatedToExposed = 0.0;
			double numberSusceptible = currentSEIR.getS();
			double numberVaccinatedNotYetImmune = currentSEIR.getVaccinated();
			
			Node thisNode = diseaseLabel.getNode();

			EList<org.eclipse.stem.core.common.StringValue> groupList = getPopulationGroups().getValues();

			for(int i = 0; i< transmissionVector.size(); i ++) {
				// We need to get the identifier of the ith population model
				String nextPop = groupList.get(i).getValue();

				//////////////////
				// 1. compute BETA for transmission from the ith population to this population
				double specificTransmission = transmissionVector.get(i).getValue();
				double adjustedTransmission = getAdjustedTransmissionRate(specificTransmission, timeDelta);
				adjustedTransmission = adjustedTransmission * this.getTransmissionRateScaling();
				if(!this.isFrequencyDependent()) adjustedTransmission *= getTransmissionRateScaleFactor(diseaseLabel);


				// we need to get the disease label for the ith population as well.
				// to get the on site number of infectios individuals of type i
				EList<NodeLabel> nodeLabels = thisNode.getLabels();
				for(int j = 0; j < nodeLabels.size(); j ++) {
					NodeLabel nlabel = nodeLabels.get(j);
					if(nlabel instanceof MeaslesLabel) {
						if (this == ((MeaslesLabel)label).getDecorator()) {
							MeaslesLabel otherDiseaseLabel = (MeaslesLabel) nlabel;
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

								// Seasonal modulation of transmission
								double cosineMin = 1.0;
								double cosineMax = this.getSeasonalModulation();
								double mod = cosineMin + (cosineMax-cosineMin)*(1+Math.cos(2*Math.PI*(this.getPhaseShift()+t*(double)timeDelta/(double)this.getSeasonalModulationPeriod())))/2;
								// ADD up the new incidence
								numberOfSusceptibleToExposed += mod*adjustedTransmission * numberSusceptible * (effectiveInfectious);
								numberOfVaccinatedToExposed += mod*adjustedTransmission * numberVaccinatedNotYetImmune* effectiveInfectious;
							}
						}
					}// if it's an SI label
				}//for all labels in THIS node
			}// For all population in the model

			double numberOfNewBornToSusceptible = ((double) timeDelta / (double) getTimePeriod())*this.getNewbornImmunityLossRate()*currentSEIR.getM();
			double numberOfInfectedToRecovered = getAdjustedRecoveryRate(thisRecoveryRate, timeDelta) * currentSEIR.getI();
			double numberOfRecoveredToSusceptible = getAdjustedImmunityLossRate(thisImmunityLossRate, timeDelta) * currentSEIR.getR();
			double numberOfExposedToInfected = getAdjustedIncubationRate(thisIncubationRate, timeDelta) * currentSEIR.getE();
			double numberOfVaccinatedToRecovered = ((double) timeDelta / (double) getTimePeriod())*this.getInoculatedImmunityRate()*currentSEIR.getVaccinated();
			
			
			// M->S
			Exchange msExchange = (Exchange)ExchangePool.POOL.get(); 
			msExchange.setSource(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_M());;
			msExchange.setTarget(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			msExchange.setCount(numberOfNewBornToSusceptible);
			msExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(msExchange);
						
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

			// Vac->E
			Exchange vacEExchange = (Exchange)ExchangePool.POOL.get(); 
			vacEExchange.setSource(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_Vaccinated());
			vacEExchange.setTarget(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
			vacEExchange.getForIncidence().add(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_IncidenceV());
			vacEExchange.setCount(numberOfVaccinatedToExposed);
			vacEExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(vacEExchange);

			// Vac->R
			Exchange vacRExchange = (Exchange)ExchangePool.POOL.get(); 
			vacRExchange.setSource(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_Vaccinated());
			vacRExchange.setTarget(StandardPackage.eINSTANCE.getSIRLabelValue_R());
			vacRExchange.setCount(numberOfVaccinatedToRecovered);
			vacRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(vacRExchange);

			
			// Delta M
			double deltaM = -numberOfNewBornToSusceptible;
			// Determine delta S
			double deltaS = numberOfNewBornToSusceptible - numberOfSusceptibleToExposed + numberOfRecoveredToSusceptible;
			// Delta E
			double deltaE = numberOfSusceptibleToExposed + numberOfVaccinatedToExposed- numberOfExposedToInfected;
			// Determine delta I
			double deltaI = numberOfExposedToInfected - numberOfInfectedToRecovered - diseaseDeaths;
			// Determine delta R	
			double deltaR = numberOfInfectedToRecovered - numberOfRecoveredToSusceptible + numberOfVaccinatedToRecovered;

			// Delta vaccinations
			double deltaVaccinations = -numberOfVaccinatedToRecovered-numberOfVaccinatedToExposed;
			
			double numEffectiveVaccinations = 0.0; // Number of effective vaccinations (i.e. enterong V state)\
			// Check if vaccination is in effect. (todo isolations)
			double vaccinations = CTDLFunctions.vaccinations(diseaseLabel.getNode(), diseaseLabel, currentState, time, timeDelta, t);
			double totalVaccinations = 0.0;
			if(vaccinations > 0.0) {
				// We assume that vaccinations happens once in an age group
				int ageGroups = 1;
				if(diseaseLabel.getPopulationModelLabel().getDecorator() instanceof AgingPopulationModel) {
					AgingPopulationModel apm = (AgingPopulationModel)diseaseLabel.getPopulationModelLabel().getDecorator();
					EList<PopulationGroup> groups = apm.getPopulationGroups();
					for(PopulationGroup pg:groups) {
						if(pg.getIdentifier().equals(diseaseLabel.getPopulationModelLabel().getPopulationIdentifier())) {
							AgeGroup ag = (AgeGroup)pg;
							ageGroups = ag.getToAge()-ag.getFromAge()+1;
							break;
						}
					}
				}
				
				vaccinations = vaccinations / (double)ageGroups;
			
				totalVaccinations = vaccinations;
				totalVaccinations = totalVaccinations*this.getInoculationScaling();
				totalVaccinations = totalVaccinations*this.getVaccineEfficacy();
				
				if(totalVaccinations > currentState.getPopulationCount())
					totalVaccinations = currentState.getPopulationCount(); // Safe
				
				MeaslesLabelValue copyState = (MeaslesLabelValue)currentState.copy();
				copyState.scale(totalVaccinations/currentState.getPopulationCount());
				
				deltaS -= copyState.getS();
				
				// Remove per Kezban's request. Vaccinations has no effect on exposed or infected people. 
				// deltaE -= copyState.getE(); 
				// deltaI -= copyState.getI();
				
				numEffectiveVaccinations = copyState.getS();//+copyState.getE()+copyState.getI();
				deltaVaccinations += numEffectiveVaccinations;
				
				// S->VAC
				Exchange sVacExchange = (Exchange)ExchangePool.POOL.get(); 
				sVacExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				sVacExchange.setTarget(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_Vaccinated());
				sVacExchange.setCount(copyState.getS());
				sVacExchange.getForIncidence().add(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_Immunisations());
				sVacExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(sVacExchange);

				// Remove per Kezban's request. Vaccinations has no effect on exposed or infected people.
				// E->VAC
				/*
				Exchange eVacExchange = (Exchange)ExchangePool.POOL.get(); 
				eVacExchange.setSource(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
				eVacExchange.setTarget(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_Vaccinated());
				eVacExchange.setCount(copyState.getE());
				eVacExchange.getForIncidence().add(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_Immunisations());
				eVacExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(eVacExchange);

				// I->VAC
				Exchange iVacExchange = (Exchange)ExchangePool.POOL.get(); 
				iVacExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
				iVacExchange.setTarget(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_Vaccinated());
				iVacExchange.setCount(copyState.getI());
				iVacExchange.getForIncidence().add(MeaslesPackage.eINSTANCE.getMeaslesLabelValue_Immunisations());
				iVacExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(iVacExchange);
				*/
			}
			
			MeaslesLabelValue ret = deltaValue;
			ret.setM(deltaM);
			ret.setS(deltaS);
			ret.setE(deltaE);
			ret.setI(deltaI);
			ret.setR(deltaR);
			ret.setIncidence(numberOfSusceptibleToExposed);
			ret.setDiseaseDeaths(diseaseDeaths);
			ret.setImmunisations(numEffectiveVaccinations); // not totalVaccinations, we don't want to count E->E, I->I or R-> R case
			ret.setVaccinated(deltaVaccinations);
			ret.setIncidenceV(numberOfVaccinatedToExposed);
			
			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	} // calculateDeltas


	
	/**
	 * getBirthsCompartment. Override to put newborns into M compartment
	 * 
	 * @return EAttribute M compartment
	 */
	@Override
	public EAttribute getBirthsCompartment() {
		return MeaslesPackage.eINSTANCE.getMeaslesLabelValue_M();
	}
	
	
	// Generated expression methods
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {	

		DiseaseModelLabel label = MeaslesFactory.eINSTANCE.createMeaslesLabel(); 
		label.setTypeURI(DiseaseModelLabel.URI_TYPE_DYNAMIC_DISEASE_LABEL);

		return label;
	} // createDiseaseModelLabel


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {	
 
		return MeaslesFactory.eINSTANCE.createMeaslesLabelValue(); 
	}

							

} //MeaslesImpl
