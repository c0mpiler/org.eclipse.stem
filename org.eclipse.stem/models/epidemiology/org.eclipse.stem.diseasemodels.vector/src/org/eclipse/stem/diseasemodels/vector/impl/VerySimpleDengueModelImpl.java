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
import org.eclipse.stem.core.STEMObjectPool;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.math.BinomialDistributionUtil;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueUtil;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Very Simple Dengue Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl#getTransmissionRate <em>Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl#getRecoveryRate <em>Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl#getImmunityLossRate <em>Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl#getAdeFactor <em>Ade Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl#getImmunityStrength <em>Immunity Strength</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl#getPrimaryDeathRate <em>Primary Death Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl#getSecondaryDeathRate <em>Secondary Death Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerySimpleDengueModelImpl extends StandardDiseaseModelImpl implements
VerySimpleDengueModel {

	/**
	 * @generated NOT
	 */
	protected STEMObjectPool dArrayObjectPool = new STEMObjectPool(5, 5) {
		protected Object createNewObject() {
			return new double[16];
		}

		@Override
		protected void resetObject(Object o) {
			// Nothing to do
			
		}
	};

	protected DengueUtil dengueUtil = new DengueUtil();
	
	/**
	 * The default value of the '{@link #getTransmissionRate() <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSMISSION_RATE_EDEFAULT = 0.55;

	/**
	 * The cached value of the '{@link #getTransmissionRate() <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected double transmissionRate = TRANSMISSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveryRate() <em>Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RECOVERY_RATE_EDEFAULT = 0.274;

	/**
	 * The cached value of the '{@link #getRecoveryRate() <em>Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected double recoveryRate = RECOVERY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImmunityLossRate() <em>Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected static final double IMMUNITY_LOSS_RATE_EDEFAULT = 0.0055;

	/**
	 * The cached value of the '{@link #getImmunityLossRate() <em>Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected double immunityLossRate = IMMUNITY_LOSS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdeFactor() <em>Ade Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdeFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double ADE_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getAdeFactor() <em>Ade Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdeFactor()
	 * @generated
	 * @ordered
	 */
	protected double adeFactor = ADE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getImmunityStrength() <em>Immunity Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunityStrength()
	 * @generated
	 * @ordered
	 */
	protected static final double IMMUNITY_STRENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getImmunityStrength() <em>Immunity Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunityStrength()
	 * @generated
	 * @ordered
	 */
	protected double immunityStrength = IMMUNITY_STRENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryDeathRate() <em>Primary Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDeathRate()
	 * @generated
	 * @ordered
	 */
	protected static final double PRIMARY_DEATH_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrimaryDeathRate() <em>Primary Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDeathRate()
	 * @generated
	 * @ordered
	 */
	protected double primaryDeathRate = PRIMARY_DEATH_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryDeathRate() <em>Secondary Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryDeathRate()
	 * @generated
	 * @ordered
	 */
	protected static final double SECONDARY_DEATH_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSecondaryDeathRate() <em>Secondary Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryDeathRate()
	 * @generated
	 * @ordered
	 */
	protected double secondaryDeathRate = SECONDARY_DEATH_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public VerySimpleDengueModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransmissionRate() {
		return transmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionRate(double newTransmissionRate) {
		transmissionRate = newTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRecoveryRate() {
		return recoveryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryRate(double newRecoveryRate) {
		recoveryRate = newRecoveryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getImmunityLossRate() {
		return immunityLossRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunityLossRate(double newImmunityLossRate) {
		immunityLossRate = newImmunityLossRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAdeFactor() {
		return adeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdeFactor(double newAdeFactor) {
		adeFactor = newAdeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getImmunityStrength() {
		return immunityStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunityStrength(double newImmunityStrength) {
		immunityStrength = newImmunityStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrimaryDeathRate() {
		return primaryDeathRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryDeathRate(double newPrimaryDeathRate) {
		primaryDeathRate = newPrimaryDeathRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSecondaryDeathRate() {
		return secondaryDeathRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryDeathRate(double newSecondaryDeathRate) {
		secondaryDeathRate = newSecondaryDeathRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE:
				return getTransmissionRate();
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE:
				return getRecoveryRate();
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE:
				return getImmunityLossRate();
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR:
				return getAdeFactor();
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH:
				return getImmunityStrength();
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE:
				return getPrimaryDeathRate();
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE:
				return getSecondaryDeathRate();
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
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE:
				setTransmissionRate((Double)newValue);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE:
				setRecoveryRate((Double)newValue);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE:
				setImmunityLossRate((Double)newValue);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR:
				setAdeFactor((Double)newValue);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH:
				setImmunityStrength((Double)newValue);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE:
				setPrimaryDeathRate((Double)newValue);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE:
				setSecondaryDeathRate((Double)newValue);
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
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE:
				setTransmissionRate(TRANSMISSION_RATE_EDEFAULT);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE:
				setRecoveryRate(RECOVERY_RATE_EDEFAULT);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE:
				setImmunityLossRate(IMMUNITY_LOSS_RATE_EDEFAULT);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR:
				setAdeFactor(ADE_FACTOR_EDEFAULT);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH:
				setImmunityStrength(IMMUNITY_STRENGTH_EDEFAULT);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE:
				setPrimaryDeathRate(PRIMARY_DEATH_RATE_EDEFAULT);
				return;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE:
				setSecondaryDeathRate(SECONDARY_DEATH_RATE_EDEFAULT);
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
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE:
				return transmissionRate != TRANSMISSION_RATE_EDEFAULT;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE:
				return recoveryRate != RECOVERY_RATE_EDEFAULT;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE:
				return immunityLossRate != IMMUNITY_LOSS_RATE_EDEFAULT;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR:
				return adeFactor != ADE_FACTOR_EDEFAULT;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH:
				return immunityStrength != IMMUNITY_STRENGTH_EDEFAULT;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE:
				return primaryDeathRate != PRIMARY_DEATH_RATE_EDEFAULT;
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE:
				return secondaryDeathRate != SECONDARY_DEATH_RATE_EDEFAULT;
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
		result.append(" (transmissionRate: ");
		result.append(transmissionRate);
		result.append(", recoveryRate: ");
		result.append(recoveryRate);
		result.append(", immunityLossRate: ");
		result.append(immunityLossRate);
		result.append(", adeFactor: ");
		result.append(adeFactor);
		result.append(", immunityStrength: ");
		result.append(immunityStrength);
		result.append(", primaryDeathRate: ");
		result.append(primaryDeathRate);
		result.append(", secondaryDeathRate: ");
		result.append(secondaryDeathRate);
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
		// TODO Auto-generated stub. Implement applyExternalDeltas(...) for VerySimpleDengueModelImpl.
		super.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);
	} // applyExternalDeltas

	/**
	 * Add stochastic noise if the flag is set. Noise is added to all incidences in the dengue model. The next value has already been set to its deterministic solution when this method is called,
	 * and this method changes it to add the noise.
	 * This method calls BinomialDistributionUtil.fastPickFromBinomialDist which uses org.apache.commons.math.distribution.BinomialDistributionImpl;
	 * 
	 * This method is used for the SimpleDengueModel and VerySimpleDengueModel only. The full model (DengueModelImpl) needs special handling to support the cross immunity effect.
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
			
			// R1
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence12(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E12(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence13(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E13(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence14(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E14(), 1.0);
			
			// R2
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence21(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E21(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence23(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E23(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence24(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E24(), 1.0);
			
			// R3
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence31(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E31(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence32(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E32(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence34(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E34(), 1.0);

			// R4
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence41(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E41(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence42(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E42(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence43(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E43(), 1.0);
									
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

	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {		

		double adjustedTransmissionRate = getTransmissionRate() * (double) timeDelta / (double) getTimePeriod();
		double adjustedRecoveryRate = getRecoveryRate()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedImmunityLossRate = getImmunityLossRate()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedPrimaryDeathRate = getPrimaryDeathRate()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustedSecondaryDeathRate = getSecondaryDeathRate()
				* (double) timeDelta / (double) getTimePeriod();

		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();

			SimpleDengueModelHostLabelValue host = (SimpleDengueModelHostLabelValue) currentState;
			double hostPopulationCount = host.getPopulationCount();

			if (hostPopulationCount == 0.0)
				continue;

			double [] effectives = (double [])dArrayObjectPool.get();
			determineMixingStrategy();
			dengueUtil.getNormalizedEffectiveInfectious(this, diseaseLabel, effectives, doCommonBorderMixing, edgeListObjectPool, characteristicMixingDistance, roadNetworkInfectiousProportion, getPopulationIdentifier(), isFrequencyDependent());

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

			dArrayObjectPool.release(effectives); // remember to release

			double effectiveIX1 = effectiveI21 + effectiveI31
					+ effectiveI41;
			double effectiveIX2 = effectiveI12 + effectiveI32
					+ effectiveI42;
			double effectiveIX3 = effectiveI13 + effectiveI23
					+ effectiveI43;
			double effectiveIX4 = effectiveI14 + effectiveI24
					+ effectiveI34;

			double fromStoI1 = adjustedTransmissionRate* (effectiveI1+ getAdeFactor() * effectiveIX1) * host.getS();
			double fromStoI2 = adjustedTransmissionRate* (effectiveI2 + getAdeFactor() * effectiveIX2) * host.getS();
			double fromStoI3 = adjustedTransmissionRate* (effectiveI3 + getAdeFactor() * effectiveIX3) * host.getS();
			double fromStoI4 = adjustedTransmissionRate* (effectiveI4 + getAdeFactor() * effectiveIX4) * host.getS();

			double fromI1toC1 = adjustedRecoveryRate * host.getI1();
			double fromI2toC2 = adjustedRecoveryRate * host.getI2();
			double fromI3toC3 = adjustedRecoveryRate * host.getI3();
			double fromI4toC4 = adjustedRecoveryRate * host.getI4();

			double fromC1toR1 = adjustedImmunityLossRate * host.getC1();
			double fromC2toR2 = adjustedImmunityLossRate * host.getC2();
			double fromC3toR3 = adjustedImmunityLossRate * host.getC3();
			double fromC4toR4 = adjustedImmunityLossRate * host.getC4();

			double fromC1toI12 = adjustedTransmissionRate*(host.getI2()+adeFactor*effectiveIX2)*(1-getImmunityStrength())*host.getC1()/hostPopulationCount;
			double fromC1toI13 = adjustedTransmissionRate*(host.getI3()+adeFactor*effectiveIX3)*(1-getImmunityStrength())*host.getC1()/hostPopulationCount;
			double fromC1toI14 = adjustedTransmissionRate*(host.getI4()+adeFactor*effectiveIX4)*(1-getImmunityStrength())*host.getC1()/hostPopulationCount;
			double fromC2toI21 = adjustedTransmissionRate*(host.getI1()+adeFactor*effectiveIX1)*(1-getImmunityStrength())*host.getC2()/hostPopulationCount;
			double fromC2toI23 = adjustedTransmissionRate*(host.getI3()+adeFactor*effectiveIX3)*(1-getImmunityStrength())*host.getC2()/hostPopulationCount;
			double fromC2toI24 = adjustedTransmissionRate*(host.getI4()+adeFactor*effectiveIX4)*(1-getImmunityStrength())*host.getC2()/hostPopulationCount;
			double fromC3toI31 = adjustedTransmissionRate*(host.getI1()+adeFactor*effectiveIX1)*(1-getImmunityStrength())*host.getC3()/hostPopulationCount;
			double fromC3toI32 = adjustedTransmissionRate*(host.getI2()+adeFactor*effectiveIX2)*(1-getImmunityStrength())*host.getC3()/hostPopulationCount;
			double fromC3toI34 = adjustedTransmissionRate*(host.getI4()+adeFactor*effectiveIX4)*(1-getImmunityStrength())*host.getC3()/hostPopulationCount;
			double fromC4toI41 = adjustedTransmissionRate*(host.getI1()+adeFactor*effectiveIX1)*(1-getImmunityStrength())*host.getC4()/hostPopulationCount;
			double fromC4toI42 = adjustedTransmissionRate*(host.getI2()+adeFactor*effectiveIX2)*(1-getImmunityStrength())*host.getC4()/hostPopulationCount;
			double fromC4toI43 = adjustedTransmissionRate*(host.getI3()+adeFactor*effectiveIX3)*(1-getImmunityStrength())*host.getC4()/hostPopulationCount;

			double fromR1toI12 = adjustedTransmissionRate*(host.getI2()+adeFactor*effectiveIX2)*host.getR1()/hostPopulationCount;
			double fromR1toI13 = adjustedTransmissionRate*(host.getI3()+adeFactor*effectiveIX3)*host.getR1()/hostPopulationCount;
			double fromR1toI14 = adjustedTransmissionRate*(host.getI4()+adeFactor*effectiveIX4)*host.getR1()/hostPopulationCount;
			double fromR2toI21 = adjustedTransmissionRate*(host.getI1()+adeFactor*effectiveIX1)*host.getR2()/hostPopulationCount;
			double fromR2toI23 = adjustedTransmissionRate*(host.getI3()+adeFactor*effectiveIX3)*host.getR2()/hostPopulationCount;
			double fromR2toI24 = adjustedTransmissionRate*(host.getI4()+adeFactor*effectiveIX4)*host.getR2()/hostPopulationCount;
			double fromR3toI31 = adjustedTransmissionRate*(host.getI1()+adeFactor*effectiveIX1)*host.getR3()/hostPopulationCount;
			double fromR3toI32 = adjustedTransmissionRate*(host.getI2()+adeFactor*effectiveIX2)*host.getR3()/hostPopulationCount;
			double fromR3toI34 = adjustedTransmissionRate*(host.getI4()+adeFactor*effectiveIX4)*host.getR3()/hostPopulationCount;
			double fromR4toI41 = adjustedTransmissionRate*(host.getI1()+adeFactor*effectiveIX1)*host.getR4()/hostPopulationCount;
			double fromR4toI42 = adjustedTransmissionRate*(host.getI2()+adeFactor*effectiveIX2)*host.getR4()/hostPopulationCount;
			double fromR4toI43 = adjustedTransmissionRate*(host.getI4()+adeFactor*effectiveIX3)*host.getR4()/hostPopulationCount;

			double fromI12toR = adjustedRecoveryRate*host.getI12();
			double fromI13toR = adjustedRecoveryRate*host.getI13();
			double fromI14toR = adjustedRecoveryRate*host.getI14();
			double fromI21toR = adjustedRecoveryRate*host.getI21();
			double fromI23toR = adjustedRecoveryRate*host.getI23();
			double fromI24toR = adjustedRecoveryRate*host.getI24();
			double fromI31toR = adjustedRecoveryRate*host.getI31();
			double fromI32toR = adjustedRecoveryRate*host.getI32();
			double fromI34toR = adjustedRecoveryRate*host.getI34();
			double fromI41toR = adjustedRecoveryRate*host.getI41();
			double fromI42toR = adjustedRecoveryRate*host.getI42();
			double fromI43toR = adjustedRecoveryRate*host.getI43();

			double deathsI1 = adjustedPrimaryDeathRate * host.getI1();
			double deathsI2 = adjustedPrimaryDeathRate * host.getI2();
			double deathsI3 = adjustedPrimaryDeathRate * host.getI3();
			double deathsI4 = adjustedPrimaryDeathRate * host.getI4();

			double deathsI12 = adjustedSecondaryDeathRate * host.getI12();
			double deathsI13 = adjustedSecondaryDeathRate * host.getI13();
			double deathsI14 = adjustedSecondaryDeathRate * host.getI14();
			double deathsI21 = adjustedSecondaryDeathRate * host.getI21();
			double deathsI23 = adjustedSecondaryDeathRate * host.getI23();
			double deathsI24 = adjustedSecondaryDeathRate * host.getI24();
			double deathsI31 = adjustedSecondaryDeathRate * host.getI31();
			double deathsI32 = adjustedSecondaryDeathRate * host.getI32();
			double deathsI34 = adjustedSecondaryDeathRate * host.getI34();
			double deathsI41 = adjustedSecondaryDeathRate * host.getI41();
			double deathsI42 = adjustedSecondaryDeathRate * host.getI42();
			double deathsI43 = adjustedSecondaryDeathRate * host.getI43();

			
			
			/////////////////////////////////////////////////////////////////////////////
			// added to express the transitions. Necessary to support stochastic modeling
			// fromStoI1
			Exchange fromStoI1Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromStoI1Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			fromStoI1Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I1());
			fromStoI1Exchange.setCount(fromStoI1);
			fromStoI1Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence1());
			fromStoI1Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromStoI1Exchange);
			// fromStoI2
			Exchange fromStoI2Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromStoI2Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			fromStoI2Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I2());
			fromStoI2Exchange.setCount(fromStoI2);
			fromStoI2Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence2());
			fromStoI2Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromStoI2Exchange);			
			// fromStoI3
			Exchange fromStoI3Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromStoI3Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			fromStoI3Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I3());
			fromStoI3Exchange.setCount(fromStoI3);
			fromStoI3Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence3());
			fromStoI3Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromStoI3Exchange);			
			// fromStoI4
			Exchange fromStoI4Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromStoI4Exchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			fromStoI4Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I4());
			fromStoI4Exchange.setCount(fromStoI4);
			fromStoI4Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence4());
			fromStoI4Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromStoI4Exchange);			
			 
			// fromI1toC1
			Exchange fromI1toC1Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromI1toC1Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I1());
			fromI1toC1Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1());
			fromI1toC1Exchange.setCount(fromI1toC1);
			fromI1toC1Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI1toC1Exchange);		
			// fromI2toC2
			Exchange fromI2toC2Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromI2toC2Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I2());
			fromI2toC2Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2());
			fromI2toC2Exchange.setCount(fromI2toC2);
			fromI2toC2Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI2toC2Exchange);		
			// fromI3toC3
			Exchange fromI3toC3Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromI3toC3Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I3());
			fromI3toC3Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3());
			fromI3toC3Exchange.setCount(fromI3toC3);
			fromI3toC3Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI3toC3Exchange);		
			// fromI4toC4
			Exchange fromI4toC4Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromI4toC4Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I4());
			fromI4toC4Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4());
			fromI4toC4Exchange.setCount(fromI4toC4);
			fromI4toC4Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI4toC4Exchange);		
			
			// fromC1toR1
			Exchange fromC1toR1Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC1toR1Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1());
			fromC1toR1Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1());
			fromC1toR1Exchange.setCount(fromC1toR1);
			fromC1toR1Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC1toR1Exchange);		
			// fromC2toR2
			Exchange fromC2toR2Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC2toR2Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2());
			fromC2toR2Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2());
			fromC2toR2Exchange.setCount(fromC2toR2);
			fromC2toR2Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC2toR2Exchange);
			// fromC3toR3
			Exchange fromC3toR3Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC3toR3Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3());
			fromC3toR3Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3());
			fromC3toR3Exchange.setCount(fromC3toR3);
			fromC3toR3Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC3toR3Exchange);
			// fromC4toR4
			Exchange fromC4toR4Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC4toR4Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4());
			fromC4toR4Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4());
			fromC4toR4Exchange.setCount(fromC4toR4);
			fromC4toR4Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC4toR4Exchange);
			
			// fromC1toI12 
			Exchange fromC1toI12Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC1toI12Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1());
			fromC1toI12Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I12());
			fromC1toI12Exchange.setCount(fromC1toI12);
			fromC1toI12Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence12());
			fromC1toI12Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC1toI12Exchange);
			// fromC1toI13 
			Exchange fromC1toI13Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC1toI13Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1());
			fromC1toI13Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I13());
			fromC1toI13Exchange.setCount(fromC1toI13);
			fromC1toI13Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence13());
			fromC1toI13Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC1toI13Exchange);
			// fromC1toI14 
			Exchange fromC1toI14Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC1toI14Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C1());
			fromC1toI14Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I13());
			fromC1toI14Exchange.setCount(fromC1toI13);
			fromC1toI14Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence14());
			fromC1toI14Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC1toI14Exchange);
			// fromC2toI21
			Exchange fromC2toI21Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC2toI21Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2());
			fromC2toI21Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I21());
			fromC2toI21Exchange.setCount(fromC2toI21);
			fromC2toI21Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence21());
			fromC2toI21Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC2toI21Exchange);
			// fromC2toI23 
			Exchange fromC2toI23Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC2toI23Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2());
			fromC2toI23Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I23());
			fromC2toI23Exchange.setCount(fromC2toI23);
			fromC2toI23Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence23());
			fromC2toI23Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC2toI23Exchange);
			// fromC2toI24 
			Exchange fromC2toI24Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC2toI24Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C2());
			fromC2toI24Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I24());
			fromC2toI24Exchange.setCount(fromC2toI24);
			fromC2toI24Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence24());
			fromC2toI24Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC2toI24Exchange);
			// fromC3toI31 
			Exchange fromC3toI31Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC3toI31Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3());
			fromC3toI31Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I31());
			fromC3toI31Exchange.setCount(fromC3toI31);
			fromC3toI31Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence31());
			fromC3toI31Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC3toI31Exchange);
			// fromC3toI32 
			Exchange fromC3toI32Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC3toI32Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3());
			fromC3toI32Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I32());
			fromC3toI32Exchange.setCount(fromC3toI32);
			fromC3toI32Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence32());
			fromC3toI32Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC3toI32Exchange);
			// fromC3toI34 
			Exchange fromC3toI34Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC3toI34Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C3());
			fromC3toI34Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I34());
			fromC3toI34Exchange.setCount(fromC3toI34);
			fromC3toI34Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence34());
			fromC3toI34Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC3toI34Exchange);
			// fromC4toI41 
			Exchange fromC4toI41Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC4toI41Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4());
			fromC4toI41Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I41());
			fromC4toI41Exchange.setCount(fromC4toI41);
			fromC4toI41Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence41());
			fromC4toI41Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC4toI41Exchange);
			// fromC4toI42 
			Exchange fromC4toI42Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC4toI42Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4());
			fromC4toI42Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I42());
			fromC4toI42Exchange.setCount(fromC4toI42);
			fromC4toI42Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence42());
			fromC4toI42Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC4toI42Exchange);
			// fromC4toI43 
			Exchange fromC4toI43Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromC4toI43Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_C4());
			fromC4toI43Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I43());
			fromC4toI43Exchange.setCount(fromC4toI43);
			fromC4toI43Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence43());
			fromC4toI43Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromC4toI43Exchange);
			
			// fromR1toI12
			Exchange fromR1toI12Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR1toI12Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1());
			fromR1toI12Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I12());
			fromR1toI12Exchange.setCount(fromR1toI12);
			fromR1toI12Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence12());
			fromR1toI12Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR1toI12Exchange);
			// fromR1toI13
			Exchange fromR1toI13Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR1toI13Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1());
			fromR1toI13Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I13());
			fromR1toI13Exchange.setCount(fromR1toI13);
			fromR1toI13Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence13());
			fromR1toI13Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR1toI13Exchange);
			// fromR1toI14
			Exchange fromR1toI14Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR1toI14Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1());
			fromR1toI14Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I14());
			fromR1toI14Exchange.setCount(fromR1toI14);
			fromR1toI14Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence14());
			fromR1toI14Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR1toI14Exchange);
			// fromR2toI21
			Exchange fromR2toI21Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR2toI21Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2());
			fromR2toI21Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I21());
			fromR2toI21Exchange.setCount(fromR2toI21);
			fromR2toI21Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence21());
			fromR2toI21Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR2toI21Exchange);
			// fromR2toI23
			Exchange fromR2toI23Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR2toI23Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2());
			fromR2toI23Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I23());
			fromR2toI23Exchange.setCount(fromR2toI23);
			fromR2toI23Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence23());
			fromR2toI23Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR2toI23Exchange);
			// fromR2toI24
			Exchange fromR2toI24Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR2toI24Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2());
			fromR2toI24Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I24());
			fromR2toI24Exchange.setCount(fromR2toI24);
			fromR2toI24Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence24());
			fromR2toI24Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR2toI24Exchange);
			// fromR3toI31 
			Exchange fromR3toI31Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR3toI31Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3());
			fromR3toI31Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I31());
			fromR3toI31Exchange.setCount(fromR3toI31);
			fromR3toI31Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence31());
			fromR3toI31Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR3toI31Exchange);
			// fromR3toI32
			Exchange fromR3toI32Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR3toI32Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3());
			fromR3toI32Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I32());
			fromR3toI32Exchange.setCount(fromR3toI32);
			fromR3toI32Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence32());
			fromR3toI32Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR3toI32Exchange);
			// fromR3toI34
			Exchange fromR3toI34Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR3toI34Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3());
			fromR3toI34Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I34());
			fromR3toI34Exchange.setCount(fromR3toI34);
			fromR3toI34Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence34());
			fromR3toI34Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR3toI34Exchange);
			// fromR4toI41
			Exchange fromR4toI41Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR4toI41Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4());
			fromR4toI41Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I41());
			fromR4toI41Exchange.setCount(fromR4toI41);
			fromR4toI41Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence41());
			fromR4toI41Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR4toI41Exchange);
			// fromR4toI42
			Exchange fromR4toI42Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR4toI42Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4());
			fromR4toI42Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I42());
			fromR4toI42Exchange.setCount(fromR4toI42);
			fromR4toI42Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence42());
			fromR4toI42Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR4toI42Exchange);
			// fromR4toI43
			Exchange fromR4toI43Exchange = (Exchange)ExchangePool.POOL.get(); 
			fromR4toI43Exchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4());
			fromR4toI43Exchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I43());
			fromR4toI43Exchange.setCount(fromR4toI43);
			fromR4toI43Exchange.getForIncidence().add(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence43());
			fromR4toI43Exchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromR4toI43Exchange);

			// fromI12toR
			Exchange fromI12toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI12toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I12());
			fromI12toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI12toRExchange.setCount(fromI12toR);
			fromI12toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI12toRExchange);
			// fromI13toR
			Exchange fromI13toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI13toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I13());
			fromI13toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI13toRExchange.setCount(fromI13toR);
			fromI13toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI13toRExchange);
			// fromI14toR
			Exchange fromI14toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI14toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I14());
			fromI14toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI14toRExchange.setCount(fromI14toR);
			fromI14toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI14toRExchange);
			// fromI21toR
			Exchange fromI21toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI21toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I21());
			fromI21toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI21toRExchange.setCount(fromI21toR);
			fromI21toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI21toRExchange);
			// fromI23toR
			Exchange fromI23toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI23toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I23());
			fromI23toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI23toRExchange.setCount(fromI23toR);
			fromI23toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI23toRExchange);
			// fromI24toR
			Exchange fromI24toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI24toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I24());
			fromI24toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI24toRExchange.setCount(fromI24toR);
			fromI24toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI24toRExchange);
			// fromI31toR
			Exchange fromI31toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI31toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I31());
			fromI31toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI31toRExchange.setCount(fromI31toR);
			fromI31toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI31toRExchange);
			// fromI32toR
			Exchange fromI32toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI32toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I32());
			fromI32toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI32toRExchange.setCount(fromI32toR);
			fromI32toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI32toRExchange);
			// fromI34toR
			Exchange fromI34toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI34toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I34());
			fromI34toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI34toRExchange.setCount(fromI34toR);
			fromI34toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI34toRExchange);
			// fromI41toR
			Exchange fromI41toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI41toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I41());
			fromI41toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI41toRExchange.setCount(fromI41toR);
			fromI41toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI41toRExchange);
			// fromI42toR
			Exchange fromI42toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI42toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I42());
			fromI42toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI42toRExchange.setCount(fromI42toR);
			fromI42toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI42toRExchange);
			// fromI43toR
			Exchange fromI43toRExchange = (Exchange)ExchangePool.POOL.get(); 
			fromI43toRExchange.setSource(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_I43());
			fromI43toRExchange.setTarget(VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R());
			fromI43toRExchange.setCount(fromI43toR);
			fromI43toRExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(fromI43toRExchange);
			// added to express the transitions. Necessary to support stochastic modeling
			/////////////////////////////////////////////////////////////////////////////
			
			SimpleDengueModelHostLabelValue hostDelta = (SimpleDengueModelHostLabelValue) deltaValue;
			
			hostDelta.setS(-fromStoI1 - fromStoI2 - fromStoI3 - fromStoI4);

			hostDelta.setI1(fromStoI1 - fromI1toC1 - deathsI1);
			hostDelta.setI2(fromStoI2 - fromI2toC2 - deathsI2);
			hostDelta.setI3(fromStoI3 - fromI3toC3 - deathsI3);
			hostDelta.setI4(fromStoI4 - fromI4toC4 - deathsI4);

			hostDelta.setC1(fromI1toC1-fromC1toI12-fromC1toI13-fromC1toI14-fromC1toR1);
			hostDelta.setC2(fromI2toC2-fromC2toI21-fromC2toI23-fromC2toI24-fromC2toR2);
			hostDelta.setC3(fromI3toC3-fromC3toI31-fromC3toI32-fromC3toI34-fromC3toR3);
			hostDelta.setC4(fromI4toC4-fromC4toI41-fromC4toI42-fromC4toI43-fromC4toR4);

			hostDelta.setR1(fromC1toR1-fromR1toI12-fromR1toI13-fromR1toI14);
			hostDelta.setR2(fromC2toR2-fromR2toI21-fromR2toI23-fromR2toI24);
			hostDelta.setR3(fromC3toR3-fromR3toI31-fromR3toI32-fromR3toI34);
			hostDelta.setR4(fromC4toR4-fromR4toI41-fromR4toI42-fromR4toI43);


			hostDelta.setI12(fromC1toI12+fromR1toI12-fromI12toR - deathsI12);
			hostDelta.setI13(fromC1toI13+fromR1toI13-fromI13toR - deathsI13);
			hostDelta.setI14(fromC1toI14+fromR1toI14-fromI14toR - deathsI14);
			hostDelta.setI21(fromC2toI21+fromR2toI21-fromI21toR - deathsI21);
			hostDelta.setI23(fromC2toI23+fromR2toI23-fromI23toR - deathsI23);
			hostDelta.setI24(fromC2toI24+fromR2toI24-fromI24toR - deathsI24);
			hostDelta.setI31(fromC3toI31+fromR3toI31-fromI31toR - deathsI31);
			hostDelta.setI32(fromC3toI32+fromR3toI32-fromI32toR - deathsI32);
			hostDelta.setI34(fromC3toI34+fromR3toI34-fromI34toR - deathsI34);
			hostDelta.setI41(fromC4toI41+fromR4toI41-fromI41toR - deathsI41);
			hostDelta.setI42(fromC4toI42+fromR4toI42-fromI42toR - deathsI42);
			hostDelta.setI43(fromC4toI43+fromR4toI43-fromI43toR - deathsI43);

			hostDelta.setR(fromI12toR+fromI13toR+fromI14toR+fromI21toR+fromI23toR+fromI24toR+fromI31toR+fromI32toR+fromI34toR+fromI41toR+fromI42toR+fromI43toR);



			hostDelta.setIncidence1(fromStoI1);
			hostDelta.setIncidence2(fromStoI2);
			hostDelta.setIncidence3(fromStoI3);
			hostDelta.setIncidence4(fromStoI4);

			hostDelta.setIncidence12(fromR1toI12+fromC1toI12);
			hostDelta.setIncidence13(fromR1toI13+fromC1toI13);
			hostDelta.setIncidence14(fromR1toI14+fromC1toI14);
			hostDelta.setIncidence21(fromR2toI21+fromC2toI21);
			hostDelta.setIncidence23(fromR2toI23+fromC2toI23);
			hostDelta.setIncidence24(fromR2toI24+fromC2toI24);
			hostDelta.setIncidence31(fromR3toI31+fromC3toI31);
			hostDelta.setIncidence32(fromR3toI32+fromC3toI32);
			hostDelta.setIncidence34(fromR3toI34+fromC3toI34);
			hostDelta.setIncidence41(fromR4toI41+fromC4toI41);
			hostDelta.setIncidence42(fromR4toI42+fromC4toI42);
			hostDelta.setIncidence43(fromR4toI43+fromC4toI43);

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
					
			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	}

	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		return VectorFactory.eINSTANCE.createSimpleDengueModelHostLabel();
	}

	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(
			String populationIdentifier) {
		return VectorFactory.eINSTANCE.createSimpleDengueModelHostLabelValue();
	}

	@Override
	public Infector createInfector() {
		SIInfector retValue = StandardFactory.eINSTANCE.createSIInfector();

		retValue.setDiseaseName(getDiseaseName());
		retValue.setPopulationIdentifier(getPopulationIdentifier());
		return retValue;
	}

} // VerySimpleDengueModelImpl
