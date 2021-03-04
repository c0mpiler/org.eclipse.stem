package org.eclipse.stem.internal.data.geography;

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

import java.io.File;

import org.eclipse.stem.internal.data.DataGenerator;

/**
 * This class is the Main entry point to the generation of
 * {@link org.eclipse.stem.core.graph.Graph}s and
 * {@link org.eclipse.stem.core.model.Model}s that represent Geography.
 * 
 * @see GeographicFeature
 * @see Region
 */
public class GeographyDataGenerator extends DataGenerator {
	/**
	 * @param args
	 *            the path to the root of the plugin where this class is
	 *            defined.
	 */
	public static void main(String[] args) {
		final GeographyDataGenerator dg = new GeographyDataGenerator();
		final GeographyPluginFileGenerator gpfg = new GeographyPluginFileGenerator();
		gpfg.generatePluginFiles(dg.processFiles(args),   args[0] + File.separator +  ROOT_SERIALIZED_FILES, true);
	} // main

} // GeographyDataGenerator
