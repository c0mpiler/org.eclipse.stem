package org.eclipse.stem.diseasemodels.vector.impl;

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.diseasemodels.vector.DengueModel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue;
import org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VectorFactoryImpl extends EFactoryImpl implements VectorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VectorFactory init() {
		try {
			VectorFactory theVectorFactory = (VectorFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/diseasemodels/vector.ecore"); 
			if (theVectorFactory != null) {
				return theVectorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VectorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorFactoryImpl() {
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
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL: return createMacdonaldRossDiseaseModel();
			case VectorPackage.DENGUE_MODEL: return createDengueModel();
			case VectorPackage.SIMPLE_DENGUE_MODEL: return createSimpleDengueModel();
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL: return createVerySimpleDengueModel();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL: return createDengueModelHostLabel();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE: return createDengueModelHostLabelValue();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL: return createDengueModelVectorLabel();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE: return createDengueModelVectorLabelValue();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL: return createSimpleDengueModelHostLabel();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE: return createSimpleDengueModelHostLabelValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacdonaldRossDiseaseModel createMacdonaldRossDiseaseModel() {
		MacdonaldRossDiseaseModelImpl macdonaldRossDiseaseModel = new MacdonaldRossDiseaseModelImpl();
		return macdonaldRossDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DengueModel createDengueModel() {
		DengueModelImpl dengueModel = new DengueModelImpl();
		return dengueModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDengueModel createSimpleDengueModel() {
		SimpleDengueModelImpl simpleDengueModel = new SimpleDengueModelImpl();
		return simpleDengueModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerySimpleDengueModel createVerySimpleDengueModel() {
		VerySimpleDengueModelImpl verySimpleDengueModel = new VerySimpleDengueModelImpl();
		return verySimpleDengueModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DengueModelHostLabel createDengueModelHostLabel() {
		DengueModelHostLabelImpl dengueModelHostLabel = new DengueModelHostLabelImpl();
		return dengueModelHostLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DengueModelHostLabelValue createDengueModelHostLabelValue() {
		DengueModelHostLabelValueImpl dengueModelHostLabelValue = new DengueModelHostLabelValueImpl();
		return dengueModelHostLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DengueModelVectorLabel createDengueModelVectorLabel() {
		DengueModelVectorLabelImpl dengueModelVectorLabel = new DengueModelVectorLabelImpl();
		return dengueModelVectorLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DengueModelVectorLabelValue createDengueModelVectorLabelValue() {
		DengueModelVectorLabelValueImpl dengueModelVectorLabelValue = new DengueModelVectorLabelValueImpl();
		return dengueModelVectorLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDengueModelHostLabel createSimpleDengueModelHostLabel() {
		SimpleDengueModelHostLabelImpl simpleDengueModelHostLabel = new SimpleDengueModelHostLabelImpl();
		return simpleDengueModelHostLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDengueModelHostLabelValue createSimpleDengueModelHostLabelValue() {
		SimpleDengueModelHostLabelValueImpl simpleDengueModelHostLabelValue = new SimpleDengueModelHostLabelValueImpl();
		return simpleDengueModelHostLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorPackage getVectorPackage() {
		return (VectorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VectorPackage getPackage() {
		return VectorPackage.eINSTANCE;
	}

} //VectorFactoryImpl
