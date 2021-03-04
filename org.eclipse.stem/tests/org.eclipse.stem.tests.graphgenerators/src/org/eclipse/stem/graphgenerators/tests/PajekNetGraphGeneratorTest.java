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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import junit.textui.TestRunner;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.graphgenerators.GraphgeneratorsFactory;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.PajekNetGraphGenerator;
import org.eclipse.stem.test.graphgenerators.tests.Activator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pajek Net Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PajekNetGraphGeneratorTest extends GraphGeneratorTest {

	private static final URI testURI = URI.createURI("http:///PAJEK_NET_GENERATOR.graphgenerators"); //$NON-NLS-1$
	//private static final double TEST_AREA = 100.0;
	//private static final String TEST_FILE = "PajekNetGraphGeneratorTest.net";
	//private static String TEST_FILE_PATH = null;
	//private static URL TEST_FILE_URL = null;
	private static final String RUNTIME_WORKSPACE_PATH =  Platform.getLocation().toOSString();
	private final static String REFERENCE_DIR = "./resources/"; //$NON-NLS-1$
	private final static String sep = File.separator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PajekNetGraphGeneratorTest.class);
	}
	
	/**
	 * creates the PajekNetGraphGenerator()
	 */
	public PajekNetGraphGenerator createFixture() throws Exception {
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
		
		PajekNetGraphGenerator fixture = null;
		try {
			Resource resource = resourceSet.createResource(URI.createURI("http:///Test.PajekNet.graphgenerators")); //$NON-NLS-1$
			fixture = GraphgeneratorsFactory.eINSTANCE.createPajekNetGraphGenerator();
			resource.getContents().add(fixture);
			//resource.save(System.out, null);
		}
		catch (Exception exception) {
			exception.printStackTrace();
			fail();
		}
		

		URL url = FileLocator.find(Platform.getBundle(Activator.PLUGIN_ID), new Path("resources/PajekNetGraphGeneratorTest.net"), null);
		url = FileLocator.toFileURL(url);
				
		fixture.setDataFile(new File(url.toURI()).getPath());
		fixture.setURI(testURI);
		
		
		//TEST_FILE_PATH = getTestFile(TEST_FILE);		
		
		return (PajekNetGraphGenerator) fixture;
	}// createFixture()

	/**
	 * Constructs a new Pajek Net Graph Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PajekNetGraphGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pajek Net Graph Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PajekNetGraphGenerator getFixture() {
		return (PajekNetGraphGenerator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphgeneratorsFactory.eINSTANCE.createPajekNetGraphGenerator());
	}
	
	/**
	 * Tests the creation of a PajekNetGraphGenerator
	 */
	public void testPajekNetGraphGenerator() throws Exception {
		PajekNetGraphGenerator pngg = getFixture();

		URI uri = pngg.getURI();
		if (uri==null) fail();
		Graph g = pngg.getGraph();
		/*
		Activator.logInformation(g.getNumDynamicLabels() + "\t" + g.getNumEdges() + "\t" + g.getNumGraphLabels() + "\t" +
				g.getNumNodeLabels() + "\t" + g.getNumNodes());
				*/
		assertTrue("NumDynamicLabels should be 0, but is " + g.getNumDynamicLabels() + " ...", g.getNumDynamicLabels() == 0);
		assertTrue("NumEdges should be 74, but is " + g.getNumEdges() + " ...", g.getNumEdges() == 74);
		assertTrue("NumGraphLabels should be 0, but is " + g.getNumGraphLabels() + " ...", g.getNumGraphLabels() == 0);
		assertTrue("NumNodeLabels should be 186, but is " + g.getNumNodeLabels() + " ...", g.getNumNodeLabels() == 186);
		assertTrue("NumNodes should be 62, but is " + g.getNumNodes() + " ...", g.getNumNodes() == 62);
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
	
	/**
	 * 
	 * @param testFilename
	 * @return
	 */
	@SuppressWarnings("unused")
	private String getTestFile(String testFilename) {
		// 1. copy the test file FROM the source directory TO the runtime workspace where ever that is
		File refDirectory = new File(REFERENCE_DIR);
		if (refDirectory.isDirectory()) {
			// should always be true
			File[] files = refDirectory.listFiles();
			if (files==null) fail("Error:PajekNetGraphGenerator Example File not found !!");//$NON-NLS-1$
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().equalsIgnoreCase(testFilename)) {
					String resFile = RUNTIME_WORKSPACE_PATH + sep + files[i].getName();
					try {
						copyFile(files[i], new File(resFile));						
						return resFile;
						
					} catch (Exception ioe) {
						System.out.println("Copy failed "+ioe.getMessage());
						ioe.printStackTrace();
						fail("Error:PajekNetGraphGenerator failed to copy test file  !!");//$NON-NLS-1$
					}
					break;
				}
			}//for
	
		}// if
		// else we faile
		fail("Error:PajekNetGraphGenerator failed to find test file  !!");//$NON-NLS-1$
		return "";		
	}
    private static void copyFile(File sourceFile, File targetFile)  throws IOException, CoreException {
   	 
        if (targetFile.exists()) return; // already exists
            InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(targetFile);
            
            // Copy the bits from instream to outstream
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, len);
            }
            inputStream.close();
            outputStream.close();
     }

} //PajekNetGraphGeneratorTest
