package org.eclipse.stem.populationmodels.standard.tests;

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

import java.util.Map;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.core.solver.SolverException;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Population Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardPopulationModelTest extends PopulationModelTest {

	public final double BIRTH_RATE = 0.1;
	public final double DEATH_RATE = 0.05;
	public final double EXPECTED_COUNT  = 10.5;
	public final double EXPECTED_BIRTHS  = 1.0;
	public final double EXPECTED_DEATHS  = 0.5;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StandardPopulationModelTest.class);
	}

	/**
	 * Constructs a new Population Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardPopulationModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Population Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StandardPopulationModel getFixture() {
		return (StandardPopulationModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StandardFactory.eINSTANCE.createStandardPopulationModel());
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
	
	public void testStandardPopulationModel() {
		Scenario scenario = createScenario();
		
		StandardPopulationModel popModel = StandardFactory.eINSTANCE.createStandardPopulationModel();
		
		Model m = scenario.getModel();
		
		popModel.setBirthRate(BIRTH_RATE);
		popModel.setDeathRate(DEATH_RATE);
	
		m.getNodeDecorators().add(popModel);
		
		try {
			scenario.initialize();
		} catch(ScenarioInitializationException se) {
			fail(se.getErrorMessage());
		}
		
		scenario.getSolver().setCanonicalGraph(scenario.getCanonicalGraph());
		
		assertTrue(scenario.getCanonicalGraph().getNodeLabels().size() == 2);
		
		PopulationModelLabel pml = null;
		
		// Make sure the population model label is there
		for(Map.Entry<URI, NodeLabel> entry:scenario.getCanonicalGraph().getNodeLabels().entrySet()) {		
			NodeLabel nl = entry.getValue();
			if(nl instanceof PopulationModelLabel) {pml = (PopulationModelLabel)nl;break;}
		}
		
		assertNotNull(pml);
		
		// Make sure the number matches the expected
		StandardPopulationModelLabelValue value = ((StandardPopulationModelLabelValue)pml.getCurrentValue());
		
		assertTrue(value.getCount() == individuals);
		assertTrue(pml.getPopulationIdentifier().equals(populationIdentifier));
		
		// Now step
		
		try {
			assertTrue(scenario.step());
		} catch(SolverException se) {
			fail();
		}
		
		// Check that the count/births/deaths match
		value = ((StandardPopulationModelLabelValue)pml.getCurrentValue());
		assertTrue(value.getCount() == EXPECTED_COUNT);
		assertTrue(value.getBirths() == EXPECTED_BIRTHS);
		assertTrue(value.getDeaths() == EXPECTED_DEATHS);
		
		// 
	}

} //StandardPopulationModelTest
