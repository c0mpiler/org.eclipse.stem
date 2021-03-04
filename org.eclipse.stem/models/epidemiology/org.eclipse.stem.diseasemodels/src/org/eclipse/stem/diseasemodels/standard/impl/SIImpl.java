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
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.SI;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.SIImpl#getTransmissionRate <em>Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.SIImpl#getNonLinearityCoefficient <em>Non Linearity Coefficient</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.SIImpl#getRecoveryRate <em>Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.SIImpl#getInfectiousMortalityRate <em>Infectious Mortality Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIImpl extends StandardDiseaseModelImpl implements SI {
	/**
	 * The default value of the '{@link #getTransmissionRate() <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSMISSION_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransmissionRate() <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected double transmissionRate = TRANSMISSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonLinearityCoefficient() <em>Non Linearity Coefficient</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNonLinearityCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final double NON_LINEARITY_COEFFICIENT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getNonLinearityCoefficient() <em>Non Linearity Coefficient</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNonLinearityCoefficient()
	 * @generated
	 * @ordered
	 */
	protected double nonLinearityCoefficient = NON_LINEARITY_COEFFICIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveryRate() <em>Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RECOVERY_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRecoveryRate() <em>Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected double recoveryRate = RECOVERY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfectiousMortalityRate() <em>Infectious Mortality Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInfectiousMortalityRate()
	 * @generated
	 * @ordered
	 */
	protected static final double INFECTIOUS_MORTALITY_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInfectiousMortalityRate() <em>Infectious Mortality Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInfectiousMortalityRate()
	 * @generated
	 * @ordered
	 */
	protected double infectiousMortalityRate = INFECTIOUS_MORTALITY_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SIImpl() {
		super();
	}

	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl#computeTransitions(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue,
	 *      long, double, long)
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		
		final double adjustedInfectiousMortalityRate = getAdjustedInfectiousMortalityRate(timeDelta);
		double transmissionRate = getAdjustedTransmissionRate(timeDelta);
		final double adjustedRecoveryRate =  getAdjustedRecoveryRate(timeDelta);
		
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			final SILabelValue currentSI = (SILabelValue) currentState;

			// Compute deaths
			
			final double diseaseDeaths = adjustedInfectiousMortalityRate
					* currentSI.getI();

			// This is beta*
			

			if(!this.isFrequencyDependent()) transmissionRate *= getTransmissionRateScaleFactor(diseaseLabel);

			// The effective Infectious population  is a dimensionles number normalize by total
			// population used in teh computation of bets*S*i where i = Ieffective/Pop.
			// This includes a correction to the current
			// infectious population (Ieffective) based on the conserved exchange of people (circulation)
			// between regions. Note that this is no the "arrivals" and "departures" which are
			// a different process.
			final double effectiveInfectious = getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentSI.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);

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

			// Need to checked what do do here. If non linear coefficient is not 1 and
			// the effective infectious is negative (which is possible), what do do? 
			// Let's fall back on the linear method for now.
			double numberOfSusceptibleToInfected = 0.0;
			if(getNonLinearityCoefficient() != 1.0 && effectiveInfectious >= 0.0)
				numberOfSusceptibleToInfected = transmissionRate
				* currentSI.getS()* Math.pow(effectiveInfectious, getNonLinearityCoefficient());
			else
				numberOfSusceptibleToInfected = transmissionRate
				* currentSI.getS()* effectiveInfectious;

			double numberOfInfectedToSusceptible = adjustedRecoveryRate
					* currentSI.getI();


			// Determine delta S
			final double deltaS = - numberOfSusceptibleToInfected + numberOfInfectedToSusceptible;
			// Determine delta I
			final double deltaI = numberOfSusceptibleToInfected - numberOfInfectedToSusceptible - diseaseDeaths;	

			SILabelValueImpl ret = (SILabelValueImpl)deltaValue;
			
			// Store transitions (for stochastic models)
			
			/////////////////////////////////////////////////////////////////////////////
			// added to express the transitions. Necessary to support stochastic modeling
			// S->I
			Exchange siExchange = (Exchange)ExchangePool.POOL.get(); 
			siExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			siExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
			siExchange.setCount(numberOfSusceptibleToInfected);
			siExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
			siExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			ret.getDepartures().add(siExchange);
			
			// I->S
			Exchange isExchange = (Exchange)ExchangePool.POOL.get(); 
			isExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
			isExchange.setTarget(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			isExchange.setCount(numberOfInfectedToSusceptible);
			isExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			ret.getDepartures().add(isExchange);
			// added to express the transitions. Necessary to support stochastic modeling
			/////////////////////////////////////////////////////////////////////////////
			
			ret.setS(deltaS);
			ret.setI(deltaI);
			ret.setIncidence(numberOfSusceptibleToInfected);
			ret.setDiseaseDeaths(diseaseDeaths);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	} // 


	/**
	 * This method is used to scale the transmission rate.
	 * it returns the local density divided by a "reference" density
	 * @param diseaseLabel the label being processed
	 * @return the transmission rate scale factor for the label being processed
	 */
	public double getTransmissionRateScaleFactor(
			StandardDiseaseModelLabel diseaseLabel) {
		//final StandardDiseaseModelState sdms = (StandardDiseaseModelState) diseaseLabel
		//		.getDiseaseModelState();

		double referenceDensity = getReferencePopulationDensity();
		// assert(referenceDensity > 0);
		// need editor check so ref density always >1. Default is 100.
		assert getArea(diseaseLabel.getPopulationLabel()) > 0.0;
		double localDensity = ((StandardDiseaseModelLabelValue)diseaseLabel.getTempValue()).getPopulationCount()/getArea(diseaseLabel.getPopulationLabel());
		return localDensity/referenceDensity;
	} // getTransmissionRateScaleFactor


	/**
	 * The <em>infectious mortality rate</em> is the rate at which
	 * <em>Infectious</em> population members die. Basically, that rate is
	 * simply the proportional fraction of the flow into the <em>Infectious</em>
	 * state.
	 * 
	 * @param infectiousInputRate
	 *            the rate at which population members enter the infectious
	 *            state (&beta;)
	 * @param infectiousMortality
	 *            the proportion of population members that die from the disease
	 *            (x)
	 * @return the rate at which population members die from the disease
	 */
	//	public double computeInfectiousMortalityRate(
	//			final double infectiousInputRate, final double infectiousMortality) {
	//		return infectiousMortality * infectiousInputRate;
	//	} // computeInfectiousMortalityRate


	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#createDiseaseModelLabel()
	 */
	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSILabel();
	} // createDiseaseModelLabel

	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSILabelValue();
	} // createDiseaseModelLabelValue


	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#createInfector()
	 */
	@Override
	public Infector createInfector() {
		SIInfector retValue = StandardFactory.eINSTANCE.createSIInfector();
		retValue.setDiseaseName(this.getDiseaseName());
		retValue.setPopulationIdentifier(getPopulationIdentifier());
		return retValue;
	} // createInfector

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransmissionRate() {
		return transmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newTransmissionRate
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionRate(double newTransmissionRate) {
		transmissionRate = newTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRecoveryRate() {
		return recoveryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newRecoveryRate
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryRate(double newRecoveryRate) {
		recoveryRate = newRecoveryRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getInfectiousMortalityRate() {
		return infectiousMortalityRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfectiousMortalityRate(double newInfectiousMortalityRate) {
		infectiousMortalityRate = newInfectiousMortalityRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getAdjustedInfectiousMortalityRate(long timeDelta) {
		// TODO this division can be eliminated if timeDelta==getTimePeriod
		return getInfectiousMortalityRate()
				* ((double) timeDelta / (double) getTimePeriod());
	} // getAdjustedInfectiousMortalityRate

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNonLinearityCoefficient() {
		return nonLinearityCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newNonLinearityCoefficient
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonLinearityCoefficient(double newNonLinearityCoefficient) {
		nonLinearityCoefficient = newNonLinearityCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the time interval deltaT divided by the initial time period
	 * @param timeDelta
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public double getAdjustedTransmissionRate(long timeDelta) {
		return getTransmissionRate()
				* ((double) timeDelta / (double) getTimePeriod());
	} // getAdjustedTransmissionRate

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param timeDelta
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public double getAdjustedRecoveryRate(long timeDelta) {
		return getRecoveryRate()
				* ((double) timeDelta / (double) getTimePeriod());
	} // getAdjustedRecoveryRate

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
			case StandardPackage.SI__TRANSMISSION_RATE:
				return getTransmissionRate();
			case StandardPackage.SI__NON_LINEARITY_COEFFICIENT:
				return getNonLinearityCoefficient();
			case StandardPackage.SI__RECOVERY_RATE:
				return getRecoveryRate();
			case StandardPackage.SI__INFECTIOUS_MORTALITY_RATE:
				return getInfectiousMortalityRate();
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
			case StandardPackage.SI__TRANSMISSION_RATE:
				setTransmissionRate((Double)newValue);
				return;
			case StandardPackage.SI__NON_LINEARITY_COEFFICIENT:
				setNonLinearityCoefficient((Double)newValue);
				return;
			case StandardPackage.SI__RECOVERY_RATE:
				setRecoveryRate((Double)newValue);
				return;
			case StandardPackage.SI__INFECTIOUS_MORTALITY_RATE:
				setInfectiousMortalityRate((Double)newValue);
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
			case StandardPackage.SI__TRANSMISSION_RATE:
				setTransmissionRate(TRANSMISSION_RATE_EDEFAULT);
				return;
			case StandardPackage.SI__NON_LINEARITY_COEFFICIENT:
				setNonLinearityCoefficient(NON_LINEARITY_COEFFICIENT_EDEFAULT);
				return;
			case StandardPackage.SI__RECOVERY_RATE:
				setRecoveryRate(RECOVERY_RATE_EDEFAULT);
				return;
			case StandardPackage.SI__INFECTIOUS_MORTALITY_RATE:
				setInfectiousMortalityRate(INFECTIOUS_MORTALITY_RATE_EDEFAULT);
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
			case StandardPackage.SI__TRANSMISSION_RATE:
				return transmissionRate != TRANSMISSION_RATE_EDEFAULT;
			case StandardPackage.SI__NON_LINEARITY_COEFFICIENT:
				return nonLinearityCoefficient != NON_LINEARITY_COEFFICIENT_EDEFAULT;
			case StandardPackage.SI__RECOVERY_RATE:
				return recoveryRate != RECOVERY_RATE_EDEFAULT;
			case StandardPackage.SI__INFECTIOUS_MORTALITY_RATE:
				return infectiousMortalityRate != INFECTIOUS_MORTALITY_RATE_EDEFAULT;
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
		result.append(" (transmissionRate: "); //$NON-NLS-1$
		result.append(transmissionRate);
		result.append(", nonLinearityCoefficient: "); //$NON-NLS-1$
		result.append(nonLinearityCoefficient);
		result.append(", recoveryRate: "); //$NON-NLS-1$
		result.append(recoveryRate);
		result.append(", infectiousMortalityRate: "); //$NON-NLS-1$
		result.append(infectiousMortalityRate);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl#sane()
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();

		// transmissionRate
		retValue = retValue && getTransmissionRate() >= TRANSMISSION_RATE_EDEFAULT;
		assert retValue;

		retValue = retValue && !Double.isInfinite(getTransmissionRate());
		assert retValue;

		retValue = retValue && !Double.isNaN(getTransmissionRate());
		assert retValue;

		// recoveryRate
		retValue = retValue && getRecoveryRate() >= RECOVERY_RATE_EDEFAULT;
		assert retValue;

		retValue = retValue && !Double.isInfinite(getRecoveryRate());
		assert retValue;

		retValue = retValue && !Double.isNaN(getRecoveryRate());
		assert retValue;

		// nonLinearityCoefficient
		retValue = retValue
				&& getNonLinearityCoefficient() >= 0.0;
				assert retValue;

				retValue = retValue && !Double.isInfinite(getNonLinearityCoefficient());
				assert retValue;

				retValue = retValue && !Double.isNaN(getNonLinearityCoefficient());
				assert retValue;

				return retValue;
	} // sane

} // SIImpl
