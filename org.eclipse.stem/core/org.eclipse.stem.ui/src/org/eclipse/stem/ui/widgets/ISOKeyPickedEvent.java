// ISOKeyPickedEvent.java
package org.eclipse.stem.ui.widgets;

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

import java.util.EventObject;

/**
 * This class represents the event of an ISOkey being selected using an
 * {@link ISOKeyPicker}.
 */
public class ISOKeyPickedEvent extends EventObject {
	private static final long serialVersionUID = 1L;
	private String isoKey;

	/**
	 * @param source
	 * @param isoKey
	 */
	public ISOKeyPickedEvent(Object source, String isoKey) {
		super(source);
		this.isoKey = isoKey;
	}

	/**
	 * @return the isoKey
	 */
	public final String getIsoKey() {
		return isoKey;
	}

} // ISOKeyPickedEvent
