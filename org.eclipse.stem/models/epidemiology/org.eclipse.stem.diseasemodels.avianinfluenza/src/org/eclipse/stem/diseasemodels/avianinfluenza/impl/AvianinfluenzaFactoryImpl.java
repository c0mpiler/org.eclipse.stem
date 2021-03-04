package org.eclipse.stem.diseasemodels.avianinfluenza.impl;

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaFactory;
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9Label;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9LabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvianinfluenzaFactoryImpl extends EFactoryImpl implements AvianinfluenzaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AvianinfluenzaFactory init() {
		try {
			AvianinfluenzaFactory theAvianinfluenzaFactory = (AvianinfluenzaFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/diseasemodels/avianinfluenza/avianinfluenza.ecore"); 
			if (theAvianinfluenzaFactory != null) {
				return theAvianinfluenzaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AvianinfluenzaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvianinfluenzaFactoryImpl() {
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
			case AvianinfluenzaPackage.H7N9_LABEL: return createH7N9Label();
			case AvianinfluenzaPackage.H7N9_LABEL_VALUE: return createH7N9LabelValue();
			case AvianinfluenzaPackage.H7N9: return createH7N9();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H7N9Label createH7N9Label() {
		H7N9LabelImpl h7N9Label = new H7N9LabelImpl();
		return h7N9Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H7N9LabelValue createH7N9LabelValue() {
		H7N9LabelValueImpl h7N9LabelValue = new H7N9LabelValueImpl();
		return h7N9LabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H7N9 createH7N9() {
		H7N9Impl h7N9 = new H7N9Impl();
		return h7N9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvianinfluenzaPackage getAvianinfluenzaPackage() {
		return (AvianinfluenzaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AvianinfluenzaPackage getPackage() {
		return AvianinfluenzaPackage.eINSTANCE;
	}

} //AvianinfluenzaFactoryImpl
