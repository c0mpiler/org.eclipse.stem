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
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelImpl#getIncubationRate <em>Incubation Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvolvingSEIRDiseaseModelImpl extends EvolvingSIRDiseaseModelImpl implements EvolvingSEIRDiseaseModel {
	/**
	 * The default value of the '{@link #getIncubationRate() <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double INCUBATION_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncubationRate() <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected double incubationRate = INCUBATION_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSEIRDiseaseModelImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolvingPackage.Literals.EVOLVING_SEIR_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncubationRate() {
		return incubationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncubationRate(double newIncubationRate) {
		incubationRate = newIncubationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL__INCUBATION_RATE:
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
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL__INCUBATION_RATE:
				setIncubationRate((Double)newValue);
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
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL__INCUBATION_RATE:
				setIncubationRate(INCUBATION_RATE_EDEFAULT);
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
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL__INCUBATION_RATE:
				return incubationRate != INCUBATION_RATE_EDEFAULT;
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
		result.append(" (incubationRate: ");
		result.append(incubationRate);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIImpl#computeDiseaseDeltas(StandardDiseaseModelLabelValue,
	 *      StandardDiseaseModelLabel, long)
	 * @generated NOT
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
			
			////////////////////////////////////////////////////
			// ******* EVOLVING DISEASE MODEL *************** //
			//
			//  Si* = Si   ∏_(j≠i) 〖[1-χji (Rj/N〗)] 
			//
			double effectiveSusceptible = currentSEIR.getS();
			double popCount = currentSEIR.getS()+currentSEIR.getE()+currentSEIR.getI()+currentSEIR.getR(); 
			double crossProduct = 1.0;
			if((crossImmunityRate>0.0)&&(effectiveSusceptible>1)) {
				// NEED TO CORRECT SUSCEPTIBLES BASED ON CROSS STRAIN IMMUNITY //
				Node thisNode = diseaseLabel.getNode();
				EList<NodeLabel> allLabels = thisNode.getLabels();
				for(NodeLabel nl:allLabels) {
					if(nl instanceof EvolvingSEIRDiseaseModelLabel) {
						EvolvingSEIRDiseaseModelLabel seirLabel = (EvolvingSEIRDiseaseModelLabel) nl;
						Decorator otherDisease = seirLabel.getDecorator();
						if(otherDisease instanceof EvolvingSEIRDiseaseModel) {
							// should always be true
							EvolvingSEIRDiseaseModel otherSEIRDiease = (EvolvingSEIRDiseaseModel)otherDisease;
							if(!otherSEIRDiease.getDiseaseName().equals(this.getDiseaseName())) {
								// ie NOT this DISEASE
								EvolvingSEIRDiseaseModelLabelValue otherValue = (EvolvingSEIRDiseaseModelLabelValue)seirLabel.getCurrentValue();
								
								
									double immuneTerm = otherValue.getR()/popCount;
									
									// the genetic distance is based on comparing the 2 genomes. Each letter gives a difference of 1
									// the crossImmunityRate is the crossImmunity with 1 nt different
									double geneticDistance = getGeneticDistance(otherSEIRDiease);
									
									// for a center of mass distance model uncomment the following....
									// double geneticDistance *= getCMdistance(otherSEIR);
									
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
		    //System.out.println("S = "+currentSEIR.getS()+" crossProduct = "+crossProduct+"  Seffective = "+effectiveSusceptible);
			
			
			
			
			double numberOfSusceptibleToExposed = 0.0;
			if(getNonLinearityCoefficient() != 1.0 && effectiveInfectious >=0.0)
				numberOfSusceptibleToExposed = transmissionRate
				* effectiveSusceptible* Math.pow(effectiveInfectious, getNonLinearityCoefficient());
			else 
				numberOfSusceptibleToExposed = transmissionRate
				* effectiveSusceptible* effectiveInfectious;
			
			
			
			
			// ******* EVOLVING DISEASE MODEL *************** //
			////////////////////////////////////////////////////
			
			
			
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
			if(scl != null) {
				double vaccinations = ((StandardInterventionLabelValue)scl.getCurrentValue()).getVaccinations();
				double isolations = ((StandardInterventionLabelValue)scl.getCurrentValue()).getIsolations();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void calculateEvolvedInitialState() {
		
		EvolvingSEIRDiseaseModel parentDiseaseModel = (EvolvingSEIRDiseaseModel)getParentDisease();
		DiseaseModelLabel parentEvolutionSource = getEvolvedAt();
		if (parentDiseaseModel == null && parentEvolutionSource == null) {
			// The evolution wasn't initialized correctly.  
			// This should be unreachable but who knows.
			System.err.println("Trying to calculate label state from an improperly initialized evolved model.  Do something.");
			return;	
		} 
		
		Node currentNode = parentEvolutionSource.getNode();
		URI evolutionLocation = currentNode.getURI();

//		// Matt, we have not decorated the graph at this point right??
		for (DynamicLabel dl : this.getLabelsToUpdate()) {
			if (dl instanceof EvolvingSEIRDiseaseModelLabel) {
				double s = 0.0;
				double e = 0.0;
				double i = 0.0;
				double r = 0.0;
				double diseaseDeaths = 0.0;
				
				// this is the new label we need to set
				EvolvingSEIRDiseaseModelLabel childLabel = (EvolvingSEIRDiseaseModelLabel)dl;
				EvolvingSEIRDiseaseModelLabelValue childLabelValues = (EvolvingSEIRDiseaseModelLabelValue)childLabel.getCurrentValue();
				// this is the new label we need to set
				EvolvingSEIRDiseaseModelLabel parentSEIRlabel = (EvolvingSEIRDiseaseModelLabel) parentEvolutionSource;
				// same parent population
				childLabel.setPopulationLabel(parentSEIRlabel.getPopulationLabel());
				childLabel.setPopulationModelLabel(parentSEIRlabel.getPopulationModelLabel());
				// get the parent label value - we need this to know the current population
				EvolvingSEIRDiseaseModelLabelValue lv = (EvolvingSEIRDiseaseModelLabelValue)parentSEIRlabel.getCurrentValue();
				double popCount = lv.getPopulationCount();
				s = popCount;
				
				
				// Do something interesting here to initialize disease state
				// TODO performance question
				// TODO we are looking through the entire graphs to find THIS label. 
				if (childLabel.getNode().getURI().equals(evolutionLocation)) {
					// This is where the evolution happened, so you probably need to set your
					// infectious state differently
					//System.out.println("initializing child disease at evolution location "+evolutionLocation.lastSegment());
					if(parentEvolutionSource instanceof EvolvingSEIRDiseaseModelLabel) {
						// should be true
						if(popCount > 1.0) {
							// init the child diseases values
							e = 1.0;
							s = s - 1.0;
							//System.err.println("!!! Evolving SEIR Mutation !!! at "+evolutionLocation.lastSegment());
						} else {
							System.err.println("Likely ERROR: Zero population detected on node "+currentNode.getURI().lastSegment()+" ...  Do something.");
						}
					}
					
				} else {
					// This is everywhere else
					// for now we are already set
				} // if else
				
				childLabelValues.setS(s);
				childLabelValues.setE(e);
				childLabelValues.setI(i);
				childLabelValues.setR(r);
				childLabelValues.setDiseaseDeaths(diseaseDeaths);
			}
		}
	}
	
	/**
	 * This method is called when a disease model mutates back into itself
	 * @generated NOT
	 */
	protected void updateDuplicateEvolvedInitialState(Node currentNode) {
		URI evolutionLocation = currentNode.getURI();

//		// Matt, we have not decorated the graph at this point right??
		for (DynamicLabel dl : this.getLabelsToUpdate()) {
			if (dl instanceof EvolvingSEIRDiseaseModelLabel) {

				// this is the new label we need to set
				EvolvingSEIRDiseaseModelLabel diseaseLabel = (EvolvingSEIRDiseaseModelLabel)dl;
				EvolvingSEIRDiseaseModelLabelValue childLabelValues = (EvolvingSEIRDiseaseModelLabelValue)diseaseLabel.getCurrentValue();
				double s = childLabelValues.getS();
				double e = childLabelValues.getE();
				double i = childLabelValues.getI();
				double r = childLabelValues.getR();
				double diseaseDeaths = childLabelValues.getDiseaseDeaths();

				// Do something interesting here to initialize disease state
				// TODO performance question
				// TODO we are looking through the entire graphs to find THIS label. 
				if (diseaseLabel.getNode().getURI().equals(evolutionLocation)) {
					// This is where the evolution happened, so you probably need to set your
					// infectious state differently
					//System.out.println("initializing child disease a 
					  
					if(s > 2.0) {
						// init the child diseases values
						e = 1.0;
						s = s - 1.0;
						//System.err.println("!!! Evolving SEIR Mutation !!! at "+evolutionLocation.lastSegment());
					} else {
						//System.err.println("Likely ERROR: Zero population detected on node "+currentNode.getURI().lastSegment()+" ...  Do something.");
					}
				} else {
					// This is everywhere else
					// for now we are already set
				} // if else
				
				childLabelValues.setS(s);
				childLabelValues.setE(e);
				childLabelValues.setI(i);
				childLabelValues.setR(r);
				childLabelValues.setDiseaseDeaths(diseaseDeaths);
			}
		}
	}
	

	protected double getAdjustedIncubationRate(long timeDelta) {
		return getIncubationRate()
				* ((double) timeDelta / (double) getTimePeriod());
	} // getAdjustedIncubationRate
			
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {	
		DiseaseModelLabel label = EvolvingFactory.eINSTANCE.createEvolvingSEIRDiseaseModelLabel(); 
		label.setTypeURI(DiseaseModelLabel.URI_TYPE_DYNAMIC_DISEASE_LABEL);

		return label;
	} // createDiseaseModelLabel


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {	
		return EvolvingFactory.eINSTANCE.createEvolvingSEIRDiseaseModelLabelValue(); 
	}


} //EvolvingSEIRDiseaseModelImpl
