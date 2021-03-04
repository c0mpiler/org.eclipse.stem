package org.eclipse.stem.diseasemodels.vector;

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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dengue Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getBitingRateSV <em>Biting Rate SV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getBitingRateIV <em>Biting Rate IV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity1 <em>Host Infectivity1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity2 <em>Host Infectivity2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity3 <em>Host Infectivity3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity4 <em>Host Infectivity4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate1 <em>Host Primary Incubation Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate2 <em>Host Primary Incubation Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate3 <em>Host Primary Incubation Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate4 <em>Host Primary Incubation Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate1 <em>Host Primary Recovery Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate2 <em>Host Primary Recovery Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate3 <em>Host Primary Recovery Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate4 <em>Host Primary Recovery Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate1 <em>Host Primary Immunity Loss Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate2 <em>Host Primary Immunity Loss Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate3 <em>Host Primary Immunity Loss Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate4 <em>Host Primary Immunity Loss Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate1 <em>Host Primary Disease Death Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate2 <em>Host Primary Disease Death Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate3 <em>Host Primary Disease Death Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate4 <em>Host Primary Disease Death Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE12 <em>Host ADE12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE13 <em>Host ADE13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE14 <em>Host ADE14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE21 <em>Host ADE21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE23 <em>Host ADE23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE24 <em>Host ADE24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE31 <em>Host ADE31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE32 <em>Host ADE32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE34 <em>Host ADE34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE41 <em>Host ADE41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE42 <em>Host ADE42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE43 <em>Host ADE43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate12 <em>Host Secondary Disease Death Rate12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate13 <em>Host Secondary Disease Death Rate13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate14 <em>Host Secondary Disease Death Rate14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate21 <em>Host Secondary Disease Death Rate21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate23 <em>Host Secondary Disease Death Rate23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate24 <em>Host Secondary Disease Death Rate24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate31 <em>Host Secondary Disease Death Rate31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate32 <em>Host Secondary Disease Death Rate32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate34 <em>Host Secondary Disease Death Rate34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate41 <em>Host Secondary Disease Death Rate41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate42 <em>Host Secondary Disease Death Rate42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate43 <em>Host Secondary Disease Death Rate43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate12 <em>Host Secondary Recovery Rate12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate13 <em>Host Secondary Recovery Rate13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate14 <em>Host Secondary Recovery Rate14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate21 <em>Host Secondary Recovery Rate21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate23 <em>Host Secondary Recovery Rate23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate24 <em>Host Secondary Recovery Rate24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate31 <em>Host Secondary Recovery Rate31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate32 <em>Host Secondary Recovery Rate32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate34 <em>Host Secondary Recovery Rate34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate41 <em>Host Secondary Recovery Rate41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate42 <em>Host Secondary Recovery Rate42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate43 <em>Host Secondary Recovery Rate43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate12 <em>Host Secondary Incubation Rate12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate13 <em>Host Secondary Incubation Rate13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate14 <em>Host Secondary Incubation Rate14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate21 <em>Host Secondary Incubation Rate21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate23 <em>Host Secondary Incubation Rate23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate24 <em>Host Secondary Incubation Rate24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate31 <em>Host Secondary Incubation Rate31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate32 <em>Host Secondary Incubation Rate32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate34 <em>Host Secondary Incubation Rate34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate41 <em>Host Secondary Incubation Rate41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate42 <em>Host Secondary Incubation Rate42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate43 <em>Host Secondary Incubation Rate43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity1 <em>Vector Infectivity1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity2 <em>Vector Infectivity2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity3 <em>Vector Infectivity3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity4 <em>Vector Infectivity4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE1 <em>Vector ADE1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE2 <em>Vector ADE2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE3 <em>Vector ADE3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE4 <em>Vector ADE4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate1 <em>Vector Incubation Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate2 <em>Vector Incubation Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate3 <em>Vector Incubation Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate4 <em>Vector Incubation Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon1 <em>Episilon1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon2 <em>Episilon2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon3 <em>Episilon3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon4 <em>Episilon4</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel()
 * @model annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/label *='DengueModelHostLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='DengueModelHostLabelValue'"
 * @generated
 */
