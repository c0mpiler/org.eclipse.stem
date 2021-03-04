package org.eclipse.stem.definitions.nodes.impl;

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
import org.eclipse.stem.definitions.nodes.GeographicFeature;
import org.eclipse.stem.definitions.nodes.NodesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geographic Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GeographicFeatureImpl extends NodeImpl  implements GeographicFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeographicFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodesPackage.Literals.GEOGRAPHIC_FEATURE;
	}

} //GeographicFeatureImpl