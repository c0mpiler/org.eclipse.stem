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
package org.eclipse.stem.core.model.impl;



import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.TransformationDecorator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.model.impl.TransformationDecoratorImpl#getSourceLabels <em>Source Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TransformationDecoratorImpl extends NodeDecoratorImpl implements TransformationDecorator {
	/**
	 * The cached value of the '{@link #getSourceLabels() <em>Source Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicLabel> sourceLabels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationDecoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TRANSFORMATION_DECORATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicLabel> getSourceLabels() {
		if (sourceLabels == null) {
			sourceLabels = new EObjectResolvingEList<DynamicLabel>(DynamicLabel.class, this, ModelPackage.TRANSFORMATION_DECORATOR__SOURCE_LABELS);
		}
		return sourceLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TRANSFORMATION_DECORATOR__SOURCE_LABELS:
				return getSourceLabels();
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
			case ModelPackage.TRANSFORMATION_DECORATOR__SOURCE_LABELS:
				getSourceLabels().clear();
				getSourceLabels().addAll((Collection<? extends DynamicLabel>)newValue);
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
			case ModelPackage.TRANSFORMATION_DECORATOR__SOURCE_LABELS:
				getSourceLabels().clear();
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
			case ModelPackage.TRANSFORMATION_DECORATOR__SOURCE_LABELS:
				return sourceLabels != null && !sourceLabels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void transform(STEMTime time, long timeDelta) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //TransformationDecoratorImpl
