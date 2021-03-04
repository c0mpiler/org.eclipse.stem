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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Gen Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.PackageGenSettings#getModelPluginId <em>Model Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.PackageGenSettings#getEditorPluginId <em>Editor Plugin Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getPackageGenSettings()
 * @model
 * @generated
 */
public interface PackageGenSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Plugin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Plugin Id</em>' attribute.
	 * @see #setModelPluginId(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getPackageGenSettings_ModelPluginId()
	 * @model
	 * @generated
	 */
	String getModelPluginId();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.PackageGenSettings#getModelPluginId <em>Model Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Plugin Id</em>' attribute.
	 * @see #getModelPluginId()
	 * @generated
	 */
	void setModelPluginId(String value);

	/**
	 * Returns the value of the '<em><b>Editor Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Plugin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Plugin Id</em>' attribute.
	 * @see #setEditorPluginId(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getPackageGenSettings_EditorPluginId()
	 * @model
	 * @generated
	 */
	String getEditorPluginId();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.PackageGenSettings#getEditorPluginId <em>Editor Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Plugin Id</em>' attribute.
	 * @see #getEditorPluginId()
	 * @generated
	 */
	void setEditorPluginId(String value);

} // PackageGenSettings
