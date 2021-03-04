package org.eclipse.stem.tests.util.labels.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.impl.DynamicLabelImpl;
import org.eclipse.stem.tests.util.labels.LabelsFactory;
import org.eclipse.stem.tests.util.labels.LabelsPackage;
import org.eclipse.stem.tests.util.labels.TestDynamicLabel1;
import org.eclipse.stem.tests.util.labels.TestIntegerLabelValue;


/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Test Dynamic Label1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TestDynamicLabel1Impl extends DynamicLabelImpl implements
		TestDynamicLabel1 {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected TestDynamicLabel1Impl() {
		super();
		setCurrentValue(LabelsFactory.eINSTANCE.createTestIntegerLabelValue());
		setNextValue(LabelsFactory.eINSTANCE.createTestIntegerLabelValue());
	} // TestDynamicLabel1Impl

	
	@Override
	public Identifiable getIdentifiable() {
		return null;
	}


	@Override
	public void setIdentifiable(Identifiable newIdentifiable) {
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.TEST_DYNAMIC_LABEL1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void increment() {
		final TestIntegerLabelValue nextLabelValue = (TestIntegerLabelValue) getNextValue();
		final TestIntegerLabelValue currentLabelValue = (TestIntegerLabelValue) getCurrentValue();
		nextLabelValue.setI(currentLabelValue.getI()+1);
		setNextValueValid(true);
	} // increment

	/**
	 * @see org.eclipse.stem.core.test.labels.impl.TestLabelImpl#toString()
	 * @generated NOT
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("C: ");
		sb.append(getCurrentValue().toString());
		sb.append(", N: ");
		sb.append(getNextValue().toString());
		return sb.toString();
	} // toString

} // TestDynamicLabel1Impl
