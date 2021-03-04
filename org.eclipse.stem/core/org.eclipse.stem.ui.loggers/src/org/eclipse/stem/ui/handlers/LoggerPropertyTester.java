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
package org.eclipse.stem.ui.handlers;

import org.eclipse.core.expressions.IPropertyTester;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.stem.loggers.SimulationLogger;

/**
 * Property tester to determine whether a given logger is currently enabled or not.  
 *
 */
public class LoggerPropertyTester extends PropertyTester implements
		IPropertyTester {

	private static final String IS_ENABLED_VALUE = "enabled"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object,
	 * java.lang.String, java.lang.Object[], java.lang.Object)
	 */
	public boolean test(final Object receiver, final String property,
			final Object[] args, final Object expectedValue) {

		boolean retValue = false;
		if (receiver instanceof SimulationLogger) {
			if (IS_ENABLED_VALUE.equals(property)) {
				retValue = ((SimulationLogger) receiver).isEnabled();
			}
		}
		return retValue;
	}

}