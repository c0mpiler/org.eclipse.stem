package org.eclipse.stem.diseasemodels.forcing.impl;
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
import org.eclipse.stem.diseasemodels.forcing.ForcingPackage;
import org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.SIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SIRImpl;
import org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gaussian Forcing Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.impl.GaussianForcingDiseaseModelImpl#getSigma2 <em>Sigma2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.impl.GaussianForcingDiseaseModelImpl#getModulationPeriod <em>Modulation Period</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.impl.GaussianForcingDiseaseModelImpl#getModulationPhaseShift <em>Modulation Phase Shift</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.impl.GaussianForcingDiseaseModelImpl#getModulationFloor <em>Modulation Floor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GaussianForcingDiseaseModelImpl extends SIRImpl implements GaussianForcingDiseaseModel {
	/**
	 * The default value of the '{@link #getSigma2() <em>Sigma2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigma2()
	 * @generated
	 * @ordered
	 */
	protected static final double SIGMA2_EDEFAULT = 100.0;
	/**
	 * The cached value of the '{@link #getSigma2() <em>Sigma2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigma2()
	 * @generated
	 * @ordered
	 */
	protected double sigma2 = SIGMA2_EDEFAULT;
	/**
	 * The default value of the '{@link #getModulationPeriod() <em>Modulation Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double MODULATION_PERIOD_EDEFAULT = 365.25;
	/**
	 * The cached value of the '{@link #getModulationPeriod() <em>Modulation Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationPeriod()
	 * @generated
	 * @ordered
	 */
	protected double modulationPeriod = MODULATION_PERIOD_EDEFAULT;
	/**
	 * The default value of the '{@link #getModulationPhaseShift() <em>Modulation Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected static final double MODULATION_PHASE_SHIFT_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getModulationPhaseShift() <em>Modulation Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected double modulationPhaseShift = MODULATION_PHASE_SHIFT_EDEFAULT;
	/**
	 * The default value of the '{@link #getModulationFloor() <em>Modulation Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationFloor()
	 * @generated
	 * @ordered
	 */
	protected static final double MODULATION_FLOOR_EDEFAULT = 0.6;
	/**
	 * The cached value of the '{@link #getModulationFloor() <em>Modulation Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationFloor()
	 * @generated
	 * @ordered
	 */
	protected double modulationFloor = MODULATION_FLOOR_EDEFAULT;

	//private Calendar calendar = Calendar.getInstance();
	//private Calendar calendar2 = Calendar.getInstance();
	//private static final double MILLIS_PER_DAY = 1000.0*60.0*60.0*24.0;

	private static final int WINDOWSIZE = 30;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GaussianForcingDiseaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForcingPackage.Literals.GAUSSIAN_FORCING_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSigma2() {
		return sigma2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigma2(double newSigma2) {
		sigma2 = newSigma2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getModulationPeriod() {
		return modulationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulationPeriod(double newModulationPeriod) {
		modulationPeriod = newModulationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getModulationPhaseShift() {
		return modulationPhaseShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulationPhaseShift(double newModulationPhaseShift) {
		modulationPhaseShift = newModulationPhaseShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getModulationFloor() {
		return modulationFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulationFloor(double newModulationFloor) {
		modulationFloor = newModulationFloor;
	}

	/**
	 * To create a user defined (experimental) disease mode, the user may wish 
	 * to extend the existing models but simply override two methods.
	 * computeDiseaseDeltas() sets the work flow for the model. The following example
	 * is derived from the standard code for all build in models but in the line below
	 * where we define final "double transmisionRate" we show and example modification
	 * where a periodic forcing factor { sin(freq*t) } is added to the code as an example
	 * modification.
	 * 
	 * @param time
	 * 			  current time
	 * @param currentState
	 *            the current state of the population
	 * @param diseaseLabel
	 *            the disease label for which the state transitions are being
	 *            computed.
	 * @param timeDelta
	 *            the time period (milliseconds) over which the population
	 *            members transition to new states          
	 * @return a disease state label value that contains the number of
	 *         delta changes in each disease state
	 * 
	 * Users can modify the method below to create their own model.
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIImpl#computeDiseaseDeltas(StandardDiseaseModelLabelValue,
	 *      StandardDiseaseModelLabel, long)
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		
		final double adjustedTransmissionRate = getAdjustedTransmissionRate(timeDelta);
		final double adjustedRecoveryRate =  getAdjustedRecoveryRate(timeDelta);
		final double adjustedImmunityLossRate = getAdjustedImmunityLossRate(timeDelta);
		
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			final SIRLabelValue currentSIR = (SIRLabelValue) currentState;

			double modulationPeriod = getModulationPeriod();
			double sigma2 = getSigma2();		

			int year = (int)(t / modulationPeriod);
			int nextDayYear = (int)((t+1) / modulationPeriod);

			double modulatedTransmissionRate = 0.0;

			// Smoothing
			if(t % modulationPeriod < WINDOWSIZE || t % modulationPeriod > modulationPeriod-WINDOWSIZE) {
				double pos;
				double fday = ((t % modulationPeriod)-modulationPeriod/2.0)/modulationPeriod;
				double f1 = adjustedTransmissionRate  * (getModulationFloor() + (1-getModulationFloor())*Math.exp(-(Math.pow(fday,2))/(2*sigma2)));
				double f2 = adjustedTransmissionRate* (getModulationFloor() + (1-getModulationFloor())*Math.exp(-(Math.pow(fday-1,2))/(2*sigma2)));
				double f3 = adjustedTransmissionRate * (getModulationFloor() + (1-getModulationFloor())*Math.exp(-(Math.pow(fday+1,2))/(2*sigma2)));


				if((t % modulationPeriod) > modulationPeriod - WINDOWSIZE)
					pos = WINDOWSIZE - (modulationPeriod - (t % modulationPeriod));
				else pos = WINDOWSIZE+(t % modulationPeriod);

				pos = Math.round(pos);
				double smooth = 0;
				if(pos == WINDOWSIZE && nextDayYear == year)
					smooth = 0.5*f1 + 0.5*f3;
				else if(pos == WINDOWSIZE && nextDayYear == year+1)
					smooth = 0.5*f1 +0.5*f2;
				else if (pos < WINDOWSIZE)
					smooth = ((2*WINDOWSIZE-pos)/(2*WINDOWSIZE))*f1 + (pos/(2*WINDOWSIZE))*f2;
				else 
					smooth = (pos/(2*WINDOWSIZE))*f1 + ((2*WINDOWSIZE-pos)/(2*WINDOWSIZE))*f3;

				modulatedTransmissionRate = smooth;
			} else {
				double fday = ((t % modulationPeriod)-modulationPeriod/2.0)/modulationPeriod;
				modulatedTransmissionRate = (getAdjustedTransmissionRate(timeDelta))  * (getModulationFloor() + (1-getModulationFloor())*Math.exp(-(Math.pow(fday,2))/(2*sigma2)));
			}


			/*		if(diseaseLabel.getNode().getURI().toString().hashCode() % 2 == 0 
				&& ((int)intDay) == 3285)
				transmissionRate *=10;
		else 
		if(diseaseLabel.getNode().getURI().toString().hashCode() % 2 == 1 
			&& ((int)intDay) == 3285)	
				transmissionRate *=0.1;
			 */		


			if(!this.isFrequencyDependent())  modulatedTransmissionRate *= getTransmissionRateScaleFactor(diseaseLabel);

			/*		synchronized(writtedTimes) {
			if(!writtedTimes.contains(time.getTime().getTime())) {
				try {
				if(fw == null) fw = new FileWriter("beta.csv");
				fw.write((int)intDay+","+modulatedTransmissionRate+"\n");
				fw.flush();
				} catch(Exception e) {
					e.printStackTrace();
				}
				writtedTimes.add(time.getTime().getTime());
			}
		}
			 */
			// The effective Infectious population  is a dimensionles number normalize by total
			// population used in teh computation of bets*S*i where i = Ieffective/Pop.
			// This includes a correction to the current
			// infectious population (Ieffective) based on the conserved exchange of people (circulation)
			// between regions. Note that this is no the "arrivals" and "departures" which are
			// a different process.
			final double effectiveInfectious = getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentSIR.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);

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
					* currentSIR.getI();
			double numberOfRecoveredToSusceptible = adjustedImmunityLossRate
					* currentSIR.getR();
			// Need to checked what do do here. If non linear coefficient is not 1 and
			// the effective infectious is negative (which is possible), what do do? 
			// Let's fall back on the linear method for now.
			double numberOfSusceptibleToInfected = 0.0;
			if(getNonLinearityCoefficient() != 1.0 && effectiveInfectious >= 0.0)
				numberOfSusceptibleToInfected = modulatedTransmissionRate
				* currentSIR.getS()* Math.pow(effectiveInfectious, getNonLinearityCoefficient());
			else
				numberOfSusceptibleToInfected = modulatedTransmissionRate
				* currentSIR.getS()* effectiveInfectious;


			// Determine delta S
			final double deltaS = numberOfRecoveredToSusceptible - numberOfSusceptibleToInfected;
			// Determine delta I
			final double deltaI = numberOfSusceptibleToInfected- numberOfInfectedToRecovered;
			// Determine delta R
			final double deltaR = numberOfInfectedToRecovered - numberOfRecoveredToSusceptible;
			

			/////////////////////////////////////////////////////////////////////////////
			// added to express the transitions. Necessary to support stochastic modeling
			// S->I
			Exchange siExchange = (Exchange)ExchangePool.POOL.get(); 
			siExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			siExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
			siExchange.setCount(numberOfSusceptibleToInfected);
			siExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
			siExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(siExchange);
			
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


			SIRLabelValueImpl ret = (SIRLabelValueImpl)deltaValue;
			ret.setS(deltaS);
			ret.setI(deltaI);
			ret.setIncidence(numberOfSusceptibleToInfected);
			ret.setR(deltaR);
			ret.setDiseaseDeaths(0);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	} // computeTransitions

	/**
	 * ModelSpecificAdjustments for a Stochastic model adds noise to or adjusts 
	 * the disease state transition values by multiplying
	 * the additions by a random variable r ~ (1+/-x) with x small.
	 * The requirements that no more individuals can be moved from a state than are
	 * already in that state is still enforced.
	 * 
	 */
	/* NOT USED	@Override
	public void doModelSpecificAdjustments(final LabelValue state) {
			final SILabelValue currentSI = (SILabelValue) state;
			double oldI = currentSI.getI();
			double Inoisy = currentSI.getI()* computeNoise();
			double change = oldI-Inoisy;
			currentSI.setI(Inoisy);
			double newS = currentSI.getS() + change;
			if(newS < 0.0) {
				// Need to rescale
				double scale = (currentSI.getS() + newS) / currentSI.getS();
				currentSI.setI(Inoisy*scale);
			} else  currentSI.setS(newS);
			return;
	} // doModelSpecificAdjustments
	 */

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2:
			return getSigma2();
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD:
			return getModulationPeriod();
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT:
			return getModulationPhaseShift();
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_FLOOR:
			return getModulationFloor();
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
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2:
			setSigma2((Double)newValue);
			return;
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD:
			setModulationPeriod((Double)newValue);
			return;
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT:
			setModulationPhaseShift((Double)newValue);
			return;
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_FLOOR:
			setModulationFloor((Double)newValue);
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
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2:
			setSigma2(SIGMA2_EDEFAULT);
			return;
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD:
			setModulationPeriod(MODULATION_PERIOD_EDEFAULT);
			return;
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT:
			setModulationPhaseShift(MODULATION_PHASE_SHIFT_EDEFAULT);
			return;
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_FLOOR:
			setModulationFloor(MODULATION_FLOOR_EDEFAULT);
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
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2:
			return sigma2 != SIGMA2_EDEFAULT;
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD:
			return modulationPeriod != MODULATION_PERIOD_EDEFAULT;
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT:
			return modulationPhaseShift != MODULATION_PHASE_SHIFT_EDEFAULT;
		case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_FLOOR:
			return modulationFloor != MODULATION_FLOOR_EDEFAULT;
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
		result.append(" (sigma2: "); //$NON-NLS-1$
		result.append(sigma2);
		result.append(", modulationPeriod: "); //$NON-NLS-1$
		result.append(modulationPeriod);
		result.append(", modulationPhaseShift: "); //$NON-NLS-1$
		result.append(modulationPhaseShift);
		result.append(", modulationFloor: "); //$NON-NLS-1$
		result.append(modulationFloor);
		result.append(')');
		return result.toString();
	}

} //GaussianForcingDiseaseModelImpl
