package org.eclipse.stem.core.trigger.impl;

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
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.CorePlugin;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.DecoratorImpl;
import org.eclipse.stem.core.modifier.Modifier;
import org.eclipse.stem.core.predicate.Predicate;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.core.trigger.Trigger;
import org.eclipse.stem.core.trigger.TriggerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.trigger.impl.TriggerImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eclipse.stem.core.trigger.impl.TriggerImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends DecoratorImpl implements Trigger {
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected Predicate predicate;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Decorator> actions;

	protected List<Decorator> actionCopies;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggerPackage.Literals.TRIGGER;
	}

	
	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#decorateGraph()
	 */
	@Override
	public void decorateGraph(STEMTime time)  throws ScenarioInitializationException{
		// Do we have action?
		if (getActions() != null) {
			// Yes
			// Have we already made a copy of the action?
			if (actionCopies == null || actionCopies.size() < getActions().size()) {
				// No
				actionCopies = new ArrayList<Decorator>();
				for(int i=0;i<getActions().size();++i)  {
					actionCopies.add((Decorator) EcoreUtil.copy(getActions().get(i)));
					getGraph().getDecorators().add(actionCopies.get(i));
				}
			} // if
			for(Decorator d:actionCopies) d.setEnabled(false);
			
		} // if we have an action
		else {
			// No
			CorePlugin.logInformation("No actions specified for trigger \""+this.getDublinCore().getTitle()+ "\"", null);
		}
		// To clear out cache in case some attribute of the predicate has changed
		getPredicate().reset();
		return;
	} // decorateGraph

	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#updateLabels(org.eclipse.stem.core.model.STEMTime,
	 *      long)
	 */
	@Override
	public void updateLabels(STEMTime time, long timerPeriod, int cycle) {
		// Evaluate the predicate and if it returns true, then let the actions
		// decorate the graph.
		if (getPredicate().evaluate(time, timerPeriod,  ((Graph)this.eContainer()))) {

			// Do we have actions?
			if (actionCopies != null) {
				// Yes
				for(Decorator actionCopy:actionCopies) {
					// Yes
					actionCopy.setEnabled(true);
		
					// Has the action decorated the graph yet?
					if (!actionCopy.isGraphDecorated()) {
						// No
						try {
							actionCopy.decorateGraph(time);
						} catch(ScenarioInitializationException sie) {
							Scenario s = (Scenario)this.eContainer();
							Utility.handleException(sie.getErrorMessage(),true, sie);
						}
						actionCopy.setGraphDecorated(true);
					} // if graph not decorated yet
		
					actionCopy.updateLabels(time, timerPeriod, cycle);
				} 
			}
		}// if actions time
		else {
		  // No
			try {
				this.resetLabels();
			} catch(ScenarioInitializationException sie) {
				Utility.handleException(sie.getErrorMessage(), true, sie);
			}
		} // else
	} // updateLabels
	
	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#resetLabels()
	 */
	@Override
	public void resetLabels() throws ScenarioInitializationException {
		if (actionCopies != null) {
			for(Decorator actionCopy:actionCopies) {
				// Yes
				actionCopy.setEnabled(false);
				actionCopy.setGraphDecorated(false);
				// The problem with reseting labels in a Trigger is that it implies
				// some kind of initialization of the labels by the action that in
				// fact should be conditional on the value of the Trigger's
				// predicate.
				// Is the action a Modifier?
				if (actionCopy instanceof Modifier) {
					// Yes
					// It's okay for a Modifier to reset its labels because this
					// restores them to their original values. This works for static
					// labels. A more general Decorator, like an Infector, might do
					// things it should not do unless it is triggered.
					Modifier modifier = (Modifier) actionCopy;
					modifier.resetLabels();
				}
			}
		} // if
		this.getPredicate().reset();
	} // resetLabels

	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#sane()
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();
		
//		retValue = retValue && getPredicate() != null;
//		assert retValue;
		
		//retValue = retValue && getPredicate().sane();
		//assert retValue;
		
		if(getActions() != null)
			for(Decorator d:getActions()) retValue = retValue && d.sane();
		
		assert retValue;
		
		if(actionCopies != null)
			for(Decorator d:actionCopies) retValue = retValue && d.sane();
		assert retValue;
		
		return retValue;
	} // sane

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getPredicate() {
		if (predicate != null && predicate.eIsProxy()) {
			InternalEObject oldPredicate = (InternalEObject)predicate;
			predicate = (Predicate)eResolveProxy(oldPredicate);
			if (predicate != oldPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TriggerPackage.TRIGGER__PREDICATE, oldPredicate, predicate));
			}
		}
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate basicGetPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Predicate newPredicate) {
		Predicate oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggerPackage.TRIGGER__PREDICATE, oldPredicate, predicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decorator> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Decorator>(Decorator.class, this, TriggerPackage.TRIGGER__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TriggerPackage.TRIGGER__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
			case TriggerPackage.TRIGGER__ACTIONS:
				return getActions();
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
			case TriggerPackage.TRIGGER__PREDICATE:
				setPredicate((Predicate)newValue);
				return;
			case TriggerPackage.TRIGGER__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Decorator>)newValue);
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
			case TriggerPackage.TRIGGER__PREDICATE:
				setPredicate((Predicate)null);
				return;
			case TriggerPackage.TRIGGER__ACTIONS:
				getActions().clear();
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
			case TriggerPackage.TRIGGER__PREDICATE:
				return predicate != null;
			case TriggerPackage.TRIGGER__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TriggerImpl
