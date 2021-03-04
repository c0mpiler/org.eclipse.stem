// Node.java
package org.eclipse.stem.core.graph;

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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.common.Identifiable;

/**
 * A <code>Node</code> represents a real or abstract entity.
 * <p>
 * A <code>Node</code> can have "attributes". The attributes are represented
 * by zero or more {@link NodeLabel}s.
 * </p>
 * <p>
 * A <code>Node</code> can have zero or more "relationships" with one or more
 * other <code>Node</code>s. These relationships can be with the same
 * <code>Node</code> or with multiple different <code>Node</code>s. A
 * single relationship is represented by an {@link Edge}.
 * </p>
 * 
 * @see Edge
 * @see Label
 * @see NodeLabel
 * @see Graph
 * 
 * @model
 */
public interface Node extends Identifiable {

	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * node type URI.
	 */
	String URI_TYPE_NODE_SEGMENT = "node";

	// /**
	// * This is the type URI for area labels
	// */
	// URI URI_TYPE_GEOGRAPHIC_FEATURE_NODE = STEMURI
	// .createTypeURI(URI_TYPE_NODE_SEGMENT);

	/**
	 * @return the {@link Edge}s that represent the relationships of this
	 *         <code>Node</code>.
	 * @model type="Edge" containment="false"
	 */
	EList<Edge> getEdges();

	/**
	 * the {@link Label}s that represent attributes of this <code>Node</code>.
	 * 
	 * @model type="NodeLabel" containment="false" opposite="node"
	 */
	EList<NodeLabel> getLabels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Label getLabel(EClass class_, EAttribute attribute, Object attributeValue);

} // Node
