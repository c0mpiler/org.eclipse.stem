// IdentifiablePredicate.java
package org.eclipse.stem.core.predicate;

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

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.common.Identifiable;

/**
 * A <code>IdentifiablePredicate</code> represents a testable condition that is
 * Identifiable.
 * 
 * @model abstract="true"
 */
public interface IdentifiablePredicate extends Identifiable, Predicate {
	
	/**
	 * This is the segment of the type {@link URI} that prefixes all other segments in a
	 * predicate {@link URI}s.
	 */
	String URI_TYPE_PREDICATE_SEGMENT = "predicate";
} // IdentifiablePredicate