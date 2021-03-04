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

package org.eclipse.stem.core.trigger.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.DecoratorImpl;
import org.eclipse.stem.core.modifier.Modifier;
import org.eclipse.stem.core.predicate.Predicate;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.core.trigger.TriggerList;
import org.eclipse.stem.core.trigger.TriggerPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.trigger.impl.TriggerListImpl#getPredicateList <em>Predicate List</em>}</li>
 *   <li>{@link org.eclipse.stem.core.trigger.impl.TriggerListImpl#getActionList <em>Action List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerListImpl extends DecoratorImpl implements TriggerList {

	private List<Decorator> actionListCopy;

	/**
	 * The cached value of the '{@link #getPredicateList() <em>Predicate List</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getPredicateList()
	 * @generated
	 * @ordered
	 */
	protected EList<Predicate> predicateList;

	/**
	 * The cached value of the '{@link #getActionList() <em>Action List</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActionList()
	 * @generated
	 * @ordered
	 */
	protected EList<Decorator> actionList;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggerPackage.Literals.TRIGGER_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Predicate> getPredicateList() {
		if (predicateList == null) {
			predicateList = new EObjectContainmentEList<Predicate>(Predicate.class, this, TriggerPackage.TRIGGER_LIST__PREDICATE_LIST);
		}
		return predicateList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decorator> getActionList() {
		if (actionList == null) {
			actionList = new EObjectContainmentEList<Decorator>(Decorator.class, this, TriggerPackage.TRIGGER_LIST__ACTION_LIST);
		}
		return actionList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TriggerPackage.TRIGGER_LIST__PREDICATE_LIST:
				return ((InternalEList<?>)getPredicateList()).basicRemove(otherEnd, msgs);
			case TriggerPackage.TRIGGER_LIST__ACTION_LIST:
				return ((InternalEList<?>)getActionList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TriggerPackage.TRIGGER_LIST__PREDICATE_LIST:
				return getPredicateList();
			case TriggerPackage.TRIGGER_LIST__ACTION_LIST:
				return getActionList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TriggerPackage.TRIGGER_LIST__PREDICATE_LIST:
				getPredicateList().clear();
				getPredicateList().addAll((Collection<? extends Predicate>)newValue);
				return;
			case TriggerPackage.TRIGGER_LIST__ACTION_LIST:
				getActionList().clear();
				getActionList().addAll((Collection<? extends Decorator>)newValue);
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
			case TriggerPackage.TRIGGER_LIST__PREDICATE_LIST:
				getPredicateList().clear();
				return;
			case TriggerPackage.TRIGGER_LIST__ACTION_LIST:
				getActionList().clear();
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
			case TriggerPackage.TRIGGER_LIST__PREDICATE_LIST:
				return predicateList != null && !predicateList.isEmpty();
			case TriggerPackage.TRIGGER_LIST__ACTION_LIST:
				return actionList != null && !actionList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void decorateGraph(STEMTime time)
			throws ScenarioInitializationException {
		actionListCopy = new ArrayList<Decorator>();

		for (Decorator action : getActionList()) {
			Decorator copy = (Decorator) EcoreUtil.copy(action);

			actionListCopy.add(copy);
			getGraph().getDecorators().add(copy);
		}

		for (Decorator action : actionListCopy) {
			action.setEnabled(false);
		}

		for (Predicate predicate : getPredicateList()) {
			predicate.reset();
		}
	}

	@Override
	public void updateLabels(STEMTime time, long timerPeriod, int cycle) {
		try {
			this.resetLabels();
		} catch (ScenarioInitializationException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < predicateList.size(); i++) {
			Predicate predicate = getPredicateList().get(i);
			
			if (predicate.evaluate(time, timerPeriod,
					((Graph) this.eContainer()))) {
				Decorator action = actionListCopy.get(i);
				
				action.setEnabled(true);

				if (!action.isGraphDecorated()) {
					try {
						action.decorateGraph(time);
					} catch (ScenarioInitializationException sie) {
						Scenario s = (Scenario) this.eContainer();
						Utility.handleException(sie.getErrorMessage(), true,
								sie);
					}

					action.setGraphDecorated(true);
				}

				action.updateLabels(time, timerPeriod, cycle);
			}
		}
	}

	@Override
	public void resetLabels() throws ScenarioInitializationException {
		for (Decorator action : actionListCopy) { //
			action.setEnabled(false);
			action.setGraphDecorated(false);

			if (action instanceof Modifier) {
				((Modifier) action).resetLabels();
			}
		}

		for (Predicate predicate : getPredicateList()) {
			predicate.reset();
		}
	}

} // TriggerListImpl
