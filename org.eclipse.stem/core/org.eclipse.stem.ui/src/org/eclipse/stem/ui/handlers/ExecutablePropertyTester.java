// ExecutablePropertyTester.java
package org.eclipse.stem.ui.handlers;

import org.eclipse.core.expressions.IPropertyTester;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.stem.jobs.execution.IExecutable;

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
 * This class is a {@link PropertyTester} for {@link IExecutable}s in "core
 * expressions".
 */
public class ExecutablePropertyTester extends PropertyTester implements
		IPropertyTester {

	private static final String PROPERTY_IS_RUNNING = "running";
	private static final String PROPERTY_IS_STOPPABLE = "stoppable";

	/**
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object,
	 *      java.lang.String, java.lang.Object[], java.lang.Object)
	 */
	public boolean test(final Object receiver, final String property,
			final Object[] args, final Object expectedValue) {
		
		boolean retValue = false;
		if (receiver instanceof IExecutable) {
			// Yes
			// Runnable?
			if (PROPERTY_IS_RUNNING.equals(property)) {
				// Yes
				retValue = ((IExecutable) receiver).isRunning();
			} // if runnable
			// Stoppable?
			else if (PROPERTY_IS_STOPPABLE.equals(property)) {
				// Yes
				retValue = ((IExecutable) receiver).isStoppable();
			} // if 
		} // if

		return retValue;
	} // test

} // ExecutablePropertyTester