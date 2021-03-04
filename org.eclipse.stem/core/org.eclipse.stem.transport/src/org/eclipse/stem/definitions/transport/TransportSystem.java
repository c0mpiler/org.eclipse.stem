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

import org.eclipse.stem.core.graph.Node;

/**
 * Node representing the transport system.
 * 
 * @author jlessler
 *
 * @model abstract="true"
 */
public interface TransportSystem extends Node {
	
	/**
	 * 
	 */
	String URI_TYPE_TRANSPORT_SYSTEM_NODE_SEGMENT = URI_TYPE_NODE_SEGMENT
		+ "/transport";
}
