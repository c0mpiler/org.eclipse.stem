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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.stem.ui.Activator;

/**
 * Validator that does constraint/value validation for a set of constraints
 * stored in an EAnnotation.
 * The validator is configured as follows:
 * 
 * - Each record in the {@link EAnnotation#getDetails()} key-value map represents a constraint
 * - The key of each record represents the validation handler.  See the {@link #HANDLERS} map
 *   for a list of supported keys
 * - The value is the constraint value and is passed to the constructor of each validation handler
 * 
 * When a value is then passed to {@link #validate(String)}, this class calls 
 * {@link ConstraintValidationHandler#validate(String) against each configured constraint.  If all
 * handlers return true, then the value is valid and true is returned.  
 * If any validators return false, then the value is invalid and returns false.
 *
 */
public class EAnnotationConstraintValidator 
{
	/**
	 * Map of handlers supported for this validator
	 */
	private static final Map<String,Class<? extends ConstraintValidationHandler>> 
		HANDLERS = new HashMap<String,Class<? extends ConstraintValidationHandler>>();
	static {
		HANDLERS.put("minValue", MinValueConstraintValidationHandler.class);
		HANDLERS.put("maxValue", MaxValueConstraintValidationHandler.class);		
	}

	/**
	 * EAnnotation for value that this validator validates
	 */
	EAnnotation annotation;
	
	/**
	 * Validators in use for this EAnnotation
	 */
	List<ConstraintValidationHandler> validators;
	 
	/**
	 * @param annotation EAnnotation describing the constraints that this validator will 
	 *  validate against
	 */
	public EAnnotationConstraintValidator(EAnnotation annotation)
	{
		this.annotation = annotation;
		createValidators();
	}
	
	/**
	 * Sets up all the validators defined in this EAnnotation
	 */
	protected void createValidators()
	{
		validators = new LinkedList<ConstraintValidationHandler>();
		if (annotation != null) {
			for (Entry<String,String> constraint : annotation.getDetails()) {
				try {
					Class<? extends ConstraintValidationHandler> clazz = HANDLERS.get(constraint.getKey());
					if (clazz == null) {
						Activator.logWarning("Constraint validation handler for "+ constraint.getKey() +" not available", null);
						continue;
					}
					ConstraintValidationHandler handler = clazz.getConstructor(String.class).newInstance(constraint.getValue());
					validators.add(handler);
				} catch (InvalidConstraintException ive) {
					Activator.logWarning("Invalid constraint for handler "+constraint.getKey()+" specified: "+ constraint.getValue(), ive);
					continue;
				} catch (Exception e) {
					//warning
					Activator.logWarning("Error initializing the constraint validation handler for "+ constraint.getKey(), e);
					continue;
				}
			}
		}
	}
	
	/**
	 * @return List of currently-configured validators
	 */
	protected List<ConstraintValidationHandler> getValidators()
	{
		return validators;
	}
	
	/**
	 * Validates the given value against all configured validators
	 * 
	 * @param value Value to validate
	 * @return Whether the value is valid or not
	 */
	public boolean validate(String value)
	{
		for (ConstraintValidationHandler handler : getValidators()) {
			if (!handler.validate(value)) {
				return false;
			}
		}
		return true;
	}	
}