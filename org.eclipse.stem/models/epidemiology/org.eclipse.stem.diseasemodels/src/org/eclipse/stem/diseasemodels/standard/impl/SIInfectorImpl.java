package org.eclipse.stem.diseasemodels.standard.impl;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SI Infector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.SIInfectorImpl#getInfectiousCount <em>Infectious Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIInfectorImpl extends StandardInfectorImpl implements SIInfector {
	/**
	 * The default value of the '{@link #getInfectiousCount() <em>Infectious Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfectiousCount()
	 * @generated
	 * @ordered
	 */
	protected static final double INFECTIOUS_COUNT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getInfectiousCount() <em>Infectious Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfectiousCount()
	 * @generated
	 * @ordered
	 */
	protected double infectiousCount = INFECTIOUS_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SIInfectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SI_INFECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInfectiousCount() {
		return infectiousCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfectiousCount(double newInfectiousCount) {
		infectiousCount = newInfectiousCount;
	}

	/**
	 * @param diseaseModelLabel
	 *            the disease model label to have its infectious value
	 *            initialized
	 * @throws ScenarioInitializationException 
	 */
	@Override
	protected void doInitialization(final DiseaseModelLabel diseaseModelLabel) throws ScenarioInitializationException {
		final IntegrationLabel siLabel = diseaseModelLabel;
		final StandardDiseaseModelLabelValue value = (StandardDiseaseModelLabelValue)siLabel.getCurrentValue();
		
		EStructuralFeature infFeature = findFeature(this.getTargetFeature(), value);
		if(infFeature == null) {
			throw new ScenarioInitializationException(NLS.bind(Messages.UNABLE_TO_INFECT_STATE, new Object[]{this.getTargetFeature(), siLabel}), this, new Exception());
		}
		double newSValue = 0.0;
		double currentPop = value.getPopulationCount();

		
		double additionalInfectious = 0.0;
		if(this.isInfectPercentage())
			additionalInfectious = currentPop * (getInfectiousCount() / 100.0);
		else
			additionalInfectious = getInfectiousCount();

		if(additionalInfectious > value.getS()) additionalInfectious = value.getS();
		
		newSValue = value.getS() - additionalInfectious;
		
		double currentInf = value.eGetDouble(infFeature.getFeatureID());
		final double newIValue = currentInf + additionalInfectious;
		
		newSValue = newSValue < 0 ? 0 : newSValue;
		((StandardDiseaseModelLabelValue)siLabel.getCurrentValue()).setS(newSValue);
		((StandardDiseaseModelLabelValue)siLabel.getNextValue()).setS(newSValue);
		(((StandardDiseaseModelLabelValue)siLabel.getProbeValue())).setS(newSValue);
		// We could divide them between the two infectious states, 
		// but this should be okay
		((StandardDiseaseModelLabelValue)siLabel.getCurrentValue()).eSetDouble(infFeature.getFeatureID(), newIValue);
		((StandardDiseaseModelLabelValue)siLabel.getNextValue()).eSetDouble(infFeature.getFeatureID(), newIValue);
		((StandardDiseaseModelLabelValue)siLabel.getProbeValue()).eSetDouble(infFeature.getFeatureID(), newIValue);
	} // doInitialization

	protected EStructuralFeature findFeature(String name, LabelValue lv) {
		for(EAttribute ea:lv.eClass().getEAllAttributes()) {
			if(ea.getName().equals(name)) return ea;
		}
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param resolve
	 * @param coreType
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.SI_INFECTOR__INFECTIOUS_COUNT:
				return getInfectiousCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param newValue
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.SI_INFECTOR__INFECTIOUS_COUNT:
				setInfectiousCount((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.SI_INFECTOR__INFECTIOUS_COUNT:
				setInfectiousCount(INFECTIOUS_COUNT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.SI_INFECTOR__INFECTIOUS_COUNT:
				return infectiousCount != INFECTIOUS_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (infectiousCount: "); //$NON-NLS-1$
		result.append(infectiousCount);
		result.append(')');
		return result.toString();
	}

} // SIInfectorImpl
