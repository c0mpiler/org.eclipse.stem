package org.eclipse.stem.diseasemodels.forcing;
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gaussian2 Forcing Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getSigma2_2 <em>Sigma2 2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt1 <em>Att1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt2 <em>Att2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt3 <em>Att3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt4 <em>Att4</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussian2ForcingDiseaseModel()
 * @model
 * @generated
 */
public interface Gaussian2ForcingDiseaseModel extends GaussianForcingDiseaseModel {
	/**
	 * Returns the value of the '<em><b>Sigma2 2</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sigma2 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sigma2 2</em>' attribute.
	 * @see #setSigma2_2(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussian2ForcingDiseaseModel_Sigma2_2()
	 * @model default="100"
	 * @generated
	 */
	double getSigma2_2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getSigma2_2 <em>Sigma2 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigma2 2</em>' attribute.
	 * @see #getSigma2_2()
	 * @generated
	 */
	void setSigma2_2(double value);

	/**
	 * Returns the value of the '<em><b>Att1</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att1</em>' attribute.
	 * @see #setAtt1(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussian2ForcingDiseaseModel_Att1()
	 * @model default="1.0"
	 * @generated
	 */
	double getAtt1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt1 <em>Att1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att1</em>' attribute.
	 * @see #getAtt1()
	 * @generated
	 */
	void setAtt1(double value);

	/**
	 * Returns the value of the '<em><b>Att2</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att2</em>' attribute.
	 * @see #setAtt2(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussian2ForcingDiseaseModel_Att2()
	 * @model default="1.0"
	 * @generated
	 */
	double getAtt2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt2 <em>Att2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att2</em>' attribute.
	 * @see #getAtt2()
	 * @generated
	 */
	void setAtt2(double value);

	/**
	 * Returns the value of the '<em><b>Att3</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att3</em>' attribute.
	 * @see #setAtt3(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussian2ForcingDiseaseModel_Att3()
	 * @model default="1.0"
	 * @generated
	 */
	double getAtt3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt3 <em>Att3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att3</em>' attribute.
	 * @see #getAtt3()
	 * @generated
	 */
	void setAtt3(double value);

	/**
	 * Returns the value of the '<em><b>Att4</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att4</em>' attribute.
	 * @see #setAtt4(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussian2ForcingDiseaseModel_Att4()
	 * @model default="1.0"
	 * @generated
	 */
	double getAtt4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt4 <em>Att4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att4</em>' attribute.
	 * @see #getAtt4()
	 * @generated
	 */
	void setAtt4(double value);

} // Gaussian2ForcingDiseaseModel
