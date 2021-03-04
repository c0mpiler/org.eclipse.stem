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
 * A representation of the model object '<em><b>Origin Dependent Projected Map Image Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger#getOriginLatitude <em>Origin Latitude</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger#getOriginLongitude <em>Origin Longitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getOriginDependentProjectedMapImageLogger()
 * @model abstract="true"
 * @generated
 */
public interface OriginDependentProjectedMapImageLogger extends ProjectedMapImageLogger {
	/**
	 * Returns the value of the '<em><b>Origin Latitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Latitude</em>' attribute.
	 * @see #setOriginLatitude(double)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getOriginDependentProjectedMapImageLogger_OriginLatitude()
	 * @model default="0.0"
	 * @generated
	 */
	double getOriginLatitude();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger#getOriginLatitude <em>Origin Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Latitude</em>' attribute.
	 * @see #getOriginLatitude()
	 * @generated
	 */
	void setOriginLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Origin Longitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Longitude</em>' attribute.
	 * @see #setOriginLongitude(double)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getOriginDependentProjectedMapImageLogger_OriginLongitude()
	 * @model default="0.0"
	 * @generated
	 */
	double getOriginLongitude();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger#getOriginLongitude <em>Origin Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Longitude</em>' attribute.
	 * @see #getOriginLongitude()
	 * @generated
	 */
	void setOriginLongitude(double value);

} // OriginDependentProjectedMapImageLogger
