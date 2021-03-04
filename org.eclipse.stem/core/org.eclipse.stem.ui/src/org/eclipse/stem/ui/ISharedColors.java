package org.eclipse.stem.ui;

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
 * This interface contains identifiers used to mark SWT colors added to this
 * plug-in's color registry. These colors are intended to be shared by
 * referencing the color registry and using the identifiers defined here to
 * select the appropriate color.
 */
public interface ISharedColors {

	/**
	 * Color green -- used as background when simulation is running
	 */
	String GREEN = "green"; //$NON-NLS-1$

	/**
	 * Color orange -- used as background when simulation is reset
	 */
	String ORANGE = "orange"; //$NON-NLS-1$

	/**
	 * Color yellow -- used as background when simulation is paused
	 */
	String YELLOW = "yellow"; //$NON-NLS-1$

	/**
	 * Color yellow -- used as background for text
	 */
	String GRAY = "gray"; //$NON-NLS-1$

}
