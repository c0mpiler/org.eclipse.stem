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
package org.eclipse.stem.diseasemodels.standard.impl;

import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.math.BinomialDistributionUtil;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.SIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIRDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stochastic Poisson SIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StochasticPoissonSIRDiseaseModelImpl extends SIRImpl implements StochasticPoissonSIRDiseaseModel {
	private Random rand = new Random();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StochasticPoissonSIRDiseaseModelImpl() {
		super();
	}

	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIImpl#computeTransitions(StandardDiseaseModelLabelValue,
	 *      StandardDiseaseModelLabel, long)
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {		
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;
			
			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			final SIRLabelValue currentSIR = (SIRLabelValue) currentState;

			// This is beta*
			double transmissionRate = getAdjustedTransmissionRate(timeDelta);

			if(!this.isFrequencyDependent()) transmissionRate *= getTransmissionRateScaleFactor(diseaseLabel);

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
			double numberOfInfectedToRecovered = getAdjustedRecoveryRate(timeDelta)
					* currentSIR.getI();
			double numberOfRecoveredToSusceptible = getAdjustedImmunityLossRate(timeDelta)
					* currentSIR.getR();

			int S = (int)currentSIR.getS();
			double prob = 0.0;
			if(getNonLinearityCoefficient() != 1.0 && effectiveInfectious >= 0.0)
				prob = transmissionRate * Math.pow(effectiveInfectious, getNonLinearityCoefficient());
			else
				prob = transmissionRate * effectiveInfectious;
			double rndVar = rand.nextDouble();
			int pickN = 0;
			pickN = new BinomialDistributionUtil(1).fastPickFromBinomialDist(prob, S);

			// Move pickK from S to I;

			double numberOfSusceptibleToInfected = pickN;

			// Determine delta S
			final double deltaS = numberOfRecoveredToSusceptible - numberOfSusceptibleToInfected;
			// Determine delta I
			final double deltaI = numberOfSusceptibleToInfected- numberOfInfectedToRecovered;
			// Determine delta R
			final double deltaR = numberOfInfectedToRecovered - numberOfRecoveredToSusceptible;

			SIRLabelValueImpl ret = (SIRLabelValueImpl)deltaValue;
			ret.setS(deltaS);
			ret.setI(deltaI);
			ret.setIncidence(numberOfInfectedToRecovered);
			ret.setR(deltaR);
			ret.setDiseaseDeaths(0);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}

	} // computeTransitions

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STOCHASTIC_POISSON_SIR_DISEASE_MODEL;
	}

} //StochasticPoissonSIRDiseaseModelImpl
