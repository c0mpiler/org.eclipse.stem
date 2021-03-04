package org.eclipse.stem.ui.adapters.modifiable;

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
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.modifier.Modifiable;
import org.eclipse.stem.jobs.adapters.identifiable.IdentifiableAdapterFactory;

/**
 * This class is an {@link IdentifiableAdapterFactory} that adapts
 * {@link DelegatingWrapperItemProvider}s to {@link Modifiable}s.
 */
public class DelegatingWrapperItemProviderModifiableAdapterFactory extends
		IdentifiableAdapterFactory {

	/**
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 *      java.lang.Class)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		Modifiable retValue = null;

		// It it what we're looking for?
		if (adaptableObject instanceof DelegatingWrapperItemProvider
				&& adapterType.equals(Modifiable.class)) {
			// Yes
			final DelegatingWrapperItemProvider dwip = (DelegatingWrapperItemProvider) adaptableObject;
			// Is this an Identifiable?
			if (dwip.getValue() instanceof Identifiable) {
				// Yes
				// ...and is it Modifiable?
				if (dwip.getValue() instanceof Modifiable) {
					// Yes
					retValue = (Modifiable) dwip.getValue();
				}
				// else NO
			} // if Identifiable 
			else {
				// No
				// Keep adapting...
				retValue = (Modifiable) Platform.getAdapterManager()
						.getAdapter(dwip.getValue(), Modifiable.class);
			}
		} // if
		return retValue;
	} // getAdapter
} // DelegatingWrapperItemProviderModifiableAdapterFactory
