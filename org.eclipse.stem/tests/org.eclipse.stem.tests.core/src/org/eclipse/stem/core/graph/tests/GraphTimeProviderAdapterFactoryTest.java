// GraphTimeProviderAdapterFactoryTest.java
package org.eclipse.stem.core.graph.tests;

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

import org.eclipse.stem.adapters.time.TimeProvider;
import org.eclipse.stem.adapters.time.TimeProviderAdapterFactory;
import org.eclipse.stem.adapters.time.TimeProviderAdapterFactoryImplTest;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.provider.GraphTimeProviderAdapterFactory;
import org.eclipse.stem.core.model.ModelFactory;
import org.eclipse.stem.core.model.STEMTime;

/**
 * This class is a JUnit test of the {@link GraphTimeProviderAdapterFactory}.
 */
public class GraphTimeProviderAdapterFactoryTest extends
		TimeProviderAdapterFactoryImplTest {

	private final STEMTime TEST_TIME = ModelFactory.eINSTANCE.createSTEMTime();
	
	/**
	 * @see
	 * 	org.eclipse.stem.adapters.time.TimeProviderAdapterFactoryImplTest
	 * 	#createFixture()
	 */
	@Override
	public TimeProviderAdapterFactory createFixture() {
		return new GraphTimeProviderAdapterFactory();
	}

	private GraphTimeProviderAdapterFactory getFixture() {
		return (GraphTimeProviderAdapterFactory) fixture;
	} // getFixture

	public void testAdaptGraph() {
		final GraphTimeProviderAdapterFactory fixture = getFixture();
		final Graph graph = GraphTest.createFixture();

		final TimeProvider tp = (TimeProvider) fixture.adapt(graph,
				TimeProvider.class);
		assertNotNull(tp);

		STEMTime graphTime = tp.getTime();
		assertNull(graphTime);
		
		graph.switchToNextValue(TEST_TIME);
		graphTime = tp.getTime();
		
		assertNotNull(graphTime);
		assertTrue(graphTime.valueEquals(TEST_TIME));
	} // testAdaptGraph
} // GraphTimeProviderAdapterFactoryTest