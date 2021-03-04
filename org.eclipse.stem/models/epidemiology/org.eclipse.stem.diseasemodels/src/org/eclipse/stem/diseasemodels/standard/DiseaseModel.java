// DiseaseModel.java
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.modifier.Modifiable;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;

/**
 * This interface defines a class in an EMF model for an STEM Disease model. It
 * is the top-level disease model, all other disease models derive from this
 * class.
 * 
 * @model abstract="true"
 */
public interface DiseaseModel extends IntegrationDecorator, Modifiable {

	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * disease model type URI.
	 */
	String URI_TYPE_DISEASEMODEL_SEGMENT = "diseasemodel";

	/**
	 * This is the name of the disease
	 * @return the name of the disease
	 * 
	 * @model
	 */
	String getDiseaseName();
	
	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getDiseaseName <em>Disease Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Name</em>' attribute.
	 * @see #getDiseaseName()
	 * @generated
	 */
	void setDiseaseName(String value);

	/**
	 * Returns the value of the '<em><b>Finite Difference</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finite Difference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finite Difference</em>' attribute.
	 * @see #setFiniteDifference(boolean)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getDiseaseModel_FiniteDifference()
	 * @model default="true"
	 * @generated
	 */
	boolean isFiniteDifference();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#isFiniteDifference <em>Finite Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finite Difference</em>' attribute.
	 * @see #isFiniteDifference()
	 * @generated
	 */
	void setFiniteDifference(boolean value);

	/**
	 * Returns the value of the '<em><b>Frequency Dependent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Dependent</em>' attribute.
	 * @see #setFrequencyDependent(boolean)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getDiseaseModel_FrequencyDependent()
	 * @model default="true"
	 * @generated
	 */
	boolean isFrequencyDependent();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#isFrequencyDependent <em>Frequency Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Dependent</em>' attribute.
	 * @see #isFrequencyDependent()
	 * @generated
	 */
	void setFrequencyDependent(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier);

	/**
	 * This is the identifier of the population being infected by a Disease.
	 * 
	 * @return the identifier of the Population affected by the disease.
	 * 
	 * @model default="human"
	 */
	String getPopulationIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getPopulationIdentifier <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Identifier</em>' attribute.
	 * @see #getPopulationIdentifier()
	 * @generated
	 */
	void setPopulationIdentifier(String value);

	/**
	 * The time period for the specified rates.  Default: 1 Day
	 * @return the time period (milliseconds) of the rates specified for this
	 *         disease model
	 * 
	 * @model default="86400000"
	 */
	long getTimePeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getTimePeriod <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' attribute.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(long value);
	
	/**
	 * @return a new instance of an infector for this disease model.
	 * 
	 * @model volatile="true" transient="true" changeable="false"
	 */
	Infector createInfector();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getAllLabelIdentifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<PopulationModelLabel> getPopulationModelLabels(String populationIdentifier, Graph graph) throws ScenarioInitializationException;

} // DiseaseModel
