// TimeProviderAdapterFactoryImplTest.java
package org.eclipse.stem.adapters.time;

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

import org.eclipse.stem.adapters.time.TimeProviderAdapterFactory.TimeProviderAdapterFactoryImpl;

/**
 * This class is a JUnit test case for {@link TimeProviderAdapterFactoryImpl}.
 */
@SuppressWarnings("all")
public class TimeProviderAdapterFactoryImplTest extends
		TimeProviderAdapterFactoryTest {

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
	public TimeProviderAdapterFactory createFixture() {
		return new TimeProviderAdapterFactory.TimeProviderAdapterFactoryImpl() {

			@Override
			public Object adapt(final Object target, final Object type) {
				return new TimeProviderAdapter() {

					/**
					 * @see org.eclipse.stem.adapters.history.
					 * 	TimeProviderAdapter#isAdapterForType(java.lang.Object)
					 */
					@Override
					public boolean isAdapterForType(final Object type) {
						return super.isAdapterForType(type);
					}
				};
			} // adapt
		};
	} // createFixture

} // TimeProviderAdapterFactoryImplTest