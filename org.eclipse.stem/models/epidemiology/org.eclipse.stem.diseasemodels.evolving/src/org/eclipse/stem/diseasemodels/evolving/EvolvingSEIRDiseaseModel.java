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
 * A representation of the model object '<em><b>SEIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel#getIncubationRate <em>Incubation Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingSEIRDiseaseModel()
 * @model annotation="http:///org/eclipse/stem/modelgen/model/label *='EvolvingSEIRDiseaseModelLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='EvolvingSEIRDiseaseModelLabelValue'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/adapters propertyEditorSuperClass='org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor' stringProviderSuperClass='org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter' labelRelativeValueProviderSuperClass='org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelRelativeValueProvider' labelValueRelativeValueProviderSuperClass='org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelValueRelativeValueProvider'"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface EvolvingSEIRDiseaseModel extends EvolvingSIRDiseaseModel {
	/**
	 * Returns the value of the '<em><b>Incubation Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incubation Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incubation Rate</em>' attribute.
	 * @see #setIncubationRate(double)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingSEIRDiseaseModel_IncubationRate()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0.0' maxValue='1.0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Incubation Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getIncubationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel#getIncubationRate <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incubation Rate</em>' attribute.
	 * @see #getIncubationRate()
	 * @generated
	 */
	void setIncubationRate(double value);


} // EvolvingSEIRDiseaseModel
