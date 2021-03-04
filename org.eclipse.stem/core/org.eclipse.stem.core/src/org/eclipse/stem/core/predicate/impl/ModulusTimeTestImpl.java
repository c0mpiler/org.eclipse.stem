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
package org.eclipse.stem.core.predicate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.predicate.ModulusTimeTest;
import org.eclipse.stem.core.predicate.PredicatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modulus Time Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.predicate.impl.ModulusTimeTestImpl#getModulusDays <em>Modulus Days</em>}</li>
 *   <li>{@link org.eclipse.stem.core.predicate.impl.ModulusTimeTestImpl#isReferenceTimeValid <em>Reference Time Valid</em>}</li>
 *   <li>{@link org.eclipse.stem.core.predicate.impl.ModulusTimeTestImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.stem.core.predicate.impl.ModulusTimeTestImpl#getReferenceTime <em>Reference Time</em>}</li>
 *   <li>{@link org.eclipse.stem.core.predicate.impl.ModulusTimeTestImpl#getTriggerTime <em>Trigger Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModulusTimeTestImpl extends TimeTestImpl implements ModulusTimeTest {
	/**
	 * The default value of the '{@link #getModulusDays() <em>Modulus Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulusDays()
	 * @generated
	 * @ordered
	 */
	protected static final int MODULUS_DAYS_EDEFAULT = 365;

	/**
	 * The cached value of the '{@link #getModulusDays() <em>Modulus Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulusDays()
	 * @generated
	 * @ordered
	 */
	protected int modulusDays = MODULUS_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #isReferenceTimeValid() <em>Reference Time Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReferenceTimeValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFERENCE_TIME_VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReferenceTimeValid() <em>Reference Time Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReferenceTimeValid()
	 * @generated
	 * @ordered
	 */
	protected boolean referenceTimeValid = REFERENCE_TIME_VALID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceTime() <em>Reference Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTime()
	 * @generated
	 * @ordered
	 */
	protected STEMTime referenceTime;

	/**
	 * The cached value of the '{@link #getTriggerTime() <em>Trigger Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerTime()
	 * @generated
	 * @ordered
	 */
	protected STEMTime triggerTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulusTimeTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PredicatePackage.Literals.MODULUS_TIME_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getModulusDays() {
		return modulusDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulusDays(int newModulusDays) {
		int oldModulusDays = modulusDays;
		modulusDays = newModulusDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatePackage.MODULUS_TIME_TEST__MODULUS_DAYS, oldModulusDays, modulusDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReferenceTimeValid() {
		return referenceTimeValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceTimeValid(boolean newReferenceTimeValid) {
		boolean oldReferenceTimeValid = referenceTimeValid;
		referenceTimeValid = newReferenceTimeValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME_VALID, oldReferenceTimeValid, referenceTimeValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatePackage.MODULUS_TIME_TEST__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STEMTime getReferenceTime() {
		return referenceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceTime(STEMTime newReferenceTime, NotificationChain msgs) {
		STEMTime oldReferenceTime = referenceTime;
		referenceTime = newReferenceTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME, oldReferenceTime, newReferenceTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceTime(STEMTime newReferenceTime) {
		if (newReferenceTime != referenceTime) {
			NotificationChain msgs = null;
			if (referenceTime != null)
				msgs = ((InternalEObject)referenceTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME, null, msgs);
			if (newReferenceTime != null)
				msgs = ((InternalEObject)newReferenceTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME, null, msgs);
			msgs = basicSetReferenceTime(newReferenceTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME, newReferenceTime, newReferenceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STEMTime getTriggerTime() {
		return triggerTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerTime(STEMTime newTriggerTime, NotificationChain msgs) {
		STEMTime oldTriggerTime = triggerTime;
		triggerTime = newTriggerTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PredicatePackage.MODULUS_TIME_TEST__TRIGGER_TIME, oldTriggerTime, newTriggerTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerTime(STEMTime newTriggerTime) {
		if (newTriggerTime != triggerTime) {
			NotificationChain msgs = null;
			if (triggerTime != null)
				msgs = ((InternalEObject)triggerTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PredicatePackage.MODULUS_TIME_TEST__TRIGGER_TIME, null, msgs);
			if (newTriggerTime != null)
				msgs = ((InternalEObject)newTriggerTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PredicatePackage.MODULUS_TIME_TEST__TRIGGER_TIME, null, msgs);
			msgs = basicSetTriggerTime(newTriggerTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatePackage.MODULUS_TIME_TEST__TRIGGER_TIME, newTriggerTime, newTriggerTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME:
				return basicSetReferenceTime(null, msgs);
			case PredicatePackage.MODULUS_TIME_TEST__TRIGGER_TIME:
				return basicSetTriggerTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PredicatePackage.MODULUS_TIME_TEST__MODULUS_DAYS:
				return getModulusDays();
			case PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME_VALID:
				return isReferenceTimeValid();
			case PredicatePackage.MODULUS_TIME_TEST__DURATION:
				return getDuration();
			case PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME:
				return getReferenceTime();
			case PredicatePackage.MODULUS_TIME_TEST__TRIGGER_TIME:
				return getTriggerTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PredicatePackage.MODULUS_TIME_TEST__MODULUS_DAYS:
				setModulusDays((Integer)newValue);
				return;
			case PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME_VALID:
				setReferenceTimeValid((Boolean)newValue);
				return;
			case PredicatePackage.MODULUS_TIME_TEST__DURATION:
				setDuration((Integer)newValue);
				return;
			case PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME:
				setReferenceTime((STEMTime)newValue);
				return;
			case PredicatePackage.MODULUS_TIME_TEST__TRIGGER_TIME:
				setTriggerTime((STEMTime)newValue);
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
			case PredicatePackage.MODULUS_TIME_TEST__MODULUS_DAYS:
				setModulusDays(MODULUS_DAYS_EDEFAULT);
				return;
			case PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME_VALID:
				setReferenceTimeValid(REFERENCE_TIME_VALID_EDEFAULT);
				return;
			case PredicatePackage.MODULUS_TIME_TEST__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME:
				setReferenceTime((STEMTime)null);
				return;
			case PredicatePackage.MODULUS_TIME_TEST__TRIGGER_TIME:
				setTriggerTime((STEMTime)null);
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
			case PredicatePackage.MODULUS_TIME_TEST__MODULUS_DAYS:
				return modulusDays != MODULUS_DAYS_EDEFAULT;
			case PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME_VALID:
				return referenceTimeValid != REFERENCE_TIME_VALID_EDEFAULT;
			case PredicatePackage.MODULUS_TIME_TEST__DURATION:
				return duration != DURATION_EDEFAULT;
			case PredicatePackage.MODULUS_TIME_TEST__REFERENCE_TIME:
				return referenceTime != null;
			case PredicatePackage.MODULUS_TIME_TEST__TRIGGER_TIME:
				return triggerTime != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @see org.eclipse.stem.core.predicate.impl.PredicateImpl#evaluate(org.eclipse.stem.core.model.STEMTime, long, org.eclipse.stem.core.model.Decorator)
	 */
	@Override
	public boolean evaluate(STEMTime time, long timerPeriod, Graph graph) {
		boolean retValue = false;
		// Is the reference time valid?
		if (isReferenceTimeValid()) {
			
			// Have the test already been triggered? If so, check if we're still within the specified duration
			
			if(getTriggerTime() != null) {
				final long elapsedTimeSinceTriggeredMS = time.getTime().getTime() - getTriggerTime().getTime().getTime();
				int elapsedTimeDays = (int)(elapsedTimeSinceTriggeredMS / STEMTime.Units.DAY.getMilliseconds());
				boolean returnValue = elapsedTimeDays < getDuration();
				if(!returnValue) {
					// Reset so that we'll trigger again next time the modulus operation is satisfied
					setTriggerTime(null);
				}
				return returnValue;
			} else {
				// Yes
				final long elapsedTimeMS = time.getTime().getTime() - getReferenceTime().getTime().getTime();
				
				int elapsedTimeDays = (int)(elapsedTimeMS / STEMTime.Units.DAY.getMilliseconds());
				
				boolean returnValue = (elapsedTimeDays % getModulusDays()) == 0;
				if(returnValue) {
					// Set the trigger data
					STEMTime triggerTime = (STEMTime)EcoreUtil.copy(time);
					setTriggerTime(triggerTime);
				}
				return returnValue;
				
			}
		} // if reference time valid?
		else {
			// No
			// This must be the first time this has been called so this must be
			// the start of the simulation. Remember the time value passed in as
			// the reference value.
			
			STEMTime newTime = (STEMTime)EcoreUtil.copy(time);
			newTime = newTime.addIncrement(-timerPeriod); // Substract one time period
			setReferenceTime(newTime);
			setReferenceTimeValid(true);	
			return evaluate(time, timerPeriod, graph); // elapsed time might be 0, so we need to check
		} // else
		
	} // evaluate
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modulusDays: "); //$NON-NLS-1$
		result.append(modulusDays);
		result.append(", referenceTimeValid: "); //$NON-NLS-1$
		result.append(referenceTimeValid);
		result.append(", duration: "); //$NON-NLS-1$
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ModulusTimeTestImpl
