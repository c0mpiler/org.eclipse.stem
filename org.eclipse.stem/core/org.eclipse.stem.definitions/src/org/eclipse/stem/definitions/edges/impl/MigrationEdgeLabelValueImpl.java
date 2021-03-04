package org.eclipse.stem.definitions.edges.impl;

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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.graph.impl.LabelValueImpl;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migration Edge Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.edges.impl.MigrationEdgeLabelValueImpl#getMigrationRate <em>Migration Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.edges.impl.MigrationEdgeLabelValueImpl#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MigrationEdgeLabelValueImpl extends LabelValueImpl implements MigrationEdgeLabelValue {
	/**
	 * The default value of the '{@link #getMigrationRate() <em>Migration Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double MIGRATION_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMigrationRate() <em>Migration Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationRate()
	 * @generated
	 * @ordered
	 */
	protected double migrationRate = MIGRATION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_PERIOD_EDEFAULT = 86400000L;

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected long timePeriod = TIME_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigrationEdgeLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdgesPackage.Literals.MIGRATION_EDGE_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMigrationRate() {
		return migrationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMigrationRate(double newMigrationRate) {
		double oldMigrationRate = migrationRate;
		migrationRate = newMigrationRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__MIGRATION_RATE, oldMigrationRate, migrationRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimePeriod(long newTimePeriod) {
		long oldTimePeriod = timePeriod;
		timePeriod = newTimePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__TIME_PERIOD, oldTimePeriod, timePeriod));
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
			case EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__MIGRATION_RATE:
				return getMigrationRate();
			case EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__TIME_PERIOD:
				return getTimePeriod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__MIGRATION_RATE:
				setMigrationRate((Double)newValue);
				return;
			case EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__TIME_PERIOD:
				setTimePeriod((Long)newValue);
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
			case EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__MIGRATION_RATE:
				setMigrationRate(MIGRATION_RATE_EDEFAULT);
				return;
			case EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__TIME_PERIOD:
				setTimePeriod(TIME_PERIOD_EDEFAULT);
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
			case EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__MIGRATION_RATE:
				return migrationRate != MIGRATION_RATE_EDEFAULT;
			case EdgesPackage.MIGRATION_EDGE_LABEL_VALUE__TIME_PERIOD:
				return timePeriod != TIME_PERIOD_EDEFAULT;
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
		result.append(" (migrationRate: "); //$NON-NLS-1$
		result.append(migrationRate);
		result.append(", timePeriod: "); //$NON-NLS-1$
		result.append(timePeriod);
		result.append(')');
		return result.toString();
	}

	/**
	 * Resets the value for this migration edge to the default value. Is this
	 * really the correct behavior? do we really want to go to the model start
	 * state?
	 */
	@Override
	public void reset() {
		setMigrationRate(MIGRATION_RATE_EDEFAULT);
	}

	/**
	 * @see org.eclipse.stem.core.graph.impl.LabelValueImpl#sane()
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();
		
		retValue = retValue && !Double.isNaN( getMigrationRate());
		assert retValue : "Migration rate is NaN";
		
		retValue = retValue && !Double.isInfinite( getMigrationRate());
		assert retValue: "Migration rate is Infinite";
		
		return retValue;
	} // sane

	
} //MigrationEdgeLabelValueImpl
