// AnalysisControlFactory.java
package org.eclipse.stem.analysis.automaticexperiment.views;

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

import org.eclipse.swt.widgets.Composite;

/**
 * This interface is implemented by factories that create instances of
 * {@link AnalysisControl}.
 */
public interface AnalysisControlFactory {

	/**
	 * 
	 * @param parent 
	 * @return the AnalysisControl
	 */
	AnalysisControl create(final Composite parent);

	/**
	 * @return TODO JFK
	 */
	public String getControlType();

} // AnalysisControlFactory
