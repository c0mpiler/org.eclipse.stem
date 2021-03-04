/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.codegen;

import org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

/**
 * EMF Generator Adapter Factory for creating a new code generator.  
 * The code generator created by this factory handles custom generation
 * of STEM Computational Models and conforms with the STEM API for 
 * both computational models and their UI components.
 * 
 * This class is not intended to be extended or subclassed.
 */
public class ModelGeneratorAdapterFactory extends AbstractGeneratorAdapterFactory
{
	@Override
	protected Adapter createAdapter(Notifier target) 
	{
		return new ModelGeneratorAdapter();
	}

	@Override
	public void dispose() { }
}
