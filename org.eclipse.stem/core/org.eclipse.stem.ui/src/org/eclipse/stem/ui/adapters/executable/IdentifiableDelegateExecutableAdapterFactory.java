// IdentifiableDelegateExecutableAdapterFactory.java
package org.eclipse.stem.ui.adapters.executable;

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

import org.eclipse.core.runtime.Platform;
import org.eclipse.stem.jobs.adapters.executable.ExecutableAdapterFactory;
import org.eclipse.stem.jobs.execution.IExecutable;
import org.eclipse.stem.ui.views.IdentifiableDelegate;

/**
 * This class is an {@link ExecutableAdapterFactory} that adapts {@link
 * IdentifiableDelegate}s to {@link IExecutable}s.
 */
public class IdentifiableDelegateExecutableAdapterFactory extends
		ExecutableAdapterFactory {

	/**
	 * @see
	 * 	org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 * 	java.lang.Class)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(final Object adaptableObject,
			final Class adapterType) {
		IExecutable retValue = null;
		// It it what we're looking for?
		if (adaptableObject instanceof IdentifiableDelegate
				&& adapterType.equals(IExecutable.class)) {
			// Yes
			retValue = (IExecutable) Platform.getAdapterManager().getAdapter(
					((IdentifiableDelegate) adaptableObject).getIdentifiable(),
					IExecutable.class);
		} // if
		return retValue;
	} // getAdapter

} // IdentifiableDelegateExecutableAdapterFactory
