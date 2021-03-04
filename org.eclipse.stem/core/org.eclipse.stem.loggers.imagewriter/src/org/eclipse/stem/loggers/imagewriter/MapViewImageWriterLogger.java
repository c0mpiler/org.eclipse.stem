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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map View Image Writer Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger#isOpenMapView <em>Open Map View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getMapViewImageWriterLogger()
 * @model
 * @generated
 */
public interface MapViewImageWriterLogger extends ImageWriterLogger {

	/**
	 * Returns the value of the '<em><b>Open Map View</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Map View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Map View</em>' attribute.
	 * @see #setOpenMapView(boolean)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getMapViewImageWriterLogger_OpenMapView()
	 * @model default="true"
	 * @generated
	 */
	boolean isOpenMapView();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger#isOpenMapView <em>Open Map View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Map View</em>' attribute.
	 * @see #isOpenMapView()
	 * @generated
	 */
	void setOpenMapView(boolean value);
} // MapViewImageWriterLogger
