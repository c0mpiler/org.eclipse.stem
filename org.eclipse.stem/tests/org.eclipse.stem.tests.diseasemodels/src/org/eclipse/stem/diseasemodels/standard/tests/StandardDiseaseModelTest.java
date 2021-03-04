package org.eclipse.stem.diseasemodels.standard.tests;

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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.definitions.labels.impl.TransportRelationshipLabelImpl;
import org.eclipse.stem.diseasemodels.standard.AggregatingSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.AggregatingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.AggregatingSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getNormalizedEffectiveInfectious(org.eclipse.stem.core.graph.Node, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel, double, org.eclipse.emf.ecore.EAttribute, org.eclipse.emf.ecore.EAttribute, org.eclipse.emf.ecore.EAttribute) <em>Get Normalized Effective Infectious</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getBirthsCompartment() <em>Get Births Compartment</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#doDeaths(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, double) <em>Do Deaths</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public abstract class StandardDiseaseModelTest extends DiseaseModelTest {

	/**
	 * This is initialized to contain a disease label,
	 */
	protected StandardDiseaseModelLabel labelFixture = null;

	/**
	 * This is the period of time (milliseconds) for the diease model rates.
	 * Value: 1 day.
	 */
	final public static long TEST_TIME_PERIOD = STEMTime.Units.DAY.getMilliseconds();

	/**
	 * Constructs a new Disease Model test case with the given name. <!--
	 * begin-user-doc -->
	 * 
	 * @param name
	 *            the name of the test
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDiseaseModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Disease Model test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StandardDiseaseModel getFixture() {
		return (StandardDiseaseModel)fixture;
	}

	

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getNormalizedEffectiveInfectious(org.eclipse.stem.core.graph.Node, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel, double, org.eclipse.emf.ecore.EAttribute, org.eclipse.emf.ecore.EAttribute, org.eclipse.emf.ecore.EAttribute) <em>Get Normalized Effective Infectious</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getNormalizedEffectiveInfectious(org.eclipse.stem.core.graph.Node, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel, double, org.eclipse.emf.ecore.EAttribute, org.eclipse.emf.ecore.EAttribute, org.eclipse.emf.ecore.EAttribute)
	 * @generated
	 */
	public void testGetNormalizedEffectiveInfectious__Node_StandardDiseaseModelLabel_double_EAttribute_EAttribute_EAttribute() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getBirthsCompartment() <em>Get Births Compartment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getBirthsCompartment()
	 * @generated
	 */
	public void testGetBirthsCompartment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#doDeaths(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, double) <em>Do Deaths</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#doDeaths(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, double)
	 * @generated
	 */
	public void testDoDeaths__StandardDiseaseModelLabelValue_StandardDiseaseModelLabelValue_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#doBirths(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, double) <em>Do Births</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#doBirths(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, double)
	 * @generated NOT
	 */
	public void testDoBirths__StandardDiseaseModelLabelValue_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#doDeaths(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, double) <em>Do Deaths</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#doDeaths(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue, double)
	 * @generated  NOT
	 */
	public void testDoDeaths__StandardDiseaseModelLabel_StandardDiseaseModelLabelValue_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getNormalizedEffectiveInfectious(org.eclipse.stem.core.graph.Node, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel, double, org.eclipse.emf.ecore.EAttribute) <em>Get Normalized Effective Infectious</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getNormalizedEffectiveInfectious(org.eclipse.stem.core.graph.Node, org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel, double, org.eclipse.emf.ecore.EAttribute)
	 * @generated
	 */
