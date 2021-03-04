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
package org.eclipse.stem.model.ctdl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Function;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class CTDLProposalProvider extends AbstractCTDLProposalProvider 
{
	/**
	 * sets the selection on the arguments for proposed functions.
	 */
	@Override
	public void completePrimaryExpression_Ref(EObject model,
			Assignment assignment, ContentAssistContext context,
			final ICompletionProposalAcceptor acceptor) {
		super.completePrimaryExpression_Ref(model, assignment, context, new ICompletionProposalAcceptor.Delegate(acceptor) {

			public void accept(ICompletionProposal proposal) {
				if (proposal instanceof ConfigurableCompletionProposal) {
					ConfigurableCompletionProposal ccp = (ConfigurableCompletionProposal) proposal;
					String string = ccp.getReplacementString();
					int indexOfOpenPar = string.indexOf('(');
					if (indexOfOpenPar!=-1) {
						int oldSelectionStart = ccp.getSelectionStart();
						ccp.setSelectionStart(oldSelectionStart-string.length()+indexOfOpenPar+1);
						ccp.setSelectionLength(oldSelectionStart-ccp.getSelectionStart()-1);
					}
				}
				super.accept(proposal);
			}

		});
	}
	
	@Override
	protected String getDisplayString(EObject element,
			String qualifiedNameAsString, String shortName) {
		return super.getDisplayString(element, qualifiedNameAsString, shortName);
	}
	
	@Override
	protected Function<IEObjectDescription, ICompletionProposal> getProposalFactory(
			String ruleName, ContentAssistContext contentAssistContext) {
		// hackish: ignore concrete syntax constraints since we export functions with parenths
		return super.getProposalFactory(null, contentAssistContext);
	}	
	
}
