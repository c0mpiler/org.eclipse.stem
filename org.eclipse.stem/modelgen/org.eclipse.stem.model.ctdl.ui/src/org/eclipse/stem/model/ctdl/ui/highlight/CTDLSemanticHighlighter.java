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

import static org.eclipse.stem.model.ctdl.ui.highlight.CTDLHighlightConfiguration.ABSOLUTE_COMPARTMENT_ID;
import static org.eclipse.stem.model.ctdl.ui.highlight.CTDLHighlightConfiguration.BOOLEAN_ID;
import static org.eclipse.stem.model.ctdl.ui.highlight.CTDLHighlightConfiguration.FUNCTION_ID;
import static org.eclipse.stem.model.ctdl.ui.highlight.CTDLHighlightConfiguration.GLOBAL_VARIABLE_ID;
import static org.eclipse.stem.model.ctdl.ui.highlight.CTDLHighlightConfiguration.LOCAL_VARIABLE_ID;
import static org.eclipse.stem.model.ctdl.ui.highlight.CTDLHighlightConfiguration.MODEL_PARAMETER_ID;
import static org.eclipse.stem.model.ctdl.ui.highlight.CTDLHighlightConfiguration.RELATIVE_COMPARTMENT_ID;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.NUMBER_ID;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.STRING_ID;

import org.eclipse.stem.model.ctdl.ctdl.AbsoluteCompartmentValueReference;
import org.eclipse.stem.model.ctdl.ctdl.BooleanLiteral;
import org.eclipse.stem.model.ctdl.ctdl.DefStatement;
import org.eclipse.stem.model.ctdl.ctdl.DefStatementReference;
import org.eclipse.stem.model.ctdl.ctdl.FunctionCall;
import org.eclipse.stem.model.ctdl.ctdl.GlobalVariableReference;
import org.eclipse.stem.model.ctdl.ctdl.LocalVariableReference;
import org.eclipse.stem.model.ctdl.ctdl.ModelParamReference;
import org.eclipse.stem.model.ctdl.ctdl.NumberLiteral;
import org.eclipse.stem.model.ctdl.ctdl.RelativeCompartmentValueReference;
import org.eclipse.stem.model.ctdl.ctdl.StringLiteral;
import org.eclipse.stem.model.ctdl.ctdl.VariableReference;
import org.eclipse.stem.model.ctdl.ctdl.util.CtdlSwitch;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor ;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator ;

public class CTDLSemanticHighlighter implements ISemanticHighlightingCalculator
{

	
	
	private static final CtdlSwitch<String> semanticLookup = new CtdlSwitch<String>() {

		@Override
		public String caseVariableReference(VariableReference object) {
			return doSwitch(object.getRef());
		}

		
		
		@Override
		public String caseDefStatement(DefStatement object) {
			return null;
		}



		@Override
		public String caseDefStatementReference(DefStatementReference object) {
			return LOCAL_VARIABLE_ID;
		}



		@Override
		public String caseAbsoluteCompartmentValueReference(
				AbsoluteCompartmentValueReference object) {
			return ABSOLUTE_COMPARTMENT_ID;
		}

		@Override
		public String caseRelativeCompartmentValueReference(
				RelativeCompartmentValueReference object) {
			return RELATIVE_COMPARTMENT_ID;
		}

		@Override
		public String caseFunctionCall(FunctionCall object) {
			return null;
		}

		@Override
		public String caseLocalVariableReference(LocalVariableReference object) {
			return LOCAL_VARIABLE_ID;
		}

		@Override
		public String caseModelParamReference(ModelParamReference object) {
			return MODEL_PARAMETER_ID;
		}

		@Override
		public String caseGlobalVariableReference(GlobalVariableReference object) {
			return GLOBAL_VARIABLE_ID;
		}

		@Override
		public String caseNumberLiteral(NumberLiteral object) {
			return NUMBER_ID;
		}

		@Override
		public String caseStringLiteral(StringLiteral object) {
			return STRING_ID;
		}

		@Override
		public String caseBooleanLiteral(BooleanLiteral object) {
			return BOOLEAN_ID;
		}
		
		
		
		
	};

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
if (resource == null || resource.getParseResult() == null) return;
		
		INode root = resource.getParseResult().getRootNode();
	    for (INode node : root.getAsTreeIterable()) {
	    	
//	    	System.out.println("Node: "+ node.getText() + " -> "+ node.getSemanticElement() +" -> "+ node.getGrammarElement());
	    	
	    	String configRef = null;
	    	
	    	if (node.getSemanticElement() instanceof FunctionCall && node.getGrammarElement() instanceof CrossReference) {
	    		configRef = FUNCTION_ID;
	    	} else if (node.getSemanticElement() instanceof DefStatement && node.getGrammarElement() instanceof RuleCall) {
	    		configRef = LOCAL_VARIABLE_ID;
	    	} else {
	    		configRef = semanticLookup.doSwitch(node.getSemanticElement());
	    	}
	    	
	    	if (configRef != null) {
	    		acceptor.addPosition(node.getOffset(), node.getLength(), configRef);
//	    		System.out.println("       Config Ref -> "+configRef);
	    	}
	    	
	    }
		
	}
	
}
