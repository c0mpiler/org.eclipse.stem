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
package org.eclipse.stem.loggers.imagewriter;

import org.eclipse.stem.loggers.SynchronousLogger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Writer Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ImageWriterLogger#isUseDefaultLogDirectory <em>Use Default Log Directory</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ImageWriterLogger#getDataPath <em>Data Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getImageWriterLogger()
 * @model abstract="true"
 * @generated
 */
public interface ImageWriterLogger extends SynchronousLogger {
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
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getImageWriterLogger_UseDefaultLogDirectory()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseDefaultLogDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ImageWriterLogger#isUseDefaultLogDirectory <em>Use Default Log Directory</em>}' attribute.
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
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getImageWriterLogger_DataPath()
	 * @model
	 * @generated
	 */
	String getDataPath();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ImageWriterLogger#getDataPath <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' attribute.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(String value);

} // ImageWriterLogger
