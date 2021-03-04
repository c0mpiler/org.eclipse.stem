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
package org.eclipse.stem.diseasemodels.veterinary;

import org.eclipse.stem.populationmodels.standard.PopulationModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contaminated Units</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits#getDissapationRate <em>Dissapation Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits#getSheddingFactor <em>Shedding Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage#getContaminatedUnits()
 * @model annotation="http:///org/eclipse/stem/modelgen/model/label *='ContaminatedUnitsLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='ContaminatedUnitsLabelValue'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/adapters propertyEditorSuperClass='org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditor' stringProviderSuperClass='org.eclipse.stem.ui.populationmodels.standard.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter' labelRelativeValueProviderSuperClass='org.eclipse.stem.ui.populationmodels.adapters.StandardRelativeValueProviderAdapterFactory.StandardPopulationModelLabelRelativeValueProvider' labelValueRelativeValueProviderSuperClass='org.eclipse.stem.ui.populationmodels.adapters.StandardRelativeValueProviderAdapterFactory.PopulationModelLabelValueRelativeValueProvider'"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface ContaminatedUnits extends PopulationModel {
	/**
	 * Returns the value of the '<em><b>Dissapation Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissapation Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissapation Rate</em>' attribute.
	 * @see #setDissapationRate(double)
	 * @see org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage#getContaminatedUnits_DissapationRate()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Dissapation Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getDissapationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits#getDissapationRate <em>Dissapation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissapation Rate</em>' attribute.
	 * @see #getDissapationRate()
	 * @generated
	 */
	void setDissapationRate(double value);

	/**
	 * Returns the value of the '<em><b>Shedding Factor</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shedding Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shedding Factor</em>' attribute.
	 * @see #setSheddingFactor(double)
	 * @see org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage#getContaminatedUnits_SheddingFactor()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Shedding Factor'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getSheddingFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits#getSheddingFactor <em>Shedding Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shedding Factor</em>' attribute.
	 * @see #getSheddingFactor()
	 * @generated
	 */
	void setSheddingFactor(double value);


} // ContaminatedUnits
