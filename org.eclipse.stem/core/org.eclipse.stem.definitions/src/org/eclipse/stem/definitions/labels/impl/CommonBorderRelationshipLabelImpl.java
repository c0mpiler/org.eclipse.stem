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
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabel;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.LabelsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Common Border Relationship Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommonBorderRelationshipLabelImpl extends
		PhysicalRelationshipLabelImpl implements CommonBorderRelationshipLabel {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected CommonBorderRelationshipLabelImpl() {
		super();
		setCurrentValue(LabelsFactory.eINSTANCE
				.createCommonBorderRelationshipLabelValue());
	} // CommonBorderRelationshipLabelImpl

	/**
	 * Create an edge between two nodes that represents the relationship of
	 * sharing a common border.
	 * 
	 * @param nodeA
	 *            the first node
	 * @param nodeB
	 *            the second node
	 * @param borderLength
	 *            the length of the border (km's)
	 * @return an edge between the two nodes
	 */
	public static Edge createCommonBorderRelationship(final Node nodeA,
			final Node nodeB, final double borderLength) {
		final Edge retValue = EdgeImpl.createEdge(nodeA, nodeB);
		final CommonBorderRelationshipLabel label = LabelsFactory.eINSTANCE
				.createCommonBorderRelationshipLabel();
		label.setURIOfIdentifiableToBeLabeled(retValue.getURI());

		final CommonBorderRelationshipLabelValue labelValue = (CommonBorderRelationshipLabelValue) label
				.getCurrentValue();
		labelValue.setBorderLength(borderLength);

		retValue.setLabel(label);

		return retValue;
	} // createCommonBorderRelationship

	/**
	 * @param node
	 *            the node
	 * @return the Edges that represent the common border relationship between
	 *         the node and other nodes.
	 */
	public static void getCommonBorderEdgesFromNode(final Node node, List<Edge>result) {

		if(node == null || node.getEdges() == null) return;
		
		EList<Edge>cEdges = node.getEdges();
		for(int i=0;i<cEdges.size();++i) {
			final Edge edge = cEdges.get(i);
			final EdgeLabel edgeLabel = edge.getLabel();
			// Is the label a common border label?
			if (edgeLabel instanceof CommonBorderRelationshipLabel) {
				// Yes
				result.add(edge);
			}
		} // for

	} // getCommonBorderEdgesFromNode

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.COMMON_BORDER_RELATIONSHIP_LABEL;
	}

} // CommonBorderRelationshipLabelImpl
