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
 * Relevant keys to the Russian dataset. Used during conversion process from the
 * Russian UN format -> Diva format.
 * 
 */
public abstract class RussiaDataFormattingHeader {

	/**
	 * Numeric ID
	 */
	public static final int ID = 0;

	/**
	 * Area
	 */
	public static final int AREA = 1;

	/**
	 * Country name
	 */
	public static final int COUNTRY = 2;

	/**
	 * Location Name 1
	 */
	public static final int NAME1 = 3;

	/**
	 * Location Name 2
	 */
	public static final int NAME2 = 4;

	/**
	 * Location Name 3
	 */
	public static final int NAME3 = 5;

	/**
	 * Population value 1
	 */
	public static final int POP1 = 6;

	/**
	 * Population value 2
	 */
	public static final int POP2 = 7;

}