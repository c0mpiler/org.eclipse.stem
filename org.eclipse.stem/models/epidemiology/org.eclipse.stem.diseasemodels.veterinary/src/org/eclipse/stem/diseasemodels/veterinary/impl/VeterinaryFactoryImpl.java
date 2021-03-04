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
package org.eclipse.stem.diseasemodels.veterinary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.stem.diseasemodels.veterinary.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VeterinaryFactoryImpl extends EFactoryImpl implements VeterinaryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VeterinaryFactory init() {
		try {
			VeterinaryFactory theVeterinaryFactory = (VeterinaryFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/diseasemodels/veterinary/veterinary.ecore"); 
			if (theVeterinaryFactory != null) {
				return theVeterinaryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VeterinaryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VeterinaryFactoryImpl() {
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
			case VeterinaryPackage.SIMPLE_VETERINARY_DISEASE_LABEL: return createSimpleVeterinaryDiseaseLabel();
			case VeterinaryPackage.SIMPLE_VETERINARY_DISEASE_LABEL_VALUE: return createSimpleVeterinaryDiseaseLabelValue();
			case VeterinaryPackage.SIMPLE_VETERINARY_DISEASE: return createSimpleVeterinaryDisease();
			case VeterinaryPackage.CONTAMINATED_UNITS_LABEL: return createContaminatedUnitsLabel();
			case VeterinaryPackage.CONTAMINATED_UNITS_LABEL_VALUE: return createContaminatedUnitsLabelValue();
			case VeterinaryPackage.CONTAMINATED_UNITS: return createContaminatedUnits();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleVeterinaryDiseaseLabel createSimpleVeterinaryDiseaseLabel() {
		SimpleVeterinaryDiseaseLabelImpl simpleVeterinaryDiseaseLabel = new SimpleVeterinaryDiseaseLabelImpl();
		return simpleVeterinaryDiseaseLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleVeterinaryDiseaseLabelValue createSimpleVeterinaryDiseaseLabelValue() {
		SimpleVeterinaryDiseaseLabelValueImpl simpleVeterinaryDiseaseLabelValue = new SimpleVeterinaryDiseaseLabelValueImpl();
		return simpleVeterinaryDiseaseLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleVeterinaryDisease createSimpleVeterinaryDisease() {
		SimpleVeterinaryDiseaseImpl simpleVeterinaryDisease = new SimpleVeterinaryDiseaseImpl();
		return simpleVeterinaryDisease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContaminatedUnitsLabel createContaminatedUnitsLabel() {
		ContaminatedUnitsLabelImpl contaminatedUnitsLabel = new ContaminatedUnitsLabelImpl();
		return contaminatedUnitsLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContaminatedUnitsLabelValue createContaminatedUnitsLabelValue() {
		ContaminatedUnitsLabelValueImpl contaminatedUnitsLabelValue = new ContaminatedUnitsLabelValueImpl();
		return contaminatedUnitsLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContaminatedUnits createContaminatedUnits() {
		ContaminatedUnitsImpl contaminatedUnits = new ContaminatedUnitsImpl();
		return contaminatedUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VeterinaryPackage getVeterinaryPackage() {
		return (VeterinaryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VeterinaryPackage getPackage() {
		return VeterinaryPackage.eINSTANCE;
	}

} //VeterinaryFactoryImpl
