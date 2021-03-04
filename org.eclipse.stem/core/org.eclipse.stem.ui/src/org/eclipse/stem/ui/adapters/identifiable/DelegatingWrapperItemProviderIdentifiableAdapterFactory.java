package org.eclipse.stem.ui.adapters.identifiable;

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
import org.eclipse.stem.jobs.adapters.identifiable.IdentifiableAdapterFactory;

/**
 * This class is an
 * {@link org.eclipse.stem.jobs.adapters.executable.ExecutableAdapterFactory}
 * that adapts {@link org.eclipse.stem.ui.views.IdentifiableDelegate}s to
 * {@link Identifiable}s.
 */
public class DelegatingWrapperItemProviderIdentifiableAdapterFactory extends
		IdentifiableAdapterFactory {

	/**
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 *      java.lang.Class)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		Identifiable retValue = null;

		// It it what we're looking for?
		if (adaptableObject instanceof DelegatingWrapperItemProvider
				&& adapterType.equals(Identifiable.class)) {
			// Yes
			final DelegatingWrapperItemProvider dwip = (DelegatingWrapperItemProvider) adaptableObject;
			// Is this an Identifiable?
			if (dwip.getValue() instanceof Identifiable) {
				// Yes
				retValue = (Identifiable) dwip.getValue();
			} // if Identifiable
			else {
				// No
				// Keep adapting...
				retValue = (Identifiable) Platform.getAdapterManager()
						.getAdapter(dwip.getValue(), Identifiable.class);
			}
		} // if
		return retValue;
	} // getAdapter

} // DelegatingWrapperItemProviderIdentifiableAdapterFactory
