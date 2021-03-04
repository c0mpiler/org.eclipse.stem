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
package org.eclipse.stem.model.ctdl.ui.highlight;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CTDLHighlightConfiguration extends DefaultHighlightingConfiguration
{
	public static final String FUNCTION_ID = "function";
	public static final String RELATIVE_COMPARTMENT_ID = "compartmentRelative";
	public static final String ABSOLUTE_COMPARTMENT_ID = "compartmentAbsolute";
	public static final String GLOBAL_VARIABLE_ID = "variableGlobal";
	public static final String LOCAL_VARIABLE_ID = "variableLocal";
	public static final String MODEL_PARAMETER_ID = "modelParameter";
	
	public static final String BOOLEAN_ID = "boolean";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		
		acceptor.acceptDefaultHighlighting(BOOLEAN_ID, "Boolean", booleanTextStyle());
		
		acceptor.acceptDefaultHighlighting(MODEL_PARAMETER_ID, "Model Parameter", modelParameterTextStyle());
		acceptor.acceptDefaultHighlighting(GLOBAL_VARIABLE_ID, "Global Variable", globalVariableTextStyle());
		acceptor.acceptDefaultHighlighting(LOCAL_VARIABLE_ID, "Local Variable", localVariableTextStyle());
		
		acceptor.acceptDefaultHighlighting(RELATIVE_COMPARTMENT_ID, "Relative Compartment", relativeCompartmentTextStyle());
		acceptor.acceptDefaultHighlighting(ABSOLUTE_COMPARTMENT_ID, "Absolute Compartment", absoluteCompartmentTextStyle());
		acceptor.acceptDefaultHighlighting(FUNCTION_ID, "Function", functionTextStyle());
	}
	
	public TextStyle numberTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(102, 102, 102));
		return textStyle;
	}
	
	public TextStyle booleanTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(128,0,128));
		return textStyle;
	}
	
	public TextStyle modelParameterTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(165,0,0));
		return textStyle;
	}
	
	public TextStyle globalVariableTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(64,0,128));
		return textStyle;
	}
	
	public TextStyle localVariableTextStyle() {
		TextStyle textStyle = globalVariableTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle relativeCompartmentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 128, 0));
		return textStyle;
	}
	
	public TextStyle absoluteCompartmentTextStyle() {
		TextStyle textStyle = relativeCompartmentTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle functionTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 64, 128));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	

}
