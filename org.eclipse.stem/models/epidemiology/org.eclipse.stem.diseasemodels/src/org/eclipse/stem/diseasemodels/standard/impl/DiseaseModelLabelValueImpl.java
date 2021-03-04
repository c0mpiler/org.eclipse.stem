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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.impl.IntegrationLabelValueImpl;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Disease Model Label Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelValueImpl#getPopulationCount <em>Population Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiseaseModelLabelValueImpl extends IntegrationLabelValueImpl
		implements DiseaseModelLabelValue {
	public static final double ABS_TOLERANCE = 1E-12; // fix hardcoded?

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.DISEASE_MODEL_LABEL_VALUE;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPopulationCount() {
		// TODO: implement this method to return the 'Population Count' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * The default value of the '{@link #getPopulationCount() <em>Population Count</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPopulationCount()
	 * @generated
	 * @ordered
	 */
	protected static final double POPULATION_COUNT_EDEFAULT = 0.0;

	
	/**
	 * Use this for enhanced performance (no boxing) instead of eSet
	 */
	
	@Override
	public void eSetDouble(int featureId, double newValue) {
		super.eSetDouble(featureId, newValue);
	}
	/**
	 * For performance. Retrieve double attributes directly without boxing
	 * 
	 * @param doubleAttribute The attribute to retrieve (must be of type Double)
	 * @return double the value for the attribute
	 */
	@Override
	public double eGetDouble(int featureId) {
		switch (featureId) {
			case StandardPackage.DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT:
				return getPopulationCount();
		}
		return super.eGetDouble(featureId);
	}


	/**
	 * @see org.eclipse.stem.core.common.SanityChecker#sane()
	 */
	@Override
	public boolean sane() {
		EList<EAttribute> attributes = eClass().getEAllAttributes();
		boolean retValue = true;

		for (EAttribute attribute : attributes) {
			if (attribute.isChangeable()) {
				retValue = ((Double)eGet(attribute)).doubleValue() >= 0.0;
				assert retValue;
				retValue = ((Double) eGet(attribute)).doubleValue() <= MAX_POPULATION_VALUE;
				assert retValue;
			}
		}

		return retValue;
	} // sane

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param resolve
	 * @param coreType
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT:
				return getPopulationCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT:
				return getPopulationCount() != POPULATION_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
} // DiseaseModelLabelValueImpl
