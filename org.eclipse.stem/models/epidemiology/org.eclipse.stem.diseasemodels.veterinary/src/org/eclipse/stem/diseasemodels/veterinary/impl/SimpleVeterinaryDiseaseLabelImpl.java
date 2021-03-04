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

import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl;

import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabel;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryFactory;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Veterinary Disease Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SimpleVeterinaryDiseaseLabelImpl extends StandardDiseaseModelLabelImpl implements SimpleVeterinaryDiseaseLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleVeterinaryDiseaseLabelImpl() {
		super();
		setCurrentValue(VeterinaryFactory.eINSTANCE.createSimpleVeterinaryDiseaseLabelValue());
		setNextValue(VeterinaryFactory.eINSTANCE.createSimpleVeterinaryDiseaseLabelValue());
		setTempValue(VeterinaryFactory.eINSTANCE.createSimpleVeterinaryDiseaseLabelValue());
		setProbeValue(VeterinaryFactory.eINSTANCE.createSimpleVeterinaryDiseaseLabelValue());
		setErrorScale(VeterinaryFactory.eINSTANCE.createSimpleVeterinaryDiseaseLabelValue());
		setDeltaValue(VeterinaryFactory.eINSTANCE.createSimpleVeterinaryDiseaseLabelValue());		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VeterinaryPackage.Literals.SIMPLE_VETERINARY_DISEASE_LABEL;
	}


							

} //SimpleVeterinaryDiseaseLabelImpl
