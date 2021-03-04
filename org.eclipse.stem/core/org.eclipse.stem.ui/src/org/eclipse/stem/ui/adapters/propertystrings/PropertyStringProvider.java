// PropertyStringProvider.java
package org.eclipse.stem.ui.adapters.propertystrings;

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

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This interface is implemented by classes that provide NLS'd strings for
 * {@link org.eclipse.stem.core.common.Identifiable} properties.
 */
public interface PropertyStringProvider {

	/**
	 * This is the suffix appended to the name of a property to create the key
	 * to extract the tool tip text from the message property file.
	 */
	String TT_SUFFIX = "TT"; //$NON-NLS-1$

	/**
	 * This is the suffix appended to the name of a property to create the key
	 * to extract the text from the message property file that represents the
	 * units of a property.
	 */
	String UNIT_SUFFIX = "UNIT"; //$NON-NLS-1$

	/**
	 * Suffix appended to property key that represents a field that 
	 * describes a property that is missing.
	 */
	String MISSING_SUFFIX = "MISSING";

	/**
	 * Suffix appended to property key that represents a field that 
	 * describes a property that has an invalid value.
	 */
	String INVALID_SUFFIX = "INVALID";
	
	/**
	 * @param descriptor
	 * @return the NLS'd name of the property to display to the user
	 */
	String getPropertyName(IItemPropertyDescriptor descriptor);

	/**
	 * @param descriptor
	 * @return the NLS'd tool tip text that describes the property
	 */
	String getPropertyToolTip(IItemPropertyDescriptor descriptor);

	/**
	 * @param descriptor
	 * @return the NLS'd text that represents the units of the property
	 */
	String getPropertyUnits(IItemPropertyDescriptor descriptor);
	
	/**
	 * @param descriptor
	 * @return
	 */
	String getPropertyMissing(IItemPropertyDescriptor descriptor);
	
	/**
	 * @param descriptor
	 * @return
	 */
	String getPropertyInvalid(IItemPropertyDescriptor descriptor);
	
} // PropertyStringProvider
