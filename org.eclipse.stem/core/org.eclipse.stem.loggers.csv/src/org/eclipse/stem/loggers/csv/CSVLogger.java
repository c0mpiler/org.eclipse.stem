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
package org.eclipse.stem.loggers.csv;

import org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.csv.CSVLogger#isUseDefaultLogDirectory <em>Use Default Log Directory</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.CSVLogger#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.CSVLogger#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.CSVLogger#isLogRunParameters <em>Log Run Parameters</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.CSVLogger#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.CSVLogger#isLogInitialState <em>Log Initial State</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.csv.CSVLogger#isLogHtmlSummary <em>Log Html Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.loggers.csv.CSVPackage#getCSVLogger()
 * @model
 * @generated
 */
public interface CSVLogger extends SynchronousDecoratorPropertyLogger {
	/**
	 * Returns the value of the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Default Log Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Default Log Directory</em>' attribute.
	 * @see #setUseDefaultLogDirectory(boolean)
	 * @see org.eclipse.stem.loggers.csv.CSVPackage#getCSVLogger_UseDefaultLogDirectory()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseDefaultLogDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.csv.CSVLogger#isUseDefaultLogDirectory <em>Use Default Log Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Default Log Directory</em>' attribute.
	 * @see #isUseDefaultLogDirectory()
	 * @generated
	 */
	void setUseDefaultLogDirectory(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' attribute.
	 * @see #setDataPath(String)
	 * @see org.eclipse.stem.loggers.csv.CSVPackage#getCSVLogger_DataPath()
	 * @model
	 * @generated
	 */
	String getDataPath();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.csv.CSVLogger#getDataPath <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' attribute.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(String value);

	/**
	 * Returns the value of the '<em><b>Delimeter</b></em>' attribute.
	 * The default value is <code>","</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimeter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimeter</em>' attribute.
	 * @see #setDelimeter(String)
	 * @see org.eclipse.stem.loggers.csv.CSVPackage#getCSVLogger_Delimeter()
	 * @model default=","
	 * @generated
	 */
	String getDelimeter();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.csv.CSVLogger#getDelimeter <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimeter</em>' attribute.
	 * @see #getDelimeter()
	 * @generated
	 */
	void setDelimeter(String value);

	/**
	 * Returns the value of the '<em><b>Log Run Parameters</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Run Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Run Parameters</em>' attribute.
	 * @see #setLogRunParameters(boolean)
	 * @see org.eclipse.stem.loggers.csv.CSVPackage#getCSVLogger_LogRunParameters()
	 * @model default="true"
	 * @generated
	 */
	boolean isLogRunParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.csv.CSVLogger#isLogRunParameters <em>Log Run Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Run Parameters</em>' attribute.
	 * @see #isLogRunParameters()
	 * @generated
	 */
	void setLogRunParameters(boolean value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * The default value is <code>"1024"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(int)
	 * @see org.eclipse.stem.loggers.csv.CSVPackage#getCSVLogger_BufferSize()
	 * @model default="1024"
	 * @generated
	 */
	int getBufferSize();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.csv.CSVLogger#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Log Initial State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Initial State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Initial State</em>' attribute.
	 * @see #setLogInitialState(boolean)
	 * @see org.eclipse.stem.loggers.csv.CSVPackage#getCSVLogger_LogInitialState()
	 * @model default="false"
	 * @generated
	 */
	boolean isLogInitialState();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.csv.CSVLogger#isLogInitialState <em>Log Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Initial State</em>' attribute.
	 * @see #isLogInitialState()
	 * @generated
	 */
	void setLogInitialState(boolean value);

	/**
	 * Returns the value of the '<em><b>Log Html Summary</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Html Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Html Summary</em>' attribute.
	 * @see #setLogHtmlSummary(boolean)
	 * @see org.eclipse.stem.loggers.csv.CSVPackage#getCSVLogger_LogHtmlSummary()
	 * @model default="true"
	 * @generated
	 */
	boolean isLogHtmlSummary();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.csv.CSVLogger#isLogHtmlSummary <em>Log Html Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Html Summary</em>' attribute.
	 * @see #isLogHtmlSummary()
	 * @generated
	 */
	void setLogHtmlSummary(boolean value);

} // CSVLogger
