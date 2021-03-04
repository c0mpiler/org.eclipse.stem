// PhysicalRelationshipLabel.java
package org.eclipse.stem.definitions.labels;

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

import org.eclipse.stem.core.graph.StaticEdgeLabel;

/**
 * This interface is an EMF definition of a class that represents a label for an
 * Edge that represents a physical relationship between two nodes.
 * 
 * @model abstract="true"
 */
public interface PhysicalRelationshipLabel extends StaticEdgeLabel {

	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * relative physical relationship label type URI.
	 */
	String URI_TYPE_PHYSICAL_RELATIONSHIP_LABEL_SEGMENT = URI_TYPE_LABEL_SEGMENT
			+ "/physical";

	// Nothing
} // PhysicalRelationshipLabel
