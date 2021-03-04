// SIRInoculator.java
package org.eclipse.stem.diseasemodels.standard;

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
 * This interface defines a class in an EMF model for the initialization of an
 * inoculated population in a Standard disease model.
 * 
 * The inoculator removes a fraction of the population from the <em>Susceptible</em> state
 * to the <em>Recovered</em> state at at particular node.
 * 
 * @model
 */
public interface SIRInoculator extends SIInfector {

	/**
	 * Returns the value of the '<em><b>Inoculated Percentage</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inoculated Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inoculated Percentage</em>' attribute.
	 * @see #setInoculatedPercentage(double)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getSIRInoculator_InoculatedPercentage()
	 * @model default="1"
	 * @generated
	 */
	double getInoculatedPercentage();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.SIRInoculator#getInoculatedPercentage <em>Inoculated Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inoculated Percentage</em>' attribute.
	 * @see #getInoculatedPercentage()
	 * @generated
	 */
	void setInoculatedPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Inoculate Percentage</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inoculate Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inoculate Percentage</em>' attribute.
	 * @see #setInoculatePercentage(boolean)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getSIRInoculator_InoculatePercentage()
	 * @model default="true"
	 * @generated
	 */
	boolean isInoculatePercentage();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.SIRInoculator#isInoculatePercentage <em>Inoculate Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inoculate Percentage</em>' attribute.
	 * @see #isInoculatePercentage()
	 * @generated
	 */
	void setInoculatePercentage(boolean value);

	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * standard infector or inoculator type URI.
	 */
	String URI_TYPE_SIR_INFECTOR_SEGMENT = URI_TYPE_STANDARD_INFECTOR_SEGMENT
			+ "/sir";

} // SIInoculator
