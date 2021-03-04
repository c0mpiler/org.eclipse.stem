package org.eclipse.stem.internal.data.geography.specifications;

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

import java.util.Properties;

import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.impl.PopulationLabelImpl;
import org.eclipse.stem.definitions.nodes.impl.RegionImpl;
import org.eclipse.stem.geography.names.ISOKey;
import org.eclipse.stem.internal.data.geography.propertydata.PopulationPropertyData;
import org.eclipse.stem.internal.data.propertydata.PropertyData;

/**
 * This class represents a {@link Graph} containing {@link PopulationLabel}s of
 * {@link Node}s specific to a country.
 */
public class CountryPopulationLabelPropertyFileSpecification extends
		CountryLabelPropertyFileSpecification {
	/**
	 * This is the name used to identify "population" labels.
	 */
	public static final String POPULATION_LABEL_NAME = "population"; //$NON-NLS-1$

	/**
	 * This is the property in a data file that specifies an identifier for the
	 * population (e.g., "human")
	 */
	public static final String POPULATION_PROPERTY = "POPULATION"; //$NON-NLS-1$

	/**
	 * This is the property in a data file that specifies the year the
	 * population data is valid for.
	 */
	private static final String YEAR_PROPERTY = "YEAR"; //$NON-NLS-1$

	/**
	 * This is the identifier of the population.
	 * 
	 * @see CountryPopulationLabelPropertyFileSpecification#POPULATION_PROPERTY
	 */
	private String populationIdentifier = null;

	/**
	 * The year the population data is valid for.
	 */
	private String year;

	/**
	 * Constructor
	 */
	public CountryPopulationLabelPropertyFileSpecification() {
		super(POPULATION_LABEL_NAME);
	} // CountryPopulationLabelPropertyFileSpecification

	@Override
	protected PropertyData createPropertyDataInstanceFromProperty(
			final String dataPropertyKey, final String propertyValue) {
		return new PopulationPropertyData(new ISOKey(dataPropertyKey),
				propertyValue);
	} // createDataSetData

	/**
	 * @see org.eclipse.stem.internal.data.geography.specifications.CountryGraphPropertyFileSpecification#collectNonDataProperties(java.util.Properties)
	 */
	@Override
	protected void collectNonDataProperties(final Properties dataSetProperties) {
		super.collectNonDataProperties(dataSetProperties);
		populationIdentifier = dataSetProperties
				.getProperty(POPULATION_PROPERTY);
		year = dataSetProperties.getProperty(YEAR_PROPERTY);
		dataSetProperties.remove(POPULATION_PROPERTY);
		dataSetProperties.remove(YEAR_PROPERTY);
	} // initialize

	@Override
	protected NodeLabel createLabel(final AdminLevel adminLevel,
			final ISOKey isoKey, final PropertyData graphData) {
		final PopulationPropertyData populationData = (PopulationPropertyData) graphData;
		final String nodeKey = populationData.getISOKey().toString();

		final PopulationLabel retValue = LabelsFactory.eINSTANCE
				.createPopulationLabel();
		retValue.setURI(PopulationLabelImpl.createPopulationLabelURI(adminLevel
				.intValue(), isoKey.toString(), populationIdentifier, year,
				nodeKey));
		retValue.setValidYear(Integer.parseInt(year));
		retValue.setURIOfIdentifiableToBeLabeled(RegionImpl
				.createRegionNodeURI(nodeKey));
		retValue.setPopulationIdentifier(populationIdentifier);
		retValue.getCurrentPopulationValue().setCount(
				Long.parseLong(populationData.getPopulation()));
	
		// Was an area specified for the population?
		if (populationData.getArea() != null) {
			// Yes
			retValue.setPopulatedArea(Double.parseDouble(populationData
					.getArea()));
		}

		return retValue;
	} // createLabel

	@Override
	protected String getTargetPluginId() {
		return org.eclipse.stem.data.geography.population.human.Activator.PLUGIN_ID;
	}
	
	@Override
	protected String getSerializationFileNameRoot() {
		final StringBuilder sb = new StringBuilder(isoKey.toString());
		sb.append("_"); //$NON-NLS-1$
		sb.append(adminLevel.toString());
		sb.append("_"); //$NON-NLS-1$
		sb.append(getSerializationContentDescriptor());
		sb.append("_"); //$NON-NLS-1$
		sb.append(labelName.toLowerCase());
		return sb.toString();
	} // getSerializationFileNameRoot

	protected String getSerializationContentDescriptor() {
		final StringBuilder sb = new StringBuilder();
		sb.append(populationIdentifier);
		sb.append("_"); //$NON-NLS-1$
		sb.append(createValidDateRangeString(
				SERIALIZATION_CONTENT_DESCRIPTOR_DATE_FORMATER,
				SERIALIZATION_DATE_RANGE_FORMAT_1_DATE,
				SERIALIZATION_DATE_RANGE_FORMAT_2_DATES,
				SERIALIZATION_DATE_RANGE_FORMAT_1_DATE_YEAR));
		return sb.toString();
	} // getSerializationContentDescriptor

} // CountryPopulationLabelPropertyFileSpecification