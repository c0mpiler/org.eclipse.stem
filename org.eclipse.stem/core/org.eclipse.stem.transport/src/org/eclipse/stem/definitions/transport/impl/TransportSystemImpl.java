package org.eclipse.stem.definitions.transport.impl;

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
import org.eclipse.stem.core.graph.impl.NodeImpl;
import org.eclipse.stem.definitions.transport.TransportPackage;
import org.eclipse.stem.definitions.transport.TransportSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TransportSystemImpl extends NodeImpl implements TransportSystem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TransportSystemImpl() {
		super();				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportPackage.Literals.TRANSPORT_SYSTEM;
	}
	
	/**
	 * Make sure that this transport system is sane(). That is that it has all of the properties that
	 * a transport system must have...namely some population label.
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();
		
//		// A Transportation System should have a population label
		// Not clear that this is true
//		retValue = false;
//		for (NodeLabel l:this.getLabels()) {
//			// Found a population label?
//			if (l instanceof PopulationLabel) {
//				// Yes
//				retValue = true;
//				break;
//			} // if PopulationLabel
//		}
//		assert retValue;
		return retValue;
	} // sane

} //TransportSystemImpl
