package org.eclipse.stem.diseasemodels.multipopulation;

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

import org.eclipse.stem.core.common.DoubleValueList;
import org.eclipse.stem.core.common.DoubleValueMatrix;
import org.eclipse.stem.core.common.StringValueList;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Population SI Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getPopulationGroups <em>Population Groups</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getTransmissionRate <em>Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getRecoveryRate <em>Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getInfectiousMortalityRate <em>Infectious Mortality Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage#getMultiPopulationSIDiseaseModel()
 * @model
 * @generated
 */
public interface MultiPopulationSIDiseaseModel extends StandardDiseaseModel {

	/**
	 * Returns the value of the '<em><b>Transmission Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Rate</em>' containment reference.
	 * @see #setTransmissionRate(DoubleValueMatrix)
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage#getMultiPopulationSIDiseaseModel_TransmissionRate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DoubleValueMatrix getTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getTransmissionRate <em>Transmission Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Rate</em>' containment reference.
	 * @see #getTransmissionRate()
	 * @generated
	 */
	void setTransmissionRate(DoubleValueMatrix value);

	/**
	 * Returns the value of the '<em><b>Recovery Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Rate</em>' containment reference.
	 * @see #setRecoveryRate(DoubleValueList)
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage#getMultiPopulationSIDiseaseModel_RecoveryRate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DoubleValueList getRecoveryRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getRecoveryRate <em>Recovery Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Rate</em>' containment reference.
	 * @see #getRecoveryRate()
	 * @generated
	 */
	void setRecoveryRate(DoubleValueList value);

	/**
	 * Returns the value of the '<em><b>Infectious Mortality Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infectious Mortality Rate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infectious Mortality Rate</em>' containment reference.
	 * @see #setInfectiousMortalityRate(DoubleValueList)
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage#getMultiPopulationSIDiseaseModel_InfectiousMortalityRate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DoubleValueList getInfectiousMortalityRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getInfectiousMortalityRate <em>Infectious Mortality Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infectious Mortality Rate</em>' containment reference.
	 * @see #getInfectiousMortalityRate()
	 * @generated
	 */
	void setInfectiousMortalityRate(DoubleValueList value);

	/**
	 * Returns the value of the '<em><b>Population Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Groups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Groups</em>' containment reference.
	 * @see #setPopulationGroups(StringValueList)
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage#getMultiPopulationSIDiseaseModel_PopulationGroups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringValueList getPopulationGroups();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getPopulationGroups <em>Population Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Groups</em>' containment reference.
	 * @see #getPopulationGroups()
	 * @generated
	 */
	void setPopulationGroups(StringValueList value);
} // MultiPopulationSIDiseaseModel
