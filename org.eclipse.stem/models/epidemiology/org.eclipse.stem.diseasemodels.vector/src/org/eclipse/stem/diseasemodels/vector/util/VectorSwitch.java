package org.eclipse.stem.diseasemodels.vector.util;

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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.PrimitiveTypeOperations;
import org.eclipse.stem.core.common.SanityChecker;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.NodeDecorator;
import org.eclipse.stem.core.modifier.Modifiable;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.vector.AbstractDengueModel;
import org.eclipse.stem.diseasemodels.vector.DengueModel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue;
import org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage
 * @generated
 */
public class VectorSwitch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VectorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorSwitch() {
		if (modelPackage == null) {
			modelPackage = VectorPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T1 doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL: {
				MacdonaldRossDiseaseModel macdonaldRossDiseaseModel = (MacdonaldRossDiseaseModel)theEObject;
				T1 result = caseMacdonaldRossDiseaseModel(macdonaldRossDiseaseModel);
				if (result == null) result = caseVectorDiseaseModel(macdonaldRossDiseaseModel);
				if (result == null) result = caseStandardDiseaseModel(macdonaldRossDiseaseModel);
				if (result == null) result = caseDiseaseModel(macdonaldRossDiseaseModel);
				if (result == null) result = caseIntegrationDecorator(macdonaldRossDiseaseModel);
				if (result == null) result = caseModifiable(macdonaldRossDiseaseModel);
				if (result == null) result = caseNodeDecorator(macdonaldRossDiseaseModel);
				if (result == null) result = caseDecorator(macdonaldRossDiseaseModel);
				if (result == null) result = caseIdentifiable(macdonaldRossDiseaseModel);
				if (result == null) result = caseComparable(macdonaldRossDiseaseModel);
				if (result == null) result = caseSanityChecker(macdonaldRossDiseaseModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.VECTOR_DISEASE_MODEL: {
				VectorDiseaseModel vectorDiseaseModel = (VectorDiseaseModel)theEObject;
				T1 result = caseVectorDiseaseModel(vectorDiseaseModel);
				if (result == null) result = caseStandardDiseaseModel(vectorDiseaseModel);
				if (result == null) result = caseDiseaseModel(vectorDiseaseModel);
				if (result == null) result = caseIntegrationDecorator(vectorDiseaseModel);
				if (result == null) result = caseModifiable(vectorDiseaseModel);
				if (result == null) result = caseNodeDecorator(vectorDiseaseModel);
				if (result == null) result = caseDecorator(vectorDiseaseModel);
				if (result == null) result = caseIdentifiable(vectorDiseaseModel);
				if (result == null) result = caseComparable(vectorDiseaseModel);
				if (result == null) result = caseSanityChecker(vectorDiseaseModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.DENGUE_MODEL: {
				DengueModel dengueModel = (DengueModel)theEObject;
				T1 result = caseDengueModel(dengueModel);
				if (result == null) result = caseAbstractDengueModel(dengueModel);
				if (result == null) result = caseVectorDiseaseModel(dengueModel);
				if (result == null) result = caseStandardDiseaseModel(dengueModel);
				if (result == null) result = caseDiseaseModel(dengueModel);
				if (result == null) result = caseIntegrationDecorator(dengueModel);
				if (result == null) result = caseModifiable(dengueModel);
				if (result == null) result = caseNodeDecorator(dengueModel);
				if (result == null) result = caseDecorator(dengueModel);
				if (result == null) result = caseIdentifiable(dengueModel);
				if (result == null) result = caseComparable(dengueModel);
				if (result == null) result = caseSanityChecker(dengueModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.SIMPLE_DENGUE_MODEL: {
				SimpleDengueModel simpleDengueModel = (SimpleDengueModel)theEObject;
				T1 result = caseSimpleDengueModel(simpleDengueModel);
				if (result == null) result = caseAbstractDengueModel(simpleDengueModel);
				if (result == null) result = caseVectorDiseaseModel(simpleDengueModel);
				if (result == null) result = caseStandardDiseaseModel(simpleDengueModel);
				if (result == null) result = caseDiseaseModel(simpleDengueModel);
				if (result == null) result = caseIntegrationDecorator(simpleDengueModel);
				if (result == null) result = caseModifiable(simpleDengueModel);
				if (result == null) result = caseNodeDecorator(simpleDengueModel);
				if (result == null) result = caseDecorator(simpleDengueModel);
				if (result == null) result = caseIdentifiable(simpleDengueModel);
				if (result == null) result = caseComparable(simpleDengueModel);
				if (result == null) result = caseSanityChecker(simpleDengueModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL: {
				VerySimpleDengueModel verySimpleDengueModel = (VerySimpleDengueModel)theEObject;
				T1 result = caseVerySimpleDengueModel(verySimpleDengueModel);
				if (result == null) result = caseStandardDiseaseModel(verySimpleDengueModel);
				if (result == null) result = caseDiseaseModel(verySimpleDengueModel);
				if (result == null) result = caseIntegrationDecorator(verySimpleDengueModel);
				if (result == null) result = caseModifiable(verySimpleDengueModel);
				if (result == null) result = caseNodeDecorator(verySimpleDengueModel);
				if (result == null) result = caseDecorator(verySimpleDengueModel);
				if (result == null) result = caseIdentifiable(verySimpleDengueModel);
				if (result == null) result = caseComparable(verySimpleDengueModel);
				if (result == null) result = caseSanityChecker(verySimpleDengueModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.DENGUE_MODEL_HOST_LABEL: {
				DengueModelHostLabel dengueModelHostLabel = (DengueModelHostLabel)theEObject;
				T1 result = caseDengueModelHostLabel(dengueModelHostLabel);
				if (result == null) result = caseStandardDiseaseModelLabel(dengueModelHostLabel);
				if (result == null) result = caseDiseaseModelLabel(dengueModelHostLabel);
				if (result == null) result = caseIntegrationLabel(dengueModelHostLabel);
				if (result == null) result = caseDynamicNodeLabel(dengueModelHostLabel);
				if (result == null) result = caseDynamicLabel(dengueModelHostLabel);
				if (result == null) result = caseNodeLabel(dengueModelHostLabel);
				if (result == null) result = caseLabel(dengueModelHostLabel);
				if (result == null) result = caseIdentifiable(dengueModelHostLabel);
				if (result == null) result = caseComparable(dengueModelHostLabel);
				if (result == null) result = caseSanityChecker(dengueModelHostLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE: {
				DengueModelHostLabelValue dengueModelHostLabelValue = (DengueModelHostLabelValue)theEObject;
				T1 result = caseDengueModelHostLabelValue(dengueModelHostLabelValue);
				if (result == null) result = caseSimpleDengueModelHostLabelValue(dengueModelHostLabelValue);
				if (result == null) result = caseStandardDiseaseModelLabelValue(dengueModelHostLabelValue);
				if (result == null) result = caseDiseaseModelLabelValue(dengueModelHostLabelValue);
				if (result == null) result = caseIntegrationLabelValue(dengueModelHostLabelValue);
				if (result == null) result = caseLabelValue(dengueModelHostLabelValue);
				if (result == null) result = casePrimitiveTypeOperations(dengueModelHostLabelValue);
				if (result == null) result = caseSanityChecker(dengueModelHostLabelValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL: {
				DengueModelVectorLabel dengueModelVectorLabel = (DengueModelVectorLabel)theEObject;
				T1 result = caseDengueModelVectorLabel(dengueModelVectorLabel);
				if (result == null) result = caseStandardDiseaseModelLabel(dengueModelVectorLabel);
				if (result == null) result = caseDiseaseModelLabel(dengueModelVectorLabel);
				if (result == null) result = caseIntegrationLabel(dengueModelVectorLabel);
				if (result == null) result = caseDynamicNodeLabel(dengueModelVectorLabel);
				if (result == null) result = caseDynamicLabel(dengueModelVectorLabel);
				if (result == null) result = caseNodeLabel(dengueModelVectorLabel);
				if (result == null) result = caseLabel(dengueModelVectorLabel);
				if (result == null) result = caseIdentifiable(dengueModelVectorLabel);
				if (result == null) result = caseComparable(dengueModelVectorLabel);
				if (result == null) result = caseSanityChecker(dengueModelVectorLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE: {
				DengueModelVectorLabelValue dengueModelVectorLabelValue = (DengueModelVectorLabelValue)theEObject;
				T1 result = caseDengueModelVectorLabelValue(dengueModelVectorLabelValue);
				if (result == null) result = caseStandardDiseaseModelLabelValue(dengueModelVectorLabelValue);
				if (result == null) result = caseDiseaseModelLabelValue(dengueModelVectorLabelValue);
				if (result == null) result = caseIntegrationLabelValue(dengueModelVectorLabelValue);
				if (result == null) result = caseLabelValue(dengueModelVectorLabelValue);
				if (result == null) result = casePrimitiveTypeOperations(dengueModelVectorLabelValue);
				if (result == null) result = caseSanityChecker(dengueModelVectorLabelValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.ABSTRACT_DENGUE_MODEL: {
				AbstractDengueModel abstractDengueModel = (AbstractDengueModel)theEObject;
				T1 result = caseAbstractDengueModel(abstractDengueModel);
				if (result == null) result = caseVectorDiseaseModel(abstractDengueModel);
				if (result == null) result = caseStandardDiseaseModel(abstractDengueModel);
				if (result == null) result = caseDiseaseModel(abstractDengueModel);
				if (result == null) result = caseIntegrationDecorator(abstractDengueModel);
				if (result == null) result = caseModifiable(abstractDengueModel);
				if (result == null) result = caseNodeDecorator(abstractDengueModel);
				if (result == null) result = caseDecorator(abstractDengueModel);
				if (result == null) result = caseIdentifiable(abstractDengueModel);
				if (result == null) result = caseComparable(abstractDengueModel);
				if (result == null) result = caseSanityChecker(abstractDengueModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL: {
				SimpleDengueModelHostLabel simpleDengueModelHostLabel = (SimpleDengueModelHostLabel)theEObject;
				T1 result = caseSimpleDengueModelHostLabel(simpleDengueModelHostLabel);
				if (result == null) result = caseStandardDiseaseModelLabel(simpleDengueModelHostLabel);
				if (result == null) result = caseDiseaseModelLabel(simpleDengueModelHostLabel);
				if (result == null) result = caseIntegrationLabel(simpleDengueModelHostLabel);
				if (result == null) result = caseDynamicNodeLabel(simpleDengueModelHostLabel);
				if (result == null) result = caseDynamicLabel(simpleDengueModelHostLabel);
				if (result == null) result = caseNodeLabel(simpleDengueModelHostLabel);
				if (result == null) result = caseLabel(simpleDengueModelHostLabel);
				if (result == null) result = caseIdentifiable(simpleDengueModelHostLabel);
				if (result == null) result = caseComparable(simpleDengueModelHostLabel);
				if (result == null) result = caseSanityChecker(simpleDengueModelHostLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE: {
				SimpleDengueModelHostLabelValue simpleDengueModelHostLabelValue = (SimpleDengueModelHostLabelValue)theEObject;
				T1 result = caseSimpleDengueModelHostLabelValue(simpleDengueModelHostLabelValue);
				if (result == null) result = caseStandardDiseaseModelLabelValue(simpleDengueModelHostLabelValue);
				if (result == null) result = caseDiseaseModelLabelValue(simpleDengueModelHostLabelValue);
				if (result == null) result = caseIntegrationLabelValue(simpleDengueModelHostLabelValue);
				if (result == null) result = caseLabelValue(simpleDengueModelHostLabelValue);
				if (result == null) result = casePrimitiveTypeOperations(simpleDengueModelHostLabelValue);
				if (result == null) result = caseSanityChecker(simpleDengueModelHostLabelValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macdonald Ross Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macdonald Ross Disease Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMacdonaldRossDiseaseModel(MacdonaldRossDiseaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVectorDiseaseModel(VectorDiseaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dengue Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dengue Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDengueModel(DengueModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Dengue Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Dengue Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSimpleDengueModel(SimpleDengueModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Very Simple Dengue Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Very Simple Dengue Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVerySimpleDengueModel(VerySimpleDengueModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dengue Model Host Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dengue Model Host Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDengueModelHostLabel(DengueModelHostLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dengue Model Host Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dengue Model Host Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDengueModelHostLabelValue(DengueModelHostLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dengue Model Vector Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dengue Model Vector Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDengueModelVectorLabel(DengueModelVectorLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dengue Model Vector Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dengue Model Vector Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDengueModelVectorLabelValue(DengueModelVectorLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Dengue Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Dengue Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractDengueModel(AbstractDengueModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Dengue Model Host Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Dengue Model Host Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSimpleDengueModelHostLabel(SimpleDengueModelHostLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Dengue Model Host Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Dengue Model Host Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSimpleDengueModelHostLabelValue(SimpleDengueModelHostLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseComparable(Comparable<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecorator(Decorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNodeDecorator(NodeDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sanity Checker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sanity Checker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSanityChecker(SanityChecker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifiable(Modifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDiseaseModel(DiseaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegrationDecorator(IntegrationDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStandardDiseaseModel(StandardDiseaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDynamicLabel(DynamicLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNodeLabel(NodeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Node Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDynamicNodeLabel(DynamicNodeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Model Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDiseaseModelLabel(DiseaseModelLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegrationLabel(IntegrationLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Model Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStandardDiseaseModelLabel(StandardDiseaseModelLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelValue(LabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePrimitiveTypeOperations(PrimitiveTypeOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegrationLabelValue(IntegrationLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Model Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDiseaseModelLabelValue(DiseaseModelLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Model Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStandardDiseaseModelLabelValue(StandardDiseaseModelLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T1 defaultCase(EObject object) {
		return null;
	}

} //VectorSwitch
