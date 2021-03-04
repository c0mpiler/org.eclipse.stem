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
package org.eclipse.stem.evolvingcrossspeciesmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelFactory;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EvolvingCrossSpeciesModelLabelImpl extends StandardDiseaseModelLabelImpl implements EvolvingCrossSpeciesModelLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingCrossSpeciesModelLabelImpl() {
		super();
		setCurrentValue(EvolvingCrossSpeciesModelFactory.eINSTANCE.createEvolvingCrossSpeciesModelLabelValue());
		setNextValue(EvolvingCrossSpeciesModelFactory.eINSTANCE.createEvolvingCrossSpeciesModelLabelValue());
		setTempValue(EvolvingCrossSpeciesModelFactory.eINSTANCE.createEvolvingCrossSpeciesModelLabelValue());
		setProbeValue(EvolvingCrossSpeciesModelFactory.eINSTANCE.createEvolvingCrossSpeciesModelLabelValue());
		setErrorScale(EvolvingCrossSpeciesModelFactory.eINSTANCE.createEvolvingCrossSpeciesModelLabelValue());
		setDeltaValue(EvolvingCrossSpeciesModelFactory.eINSTANCE.createEvolvingCrossSpeciesModelLabelValue());		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL_LABEL;
	}


							

} //EvolvingCrossSpeciesModelLabelImpl
