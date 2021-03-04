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
 * Validation handler that checks that a value is greater than 
 * or equal to a given constraint.
 */
class MinValueConstraintValidationHandler extends ConstraintValidationHandler
{
	/**
	 * Creates a new min value constraint for the specified minimum value
	 * @param constraint The minimum value allowed for validation
	 */	
	public MinValueConstraintValidationHandler(String minValue) {
		super(minValue);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.stem.ui.editors.validation.ConstraintValidationHandler#validate(java.lang.String)
	 */
	boolean validate(String value)
	{
		double constraintValue;
		try {
			constraintValue = Double.valueOf(constraint).doubleValue();
		} catch (NumberFormatException nfe) {
			throw new InvalidConstraintException("Constraint must be a numeric value", nfe);
		}

		try {
			return (Double.valueOf(value).doubleValue() >= constraintValue);
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}