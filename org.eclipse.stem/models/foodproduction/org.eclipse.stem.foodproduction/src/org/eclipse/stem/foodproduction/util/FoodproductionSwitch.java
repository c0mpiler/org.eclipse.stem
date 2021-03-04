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
package org.eclipse.stem.foodproduction.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.SanityChecker;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.NodeDecorator;
import org.eclipse.stem.core.model.TransformationDecorator;
import org.eclipse.stem.foodproduction.DiseaseCarryingTransformer;
import org.eclipse.stem.foodproduction.FoodConsumer;
import org.eclipse.stem.foodproduction.FoodProducer;
import org.eclipse.stem.foodproduction.FoodTransformer;
import org.eclipse.stem.foodproduction.FoodproductionPackage;
import org.eclipse.stem.foodproduction.SlaughterHouse;

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
 * @see org.eclipse.stem.foodproduction.FoodproductionPackage
 * @generated
 */
public class FoodproductionSwitch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FoodproductionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodproductionSwitch() {
		if (modelPackage == null) {
			modelPackage = FoodproductionPackage.eINSTANCE;
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
			case FoodproductionPackage.FOOD_TRANSFORMER: {
				FoodTransformer foodTransformer = (FoodTransformer)theEObject;
				T1 result = caseFoodTransformer(foodTransformer);
				if (result == null) result = caseTransformationDecorator(foodTransformer);
				if (result == null) result = caseNodeDecorator(foodTransformer);
				if (result == null) result = caseDecorator(foodTransformer);
				if (result == null) result = caseIdentifiable(foodTransformer);
				if (result == null) result = caseComparable(foodTransformer);
				if (result == null) result = caseSanityChecker(foodTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoodproductionPackage.FOOD_PRODUCER: {
				FoodProducer foodProducer = (FoodProducer)theEObject;
				T1 result = caseFoodProducer(foodProducer);
				if (result == null) result = caseFoodTransformer(foodProducer);
				if (result == null) result = caseTransformationDecorator(foodProducer);
				if (result == null) result = caseNodeDecorator(foodProducer);
				if (result == null) result = caseDecorator(foodProducer);
				if (result == null) result = caseIdentifiable(foodProducer);
				if (result == null) result = caseComparable(foodProducer);
				if (result == null) result = caseSanityChecker(foodProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoodproductionPackage.SLAUGHTER_HOUSE: {
				SlaughterHouse slaughterHouse = (SlaughterHouse)theEObject;
				T1 result = caseSlaughterHouse(slaughterHouse);
				if (result == null) result = caseFoodProducer(slaughterHouse);
				if (result == null) result = caseDiseaseCarryingTransformer(slaughterHouse);
				if (result == null) result = caseFoodTransformer(slaughterHouse);
				if (result == null) result = caseTransformationDecorator(slaughterHouse);
				if (result == null) result = caseNodeDecorator(slaughterHouse);
				if (result == null) result = caseDecorator(slaughterHouse);
				if (result == null) result = caseIdentifiable(slaughterHouse);
				if (result == null) result = caseComparable(slaughterHouse);
				if (result == null) result = caseSanityChecker(slaughterHouse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoodproductionPackage.DISEASE_CARRYING_TRANSFORMER: {
				DiseaseCarryingTransformer diseaseCarryingTransformer = (DiseaseCarryingTransformer)theEObject;
				T1 result = caseDiseaseCarryingTransformer(diseaseCarryingTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoodproductionPackage.FOOD_CONSUMER: {
				FoodConsumer foodConsumer = (FoodConsumer)theEObject;
				T1 result = caseFoodConsumer(foodConsumer);
				if (result == null) result = caseFoodTransformer(foodConsumer);
				if (result == null) result = caseDiseaseCarryingTransformer(foodConsumer);
				if (result == null) result = caseTransformationDecorator(foodConsumer);
				if (result == null) result = caseNodeDecorator(foodConsumer);
				if (result == null) result = caseDecorator(foodConsumer);
				if (result == null) result = caseIdentifiable(foodConsumer);
				if (result == null) result = caseComparable(foodConsumer);
				if (result == null) result = caseSanityChecker(foodConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Food Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Food Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFoodTransformer(FoodTransformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Food Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Food Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFoodProducer(FoodProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slaughter House</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slaughter House</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSlaughterHouse(SlaughterHouse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Carrying Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Carrying Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDiseaseCarryingTransformer(DiseaseCarryingTransformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Food Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Food Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFoodConsumer(FoodConsumer object) {
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

} //FoodproductionSwitch
