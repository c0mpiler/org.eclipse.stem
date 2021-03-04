/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut für Risikobewertung - initial API and implementation 
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
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.foodproduction.ConsumptionType;
import org.eclipse.stem.foodproduction.DiseaseCarryingTransformer;
import org.eclipse.stem.foodproduction.FoodConsumer;
import org.eclipse.stem.foodproduction.FoodproductionPackage;
import org.eclipse.stem.populationmodels.Activator;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Food Consumer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl#getSourceDecorator
 * <em>Source Decorator</em>}</li>
 * <li>
 * {@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl#getTargetDecorator
 * <em>Target Decorator</em>}</li>
 * <li>
 * {@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl#getStateTransitionsMap
 * <em>State Transitions Map</em>}</li>
 * <li>
 * {@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl#getSourceAttributes
 * <em>Source Attributes</em>}</li>
 * <li>
 * {@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl#getTargetAttributes
 * <em>Target Attributes</em>}</li>
 * <li>
 * {@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl#getConsumptionRate
 * <em>Consumption Rate</em>}</li>
 * <li>
 * {@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl#getConsumptionType
 * <em>Consumption Type</em>}</li>
 * <li>
 * {@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl#getWasteRate
 * <em>Waste Rate</em>}</li>
 * <li>
 * {@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl#getMaxVolumeOfStocks
 * <em>Max Volume Of Stocks</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class FoodConsumerImpl extends FoodTransformerImpl implements
		FoodConsumer {
	/**
	 * The cached value of the '{@link #getSourceDecorator()
	 * <em>Source Decorator</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSourceDecorator()
	 * @generated
	 * @ordered
	 */
	protected IntegrationDecorator sourceDecorator;

	/**
	 * The cached value of the '{@link #getTargetDecorator()
	 * <em>Target Decorator</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargetDecorator()
	 * @generated
	 * @ordered
	 */
	protected IntegrationDecorator targetDecorator;

	/**
	 * The cached value of the '{@link #getStateTransitionsMap()
	 * <em>State Transitions Map</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStateTransitionsMap()
	 * @generated
	 * @ordered
	 */
	protected DoubleValueMatrix stateTransitionsMap;

	/**
	 * The cached value of the '{@link #getSourceAttributes()
	 * <em>Source Attributes</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSourceAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> sourceAttributes;

	/**
	 * The cached value of the '{@link #getTargetAttributes()
	 * <em>Target Attributes</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargetAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> targetAttributes;

	/**
	 * The default value of the '{@link #getConsumptionRate()
	 * <em>Consumption Rate</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getConsumptionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double CONSUMPTION_RATE_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getConsumptionRate()
	 * <em>Consumption Rate</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getConsumptionRate()
	 * @generated
	 * @ordered
	 */
	protected double consumptionRate = CONSUMPTION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumptionType()
	 * <em>Consumption Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getConsumptionType()
	 * @generated
	 * @ordered
	 */
	protected static final ConsumptionType CONSUMPTION_TYPE_EDEFAULT = ConsumptionType.RELATIVE_CONSUMPTION;

	/**
	 * The cached value of the '{@link #getConsumptionType()
	 * <em>Consumption Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getConsumptionType()
	 * @generated
	 * @ordered
	 */
	protected ConsumptionType consumptionType = CONSUMPTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWasteRate() <em>Waste Rate</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWasteRate()
	 * @generated
	 * @ordered
	 */
	protected static final double WASTE_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWasteRate() <em>Waste Rate</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWasteRate()
	 * @generated
	 * @ordered
	 */
	protected double wasteRate = WASTE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVolumeOfStocks()
	 * <em>Max Volume Of Stocks</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMaxVolumeOfStocks()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VOLUME_OF_STOCKS_EDEFAULT = 1000000.0;

	/**
	 * The cached value of the '{@link #getMaxVolumeOfStocks()
	 * <em>Max Volume Of Stocks</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMaxVolumeOfStocks()
	 * @generated
	 * @ordered
	 */
	protected double maxVolumeOfStocks = MAX_VOLUME_OF_STOCKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public FoodConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoodproductionPackage.Literals.FOOD_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegrationDecorator getSourceDecorator() {
		if (sourceDecorator != null && sourceDecorator.eIsProxy()) {
			InternalEObject oldSourceDecorator = (InternalEObject) sourceDecorator;
			sourceDecorator = (IntegrationDecorator) eResolveProxy(oldSourceDecorator);
			if (sourceDecorator != oldSourceDecorator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							FoodproductionPackage.FOOD_CONSUMER__SOURCE_DECORATOR,
							oldSourceDecorator, sourceDecorator));
			}
		}
		return sourceDecorator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegrationDecorator basicGetSourceDecorator() {
		return sourceDecorator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceDecorator(IntegrationDecorator newSourceDecorator) {
		IntegrationDecorator oldSourceDecorator = sourceDecorator;
		sourceDecorator = newSourceDecorator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FoodproductionPackage.FOOD_CONSUMER__SOURCE_DECORATOR,
					oldSourceDecorator, sourceDecorator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegrationDecorator getTargetDecorator() {
		if (targetDecorator != null && targetDecorator.eIsProxy()) {
			InternalEObject oldTargetDecorator = (InternalEObject) targetDecorator;
			targetDecorator = (IntegrationDecorator) eResolveProxy(oldTargetDecorator);
			if (targetDecorator != oldTargetDecorator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							FoodproductionPackage.FOOD_CONSUMER__TARGET_DECORATOR,
							oldTargetDecorator, targetDecorator));
			}
		}
		return targetDecorator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegrationDecorator basicGetTargetDecorator() {
		return targetDecorator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTargetDecorator(IntegrationDecorator newTargetDecorator) {
		IntegrationDecorator oldTargetDecorator = targetDecorator;
		targetDecorator = newTargetDecorator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FoodproductionPackage.FOOD_CONSUMER__TARGET_DECORATOR,
					oldTargetDecorator, targetDecorator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoubleValueMatrix getStateTransitionsMap() {
		return stateTransitionsMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStateTransitionsMap(
			DoubleValueMatrix newStateTransitionsMap, NotificationChain msgs) {
		DoubleValueMatrix oldStateTransitionsMap = stateTransitionsMap;
		stateTransitionsMap = newStateTransitionsMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP,
					oldStateTransitionsMap, newStateTransitionsMap);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStateTransitionsMap(DoubleValueMatrix newStateTransitionsMap) {
		if (newStateTransitionsMap != stateTransitionsMap) {
			NotificationChain msgs = null;
			if (stateTransitionsMap != null)
				msgs = ((InternalEObject) stateTransitionsMap)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP,
								null, msgs);
			if (newStateTransitionsMap != null)
				msgs = ((InternalEObject) newStateTransitionsMap)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP,
								null, msgs);
			msgs = basicSetStateTransitionsMap(newStateTransitionsMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP,
					newStateTransitionsMap, newStateTransitionsMap));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EAttribute> getSourceAttributes() {
		if (sourceAttributes == null) {
			sourceAttributes = new EObjectResolvingEList<EAttribute>(
					EAttribute.class, this,
					FoodproductionPackage.FOOD_CONSUMER__SOURCE_ATTRIBUTES);
		}
		return sourceAttributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EAttribute> getTargetAttributes() {
		if (targetAttributes == null) {
			targetAttributes = new EObjectResolvingEList<EAttribute>(
					EAttribute.class, this,
					FoodproductionPackage.FOOD_CONSUMER__TARGET_ATTRIBUTES);
		}
		return targetAttributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getConsumptionRate() {
		return consumptionRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConsumptionRate(double newConsumptionRate) {
		double oldConsumptionRate = consumptionRate;
		consumptionRate = newConsumptionRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_RATE,
					oldConsumptionRate, consumptionRate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConsumptionType getConsumptionType() {
		return consumptionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConsumptionType(ConsumptionType newConsumptionType) {
		ConsumptionType oldConsumptionType = consumptionType;
		consumptionType = newConsumptionType == null ? CONSUMPTION_TYPE_EDEFAULT
				: newConsumptionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_TYPE,
					oldConsumptionType, consumptionType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getWasteRate() {
		return wasteRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWasteRate(double newWasteRate) {
		double oldWasteRate = wasteRate;
		wasteRate = newWasteRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FoodproductionPackage.FOOD_CONSUMER__WASTE_RATE,
					oldWasteRate, wasteRate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getMaxVolumeOfStocks() {
		return maxVolumeOfStocks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMaxVolumeOfStocks(double newMaxVolumeOfStocks) {
		double oldMaxVolumeOfStocks = maxVolumeOfStocks;
		maxVolumeOfStocks = newMaxVolumeOfStocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FoodproductionPackage.FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS,
					oldMaxVolumeOfStocks, maxVolumeOfStocks));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP:
			return basicSetStateTransitionsMap(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FoodproductionPackage.FOOD_CONSUMER__SOURCE_DECORATOR:
			if (resolve)
				return getSourceDecorator();
			return basicGetSourceDecorator();
		case FoodproductionPackage.FOOD_CONSUMER__TARGET_DECORATOR:
			if (resolve)
				return getTargetDecorator();
			return basicGetTargetDecorator();
		case FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP:
			return getStateTransitionsMap();
		case FoodproductionPackage.FOOD_CONSUMER__SOURCE_ATTRIBUTES:
			return getSourceAttributes();
		case FoodproductionPackage.FOOD_CONSUMER__TARGET_ATTRIBUTES:
			return getTargetAttributes();
		case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_RATE:
			return getConsumptionRate();
		case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_TYPE:
			return getConsumptionType();
		case FoodproductionPackage.FOOD_CONSUMER__WASTE_RATE:
			return getWasteRate();
		case FoodproductionPackage.FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS:
			return getMaxVolumeOfStocks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FoodproductionPackage.FOOD_CONSUMER__SOURCE_DECORATOR:
			setSourceDecorator((IntegrationDecorator) newValue);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__TARGET_DECORATOR:
			setTargetDecorator((IntegrationDecorator) newValue);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP:
			setStateTransitionsMap((DoubleValueMatrix) newValue);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__SOURCE_ATTRIBUTES:
			getSourceAttributes().clear();
			getSourceAttributes().addAll(
					(Collection<? extends EAttribute>) newValue);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__TARGET_ATTRIBUTES:
			getTargetAttributes().clear();
			getTargetAttributes().addAll(
					(Collection<? extends EAttribute>) newValue);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_RATE:
			setConsumptionRate((Double) newValue);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_TYPE:
			setConsumptionType((ConsumptionType) newValue);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__WASTE_RATE:
			setWasteRate((Double) newValue);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS:
			setMaxVolumeOfStocks((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FoodproductionPackage.FOOD_CONSUMER__SOURCE_DECORATOR:
			setSourceDecorator((IntegrationDecorator) null);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__TARGET_DECORATOR:
			setTargetDecorator((IntegrationDecorator) null);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP:
			setStateTransitionsMap((DoubleValueMatrix) null);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__SOURCE_ATTRIBUTES:
			getSourceAttributes().clear();
			return;
		case FoodproductionPackage.FOOD_CONSUMER__TARGET_ATTRIBUTES:
			getTargetAttributes().clear();
			return;
		case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_RATE:
			setConsumptionRate(CONSUMPTION_RATE_EDEFAULT);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_TYPE:
			setConsumptionType(CONSUMPTION_TYPE_EDEFAULT);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__WASTE_RATE:
			setWasteRate(WASTE_RATE_EDEFAULT);
			return;
		case FoodproductionPackage.FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS:
			setMaxVolumeOfStocks(MAX_VOLUME_OF_STOCKS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FoodproductionPackage.FOOD_CONSUMER__SOURCE_DECORATOR:
			return sourceDecorator != null;
		case FoodproductionPackage.FOOD_CONSUMER__TARGET_DECORATOR:
			return targetDecorator != null;
		case FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP:
			return stateTransitionsMap != null;
		case FoodproductionPackage.FOOD_CONSUMER__SOURCE_ATTRIBUTES:
			return sourceAttributes != null && !sourceAttributes.isEmpty();
		case FoodproductionPackage.FOOD_CONSUMER__TARGET_ATTRIBUTES:
			return targetAttributes != null && !targetAttributes.isEmpty();
		case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_RATE:
			return consumptionRate != CONSUMPTION_RATE_EDEFAULT;
		case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_TYPE:
			return consumptionType != CONSUMPTION_TYPE_EDEFAULT;
		case FoodproductionPackage.FOOD_CONSUMER__WASTE_RATE:
			return wasteRate != WASTE_RATE_EDEFAULT;
		case FoodproductionPackage.FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS:
			return maxVolumeOfStocks != MAX_VOLUME_OF_STOCKS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DiseaseCarryingTransformer.class) {
			switch (derivedFeatureID) {
			case FoodproductionPackage.FOOD_CONSUMER__SOURCE_DECORATOR:
				return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR;
			case FoodproductionPackage.FOOD_CONSUMER__TARGET_DECORATOR:
				return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR;
			case FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP:
				return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP;
			case FoodproductionPackage.FOOD_CONSUMER__SOURCE_ATTRIBUTES:
				return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__SOURCE_ATTRIBUTES;
			case FoodproductionPackage.FOOD_CONSUMER__TARGET_ATTRIBUTES:
				return FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__TARGET_ATTRIBUTES;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DiseaseCarryingTransformer.class) {
			switch (baseFeatureID) {
			case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR:
				return FoodproductionPackage.FOOD_CONSUMER__SOURCE_DECORATOR;
			case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR:
				return FoodproductionPackage.FOOD_CONSUMER__TARGET_DECORATOR;
			case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP:
				return FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP;
			case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__SOURCE_ATTRIBUTES:
				return FoodproductionPackage.FOOD_CONSUMER__SOURCE_ATTRIBUTES;
			case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER__TARGET_ATTRIBUTES:
				return FoodproductionPackage.FOOD_CONSUMER__TARGET_ATTRIBUTES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (consumptionRate: ");
		result.append(consumptionRate);
		result.append(", consumptionType: ");
		result.append(consumptionType);
		result.append(", wasteRate: ");
		result.append(wasteRate);
		result.append(", maxVolumeOfStocks: ");
		result.append(maxVolumeOfStocks);
		result.append(')');
		return result.toString();
	}

	@Override
	public void updateLabels(STEMTime time, long timeDelta, int cycle) {
		String sourcePopulation = this.getSourcePopulationName();
		String targetPopulation = this.getTargetPopulationName();
		StandardPackage populationPackage = StandardPackage.eINSTANCE;
		org.eclipse.stem.diseasemodels.standard.StandardPackage diseasePackage = org.eclipse.stem.diseasemodels.standard.StandardPackage.eINSTANCE;
		GraphPackage graphPackage = GraphPackage.eINSTANCE;

		for (DynamicLabel dl : this.getSourceLabels()) {
			// Get population model labels for source and target
			StandardPopulationModelLabel source = (StandardPopulationModelLabel) dl;
			Node node = source.getNode();
			StandardPopulationModelLabel target = (StandardPopulationModelLabel) node
					.getLabel(
							populationPackage.getStandardPopulationModelLabel(),
							graphPackage.getIntegrationLabel_Identifier(),
							targetPopulation);

			if (target == null) {
				Activator.logError("Cannot find target population label",
						new Exception());
				continue;
			}

			// Get population model label values for source and target
			StandardPopulationModelLabelValue sourceValue = (StandardPopulationModelLabelValue) source
					.getCurrentValue();
			StandardPopulationModelLabelValue targetValue = (StandardPopulationModelLabelValue) target
					.getCurrentValue();

			if (sourceValue.getCount() == 0.0 || targetValue.getCount() == 0.0) {
				continue;
			}

			// Get disease model labels and disease model label values for
			// source and target
			StandardDiseaseModelLabel sourceDisease = (StandardDiseaseModelLabel) node
					.getLabel(diseasePackage.getDiseaseModelLabel(),
							graphPackage.getIntegrationLabel_Identifier(),
							sourcePopulation);
			StandardDiseaseModelLabel targetDisease = (StandardDiseaseModelLabel) node
					.getLabel(diseasePackage.getDiseaseModelLabel(),
							graphPackage.getIntegrationLabel_Identifier(),
							targetPopulation);
			StandardDiseaseModelLabelValue sourceDiseaseValue = (StandardDiseaseModelLabelValue) sourceDisease
					.getCurrentValue();
			StandardDiseaseModelLabelValue targetDiseaseValue = (StandardDiseaseModelLabelValue) targetDisease
					.getCurrentValue();

			// Compute consumption
			double adjustedConsumptionRate = getConsumptionRate()
					* ((double) timeDelta / (double) getTimePeriod());
			double sourceConsumed = 0.0;

			if (consumptionType == ConsumptionType.RELATIVE_CONSUMPTION) {
				sourceConsumed = adjustedConsumptionRate
						* sourceValue.getCount();
			} else if (consumptionType == ConsumptionType.ABSOLUTE_CONSUMPTION) {
				sourceConsumed = adjustedConsumptionRate;
			} else if (consumptionType == ConsumptionType.CONSUMPTION_PER_PERSON) {
				sourceConsumed = adjustedConsumptionRate
						* targetValue.getCount();
			}

			if (sourceConsumed > sourceValue.getCount()) {
				sourceConsumed = sourceValue.getCount();
			}

			if (sourceConsumed > targetValue.getCount()) {
				sourceConsumed = targetValue.getCount();
			}

			// Compute waste
			double adjustedWasteRate = getWasteRate()
					* ((double) timeDelta / (double) getTimePeriod());
			double sourceWasted = adjustedWasteRate * sourceValue.getCount();

			if (sourceWasted > sourceValue.getCount() - sourceConsumed) {
				sourceWasted = sourceValue.getCount() - sourceConsumed;
			}

			if (sourceValue.getCount() - sourceConsumed - sourceWasted > getMaxVolumeOfStocks()) {
				sourceWasted = sourceValue.getCount() - sourceConsumed
						- getMaxVolumeOfStocks();
			}

			// Compute and apply new values for target disease compartments
			double consumedByS = targetDiseaseValue.getS()
					/ targetValue.getCount() * sourceConsumed;
			int row = 0;
			int col = 0;

			for (EAttribute sAttr : getSourceAttributes()) {
				double consumedFraction = (Double) sourceDiseaseValue
						.eGet(sAttr) / sourceValue.getCount() * consumedByS;

				for (EAttribute tAttr : getTargetAttributes()) {
					double moves = getStateTransitionsMap().getValueLists()
							.get(row).getValues().get(col).getValue()
							* consumedFraction;

					targetDiseaseValue.eSet(tAttr,
							(Double) targetDiseaseValue.eGet(tAttr) + moves);
					targetDiseaseValue.setS(targetDiseaseValue.getS() - moves);
					col++;
				}

				col = 0;
				row++;
			}

			// Compute and apply new values for source population and source
			// disease compartments
			double newSourceCount = sourceValue.getCount() - sourceConsumed
					- sourceWasted;
			double factor = newSourceCount / sourceValue.getCount();

			sourceValue.setCount(newSourceCount);
			sourceDiseaseValue.scale(factor);
		}
	}
} // FoodConsumerImpl
