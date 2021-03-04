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
package org.eclipse.stem.loggers.imagewriter.logger;

import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapter;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapterFactory;
import org.eclipse.stem.ui.views.geographic.map.StemPolygonsList;

public class Utils {
	public static StemPolygonsList getPolygonsForDecorator(Decorator decorator) {

		StemPolygonsList retValue = null;
		//LatLongProviderAdapter latLongProvider = null;

		DynamicNodeLabel nodeLabel = null;
		if (decorator != null) {
			retValue = new StemPolygonsList();
			for (DynamicLabel obj : decorator.getLabelsToUpdate()) {
				if (obj instanceof DynamicNodeLabel) {
					nodeLabel = (DynamicNodeLabel) obj;

					LatLongProviderAdapter latLongProvider = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE
								.adapt(nodeLabel.getIdentifiable(), LatLongProvider.class);
					LatLong latLong = latLongProvider.getLatLong();
	
					// Any lat/long data for this label?
					if (latLong.size() > 0) {
						// adding it to the list of polygons to be drawn
						retValue.addAll(new StemPolygonsList(latLong, nodeLabel
								.getIdentifiable()));
					} // if Any lat/long data for this label
				}
			}

		}

		return retValue;

	}

}
