// IdentifiableImplTest.java
package org.eclipse.stem.core.common.tests;

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
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.impl.IdentifiableImpl;

/**
 * This class represents a JUnit test for Identifiable.
 */
@SuppressWarnings("all")
public class IdentifiableImplTest extends IdentifiableTest {

	public static URI IDENTIFIABLE_URI = STEMURI.createURI("identifiable/identifiableImplTest");
	
	
	/**
	 * @param name
	 */
	public IdentifiableImplTest(String name) {
		super(name);
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		final Identifiable id = new IdentifiableImpl() {/* nothing */
		};
		id.setURI(IDENTIFIABLE_URI);
		setFixture(id);
	} // setUp

} // IdentifiableImplTest
