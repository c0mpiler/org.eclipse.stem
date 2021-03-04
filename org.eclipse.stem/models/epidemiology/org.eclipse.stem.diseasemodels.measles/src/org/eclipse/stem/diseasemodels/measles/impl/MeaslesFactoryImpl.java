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
package org.eclipse.stem.diseasemodels.measles.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.diseasemodels.measles.Measles;
import org.eclipse.stem.diseasemodels.measles.MeaslesFactory;
import org.eclipse.stem.diseasemodels.measles.MeaslesLabel;
import org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue;
import org.eclipse.stem.diseasemodels.measles.MeaslesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeaslesFactoryImpl extends EFactoryImpl implements MeaslesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeaslesFactory init() {
		try {
			MeaslesFactory theMeaslesFactory = (MeaslesFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/diseasemodels/measles/measles.ecore"); 
			if (theMeaslesFactory != null) {
				return theMeaslesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeaslesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeaslesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MeaslesPackage.MEASLES_LABEL: return createMeaslesLabel();
			case MeaslesPackage.MEASLES_LABEL_VALUE: return createMeaslesLabelValue();
			case MeaslesPackage.MEASLES: return createMeasles();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeaslesLabel createMeaslesLabel() {
		MeaslesLabelImpl measlesLabel = new MeaslesLabelImpl();
		return measlesLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeaslesLabelValue createMeaslesLabelValue() {
		MeaslesLabelValueImpl measlesLabelValue = new MeaslesLabelValueImpl();
		return measlesLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measles createMeasles() {
		MeaslesImpl measles = new MeaslesImpl();
		return measles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeaslesPackage getMeaslesPackage() {
		return (MeaslesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeaslesPackage getPackage() {
		return MeaslesPackage.eINSTANCE;
	}

} //MeaslesFactoryImpl
