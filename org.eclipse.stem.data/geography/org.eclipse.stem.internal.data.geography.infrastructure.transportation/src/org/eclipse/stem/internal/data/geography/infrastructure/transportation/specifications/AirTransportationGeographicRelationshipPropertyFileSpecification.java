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
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.impl.EdgeImpl;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationship;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.TransportRelationshipLabel;
import org.eclipse.stem.definitions.labels.TransportRelationshipLabelValue;
import org.eclipse.stem.definitions.transport.PipeStyleTransportSystem;
import org.eclipse.stem.definitions.transport.PipeTransportEdge;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabel;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabelValue;
import org.eclipse.stem.definitions.transport.TransportFactory;
import org.eclipse.stem.geography.names.ISOKey;
import org.eclipse.stem.internal.data.geography.infrastructure.transportation.propertydata.AirTransportGeographicRelationshipPropertyData;
import org.eclipse.stem.internal.data.propertydata.PropertyData;
import org.eclipse.stem.internal.data.propertydata.RelationshipPropertyData;

/**
 * This class represents the specification of air transportation 
 */

public class AirTransportationGeographicRelationshipPropertyFileSpecification
		extends TransportationGeographicRelationshipPropertyFileSpecification {

	
	public final static String AIR_TRANSPORT_PATTERN = "transport/pipe";
	public final static String AIR_TRANSPORT_SYSTEM = "(S)";
	/**
	 * This is the name used to identify "air" edges.
	 */
	public final static String AIR_TRANSPORTATION_EDGE_NAME = "air"; //$NON-NLS-1$
	

	/** Key defining the mode of transport */
	public static final String TRANSPORTATION_MODE_PROPERTY = "TRANSPORT_MODE"; //$NON-NLS-1$

	/** Key defining the type of population transported by this network */
	public static final String POPULATION_ID_PROPERTY = "POPULATION_IDENTIFIER"; //$NON-NLS-1$

	/** The property specifying the time period rates are defined over */
	public static final String RATE_TIME_PERIOD_PROPERTY = "RATE_TIME_PERIOD"; //$NON-NLS-1$

	/** The property specifying the average time someone spends in the network */
	public static final String AVG_TIME_IN_SYSTEM_PROPERTY = "AVG_TIME_IN_SYSTEM"; //$NON-NLS-1$

	private String transportationMode;
	private String populationIdentifier;
	private int rateTimePeriod; // in milliseconds
	@SuppressWarnings("unused")
	private double averageTimeInSystem;
	
	/**
	 * @param properties
	 *            the set of properties that specify the {@link Identifiable}
	 *            
	 * @override
	 */
	@Override
	protected void collectPropertyDataSet(final Properties properties) {
		// This will set the properties in this instance and also remove the
		// non-data properties from the set such as the dublin core properties
		// and the RECORD_CLASSNAME_PROPERTY
		collectNonDataProperties(properties);

		// Collect air transportation unique properties
		transportationMode = properties.getProperty(
				TRANSPORTATION_MODE_PROPERTY).trim();
		populationIdentifier = properties.getProperty(
				POPULATION_ID_PROPERTY).trim();
		rateTimePeriod = Integer.parseInt(properties.getProperty(
				RATE_TIME_PERIOD_PROPERTY).trim());
		averageTimeInSystem = Double.parseDouble(properties.getProperty(
				AVG_TIME_IN_SYSTEM_PROPERTY).trim());

		properties.remove(TRANSPORTATION_MODE_PROPERTY);
		properties.remove(POPULATION_ID_PROPERTY);
		properties.remove(RATE_TIME_PERIOD_PROPERTY);
		properties.remove(AVG_TIME_IN_SYSTEM_PROPERTY);
		
		// Now we process the data entries and create the data set
		for (final Entry<Object, Object> entry : properties.entrySet()) {
			final String dataPropertyKey = (String) entry.getKey();

			final PropertyData data = createPropertyDataInstanceFromProperty(
					dataPropertyKey, ((String) entry.getValue()).trim());
			// Did we get null because of some error?
			if (data != null) {
				// No
				propertyDataSet.add(data);
			}
		} // for each property
	} // collectPropertyDataSet
	
	/**
	 * @see org.eclipse.stem.internal.data.specifications.RelationshipGraphPropertyFileSpecification#createEdgeLabel(org.eclipse.stem.internal.data.propertydata.RelationshipPropertyData)
	 */
	@Override
	protected EdgeLabel createEdgeLabel(
			RelationshipPropertyData relationshipGraphData) {

		final AirTransportGeographicRelationshipPropertyData airData = (AirTransportGeographicRelationshipPropertyData) relationshipGraphData;

		final TransportRelationshipLabel retValue = LabelsFactory.eINSTANCE
				.createTransportRelationshipLabel();

		retValue.setURI(createRelationshipEdgeLabelURI(relationshipGraphData));
		final TransportRelationshipLabelValue currentValue = LabelsFactory.eINSTANCE
				.createTransportRelationshipLabelValue();
		currentValue.setAvailableDepartureCapacityProportion(airData.getArrivalRate()); // TODo, what is this?

		retValue.setCurrentValue(currentValue);
		return retValue;
	} // createEdgeLabel

	/**
	 * @see org.eclipse.stem.internal.data.specifications.RelationshipGraphPropertyFileSpecification#getRelationshipName()
	 */
	@Override
	protected String getRelationshipName() {
		return AIR_TRANSPORTATION_EDGE_NAME;
	}

   
	/**
	 * @see org.eclipse.stem.internal.data.specifications.IdentifiablePropertyFileSpecification#createPropertyDataInstanceFromProperty(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	protected PropertyData createPropertyDataInstanceFromProperty(
			String propertyKey, String propertyValue) {
		AirTransportGeographicRelationshipPropertyData retValue = null;
		try {
			retValue = new AirTransportGeographicRelationshipPropertyData(propertyKey,propertyValue);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("Key:"+propertyKey+" Value:"+propertyValue); //$NON-NLS-1$ //$NON-NLS-2$
			System.err.println(e.getMessage());
		}
		return retValue;
	} // createPropertyDataInstanceFromProperty

	/**
	 *  Populate the air transport in graph
	 * @override
	 */
	@Override
	protected void initializeIdentifiableFromPropertyDataSet(
			Identifiable identifiable, List<PropertyData> propertyDataSet) {
		final Graph graph = (Graph)identifiable;

		// Hash map to collect transport system nodes
		// The key is the ISO Key for the transport system level.
		final HashMap<ISOKey, PipeStyleTransportSystem> transportSystemNodes = new HashMap<ISOKey, PipeStyleTransportSystem>();

		final HashMap<ISOKey, Double> transportSystemMaxCapacity = getTransportSystemCapacity(propertyDataSet);
		
		List<PropertyData>dataSet = propertyDataSet;
				
		// Process each of the data set records, each one contains two ISOKeys,
		// the first one (enclosing) is the key that matches the transportation
		// system, the second one is the key of the region the transportation
		// system connects to so that population members can move in and out of
		// the region. The second key also represents a transportation 
		// system so that people can move in and out of those when the model
		// has lower level regions. The for loop goes through each record, creating the
		// transportation system for the first ISO key if it doesn't exist and
		// then the "migration" edges that connect it to the region and air transport system
		for (final PropertyData dataSetData : dataSet) {
			final AirTransportGeographicRelationshipPropertyData pipeTransportData = (AirTransportGeographicRelationshipPropertyData) dataSetData;

			// Get the transportation system node, creating it if necessary
			PipeStyleTransportSystem transportSystem = transportSystemNodes
					.get(pipeTransportData.getTransportationSystemISOKey());

			// Does a transportation system exist for the enclosing node?
			if (transportSystem == null) {
				// No
				// Make one then...
				ISOKey newSystemKey = pipeTransportData.getTransportationSystemISOKey();
				double maxCapacity = transportSystemMaxCapacity.get(newSystemKey);
				
				transportSystem = createTransportSystem(newSystemKey, 0, maxCapacity);
				
				// ...put it in the map
				transportSystemNodes.put(newSystemKey, transportSystem);
				// ...and the graph
				graph.putNode(transportSystem);

				// The region contains the air transport system
				//graph.putEdge(createContainmentEdge(pipeTransportData,
				//		transportSystem));
			} // if a transport system exists

			// The URI of the region node that the transportation system will
			// migrate population members to and from.
			final org.eclipse.emf.common.util.URI regionNodeURI = createNodeURI(pipeTransportData
					.getTransportationSystemISOKey(), pipeTransportData
					.getRegionISOKey());

			// Population migrates into the network from the air transport system at the rate of departure
			// rate/air transport system population
			final double fromNodeMaxFlow = pipeTransportData.getDepartureRate();

			// Population migrates into the network from the air transport system  at the rate of departure
			// rate/air transport system population
			final double toNodeMaxFlow = pipeTransportData.getArrivalRate();

			// The migration edge from the region to the transportation system
			PipeTransportEdge fromEdge = createPipeTransportEdge(
					regionNodeURI, transportSystem.getURI(),
					fromNodeMaxFlow, pipeTransportData);
			graph.putEdge(fromEdge);
			
			// The migration edge to the region from the transportation system
			PipeTransportEdge toEdge = createPipeTransportEdge(
					transportSystem.getURI(), regionNodeURI,
					toNodeMaxFlow, pipeTransportData);
			graph.putEdge(toEdge);
			
			// Now create edges to the lower level transportation system. It might now
			// exist, but such dangling edges will be removed eventually
			
			final org.eclipse.emf.common.util.URI transportNodeURI = createTransportSystemURI(pipeTransportData.getRegionISOKey());
			fromEdge = createPipeTransportEdge(
					transportNodeURI, transportSystem.getURI(),
					fromNodeMaxFlow, pipeTransportData);
			graph.putEdge(fromEdge);
			
			toEdge = createPipeTransportEdge(
					transportSystem.getURI(), transportNodeURI,
					toNodeMaxFlow, pipeTransportData);
			graph.putEdge(toEdge);
		} // for each data set record
	} // populateFromNonDataProperties
	
	protected HashMap<ISOKey, Double> getTransportSystemCapacity(List<PropertyData> propertyDataSet) {
		HashMap<ISOKey, Double> result = new HashMap<ISOKey, Double>();
		
		for (final PropertyData dataSetData : propertyDataSet) {
			final AirTransportGeographicRelationshipPropertyData pipeTransportData = (AirTransportGeographicRelationshipPropertyData) dataSetData;
			ISOKey tskey = pipeTransportData.getTransportationSystemISOKey();
			double rate = (pipeTransportData.getArrivalRate() + pipeTransportData.getDepartureRate()) / 2;
			
			if(result.containsKey(tskey)) {
				result.put(tskey, result.get(tskey)+rate);
			} else result.put(tskey, rate);
		}
		return result;
	}
		
	/** Need to create the central node for the pipe-style network */
	protected PipeStyleTransportSystem createTransportSystem(
			final ISOKey systemISOKey, final double startingPop, final double maxCapacity) {
		// Create the central node
		final PipeStyleTransportSystem retValue = TransportFactory.eINSTANCE
				.createPipeStyleTransportSystem();

		// Set properties. e.g. the identifier, etc.
		// The URI
		final String uriString = PipeStyleTransportSystem.URI_TYPE_PIPE_STYLE_TRANSPORT_SYSTEM
				+ "/" + systemISOKey.toString(); //$NON-NLS-1$
		retValue.setURI(STEMURI.createURI(uriString));

		// The population label
		final PopulationLabel populationLabel = LabelsFactory.eINSTANCE
				.createPopulationLabel();
		populationLabel.setPopulationIdentifier(getPopulationIdentifier());
		populationLabel.getCurrentPopulationValue().setCount(startingPop);
		populationLabel.setIdentifiable(retValue);
		populationLabel.setPopulatedArea(1.0);
		populationLabel.setURI(STEMURI.createURI(PopulationLabel.URI_TYPE_POPULATION_LABEL_SEGMENT+"/"+getPopulationIdentifier()+"/"+systemISOKey));
		retValue.getLabels().add(populationLabel);

		retValue.setMaxCapacity(maxCapacity);
		return retValue;
	} // createTransportSystem
	
	protected URI createTransportSystemURI(
			final ISOKey systemISOKey) {
		// Set properties. e.g. the identifier, etc.
		// The URI
		final String uriString = PipeStyleTransportSystem.URI_TYPE_PIPE_STYLE_TRANSPORT_SYSTEM
				+ "/" + systemISOKey.toString(); //$NON-NLS-1$
		URI result = STEMURI.createURI(uriString);
		return result;
	}
	/**
	 * @return the population identifier
	 */
	public final String getPopulationIdentifier() {
		return populationIdentifier;
	}

	
	private PipeTransportEdge createPipeTransportEdge(final org.eclipse.emf.common.util.URI fromURI,
			final org.eclipse.emf.common.util.URI toURI, final double maxFlow, AirTransportGeographicRelationshipPropertyData propertyData) {
		final PipeTransportEdge edge = TransportFactory.eINSTANCE.createPipeTransportEdge();
		edge.setNodeAURI(fromURI);
		edge.setNodeBURI(toURI);

		edge.setURI(createRelationshipEdgeURI(propertyData, fromURI, toURI));
		PipeTransportEdgeLabel label =  TransportFactory.eINSTANCE.createPipeTransportEdgeLabel();
		PipeTransportEdgeLabelValue labelval =  TransportFactory.eINSTANCE.createPipeTransportEdgeLabelValue();
		label.setURI(createRelationshipEdgeLabelURI(propertyData, fromURI, toURI));
		labelval.setMaxFlow(maxFlow);
		labelval.setTimePeriod(this.rateTimePeriod);
		label.setCurrentValue(labelval);
		edge.setLabel(label);

		return edge;
	} // createMigrationEdge
	
	private URI createRelationshipURI(String segment,
			AirTransportGeographicRelationshipPropertyData propertyData,
			URI fromURI, URI toURI) {
		// final GeographicRelationshipPropertyData geoRelationshipPropertyData = (GeographicRelationshipPropertyData) propertyData;
		final StringBuilder sb = new StringBuilder(segment);
		sb.append("/"); //$NON-NLS-1$
		sb.append("relationship"); //$NON-NLS-1$
		sb.append("/"); //$NON-NLS-1$
		sb.append(getRelationshipName());
		sb.append("/"); //$NON-NLS-1$
		String first = fromURI.toString().contains(AIR_TRANSPORT_PATTERN) ? AIR_TRANSPORT_SYSTEM+fromURI.lastSegment() : fromURI.lastSegment();
		sb.append(first);
		sb.append("_"); //$NON-NLS-1$
		String second = toURI.toString().contains(AIR_TRANSPORT_PATTERN) ? AIR_TRANSPORT_SYSTEM+toURI.lastSegment() : toURI.lastSegment();
		sb.append(second);
		sb.append(getRelationshipSpecifier(propertyData));

		return STEMURI.createURI(sb.toString());
	}

	private URI createRelationshipEdgeLabelURI(	AirTransportGeographicRelationshipPropertyData propertyData,
			URI fromURI, URI toURI) {
		return createRelationshipURI("label", propertyData, fromURI, toURI);
	}
	private URI createRelationshipEdgeURI(
			AirTransportGeographicRelationshipPropertyData propertyData,
			URI fromURI, URI toURI) {
		return createRelationshipURI("edge", propertyData, fromURI, toURI);
	}

	/**
	 * 
	 * @param pipeTransportData
	 * @param transportSystem
	 * @return
	 */
	@SuppressWarnings("unused")
	private Edge createContainmentEdge(
			final AirTransportGeographicRelationshipPropertyData pipeTransportData,
			final PipeStyleTransportSystem transportSystem) {
		final Edge retValue = EdgeImpl.createEdge(createNodeURI(isoKeyB,
				pipeTransportData.getTransportationSystemISOKey()), transportSystem
				.getURI(), true);

		final RelativePhysicalRelationshipLabel containLabel = LabelsFactory.eINSTANCE
				.createRelativePhysicalRelationshipLabel();

		containLabel.setURIOfIdentifiableToBeLabeled(retValue.getURI());
		containLabel.getCurrentRelationship().setRelationship(
				RelativePhysicalRelationship.CONTAINS_LITERAL);

		final RelativePhysicalRelationshipLabelValue currentValue = LabelsFactory.eINSTANCE
				.createRelativePhysicalRelationshipLabelValue();
		currentValue.setAdjacent(false);
		currentValue
				.setRelationship(RelativePhysicalRelationship.CONTAINS_LITERAL);
		containLabel.setCurrentValue(currentValue);

		// create the uri;
		final StringBuilder sb = new StringBuilder(
				"edge/relationship/relativephysical/"); //$NON-NLS-1$
		sb.append(pipeTransportData.getTransportationSystemISOKey());
		sb.append("_"); //$NON-NLS-1$
		sb.append(pipeTransportData.getTransportationSystemISOKey());
		sb.append("-"); //$NON-NLS-1$
		sb.append(transportationMode);
		sb.append("/"); //$NON-NLS-1$
		sb.append(RelativePhysicalRelationship.CONTAINS_LITERAL.toString()
				.toLowerCase());

		retValue.setURI(STEMURI.createURI(sb.toString()));
		containLabel.setURI(STEMURI.createURI(sb.toString()));
		retValue.setLabel(containLabel);
		containLabel.setURIOfIdentifiableToBeLabeled(retValue.getURI());
		return retValue;
	} // createContainmentEdge
	
} // AirTransportationGeographicRelationshipPropertyFileSpecification