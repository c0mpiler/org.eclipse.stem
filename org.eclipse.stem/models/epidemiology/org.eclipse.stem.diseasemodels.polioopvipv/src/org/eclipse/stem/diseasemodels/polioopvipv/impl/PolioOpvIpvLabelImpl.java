/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvFactory;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabel;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolioOpvIpvLabelImpl extends StandardDiseaseModelLabelImpl implements PolioOpvIpvLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioOpvIpvLabelImpl() {
		super();
		setCurrentValue(PolioOpvIpvFactory.eINSTANCE.createPolioOpvIpvLabelValue());
		setNextValue(PolioOpvIpvFactory.eINSTANCE.createPolioOpvIpvLabelValue());
		setTempValue(PolioOpvIpvFactory.eINSTANCE.createPolioOpvIpvLabelValue());
		setProbeValue(PolioOpvIpvFactory.eINSTANCE.createPolioOpvIpvLabelValue());
		setErrorScale(PolioOpvIpvFactory.eINSTANCE.createPolioOpvIpvLabelValue());
		setDeltaValue(PolioOpvIpvFactory.eINSTANCE.createPolioOpvIpvLabelValue());		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL;
	}

							

} //PolioOpvIpvLabelImpl
