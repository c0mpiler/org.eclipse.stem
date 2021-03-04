package org.eclipse.stem.core;

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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * A binary resource factor used to create compact resources suitable for sending
 * across networks etc.
 */

public class STEMBinaryResourceFactoryImpl extends XMIResourceFactoryImpl {

	public static STEMBinaryResourceFactoryImpl INSTANCE = new STEMBinaryResourceFactoryImpl();


	/**
	 * private so only a singleton instance is created
	 * 
	 * @see #INSTANCE
	 */
	private STEMBinaryResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResource(URI uri) {
		Resource newRes = new BinaryResourceImpl(uri);
		return newRes;
	} // createResource
	
	
} // STEMBinaryResourceFactoryImpl
