package org.eclipse.stem.diseasemodels.experimental.impl;

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
import org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage;
import org.eclipse.stem.diseasemodels.experimental.PercolationDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRImpl;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Percolation Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PercolationDiseaseModelImpl extends SEIRImpl implements PercolationDiseaseModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PercolationDiseaseModelImpl() {
		super();
	}

	LogDiseaseState lds = null;
	int icount = 0;
	static boolean logComplete = false;


	/**
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SEIRImpl#computeDiseaseDeltas(org.eclipse.stem.core.model.STEMTime, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel, long)
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
			
			final SEIRLabelValue currentSEIR = (SEIRLabelValue) currentState;

			// This is beta* The effective transmission rate constant (normalized)
			final double transmisionRate = getAdjustedTransmissionRate(timeDelta)
					* getTransmissionRateScaleFactor(diseaseLabel);


			/*
			 * This Must become a parameter
			 */
			final double CRITICAL_SUSCEPTIBLE = 0.25;

			/*
			 * 4) Compute the "Local Transmission Coefficient"
			 * 
			 * The (Normalized) "Local Transmission Coefficient" depends upon the
			 * disease's specified transmission coefficient, but it scales with the
			 * local population density. This rescaling or "normalization" is done
			 * by the currentCounty.getTransScaleFactor() method.
			 */

			double den = currentSEIR.getPopulationCount();

			double se =  (currentSEIR.getS()+ currentSEIR.getE()+ currentSEIR.getI()) / den;
			//double se =  (currentSEIR.getS()+ currentSEIR.getE()) / den;
			//double se =  currentSEIR.getS() / den;
			double percFact = 1.0;
			double localTransmisionCoefficient = 0.0;


			/*
			 ******************************************************************
			 * THIS IS WHERE WE ADD THE PERCOLATION THRESHOLD TO THE MODEL ****
			 ******************************************************************
			 */ 
			// if above percolation threshold
			if (se >= CRITICAL_SUSCEPTIBLE) {
				// now we put in percolation
				double percNum = se - CRITICAL_SUSCEPTIBLE;
				if (percNum <= 0.0)
					percNum = 0.0; // should never happen
				// Normalization (so all percolation fn terms max at 1.0
				double percNorm = 1.0 - CRITICAL_SUSCEPTIBLE;
				/*
				 * getNonLinearityCoefficient() used differently here....
				 */
				percFact = Math.pow((percNum / percNorm), getNonLinearityCoefficient());
				// THE TRANSMISSION COEF ABOVE CRITICAL POINT
				localTransmisionCoefficient = transmisionRate * percFact;
			} else {
				localTransmisionCoefficient = 0.0;
				////ELSE add an exponential tail
				//double num = -1.0 * Math.abs(CRITICAL_SUSCEPTIBLE - si);
				//num *= (20.0 / nonLinearityExponent);
				////THE TRANSMISSION COEF BELOW CRITICAL POINT
				//localTransmisionCoefficient = .02*Math.exp(num);
				////Activator.logInformation("s= "+si+" beta= "+localTransmisionCoefficient);
			}
			/*
			 *************************************
			 * END PERCOLATION THRESHOLD CODE ****
			 *************************************
			 */ 


			if (lds==null) {
				int inc = (int) (this.getIncubationRate()*100.0);
				int beta = (int) (this.getTransmissionRate()*100.0);
				int rec = (int) (this.getRecoveryRate()*100.0);
				int imloss = (int) (this.getImmunityLossRate()*1000.0);

				lds = new LogDiseaseState("./timelogI"+inc+"B"+beta+"il"+imloss+"r"+rec+".txt");
			}


			double pd = 1.0 / currentSEIR.getPopulationCount();
			String str = icount+", "+currentSEIR.getS() * pd +", "+currentSEIR.getE()* pd + ", " + currentSEIR.getI()* pd + ", " + currentSEIR.getR()* pd + "\n";

			if (icount <= 500) {
				lds.write(str);
				icount++;
			}

			if (icount == 501) {
				if ((!logComplete) && (lds != null)) {
					LogDiseaseState.close();
					logComplete = true;
				}
			}

			// Activator.logInformation(" si = "+si+" str = "+str );

			// The effective Infectious population  is a dimensionless number normalize by total
			// population used in the computation of bets*S*i where i = I{effective}/Pop.
			// This includes a correction to the current
			// infectious population (I{effective}) based on the conserved exchange of people (circulation)
			// between regions. Note that this is no the "arrivals" and "departures" which are
			// a different process.
			final double effectiveInfectious = getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentSEIR.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);


			// Compute the number of recovering "infectious" that become "recovered"
			double numberOfInfectedToRecovered = getAdjustedRecoveryRate(timeDelta)
					* currentSEIR.getI();

			// Compute the number of "recovered" that lose their immunity and
			// become "susceptible"
			double numberOfRecoveredToSusceptible = getAdjustedImmunityLossRate(timeDelta)
					* currentSEIR.getR();

			/*
			 * Compute the number of transitions from Susceptible to Exposed
			 * 
			 * In a linear model the "effective" number of infectious people is just
			 * the number of infectious people In a nonlinear model we have a
			 * nonLinearity exponent that is > 1 this models the effect of immune
			 * system saturation when Susceptible people are exposed to large
			 * numbers of infectious people. then the "effective" number of
			 * infectious people is I^nonLinearity exponent to allow for either
			 * linear or nonlinear models we always calculate I^nonLinearity
			 * exponent and allow nonLinearity exponent >= 1.0
			 */

			double numberOfSusceptibleToExposed = localTransmisionCoefficient
					* currentSEIR.getS()
					* effectiveInfectious;

			// Compute the number of "exposed" that become "infectious"
			double numberOfExposedToInfectious = getAdjustedIncubationRate(timeDelta)
					* currentSEIR.getE();


			final double deltaS = numberOfRecoveredToSusceptible - numberOfSusceptibleToExposed;
			final double deltaE = numberOfSusceptibleToExposed - numberOfExposedToInfectious;
			final double deltaI = numberOfExposedToInfectious - numberOfInfectedToRecovered;
			final double deltaR = numberOfInfectedToRecovered - numberOfRecoveredToSusceptible;

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
			// added to express the transitions. Necessary to support stochastic modeling
			/////////////////////////////////////////////////////////////////////////////
			
			SEIRLabelValueImpl ret = (SEIRLabelValueImpl)deltaValue;
			ret.setS(deltaS);
			ret.setE(deltaE);
			ret.setI(deltaI);
			ret.setIncidence(numberOfSusceptibleToExposed);
			ret.setR(deltaR);
			ret.setDiseaseDeaths(0);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}

	} // computeDiseaseDeltas

	/**
	 * ModelSpecificAdjustments for a Stochastic model adds noise to or adjusts 
	 * the disease state transition values by multiplying
	 * the additions by a random variable r ~ (1+/-x) with x small.
	 * The requirements that no more individuals can be moved from a state than are
	 * already in that state is still enforced.
	 * 
	 */
	/*	@Override
 NOT USED	public void doModelSpecificAdjustments(final LabelValue state) {
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
	protected EClass eStaticClass() {
		return ExperimentalPackage.Literals.PERCOLATION_DISEASE_MODEL;
	}

} //PercolationDiseaseModelImpl
