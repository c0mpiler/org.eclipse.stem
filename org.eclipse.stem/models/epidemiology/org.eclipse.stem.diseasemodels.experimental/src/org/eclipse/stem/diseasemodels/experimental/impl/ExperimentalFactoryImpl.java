package org.eclipse.stem.diseasemodels.experimental.impl;

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
import org.eclipse.stem.diseasemodels.experimental.ExperimentalFactory;
import org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage;
import org.eclipse.stem.diseasemodels.experimental.PercolationDiseaseModel;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentalFactoryImpl extends EFactoryImpl implements ExperimentalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExperimentalFactory init() {
		try {
			ExperimentalFactory theExperimentalFactory = (ExperimentalFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/diseasemodels/experimental.ecore"); 
			if (theExperimentalFactory != null) {
				return theExperimentalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExperimentalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalFactoryImpl() {
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
			case ExperimentalPackage.PERCOLATION_DISEASE_MODEL: return createPercolationDiseaseModel();
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL: return createTBDiseaseModelLabel();
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE: return createTBDiseaseModelLabelValue();
			case ExperimentalPackage.TB_DISEASE_MODEL: return createTBDiseaseModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercolationDiseaseModel createPercolationDiseaseModel() {
		PercolationDiseaseModelImpl percolationDiseaseModel = new PercolationDiseaseModelImpl();
		return percolationDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBDiseaseModelLabel createTBDiseaseModelLabel() {
		TBDiseaseModelLabelImpl tbDiseaseModelLabel = new TBDiseaseModelLabelImpl();
		return tbDiseaseModelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBDiseaseModelLabelValue createTBDiseaseModelLabelValue() {
		TBDiseaseModelLabelValueImpl tbDiseaseModelLabelValue = new TBDiseaseModelLabelValueImpl();
		return tbDiseaseModelLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBDiseaseModel createTBDiseaseModel() {
		TBDiseaseModelImpl tbDiseaseModel = new TBDiseaseModelImpl();
		return tbDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalPackage getExperimentalPackage() {
		return (ExperimentalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExperimentalPackage getPackage() {
		return ExperimentalPackage.eINSTANCE;
	}

} //ExperimentalFactoryImpl
