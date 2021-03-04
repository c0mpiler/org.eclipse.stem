package org.eclipse.stem.ui.wizards;
import java.util.EventListener;

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


/**
 * This interface is implemented by classes that want to be informed when an ISO
 * key is selected from the {@link ISOKeyPicker};
 */
public interface ISOKeyPickedEventListener extends EventListener {
	void isoKeyPicked(ISOKeyPickedEvent ikpe);
} // ISOKeyPickedEventListener
