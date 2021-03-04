// LoggerControlFactory.java
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
 * This interface is implemented by factories that create instances of
 * {@link LoggerControl}.
 */
public interface LoggerControlFactory {
	
	/**
	 * 
	 * @param parent
	 * @param dirName
	 * @param simulation
	 * @param diseaseModel
	 * @param logRunParameters
	 * @return the loggerControl
	 */
	LoggerControl create(final Composite parent, String dirName, ISimulation simulation, IntegrationDecorator diseaseModel, boolean logRunParameters);

	
	/**
	 * @return TODO JFK
	 */
	public String getControlType();

} // LoggerControlFactory
