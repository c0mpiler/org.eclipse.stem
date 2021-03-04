package org.eclipse.stem.diseasemodels.experimental.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.math.BinomialDistributionUtil;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.experimental.ExperimentalFactory;
import org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TB Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelImpl#getTransmissionRate <em>Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelImpl#getActiveInfProb <em>Active Inf Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TBDiseaseModelImpl extends StandardDiseaseModelImpl implements TBDiseaseModel {
	/**
	 * The default value of the '{@link #getTransmissionRate() <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSMISSION_RATE_EDEFAULT = 1.2;
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
	 * The default value of the '{@link #getActiveInfProb() <em>Active Inf Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveInfProb()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_INF_PROB_EDEFAULT = 0.8;
	/**
	 * The cached value of the '{@link #getActiveInfProb() <em>Active Inf Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveInfProb()
	 * @generated
	 * @ordered
	 */
	protected double activeInfProb = ACTIVE_INF_PROB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TBDiseaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentalPackage.Literals.TB_DISEASE_MODEL;
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
	public double getActiveInfProb() {
		return activeInfProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveInfProb(double newActiveInfProb) {
		activeInfProb = newActiveInfProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentalPackage.TB_DISEASE_MODEL__TRANSMISSION_RATE:
			return getTransmissionRate();
		case ExperimentalPackage.TB_DISEASE_MODEL__ACTIVE_INF_PROB:
			return getActiveInfProb();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExperimentalPackage.TB_DISEASE_MODEL__TRANSMISSION_RATE:
			setTransmissionRate((Double)newValue);
			return;
		case ExperimentalPackage.TB_DISEASE_MODEL__ACTIVE_INF_PROB:
			setActiveInfProb((Double)newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ExperimentalPackage.TB_DISEASE_MODEL__TRANSMISSION_RATE:
			setTransmissionRate(TRANSMISSION_RATE_EDEFAULT);
			return;
		case ExperimentalPackage.TB_DISEASE_MODEL__ACTIVE_INF_PROB:
			setActiveInfProb(ACTIVE_INF_PROB_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ExperimentalPackage.TB_DISEASE_MODEL__TRANSMISSION_RATE:
			return transmissionRate != TRANSMISSION_RATE_EDEFAULT;
		case ExperimentalPackage.TB_DISEASE_MODEL__ACTIVE_INF_PROB:
			return activeInfProb != ACTIVE_INF_PROB_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (transmissionRate: ");
		result.append(transmissionRate);
		result.append(", activeInfProb: ");
		result.append(activeInfProb);
		result.append(')');
		return result.toString();
	}

	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {		
		
		final double adjustedTransmissionRate  = getTransmissionRate()* (double) timeDelta / (double) getTimePeriod();
		
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;
			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			// Just hard code the parameters for now

			double beta = adjustedTransmissionRate;
			double p = getActiveInfProb();


			TBDiseaseModelLabelValue tbdelta = (TBDiseaseModelLabelValue)deltaValue;
			TBDiseaseModelLabelValue tbcurr = (TBDiseaseModelLabelValue)currentState;

			double S = tbcurr.getS();

			double iaEff = getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, tbcurr.getIa(), ExperimentalPackage.Literals.TB_DISEASE_MODEL_LABEL_VALUE__IA, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
			tbdelta.setIa(beta*S*p*iaEff);
			tbdelta.setIl(beta*S*(1-p)*iaEff);

			double incidence = beta*S*tbcurr.getIa() / tbcurr.getPopulationCount();
			tbdelta.setS(-incidence);
			tbdelta.setIncidence(incidence);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	}

	public void doStochasticProcess(IntegrationLabel iLabel) {
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
		if(iLabel.getNextValue() instanceof TBDiseaseModelLabelValue) {
			TBDiseaseModelLabelValue nextTBVal = (TBDiseaseModelLabelValue)iLabel.getNextValue(); // NOW 
			TBDiseaseModelLabelValue previousTBVal = (TBDiseaseModelLabelValue)iLabel.getCurrentValue(); // before the last integration step

			// We determine which fraction of the total incidence reported comes from each compartment by looking at the disease parameters epsilon (cross immunity) and
			// the total counts in those compartments at the previous time step



			// S -> IA
			double toIA = this.getActiveInfProb();
			double toIL = (1-this.getActiveInfProb());

			addNoise(previousTBVal, nextTBVal, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence(), ExperimentalPackage.eINSTANCE.getTBDiseaseModelLabelValue_Ia(), toIA);
			addNoise(previousTBVal, nextTBVal, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence(), ExperimentalPackage.eINSTANCE.getTBDiseaseModelLabelValue_Il(), toIL);

		}
	}
	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		return ExperimentalFactory.eINSTANCE.createTBDiseaseModelLabel();
	}

	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {
		return ExperimentalFactory.eINSTANCE.createTBDiseaseModelLabelValue();
	}

	@Override
	public Infector createInfector() {
		SIInfector retValue = StandardFactory.eINSTANCE.createSIInfector();
		retValue.setDiseaseName(this.getDiseaseName());
		retValue.setPopulationIdentifier(getPopulationIdentifier());
		return retValue;
	}

} //TBDiseaseModelImpl
