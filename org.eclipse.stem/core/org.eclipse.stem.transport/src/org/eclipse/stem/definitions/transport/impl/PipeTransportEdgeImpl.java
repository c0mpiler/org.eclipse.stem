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
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.definitions.edges.impl.PopulationEdgeImpl;
import org.eclipse.stem.definitions.transport.PipeTransportEdge;
import org.eclipse.stem.definitions.transport.TransportFactory;
import org.eclipse.stem.definitions.transport.TransportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipe Transport Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PipeTransportEdgeImpl extends PopulationEdgeImpl implements PipeTransportEdge {
	
	/**
	 * This is used to generate unique URI's for each pipe transport edge generated
	 */
	static int pipeTransportEdgeCounter = 0;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PipeTransportEdgeImpl() {
		super();
		//set the URI
		setURI(STEMURI.createURI(URI_TYPE_PIPE_TRANSPORT_EDGE_SEGMENT + "/"
				+ Integer.toString(pipeTransportEdgeCounter++)));
			
		//Make a label
		setLabel(TransportFactory.eINSTANCE.createPipeTransportEdgeLabel());				
		
		//this edge must be directed
		setDirected(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportPackage.Literals.PIPE_TRANSPORT_EDGE;
	}

} //PipeTransportEdgeImpl
