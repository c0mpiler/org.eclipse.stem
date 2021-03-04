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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getHelpMessage <em>Help Message</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getInvalidMessage <em>Invalid Message</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getMissingMessage <em>Missing Message</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelParam#getContainerModel <em>Container Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam()
 * @model
 * @generated
 */
public interface ModelParam extends EObject {
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
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelParam#getName <em>Name</em>}' attribute.
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
	 * @see #setDataType(EClassifier)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_DataType()
	 * @model required="true"
	 * @generated
	 */
	EClassifier getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelParam#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelParam#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.metamodel.ModelParamConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelParamConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelParam#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelParam#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Help Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Message</em>' attribute.
	 * @see #setHelpMessage(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_HelpMessage()
	 * @model
	 * @generated
	 */
	String getHelpMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelParam#getHelpMessage <em>Help Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help Message</em>' attribute.
	 * @see #getHelpMessage()
	 * @generated
	 */
	void setHelpMessage(String value);

	/**
	 * Returns the value of the '<em><b>Invalid Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Message</em>' attribute.
	 * @see #setInvalidMessage(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_InvalidMessage()
	 * @model
	 * @generated
	 */
	String getInvalidMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelParam#getInvalidMessage <em>Invalid Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Message</em>' attribute.
	 * @see #getInvalidMessage()
	 * @generated
	 */
	void setInvalidMessage(String value);

	/**
	 * Returns the value of the '<em><b>Missing Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Message</em>' attribute.
	 * @see #setMissingMessage(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_MissingMessage()
	 * @model
	 * @generated
	 */
	String getMissingMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelParam#getMissingMessage <em>Missing Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Message</em>' attribute.
	 * @see #getMissingMessage()
	 * @generated
	 */
	void setMissingMessage(String value);

	/**
	 * Returns the value of the '<em><b>Container Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.metamodel.Model#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Model</em>' container reference.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelParam_ContainerModel()
	 * @see org.eclipse.stem.model.metamodel.Model#getParameters
	 * @model opposite="parameters" changeable="false"
	 * @generated
	 */
	Model getContainerModel();

} // ModelParam
