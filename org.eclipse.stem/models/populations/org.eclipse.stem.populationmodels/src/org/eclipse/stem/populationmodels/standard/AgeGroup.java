package org.eclipse.stem.populationmodels.standard;

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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Age Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.AgeGroup#getFromAge <em>From Age</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.AgeGroup#getToAge <em>To Age</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.AgeGroup#getDeathFactor <em>Death Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.AgeGroup#isLimited <em>Limited</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getAgeGroup()
 * @model
 * @generated
 */
public interface AgeGroup extends PopulationGroup {
	/**
	 * Returns the value of the '<em><b>From Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Age</em>' attribute.
	 * @see #setFromAge(int)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getAgeGroup_FromAge()
	 * @model
	 * @generated
	 */
	int getFromAge();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.AgeGroup#getFromAge <em>From Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Age</em>' attribute.
	 * @see #getFromAge()
	 * @generated
	 */
	void setFromAge(int value);

	/**
	 * Returns the value of the '<em><b>To Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Age</em>' attribute.
	 * @see #setToAge(int)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getAgeGroup_ToAge()
	 * @model
	 * @generated
	 */
	int getToAge();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.AgeGroup#getToAge <em>To Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Age</em>' attribute.
	 * @see #getToAge()
	 * @generated
	 */
	void setToAge(int value);

	/**
	 * Returns the value of the '<em><b>Death Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Death Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Death Factor</em>' attribute.
	 * @see #setDeathFactor(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getAgeGroup_DeathFactor()
	 * @model default="1.0"
	 * @generated
	 */
	double getDeathFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.AgeGroup#getDeathFactor <em>Death Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Death Factor</em>' attribute.
	 * @see #getDeathFactor()
	 * @generated
	 */
	void setDeathFactor(double value);

	/**
	 * Returns the value of the '<em><b>Limited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limited</em>' attribute.
	 * @see #setLimited(boolean)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getAgeGroup_Limited()
	 * @model
	 * @generated
	 */
	boolean isLimited();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.AgeGroup#isLimited <em>Limited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limited</em>' attribute.
	 * @see #isLimited()
	 * @generated
	 */
	void setLimited(boolean value);

} // AgeGroup
