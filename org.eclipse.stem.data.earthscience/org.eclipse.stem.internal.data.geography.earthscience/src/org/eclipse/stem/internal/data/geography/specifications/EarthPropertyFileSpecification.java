package org.eclipse.stem.internal.data.geography.specifications;

/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.labels.EarthScienceLabel;
import org.eclipse.stem.definitions.labels.EarthScienceLabelValue;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.impl.EarthScienceLabelImpl;
import org.eclipse.stem.definitions.nodes.impl.RegionImpl;
import org.eclipse.stem.geography.names.ISOKey;
import org.eclipse.stem.internal.data.geography.propertydata.EarthSciencePropertyData;
import org.eclipse.stem.internal.data.propertydata.PropertyData;

/**
 * This class represents a {@link Graph} containing {@link EarthScienceLabel}s of
 * {@link Node}s specific to a country.
 */
public class EarthPropertyFileSpecification extends
CountryLabelPropertyFileSpecification {

	public final static String DATATYPE = "DATA_TYPE";
	public final static String DATAUNITS = "UNITS";


	private String dataType;
	private String dataUnits;
	
	private String dataPluginId = "org.eclipse.stem.data.geography.earthscience";

	/**
	 * This is the name used to identify earth science labels.
	 */
	public final static String EARTH_LABEL_NAME = "earthscience"; //$NON-NLS-1$

	/**
	 * Constructor
	 */
	public EarthPropertyFileSpecification() {
		super(EARTH_LABEL_NAME);
	} // EarthPropertyFileSpecification

	@Override
	protected PropertyData createPropertyDataInstanceFromProperty(
			final String dataPropertyKey, final String propertyValue) {

		if(dataPropertyKey.equals(DATATYPE)) 
		{this.dataType = propertyValue;
		if(this.dataType.equals("elevation"))
			this.labelName = EARTH_LABEL_NAME+"_"+dataType;  
		else 
			if(this.getDublinCore().getValid().startsWith("start="))
				this.labelName = EARTH_LABEL_NAME+"_"+this.getDublinCore().getValid().substring(6)+"_"+dataType;
			else
				this.labelName = EARTH_LABEL_NAME+"_"+this.getDublinCore().getValid()+"_"+dataType;
		return null;
		}

		if(dataPropertyKey.equals(DATAUNITS)) 
		{this.dataUnits = propertyValue;return null;}

		return new EarthSciencePropertyData(new ISOKey(dataPropertyKey), propertyValue);
	} // createDataSetData

	/**
	 * 
	 */
	@Override
	protected NodeLabel createLabel(final AdminLevel adminLevel,
			final ISOKey isoKey, final PropertyData graphData) {

		final EarthSciencePropertyData eaData = (EarthSciencePropertyData) graphData;
		final String nodeISOKey = eaData.getISOKey().toString();

		final EarthScienceLabel retValue = LabelsFactory.eINSTANCE.createEarthScienceLabel();
		retValue.setURI(EarthScienceLabelImpl.createEarthScienceLabelURI(adminLevel.intValue(),
				isoKey.toString(), nodeISOKey, dataType));
		retValue.setURIOfIdentifiableToBeLabeled(RegionImpl
				.createRegionNodeURI(nodeISOKey));

		EarthScienceLabelValue value = retValue.getCurrentEarthScienceValue();


		value.setDataType(dataType);
		value.setUnits(dataUnits);
		
		// Parse the dublin core to extract the valid year
		Date validYear = this.getDublinCore().getValidStartDate();
		if(validYear != null) {
			Calendar c = Calendar.getInstance();
			c.setTime(validYear);
			value.setValidYear(c.get(Calendar.YEAR));
		}
		
		StringTokenizer st = new StringTokenizer(eaData.getEarthScienceData(),",");

		int pos = 0;
		while(st.hasMoreTokens()) {
			Double d = Double.parseDouble(st.nextToken());

			switch(pos) {
			case 0: value.getMean().add(d); break;
			case 1: value.getSd().add(d); break;
			case 2: value.getMax().add(d); break;
			case 3: value.getMin().add(d); break;
			case 4: value.getRange().add(d); break;
			case 5: value.getSkewness().add(d); break;
			case 6: value.getKurtosis().add(d); break;
			case 7: value.getRms().add(d); break;
			case 8: value.getMedian().add(d); break;
			case 9: value.getSamplesize().add(d); break;
			}

			if (dataType.equals("elevation")) {
				pos = (pos+1) % 8;  //elevation data does not provide median and samplesize
			} else {
				pos = (pos+1) % 10;
			}
		}

		return retValue;
	} // createAreaLabel

	/**
	 * Returns the plugin for which this file is mapped into
	 */
	protected String getTargetPluginId() {
		if(this.dataType.equals("elevation")) {
			return dataPluginId + ".elevation";
		}
			
		if(this.getDublinCore().getValid().startsWith("start=")) {
				return dataPluginId + "." + this.getDublinCore().getValid().substring(6);
		}
		
		//return org.eclipse.stem.data.geography.earthscience.Activator.PLUGIN_ID;
		return dataPluginId + ".elevation";
	}

} // CountryAreaLabelPropertyFileSpecification