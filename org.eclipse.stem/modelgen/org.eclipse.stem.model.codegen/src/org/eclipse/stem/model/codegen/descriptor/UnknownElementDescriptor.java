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
package org.eclipse.stem.model.codegen.descriptor;

import java.util.Arrays;

import org.eclipse.core.runtime.IConfigurationElement;

public class UnknownElementDescriptor
{
	protected IConfigurationElement element;
	
	public UnknownElementDescriptor(IConfigurationElement element) 
	{
		super();
		this.element = element;
	}
	
	public IConfigurationElement getConfigurationElement()
	{
		return element;
	}
	
	@Override
	public String toString() 
	{
		return "UnknownElementDescriptor [name=" + element.getName()
				+ ", attributes=" + Arrays.asList(element.getAttributeNames()) + "]";
	}		
}