// ExecutableAdapterFactory.java
package org.eclipse.stem.jobs.adapters.executable;

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

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.stem.jobs.execution.IExecutable;

/**
 * This class is an {@link IAdapterFactory} that is extended by classes that
 * adapt {@link Object}s to {@link IExecutable}s.
 */
abstract public class ExecutableAdapterFactory implements IAdapterFactory {

	/**
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Class[] getAdapterList() {
		return new Class[] { IExecutable.class };
	}

} // ExecutableAdapterFactory
