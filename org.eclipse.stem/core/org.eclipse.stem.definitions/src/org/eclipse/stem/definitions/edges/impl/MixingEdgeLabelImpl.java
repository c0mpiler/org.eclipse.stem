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
package org.eclipse.stem.definitions.edges.impl;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.impl.EdgeLabelImpl;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.MixingEdge;
import org.eclipse.stem.definitions.edges.MixingEdgeLabel;
import org.eclipse.stem.definitions.edges.MixingEdgeLabelValue;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mixing Edge Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MixingEdgeLabelImpl extends EdgeLabelImpl implements MixingEdgeLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected MixingEdgeLabelImpl() {
		super();
		setCurrentValue(EdgesFactory.eINSTANCE.createMixingEdgeLabelValue());
	}

	/**
	 * @param node
	 *            the node
	 * @param populationIdentifier
	 *            the identifier that must match the population identifier of the mixing edge
	 * @param returnArray. Results goes into this, the Edges that represent the mixing edge relationship between
	 *         the node and other nodes.
	 */
	public static void getMixingEdgesFromNode(final Node node, String populationIdentifier, List<Edge>returnArray) {
	
		for (Iterator<Edge> edgeIter = node.getEdges().iterator(); edgeIter.hasNext();) {
			final Edge edge = edgeIter.next();
			// Is the label a mixingEdge label?
			if (edge instanceof MixingEdge && ((MixingEdge)edge).getPopulationIdentifier().equals(populationIdentifier)) 
				// Yes
				returnArray.add(edge);
			
		} // for
	} // getMixingEdgesFromNode
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdgesPackage.Literals.MIXING_EDGE_LABEL;
	}


	
	/**
	 * Make the current value stuff have to be MixingEdgeLabelValues
	 */
	@Override
	public MixingEdgeLabelValue getCurrentValue() {
		return((MixingEdgeLabelValue)super.getCurrentValue());
	}
	
	@Override
	public void setCurrentValue(MixingEdgeLabelValue val) {
		super.setCurrentValue(val);
	}
	
} //MixingEdgeLabelImpl
