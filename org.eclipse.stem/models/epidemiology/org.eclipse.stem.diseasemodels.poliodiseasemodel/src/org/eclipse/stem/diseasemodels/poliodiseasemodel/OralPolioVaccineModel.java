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
package org.eclipse.stem.diseasemodels.poliodiseasemodel;

import org.eclipse.stem.diseasemodels.standard.SEIR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oral Polio Vaccine Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getEfficacyVaccine <em>Efficacy Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getReversionRate <em>Reversion Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getPartialSusceptibilityVaccine <em>Partial Susceptibility Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getTransRateVaccine <em>Trans Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getIncubRateVaccine <em>Incub Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getInfectRecoveryRateVaccine <em>Infect Recovery Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getParalyticFractionVaccine <em>Paralytic Fraction Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getParalyticFractionWild <em>Paralytic Fraction Wild</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOralPolioVaccineModel()
 * @model
 * @generated
 */
public interface OralPolioVaccineModel extends SEIR {
	/**
	 * Returns the value of the '<em><b>Efficacy Vaccine</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Efficacy Vaccine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efficacy Vaccine</em>' attribute.
	 * @see #setEfficacyVaccine(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOralPolioVaccineModel_EfficacyVaccine()
	 * @model default="1.0"
	 * @generated
	 */
	double getEfficacyVaccine();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getEfficacyVaccine <em>Efficacy Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficacy Vaccine</em>' attribute.
	 * @see #getEfficacyVaccine()
	 * @generated
	 */
	void setEfficacyVaccine(double value);

	/**
	 * Returns the value of the '<em><b>Reversion Rate</b></em>' attribute.
	 * The default value is <code>"1e-4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reversion Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reversion Rate</em>' attribute.
	 * @see #setReversionRate(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOralPolioVaccineModel_ReversionRate()
	 * @model default="1e-4"
	 * @generated
	 */
	double getReversionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getReversionRate <em>Reversion Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reversion Rate</em>' attribute.
	 * @see #getReversionRate()
	 * @generated
	 */
	void setReversionRate(double value);

	/**
	 * Returns the value of the '<em><b>Partial Susceptibility Vaccine</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial Susceptibility Vaccine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Susceptibility Vaccine</em>' attribute.
	 * @see #setPartialSusceptibilityVaccine(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOralPolioVaccineModel_PartialSusceptibilityVaccine()
	 * @model default="0.0"
	 * @generated
	 */
	double getPartialSusceptibilityVaccine();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getPartialSusceptibilityVaccine <em>Partial Susceptibility Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Susceptibility Vaccine</em>' attribute.
	 * @see #getPartialSusceptibilityVaccine()
	 * @generated
	 */
	void setPartialSusceptibilityVaccine(double value);

	/**
	 * Returns the value of the '<em><b>Trans Rate Vaccine</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Rate Vaccine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Rate Vaccine</em>' attribute.
	 * @see #setTransRateVaccine(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOralPolioVaccineModel_TransRateVaccine()
	 * @model default="1.0"
	 * @generated
	 */
	double getTransRateVaccine();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getTransRateVaccine <em>Trans Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Rate Vaccine</em>' attribute.
	 * @see #getTransRateVaccine()
	 * @generated
	 */
	void setTransRateVaccine(double value);

	/**
	 * Returns the value of the '<em><b>Incub Rate Vaccine</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incub Rate Vaccine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incub Rate Vaccine</em>' attribute.
	 * @see #setIncubRateVaccine(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOralPolioVaccineModel_IncubRateVaccine()
	 * @model default="1.0"
	 * @generated
	 */
	double getIncubRateVaccine();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getIncubRateVaccine <em>Incub Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incub Rate Vaccine</em>' attribute.
	 * @see #getIncubRateVaccine()
	 * @generated
	 */
	void setIncubRateVaccine(double value);

	/**
	 * Returns the value of the '<em><b>Infect Recovery Rate Vaccine</b></em>' attribute.
	 * The default value is <code>"22.81"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infect Recovery Rate Vaccine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infect Recovery Rate Vaccine</em>' attribute.
	 * @see #setInfectRecoveryRateVaccine(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOralPolioVaccineModel_InfectRecoveryRateVaccine()
	 * @model default="22.81"
	 * @generated
	 */
	double getInfectRecoveryRateVaccine();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getInfectRecoveryRateVaccine <em>Infect Recovery Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infect Recovery Rate Vaccine</em>' attribute.
	 * @see #getInfectRecoveryRateVaccine()
	 * @generated
	 */
	void setInfectRecoveryRateVaccine(double value);

	/**
	 * Returns the value of the '<em><b>Paralytic Fraction Vaccine</b></em>' attribute.
	 * The default value is <code>"7.14e-7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paralytic Fraction Vaccine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paralytic Fraction Vaccine</em>' attribute.
	 * @see #setParalyticFractionVaccine(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOralPolioVaccineModel_ParalyticFractionVaccine()
	 * @model default="7.14e-7"
	 * @generated
	 */
	double getParalyticFractionVaccine();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getParalyticFractionVaccine <em>Paralytic Fraction Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paralytic Fraction Vaccine</em>' attribute.
	 * @see #getParalyticFractionVaccine()
	 * @generated
	 */
	void setParalyticFractionVaccine(double value);

	/**
	 * Returns the value of the '<em><b>Paralytic Fraction Wild</b></em>' attribute.
	 * The default value is <code>"0.005"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paralytic Fraction Wild</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paralytic Fraction Wild</em>' attribute.
	 * @see #setParalyticFractionWild(double)
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#getOralPolioVaccineModel_ParalyticFractionWild()
	 * @model default="0.005"
	 * @generated
	 */
	double getParalyticFractionWild();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getParalyticFractionWild <em>Paralytic Fraction Wild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paralytic Fraction Wild</em>' attribute.
	 * @see #getParalyticFractionWild()
	 * @generated
	 */
	void setParalyticFractionWild(double value);

} // OralPolioVaccineModel
