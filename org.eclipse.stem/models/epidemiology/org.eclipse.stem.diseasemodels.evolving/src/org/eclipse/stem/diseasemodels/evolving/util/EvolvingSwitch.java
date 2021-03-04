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
package org.eclipse.stem.diseasemodels.evolving.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
import org.eclipse.stem.core.model.TransformationDecorator;
import org.eclipse.stem.core.modifier.Modifiable;
import org.eclipse.stem.diseasemodels.evolving.*;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.SI;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.SIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;

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
 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage
 * @generated
 */
public class EvolvingSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvolvingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSwitch() {
		if (modelPackage == null) {
			modelPackage = EvolvingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER: {
				EvolvingDiseaseTransformer evolvingDiseaseTransformer = (EvolvingDiseaseTransformer)theEObject;
				T1 result = caseEvolvingDiseaseTransformer(evolvingDiseaseTransformer);
				if (result == null) result = caseTransformationDecorator(evolvingDiseaseTransformer);
				if (result == null) result = caseNodeDecorator(evolvingDiseaseTransformer);
				if (result == null) result = caseDecorator(evolvingDiseaseTransformer);
				if (result == null) result = caseIdentifiable(evolvingDiseaseTransformer);
				if (result == null) result = caseComparable(evolvingDiseaseTransformer);
				if (result == null) result = caseSanityChecker(evolvingDiseaseTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_DISEASE_MODEL: {
				EvolvingDiseaseModel evolvingDiseaseModel = (EvolvingDiseaseModel)theEObject;
				T1 result = caseEvolvingDiseaseModel(evolvingDiseaseModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL_LABEL: {
				EvolvingSIDiseaseModelLabel evolvingSIDiseaseModelLabel = (EvolvingSIDiseaseModelLabel)theEObject;
				T1 result = caseEvolvingSIDiseaseModelLabel(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseStandardDiseaseModelLabel(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseDiseaseModelLabel(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseIntegrationLabel(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseDynamicNodeLabel(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseDynamicLabel(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseNodeLabel(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseLabel(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseIdentifiable(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseComparable(evolvingSIDiseaseModelLabel);
				if (result == null) result = caseSanityChecker(evolvingSIDiseaseModelLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE: {
				EvolvingSIDiseaseModelLabelValue evolvingSIDiseaseModelLabelValue = (EvolvingSIDiseaseModelLabelValue)theEObject;
				T1 result = caseEvolvingSIDiseaseModelLabelValue(evolvingSIDiseaseModelLabelValue);
				if (result == null) result = caseSILabelValue(evolvingSIDiseaseModelLabelValue);
				if (result == null) result = caseStandardDiseaseModelLabelValue(evolvingSIDiseaseModelLabelValue);
				if (result == null) result = caseDiseaseModelLabelValue(evolvingSIDiseaseModelLabelValue);
				if (result == null) result = caseIntegrationLabelValue(evolvingSIDiseaseModelLabelValue);
				if (result == null) result = caseLabelValue(evolvingSIDiseaseModelLabelValue);
				if (result == null) result = casePrimitiveTypeOperations(evolvingSIDiseaseModelLabelValue);
				if (result == null) result = caseSanityChecker(evolvingSIDiseaseModelLabelValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL: {
				EvolvingSIDiseaseModel evolvingSIDiseaseModel = (EvolvingSIDiseaseModel)theEObject;
				T1 result = caseEvolvingSIDiseaseModel(evolvingSIDiseaseModel);
				if (result == null) result = caseSI(evolvingSIDiseaseModel);
				if (result == null) result = caseEvolvingDiseaseModel(evolvingSIDiseaseModel);
				if (result == null) result = caseStandardDiseaseModel(evolvingSIDiseaseModel);
				if (result == null) result = caseDiseaseModel(evolvingSIDiseaseModel);
				if (result == null) result = caseIntegrationDecorator(evolvingSIDiseaseModel);
				if (result == null) result = caseModifiable(evolvingSIDiseaseModel);
				if (result == null) result = caseNodeDecorator(evolvingSIDiseaseModel);
				if (result == null) result = caseDecorator(evolvingSIDiseaseModel);
				if (result == null) result = caseIdentifiable(evolvingSIDiseaseModel);
				if (result == null) result = caseComparable(evolvingSIDiseaseModel);
				if (result == null) result = caseSanityChecker(evolvingSIDiseaseModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_LABEL: {
				EvolvingSIRDiseaseModelLabel evolvingSIRDiseaseModelLabel = (EvolvingSIRDiseaseModelLabel)theEObject;
				T1 result = caseEvolvingSIRDiseaseModelLabel(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseStandardDiseaseModelLabel(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseDiseaseModelLabel(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseIntegrationLabel(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseDynamicNodeLabel(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseDynamicLabel(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseNodeLabel(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseLabel(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseIdentifiable(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseComparable(evolvingSIRDiseaseModelLabel);
				if (result == null) result = caseSanityChecker(evolvingSIRDiseaseModelLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE: {
				EvolvingSIRDiseaseModelLabelValue evolvingSIRDiseaseModelLabelValue = (EvolvingSIRDiseaseModelLabelValue)theEObject;
				T1 result = caseEvolvingSIRDiseaseModelLabelValue(evolvingSIRDiseaseModelLabelValue);
				if (result == null) result = caseSIRLabelValue(evolvingSIRDiseaseModelLabelValue);
				if (result == null) result = caseSILabelValue(evolvingSIRDiseaseModelLabelValue);
				if (result == null) result = caseStandardDiseaseModelLabelValue(evolvingSIRDiseaseModelLabelValue);
				if (result == null) result = caseDiseaseModelLabelValue(evolvingSIRDiseaseModelLabelValue);
				if (result == null) result = caseIntegrationLabelValue(evolvingSIRDiseaseModelLabelValue);
				if (result == null) result = caseLabelValue(evolvingSIRDiseaseModelLabelValue);
				if (result == null) result = casePrimitiveTypeOperations(evolvingSIRDiseaseModelLabelValue);
				if (result == null) result = caseSanityChecker(evolvingSIRDiseaseModelLabelValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL: {
				EvolvingSIRDiseaseModel evolvingSIRDiseaseModel = (EvolvingSIRDiseaseModel)theEObject;
				T1 result = caseEvolvingSIRDiseaseModel(evolvingSIRDiseaseModel);
				if (result == null) result = caseEvolvingSIDiseaseModel(evolvingSIRDiseaseModel);
				if (result == null) result = caseSI(evolvingSIRDiseaseModel);
				if (result == null) result = caseEvolvingDiseaseModel(evolvingSIRDiseaseModel);
				if (result == null) result = caseStandardDiseaseModel(evolvingSIRDiseaseModel);
				if (result == null) result = caseDiseaseModel(evolvingSIRDiseaseModel);
				if (result == null) result = caseIntegrationDecorator(evolvingSIRDiseaseModel);
				if (result == null) result = caseModifiable(evolvingSIRDiseaseModel);
				if (result == null) result = caseNodeDecorator(evolvingSIRDiseaseModel);
				if (result == null) result = caseDecorator(evolvingSIRDiseaseModel);
				if (result == null) result = caseIdentifiable(evolvingSIRDiseaseModel);
				if (result == null) result = caseComparable(evolvingSIRDiseaseModel);
				if (result == null) result = caseSanityChecker(evolvingSIRDiseaseModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL_LABEL: {
				EvolvingSEIRDiseaseModelLabel evolvingSEIRDiseaseModelLabel = (EvolvingSEIRDiseaseModelLabel)theEObject;
				T1 result = caseEvolvingSEIRDiseaseModelLabel(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseStandardDiseaseModelLabel(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseDiseaseModelLabel(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseIntegrationLabel(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseDynamicNodeLabel(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseDynamicLabel(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseNodeLabel(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseLabel(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseIdentifiable(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseComparable(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = caseSanityChecker(evolvingSEIRDiseaseModelLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE: {
				EvolvingSEIRDiseaseModelLabelValue evolvingSEIRDiseaseModelLabelValue = (EvolvingSEIRDiseaseModelLabelValue)theEObject;
				T1 result = caseEvolvingSEIRDiseaseModelLabelValue(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = caseSEIRLabelValue(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = caseSIRLabelValue(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = caseSILabelValue(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = caseStandardDiseaseModelLabelValue(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = caseDiseaseModelLabelValue(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = caseIntegrationLabelValue(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = caseLabelValue(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = casePrimitiveTypeOperations(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = caseSanityChecker(evolvingSEIRDiseaseModelLabelValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvolvingPackage.EVOLVING_SEIR_DISEASE_MODEL: {
				EvolvingSEIRDiseaseModel evolvingSEIRDiseaseModel = (EvolvingSEIRDiseaseModel)theEObject;
				T1 result = caseEvolvingSEIRDiseaseModel(evolvingSEIRDiseaseModel);
				if (result == null) result = caseEvolvingSIRDiseaseModel(evolvingSEIRDiseaseModel);
				if (result == null) result = caseEvolvingSIDiseaseModel(evolvingSEIRDiseaseModel);
				if (result == null) result = caseSI(evolvingSEIRDiseaseModel);
				if (result == null) result = caseEvolvingDiseaseModel(evolvingSEIRDiseaseModel);
				if (result == null) result = caseStandardDiseaseModel(evolvingSEIRDiseaseModel);
				if (result == null) result = caseDiseaseModel(evolvingSEIRDiseaseModel);
				if (result == null) result = caseIntegrationDecorator(evolvingSEIRDiseaseModel);
				if (result == null) result = caseModifiable(evolvingSEIRDiseaseModel);
				if (result == null) result = caseNodeDecorator(evolvingSEIRDiseaseModel);
				if (result == null) result = caseDecorator(evolvingSEIRDiseaseModel);
				if (result == null) result = caseIdentifiable(evolvingSEIRDiseaseModel);
				if (result == null) result = caseComparable(evolvingSEIRDiseaseModel);
				if (result == null) result = caseSanityChecker(evolvingSEIRDiseaseModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingDiseaseTransformer(EvolvingDiseaseTransformer object) {
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
	public T1 caseEvolvingDiseaseModel(EvolvingDiseaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SI Disease Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SI Disease Model Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingSIDiseaseModelLabel(EvolvingSIDiseaseModelLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SI Disease Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SI Disease Model Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingSIDiseaseModelLabelValue(EvolvingSIDiseaseModelLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SI Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SI Disease Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingSIDiseaseModel(EvolvingSIDiseaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIR Disease Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIR Disease Model Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingSIRDiseaseModelLabel(EvolvingSIRDiseaseModelLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIR Disease Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIR Disease Model Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingSIRDiseaseModelLabelValue(EvolvingSIRDiseaseModelLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIR Disease Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingSIRDiseaseModel(EvolvingSIRDiseaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEIR Disease Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEIR Disease Model Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingSEIRDiseaseModelLabel(EvolvingSEIRDiseaseModelLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEIR Disease Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEIR Disease Model Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingSEIRDiseaseModelLabelValue(EvolvingSEIRDiseaseModelLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEIR Disease Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvolvingSEIRDiseaseModel(EvolvingSEIRDiseaseModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformationDecorator(TransformationDecorator object) {
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
	public T1 caseDiseaseModelLabel(DiseaseModelLabel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SI Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SI Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSILabelValue(SILabelValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSI(SI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIR Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIR Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSIRLabelValue(SIRLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEIR Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEIR Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSEIRLabelValue(SEIRLabelValue object) {
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
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //EvolvingSwitch
