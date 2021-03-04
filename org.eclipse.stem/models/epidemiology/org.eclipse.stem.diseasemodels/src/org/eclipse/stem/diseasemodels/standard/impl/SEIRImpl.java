package org.eclipse.stem.diseasemodels.standard.impl;

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
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.SEIR;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SEIR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.SEIRImpl#getIncubationRate <em>Incubation Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SEIRImpl extends SIRImpl implements SEIR {

	/**
	 * The default value of the '{@link #getIncubationRate() <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double INCUBATION_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncubationRate() <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected double incubationRate = INCUBATION_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SEIRImpl() {
		super();
	}

	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIImpl#computeDiseaseDeltas(StandardDiseaseModelLabelValue,
	 *      StandardDiseaseModelLabel, long)
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		
		final double adjustedInfectiousMortalityRate = getAdjustedInfectiousMortalityRate(timeDelta);
		double transmissionRate = getAdjustedTransmissionRate(timeDelta);
		final double adjustedRecoveryRate = getAdjustedRecoveryRate(timeDelta);
		final double adjustedImmunityLossRate = getAdjustedImmunityLossRate(timeDelta);
		final double adjustedIncubationRate = getAdjustedIncubationRate(timeDelta);
		
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			final SEIRLabelValue currentSEIR = (SEIRLabelValue) currentState;

			// Compute deaths
			
			final double diseaseDeaths = adjustedInfectiousMortalityRate
					* currentSEIR.getI();

			

			if(!this.isFrequencyDependent()) transmissionRate = transmissionRate * getTransmissionRateScaleFactor(diseaseLabel);


			// The effective Infectious population  is a dimensionles number normalize by total
			// population used in teh computation of bets*S*i where i = Ieffective/Pop.
			// This includes a correction to the current
			// infectious population (Ieffective) based on the conserved exchange of people (circulation)
			// between regions. Note that this is no the "arrivals" and "departures" which are
			// a different process.
			final double effectiveInfectious = getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentSEIR.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);

			/*
			 * Compute state transitions
			 * 
			 * Regarding computing the number of transitions from Susceptible to Exposed:
			 * In a linear model the "effective" number of infectious people is just
			 * the number of infectious people In a nonlinear model we have a
			 * nonLinearity exponent that is > 1 this models the effect of immune
			 * system saturation when Susceptible people are exposed to large
			 * numbers of infectious people. then the "effective" number of
			 * infectious people is I^nonLinearity exponent to allow for either
			 * linear or nonlinear models we always calculate I^nonLinearity
			 * exponent and allow nonLinearity exponent >= 1.0
			 */
			double numberOfInfectedToRecovered = adjustedRecoveryRate
					* currentSEIR.getI();
			double numberOfRecoveredToSusceptible = adjustedImmunityLossRate
					* currentSEIR.getR();
			// Need to checked what do do here. If non linear coefficient is not 1 and
			// the effective infectious is negative (which is possible), what do do? 
			// Let's fall back on the linear method for now.
			double numberOfSusceptibleToExposed = 0.0;
			if(getNonLinearityCoefficient() != 1.0 && effectiveInfectious >=0.0)
				numberOfSusceptibleToExposed = transmissionRate
				* currentSEIR.getS()* Math.pow(effectiveInfectious, getNonLinearityCoefficient());
			else 
				numberOfSusceptibleToExposed = transmissionRate
				* currentSEIR.getS()* effectiveInfectious;
			double numberOfExposedToInfectious =adjustedIncubationRate
					* currentSEIR.getE();


			// Determine delta S
			double deltaS = numberOfRecoveredToSusceptible - numberOfSusceptibleToExposed;
			// Determine delta E
			double deltaE = numberOfSusceptibleToExposed - numberOfExposedToInfectious;		
			// Determine delta I
			double deltaI = numberOfExposedToInfectious - numberOfInfectedToRecovered - diseaseDeaths;
			// Determine delta R
			double deltaR = numberOfInfectedToRecovered - numberOfRecoveredToSusceptible;

			StandardInterventionLabel scl = findInterventionLabel((Node)diseaseLabel.getIdentifiable());
			double vaccinations = 0;
			double isolations = 0;
			if(scl != null) {
			    vaccinations = ((StandardInterventionLabelValue)scl.getCurrentValue()).getVaccinations();
				isolations = ((StandardInterventionLabelValue)scl.getCurrentValue()).getIsolations();
				vaccinations *= ((double) timeDelta / (double) getTimePeriod());
				isolations *= ((double) timeDelta / (double) getTimePeriod());
				if(currentSEIR.getS() < vaccinations) vaccinations = currentSEIR.getS();
				if(currentSEIR.getI() < isolations) isolations = currentSEIR.getI();

				deltaS -= vaccinations;
				deltaR += vaccinations;
				deltaI -= isolations;
				deltaR += isolations;
			}
			
		
			
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
			eiExchange.setCount(numberOfExposedToInfectious);
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
			
			// S->R
			if(vaccinations > 0) {
				Exchange srExchange = (Exchange)ExchangePool.POOL.get(); 
				srExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				srExchange.setTarget(StandardPackage.eINSTANCE.getSIRLabelValue_R());
				srExchange.setCount(vaccinations);
				srExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(srExchange);
			}

			// I->R
			if(isolations > 0) {
				Exchange irIsoExchange = (Exchange)ExchangePool.POOL.get(); 
				irIsoExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
				irIsoExchange.setTarget(StandardPackage.eINSTANCE.getSIRLabelValue_R());
				irIsoExchange.setCount(isolations);
				irIsoExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(irIsoExchange);
			}
			// added to express the transitions. Necessary to support stochastic modeling
			/////////////////////////////////////////////////////////////////////////////

			
			SEIRLabelValueImpl ret = (SEIRLabelValueImpl)deltaValue;
			ret.setS(deltaS);
			ret.setE(deltaE);
			ret.setI(deltaI);
			ret.setIncidence(numberOfSusceptibleToExposed);
			ret.setR(deltaR);
			ret.setDiseaseDeaths(diseaseDeaths);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}

	} // computeDiseaseDeltas


	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#createDiseaseModelLabel()
	 */
	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSEIRLabel();
	} // createDiseaseModelLabel

	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSEIRLabelValue();
	} // createDiseaseModelLabelValue


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SEIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncubationRate() {
		return incubationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newIncubationRate
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncubationRate(double newIncubationRate) {
		incubationRate = newIncubationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param timeDelta
	 *            the time period to adjust the rate to
	 * @return the adjusted rate
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getAdjustedIncubationRate(long timeDelta) {
		return getIncubationRate()
				* ((double) timeDelta / (double) getTimePeriod());
	} // getAdjustedIncubationRate


	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param resolve
	 * @param coreType
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.SEIR__INCUBATION_RATE:
				return getIncubationRate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param newValue
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.SEIR__INCUBATION_RATE:
				setIncubationRate((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.SEIR__INCUBATION_RATE:
				setIncubationRate(INCUBATION_RATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.SEIR__INCUBATION_RATE:
				return incubationRate != INCUBATION_RATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (incubationRate: "); //$NON-NLS-1$
		result.append(incubationRate);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.eclipse.stem.core.model.impl.NodeDecoratorImpl#sane()
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();

		retValue = retValue && getIncubationRate() >= INCUBATION_RATE_EDEFAULT;
		assert retValue;

		retValue = retValue && !Double.isInfinite(getIncubationRate());
		assert retValue;

		retValue = retValue && !Double.isNaN(getIncubationRate());
		assert retValue;

		return retValue;
	} // sane

} // SEIRImpl
