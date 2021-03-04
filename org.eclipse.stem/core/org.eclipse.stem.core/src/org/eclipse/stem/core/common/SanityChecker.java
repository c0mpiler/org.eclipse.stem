package org.eclipse.stem.core.common;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sanity Checker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.stem.core.common.CommonPackage#getSanityChecker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SanityChecker extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean sane();

} // SanityChecker
