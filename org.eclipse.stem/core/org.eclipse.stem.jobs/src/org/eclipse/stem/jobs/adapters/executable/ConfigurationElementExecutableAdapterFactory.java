// ConfigurationElementExecutableAdapterFactory.java
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

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.jobs.execution.IExecutable;

/**
 * This class is an {@link ExecutableAdapterFactory} that adapts
 * {@link IConfigurationElement}s to {@link IExecutable}s.
 */
public class ConfigurationElementExecutableAdapterFactory extends
		ExecutableAdapterFactory {

	/**
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 *      java.lang.Class)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(final Object adaptableObject,
			final Class adapterType) {
		IExecutable retValue = null;
		// A IConfigurationElement?
		if (adaptableObject instanceof IConfigurationElement
				&& adapterType.equals(IExecutable.class)) {
			// Yes
			retValue = (IExecutable) Platform.getAdapterManager().getAdapter(
					Platform.getAdapterManager().getAdapter(adaptableObject,
							Identifiable.class), IExecutable.class);
		} // if
		return retValue;
	} // getAdapter

} // ConfigurationElementExecutableAdapterFactory
