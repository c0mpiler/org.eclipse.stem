package org.eclipse.stem.interventions;

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

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.graphgenerators.GraphGenerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.interventions.ControlGraphGenerator#getVaccinationFraction <em>Vaccination Fraction</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.ControlGraphGenerator#getIsolationFraction <em>Isolation Fraction</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.ControlGraphGenerator#getPopulationIdentifier <em>Population Identifier</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.ControlGraphGenerator#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.interventions.InterventionsPackage#getControlGraphGenerator()
 * @model
 * @generated
 */
public interface ControlGraphGenerator extends GraphGenerator {

	/**
	 * Returns the value of the '<em><b>Vaccination Fraction</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaccination Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaccination Fraction</em>' attribute.
	 * @see #setVaccinationFraction(double)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getControlGraphGenerator_VaccinationFraction()
	 * @model default="0.0"
	 * @generated
	 */
	double getVaccinationFraction();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.ControlGraphGenerator#getVaccinationFraction <em>Vaccination Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaccination Fraction</em>' attribute.
	 * @see #getVaccinationFraction()
	 * @generated
	 */
	void setVaccinationFraction(double value);

	/**
	 * Returns the value of the '<em><b>Isolation Fraction</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolation Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolation Fraction</em>' attribute.
	 * @see #setIsolationFraction(double)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getControlGraphGenerator_IsolationFraction()
	 * @model default="0.0"
	 * @generated
	 */
	double getIsolationFraction();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.ControlGraphGenerator#getIsolationFraction <em>Isolation Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolation Fraction</em>' attribute.
	 * @see #getIsolationFraction()
	 * @generated
	 */
	void setIsolationFraction(double value);
	
	/**
	 * Returns the value of the '<em><b>Population Identifier</b></em>' attribute.
	 * The default value is <code>"human"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Identifier</em>' attribute.
	 * @see #setPopulationIdentifier(String)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getControlGraphGenerator_PopulationIdentifier()
	 * @model default="human"
	 * @generated
	 */
	String getPopulationIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.ControlGraphGenerator#getPopulationIdentifier <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Identifier</em>' attribute.
	 * @see #getPopulationIdentifier()
	 * @generated
	 */
	void setPopulationIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(URI)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getControlGraphGenerator_Location()
	 * @model dataType="org.eclipse.stem.core.common.URI"
	 * @generated
	 */
	URI getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.ControlGraphGenerator#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(URI value);

	public void setProject(IProject p );
	
} // ControlGraphGenerator
