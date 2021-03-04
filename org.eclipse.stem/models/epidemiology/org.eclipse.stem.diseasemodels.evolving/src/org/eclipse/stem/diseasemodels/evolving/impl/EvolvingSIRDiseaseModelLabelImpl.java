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
package org.eclipse.stem.diseasemodels.evolving.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.diseasemodels.evolving.EvolvingFactory;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIR Disease Model Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EvolvingSIRDiseaseModelLabelImpl extends StandardDiseaseModelLabelImpl implements EvolvingSIRDiseaseModelLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EvolvingSIRDiseaseModelLabelImpl() {
		super();
		setCurrentValue(EvolvingFactory.eINSTANCE.createEvolvingSIRDiseaseModelLabelValue());
		setNextValue(EvolvingFactory.eINSTANCE.createEvolvingSIRDiseaseModelLabelValue());
		setTempValue(EvolvingFactory.eINSTANCE.createEvolvingSIRDiseaseModelLabelValue());
		setProbeValue(EvolvingFactory.eINSTANCE.createEvolvingSIRDiseaseModelLabelValue());
		setErrorScale(EvolvingFactory.eINSTANCE.createEvolvingSIRDiseaseModelLabelValue());
		setDeltaValue(EvolvingFactory.eINSTANCE.createEvolvingSIRDiseaseModelLabelValue());		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolvingPackage.Literals.EVOLVING_SIR_DISEASE_MODEL_LABEL;
	}


							

} //EvolvingSIRDiseaseModelLabelImpl
