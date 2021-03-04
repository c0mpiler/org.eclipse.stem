package org.eclipse.stem.diseasemodels.vector.impl;

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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.math.BinomialDistributionUtil;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.vector.DengueModel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dengue Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getBitingRateSV <em>Biting Rate SV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getBitingRateIV <em>Biting Rate IV</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostInfectivity1 <em>Host Infectivity1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostInfectivity2 <em>Host Infectivity2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostInfectivity3 <em>Host Infectivity3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostInfectivity4 <em>Host Infectivity4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryIncubationRate1 <em>Host Primary Incubation Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryIncubationRate2 <em>Host Primary Incubation Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryIncubationRate3 <em>Host Primary Incubation Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryIncubationRate4 <em>Host Primary Incubation Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryRecoveryRate1 <em>Host Primary Recovery Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryRecoveryRate2 <em>Host Primary Recovery Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryRecoveryRate3 <em>Host Primary Recovery Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryRecoveryRate4 <em>Host Primary Recovery Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryImmunityLossRate1 <em>Host Primary Immunity Loss Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryImmunityLossRate2 <em>Host Primary Immunity Loss Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryImmunityLossRate3 <em>Host Primary Immunity Loss Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryImmunityLossRate4 <em>Host Primary Immunity Loss Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryDiseaseDeathRate1 <em>Host Primary Disease Death Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryDiseaseDeathRate2 <em>Host Primary Disease Death Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryDiseaseDeathRate3 <em>Host Primary Disease Death Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostPrimaryDiseaseDeathRate4 <em>Host Primary Disease Death Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE12 <em>Host ADE12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE13 <em>Host ADE13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE14 <em>Host ADE14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE21 <em>Host ADE21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE23 <em>Host ADE23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE24 <em>Host ADE24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE31 <em>Host ADE31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE32 <em>Host ADE32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE34 <em>Host ADE34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE41 <em>Host ADE41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE42 <em>Host ADE42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostADE43 <em>Host ADE43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate12 <em>Host Secondary Disease Death Rate12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate13 <em>Host Secondary Disease Death Rate13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate14 <em>Host Secondary Disease Death Rate14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate21 <em>Host Secondary Disease Death Rate21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate23 <em>Host Secondary Disease Death Rate23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate24 <em>Host Secondary Disease Death Rate24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate31 <em>Host Secondary Disease Death Rate31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate32 <em>Host Secondary Disease Death Rate32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate34 <em>Host Secondary Disease Death Rate34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate41 <em>Host Secondary Disease Death Rate41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate42 <em>Host Secondary Disease Death Rate42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryDiseaseDeathRate43 <em>Host Secondary Disease Death Rate43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate12 <em>Host Secondary Recovery Rate12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate13 <em>Host Secondary Recovery Rate13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate14 <em>Host Secondary Recovery Rate14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate21 <em>Host Secondary Recovery Rate21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate23 <em>Host Secondary Recovery Rate23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate24 <em>Host Secondary Recovery Rate24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate31 <em>Host Secondary Recovery Rate31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate32 <em>Host Secondary Recovery Rate32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate34 <em>Host Secondary Recovery Rate34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate41 <em>Host Secondary Recovery Rate41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate42 <em>Host Secondary Recovery Rate42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryRecoveryRate43 <em>Host Secondary Recovery Rate43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate12 <em>Host Secondary Incubation Rate12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate13 <em>Host Secondary Incubation Rate13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate14 <em>Host Secondary Incubation Rate14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate21 <em>Host Secondary Incubation Rate21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate23 <em>Host Secondary Incubation Rate23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate24 <em>Host Secondary Incubation Rate24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate31 <em>Host Secondary Incubation Rate31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate32 <em>Host Secondary Incubation Rate32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate34 <em>Host Secondary Incubation Rate34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate41 <em>Host Secondary Incubation Rate41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate42 <em>Host Secondary Incubation Rate42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getHostSecondaryIncubationRate43 <em>Host Secondary Incubation Rate43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorInfectivity1 <em>Vector Infectivity1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorInfectivity2 <em>Vector Infectivity2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorInfectivity3 <em>Vector Infectivity3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorInfectivity4 <em>Vector Infectivity4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorADE1 <em>Vector ADE1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorADE2 <em>Vector ADE2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorADE3 <em>Vector ADE3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorADE4 <em>Vector ADE4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorIncubationRate1 <em>Vector Incubation Rate1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorIncubationRate2 <em>Vector Incubation Rate2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorIncubationRate3 <em>Vector Incubation Rate3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getVectorIncubationRate4 <em>Vector Incubation Rate4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getEpisilon1 <em>Episilon1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getEpisilon2 <em>Episilon2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getEpisilon3 <em>Episilon3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl#getEpisilon4 <em>Episilon4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DengueModelImpl extends AbstractDengueModelImpl implements
DengueModel {
	/**
	 * The default value of the '{@link #getBitingRateSV() <em>Biting Rate SV</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBitingRateSV()
	 * @generated
	 * @ordered
	 */
	protected static final double BITING_RATE_SV_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getBitingRateSV() <em>Biting Rate SV</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBitingRateSV()
	 * @generated
	 * @ordered
	 */
	protected double bitingRateSV = BITING_RATE_SV_EDEFAULT;
	/**
	 * The default value of the '{@link #getBitingRateIV() <em>Biting Rate IV</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBitingRateIV()
	 * @generated
	 * @ordered
	 */
	protected static final double BITING_RATE_IV_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getBitingRateIV() <em>Biting Rate IV</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBitingRateIV()
	 * @generated
	 * @ordered
	 */
	protected double bitingRateIV = BITING_RATE_IV_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostInfectivity1() <em>Host Infectivity1</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHostInfectivity1()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_INFECTIVITY1_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getHostInfectivity1() <em>Host Infectivity1</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHostInfectivity1()
	 * @generated
	 * @ordered
	 */
	protected double hostTransimissionRate1 = HOST_INFECTIVITY1_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostInfectivity2() <em>Host Infectivity2</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHostInfectivity2()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_INFECTIVITY2_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getHostInfectivity2() <em>Host Infectivity2</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHostInfectivity2()
	 * @generated
	 * @ordered
	 */
	protected double hostInfectivity2 = HOST_INFECTIVITY2_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostInfectivity3() <em>Host Infectivity3</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHostInfectivity3()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_INFECTIVITY3_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getHostInfectivity3() <em>Host Infectivity3</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHostInfectivity3()
	 * @generated
	 * @ordered
	 */
	protected double hostInfectivity3 = HOST_INFECTIVITY3_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostInfectivity4() <em>Host Infectivity4</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHostInfectivity4()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_INFECTIVITY4_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getHostInfectivity4() <em>Host Infectivity4</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHostInfectivity4()
	 * @generated
	 * @ordered
	 */
	protected double hostInfectivity4 = HOST_INFECTIVITY4_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryIncubationRate1() <em>Host Primary Incubation Rate1</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostPrimaryIncubationRate1()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_INCUBATION_RATE1_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostPrimaryIncubationRate1() <em>Host Primary Incubation Rate1</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostPrimaryIncubationRate1()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryIncubationRate1 = HOST_PRIMARY_INCUBATION_RATE1_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryIncubationRate2() <em>Host Primary Incubation Rate2</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostPrimaryIncubationRate2()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_INCUBATION_RATE2_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostPrimaryIncubationRate2() <em>Host Primary Incubation Rate2</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostPrimaryIncubationRate2()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryIncubationRate2 = HOST_PRIMARY_INCUBATION_RATE2_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryIncubationRate3() <em>Host Primary Incubation Rate3</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostPrimaryIncubationRate3()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_INCUBATION_RATE3_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostPrimaryIncubationRate3() <em>Host Primary Incubation Rate3</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostPrimaryIncubationRate3()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryIncubationRate3 = HOST_PRIMARY_INCUBATION_RATE3_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryIncubationRate4() <em>Host Primary Incubation Rate4</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostPrimaryIncubationRate4()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_INCUBATION_RATE4_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostPrimaryIncubationRate4() <em>Host Primary Incubation Rate4</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostPrimaryIncubationRate4()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryIncubationRate4 = HOST_PRIMARY_INCUBATION_RATE4_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryRecoveryRate1() <em>Host Primary Recovery Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPrimaryRecoveryRate1()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_RECOVERY_RATE1_EDEFAULT = 0.14;
	/**
	 * The cached value of the '{@link #getHostPrimaryRecoveryRate1() <em>Host Primary Recovery Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPrimaryRecoveryRate1()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryRecoveryRate1 = HOST_PRIMARY_RECOVERY_RATE1_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryRecoveryRate2() <em>Host Primary Recovery Rate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPrimaryRecoveryRate2()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_RECOVERY_RATE2_EDEFAULT = 0.14;
	/**
	 * The cached value of the '{@link #getHostPrimaryRecoveryRate2() <em>Host Primary Recovery Rate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPrimaryRecoveryRate2()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryRecoveryRate2 = HOST_PRIMARY_RECOVERY_RATE2_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryRecoveryRate3() <em>Host Primary Recovery Rate3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPrimaryRecoveryRate3()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_RECOVERY_RATE3_EDEFAULT = 0.14;
	/**
	 * The cached value of the '{@link #getHostPrimaryRecoveryRate3() <em>Host Primary Recovery Rate3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPrimaryRecoveryRate3()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryRecoveryRate3 = HOST_PRIMARY_RECOVERY_RATE3_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryRecoveryRate4() <em>Host Primary Recovery Rate4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPrimaryRecoveryRate4()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_RECOVERY_RATE4_EDEFAULT = 0.14;
	/**
	 * The cached value of the '{@link #getHostPrimaryRecoveryRate4() <em>Host Primary Recovery Rate4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPrimaryRecoveryRate4()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryRecoveryRate4 = HOST_PRIMARY_RECOVERY_RATE4_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryImmunityLossRate1()
	 * <em>Host Primary Immunity Loss Rate1</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryImmunityLossRate1()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_IMMUNITY_LOSS_RATE1_EDEFAULT = 0.024;
	/**
	 * The cached value of the '{@link #getHostPrimaryImmunityLossRate1()
	 * <em>Host Primary Immunity Loss Rate1</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryImmunityLossRate1()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryImmunityLossRate1 = HOST_PRIMARY_IMMUNITY_LOSS_RATE1_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryImmunityLossRate2()
	 * <em>Host Primary Immunity Loss Rate2</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryImmunityLossRate2()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_IMMUNITY_LOSS_RATE2_EDEFAULT = 0.024;
	/**
	 * The cached value of the '{@link #getHostPrimaryImmunityLossRate2()
	 * <em>Host Primary Immunity Loss Rate2</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryImmunityLossRate2()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryImmunityLossRate2 = HOST_PRIMARY_IMMUNITY_LOSS_RATE2_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryImmunityLossRate3()
	 * <em>Host Primary Immunity Loss Rate3</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryImmunityLossRate3()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_IMMUNITY_LOSS_RATE3_EDEFAULT = 0.024;
	/**
	 * The cached value of the '{@link #getHostPrimaryImmunityLossRate3()
	 * <em>Host Primary Immunity Loss Rate3</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryImmunityLossRate3()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryImmunityLossRate3 = HOST_PRIMARY_IMMUNITY_LOSS_RATE3_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryImmunityLossRate4()
	 * <em>Host Primary Immunity Loss Rate4</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryImmunityLossRate4()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_IMMUNITY_LOSS_RATE4_EDEFAULT = 0.024;
	/**
	 * The cached value of the '{@link #getHostPrimaryImmunityLossRate4()
	 * <em>Host Primary Immunity Loss Rate4</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryImmunityLossRate4()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryImmunityLossRate4 = HOST_PRIMARY_IMMUNITY_LOSS_RATE4_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryDiseaseDeathRate1()
	 * <em>Host Primary Disease Death Rate1</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryDiseaseDeathRate1()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_DISEASE_DEATH_RATE1_EDEFAULT = 1.0E-7;
	/**
	 * The cached value of the '{@link #getHostPrimaryDiseaseDeathRate1()
	 * <em>Host Primary Disease Death Rate1</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryDiseaseDeathRate1()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryDiseaseDeathRate1 = HOST_PRIMARY_DISEASE_DEATH_RATE1_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryDiseaseDeathRate2()
	 * <em>Host Primary Disease Death Rate2</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryDiseaseDeathRate2()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_DISEASE_DEATH_RATE2_EDEFAULT = 1.0E-7;
	/**
	 * The cached value of the '{@link #getHostPrimaryDiseaseDeathRate2()
	 * <em>Host Primary Disease Death Rate2</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryDiseaseDeathRate2()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryDiseaseDeathRate2 = HOST_PRIMARY_DISEASE_DEATH_RATE2_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryDiseaseDeathRate3()
	 * <em>Host Primary Disease Death Rate3</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryDiseaseDeathRate3()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_DISEASE_DEATH_RATE3_EDEFAULT = 1.0E-7;
	/**
	 * The cached value of the '{@link #getHostPrimaryDiseaseDeathRate3()
	 * <em>Host Primary Disease Death Rate3</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryDiseaseDeathRate3()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryDiseaseDeathRate3 = HOST_PRIMARY_DISEASE_DEATH_RATE3_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPrimaryDiseaseDeathRate4()
	 * <em>Host Primary Disease Death Rate4</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryDiseaseDeathRate4()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_PRIMARY_DISEASE_DEATH_RATE4_EDEFAULT = 1.0E-7;
	/**
	 * The cached value of the '{@link #getHostPrimaryDiseaseDeathRate4()
	 * <em>Host Primary Disease Death Rate4</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostPrimaryDiseaseDeathRate4()
	 * @generated
	 * @ordered
	 */
	protected double hostPrimaryDiseaseDeathRate4 = HOST_PRIMARY_DISEASE_DEATH_RATE4_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE12() <em>Host ADE12</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE12()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE12_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE12() <em>Host ADE12</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE12()
	 * @generated
	 * @ordered
	 */
	protected double hostADE12 = HOST_ADE12_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE13() <em>Host ADE13</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE13()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE13_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE13() <em>Host ADE13</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE13()
	 * @generated
	 * @ordered
	 */
	protected double hostADE13 = HOST_ADE13_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE14() <em>Host ADE14</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE14()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE14_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE14() <em>Host ADE14</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE14()
	 * @generated
	 * @ordered
	 */
	protected double hostADE14 = HOST_ADE14_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE21() <em>Host ADE21</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE21()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE21_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE21() <em>Host ADE21</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE21()
	 * @generated
	 * @ordered
	 */
	protected double hostADE21 = HOST_ADE21_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE23() <em>Host ADE23</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE23()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE23_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE23() <em>Host ADE23</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE23()
	 * @generated
	 * @ordered
	 */
	protected double hostADE23 = HOST_ADE23_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE24() <em>Host ADE24</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE24()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE24_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE24() <em>Host ADE24</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE24()
	 * @generated
	 * @ordered
	 */
	protected double hostADE24 = HOST_ADE24_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE31() <em>Host ADE31</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE31()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE31_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE31() <em>Host ADE31</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE31()
	 * @generated
	 * @ordered
	 */
	protected double hostADE31 = HOST_ADE31_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE32() <em>Host ADE32</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE32()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE32_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE32() <em>Host ADE32</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE32()
	 * @generated
	 * @ordered
	 */
	protected double hostADE32 = HOST_ADE32_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE34() <em>Host ADE34</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE34()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE34_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE34() <em>Host ADE34</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE34()
	 * @generated
	 * @ordered
	 */
	protected double hostADE34 = HOST_ADE34_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE41() <em>Host ADE41</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE41()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE41_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE41() <em>Host ADE41</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE41()
	 * @generated
	 * @ordered
	 */
	protected double hostADE41 = HOST_ADE41_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE42() <em>Host ADE42</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE42()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE42_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE42() <em>Host ADE42</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE42()
	 * @generated
	 * @ordered
	 */
	protected double hostADE42 = HOST_ADE42_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostADE43() <em>Host ADE43</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE43()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_ADE43_EDEFAULT = 1.8;
	/**
	 * The cached value of the '{@link #getHostADE43() <em>Host ADE43</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostADE43()
	 * @generated
	 * @ordered
	 */
	protected double hostADE43 = HOST_ADE43_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate12()
	 * <em>Host Secondary Disease Death Rate12</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate12()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE12_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate12()
	 * <em>Host Secondary Disease Death Rate12</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate12()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate12 = HOST_SECONDARY_DISEASE_DEATH_RATE12_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate13()
	 * <em>Host Secondary Disease Death Rate13</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate13()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE13_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate13()
	 * <em>Host Secondary Disease Death Rate13</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate13()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate13 = HOST_SECONDARY_DISEASE_DEATH_RATE13_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate14()
	 * <em>Host Secondary Disease Death Rate14</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate14()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE14_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate14()
	 * <em>Host Secondary Disease Death Rate14</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate14()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate14 = HOST_SECONDARY_DISEASE_DEATH_RATE14_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate21()
	 * <em>Host Secondary Disease Death Rate21</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate21()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE21_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate21()
	 * <em>Host Secondary Disease Death Rate21</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate21()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate21 = HOST_SECONDARY_DISEASE_DEATH_RATE21_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate23()
	 * <em>Host Secondary Disease Death Rate23</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate23()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE23_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate23()
	 * <em>Host Secondary Disease Death Rate23</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate23()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate23 = HOST_SECONDARY_DISEASE_DEATH_RATE23_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate24()
	 * <em>Host Secondary Disease Death Rate24</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate24()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE24_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate24()
	 * <em>Host Secondary Disease Death Rate24</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate24()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate24 = HOST_SECONDARY_DISEASE_DEATH_RATE24_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate31()
	 * <em>Host Secondary Disease Death Rate31</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate31()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE31_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate31()
	 * <em>Host Secondary Disease Death Rate31</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate31()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate31 = HOST_SECONDARY_DISEASE_DEATH_RATE31_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate32()
	 * <em>Host Secondary Disease Death Rate32</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate32()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE32_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate32()
	 * <em>Host Secondary Disease Death Rate32</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate32()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate32 = HOST_SECONDARY_DISEASE_DEATH_RATE32_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate34()
	 * <em>Host Secondary Disease Death Rate34</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate34()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE34_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate34()
	 * <em>Host Secondary Disease Death Rate34</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate34()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate34 = HOST_SECONDARY_DISEASE_DEATH_RATE34_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate41()
	 * <em>Host Secondary Disease Death Rate41</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate41()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE41_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate41()
	 * <em>Host Secondary Disease Death Rate41</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate41()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate41 = HOST_SECONDARY_DISEASE_DEATH_RATE41_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate42()
	 * <em>Host Secondary Disease Death Rate42</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate42()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE42_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate42()
	 * <em>Host Secondary Disease Death Rate42</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate42()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate42 = HOST_SECONDARY_DISEASE_DEATH_RATE42_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryDiseaseDeathRate43()
	 * <em>Host Secondary Disease Death Rate43</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate43()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_DISEASE_DEATH_RATE43_EDEFAULT = 0.00123;
	/**
	 * The cached value of the '{@link #getHostSecondaryDiseaseDeathRate43()
	 * <em>Host Secondary Disease Death Rate43</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryDiseaseDeathRate43()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryDiseaseDeathRate43 = HOST_SECONDARY_DISEASE_DEATH_RATE43_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate12() <em>Host Secondary Recovery Rate12</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate12()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE12_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate12() <em>Host Secondary Recovery Rate12</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate12()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate12 = HOST_SECONDARY_RECOVERY_RATE12_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate13() <em>Host Secondary Recovery Rate13</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate13()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE13_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate13() <em>Host Secondary Recovery Rate13</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate13()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate13 = HOST_SECONDARY_RECOVERY_RATE13_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate14() <em>Host Secondary Recovery Rate14</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate14()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE14_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate14() <em>Host Secondary Recovery Rate14</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate14()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate14 = HOST_SECONDARY_RECOVERY_RATE14_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate21() <em>Host Secondary Recovery Rate21</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate21()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE21_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate21() <em>Host Secondary Recovery Rate21</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate21()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate21 = HOST_SECONDARY_RECOVERY_RATE21_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate23() <em>Host Secondary Recovery Rate23</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate23()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE23_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate23() <em>Host Secondary Recovery Rate23</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate23()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate23 = HOST_SECONDARY_RECOVERY_RATE23_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate24() <em>Host Secondary Recovery Rate24</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate24()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE24_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate24() <em>Host Secondary Recovery Rate24</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate24()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate24 = HOST_SECONDARY_RECOVERY_RATE24_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate31() <em>Host Secondary Recovery Rate31</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate31()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE31_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate31() <em>Host Secondary Recovery Rate31</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate31()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate31 = HOST_SECONDARY_RECOVERY_RATE31_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate32() <em>Host Secondary Recovery Rate32</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate32()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE32_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate32() <em>Host Secondary Recovery Rate32</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate32()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate32 = HOST_SECONDARY_RECOVERY_RATE32_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate34() <em>Host Secondary Recovery Rate34</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate34()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE34_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate34() <em>Host Secondary Recovery Rate34</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate34()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate34 = HOST_SECONDARY_RECOVERY_RATE34_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate41() <em>Host Secondary Recovery Rate41</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate41()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE41_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate41() <em>Host Secondary Recovery Rate41</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate41()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate41 = HOST_SECONDARY_RECOVERY_RATE41_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate42() <em>Host Secondary Recovery Rate42</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate42()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE42_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate42() <em>Host Secondary Recovery Rate42</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate42()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate42 = HOST_SECONDARY_RECOVERY_RATE42_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryRecoveryRate43() <em>Host Secondary Recovery Rate43</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate43()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_RECOVERY_RATE43_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getHostSecondaryRecoveryRate43() <em>Host Secondary Recovery Rate43</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHostSecondaryRecoveryRate43()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryRecoveryRate43 = HOST_SECONDARY_RECOVERY_RATE43_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate12()
	 * <em>Host Secondary Incubation Rate12</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate12()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE12_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate12()
	 * <em>Host Secondary Incubation Rate12</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate12()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate12 = HOST_SECONDARY_INCUBATION_RATE12_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate13()
	 * <em>Host Secondary Incubation Rate13</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate13()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE13_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate13()
	 * <em>Host Secondary Incubation Rate13</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate13()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate13 = HOST_SECONDARY_INCUBATION_RATE13_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate14()
	 * <em>Host Secondary Incubation Rate14</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate14()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE14_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate14()
	 * <em>Host Secondary Incubation Rate14</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate14()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate14 = HOST_SECONDARY_INCUBATION_RATE14_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate21()
	 * <em>Host Secondary Incubation Rate21</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate21()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE21_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate21()
	 * <em>Host Secondary Incubation Rate21</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate21()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate21 = HOST_SECONDARY_INCUBATION_RATE21_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate23()
	 * <em>Host Secondary Incubation Rate23</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate23()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE23_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate23()
	 * <em>Host Secondary Incubation Rate23</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate23()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate23 = HOST_SECONDARY_INCUBATION_RATE23_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate24()
	 * <em>Host Secondary Incubation Rate24</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate24()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE24_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate24()
	 * <em>Host Secondary Incubation Rate24</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate24()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate24 = HOST_SECONDARY_INCUBATION_RATE24_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate31()
	 * <em>Host Secondary Incubation Rate31</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate31()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE31_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate31()
	 * <em>Host Secondary Incubation Rate31</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate31()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate31 = HOST_SECONDARY_INCUBATION_RATE31_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate32()
	 * <em>Host Secondary Incubation Rate32</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate32()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE32_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate32()
	 * <em>Host Secondary Incubation Rate32</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate32()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate32 = HOST_SECONDARY_INCUBATION_RATE32_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate34()
	 * <em>Host Secondary Incubation Rate34</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate34()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE34_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate34()
	 * <em>Host Secondary Incubation Rate34</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate34()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate34 = HOST_SECONDARY_INCUBATION_RATE34_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate41()
	 * <em>Host Secondary Incubation Rate41</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate41()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE41_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate41()
	 * <em>Host Secondary Incubation Rate41</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate41()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate41 = HOST_SECONDARY_INCUBATION_RATE41_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate42()
	 * <em>Host Secondary Incubation Rate42</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate42()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE42_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate42()
	 * <em>Host Secondary Incubation Rate42</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate42()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate42 = HOST_SECONDARY_INCUBATION_RATE42_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostSecondaryIncubationRate43()
	 * <em>Host Secondary Incubation Rate43</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate43()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_SECONDARY_INCUBATION_RATE43_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getHostSecondaryIncubationRate43()
	 * <em>Host Secondary Incubation Rate43</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHostSecondaryIncubationRate43()
	 * @generated
	 * @ordered
	 */
	protected double hostSecondaryIncubationRate43 = HOST_SECONDARY_INCUBATION_RATE43_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorInfectivity1() <em>Vector Infectivity1</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVectorInfectivity1()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_INFECTIVITY1_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getVectorInfectivity1() <em>Vector Infectivity1</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVectorInfectivity1()
	 * @generated
	 * @ordered
	 */
	protected double vectorInfectivity1 = VECTOR_INFECTIVITY1_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorInfectivity2() <em>Vector Infectivity2</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVectorInfectivity2()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_INFECTIVITY2_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getVectorInfectivity2() <em>Vector Infectivity2</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVectorInfectivity2()
	 * @generated
	 * @ordered
	 */
	protected double vectorInfectivity2 = VECTOR_INFECTIVITY2_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorInfectivity3() <em>Vector Infectivity3</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVectorInfectivity3()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_INFECTIVITY3_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getVectorInfectivity3() <em>Vector Infectivity3</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVectorInfectivity3()
	 * @generated
	 * @ordered
	 */
	protected double vectorInfectivity3 = VECTOR_INFECTIVITY3_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorInfectivity4() <em>Vector Infectivity4</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVectorInfectivity4()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_INFECTIVITY4_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getVectorInfectivity4() <em>Vector Infectivity4</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVectorInfectivity4()
	 * @generated
	 * @ordered
	 */
	protected double vectorInfectivity4 = VECTOR_INFECTIVITY4_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorADE1() <em>Vector ADE1</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVectorADE1()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_ADE1_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getVectorADE1() <em>Vector ADE1</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVectorADE1()
	 * @generated
	 * @ordered
	 */
	protected double vectorADE1 = VECTOR_ADE1_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorADE2() <em>Vector ADE2</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVectorADE2()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_ADE2_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getVectorADE2() <em>Vector ADE2</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVectorADE2()
	 * @generated
	 * @ordered
	 */
	protected double vectorADE2 = VECTOR_ADE2_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorADE3() <em>Vector ADE3</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVectorADE3()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_ADE3_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getVectorADE3() <em>Vector ADE3</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVectorADE3()
	 * @generated
	 * @ordered
	 */
	protected double vectorADE3 = VECTOR_ADE3_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorADE4() <em>Vector ADE4</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVectorADE4()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_ADE4_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getVectorADE4() <em>Vector ADE4</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVectorADE4()
	 * @generated
	 * @ordered
	 */
	protected double vectorADE4 = VECTOR_ADE4_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorIncubationRate1() <em>Vector Incubation Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate1()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_INCUBATION_RATE1_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getVectorIncubationRate1() <em>Vector Incubation Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate1()
	 * @generated
	 * @ordered
	 */
	protected double vectorIncubationRate1 = VECTOR_INCUBATION_RATE1_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorIncubationRate2() <em>Vector Incubation Rate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate2()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_INCUBATION_RATE2_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getVectorIncubationRate2() <em>Vector Incubation Rate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate2()
	 * @generated
	 * @ordered
	 */
	protected double vectorIncubationRate2 = VECTOR_INCUBATION_RATE2_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorIncubationRate3() <em>Vector Incubation Rate3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate3()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_INCUBATION_RATE3_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getVectorIncubationRate3() <em>Vector Incubation Rate3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate3()
	 * @generated
	 * @ordered
	 */
	protected double vectorIncubationRate3 = VECTOR_INCUBATION_RATE3_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorIncubationRate4() <em>Vector Incubation Rate4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate4()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_INCUBATION_RATE4_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getVectorIncubationRate4() <em>Vector Incubation Rate4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate4()
	 * @generated
	 * @ordered
	 */
	protected double vectorIncubationRate4 = VECTOR_INCUBATION_RATE4_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpisilon1() <em>Episilon1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisilon1()
	 * @generated
	 * @ordered
	 */
	protected static final double EPISILON1_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getEpisilon1() <em>Episilon1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisilon1()
	 * @generated
	 * @ordered
	 */
	protected double episilon1 = EPISILON1_EDEFAULT;
	/**
	 * The default value of the '{@link #getEpisilon2() <em>Episilon2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisilon2()
	 * @generated
	 * @ordered
	 */
	protected static final double EPISILON2_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getEpisilon2() <em>Episilon2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisilon2()
	 * @generated
	 * @ordered
	 */
	protected double episilon2 = EPISILON2_EDEFAULT;
	/**
	 * The default value of the '{@link #getEpisilon3() <em>Episilon3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisilon3()
	 * @generated
	 * @ordered
	 */
	protected static final double EPISILON3_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getEpisilon3() <em>Episilon3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisilon3()
	 * @generated
	 * @ordered
	 */
	protected double episilon3 = EPISILON3_EDEFAULT;
	/**
	 * The default value of the '{@link #getEpisilon4() <em>Episilon4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisilon4()
	 * @generated
	 * @ordered
	 */
	protected static final double EPISILON4_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getEpisilon4() <em>Episilon4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisilon4()
	 * @generated
	 * @ordered
	 */
	protected double episilon4 = EPISILON4_EDEFAULT;


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DengueModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.DENGUE_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getBitingRateSV() {
		return bitingRateSV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitingRateSV(double newBitingRateSV) {
		bitingRateSV = newBitingRateSV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getBitingRateIV() {
		return bitingRateIV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitingRateIV(double newBitingRateIV) {
		bitingRateIV = newBitingRateIV;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostInfectivity1() {
		return hostTransimissionRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostInfectivity1(double newHostInfectivity1) {
		hostTransimissionRate1 = newHostInfectivity1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostInfectivity2() {
		return hostInfectivity2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostInfectivity2(double newHostInfectivity2) {
		hostInfectivity2 = newHostInfectivity2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostInfectivity3() {
		return hostInfectivity3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostInfectivity3(double newHostInfectivity3) {
		hostInfectivity3 = newHostInfectivity3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostInfectivity4() {
		return hostInfectivity4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostInfectivity4(double newHostInfectivity4) {
		hostInfectivity4 = newHostInfectivity4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryIncubationRate1() {
		return hostPrimaryIncubationRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryIncubationRate1(
			double newHostPrimaryIncubationRate1) {
		hostPrimaryIncubationRate1 = newHostPrimaryIncubationRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryIncubationRate2() {
		return hostPrimaryIncubationRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryIncubationRate2(
			double newHostPrimaryIncubationRate2) {
		hostPrimaryIncubationRate2 = newHostPrimaryIncubationRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryIncubationRate3() {
		return hostPrimaryIncubationRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryIncubationRate3(
			double newHostPrimaryIncubationRate3) {
		hostPrimaryIncubationRate3 = newHostPrimaryIncubationRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryIncubationRate4() {
		return hostPrimaryIncubationRate4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryIncubationRate4(
			double newHostPrimaryIncubationRate4) {
		hostPrimaryIncubationRate4 = newHostPrimaryIncubationRate4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryRecoveryRate1() {
		return hostPrimaryRecoveryRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryRecoveryRate1(double newHostPrimaryRecoveryRate1) {
		hostPrimaryRecoveryRate1 = newHostPrimaryRecoveryRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryRecoveryRate2() {
		return hostPrimaryRecoveryRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryRecoveryRate2(double newHostPrimaryRecoveryRate2) {
		hostPrimaryRecoveryRate2 = newHostPrimaryRecoveryRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryRecoveryRate3() {
		return hostPrimaryRecoveryRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryRecoveryRate3(double newHostPrimaryRecoveryRate3) {
		hostPrimaryRecoveryRate3 = newHostPrimaryRecoveryRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryRecoveryRate4() {
		return hostPrimaryRecoveryRate4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryRecoveryRate4(double newHostPrimaryRecoveryRate4) {
		hostPrimaryRecoveryRate4 = newHostPrimaryRecoveryRate4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryImmunityLossRate1() {
		return hostPrimaryImmunityLossRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryImmunityLossRate1(
			double newHostPrimaryImmunityLossRate1) {
		hostPrimaryImmunityLossRate1 = newHostPrimaryImmunityLossRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryImmunityLossRate2() {
		return hostPrimaryImmunityLossRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryImmunityLossRate2(
			double newHostPrimaryImmunityLossRate2) {
		hostPrimaryImmunityLossRate2 = newHostPrimaryImmunityLossRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryImmunityLossRate3() {
		return hostPrimaryImmunityLossRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryImmunityLossRate3(
			double newHostPrimaryImmunityLossRate3) {
		hostPrimaryImmunityLossRate3 = newHostPrimaryImmunityLossRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryImmunityLossRate4() {
		return hostPrimaryImmunityLossRate4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryImmunityLossRate4(
			double newHostPrimaryImmunityLossRate4) {
		hostPrimaryImmunityLossRate4 = newHostPrimaryImmunityLossRate4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryDiseaseDeathRate1() {
		return hostPrimaryDiseaseDeathRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryDiseaseDeathRate1(
			double newHostPrimaryDiseaseDeathRate1) {
		hostPrimaryDiseaseDeathRate1 = newHostPrimaryDiseaseDeathRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryDiseaseDeathRate2() {
		return hostPrimaryDiseaseDeathRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryDiseaseDeathRate2(
			double newHostPrimaryDiseaseDeathRate2) {
		hostPrimaryDiseaseDeathRate2 = newHostPrimaryDiseaseDeathRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryDiseaseDeathRate3() {
		return hostPrimaryDiseaseDeathRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryDiseaseDeathRate3(
			double newHostPrimaryDiseaseDeathRate3) {
		hostPrimaryDiseaseDeathRate3 = newHostPrimaryDiseaseDeathRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostPrimaryDiseaseDeathRate4() {
		return hostPrimaryDiseaseDeathRate4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPrimaryDiseaseDeathRate4(
			double newHostPrimaryDiseaseDeathRate4) {
		hostPrimaryDiseaseDeathRate4 = newHostPrimaryDiseaseDeathRate4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE12() {
		return hostADE12;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE12(double newHostADE12) {
		hostADE12 = newHostADE12;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE13() {
		return hostADE13;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE13(double newHostADE13) {
		hostADE13 = newHostADE13;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE14() {
		return hostADE14;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE14(double newHostADE14) {
		hostADE14 = newHostADE14;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE21() {
		return hostADE21;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE21(double newHostADE21) {
		hostADE21 = newHostADE21;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE23() {
		return hostADE23;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE23(double newHostADE23) {
		hostADE23 = newHostADE23;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE24() {
		return hostADE24;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE24(double newHostADE24) {
		hostADE24 = newHostADE24;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE31() {
		return hostADE31;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE31(double newHostADE31) {
		hostADE31 = newHostADE31;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE32() {
		return hostADE32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE32(double newHostADE32) {
		hostADE32 = newHostADE32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE34() {
		return hostADE34;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE34(double newHostADE34) {
		hostADE34 = newHostADE34;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE41() {
		return hostADE41;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE41(double newHostADE41) {
		hostADE41 = newHostADE41;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE42() {
		return hostADE42;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE42(double newHostADE42) {
		hostADE42 = newHostADE42;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostADE43() {
		return hostADE43;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostADE43(double newHostADE43) {
		hostADE43 = newHostADE43;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate12() {
		return hostSecondaryDiseaseDeathRate12;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate12(
			double newHostSecondaryDiseaseDeathRate12) {
		hostSecondaryDiseaseDeathRate12 = newHostSecondaryDiseaseDeathRate12;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate13() {
		return hostSecondaryDiseaseDeathRate13;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate13(
			double newHostSecondaryDiseaseDeathRate13) {
		hostSecondaryDiseaseDeathRate13 = newHostSecondaryDiseaseDeathRate13;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate14() {
		return hostSecondaryDiseaseDeathRate14;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate14(
			double newHostSecondaryDiseaseDeathRate14) {
		hostSecondaryDiseaseDeathRate14 = newHostSecondaryDiseaseDeathRate14;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate21() {
		return hostSecondaryDiseaseDeathRate21;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate21(
			double newHostSecondaryDiseaseDeathRate21) {
		hostSecondaryDiseaseDeathRate21 = newHostSecondaryDiseaseDeathRate21;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate23() {
		return hostSecondaryDiseaseDeathRate23;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate23(
			double newHostSecondaryDiseaseDeathRate23) {
		hostSecondaryDiseaseDeathRate23 = newHostSecondaryDiseaseDeathRate23;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate24() {
		return hostSecondaryDiseaseDeathRate24;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate24(
			double newHostSecondaryDiseaseDeathRate24) {
		hostSecondaryDiseaseDeathRate24 = newHostSecondaryDiseaseDeathRate24;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate31() {
		return hostSecondaryDiseaseDeathRate31;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate31(
			double newHostSecondaryDiseaseDeathRate31) {
		hostSecondaryDiseaseDeathRate31 = newHostSecondaryDiseaseDeathRate31;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate32() {
		return hostSecondaryDiseaseDeathRate32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate32(
			double newHostSecondaryDiseaseDeathRate32) {
		hostSecondaryDiseaseDeathRate32 = newHostSecondaryDiseaseDeathRate32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate34() {
		return hostSecondaryDiseaseDeathRate34;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate34(
			double newHostSecondaryDiseaseDeathRate34) {
		hostSecondaryDiseaseDeathRate34 = newHostSecondaryDiseaseDeathRate34;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate41() {
		return hostSecondaryDiseaseDeathRate41;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate41(
			double newHostSecondaryDiseaseDeathRate41) {
		hostSecondaryDiseaseDeathRate41 = newHostSecondaryDiseaseDeathRate41;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate42() {
		return hostSecondaryDiseaseDeathRate42;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate42(
			double newHostSecondaryDiseaseDeathRate42) {
		hostSecondaryDiseaseDeathRate42 = newHostSecondaryDiseaseDeathRate42;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryDiseaseDeathRate43() {
		return hostSecondaryDiseaseDeathRate43;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryDiseaseDeathRate43(
			double newHostSecondaryDiseaseDeathRate43) {
		hostSecondaryDiseaseDeathRate43 = newHostSecondaryDiseaseDeathRate43;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate12() {
		return hostSecondaryRecoveryRate12;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate12(
			double newHostSecondaryRecoveryRate12) {
		hostSecondaryRecoveryRate12 = newHostSecondaryRecoveryRate12;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate13() {
		return hostSecondaryRecoveryRate13;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate13(
			double newHostSecondaryRecoveryRate13) {
		hostSecondaryRecoveryRate13 = newHostSecondaryRecoveryRate13;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate14() {
		return hostSecondaryRecoveryRate14;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate14(
			double newHostSecondaryRecoveryRate14) {
		hostSecondaryRecoveryRate14 = newHostSecondaryRecoveryRate14;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate21() {
		return hostSecondaryRecoveryRate21;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate21(
			double newHostSecondaryRecoveryRate21) {
		hostSecondaryRecoveryRate21 = newHostSecondaryRecoveryRate21;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate23() {
		return hostSecondaryRecoveryRate23;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate23(
			double newHostSecondaryRecoveryRate23) {
		hostSecondaryRecoveryRate23 = newHostSecondaryRecoveryRate23;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate24() {
		return hostSecondaryRecoveryRate24;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate24(
			double newHostSecondaryRecoveryRate24) {
		hostSecondaryRecoveryRate24 = newHostSecondaryRecoveryRate24;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate31() {
		return hostSecondaryRecoveryRate31;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate31(
			double newHostSecondaryRecoveryRate31) {
		hostSecondaryRecoveryRate31 = newHostSecondaryRecoveryRate31;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate32() {
		return hostSecondaryRecoveryRate32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate32(
			double newHostSecondaryRecoveryRate32) {
		hostSecondaryRecoveryRate32 = newHostSecondaryRecoveryRate32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate34() {
		return hostSecondaryRecoveryRate34;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate34(
			double newHostSecondaryRecoveryRate34) {
		hostSecondaryRecoveryRate34 = newHostSecondaryRecoveryRate34;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate41() {
		return hostSecondaryRecoveryRate41;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate41(
			double newHostSecondaryRecoveryRate41) {
		hostSecondaryRecoveryRate41 = newHostSecondaryRecoveryRate41;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate42() {
		return hostSecondaryRecoveryRate42;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate42(
			double newHostSecondaryRecoveryRate42) {
		hostSecondaryRecoveryRate42 = newHostSecondaryRecoveryRate42;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryRecoveryRate43() {
		return hostSecondaryRecoveryRate43;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryRecoveryRate43(
			double newHostSecondaryRecoveryRate43) {
		hostSecondaryRecoveryRate43 = newHostSecondaryRecoveryRate43;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate12() {
		return hostSecondaryIncubationRate12;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate12(
			double newHostSecondaryIncubationRate12) {
		hostSecondaryIncubationRate12 = newHostSecondaryIncubationRate12;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate13() {
		return hostSecondaryIncubationRate13;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate13(
			double newHostSecondaryIncubationRate13) {
		hostSecondaryIncubationRate13 = newHostSecondaryIncubationRate13;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate14() {
		return hostSecondaryIncubationRate14;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate14(
			double newHostSecondaryIncubationRate14) {
		hostSecondaryIncubationRate14 = newHostSecondaryIncubationRate14;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate21() {
		return hostSecondaryIncubationRate21;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate21(
			double newHostSecondaryIncubationRate21) {
		hostSecondaryIncubationRate21 = newHostSecondaryIncubationRate21;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate23() {
		return hostSecondaryIncubationRate23;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate23(
			double newHostSecondaryIncubationRate23) {
		hostSecondaryIncubationRate23 = newHostSecondaryIncubationRate23;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate24() {
		return hostSecondaryIncubationRate24;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate24(
			double newHostSecondaryIncubationRate24) {
		hostSecondaryIncubationRate24 = newHostSecondaryIncubationRate24;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate31() {
		return hostSecondaryIncubationRate31;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate31(
			double newHostSecondaryIncubationRate31) {
		hostSecondaryIncubationRate31 = newHostSecondaryIncubationRate31;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate32() {
		return hostSecondaryIncubationRate32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate32(
			double newHostSecondaryIncubationRate32) {
		hostSecondaryIncubationRate32 = newHostSecondaryIncubationRate32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate34() {
		return hostSecondaryIncubationRate34;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate34(
			double newHostSecondaryIncubationRate34) {
		hostSecondaryIncubationRate34 = newHostSecondaryIncubationRate34;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate41() {
		return hostSecondaryIncubationRate41;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate41(
			double newHostSecondaryIncubationRate41) {
		hostSecondaryIncubationRate41 = newHostSecondaryIncubationRate41;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate42() {
		return hostSecondaryIncubationRate42;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate42(
			double newHostSecondaryIncubationRate42) {
		hostSecondaryIncubationRate42 = newHostSecondaryIncubationRate42;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostSecondaryIncubationRate43() {
		return hostSecondaryIncubationRate43;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSecondaryIncubationRate43(
			double newHostSecondaryIncubationRate43) {
		hostSecondaryIncubationRate43 = newHostSecondaryIncubationRate43;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorInfectivity1() {
		return vectorInfectivity1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorInfectivity1(double newVectorInfectivity1) {
		vectorInfectivity1 = newVectorInfectivity1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorInfectivity2() {
		return vectorInfectivity2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorInfectivity2(double newVectorInfectivity2) {
		vectorInfectivity2 = newVectorInfectivity2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorInfectivity3() {
		return vectorInfectivity3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorInfectivity3(double newVectorInfectivity3) {
		vectorInfectivity3 = newVectorInfectivity3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorInfectivity4() {
		return vectorInfectivity4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorInfectivity4(double newVectorInfectivity4) {
		vectorInfectivity4 = newVectorInfectivity4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorADE1() {
		return vectorADE1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorADE1(double newVectorADE1) {
		vectorADE1 = newVectorADE1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorADE2() {
		return vectorADE2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorADE2(double newVectorADE2) {
		vectorADE2 = newVectorADE2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorADE3() {
		return vectorADE3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorADE3(double newVectorADE3) {
		vectorADE3 = newVectorADE3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorADE4() {
		return vectorADE4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorADE4(double newVectorADE4) {
		vectorADE4 = newVectorADE4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorIncubationRate1() {
		return vectorIncubationRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorIncubationRate1(double newVectorIncubationRate1) {
		vectorIncubationRate1 = newVectorIncubationRate1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorIncubationRate2() {
		return vectorIncubationRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorIncubationRate2(double newVectorIncubationRate2) {
		vectorIncubationRate2 = newVectorIncubationRate2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorIncubationRate3() {
		return vectorIncubationRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorIncubationRate3(double newVectorIncubationRate3) {
		vectorIncubationRate3 = newVectorIncubationRate3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorIncubationRate4() {
		return vectorIncubationRate4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorIncubationRate4(double newVectorIncubationRate4) {
		vectorIncubationRate4 = newVectorIncubationRate4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEpisilon1() {
		return episilon1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpisilon1(double newEpisilon1) {
		episilon1 = newEpisilon1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEpisilon2() {
		return episilon2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpisilon2(double newEpisilon2) {
		episilon2 = newEpisilon2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEpisilon3() {
		return episilon3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpisilon3(double newEpisilon3) {
		episilon3 = newEpisilon3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEpisilon4() {
		return episilon4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpisilon4(double newEpisilon4) {
		episilon4 = newEpisilon4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VectorPackage.DENGUE_MODEL__BITING_RATE_SV:
				return getBitingRateSV();
			case VectorPackage.DENGUE_MODEL__BITING_RATE_IV:
				return getBitingRateIV();
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY1:
				return getHostInfectivity1();
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY2:
				return getHostInfectivity2();
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY3:
				return getHostInfectivity3();
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY4:
				return getHostInfectivity4();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1:
				return getHostPrimaryIncubationRate1();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2:
				return getHostPrimaryIncubationRate2();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3:
				return getHostPrimaryIncubationRate3();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4:
				return getHostPrimaryIncubationRate4();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1:
				return getHostPrimaryRecoveryRate1();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2:
				return getHostPrimaryRecoveryRate2();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3:
				return getHostPrimaryRecoveryRate3();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4:
				return getHostPrimaryRecoveryRate4();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1:
				return getHostPrimaryImmunityLossRate1();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2:
				return getHostPrimaryImmunityLossRate2();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3:
				return getHostPrimaryImmunityLossRate3();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4:
				return getHostPrimaryImmunityLossRate4();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1:
				return getHostPrimaryDiseaseDeathRate1();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2:
				return getHostPrimaryDiseaseDeathRate2();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3:
				return getHostPrimaryDiseaseDeathRate3();
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4:
				return getHostPrimaryDiseaseDeathRate4();
			case VectorPackage.DENGUE_MODEL__HOST_ADE12:
				return getHostADE12();
			case VectorPackage.DENGUE_MODEL__HOST_ADE13:
				return getHostADE13();
			case VectorPackage.DENGUE_MODEL__HOST_ADE14:
				return getHostADE14();
			case VectorPackage.DENGUE_MODEL__HOST_ADE21:
				return getHostADE21();
			case VectorPackage.DENGUE_MODEL__HOST_ADE23:
				return getHostADE23();
			case VectorPackage.DENGUE_MODEL__HOST_ADE24:
				return getHostADE24();
			case VectorPackage.DENGUE_MODEL__HOST_ADE31:
				return getHostADE31();
			case VectorPackage.DENGUE_MODEL__HOST_ADE32:
				return getHostADE32();
			case VectorPackage.DENGUE_MODEL__HOST_ADE34:
				return getHostADE34();
			case VectorPackage.DENGUE_MODEL__HOST_ADE41:
				return getHostADE41();
			case VectorPackage.DENGUE_MODEL__HOST_ADE42:
				return getHostADE42();
			case VectorPackage.DENGUE_MODEL__HOST_ADE43:
				return getHostADE43();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12:
				return getHostSecondaryDiseaseDeathRate12();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13:
				return getHostSecondaryDiseaseDeathRate13();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14:
				return getHostSecondaryDiseaseDeathRate14();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21:
				return getHostSecondaryDiseaseDeathRate21();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23:
				return getHostSecondaryDiseaseDeathRate23();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24:
				return getHostSecondaryDiseaseDeathRate24();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31:
				return getHostSecondaryDiseaseDeathRate31();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32:
				return getHostSecondaryDiseaseDeathRate32();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34:
				return getHostSecondaryDiseaseDeathRate34();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41:
				return getHostSecondaryDiseaseDeathRate41();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42:
				return getHostSecondaryDiseaseDeathRate42();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43:
				return getHostSecondaryDiseaseDeathRate43();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12:
				return getHostSecondaryRecoveryRate12();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13:
				return getHostSecondaryRecoveryRate13();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14:
				return getHostSecondaryRecoveryRate14();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21:
				return getHostSecondaryRecoveryRate21();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23:
				return getHostSecondaryRecoveryRate23();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24:
				return getHostSecondaryRecoveryRate24();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31:
				return getHostSecondaryRecoveryRate31();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32:
				return getHostSecondaryRecoveryRate32();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34:
				return getHostSecondaryRecoveryRate34();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41:
				return getHostSecondaryRecoveryRate41();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42:
				return getHostSecondaryRecoveryRate42();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43:
				return getHostSecondaryRecoveryRate43();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12:
				return getHostSecondaryIncubationRate12();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13:
				return getHostSecondaryIncubationRate13();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14:
				return getHostSecondaryIncubationRate14();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21:
				return getHostSecondaryIncubationRate21();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23:
				return getHostSecondaryIncubationRate23();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24:
				return getHostSecondaryIncubationRate24();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31:
				return getHostSecondaryIncubationRate31();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32:
				return getHostSecondaryIncubationRate32();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34:
				return getHostSecondaryIncubationRate34();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41:
				return getHostSecondaryIncubationRate41();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42:
				return getHostSecondaryIncubationRate42();
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43:
				return getHostSecondaryIncubationRate43();
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY1:
				return getVectorInfectivity1();
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY2:
				return getVectorInfectivity2();
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY3:
				return getVectorInfectivity3();
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY4:
				return getVectorInfectivity4();
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE1:
				return getVectorADE1();
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE2:
				return getVectorADE2();
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE3:
				return getVectorADE3();
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE4:
				return getVectorADE4();
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE1:
				return getVectorIncubationRate1();
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE2:
				return getVectorIncubationRate2();
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE3:
				return getVectorIncubationRate3();
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE4:
				return getVectorIncubationRate4();
			case VectorPackage.DENGUE_MODEL__EPISILON1:
				return getEpisilon1();
			case VectorPackage.DENGUE_MODEL__EPISILON2:
				return getEpisilon2();
			case VectorPackage.DENGUE_MODEL__EPISILON3:
				return getEpisilon3();
			case VectorPackage.DENGUE_MODEL__EPISILON4:
				return getEpisilon4();
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
			case VectorPackage.DENGUE_MODEL__BITING_RATE_SV:
				setBitingRateSV((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__BITING_RATE_IV:
				setBitingRateIV((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY1:
				setHostInfectivity1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY2:
				setHostInfectivity2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY3:
				setHostInfectivity3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY4:
				setHostInfectivity4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1:
				setHostPrimaryIncubationRate1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2:
				setHostPrimaryIncubationRate2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3:
				setHostPrimaryIncubationRate3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4:
				setHostPrimaryIncubationRate4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1:
				setHostPrimaryRecoveryRate1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2:
				setHostPrimaryRecoveryRate2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3:
				setHostPrimaryRecoveryRate3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4:
				setHostPrimaryRecoveryRate4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1:
				setHostPrimaryImmunityLossRate1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2:
				setHostPrimaryImmunityLossRate2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3:
				setHostPrimaryImmunityLossRate3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4:
				setHostPrimaryImmunityLossRate4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1:
				setHostPrimaryDiseaseDeathRate1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2:
				setHostPrimaryDiseaseDeathRate2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3:
				setHostPrimaryDiseaseDeathRate3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4:
				setHostPrimaryDiseaseDeathRate4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE12:
				setHostADE12((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE13:
				setHostADE13((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE14:
				setHostADE14((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE21:
				setHostADE21((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE23:
				setHostADE23((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE24:
				setHostADE24((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE31:
				setHostADE31((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE32:
				setHostADE32((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE34:
				setHostADE34((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE41:
				setHostADE41((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE42:
				setHostADE42((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE43:
				setHostADE43((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12:
				setHostSecondaryDiseaseDeathRate12((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13:
				setHostSecondaryDiseaseDeathRate13((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14:
				setHostSecondaryDiseaseDeathRate14((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21:
				setHostSecondaryDiseaseDeathRate21((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23:
				setHostSecondaryDiseaseDeathRate23((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24:
				setHostSecondaryDiseaseDeathRate24((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31:
				setHostSecondaryDiseaseDeathRate31((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32:
				setHostSecondaryDiseaseDeathRate32((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34:
				setHostSecondaryDiseaseDeathRate34((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41:
				setHostSecondaryDiseaseDeathRate41((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42:
				setHostSecondaryDiseaseDeathRate42((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43:
				setHostSecondaryDiseaseDeathRate43((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12:
				setHostSecondaryRecoveryRate12((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13:
				setHostSecondaryRecoveryRate13((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14:
				setHostSecondaryRecoveryRate14((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21:
				setHostSecondaryRecoveryRate21((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23:
				setHostSecondaryRecoveryRate23((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24:
				setHostSecondaryRecoveryRate24((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31:
				setHostSecondaryRecoveryRate31((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32:
				setHostSecondaryRecoveryRate32((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34:
				setHostSecondaryRecoveryRate34((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41:
				setHostSecondaryRecoveryRate41((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42:
				setHostSecondaryRecoveryRate42((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43:
				setHostSecondaryRecoveryRate43((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12:
				setHostSecondaryIncubationRate12((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13:
				setHostSecondaryIncubationRate13((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14:
				setHostSecondaryIncubationRate14((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21:
				setHostSecondaryIncubationRate21((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23:
				setHostSecondaryIncubationRate23((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24:
				setHostSecondaryIncubationRate24((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31:
				setHostSecondaryIncubationRate31((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32:
				setHostSecondaryIncubationRate32((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34:
				setHostSecondaryIncubationRate34((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41:
				setHostSecondaryIncubationRate41((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42:
				setHostSecondaryIncubationRate42((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43:
				setHostSecondaryIncubationRate43((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY1:
				setVectorInfectivity1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY2:
				setVectorInfectivity2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY3:
				setVectorInfectivity3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY4:
				setVectorInfectivity4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE1:
				setVectorADE1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE2:
				setVectorADE2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE3:
				setVectorADE3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE4:
				setVectorADE4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE1:
				setVectorIncubationRate1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE2:
				setVectorIncubationRate2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE3:
				setVectorIncubationRate3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE4:
				setVectorIncubationRate4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__EPISILON1:
				setEpisilon1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__EPISILON2:
				setEpisilon2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__EPISILON3:
				setEpisilon3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL__EPISILON4:
				setEpisilon4((Double)newValue);
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
			case VectorPackage.DENGUE_MODEL__BITING_RATE_SV:
				setBitingRateSV(BITING_RATE_SV_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__BITING_RATE_IV:
				setBitingRateIV(BITING_RATE_IV_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY1:
				setHostInfectivity1(HOST_INFECTIVITY1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY2:
				setHostInfectivity2(HOST_INFECTIVITY2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY3:
				setHostInfectivity3(HOST_INFECTIVITY3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY4:
				setHostInfectivity4(HOST_INFECTIVITY4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1:
				setHostPrimaryIncubationRate1(HOST_PRIMARY_INCUBATION_RATE1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2:
				setHostPrimaryIncubationRate2(HOST_PRIMARY_INCUBATION_RATE2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3:
				setHostPrimaryIncubationRate3(HOST_PRIMARY_INCUBATION_RATE3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4:
				setHostPrimaryIncubationRate4(HOST_PRIMARY_INCUBATION_RATE4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1:
				setHostPrimaryRecoveryRate1(HOST_PRIMARY_RECOVERY_RATE1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2:
				setHostPrimaryRecoveryRate2(HOST_PRIMARY_RECOVERY_RATE2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3:
				setHostPrimaryRecoveryRate3(HOST_PRIMARY_RECOVERY_RATE3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4:
				setHostPrimaryRecoveryRate4(HOST_PRIMARY_RECOVERY_RATE4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1:
				setHostPrimaryImmunityLossRate1(HOST_PRIMARY_IMMUNITY_LOSS_RATE1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2:
				setHostPrimaryImmunityLossRate2(HOST_PRIMARY_IMMUNITY_LOSS_RATE2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3:
				setHostPrimaryImmunityLossRate3(HOST_PRIMARY_IMMUNITY_LOSS_RATE3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4:
				setHostPrimaryImmunityLossRate4(HOST_PRIMARY_IMMUNITY_LOSS_RATE4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1:
				setHostPrimaryDiseaseDeathRate1(HOST_PRIMARY_DISEASE_DEATH_RATE1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2:
				setHostPrimaryDiseaseDeathRate2(HOST_PRIMARY_DISEASE_DEATH_RATE2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3:
				setHostPrimaryDiseaseDeathRate3(HOST_PRIMARY_DISEASE_DEATH_RATE3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4:
				setHostPrimaryDiseaseDeathRate4(HOST_PRIMARY_DISEASE_DEATH_RATE4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE12:
				setHostADE12(HOST_ADE12_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE13:
				setHostADE13(HOST_ADE13_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE14:
				setHostADE14(HOST_ADE14_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE21:
				setHostADE21(HOST_ADE21_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE23:
				setHostADE23(HOST_ADE23_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE24:
				setHostADE24(HOST_ADE24_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE31:
				setHostADE31(HOST_ADE31_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE32:
				setHostADE32(HOST_ADE32_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE34:
				setHostADE34(HOST_ADE34_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE41:
				setHostADE41(HOST_ADE41_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE42:
				setHostADE42(HOST_ADE42_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_ADE43:
				setHostADE43(HOST_ADE43_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12:
				setHostSecondaryDiseaseDeathRate12(HOST_SECONDARY_DISEASE_DEATH_RATE12_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13:
				setHostSecondaryDiseaseDeathRate13(HOST_SECONDARY_DISEASE_DEATH_RATE13_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14:
				setHostSecondaryDiseaseDeathRate14(HOST_SECONDARY_DISEASE_DEATH_RATE14_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21:
				setHostSecondaryDiseaseDeathRate21(HOST_SECONDARY_DISEASE_DEATH_RATE21_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23:
				setHostSecondaryDiseaseDeathRate23(HOST_SECONDARY_DISEASE_DEATH_RATE23_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24:
				setHostSecondaryDiseaseDeathRate24(HOST_SECONDARY_DISEASE_DEATH_RATE24_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31:
				setHostSecondaryDiseaseDeathRate31(HOST_SECONDARY_DISEASE_DEATH_RATE31_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32:
				setHostSecondaryDiseaseDeathRate32(HOST_SECONDARY_DISEASE_DEATH_RATE32_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34:
				setHostSecondaryDiseaseDeathRate34(HOST_SECONDARY_DISEASE_DEATH_RATE34_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41:
				setHostSecondaryDiseaseDeathRate41(HOST_SECONDARY_DISEASE_DEATH_RATE41_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42:
				setHostSecondaryDiseaseDeathRate42(HOST_SECONDARY_DISEASE_DEATH_RATE42_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43:
				setHostSecondaryDiseaseDeathRate43(HOST_SECONDARY_DISEASE_DEATH_RATE43_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12:
				setHostSecondaryRecoveryRate12(HOST_SECONDARY_RECOVERY_RATE12_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13:
				setHostSecondaryRecoveryRate13(HOST_SECONDARY_RECOVERY_RATE13_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14:
				setHostSecondaryRecoveryRate14(HOST_SECONDARY_RECOVERY_RATE14_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21:
				setHostSecondaryRecoveryRate21(HOST_SECONDARY_RECOVERY_RATE21_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23:
				setHostSecondaryRecoveryRate23(HOST_SECONDARY_RECOVERY_RATE23_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24:
				setHostSecondaryRecoveryRate24(HOST_SECONDARY_RECOVERY_RATE24_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31:
				setHostSecondaryRecoveryRate31(HOST_SECONDARY_RECOVERY_RATE31_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32:
				setHostSecondaryRecoveryRate32(HOST_SECONDARY_RECOVERY_RATE32_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34:
				setHostSecondaryRecoveryRate34(HOST_SECONDARY_RECOVERY_RATE34_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41:
				setHostSecondaryRecoveryRate41(HOST_SECONDARY_RECOVERY_RATE41_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42:
				setHostSecondaryRecoveryRate42(HOST_SECONDARY_RECOVERY_RATE42_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43:
				setHostSecondaryRecoveryRate43(HOST_SECONDARY_RECOVERY_RATE43_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12:
				setHostSecondaryIncubationRate12(HOST_SECONDARY_INCUBATION_RATE12_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13:
				setHostSecondaryIncubationRate13(HOST_SECONDARY_INCUBATION_RATE13_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14:
				setHostSecondaryIncubationRate14(HOST_SECONDARY_INCUBATION_RATE14_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21:
				setHostSecondaryIncubationRate21(HOST_SECONDARY_INCUBATION_RATE21_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23:
				setHostSecondaryIncubationRate23(HOST_SECONDARY_INCUBATION_RATE23_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24:
				setHostSecondaryIncubationRate24(HOST_SECONDARY_INCUBATION_RATE24_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31:
				setHostSecondaryIncubationRate31(HOST_SECONDARY_INCUBATION_RATE31_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32:
				setHostSecondaryIncubationRate32(HOST_SECONDARY_INCUBATION_RATE32_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34:
				setHostSecondaryIncubationRate34(HOST_SECONDARY_INCUBATION_RATE34_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41:
				setHostSecondaryIncubationRate41(HOST_SECONDARY_INCUBATION_RATE41_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42:
				setHostSecondaryIncubationRate42(HOST_SECONDARY_INCUBATION_RATE42_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43:
				setHostSecondaryIncubationRate43(HOST_SECONDARY_INCUBATION_RATE43_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY1:
				setVectorInfectivity1(VECTOR_INFECTIVITY1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY2:
				setVectorInfectivity2(VECTOR_INFECTIVITY2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY3:
				setVectorInfectivity3(VECTOR_INFECTIVITY3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY4:
				setVectorInfectivity4(VECTOR_INFECTIVITY4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE1:
				setVectorADE1(VECTOR_ADE1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE2:
				setVectorADE2(VECTOR_ADE2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE3:
				setVectorADE3(VECTOR_ADE3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE4:
				setVectorADE4(VECTOR_ADE4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE1:
				setVectorIncubationRate1(VECTOR_INCUBATION_RATE1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE2:
				setVectorIncubationRate2(VECTOR_INCUBATION_RATE2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE3:
				setVectorIncubationRate3(VECTOR_INCUBATION_RATE3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE4:
				setVectorIncubationRate4(VECTOR_INCUBATION_RATE4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__EPISILON1:
				setEpisilon1(EPISILON1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__EPISILON2:
				setEpisilon2(EPISILON2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__EPISILON3:
				setEpisilon3(EPISILON3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL__EPISILON4:
				setEpisilon4(EPISILON4_EDEFAULT);
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
			case VectorPackage.DENGUE_MODEL__BITING_RATE_SV:
				return bitingRateSV != BITING_RATE_SV_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__BITING_RATE_IV:
				return bitingRateIV != BITING_RATE_IV_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY1:
				return hostTransimissionRate1 != HOST_INFECTIVITY1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY2:
				return hostInfectivity2 != HOST_INFECTIVITY2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY3:
				return hostInfectivity3 != HOST_INFECTIVITY3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY4:
				return hostInfectivity4 != HOST_INFECTIVITY4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1:
				return hostPrimaryIncubationRate1 != HOST_PRIMARY_INCUBATION_RATE1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2:
				return hostPrimaryIncubationRate2 != HOST_PRIMARY_INCUBATION_RATE2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3:
				return hostPrimaryIncubationRate3 != HOST_PRIMARY_INCUBATION_RATE3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4:
				return hostPrimaryIncubationRate4 != HOST_PRIMARY_INCUBATION_RATE4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1:
				return hostPrimaryRecoveryRate1 != HOST_PRIMARY_RECOVERY_RATE1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2:
				return hostPrimaryRecoveryRate2 != HOST_PRIMARY_RECOVERY_RATE2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3:
				return hostPrimaryRecoveryRate3 != HOST_PRIMARY_RECOVERY_RATE3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4:
				return hostPrimaryRecoveryRate4 != HOST_PRIMARY_RECOVERY_RATE4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1:
				return hostPrimaryImmunityLossRate1 != HOST_PRIMARY_IMMUNITY_LOSS_RATE1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2:
				return hostPrimaryImmunityLossRate2 != HOST_PRIMARY_IMMUNITY_LOSS_RATE2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3:
				return hostPrimaryImmunityLossRate3 != HOST_PRIMARY_IMMUNITY_LOSS_RATE3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4:
				return hostPrimaryImmunityLossRate4 != HOST_PRIMARY_IMMUNITY_LOSS_RATE4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1:
				return hostPrimaryDiseaseDeathRate1 != HOST_PRIMARY_DISEASE_DEATH_RATE1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2:
				return hostPrimaryDiseaseDeathRate2 != HOST_PRIMARY_DISEASE_DEATH_RATE2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3:
				return hostPrimaryDiseaseDeathRate3 != HOST_PRIMARY_DISEASE_DEATH_RATE3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4:
				return hostPrimaryDiseaseDeathRate4 != HOST_PRIMARY_DISEASE_DEATH_RATE4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE12:
				return hostADE12 != HOST_ADE12_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE13:
				return hostADE13 != HOST_ADE13_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE14:
				return hostADE14 != HOST_ADE14_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE21:
				return hostADE21 != HOST_ADE21_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE23:
				return hostADE23 != HOST_ADE23_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE24:
				return hostADE24 != HOST_ADE24_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE31:
				return hostADE31 != HOST_ADE31_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE32:
				return hostADE32 != HOST_ADE32_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE34:
				return hostADE34 != HOST_ADE34_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE41:
				return hostADE41 != HOST_ADE41_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE42:
				return hostADE42 != HOST_ADE42_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_ADE43:
				return hostADE43 != HOST_ADE43_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12:
				return hostSecondaryDiseaseDeathRate12 != HOST_SECONDARY_DISEASE_DEATH_RATE12_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13:
				return hostSecondaryDiseaseDeathRate13 != HOST_SECONDARY_DISEASE_DEATH_RATE13_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14:
				return hostSecondaryDiseaseDeathRate14 != HOST_SECONDARY_DISEASE_DEATH_RATE14_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21:
				return hostSecondaryDiseaseDeathRate21 != HOST_SECONDARY_DISEASE_DEATH_RATE21_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23:
				return hostSecondaryDiseaseDeathRate23 != HOST_SECONDARY_DISEASE_DEATH_RATE23_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24:
				return hostSecondaryDiseaseDeathRate24 != HOST_SECONDARY_DISEASE_DEATH_RATE24_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31:
				return hostSecondaryDiseaseDeathRate31 != HOST_SECONDARY_DISEASE_DEATH_RATE31_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32:
				return hostSecondaryDiseaseDeathRate32 != HOST_SECONDARY_DISEASE_DEATH_RATE32_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34:
				return hostSecondaryDiseaseDeathRate34 != HOST_SECONDARY_DISEASE_DEATH_RATE34_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41:
				return hostSecondaryDiseaseDeathRate41 != HOST_SECONDARY_DISEASE_DEATH_RATE41_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42:
				return hostSecondaryDiseaseDeathRate42 != HOST_SECONDARY_DISEASE_DEATH_RATE42_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43:
				return hostSecondaryDiseaseDeathRate43 != HOST_SECONDARY_DISEASE_DEATH_RATE43_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12:
				return hostSecondaryRecoveryRate12 != HOST_SECONDARY_RECOVERY_RATE12_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13:
				return hostSecondaryRecoveryRate13 != HOST_SECONDARY_RECOVERY_RATE13_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14:
				return hostSecondaryRecoveryRate14 != HOST_SECONDARY_RECOVERY_RATE14_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21:
				return hostSecondaryRecoveryRate21 != HOST_SECONDARY_RECOVERY_RATE21_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23:
				return hostSecondaryRecoveryRate23 != HOST_SECONDARY_RECOVERY_RATE23_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24:
				return hostSecondaryRecoveryRate24 != HOST_SECONDARY_RECOVERY_RATE24_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31:
				return hostSecondaryRecoveryRate31 != HOST_SECONDARY_RECOVERY_RATE31_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32:
				return hostSecondaryRecoveryRate32 != HOST_SECONDARY_RECOVERY_RATE32_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34:
				return hostSecondaryRecoveryRate34 != HOST_SECONDARY_RECOVERY_RATE34_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41:
				return hostSecondaryRecoveryRate41 != HOST_SECONDARY_RECOVERY_RATE41_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42:
				return hostSecondaryRecoveryRate42 != HOST_SECONDARY_RECOVERY_RATE42_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43:
				return hostSecondaryRecoveryRate43 != HOST_SECONDARY_RECOVERY_RATE43_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12:
				return hostSecondaryIncubationRate12 != HOST_SECONDARY_INCUBATION_RATE12_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13:
				return hostSecondaryIncubationRate13 != HOST_SECONDARY_INCUBATION_RATE13_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14:
				return hostSecondaryIncubationRate14 != HOST_SECONDARY_INCUBATION_RATE14_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21:
				return hostSecondaryIncubationRate21 != HOST_SECONDARY_INCUBATION_RATE21_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23:
				return hostSecondaryIncubationRate23 != HOST_SECONDARY_INCUBATION_RATE23_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24:
				return hostSecondaryIncubationRate24 != HOST_SECONDARY_INCUBATION_RATE24_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31:
				return hostSecondaryIncubationRate31 != HOST_SECONDARY_INCUBATION_RATE31_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32:
				return hostSecondaryIncubationRate32 != HOST_SECONDARY_INCUBATION_RATE32_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34:
				return hostSecondaryIncubationRate34 != HOST_SECONDARY_INCUBATION_RATE34_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41:
				return hostSecondaryIncubationRate41 != HOST_SECONDARY_INCUBATION_RATE41_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42:
				return hostSecondaryIncubationRate42 != HOST_SECONDARY_INCUBATION_RATE42_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43:
				return hostSecondaryIncubationRate43 != HOST_SECONDARY_INCUBATION_RATE43_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY1:
				return vectorInfectivity1 != VECTOR_INFECTIVITY1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY2:
				return vectorInfectivity2 != VECTOR_INFECTIVITY2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY3:
				return vectorInfectivity3 != VECTOR_INFECTIVITY3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY4:
				return vectorInfectivity4 != VECTOR_INFECTIVITY4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE1:
				return vectorADE1 != VECTOR_ADE1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE2:
				return vectorADE2 != VECTOR_ADE2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE3:
				return vectorADE3 != VECTOR_ADE3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE4:
				return vectorADE4 != VECTOR_ADE4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE1:
				return vectorIncubationRate1 != VECTOR_INCUBATION_RATE1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE2:
				return vectorIncubationRate2 != VECTOR_INCUBATION_RATE2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE3:
				return vectorIncubationRate3 != VECTOR_INCUBATION_RATE3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE4:
				return vectorIncubationRate4 != VECTOR_INCUBATION_RATE4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__EPISILON1:
				return episilon1 != EPISILON1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__EPISILON2:
				return episilon2 != EPISILON2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__EPISILON3:
				return episilon3 != EPISILON3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL__EPISILON4:
				return episilon4 != EPISILON4_EDEFAULT;
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
		result.append(" (bitingRateSV: ");
		result.append(bitingRateSV);
		result.append(", bitingRateIV: ");
		result.append(bitingRateIV);
		result.append(", hostInfectivity1: ");
		result.append(hostTransimissionRate1);
		result.append(", hostInfectivity2: ");
		result.append(hostInfectivity2);
		result.append(", hostInfectivity3: ");
		result.append(hostInfectivity3);
		result.append(", hostInfectivity4: ");
		result.append(hostInfectivity4);
		result.append(", hostPrimaryIncubationRate1: ");
		result.append(hostPrimaryIncubationRate1);
		result.append(", hostPrimaryIncubationRate2: ");
		result.append(hostPrimaryIncubationRate2);
		result.append(", hostPrimaryIncubationRate3: ");
		result.append(hostPrimaryIncubationRate3);
		result.append(", hostPrimaryIncubationRate4: ");
		result.append(hostPrimaryIncubationRate4);
		result.append(", hostPrimaryRecoveryRate1: ");
		result.append(hostPrimaryRecoveryRate1);
		result.append(", hostPrimaryRecoveryRate2: ");
		result.append(hostPrimaryRecoveryRate2);
		result.append(", hostPrimaryRecoveryRate3: ");
		result.append(hostPrimaryRecoveryRate3);
		result.append(", hostPrimaryRecoveryRate4: ");
		result.append(hostPrimaryRecoveryRate4);
		result.append(", hostPrimaryImmunityLossRate1: ");
		result.append(hostPrimaryImmunityLossRate1);
		result.append(", hostPrimaryImmunityLossRate2: ");
		result.append(hostPrimaryImmunityLossRate2);
		result.append(", hostPrimaryImmunityLossRate3: ");
		result.append(hostPrimaryImmunityLossRate3);
		result.append(", hostPrimaryImmunityLossRate4: ");
		result.append(hostPrimaryImmunityLossRate4);
		result.append(", hostPrimaryDiseaseDeathRate1: ");
		result.append(hostPrimaryDiseaseDeathRate1);
		result.append(", hostPrimaryDiseaseDeathRate2: ");
		result.append(hostPrimaryDiseaseDeathRate2);
		result.append(", hostPrimaryDiseaseDeathRate3: ");
		result.append(hostPrimaryDiseaseDeathRate3);
		result.append(", hostPrimaryDiseaseDeathRate4: ");
		result.append(hostPrimaryDiseaseDeathRate4);
		result.append(", hostADE12: ");
		result.append(hostADE12);
		result.append(", hostADE13: ");
		result.append(hostADE13);
		result.append(", hostADE14: ");
		result.append(hostADE14);
		result.append(", hostADE21: ");
		result.append(hostADE21);
		result.append(", hostADE23: ");
		result.append(hostADE23);
		result.append(", hostADE24: ");
		result.append(hostADE24);
		result.append(", hostADE31: ");
		result.append(hostADE31);
		result.append(", hostADE32: ");
		result.append(hostADE32);
		result.append(", hostADE34: ");
		result.append(hostADE34);
		result.append(", hostADE41: ");
		result.append(hostADE41);
		result.append(", hostADE42: ");
		result.append(hostADE42);
		result.append(", hostADE43: ");
		result.append(hostADE43);
		result.append(", hostSecondaryDiseaseDeathRate12: ");
		result.append(hostSecondaryDiseaseDeathRate12);
		result.append(", hostSecondaryDiseaseDeathRate13: ");
		result.append(hostSecondaryDiseaseDeathRate13);
		result.append(", hostSecondaryDiseaseDeathRate14: ");
		result.append(hostSecondaryDiseaseDeathRate14);
		result.append(", hostSecondaryDiseaseDeathRate21: ");
		result.append(hostSecondaryDiseaseDeathRate21);
		result.append(", hostSecondaryDiseaseDeathRate23: ");
		result.append(hostSecondaryDiseaseDeathRate23);
		result.append(", hostSecondaryDiseaseDeathRate24: ");
		result.append(hostSecondaryDiseaseDeathRate24);
		result.append(", hostSecondaryDiseaseDeathRate31: ");
		result.append(hostSecondaryDiseaseDeathRate31);
		result.append(", hostSecondaryDiseaseDeathRate32: ");
		result.append(hostSecondaryDiseaseDeathRate32);
		result.append(", hostSecondaryDiseaseDeathRate34: ");
		result.append(hostSecondaryDiseaseDeathRate34);
		result.append(", hostSecondaryDiseaseDeathRate41: ");
		result.append(hostSecondaryDiseaseDeathRate41);
		result.append(", hostSecondaryDiseaseDeathRate42: ");
		result.append(hostSecondaryDiseaseDeathRate42);
		result.append(", hostSecondaryDiseaseDeathRate43: ");
		result.append(hostSecondaryDiseaseDeathRate43);
		result.append(", hostSecondaryRecoveryRate12: ");
		result.append(hostSecondaryRecoveryRate12);
		result.append(", hostSecondaryRecoveryRate13: ");
		result.append(hostSecondaryRecoveryRate13);
		result.append(", hostSecondaryRecoveryRate14: ");
		result.append(hostSecondaryRecoveryRate14);
		result.append(", hostSecondaryRecoveryRate21: ");
		result.append(hostSecondaryRecoveryRate21);
		result.append(", hostSecondaryRecoveryRate23: ");
		result.append(hostSecondaryRecoveryRate23);
		result.append(", hostSecondaryRecoveryRate24: ");
		result.append(hostSecondaryRecoveryRate24);
		result.append(", hostSecondaryRecoveryRate31: ");
		result.append(hostSecondaryRecoveryRate31);
		result.append(", hostSecondaryRecoveryRate32: ");
		result.append(hostSecondaryRecoveryRate32);
		result.append(", hostSecondaryRecoveryRate34: ");
		result.append(hostSecondaryRecoveryRate34);
		result.append(", hostSecondaryRecoveryRate41: ");
		result.append(hostSecondaryRecoveryRate41);
		result.append(", hostSecondaryRecoveryRate42: ");
		result.append(hostSecondaryRecoveryRate42);
		result.append(", hostSecondaryRecoveryRate43: ");
		result.append(hostSecondaryRecoveryRate43);
		result.append(", hostSecondaryIncubationRate12: ");
		result.append(hostSecondaryIncubationRate12);
		result.append(", hostSecondaryIncubationRate13: ");
		result.append(hostSecondaryIncubationRate13);
		result.append(", hostSecondaryIncubationRate14: ");
		result.append(hostSecondaryIncubationRate14);
		result.append(", hostSecondaryIncubationRate21: ");
		result.append(hostSecondaryIncubationRate21);
		result.append(", hostSecondaryIncubationRate23: ");
		result.append(hostSecondaryIncubationRate23);
		result.append(", hostSecondaryIncubationRate24: ");
		result.append(hostSecondaryIncubationRate24);
		result.append(", hostSecondaryIncubationRate31: ");
		result.append(hostSecondaryIncubationRate31);
		result.append(", hostSecondaryIncubationRate32: ");
		result.append(hostSecondaryIncubationRate32);
		result.append(", hostSecondaryIncubationRate34: ");
		result.append(hostSecondaryIncubationRate34);
		result.append(", hostSecondaryIncubationRate41: ");
		result.append(hostSecondaryIncubationRate41);
		result.append(", hostSecondaryIncubationRate42: ");
		result.append(hostSecondaryIncubationRate42);
		result.append(", hostSecondaryIncubationRate43: ");
		result.append(hostSecondaryIncubationRate43);
		result.append(", vectorInfectivity1: ");
		result.append(vectorInfectivity1);
		result.append(", vectorInfectivity2: ");
		result.append(vectorInfectivity2);
		result.append(", vectorInfectivity3: ");
		result.append(vectorInfectivity3);
		result.append(", vectorInfectivity4: ");
		result.append(vectorInfectivity4);
		result.append(", vectorADE1: ");
		result.append(vectorADE1);
		result.append(", vectorADE2: ");
		result.append(vectorADE2);
		result.append(", vectorADE3: ");
		result.append(vectorADE3);
		result.append(", vectorADE4: ");
		result.append(vectorADE4);
		result.append(", vectorIncubationRate1: ");
		result.append(vectorIncubationRate1);
		result.append(", vectorIncubationRate2: ");
		result.append(vectorIncubationRate2);
		result.append(", vectorIncubationRate3: ");
		result.append(vectorIncubationRate3);
		result.append(", vectorIncubationRate4: ");
		result.append(vectorIncubationRate4);
		result.append(", episilon1: ");
		result.append(episilon1);
		result.append(", episilon2: ");
		result.append(episilon2);
		result.append(", episilon3: ");
		result.append(episilon3);
		result.append(", episilon4: ");
		result.append(episilon4);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void applyExternalDeltas(STEMTime currentTime, double continuousTime, long timeDelta, EList<DynamicLabel> labels) {
		// TODO Auto-generated stub. Implement applyExternalDeltas(...) for DengueModelImpl.
		super.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);
	} // applyExternalDeltas

	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		// define the adjusted biting rate by infectious vector to
		// susceptible host
		double adjustedBitingRateIV = getBitingRateIV() * (double) timeDelta
				/ (double) getTimePeriod();
		// define primary incubation rate for 4 strains
		double adjustedHostPrimaryIncubationRate1 = getHostPrimaryIncubationRate1()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryIncubationRate2 = getHostPrimaryIncubationRate2()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryIncubationRate3 = getHostPrimaryIncubationRate3()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryIncubationRate4 = getHostPrimaryIncubationRate4()
				* (double) timeDelta / (double) getTimePeriod();
		// define primary recovery rate for 4 strains
		double adjustedHostPrimaryRecoveryRate1 = getHostPrimaryRecoveryRate1()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryRecoveryRate2 = getHostPrimaryRecoveryRate2()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryRecoveryRate3 = getHostPrimaryRecoveryRate3()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryRecoveryRate4 = getHostPrimaryRecoveryRate4()
				* (double) timeDelta / (double) getTimePeriod();
		// define immunity loss rate for 4 strains
		double adjustedHostPrimaryImmunityLossRate1 = getHostPrimaryImmunityLossRate1()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryImmunityLossRate2 = getHostPrimaryImmunityLossRate2()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryImmunityLossRate3 = getHostPrimaryImmunityLossRate3()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryImmunityLossRate4 = getHostPrimaryImmunityLossRate4()
				* (double) timeDelta / (double) getTimePeriod();
		// define primary disease death rate for 4 strains
		double adjustedHostPrimaryDiseaseDeathRate1 = getHostPrimaryDiseaseDeathRate1()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryDiseaseDeathRate2 = getHostPrimaryDiseaseDeathRate2()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryDiseaseDeathRate3 = getHostPrimaryDiseaseDeathRate3()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostPrimaryDiseaseDeathRate4 = getHostPrimaryDiseaseDeathRate4()
				* (double) timeDelta / (double) getTimePeriod();
		// define secondary incubation rate for 12 different infection
		// combinations
		double adjustedHostSecondaryIncubationRate12 = getHostSecondaryIncubationRate12()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate13 = getHostSecondaryIncubationRate13()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate14 = getHostSecondaryIncubationRate14()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate21 = getHostSecondaryIncubationRate21()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate23 = getHostSecondaryIncubationRate23()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate24 = getHostSecondaryIncubationRate24()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate31 = getHostSecondaryIncubationRate31()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate32 = getHostSecondaryIncubationRate32()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate34 = getHostSecondaryIncubationRate34()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate41 = getHostSecondaryIncubationRate41()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate42 = getHostSecondaryIncubationRate42()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryIncubationRate43 = getHostSecondaryIncubationRate43()
				* (double) timeDelta / (double) getTimePeriod();
		// define secondary recovery rate for 12 different infection
		// combinations
		double adjustedHostSecondaryRecoveryRate12 = getHostSecondaryRecoveryRate12()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate13 = getHostSecondaryRecoveryRate13()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate14 = getHostSecondaryRecoveryRate14()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate21 = getHostSecondaryRecoveryRate21()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate23 = getHostSecondaryRecoveryRate23()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate24 = getHostSecondaryRecoveryRate24()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate31 = getHostSecondaryRecoveryRate31()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate32 = getHostSecondaryRecoveryRate32()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate34 = getHostSecondaryRecoveryRate34()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate41 = getHostSecondaryRecoveryRate41()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate42 = getHostSecondaryRecoveryRate42()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryRecoveryRate43 = getHostSecondaryRecoveryRate43()
				* (double) timeDelta / (double) getTimePeriod();
		// define secondary disease death rate for 12 different infection
		// combinations
		double adjustedHostSecondaryDiseaseDeathRate12 = getHostSecondaryDiseaseDeathRate12()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate13 = getHostSecondaryDiseaseDeathRate13()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate14 = getHostSecondaryDiseaseDeathRate14()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate21 = getHostSecondaryDiseaseDeathRate21()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate23 = getHostSecondaryDiseaseDeathRate23()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate24 = getHostSecondaryDiseaseDeathRate24()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate31 = getHostSecondaryDiseaseDeathRate31()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate32 = getHostSecondaryDiseaseDeathRate32()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate34 = getHostSecondaryDiseaseDeathRate34()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate41 = getHostSecondaryDiseaseDeathRate41()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate42 = getHostSecondaryDiseaseDeathRate42()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedHostSecondaryDiseaseDeathRate43 = getHostSecondaryDiseaseDeathRate43()
				* (double) timeDelta / (double) getTimePeriod();
		
		double adjustedBitingRateSV = getBitingRateSV() * (double) timeDelta
				/ (double) getTimePeriod();

		double adjustedVectorIncubationRate1 = getVectorIncubationRate1()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedVectorIncubationRate2 = getVectorIncubationRate2()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedVectorIncubationRate3 = getVectorIncubationRate3()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedVectorIncubationRate4 = getVectorIncubationRate4()
				* (double) timeDelta / (double) getTimePeriod();	
		
		for(int i=0;i<labels.size();++i) {
			final DynamicLabel label =  labels.get(i);
			IntegrationLabel ilabel = (IntegrationLabel)label;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			if (ilabel instanceof DengueModelHostLabel) {
				
				DengueModelHostLabelValue host = (DengueModelHostLabelValue) currentState;


				if (host.getPopulationCount() == 0.0) 
					continue;
		

				DengueModelVectorLabelValue vector = null;
				EList<NodeLabel> allLabels = ilabel.getNode().getLabels();

				for (NodeLabel nlabel : allLabels) {
					if (nlabel instanceof DengueModelVectorLabel) {
						DengueModelVectorLabel vectorLabel = (DengueModelVectorLabel) nlabel;

						if (vectorLabel.getDecorator() == this) {
							vector = (DengueModelVectorLabelValue) vectorLabel
									.getProbeValue();
						}
					}
				}
				

				

				double m = vector.getPopulationCount() / host.getPopulationCount();
				// define the transition between the compartments
				double StoE1 = m*getHostInfectivity1() * adjustedBitingRateIV
						* vector.getI1() * host.getS() / host.getPopulationCount();
				double StoE2 = m*getHostInfectivity2() * adjustedBitingRateIV
						* vector.getI2() * host.getS() / host.getPopulationCount();
				double StoE3 = m*getHostInfectivity3() * adjustedBitingRateIV
						* vector.getI3() * host.getS() / host.getPopulationCount();
				double StoE4 = m*getHostInfectivity4() * adjustedBitingRateIV
						* vector.getI4() * host.getS() / host.getPopulationCount();

				double E1toI1 = adjustedHostPrimaryIncubationRate1 * host.getE1();
				double E2toI2 = adjustedHostPrimaryIncubationRate2 * host.getE2();
				double E3toI3 = adjustedHostPrimaryIncubationRate3 * host.getE3();
				double E4toI4 = adjustedHostPrimaryIncubationRate4 * host.getE4();

				double I1toT1 = adjustedHostPrimaryRecoveryRate1 * host.getI1();
				double I2toT2 = adjustedHostPrimaryRecoveryRate2 * host.getI2();
				double I3toT3 = adjustedHostPrimaryRecoveryRate3 * host.getI3();
				double I4toT4 = adjustedHostPrimaryRecoveryRate4 * host.getI4();

				double T1toR1 = adjustedHostPrimaryImmunityLossRate1 * host.getC1();
				double T2toR2 = adjustedHostPrimaryImmunityLossRate2 * host.getC2();
				double T3toR3 = adjustedHostPrimaryImmunityLossRate3 * host.getC3();
				double T4toR4 = adjustedHostPrimaryImmunityLossRate4 * host.getC4();

				double R1toE12 = m*vectorADE2 * getHostInfectivity2() * adjustedBitingRateIV
						* vector.getI2() * host.getR1() / host.getPopulationCount(); 
				double T1toE12 = (1-episilon1)*m*vectorADE2 * getHostInfectivity2() * adjustedBitingRateIV
						* vector.getI2() * host.getC1() / host.getPopulationCount();
				double R1toE13 = m*vectorADE3 * getHostInfectivity3() * adjustedBitingRateIV
						* vector.getI3() * host.getR1() / host.getPopulationCount(); 
				double T1toE13 = (1-episilon1)*m*vectorADE3 * getHostInfectivity3() * adjustedBitingRateIV
						* vector.getI3() * host.getC1() / host.getPopulationCount();
				double R1toE14 = m*vectorADE4 * getHostInfectivity4() * adjustedBitingRateIV
						* vector.getI4() * host.getR1() / host.getPopulationCount(); 
				double T1toE14=	 (1-episilon1)*m*vectorADE4 * getHostInfectivity4() * adjustedBitingRateIV
						* vector.getI4() * host.getC1() / host.getPopulationCount();

				double R2toE21 = m*vectorADE1 * getHostInfectivity1() * adjustedBitingRateIV
						* vector.getI1() * host.getR2() / host.getPopulationCount(); 
				double T2toE21 = (1-episilon1)*m*vectorADE1 * getHostInfectivity1() * adjustedBitingRateIV
						* vector.getI1() * host.getC2() / host.getPopulationCount();
				double R2toE23 = m*vectorADE3 * getHostInfectivity3() * adjustedBitingRateIV
						* vector.getI3() * host.getR2() / host.getPopulationCount(); 
				double T2toE23 = (1-episilon1)*m*vectorADE3 * getHostInfectivity3() * adjustedBitingRateIV
						* vector.getI3() * host.getC2() / host.getPopulationCount();
				double R2toE24 = m*vectorADE4 * getHostInfectivity4() * adjustedBitingRateIV
						* vector.getI4() * host.getR2() / host.getPopulationCount(); 
				double T2toE24 = (1-episilon1)*m*vectorADE4 * getHostInfectivity4() * adjustedBitingRateIV
						* vector.getI4() * host.getC2() / host.getPopulationCount();

				double R3toE31 = m*vectorADE1 * getHostInfectivity1() * adjustedBitingRateIV
						* vector.getI1() * host.getR3() / host.getPopulationCount(); 
				double T3toE31 = (1-episilon1)*m*vectorADE1 * getHostInfectivity1() * adjustedBitingRateIV
						* vector.getI1() * host.getC3() / host.getPopulationCount();
				double R3toE32 = m*vectorADE2 * getHostInfectivity2() * adjustedBitingRateIV
						* vector.getI2() * host.getR3() / host.getPopulationCount(); 
				double T3toE32 = (1-episilon1)*m*vectorADE2 * getHostInfectivity2() * adjustedBitingRateIV
						* vector.getI2() * host.getC3() / host.getPopulationCount();
				double R3toE34 = m*vectorADE4 * getHostInfectivity4() * adjustedBitingRateIV
						* vector.getI4() * host.getR3() / host.getPopulationCount(); 
				double T3toE34=	(1-episilon1)*m*vectorADE4 * getHostInfectivity4() * adjustedBitingRateIV
						* vector.getI4() * host.getC3() / host.getPopulationCount();

				double R4toE41 = m*vectorADE1 * getHostInfectivity1() * adjustedBitingRateIV
						* vector.getI1() * host.getR4() / host.getPopulationCount(); 
				double T4toE41 = (1-episilon1)*m*vectorADE1 * getHostInfectivity1() * adjustedBitingRateIV
						* vector.getI1() * host.getC4() / host.getPopulationCount();
				double R4toE42 = m*vectorADE2 * getHostInfectivity2() * adjustedBitingRateIV
						* vector.getI2() * host.getR4() / host.getPopulationCount(); 
				double T4toE42=	(1-episilon1)*m*vectorADE2 * getHostInfectivity2() * adjustedBitingRateIV
						* vector.getI2() * host.getC4() / host.getPopulationCount();
				double R4toE43 = m*vectorADE3 * getHostInfectivity3() * adjustedBitingRateIV
						* vector.getI3() * host.getR4() / host.getPopulationCount(); 
				double T4toE43 = (1-episilon1)*m*vectorADE3 * getHostInfectivity3() * adjustedBitingRateIV
						* vector.getI3() * host.getC4() / host.getPopulationCount();

				double E12toI12 = adjustedHostSecondaryIncubationRate12
						* host.getE12();
				double E13toI13 = adjustedHostSecondaryIncubationRate13
						* host.getE13();
				double E14toI14 = adjustedHostSecondaryIncubationRate14
						* host.getE14();
				double E21toI21 = adjustedHostSecondaryIncubationRate21
						* host.getE21();
				double E23toI23 = adjustedHostSecondaryIncubationRate23
						* host.getE23();
				double E24toI24 = adjustedHostSecondaryIncubationRate24
						* host.getE24();
				double E31toI31 = adjustedHostSecondaryIncubationRate31
						* host.getE31();
				double E32toI32 = adjustedHostSecondaryIncubationRate32
						* host.getE32();
				double E34toI34 = adjustedHostSecondaryIncubationRate34
						* host.getE34();
				double E41toI41 = adjustedHostSecondaryIncubationRate41
						* host.getE41();
				double E42toI42 = adjustedHostSecondaryIncubationRate42
						* host.getE42();
				double E43toI43 = adjustedHostSecondaryIncubationRate43
						* host.getE43();

				double I12toR12 = adjustedHostSecondaryRecoveryRate12 * host.getI12();
				double I13toR13 = adjustedHostSecondaryRecoveryRate13 * host.getI13();
				double I14toR14 = adjustedHostSecondaryRecoveryRate14 * host.getI14();
				double I21toR21 = adjustedHostSecondaryRecoveryRate21 * host.getI21();
				double I23toR23 = adjustedHostSecondaryRecoveryRate23 * host.getI23();
				double I24toR24 = adjustedHostSecondaryRecoveryRate24 * host.getI24();
				double I31toR31 = adjustedHostSecondaryRecoveryRate31 * host.getI31();
				double I32toR32 = adjustedHostSecondaryRecoveryRate32 * host.getI32();
				double I34toR34 = adjustedHostSecondaryRecoveryRate34 * host.getI34();
				double I41toR41 = adjustedHostSecondaryRecoveryRate41 * host.getI41();
				double I42toR42 = adjustedHostSecondaryRecoveryRate42 * host.getI42();
				double I43toR43 = adjustedHostSecondaryRecoveryRate43 * host.getI43();

				double deathsI1 = adjustedHostPrimaryDiseaseDeathRate1
						* host.getI1();
				double deathsI2 = adjustedHostPrimaryDiseaseDeathRate2
						* host.getI2();
				double deathsI3 = adjustedHostPrimaryDiseaseDeathRate3
						* host.getI3();
				double deathsI4 = adjustedHostPrimaryDiseaseDeathRate4
						* host.getI4();

				double deathsI12 = adjustedHostSecondaryDiseaseDeathRate12
						* host.getI12();
				double deathsI13 = adjustedHostSecondaryDiseaseDeathRate13
						* host.getI13();
				double deathsI14 = adjustedHostSecondaryDiseaseDeathRate14
						* host.getI14();
				double deathsI21 = adjustedHostSecondaryDiseaseDeathRate21
						* host.getI21();
				double deathsI23 = adjustedHostSecondaryDiseaseDeathRate23
						* host.getI23();
				double deathsI24 = adjustedHostSecondaryDiseaseDeathRate24
						* host.getI24();
				double deathsI31 = adjustedHostSecondaryDiseaseDeathRate31
						* host.getI31();
				double deathsI32 = adjustedHostSecondaryDiseaseDeathRate32
						* host.getI32();
				double deathsI34 = adjustedHostSecondaryDiseaseDeathRate34
						* host.getI34();
				double deathsI41 = adjustedHostSecondaryDiseaseDeathRate41
						* host.getI41();
				double deathsI42 = adjustedHostSecondaryDiseaseDeathRate42
						* host.getI42();
				double deathsI43 = adjustedHostSecondaryDiseaseDeathRate43
						* host.getI43();

				
											
												
				/////////////////////////////////////////////////////////////////////////////
				// added to express the transitions. Necessary to support stochastic modeling
				// StoE1 
				Exchange fromStoE1Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromStoE1Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				fromStoE1Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E1());
				fromStoE1Exchange.setCount(StoE1);
				fromStoE1Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence1());
				fromStoE1Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromStoE1Exchange);
				// StoE2
				Exchange fromStoE2Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromStoE2Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				fromStoE2Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E2());
				fromStoE2Exchange.setCount(StoE2);
				fromStoE2Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence2());
				fromStoE2Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromStoE2Exchange);			
				// StoE3
				Exchange fromStoE3Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromStoE3Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				fromStoE3Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E3());
				fromStoE3Exchange.setCount(StoE3);
				fromStoE3Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence3());
				fromStoE3Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromStoE3Exchange);			
				// StoE4
				Exchange fromStoE4Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromStoE4Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				fromStoE4Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E4());
				fromStoE4Exchange.setCount(StoE4);
				fromStoE4Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence4());
				fromStoE4Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromStoE4Exchange);			
				
				// E1toI1
				Exchange fromE1toI1Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE1toI1Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E1());
				fromE1toI1Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I1());
				fromE1toI1Exchange.setCount(E1toI1);
				fromE1toI1Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE1toI1Exchange);		
				// E2toI2
				Exchange fromI2toC2Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI2toC2Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E2());
				fromI2toC2Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I2());
				fromI2toC2Exchange.setCount(E2toI2);
				fromI2toC2Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI2toC2Exchange);		
				// E3toI3
				Exchange fromI3toC3Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI3toC3Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E3());
				fromI3toC3Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I3());
				fromI3toC3Exchange.setCount(E3toI3);
				fromI3toC3Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI3toC3Exchange);		
				// E4toI4
				Exchange fromI4toC4Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI4toC4Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E4());
				fromI4toC4Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I4());
				fromI4toC4Exchange.setCount(E4toI4);
				fromI4toC4Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI4toC4Exchange);		
				
				// I1toT1 
				Exchange fromI1toT1Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI1toT1Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I1());
				fromI1toT1Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1());
				fromI1toT1Exchange.setCount(I1toT1);
				fromI1toT1Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI1toT1Exchange);		
				// I2toT2 
				Exchange fromI2toT2Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI2toT2Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I2());
				fromI2toT2Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2());
				fromI2toT2Exchange.setCount(I2toT2);
				fromI2toT2Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI2toT2Exchange);
				// I3toT3 
				Exchange fromI3toT3Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI3toT3Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I3());
				fromI3toT3Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3());
				fromI3toT3Exchange.setCount(I3toT3);
				fromI3toT3Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI3toT3Exchange);
				// I4toT4
				Exchange fromI4toT4Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI4toT4Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I4());
				fromI4toT4Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4());
				fromI4toT4Exchange.setCount(I4toT4);
				fromI4toT4Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI4toT4Exchange);
				
				// T1toR1  
				Exchange fromT1toR1Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromT1toR1Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1());
				fromT1toR1Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1());
				fromT1toR1Exchange.setCount(T1toR1);
				fromT1toR1Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromT1toR1Exchange);		
				// T2toR2  
				Exchange fromT2toR2Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromT2toR2Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2());
				fromT2toR2Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2());
				fromT2toR2Exchange.setCount(T2toR2);
				fromT2toR2Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromT2toR2Exchange);
				// T3toR3  
				Exchange fromT3toR3Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromT3toR3Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3());
				fromT3toR3Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3());
				fromT3toR3Exchange.setCount(T3toR3);
				fromT3toR3Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromT3toR3Exchange);
				// T4toR4 
				Exchange fromT4toR4Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromT4toR4Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4());
				fromT4toR4Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4());
				fromT4toR4Exchange.setCount(T4toR4);
				fromT4toR4Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromT4toR4Exchange);
								
				// R1toE12 
				Exchange fromR1toE12Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR1toE12Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1());
				fromR1toE12Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E12());
				fromR1toE12Exchange.setCount(R1toE12);
				fromR1toE12Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence12());
				fromR1toE12Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR1toE12Exchange);
				// R1toE13 
				Exchange fromR1toE13Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR1toE13Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1());
				fromR1toE13Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E13());
				fromR1toE13Exchange.setCount(R1toE13);
				fromR1toE13Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence13());
				fromR1toE13Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR1toE13Exchange);
				// R1toE14 
				Exchange fromR1toE14Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR1toE14Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1());
				fromR1toE14Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E14());
				fromR1toE14Exchange.setCount(R1toE14);
				fromR1toE14Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence14());
				fromR1toE14Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR1toE14Exchange);
				// R2toE21
				Exchange fromR2toE21Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR2toE21Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2());
				fromR2toE21Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E21());
				fromR2toE21Exchange.setCount(R2toE21);
				fromR2toE21Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence21());
				fromR2toE21Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR2toE21Exchange);
				// R2toE23 
				Exchange fromR2toE23Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR2toE23Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2());
				fromR2toE23Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E23());
				fromR2toE23Exchange.setCount(R2toE23);
				fromR2toE23Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence23());
				fromR2toE23Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR2toE23Exchange);
				// R2toE24 
				Exchange fromR2toE24Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR2toE24Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2());
				fromR2toE24Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E24());
				fromR2toE24Exchange.setCount(R2toE24);
				fromR2toE24Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence24());
				fromR2toE24Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR2toE24Exchange);
				// R3toE31 
				Exchange fromR3toE31Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR3toE31Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3());
				fromR3toE31Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E31());
				fromR3toE31Exchange.setCount(R3toE31);
				fromR3toE31Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence31());
				fromR3toE31Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR3toE31Exchange);
				// R3toE32 
				Exchange fromR3toE32Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR3toE32Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3());
				fromR3toE32Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E32());
				fromR3toE32Exchange.setCount(R3toE32);
				fromR3toE32Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence32());
				fromR3toE32Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR3toE32Exchange);
				// R3toE34 
				Exchange fromR3toE34Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR3toE34Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3());
				fromR3toE34Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E34());
				fromR3toE34Exchange.setCount(R3toE34);
				fromR3toE34Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence34());
				fromR3toE34Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR3toE34Exchange);
				// R4toE41 
				Exchange fromR4toE41Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR4toE41Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4());
				fromR4toE41Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E41());
				fromR4toE41Exchange.setCount(R4toE41);
				fromR4toE41Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence41());
				fromR4toE41Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR4toE41Exchange);
				// R4toE42 
				Exchange fromR4toE42Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR4toE42Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4());
				fromR4toE42Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E42());
				fromR4toE42Exchange.setCount(R4toE42);
				fromR4toE42Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence42());
				fromR4toE42Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR4toE42Exchange);
				// R4toE43 
				Exchange fromR4toE43Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR4toE43Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4());
				fromR4toE43Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E43());
				fromR4toE43Exchange.setCount(R4toE43);
				fromR4toE43Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence43());
				fromR4toE43Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR4toE43Exchange);
				
				// E12toI12 
				Exchange fromR1toI12Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromR1toI12Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E12());
				fromR1toI12Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I12());
				fromR1toI12Exchange.setCount(E12toI12);
				fromR1toI12Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence12());
				fromR1toI12Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromR1toI12Exchange);
				// E13toI13
				Exchange fromE13toI13Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE13toI13Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E13());
				fromE13toI13Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I13());
				fromE13toI13Exchange.setCount(E13toI13);
				fromE13toI13Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence13());
				fromE13toI13Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE13toI13Exchange);
				// E14toI14
				Exchange fromE14toI14Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE14toI14Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E14());
				fromE14toI14Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I14());
				fromE14toI14Exchange.setCount(E14toI14);
				fromE14toI14Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence14());
				fromE14toI14Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE14toI14Exchange);
				// E21toI21
				Exchange fromE21toI21Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE21toI21Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E21());
				fromE21toI21Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I21());
				fromE21toI21Exchange.setCount(E21toI21);
				fromE21toI21Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence21());
				fromE21toI21Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE21toI21Exchange);
				// E23toI23
				Exchange fromE23toI23Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE23toI23Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E23());
				fromE23toI23Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I23());
				fromE23toI23Exchange.setCount(E23toI23);
				fromE23toI23Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence23());
				fromE23toI23Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE23toI23Exchange);
				// E24toI24
				Exchange fromE24toI24Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE24toI24Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E24());
				fromE24toI24Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I24());
				fromE24toI24Exchange.setCount(E24toI24);
				fromE24toI24Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence24());
				fromE24toI24Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE24toI24Exchange);
				// E31toI31 
				Exchange fromE31toI31Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE31toI31Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E31());
				fromE31toI31Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I31());
				fromE31toI31Exchange.setCount(E31toI31);
				fromE31toI31Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence31());
				fromE31toI31Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE31toI31Exchange);
				// E32toI32
				Exchange fromE32toI32Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE32toI32Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E32());
				fromE32toI32Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I32());
				fromE32toI32Exchange.setCount(E32toI32);
				fromE32toI32Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence32());
				fromE32toI32Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE32toI32Exchange);
				// E34toI34
				Exchange fromE34toI34Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE34toI34Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E34());
				fromE34toI34Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I34());
				fromE34toI34Exchange.setCount(E34toI34);
				fromE34toI34Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence34());
				fromE34toI34Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE34toI34Exchange);
				// E41toI41
				Exchange fromE41toI41Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE41toI41Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E41());
				fromE41toI41Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I41());
				fromE41toI41Exchange.setCount(E41toI41);
				fromE41toI41Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence41());
				fromE41toI41Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE41toI41Exchange);
				// E42toI42
				Exchange fromE42toI42Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE42toI42Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E42());
				fromE42toI42Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I42());
				fromE42toI42Exchange.setCount(E42toI42);
				fromE42toI42Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence42());
				fromE42toI42Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE42toI42Exchange);
				// E43toI43
				Exchange fromE43toI43Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE43toI43Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E43());
				fromE43toI43Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I43());
				fromE43toI43Exchange.setCount(E43toI43);
				fromE43toI43Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence43());
				fromE43toI43Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE43toI43Exchange);
				
				// I12toR12 
				Exchange fromI12toR12Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI12toR12Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I12());
				fromI12toR12Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI12toR12Exchange.setCount(I12toR12);
				fromI12toR12Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI12toR12Exchange);
				// I13toR13
				Exchange fromI13toR13Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI13toR13Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I13());
				fromI13toR13Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI13toR13Exchange.setCount(I13toR13);
				fromI13toR13Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI13toR13Exchange);
				// I14toR14 
				Exchange fromI14toR14Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI14toR14Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I14());
				fromI14toR14Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI14toR14Exchange.setCount(I14toR14);
				fromI14toR14Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI14toR14Exchange);
				// I21toR21
				Exchange fromI21toR21Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI21toR21Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I21());
				fromI21toR21Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI21toR21Exchange.setCount(I21toR21);
				fromI21toR21Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI21toR21Exchange);
				// I23toR23
				Exchange fromI23toR23Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI23toR23Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I23());
				fromI23toR23Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI23toR23Exchange.setCount(I23toR23);
				fromI23toR23Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI23toR23Exchange);
				// I24toR24
				Exchange fromI24toR24Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI24toR24Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I24());
				fromI24toR24Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI24toR24Exchange.setCount(I24toR24);
				fromI24toR24Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI24toR24Exchange);
				// I31toR31
				Exchange fromI31toR31Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI31toR31Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I31());
				fromI31toR31Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI31toR31Exchange.setCount(I31toR31);
				fromI31toR31Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI31toR31Exchange);
				// I32toR32
				Exchange fromI32toR32Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI32toR32Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I32());
				fromI32toR32Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI32toR32Exchange.setCount(I32toR32);
				fromI32toR32Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI32toR32Exchange);
				// I34toR34
				Exchange fromI34toR34Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI34toR34Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I34());
				fromI34toR34Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI34toR34Exchange.setCount(I34toR34);
				fromI34toR34Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI34toR34Exchange);
				// I41toR41
				Exchange fromI41toR41Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI41toR41Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I41());
				fromI41toR41Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI41toR41Exchange.setCount(I41toR41);
				fromI41toR41Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI41toR41Exchange);
				// I42toR42
				Exchange fromI42toR42Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI42toR42Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I42());
				fromI42toR42Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI42toR42Exchange.setCount(I42toR42);
				fromI42toR42Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI42toR42Exchange);
				// I43toR43
				Exchange fromI43toR43Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromI43toR43Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I43());
				fromI43toR43Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
				fromI43toR43Exchange.setCount(I43toR43);
				fromI43toR43Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromI43toR43Exchange);
				// added to express the transitions. Necessary to support stochastic modeling
				/////////////////////////////////////////////////////////////////////////////
				
				DengueModelHostLabelValue hostDelta = (DengueModelHostLabelValue) deltaValue;
				hostDelta.setS(-StoE1 - StoE2 - StoE3 - StoE4);

				hostDelta.setE1(StoE1 - E1toI1);
				hostDelta.setE2(StoE2 - E2toI2);
				hostDelta.setE3(StoE3 - E3toI3);
				hostDelta.setE4(StoE4 - E4toI4);

				hostDelta.setI1(E1toI1 - I1toT1 - deathsI1);
				hostDelta.setI2(E2toI2 - I2toT2 - deathsI2);
				hostDelta.setI3(E3toI3 - I3toT3 - deathsI3);
				hostDelta.setI4(E4toI4 - I4toT4 - deathsI4);

				hostDelta.setC1(I1toT1 - T1toR1 - T1toE12 - T1toE13 - T1toE14);
				hostDelta.setC2(I2toT2 - T2toR2 - T2toE21 - T2toE23 - T2toE24);
				hostDelta.setC3(I3toT3 - T3toR3 - T3toE31 - T3toE32 - T3toE34);
				hostDelta.setC4(I4toT4 - T4toR4 - T4toE41 - T4toE42 - T4toE43);

				hostDelta.setR1(T1toR1 - R1toE12 - R1toE13 - R1toE14);
				hostDelta.setR2(T2toR2 - R2toE21 - R2toE23 - R2toE24);
				hostDelta.setR3(T3toR3 - R3toE31 - R3toE32 - R3toE34);
				hostDelta.setR4(T4toR4 - R4toE41 - R4toE42 - R4toE43);

				hostDelta.setE12(R1toE12+T1toE12 - E12toI12);
				hostDelta.setE13(R1toE13+T1toE13 - E13toI13);
				hostDelta.setE14(R1toE14+T1toE14 - E14toI14);
				hostDelta.setE21(R2toE21+T2toE21 - E21toI21);
				hostDelta.setE23(R2toE23+T2toE23 - E23toI23);
				hostDelta.setE24(R2toE24+T2toE24 - E24toI24);
				hostDelta.setE31(R3toE31+T3toE31 - E31toI31);
				hostDelta.setE32(R3toE32+T3toE32 - E32toI32);
				hostDelta.setE34(R3toE34+T3toE34 - E34toI34);
				hostDelta.setE41(R4toE41+T4toE41 - E41toI41);
				hostDelta.setE42(R4toE42+T4toE42 - E42toI42);
				hostDelta.setE43(R4toE43+T4toE43 - E43toI43);

				hostDelta.setI12(E12toI12 - I12toR12);
				hostDelta.setI13(E13toI13 - I13toR13);
				hostDelta.setI14(E14toI14 - I14toR14);
				hostDelta.setI21(E21toI21 - I21toR21);
				hostDelta.setI23(E23toI23 - I23toR23);
				hostDelta.setI24(E24toI24 - I24toR24);
				hostDelta.setI31(E31toI31 - I31toR31);
				hostDelta.setI32(E32toI32 - I32toR32);
				hostDelta.setI34(E34toI34 - I34toR34);
				hostDelta.setI41(E41toI41 - I41toR41);
				hostDelta.setI42(E42toI42 - I42toR42);
				hostDelta.setI43(E43toI43 - I43toR43);

				hostDelta.setR(I12toR12 + I13toR13 + I14toR14 + I21toR21 + I23toR23 + I24toR24
						+ I31toR31 + I32toR32 + I34toR34 + I41toR41 + I42toR42 + I43toR43);

				hostDelta.setIncidence1(StoE1);
				hostDelta.setIncidence2(StoE2);
				hostDelta.setIncidence3(StoE3);
				hostDelta.setIncidence4(StoE4);

				hostDelta.setIncidence12(R1toE12+T1toE12);
				hostDelta.setIncidence13(R1toE13+T1toE13);
				hostDelta.setIncidence14(R1toE14+T1toE14);
				hostDelta.setIncidence21(R2toE21+T2toE21);
				hostDelta.setIncidence23(R2toE23+T2toE23);
				hostDelta.setIncidence24(R2toE24+T2toE24);
				hostDelta.setIncidence31(R3toE31+T3toE31);
				hostDelta.setIncidence32(R3toE32+T3toE32);
				hostDelta.setIncidence34(R3toE34+T3toE34);
				hostDelta.setIncidence41(R4toE41+T4toE41);
				hostDelta.setIncidence42(R4toE42+T4toE42);
				hostDelta.setIncidence43(R4toE43+T4toE43);

				hostDelta.setIncidence(hostDelta.getIncidence1()+hostDelta.getIncidence2()+hostDelta.getIncidence3()+hostDelta.getIncidence4()+
						hostDelta.getIncidence12()+hostDelta.getIncidence13()+hostDelta.getIncidence14()+
						hostDelta.getIncidence21()+hostDelta.getIncidence23()+hostDelta.getIncidence24()+
						hostDelta.getIncidence31()+hostDelta.getIncidence32()+hostDelta.getIncidence34()+
						hostDelta.getIncidence41()+hostDelta.getIncidence42()+hostDelta.getIncidence43());

				hostDelta.setDiseaseDeaths1(deathsI1);
				hostDelta.setDiseaseDeaths2(deathsI2);
				hostDelta.setDiseaseDeaths3(deathsI3);
				hostDelta.setDiseaseDeaths4(deathsI4);

				hostDelta.setDiseaseDeaths12(deathsI12);
				hostDelta.setDiseaseDeaths13(deathsI13);
				hostDelta.setDiseaseDeaths14(deathsI14);
				hostDelta.setDiseaseDeaths21(deathsI21);
				hostDelta.setDiseaseDeaths23(deathsI23);
				hostDelta.setDiseaseDeaths24(deathsI24);
				hostDelta.setDiseaseDeaths31(deathsI31);
				hostDelta.setDiseaseDeaths32(deathsI32);
				hostDelta.setDiseaseDeaths34(deathsI34);
				hostDelta.setDiseaseDeaths41(deathsI41);
				hostDelta.setDiseaseDeaths42(deathsI42);
				hostDelta.setDiseaseDeaths43(deathsI43);

				hostDelta.setDiseaseDeaths(deathsI1 + deathsI2 + deathsI3
						+ deathsI4 + deathsI12 + deathsI13 + deathsI14 + deathsI21
						+ deathsI23 + deathsI24 + deathsI31 + deathsI32 + deathsI34
						+ deathsI41 + deathsI42 + deathsI43);
				
			}
			// else if the current population is vector population
			else if (ilabel instanceof DengueModelVectorLabel) {
				
				DengueModelVectorLabelValue vector = (DengueModelVectorLabelValue) currentState;

				if (vector.getPopulationCount() == 0.0) 
					continue;
				

				DengueModelHostLabelValue host = null;
				DengueModelHostLabel hostLabel = null;
				EList<NodeLabel> allLabels = ilabel.getNode().getLabels();

				for (NodeLabel nlabel : allLabels) {
					if (nlabel instanceof DengueModelHostLabel
							&& ((DengueModelHostLabel) nlabel).getDecorator() == this) {
						hostLabel = (DengueModelHostLabel) nlabel;
						host = (DengueModelHostLabelValue) hostLabel.getProbeValue();
						break;
					}
				}


				
				double toE1 = 0.0;
				double toE2 = 0.0;
				double toE3 = 0.0;
				double toE4 = 0.0;

				double [] effectives = (double [])dengueUtil.dArrayObjectPool.get();
				determineMixingStrategy();
				dengueUtil.getNormalizedEffectiveInfectious(this, hostLabel, effectives, doCommonBorderMixing, this.edgeListObjectPool, getCharacteristicMixingDistance(), getRoadNetworkInfectiousProportion(), getPopulationIdentifier(), isFrequencyDependent());

				double effectiveI1 = effectives[0];
				double effectiveI12 = effectives[1];
				double effectiveI13 = effectives[2];
				double effectiveI14 = effectives[3];
				double effectiveI2 = effectives[4];
				double effectiveI21 = effectives[5];
				double effectiveI23 = effectives[6];
				double effectiveI24 = effectives[7];
				double effectiveI3 = effectives[8];
				double effectiveI31 = effectives[9];
				double effectiveI32 = effectives[10];
				double effectiveI34 = effectives[11];
				double effectiveI4 = effectives[12];
				double effectiveI41 = effectives[13];
				double effectiveI42 = effectives[14];
				double effectiveI43 = effectives[15];

				dengueUtil.dArrayObjectPool.release(effectives); // remember to release
				// include all primary and secondary infectious compartments of host


				if (host.getPopulationCount() != 0.0) {
					toE1 = getVectorInfectivity1() * adjustedBitingRateSV * effectiveI1
							* vector.getS();
					toE1 += getVectorInfectivity1() * adjustedBitingRateSV
							* (hostADE21 * effectiveI21 + hostADE31 * effectiveI31 + hostADE41 * effectiveI41)
							* vector.getS();
					toE2 = getVectorInfectivity2() * adjustedBitingRateSV * effectiveI2
							* vector.getS();
					toE2 += getVectorInfectivity2() * adjustedBitingRateSV
							* (hostADE12 * effectiveI12 + hostADE32 * effectiveI32 + hostADE42 * effectiveI42)
							* vector.getS();
					toE3 = getVectorInfectivity3() * adjustedBitingRateSV * effectiveI3
							* vector.getS();
					toE3 += getVectorInfectivity3() * adjustedBitingRateSV
							* (hostADE13 * effectiveI13 + hostADE23 * effectiveI23 + hostADE43 * effectiveI43)
							* vector.getS();
					toE4 = getVectorInfectivity4() * adjustedBitingRateSV * effectiveI4
							* vector.getS();
					toE4 += getVectorInfectivity4() * adjustedBitingRateSV
							* (hostADE14 * effectiveI14 + hostADE24 * effectiveI24 + hostADE34 * effectiveI34)
							* vector.getS();
				}

				double toI1 = adjustedVectorIncubationRate1 * vector.getE1();
				double toI2 = adjustedVectorIncubationRate2 * vector.getE2();
				double toI3 = adjustedVectorIncubationRate3 * vector.getE3();
				double toI4 = adjustedVectorIncubationRate4 * vector.getE4();

				//fromStoE1
				Exchange fromStoE1Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromStoE1Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				fromStoE1Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E1());
				fromStoE1Exchange.setCount(toE1);
				fromStoE1Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence1());
				fromStoE1Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromStoE1Exchange);
				//fromStoE2
				Exchange fromStoE2Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromStoE2Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				fromStoE2Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E2());
				fromStoE2Exchange.setCount(toE2);
				fromStoE2Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence2());
				fromStoE2Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromStoE2Exchange);
				//fromStoE3
				Exchange fromStoE3Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromStoE3Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				fromStoE3Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E3());
				fromStoE3Exchange.setCount(toE3);
				fromStoE3Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence3());
				fromStoE3Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromStoE3Exchange);
				//fromStoE4
				Exchange fromStoE4Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromStoE4Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				fromStoE4Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E4());
				fromStoE4Exchange.setCount(toE4);
				fromStoE4Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence4());
				fromStoE4Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromStoE4Exchange);
				//fromE1toI1
				Exchange fromE1toI1Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE1toI1Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E1());
				fromE1toI1Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_I1());
				fromE1toI1Exchange.setCount(toI1);
				fromE1toI1Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE1toI1Exchange);
				//fromE2toI2
				Exchange fromE2toI2Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE2toI2Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E2());
				fromE2toI2Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_I2());
				fromE2toI2Exchange.setCount(toI2);
				fromE2toI2Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE2toI2Exchange);
				//fromE3toI3
				Exchange fromE3toI3Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE3toI3Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E3());
				fromE3toI3Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_I3());
				fromE3toI3Exchange.setCount(toI3);
				fromE3toI3Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE3toI3Exchange);
				//fromE4toI4
				Exchange fromE4toI4Exchange = (Exchange)ExchangePool.POOL.get(); 
				fromE4toI4Exchange.setSource(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E4());
				fromE4toI4Exchange.setTarget(VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_I4());
				fromE4toI4Exchange.setCount(toI4);
				fromE4toI4Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(fromE4toI4Exchange);
				
				DengueModelVectorLabelValue vectorDelta = (DengueModelVectorLabelValue) deltaValue;
								
				vectorDelta.setS(-toE1 - toE2 - toE3 - toE4);

				vectorDelta.setE1(toE1 - toI1);
				vectorDelta.setE2(toE2 - toI2);
				vectorDelta.setE3(toE3 - toI3);
				vectorDelta.setE4(toE4 - toI4);

				vectorDelta.setI1(toI1);
				vectorDelta.setI2(toI2);
				vectorDelta.setI3(toI3);
				vectorDelta.setI4(toI4);

				vectorDelta.setIncidence1(toE1);
				vectorDelta.setIncidence2(toE2);
				vectorDelta.setIncidence3(toE3);
				vectorDelta.setIncidence4(toE4);

				vectorDelta.setIncidence(toE1 + toE2 + toE3 + toE4);
				vectorDelta.setDiseaseDeaths(0.0);

			}
			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		} // For each label
	}

	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		if (populationIdentifier.equals(vectorPopulationIdentifier)) {
			return VectorFactory.eINSTANCE.createDengueModelVectorLabel();
		} else {
			return VectorFactory.eINSTANCE.createDengueModelHostLabel();
		}
	}

	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(
			String populationIdentifier) {
		if (populationIdentifier.equals(vectorPopulationIdentifier)) {
			return VectorFactory.eINSTANCE.createDengueModelVectorLabelValue();
		} else {
			return VectorFactory.eINSTANCE.createDengueModelHostLabelValue();
		}
	}

	@Override
	public Infector createInfector() {
		SIInfector retValue = StandardFactory.eINSTANCE.createSIInfector();

		retValue.setDiseaseName(getDiseaseName());
		retValue.setPopulationIdentifier(getPopulationIdentifier());
		return retValue;
	}


	/**
	 * Add stochastic noise if the flag is set. Noise is added to all incidences in the dengue model. The next value has already been set to its deterministic solution when this method is called,
	 * and this method changes it to add the noise.
	 * This method calls BinomialDistributionUtil.fastPickFromBinomialDist which uses org.apache.commons.math.distribution.BinomialDistributionImpl;
	 * @generated NOT
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel iLabel, long timeDelta) {
		//Turn next value into integers
		IntegrationLabelValue nextVal = (IntegrationLabelValue)iLabel.getNextValue();
		EList<EAttribute> attrs = nextVal.eClass().getEAllAttributes();

		for(int i=0;i<attrs.size();++i) {
			EAttribute attr = attrs.get(i);
			if(attr.getEType().getClassifierID() == EcorePackage.EDOUBLE && attr.isChangeable()) {
				nextVal.eSetDouble(attr.getFeatureID(), Math.round(nextVal.eGetDouble(attr.getFeatureID())));
			}
		}

		if(this.getBinomialDistribution() == null)
			this.setBinomialDistribution(new BinomialDistributionUtil(this.getRandomSeed()));

		// Add stochastic noise to incidences and adjust the next value	
		if(iLabel.getNextValue() instanceof DengueModelHostLabelValue) {
			DengueModelHostLabelValue nextDHLV = (DengueModelHostLabelValue)iLabel.getNextValue(); // NOW 
			DengueModelHostLabelValue previousDHLV = (DengueModelHostLabelValue)iLabel.getCurrentValue(); // before the last integration step

			// S -> E1
			addNoise(previousDHLV, nextDHLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence1(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E1(), 1.0);
			// S -> E2
			addNoise(previousDHLV, nextDHLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence2(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E2(), 1.0);
			// S -> E3
			addNoise(previousDHLV, nextDHLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence3(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E3(), 1.0);
			// S -> E3
			addNoise(previousDHLV, nextDHLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence4(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E4(), 1.0);

			// The second infection incidences comes from two places, T and R. We determine which fraction of the total incidence reported comes from each compartment by looking at the disease parameters epsilon (cross immunity) and
			// the total counts in those compartments at the previous time step

			// T1, R1 -> E12
			double fromR1 = previousDHLV.getR1();
			double fromT1 = (1-getEpisilon1())*previousDHLV.getC1();
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence12(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E12(), fromR1/(fromR1+fromT1));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence12(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E12(), fromT1/(fromR1+fromT1));
			// T1, R1 -> E13
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence13(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E13(), fromR1/(fromR1+fromT1));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence13(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E13(), fromT1/(fromR1+fromT1));
			// T1, R1 -> E14
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence14(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E14(), fromR1/(fromR1+fromT1));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence14(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E14(), fromT1/(fromR1+fromT1));

			double fromR2 = previousDHLV.getR2();
			double fromT2 = (1-getEpisilon1())*previousDHLV.getC2();
			// T2, R2 -> E21
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence21(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E21(), fromR2/(fromR2+fromT2));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence21(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E21(), fromT2/(fromR2+fromT2));
			// T2, R2 -> E23
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence23(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E23(), fromR2/(fromR2+fromT2));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence23(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E23(), fromT2/(fromR2+fromT2));
			// T2, R2 -> E24
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence24(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E24(), fromR2/(fromR2+fromT2));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence24(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E24(), fromT2/(fromR2+fromT2));

			double fromR3 = previousDHLV.getR3();
			double fromT3 = (1-getEpisilon1())*previousDHLV.getC3();
			// T3, R3 -> E31
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence31(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E31(), fromR3/(fromR3+fromT3));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence31(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E31(), fromT3/(fromR3+fromT3));
			// T3, R3 -> E32
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence32(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E32(), fromR3/(fromR3+fromT3));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence32(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E32(), fromT3/(fromR3+fromT3));
			// T3, R3 -> E34
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence34(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E34(), fromR3/(fromR3+fromT3));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence34(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E34(), fromT3/(fromR3+fromT3));

			double fromR4 = previousDHLV.getR4();
			double fromT4 = (1-getEpisilon1())*previousDHLV.getC4();
			// T4, R4 -> E41
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence41(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E41(), fromR4/(fromR4+fromT4));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence41(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E41(), fromT4/(fromR4+fromT4));
			// T4, R4 -> E42
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence42(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E42(), fromR4/(fromR4+fromT4));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence42(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E42(), fromT4/(fromR4+fromT4));
			// T4, R4 -> E43
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence43(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E43(), fromR4/(fromR4+fromT4));
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence43(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E43(), fromT4/(fromR4+fromT4));

			// Correct the total incidence reported 
			nextDHLV.setIncidence(nextDHLV.getIncidence1()+nextDHLV.getIncidence2()+nextDHLV.getIncidence3()+nextDHLV.getIncidence4()+
					nextDHLV.getIncidence12()+nextDHLV.getIncidence13()+nextDHLV.getIncidence14()+
					nextDHLV.getIncidence21()+nextDHLV.getIncidence23()+nextDHLV.getIncidence24()+
					nextDHLV.getIncidence31()+nextDHLV.getIncidence32()+nextDHLV.getIncidence34()+
					nextDHLV.getIncidence41()+nextDHLV.getIncidence42()+nextDHLV.getIncidence43());

		} else if(iLabel.getNextValue() instanceof DengueModelVectorLabelValue) {
			DengueModelVectorLabelValue nextDVLV = (DengueModelVectorLabelValue)iLabel.getNextValue(); // NOW 
			DengueModelVectorLabelValue previousDVLV = (DengueModelVectorLabelValue)iLabel.getCurrentValue(); // before the last integration step

			// S -> E1
			addNoise(previousDVLV, nextDVLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence1(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E1(), 1.0);
			// S -> E2
			addNoise(previousDVLV, nextDVLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence2(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E2(), 1.0);
			// S -> E3
			addNoise(previousDVLV, nextDVLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence3(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E3(), 1.0);
			// S -> E4
			addNoise(previousDVLV, nextDVLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence4(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E4(), 1.0);

			// Correct total incidence
			nextDVLV.setIncidence(nextDVLV.getIncidence1()+nextDVLV.getIncidence2()+nextDVLV.getIncidence3()+nextDVLV.getIncidence4());
		} //else 
	}


} // DengueModelImpl
