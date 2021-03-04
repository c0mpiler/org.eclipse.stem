package org.eclipse.stem.core.model.impl;

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
 
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.model.EdgeDecorator;
import org.eclipse.stem.core.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Edge Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EdgeDecoratorImpl extends DecoratorImpl implements EdgeDecorator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeDecoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EDGE_DECORATOR;
	}

	/**
	 * @see org.eclipse.stem.model.impl.DecoratorImpl#sane()
	 * @generated NOT
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();

		return retValue;
	} // sane

} // EdgeDecoratorImpl