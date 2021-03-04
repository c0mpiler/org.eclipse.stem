package org.eclipse.stem.internal.data.generatedplugin;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v2.0 
 * which accompanies this distribution, and is available at 
 * https://www.eclipse.org/legal/epl-2.0/ 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Plugin</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.stem.internal.data.generatedplugin.Plugin#getExtensionelement
 * <em>Extensionelement</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.stem.internal.data.generatedplugin.GeneratedpluginPackage#getPlugin()
 * @model extendedMetaData="name='plugin' kind='elementOnly'"
 * @generated
 */
public interface Plugin extends EObject {
	/**
	 * Returns the value of the '<em><b>Extensionelement</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.eclipse.stem.internal.data.generatedplugin.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensionelement</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Extensionelement</em>' containment
	 *         reference list.
	 * @see org.eclipse.stem.internal.data.generatedplugin.GeneratedpluginPackage#getPlugin_Extensionelement()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='extensionelement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getExtensionelement();

} // Plugin
