package org.eclipse.stem.tests.automaticexperiment;

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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment;
import org.eclipse.stem.analysis.automaticexperiment.ErrorAnalysisAlgorithm;
import org.eclipse.stem.analysis.automaticexperiment.ErrorAnalysisAlgorithmFactory;
import org.eclipse.stem.core.STEMXMIResourceFactoryImpl;
import org.eclipse.stem.core.common.tests.IdentifiableTest;
import org.eclipse.stem.core.common.util.LogInitializationException;

import junit.textui.TestRunner;

public class AutomaticExperimentTest 
	extends IdentifiableTest {
	
	static final String RUNTIME_WORKSPACE_PATH =  Platform.getLocation().toOSString();
	//private final static String REFERENCE_DIR = "./resources/"; //$NON-NLS-1$
	private final static String AUTOMATED_EXPERIMENT_EXAMPLE = "AutomatedExperimentExample";//$NON-NLS-1$
	private final static String sep = File.separator;
	private final static String AUTOMATIC_EXPERIMENT_RUN_TARGET = "/experiments/AutomatedExperiment.automaticexperiment"; //$NON-NLS-1$
	private static File targetDirectory = null;

	private static final String PLUGIN_ID = "org.eclipse.stem.tests.automaticexperiment";
	
	public static void main(String[] args) {
		TestRunner.run(AutomaticExperimentTest.class);
	}

	public AutomaticExperimentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Experiment test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AutomaticExperiment getFixture() {
		return (AutomaticExperiment)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(createFixture());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	    //// clean up ////
		try {
			assertTrue(TestUtil.removeDirectory(targetDirectory));
		} catch(CoreException ce) {
			ce.printStackTrace();
			fail();
		}	
		/////////////////////
	}

	/**
	 * Tests the '{@link org.eclipse.stem.core.experiment.Experiment#updateScenario() <em>Update Scenario</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.core.experiment.Experiment#updateScenario()
	 * @generated NOT
	 */
	public void testAutomaticExperiment() 
	{
		AutomaticExperiment automaticExperiment = getFixture();
		assertNotNull(automaticExperiment);
		//String algorithmName = automaticExperiment.getErrorAnalysisAlgorithm();
		ErrorAnalysisAlgorithm algorithm = 
			ErrorAnalysisAlgorithmFactory.INSTANCE.createErrorAnalysisAlgorithm(automaticExperiment);
		assertNotNull(algorithm);
		try {
			algorithm.init(automaticExperiment, algorithm);
		} catch(LogInitializationException lie) {
			fail(lie.getMessage());
		}
		algorithm.execute();
		assertTrue(true);
	}

	/**
	 * @return an {@link AutomaticExperiment} for testing.
	 */
	public static AutomaticExperiment createFixture() {
		Enumeration<URL> data = Platform.getBundle(PLUGIN_ID).findEntries("/resources/", "*", false);
		if (data != null) {
			while(data.hasMoreElements()) {
				URL resourceUrl = data.nextElement();
				try {
					resourceUrl = FileLocator.toFileURL(resourceUrl);
					File projectPath = new File(resourceUrl.toURI());
					String projectName = projectPath.getName();
					if (projectPath.isDirectory()) {
						String runProjectName = RUNTIME_WORKSPACE_PATH+sep+projectName;
						if(projectName.equalsIgnoreCase(AUTOMATED_EXPERIMENT_EXAMPLE)) {
							targetDirectory = new File(runProjectName);
							try {
								TestUtil.importProject(projectPath, targetDirectory);
								return loadAutomaticExperiment(runProjectName+AUTOMATIC_EXPERIMENT_RUN_TARGET);
							} catch (Exception ioe) {
								System.out.println("Copy failed "+ioe.getMessage());
								ioe.printStackTrace();
								fail("Error:AutomatedExperiment failed to copy test project  !!");//$NON-NLS-1$
							}
						}
	
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		fail("Error:AutomatedExperiment failed to initialize test project.  Could not find experiment data.");//$NON-NLS-1$
		return null;
		
//		System.out.println(Arrays.asList(resourceUrls));
//		
//		
//		File refDirectory = new File(REFERENCE_DIR);
//		if (refDirectory.isDirectory()) {
//			// should always be true
//			File[] projects = refDirectory.listFiles();
//			if(projects==null) fail("Error:AutomatedExperiment projects not found !!");//$NON-NLS-1$
//			for (int i = 0; i < projects.length; i ++) {
//				if(projects[i].isDirectory()) {
//
//				}// if project directory
//			}//for
//	
//		}// if
//		// else we faile
//		fail("Error:AutomatedExperiment failed to initialize test project  !!");//$NON-NLS-1$
//		return null;
	}
	
	static AutomaticExperiment loadAutomaticExperiment(final String filename) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", //$NON-NLS-1$
				STEMXMIResourceFactoryImpl.INSTANCE);
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("platform", //$NON-NLS-1$
				STEMXMIResourceFactoryImpl.INSTANCE);
		final Resource resource = resourceSet.getResource(URI.createFileURI(filename), true);
		try 
		{			
			resource.load(null);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		AutomaticExperiment toReturn = (AutomaticExperiment)resource.getContents().get(0);
		return toReturn;
	}
}
