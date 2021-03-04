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

import org.eclipse.stem.diseasemodels.standard.SI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Veterinary Disease</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDisease#getEnvironmentalTransmissionRate <em>Environmental Transmission Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage#getSimpleVeterinaryDisease()
 * @model annotation="http:///org/eclipse/stem/modelgen/model/label *='SimpleVeterinaryDiseaseLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='SimpleVeterinaryDiseaseLabelValue'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/adapters propertyEditorSuperClass='org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor' stringProviderSuperClass='org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter' labelRelativeValueProviderSuperClass='org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelRelativeValueProvider' labelValueRelativeValueProviderSuperClass='org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelValueRelativeValueProvider'"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface SimpleVeterinaryDisease extends SI {
	/**
	 * Returns the value of the '<em><b>Environmental Transmission Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environmental Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environmental Transmission Rate</em>' attribute.
	 * @see #setEnvironmentalTransmissionRate(double)
	 * @see org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage#getSimpleVeterinaryDisease_EnvironmentalTransmissionRate()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Environmental Transmission Rate'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getEnvironmentalTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDisease#getEnvironmentalTransmissionRate <em>Environmental Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environmental Transmission Rate</em>' attribute.
	 * @see #getEnvironmentalTransmissionRate()
	 * @generated
	 */
	void setEnvironmentalTransmissionRate(double value);


} // SimpleVeterinaryDisease
