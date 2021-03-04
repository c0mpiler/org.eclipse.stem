// StandardDiseaseModel.java
package org.eclipse.stem.diseasemodels.standard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.stem.core.graph.Node;

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
 * This interface defines a class in an EMF model for a Standard disease model.
 * 
 * @see SIR
 * @see SIRLabel
 * @see SIRLabelValue
 * @see SEIR
 * @see SEIRLabel
 * @see SEIRLabelValue
 * 
 * @model abstract="true"
 */
public interface StandardDiseaseModel extends DiseaseModel {

	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * standard disease model type URI.
	 */
	String URI_TYPE_STANDARD_DISEASEMODEL_SEGMENT = URI_TYPE_DISEASEMODEL_SEGMENT
			+ "/standard";



	
	/**
	 * 	/**
	 * The Transmission Coefficient (beta) must be scaled by
	 * the local population density divided by a reference
	 * population density (e.g. the particular location where beta is know or was measured)
	 * For example, in the US the avg pop density is 32.9 people per square km
	 * In China, 141.8 people per sq km,
	 * In Europe 69.7 people per sq km
     * The default value is 100 but this should be specified for any
     * disease along with the value beta. This method is called in
     * getTransmissionRateScaleFactor and used to computeTransions method for a diseaes model.
	 * @return the Reference Population 
	 * @see #SIImpl.getTransmissionRateScaleFactor()
	 * @see #setReferencePopulationDensity(double)
	 * @model default="100"
	 */
	double getReferencePopulationDensity();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getReferencePopulationDensity <em>Reference Population Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Population Density</em>' attribute.
	 * @see #getReferencePopulationDensity()
	 * @generated
	 */
	void setReferencePopulationDensity(double value);

	/**
	 * Returns the value of the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Road Network Infectious Proportion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road Network Infectious Proportion</em>' attribute.
	 * @see #setRoadNetworkInfectiousProportion(double)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseModel_RoadNetworkInfectiousProportion()
	 * @model default="0.01"
	 * @generated
	 */
	double getRoadNetworkInfectiousProportion();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getRoadNetworkInfectiousProportion <em>Road Network Infectious Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Road Network Infectious Proportion</em>' attribute.
	 * @see #getRoadNetworkInfectiousProportion()
	 * @generated
	 */
	void setRoadNetworkInfectiousProportion(double value);

	/**
	 * Returns the value of the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * The default value is <code>"2.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Mixing Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Mixing Distance</em>' attribute.
	 * @see #setCharacteristicMixingDistance(double)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseModel_CharacteristicMixingDistance()
	 * @model default="2.25"
	 * @generated
	 */
	double getCharacteristicMixingDistance();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getCharacteristicMixingDistance <em>Characteristic Mixing Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic Mixing Distance</em>' attribute.
	 * @see #getCharacteristicMixingDistance()
	 * @generated
	 */
	void setCharacteristicMixingDistance(double value);

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getNormalizedEffectiveInfectious(Node node, StandardDiseaseModelLabel diseaseLabel, double onsiteInfectious, EAttribute infectiousAttribute, EAttribute mixingAttribute, EAttribute roadAttribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EAttribute getBirthsCompartment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doDeaths(StandardDiseaseModelLabelValue currentState, StandardDiseaseModelLabelValue delta, double deaths);


} // StandardDiseaseModel
