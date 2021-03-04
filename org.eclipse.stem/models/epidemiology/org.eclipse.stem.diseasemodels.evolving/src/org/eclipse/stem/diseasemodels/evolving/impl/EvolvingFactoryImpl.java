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
package org.eclipse.stem.diseasemodels.evolving.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer;
import org.eclipse.stem.diseasemodels.evolving.EvolvingFactory;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolvingFactoryImpl extends EFactoryImpl implements EvolvingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvolvingFactory init() {
		try {
			EvolvingFactory theEvolvingFactory = (EvolvingFactory)EPackage.Registry.INSTANCE.getEFactory(EvolvingPackage.eNS_URI);
			if (theEvolvingFactory != null) {
				return theEvolvingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvolvingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingFactoryImpl() {
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
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER: return createEvolvingDiseaseTransformer();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL_LABEL: return createEvolvingSIDiseaseModelLabel();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE: return createEvolvingSIDiseaseModelLabelValue();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL: return createEvolvingSIDiseaseModel();
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_LABEL: return createEvolvingSIRDiseaseModelLabel();
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE: return createEvolvingSIRDiseaseModelLabelValue();
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL: return createEvolvingSIRDiseaseModel();
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL_LABEL: return createEvolvingSEIRDiseaseModelLabel();
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE: return createEvolvingSEIRDiseaseModelLabelValue();
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL: return createEvolvingSEIRDiseaseModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EvolvingPackage.BOOLEAN_ARRAY:
				return createBooleanArrayFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EvolvingPackage.BOOLEAN_ARRAY:
				return convertBooleanArrayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingDiseaseTransformer createEvolvingDiseaseTransformer() {
		EvolvingDiseaseTransformerImpl evolvingDiseaseTransformer = new EvolvingDiseaseTransformerImpl();
		return evolvingDiseaseTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSIDiseaseModelLabel createEvolvingSIDiseaseModelLabel() {
		EvolvingSIDiseaseModelLabelImpl evolvingSIDiseaseModelLabel = new EvolvingSIDiseaseModelLabelImpl();
		return evolvingSIDiseaseModelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSIDiseaseModelLabelValue createEvolvingSIDiseaseModelLabelValue() {
		EvolvingSIDiseaseModelLabelValueImpl evolvingSIDiseaseModelLabelValue = new EvolvingSIDiseaseModelLabelValueImpl();
		return evolvingSIDiseaseModelLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSIDiseaseModel createEvolvingSIDiseaseModel() {
		EvolvingSIDiseaseModelImpl evolvingSIDiseaseModel = new EvolvingSIDiseaseModelImpl();
		return evolvingSIDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSIRDiseaseModelLabel createEvolvingSIRDiseaseModelLabel() {
		EvolvingSIRDiseaseModelLabelImpl evolvingSIRDiseaseModelLabel = new EvolvingSIRDiseaseModelLabelImpl();
		return evolvingSIRDiseaseModelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSIRDiseaseModelLabelValue createEvolvingSIRDiseaseModelLabelValue() {
		EvolvingSIRDiseaseModelLabelValueImpl evolvingSIRDiseaseModelLabelValue = new EvolvingSIRDiseaseModelLabelValueImpl();
		return evolvingSIRDiseaseModelLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSIRDiseaseModel createEvolvingSIRDiseaseModel() {
		EvolvingSIRDiseaseModelImpl evolvingSIRDiseaseModel = new EvolvingSIRDiseaseModelImpl();
		return evolvingSIRDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSEIRDiseaseModelLabel createEvolvingSEIRDiseaseModelLabel() {
		EvolvingSEIRDiseaseModelLabelImpl evolvingSEIRDiseaseModelLabel = new EvolvingSEIRDiseaseModelLabelImpl();
		return evolvingSEIRDiseaseModelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSEIRDiseaseModelLabelValue createEvolvingSEIRDiseaseModelLabelValue() {
		EvolvingSEIRDiseaseModelLabelValueImpl evolvingSEIRDiseaseModelLabelValue = new EvolvingSEIRDiseaseModelLabelValueImpl();
		return evolvingSEIRDiseaseModelLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSEIRDiseaseModel createEvolvingSEIRDiseaseModel() {
		EvolvingSEIRDiseaseModelImpl evolvingSEIRDiseaseModel = new EvolvingSEIRDiseaseModelImpl();
		return evolvingSEIRDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean[] createBooleanArrayFromString(EDataType eDataType, String initialValue) {
		return (boolean[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingPackage getEvolvingPackage() {
		return (EvolvingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvolvingPackage getPackage() {
		return EvolvingPackage.eINSTANCE;
	}

} //EvolvingFactoryImpl
