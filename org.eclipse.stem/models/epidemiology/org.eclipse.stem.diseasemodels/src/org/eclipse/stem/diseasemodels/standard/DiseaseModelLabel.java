// DiseaseModelLabel.java
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

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;

/**
 * This interface defines a class in an EMF model for an STEM Disease model
 * label. It is the top-level disease model, all other disease model labels
 * derive from this class.
 * 
 * @model abstract="true"
 */
public interface DiseaseModelLabel extends IntegrationLabel {

	/**
	 * This is the top-level segment for all type URI's for disease model
	 * labels.
	 */
	String URI_TYPE_DISEASE_MODEL_LABEL_SEGMENT = URI_TYPE_DYNAMIC_LABEL_SEGMENT
			+ "/diseasemodel";

	/**
	 * This is the type URI for disease model labels
	 */
	URI URI_TYPE_DYNAMIC_DISEASE_LABEL = STEMURI
			.createTypeURI(URI_TYPE_DISEASE_MODEL_LABEL_SEGMENT);

	/**
	 * This is the Population being infected by a Disease. The values for this
	 * disease model label apply to the population represented by the population
	 * label.
	 * 
	 * @return the Population affected by the disease.
	 * 
	 * @model
	 */
	PopulationLabel getPopulationLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getPopulationLabel <em>Population Label</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Label</em>' reference.
	 * @see #getPopulationLabel()
	 * @generated
	 */
	void setPopulationLabel(PopulationLabel value);

	/**
	 * Returns the value of the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Model Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Model Label</em>' reference.
	 * @see #setPopulationModelLabel(PopulationModelLabel)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getDiseaseModelLabel_PopulationModelLabel()
	 * @model
	 * @generated
	 */
	PopulationModelLabel getPopulationModelLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getPopulationModelLabel <em>Population Model Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Model Label</em>' reference.
	 * @see #getPopulationModelLabel()
	 * @generated
	 */
	void setPopulationModelLabel(PopulationModelLabel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toTooltipString();
	
} // DiseaseModelLabel
