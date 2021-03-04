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
package org.eclipse.stem.evolvingcrossspeciesmodel;

import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evolving Cross Species Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherToOtherTransmissionRate <em>Other To Other Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherRecoveryRate <em>Other Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherToHostTransmissionRate <em>Other To Host Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getTemperatureFactor <em>Temperature Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherPopulationIdentifier <em>Other Population Identifier</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherImmunityLossRate <em>Other Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getIncubationRate <em>Incubation Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModel()
 * @model annotation="http:///org/eclipse/stem/modelgen/model/label *='EvolvingCrossSpeciesModelLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='EvolvingCrossSpeciesModelLabelValue'"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface EvolvingCrossSpeciesModel extends EvolvingSIRDiseaseModel {
	/**
	 * Returns the value of the '<em><b>Other To Other Transmission Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other To Other Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other To Other Transmission Rate</em>' attribute.
	 * @see #setOtherToOtherTransmissionRate(double)
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModel_OtherToOtherTransmissionRate()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Other To Other Transmission Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getOtherToOtherTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherToOtherTransmissionRate <em>Other To Other Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other To Other Transmission Rate</em>' attribute.
	 * @see #getOtherToOtherTransmissionRate()
	 * @generated
	 */
	void setOtherToOtherTransmissionRate(double value);

	/**
	 * Returns the value of the '<em><b>Other Recovery Rate</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Recovery Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Recovery Rate</em>' attribute.
	 * @see #setOtherRecoveryRate(double)
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModel_OtherRecoveryRate()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Other Recovery Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getOtherRecoveryRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherRecoveryRate <em>Other Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Recovery Rate</em>' attribute.
	 * @see #getOtherRecoveryRate()
	 * @generated
	 */
	void setOtherRecoveryRate(double value);

	/**
	 * Returns the value of the '<em><b>Other To Host Transmission Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other To Host Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other To Host Transmission Rate</em>' attribute.
	 * @see #setOtherToHostTransmissionRate(double)
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModel_OtherToHostTransmissionRate()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Other To Host Transmission Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getOtherToHostTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherToHostTransmissionRate <em>Other To Host Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other To Host Transmission Rate</em>' attribute.
	 * @see #getOtherToHostTransmissionRate()
	 * @generated
	 */
	void setOtherToHostTransmissionRate(double value);

	/**
	 * Returns the value of the '<em><b>Temperature Factor</b></em>' attribute.
	 * The default value is <code>"20.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Factor</em>' attribute.
	 * @see #setTemperatureFactor(double)
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModel_TemperatureFactor()
	 * @model default="20.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Temperature Factor'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getTemperatureFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getTemperatureFactor <em>Temperature Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Factor</em>' attribute.
	 * @see #getTemperatureFactor()
	 * @generated
	 */
	void setTemperatureFactor(double value);

	/**
	 * Returns the value of the '<em><b>Other Population Identifier</b></em>' attribute.
	 * The default value is <code>"avian"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Population Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Population Identifier</em>' attribute.
	 * @see #setOtherPopulationIdentifier(String)
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModel_OtherPopulationIdentifier()
	 * @model default="avian"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Other Population Identifier'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	String getOtherPopulationIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherPopulationIdentifier <em>Other Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Population Identifier</em>' attribute.
	 * @see #getOtherPopulationIdentifier()
	 * @generated
	 */
	void setOtherPopulationIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Other Immunity Loss Rate</b></em>' attribute.
	 * The default value is <code>"0.001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Immunity Loss Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Immunity Loss Rate</em>' attribute.
	 * @see #setOtherImmunityLossRate(double)
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModel_OtherImmunityLossRate()
	 * @model default="0.001"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Other Immunity Loss Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getOtherImmunityLossRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherImmunityLossRate <em>Other Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Immunity Loss Rate</em>' attribute.
	 * @see #getOtherImmunityLossRate()
	 * @generated
	 */
	void setOtherImmunityLossRate(double value);

	/**
	 * Returns the value of the '<em><b>Incubation Rate</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incubation Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incubation Rate</em>' attribute.
	 * @see #setIncubationRate(double)
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModel_IncubationRate()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Incubation Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getIncubationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getIncubationRate <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incubation Rate</em>' attribute.
	 * @see #getIncubationRate()
	 * @generated
	 */
	void setIncubationRate(double value);


} // EvolvingCrossSpeciesModel
