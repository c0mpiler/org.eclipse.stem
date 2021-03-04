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
package org.eclipse.stem.diseasemodels.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Data Source Disease Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#getRow <em>Row</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#isDoRescaling <em>Do Rescaling</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getExternalDataSourceDiseaseInitializer()
 * @model
 * @generated
 */
public interface ExternalDataSourceDiseaseInitializer extends DiseaseInitializer {
	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' attribute.
	 * @see #setDataPath(String)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getExternalDataSourceDiseaseInitializer_DataPath()
	 * @model
	 * @generated
	 */
	String getDataPath();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#getDataPath <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' attribute.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(String value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(int)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getExternalDataSourceDiseaseInitializer_Row()
	 * @model
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

	/**
	 * Returns the value of the '<em><b>Do Rescaling</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Rescaling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Rescaling</em>' attribute.
	 * @see #setDoRescaling(boolean)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getExternalDataSourceDiseaseInitializer_DoRescaling()
	 * @model default="false"
	 * @generated
	 */
	boolean isDoRescaling();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#isDoRescaling <em>Do Rescaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Rescaling</em>' attribute.
	 * @see #isDoRescaling()
	 * @generated
	 */
	void setDoRescaling(boolean value);

} // ExternalDataSourceDiseaseInitializer
