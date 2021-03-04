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
package org.eclipse.stem.evolvingcrossspeciesmodel;

import org.eclipse.stem.diseasemodels.standard.SIRLabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue#getE <em>E</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue#getSeff <em>Seff</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModelLabelValue()
 * @model annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface EvolvingCrossSpeciesModelLabelValue extends SIRLabelValue {

	/**
	 * Returns the value of the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' attribute.
	 * @see #setE(double)
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModelLabelValue_E()
	 * @model annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getE();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue#getE <em>E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E</em>' attribute.
	 * @see #getE()
	 * @generated
	 */
	void setE(double value);

	/**
	 * Returns the value of the '<em><b>Seff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seff</em>' attribute.
	 * @see #setSeff(double)
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#getEvolvingCrossSpeciesModelLabelValue_Seff()
	 * @model annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
	 * @generated
	 */
	double getSeff();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue#getSeff <em>Seff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seff</em>' attribute.
	 * @see #getSeff()
	 * @generated
	 */
	void setSeff(double value);

} // EvolvingCrossSpeciesModelLabelValue
