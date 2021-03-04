// PopulationPropertyData.java
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

import org.eclipse.stem.definitions.nodes.GeographicFeature;
import org.eclipse.stem.geography.names.ISOKey;

/**
 * This class contains the data from a property that specifies the number of
 * individuals in a region.
 */
public class PopulationPropertyData extends GeographicFeaturePropertyData {

	// People, mosquitoes, etc.
	String individuals = ""; //$NON-NLS-1$

	/**
	 * @param isoKey
	 *            the unique ISO-3166 identifier for the
	 *            {@link GeographicFeature}.
	 * @param individuals
	 *            the number of individuals
	 */
	public PopulationPropertyData(final ISOKey isoKey, final String individuals) {
		super(isoKey);
		this.individuals = individuals;
	} // AreaData

	/**
	 * @return the number of individuals.
	 */
	public final String getPopulation() {
		return individuals;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return isoKey.toString() + " = " + individuals; //$NON-NLS-1$
	} // toString

	/**
	 * @return the area the population resides in, or <code>null</code>.
	 */
	public String getArea() {
		// TODO Auto-generated method stub
		return null;
	}

} // PopulationPropertyData
