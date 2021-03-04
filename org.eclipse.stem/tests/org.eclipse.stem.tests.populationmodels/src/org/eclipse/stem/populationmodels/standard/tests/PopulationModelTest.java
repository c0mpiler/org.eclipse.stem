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

import junit.framework.TestCase;

import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.ModelFactory;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioFactory;
import org.eclipse.stem.core.sequencer.SequencerFactory;
import org.eclipse.stem.core.sequencer.SequentialSequencer;
import org.eclipse.stem.definitions.nodes.NodesFactory;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer;
import org.eclipse.stem.solvers.fd.FdFactory;
import org.eclipse.stem.solvers.fd.FiniteDifference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Population Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.PopulationModel#getAllLabelIdentifiers() <em>Get All Label Identifiers</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.PopulationModel#createPopulationModelLabel(java.lang.String) <em>Create Population Model Label</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.PopulationModel#createPopulationModelLabelValue(java.lang.String) <em>Create Population Model Label Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class PopulationModelTest extends TestCase {

	public final int individuals = 10;
	public final String populationIdentifier = "human";
	
	/**
	 * The fixture for this Population Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationModel fixture = null;

	/**
	 * Constructs a new Population Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Population Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PopulationModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Population Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationModel getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.stem.populationmodels.standard.PopulationModel#getAllLabelIdentifiers() <em>Get All Label Identifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.populationmodels.standard.PopulationModel#getAllLabelIdentifiers()
	 * @generated NOT
	 */
	public void testGetAllLabelIdentifiers() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.populationmodels.standard.PopulationModel#createPopulationModelLabel(java.lang.String) <em>Create Population Model Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.populationmodels.standard.PopulationModel#createPopulationModelLabel(java.lang.String)
	 * @generated NOT
	 */
	public void testCreatePopulationModelLabel__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.populationmodels.standard.PopulationModel#createPopulationModelLabelValue(java.lang.String) <em>Create Population Model Label Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.populationmodels.standard.PopulationModel#createPopulationModelLabelValue(java.lang.String)
	 * @generated NOT
	 */
	public void testCreatePopulationModelLabelValue__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	protected Scenario createScenario() {
		Scenario scenario = ScenarioFactory.eINSTANCE.createScenario();
		Model model = ModelFactory.eINSTANCE.createModel();
		scenario.setModel(model);
		Model model2 = ModelFactory.eINSTANCE.createModel();
		model.getModels().add(model2);
		
		Graph graph = GraphFactory.eINSTANCE.createGraph();
		
		Region region = NodesFactory.eINSTANCE.createRegion();
		region.setURI(STEMURI.createURI(Region.URI_TYPE_REGION_NODE_SEGMENT));
		graph.getNodes().put(region.getURI(), region);
		
		model2.getGraphs().add(graph);
		
		StandardPopulationInitializer initializer = StandardFactory.eINSTANCE.createStandardPopulationInitializer();
		initializer.setIndividuals(individuals);
		initializer.setPopulationIdentifier(populationIdentifier);
		model2.getNodeDecorators().add(initializer);
		
		SequentialSequencer seq = SequencerFactory.eINSTANCE.createSequentialSequencer();
		seq.setStartTime(ModelFactory.eINSTANCE.createSTEMTime());
		seq.setEndTime(ModelFactory.eINSTANCE.createSTEMTime());
		seq.setTimeIncrement(86400000);
		scenario.setSequencer(seq);
		
		FiniteDifference fd = FdFactory.eINSTANCE.createFiniteDifference();
		fd.setPartitioner(GraphFactory.eINSTANCE.createSimpleGraphPartitioner());
		scenario.setSolver(fd);
	
		
		return scenario;
	}
} //PopulationModelTest
