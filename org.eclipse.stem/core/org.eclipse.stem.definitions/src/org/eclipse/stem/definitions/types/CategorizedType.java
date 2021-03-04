// CategorizedType.java
package org.eclipse.stem.definitions.types;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.model.Decorator;

/**
 * A <code>CatagorizedType</code> is a marker interface for the types of
 * properties specified for {@link Decorator}s. The intent is that particular
 * properties can be "marked" as having a "category" by the type of the
 * property. This will facilitate things like grouping properties in the same
 * category together in a user interface.
 * 
 * @model interface="true"
 */
public interface CategorizedType extends EObject {
	// Nothing
} // CategorizedType
