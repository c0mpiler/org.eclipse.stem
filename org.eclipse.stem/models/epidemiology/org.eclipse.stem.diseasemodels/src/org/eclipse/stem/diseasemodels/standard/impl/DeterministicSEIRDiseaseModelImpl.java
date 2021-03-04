package org.eclipse.stem.diseasemodels.standard.impl;

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
import org.eclipse.stem.diseasemodels.standard.DeterministicSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Deterministic SEIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@SuppressWarnings("deprecation")
public class DeterministicSEIRDiseaseModelImpl extends SEIRImpl implements
		DeterministicSEIRDiseaseModel {
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * The constructor needs to be public so that the new disease wizard can
	 * create an instance of the class without using the factory.
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DeterministicSEIRDiseaseModelImpl() {
		super();
	} // DeterministicSEIRDiseaseModelImpl

	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.DETERMINISTIC_SEIR_DISEASE_MODEL;
	}
} // DeterministicSEIRDiseaseModelImpl
