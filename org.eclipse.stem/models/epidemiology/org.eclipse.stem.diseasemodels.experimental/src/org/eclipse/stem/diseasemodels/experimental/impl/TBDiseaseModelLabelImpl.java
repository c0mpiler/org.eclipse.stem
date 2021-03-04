package org.eclipse.stem.diseasemodels.experimental.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.diseasemodels.experimental.ExperimentalFactory;
import org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TB Disease Model Label</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TBDiseaseModelLabelImpl extends StandardDiseaseModelLabelImpl
		implements TBDiseaseModelLabel {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected TBDiseaseModelLabelImpl() {
		super();
		setCurrentValue(ExperimentalFactory.eINSTANCE
				.createTBDiseaseModelLabelValue());
		setNextValue(ExperimentalFactory.eINSTANCE
				.createTBDiseaseModelLabelValue());
		setTempValue(ExperimentalFactory.eINSTANCE
				.createTBDiseaseModelLabelValue());
		setProbeValue(ExperimentalFactory.eINSTANCE
				.createTBDiseaseModelLabelValue());
		setErrorScale(ExperimentalFactory.eINSTANCE
				.createTBDiseaseModelLabelValue());
		setDeltaValue(ExperimentalFactory.eINSTANCE
				.createTBDiseaseModelLabelValue());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentalPackage.Literals.TB_DISEASE_MODEL_LABEL;
	}

} // TBDiseaseModelLabelImpl
