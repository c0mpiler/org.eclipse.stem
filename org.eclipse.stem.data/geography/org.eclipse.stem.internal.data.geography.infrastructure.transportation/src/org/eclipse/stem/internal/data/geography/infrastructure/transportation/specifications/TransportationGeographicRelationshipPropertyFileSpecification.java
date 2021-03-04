// TransportationGeographicRelationshipPropertyFileSpecification.java
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

import org.eclipse.stem.internal.data.geography.specifications.GeographicRelationshipPropertyFileSpecification;

/**
 * This class represents
 */
abstract public class TransportationGeographicRelationshipPropertyFileSpecification
		extends GeographicRelationshipPropertyFileSpecification {

	@Override
	protected String getTargetPluginId() {
		return org.eclipse.stem.data.geography.infrastructure.transportation.Activator.PLUGIN_ID;
	}

} // TransportationGeographicRelationshipPropertyFileSpecification