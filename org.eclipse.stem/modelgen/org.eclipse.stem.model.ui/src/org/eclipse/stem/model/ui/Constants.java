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
package org.eclipse.stem.model.ui;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.stem.core.common.CommonPackage;

public interface Constants 
{
	public static final String EMPTY_STRING = "";
	
	public static final String MODEL_NATURE_ID = "org.eclipse.stem.model.ui.ModelProjectNature";
	
	public static final EClassifier[] DEFAULT_PARAM_DATA_TYPES = new EClassifier[] {
		EcorePackage.Literals.EDOUBLE,
		EcorePackage.Literals.EINT,
		EcorePackage.Literals.ELONG,
		EcorePackage.Literals.ESHORT,
		/*EcorePackage.Literals.ECHAR,*/
		EcorePackage.Literals.ESTRING,
		EcorePackage.Literals.EBOOLEAN,
		CommonPackage.Literals.DOUBLE_VALUE,
		CommonPackage.Literals.DOUBLE_VALUE_LIST,
		CommonPackage.Literals.DOUBLE_VALUE_MATRIX,
		CommonPackage.Literals.STRING_VALUE,
		CommonPackage.Literals.STRING_VALUE_LIST
	};
	
	public static final EDataType[] DEFAULT_COMPARTMENT_DATA_TYPES = new EDataType[] {
		EcorePackage.Literals.EDOUBLE
	};
	
	public static final String[] DEFAULT_PARAM_CONSTRAINTS = {"minValue", "maxValue"};
}
