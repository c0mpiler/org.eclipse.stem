package org.eclipse.stem.analysis;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;


/**
* The class stores scenario reference data for a scenario disease as well as additional meta-data. 
* 
* @model
* @generated NOT
*/
@SuppressWarnings("all")
public interface ReferenceScenarioDataMap extends EObject {		
	
	/**
	 * Is this map (and the model that created it) sane?
	 * @return
	 */
	public boolean sane();
	
	/**
	 * Is this map consistent with another map?
	 * This is like "equal" but allows for small differences when comparing double(s)
	 * @param other
	 * @return
	 */
	public boolean consistentWith(ReferenceScenarioDataMapImpl other);
}
