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
package org.eclipse.stem.diseasemodels.evolving.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.evolving.EvolvingFactory;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelImpl#getImmunityLossRate <em>Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelImpl#getCrossImmunityRate <em>Cross Immunity Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvolvingSIRDiseaseModelImpl extends EvolvingSIDiseaseModelImpl implements EvolvingSIRDiseaseModel {
	/**
	 * The default value of the '{@link #getImmunityLossRate() <em>Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected static final double IMMUNITY_LOSS_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getImmunityLossRate() <em>Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected double immunityLossRate = IMMUNITY_LOSS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossImmunityRate() <em>Cross Immunity Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossImmunityRate()
	 * @generated
	 * @ordered
	 */
	protected static final double CROSS_IMMUNITY_RATE_EDEFAULT = 0.75;

	/**
	 * The cached value of the '{@link #getCrossImmunityRate() <em>Cross Immunity Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossImmunityRate()
	 * @generated
	 * @ordered
	 */
	protected double crossImmunityRate = CROSS_IMMUNITY_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSIRDiseaseModelImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolvingPackage.Literals.EVOLVING_SIR_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getImmunityLossRate() {
		return immunityLossRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunityLossRate(double newImmunityLossRate) {
		immunityLossRate = newImmunityLossRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCrossImmunityRate() {
		return crossImmunityRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossImmunityRate(double newCrossImmunityRate) {
		crossImmunityRate = newCrossImmunityRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE:
				return getImmunityLossRate();
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE:
				return getCrossImmunityRate();
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
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE:
				setImmunityLossRate((Double)newValue);
				return;
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE:
				setCrossImmunityRate((Double)newValue);
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
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE:
				setImmunityLossRate(IMMUNITY_LOSS_RATE_EDEFAULT);
				return;
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE:
				setCrossImmunityRate(CROSS_IMMUNITY_RATE_EDEFAULT);
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
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE:
				return immunityLossRate != IMMUNITY_LOSS_RATE_EDEFAULT;
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE:
				return crossImmunityRate != CROSS_IMMUNITY_RATE_EDEFAULT;
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
		result.append(" (immunityLossRate: ");
		result.append(immunityLossRate);
		result.append(", crossImmunityRate: ");
		result.append(crossImmunityRate);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
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
		
//		// Matt, we have not decorated the graph at this point right??
		for (DynamicLabel dl : this.getLabelsToUpdate()) {
			if (dl instanceof EvolvingSIRDiseaseModelLabel) {
				double s = 0.0;
				double i = 0.0;
				double r = 0.0;
				double diseaseDeaths = 0.0;
				
				// this is the new label we need to set
				EvolvingSIRDiseaseModelLabel childLabel = (EvolvingSIRDiseaseModelLabel)dl;
				EvolvingSIRDiseaseModelLabelValue childLabelValues = (EvolvingSIRDiseaseModelLabelValue)childLabel.getCurrentValue();
				// this is the new label we need to set
				EvolvingSIRDiseaseModelLabel parentSIRlabel = (EvolvingSIRDiseaseModelLabel) parentEvolutionSource;
				// same parent population
				childLabel.setPopulationLabel(parentSIRlabel.getPopulationLabel());
				childLabel.setPopulationModelLabel(parentSIRlabel.getPopulationModelLabel());
				
				// get the parent label value - we need this to know the current population
				EvolvingSIRDiseaseModelLabelValue lv = (EvolvingSIRDiseaseModelLabelValue)parentSIRlabel.getCurrentValue();
				double popCount = lv.getPopulationCount();
				s = popCount;
				
				
				// Do something interesting here to initialize disease state
				// TODO performance question
				// TODO we are looking through the entire graphs to find THIS label. 
				if (childLabel.getNode().getURI().equals(evolutionLocation)) {
					// This is where the evolution happened, so you probably need to set your
					// infectious state differently
					System.out.println("initializing child disease at evolution location");
					if(parentEvolutionSource instanceof EvolvingSIRDiseaseModelLabel) {
						// should be true
						if(popCount > 1.0) {
							// init the child diseases values
							i = 1.0;
							s = s - 1.0;
						} else {
							System.err.println("Likely ERROR: Zero population detected on node "+currentNode.getURI().lastSegment()+" ...  Do something.");
						}
					}
					
				} else {
					// This is everywhere else
					// for now we are already set
				} // if else
				
				childLabelValues.setS(s);
				childLabelValues.setI(i);
				childLabelValues.setR(r);
				childLabelValues.setDiseaseDeaths(diseaseDeaths);
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param timeDelta
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected double getAdjustedImmunityLossRate(long timeDelta) {
		return getImmunityLossRate()
				* ((double) timeDelta / (double) getTimePeriod());
	} // getAdjustedImmunityRate
	
	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIImpl#computeTransitions(StandardDiseaseModelLabelValue,
	 *      StandardDiseaseModelLabel, long)
	 * @generated NOT
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		
		
		final double adjustedInfectiousMortalityRate = getAdjustedInfectiousMortalityRate(timeDelta);
		// This is beta*
		double transmissionRate = getAdjustedTransmissionRate(timeDelta);
		final double adjustedRecoveryRate = getAdjustedRecoveryRate(timeDelta);
		final double adjustedImmunityLossRate = getAdjustedImmunityLossRate(timeDelta);
		
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			final EvolvingSIRDiseaseModelLabelValue currentSIR = (EvolvingSIRDiseaseModelLabelValue) currentState;

			// Compute deaths
			
			final double diseaseDeaths = adjustedInfectiousMortalityRate
					* currentSIR.getI();

			

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
			double numberOfInfectedToRecovered = adjustedRecoveryRate
					* currentSIR.getI();
			double numberOfRecoveredToSusceptible = adjustedImmunityLossRate
					* currentSIR.getR();
			
			
			
			
			
			////////////////////////////////////////////////////
			// ******* EVOLVING DISEASE MODEL *************** //
			//
			//  Si* = Si   ∏_(j≠i) 〖[1-χji (Rj/N〗)] 
			//
			double effectiveSusceptible = currentSIR.getS();
			double popCount = currentSIR.getS()+currentSIR.getI()+currentSIR.getR(); 
			double crossProduct = 1.0;
			if((crossImmunityRate>0.0)&&(effectiveSusceptible>1)) {
				// NEED TO CORRECT SUSCEPTIBLES BASED ON CROSS STRAIN IMMUNITY //
				Node thisNode = diseaseLabel.getNode();
				EList<NodeLabel> allLabels = thisNode.getLabels();
				for(NodeLabel nl:allLabels) {
					if(nl instanceof EvolvingSIRDiseaseModelLabel) {
						EvolvingSIRDiseaseModelLabel sirLabel = (EvolvingSIRDiseaseModelLabel) nl;
						Decorator otherDisease = sirLabel.getDecorator();
						if(otherDisease instanceof EvolvingSIRDiseaseModel) {
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
			
			
			// Need to checked what do do here. If non linear coefficient is not 1 and
			// the effective infectious is negative (which is possible), what do do? 
			// Let's fall back on the linear method for now.
			
			double numberOfSusceptibleToInfected = 0.0;
			if(getNonLinearityCoefficient() != 1.0 && effectiveInfectious >=0.0)
				numberOfSusceptibleToInfected = transmissionRate
				* effectiveSusceptible* Math.pow(effectiveInfectious, getNonLinearityCoefficient());
			else 
				numberOfSusceptibleToInfected = transmissionRate
				* effectiveSusceptible* effectiveInfectious;
			
			
			
			
			// ******* EVOLVING DISEASE MODEL *************** //
			////////////////////////////////////////////////////
			
			

			// Determine delta S
			double deltaS = numberOfRecoveredToSusceptible - numberOfSusceptibleToInfected;
			// Determine delta I
			double deltaI = numberOfSusceptibleToInfected- numberOfInfectedToRecovered - diseaseDeaths;
			// Determine delta R
			double deltaR = numberOfInfectedToRecovered - numberOfRecoveredToSusceptible;

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
			
			// If there is a control label attached to the region, we need to adjust for any interventions in effect.

			StandardInterventionLabel scl = findInterventionLabel((Node)diseaseLabel.getIdentifiable());
			if(scl != null) {
				double vaccinations = ((StandardInterventionLabelValue)scl.getCurrentValue()).getVaccinations();
				double isolations = ((StandardInterventionLabelValue)scl.getCurrentValue()).getIsolations();
				vaccinations *= ((double) timeDelta / (double) getTimePeriod());
				isolations *= ((double) timeDelta / (double) getTimePeriod());

				if(currentSIR.getS() < vaccinations) vaccinations = currentSIR.getS();
				if(currentSIR.getI() < isolations) isolations = currentSIR.getI();

				deltaS -= vaccinations;
				deltaR += vaccinations;
				deltaI -= isolations;
				deltaR += isolations;
			}

			SIRLabelValueImpl ret = (SIRLabelValueImpl)deltaValue;
			ret.setS(deltaS);
			ret.setI(deltaI);
			ret.setIncidence(numberOfInfectedToRecovered);
			ret.setR(deltaR);
			ret.setDiseaseDeaths(diseaseDeaths);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}

	} // computeTransitions
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {	
		DiseaseModelLabel label = EvolvingFactory.eINSTANCE.createEvolvingSIRDiseaseModelLabel(); 
		label.setTypeURI(DiseaseModelLabel.URI_TYPE_DYNAMIC_DISEASE_LABEL);

		return label;
	} // createDiseaseModelLabel


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {
		return EvolvingFactory.eINSTANCE.createEvolvingSIRDiseaseModelLabelValue(); 
	}

} //EvolvingSIRDiseaseModelImpl
