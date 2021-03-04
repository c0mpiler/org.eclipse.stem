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
package org.eclipse.stem.populationmodels.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Data Source Population Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationModel#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationModel#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationModel#isRestart <em>Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getExternalDataSourcePopulationModel()
 * @model
 * @generated
 */
public interface ExternalDataSourcePopulationModel extends PopulationModel {
	
	/**
     * default type of data to input
     */
	public static final String IMPORT_TYPE_STANDARD_POPULATION = "STANDARD_POPULATION";
	
	
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
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getExternalDataSourcePopulationModel_DataPath()
	 * @model
	 * @generated
	 */
	String getDataPath();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationModel#getDataPath <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' attribute.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(String value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * The default value is <code>"250"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(int)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getExternalDataSourcePopulationModel_BufferSize()
	 * @model default="250"
	 * @generated
	 */
	int getBufferSize();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationModel#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Restart</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart</em>' attribute.
	 * @see #setRestart(boolean)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getExternalDataSourcePopulationModel_Restart()
	 * @model default="true"
	 * @generated
	 */
	boolean isRestart();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationModel#isRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart</em>' attribute.
	 * @see #isRestart()
	 * @generated
	 */
	void setRestart(boolean value);

} // ExternalDataSourcePopulationModel
