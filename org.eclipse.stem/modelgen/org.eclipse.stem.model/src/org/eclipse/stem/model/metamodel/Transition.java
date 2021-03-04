/**
 * 
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 */
package org.eclipse.stem.model.metamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Transition#getForIncidence <em>For Incidence</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Transition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Transition#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Transition#getCompiledExpression <em>Compiled Expression</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Transition#getContainerModel <em>Container Model</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Transition#getExpressionResource <em>Expression Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Compartment)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getTransition_Source()
	 * @model
	 * @generated
	 */
	Compartment getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Compartment value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Compartment)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getTransition_Target()
	 * @model
	 * @generated
	 */
	Compartment getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Compartment value);

	/**
	 * Returns the value of the '<em><b>For Incidence</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.metamodel.Compartment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Incidence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Incidence</em>' reference list.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getTransition_ForIncidence()
	 * @model
	 * @generated
	 */
	EList<Compartment> getForIncidence();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getTransition_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Transition#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Compiled Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compiled Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compiled Expression</em>' reference.
	 * @see #setCompiledExpression(EObject)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getTransition_CompiledExpression()
	 * @model transient="true"
	 * @generated
	 */
	EObject getCompiledExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Transition#getCompiledExpression <em>Compiled Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compiled Expression</em>' reference.
	 * @see #getCompiledExpression()
	 * @generated
	 */
	void setCompiledExpression(EObject value);

	/**
	 * Returns the value of the '<em><b>Container Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.metamodel.Model#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Model</em>' container reference.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getTransition_ContainerModel()
	 * @see org.eclipse.stem.model.metamodel.Model#getTransitions
	 * @model opposite="transitions" changeable="false"
	 * @generated
	 */
	Model getContainerModel();

	/**
	 * Returns the value of the '<em><b>Expression Resource</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Resource</em>' attribute.
	 * @see #setExpressionResource(Resource)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getTransition_ExpressionResource()
	 * @model default="null" dataType="org.eclipse.stem.model.metamodel.Resource" transient="true"
	 * @generated
	 */
	Resource getExpressionResource();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Transition#getExpressionResource <em>Expression Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Resource</em>' attribute.
	 * @see #getExpressionResource()
	 * @generated
	 */
	void setExpressionResource(Resource value);

} // Transition
