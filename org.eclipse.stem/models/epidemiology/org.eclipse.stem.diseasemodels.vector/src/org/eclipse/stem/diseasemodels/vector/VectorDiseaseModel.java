package org.eclipse.stem.diseasemodels.vector;

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

import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel#getVectorPopulationIdentifier <em>Vector Population Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVectorDiseaseModel()
 * @model abstract="true"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/label *='StandardDiseaseModelLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='StandardDiseaseModelLabelValue'"
 * @generated
 */
public interface VectorDiseaseModel extends StandardDiseaseModel {
	/**
	 * Returns the value of the '<em><b>Vector Population Identifier</b></em>' attribute.
	 * The default value is <code>"anopheles"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Population Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Population Identifier</em>' attribute.
	 * @see #setVectorPopulationIdentifier(String)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getVectorDiseaseModel_VectorPopulationIdentifier()
	 * @model default="anopheles"
	 * @generated
	 */
	String getVectorPopulationIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel#getVectorPopulationIdentifier <em>Vector Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Population Identifier</em>' attribute.
	 * @see #getVectorPopulationIdentifier()
	 * @generated
	 */
	void setVectorPopulationIdentifier(String value);

} // VectorDiseaseModel
