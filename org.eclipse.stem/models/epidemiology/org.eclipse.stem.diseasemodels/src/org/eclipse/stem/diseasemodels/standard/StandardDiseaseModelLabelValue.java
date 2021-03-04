// StandardDiseaseModelLabelValue.java
package org.eclipse.stem.diseasemodels.standard;

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
 * This interface defines a class in an EMF model for an Standard disease model
 * label value. In a standard disease model population members can be in a
 * single <em>Susceptible</em> state, which means that they are not exposed or
 * infected by a disease. Sub-classes could introduce additional states in which
 * population members could exist.
 * 
 * @see SIR
 * @see SIRLabel
 * @see SIRLabelValue
 * @see SEIR
 * @see SEIRLabel
 * @see SEIRLabelValue
 * 
 * @model abstract="true"
 */


public interface StandardDiseaseModelLabelValue extends DiseaseModelLabelValue {
	/**
	 * @return the number of population members in the <em>Susceptible</em>
	 *         state.
	 * @model
	 */
	double getS();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see #getS()
	 * @generated
	 */
	void setS(double value);

	/**
	 * Returns the value of the '<em><b>Incidence</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence</em>' attribute.
	 * @see #setIncidence(double)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseModelLabelValue_Incidence()
	 * @model default="0.0"
	 * @generated
	 */
	double getIncidence();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue#getIncidence <em>Incidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence</em>' attribute.
	 * @see #getIncidence()
	 * @generated
	 */
	void setIncidence(double value);

	/**
	 * Returns the value of the '<em><b>Disease Deaths</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disease Deaths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disease Deaths</em>' attribute.
	 * @see #setDiseaseDeaths(double)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseModelLabelValue_DiseaseDeaths()
	 * @model default="0.0"
	 * @generated
	 */
	double getDiseaseDeaths();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue#getDiseaseDeaths <em>Disease Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Deaths</em>' attribute.
	 * @see #getDiseaseDeaths()
	 * @generated
	 */
	void setDiseaseDeaths(double value);
	
} // StandardDiseaseModelLabelValue
