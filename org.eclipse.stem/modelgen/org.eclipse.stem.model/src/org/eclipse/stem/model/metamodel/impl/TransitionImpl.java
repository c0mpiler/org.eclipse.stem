/**
 * 
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 */
package org.eclipse.stem.model.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl#getForIncidence <em>For Incidence</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl#getCompiledExpression <em>Compiled Expression</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl#getContainerModel <em>Container Model</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl#getExpressionResource <em>Expression Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Compartment source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Compartment target;

	/**
	 * The cached value of the '{@link #getForIncidence() <em>For Incidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForIncidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Compartment> forIncidence;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompiledExpression() <em>Compiled Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompiledExpression()
	 * @generated
	 * @ordered
	 */
	protected EObject compiledExpression;

	/**
	 * The default value of the '{@link #getExpressionResource() <em>Expression Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionResource()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Resource EXPRESSION_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionResource() <em>Expression Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionResource()
	 * @generated
	 * @ordered
	 */
	protected Resource expressionResource = EXPRESSION_RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Compartment)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Compartment newSource) {
		Compartment oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Compartment)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Compartment newTarget) {
		Compartment oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compartment> getForIncidence() {
		if (forIncidence == null) {
			forIncidence = new EObjectResolvingEList<Compartment>(Compartment.class, this, MetamodelPackage.TRANSITION__FOR_INCIDENCE);
		}
		return forIncidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TRANSITION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCompiledExpression() {
		if (compiledExpression != null && compiledExpression.eIsProxy()) {
			InternalEObject oldCompiledExpression = (InternalEObject)compiledExpression;
			compiledExpression = eResolveProxy(oldCompiledExpression);
			if (compiledExpression != oldCompiledExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.TRANSITION__COMPILED_EXPRESSION, oldCompiledExpression, compiledExpression));
			}
		}
		return compiledExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetCompiledExpression() {
		return compiledExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompiledExpression(EObject newCompiledExpression) {
		EObject oldCompiledExpression = compiledExpression;
		compiledExpression = newCompiledExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TRANSITION__COMPILED_EXPRESSION, oldCompiledExpression, compiledExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getContainerModel() {
		if (eContainerFeatureID() != MetamodelPackage.TRANSITION__CONTAINER_MODEL) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getExpressionResource() {
		return expressionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionResource(Resource newExpressionResource) {
		Resource oldExpressionResource = expressionResource;
		expressionResource = newExpressionResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TRANSITION__EXPRESSION_RESOURCE, oldExpressionResource, expressionResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.TRANSITION__CONTAINER_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, MetamodelPackage.TRANSITION__CONTAINER_MODEL, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.TRANSITION__CONTAINER_MODEL:
				return eBasicSetContainer(null, MetamodelPackage.TRANSITION__CONTAINER_MODEL, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MetamodelPackage.TRANSITION__CONTAINER_MODEL:
				return eInternalContainer().eInverseRemove(this, MetamodelPackage.MODEL__TRANSITIONS, Model.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case MetamodelPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MetamodelPackage.TRANSITION__FOR_INCIDENCE:
				return getForIncidence();
			case MetamodelPackage.TRANSITION__NAME:
				return getName();
			case MetamodelPackage.TRANSITION__EXPRESSION:
				return getExpression();
			case MetamodelPackage.TRANSITION__COMPILED_EXPRESSION:
				if (resolve) return getCompiledExpression();
				return basicGetCompiledExpression();
			case MetamodelPackage.TRANSITION__CONTAINER_MODEL:
				return getContainerModel();
			case MetamodelPackage.TRANSITION__EXPRESSION_RESOURCE:
				return getExpressionResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.TRANSITION__SOURCE:
				setSource((Compartment)newValue);
				return;
			case MetamodelPackage.TRANSITION__TARGET:
				setTarget((Compartment)newValue);
				return;
			case MetamodelPackage.TRANSITION__FOR_INCIDENCE:
				getForIncidence().clear();
				getForIncidence().addAll((Collection<? extends Compartment>)newValue);
				return;
			case MetamodelPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.TRANSITION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case MetamodelPackage.TRANSITION__COMPILED_EXPRESSION:
				setCompiledExpression((EObject)newValue);
				return;
			case MetamodelPackage.TRANSITION__EXPRESSION_RESOURCE:
				setExpressionResource((Resource)newValue);
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
			case MetamodelPackage.TRANSITION__SOURCE:
				setSource((Compartment)null);
				return;
			case MetamodelPackage.TRANSITION__TARGET:
				setTarget((Compartment)null);
				return;
			case MetamodelPackage.TRANSITION__FOR_INCIDENCE:
				getForIncidence().clear();
				return;
			case MetamodelPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.TRANSITION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case MetamodelPackage.TRANSITION__COMPILED_EXPRESSION:
				setCompiledExpression((EObject)null);
				return;
			case MetamodelPackage.TRANSITION__EXPRESSION_RESOURCE:
				setExpressionResource(EXPRESSION_RESOURCE_EDEFAULT);
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
			case MetamodelPackage.TRANSITION__SOURCE:
				return source != null;
			case MetamodelPackage.TRANSITION__TARGET:
				return target != null;
			case MetamodelPackage.TRANSITION__FOR_INCIDENCE:
				return forIncidence != null && !forIncidence.isEmpty();
			case MetamodelPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.TRANSITION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case MetamodelPackage.TRANSITION__COMPILED_EXPRESSION:
				return compiledExpression != null;
			case MetamodelPackage.TRANSITION__CONTAINER_MODEL:
				return getContainerModel() != null;
			case MetamodelPackage.TRANSITION__EXPRESSION_RESOURCE:
				return EXPRESSION_RESOURCE_EDEFAULT == null ? expressionResource != null : !EXPRESSION_RESOURCE_EDEFAULT.equals(expressionResource);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", expression: ");
		result.append(expression);
		result.append(", expressionResource: ");
		result.append(expressionResource);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
