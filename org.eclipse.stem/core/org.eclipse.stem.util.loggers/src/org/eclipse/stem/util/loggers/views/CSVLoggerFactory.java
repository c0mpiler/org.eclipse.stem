// CSVLoggerFactory.java
package org.eclipse.stem.util.loggers.views;

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

import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.swt.widgets.Composite;

/**
 * This class is a factory for creating {@link LoggerControl} instances.
 */
public class CSVLoggerFactory implements LoggerControlFactory {

	/**
	 * public INSTANCE for this Factory
	 */
	public static CSVLoggerFactory INSTANCE = new CSVLoggerFactory();

	/**
	 * Constants 
	 */
	public static final String LOGGER_TYPE = "CSVLogger";
	
	/**
	 * Empty constructor
	 */
	private CSVLoggerFactory() {
		/*
		 * empty constructor
		 */
	}
	
	/**
	 * 
	 * @param parent
	 * @param dirName
	 * @param simulation
	 * @param dm
	 * @param logRunParameters
	 * @return the control
	 */
	public LoggerControl create(final Composite parent, String dirName, ISimulation simulation, IntegrationDecorator dm, boolean logRunParameters) {
		NewCSVLogWriter  newCSVWriter = new NewCSVLogWriter(dirName, simulation, dm, logRunParameters);
		
		LoggerControl ctrl = new DataHistoryLogger(parent, newCSVWriter, simulation, dm);
		
		return ctrl;
	}
	
	/**
	 * @return TODO JFK
	 * 
	 */
	public String getControlType() {
		return LOGGER_TYPE;
	}

} // CSVLoggerFactory
