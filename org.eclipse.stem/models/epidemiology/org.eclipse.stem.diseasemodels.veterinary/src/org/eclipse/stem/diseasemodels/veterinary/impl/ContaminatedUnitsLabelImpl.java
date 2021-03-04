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

import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabel;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryFactory;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage;

import org.eclipse.stem.populationmodels.standard.impl.StandardPopulationModelLabelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contaminated Units Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContaminatedUnitsLabelImpl extends StandardPopulationModelLabelImpl implements ContaminatedUnitsLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContaminatedUnitsLabelImpl() {
		super();
		setCurrentValue(VeterinaryFactory.eINSTANCE.createContaminatedUnitsLabelValue());
		setNextValue(VeterinaryFactory.eINSTANCE.createContaminatedUnitsLabelValue());
		setTempValue(VeterinaryFactory.eINSTANCE.createContaminatedUnitsLabelValue());
		setProbeValue(VeterinaryFactory.eINSTANCE.createContaminatedUnitsLabelValue());
		setErrorScale(VeterinaryFactory.eINSTANCE.createContaminatedUnitsLabelValue());
		setDeltaValue(VeterinaryFactory.eINSTANCE.createContaminatedUnitsLabelValue());		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VeterinaryPackage.Literals.CONTAMINATED_UNITS_LABEL;
	}


							

} //ContaminatedUnitsLabelImpl
