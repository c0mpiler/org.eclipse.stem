package org.eclipse.stem.core.graph.tests;

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

import junit.textui.TestRunner;

import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.graph.SimpleGraphPartitioner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Graph Partitioner</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleGraphPartitionerTest extends GraphPartitionerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleGraphPartitionerTest.class);
	}

	/**
	 * Constructs a new Simple Graph Partitioner test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGraphPartitionerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Graph Partitioner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleGraphPartitioner getFixture() {
		return (SimpleGraphPartitioner)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphFactory.eINSTANCE.createSimpleGraphPartitioner());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SimpleGraphPartitionerTest
