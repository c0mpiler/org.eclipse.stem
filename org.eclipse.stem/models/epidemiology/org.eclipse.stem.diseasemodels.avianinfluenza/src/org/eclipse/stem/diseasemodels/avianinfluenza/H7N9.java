package org.eclipse.stem.diseasemodels.avianinfluenza;

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


import org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>H7N9</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianToAvianTransmissionRate <em>Avian To Avian Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianRecoveryRate <em>Avian Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianToHumanTransmissionRate <em>Avian To Human Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanToHumanTransmissionRate <em>Human To Human Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianCharacteristicMixingDistance <em>Avian Characteristic Mixing Distance</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanRecoveryRate <em>Human Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanImmunityLossRate <em>Human Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getTemperatureFactor <em>Temperature Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#getH7N9()
 * @model annotation="http:///org/eclipse/stem/modelgen/model/label *='H7N9Label'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='H7N9LabelValue'"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface H7N9 extends VectorDiseaseModel {
	/**
	 * Returns the value of the '<em><b>Avian To Avian Transmission Rate</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avian To Avian Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avian To Avian Transmission Rate</em>' attribute.
	 * @see #setAvianToAvianTransmissionRate(double)
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#getH7N9_AvianToAvianTransmissionRate()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Avian To Avian Transmission Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getAvianToAvianTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianToAvianTransmissionRate <em>Avian To Avian Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avian To Avian Transmission Rate</em>' attribute.
	 * @see #getAvianToAvianTransmissionRate()
	 * @generated
	 */
	void setAvianToAvianTransmissionRate(double value);

	/**
	 * Returns the value of the '<em><b>Avian Recovery Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avian Recovery Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avian Recovery Rate</em>' attribute.
	 * @see #setAvianRecoveryRate(double)
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#getH7N9_AvianRecoveryRate()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Avian Recovery Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getAvianRecoveryRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianRecoveryRate <em>Avian Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avian Recovery Rate</em>' attribute.
	 * @see #getAvianRecoveryRate()
	 * @generated
	 */
	void setAvianRecoveryRate(double value);

	/**
	 * Returns the value of the '<em><b>Avian To Human Transmission Rate</b></em>' attribute.
	 * The default value is <code>"1.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avian To Human Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avian To Human Transmission Rate</em>' attribute.
	 * @see #setAvianToHumanTransmissionRate(double)
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#getH7N9_AvianToHumanTransmissionRate()
	 * @model default="1.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Avian To Human Transmission Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getAvianToHumanTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianToHumanTransmissionRate <em>Avian To Human Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avian To Human Transmission Rate</em>' attribute.
	 * @see #getAvianToHumanTransmissionRate()
	 * @generated
	 */
	void setAvianToHumanTransmissionRate(double value);

	/**
	 * Returns the value of the '<em><b>Human To Human Transmission Rate</b></em>' attribute.
	 * The default value is <code>"1.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Human To Human Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human To Human Transmission Rate</em>' attribute.
	 * @see #setHumanToHumanTransmissionRate(double)
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#getH7N9_HumanToHumanTransmissionRate()
	 * @model default="1.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Human To Human Transmission Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getHumanToHumanTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanToHumanTransmissionRate <em>Human To Human Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human To Human Transmission Rate</em>' attribute.
	 * @see #getHumanToHumanTransmissionRate()
	 * @generated
	 */
	void setHumanToHumanTransmissionRate(double value);

	/**
	 * Returns the value of the '<em><b>Avian Characteristic Mixing Distance</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avian Characteristic Mixing Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avian Characteristic Mixing Distance</em>' attribute.
	 * @see #setAvianCharacteristicMixingDistance(double)
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#getH7N9_AvianCharacteristicMixingDistance()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Avian Characteristic Mixing Distance'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getAvianCharacteristicMixingDistance();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianCharacteristicMixingDistance <em>Avian Characteristic Mixing Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avian Characteristic Mixing Distance</em>' attribute.
	 * @see #getAvianCharacteristicMixingDistance()
	 * @generated
	 */
	void setAvianCharacteristicMixingDistance(double value);

	/**
	 * Returns the value of the '<em><b>Human Recovery Rate</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Human Recovery Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Recovery Rate</em>' attribute.
	 * @see #setHumanRecoveryRate(double)
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#getH7N9_HumanRecoveryRate()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Human Recovery Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getHumanRecoveryRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanRecoveryRate <em>Human Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Recovery Rate</em>' attribute.
	 * @see #getHumanRecoveryRate()
	 * @generated
	 */
	void setHumanRecoveryRate(double value);

	/**
	 * Returns the value of the '<em><b>Human Immunity Loss Rate</b></em>' attribute.
	 * The default value is <code>"0.001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Human Immunity Loss Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Immunity Loss Rate</em>' attribute.
	 * @see #setHumanImmunityLossRate(double)
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#getH7N9_HumanImmunityLossRate()
	 * @model default="0.001"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Human Immunity Loss Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getHumanImmunityLossRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanImmunityLossRate <em>Human Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Immunity Loss Rate</em>' attribute.
	 * @see #getHumanImmunityLossRate()
	 * @generated
	 */
	void setHumanImmunityLossRate(double value);

	/**
	 * Returns the value of the '<em><b>Temperature Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Factor</em>' attribute.
	 * @see #setTemperatureFactor(double)
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#getH7N9_TemperatureFactor()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Temperature Factor'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getTemperatureFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getTemperatureFactor <em>Temperature Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Factor</em>' attribute.
	 * @see #getTemperatureFactor()
	 * @generated
	 */
	void setTemperatureFactor(double value);


} // H7N9
