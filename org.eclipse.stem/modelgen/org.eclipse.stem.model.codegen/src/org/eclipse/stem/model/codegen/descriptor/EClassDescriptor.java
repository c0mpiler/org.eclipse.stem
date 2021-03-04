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

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.ecore.EClass;

public class EClassDescriptor
{
	protected String ePackageNS;
	protected String className;

	public EClassDescriptor(String ePackageNS, String className) 
	{
		super();
		this.ePackageNS = ePackageNS;
		this.className = className;
	}
	
	
	public String getNSURI() 
	{
		return ePackageNS;
	}

	public String getClassName() 
	{
		return className;
	}

	
	public boolean isSuperTypeOf(GenClass genClass)
	{
		if (genClass != null && 
				(equalTo(genClass) || isSuperTypeOf(genClass.getBaseGenClass()))) {
			return true;
		}
		
		return false;
	}
	
	public boolean isSuperTypeOf(EClass eClass)
	{
		if (eClass != null) {
//			if (equalTo(eClass)) {
//				return true;
//			}
			
			for (EClass superClass : eClass.getEAllSuperTypes()) {
				if (equalTo(superClass)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean equalTo(GenClass genClass)
	{
		return genClass.getGenPackage().getNSURI().equals(ePackageNS) &&
				genClass.getName().equals(className);
	}
	
	public boolean equalTo(EClass eClass)
	{
		if (eClass == null || eClass.getEPackage() == null) {
			return false;
		}
		return eClass.getEPackage().getNsURI().equals(ePackageNS) &&
				eClass.getName().equals(className);
	}
	
	@Override
	public String toString() {
		return "EClassDescriptor [ePackageNS=" + ePackageNS
				+ ", className=" + className + "]";
	}
}