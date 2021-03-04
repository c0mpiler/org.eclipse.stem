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

import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.impl.AreaLabelImpl;
import org.eclipse.stem.definitions.nodes.impl.RegionImpl;
import org.eclipse.stem.geography.names.ISOKey;
import org.eclipse.stem.internal.data.geography.propertydata.AreaPropertyData;
import org.eclipse.stem.internal.data.propertydata.PropertyData;

/**
 * This class represents a {@link Graph} containing {@link AreaLabel}s of
 * {@link Node}s specific to a country.
 */
public class CountryAreaLabelPropertyFileSpecification extends
		CountryLabelPropertyFileSpecification {

	/**
	 * This is the name used to identify "area" labels.
	 */
	public final static String AREA_LABEL_NAME = "area"; //$NON-NLS-1$

	/**
	 * Constructor
	 */
	public CountryAreaLabelPropertyFileSpecification() {
		super(AREA_LABEL_NAME);
	} // CountryAreaLabelPropertyFileSpecification

	@Override
	protected PropertyData createPropertyDataInstanceFromProperty(
			final String dataPropertyKey, final String propertyValue) {
		return new AreaPropertyData(new ISOKey(dataPropertyKey), propertyValue);
	} // createDataSetData

	@Override
	protected NodeLabel createLabel(final AdminLevel adminLevel,
			final ISOKey isoKey, final PropertyData graphData) {

		final AreaPropertyData areaData = (AreaPropertyData) graphData;
		final String nodeISOKey = areaData.getISOKey().toString();

		final AreaLabel retValue = LabelsFactory.eINSTANCE.createAreaLabel();
		retValue.setURI(AreaLabelImpl.createAreaLabelURI(adminLevel.intValue(),
				isoKey.toString(), nodeISOKey));
		retValue.setURIOfIdentifiableToBeLabeled(RegionImpl
				.createRegionNodeURI(nodeISOKey));
		retValue.getCurrentAreaValue().setArea(
				Double.parseDouble(areaData.getArea()));

		return retValue;
	} // createAreaLabel

} // CountryAreaLabelPropertyFileSpecification