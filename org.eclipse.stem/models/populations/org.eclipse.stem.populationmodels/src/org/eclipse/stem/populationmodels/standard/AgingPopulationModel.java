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
 * A representation of the model object '<em><b>Aging Population Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.AgingPopulationModel#isHasMaxAge <em>Has Max Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getAgingPopulationModel()
 * @model
 * @generated
 */
public interface AgingPopulationModel extends DemographicPopulationModel {

	/**
	 * Returns the value of the '<em><b>Has Max Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Max Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Max Age</em>' attribute.
	 * @see #setHasMaxAge(boolean)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getAgingPopulationModel_HasMaxAge()
	 * @model
	 * @generated
	 */
	boolean isHasMaxAge();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.AgingPopulationModel#isHasMaxAge <em>Has Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Max Age</em>' attribute.
	 * @see #isHasMaxAge()
	 * @generated
	 */
	void setHasMaxAge(boolean value);
} // AgingPopulationModel
