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
package org.eclipse.stem.loggers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.logger.impl.LoggerImpl;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.loggers.LOGGER_EVENTS;
import org.eclipse.stem.loggers.SimulationLogger;
import org.eclipse.stem.loggers.SimulationLoggerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.impl.SimulationLoggerImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.impl.SimulationLoggerImpl#getStepMod <em>Step Mod</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.impl.SimulationLoggerImpl#getStartStep <em>Start Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimulationLoggerImpl extends LoggerImpl implements SimulationLogger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 IBM Corporation and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    IBM Corporation - initial API and implementation";

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepMod() <em>Step Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepMod()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_MOD_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getStepMod() <em>Step Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepMod()
	 * @generated
	 * @ordered
	 */
	protected int stepMod = STEP_MOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartStep() <em>Start Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStep()
	 * @generated
	 * @ordered
	 */
	protected static final long START_STEP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartStep() <em>Start Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStep()
	 * @generated
	 * @ordered
	 */
	protected long startStep = START_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationLoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationLoggerPackage.Literals.SIMULATION_LOGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationLoggerPackage.SIMULATION_LOGGER__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepMod() {
		return stepMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepMod(int newStepMod) {
		int oldStepMod = stepMod;
		stepMod = newStepMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationLoggerPackage.SIMULATION_LOGGER__STEP_MOD, oldStepMod, stepMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartStep() {
		return startStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartStep(long newStartStep) {
		long oldStartStep = startStep;
		startStep = newStartStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationLoggerPackage.SIMULATION_LOGGER__START_STEP, oldStartStep, startStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void simulationEvent(SimulationEvent event) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loggerEvent(ISimulation simulation, LOGGER_EVENTS event) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public void simulationEvent(SimulationEvent event) {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public void loggerEvent(ISimulation simulation, LOGGER_EVENTS event) {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulationLoggerPackage.SIMULATION_LOGGER__ENABLED:
				return isEnabled();
			case SimulationLoggerPackage.SIMULATION_LOGGER__STEP_MOD:
				return getStepMod();
			case SimulationLoggerPackage.SIMULATION_LOGGER__START_STEP:
				return getStartStep();
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
			case SimulationLoggerPackage.SIMULATION_LOGGER__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case SimulationLoggerPackage.SIMULATION_LOGGER__STEP_MOD:
				setStepMod((Integer)newValue);
				return;
			case SimulationLoggerPackage.SIMULATION_LOGGER__START_STEP:
				setStartStep((Long)newValue);
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
			case SimulationLoggerPackage.SIMULATION_LOGGER__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case SimulationLoggerPackage.SIMULATION_LOGGER__STEP_MOD:
				setStepMod(STEP_MOD_EDEFAULT);
				return;
			case SimulationLoggerPackage.SIMULATION_LOGGER__START_STEP:
				setStartStep(START_STEP_EDEFAULT);
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
			case SimulationLoggerPackage.SIMULATION_LOGGER__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case SimulationLoggerPackage.SIMULATION_LOGGER__STEP_MOD:
				return stepMod != STEP_MOD_EDEFAULT;
			case SimulationLoggerPackage.SIMULATION_LOGGER__START_STEP:
				return startStep != START_STEP_EDEFAULT;
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", stepMod: ");
		result.append(stepMod);
		result.append(", startStep: ");
		result.append(startStep);
		result.append(')');
		return result.toString();
	}

} //SimulationLoggerImpl
