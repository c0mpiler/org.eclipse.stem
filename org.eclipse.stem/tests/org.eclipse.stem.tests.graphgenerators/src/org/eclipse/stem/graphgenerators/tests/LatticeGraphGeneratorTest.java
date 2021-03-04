package org.eclipse.stem.graphgenerators.tests;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.stem.graphgenerators.LatticeGraphGenerator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lattice Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class LatticeGraphGeneratorTest extends GraphGeneratorTest {
	
	public static final double TEST_AREA=100.0;
	public static final double TEST_RADIUS=100.0;

	/**
	 * Constructs a new Lattice Graph Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatticeGraphGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lattice Graph Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LatticeGraphGenerator getFixture() {
		return (LatticeGraphGenerator)fixture;
	}

} //LatticeGraphGeneratorTest
