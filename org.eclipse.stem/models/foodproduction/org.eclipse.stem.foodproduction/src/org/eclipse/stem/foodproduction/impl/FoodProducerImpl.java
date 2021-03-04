/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.foodproduction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.foodproduction.FoodProducer;
import org.eclipse.stem.foodproduction.FoodproductionPackage;
import org.eclipse.stem.populationmodels.Activator;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Food Producer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.FoodProducerImpl#getFoodYieldPopulationMultiplier <em>Food Yield Population Multiplier</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.FoodProducerImpl#getSourceProcessingRate <em>Source Processing Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FoodProducerImpl extends FoodTransformerImpl implements FoodProducer {
	/**
	 * The default value of the '{@link #getFoodYieldPopulationMultiplier() <em>Food Yield Population Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodYieldPopulationMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final double FOOD_YIELD_POPULATION_MULTIPLIER_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getFoodYieldPopulationMultiplier() <em>Food Yield Population Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodYieldPopulationMultiplier()
	 * @generated
	 * @ordered
	 */
	protected double foodYieldPopulationMultiplier = FOOD_YIELD_POPULATION_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceProcessingRate() <em>Source Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected static final double SOURCE_PROCESSING_RATE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getSourceProcessingRate() <em>Source Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected double sourceProcessingRate = SOURCE_PROCESSING_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FoodProducerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoodproductionPackage.Literals.FOOD_PRODUCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFoodYieldPopulationMultiplier() {
		return foodYieldPopulationMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoodYieldPopulationMultiplier(double newFoodYieldPopulationMultiplier) {
		double oldFoodYieldPopulationMultiplier = foodYieldPopulationMultiplier;
		foodYieldPopulationMultiplier = newFoodYieldPopulationMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodproductionPackage.FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER, oldFoodYieldPopulationMultiplier, foodYieldPopulationMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSourceProcessingRate() {
		return sourceProcessingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceProcessingRate(double newSourceProcessingRate) {
		double oldSourceProcessingRate = sourceProcessingRate;
		sourceProcessingRate = newSourceProcessingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodproductionPackage.FOOD_PRODUCER__SOURCE_PROCESSING_RATE, oldSourceProcessingRate, sourceProcessingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FoodproductionPackage.FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER:
				return getFoodYieldPopulationMultiplier();
			case FoodproductionPackage.FOOD_PRODUCER__SOURCE_PROCESSING_RATE:
				return getSourceProcessingRate();
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
			case FoodproductionPackage.FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER:
				setFoodYieldPopulationMultiplier((Double)newValue);
				return;
			case FoodproductionPackage.FOOD_PRODUCER__SOURCE_PROCESSING_RATE:
				setSourceProcessingRate((Double)newValue);
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
			case FoodproductionPackage.FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER:
				setFoodYieldPopulationMultiplier(FOOD_YIELD_POPULATION_MULTIPLIER_EDEFAULT);
				return;
			case FoodproductionPackage.FOOD_PRODUCER__SOURCE_PROCESSING_RATE:
				setSourceProcessingRate(SOURCE_PROCESSING_RATE_EDEFAULT);
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
			case FoodproductionPackage.FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER:
				return foodYieldPopulationMultiplier != FOOD_YIELD_POPULATION_MULTIPLIER_EDEFAULT;
			case FoodproductionPackage.FOOD_PRODUCER__SOURCE_PROCESSING_RATE:
				return sourceProcessingRate != SOURCE_PROCESSING_RATE_EDEFAULT;
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
		result.append(" (foodYieldPopulationMultiplier: ");
		result.append(foodYieldPopulationMultiplier);
		result.append(", sourceProcessingRate: ");
		result.append(sourceProcessingRate);
		result.append(')');
		return result.toString();
	}

	/**
	 * Produce food!
	 * @generated NOT
	 */
	public void updateLabels(STEMTime time, long timeDelta, int cycle) {
		String sourcePopulation = this.getSourcePopulationName();
		String foodPopulation = this.getTargetPopulationName();
		
		for(DynamicLabel dl:this.getSourceLabels()) {
			if(dl instanceof PopulationModelLabel) {
				PopulationModelLabel pml = (PopulationModelLabel)dl;
				if(pml.getPopulationIdentifier().equals(sourcePopulation)) {
					StandardPopulationModelLabelValue source = (StandardPopulationModelLabelValue)pml.getCurrentValue();
					// Remove all source population but remember the count					
					double sourcePopulationCount = source.getCount();
					// source Processing rate in absolute Count [units/Time Period]  (not a fractional rate)
					double sourceConsumed = sourceProcessingRate * ((double) timeDelta / (double)getTimePeriod());
					double newCount = sourcePopulationCount - sourceConsumed;
					if(newCount < 0.0) {
						newCount = 0.0;
						sourceConsumed = sourcePopulationCount;
					}
				    source.setCount(newCount);
										
					// Find the food population label value				  
				    Node n = (Node)pml.getIdentifiable();				    
					StandardPopulationModelLabelValue foodPopValue = (StandardPopulationModelLabelValue) n.getLabel(
							StandardPackage.eINSTANCE.getStandardPopulationModelLabel(),
							GraphPackage.eINSTANCE.getIntegrationLabel_Identifier(), foodPopulation).getCurrentValue();
					if(foodPopValue == null) {
						Activator.logError("Cannot find food population label", new Exception());
						continue;
					}
					double foodCreated = sourceConsumed*this.getFoodYieldPopulationMultiplier();
					foodPopValue.setCount(foodPopValue.getCount()+foodCreated);
										
					double fractionSourceRemaining = (sourcePopulationCount-sourceConsumed)/sourcePopulationCount;
					// the this current node
					Node node = ((PopulationModelLabel) dl).getNode();
					EList<NodeLabel> nlList = node.getLabels();
					for(NodeLabel nl: nlList) {
						if(nl instanceof DiseaseModelLabel) {
							DiseaseModelLabel dml = (DiseaseModelLabel)nl;
							String targetPop = dml.getIdentifier();
							if(targetPop.equalsIgnoreCase(this.sourcePopulationName)) {
								IntegrationLabelValue ilv = (IntegrationLabelValue)(dml.getCurrentValue());
								ilv.scale(fractionSourceRemaining);								
							}
						}			
					}// for all node labels					
				} 
			}
		}
	}
	
} //FoodProducerImpl
