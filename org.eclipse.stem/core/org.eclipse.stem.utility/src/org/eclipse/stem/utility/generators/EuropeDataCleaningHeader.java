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
 * Relevant keys to the European dataset. Keys in this class are used during the
 * data cleaning process to extract only the relevant keys from the original
 * data source file for Europe. These keys are used when running an instance of
 * EuropeDataCleaner to perform data cleaning.
 * 
 */
public abstract class EuropeDataCleaningHeader {

	/**
	 * Numeric ID
	 */
	public static final int NUMID = 6;

	/**
	 * Name ID
	 */
	public static final int STRID = 7;

	/**
	 * Total Area
	 */
	public static final int AREA = 11;

	/**
	 * Population value 1
	 */
	public static final int POP1 = 15;

	/**
	 * Population value 2
	 */
	public static final int POP2 = 16;

	/**
	 * Population value 3
	 */
	public static final int POP3 = 17;

	/**
	 * Population value 4
	 */
	public static final int POP4 = 18;

	/**
	 * Alternative ID
	 */
	public static final int TEMPID = 20;

}