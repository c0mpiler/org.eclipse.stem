package org.eclipse.stem.definitions.transport;

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

import org.eclipse.stem.definitions.edges.PopulationEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe Transport Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.stem.definitions.transport.TransportPackage#getPipeTransportEdge()
 * @model
 * @generated
 */
public interface PipeTransportEdge extends PopulationEdge {
	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * pipe transport edge URI.
	 */
	public String URI_TYPE_PIPE_TRANSPORT_EDGE_SEGMENT = URI_TYPE_EDGE_SEGMENT + "/pipetransport";

} // PipeTransportEdge
