// RelativeValueProviderAdapterFactoryImplTest.java
package org.eclipse.stem.definitions.adapters.relativevalue;

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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory.RelativeValueProviderAdapterFactoryImpl;


/**
 * This class is a JUnit test case for
 * {@link RelativeValueProviderAdapterFactoryImpl}.
 */
@SuppressWarnings("all")
final public class RelativeValueProviderAdapterFactoryImplTest extends
		RelativeValueProviderAdapterFactoryTest {

	@Override
	protected void setUp() throws Exception {
		setFixture(createFixture());
	}

	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * @return the fixture for testing
	 */
	public RelativeValueProviderAdapterFactory createFixture() {
		return new RelativeValueProviderAdapterFactory.RelativeValueProviderAdapterFactoryImpl() {

			@Override
			public Object adapt(Object target, Object type) {
				return new RelativeValueProviderAdapter() {
					@Override
					public List<IItemPropertyDescriptor> getProperties() {
						return null;
					}

					@Override
					public double getRelativeValue(EStructuralFeature feature) {
						return 0;
					}
					
					@Override
					public double getDenominator(EStructuralFeature feature) {
						return 0.0;
					}
					
				};
			} // adapt
		};
	} // createFixture

} // RelativeValueProviderAdapterFactoryImplTest
