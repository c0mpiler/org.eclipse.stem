// TimeProviderAdapter.java
package org.eclipse.stem.adapters.time;

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

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.stem.core.model.ModelFactory;
import org.eclipse.stem.core.model.STEMTime;

/**
 * This class is a {@link TimeProvider}.
 */
public class TimeProviderAdapter extends AdapterImpl implements TimeProvider {

	/**
	 * @see org.eclipse.stem.adapters.time.TimeProvider#getTime()
	 */
	public STEMTime getTime() {
		return ModelFactory.eINSTANCE.createSTEMTime();
	}

} // TimeProviderAdapter