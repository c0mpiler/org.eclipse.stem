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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.STEMObjectPool;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.math.BinomialDistributionUtil;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.edges.MixingEdge;
import org.eclipse.stem.definitions.edges.MixingEdgeLabelValue;
import org.eclipse.stem.definitions.edges.impl.MixingEdgeLabelImpl;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelImpl;
import org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.diseasemodels.Activator;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Disease Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl#getReferencePopulationDensity <em>Reference Population Density</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl#getRoadNetworkInfectiousProportion <em>Road Network Infectious Proportion</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl#getCharacteristicMixingDistance <em>Characteristic Mixing Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StandardDiseaseModelImpl extends DiseaseModelImpl
		implements StandardDiseaseModel {

	/**
	 * The default value of the '{@link #getReferencePopulationDensity() <em>Reference Population Density</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getReferencePopulationDensity()
	 * @generated
	 * @ordered
	 */
	protected static final double REFERENCE_POPULATION_DENSITY_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getReferencePopulationDensity() <em>Reference Population Density</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getReferencePopulationDensity()
	 * @generated
	 * @ordered
	 */
	protected double referencePopulationDensity = REFERENCE_POPULATION_DENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoadNetworkInfectiousProportion()
	 * <em>Road Network Infectious Proportion</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoadNetworkInfectiousProportion()
	 * @generated
	 * @ordered
	 */
	protected static final double ROAD_NETWORK_INFECTIOUS_PROPORTION_EDEFAULT = 0.01;

	/**
	 * The cached value of the '{@link #getRoadNetworkInfectiousProportion()
	 * <em>Road Network Infectious Proportion</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoadNetworkInfectiousProportion()
	 * @generated
	 * @ordered
	 */
	protected double roadNetworkInfectiousProportion = ROAD_NETWORK_INFECTIOUS_PROPORTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacteristicMixingDistance() <em>Characteristic Mixing Distance</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getCharacteristicMixingDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double CHARACTERISTIC_MIXING_DISTANCE_EDEFAULT = 2.25;

	/**
	 * The cached value of the '{@link #getCharacteristicMixingDistance() <em>Characteristic Mixing Distance</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getCharacteristicMixingDistance()
	 * @generated
	 * @ordered
	 */
	protected double characteristicMixingDistance = CHARACTERISTIC_MIXING_DISTANCE_EDEFAULT;

	/**
	 * Pool of label values used to reduce object creation. Key'd by the population identifier (different types of label values for different populations are possible)
	 */
	
	protected HashMap<String, STEMObjectPool> labelValueObjectPools = new HashMap<String, STEMObjectPool>();

	/**
	 * Pool of list to keep edges of certain type for a node 
	 */

	protected STEMObjectPool edgeListObjectPool = new STEMObjectPool(5, 5) {

		@Override
		protected Object createNewObject() {
			return new ArrayList<Edge>();
		}

		@Override
		protected void resetObject(Object o) {
			// Nothing to do
			
		}
		
	};
	
	/**
	 * Determine whether to do mixing via common border or via mixing edges. If even a single mixing edge exists in the model, mixing via mixing edges are used instead
	 */
	protected boolean doCommonBorderMixing=true;
	
	/**
	 * Set to true when mixing strategy (common border of mixing edges) is determined. This way we avoid figuring out the mixing strategy on every call.
	 */
	private boolean mixingStrategyDetermined = false;
	
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected StandardDiseaseModelImpl() {
		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STANDARD_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getReferencePopulationDensity() {
		return referencePopulationDensity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencePopulationDensity(
			double newReferencePopulationDensity) {
		referencePopulationDensity = newReferencePopulationDensity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRoadNetworkInfectiousProportion() {
		return roadNetworkInfectiousProportion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoadNetworkInfectiousProportion(
			double newRoadNetworkInfectiousProportion) {
		roadNetworkInfectiousProportion = newRoadNetworkInfectiousProportion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getCharacteristicMixingDistance() {
		return characteristicMixingDistance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristicMixingDistance(
			double newCharacteristicMixingDistance) {
		characteristicMixingDistance = newCharacteristicMixingDistance;
	}

	

	
	@SuppressWarnings("boxing")
	@Override
	public void applyExternalDeltas(STEMTime time, double t, long timeDelta,
			EList<DynamicLabel> labels) {
		synchronized(this) {
			if(labelValueObjectPools.size() == 0) 
				for(final String pop:this.getAllLabelIdentifiers()) {
					labelValueObjectPools.put(pop, new STEMObjectPool(5, 5) {
						
						@Override
						protected Object createNewObject() {
							return StandardDiseaseModelImpl.this.createDiseaseModelLabelValue(pop);
						}

						@Override
						protected void resetObject(Object o) {
							// Nothing to do
							
						}
					});
				}
		}
		for(int i=0;i<labels.size();++i) {
		//for (final Iterator<DynamicLabel> currentStateLabelIter = labels
		//		.iterator(); currentStateLabelIter.hasNext();) {
			final StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel) labels.get(i);

			StandardDiseaseModelLabelValue myDelta = (StandardDiseaseModelLabelValue) diseaseLabel
					.getDeltaValue();
			Node n = diseaseLabel.getNode();

			// Find other labels on the node that wants to exchange data

			EList<NodeLabel> labs = n.getLabels();
			for(int j=0;j<labs.size();++j) {
				NodeLabel l = labs.get(j);
				if (l instanceof IntegrationLabel
						&& !l.equals(diseaseLabel)
						&& ((IntegrationLabel) l).getIdentifier().equals(
								diseaseLabel.getIdentifier())) {
					IntegrationLabelValue sdeLabelValue = ((IntegrationLabel) l).getDeltaValue();
					EList<Exchange> arrivals = sdeLabelValue.getArrivals();
					EList<Exchange> departures = sdeLabelValue.getDepartures();
					if (arrivals == null || departures == null) {
						Activator.logError(
								"Error, null arrivals or departures for label "
										+ l, new Exception());
						continue;
					}

					// Arrivals
					for(int k=0;k<arrivals.size();++k) {
						Exchange entry = arrivals.get(k);
						// for(Node n2:arrivals.keySet()) {
						if (entry.getType() == ExchangeType.BIRTHS_AND_DEATHS) {
							EAttribute birthsCompartment = this.getBirthsCompartment();
							myDelta.eSet(birthsCompartment, (((Double)myDelta.eGet(birthsCompartment))+entry.getCount())); // ToDo: Need eSet,eGetDouble...
							// For stochastic modeling, add the target compartment where births goes into as well as the (disease) label 
							entry.setTarget(birthsCompartment);
							entry.getOtherLabels().add(diseaseLabel);
						} else if (entry.getType() == ExchangeType.MIGRATION) {
							double inflow = entry.getCount();
							// Find the corresponding disease label on the other
							// node
							Node otherNode = (Node) entry.getOtherLabels().get(0)
									.getIdentifiable();
							for(int m=0;m<otherNode.getLabels().size();++m) {
								NodeLabel nl = otherNode.getLabels().get(m);
								if (nl instanceof StandardDiseaseModelLabel
										&& ((StandardDiseaseModelLabel) nl)
												.getDecorator().equals(this)
										&& ((StandardDiseaseModelLabel) nl)
												.getPopulationModelLabel()
												.getPopulationIdentifier()
												.equals(diseaseLabel
														.getIdentifier())) {
									String pop = diseaseLabel.getIdentifier();
									StandardDiseaseModelLabelValue value = (StandardDiseaseModelLabelValue)labelValueObjectPools.get(pop).get();
									value.set(((StandardDiseaseModelLabel) nl).getTempValue());
									
									double factor = inflow / value.getPopulationCount();

									if (!Double.isInfinite(factor) && !Double.isNaN(factor)) {
										value.scale(factor);
									}

									// Remember disease deaths since it'll be
									// overwritten in the add
									double diseaseDeaths = myDelta
											.getDiseaseDeaths();
									myDelta.add(value);
									myDelta.setDiseaseDeaths(diseaseDeaths);
									// Remember for stochastic modeling
									entry.getOtherLabels().add(nl); // Other label
									entry.getOtherLabels().add(diseaseLabel); // This label
									labelValueObjectPools.get(pop).release(value);

								}
							}
						} else if (entry.getType() == ExchangeType.AGING) {
							// Find the disease label of the other age group
							String otherAgeGroup = ((StandardPopulationModelLabel) entry
									.getOtherLabels().get(0)).getPopulationIdentifier();

							for(int m=0;m<labs.size();++m)  {
								NodeLabel nl = labs.get(m);
								if (nl instanceof StandardDiseaseModelLabel) {
									StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) nl;

									if (otherDiseaseLabel.getDecorator()
											.equals(this)
											&& otherDiseaseLabel
													.getIdentifier().equals(
															otherAgeGroup)) {
										String pop = otherDiseaseLabel.getIdentifier();
										StandardDiseaseModelLabelValue value = (StandardDiseaseModelLabelValue)labelValueObjectPools.get(pop).get();
										value.set(((StandardDiseaseModelLabel) nl).getTempValue());
										
										if (value.getPopulationCount() > 0.0) {
											value.scale(entry.getCount()
													/ value.getPopulationCount());
										}

										double diseaseDeaths = myDelta
												.getDiseaseDeaths();
										myDelta.add(value);
										myDelta.setDiseaseDeaths(diseaseDeaths);
										// Remember for stochastic modeling
										entry.getOtherLabels().add(nl); // Other label
										entry.getOtherLabels().add(diseaseLabel); // This label
										labelValueObjectPools.get(pop).release(value);
									}
								}
							}
						}
					}

					// Departures
					for(int k=0;k<departures.size();++k) {
						Exchange entry = departures.get(k);
						String pop = diseaseLabel.getIdentifier();
						// Departures are either deaths or population moving to
						// other nodes, hence we substract from the local node.

						StandardDiseaseModelLabelValue currentState = null;
						if (entry.getType() == ExchangeType.BIRTHS_AND_DEATHS
								|| entry.getType() == ExchangeType.AGING) {
							currentState = (StandardDiseaseModelLabelValue)labelValueObjectPools.get(pop).get();
							currentState.set(diseaseLabel.getProbeValue());
							
						}			
						else if (entry.getType() == ExchangeType.MIGRATION) {
							currentState = (StandardDiseaseModelLabelValue)labelValueObjectPools.get(pop).get();
							currentState.set((diseaseLabel).getTempValue());
																// Need to use
																// temp value
																// for migration
																// or an
																// inbalance
																// will occyr
						} else if(entry.getType() == ExchangeType.COMPARTMENT_TRANSITION)
							continue; // Safe. But we should never have an ExchangeType COMPARTMENT_TRANSITIONS on deltas from population models
						
						if(entry.getType() == ExchangeType.BIRTHS_AND_DEATHS) {
							doDeaths(currentState, myDelta, entry.getCount());
							entry.getOtherLabels().add(diseaseLabel);
		
							labelValueObjectPools.get(pop).release(currentState);
							continue;
						}
						
						double populationCount = currentState
								.getPopulationCount();

						double outflow = entry.getCount();
						double factor = outflow / populationCount;
						if (Double.isNaN(factor) || Double.isInfinite(factor))
							factor = 0.0; // safe
						currentState.scale(factor);
						// Remember disease deaths since they will be
						// overwritten by sub
						double diseaseDeaths = myDelta.getDiseaseDeaths();
						myDelta.sub(currentState);
						myDelta.setDiseaseDeaths(diseaseDeaths);
						labelValueObjectPools.get(pop).release(currentState);

					}
				}

			}
		}
	}

	

	 
	 /**
		 * Add stochastic noise if the flag is set. Noise is added to incidence. The method is overridden by any subclass that needs
		 * to do more sophisticated things. The next value has already been set to its deterministic solution when this method is called,
		 * and this method changes it to add the noise.
		 * This method calls BinomialDistributionUtil.fastPickFromBinomialDist which uses org.apache.commons.math.distribution.BinomialDistributionImpl;
		 * @generated NOT
		 */
		 @Override
		public void doStochasticProcess(IntegrationLabel iLabel, long timeDelta) {
			//Turn next value into integers
			
			if(this.getBinomialDistribution() == null)
				this.setBinomialDistribution(new BinomialDistributionUtil(this.getRandomSeed()));

			// Add stochastic noise to incidence and adjust the next value	
			if(iLabel.getNextValue() instanceof SEIRLabelValue) {
				SEIRLabelValue nextSEIR = (SEIRLabelValue)iLabel.getNextValue();
				SEIRLabelValue previousSEIR  = (SEIRLabelValue)iLabel.getCurrentValue(); // before the last integration step
				
				addNoise(previousSEIR, nextSEIR, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence(), StandardPackage.eINSTANCE.getSEIRLabelValue_E(), 1.0);
			} else if(iLabel.getNextValue() instanceof SILabelValue) {
				SILabelValue nextSI = (SILabelValue)iLabel.getNextValue(); // NOW 
				SILabelValue previousSI = (SILabelValue)iLabel.getCurrentValue(); // before the last integration step
				addNoise(previousSI, nextSI, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence(), StandardPackage.eINSTANCE.getSILabelValue_I(),1.0);
								
			} 
			IntegrationLabelValue nextVal = (IntegrationLabelValue)iLabel.getNextValue();
			EList<EAttribute> attrs = nextVal.eClass().getEAllAttributes();
			
//			for(int i=0;i<attrs.size();++i) {
//				EAttribute attr = attrs.get(i);
//				if(attr.getEType().getClassifierID() == EcorePackage.EDOUBLE && attr.isChangeable()) {
//					nextVal.eSetDouble(attr.getFeatureID(), Math.round(nextVal.eGetDouble(attr.getFeatureID())));
//				}
//			}
			
		}
	
		 /**
		  * Adds noise from the delta value subtracted from the source and added to the target, ensuring that neither the source or the target goes below zero. 
		  * 
		  * @param previous The previous label value
		  * @param next The next label value (with the deterministic incidence added)
		  * @param source  The source attribute (e.g. S)
		  * @param delta The delta attribute (typically incidence)
		  * @param target The target attribute (e.g. I)
		  * @param fraction Set to < 1.0 if only a fraction of the incidence is drawn from the source compartment
		  */
		
		 protected void addNoise(IntegrationLabelValue previous, IntegrationLabelValue next, EAttribute source, EAttribute delta, EAttribute target, double fraction) {
			 	if(Double.isInfinite(fraction) || Double.isNaN(fraction)) return; // Nothing to do
				double sourcePrevious = previous.eGetDouble(source.getFeatureID());
				double sourceNow = next.eGetDouble(source.getFeatureID()); // already has deterministic incidence added back in
				double Savg = (sourcePrevious+sourceNow)/2.0; // average over the last step. This is approximate average
				if(Savg <= BinomialDistributionUtil.MAX_N) { 
					int S = (int)Math.ceil(Savg); // round up the x.5
					double prob = next.eGetDouble(delta.getFeatureID())*fraction/S; // Random pick from the source but only by the fraction that came from there
//					if(next.eContainer().toString().contains("E85723"))
//						System.out.println("");
					if((!Double.isNaN(prob))&&(prob < 1)) { 
						//dummy
						int newDelta = this.getBinomialDistribution().fastPickFromBinomialDist(prob, S);
						
						double oldDelta = (next.eGetDouble(delta.getFeatureID())*fraction); // Estimate of the part of the delta that was drawn from the source
			
						double diff = newDelta - oldDelta;
						
						// If we're drawing too much, skip stochastic step and set transition to 0
						if(next.eGetDouble(source.getFeatureID())-diff < 0 
								|| next.eGetDouble(target.getFeatureID())+diff < 0) {
							
							next.eSetDouble(source.getFeatureID(), next.eGetDouble(source.getFeatureID())+oldDelta);
							next.eSetDouble(target.getFeatureID(), next.eGetDouble(target.getFeatureID())-oldDelta);
							// safe
							if(next.eGetDouble(source.getFeatureID()) < 0)
								next.eSetDouble(source.getFeatureID(), 0);
							if(next.eGetDouble(target.getFeatureID()) < 0)
								next.eSetDouble(target.getFeatureID(), 0);
							
							next.eSetDouble(delta.getFeatureID(), 0.0);
							return;
					
						}
						next.eSetDouble(source.getFeatureID(), next.eGetDouble(source.getFeatureID())-diff);
						next.eSetDouble(target.getFeatureID(), next.eGetDouble(target.getFeatureID())+diff);
						next.eSetDouble(delta.getFeatureID(), next.eGetDouble(delta.getFeatureID())+diff); // Adjust delta by the difference. Will be an integer
			
					}
				}
				
			}
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY:
				return getReferencePopulationDensity();
			case StandardPackage.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION:
				return getRoadNetworkInfectiousProportion();
			case StandardPackage.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE:
				return getCharacteristicMixingDistance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY:
				setReferencePopulationDensity((Double)newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION:
				setRoadNetworkInfectiousProportion((Double)newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE:
				setCharacteristicMixingDistance((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY:
				setReferencePopulationDensity(REFERENCE_POPULATION_DENSITY_EDEFAULT);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION:
				setRoadNetworkInfectiousProportion(ROAD_NETWORK_INFECTIOUS_PROPORTION_EDEFAULT);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE:
				setCharacteristicMixingDistance(CHARACTERISTIC_MIXING_DISTANCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY:
				return referencePopulationDensity != REFERENCE_POPULATION_DENSITY_EDEFAULT;
			case StandardPackage.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION:
				return roadNetworkInfectiousProportion != ROAD_NETWORK_INFECTIOUS_PROPORTION_EDEFAULT;
			case StandardPackage.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE:
				return characteristicMixingDistance != CHARACTERISTIC_MIXING_DISTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (referencePopulationDensity: "); //$NON-NLS-1$
		result.append(referencePopulationDensity);
		result.append(", roadNetworkInfectiousProportion: "); //$NON-NLS-1$
		result.append(roadNetworkInfectiousProportion);
		result.append(", characteristicMixingDistance: "); //$NON-NLS-1$
		result.append(characteristicMixingDistance);
		result.append(')');
		return result.toString();
	}

	/**
	 * This method replaces the onsiteInfectious value with an
	 * effectiveInfectious population size based on mixing with neighboring
	 * sites. In this implementation the edges are bidirectional and have a
	 * fixed weight based on getPhysicallyAdjacentInfectiousProportion() (called
	 * in the helper method getInfectiousChangeFromMixing(). But the mixing is
	 * also weighted by the areas and populations of a site relative to the area
	 * and population of it's neighbors. Note that the value returned must be
	 * NORMALIZED by the total population because the product beta * S *
	 * Ieffective must have units of persons. Since S has units of persons the
	 * Ieffective must be dimensionless (normalized to the population). beta is
	 * the infection rate and has units of inverse time.
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.SI.getNormalizedEffectiveInfectious
	 * @param node
	 *            the node we are currently looking at to compute the next
	 *            disease state
	 * @param diseaseLabel
	 *            the label for the current disease computation
	 * @param onsiteInfectious
	 *            the number of infectious people on site (at the node above)
	 * @param infectiousAttribute
	 *            Attribute representing the infectious compartment
	 * @generated NOT
	 */
	
	@SuppressWarnings("boxing")
	public double getNormalizedEffectiveInfectious(final Node node,
			final StandardDiseaseModelLabel diseaseLabel,
			final double onsiteInfectious, EAttribute infectiousAttribute, EAttribute mixingAttribute, EAttribute roadAttribute) {
	
		// Determine whether to use mixing edges or common border edges
		determineMixingStrategy();
		
		// For performance, check if mixing parameters are zero. If so, just
		// return the unmixed result
		
		if( doCommonBorderMixing && (Double)this.eGet(mixingAttribute) == 0.0 && (Double)this.eGet(roadAttribute) == 0.0) {
			double totalPopulation = ((StandardDiseaseModelLabelValue) diseaseLabel
					.getTempValue()).getPopulationCount();
			double retVal = 0.0;

			if (totalPopulation > 0.0) 
				retVal = onsiteInfectious 	/ totalPopulation;
			return retVal;
		}
							
		List<Edge>cEdges = (List<Edge>)edgeListObjectPool.get();
		cEdges.clear();
		
		if(!doCommonBorderMixing)
			return doMixingViaMixingEdges(node, diseaseLabel, onsiteInfectious, infectiousAttribute, mixingAttribute, roadAttribute);
		else 
			return doMixingViaCommonBorderEdges(node, diseaseLabel, onsiteInfectious, infectiousAttribute, mixingAttribute, roadAttribute);
		
	} // getNormalizedEffectiveInfectious

	/**
	 *  By default births goes into the S compartment. Override if a different compartment is used.
	 * @generated NOT
	 */
	
	public EAttribute getBirthsCompartment() {
		return StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S();
	}

	
	/**
	 * Subclasses overrides this methods if they want to handle deaths differently in their model. By default deaths 
	 * are substracted from all compartments
	 * 
	 * @generated NOT
	 */
	public void doDeaths(StandardDiseaseModelLabelValue currentState, StandardDiseaseModelLabelValue delta, double deaths) {
		double populationCount = currentState
				.getPopulationCount();

		double outflow = deaths;
		double factor = outflow / populationCount;
		if (Double.isNaN(factor) || Double.isInfinite(factor))
			factor = 0.0; // safe
		currentState.scale(factor);
		// Remember disease deaths since they will be
		// overwritten by sub
		double diseaseDeaths = delta.getDiseaseDeaths();
		delta.sub(currentState);
		delta.setDiseaseDeaths(diseaseDeaths);
	}

	
	/**
	 * determineMixingStrategy. Determine which mixing strategy to use. If even a single mixing edge exists in the graph, mixing edges are being used instead of common
	 * border edges. When this method returns, the mixingStrategyDetermined flag has been set so any future calls are a no-op
	 */
	protected void determineMixingStrategy() {
		if(mixingStrategyDetermined) 
			return; // already determined
		
		Graph g = this.getGraph();
		EMap<URI, Edge>edges = g.getEdges();
		for(Map.Entry<URI, Edge>entry:edges.entrySet()) {
			if(entry.getValue() instanceof MixingEdge) {
				mixingStrategyDetermined = true;
				doCommonBorderMixing = false;
				return;
			}
		}
		mixingStrategyDetermined = true;
	}
	
	/**
	 * Compute the mixing using common border edges. This code is only used when mixing edges are not available
	 * 
	 * @param node
	 * @param diseaseLabel
	 * @param onsiteInfectious
	 * @param infectiousAttribute
	 * @param cEdges
	 * @return double Normalized effective infectious
	 */
	private double doMixingViaCommonBorderEdges(Node node,
			StandardDiseaseModelLabel diseaseLabel, double onsiteInfectious,
			EAttribute infectiousAttribute, EAttribute mixingAttribute, EAttribute roadAttribute) {
		double infectiousChangeFromMixing = 0.0;
		double populationChangeFromMixing = 0.0;

		List<Edge>cEdges = (List<Edge>)edgeListObjectPool.get();
		cEdges.clear();
		CommonBorderRelationshipLabelImpl.getCommonBorderEdgesFromNode(node, cEdges);
		
		for(int i=0;i<cEdges.size();++i) {
			Edge borderEdge = cEdges.get(i);
			// If it exists, we're looking for the label this disease model
			// updates on the node at the other end of the border edge.
			// sum up the changes from each connected node.
			// NOTE: some of these changes could be negative

			final Node otherNode = borderEdge.getOtherNode(node);
			double borderLength = ((CommonBorderRelationshipLabelValue) borderEdge
					.getLabel().getCurrentValue()).getBorderLength();

			if (otherNode instanceof Region) {
				double otherArea = 0.0;
				double otherPopulation = 0.0;
				double otherInfective = 0.0;

				EList<NodeLabel>labs = otherNode.getLabels();
				for(int j=0;j<labs.size();++j) {
					NodeLabel otherLabel = labs.get(j);
					if (otherLabel instanceof AreaLabel) {
						otherArea = ((AreaLabel) otherLabel)
								.getCurrentAreaValue().getArea();
					} else if (otherLabel instanceof StandardDiseaseModelLabel) {
						StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) otherLabel;

						if (otherDiseaseLabel.getDecorator() == this
								&& otherDiseaseLabel.getIdentifier().equals(
										diseaseLabel.getIdentifier())) {
							otherPopulation = ((StandardDiseaseModelLabelValue) otherDiseaseLabel
									.getTempValue()).getPopulationCount();

							otherInfective = otherDiseaseLabel
									.getTempValue().eGetDouble(
											infectiousAttribute.getFeatureID());
						}
					}
				}

				@SuppressWarnings("boxing")
				double mixingFactor = Math.min((Double)this.eGet(mixingAttribute)
						* borderLength / otherArea, 1.0);
				
				if (otherArea == 0.0) {
					mixingFactor = 0.0;
				}

				infectiousChangeFromMixing += mixingFactor * otherInfective;
				populationChangeFromMixing += mixingFactor * otherPopulation;
			}
		} // for each border edge
		edgeListObjectPool.release(cEdges);
		
		return addMixingRoadTransportationEdges(node,
			diseaseLabel, onsiteInfectious,
			infectiousAttribute, infectiousChangeFromMixing, populationChangeFromMixing, roadAttribute);
		
		
	}

	/**
	 * Compute the mixing using common border edges. This code is only used when mixing edges are not available
	 * 
	 * @param node
	 * @param diseaseLabel
	 * @param onsiteInfectious
	 * @param infectiousAttribute
	 * @param cEdges
	 * @return double Normalized effective infectious
	 */
	private double doMixingViaMixingEdges(Node node,
			StandardDiseaseModelLabel diseaseLabel, double onsiteInfectious,
			EAttribute infectiousAttribute, EAttribute mixingAttribute, EAttribute roadAttribute) {
		double infectiousChangeFromMixing = 0.0;
		double populationChangeFromMixing = 0.0;

		List<Edge>mEdges = (List<Edge>)edgeListObjectPool.get();
		mEdges.clear();
		MixingEdgeLabelImpl.getMixingEdgesFromNode(node, this.getPopulationIdentifier(), mEdges);
		
		for(int i=0;i<mEdges.size();++i) {
			MixingEdge mixingEdge =(MixingEdge)mEdges.get(i);
			MixingEdgeLabelValue mixingLabelValue = mixingEdge.getLabel().getCurrentValue();
			double mixingRateOrAbs = mixingLabelValue.getMixingRate();
			boolean useAbsoluteValue = mixingEdge.isUseAbsoluteValues();
			
			final Node otherNode = mixingEdge.getOtherNode(node);
			if (otherNode instanceof Region) {
				double otherPopulation = 0.0;
				double otherInfective = 0.0;

				EList<NodeLabel>labs = otherNode.getLabels();
				for(int j=0;j<labs.size();++j) {
					NodeLabel otherLabel = labs.get(j);
				    if (otherLabel instanceof StandardDiseaseModelLabel) {
						StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) otherLabel;

						if (otherDiseaseLabel.getDecorator() == this
								&& otherDiseaseLabel.getIdentifier().equals(
										diseaseLabel.getIdentifier())) {
							otherPopulation = ((StandardDiseaseModelLabelValue) otherDiseaseLabel
									.getTempValue()).getPopulationCount();

							otherInfective = otherDiseaseLabel
									.getTempValue().eGetDouble(
											infectiousAttribute.getFeatureID());
						}
					}
				}

				if(useAbsoluteValue && otherPopulation > 0.0) {
					if(mixingRateOrAbs > otherPopulation) // Cannot mix with more people than currently available
						mixingRateOrAbs = otherPopulation;
					double fraction = mixingRateOrAbs / otherPopulation; // Do get the right scaling for the population change we need this
					infectiousChangeFromMixing += fraction * otherInfective;
					populationChangeFromMixing += fraction * otherPopulation;
				} else {
					infectiousChangeFromMixing += mixingRateOrAbs * otherInfective;
					populationChangeFromMixing += mixingRateOrAbs * otherPopulation;
				}
			}
		} // for each border edge
		edgeListObjectPool.release(mEdges);
		
		return addMixingRoadTransportationEdges(node,
			diseaseLabel, onsiteInfectious,
			infectiousAttribute, infectiousChangeFromMixing, populationChangeFromMixing, roadAttribute);
	}
	
	private double addMixingRoadTransportationEdges(Node node,
			StandardDiseaseModelLabel diseaseLabel, double onsiteInfectious,
			EAttribute infectiousAttribute, double currentInfectiousChangeFromMixing,
			double currentPopulationChangeFromMixing, EAttribute roadAttribute) {
		double infectiousChangeFromMixing = currentInfectiousChangeFromMixing;
		double populationChangeFromMixing = currentPopulationChangeFromMixing;
		
		List<Edge>rEdges = (List<Edge>)edgeListObjectPool.get();
		rEdges.clear();
		RoadTransportRelationshipLabelImpl.getRoadEdgesFromNode(node, rEdges);
		for(int i=0;i<rEdges.size();++i) {
			Edge roadEdge = rEdges.get(i);
			// find the number of edges from the road edge - could be more than
			// one
			// also, roads have differenct capacities
			EdgeLabel edgeLabel = roadEdge.getLabel();
			double numCrossings = ((RoadTransportRelationshipLabelValue) edgeLabel
					.getCurrentValue()).getNumberCrossings();
			@SuppressWarnings("boxing")
			double infectiousProportion = Math.min(
					(Double)this.eGet(roadAttribute) * numCrossings, 1.0);

			// If it exists, we're looking for the label this disease model
			// updates on the node at the other end of the border edge.
			Node otherNode = roadEdge.getOtherNode(node);
			double otherPopulation = 0.0;
			double otherInfective = 0.0;

			EList<NodeLabel>labs = otherNode.getLabels();
			for(int j=0;j<labs.size();++j) {
				NodeLabel otherLabel = labs.get(j);
				if (otherLabel instanceof StandardDiseaseModelLabel) {
					StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) otherLabel;

					if (otherDiseaseLabel.getDecorator() == this
							&& otherDiseaseLabel.getIdentifier().equals(
									diseaseLabel.getIdentifier())) {
						otherPopulation = ((StandardDiseaseModelLabelValue) otherDiseaseLabel
								.getTempValue()).getPopulationCount();

						otherInfective =  otherDiseaseLabel
								.getTempValue().eGetDouble(infectiousAttribute.getFeatureID());
					}
				}
			}

			infectiousChangeFromMixing += infectiousProportion * otherInfective;
			populationChangeFromMixing += infectiousProportion
					* otherPopulation;
		} // for each road edge

		edgeListObjectPool.release(rEdges);
		
		// return the sum normalized to the total population
		double totalPopulation = ((StandardDiseaseModelLabelValue) diseaseLabel
				.getTempValue()).getPopulationCount()
				+ populationChangeFromMixing;
		double retVal = 0.0;

		if (totalPopulation > 0.0) {
			retVal = (onsiteInfectious + infectiousChangeFromMixing)
					/ totalPopulation;
		}

		return retVal;
	}

	/**
	 * @param populationLabel
	 *            the population label that labels the node
	 * @return the area of the node associated with the label
	 */
	public double getArea(final PopulationLabel populationLabel) {
		double retValue = 0.0;

		// The population label could have an area specified for the population
		// that we should use instead of the area of the region labeled by the
		// population label. This value would be specified if the population was
		// densely packed into a small area of the larger region, for instance
		// like a city in an otherwise large desert.

		retValue = populationLabel.getPopulatedArea();

		// Is there an area specified for the population?
		if (retValue == 0.0) {
			// No
			// Ok, go find the area label and return the area of the region
			for (final Iterator<NodeLabel> labelIter = populationLabel
					.getNode().getLabels().iterator(); labelIter.hasNext();) {
				final NodeLabel nodeLabel = labelIter.next();
				// Is this an area label?
				if (nodeLabel instanceof AreaLabel) {
					// Yes
					final AreaLabel areaLabel = (AreaLabel) nodeLabel;
					retValue = areaLabel.getCurrentAreaValue().getArea();
					break;
				}
			} // for
		} // If no population area specified

		return retValue;
	} // getArea

	/**
	 * Need to override to reset the binomial distribution seed
	 * @throws ScenarioInitializationException 
	 * 
	 * @generated NOT
	 */
	@Override
	public void resetLabels() throws ScenarioInitializationException {
		super.resetLabels();
		if(this.getBinomialDistribution() != null)
			this.getBinomialDistribution().setSeed(this.getRandomSeed());
	} // resetLabels
} // StandardDiseaseModelImpl
