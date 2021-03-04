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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.definitions.transport.PipeStyleTransportSystem;
import org.eclipse.stem.definitions.transport.PipeTransportEdge;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabel;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabelValue;
import org.eclipse.stem.definitions.transport.TransportFactory;
import org.eclipse.stem.definitions.transport.TransportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransportFactoryImpl extends EFactoryImpl implements TransportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransportFactory init() {
		try {
			TransportFactory theTransportFactory = (TransportFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/definitions/transport.ecore"); 
			if (theTransportFactory != null) {
				return theTransportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TransportPackage.PIPE_STYLE_TRANSPORT_SYSTEM: return createPipeStyleTransportSystem();
			case TransportPackage.PIPE_TRANSPORT_EDGE: return createPipeTransportEdge();
			case TransportPackage.PIPE_TRANSPORT_EDGE_LABEL: return createPipeTransportEdgeLabel();
			case TransportPackage.PIPE_TRANSPORT_EDGE_LABEL_VALUE: return createPipeTransportEdgeLabelValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeStyleTransportSystem createPipeStyleTransportSystem() {
		PipeStyleTransportSystemImpl pipeStyleTransportSystem = new PipeStyleTransportSystemImpl();
		return pipeStyleTransportSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeTransportEdge createPipeTransportEdge() {
		PipeTransportEdgeImpl pipeTransportEdge = new PipeTransportEdgeImpl();
		return pipeTransportEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeTransportEdgeLabel createPipeTransportEdgeLabel() {
		PipeTransportEdgeLabelImpl pipeTransportEdgeLabel = new PipeTransportEdgeLabelImpl();
		return pipeTransportEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeTransportEdgeLabelValue createPipeTransportEdgeLabelValue() {
		PipeTransportEdgeLabelValueImpl pipeTransportEdgeLabelValue = new PipeTransportEdgeLabelValueImpl();
		return pipeTransportEdgeLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportPackage getTransportPackage() {
		return (TransportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransportPackage getPackage() {
		return TransportPackage.eINSTANCE;
	}

} //TransportFactoryImpl
