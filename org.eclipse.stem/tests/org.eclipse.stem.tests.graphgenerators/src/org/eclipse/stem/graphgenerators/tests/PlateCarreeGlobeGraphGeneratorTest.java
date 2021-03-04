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
import org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plate Carree Globe Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlateCarreeGlobeGraphGeneratorTest extends LatticeGraphGeneratorTest {
	
	public static final URI testURI = URI.createURI("http:///PLATE_CARREE_GENERATOR.graphgenerators"); //$NON-NLS-1$


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlateCarreeGlobeGraphGeneratorTest.class);
	}
	
	/**
	 * creates the PlateCarreeGlobeGraphGenerator()
	 */
	public PlateCarreeGlobeGraphGenerator createFixture() {
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
			Resource resource = resourceSet.createResource(URI.createURI("http:///Test.PlateCarree.graphgenerators")); //$NON-NLS-1$
			fixture = GraphgeneratorsFactory.eINSTANCE.createPlateCarreeGlobeGraphGenerator();
			resource.getContents().add(fixture);
			//resource.save(System.out, null);
		}
		catch (Exception exception) {
			exception.printStackTrace();
			fail();
		}
		return (PlateCarreeGlobeGraphGenerator) fixture;
	}// createFixture()

	/**
	 * Constructs a new Plate Carree Globe Graph Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlateCarreeGlobeGraphGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Plate Carree Globe Graph Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlateCarreeGlobeGraphGenerator getFixture() {
		return (PlateCarreeGlobeGraphGenerator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphgeneratorsFactory.eINSTANCE.createPlateCarreeGlobeGraphGenerator());
	}

	/**
	 * Tests the creation of a PlateCarreeGlobeGraphGenerator
	 */
	public void testPlateCarreeGraphGenerator() {
		PlateCarreeGlobeGraphGenerator pcggg = getFixture();
		pcggg.setRadius(TEST_RADIUS);
		pcggg.setURI(testURI);
		URI uri = pcggg.getURI();
		if(uri==null) fail();
		//TODO implement generator tests here
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

} //PlateCarreeGlobeGraphGeneratorTest
