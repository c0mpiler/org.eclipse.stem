// IdentifiableDelegateModifiableAdapterFactory.java
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

import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.modifier.Modifiable;
import org.eclipse.stem.jobs.adapters.identifiable.IdentifiableAdapterFactory;
import org.eclipse.stem.ui.views.IdentifiableDelegate;

/**
 * This class is an {@link IdentifiableAdapterFactory} that adapts
 * {@link IdentifiableDelegate}s to {@link Identifiable}s.
 */
public class IdentifiableDelegateModifiableAdapterFactory extends
		IdentifiableAdapterFactory {

	/**
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 *      java.lang.Class)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		Identifiable retValue = null;
		// It it what we're looking for?
		if (adaptableObject instanceof IdentifiableDelegate
				&& adapterType.equals(Modifiable.class)) {
			// Yes
			final Identifiable temp = ((IdentifiableDelegate) adaptableObject).getIdentifiable();
			
			retValue = temp != null && temp instanceof Modifiable ? temp : null;
		} // if
		return retValue;
	} // getAdapter

} // IdentifiableDelegateModifiableAdapterFactory
