package org.eclipse.stem.core.predicate.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.predicate.Or;
import org.eclipse.stem.core.predicate.Predicate;
import org.eclipse.stem.core.predicate.PredicatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OrImpl extends NaryBooleanOperatorImpl implements Or {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PredicatePackage.Literals.OR;
	}

	/**
	 * @see org.eclipse.stem.core.predicate.impl.PredicateImpl#evaluate(org.eclipse.stem.core.model.STEMTime, long, org.eclipse.stem.core.model.Decorator)
	 */
	@Override
	public boolean evaluate(STEMTime time, long timerPeriod, Graph graph) {
		boolean retValue = false;
		for (Predicate predicate : getOperands()) {
			retValue = predicate.evaluate(time, timerPeriod,  graph);
			// One is true?
			if (retValue) {
				// Yes
				break;
			} // if 
		} // for each Predicate
		return retValue;
	} // evaluate

	
} //OrImpl
