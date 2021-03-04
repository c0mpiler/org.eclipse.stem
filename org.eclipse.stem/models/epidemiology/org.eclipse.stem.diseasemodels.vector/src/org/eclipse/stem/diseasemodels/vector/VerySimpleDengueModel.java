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
package org.eclipse.stem.diseasemodels.vector;

import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Very Simple Dengue Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getTransmissionRate <em>Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getRecoveryRate <em>Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getImmunityLossRate <em>Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getAdeFactor <em>Ade Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getImmunityStrength <em>Immunity Strength</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getPrimaryDeathRate <em>Primary Death Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getSecondaryDeathRate <em>Secondary Death Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVerySimpleDengueModel()
 * @model annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/label *='SimpleDengueModelHostLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='SimpleDengueModelHostLabelValue'"
 * @generated
 */
public interface VerySimpleDengueModel extends StandardDiseaseModel {
	/**
	 * Returns the value of the '<em><b>Transmission Rate</b></em>' attribute.
	 * The default value is <code>"0.55"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Rate</em>' attribute.
	 * @see #setTransmissionRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVerySimpleDengueModel_TransmissionRate()
	 * @model default="0.55"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getTransmissionRate <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Rate</em>' attribute.
	 * @see #getTransmissionRate()
	 * @generated
	 */
	void setTransmissionRate(double value);

	/**
	 * Returns the value of the '<em><b>Recovery Rate</b></em>' attribute.
	 * The default value is <code>"0.274"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Rate</em>' attribute.
	 * @see #setRecoveryRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVerySimpleDengueModel_RecoveryRate()
	 * @model default="0.274"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getRecoveryRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getRecoveryRate <em>Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Rate</em>' attribute.
	 * @see #getRecoveryRate()
	 * @generated
	 */
	void setRecoveryRate(double value);

	/**
	 * Returns the value of the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * The default value is <code>"0.0055"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immunity Loss Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immunity Loss Rate</em>' attribute.
	 * @see #setImmunityLossRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVerySimpleDengueModel_ImmunityLossRate()
	 * @model default="0.0055"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getImmunityLossRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getImmunityLossRate <em>Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunity Loss Rate</em>' attribute.
	 * @see #getImmunityLossRate()
	 * @generated
	 */
	void setImmunityLossRate(double value);

	/**
	 * Returns the value of the '<em><b>Ade Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ade Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ade Factor</em>' attribute.
	 * @see #setAdeFactor(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVerySimpleDengueModel_AdeFactor()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getAdeFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getAdeFactor <em>Ade Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ade Factor</em>' attribute.
	 * @see #getAdeFactor()
	 * @generated
	 */
	void setAdeFactor(double value);

	/**
	 * Returns the value of the '<em><b>Immunity Strength</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immunity Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immunity Strength</em>' attribute.
	 * @see #setImmunityStrength(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVerySimpleDengueModel_ImmunityStrength()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getImmunityStrength();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getImmunityStrength <em>Immunity Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunity Strength</em>' attribute.
	 * @see #getImmunityStrength()
	 * @generated
	 */
	void setImmunityStrength(double value);

	/**
	 * Returns the value of the '<em><b>Primary Death Rate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Death Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Death Rate</em>' attribute.
	 * @see #setPrimaryDeathRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVerySimpleDengueModel_PrimaryDeathRate()
	 * @model default="0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getPrimaryDeathRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getPrimaryDeathRate <em>Primary Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Death Rate</em>' attribute.
	 * @see #getPrimaryDeathRate()
	 * @generated
	 */
	void setPrimaryDeathRate(double value);

	/**
	 * Returns the value of the '<em><b>Secondary Death Rate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Death Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Death Rate</em>' attribute.
	 * @see #setSecondaryDeathRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVerySimpleDengueModel_SecondaryDeathRate()
	 * @model default="0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getSecondaryDeathRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getSecondaryDeathRate <em>Secondary Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Death Rate</em>' attribute.
	 * @see #getSecondaryDeathRate()
	 * @generated
	 */
	void setSecondaryDeathRate(double value);

} // VerySimpleDengueModel
