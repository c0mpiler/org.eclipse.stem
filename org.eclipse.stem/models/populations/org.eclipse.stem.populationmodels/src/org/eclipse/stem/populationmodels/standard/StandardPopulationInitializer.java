package org.eclipse.stem.populationmodels.standard;

import org.eclipse.emf.common.util.URI;

/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer#isUseDensity <em>Use Density</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer#getTargetISOKey <em>Target ISO Key</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer#getTargetURI <em>Target URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationInitializer()
 * @model
 * @generated
 */
public interface StandardPopulationInitializer extends PopulationInitializer {
	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individuals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' attribute.
	 * @see #setIndividuals(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationInitializer_Individuals()
	 * @model default="1"
	 * @generated
	 */
	double getIndividuals();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer#getIndividuals <em>Individuals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individuals</em>' attribute.
	 * @see #getIndividuals()
	 * @generated
	 */
	void setIndividuals(double value);

	/**
	 * Returns the value of the '<em><b>Use Density</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Density</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Density</em>' attribute.
	 * @see #setUseDensity(boolean)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationInitializer_UseDensity()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseDensity();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer#isUseDensity <em>Use Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Density</em>' attribute.
	 * @see #isUseDensity()
	 * @generated
	 */
	void setUseDensity(boolean value);

	/**
	 * Returns the value of the '<em><b>Target ISO Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target ISO Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target ISO Key</em>' attribute.
	 * @see #setTargetISOKey(String)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationInitializer_TargetISOKey()
	 * @model
	 * @generated
	 */
	String getTargetISOKey();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer#getTargetISOKey <em>Target ISO Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target ISO Key</em>' attribute.
	 * @see #getTargetISOKey()
	 * @generated
	 */
	void setTargetISOKey(String value);

	/**
	 * Returns the value of the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target URI</em>' attribute.
	 * @see #setTargetURI(URI)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationInitializer_TargetURI()
	 * @model dataType="org.eclipse.stem.core.common.URI"
	 * @generated
	 */
	URI getTargetURI();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer#getTargetURI <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target URI</em>' attribute.
	 * @see #getTargetURI()
	 * @generated
	 */
	void setTargetURI(URI value);

} // StandardPopulationInitializer
