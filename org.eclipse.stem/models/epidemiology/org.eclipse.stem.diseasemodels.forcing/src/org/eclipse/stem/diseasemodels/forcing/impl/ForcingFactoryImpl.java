package org.eclipse.stem.diseasemodels.forcing.impl;

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
import org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.forcing.ForcingFactory;
import org.eclipse.stem.diseasemodels.forcing.ForcingPackage;
import org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForcingFactoryImpl extends EFactoryImpl implements ForcingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForcingFactory init() {
		try {
			ForcingFactory theForcingFactory = (ForcingFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/diseasemodels/forcing.ecore"); //$NON-NLS-1$ 
			if (theForcingFactory != null) {
				return theForcingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ForcingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForcingFactoryImpl() {
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
			case ForcingPackage.FORCING_DISEASE_MODEL: return createForcingDiseaseModel();
			case ForcingPackage.GAUSSIAN_FORCING_DISEASE_MODEL: return createGaussianForcingDiseaseModel();
			case ForcingPackage.GAUSSIAN2_FORCING_DISEASE_MODEL: return createGaussian2ForcingDiseaseModel();
			case ForcingPackage.GAUSSIAN3_FORCING_DISEASE_MODEL: return createGaussian3ForcingDiseaseModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForcingDiseaseModel createForcingDiseaseModel() {
		ForcingDiseaseModelImpl forcingDiseaseModel = new ForcingDiseaseModelImpl();
		return forcingDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaussianForcingDiseaseModel createGaussianForcingDiseaseModel() {
		GaussianForcingDiseaseModelImpl gaussianForcingDiseaseModel = new GaussianForcingDiseaseModelImpl();
		return gaussianForcingDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gaussian2ForcingDiseaseModel createGaussian2ForcingDiseaseModel() {
		Gaussian2ForcingDiseaseModelImpl gaussian2ForcingDiseaseModel = new Gaussian2ForcingDiseaseModelImpl();
		return gaussian2ForcingDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gaussian3ForcingDiseaseModel createGaussian3ForcingDiseaseModel() {
		Gaussian3ForcingDiseaseModelImpl gaussian3ForcingDiseaseModel = new Gaussian3ForcingDiseaseModelImpl();
		return gaussian3ForcingDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForcingPackage getForcingPackage() {
		return (ForcingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ForcingPackage getPackage() {
		return ForcingPackage.eINSTANCE;
	}

} //ExampleFactoryImpl
