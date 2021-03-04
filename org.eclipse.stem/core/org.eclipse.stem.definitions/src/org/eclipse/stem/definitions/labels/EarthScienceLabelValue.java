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
package org.eclipse.stem.definitions.labels;

import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.core.graph.LabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Science Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMean <em>Mean</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getSd <em>Sd</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMedian <em>Median</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getSkewness <em>Skewness</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getKurtosis <em>Kurtosis</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getRms <em>Rms</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getSamplesize <em>Samplesize</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getRange <em>Range</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getValidYear <em>Valid Year</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue()
 * @model
 * @generated
 */
public interface EarthScienceLabelValue extends LabelValue {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_DataType()
	 * @model
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Units()
	 * @model
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Mean()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getMean();

	/**
	 * Returns the value of the '<em><b>Sd</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sd</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sd</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Sd()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getSd();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Min()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Max()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getMax();

	/**
	 * Returns the value of the '<em><b>Median</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Median</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Median</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Median()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getMedian();

	/**
	 * Returns the value of the '<em><b>Skewness</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skewness</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skewness</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Skewness()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getSkewness();

	/**
	 * Returns the value of the '<em><b>Kurtosis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kurtosis</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kurtosis</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Kurtosis()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getKurtosis();

	/**
	 * Returns the value of the '<em><b>Rms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rms</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rms</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Rms()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getRms();

	/**
	 * Returns the value of the '<em><b>Samplesize</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samplesize</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samplesize</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Samplesize()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getSamplesize();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute list.
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_Range()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getRange();

	/**
	 * Returns the value of the '<em><b>Valid Year</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Year</em>' attribute.
	 * @see #setValidYear(int)
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getEarthScienceLabelValue_ValidYear()
	 * @model default="0"
	 * @generated
	 */
	int getValidYear();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getValidYear <em>Valid Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Year</em>' attribute.
	 * @see #getValidYear()
	 * @generated
	 */
	void setValidYear(int value);

} // EarthScienceLabelValue
