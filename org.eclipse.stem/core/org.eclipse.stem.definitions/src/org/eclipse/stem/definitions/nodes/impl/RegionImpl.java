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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.definitions.nodes.NodesPackage;
import org.eclipse.stem.definitions.nodes.Region;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RegionImpl extends GeographicFeatureImpl implements Region {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * @param nodeCode
	 *            the code for the region
	 * @return the URI for a specific region node
	 */
	public static URI createRegionNodeURI(String nodeCode) {
		final URI retValue = STEMURI.createURI(URI_TYPE_REGION_NODE_SEGMENT
				+ "/" + nodeCode);
		return retValue;
	} // createRegionNodeURI

//	/**
//	 * @param adminLevel
//	 *            the administration level of the region
//	 * @param countryCode
//	 *            the ISO-3166-1 code for the country containing the region
//	 * @param nodeCode
//	 *            the code for the region
//	 * @return the URI for a specific region node
//	 */
//	public static URI createRegionNodeURI(int adminLevel,
//			final String countryCode, String nodeCode) {
//		final URI retValue = STEMURI.createURI(URI_TYPE_REGION_NODE_SEGMENT
//				+ "/" + countryCode + "/" + adminLevel + "/" + nodeCode);
//		return retValue;
//	} // createRegionNodeURI

	
					/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodesPackage.Literals.REGION;
	}

} // RegionImpl
