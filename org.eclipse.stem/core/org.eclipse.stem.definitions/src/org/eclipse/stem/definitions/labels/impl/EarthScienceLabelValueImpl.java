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
package org.eclipse.stem.definitions.labels.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.stem.core.graph.impl.LabelValueImpl;
import org.eclipse.stem.definitions.labels.EarthScienceLabelValue;
import org.eclipse.stem.definitions.labels.LabelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Science Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getSd <em>Sd</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getMedian <em>Median</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getSkewness <em>Skewness</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getKurtosis <em>Kurtosis</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getRms <em>Rms</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getSamplesize <em>Samplesize</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl#getValidYear <em>Valid Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthScienceLabelValueImpl extends LabelValueImpl implements EarthScienceLabelValue {
	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> mean;

	/**
	 * The cached value of the '{@link #getSd() <em>Sd</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSd()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> sd;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> max;

	/**
	 * The cached value of the '{@link #getMedian() <em>Median</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedian()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> median;

	/**
	 * The cached value of the '{@link #getSkewness() <em>Skewness</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkewness()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> skewness;

	/**
	 * The cached value of the '{@link #getKurtosis() <em>Kurtosis</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurtosis()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> kurtosis;

	/**
	 * The cached value of the '{@link #getRms() <em>Rms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRms()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> rms;

	/**
	 * The cached value of the '{@link #getSamplesize() <em>Samplesize</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesize()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> samplesize;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> range;

	/**
	 * The default value of the '{@link #getValidYear() <em>Valid Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidYear()
	 * @generated
	 * @ordered
	 */
	protected static final int VALID_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValidYear() <em>Valid Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidYear()
	 * @generated
	 * @ordered
	 */
	protected int validYear = VALID_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthScienceLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getMean() {
		if (mean == null) {
			mean = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEAN);
		}
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getSd() {
		if (sd == null) {
			sd = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SD);
		}
		return sd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getMin() {
		if (min == null) {
			min = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MIN);
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getMax() {
		if (max == null) {
			max = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MAX);
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getMedian() {
		if (median == null) {
			median = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEDIAN);
		}
		return median;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getSkewness() {
		if (skewness == null) {
			skewness = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SKEWNESS);
		}
		return skewness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getKurtosis() {
		if (kurtosis == null) {
			kurtosis = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__KURTOSIS);
		}
		return kurtosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getRms() {
		if (rms == null) {
			rms = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RMS);
		}
		return rms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getSamplesize() {
		if (samplesize == null) {
			samplesize = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE);
		}
		return samplesize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Double> getRange() {
		if (range == null) {
			range = new EDataTypeEList<Double>(Double.class, this, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValidYear() {
		return validYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidYear(int newValidYear) {
		int oldValidYear = validYear;
		validYear = newValidYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR, oldValidYear, validYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE:
				return getDataType();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__UNITS:
				return getUnits();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEAN:
				return getMean();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SD:
				return getSd();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MIN:
				return getMin();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MAX:
				return getMax();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEDIAN:
				return getMedian();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SKEWNESS:
				return getSkewness();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__KURTOSIS:
				return getKurtosis();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RMS:
				return getRms();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE:
				return getSamplesize();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RANGE:
				return getRange();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR:
				return getValidYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "boxing" })
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__UNITS:
				setUnits((String)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEAN:
				getMean().clear();
				getMean().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SD:
				getSd().clear();
				getSd().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MIN:
				getMin().clear();
				getMin().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MAX:
				getMax().clear();
				getMax().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEDIAN:
				getMedian().clear();
				getMedian().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SKEWNESS:
				getSkewness().clear();
				getSkewness().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__KURTOSIS:
				getKurtosis().clear();
				getKurtosis().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RMS:
				getRms().clear();
				getRms().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE:
				getSamplesize().clear();
				getSamplesize().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends Double>)newValue);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR:
				setValidYear((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__UNITS:
				setUnits(UNITS_EDEFAULT);
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEAN:
				getMean().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SD:
				getSd().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MIN:
				getMin().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MAX:
				getMax().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEDIAN:
				getMedian().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SKEWNESS:
				getSkewness().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__KURTOSIS:
				getKurtosis().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RMS:
				getRms().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE:
				getSamplesize().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RANGE:
				getRange().clear();
				return;
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR:
				setValidYear(VALID_YEAR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEAN:
				return mean != null && !mean.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SD:
				return sd != null && !sd.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MIN:
				return min != null && !min.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MAX:
				return max != null && !max.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEDIAN:
				return median != null && !median.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SKEWNESS:
				return skewness != null && !skewness.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__KURTOSIS:
				return kurtosis != null && !kurtosis.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RMS:
				return rms != null && !rms.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE:
				return samplesize != null && !samplesize.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RANGE:
				return range != null && !range.isEmpty();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR:
				return validYear != VALID_YEAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataType: "); //$NON-NLS-1$
		result.append(dataType);
		result.append(", units: "); //$NON-NLS-1$
		result.append(units);
		result.append(", mean: "); //$NON-NLS-1$
		result.append(mean);
		result.append(", sd: "); //$NON-NLS-1$
		result.append(sd);
		result.append(", min: "); //$NON-NLS-1$
		result.append(min);
		result.append(", max: "); //$NON-NLS-1$
		result.append(max);
		result.append(", median: "); //$NON-NLS-1$
		result.append(median);
		result.append(", skewness: "); //$NON-NLS-1$
		result.append(skewness);
		result.append(", kurtosis: "); //$NON-NLS-1$
		result.append(kurtosis);
		result.append(", rms: "); //$NON-NLS-1$
		result.append(rms);
		result.append(", samplesize: "); //$NON-NLS-1$
		result.append(samplesize);
		result.append(", range: "); //$NON-NLS-1$
		result.append(range);
		result.append(", validYear: "); //$NON-NLS-1$
		result.append(validYear);
		result.append(')');
		return result.toString();
	}

} //EarthScienceLabelValueImpl
