package org.eclipse.stem.analysis;
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

public class States {
	/**
     * possible states with parameters to fit
     */
	public static final String[] statesToFit= {"S","E","I","R","P", "Incidence","Disease Deaths"};
	/**
	 *  Susceptible index (for statesToFit)
	 */
	public static final int SUSCEPTIBLE = 0;
	/**
	 * Exposed index (for statesToFit)
	 */
	public static final int EXPOSED     = 1;
	/**
	 * Infectious index (for statesToFit)
	 */
	public static final int INFECTIOUS  = 2;
	/**
	 *  Recovered index (for statesToFit)
	 */
	public static final int RECOVERED   = 3;
	/**
	 *  Infectious recover index (for statesToFit)
	 */
	public static final int POPULATION = 4;
	/**
	 *  Incidence
	 */
	public static final int INCIDENCE = 5;
	/**
	 *  Disease Deaths
	 */
	public static final int DISEASE_DEATHS = 6;
}
