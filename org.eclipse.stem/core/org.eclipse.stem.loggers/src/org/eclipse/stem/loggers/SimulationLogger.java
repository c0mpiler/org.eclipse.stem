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

package org.eclipse.stem.loggers;

import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.SimulationEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.SimulationLogger#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.SimulationLogger#getStepMod <em>Step Mod</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.SimulationLogger#getStartStep <em>Start Step</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.loggers.SimulationLoggerPackage#getSimulationLogger()
 * @model abstract="true"
 * @generated
 */
public interface SimulationLogger extends Logger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011 IBM Corporation and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    IBM Corporation - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.stem.loggers.SimulationLoggerPackage#getSimulationLogger_Enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.SimulationLogger#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Step Mod</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Mod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Mod</em>' attribute.
	 * @see #setStepMod(int)
	 * @see org.eclipse.stem.loggers.SimulationLoggerPackage#getSimulationLogger_StepMod()
	 * @model default="1"
	 * @generated
	 */
	int getStepMod();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.SimulationLogger#getStepMod <em>Step Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Mod</em>' attribute.
	 * @see #getStepMod()
	 * @generated
	 */
	void setStepMod(int value);

	/**
	 * Returns the value of the '<em><b>Start Step</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Step</em>' attribute.
	 * @see #setStartStep(long)
	 * @see org.eclipse.stem.loggers.SimulationLoggerPackage#getSimulationLogger_StartStep()
	 * @model default="0"
	 * @generated
	 */
	long getStartStep();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.SimulationLogger#getStartStep <em>Start Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Step</em>' attribute.
	 * @see #getStartStep()
	 * @generated
	 */
	void setStartStep(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventDataType="org.eclipse.stem.loggers.SimulationEvent"
	 * @generated
	 */
	void simulationEvent(SimulationEvent event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model simulationDataType="org.eclipse.stem.loggers.Simulation"
	 * @generated
	 */
	void loggerEvent(ISimulation simulation, LOGGER_EVENTS event);

} // SimulationLogger
