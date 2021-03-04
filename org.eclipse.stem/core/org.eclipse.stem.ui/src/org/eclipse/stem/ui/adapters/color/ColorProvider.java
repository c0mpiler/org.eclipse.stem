// ColorProvider.java
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

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.stem.core.model.Decorator;

/**
 * The interface will be extended by more specific interfaces that provides colors
 * methods.
 */
public interface ColorProvider {
	/**
	 * The method will return a {@link Color} object that matches some adapted object
	 * @param device A device for created colors
	 * @return a {@link Color} object
	 */
	public STEMColor getColor();
	
	
	public STEMColor getColor(final float gainFactor, final boolean useLogScaling);
	
	/**
	 * Gets the background color from preferences
	 * @return The configured background color
	 */
	public STEMColor getBackgroundFillColor();
	
	/**
	 * Gets the border color from preferences
	 * @return The configured border color
	 */
	public STEMColor getBorderColor();
	
	/**
	 * The method will set the selected {@link Decorator}.
	 * @param selectedDecorator The selected decorator
	 */
	public void setSelectedDecorator(final Decorator selectedDecorator);
	/**
	 * The method will set the population model
	 * @param selectedPopulationId The selected popoulation id
	 */
	public void setSelectedPopulationIdentifier(final String selectedPopulationId);
	/**
	 * The method will set the population model
	 * @param selectedPopulationId The selected popoulation id
	 */
	public void setSelectedProperty(final ItemPropertyDescriptor selectedProperty);
}
// ColorProvider