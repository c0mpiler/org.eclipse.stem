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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvFactory;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabel;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolioOpvIpvFactoryImpl extends EFactoryImpl implements PolioOpvIpvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolioOpvIpvFactory init() {
		try {
			PolioOpvIpvFactory thePolioOpvIpvFactory = (PolioOpvIpvFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/diseasemodels/polioopvipv/polioopvipv.ecore"); 
			if (thePolioOpvIpvFactory != null) {
				return thePolioOpvIpvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolioOpvIpvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioOpvIpvFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL: return createPolioOpvIpvLabel();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE: return createPolioOpvIpvLabelValue();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL: return createPolioOpvIpvDiseaseModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioOpvIpvLabel createPolioOpvIpvLabel() {
		PolioOpvIpvLabelImpl polioOpvIpvLabel = new PolioOpvIpvLabelImpl();
		return polioOpvIpvLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioOpvIpvLabelValue createPolioOpvIpvLabelValue() {
		PolioOpvIpvLabelValueImpl polioOpvIpvLabelValue = new PolioOpvIpvLabelValueImpl();
		return polioOpvIpvLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioOpvIpvDiseaseModel createPolioOpvIpvDiseaseModel() {
		PolioOpvIpvDiseaseModelImpl polioOpvIpvDiseaseModel = new PolioOpvIpvDiseaseModelImpl();
		return polioOpvIpvDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioOpvIpvPackage getPolioOpvIpvPackage() {
		return (PolioOpvIpvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolioOpvIpvPackage getPackage() {
		return PolioOpvIpvPackage.eINSTANCE;
	}

} //PolioOpvIpvFactoryImpl
