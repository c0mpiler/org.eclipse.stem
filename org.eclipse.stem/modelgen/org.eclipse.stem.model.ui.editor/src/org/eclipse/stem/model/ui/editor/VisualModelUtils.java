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
package org.eclipse.stem.model.ui.editor;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.swt.widgets.Text;

public final class VisualModelUtils 
{
	private VisualModelUtils() {}

	public static CompartmentElement findCompartmentElementForCompartment(Compartment compartment, ModelElement me) {
		for (CompartmentElement ce : me.getCompartmentElements()) {
			if (ce.getCompartment() == compartment) {
				return ce;
			}
		}
		return null;
	}
	
	public static boolean isCompartmentDirectlyContained(Compartment compartment, CompartmentGroup cg) {
		for (Compartment c : cg.getCompartments()) {
			if (c == compartment) {
				return false;
			}
		}
		return true;
	}
	
	public static String safeGet(String value) {
		if (value == null) {
			return Constants.EMPTY_STRING;
		}
		return value;
	}

	public static String safeGet(Text field) {
		if (Constants.EMPTY_STRING.equals(field.getText().trim())) {
			return null;
		}
		return field.getText();
	}
	
	public static EDataType[] getDefaultCompartmentDataTypes() {
		return Constants.DEFAULT_COMPARTMENT_DATA_TYPES;
	}
}
