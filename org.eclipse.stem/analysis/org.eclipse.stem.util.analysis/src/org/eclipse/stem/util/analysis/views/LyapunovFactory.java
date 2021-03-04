// EstimatorFactory.java
package org.eclipse.stem.util.analysis.views;

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
 * This class is a factory for creating {@link AnalysisControl} instances.
 */
public class LyapunovFactory implements AnalysisControlFactory {

	/**
	 * public INSTANCE for this Factory
	 */
	public static LyapunovFactory INSTANCE = new LyapunovFactory();

	/**
	 * Constants 
	 */
	public static final String ANALYSIS_TYPE = "Lyapunov";
	

	/**
	 * 
	 * @param parent
	 * @param dirName
	 * @return new LyapunovControl()
	 */
	public AnalysisControl create(final Composite parent, String dirName) {
				
		return new LyapunovControl(parent);
	}
	

	/**
	 * @return type of analysis
	 * 
	 */
	public String getControlType() {
		return ANALYSIS_TYPE;
	}

} // EstimatorFactory
