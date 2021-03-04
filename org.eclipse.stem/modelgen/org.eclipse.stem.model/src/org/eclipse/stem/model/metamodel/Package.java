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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.Package#getPackagePrefix <em>Package Prefix</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Package#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Package#getCompartmentGroups <em>Compartment Groups</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.Package#getGeneratorSettings <em>Generator Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Prefix</em>' attribute.
	 * @see #setPackagePrefix(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getPackage_PackagePrefix()
	 * @model required="true"
	 * @generated
	 */
	String getPackagePrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Package#getPackagePrefix <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Prefix</em>' attribute.
	 * @see #getPackagePrefix()
	 * @generated
	 */
	void setPackagePrefix(String value);

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
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.metamodel.Model}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.metamodel.Model#getContainerPackage <em>Container Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getPackage_Models()
	 * @see org.eclipse.stem.model.metamodel.Model#getContainerPackage
	 * @model opposite="containerPackage" containment="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Compartment Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.metamodel.CompartmentGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Groups</em>' containment reference list.
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getPackage_CompartmentGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompartmentGroup> getCompartmentGroups();

	/**
	 * Returns the value of the '<em><b>Generator Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Settings</em>' containment reference.
	 * @see #setGeneratorSettings(PackageGenSettings)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getPackage_GeneratorSettings()
	 * @model containment="true"
	 * @generated
	 */
	PackageGenSettings getGeneratorSettings();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.Package#getGeneratorSettings <em>Generator Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Settings</em>' containment reference.
	 * @see #getGeneratorSettings()
	 * @generated
	 */
	void setGeneratorSettings(PackageGenSettings value);

} // Package
