// IPreferencesContributer.java
package org.eclipse.stem.ui.adapters.color;

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

import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.stem.ui.preferences.MapsColorsPreferencePage;

/**
 * This interface should be implemented by those entities that wish to contribute
 * preferences fields to the Maps Colors preferences page.
 */
public interface IPreferencesContributer {

	/**
	 * Sets the {@link MapsColorsPreferencePage}
	 * @param preferencePage the {@link MapsColorsPreferencePage}
	 */
	public void setPreferencePage(MapsColorsPreferencePage preferencePage);
	/**
	 * Creates the preferences fields and add them to the preferences page
	 */
	public void createFieldEditors();
	/**
	 * Initialize the preferences fields
	 */
	public void initialize();
	/**
	 * Being called whenever a property in the preferences page has been changed.
	 * @param event Event object about the changed property
	 */
	public void propertyChange(PropertyChangeEvent event);
	/**
	 * Loads the preferences fields with default values
	 */
	public void performDefaults();
	
} // IPreferencesContributer