public interface DengueModel extends AbstractDengueModel {

	/**
	 * Returns the value of the '<em><b>Biting Rate SV</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biting Rate SV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biting Rate SV</em>' attribute.
	 * @see #setBitingRateSV(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_BitingRateSV()
	 * @model default="1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getBitingRateSV();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getBitingRateSV <em>Biting Rate SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biting Rate SV</em>' attribute.
	 * @see #getBitingRateSV()
	 * @generated
	 */
	void setBitingRateSV(double value);

	/**
	 * Returns the value of the '<em><b>Biting Rate IV</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biting Rate IV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biting Rate IV</em>' attribute.
	 * @see #setBitingRateIV(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_BitingRateIV()
	 * @model default="1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getBitingRateIV();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getBitingRateIV <em>Biting Rate IV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biting Rate IV</em>' attribute.
	 * @see #getBitingRateIV()
	 * @generated
	 */
	void setBitingRateIV(double value);

	/**
	 * Returns the value of the '<em><b>Host Infectivity1</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Infectivity1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Infectivity1</em>' attribute.
	 * @see #setHostInfectivity1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostInfectivity1()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getHostInfectivity1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity1 <em>Host Infectivity1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Infectivity1</em>' attribute.
	 * @see #getHostInfectivity1()
	 * @generated
	 */
	void setHostInfectivity1(double value);

	/**
	 * Returns the value of the '<em><b>Host Infectivity2</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Infectivity2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Infectivity2</em>' attribute.
	 * @see #setHostInfectivity2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostInfectivity2()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getHostInfectivity2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity2 <em>Host Infectivity2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Infectivity2</em>' attribute.
	 * @see #getHostInfectivity2()
	 * @generated
	 */
	void setHostInfectivity2(double value);

	/**
	 * Returns the value of the '<em><b>Host Infectivity3</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Infectivity3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Infectivity3</em>' attribute.
	 * @see #setHostInfectivity3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostInfectivity3()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getHostInfectivity3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity3 <em>Host Infectivity3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Infectivity3</em>' attribute.
	 * @see #getHostInfectivity3()
	 * @generated
	 */
	void setHostInfectivity3(double value);

