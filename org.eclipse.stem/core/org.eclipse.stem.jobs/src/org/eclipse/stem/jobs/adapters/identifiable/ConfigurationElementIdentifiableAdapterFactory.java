// ConfigurationElementIdentifiableAdapterFactory.java
package org.eclipse.stem.jobs.adapters.identifiable;

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
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;

/**
 * This class is an {@link IAdapterFactory} that adapts
 * {@link IConfigurationElement}s to {@link Identifiable}s.
 */
public class ConfigurationElementIdentifiableAdapterFactory extends
		IdentifiableAdapterFactory {

	/**
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 *      java.lang.Class)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(final Object adaptableObject,
			final Class adapterType) {
		Identifiable retValue = null;
		if (adaptableObject instanceof IConfigurationElement
				&& adapterType.equals(Identifiable.class)) {
			// Yes
			retValue = (Identifiable) Platform.getAdapterManager().getAdapter(
					URI.createURI(((IConfigurationElement) adaptableObject)
							.getAttribute(DublinCore.IDENTIFIER)),
					Identifiable.class);
		} // if

		return retValue;
	} // getAdapter
} // ConfigurationElementIdentifiableAdapterFactory
