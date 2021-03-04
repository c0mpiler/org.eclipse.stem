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
package org.eclipse.stem.diseasemodels.standard.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.NodeDecoratorImpl;
import org.eclipse.stem.diseasemodels.standard.DiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disease Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseInitializerImpl#getDiseaseName <em>Disease Name</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseInitializerImpl#getPopulationIdentifier <em>Population Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiseaseInitializerImpl extends NodeDecoratorImpl implements DiseaseInitializer {
	/**
	 * The default value of the '{@link #getDiseaseName() <em>Disease Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISEASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiseaseName() <em>Disease Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseName()
	 * @generated
	 * @ordered
	 */
	protected String diseaseName = DISEASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopulationIdentifier() <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopulationIdentifier() <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String populationIdentifier = POPULATION_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.DISEASE_INITIALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiseaseName() {
		return diseaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseName(String newDiseaseName) {
		diseaseName = newDiseaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopulationIdentifier() {
		return populationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationIdentifier(String newPopulationIdentifier) {
		populationIdentifier = newPopulationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.DISEASE_INITIALIZER__DISEASE_NAME:
				return getDiseaseName();
			case StandardPackage.DISEASE_INITIALIZER__POPULATION_IDENTIFIER:
				return getPopulationIdentifier();
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
			case StandardPackage.DISEASE_INITIALIZER__DISEASE_NAME:
				setDiseaseName((String)newValue);
				return;
			case StandardPackage.DISEASE_INITIALIZER__POPULATION_IDENTIFIER:
				setPopulationIdentifier((String)newValue);
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
			case StandardPackage.DISEASE_INITIALIZER__DISEASE_NAME:
				setDiseaseName(DISEASE_NAME_EDEFAULT);
				return;
			case StandardPackage.DISEASE_INITIALIZER__POPULATION_IDENTIFIER:
				setPopulationIdentifier(POPULATION_IDENTIFIER_EDEFAULT);
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
			case StandardPackage.DISEASE_INITIALIZER__DISEASE_NAME:
				return DISEASE_NAME_EDEFAULT == null ? diseaseName != null : !DISEASE_NAME_EDEFAULT.equals(diseaseName);
			case StandardPackage.DISEASE_INITIALIZER__POPULATION_IDENTIFIER:
				return POPULATION_IDENTIFIER_EDEFAULT == null ? populationIdentifier != null : !POPULATION_IDENTIFIER_EDEFAULT.equals(populationIdentifier);
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
		result.append(" (diseaseName: "); //$NON-NLS-1$
		result.append(diseaseName);
		result.append(", populationIdentifier: "); //$NON-NLS-1$
		result.append(populationIdentifier);
		result.append(')');
		return result.toString();
	}

	@Override
	public void updateLabels(STEMTime time, long timerPeriod, int cycle) {
		// Do nothing
	}

} //DiseaseInitializerImpl
