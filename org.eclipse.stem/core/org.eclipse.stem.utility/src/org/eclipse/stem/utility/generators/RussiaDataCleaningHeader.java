package org.eclipse.stem.utility.generators;

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

/**
 * 
 * Relevant keys to the Russian dataset. Keys in this class are used during the
 * data cleaning process to extract only the relevant keys from the original
 * data source file for Russia. These keys are used when running an instance of
 * RussiaDataCleaner to perform data cleaning.
 * 
 */
public abstract class RussiaDataCleaningHeader {

	/**
	 * Administration ID (numeric)
	 */
	public static final int ID = 4;

	/**
	 * Total Area
	 */
	public static final int AREA = 5;
	
	/**
	 * Country identifier
	 */
	public static final int COUNTRY = 9;

	/**
	 * Location name 1
	 */
	public static final int NAME1 = 10;

	/**
	 * Location name 2
	 */
	public static final int NAME2 = 11;

	/**
	 * Location name 3
	 */
	public static final int NAME3 = 12;

	/**
	 * Population value (estimated population for 1995)
	 */
	public static final int POP1 = 14;

	/**
	 * Population value (concrete population)
	 */
	public static final int POP2 = 16;

}