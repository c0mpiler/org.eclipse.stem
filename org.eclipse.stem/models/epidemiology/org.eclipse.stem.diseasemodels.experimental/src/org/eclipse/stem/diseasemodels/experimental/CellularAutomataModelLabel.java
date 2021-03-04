// CellularAutomataModelLabel.java
package org.eclipse.stem.diseasemodels.experimental;

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
import org.eclipse.stem.core.graph.DynamicNodeLabel;

/**
 * This interface defines a class in an EMF model for an STEM Disease model
 * label. It is the top-level disease model, all other disease model labels
 * derive from this class.
 * 
 * @model abstract="true"
 */
public interface CellularAutomataModelLabel extends DynamicNodeLabel {

	/**
	 * This is the top-level segment for all type URI's for disease model
	 * labels.
	 */
	String URI_TYPE_DISEASE_MODEL_LABEL_SEGMENT = URI_TYPE_DYNAMIC_LABEL_SEGMENT
			+ "/diseasemodel"; //$NON-NLS-1$

	/**
	 * This is the type URI for disease model labels
	 */
	URI URI_TYPE_SIR_LABEL = STEMURI
			.createTypeURI(URI_TYPE_DISEASE_MODEL_LABEL_SEGMENT);

	

	/**
	 * @return the disease model state associated with this label (if any).
	 * @model containment="true" opposite="label"
	 */
	CellularAutomataModelState getCellularAutomataModelState();

	/**
	 * Sets the value of the '<em>Disease Model State</em> containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Model State</em>' containment reference.
	 * @generated
	 */
	void setCellularAutomataModelState(CellularAutomataModelState value);

	
	
	
	/**
	 * @return the current SI label value
	 * @model volatile="true" changeable="false" resolveProxies="false"
	 */
	CellularAutomataModelLabelValue getCurrentCellularAutomataModelLabelValue();

	/**
	 * @return the next SI label value
	 * @model volatile="true" changeable="false" resolveProxies="false"
	 */
	CellularAutomataModelLabelValue getNextCellularAutomataModelLabelValue();
} // CellularAutomataModelLabel
