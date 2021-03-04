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
package org.eclipse.stem.core.graph.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.graph.IntegrationLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.graph.impl.IntegrationLabelValueImpl#getArrivals <em>Arrivals</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.impl.IntegrationLabelValueImpl#getDepartures <em>Departures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IntegrationLabelValueImpl extends LabelValueImpl implements IntegrationLabelValue {
	/**
	 * The cached value of the '{@link #getArrivals() <em>Arrivals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivals()
	 * @generated
	 * @ordered
	 */
	protected EList<Exchange> arrivals;

	/**
	 * The cached value of the '{@link #getDepartures() <em>Departures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartures()
	 * @generated
	 * @ordered
	 */
	protected EList<Exchange> departures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.INTEGRATION_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exchange> getArrivals() {
		if (arrivals == null) {
			arrivals = new EObjectResolvingEList<Exchange>(Exchange.class, this, GraphPackage.INTEGRATION_LABEL_VALUE__ARRIVALS);
		}
		return arrivals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exchange> getDepartures() {
		if (departures == null) {
			departures = new EObjectResolvingEList<Exchange>(Exchange.class, this, GraphPackage.INTEGRATION_LABEL_VALUE__DEPARTURES);
		}
		return departures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationLabelValue scale(double scaleFactor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationLabelValue add(double addition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationLabelValue abs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean avoidNegative(IntegrationLabelValue value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double max() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void prepareCycle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationLabelValue copy() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double eGetDouble(int featureId) {
		Object value = eGet(featureId,true,false);
		if (value instanceof Double) {
			return ((Double)value).doubleValue();
		}
		throw new IllegalArgumentException("Feature is not type double");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetDouble(int featureId, double value) {
		eSet(featureId, Double.valueOf(value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte eGetByte(int featureId) {
		Object value = eGet(featureId,true,false);
		if (value instanceof Byte) {
			return ((Byte)value).byteValue();
		}
		throw new IllegalArgumentException("Feature is not type byte");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetByte(int featureId, byte value) {
		eSet(featureId, Byte.valueOf(value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char eGetChar(int featureId) {
		Object value = eGet(featureId,true,false);
		if (value instanceof Character) {
			return ((Character)value).charValue();
		}
		throw new IllegalArgumentException("Feature is not type char");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetChar(int featureId, char value) {
		eSet(featureId, Character.valueOf(value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short eGetShort(int featureId) {
		Object value = eGet(featureId,true,false);
		if (value instanceof Character) {
			return ((Short)value).shortValue();
		}
		throw new IllegalArgumentException("Feature is not type short");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetShort(int featureId, short value) {
		eSet(featureId, Short.valueOf(value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eGetInt(int featureId) {
		Object value = eGet(featureId,true,false);
		if (value instanceof Integer) {
			return ((Integer)value).intValue();
		}
		throw new IllegalArgumentException("Feature is not type int");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetInt(int featureId, int value) {
		eSet(featureId, Integer.valueOf(value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long eGetLong(int featureId) {
		Object value = eGet(featureId,true,false);
		if (value instanceof Long) {
			return ((Long)value).longValue();
		}
		throw new IllegalArgumentException("Feature is not type long");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetLong(int featureId, long value) {
		eSet(featureId, Long.valueOf(value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float eGetFloat(int featureId) {
		Object value = eGet(featureId,true,false);
		if (value instanceof Float) {
			return ((Float)value).floatValue();
		}
		throw new IllegalArgumentException("Feature is not type float");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetFloat(int featureId, float value) {
		eSet(featureId, Float.valueOf(value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eGetBoolean(int featureId) {
		Object value = eGet(featureId,true,false);
		if (value instanceof Boolean) {
			return ((Boolean)value).booleanValue();
		}
		throw new IllegalArgumentException("Feature is not type boolean");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetBoolean(int featureId, boolean value) {
		eSet(featureId, Boolean.valueOf(value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.INTEGRATION_LABEL_VALUE__ARRIVALS:
				return getArrivals();
			case GraphPackage.INTEGRATION_LABEL_VALUE__DEPARTURES:
				return getDepartures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphPackage.INTEGRATION_LABEL_VALUE__ARRIVALS:
				return arrivals != null && !arrivals.isEmpty();
			case GraphPackage.INTEGRATION_LABEL_VALUE__DEPARTURES:
				return departures != null && !departures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegrationLabelValueImpl
