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
package org.eclipse.stem.diseasemodels.vector.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dengue Model Host Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DengueModelHostLabelImpl extends StandardDiseaseModelLabelImpl implements DengueModelHostLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DengueModelHostLabelImpl() {
		super();
		setCurrentValue(VectorFactory.eINSTANCE.createDengueModelHostLabelValue());
		setNextValue(VectorFactory.eINSTANCE.createDengueModelHostLabelValue());
		setTempValue(VectorFactory.eINSTANCE.createDengueModelHostLabelValue());
		setProbeValue(VectorFactory.eINSTANCE.createDengueModelHostLabelValue());
		setErrorScale(VectorFactory.eINSTANCE.createDengueModelHostLabelValue());
		setDeltaValue(VectorFactory.eINSTANCE.createDengueModelHostLabelValue());		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL;
	}


							

} //DengueModelHostLabelImpl
