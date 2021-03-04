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

package org.eclipse.stem.diseasemodels.experimental.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.experimental.CellularDiseaseModel;
import org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SIImpl;
import org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Percolation Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CellularDiseaseModelImpl extends SIImpl implements CellularDiseaseModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellularDiseaseModelImpl() {
		super();
	}

	//LogDiseaseState lds = null;
	//int icount = 0;



	/**
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIImpl#computeDiseaseDeltas(org.eclipse.stem.core.model.STEMTime, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel, long)
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		
		final double adjustedTransmissionRate = getAdjustedTransmissionRate(timeDelta);
		//final double adjustedRecoveryRate = getAdjustedRecoveryRate(timeDelta);
		
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;
			
			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			final SILabelValue currentSI = (SILabelValue) currentState;

			// This is beta*
			final double transmissionRate = (adjustedTransmissionRate
					* getTransmissionRateScaleFactor(diseaseLabel));


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

			double numberOfSusceptibleToInfected = transmissionRate
					* currentSI.getS()* Math.pow(effectiveInfectious, getNonLinearityCoefficient());

			// Compute the number of recovering "infectious" that become "recovered"
			// this is rescaled by the surviving I population  so we don't move people that
			// are already dead.
			double numberOfInfectedToSusceptible = getAdjustedRecoveryRate(timeDelta)
					* currentSI.getI();



			// Determine delta S
			final double deltaS = - numberOfSusceptibleToInfected + numberOfInfectedToSusceptible;
			// Determine delta I
			final double deltaI = numberOfSusceptibleToInfected - numberOfInfectedToSusceptible;	
			SILabelValueImpl ret = (SILabelValueImpl)deltaValue;
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
		return ExperimentalPackage.Literals.PERCOLATION_DISEASE_MODEL;
	}


} //CellularDiseaseModelImpl
