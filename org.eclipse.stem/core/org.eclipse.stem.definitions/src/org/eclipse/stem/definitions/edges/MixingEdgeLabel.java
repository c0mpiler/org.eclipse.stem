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
package org.eclipse.stem.definitions.edges;

import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.modifier.Modifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixing Edge Label</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.stem.definitions.edges.EdgesPackage#getMixingEdgeLabel()
 * @model
 * @generated
 */
public interface MixingEdgeLabel extends EdgeLabel, Modifiable {
	
	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * mixing relationship label type URI.
	 */
	String URI_TYPE_MIXING_RELATIONSHIP_LABEL_SEGMENT = URI_TYPE_LABEL_SEGMENT
			+ "/mixing";
	
	
	/**
	 * Make the current value(s) be MixingEdgeLabelValues
	 **/
	@Override
	MixingEdgeLabelValue getCurrentValue();
	
	/**
	 * Make the current value(s) be MixingEdgeLabelValues
	 **/
	void setCurrentValue(MixingEdgeLabelValue val);
	
} // MixingEdgeLabel
