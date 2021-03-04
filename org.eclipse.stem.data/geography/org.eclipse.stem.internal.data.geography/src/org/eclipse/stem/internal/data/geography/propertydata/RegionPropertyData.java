// RegionPropertyData.java
package org.eclipse.stem.internal.data.geography.propertydata;

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

import org.eclipse.stem.geography.names.ISOKey;

/**
 * This class contains the data from a property that specifies a single
 * {@link Region}.
 */
public class RegionPropertyData extends GeographicFeaturePropertyData {

	/**
	 * The name of the region.
	 */
	String regionName = null;

	/**
	 * @param isoKey
	 *            the unique ISO-3166 identifier for the {@link Region}.
	 * @param regionName
	 *            the name of the {@link Region}.
	 * 
	 */
	public RegionPropertyData(final ISOKey isoKey,
			final String regionName) {
		super(isoKey);
		this.regionName = regionName;
	} // NodeData

	/**
	 * @return the name of the {@link Region}.
	 */
	public final String getName() {
		return regionName;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(regionName);
		sb.append(" ("); //$NON-NLS-1$
		sb.append(isoKey.toString());
		sb.append(")"); //$NON-NLS-1$
		return sb.toString();
	}

} // RegionPropertyData
