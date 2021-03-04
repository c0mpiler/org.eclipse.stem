// IdentifiableAdapterFactory.java
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

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.stem.core.common.Identifiable;

/**
 * This class is an {@link IAdapterFactory} that adapts {@link Object}s to
 * {@link Identifiable}s.
 */
abstract public class IdentifiableAdapterFactory implements IAdapterFactory {

	/**
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Class[] getAdapterList() {
		return new Class[] { Identifiable.class };
	}

} // IdentifiableAdapterFactory
