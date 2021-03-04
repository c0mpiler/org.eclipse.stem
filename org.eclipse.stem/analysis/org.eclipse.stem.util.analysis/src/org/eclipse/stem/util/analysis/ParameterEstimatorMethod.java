package org.eclipse.stem.util.analysis;

import org.eclipse.stem.analysis.DiseaseType;




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

/**
 * Add any new parameter estimation method you create to the list in this enumeration
 * to ensure it becomes available from the parameter estimator selection
 * wizard. Also provide a brief description of the method.
 * 
 * You also need to modify the factory method to ensure it can create
 * an instance of the parameter estimator implementing the method.
 */
public enum ParameterEstimatorMethod {	
	/**
	 * If method = SEIR_METHOD, then SEIR model used
	 */
	SEIR("SEIR", "An SEIR parameter estimator", DiseaseType.SEIR),
	/**
	 * If method = SIR_METHOD, then SIR model used
	 */
	SIR("SIR", "An SIR parameter estimator", DiseaseType.SIR),
	/**
	 * If method = SI_METHOD, then SI model used
	 */
	SI("SI", "An SI parameter estimator", DiseaseType.SI),
	/**
	 * If method = NONLINEAR_SEIR_METHOD, then SEIR method for beta function used
	 */
	NONLINEARSEIR("NonLinear SEIR", "A non-linear SEIR parameter estimator", DiseaseType.SEIR);
	
	String name;
	String descripton;
	DiseaseType type;
	
	private ParameterEstimatorMethod(String name, String description, DiseaseType type) {
		this.name = name;
		this.descripton = description;
		this.type = type;
	}
	
	/**
	 * Name (as it shows up in the wizard)
	 * @return String The name
	 */
	public String getName() {return this.name;}
	
	/**
	 * Description (as it shows up in the Wizard)
	 * @return String Description
	 */
	public String getDescription() {return this.descripton;}
	
	/**
	 * getType. Return the type of the method (determines
	 * which input data can be used)
	 * @return DiseaseType The type
	 */
	public DiseaseType getType() {return this.type;}
	
}
