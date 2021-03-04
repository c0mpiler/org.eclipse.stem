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
package org.eclipse.stem.diseasemodels.poliodiseasemodel;

import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opv Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getSv <em>Sv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getEv <em>Ev</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getV <em>V</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getPv <em>Pv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getPw <em>Pw</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOpvLabelValue()
 * @model
 * @generated
 */
public interface OpvLabelValue extends SEIRLabelValue {
	/**
	 * Returns the value of the '<em><b>Sv</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv</em>' attribute.
	 * @see #setSv(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOpvLabelValue_Sv()
	 * @model default="0.0"
	 * @generated
	 */
	double getSv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getSv <em>Sv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv</em>' attribute.
	 * @see #getSv()
	 * @generated
	 */
	void setSv(double value);

	/**
	 * Returns the value of the '<em><b>Ev</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ev</em>' attribute.
	 * @see #setEv(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOpvLabelValue_Ev()
	 * @model default="0.0"
	 * @generated
	 */
	double getEv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getEv <em>Ev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ev</em>' attribute.
	 * @see #getEv()
	 * @generated
	 */
	void setEv(double value);

	/**
	 * Returns the value of the '<em><b>V</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' attribute.
	 * @see #setV(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOpvLabelValue_V()
	 * @model default="0.0"
	 * @generated
	 */
	double getV();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getV <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' attribute.
	 * @see #getV()
	 * @generated
	 */
	void setV(double value);

	/**
	 * Returns the value of the '<em><b>Pv</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pv</em>' attribute.
	 * @see #setPv(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOpvLabelValue_Pv()
	 * @model default="0.0"
	 * @generated
	 */
	double getPv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getPv <em>Pv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pv</em>' attribute.
	 * @see #getPv()
	 * @generated
	 */
	void setPv(double value);

	/**
	 * Returns the value of the '<em><b>Pw</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pw</em>' attribute.
	 * @see #setPw(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOpvLabelValue_Pw()
	 * @model default="0.0"
	 * @generated
	 */
	double getPw();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getPw <em>Pw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pw</em>' attribute.
	 * @see #getPw()
	 * @generated
	 */
	void setPw(double value);

} // OpvLabelValue
