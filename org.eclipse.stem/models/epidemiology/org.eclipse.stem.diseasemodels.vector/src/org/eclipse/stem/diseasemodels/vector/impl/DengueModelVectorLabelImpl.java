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
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dengue Model Vector Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DengueModelVectorLabelImpl extends StandardDiseaseModelLabelImpl implements DengueModelVectorLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DengueModelVectorLabelImpl() {
		super();
		setCurrentValue(VectorFactory.eINSTANCE.createDengueModelVectorLabelValue());
		setNextValue(VectorFactory.eINSTANCE.createDengueModelVectorLabelValue());
		setTempValue(VectorFactory.eINSTANCE.createDengueModelVectorLabelValue());
		setProbeValue(VectorFactory.eINSTANCE.createDengueModelVectorLabelValue());
		setErrorScale(VectorFactory.eINSTANCE.createDengueModelVectorLabelValue());
		setDeltaValue(VectorFactory.eINSTANCE.createDengueModelVectorLabelValue());		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL;
	}


							

} //DengueModelVectorLabelImpl
