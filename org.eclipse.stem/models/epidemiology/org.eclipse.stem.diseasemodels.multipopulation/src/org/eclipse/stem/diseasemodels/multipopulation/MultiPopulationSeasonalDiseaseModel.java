package org.eclipse.stem.diseasemodels.multipopulation;

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

import org.eclipse.stem.core.common.DoubleValueMatrix;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Population Seasonal Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel#getModulationPoints <em>Modulation Points</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel#isUseSplineInterpolation <em>Use Spline Interpolation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage#getMultiPopulationSeasonalDiseaseModel()
 * @model
 * @generated
 */
public interface MultiPopulationSeasonalDiseaseModel extends MultiPopulationSEIRDiseaseModel {
	/**
	 * Returns the value of the '<em><b>Modulation Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulation Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulation Points</em>' containment reference.
	 * @see #setModulationPoints(DoubleValueMatrix)
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage#getMultiPopulationSeasonalDiseaseModel_ModulationPoints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DoubleValueMatrix getModulationPoints();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel#getModulationPoints <em>Modulation Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Points</em>' containment reference.
	 * @see #getModulationPoints()
	 * @generated
	 */
	void setModulationPoints(DoubleValueMatrix value);

	/**
	 * Returns the value of the '<em><b>Use Spline Interpolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Spline Interpolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Spline Interpolation</em>' attribute.
	 * @see #setUseSplineInterpolation(boolean)
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage#getMultiPopulationSeasonalDiseaseModel_UseSplineInterpolation()
	 * @model
	 * @generated
	 */
	boolean isUseSplineInterpolation();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel#isUseSplineInterpolation <em>Use Spline Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Spline Interpolation</em>' attribute.
	 * @see #isUseSplineInterpolation()
	 * @generated
	 */
	void setUseSplineInterpolation(boolean value);

} // MultiPopulationSeasonalDiseaseModel
