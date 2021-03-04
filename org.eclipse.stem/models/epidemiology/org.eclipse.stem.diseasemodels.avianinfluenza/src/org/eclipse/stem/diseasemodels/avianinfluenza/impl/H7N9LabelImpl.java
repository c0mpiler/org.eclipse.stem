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
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaFactory;
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9Label;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>H7N9 Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class H7N9LabelImpl extends StandardDiseaseModelLabelImpl implements H7N9Label {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H7N9LabelImpl() {
		super();
		setCurrentValue(AvianinfluenzaFactory.eINSTANCE.createH7N9LabelValue());
		setNextValue(AvianinfluenzaFactory.eINSTANCE.createH7N9LabelValue());
		setTempValue(AvianinfluenzaFactory.eINSTANCE.createH7N9LabelValue());
		setProbeValue(AvianinfluenzaFactory.eINSTANCE.createH7N9LabelValue());
		setErrorScale(AvianinfluenzaFactory.eINSTANCE.createH7N9LabelValue());
		setDeltaValue(AvianinfluenzaFactory.eINSTANCE.createH7N9LabelValue());		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvianinfluenzaPackage.Literals.H7N9_LABEL;
	}


							

} //H7N9LabelImpl
