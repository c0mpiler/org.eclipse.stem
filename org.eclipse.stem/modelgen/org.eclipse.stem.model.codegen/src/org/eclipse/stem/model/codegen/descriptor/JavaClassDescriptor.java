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

public class JavaClassDescriptor 
{
	public String className;

	public JavaClassDescriptor(String className) 
	{
		this.className = className;
	}
	
	public String getQualifiedClassName()
	{
		return className;
	}

	@Override
	public String toString() {
		return "JavaClassDescriptor [className=" + className + "]";
	}
	
}