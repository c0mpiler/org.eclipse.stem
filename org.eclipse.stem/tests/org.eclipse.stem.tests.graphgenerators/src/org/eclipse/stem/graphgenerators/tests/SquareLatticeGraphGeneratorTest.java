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


import junit.textui.TestRunner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.stem.graphgenerators.GraphgeneratorsFactory;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Square Lattice Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SquareLatticeGraphGeneratorTest extends LatticeGraphGeneratorTest {
	
	public static final URI testURI = URI.createURI("http:///SQUARE_LATTICE_GENERATOR.graphgenerators"); //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SquareLatticeGraphGeneratorTest.class);
	}
	
	/**
	 * creates the SquareLatticeGraphGenerator()
	 */
	public SquareLatticeGraphGenerator createFixture() {
		
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(GraphgeneratorsPackage.eNS_URI, 
			 GraphgeneratorsPackage.eINSTANCE);
		
		try {
			Resource resource = resourceSet.createResource(URI.createURI("http:///TEST.SQUARELATTICE.graphgenerators")); //$NON-NLS-1$
			fixture = GraphgeneratorsFactory.eINSTANCE.createSquareLatticeGraphGenerator();
			resource.getContents().add(fixture);
			//resource.save(System.out, null);
		}
		catch (Exception exception) {
			exception.printStackTrace();
			fail();
		}
		return (SquareLatticeGraphGenerator) fixture;
	}// createFixture()

	/**
	 * Constructs a new Square Lattice Graph Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SquareLatticeGraphGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Square Lattice Graph Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SquareLatticeGraphGenerator getFixture() {
		return (SquareLatticeGraphGenerator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphgeneratorsFactory.eINSTANCE.createSquareLatticeGraphGenerator());
	}

	/**
	 * Tests the creation of a square lattice graph generator
	 */
	public void testSquareLatticeGraphGenerator() {
		SquareLatticeGraphGenerator slgg = getFixture();
		slgg.setArea(TEST_AREA);
		slgg.setURI(testURI);
		URI uri = slgg.getURI();
		if(uri==null) fail();
		//TODO implement generator tests here
	}// testSquareLatticeGraphGenerator
	
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

} //SquareLatticeGraphGeneratorTest