//	public void testGetNormalizedEffectiveInfectious__Node_StandardDiseaseModelLabel_double_EAttribute() {
//		// TODO: implement this operation test method
//		// Ensure that you remove @generated or mark it @generated NOT
//		fail();
//	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getNormalizedEffectiveInfectious(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel, org.eclipse.emf.common.util.EList) <em>Get Normalized Effective Infectious</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getNormalizedEffectiveInfectious(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
//	public void testGetNormalizedEffectiveInfectious__StandardDiseaseModelLabel_EList() {
//		// TODO: implement this operation test method
//		// Ensure that you remove @generated or mark it @generated NOT
//		fail();
//	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#calculateDelta(org.eclipse.stem.core.model.STEMTime, long, org.eclipse.emf.common.util.EList) <em>Calculate Delta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#calculateDelta(org.eclipse.stem.core.model.STEMTime, long, org.eclipse.emf.common.util.EList)
	 * @generated NOT
	 */
	public void testCalculateDelta__STEMTime_long_EList() {
		
		StandardDiseaseModel dModel = getFixture();
		/// must set the dublin core and URI to pass sanity
		// TODO each model fixture should probably do this.
		if(dModel.getURI()==null) {
			dModel.setURI(DiseaseModelTestUtil.DEFAULT_URI);
			DublinCore dc = dModel.getDublinCore();
			dc.setIdentifier(dModel.getURI().toString());
		}
		
		// if this is the aggregating disease model, there is no calculateDelta method to test
		boolean aggregatingModel = false;
		
		if( (dModel instanceof AggregatingSIDiseaseModel) ||
			(dModel instanceof AggregatingSIRDiseaseModel)||
			(dModel instanceof AggregatingSEIRDiseaseModel) ) aggregatingModel = true;
		
		if(!aggregatingModel) {
			// ALL other models
			STEMTime time = DiseaseModelTestUtil.getSTEMTime();
			long timeDelta = 1;
			EList<DynamicLabel> labels = dModel.getLabelsToUpdate();
			if(labels!=null) {
				DynamicLabel dLabel = getLabelFixture();
				labels.add(dLabel);
				assertTrue(dModel.sane());
				dModel.calculateDeltas(time, 0, timeDelta, labels);
				assertTrue(dModel.sane());
			} else {
				fail();
			}
		}
		
		
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#doModelSpecificAdjustments(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue) <em>Do Model Specific Adjustments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#doModelSpecificAdjustments(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue)
	 * @generated NOT
	 */
	public void testDoModelSpecificAdjustments__StandardDiseaseModelLabelValue() {
		StandardDiseaseModel dModel = getFixture();
		/// must set the dublin core and URI to pass sanity
		// TODO each model fixture should probably do this.
		if(dModel.getURI()==null) {
			dModel.setURI(DiseaseModelTestUtil.DEFAULT_URI);
			DublinCore dc = dModel.getDublinCore();
			dc.setIdentifier(dModel.getURI().toString());
		}
		
		// if this is the aggregating disease model, there is no calculateDelta method to test
		boolean aggregatingModel = false;
		
		
		if( (dModel instanceof AggregatingSIDiseaseModel) ||
			(dModel instanceof AggregatingSIRDiseaseModel)||
			(dModel instanceof AggregatingSEIRDiseaseModel) ) aggregatingModel = true;
		
		if(!aggregatingModel) {
			// ALL other models
			EList<DynamicLabel> labels = dModel.getLabelsToUpdate();
			if(labels!=null) {
				LabelValue dLabelValue = getLabelFixture().getCurrentValue();
				assertTrue(dModel.sane());
				assertTrue(dModel.sane());
			} else {
				fail();
			}
		}
		
		
	}


	/**
	 * @return a disease model label value to be used for testing
	 */
	private StandardDiseaseModelLabel getLabelFixture() {
		return labelFixture;
	} // getLabelFixture

	/**
	 * @param labelFixture
	 *            the disease model label value for testing
	 */
	protected void setLabelFixture(StandardDiseaseModelLabel labelFixture) {
		this.labelFixture = labelFixture;
	} // setLabelFixture

	/**
	 * Create a label value for testing.
	 */
	protected abstract StandardDiseaseModelLabel createLabelFixture();

	/**
	 * test getTransportEdgesToNode
	 * @generated NOT
	 */
	
	public void testGetTransportEdgesToNode() {
		final Graph fixture = DiseaseModelTestUtil.createLatticeGraph(2, 2,
				DiseaseModelTestUtil.TEST_POPULATION_COUNT,
				DiseaseModelTestUtil.TEST_AREA);
		final Node node = DiseaseModelTestUtil.getRegion(fixture, 1, 0);

		final List<Edge> transportEdges = TransportRelationshipLabelImpl
				.getTransportEdgesToNode(node,
						DiseaseModelTestUtil.TEST_POPULATION_IDENTIFIER);
		// 2 + 2 reflexive edges + 1 directed in to the node
		assertTrue(transportEdges.size() == 5);
	} // testGetTransportEdgesToNode



	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
		setLabelFixture(null);
	} // tearDown

} // StandardDiseaseModelTest
