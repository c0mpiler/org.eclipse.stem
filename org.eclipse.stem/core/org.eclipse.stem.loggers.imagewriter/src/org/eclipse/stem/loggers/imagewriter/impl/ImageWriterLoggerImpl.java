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
package org.eclipse.stem.loggers.imagewriter.impl;

import java.io.File;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.loggers.common.Constants;
import org.eclipse.stem.loggers.common.FileUtils;
import org.eclipse.stem.loggers.imagewriter.ImageWriterLogger;
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.impl.SimulationLoggerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Writer Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ImageWriterLoggerImpl#isUseDefaultLogDirectory <em>Use Default Log Directory</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ImageWriterLoggerImpl#getDataPath <em>Data Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ImageWriterLoggerImpl extends SimulationLoggerImpl implements ImageWriterLogger {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ImageWriterLoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagewriterPackage.Literals.IMAGE_WRITER_LOGGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY, oldUseDefaultLogDirectory, useDefaultLogDirectory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.IMAGE_WRITER_LOGGER__DATA_PATH, oldDataPath, dataPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImagewriterPackage.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				return isUseDefaultLogDirectory();
			case ImagewriterPackage.IMAGE_WRITER_LOGGER__DATA_PATH:
				return getDataPath();
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
			case ImagewriterPackage.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				setUseDefaultLogDirectory((Boolean)newValue);
				return;
			case ImagewriterPackage.IMAGE_WRITER_LOGGER__DATA_PATH:
				setDataPath((String)newValue);
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
			case ImagewriterPackage.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				setUseDefaultLogDirectory(USE_DEFAULT_LOG_DIRECTORY_EDEFAULT);
				return;
			case ImagewriterPackage.IMAGE_WRITER_LOGGER__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
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
			case ImagewriterPackage.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				return useDefaultLogDirectory != USE_DEFAULT_LOG_DIRECTORY_EDEFAULT;
			case ImagewriterPackage.IMAGE_WRITER_LOGGER__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
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
		result.append(" (useDefaultLogDirectory: "); //$NON-NLS-1$
		result.append(useDefaultLogDirectory);
		result.append(", dataPath: "); //$NON-NLS-1$
		result.append(dataPath);
		result.append(')');
		return result.toString();
	}

	
	/**
	 * @param simulation
	 * @return
	 * @generated NOT
	 */
	protected File getLogFileDirectory(ISimulation simulation)
	{
			
		StringBuilder directory = new StringBuilder();
		
		if (isUseDefaultLogDirectory() || Constants.EMPTY_STRING.equals(getDataPath())) {
			directory.append(FileUtils.getRootLoggingFolderForScenario(simulation.getScenario().getURI().toString()));
		} else {
			directory.append(getDataPath());
		}
		
		directory.append(Constants.SYSTEM_PATH_SEPARATOR);
		directory.append(simulation.getUniqueIDString());
		directory.append(Constants.SYSTEM_PATH_SEPARATOR);

		return new File(directory.toString());
	}
} //ImageWriterLoggerImpl
