package org.eclipse.stem.tests.util.decorators.impl;

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

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.NodeDecoratorImpl;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.tests.util.TestUtil;
import org.eclipse.stem.tests.util.decorators.DecoratorsPackage;
import org.eclipse.stem.tests.util.decorators.TestNodeDecorator1;
import org.eclipse.stem.tests.util.labels.TestDynamicLabel1;
import org.eclipse.stem.tests.util.labels.TestDynamicNodeLabel;
import org.eclipse.stem.tests.util.labels.TestIntegerLabelValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Test Node Decorator1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TestNodeDecorator1Impl extends NodeDecoratorImpl implements
		TestNodeDecorator1 {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TestNodeDecorator1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecoratorsPackage.Literals.TEST_NODE_DECORATOR1;
	}

	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#decorateGraph(org.eclipse.stem.core.graph.Graph)
	 * @generated NOT
	 */
	@SuppressWarnings("unused")
	@Override
	public void decorateGraph(STEMTime time)  throws ScenarioInitializationException {
		if (isGraphDecorated()) return;
		
		//getGraph().getDecorators().add(tnd);
		for (final Iterator nodeIter = getGraph().getNodes().values().iterator(); nodeIter
				.hasNext();) {
			final Node node = (Node) nodeIter.next();
			final DynamicNodeLabel dynamicNodeLabel = TestUtil.createDynamicNodeLabel(node.getURI(), this);
			getGraph().putNodeLabel(dynamicNodeLabel);
			getLabelsToUpdate().add(dynamicNodeLabel);
			node.getLabels().add(dynamicNodeLabel);
		} // for
		
		setGraphDecorated(true);
		return;
	} // decorateGraph

	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#updateLabels(Graph, STEMTime, long)
	 * @generated NOT
	 */
	@Override
	public void updateLabels(STEMTime time, final long timeDelta, int cycle) {
		for (final Iterator dynamicLabelIter = getLabelsToUpdate().iterator(); dynamicLabelIter
				.hasNext();) {
			final DynamicLabel testLabel = (DynamicLabel) dynamicLabelIter
					.next();
			if (testLabel instanceof TestDynamicLabel1) {
				TestDynamicLabel1 tdl1 = (TestDynamicLabel1) testLabel;
				tdl1.increment();
			}
			if (testLabel instanceof TestDynamicNodeLabel) {
				TestDynamicNodeLabel tdnl = (TestDynamicNodeLabel) testLabel;
				tdnl.increment();
			}
		} // for
	} // updateLabels

	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#resetLabels(org.eclipse.stem.core.graph.Graph)
	 * @generated NOT
	 */
	@Override
	public void resetLabels() {
		final TestDynamicLabel1 TEST_LABEL = TestUtil
				.createDynamicLabel(TestUtil.createNextIdentifiableToLabelURI());
		final TestIntegerLabelValue RESET_VALUE = (TestIntegerLabelValue) TEST_LABEL
				.getCurrentValue();
		for (Iterator labelIter = getLabelsToUpdate().iterator(); labelIter
				.hasNext();) {
			final DynamicLabel dynamicLabel = (DynamicLabel) labelIter
					.next();
			dynamicLabel.setCurrentValue(EcoreUtil.copy(RESET_VALUE));
		}
	} // resetLabels

} // TestNodeDecorator1Impl
