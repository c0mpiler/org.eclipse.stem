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
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stochastic Poisson SI Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StochasticPoissonSIDiseaseModelImpl extends SIImpl implements StochasticPoissonSIDiseaseModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StochasticPoissonSIDiseaseModelImpl() {
		super();
	}

	private Random rand = new Random();

	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl#computeTransitions(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue,
	 *      long, double, long)
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
			

			final SILabelValue currentSI = (SILabelValue) currentState;

			// This is beta*
			double transmissionRate = getAdjustedTransmissionRate(timeDelta);

			if(!this.isFrequencyDependent()) transmissionRate *= getTransmissionRateScaleFactor(diseaseLabel);

			// The effective Infectious population  is a dimensionles number normalize by total
			// population used in teh computation of bets*S*i where i = Ieffective/Pop.
			// This includes a correction to the current
			// infectious population (Ieffective) based on the conserved exchange of people (circulation)
			// between regions. Note that this is no the "arrivals" and "departures" which are
			// a different process.
			final double effectiveInfectious = getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentSI.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);

			int S = (int)currentSI.getS();
			double prob = 0.0;
			if(getNonLinearityCoefficient() != 1.0 && effectiveInfectious >= 0.0)
				prob = transmissionRate * Math.pow(effectiveInfectious, getNonLinearityCoefficient());
			else
				prob = transmissionRate * effectiveInfectious;
			double rndVar = rand.nextDouble();
			int pickN = 0;
			pickN =  new BinomialDistributionUtil(1).fastPickFromBinomialDist(prob, S);

			// Move pickK from S to I;

			double numberOfSusceptibleToInfected = pickN;

			double numberOfInfectedToSusceptible = getAdjustedRecoveryRate(timeDelta)
					* currentSI.getI();


			// Determine delta S
			final double deltaS = - numberOfSusceptibleToInfected + numberOfInfectedToSusceptible;
			// Determine delta I
			final double deltaI = numberOfSusceptibleToInfected - numberOfInfectedToSusceptible;	

			SILabelValueImpl ret = (SILabelValueImpl)deltaValue;
			ret.setS(deltaS);
			ret.setI(deltaI);
			ret.setIncidence(numberOfSusceptibleToInfected);
			ret.setDiseaseDeaths(0.0);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	} // computeDiseaseDeltas



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STOCHASTIC_POISSON_SI_DISEASE_MODEL;
	}

} //StochasticPoissonSIDiseaseModelImpl
