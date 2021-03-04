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
package org.eclipse.stem.diseasemodels.measles;

import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getVaccinated <em>Vaccinated</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getImmunisations <em>Immunisations</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getM <em>M</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getIncidenceV <em>Incidence V</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeaslesLabelValue()
 * @model annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface MeaslesLabelValue extends SEIRLabelValue {

	/**
	 * Returns the value of the '<em><b>Vaccinated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaccinated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaccinated</em>' attribute.
	 * @see #setVaccinated(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeaslesLabelValue_Vaccinated()
	 * @model annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getVaccinated();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getVaccinated <em>Vaccinated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaccinated</em>' attribute.
	 * @see #getVaccinated()
	 * @generated
	 */
	void setVaccinated(double value);

	/**
	 * Returns the value of the '<em><b>Immunisations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immunisations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immunisations</em>' attribute.
	 * @see #setImmunisations(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeaslesLabelValue_Immunisations()
	 * @model annotation="http:///org/eclipse/stem/modelgen/compartment/type type='Incidence'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getImmunisations();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getImmunisations <em>Immunisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunisations</em>' attribute.
	 * @see #getImmunisations()
	 * @generated
	 */
	void setImmunisations(double value);

	/**
	 * Returns the value of the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' attribute.
	 * @see #setM(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeaslesLabelValue_M()
	 * @model annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getM();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getM <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' attribute.
	 * @see #getM()
	 * @generated
	 */
	void setM(double value);

	/**
	 * Returns the value of the '<em><b>Incidence V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence V</em>' attribute.
	 * @see #setIncidenceV(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeaslesLabelValue_IncidenceV()
	 * @model annotation="http:///org/eclipse/stem/modelgen/compartment/type type='Incidence'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getIncidenceV();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getIncidenceV <em>Incidence V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence V</em>' attribute.
	 * @see #getIncidenceV()
	 * @generated
	 */
	void setIncidenceV(double value);

} // MeaslesLabelValue
