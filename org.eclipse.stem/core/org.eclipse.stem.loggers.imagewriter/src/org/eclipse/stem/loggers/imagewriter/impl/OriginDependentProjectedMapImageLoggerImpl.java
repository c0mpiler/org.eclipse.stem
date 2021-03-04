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
package org.eclipse.stem.loggers.imagewriter.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger;
import org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Origin Dependent Projected Map Image Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.OriginDependentProjectedMapImageLoggerImpl#getOriginLatitude <em>Origin Latitude</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.OriginDependentProjectedMapImageLoggerImpl#getOriginLongitude <em>Origin Longitude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OriginDependentProjectedMapImageLoggerImpl extends ProjectedMapImageLoggerImpl implements OriginDependentProjectedMapImageLogger {
	/**
	 * The default value of the '{@link #getOriginLatitude() <em>Origin Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOriginLatitude() <em>Origin Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginLatitude()
	 * @generated
	 * @ordered
	 */
	protected double originLatitude = ORIGIN_LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginLongitude() <em>Origin Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOriginLongitude() <em>Origin Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginLongitude()
	 * @generated
	 * @ordered
	 */
	protected double originLongitude = ORIGIN_LONGITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginDependentProjectedMapImageLoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagewriterPackage.Literals.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOriginLatitude() {
		return originLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginLatitude(double newOriginLatitude) {
		double oldOriginLatitude = originLatitude;
		originLatitude = newOriginLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE, oldOriginLatitude, originLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOriginLongitude() {
		return originLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginLongitude(double newOriginLongitude) {
		double oldOriginLongitude = originLongitude;
		originLongitude = newOriginLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE, oldOriginLongitude, originLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE:
				return getOriginLatitude();
			case ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE:
				return getOriginLongitude();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE:
				setOriginLatitude((Double)newValue);
				return;
			case ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE:
				setOriginLongitude((Double)newValue);
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
			case ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE:
				setOriginLatitude(ORIGIN_LATITUDE_EDEFAULT);
				return;
			case ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE:
				setOriginLongitude(ORIGIN_LONGITUDE_EDEFAULT);
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
			case ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE:
				return originLatitude != ORIGIN_LATITUDE_EDEFAULT;
			case ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE:
				return originLongitude != ORIGIN_LONGITUDE_EDEFAULT;
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
		result.append(" (originLatitude: "); //$NON-NLS-1$
		result.append(originLatitude);
		result.append(", originLongitude: "); //$NON-NLS-1$
		result.append(originLongitude);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IMapProjection getMapProjector() {
		IMapProjection projection = super.getMapProjector();
		if (projection != null) {
			projection.setOrigin(getOriginLatitude(), getOriginLongitude());
		}
		
		return projection;
		
	}
	
} //OriginDependentProjectedMapImageLoggerImpl
