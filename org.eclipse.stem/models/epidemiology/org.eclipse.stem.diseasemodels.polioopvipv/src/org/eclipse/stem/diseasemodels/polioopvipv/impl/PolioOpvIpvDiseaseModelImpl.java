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
package org.eclipse.stem.diseasemodels.polioopvipv.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.math.BinomialDistributionUtil;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvFactory;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabel;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRImpl;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Disease Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getOpvEfficacy <em>Opv Efficacy</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getReversionRateOPV <em>Reversion Rate OPV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getBirthDeathRateDeveloping <em>Birth Death Rate Developing</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getTransmissionRateOPV <em>Transmission Rate OPV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getTransmissionRateWild <em>Transmission Rate Wild</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getRelativeSusceptibilityRecentOPV <em>Relative Susceptibility Recent OPV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getRelativeSusceptibilityIPV <em>Relative Susceptibility IPV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getIncubationRateVaccine <em>Incubation Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getIncubationRateWild <em>Incubation Rate Wild</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getRecoveryRateVaccine <em>Recovery Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getRecoveryRateWild <em>Recovery Rate Wild</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getParalyticIncidenceFromVaccine <em>Paralytic Incidence From Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl#getParalyticCaseProportion <em>Paralytic Case Proportion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolioOpvIpvDiseaseModelImpl extends SEIRImpl implements
		PolioOpvIpvDiseaseModel {
	/**
	 * The default value of the '{@link #getOpvEfficacy() <em>Opv Efficacy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOpvEfficacy()
	 * @generated
	 * @ordered
	 */
	protected static final double OPV_EFFICACY_EDEFAULT = 0.9;

	/**
	 * The cached value of the '{@link #getOpvEfficacy() <em>Opv Efficacy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOpvEfficacy()
	 * @generated
	 * @ordered
	 */
	protected double opvEfficacy = OPV_EFFICACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReversionRateOPV() <em>Reversion Rate OPV</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getReversionRateOPV()
	 * @generated
	 * @ordered
	 */
	protected static final double REVERSION_RATE_OPV_EDEFAULT = 0.0010;

	/**
	 * The cached value of the '{@link #getReversionRateOPV() <em>Reversion Rate OPV</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getReversionRateOPV()
	 * @generated
	 * @ordered
	 */
	protected double reversionRateOPV = REVERSION_RATE_OPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthDeathRateDeveloping() <em>Birth Death Rate Developing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDeathRateDeveloping()
	 * @generated
	 * @ordered
	 */
	protected static final double BIRTH_DEATH_RATE_DEVELOPING_EDEFAULT = 0.04;

	/**
	 * The cached value of the '{@link #getBirthDeathRateDeveloping() <em>Birth Death Rate Developing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDeathRateDeveloping()
	 * @generated
	 * @ordered
	 */
	protected double birthDeathRateDeveloping = BIRTH_DEATH_RATE_DEVELOPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmissionRateOPV() <em>Transmission Rate OPV</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTransmissionRateOPV()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSMISSION_RATE_OPV_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getTransmissionRateOPV() <em>Transmission Rate OPV</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTransmissionRateOPV()
	 * @generated
	 * @ordered
	 */
	protected double transmissionRateOPV = TRANSMISSION_RATE_OPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmissionRateWild() <em>Transmission Rate Wild</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTransmissionRateWild()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSMISSION_RATE_WILD_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getTransmissionRateWild() <em>Transmission Rate Wild</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTransmissionRateWild()
	 * @generated
	 * @ordered
	 */
	protected double transmissionRateWild = TRANSMISSION_RATE_WILD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeSusceptibilityRecentOPV()
	 * <em>Relative Susceptibility Recent OPV</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRelativeSusceptibilityRecentOPV()
	 * @generated
	 * @ordered
	 */
	protected static final double RELATIVE_SUSCEPTIBILITY_RECENT_OPV_EDEFAULT = 0.25;

	/**
	 * The cached value of the '{@link #getRelativeSusceptibilityRecentOPV()
	 * <em>Relative Susceptibility Recent OPV</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRelativeSusceptibilityRecentOPV()
	 * @generated
	 * @ordered
	 */
	protected double relativeSusceptibilityRecentOPV = RELATIVE_SUSCEPTIBILITY_RECENT_OPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeSusceptibilityIPV() <em>Relative Susceptibility IPV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeSusceptibilityIPV()
	 * @generated
	 * @ordered
	 */
	protected static final double RELATIVE_SUSCEPTIBILITY_IPV_EDEFAULT = 0.95;

	/**
	 * The cached value of the '{@link #getRelativeSusceptibilityIPV() <em>Relative Susceptibility IPV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeSusceptibilityIPV()
	 * @generated
	 * @ordered
	 */
	protected double relativeSusceptibilityIPV = RELATIVE_SUSCEPTIBILITY_IPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncubationRateVaccine() <em>Incubation Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncubationRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected static final double INCUBATION_RATE_VACCINE_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getIncubationRateVaccine() <em>Incubation Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncubationRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected double incubationRateVaccine = INCUBATION_RATE_VACCINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncubationRateWild() <em>Incubation Rate Wild</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIncubationRateWild()
	 * @generated
	 * @ordered
	 */
	protected static final double INCUBATION_RATE_WILD_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getIncubationRateWild() <em>Incubation Rate Wild</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIncubationRateWild()
	 * @generated
	 * @ordered
	 */
	protected double incubationRateWild = INCUBATION_RATE_WILD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveryRateVaccine() <em>Recovery Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRecoveryRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected static final double RECOVERY_RATE_VACCINE_EDEFAULT = 0.143;

	/**
	 * The cached value of the '{@link #getRecoveryRateVaccine() <em>Recovery Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRecoveryRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected double recoveryRateVaccine = RECOVERY_RATE_VACCINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveryRateWild() <em>Recovery Rate Wild</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRecoveryRateWild()
	 * @generated
	 * @ordered
	 */
	protected static final double RECOVERY_RATE_WILD_EDEFAULT = 0.625;

	/**
	 * The cached value of the '{@link #getRecoveryRateWild() <em>Recovery Rate Wild</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRecoveryRateWild()
	 * @generated
	 * @ordered
	 */
	protected double recoveryRateWild = RECOVERY_RATE_WILD_EDEFAULT;

	/**
	 * The default value of the '{@link #getParalyticIncidenceFromVaccine()
	 * <em>Paralytic Incidence From Vaccine</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParalyticIncidenceFromVaccine()
	 * @generated
	 * @ordered
	 */
	protected static final double PARALYTIC_INCIDENCE_FROM_VACCINE_EDEFAULT = 7.14E-7;

	/**
	 * The cached value of the '{@link #getParalyticIncidenceFromVaccine()
	 * <em>Paralytic Incidence From Vaccine</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParalyticIncidenceFromVaccine()
	 * @generated
	 * @ordered
	 */
	protected double paralyticIncidenceFromVaccine = PARALYTIC_INCIDENCE_FROM_VACCINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParalyticCaseProportion() <em>Paralytic Case Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParalyticCaseProportion()
	 * @generated
	 * @ordered
	 */
	protected static final double PARALYTIC_CASE_PROPORTION_EDEFAULT = 0.0050;

	/**
	 * The cached value of the '{@link #getParalyticCaseProportion() <em>Paralytic Case Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParalyticCaseProportion()
	 * @generated
	 * @ordered
	 */
	protected double paralyticCaseProportion = PARALYTIC_CASE_PROPORTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PolioOpvIpvDiseaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getOpvEfficacy() {
		return opvEfficacy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpvEfficacy(double newOpvEfficacy) {
		opvEfficacy = newOpvEfficacy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getReversionRateOPV() {
		return reversionRateOPV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReversionRateOPV(double newReversionRateOPV) {
		reversionRateOPV = newReversionRateOPV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getBirthDeathRateDeveloping() {
		return birthDeathRateDeveloping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDeathRateDeveloping(double newBirthDeathRateDeveloping) {
		birthDeathRateDeveloping = newBirthDeathRateDeveloping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransmissionRateOPV() {
		return transmissionRateOPV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionRateOPV(double newTransmissionRateOPV) {
		transmissionRateOPV = newTransmissionRateOPV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransmissionRateWild() {
		return transmissionRateWild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionRateWild(double newTransmissionRateWild) {
		transmissionRateWild = newTransmissionRateWild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelativeSusceptibilityRecentOPV() {
		return relativeSusceptibilityRecentOPV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeSusceptibilityRecentOPV(
			double newRelativeSusceptibilityRecentOPV) {
		relativeSusceptibilityRecentOPV = newRelativeSusceptibilityRecentOPV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelativeSusceptibilityIPV() {
		return relativeSusceptibilityIPV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeSusceptibilityIPV(double newRelativeSusceptibilityIPV) {
		relativeSusceptibilityIPV = newRelativeSusceptibilityIPV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncubationRateVaccine() {
		return incubationRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncubationRateVaccine(double newIncubationRateVaccine) {
		incubationRateVaccine = newIncubationRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncubationRateWild() {
		return incubationRateWild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncubationRateWild(double newIncubationRateWild) {
		incubationRateWild = newIncubationRateWild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRecoveryRateVaccine() {
		return recoveryRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryRateVaccine(double newRecoveryRateVaccine) {
		recoveryRateVaccine = newRecoveryRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRecoveryRateWild() {
		return recoveryRateWild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryRateWild(double newRecoveryRateWild) {
		recoveryRateWild = newRecoveryRateWild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getParalyticIncidenceFromVaccine() {
		return paralyticIncidenceFromVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParalyticIncidenceFromVaccine(
			double newParalyticIncidenceFromVaccine) {
		paralyticIncidenceFromVaccine = newParalyticIncidenceFromVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getParalyticCaseProportion() {
		return paralyticCaseProportion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParalyticCaseProportion(double newParalyticCaseProportion) {
		paralyticCaseProportion = newParalyticCaseProportion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY:
				return getOpvEfficacy();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV:
				return getReversionRateOPV();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING:
				return getBirthDeathRateDeveloping();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV:
				return getTransmissionRateOPV();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD:
				return getTransmissionRateWild();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV:
				return getRelativeSusceptibilityRecentOPV();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV:
				return getRelativeSusceptibilityIPV();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE:
				return getIncubationRateVaccine();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD:
				return getIncubationRateWild();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE:
				return getRecoveryRateVaccine();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD:
				return getRecoveryRateWild();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE:
				return getParalyticIncidenceFromVaccine();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION:
				return getParalyticCaseProportion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY:
				setOpvEfficacy((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV:
				setReversionRateOPV((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING:
				setBirthDeathRateDeveloping((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV:
				setTransmissionRateOPV((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD:
				setTransmissionRateWild((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV:
				setRelativeSusceptibilityRecentOPV((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV:
				setRelativeSusceptibilityIPV((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE:
				setIncubationRateVaccine((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD:
				setIncubationRateWild((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE:
				setRecoveryRateVaccine((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD:
				setRecoveryRateWild((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE:
				setParalyticIncidenceFromVaccine((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION:
				setParalyticCaseProportion((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY:
				setOpvEfficacy(OPV_EFFICACY_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV:
				setReversionRateOPV(REVERSION_RATE_OPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING:
				setBirthDeathRateDeveloping(BIRTH_DEATH_RATE_DEVELOPING_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV:
				setTransmissionRateOPV(TRANSMISSION_RATE_OPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD:
				setTransmissionRateWild(TRANSMISSION_RATE_WILD_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV:
				setRelativeSusceptibilityRecentOPV(RELATIVE_SUSCEPTIBILITY_RECENT_OPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV:
				setRelativeSusceptibilityIPV(RELATIVE_SUSCEPTIBILITY_IPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE:
				setIncubationRateVaccine(INCUBATION_RATE_VACCINE_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD:
				setIncubationRateWild(INCUBATION_RATE_WILD_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE:
				setRecoveryRateVaccine(RECOVERY_RATE_VACCINE_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD:
				setRecoveryRateWild(RECOVERY_RATE_WILD_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE:
				setParalyticIncidenceFromVaccine(PARALYTIC_INCIDENCE_FROM_VACCINE_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION:
				setParalyticCaseProportion(PARALYTIC_CASE_PROPORTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY:
				return opvEfficacy != OPV_EFFICACY_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV:
				return reversionRateOPV != REVERSION_RATE_OPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING:
				return birthDeathRateDeveloping != BIRTH_DEATH_RATE_DEVELOPING_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV:
				return transmissionRateOPV != TRANSMISSION_RATE_OPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD:
				return transmissionRateWild != TRANSMISSION_RATE_WILD_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV:
				return relativeSusceptibilityRecentOPV != RELATIVE_SUSCEPTIBILITY_RECENT_OPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV:
				return relativeSusceptibilityIPV != RELATIVE_SUSCEPTIBILITY_IPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE:
				return incubationRateVaccine != INCUBATION_RATE_VACCINE_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD:
				return incubationRateWild != INCUBATION_RATE_WILD_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE:
				return recoveryRateVaccine != RECOVERY_RATE_VACCINE_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD:
				return recoveryRateWild != RECOVERY_RATE_WILD_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE:
				return paralyticIncidenceFromVaccine != PARALYTIC_INCIDENCE_FROM_VACCINE_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION:
				return paralyticCaseProportion != PARALYTIC_CASE_PROPORTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (opvEfficacy: ");
		result.append(opvEfficacy);
		result.append(", reversionRateOPV: ");
		result.append(reversionRateOPV);
		result.append(", birthDeathRateDeveloping: ");
		result.append(birthDeathRateDeveloping);
		result.append(", transmissionRateOPV: ");
		result.append(transmissionRateOPV);
		result.append(", transmissionRateWild: ");
		result.append(transmissionRateWild);
		result.append(", relativeSusceptibilityRecentOPV: ");
		result.append(relativeSusceptibilityRecentOPV);
		result.append(", relativeSusceptibilityIPV: ");
		result.append(relativeSusceptibilityIPV);
		result.append(", incubationRateVaccine: ");
		result.append(incubationRateVaccine);
		result.append(", incubationRateWild: ");
		result.append(incubationRateWild);
		result.append(", recoveryRateVaccine: ");
		result.append(recoveryRateVaccine);
		result.append(", recoveryRateWild: ");
		result.append(recoveryRateWild);
		result.append(", paralyticIncidenceFromVaccine: ");
		result.append(paralyticIncidenceFromVaccine);
		result.append(", paralyticCaseProportion: ");
		result.append(paralyticCaseProportion);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void applyExternalDeltas(STEMTime currentTime,
			double continuousTime, long timeDelta, EList<DynamicLabel> labels) {
		// TODO Auto-generated stub. Implement applyExternalDeltas(...) for PolioOpvIpvDiseaseModelImpl.
		super.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);
	} // applyExternalDeltas

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel iLabel, long timeDelta) {
		// TODO Auto-generated stub. Implement doStochasticProcess(...) for
		// PolioOpvIpvDiseaseModelImpl.
		// Turn next value into integers
		IntegrationLabelValue nextVal = (IntegrationLabelValue) iLabel
				.getNextValue();
		EList<EAttribute> attrs = nextVal.eClass().getEAllAttributes();

		for (int i = 0; i < attrs.size(); ++i) {
			EAttribute attr = attrs.get(i);
			if (attr.getEType().getClassifierID() == EcorePackage.EDOUBLE
					&& attr.isChangeable()) {
				nextVal.eSetDouble(attr.getFeatureID(), Math.round(nextVal.eGetDouble(attr.getFeatureID())));
			}
		}
		if (this.getBinomialDistribution() == null)
			this.setBinomialDistribution(new BinomialDistributionUtil(this
					.getRandomSeed()));

		// Add stochastic noise to incidences and adjust the next value
		PolioOpvIpvLabelValue previousPolio = (PolioOpvIpvLabelValue) iLabel
				.getCurrentValue(); // before the last integration step
		double popCount = previousPolio.getPopulationCount();

		// adjust parameter value
		double adjustReversionRate = getReversionRateOPV() * (double) timeDelta
				/ (double) getTimePeriod();
		double adjustTransmissionRateOPV = getTransmissionRateOPV()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustTransmissionRateWild = getTransmissionRateWild()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustRelativeSusceptibilityRecentOPV = getRelativeSusceptibilityRecentOPV()
				* (double) timeDelta / (double) getTimePeriod();

		// rate 1 - Sopv->Eopv
		double r1 = (1 - adjustReversionRate) * adjustTransmissionRateOPV
				* adjustRelativeSusceptibilityRecentOPV
				* previousPolio.getSopv()
				* (previousPolio.getVopv() + previousPolio.getCipv_opv())
				/ popCount;

		// rate 2 - Sopv->Ew
		double r2 = adjustRelativeSusceptibilityRecentOPV
				* previousPolio.getSopv() * adjustTransmissionRateWild
				* (previousPolio.getI() + previousPolio.getCipv_w()) / popCount
				+ adjustRelativeSusceptibilityRecentOPV
				* previousPolio.getSopv() * adjustTransmissionRateOPV
				* adjustReversionRate
				* (previousPolio.getVopv() + previousPolio.getCipv_opv())
				/ popCount;

		// rate 3 - S->Eopv
		double r3 = (1 - adjustReversionRate) * adjustTransmissionRateOPV
				* previousPolio.getS()
				* (previousPolio.getVopv() + previousPolio.getCipv_opv())
				/ popCount;

		// rate 4 - S->Ew
		double r4 = previousPolio.getS() * adjustTransmissionRateWild
				* (previousPolio.getI() + previousPolio.getCipv_w()) / popCount
				+ previousPolio.getS() * adjustTransmissionRateOPV
				* adjustReversionRate
				* (previousPolio.getVopv() + previousPolio.getCipv_opv())
				/ popCount;

		double deltaIncident = r2 + r4;
		double deltaIncident_OPV = r1 + r3;

		PolioOpvIpvLabelValue next = (PolioOpvIpvLabelValue) iLabel
				.getNextValue(); // NOW
		PolioOpvIpvLabelValue previous = (PolioOpvIpvLabelValue) iLabel
				.getCurrentValue(); // Previous

		// Add stochastic noise to incidence and adjust the next value
		// Sopv, S -> Eopv
		addNoise(previous, next,
				PolioOpvIpvPackage.eINSTANCE.getPolioOpvIpvLabelValue_Sopv(),
				PolioOpvIpvPackage.eINSTANCE
						.getPolioOpvIpvLabelValue_Incidence_opv(),
				PolioOpvIpvPackage.eINSTANCE.getPolioOpvIpvLabelValue_Eopv(),
				r1 / deltaIncident_OPV);
		addNoise(previous, next, StandardPackage.eINSTANCE
				.getStandardDiseaseModelLabelValue_S(),
				PolioOpvIpvPackage.eINSTANCE
						.getPolioOpvIpvLabelValue_Incidence_opv(),
				PolioOpvIpvPackage.eINSTANCE.getPolioOpvIpvLabelValue_Eopv(),
				r3 / deltaIncident_OPV);

		// Sopv, S -> Ew
		addNoise(previous, next,
				PolioOpvIpvPackage.eINSTANCE.getPolioOpvIpvLabelValue_Sopv(),
				StandardPackage.eINSTANCE
						.getStandardDiseaseModelLabelValue_Incidence(),
				StandardPackage.eINSTANCE.getSEIRLabelValue_E(), r2
						/ deltaIncident);
		addNoise(previous, next, StandardPackage.eINSTANCE
				.getStandardDiseaseModelLabelValue_S(),
				StandardPackage.eINSTANCE
						.getStandardDiseaseModelLabelValue_Incidence(),
				StandardPackage.eINSTANCE.getSEIRLabelValue_E(), r4
						/ deltaIncident);

		// Sipv -> Eipv_w
		addNoise(previous, next,
				PolioOpvIpvPackage.eINSTANCE.getPolioOpvIpvLabelValue_Sipv(),
				PolioOpvIpvPackage.eINSTANCE
						.getPolioOpvIpvLabelValue_Incidence_ipv_w(),
				PolioOpvIpvPackage.eINSTANCE.getPolioOpvIpvLabelValue_Eipv_w(),
				1.0);

		// Sipv -> Eipv_opv
		addNoise(previous, next,
				PolioOpvIpvPackage.eINSTANCE.getPolioOpvIpvLabelValue_Sipv(),
				PolioOpvIpvPackage.eINSTANCE
						.getPolioOpvIpvLabelValue_Incidence_ipv_opv(),
				PolioOpvIpvPackage.eINSTANCE
						.getPolioOpvIpvLabelValue_Eipv_opv(), 1.0);

		// super.doStochasticProcess(label, timeDelta);
	} // doStochasticProcess

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta,
			EList<DynamicLabel> labels) {
		// TODO Auto-generated stub. Implement calculateDeltas(...) for
		// PolioOpvIpvDiseaseModelImpl.

		// Add common calculations here that needs to be done before we begin.
		// For instance, adjust rate parameters here to take into account the
		// time
		// step of the sequencer and the time period of the disease model.
		// Here is an example:
		// final double adjustedTransmissionRate = getTransmissionRate() *
		// ((double) timeDelta / (double) getTimePeriod());

		// adjust parameter value
		double adjustOPVEfficacy = getOpvEfficacy() * (double) timeDelta
				/ (double) getTimePeriod();
		double adjustReversionRate = getReversionRateOPV() * (double) timeDelta
				/ (double) getTimePeriod();
		
//	MD 11/15/2012 Commenting out to clear warning
//		double adjustBirthDeathRateDeveloping = getBirthDeathRateDeveloping()
//				* (double) timeDelta / (double) getTimePeriod();
		
		double adjustTransmissionRateOPV = getTransmissionRateOPV()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustTransmissionRateWild = getTransmissionRateWild()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustRelativeSusceptibilityRecentOPV = getRelativeSusceptibilityRecentOPV()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustRelativeSusceptibilityIPV = getRelativeSusceptibilityIPV()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustIncubationRateVaccine = getIncubationRateVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustIncubationRateWild = getIncubationRateWild()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustRecoveryRateVaccine = getRecoveryRateVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustRecoveryRateWild = getRecoveryRateWild()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustParalyticIncidenceFromVaccine = getParalyticIncidenceFromVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustParalyticIncidenceFromWildPolio = getParalyticCaseProportion()
				* (double) timeDelta / (double) getTimePeriod();

		for (int _i = 0; _i < labels.size(); ++_i) {
			PolioOpvIpvLabel diseaseLabel = (PolioOpvIpvLabel) labels.get(_i);
			PolioOpvIpvLabelValue currentDiseaseState = (PolioOpvIpvLabelValue) diseaseLabel
					.getProbeValue();
			PolioOpvIpvLabelValue deltaValue = (PolioOpvIpvLabelValue) diseaseLabel
					.getDeltaValue();
			deltaValue.reset();

			// Add code here to compute and set the delta (in deltaValue) from
			// the current state (in currentDiseaseState)

			double popCount = currentDiseaseState.getPopulationCount();

			// effective numbers used in those mass action terms
			final double effectiveInfectiousI = getNormalizedEffectiveInfectious(
					diseaseLabel.getNode(), diseaseLabel,
					currentDiseaseState.getI(),
					StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
			final double effectiveInfectiousVopv = getNormalizedEffectiveInfectious(
					diseaseLabel.getNode(), diseaseLabel,
					currentDiseaseState.getVopv(),
					PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__VOPV, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
			final double effectiveInfectiousCipv_w = getNormalizedEffectiveInfectious(
					diseaseLabel.getNode(),
					diseaseLabel,
					currentDiseaseState.getCipv_w(),
					PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__CIPV_W, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
			final double effectiveInfectiousCipv_opv = getNormalizedEffectiveInfectious(
					diseaseLabel.getNode(),
					diseaseLabel,
					currentDiseaseState.getCipv_opv(),
					PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);

			// rate 1 - Exposed to OPV vaccination
			double r1 = (1 - adjustReversionRate) * adjustTransmissionRateOPV
					* adjustRelativeSusceptibilityRecentOPV
					* currentDiseaseState.getSopv()
					* (effectiveInfectiousVopv + effectiveInfectiousCipv_opv);

			// rate 2 - Contract wild poliovirus but historical OPV
			double r2 = adjustRelativeSusceptibilityRecentOPV
					* currentDiseaseState.getSopv()
					* adjustTransmissionRateWild
					* (effectiveInfectiousI + effectiveInfectiousCipv_w)
					+ adjustRelativeSusceptibilityRecentOPV
					* currentDiseaseState.getSopv() * adjustTransmissionRateOPV
					* adjustReversionRate
					* (effectiveInfectiousVopv + effectiveInfectiousCipv_opv);

			// rate 3 - Contact vaccination
			double r3 = (1 - adjustReversionRate) * adjustTransmissionRateOPV
					* currentDiseaseState.getS()
					* (effectiveInfectiousVopv + effectiveInfectiousCipv_opv);

			// rate 4 - Infected by wild poliovirus
			double r4 = currentDiseaseState.getS() * adjustTransmissionRateWild
					* (effectiveInfectiousI + effectiveInfectiousCipv_w)
					+ currentDiseaseState.getS() * adjustTransmissionRateOPV
					* adjustReversionRate
					* (effectiveInfectiousVopv + effectiveInfectiousCipv_opv);

			// rate 5 - Contracting wild poliovirus after getting IPV
			double r5 = adjustRelativeSusceptibilityIPV
					* currentDiseaseState.getSipv()
					* adjustTransmissionRateWild
					* (effectiveInfectiousI + effectiveInfectiousCipv_w)
					+ adjustRelativeSusceptibilityIPV
					* currentDiseaseState.getSipv() * adjustTransmissionRateOPV
					* adjustReversionRate
					* (effectiveInfectiousVopv + effectiveInfectiousCipv_opv);

			// rate 6 - Getting cVDPV after IPV
			double r6 = (1 - adjustReversionRate) * adjustTransmissionRateOPV
					* adjustRelativeSusceptibilityIPV
					* currentDiseaseState.getSipv()
					* (effectiveInfectiousVopv + effectiveInfectiousCipv_opv);

			// rate 7 - Imperfect efficacy of OPV
			double r7 = (1 - adjustOPVEfficacy) * adjustRecoveryRateVaccine
					* currentDiseaseState.getVopv();

			// rate 8 - Moving from Eopv to Vopv
			double r8 = adjustIncubationRateVaccine
					* currentDiseaseState.getEopv();

			// rate 9 - Infectious of wild polio
			double r9 = adjustIncubationRateWild * currentDiseaseState.getE();

			// rate 10 - Moving from Eipv_w to Cipv_w
			double r10 = adjustIncubationRateWild
					* currentDiseaseState.getEipv_w();

			// rate 11 - Moving from Eipv_opv to Cipv_opv
			double r11 = adjustIncubationRateVaccine
					* currentDiseaseState.getEipv_opv();

			// rate 12 - Becoming immune after OPV
			double r12 = (1 - adjustParalyticIncidenceFromVaccine)
					* adjustRecoveryRateVaccine * adjustOPVEfficacy
					* currentDiseaseState.getVopv();

			// rate 13 - VAPP
			double r13 = adjustParalyticIncidenceFromVaccine
					* adjustRecoveryRateVaccine * adjustOPVEfficacy
					* currentDiseaseState.getVopv();

			// rate 14 - Recovered after infected by wild polio
			double r14 = (1 - adjustParalyticIncidenceFromWildPolio)
					* adjustRecoveryRateWild * currentDiseaseState.getI();

			// rate 15 - Becoming paralyzed due to wild polio infection
			double r15 = adjustParalyticIncidenceFromWildPolio
					* adjustRecoveryRateWild * currentDiseaseState.getI();

			// rate 16 - No longer carry wild poliovirus as IPV receivers
			double r16 = adjustRecoveryRateWild
					* currentDiseaseState.getCipv_w();

			// rate 17 - No longer carry wild poliovirus as IPV receivers
			double r17 = adjustRecoveryRateVaccine
					* currentDiseaseState.getCipv_opv();

			// // diseaseDeath
			// double diseaseDeath = adjustinfectiousMortalityRate
			// * (currentOPVstate.getI() + currentOPVstate.getV());

			double deltaS = -r3 - r4;
			double deltaSopv = r7 - r1 - r2;
			double deltaSipv = -r5 - r6;
			double deltaEopv = r1 + r3 - r8;
			double deltaEw = r2 + r4 - r9;
			double deltaEipv_w = r5 - r10;
			double deltaEipv_opv = r6 - r11;
			double deltaVopv = r8 - r7 - r12 - r13;
			double deltaIw = r9 - r14 - r15;
			double deltaCipv_w = r10 - r16;
			double deltaCipv_opv = r11 - r17;
			double deltaPopv = r13;
			double deltaPw = r15;
			double deltaR = r12 + r14 + r16 + r17;

			// Wrong in this case: we use # of paralysis case caused by wild
			// polio to trigger the intervention
			// this is what used my Agent-based Model paper as well (Rahmandad &
			// Hu, 2011)
			double deltaIncident = r2 + r4;
			double deltaIncident_OPV = r1 + r3;
			double deltaIncident_IPV_W = r5;
			double deltaIncident_IPV_OPV = r6;

			// If you need to take into account any interventions currently in
			// place for the region, use this
			// code snippet as a sample:

			// StandardInterventionLabel sil =
			// findInterventionLabel((Node)diseaseLabel.getIdentifiable());
			// if(sil != null) {
			// double vaccinations =
			// ((StandardInterventionLabelValue)sil.getCurrentValue()).getVaccinations();
			// ... add code to include vaccinations (isolations etc.) into your
			// delta calculation here
			// }

			StandardInterventionLabel scl = findInterventionLabel((Node) diseaseLabel
					.getIdentifiable());
			if (scl != null) {
				double vaccinations = ((StandardInterventionLabelValue) scl
						.getCurrentValue()).getVaccinations();
				vaccinations *= ((double) timeDelta / (double) getTimePeriod());
				// calculate # of pop who are eligible to get vaccine during a
				// mass vaccination campaign
				double availPopToBeVaccinated = popCount
						- currentDiseaseState.getPopv()
						- currentDiseaseState.getPw();

				// validate # of vaccine allocated to ppl in each compartment
				if (vaccinations > availPopToBeVaccinated)
					vaccinations = availPopToBeVaccinated;
				// calculate the proportion of vaccine that each compartment
				// could be allocated

				double vaccineS = vaccinations * currentDiseaseState.getS()
						/ availPopToBeVaccinated;
				double vaccineSopv = vaccinations
						* currentDiseaseState.getSopv()
						/ availPopToBeVaccinated;
				double vaccineSipv = vaccinations
						* currentDiseaseState.getSipv()
						/ availPopToBeVaccinated;

				// vaccination procedure does not change values in the states
				// below,
				// but do give them vaccine in reality because you could not
				// tell people's state by observations
				
//				MD 11/15/2012 Commenting out to clear warning
				
//				double vaccineEopv = vaccinations
//						* currentDiseaseState.getEopv()
//						/ availPopToBeVaccinated;
//				double vaccineEw = vaccinations * currentDiseaseState.getE()
//						/ availPopToBeVaccinated;
//				double vaccineEipv_w = vaccinations
//						* currentDiseaseState.getEipv_w()
//						/ availPopToBeVaccinated;
//				double vaccineEipv_opv = vaccinations
//						* currentDiseaseState.getEipv_opv()
//						/ availPopToBeVaccinated;
//				double vaccineVopv = vaccinations
//						* currentDiseaseState.getVopv()
//						/ availPopToBeVaccinated;
//				double vaccineIw = vaccinations * currentDiseaseState.getI()
//						/ availPopToBeVaccinated;
//				double vaccineCipv_w = vaccinations
//						* currentDiseaseState.getCipv_w()
//						/ availPopToBeVaccinated;
//				double vaccineCipv_opv = vaccinations
//						* currentDiseaseState.getCipv_opv()
//						/ availPopToBeVaccinated;
//				double vaccineR = vaccinations * currentDiseaseState.getR()
//						/ availPopToBeVaccinated;

				// // validate # of vaccine allocated to ppl in each compartment
				// if (currentDiseaseState.getS() < vaccineS)
				// vaccineS = currentDiseaseState.getS();
				// if (currentDiseaseState.getSopv() < vaccineSopv)
				// vaccineSopv = currentDiseaseState.getSopv();
				// if (currentDiseaseState.getSipv() < vaccineSipv)
				// vaccineSipv = currentDiseaseState.getSipv();
				// if (currentDiseaseState.getEopv() < vaccineEopv)
				// vaccineEopv = currentDiseaseState.getEopv();
				// if (currentDiseaseState.getE() < vaccineEw)
				// vaccineEw = currentDiseaseState.getE();
				// if (currentDiseaseState.getEipv_w() < vaccineEipv_w)
				// vaccineEipv_w = currentDiseaseState.getEipv_w();
				// if (currentDiseaseState.getEipv_opv() < vaccineEipv_opv)
				// vaccineEipv_opv = currentDiseaseState.getEipv_opv();
				// if (currentDiseaseState.getVopv() < vaccineVopv)
				// vaccineVopv = currentDiseaseState.getVopv();
				// if (currentDiseaseState.getI() < vaccineIw)
				// vaccineIw = currentDiseaseState.getI();
				// if (currentDiseaseState.getCipv_w() < vaccineCipv_w)
				// vaccineCipv_w = currentDiseaseState.getCipv_w();
				// if (currentDiseaseState.getCipv_opv()< vaccineCipv_opv)
				// vaccineCipv_opv = currentDiseaseState.getCipv_opv();
				// if (currentDiseaseState.getR() < vaccineR)
				// vaccineR = currentDiseaseState.getR();

				// ppl in E, I, R compartment would NOT move even though they
				// got
				// the vaccination,
				// it is waste but hard to tell at which compartment an
				// individual
				// is in reality
				// ppl in V compartment do NOT get any benefit from these
				// immediate
				// vaccination campaign because they did not wait enough time
				// between each dose
				deltaS -= vaccineS;
				deltaSopv -= vaccineSopv;
				deltaSipv -= vaccineSipv;
				deltaEopv += (vaccineS + deltaSopv);
				deltaEipv_opv += deltaSipv;

				/*
				 * //if it is the response to a detected outbreak, then we only
				 * have limited vaccine for Sv and So else { deltaS -=
				 * vaccinations; deltaSv -= vaccinations; deltaR +=
				 * vaccinations;
				 * 
				 * 
				 * }
				 */

			}

			// setDeltaValuetoStates
			deltaValue.setS(deltaS);
			deltaValue.setSopv(deltaSopv);
			deltaValue.setSipv(deltaSipv);
			deltaValue.setEopv(deltaEopv);
			deltaValue.setE(deltaEw);
			deltaValue.setEipv_w(deltaEipv_w);
			deltaValue.setEipv_opv(deltaEipv_opv);
			deltaValue.setVopv(deltaVopv);
			deltaValue.setI(deltaIw);
			deltaValue.setCipv_w(deltaCipv_w);
			deltaValue.setCipv_opv(deltaCipv_opv);
			deltaValue.setPopv(deltaPopv);
			deltaValue.setPw(deltaPw);
			deltaValue.setR(deltaR);
			// incidence
			deltaValue.setIncidence(deltaIncident);
			deltaValue.setIncidence_opv(deltaIncident_OPV);
			deltaValue.setIncidence_ipv_w(deltaIncident_IPV_W);
			deltaValue.setIncidence_ipv_opv(deltaIncident_IPV_OPV);

			// disease death for polio will be compute after the simulation when
			// getting the incidence of paralytic cases.
			// deltaValue.setDiseaseDeaths(diseaseDeath);
			// DO NOT REMOVE THIS LINE. It's critical to ensure disease deaths
			// are being reported to
			// other models that depend on it.
			computeAdditionalDeltasAndExchanges(diseaseLabel, time, t,
					timeDelta);
		}

	} // calculateDeltas

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {	

		DiseaseModelLabel label = PolioOpvIpvFactory.eINSTANCE.createPolioOpvIpvLabel(); 
		label.setTypeURI(DiseaseModelLabel.URI_TYPE_DYNAMIC_DISEASE_LABEL);

		return label;
	} // createDiseaseModelLabel

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabelValue createDiseaseModelLabelValue(
			String populationIdentifier) {	
 
		return PolioOpvIpvFactory.eINSTANCE.createPolioOpvIpvLabelValue(); 
	}

} // PolioOpvIpvDiseaseModelImpl
