// LatLongDataProvider.java
package org.eclipse.stem.definitions.adapters.spatial.geo;

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

import org.eclipse.emf.common.util.URI;

/**
 * This interface is extended by classes that can interpret a "data uri" as
 * contained in a "stemspatial" URI and return latitude and longitude data from
 * the source specified by the URI. The {@link LatLongProviderAdapter} maintains
 * a static singleton collection of classes that implement this interface. The
 * collection is indexed by the scheme of the URI they handle. It uses this
 * collection to find the appropriate instance for the URI's it encounters that
 * need to be processed. That processing is delegated to classes that extend
 * this interface.
 * <p>
 * Thus, if you extend this interface you should also register an instance of
 * your class with the method
 * {@link LatLongProviderAdapter#registerLatLongDataProvider(String, LatLongDataProvider)}.
 * 
 * @see LatLongProviderAdapter
 */
public interface LatLongDataProvider {

	/**
	 * @param dataURI
	 *            the data URI to be processed by this provider
	 * @return a list of arrays of latitude/longitude pairs.
	 */
	LatLong getLatLong(URI dataURI);

	/**
	 * This method is just like {@link #getLatLong(URI)} except that it will
	 * immediately return with an empty {@link LatLong} instance if the data
	 * identified by the URI has not been retrieved. As a side effect, it will
	 * create a separate {@link org.eclipse.core.runtime.jobs.Job} (i.e.,
	 * <code>Thread</code>) to retrieve the data. If that
	 * {@link org.eclipse.core.runtime.jobs.Job} completes successfully, a
	 * future call will return the appropriate data.
	 * 
	 * @param dataURI
	 *            the data URI to be processed by this provider
	 * @return an instance of latitude/longitude data.
	 */
	LatLong getLatLongNoWait(URI dataURI);

} // LatLongDataProvider
