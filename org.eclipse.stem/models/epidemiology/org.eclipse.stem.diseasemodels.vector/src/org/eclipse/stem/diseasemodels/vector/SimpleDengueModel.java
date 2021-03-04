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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Dengue Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostTransmissionRate <em>Host Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getAdeFactor <em>Ade Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostImmunityLossRate <em>Host Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostPrimaryDeathRate <em>Host Primary Death Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostRecoveryRate <em>Host Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostSecondaryDeathRate <em>Host Secondary Death Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getVectorIncubationRate <em>Vector Incubation Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getVectorTransmissionRate <em>Vector Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getImmunityStrength <em>Immunity Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel()
 * @model annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/label *='SimpleDengueModelHostLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='SimpleDengueModelHostLabelValue'"
 * @generated
 */
public interface SimpleDengueModel extends AbstractDengueModel {
	/**
	 * Returns the value of the '<em><b>Host Transmission Rate</b></em>' attribute.
	 * The default value is <code>"0.041"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Transmission Rate</em>' attribute.
	 * @see #setHostTransmissionRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel_HostTransmissionRate()
	 * @model default="0.041"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostTransmissionRate <em>Host Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Transmission Rate</em>' attribute.
	 * @see #getHostTransmissionRate()
	 * @generated
	 */
	void setHostTransmissionRate(double value);

	/**
	 * Returns the value of the '<em><b>Ade Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ade Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ade Factor</em>' attribute.
	 * @see #setAdeFactor(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel_AdeFactor()
	 * @model default="1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getAdeFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getAdeFactor <em>Ade Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ade Factor</em>' attribute.
	 * @see #getAdeFactor()
	 * @generated
	 */
	void setAdeFactor(double value);

	/**
	 * Returns the value of the '<em><b>Host Immunity Loss Rate</b></em>' attribute.
	 * The default value is <code>"0.005479"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Immunity Loss Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Immunity Loss Rate</em>' attribute.
	 * @see #setHostImmunityLossRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel_HostImmunityLossRate()
	 * @model default="0.005479"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostImmunityLossRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostImmunityLossRate <em>Host Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Immunity Loss Rate</em>' attribute.
	 * @see #getHostImmunityLossRate()
	 * @generated
	 */
	void setHostImmunityLossRate(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Death Rate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Death Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Death Rate</em>' attribute.
	 * @see #setHostPrimaryDeathRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel_HostPrimaryDeathRate()
	 * @model default="0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryDeathRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostPrimaryDeathRate <em>Host Primary Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Death Rate</em>' attribute.
	 * @see #getHostPrimaryDeathRate()
	 * @generated
	 */
	void setHostPrimaryDeathRate(double value);

	/**
	 * Returns the value of the '<em><b>Host Recovery Rate</b></em>' attribute.
	 * The default value is <code>"0.247"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Recovery Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Recovery Rate</em>' attribute.
	 * @see #setHostRecoveryRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel_HostRecoveryRate()
	 * @model default="0.247"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostRecoveryRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostRecoveryRate <em>Host Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Recovery Rate</em>' attribute.
	 * @see #getHostRecoveryRate()
	 * @generated
	 */
	void setHostRecoveryRate(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Death Rate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Death Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Death Rate</em>' attribute.
	 * @see #setHostSecondaryDeathRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel_HostSecondaryDeathRate()
	 * @model default="0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDeathRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostSecondaryDeathRate <em>Host Secondary Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Death Rate</em>' attribute.
	 * @see #getHostSecondaryDeathRate()
	 * @generated
	 */
	void setHostSecondaryDeathRate(double value);

	/**
	 * Returns the value of the '<em><b>Vector Incubation Rate</b></em>' attribute.
	 * The default value is <code>"0.082"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Incubation Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Incubation Rate</em>' attribute.
	 * @see #setVectorIncubationRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel_VectorIncubationRate()
	 * @model default="0.082"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorIncubationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getVectorIncubationRate <em>Vector Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Incubation Rate</em>' attribute.
	 * @see #getVectorIncubationRate()
	 * @generated
	 */
	void setVectorIncubationRate(double value);

	/**
	 * Returns the value of the '<em><b>Vector Transmission Rate</b></em>' attribute.
	 * The default value is <code>"1.45"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Transmission Rate</em>' attribute.
	 * @see #setVectorTransmissionRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel_VectorTransmissionRate()
	 * @model default="1.45"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getVectorTransmissionRate <em>Vector Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Transmission Rate</em>' attribute.
	 * @see #getVectorTransmissionRate()
	 * @generated
	 */
	void setVectorTransmissionRate(double value);

	/**
	 * Returns the value of the '<em><b>Immunity Strength</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immunity Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immunity Strength</em>' attribute.
	 * @see #setImmunityStrength(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getSimpleDengueModel_ImmunityStrength()
	 * @model default="0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getImmunityStrength();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getImmunityStrength <em>Immunity Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunity Strength</em>' attribute.
	 * @see #getImmunityStrength()
	 * @generated
	 */
	void setImmunityStrength(double value);

} // SimpleDengueModel
