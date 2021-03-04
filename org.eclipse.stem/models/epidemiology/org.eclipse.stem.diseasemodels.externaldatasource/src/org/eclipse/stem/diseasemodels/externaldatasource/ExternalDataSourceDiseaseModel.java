// ExternalDataSourceDiseaseModel.java
package org.eclipse.stem.diseasemodels.externaldatasource;

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


import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.stem.diseasemodels.Activator;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;

/**
 * This interface is an EMF Model.
 * 
 * @model
 */
public interface ExternalDataSourceDiseaseModel extends StandardDiseaseModel {


	/**
     * default type of data to input
     */
	public static final String IMPORT_TYPE_SI = "SI";
	/**
     * default type of data to input
     */
	public static final String IMPORT_TYPE_SIR = "SIR";
	/**
     * default type of data to input
     */
	public static final String IMPORT_TYPE_SEIR = "SEIR";
	
	/**
	 * This is the Default ROOT folder for Import files.
	 * The User can change this but by default, and for testing,
	 * data will be in sub-folders of the disease model plug-in runtime preferences
	 */
	public static final IPath PATH = Activator.getDefault().getStateLocation();

	/**
	 * path separator
	 */
	public static final String sep = File.separator;
	
	/**
	 * This is the Default folder for Import files.
	 * The User can change this but by default, and for testing,
	 * data will be in sub-folders of the disease model plug-in runtime preferences
	 */
	public static final String PLAYBACK_SUBDIR = sep+"csv"+sep+"Import";
	
	/**
	 * This is the Default directory for Import files.
	 * The User can change this but by default, and for testing,
	 * data will be in sub-folders of the disease model plug-in runtime preferences
	 */	
	public static final String DEFAULT_DIR = PATH.toOSString() + PLAYBACK_SUBDIR+sep;
	
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
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourcePackage#getExternalDataSourceDiseaseModel_DataPath()
	 * @model
	 * @generated
	 */
	String getDataPath();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#getDataPath <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' attribute.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(String value);

	/**
	 * Returns the value of the '<em><b>Disease Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disease Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disease Type</em>' attribute.
	 * @see #setDiseaseType(String)
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourcePackage#getExternalDataSourceDiseaseModel_DiseaseType()
	 * @model
	 * @generated
	 */
	String getDiseaseType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#getDiseaseType <em>Disease Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Type</em>' attribute.
	 * @see #getDiseaseType()
	 * @generated
	 */
	void setDiseaseType(String value);

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
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourcePackage#getExternalDataSourceDiseaseModel_BufferSize()
	 * @model default="250"
	 * @generated
	 */
	int getBufferSize();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Restart</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart</em>' attribute.
	 * @see #setRestart(boolean)
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourcePackage#getExternalDataSourceDiseaseModel_Restart()
	 * @model default="false"
	 * @generated
	 */
	boolean isRestart();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#isRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart</em>' attribute.
	 * @see #isRestart()
	 * @generated
	 */
	void setRestart(boolean value);	

	
	
	
	
} // ExternalDataSourceDiseaseModel
