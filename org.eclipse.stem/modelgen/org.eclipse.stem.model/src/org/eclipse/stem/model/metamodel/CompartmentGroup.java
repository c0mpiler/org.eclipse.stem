/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.metamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getValueClass <em>Value Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getCompartments <em>Compartments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartmentGroup()
 * @model
 * @generated
 */
public interface CompartmentGroup extends EObject {
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
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartmentGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(EClass)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartmentGroup_Class()
	 * @model
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Value Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Class</em>' reference.
	 * @see #setValueClass(EClass)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartmentGroup_ValueClass()
	 * @model
	 * @generated
	 */
	EClass getValueClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getValueClass <em>Value Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Class</em>' reference.
	 * @see #getValueClass()
	 * @generated
	 */
	void setValueClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Parent Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Group</em>' reference.
	 * @see #setParentGroup(CompartmentGroup)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartmentGroup_ParentGroup()
	 * @model
	 * @generated
	 */
	CompartmentGroup getParentGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getParentGroup <em>Parent Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Group</em>' reference.
	 * @see #getParentGroup()
	 * @generated
	 */
	void setParentGroup(CompartmentGroup value);

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.metamodel.Compartment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.metamodel.Compartment#getContainerGroup <em>Container Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartmentGroup_Compartments()
	 * @see org.eclipse.stem.model.metamodel.Compartment#getContainerGroup
	 * @model opposite="containerGroup" containment="true"
	 * @generated
	 */
	EList<Compartment> getCompartments();

} // CompartmentGroup
