package org.eclipse.stem.analysis.automaticexperiment.impl;

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
import org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentFactory;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage;
import org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter;
import org.eclipse.stem.analysis.automaticexperiment.OptimizerAlgorithm;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutomaticexperimentFactoryImpl extends EFactoryImpl implements AutomaticexperimentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AutomaticexperimentFactory init() {
		try {
			AutomaticexperimentFactory theAutomaticexperimentFactory = (AutomaticexperimentFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/core/automaticexperiment.ecore"); 
			if (theAutomaticexperimentFactory != null) {
				return theAutomaticexperimentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AutomaticexperimentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomaticexperimentFactoryImpl() {
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
			case AutomaticexperimentPackage.AUTOMATIC_EXPERIMENT: return createAutomaticExperiment();
			case AutomaticexperimentPackage.MODIFIABLE_PARAMETER: return createModifiableParameter();
			case AutomaticexperimentPackage.OPTIMIZER_ALGORITHM: return createOptimizerAlgorithm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomaticExperiment createAutomaticExperiment() {
		AutomaticExperimentImpl automaticExperiment = new AutomaticExperimentImpl();
		return automaticExperiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiableParameter createModifiableParameter() {
		ModifiableParameterImpl modifiableParameter = new ModifiableParameterImpl();
		return modifiableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizerAlgorithm createOptimizerAlgorithm() {
		OptimizerAlgorithmImpl optimizerAlgorithm = new OptimizerAlgorithmImpl();
		return optimizerAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomaticexperimentPackage getAutomaticexperimentPackage() {
		return (AutomaticexperimentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AutomaticexperimentPackage getPackage() {
		return AutomaticexperimentPackage.eINSTANCE;
	}

} //AutomaticexperimentFactoryImpl
