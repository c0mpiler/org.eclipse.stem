// TimeTest.java
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


/**
 * A <code>TimeTest</code> is a <code>Test</code> that returns a boolean value
 * depending upon the comparison of the time values passed to
 * {@link #evaluate(org.eclipse.stem.core.model.STEMTime, long, org.eclipse.stem.core.model.Decorator)}
 * and a reference time value.
 * 
 * @model abstract="true"
 */
public interface TimeTest extends Test {
	// Nothing	
} // TimeTest