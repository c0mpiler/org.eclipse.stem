/******************************************************************************
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
package org.eclipse.stem.loggers.csv.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.loggers.LOGGER_EVENTS;
import org.eclipse.stem.loggers.csv.CSVLogger;
import org.eclipse.stem.loggers.csv.CSVPackage;
import org.eclipse.stem.loggers.csv.logger.DelimetedFileSimulationLogger;
import org.eclipse.stem.loggers.impl.SynchronousDecoratorPropertyLoggerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl#isUseDefaultLogDirectory <em>Use Default Log Directory</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl#isLogRunParameters <em>Log Run Parameters</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl#isLogInitialState <em>Log Initial State</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.impl.CSVLoggerImpl#isLogHtmlSummary <em>Log Html Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSVLoggerImpl extends SynchronousDecoratorPropertyLoggerImpl implements CSVLogger {
	/**
	 * The default value of the '{@link #isUseDefaultLogDirectory() <em>Use Default Log Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDefaultLogDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_DEFAULT_LOG_DIRECTORY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseDefaultLogDirectory() <em>Use Default Log Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDefaultLogDirectory()
	 * @generated
	 * @ordered
	 */
	protected boolean useDefaultLogDirectory = USE_DEFAULT_LOG_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected String dataPath = DATA_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelimeter() <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimeter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMETER_EDEFAULT = ","; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDelimeter() <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimeter()
	 * @generated
	 * @ordered
	 */
	protected String delimeter = DELIMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogRunParameters() <em>Log Run Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogRunParameters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_RUN_PARAMETERS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLogRunParameters() <em>Log Run Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogRunParameters()
	 * @generated
	 * @ordered
	 */
	protected boolean logRunParameters = LOG_RUN_PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BUFFER_SIZE_EDEFAULT = 1024;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogInitialState() <em>Log Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_INITIAL_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogInitialState() <em>Log Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogInitialState()
	 * @generated
	 * @ordered
	 */
	protected boolean logInitialState = LOG_INITIAL_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogHtmlSummary() <em>Log Html Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogHtmlSummary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_HTML_SUMMARY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLogHtmlSummary() <em>Log Html Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogHtmlSummary()
	 * @generated
	 * @ordered
	 */
	protected boolean logHtmlSummary = LOG_HTML_SUMMARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSVLoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSVPackage.Literals.CSV_LOGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseDefaultLogDirectory() {
		return useDefaultLogDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDefaultLogDirectory(boolean newUseDefaultLogDirectory) {
		boolean oldUseDefaultLogDirectory = useDefaultLogDirectory;
		useDefaultLogDirectory = newUseDefaultLogDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY, oldUseDefaultLogDirectory, useDefaultLogDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataPath() {
		return dataPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPath(String newDataPath) {
		String oldDataPath = dataPath;
		dataPath = newDataPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.CSV_LOGGER__DATA_PATH, oldDataPath, dataPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelimeter() {
		return delimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimeter(String newDelimeter) {
		String oldDelimeter = delimeter;
		delimeter = newDelimeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.CSV_LOGGER__DELIMETER, oldDelimeter, delimeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogRunParameters() {
		return logRunParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogRunParameters(boolean newLogRunParameters) {
		boolean oldLogRunParameters = logRunParameters;
		logRunParameters = newLogRunParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.CSV_LOGGER__LOG_RUN_PARAMETERS, oldLogRunParameters, logRunParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(int newBufferSize) {
		int oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.CSV_LOGGER__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogInitialState() {
		return logInitialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogInitialState(boolean newLogInitialState) {
		boolean oldLogInitialState = logInitialState;
		logInitialState = newLogInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.CSV_LOGGER__LOG_INITIAL_STATE, oldLogInitialState, logInitialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogHtmlSummary() {
		return logHtmlSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogHtmlSummary(boolean newLogHtmlSummary) {
		boolean oldLogHtmlSummary = logHtmlSummary;
		logHtmlSummary = newLogHtmlSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.CSV_LOGGER__LOG_HTML_SUMMARY, oldLogHtmlSummary, logHtmlSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSVPackage.CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				return isUseDefaultLogDirectory();
			case CSVPackage.CSV_LOGGER__DATA_PATH:
				return getDataPath();
			case CSVPackage.CSV_LOGGER__DELIMETER:
				return getDelimeter();
			case CSVPackage.CSV_LOGGER__LOG_RUN_PARAMETERS:
				return isLogRunParameters();
			case CSVPackage.CSV_LOGGER__BUFFER_SIZE:
				return getBufferSize();
			case CSVPackage.CSV_LOGGER__LOG_INITIAL_STATE:
				return isLogInitialState();
			case CSVPackage.CSV_LOGGER__LOG_HTML_SUMMARY:
				return isLogHtmlSummary();
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
			case CSVPackage.CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				setUseDefaultLogDirectory((Boolean)newValue);
				return;
			case CSVPackage.CSV_LOGGER__DATA_PATH:
				setDataPath((String)newValue);
				return;
			case CSVPackage.CSV_LOGGER__DELIMETER:
				setDelimeter((String)newValue);
				return;
			case CSVPackage.CSV_LOGGER__LOG_RUN_PARAMETERS:
				setLogRunParameters((Boolean)newValue);
				return;
			case CSVPackage.CSV_LOGGER__BUFFER_SIZE:
				setBufferSize((Integer)newValue);
				return;
			case CSVPackage.CSV_LOGGER__LOG_INITIAL_STATE:
				setLogInitialState((Boolean)newValue);
				return;
			case CSVPackage.CSV_LOGGER__LOG_HTML_SUMMARY:
				setLogHtmlSummary((Boolean)newValue);
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
			case CSVPackage.CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				setUseDefaultLogDirectory(USE_DEFAULT_LOG_DIRECTORY_EDEFAULT);
				return;
			case CSVPackage.CSV_LOGGER__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
				return;
			case CSVPackage.CSV_LOGGER__DELIMETER:
				setDelimeter(DELIMETER_EDEFAULT);
				return;
			case CSVPackage.CSV_LOGGER__LOG_RUN_PARAMETERS:
				setLogRunParameters(LOG_RUN_PARAMETERS_EDEFAULT);
				return;
			case CSVPackage.CSV_LOGGER__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case CSVPackage.CSV_LOGGER__LOG_INITIAL_STATE:
				setLogInitialState(LOG_INITIAL_STATE_EDEFAULT);
				return;
			case CSVPackage.CSV_LOGGER__LOG_HTML_SUMMARY:
				setLogHtmlSummary(LOG_HTML_SUMMARY_EDEFAULT);
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
			case CSVPackage.CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				return useDefaultLogDirectory != USE_DEFAULT_LOG_DIRECTORY_EDEFAULT;
			case CSVPackage.CSV_LOGGER__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
			case CSVPackage.CSV_LOGGER__DELIMETER:
				return DELIMETER_EDEFAULT == null ? delimeter != null : !DELIMETER_EDEFAULT.equals(delimeter);
			case CSVPackage.CSV_LOGGER__LOG_RUN_PARAMETERS:
				return logRunParameters != LOG_RUN_PARAMETERS_EDEFAULT;
			case CSVPackage.CSV_LOGGER__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case CSVPackage.CSV_LOGGER__LOG_INITIAL_STATE:
				return logInitialState != LOG_INITIAL_STATE_EDEFAULT;
			case CSVPackage.CSV_LOGGER__LOG_HTML_SUMMARY:
				return logHtmlSummary != LOG_HTML_SUMMARY_EDEFAULT;
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
		result.append(" (useDefaultLogDirectory: ");
		result.append(useDefaultLogDirectory);
		result.append(", dataPath: ");
		result.append(dataPath);
		result.append(", delimeter: ");
		result.append(delimeter);
		result.append(", logRunParameters: ");
		result.append(logRunParameters);
		result.append(", bufferSize: ");
		result.append(bufferSize);
		result.append(", logInitialState: ");
		result.append(logInitialState);
		result.append(", logHtmlSummary: ");
		result.append(logHtmlSummary);
		result.append(')');
		return result.toString();
	}

	
	private DelimetedFileSimulationLogger logger;
	

	/* (non-Javadoc)
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerImpl#simulationEvent(org.eclipse.stem.jobs.simulation.SimulationEvent)
	 * @generated NOT
	 */
	public void simulationEvent(SimulationEvent event) 
	{
		if (logger != null) {
			logger.log(event);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerImpl#loggerEvent(org.eclipse.stem.jobs.simulation.ISimulation, org.eclipse.stem.loggers.LOGGER_EVENTS)
	 * @generated NOT
	 */
	public void loggerEvent(ISimulation simulation, LOGGER_EVENTS event) 
	{
		if (event.equals(LOGGER_EVENTS.LOGGER_STARTED)) {
			logger = new DelimetedFileSimulationLogger(this, simulation);
			logger.start();
		} else if (event.equals(LOGGER_EVENTS.LOGGER_STOPPED)) {
			logger.stop();
			logger = null;
		}
	}

} //CSVLoggerImpl
