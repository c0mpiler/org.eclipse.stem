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
 * A representation of the model object '<em><b>Model Gen Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getPropertyEditorClass <em>Property Editor Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getPropertyEditorParentClass <em>Property Editor Parent Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getStringProviderAdapterClass <em>String Provider Adapter Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getStringProviderAdapterParentClass <em>String Provider Adapter Parent Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelRelativeValueProviderAdapterClass <em>Label Relative Value Provider Adapter Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelRelativeValueProviderAdapterParentClass <em>Label Relative Value Provider Adapter Parent Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelValueRelativeValueProviderAdapterClass <em>Label Value Relative Value Provider Adapter Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelValueRelativeValueProviderAdapterParentClass <em>Label Value Relative Value Provider Adapter Parent Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelGenSettings()
 * @model
 * @generated
 */
public interface ModelGenSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Editor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Editor Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Editor Class</em>' attribute.
	 * @see #setPropertyEditorClass(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelGenSettings_PropertyEditorClass()
	 * @model
	 * @generated
	 */
	String getPropertyEditorClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getPropertyEditorClass <em>Property Editor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Editor Class</em>' attribute.
	 * @see #getPropertyEditorClass()
	 * @generated
	 */
	void setPropertyEditorClass(String value);

	/**
	 * Returns the value of the '<em><b>Property Editor Parent Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Editor Parent Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Editor Parent Class</em>' attribute.
	 * @see #setPropertyEditorParentClass(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelGenSettings_PropertyEditorParentClass()
	 * @model
	 * @generated
	 */
	String getPropertyEditorParentClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getPropertyEditorParentClass <em>Property Editor Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Editor Parent Class</em>' attribute.
	 * @see #getPropertyEditorParentClass()
	 * @generated
	 */
	void setPropertyEditorParentClass(String value);

	/**
	 * Returns the value of the '<em><b>String Provider Adapter Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Provider Adapter Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Provider Adapter Class</em>' attribute.
	 * @see #setStringProviderAdapterClass(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelGenSettings_StringProviderAdapterClass()
	 * @model
	 * @generated
	 */
	String getStringProviderAdapterClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getStringProviderAdapterClass <em>String Provider Adapter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Provider Adapter Class</em>' attribute.
	 * @see #getStringProviderAdapterClass()
	 * @generated
	 */
	void setStringProviderAdapterClass(String value);

	/**
	 * Returns the value of the '<em><b>String Provider Adapter Parent Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Provider Adapter Parent Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Provider Adapter Parent Class</em>' attribute.
	 * @see #setStringProviderAdapterParentClass(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelGenSettings_StringProviderAdapterParentClass()
	 * @model
	 * @generated
	 */
	String getStringProviderAdapterParentClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getStringProviderAdapterParentClass <em>String Provider Adapter Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Provider Adapter Parent Class</em>' attribute.
	 * @see #getStringProviderAdapterParentClass()
	 * @generated
	 */
	void setStringProviderAdapterParentClass(String value);

	/**
	 * Returns the value of the '<em><b>Label Relative Value Provider Adapter Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Relative Value Provider Adapter Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Relative Value Provider Adapter Class</em>' attribute.
	 * @see #setLabelRelativeValueProviderAdapterClass(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelGenSettings_LabelRelativeValueProviderAdapterClass()
	 * @model
	 * @generated
	 */
	String getLabelRelativeValueProviderAdapterClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelRelativeValueProviderAdapterClass <em>Label Relative Value Provider Adapter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Relative Value Provider Adapter Class</em>' attribute.
	 * @see #getLabelRelativeValueProviderAdapterClass()
	 * @generated
	 */
	void setLabelRelativeValueProviderAdapterClass(String value);

	/**
	 * Returns the value of the '<em><b>Label Relative Value Provider Adapter Parent Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Relative Value Provider Adapter Parent Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Relative Value Provider Adapter Parent Class</em>' attribute.
	 * @see #setLabelRelativeValueProviderAdapterParentClass(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelGenSettings_LabelRelativeValueProviderAdapterParentClass()
	 * @model
	 * @generated
	 */
	String getLabelRelativeValueProviderAdapterParentClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelRelativeValueProviderAdapterParentClass <em>Label Relative Value Provider Adapter Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Relative Value Provider Adapter Parent Class</em>' attribute.
	 * @see #getLabelRelativeValueProviderAdapterParentClass()
	 * @generated
	 */
	void setLabelRelativeValueProviderAdapterParentClass(String value);

	/**
	 * Returns the value of the '<em><b>Label Value Relative Value Provider Adapter Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Value Relative Value Provider Adapter Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Value Relative Value Provider Adapter Class</em>' attribute.
	 * @see #setLabelValueRelativeValueProviderAdapterClass(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelGenSettings_LabelValueRelativeValueProviderAdapterClass()
	 * @model
	 * @generated
	 */
	String getLabelValueRelativeValueProviderAdapterClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelValueRelativeValueProviderAdapterClass <em>Label Value Relative Value Provider Adapter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Value Relative Value Provider Adapter Class</em>' attribute.
	 * @see #getLabelValueRelativeValueProviderAdapterClass()
	 * @generated
	 */
	void setLabelValueRelativeValueProviderAdapterClass(String value);

	/**
	 * Returns the value of the '<em><b>Label Value Relative Value Provider Adapter Parent Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Value Relative Value Provider Adapter Parent Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Value Relative Value Provider Adapter Parent Class</em>' attribute.
	 * @see #setLabelValueRelativeValueProviderAdapterParentClass(String)
	 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelGenSettings_LabelValueRelativeValueProviderAdapterParentClass()
	 * @model
	 * @generated
	 */
	String getLabelValueRelativeValueProviderAdapterParentClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelValueRelativeValueProviderAdapterParentClass <em>Label Value Relative Value Provider Adapter Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Value Relative Value Provider Adapter Parent Class</em>' attribute.
	 * @see #getLabelValueRelativeValueProviderAdapterParentClass()
	 * @generated
	 */
	void setLabelValueRelativeValueProviderAdapterParentClass(String value);

} // ModelGenSettings
