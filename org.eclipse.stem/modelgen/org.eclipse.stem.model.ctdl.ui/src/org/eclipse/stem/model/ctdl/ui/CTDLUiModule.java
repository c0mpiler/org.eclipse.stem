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
package org.eclipse.stem.model.ctdl.ui;

import org.eclipse.stem.model.ctdl.ui.highlight.CTDLHighlightConfiguration;
import org.eclipse.stem.model.ctdl.ui.highlight.CTDLSemanticHighlighter;
import org.eclipse.stem.model.ctdl.ui.hover.CTDLHoverProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator ;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CTDLUiModule extends org.eclipse.stem.model.ctdl.ui.AbstractCTDLUiModule {
	public CTDLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return CTDLHoverProvider.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return (Class<? extends ISemanticHighlightingCalculator>) CTDLSemanticHighlighter.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return CTDLHighlightConfiguration.class;
	}
}
