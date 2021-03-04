package org.eclipse.stem.definitions.edges;

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

import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.modifier.Modifiable;


/**
 * Defines a directed edge that represents migration between two nodes.
 * Migration denotes movement of the population between two nodes (i.e., the
 * home node of migrating population changes).
 * 
 * @author jlessler
 * @model
 */

public interface MigrationEdgeLabel extends EdgeLabel, Modifiable {
	
	
	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * migration relationship label type URI.
	 */
	String URI_TYPE_MIGRATION_RELATIONSHIP_LABEL_SEGMENT = URI_TYPE_LABEL_SEGMENT
			+ "/migration";
	
	
	/**
	 * Make the current value(s) be MigrationEdgeLabelValues
	 **/
	@Override
	MigrationEdgeLabelValue getCurrentValue();
	
	/**
	 * Make the current value(s) be MigrationEdgeLabelValues
	 **/
	void setCurrentValue(MigrationEdgeLabelValue val);
		
}
