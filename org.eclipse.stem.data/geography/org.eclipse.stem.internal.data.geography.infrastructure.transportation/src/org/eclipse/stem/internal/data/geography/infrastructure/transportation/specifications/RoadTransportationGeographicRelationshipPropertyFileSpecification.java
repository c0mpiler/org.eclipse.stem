// RoadTransportationGeographicRelationshipPropertyFileSpecification.java
package org.eclipse.stem.internal.data.geography.infrastructure.transportation.specifications;

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

import java.text.ParseException;

import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabel;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;
import org.eclipse.stem.internal.data.geography.infrastructure.transportation.propertydata.RoadTransportGeographicRelationshipPropertyData;
import org.eclipse.stem.internal.data.propertydata.PropertyData;
import org.eclipse.stem.internal.data.propertydata.RelationshipPropertyData;

/**
 * This class represents the specification of road transportation between two
 * geographic locations.
 */
public class RoadTransportationGeographicRelationshipPropertyFileSpecification
		extends TransportationGeographicRelationshipPropertyFileSpecification {

	/**
	 * This is the name used to identify "road" edges.
	 */
	public final static String ROAD_TRANSPORTATION_EDGE_NAME = "road"; //$NON-NLS-1$
	
	
	/**
	 * @see org.eclipse.stem.internal.data.specifications.RelationshipGraphPropertyFileSpecification#createEdgeLabel(org.eclipse.stem.internal.data.propertydata.RelationshipPropertyData)
	 */
	@Override
	protected EdgeLabel createEdgeLabel(
			RelationshipPropertyData relationshipGraphData) {

		final RoadTransportGeographicRelationshipPropertyData roadData = (RoadTransportGeographicRelationshipPropertyData) relationshipGraphData;

		final RoadTransportRelationshipLabel retValue = LabelsFactory.eINSTANCE
				.createRoadTransportRelationshipLabel();

		retValue.setURI(createRelationshipEdgeLabelURI(relationshipGraphData));
		final RoadTransportRelationshipLabelValue currentValue = LabelsFactory.eINSTANCE
				.createRoadTransportRelationshipLabelValue();
		currentValue.setRoadName(roadData.getRoadName());
		currentValue.setRoadClass(roadData.getRoadClass());
		currentValue.setNumberCrossings(roadData.getNumCrossings());

		retValue.setCurrentValue(currentValue);

		return retValue;
	} // createEdgeLabel

	/**
	 * @see org.eclipse.stem.internal.data.specifications.RelationshipGraphPropertyFileSpecification#getRelationshipName()
	 */
	@Override
	protected String getRelationshipName() {
		return ROAD_TRANSPORTATION_EDGE_NAME;
	}

	/**
	 * @see org.eclipse.stem.internal.data.specifications.IdentifiablePropertyFileSpecification#createPropertyDataInstanceFromProperty(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	protected PropertyData createPropertyDataInstanceFromProperty(
			String propertyKey, String propertyValue) {
		RoadTransportGeographicRelationshipPropertyData retValue = null;
		try {
			retValue = new RoadTransportGeographicRelationshipPropertyData(propertyKey,propertyValue);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("Key:"+propertyKey+" Value:"+propertyValue);
			System.err.println(e.getMessage());
		}
		return retValue;
	} // createPropertyDataInstanceFromProperty

} // RoadTransportationGeographicRelationshipPropertyFileSpecification