	/**
	 * Returns the value of the '<em><b>Host Infectivity4</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Infectivity4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Infectivity4</em>' attribute.
	 * @see #setHostInfectivity4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostInfectivity4()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getHostInfectivity4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity4 <em>Host Infectivity4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Infectivity4</em>' attribute.
	 * @see #getHostInfectivity4()
	 * @generated
	 */
	void setHostInfectivity4(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Incubation Rate1</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Incubation Rate1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Incubation Rate1</em>' attribute.
	 * @see #setHostPrimaryIncubationRate1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryIncubationRate1()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryIncubationRate1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate1 <em>Host Primary Incubation Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Incubation Rate1</em>' attribute.
	 * @see #getHostPrimaryIncubationRate1()
	 * @generated
	 */
	void setHostPrimaryIncubationRate1(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Incubation Rate2</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Incubation Rate2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Incubation Rate2</em>' attribute.
	 * @see #setHostPrimaryIncubationRate2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryIncubationRate2()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryIncubationRate2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate2 <em>Host Primary Incubation Rate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Incubation Rate2</em>' attribute.
	 * @see #getHostPrimaryIncubationRate2()
	 * @generated
	 */
	void setHostPrimaryIncubationRate2(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Incubation Rate3</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Incubation Rate3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Incubation Rate3</em>' attribute.
	 * @see #setHostPrimaryIncubationRate3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryIncubationRate3()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryIncubationRate3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate3 <em>Host Primary Incubation Rate3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Incubation Rate3</em>' attribute.
	 * @see #getHostPrimaryIncubationRate3()
	 * @generated
	 */
	void setHostPrimaryIncubationRate3(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Incubation Rate4</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Incubation Rate4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Incubation Rate4</em>' attribute.
	 * @see #setHostPrimaryIncubationRate4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryIncubationRate4()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryIncubationRate4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate4 <em>Host Primary Incubation Rate4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Incubation Rate4</em>' attribute.
	 * @see #getHostPrimaryIncubationRate4()
	 * @generated
	 */
	void setHostPrimaryIncubationRate4(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Recovery Rate1</b></em>' attribute.
	 * The default value is <code>"0.14"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Recovery Rate1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Recovery Rate1</em>' attribute.
	 * @see #setHostPrimaryRecoveryRate1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryRecoveryRate1()
	 * @model default="0.14"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryRecoveryRate1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate1 <em>Host Primary Recovery Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Recovery Rate1</em>' attribute.
	 * @see #getHostPrimaryRecoveryRate1()
	 * @generated
	 */
	void setHostPrimaryRecoveryRate1(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Recovery Rate2</b></em>' attribute.
	 * The default value is <code>"0.14"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Recovery Rate2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Recovery Rate2</em>' attribute.
	 * @see #setHostPrimaryRecoveryRate2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryRecoveryRate2()
	 * @model default="0.14"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryRecoveryRate2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate2 <em>Host Primary Recovery Rate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Recovery Rate2</em>' attribute.
	 * @see #getHostPrimaryRecoveryRate2()
	 * @generated
	 */
	void setHostPrimaryRecoveryRate2(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Recovery Rate3</b></em>' attribute.
	 * The default value is <code>"0.14"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Recovery Rate3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Recovery Rate3</em>' attribute.
	 * @see #setHostPrimaryRecoveryRate3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryRecoveryRate3()
	 * @model default="0.14"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryRecoveryRate3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate3 <em>Host Primary Recovery Rate3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Recovery Rate3</em>' attribute.
	 * @see #getHostPrimaryRecoveryRate3()
	 * @generated
	 */
	void setHostPrimaryRecoveryRate3(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Recovery Rate4</b></em>' attribute.
	 * The default value is <code>"0.14"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Recovery Rate4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Recovery Rate4</em>' attribute.
	 * @see #setHostPrimaryRecoveryRate4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryRecoveryRate4()
	 * @model default="0.14"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryRecoveryRate4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate4 <em>Host Primary Recovery Rate4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Recovery Rate4</em>' attribute.
	 * @see #getHostPrimaryRecoveryRate4()
	 * @generated
	 */
	void setHostPrimaryRecoveryRate4(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Immunity Loss Rate1</b></em>' attribute.
	 * The default value is <code>"0.024"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Immunity Loss Rate1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Immunity Loss Rate1</em>' attribute.
	 * @see #setHostPrimaryImmunityLossRate1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryImmunityLossRate1()
	 * @model default="0.024"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryImmunityLossRate1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate1 <em>Host Primary Immunity Loss Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Immunity Loss Rate1</em>' attribute.
	 * @see #getHostPrimaryImmunityLossRate1()
	 * @generated
	 */
	void setHostPrimaryImmunityLossRate1(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Immunity Loss Rate2</b></em>' attribute.
	 * The default value is <code>"0.024"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Immunity Loss Rate2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Immunity Loss Rate2</em>' attribute.
	 * @see #setHostPrimaryImmunityLossRate2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryImmunityLossRate2()
	 * @model default="0.024"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryImmunityLossRate2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate2 <em>Host Primary Immunity Loss Rate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Immunity Loss Rate2</em>' attribute.
	 * @see #getHostPrimaryImmunityLossRate2()
	 * @generated
	 */
	void setHostPrimaryImmunityLossRate2(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Immunity Loss Rate3</b></em>' attribute.
	 * The default value is <code>"0.024"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Immunity Loss Rate3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Immunity Loss Rate3</em>' attribute.
	 * @see #setHostPrimaryImmunityLossRate3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryImmunityLossRate3()
	 * @model default="0.024"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryImmunityLossRate3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate3 <em>Host Primary Immunity Loss Rate3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Immunity Loss Rate3</em>' attribute.
	 * @see #getHostPrimaryImmunityLossRate3()
	 * @generated
	 */
	void setHostPrimaryImmunityLossRate3(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Immunity Loss Rate4</b></em>' attribute.
	 * The default value is <code>"0.024"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Immunity Loss Rate4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Immunity Loss Rate4</em>' attribute.
	 * @see #setHostPrimaryImmunityLossRate4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryImmunityLossRate4()
	 * @model default="0.024"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryImmunityLossRate4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate4 <em>Host Primary Immunity Loss Rate4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Immunity Loss Rate4</em>' attribute.
	 * @see #getHostPrimaryImmunityLossRate4()
	 * @generated
	 */
	void setHostPrimaryImmunityLossRate4(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Disease Death Rate1</b></em>' attribute.
	 * The default value is <code>"0.0000001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Disease Death Rate1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Disease Death Rate1</em>' attribute.
	 * @see #setHostPrimaryDiseaseDeathRate1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryDiseaseDeathRate1()
	 * @model default="0.0000001"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryDiseaseDeathRate1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate1 <em>Host Primary Disease Death Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Disease Death Rate1</em>' attribute.
	 * @see #getHostPrimaryDiseaseDeathRate1()
	 * @generated
	 */
	void setHostPrimaryDiseaseDeathRate1(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Disease Death Rate2</b></em>' attribute.
	 * The default value is <code>"0.0000001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Disease Death Rate2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Disease Death Rate2</em>' attribute.
	 * @see #setHostPrimaryDiseaseDeathRate2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryDiseaseDeathRate2()
	 * @model default="0.0000001"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryDiseaseDeathRate2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate2 <em>Host Primary Disease Death Rate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Disease Death Rate2</em>' attribute.
	 * @see #getHostPrimaryDiseaseDeathRate2()
	 * @generated
	 */
	void setHostPrimaryDiseaseDeathRate2(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Disease Death Rate3</b></em>' attribute.
	 * The default value is <code>"0.0000001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Disease Death Rate3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Disease Death Rate3</em>' attribute.
	 * @see #setHostPrimaryDiseaseDeathRate3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryDiseaseDeathRate3()
	 * @model default="0.0000001"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryDiseaseDeathRate3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate3 <em>Host Primary Disease Death Rate3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Disease Death Rate3</em>' attribute.
	 * @see #getHostPrimaryDiseaseDeathRate3()
	 * @generated
	 */
	void setHostPrimaryDiseaseDeathRate3(double value);

	/**
	 * Returns the value of the '<em><b>Host Primary Disease Death Rate4</b></em>' attribute.
	 * The default value is <code>"0.0000001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Primary Disease Death Rate4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Primary Disease Death Rate4</em>' attribute.
	 * @see #setHostPrimaryDiseaseDeathRate4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostPrimaryDiseaseDeathRate4()
	 * @model default="0.0000001"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostPrimaryDiseaseDeathRate4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate4 <em>Host Primary Disease Death Rate4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Primary Disease Death Rate4</em>' attribute.
	 * @see #getHostPrimaryDiseaseDeathRate4()
	 * @generated
	 */
	void setHostPrimaryDiseaseDeathRate4(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE12</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE12</em>' attribute.
	 * @see #setHostADE12(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE12()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE12();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE12 <em>Host ADE12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE12</em>' attribute.
	 * @see #getHostADE12()
	 * @generated
	 */
	void setHostADE12(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE13</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE13</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE13</em>' attribute.
	 * @see #setHostADE13(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE13()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE13();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE13 <em>Host ADE13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE13</em>' attribute.
	 * @see #getHostADE13()
	 * @generated
	 */
	void setHostADE13(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE14</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE14</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE14</em>' attribute.
	 * @see #setHostADE14(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE14()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE14();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE14 <em>Host ADE14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE14</em>' attribute.
	 * @see #getHostADE14()
	 * @generated
	 */
	void setHostADE14(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE21</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE21</em>' attribute.
	 * @see #setHostADE21(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE21()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE21();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE21 <em>Host ADE21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE21</em>' attribute.
	 * @see #getHostADE21()
	 * @generated
	 */
	void setHostADE21(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE23</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE23</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE23</em>' attribute.
	 * @see #setHostADE23(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE23()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE23();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE23 <em>Host ADE23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE23</em>' attribute.
	 * @see #getHostADE23()
	 * @generated
	 */
	void setHostADE23(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE24</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE24</em>' attribute.
	 * @see #setHostADE24(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE24()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE24();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE24 <em>Host ADE24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE24</em>' attribute.
	 * @see #getHostADE24()
	 * @generated
	 */
	void setHostADE24(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE31</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE31</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE31</em>' attribute.
	 * @see #setHostADE31(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE31()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE31();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE31 <em>Host ADE31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE31</em>' attribute.
	 * @see #getHostADE31()
	 * @generated
	 */
	void setHostADE31(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE32</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE32</em>' attribute.
	 * @see #setHostADE32(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE32()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE32();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE32 <em>Host ADE32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE32</em>' attribute.
	 * @see #getHostADE32()
	 * @generated
	 */
	void setHostADE32(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE34</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE34</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE34</em>' attribute.
	 * @see #setHostADE34(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE34()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE34();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE34 <em>Host ADE34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE34</em>' attribute.
	 * @see #getHostADE34()
	 * @generated
	 */
	void setHostADE34(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE41</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE41</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE41</em>' attribute.
	 * @see #setHostADE41(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE41()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE41();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE41 <em>Host ADE41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE41</em>' attribute.
	 * @see #getHostADE41()
	 * @generated
	 */
	void setHostADE41(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE42</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE42</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE42</em>' attribute.
	 * @see #setHostADE42(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE42()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE42();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE42 <em>Host ADE42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE42</em>' attribute.
	 * @see #getHostADE42()
	 * @generated
	 */
	void setHostADE42(double value);

	/**
	 * Returns the value of the '<em><b>Host ADE43</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ADE43</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ADE43</em>' attribute.
	 * @see #setHostADE43(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostADE43()
	 * @model default="1.8"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostADE43();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE43 <em>Host ADE43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ADE43</em>' attribute.
	 * @see #getHostADE43()
	 * @generated
	 */
	void setHostADE43(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate12</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate12</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate12(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate12()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate12();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate12 <em>Host Secondary Disease Death Rate12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate12</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate12()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate12(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate13</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate13</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate13</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate13(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate13()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate13();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate13 <em>Host Secondary Disease Death Rate13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate13</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate13()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate13(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate14</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate14</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate14</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate14(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate14()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate14();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate14 <em>Host Secondary Disease Death Rate14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate14</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate14()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate14(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate21</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate21</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate21(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate21()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate21();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate21 <em>Host Secondary Disease Death Rate21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate21</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate21()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate21(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate23</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate23</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate23</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate23(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate23()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate23();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate23 <em>Host Secondary Disease Death Rate23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate23</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate23()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate23(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate24</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate24</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate24(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate24()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate24();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate24 <em>Host Secondary Disease Death Rate24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate24</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate24()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate24(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate31</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate31</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate31</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate31(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate31()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate31();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate31 <em>Host Secondary Disease Death Rate31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate31</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate31()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate31(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate32</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate32</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate32(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate32()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate32();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate32 <em>Host Secondary Disease Death Rate32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate32</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate32()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate32(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate34</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate34</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate34</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate34(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate34()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate34();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate34 <em>Host Secondary Disease Death Rate34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate34</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate34()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate34(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate41</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate41</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate41</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate41(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate41()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate41();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate41 <em>Host Secondary Disease Death Rate41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate41</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate41()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate41(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate42</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate42</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate42</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate42(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate42()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate42();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate42 <em>Host Secondary Disease Death Rate42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate42</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate42()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate42(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Disease Death Rate43</b></em>' attribute.
	 * The default value is <code>"0.00123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Disease Death Rate43</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Disease Death Rate43</em>' attribute.
	 * @see #setHostSecondaryDiseaseDeathRate43(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryDiseaseDeathRate43()
	 * @model default="0.00123"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryDiseaseDeathRate43();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate43 <em>Host Secondary Disease Death Rate43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Disease Death Rate43</em>' attribute.
	 * @see #getHostSecondaryDiseaseDeathRate43()
	 * @generated
	 */
	void setHostSecondaryDiseaseDeathRate43(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate12</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate12</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate12(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate12()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate12();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate12 <em>Host Secondary Recovery Rate12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate12</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate12()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate12(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate13</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate13</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate13</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate13(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate13()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate13();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate13 <em>Host Secondary Recovery Rate13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate13</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate13()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate13(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate14</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate14</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate14</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate14(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate14()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate14();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate14 <em>Host Secondary Recovery Rate14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate14</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate14()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate14(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate21</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate21</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate21(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate21()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate21();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate21 <em>Host Secondary Recovery Rate21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate21</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate21()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate21(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate23</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate23</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate23</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate23(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate23()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate23();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate23 <em>Host Secondary Recovery Rate23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate23</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate23()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate23(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate24</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate24</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate24(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate24()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate24();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate24 <em>Host Secondary Recovery Rate24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate24</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate24()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate24(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate31</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate31</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate31</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate31(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate31()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate31();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate31 <em>Host Secondary Recovery Rate31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate31</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate31()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate31(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate32</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate32</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate32(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate32()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate32();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate32 <em>Host Secondary Recovery Rate32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate32</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate32()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate32(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate34</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate34</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate34</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate34(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate34()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate34();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate34 <em>Host Secondary Recovery Rate34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate34</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate34()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate34(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate41</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate41</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate41</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate41(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate41()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate41();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate41 <em>Host Secondary Recovery Rate41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate41</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate41()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate41(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate42</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate42</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate42</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate42(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate42()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate42();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate42 <em>Host Secondary Recovery Rate42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate42</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate42()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate42(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Recovery Rate43</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Recovery Rate43</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Recovery Rate43</em>' attribute.
	 * @see #setHostSecondaryRecoveryRate43(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryRecoveryRate43()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryRecoveryRate43();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate43 <em>Host Secondary Recovery Rate43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Recovery Rate43</em>' attribute.
	 * @see #getHostSecondaryRecoveryRate43()
	 * @generated
	 */
	void setHostSecondaryRecoveryRate43(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate12</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate12</em>' attribute.
	 * @see #setHostSecondaryIncubationRate12(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate12()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate12();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate12 <em>Host Secondary Incubation Rate12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate12</em>' attribute.
	 * @see #getHostSecondaryIncubationRate12()
	 * @generated
	 */
	void setHostSecondaryIncubationRate12(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate13</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate13</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate13</em>' attribute.
	 * @see #setHostSecondaryIncubationRate13(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate13()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate13();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate13 <em>Host Secondary Incubation Rate13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate13</em>' attribute.
	 * @see #getHostSecondaryIncubationRate13()
	 * @generated
	 */
	void setHostSecondaryIncubationRate13(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate14</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate14</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate14</em>' attribute.
	 * @see #setHostSecondaryIncubationRate14(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate14()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate14();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate14 <em>Host Secondary Incubation Rate14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate14</em>' attribute.
	 * @see #getHostSecondaryIncubationRate14()
	 * @generated
	 */
	void setHostSecondaryIncubationRate14(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate21</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate21</em>' attribute.
	 * @see #setHostSecondaryIncubationRate21(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate21()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate21();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate21 <em>Host Secondary Incubation Rate21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate21</em>' attribute.
	 * @see #getHostSecondaryIncubationRate21()
	 * @generated
	 */
	void setHostSecondaryIncubationRate21(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate23</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate23</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate23</em>' attribute.
	 * @see #setHostSecondaryIncubationRate23(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate23()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate23();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate23 <em>Host Secondary Incubation Rate23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate23</em>' attribute.
	 * @see #getHostSecondaryIncubationRate23()
	 * @generated
	 */
	void setHostSecondaryIncubationRate23(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate24</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate24</em>' attribute.
	 * @see #setHostSecondaryIncubationRate24(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate24()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate24();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate24 <em>Host Secondary Incubation Rate24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate24</em>' attribute.
	 * @see #getHostSecondaryIncubationRate24()
	 * @generated
	 */
	void setHostSecondaryIncubationRate24(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate31</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate31</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate31</em>' attribute.
	 * @see #setHostSecondaryIncubationRate31(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate31()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate31();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate31 <em>Host Secondary Incubation Rate31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate31</em>' attribute.
	 * @see #getHostSecondaryIncubationRate31()
	 * @generated
	 */
	void setHostSecondaryIncubationRate31(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate32</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate32</em>' attribute.
	 * @see #setHostSecondaryIncubationRate32(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate32()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate32();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate32 <em>Host Secondary Incubation Rate32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate32</em>' attribute.
	 * @see #getHostSecondaryIncubationRate32()
	 * @generated
	 */
	void setHostSecondaryIncubationRate32(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate34</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate34</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate34</em>' attribute.
	 * @see #setHostSecondaryIncubationRate34(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate34()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate34();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate34 <em>Host Secondary Incubation Rate34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate34</em>' attribute.
	 * @see #getHostSecondaryIncubationRate34()
	 * @generated
	 */
	void setHostSecondaryIncubationRate34(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate41</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate41</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate41</em>' attribute.
	 * @see #setHostSecondaryIncubationRate41(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate41()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate41();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate41 <em>Host Secondary Incubation Rate41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate41</em>' attribute.
	 * @see #getHostSecondaryIncubationRate41()
	 * @generated
	 */
	void setHostSecondaryIncubationRate41(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate42</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate42</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate42</em>' attribute.
	 * @see #setHostSecondaryIncubationRate42(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate42()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate42();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate42 <em>Host Secondary Incubation Rate42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate42</em>' attribute.
	 * @see #getHostSecondaryIncubationRate42()
	 * @generated
	 */
	void setHostSecondaryIncubationRate42(double value);

	/**
	 * Returns the value of the '<em><b>Host Secondary Incubation Rate43</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Secondary Incubation Rate43</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Secondary Incubation Rate43</em>' attribute.
	 * @see #setHostSecondaryIncubationRate43(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_HostSecondaryIncubationRate43()
	 * @model default="0.2"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getHostSecondaryIncubationRate43();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate43 <em>Host Secondary Incubation Rate43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Secondary Incubation Rate43</em>' attribute.
	 * @see #getHostSecondaryIncubationRate43()
	 * @generated
	 */
	void setHostSecondaryIncubationRate43(double value);

	/**
	 * Returns the value of the '<em><b>Vector Infectivity1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Infectivity1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Infectivity1</em>' attribute.
	 * @see #setVectorInfectivity1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorInfectivity1()
	 * @model default="1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getVectorInfectivity1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity1 <em>Vector Infectivity1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Infectivity1</em>' attribute.
	 * @see #getVectorInfectivity1()
	 * @generated
	 */
	void setVectorInfectivity1(double value);

	/**
	 * Returns the value of the '<em><b>Vector Infectivity2</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Infectivity2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Infectivity2</em>' attribute.
	 * @see #setVectorInfectivity2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorInfectivity2()
	 * @model default="1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getVectorInfectivity2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity2 <em>Vector Infectivity2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Infectivity2</em>' attribute.
	 * @see #getVectorInfectivity2()
	 * @generated
	 */
	void setVectorInfectivity2(double value);

	/**
	 * Returns the value of the '<em><b>Vector Infectivity3</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Infectivity3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Infectivity3</em>' attribute.
	 * @see #setVectorInfectivity3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorInfectivity3()
	 * @model default="1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getVectorInfectivity3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity3 <em>Vector Infectivity3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Infectivity3</em>' attribute.
	 * @see #getVectorInfectivity3()
	 * @generated
	 */
	void setVectorInfectivity3(double value);

	/**
	 * Returns the value of the '<em><b>Vector Infectivity4</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Infectivity4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Infectivity4</em>' attribute.
	 * @see #setVectorInfectivity4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorInfectivity4()
	 * @model default="1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getVectorInfectivity4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity4 <em>Vector Infectivity4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Infectivity4</em>' attribute.
	 * @see #getVectorInfectivity4()
	 * @generated
	 */
	void setVectorInfectivity4(double value);

	/**
	 * Returns the value of the '<em><b>Vector ADE1</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector ADE1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector ADE1</em>' attribute.
	 * @see #setVectorADE1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorADE1()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorADE1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE1 <em>Vector ADE1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector ADE1</em>' attribute.
	 * @see #getVectorADE1()
	 * @generated
	 */
	void setVectorADE1(double value);

	/**
	 * Returns the value of the '<em><b>Vector ADE2</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector ADE2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector ADE2</em>' attribute.
	 * @see #setVectorADE2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorADE2()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorADE2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE2 <em>Vector ADE2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector ADE2</em>' attribute.
	 * @see #getVectorADE2()
	 * @generated
	 */
	void setVectorADE2(double value);

	/**
	 * Returns the value of the '<em><b>Vector ADE3</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector ADE3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector ADE3</em>' attribute.
	 * @see #setVectorADE3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorADE3()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorADE3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE3 <em>Vector ADE3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector ADE3</em>' attribute.
	 * @see #getVectorADE3()
	 * @generated
	 */
	void setVectorADE3(double value);

	/**
	 * Returns the value of the '<em><b>Vector ADE4</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector ADE4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector ADE4</em>' attribute.
	 * @see #setVectorADE4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorADE4()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorADE4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE4 <em>Vector ADE4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector ADE4</em>' attribute.
	 * @see #getVectorADE4()
	 * @generated
	 */
	void setVectorADE4(double value);

	/**
	 * Returns the value of the '<em><b>Vector Incubation Rate1</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Incubation Rate1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Incubation Rate1</em>' attribute.
	 * @see #setVectorIncubationRate1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorIncubationRate1()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorIncubationRate1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate1 <em>Vector Incubation Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Incubation Rate1</em>' attribute.
	 * @see #getVectorIncubationRate1()
	 * @generated
	 */
	void setVectorIncubationRate1(double value);

	/**
	 * Returns the value of the '<em><b>Vector Incubation Rate2</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Incubation Rate2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Incubation Rate2</em>' attribute.
	 * @see #setVectorIncubationRate2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorIncubationRate2()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorIncubationRate2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate2 <em>Vector Incubation Rate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Incubation Rate2</em>' attribute.
	 * @see #getVectorIncubationRate2()
	 * @generated
	 */
	void setVectorIncubationRate2(double value);

	/**
	 * Returns the value of the '<em><b>Vector Incubation Rate3</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Incubation Rate3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Incubation Rate3</em>' attribute.
	 * @see #setVectorIncubationRate3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorIncubationRate3()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorIncubationRate3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate3 <em>Vector Incubation Rate3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Incubation Rate3</em>' attribute.
	 * @see #getVectorIncubationRate3()
	 * @generated
	 */
	void setVectorIncubationRate3(double value);

	/**
	 * Returns the value of the '<em><b>Vector Incubation Rate4</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Incubation Rate4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Incubation Rate4</em>' attribute.
	 * @see #setVectorIncubationRate4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_VectorIncubationRate4()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorIncubationRate4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate4 <em>Vector Incubation Rate4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Incubation Rate4</em>' attribute.
	 * @see #getVectorIncubationRate4()
	 * @generated
	 */
	void setVectorIncubationRate4(double value);

	/**
	 * Returns the value of the '<em><b>Episilon1</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Episilon1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episilon1</em>' attribute.
	 * @see #setEpisilon1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_Episilon1()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getEpisilon1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon1 <em>Episilon1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episilon1</em>' attribute.
	 * @see #getEpisilon1()
	 * @generated
	 */
	void setEpisilon1(double value);

	/**
	 * Returns the value of the '<em><b>Episilon2</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Episilon2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episilon2</em>' attribute.
	 * @see #setEpisilon2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_Episilon2()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getEpisilon2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon2 <em>Episilon2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episilon2</em>' attribute.
	 * @see #getEpisilon2()
	 * @generated
	 */
	void setEpisilon2(double value);

	/**
	 * Returns the value of the '<em><b>Episilon3</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Episilon3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episilon3</em>' attribute.
	 * @see #setEpisilon3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_Episilon3()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getEpisilon3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon3 <em>Episilon3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episilon3</em>' attribute.
	 * @see #getEpisilon3()
	 * @generated
	 */
	void setEpisilon3(double value);

	/**
	 * Returns the value of the '<em><b>Episilon4</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Episilon4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episilon4</em>' attribute.
	 * @see #setEpisilon4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModel_Episilon4()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getEpisilon4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon4 <em>Episilon4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episilon4</em>' attribute.
	 * @see #getEpisilon4()
	 * @generated
	 */
	void setEpisilon4(double value);
} // DengueModel
