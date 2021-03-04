package org.eclipse.stem.definitions.edges.impl;

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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.impl.EdgeLabelImpl;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabel;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migration Edge Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MigrationEdgeLabelImpl extends EdgeLabelImpl implements MigrationEdgeLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected MigrationEdgeLabelImpl() {
		super();
		setCurrentValue(EdgesFactory.eINSTANCE.createMigrationEdgeLabelValue());
	}

	/**
	 * @param node
	 *            the node
	 * @return the Edges that represent the common border relationship between
	 *         the node and other nodes.
	 */
	public static List<Edge> getMigrationEdgesFromNode(final Node node) {
		final List<Edge> retValue = new ArrayList<Edge>();

		for (Iterator<Edge> edgeIter = node.getEdges().iterator(); edgeIter.hasNext();) {
			final Edge edge = edgeIter.next();
			final EdgeLabel edgeLabel = edge.getLabel();
			// Is the label a migrationEdge label?
			if (edgeLabel instanceof MigrationEdgeLabel) {
				// Yes
				retValue.add(edge);
			}
		} // for

		return retValue;
	} // getMigrationEdgesFromNode
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdgesPackage.Literals.MIGRATION_EDGE_LABEL;
	}
	
	/**
	 * Make the current value stuff have to be MixingEdgeLabelValues
	 */
	@Override
	public MigrationEdgeLabelValue getCurrentValue() {
		return((MigrationEdgeLabelValue)super.getCurrentValue());
	}
	
	@Override
	public void setCurrentValue(MigrationEdgeLabelValue val) {
		super.setCurrentValue(val);
	}

} //MigrationEdgeLabelImpl
