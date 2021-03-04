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
package org.eclipse.stem.foodproduction;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.common.DoubleValueMatrix;
import org.eclipse.stem.core.model.IntegrationDecorator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disease Carrying Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getSourceDecorator <em>Source Decorator</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getTargetDecorator <em>Target Decorator</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getStateTransitionsMap <em>State Transitions Map</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getSourceAttributes <em>Source Attributes</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getTargetAttributes <em>Target Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getDiseaseCarryingTransformer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DiseaseCarryingTransformer extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Decorator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Decorator</em>' reference.
	 * @see #setSourceDecorator(IntegrationDecorator)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getDiseaseCarryingTransformer_SourceDecorator()
	 * @model
	 * @generated
	 */
	IntegrationDecorator getSourceDecorator();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getSourceDecorator <em>Source Decorator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Decorator</em>' reference.
	 * @see #getSourceDecorator()
	 * @generated
	 */
	void setSourceDecorator(IntegrationDecorator value);

	/**
	 * Returns the value of the '<em><b>Target Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Decorator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Decorator</em>' reference.
	 * @see #setTargetDecorator(IntegrationDecorator)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getDiseaseCarryingTransformer_TargetDecorator()
	 * @model
	 * @generated
	 */
	IntegrationDecorator getTargetDecorator();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getTargetDecorator <em>Target Decorator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Decorator</em>' reference.
	 * @see #getTargetDecorator()
	 * @generated
	 */
	void setTargetDecorator(IntegrationDecorator value);

	/**
	 * Returns the value of the '<em><b>State Transitions Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Transitions Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Transitions Map</em>' containment reference.
	 * @see #setStateTransitionsMap(DoubleValueMatrix)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getDiseaseCarryingTransformer_StateTransitionsMap()
	 * @model containment="true"
	 * @generated
	 */
	DoubleValueMatrix getStateTransitionsMap();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getStateTransitionsMap <em>State Transitions Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Transitions Map</em>' containment reference.
	 * @see #getStateTransitionsMap()
	 * @generated
	 */
	void setStateTransitionsMap(DoubleValueMatrix value);

	/**
	 * Returns the value of the '<em><b>Source Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Attributes</em>' reference list.
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getDiseaseCarryingTransformer_SourceAttributes()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getSourceAttributes();

	/**
	 * Returns the value of the '<em><b>Target Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Attributes</em>' reference list.
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getDiseaseCarryingTransformer_TargetAttributes()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getTargetAttributes();

} // DiseaseCarryingTransformer
