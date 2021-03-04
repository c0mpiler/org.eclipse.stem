
package org.eclipse.stem.definitions.labels.impl;

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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.impl.EdgeImpl;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabel;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Road Transport Relationship Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoadTransportRelationshipLabelImpl extends PhysicalRelationshipLabelImpl implements RoadTransportRelationshipLabel {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoadTransportRelationshipLabelImpl() {
		super();
		setCurrentValue(LabelsFactory.eINSTANCE
				.createRoadTransportRelationshipLabelValue());
	}
	
	/**
	 * Create an edge between two nodes that represents the relationship of
	 * sharing a common border.
	 * 
	 * @param nodeA
	 *            the first node
	 * @param nodeB
	 *            the second node
	 * @param roadName
	 *            the name of the roadway
	 * @param roadClass           
	 *            the class of road (Interstate, route, etc)
	 * @param numCrossings
	 *            the number of times the road crosses between nodeA and nodeB
	 * @return an edge between the two nodes
	 */
	public static Edge createRoadTransportRelationship(final Node nodeA,
			final Node nodeB, final String roadName, final String roadClass, final int numCrossings) {
		final Edge retValue = EdgeImpl.createEdge(nodeA, nodeB);
		final RoadTransportRelationshipLabel label = LabelsFactory.eINSTANCE
				.createRoadTransportRelationshipLabel();
		label.setURIOfIdentifiableToBeLabeled(retValue.getURI());

		final RoadTransportRelationshipLabelValue labelValue = (RoadTransportRelationshipLabelValue) label
				.getCurrentValue();
		labelValue.setRoadName(roadName);
		labelValue.setRoadClass(roadClass);
		labelValue.setNumberCrossings(numCrossings);
		retValue.setLabel(label);

		return retValue;
	} // createCommonBorderRelationship
	
	
	
	/**
	 * @param node
	 *            the node
	 * @param result
	 * 			  result is returned in this array
	 * @generated NOT
	 */
	public static void getRoadEdgesFromNode(final Node node, List<Edge>result) {
	
		if(node == null || node.getEdges() == null) return;
		
		EList<Edge>edges = node.getEdges();
		for(int i=0;i<node.getEdges().size();++i) {
			final Edge edge = edges.get(i);
			final EdgeLabel edgeLabel = edge.getLabel();
			// Is the label a common border label?
			if (edgeLabel instanceof RoadTransportRelationshipLabel) {
				// Yes
				result.add(edge);
			}
		} // for
	} // getCommonBorderEdgesFromNode
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.ROAD_TRANSPORT_RELATIONSHIP_LABEL;
	}

} //RoadTransportRelationshipLabelImpl
