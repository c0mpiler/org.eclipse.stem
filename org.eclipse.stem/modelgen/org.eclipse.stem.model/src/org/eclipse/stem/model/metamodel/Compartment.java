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

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.Compartment#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Compartment#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Compartment#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Compartment#getContainerGroup <em>Container Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartment()
 * @model
 * @generated
 */
public interface Compartment extends EObject {
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
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Compartment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(EDataType)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartment_DataType()
	 * @model
	 * @generated
	 */
	EDataType getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Compartment#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(EDataType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Standard"</code>.
	 * The literals are from the enumeration {@link org.eclipse.stem.model.metamodel.CompartmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.stem.model.metamodel.CompartmentType
	 * @see #setType(CompartmentType)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartment_Type()
	 * @model default="Standard"
	 * @generated
	 */
	CompartmentType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Compartment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.stem.model.metamodel.CompartmentType
	 * @see #getType()
	 * @generated
	 */
	void setType(CompartmentType value);

	/**
	 * Returns the value of the '<em><b>Container Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Group</em>' container reference.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getCompartment_ContainerGroup()
	 * @see org.eclipse.stem.model.metamodel.CompartmentGroup#getCompartments
	 * @model opposite="compartments" changeable="false"
	 * @generated
	 */
	CompartmentGroup getContainerGroup();

} // Compartment
