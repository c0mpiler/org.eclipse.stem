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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.diseasemodels.standard.SEIRLabel;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>SEIR Label</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class SEIRLabelImpl extends StandardDiseaseModelLabelImpl implements
		SEIRLabel {

	/**
	 * This is the top-level segment for all type URI's for SEIR disease model
	 * labels.
	 */
	String URI_TYPE_SEIR_LABEL_SEGMENT = URI_TYPE_STANDARD_DISEASE_MODEL_LABEL_SEGMENT
			+ "/seir";

	/**
	 * This is the type URI for standard SEIR disease labels
	 */
	URI URI_TYPE_SEIR_LABEL = STEMURI
			.createTypeURI(URI_TYPE_SEIR_LABEL_SEGMENT);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected SEIRLabelImpl() {
		super();
		setTypeURI(URI_TYPE_SEIR_LABEL);
		setCurrentValue(StandardFactory.eINSTANCE.createSEIRLabelValue());
		setNextValue(StandardFactory.eINSTANCE.createSEIRLabelValue());
		setTempValue(StandardFactory.eINSTANCE.createSEIRLabelValue());
		setProbeValue(StandardFactory.eINSTANCE.createSEIRLabelValue());
		setErrorScale(StandardFactory.eINSTANCE.createSEIRLabelValue());
		setDeltaValue(StandardFactory.eINSTANCE.createSEIRLabelValue());
	} // SEIRLabelImpl

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SEIR_LABEL;
	}

} // SEIRLabelImpl