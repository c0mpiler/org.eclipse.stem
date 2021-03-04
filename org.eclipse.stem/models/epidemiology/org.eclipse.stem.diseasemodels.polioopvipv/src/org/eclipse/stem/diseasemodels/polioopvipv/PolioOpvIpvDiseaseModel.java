/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv;

import org.eclipse.stem.diseasemodels.standard.SEIR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getOpvEfficacy <em>Opv Efficacy</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getReversionRateOPV <em>Reversion Rate OPV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getBirthDeathRateDeveloping <em>Birth Death Rate Developing</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getTransmissionRateOPV <em>Transmission Rate OPV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getTransmissionRateWild <em>Transmission Rate Wild</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRelativeSusceptibilityRecentOPV <em>Relative Susceptibility Recent OPV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRelativeSusceptibilityIPV <em>Relative Susceptibility IPV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getIncubationRateVaccine <em>Incubation Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getIncubationRateWild <em>Incubation Rate Wild</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRecoveryRateVaccine <em>Recovery Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRecoveryRateWild <em>Recovery Rate Wild</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getParalyticIncidenceFromVaccine <em>Paralytic Incidence From Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getParalyticCaseProportion <em>Paralytic Case Proportion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel()
 * @model annotation="org.eclipse.stem.model.label *='PolioOpvIpvLabel'"
 *        annotation="org.eclipse.stem.model.labelvalue *='PolioOpvIpvLabelValue'"
 *        annotation="org.eclipse.stem.model.generated version='1.0'"
 * @generated
 */
public interface PolioOpvIpvDiseaseModel extends SEIR {
	/**
	 * Returns the value of the '<em><b>Opv Efficacy</b></em>' attribute.
	 * The default value is <code>"0.9"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opv Efficacy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opv Efficacy</em>' attribute.
	 * @see #setOpvEfficacy(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_OpvEfficacy()
	 * @model default="0.9"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Efficacy of live-attenuated vaccine (a)'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getOpvEfficacy();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getOpvEfficacy <em>Opv Efficacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opv Efficacy</em>' attribute.
	 * @see #getOpvEfficacy()
	 * @generated
	 */
	void setOpvEfficacy(double value);

	/**
	 * Returns the value of the '<em><b>Reversion Rate OPV</b></em>' attribute.
	 * The default value is <code>"10e-4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reversion Rate OPV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reversion Rate OPV</em>' attribute.
	 * @see #setReversionRateOPV(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_ReversionRateOPV()
	 * @model default="10e-4"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='OPV Reversion Rate (\u03c6)'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getReversionRateOPV();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getReversionRateOPV <em>Reversion Rate OPV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reversion Rate OPV</em>' attribute.
	 * @see #getReversionRateOPV()
	 * @generated
	 */
	void setReversionRateOPV(double value);

	/**
	 * Returns the value of the '<em><b>Birth Death Rate Developing</b></em>' attribute.
	 * The default value is <code>"0.04"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Death Rate Developing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Death Rate Developing</em>' attribute.
	 * @see #setBirthDeathRateDeveloping(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_BirthDeathRateDeveloping()
	 * @model default="0.04"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Birth-Death Rate - Developing Countries (\u03bc)'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getBirthDeathRateDeveloping();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getBirthDeathRateDeveloping <em>Birth Death Rate Developing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Death Rate Developing</em>' attribute.
	 * @see #getBirthDeathRateDeveloping()
	 * @generated
	 */
	void setBirthDeathRateDeveloping(double value);

	/**
	 * Returns the value of the '<em><b>Transmission Rate OPV</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Rate OPV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Rate OPV</em>' attribute.
	 * @see #setTransmissionRateOPV(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_TransmissionRateOPV()
	 * @model default="0.1"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Transmission Rate - OPV Derived Virus (\u03b2opv)'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getTransmissionRateOPV();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getTransmissionRateOPV <em>Transmission Rate OPV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Rate OPV</em>' attribute.
	 * @see #getTransmissionRateOPV()
	 * @generated
	 */
	void setTransmissionRateOPV(double value);

	/**
	 * Returns the value of the '<em><b>Transmission Rate Wild</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Rate Wild</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Rate Wild</em>' attribute.
	 * @see #setTransmissionRateWild(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_TransmissionRateWild()
	 * @model default="0.5"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Transmission Rate - Wild Virus (\u03b2w)'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getTransmissionRateWild();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getTransmissionRateWild <em>Transmission Rate Wild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Rate Wild</em>' attribute.
	 * @see #getTransmissionRateWild()
	 * @generated
	 */
	void setTransmissionRateWild(double value);

	/**
	 * Returns the value of the '<em><b>Relative Susceptibility Recent OPV</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Susceptibility Recent OPV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Susceptibility Recent OPV</em>' attribute.
	 * @see #setRelativeSusceptibilityRecentOPV(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_RelativeSusceptibilityRecentOPV()
	 * @model default="0.25"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Relative Susceptibility - Recent OPV Infection (fr)'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getRelativeSusceptibilityRecentOPV();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRelativeSusceptibilityRecentOPV <em>Relative Susceptibility Recent OPV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Susceptibility Recent OPV</em>' attribute.
	 * @see #getRelativeSusceptibilityRecentOPV()
	 * @generated
	 */
	void setRelativeSusceptibilityRecentOPV(double value);

