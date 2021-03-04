package org.eclipse.stem.diseasemodels.predicates.diseasepredicates;

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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage
 * @generated
 */
public interface DiseasepredicatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiseasepredicatesFactory eINSTANCE = org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.DiseasepredicatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Label Value Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Value Test</em>'.
	 * @generated
	 */
	LabelValueTest createLabelValueTest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiseasepredicatesPackage getDiseasepredicatesPackage();

} //DiseasepredicatesFactory
