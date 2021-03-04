// URIIdentifiableAdapterFactory.java
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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.jobs.Activator;

/**
 * This class is an {@link IAdapterFactory} that adapts
 * {@link org.eclipse.emf.common.util.URI}s to {@link Identifiable}s.
 */
public class URIIdentifiableAdapterFactory extends IdentifiableAdapterFactory {

	/**
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 *      java.lang.Class)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(final Object adaptableObject,
			final Class adapterType) {
		Identifiable retValue = null;
		if (adaptableObject instanceof URI
				&& adapterType.equals(Identifiable.class)) {
			// Yes
			final URI identifableURI = (URI) adaptableObject;
			try {
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource(
						identifableURI, true);
				retValue = (Identifiable) resource.getContents().get(0);
			} catch (final Exception e) {
				Activator.logError("The resource \""
						+ identifableURI.toString()
						+ "\" was not found or was of the wrong format", e);
				retValue = null;
			}
		} // if URI
		return retValue;
	}

} // URIIdentifiableAdapterFactory
