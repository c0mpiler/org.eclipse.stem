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

import org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSEIRDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.Measles#getVaccineEfficacy <em>Vaccine Efficacy</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.Measles#getInoculationScaling <em>Inoculation Scaling</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.Measles#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.Measles#getSeasonalModulation <em>Seasonal Modulation</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.Measles#getSeasonalModulationPeriod <em>Seasonal Modulation Period</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.Measles#getInoculatedImmunityRate <em>Inoculated Immunity Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.Measles#getNewbornImmunityLossRate <em>Newborn Immunity Loss Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.Measles#getTransmissionRateScaling <em>Transmission Rate Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeasles()
 * @model annotation="http:///org/eclipse/stem/modelgen/model/label *='MeaslesLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='MeaslesLabelValue'"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface Measles extends MultiPopulationSEIRDiseaseModel {
	/**
	 * Returns the value of the '<em><b>Vaccine Efficacy</b></em>' attribute.
	 * The default value is <code>"0.95"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaccine Efficacy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaccine Efficacy</em>' attribute.
	 * @see #setVaccineEfficacy(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeasles_VaccineEfficacy()
	 * @model default="0.95"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1.0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Vaccine Efficacy' tooltip='Vaccine Efficiacy (fractions of inoculations successful)' invalid='Vaccine Efficiacy is invalid' missing='Vaccine Efficiacy is missing'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getVaccineEfficacy();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.Measles#getVaccineEfficacy <em>Vaccine Efficacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaccine Efficacy</em>' attribute.
	 * @see #getVaccineEfficacy()
	 * @generated
	 */
	void setVaccineEfficacy(double value);

	/**
	 * Returns the value of the '<em><b>Inoculation Scaling</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inoculation Scaling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inoculation Scaling</em>' attribute.
	 * @see #setInoculationScaling(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeasles_InoculationScaling()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Inoculation Scaling' tooltip='Scale the total number of incoculations performed (everywhere) using a factor' invalid='Inoculation Scaling is invalid' missing='Inoculation Scaling is missing'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getInoculationScaling();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.Measles#getInoculationScaling <em>Inoculation Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inoculation Scaling</em>' attribute.
	 * @see #getInoculationScaling()
	 * @generated
	 */
	void setInoculationScaling(double value);

	/**
	 * Returns the value of the '<em><b>Phase Shift</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Shift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Shift</em>' attribute.
	 * @see #setPhaseShift(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeasles_PhaseShift()
	 * @model default="0.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Phase Shift' tooltip='The phase shift for the seasonal modulation for measles' invalid='Phase shift is invalid (must be between 0 and 1)' missing='Phase shift is missing'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getPhaseShift();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.Measles#getPhaseShift <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Shift</em>' attribute.
	 * @see #getPhaseShift()
	 * @generated
	 */
	void setPhaseShift(double value);

	/**
	 * Returns the value of the '<em><b>Seasonal Modulation</b></em>' attribute.
	 * The default value is <code>"1.9"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seasonal Modulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seasonal Modulation</em>' attribute.
	 * @see #setSeasonalModulation(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeasles_SeasonalModulation()
	 * @model default="1.9"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='1'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Seasonal Modulation' tooltip='The seasonal modulation in the contact rate for measles' invalid='Seasonal modulation is invalid (>1)' missing='Seasonal modulation is missing'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getSeasonalModulation();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.Measles#getSeasonalModulation <em>Seasonal Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seasonal Modulation</em>' attribute.
	 * @see #getSeasonalModulation()
	 * @generated
	 */
	void setSeasonalModulation(double value);

	/**
	 * Returns the value of the '<em><b>Seasonal Modulation Period</b></em>' attribute.
	 * The default value is <code>"31556925994"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seasonal Modulation Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seasonal Modulation Period</em>' attribute.
	 * @see #setSeasonalModulationPeriod(long)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeasles_SeasonalModulationPeriod()
	 * @model default="31556925994"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Seasonal Modulation Period' unit='ms' tooltip='The period of the seasonal modulation (in ms)' invalid='Seasonal Modulation Period is invalid (>0)' missing='Seasonal Modulation Period is missing'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	long getSeasonalModulationPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.Measles#getSeasonalModulationPeriod <em>Seasonal Modulation Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seasonal Modulation Period</em>' attribute.
	 * @see #getSeasonalModulationPeriod()
	 * @generated
	 */
	void setSeasonalModulationPeriod(long value);

	/**
	 * Returns the value of the '<em><b>Inoculated Immunity Rate</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inoculated Immunity Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inoculated Immunity Rate</em>' attribute.
	 * @see #setInoculatedImmunityRate(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeasles_InoculatedImmunityRate()
	 * @model default="0.05"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Inoculated Immunity Rate' unit='1/TP' tooltip='Rate rate at which population members come immune after inoculation' invalid='Inoculation Immunity Rate is invalid (>0)' missing='Inoculation Immunity Rate is missing'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getInoculatedImmunityRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.Measles#getInoculatedImmunityRate <em>Inoculated Immunity Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inoculated Immunity Rate</em>' attribute.
	 * @see #getInoculatedImmunityRate()
	 * @generated
	 */
	void setInoculatedImmunityRate(double value);

	/**
	 * Returns the value of the '<em><b>Newborn Immunity Loss Rate</b></em>' attribute.
	 * The default value is <code>"2.7E-3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newborn Immunity Loss Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newborn Immunity Loss Rate</em>' attribute.
	 * @see #setNewbornImmunityLossRate(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeasles_NewbornImmunityLossRate()
	 * @model default="2.7E-3"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Newborn Immunity Loss Rate' unit='1/TP' tooltip='The immunity loss rate for new borns' invalid='New Born Immunity Loss Rate is invalid (>1)' missing='New Born Immunity Loss Rate is missing'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getNewbornImmunityLossRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.Measles#getNewbornImmunityLossRate <em>Newborn Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newborn Immunity Loss Rate</em>' attribute.
	 * @see #getNewbornImmunityLossRate()
	 * @generated
	 */
	void setNewbornImmunityLossRate(double value);

	/**
	 * Returns the value of the '<em><b>Transmission Rate Scaling</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Rate Scaling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Rate Scaling</em>' attribute.
	 * @see #setTransmissionRateScaling(double)
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#getMeasles_TransmissionRateScaling()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/messages name='Transmission Rate Scaling' tooltip='Scaling factor for all transmission rates' invalid='Transmission rate scaling is invalid' missing='Transmission rate scaling is missing'"
	 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getTransmissionRateScaling();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.measles.Measles#getTransmissionRateScaling <em>Transmission Rate Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Rate Scaling</em>' attribute.
	 * @see #getTransmissionRateScaling()
	 * @generated
	 */
	void setTransmissionRateScaling(double value);


} // Measles
