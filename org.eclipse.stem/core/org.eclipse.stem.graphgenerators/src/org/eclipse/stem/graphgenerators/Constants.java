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
package org.eclipse.stem.graphgenerators;


public interface Constants {
	/**
	 * This is the extension point id for the "graph generator" extension point. 
	 * {@value}
	 */
	String ID_GRAPH_GENERATOR_EXTENSION_POINT = org.eclipse.stem.core.Constants.ID_ROOT
	+ ".graphgenerators.graphgenerator";

	String GRAPH_GENERATOR_ELEMENT = "classdef";
}