	/**
	 * Returns the value of the '<em><b>Relative Susceptibility IPV</b></em>' attribute.
	 * The default value is <code>"0.95"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Susceptibility IPV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Susceptibility IPV</em>' attribute.
	 * @see #setRelativeSusceptibilityIPV(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_RelativeSusceptibilityIPV()
	 * @model default="0.95"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Relative Susceptibility - IPV Only (fi)'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getRelativeSusceptibilityIPV();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRelativeSusceptibilityIPV <em>Relative Susceptibility IPV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Susceptibility IPV</em>' attribute.
	 * @see #getRelativeSusceptibilityIPV()
	 * @generated
	 */
	void setRelativeSusceptibilityIPV(double value);

	/**
	 * Returns the value of the '<em><b>Incubation Rate Vaccine</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incubation Rate Vaccine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incubation Rate Vaccine</em>' attribute.
	 * @see #setIncubationRateVaccine(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_IncubationRateVaccine()
	 * @model default="0.1"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Incubation Rate - Vaccine (\u03c3v)' tooltip='Incubation rate of vaccine-derived poliovirus'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getIncubationRateVaccine();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getIncubationRateVaccine <em>Incubation Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incubation Rate Vaccine</em>' attribute.
	 * @see #getIncubationRateVaccine()
	 * @generated
	 */
	void setIncubationRateVaccine(double value);

	/**
	 * Returns the value of the '<em><b>Incubation Rate Wild</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incubation Rate Wild</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incubation Rate Wild</em>' attribute.
	 * @see #setIncubationRateWild(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_IncubationRateWild()
	 * @model default="0.5"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Incubation Rate - Wild (\u03c3w)' tooltip='Incubation rate of wild poliovirus'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getIncubationRateWild();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getIncubationRateWild <em>Incubation Rate Wild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incubation Rate Wild</em>' attribute.
	 * @see #getIncubationRateWild()
	 * @generated
	 */
	void setIncubationRateWild(double value);

	/**
	 * Returns the value of the '<em><b>Recovery Rate Vaccine</b></em>' attribute.
	 * The default value is <code>"0.143"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery Rate Vaccine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Rate Vaccine</em>' attribute.
	 * @see #setRecoveryRateVaccine(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_RecoveryRateVaccine()
	 * @model default="0.143"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Recovery Rate - Vaccine (\u03b3v)' tooltip='Recovery Rate of vaccine-derived poliovirus'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getRecoveryRateVaccine();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRecoveryRateVaccine <em>Recovery Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Rate Vaccine</em>' attribute.
	 * @see #getRecoveryRateVaccine()
	 * @generated
	 */
	void setRecoveryRateVaccine(double value);

	/**
	 * Returns the value of the '<em><b>Recovery Rate Wild</b></em>' attribute.
	 * The default value is <code>"0.625"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery Rate Wild</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Rate Wild</em>' attribute.
	 * @see #setRecoveryRateWild(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_RecoveryRateWild()
	 * @model default="0.625"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Recovery Rate - Wild (\u03b3w)' tooltip='Recovery Rate of wild poliovirus'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getRecoveryRateWild();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRecoveryRateWild <em>Recovery Rate Wild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Rate Wild</em>' attribute.
	 * @see #getRecoveryRateWild()
	 * @generated
	 */
	void setRecoveryRateWild(double value);

	/**
	 * Returns the value of the '<em><b>Paralytic Incidence From Vaccine</b></em>' attribute.
	 * The default value is <code>"7.14e-7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paralytic Incidence From Vaccine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paralytic Incidence From Vaccine</em>' attribute.
	 * @see #setParalyticIncidenceFromVaccine(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_ParalyticIncidenceFromVaccine()
	 * @model default="7.14e-7"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Paralytic Incidences in Newly Vaccinated (\u03b5)'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getParalyticIncidenceFromVaccine();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getParalyticIncidenceFromVaccine <em>Paralytic Incidence From Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paralytic Incidence From Vaccine</em>' attribute.
	 * @see #getParalyticIncidenceFromVaccine()
	 * @generated
	 */
	void setParalyticIncidenceFromVaccine(double value);

	/**
	 * Returns the value of the '<em><b>Paralytic Case Proportion</b></em>' attribute.
	 * The default value is <code>"0.005"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paralytic Case Proportion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paralytic Case Proportion</em>' attribute.
	 * @see #setParalyticCaseProportion(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvDiseaseModel_ParalyticCaseProportion()
	 * @model default="0.005"
	 *        annotation="org.eclipse.stem.models.feature.constraint minValue='0.0' maxValue='1.0'"
	 *        annotation="org.eclipse.stem.models.feature.messages name='Proportion of Paralytic Polio cases (\u03c0para)'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getParalyticCaseProportion();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getParalyticCaseProportion <em>Paralytic Case Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paralytic Case Proportion</em>' attribute.
	 * @see #getParalyticCaseProportion()
	 * @generated
	 */
	void setParalyticCaseProportion(double value);


} // PolioOpvIpvDiseaseModel
