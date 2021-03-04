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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.stem.core.common.DoubleValueMatrix;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.foodproduction.DiseaseCarryingTransformer;
import org.eclipse.stem.foodproduction.FoodproductionPackage;
import org.eclipse.stem.foodproduction.SlaughterHouse;
import org.eclipse.stem.populationmodels.Activator;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slaughter House</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.SlaughterHouseImpl#getSourceDecorator <em>Source Decorator</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.SlaughterHouseImpl#getTargetDecorator <em>Target Decorator</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.SlaughterHouseImpl#getStateTransitionsMap <em>State Transitions Map</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.SlaughterHouseImpl#getSourceAttributes <em>Source Attributes</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.SlaughterHouseImpl#getTargetAttributes <em>Target Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlaughterHouseImpl extends FoodProducerImpl implements SlaughterHouse {
	/**
	 * The cached value of the '{@link #getSourceDecorator() <em>Source Decorator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecorator()
	 * @generated
	 * @ordered
	 */
	protected IntegrationDecorator sourceDecorator;

	/**
	 * The cached value of the '{@link #getTargetDecorator() <em>Target Decorator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDecorator()
	 * @generated
	 * @ordered
	 */
	protected IntegrationDecorator targetDecorator;

	/**
	 * The cached value of the '{@link #getStateTransitionsMap() <em>State Transitions Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransitionsMap()
	 * @generated
	 * @ordered
	 */
	protected DoubleValueMatrix stateTransitionsMap;

	/**
	 * The cached value of the '{@link #getSourceAttributes() <em>Source Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> sourceAttributes;

	/**
	 * The cached value of the '{@link #getTargetAttributes() <em>Target Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> targetAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SlaughterHouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoodproductionPackage.Literals.SLAUGHTER_HOUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationDecorator getSourceDecorator() {
		if (sourceDecorator != null && sourceDecorator.eIsProxy()) {
			InternalEObject oldSourceDecorator = (InternalEObject)sourceDecorator;
			sourceDecorator = (IntegrationDecorator)eResolveProxy(oldSourceDecorator);
			if (sourceDecorator != oldSourceDecorator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_DECORATOR, oldSourceDecorator, sourceDecorator));
			}
		}
		return sourceDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationDecorator basicGetSourceDecorator() {
		return sourceDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDecorator(IntegrationDecorator newSourceDecorator) {
		IntegrationDecorator oldSourceDecorator = sourceDecorator;
		sourceDecorator = newSourceDecorator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_DECORATOR, oldSourceDecorator, sourceDecorator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationDecorator getTargetDecorator() {
		if (targetDecorator != null && targetDecorator.eIsProxy()) {
			InternalEObject oldTargetDecorator = (InternalEObject)targetDecorator;
			targetDecorator = (IntegrationDecorator)eResolveProxy(oldTargetDecorator);
			if (targetDecorator != oldTargetDecorator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_DECORATOR, oldTargetDecorator, targetDecorator));
			}
		}
		return targetDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationDecorator basicGetTargetDecorator() {
		return targetDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDecorator(IntegrationDecorator newTargetDecorator) {
		IntegrationDecorator oldTargetDecorator = targetDecorator;
		targetDecorator = newTargetDecorator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_DECORATOR, oldTargetDecorator, targetDecorator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleValueMatrix getStateTransitionsMap() {
		return stateTransitionsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateTransitionsMap(DoubleValueMatrix newStateTransitionsMap, NotificationChain msgs) {
		DoubleValueMatrix oldStateTransitionsMap = stateTransitionsMap;
		stateTransitionsMap = newStateTransitionsMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP, oldStateTransitionsMap, newStateTransitionsMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTransitionsMap(DoubleValueMatrix newStateTransitionsMap) {
		if (newStateTransitionsMap != stateTransitionsMap) {
			NotificationChain msgs = null;
			if (stateTransitionsMap != null)
				msgs = ((InternalEObject)stateTransitionsMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP, null, msgs);
			if (newStateTransitionsMap != null)
				msgs = ((InternalEObject)newStateTransitionsMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP, null, msgs);
			msgs = basicSetStateTransitionsMap(newStateTransitionsMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP, newStateTransitionsMap, newStateTransitionsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getSourceAttributes() {
		if (sourceAttributes == null) {
			sourceAttributes = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_ATTRIBUTES);
		}
		return sourceAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getTargetAttributes() {
		if (targetAttributes == null) {
			targetAttributes = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_ATTRIBUTES);
		}
		return targetAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP:
				return basicSetStateTransitionsMap(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_DECORATOR:
				if (resolve) return getSourceDecorator();
				return basicGetSourceDecorator();
			case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_DECORATOR:
				if (resolve) return getTargetDecorator();
				return basicGetTargetDecorator();
			case FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP:
				return getStateTransitionsMap();
			case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_ATTRIBUTES:
				return getSourceAttributes();
			case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_ATTRIBUTES:
				return getTargetAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_DECORATOR:
				setSourceDecorator((IntegrationDecorator)newValue);
				return;
			case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_DECORATOR:
				setTargetDecorator((IntegrationDecorator)newValue);
				return;
			case FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP:
				setStateTransitionsMap((DoubleValueMatrix)newValue);
				return;
			case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_ATTRIBUTES:
				getSourceAttributes().clear();
				getSourceAttributes().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_ATTRIBUTES:
				getTargetAttributes().clear();
				getTargetAttributes().addAll((Collection<? extends EAttribute>)newValue);
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
			case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_DECORATOR:
				setSourceDecorator((IntegrationDecorator)null);
				return;
			case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_DECORATOR:
				setTargetDecorator((IntegrationDecorator)null);
				return;
			case FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP:
				setStateTransitionsMap((DoubleValueMatrix)null);
				return;
			case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_ATTRIBUTES:
				getSourceAttributes().clear();
				return;
			case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_ATTRIBUTES:
				getTargetAttributes().clear();
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
			case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_DECORATOR:
				return sourceDecorator != null;
			case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_DECORATOR:
				return targetDecorator != null;
			case FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP:
				return stateTransitionsMap != null;
			case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_ATTRIBUTES:
				return sourceAttributes != null && !sourceAttributes.isEmpty();
			case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_ATTRIBUTES:
				return targetAttributes != null && !targetAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DiseaseCarryingTransformer.class) {
			switch (derivedFeatureID) {
				case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_DECORATOR: return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR;
				case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_DECORATOR: return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR;
				case FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP: return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP;
				case FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_ATTRIBUTES: return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__SOURCE_ATTRIBUTES;
				case FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_ATTRIBUTES: return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__TARGET_ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DiseaseCarryingTransformer.class) {
			switch (baseFeatureID) {
				case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR: return FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_DECORATOR;
				case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR: return FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_DECORATOR;
				case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP: return FoodproductionPackage.SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP;
				case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__SOURCE_ATTRIBUTES: return FoodproductionPackage.SLAUGHTER_HOUSE__SOURCE_ATTRIBUTES;
				case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__TARGET_ATTRIBUTES: return FoodproductionPackage.SLAUGHTER_HOUSE__TARGET_ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * Produce food!
	 * @generated NOT
	 */
	@Override
	public void updateLabels(STEMTime time, long timeDelta, int cycle) {
		String sourcePopulation = this.getSourcePopulationName();
		String foodPopulation = this.getTargetPopulationName();
		
		// 1. update the population\
		for(DynamicLabel dl:this.getSourceLabels()) {
			if(dl instanceof PopulationModelLabel) {				
				PopulationModelLabel pml = (PopulationModelLabel)dl;
				if(pml.getPopulationIdentifier().equals(sourcePopulation)) {
					StandardPopulationModelLabelValue source = (StandardPopulationModelLabelValue)pml.getCurrentValue();
					// Remove all source population but remember the count					
					double sourcePopulationCount = source.getCount();
					double sourceConsumed = sourceProcessingRate * ((double) timeDelta / (double)getTimePeriod()); // source Processing rate in absolute Count [units/Time Period]  (not a fractonal rate)
					double remainingSourcePopulationCount = sourcePopulationCount - sourceConsumed;
					if(remainingSourcePopulationCount < 0.0) {
						remainingSourcePopulationCount = 0.0;
						sourceConsumed = sourcePopulationCount;
					}
				    source.setCount(remainingSourcePopulationCount);
										
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
					
					if(Double.isNaN(fractionSourceRemaining)) fractionSourceRemaining = 0.0;
					// the this current node
					Node node = ((PopulationModelLabel) dl).getNode();
					
					// Find the source disease model label. We need it to map into the disease state of the food.
					// Later we will rescale it depending on how much of the source remains					
					DiseaseModelLabel sourceDiseaseLabel = null;
					EList<NodeLabel>nlList = node.getLabels();
					for(NodeLabel nl: nlList) {
						if(nl instanceof DiseaseModelLabel) {
							DiseaseModelLabel dml = (DiseaseModelLabel)nl;
							String targetPop = dml.getIdentifier();

							// rescale the source disease states
							if(targetPop.equalsIgnoreCase(this.sourcePopulationName)) {
								sourceDiseaseLabel = dml;
								break;
							}
						}
					}
								
					// 1. We need to loop over the node label twice. The first time we will find and update
					// all of the diseases associated with food taking the compartment counts from the source
					nlList = node.getLabels();
					for(NodeLabel nl: nlList) {
						if(nl instanceof DiseaseModelLabel) {
							DiseaseModelLabel foodDiseaseLabel = (DiseaseModelLabel)nl;
							String targetPop = foodDiseaseLabel.getIdentifier();
														
							// MAP the food disease states
							if(targetPop.equalsIgnoreCase(this.targetPopulationName)) {
								EList<EAttribute> sourceAttrList = this.getSourceAttributes();
								int row = 0;
								int col = 0;
								for(EAttribute sAttr: sourceAttrList) {
									Double compartmentVal = (Double)sourceDiseaseLabel.getCurrentValue().eGet(sAttr);
									
									double originalSourceVal = compartmentVal.doubleValue();
									double compartmentValueToMove = originalSourceVal*this.getFoodYieldPopulationMultiplier()*(sourceConsumed/sourcePopulationCount);
									
									if(Double.isNaN(compartmentValueToMove))
										compartmentValueToMove = 0.0;
									EList<EAttribute> foodAttrList = this.getTargetAttributes();
									for(EAttribute fAttr: foodAttrList) {
									    double compartmentMapFraction = this.getStateTransitionsMap().getValueLists().get(row).getValues().get(col).getValue();
										Double currentCompartmentVal = (Double)foodDiseaseLabel.getCurrentValue().eGet(fAttr);
										double newCompartmentVal = (compartmentValueToMove*compartmentMapFraction) + currentCompartmentVal.doubleValue();
										foodDiseaseLabel.getCurrentValue().eSet(fAttr,Double.valueOf(newCompartmentVal));
										col++;
									}
									
									col = 0;
									row ++;									
								}	
							}
						}// if disease model label
					}// for all node labels
					
					//2. Rescale the diseases associated with the source
					IntegrationLabelValue ilv = (IntegrationLabelValue)(sourceDiseaseLabel.getCurrentValue());
					ilv.scale(fractionSourceRemaining);									
				} 
			}
		}// for all SOURCE decorators	
	}
	
} //SlaughterHouseImpl
