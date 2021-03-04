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
package org.eclipse.stem.ui.editors.validation;

/**
 * Base class for describing validation handlers.  A validation handler
 * is checks that a given value for an attribute complies with the constraint
 * given to a handler for a given type.
 * 
 */
public abstract class ConstraintValidationHandler 
{
	/**
	 * The constraint that the handler implementation will validate against
	 */
	protected String constraint;

	/**
	 * @param constraint
	 */
	public ConstraintValidationHandler(String constraint)
	{
		this.constraint = constraint;
	}
	
	/**
	 * Method called by the validator to check a given value 
	 * against the constraint for a given implementation.  Returns
	 * true if the value is valid, false otherwise.
	 * @param value The value to check against the constraint
	 * @return Whether the value is valid
	 */
	abstract boolean validate(String value);
}
