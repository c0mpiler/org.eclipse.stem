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
package org.eclipse.stem.diseasemodels.evolving;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel#getImmunityLossRate <em>Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel#getCrossImmunityRate <em>Cross Immunity Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingSIRDiseaseModel()
 * @model annotation="http:///org/eclipse/stem/modelgen/model/label *='EvolvingSIRDiseaseModelLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='EvolvingSIRDiseaseModelLabelValue'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/adapters propertyEditorSuperClass='org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor' stringProviderSuperClass='org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter' labelRelativeValueProviderSuperClass='org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelRelativeValueProvider' labelValueRelativeValueProviderSuperClass='org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelValueRelativeValueProvider'"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface EvolvingSIRDiseaseModel extends EvolvingSIDiseaseModel {
	/**
	 * Returns the value of the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immunity Loss Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immunity Loss Rate</em>' attribute.
	 * @see #setImmunityLossRate(double)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingSIRDiseaseModel_ImmunityLossRate()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0.0' maxValue='1.0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Immunity Loss Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getImmunityLossRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel#getImmunityLossRate <em>Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunity Loss Rate</em>' attribute.
	 * @see #getImmunityLossRate()
	 * @generated
	 */
	void setImmunityLossRate(double value);

	/**
	 * Returns the value of the '<em><b>Cross Immunity Rate</b></em>' attribute.
	 * The default value is <code>"0.75"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Immunity Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Immunity Rate</em>' attribute.
	 * @see #setCrossImmunityRate(double)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingSIRDiseaseModel_CrossImmunityRate()
	 * @model default="0.75"
	 * @generated
	 */
	double getCrossImmunityRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel#getCrossImmunityRate <em>Cross Immunity Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Immunity Rate</em>' attribute.
	 * @see #getCrossImmunityRate()
	 * @generated
	 */
	void setCrossImmunityRate(double value);


} // EvolvingSIRDiseaseModel
