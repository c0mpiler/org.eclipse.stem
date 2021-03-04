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

import java.util.List;

import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.geography.names.ISOKey;
import org.eclipse.stem.internal.data.propertydata.PropertyData;

/**
 * This class represents a {@link Graph} containing
 * {@link org.eclipse.stem.core.graph.Label}s of {@link Node}s specific to a
 * country.
 */
abstract public class CountryLabelPropertyFileSpecification extends
		CountryGraphPropertyFileSpecification {

	/**
	 * The identifier that names the type of label (e.g., "population").
	 */
	protected String labelName = null;

	/**
	 * @param labelName
	 *            the identifier that names the type of label (e.g.,
	 *            "population")
	 */
	protected CountryLabelPropertyFileSpecification(final String labelName) {
		super();
		this.labelName = labelName;
	} // CountryLabelPropertyFileSpecification

	/**
	 * @see org.eclipse.stem.internal.data.geography.specifications.CountryGraphPropertyFileSpecification#initializeIdentifiableFromPropertyDataSet(Identifiable,
	 *      List)
	 */
	@Override
	protected void initializeIdentifiableFromPropertyDataSet(
			final Identifiable identifiable,
			final List<PropertyData> propertyDataSet) {
		final Graph graph = (Graph) identifiable;
		for (final PropertyData propertyData : propertyDataSet) {
			graph.putNodeLabel(createLabel(adminLevel, isoKey, propertyData));
		} // for each node data
	} // populateFromDataSet

	/**
	 * @param adminLevel
	 *            the level of the country node the area label labels
	 * @param isoKey
	 *            the ISO-3166 based key of the country to which the labeled
	 *            node belongs
	 * @param graphData
	 *            the data to use to create the {@link NodeLabel}
	 * @return an {@link NodeLabel}
	 */
	abstract protected NodeLabel createLabel(final AdminLevel adminLevel,
			final ISOKey isoKey, final PropertyData graphData);
	
	@Override
	protected String getSerializationFileNameRoot() {
		final StringBuilder sb = new StringBuilder(isoKey.toString());
		sb.append("_"); //$NON-NLS-1$
		sb.append(adminLevel.toString());
		sb.append("_"); //$NON-NLS-1$
		sb.append(labelName);
		return sb.toString();
	}

	@Override
	public String getTitleDescriptor() {
		final StringBuilder sb = new StringBuilder(isoKey.toString());
		sb.append(" ("); //$NON-NLS-1$
		sb.append(adminLevel.toString());
		sb.append(") "); //$NON-NLS-1$
		sb.append(labelName);
		return sb.toString();
	} // getTitleDescriptor

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(super.toString());
		sb.append(" "); //$NON-NLS-1$
		sb.append(labelName);
		return sb.toString();
	} // toString

	/**
	 * @see org.eclipse.stem.internal.data.specifications.IdentifiableSpecification#createDubinCoreSubject()
	 */
	@Override
	protected String createDubinCoreSubject() {
		return createDublinCoreSubjectString(GraphPackage.Literals.LABEL
				.getName(), labelName);
	} // createDubinCoreSubject
	
} // CountryLabelPropertyFileSpecification
