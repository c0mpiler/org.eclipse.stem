/**
 */
package org.eclipse.stem.solvers.stochastic.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.math.BinomialDistributionUtil;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.TransformationDecorator;
import org.eclipse.stem.core.solver.SolverException;
import org.eclipse.stem.core.trigger.Trigger;
import org.eclipse.stem.core.trigger.TriggerList;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl;
import org.eclipse.stem.populationmodels.standard.AgeGroup;
import org.eclipse.stem.populationmodels.standard.AgingPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationGroup;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;
import org.eclipse.stem.solvers.stochastic.StandardStochastic;
import org.eclipse.stem.solvers.stochastic.StochasticPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Stochastic Solver</b></em>'.
 * The stochastic model is very different from the ODE solvers. It depends on having all transitions and associated counts available. The new code generation framework inserts these transitions
 * automatically in the calculateDelta function, so the stochastic solver still calls this method. The derivative (stored in the delta value) is ignored by the stochastic solver (but it's essential for
 * ODE solvers). Instead, the stochastic solver does the following:
 * 
 * 1. Call calculateDelta and applyExternalDeltas just like the deterministic solvers do for each decorator (of type IntegrationDecorator)
 * 2. For each decorator, iterate over the labels the decorator updates. 
 * 3. 	For each label: 
 * 4.      Looks at the Exchange objects that are stored in the departures list. The departures list contains transitions of type COMPARTMENT_TRANSITION and of type BIRTHS_AND_DEATHS.
 * 5. 			For COMPARTMENT_TRANSITION subtract a binomially drawn transition count from the source compartment and add to the target compartment, making sure we don't draw more people than available.
 * 6.			For BIRTHS_AND_DEATHS, departure exchanges means either background deaths and disease deaths. In case of background deaths, draw and remove binomially from each compartment (weighted by it's size) and then subtract total death from the population model label count.
 * 					For disease deaths, draw stochastically from the infectious compartment and also from the population model label count.
 * 7.      Look at the Exchange objects that are stored in the arrivals list. The arrivals list contains transitions of type BIRTHS_AND_DEATHS, MIGRATION and AGING.
 * 8. 			For BIRTHS_AND_DEATHS, arrivals means births so draw a stochastic number and add to the compartment births goes into and also to the population model label count.  
 * 9			For MIGRATION, draw stochastically for each compartment (weighted by its size) and subtract from the source and add to the target. Also update the population model label count with the total number migrated.
 * 10.			For AGING, draw stochastically for each compartment (weigheted by its size) and subtract from the source and add to the target. Also update the population model label count with the total number migrated.
 * 
 * Note since each transition potentially updates more than one label value, we must make sure to copy over the current value to the next value every time an update is made or updates will get lost.
 *  
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.solvers.stochastic.impl.StandardStochasticImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.eclipse.stem.solvers.stochastic.impl.StandardStochasticImpl#isRandomizeSeed <em>Randomize Seed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardStochasticImpl extends StochasticImpl implements StandardStochastic {
	/**
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final long SEED_EDEFAULT = 17L;
	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected long seed = SEED_EDEFAULT;

	/**
	 * The default value of the '{@link #isRandomizeSeed() <em>Randomize Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomizeSeed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RANDOMIZE_SEED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRandomizeSeed() <em>Randomize Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomizeSeed()
	 * @generated
	 * @ordered
	 */
	protected boolean randomizeSeed = RANDOMIZE_SEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StandardStochasticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean step(STEMTime time, long timeDelta, int cycle) throws SolverException {

		// The stochastic solver is single threaded
		partitioner.setNumProcesses(1);

		
		List<Decorator> decoratorsToIterate = new ArrayList<Decorator>(getCanonicalGraph().getDecorators());
		// Find Transformation decorators and call update
		for (Decorator decorator : decoratorsToIterate) {
			// THIS MUST HAPPEN BEFORE WE RESET THE INCIDENCE
			if (decorator instanceof TransformationDecorator) {
				decorator.updateLabels(time, timeDelta, cycle);
			}
		}
		
		// First initialize the Y and temp label values from the current
		// label values.

		for (Decorator decorator : this.getCanonicalGraph().getDecorators()) {
			EList<DynamicLabel> allLabels = decorator.getLabelsToUpdate();
			for (final Iterator<DynamicLabel> currentStateLabelIter = allLabels
					.iterator(); currentStateLabelIter.hasNext();) {
				if (decorator instanceof IntegrationDecorator) {
					// It's a standard disease model with a standard disease
					// model label
					final IntegrationLabel iLabel = (IntegrationLabel) currentStateLabelIter
							.next();
							
					// Prepare the current value for the next cycle (i.e. reset incidences)
					((IntegrationLabelValue)iLabel.getCurrentValue()).prepareCycle();
							
					// Set the other values on the label to the current value
					((IntegrationLabelValue) iLabel.getProbeValue())
							.set((IntegrationLabelValue) iLabel
									.getCurrentValue());
					((IntegrationLabelValue) iLabel.getTempValue())
							.set((IntegrationLabelValue) iLabel
									.getCurrentValue());
							
				} else
					currentStateLabelIter.next();
			}
		}
				
		
		// Find triggers and make sure they are invoked
		for (Decorator decorator : getCanonicalGraph().getDecorators()) {
			if (decorator instanceof Trigger || decorator instanceof TriggerList ) {
				decorator.updateLabels(time, timeDelta, cycle);
			}
		}

		EList<IntegrationDecorator> iDecorators = new BasicEList<IntegrationDecorator>();
		EList<TransformationDecorator> transDecorators = new BasicEList<TransformationDecorator>();

		for (final Iterator<Decorator> decoratorIter = this.getCanonicalGraph().getDecorators()
				.iterator(); decoratorIter.hasNext();) {
			final Decorator decorator = decoratorIter.next();
			// Is the decorator enabled?
			if (decorator.isEnabled()&& decorator instanceof IntegrationDecorator)
				iDecorators.add((IntegrationDecorator) decorator);
			if(decorator instanceof TransformationDecorator) transDecorators.add((TransformationDecorator)decorator);
		}

		double t = (double)cycle;
		
		if(this.binomialDist == null)
			binomialDist = new BinomialDistributionUtil(this.getSeed()); 

		for (IntegrationDecorator imodel : iDecorators) {
			imodel.calculateDeltas(time, t, timeDelta, partitioner.partitionDecoratorLabels(imodel, 0));
		}
		for (IntegrationDecorator imodel : iDecorators) {
			imodel.applyExternalDeltas(time, t, timeDelta, partitioner.partitionDecoratorLabels(imodel, 0));
		}
		for (IntegrationDecorator imodel : iDecorators) {
			for(DynamicLabel lab:partitioner.partitionDecoratorLabels(imodel, 0)) {
				IntegrationLabel iLab = (IntegrationLabel)lab;
				IntegrationLabelValue iLabCurrentValue = (IntegrationLabelValue)lab.getCurrentValue();
				IntegrationLabelValue iLabDeltaVal = iLab.getDeltaValue();

				// Do departures. The stochastic solver will make sure the source
				// and the target are both updated with the same stochastic value
				
				for(Exchange departureExchange:iLabDeltaVal.getDepartures()) {
					ExchangeType type = departureExchange.getType();
					double transitionCount = departureExchange.getCount();
					double sourceCount=0.0, targetCount=0.0;
					switch(type.getValue()) {
						case ExchangeType.COMPARTMENT_TRANSITION_VALUE:
							
							sourceCount = iLabCurrentValue.eGetDouble(departureExchange.getSource().getFeatureID());
							targetCount = iLabCurrentValue.eGetDouble(departureExchange.getTarget().getFeatureID());
							
							// We cannot move people that does not exist
							if(sourceCount > 0) {
								// Draw stochastic count
								double draw = transitionCount/sourceCount;
								if(draw > 1.0) draw = 1.0;
								int iTransitionCount = binomialDist.fastPickFromBinomialDist(draw, (int)Math.round(sourceCount));
								if(sourceCount < iTransitionCount)
									iTransitionCount = (int)Math.floor(sourceCount); // Move everyone, but if it's less than 1 person move 0
								// Update the source and the target
								iLabCurrentValue.eSetDouble(departureExchange.getSource().getFeatureID(), sourceCount - iTransitionCount);
								iLabCurrentValue.eSetDouble(departureExchange.getTarget().getFeatureID(), targetCount + iTransitionCount);
								// Add to incidence(s).
								if(departureExchange.getForIncidence() != null)
									for(EAttribute ea:departureExchange.getForIncidence())
										iLabCurrentValue.eSetDouble(ea.getFeatureID(), 
											iLabCurrentValue.eGetDouble(ea.getFeatureID())+iTransitionCount);
					
							} // else nothing to do.
							break;
						case ExchangeType.BIRTHS_AND_DEATHS_VALUE:
							// Departures are deaths
							int sum = 0; // Keep track of how many people we subtract from each compartment
							for(Label otherLabel:departureExchange.getOtherLabels()) {
								// There are two cases here. Either we are looking at background deaths in which case we subtract from
								// each compartment. Alternatively we are looking at disease deaths in which case we subtract from the
								// infectious compartment and the attached population model label.
								
								if(otherLabel instanceof DiseaseModelLabel) {
									// Each label is a disease model label that we need to update with the
									// deaths. We draw stochastically from each compartment (of type Standard, i.e. not Incidence or Disease deaths)
									//
									// TODO: This code does not properly update the population model label with the
									// correct count when there are more than one disease model using the population.
									// Need to think of how to do this. So far we haven't had any models in STEM of multiple diseases 
									// affecting a population at the same time.
									
									IntegrationLabelValue otherLabelValue = (IntegrationLabelValue)otherLabel.getCurrentValue();
									for(EAttribute ea:otherLabelValue.eClass().getEAllAttributes()) {
										if(!DiseaseModelImpl.isIncidence(ea) && !DiseaseModelImpl.isDiseaseDeaths(ea) && ea.isChangeable()) {
											sourceCount = otherLabelValue.eGetDouble(ea.getFeatureID());
											if(sourceCount > 0) {
												// Grim reaper go ahead
												// Weight the transition by the size of the compartment
												double weightedTransition = transitionCount*(sourceCount/otherLabelValue.eGetDouble(org.eclipse.stem.diseasemodels.standard.StandardPackage.eINSTANCE.getDiseaseModelLabelValue_PopulationCount().getFeatureID()));
												double draw = weightedTransition/sourceCount;
												if(draw > 1.0) draw = 1.0;
												int deathsCount = binomialDist.fastPickFromBinomialDist(draw, (int)Math.round(sourceCount));
												if(deathsCount > sourceCount)
													deathsCount = (int)Math.floor(sourceCount); // safe
												otherLabelValue.eSetDouble(ea.getFeatureID(), sourceCount - deathsCount);
												
												// Since we updated the other label value set the next value
												copyCurrentToNext((IntegrationLabel)otherLabel);
											
												sum += deathsCount;
											}
										}
									}
									// Ok disease models are done. Subtract from the population model label the sum of all deaths
									
									if(iLab instanceof StandardPopulationModelLabel) {
										iLabCurrentValue.eSetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID(), 
												iLabCurrentValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID())-sum);
										iLabCurrentValue.eSetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Deaths().getFeatureID(), 
												sum);
									}// if this is a population model
									
									
								} else {
									// We are doing disease deaths
									IntegrationLabelValue otherLabelValue = (IntegrationLabelValue)otherLabel.getCurrentValue();
									sourceCount = iLabCurrentValue.eGetDouble(departureExchange.getSource().getFeatureID());
									if(sourceCount > 0) {
										int actualDiseaseDeaths = binomialDist.fastPickFromBinomialDist(transitionCount/sourceCount, (int)Math.round(sourceCount));
										if(iLabCurrentValue.eGetDouble(departureExchange.getSource().getFeatureID()) < actualDiseaseDeaths)
											actualDiseaseDeaths = (int)Math.floor(iLabCurrentValue.eGetDouble(departureExchange.getSource().getFeatureID())); // safe
										// Update current value (the disease)
										iLabCurrentValue.eSetDouble(departureExchange.getSource().getFeatureID(), 
												iLabCurrentValue.eGetDouble(departureExchange.getSource().getFeatureID())-actualDiseaseDeaths);
										iLabCurrentValue.eSetDouble(departureExchange.getTarget().getFeatureID(), 
												iLabCurrentValue.eGetDouble(departureExchange.getTarget().getFeatureID())+actualDiseaseDeaths);
										
										// Update the population model count
										otherLabelValue.eSetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID(), 
												otherLabelValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID())-actualDiseaseDeaths);
										
										// Since we updated the population model label value set the next value
										copyCurrentToNext((IntegrationLabel)otherLabel);
									}
								}
								
							}
							
							break;
						default:
							break;
					}
				}
				
				// Do arrivals. The only thing we need to consider here is births.			
				for(Exchange arrivalsExchange:iLabDeltaVal.getArrivals()) {
					
					ExchangeType type = arrivalsExchange.getType();
					double transitionCount = arrivalsExchange.getCount();
					double sourceCount=0.0;
//					double targetCount=0.0;
					switch(type.getValue()) {
						case ExchangeType.BIRTHS_AND_DEATHS_VALUE:
							// Arrivals are births
//							double births = transitionCount;
							for(Label otherLabel:arrivalsExchange.getOtherLabels()) {
								// Each label is a disease model label that we need to update with the
								// births. 
								EAttribute birthsCompartment = arrivalsExchange.getTarget();
								IntegrationLabelValue otherLabelValue = (IntegrationLabelValue)otherLabel.getCurrentValue();
								
								// The source count  is simple if it's a standard population model. However, when we're using an Aging population model we
								// need to add up the counts for all groups
								if(imodel instanceof AgingPopulationModel) {
									HashMap<String, AgeGroup> groups = new HashMap<String, AgeGroup>();
									AgingPopulationModel apm = (AgingPopulationModel)imodel;
									for (PopulationGroup group : apm.getPopulationGroups()) {
										groups.put(group.getIdentifier(), (AgeGroup) group);
									}
									for (NodeLabel lab2 : iLab.getNode().getLabels()) {
										if (lab2 instanceof StandardPopulationModelLabel) {
											StandardPopulationModelLabel label = (StandardPopulationModelLabel) lab2;
											AgeGroup group = groups
													.get(label.getPopulationIdentifier());

											if (group != null) {
												double count = ((StandardPopulationModelLabelValue) label
														.getCurrentValue()).getCount();
												sourceCount += count;
											}
										}
									}
								}
								else sourceCount =  iLabCurrentValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID());
								if(sourceCount > 0) {
									double draw = transitionCount/sourceCount;
									if(draw > 1.0) draw = 1.0;
									int birthsCount = binomialDist.fastPickFromBinomialDist(draw, (int)Math.round(sourceCount));
									otherLabelValue.eSetDouble(birthsCompartment.getFeatureID(), otherLabelValue.eGetDouble(birthsCompartment.getFeatureID())+birthsCount);
									iLabCurrentValue.eSetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID(), iLabCurrentValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID())+birthsCount);
									iLabCurrentValue.eSetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Births().getFeatureID(), birthsCount);
									
									// Since we updated the other label value set the next value
									copyCurrentToNext((IntegrationLabel)otherLabel);
								}
							}							
							break;
						case ExchangeType.MIGRATION_VALUE:
							// Migration exchanges are stored in the population model deltas.
							
							IntegrationLabel otherPopulationModelLabel = (IntegrationLabel)arrivalsExchange.getOtherLabels().get(0);
							IntegrationLabelValue otherPopulationModelLabelValue =(IntegrationLabelValue) otherPopulationModelLabel.getCurrentValue();
							
							// First find how many people are in the source
							sourceCount = otherPopulationModelLabelValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID());
							int roundedSourceCount = (int)Math.round(sourceCount);
							// SED FIX 2019/02/12
							double probability = transitionCount/sourceCount;
							if(Double.isInfinite(probability))
								probability = 0;
							if(probability > 1.0)
								probability = 1.0;
							double stochasticMigration = binomialDist.fastPickFromBinomialDist(probability, roundedSourceCount); 
							if(stochasticMigration > sourceCount)
								stochasticMigration = sourceCount;
							// END FIX
							
							// Draw stochastically the number of people migrating in
							int sumMigration=0;
							if(sourceCount > 0) {
								// The rest of the labels in the "otherLabels" array are organized in pairs, where the first is the source
								// disease model label and the second is the target. We draw for each compartment of type Standard stochastically
								// weighted by the size of the compartment, similar to how background deaths are done
								for(int i=1;i<arrivalsExchange.getOtherLabels().size()-1;i+=2) {
									IntegrationLabel otherDiseaseModelLabel = (IntegrationLabel)arrivalsExchange.getOtherLabels().get(i);
									IntegrationLabelValue otherDiseaseModelLabelValue =(IntegrationLabelValue) otherDiseaseModelLabel.getCurrentValue();
									IntegrationLabel thisDiseaseModelLabel = (IntegrationLabel)arrivalsExchange.getOtherLabels().get(i+1);
									IntegrationLabelValue thisDiseaseModelLabelValue =(IntegrationLabelValue) thisDiseaseModelLabel.getCurrentValue();
									
									for(EAttribute ea:otherDiseaseModelLabelValue.eClass().getEAllAttributes()) {
										if(!DiseaseModelImpl.isIncidence(ea) && !DiseaseModelImpl.isDiseaseDeaths(ea) && ea.isChangeable()) {
											sourceCount = otherDiseaseModelLabelValue.eGetDouble(ea.getFeatureID());									
											if(sourceCount > 0) {		
												// Migrate weighting by the size of the compartment
												//double weightedTransition = transitionCount*(sourceCount/otherDiseaseModelLabelValue.eGetDouble( org.eclipse.stem.diseasemodels.standard.StandardPackage.eINSTANCE.getDiseaseModelLabelValue_PopulationCount().getFeatureID()));
												// SED FIX:
												double weightedTransition = stochasticMigration*(sourceCount/otherDiseaseModelLabelValue.eGetDouble( org.eclipse.stem.diseasemodels.standard.StandardPackage.eINSTANCE.getDiseaseModelLabelValue_PopulationCount().getFeatureID()));
												//double draw = weightedTransition/sourceCount;
												//if(draw > 1.0) draw = 1.0;
												//int iMigrationCount = binomialDist.fastPickFromBinomialDist(draw, (int)Math.round(sourceCount));
												// SED FIX:
												int iMigrationCount = (int)Math.round(weightedTransition);
												if(sumMigration+iMigrationCount > stochasticMigration)
													iMigrationCount = (int)(stochasticMigration - sumMigration); // Fix for rounding problem with Math.round(x.5) => x+1 
												if(otherDiseaseModelLabelValue.eGetDouble(ea.getFeatureID()) < iMigrationCount)
													iMigrationCount = (int)Math.floor(otherDiseaseModelLabelValue.eGetDouble(ea.getFeatureID()));
												// Subtract from the source the number of people migrating out of the state
												otherDiseaseModelLabelValue.eSetDouble(ea.getFeatureID(), 
														otherDiseaseModelLabelValue.eGetDouble(ea.getFeatureID())-iMigrationCount);
												
													// Add to the target disease model label compartment
												thisDiseaseModelLabelValue.eSetDouble(ea.getFeatureID(), 
														thisDiseaseModelLabelValue.eGetDouble(ea.getFeatureID())+iMigrationCount);
												
												// SED FIX not needed
												sumMigration += iMigrationCount;
											}
										}
									}
									
									// Since we updated the other label value set the next value
									copyCurrentToNext(otherDiseaseModelLabel);
								}

								// Add to  the source the number of people migrating in
								iLabCurrentValue.eSetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID(), 
										iLabCurrentValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID())+stochasticMigration);
								
								// Subtract from the target population model label
								IntegrationLabel targetPopulationLabel = (IntegrationLabel)arrivalsExchange.getOtherLabels().get(0); // First one is population model label;
								IntegrationLabelValue targetPopulationLabelValue = (IntegrationLabelValue)targetPopulationLabel.getCurrentValue();
								targetPopulationLabelValue.eSetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID(), 
										targetPopulationLabelValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID())-stochasticMigration);
								// Since we updated the other label value set the next value
								copyCurrentToNext(targetPopulationLabel);					
							}
							
							break;
						case ExchangeType.AGING_VALUE:
							// Aging exchanges are stored in the population model deltas.
							
							otherPopulationModelLabel = (IntegrationLabel)arrivalsExchange.getOtherLabels().get(0);
							otherPopulationModelLabelValue =(IntegrationLabelValue) otherPopulationModelLabel.getCurrentValue();
							
							// First find how many people are in the source
							sourceCount = otherPopulationModelLabelValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID());
							
							// SED FIX 2019/02/12
							roundedSourceCount = (int)Math.round(sourceCount);
							probability = transitionCount/sourceCount;
							if(Double.isInfinite(probability))
								probability = 0;
							if(probability > 1.0)
								probability = 1.0;
							double stochasticAging = binomialDist.fastPickFromBinomialDist(probability, roundedSourceCount); 
							if(stochasticAging > sourceCount)
								stochasticAging = sourceCount;
							
							// END FIX
							
							// Draw stochastically the number of people aging in
							int sumAging=0;
							if(sourceCount > 0) {
								// The rest of the labels in the "otherLabels" array are organized in pairs, where the first is the source
								// disease model label and the second is the target. We draw for each compartment of type Standard stochastically
								// weighted by the size of the compartment, similar to how background deaths are done
								for(int i=1;i<arrivalsExchange.getOtherLabels().size()-1;i+=2) {
									IntegrationLabel otherDiseaseModelLabel = (IntegrationLabel)arrivalsExchange.getOtherLabels().get(i);
									IntegrationLabelValue otherDiseaseModelLabelValue =(IntegrationLabelValue) otherDiseaseModelLabel.getCurrentValue();
									IntegrationLabel thisDiseaseModelLabel = (IntegrationLabel)arrivalsExchange.getOtherLabels().get(i+1);
									IntegrationLabelValue thisDiseaseModelLabelValue =(IntegrationLabelValue) thisDiseaseModelLabel.getCurrentValue();
									
									for(EAttribute ea:otherDiseaseModelLabelValue.eClass().getEAllAttributes()) {
										if(!DiseaseModelImpl.isIncidence(ea) && !DiseaseModelImpl.isDiseaseDeaths(ea) && ea.isChangeable()) {
											sourceCount = otherDiseaseModelLabelValue.eGetDouble(ea.getFeatureID());									
											if(sourceCount > 0) {		
												// Aging weighting by the size of the compartment
												// SED FIX
												//double weightedTransition = transitionCount*(sourceCount/otherDiseaseModelLabelValue.eGetDouble( org.eclipse.stem.diseasemodels.standard.StandardPackage.eINSTANCE.getDiseaseModelLabelValue_PopulationCount().getFeatureID()));
												//double draw = weightedTransition/sourceCount;
												//if(draw > 1.0) draw = 1.0;
												double weightedTransition = stochasticAging*(sourceCount/otherDiseaseModelLabelValue.eGetDouble( org.eclipse.stem.diseasemodels.standard.StandardPackage.eINSTANCE.getDiseaseModelLabelValue_PopulationCount().getFeatureID()));
												
												//int iAgingCount = binomialDist.fastPickFromBinomialDist(draw, (int)Math.round(sourceCount));
												int iAgingCount = (int)Math.round(weightedTransition);
												
												if(sumAging+iAgingCount > stochasticAging)
													iAgingCount = (int)(stochasticAging - iAgingCount); // Fix for rounding problem with Math.round(x.5) => x+1 
							
												if(iAgingCount > sourceCount)
													iAgingCount = (int)Math.floor(sourceCount); // safe, don't age more than available
												// Subtract from the source the number of people migrating out of the state
												otherDiseaseModelLabelValue.eSetDouble(ea.getFeatureID(), 
														otherDiseaseModelLabelValue.eGetDouble(ea.getFeatureID())-iAgingCount);
												// Add to the target disease model label compartment
												thisDiseaseModelLabelValue.eSetDouble(ea.getFeatureID(), 
														thisDiseaseModelLabelValue.eGetDouble(ea.getFeatureID())+iAgingCount);
												
												sumAging += iAgingCount;
												
											}
										}
									}
									
									// Since we updated the other label value set the next value
									copyCurrentToNext(otherDiseaseModelLabel);
									copyCurrentToNext(thisDiseaseModelLabel);
								} // sourceCount >0

								
									// Add to  the source the number of people aging in
								iLabCurrentValue.eSetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID(), 
										iLabCurrentValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID())+stochasticAging);
								
								// Subtract from the target population model label
								IntegrationLabel targetPopulationLabel = (IntegrationLabel)arrivalsExchange.getOtherLabels().get(0); // First one is population model label;
								IntegrationLabelValue targetPopulationLabelValue = (IntegrationLabelValue)targetPopulationLabel.getCurrentValue();
								targetPopulationLabelValue.eSetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID(), 
										targetPopulationLabelValue.eGetDouble(StandardPackage.eINSTANCE.getStandardPopulationModelLabelValue_Count().getFeatureID())-stochasticAging);
								// Since we updated the current value of the other label set the next value
								// Set the next to the modified current value
								copyCurrentToNext(targetPopulationLabel);
								
							}
							
							break;
				
						default:
							break;
					}
				}
					
				// Set the next to the modified current value
				copyCurrentToNext(iLab);	
			}
		}
		
		
		
		return true;
	}
	
	private void copyCurrentToNext(IntegrationLabel iLabel) {
		// SED FIX 2019/02/21. 
		// Need to set tbhe next label valid so that notifications occurs on the GraphImpl switchToNextValue() call,
		// or things like TimeSeries won't work.
		
		iLabel.setNextValueValid(true);
		
		IntegrationLabelValue iLabelValueCurrent = (IntegrationLabelValue)iLabel.getCurrentValue();
		IntegrationLabelValue iLabelValueNext = (IntegrationLabelValue)iLabel.getNextValue();
		iLabelValueNext.set(iLabelValueCurrent);

	}

	BinomialDistributionUtil binomialDist;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StochasticPackage.Literals.STANDARD_STOCHASTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public long getSeed() {
		if (this.randomizeSeed) {
			long millis = System.currentTimeMillis();
			seed = Math.abs((int) millis);
			// System.out.println("seed = " + seed);
		}
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeed(long newSeed) {
		long oldSeed = seed;
		seed = newSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StochasticPackage.STANDARD_STOCHASTIC__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRandomizeSeed() {
		return randomizeSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRandomizeSeed(boolean newRandomizeSeed) {
		boolean oldRandomizeSeed = randomizeSeed;
		randomizeSeed = newRandomizeSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StochasticPackage.STANDARD_STOCHASTIC__RANDOMIZE_SEED, oldRandomizeSeed, randomizeSeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StochasticPackage.STANDARD_STOCHASTIC__SEED:
				return getSeed();
			case StochasticPackage.STANDARD_STOCHASTIC__RANDOMIZE_SEED:
				return isRandomizeSeed();
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
			case StochasticPackage.STANDARD_STOCHASTIC__SEED:
				setSeed((Long)newValue);
				return;
			case StochasticPackage.STANDARD_STOCHASTIC__RANDOMIZE_SEED:
				setRandomizeSeed((Boolean)newValue);
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
			case StochasticPackage.STANDARD_STOCHASTIC__SEED:
				setSeed(SEED_EDEFAULT);
				return;
			case StochasticPackage.STANDARD_STOCHASTIC__RANDOMIZE_SEED:
				setRandomizeSeed(RANDOMIZE_SEED_EDEFAULT);
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
			case StochasticPackage.STANDARD_STOCHASTIC__SEED:
				return seed != SEED_EDEFAULT;
			case StochasticPackage.STANDARD_STOCHASTIC__RANDOMIZE_SEED:
				return randomizeSeed != RANDOMIZE_SEED_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (seed: ");
		result.append(seed);
		result.append(", RandomizeSeed: ");
		result.append(randomizeSeed);
		result.append(')');
		return result.toString();
	}

	/**
	 * Reset the solver
	 * 
	 * @generated NOT
	 */
	@Override
	public void reset() {
		binomialDist = new BinomialDistributionUtil(this.getSeed());
		this.setInitialized(false);
	}
} //StandardStochasticImpl
