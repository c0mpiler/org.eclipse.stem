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
package org.eclipse.stem.diseasemodels.poliodiseasemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabel;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioFactory;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolioFactoryImpl extends EFactoryImpl implements PolioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolioFactory init() {
		try {
			PolioFactory thePolioFactory = (PolioFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/diseasemodels/polio.ecore"); //$NON-NLS-1$ 
			if (thePolioFactory != null) {
				return thePolioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioFactoryImpl() {
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
			case PolioPackage.ORAL_POLIO_VACCINE_MODEL: return createOralPolioVaccineModel();
			case PolioPackage.OPV_LABEL: return createOpvLabel();
			case PolioPackage.OPV_LABEL_VALUE: return createOpvLabelValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OralPolioVaccineModel createOralPolioVaccineModel() {
		OralPolioVaccineModelImpl oralPolioVaccineModel = new OralPolioVaccineModelImpl();
		return oralPolioVaccineModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpvLabel createOpvLabel() {
		OpvLabelImpl opvLabel = new OpvLabelImpl();
		return opvLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpvLabelValue createOpvLabelValue() {
		OpvLabelValueImpl opvLabelValue = new OpvLabelValueImpl();
		return opvLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioPackage getPolioPackage() {
		return (PolioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolioPackage getPackage() {
		return PolioPackage.eINSTANCE;
	}

} //PolioFactoryImpl
