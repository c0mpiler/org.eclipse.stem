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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getModelType <em>Model Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getParentModel <em>Parent Model</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getContainerPackage <em>Container Package</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Model#getGeneratorSettings <em>Generator Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.stem.model.metamodel.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' attribute.
	 * @see org.eclipse.stem.model.metamodel.ModelType
	 * @see #setModelType(ModelType)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_ModelType()
	 * @model required="true"
	 * @generated
	 */
	ModelType getModelType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Model#getModelType <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' attribute.
	 * @see org.eclipse.stem.model.metamodel.ModelType
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(ModelType value);

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
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_Class()
	 * @model
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Model#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Parent Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Model</em>' reference.
	 * @see #setParentModel(Model)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_ParentModel()
	 * @model
	 * @generated
	 */
	Model getParentModel();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Model#getParentModel <em>Parent Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Model</em>' reference.
	 * @see #getParentModel()
	 * @generated
	 */
	void setParentModel(Model value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.metamodel.ModelParam}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.metamodel.ModelParam#getContainerModel <em>Container Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_Parameters()
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getContainerModel
	 * @model opposite="containerModel" containment="true"
	 * @generated
	 */
	EList<ModelParam> getParameters();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.metamodel.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.metamodel.Transition#getContainerModel <em>Container Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_Transitions()
	 * @see org.eclipse.stem.model.metamodel.Transition#getContainerModel
	 * @model opposite="containerModel" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' reference.
	 * @see #setCompartments(CompartmentGroup)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_Compartments()
	 * @model
	 * @generated
	 */
	CompartmentGroup getCompartments();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Model#getCompartments <em>Compartments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartments</em>' reference.
	 * @see #getCompartments()
	 * @generated
	 */
	void setCompartments(CompartmentGroup value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(AuthorDetails)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_Author()
	 * @model containment="true"
	 * @generated
	 */
	AuthorDetails getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Model#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AuthorDetails value);

	/**
	 * Returns the value of the '<em><b>Container Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.metamodel.Package#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Package</em>' container reference.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_ContainerPackage()
	 * @see org.eclipse.stem.model.metamodel.Package#getModels
	 * @model opposite="models" changeable="false"
	 * @generated
	 */
	org.eclipse.stem.model.metamodel.Package getContainerPackage();

	/**
	 * Returns the value of the '<em><b>Generator Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Settings</em>' containment reference.
	 * @see #setGeneratorSettings(ModelGenSettings)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModel_GeneratorSettings()
	 * @model containment="true"
	 * @generated
	 */
	ModelGenSettings getGeneratorSettings();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Model#getGeneratorSettings <em>Generator Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Settings</em>' containment reference.
	 * @see #getGeneratorSettings()
	 * @generated
	 */
	void setGeneratorSettings(ModelGenSettings value);

} // Model
