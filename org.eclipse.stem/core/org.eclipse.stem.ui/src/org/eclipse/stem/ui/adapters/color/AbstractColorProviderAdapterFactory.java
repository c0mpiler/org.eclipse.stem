// AbstractColorProviderAdapterFactory.java
package org.eclipse.stem.ui.adapters.color;

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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.stem.core.graph.util.GraphAdapterFactory;

/**
 * This is an abstract class that ColorProviderAdapterFactory should extend.
 * It holds the common information for all color providers and has few abstract methods
 * that the concrete class should override.
 */
public abstract class AbstractColorProviderAdapterFactory extends GraphAdapterFactory
	implements IColorProviderAdapterFactory, ComposeableAdapterFactory {
	
	/**
	 * @see org.eclipse.stem.core.graph.util.GraphAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	public abstract boolean isFactoryForType(Object type);	
}
