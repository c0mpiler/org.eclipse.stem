package org.eclipse.stem.core.graph.impl;

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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.graph.Label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.graph.impl.ExchangeImpl#getOtherLabels <em>Other Labels</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.impl.ExchangeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.impl.ExchangeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.impl.ExchangeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.impl.ExchangeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.impl.ExchangeImpl#getForIncidence <em>For Incidence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExchangeImpl extends EObjectImpl implements Exchange {
	/**
	 * The cached value of the '{@link #getOtherLabels() <em>Other Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> otherLabels;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final double COUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected double count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ExchangeType TYPE_EDEFAULT = ExchangeType.BIRTHS_AND_DEATHS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExchangeType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EAttribute source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EAttribute target;

	/**
	 * The cached value of the '{@link #getForIncidence() <em>For Incidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForIncidence()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> forIncidence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getOtherLabels() {
		if (otherLabels == null) {
			otherLabels = new EObjectResolvingEList<Label>(Label.class, this, GraphPackage.EXCHANGE__OTHER_LABELS);
		}
		return otherLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(double newCount) {
		double oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EXCHANGE__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ExchangeType newType) {
		ExchangeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EXCHANGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (EAttribute)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.EXCHANGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EAttribute newSource) {
		EAttribute oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EXCHANGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (EAttribute)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.EXCHANGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EAttribute newTarget) {
		EAttribute oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EXCHANGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getForIncidence() {
		if (forIncidence == null) {
			forIncidence = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, GraphPackage.EXCHANGE__FOR_INCIDENCE);
		}
		return forIncidence;
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
			case GraphPackage.EXCHANGE__OTHER_LABELS:
				return getOtherLabels();
			case GraphPackage.EXCHANGE__COUNT:
				return getCount();
			case GraphPackage.EXCHANGE__TYPE:
				return getType();
			case GraphPackage.EXCHANGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case GraphPackage.EXCHANGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case GraphPackage.EXCHANGE__FOR_INCIDENCE:
				return getForIncidence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings({ "boxing", "unchecked" })
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphPackage.EXCHANGE__OTHER_LABELS:
				getOtherLabels().clear();
				getOtherLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case GraphPackage.EXCHANGE__COUNT:
				setCount((Double)newValue);
				return;
			case GraphPackage.EXCHANGE__TYPE:
				setType((ExchangeType)newValue);
				return;
			case GraphPackage.EXCHANGE__SOURCE:
				setSource((EAttribute)newValue);
				return;
			case GraphPackage.EXCHANGE__TARGET:
				setTarget((EAttribute)newValue);
				return;
			case GraphPackage.EXCHANGE__FOR_INCIDENCE:
				getForIncidence().clear();
				getForIncidence().addAll((Collection<? extends EAttribute>)newValue);
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
			case GraphPackage.EXCHANGE__OTHER_LABELS:
				getOtherLabels().clear();
				return;
			case GraphPackage.EXCHANGE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case GraphPackage.EXCHANGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GraphPackage.EXCHANGE__SOURCE:
				setSource((EAttribute)null);
				return;
			case GraphPackage.EXCHANGE__TARGET:
				setTarget((EAttribute)null);
				return;
			case GraphPackage.EXCHANGE__FOR_INCIDENCE:
				getForIncidence().clear();
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
			case GraphPackage.EXCHANGE__OTHER_LABELS:
				return otherLabels != null && !otherLabels.isEmpty();
			case GraphPackage.EXCHANGE__COUNT:
				return count != COUNT_EDEFAULT;
			case GraphPackage.EXCHANGE__TYPE:
				return type != TYPE_EDEFAULT;
			case GraphPackage.EXCHANGE__SOURCE:
				return source != null;
			case GraphPackage.EXCHANGE__TARGET:
				return target != null;
			case GraphPackage.EXCHANGE__FOR_INCIDENCE:
				return forIncidence != null && !forIncidence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (count: "); //$NON-NLS-1$
		result.append(count);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", source: "); //$NON-NLS-1$
		result.append(source);
		result.append(", target: "); //$NON-NLS-1$
		result.append(target);
		result.append(", forIncidence: "); //$NON-NLS-1$
		result.append(forIncidence);
		
		result.append(')');
		return result.toString();
	}

	public int compareTo(Exchange o) {
		// If different types, we're done
		
		int res = getType().getName().compareTo(o.getType().getName());
		if(res != 0) return res;
		
		// Same type, compare the label URI's.
		
		return otherLabels.get(0).getURI().toString().compareTo(o.getOtherLabels().get(0).getURI().toString());
		
	}

} //ExchangeImpl
