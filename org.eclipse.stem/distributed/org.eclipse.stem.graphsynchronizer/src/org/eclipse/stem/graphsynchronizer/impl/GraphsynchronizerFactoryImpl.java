package org.eclipse.stem.graphsynchronizer.impl;

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
import org.eclipse.stem.graphsynchronizer.GraphsynchronizerFactory;
import org.eclipse.stem.graphsynchronizer.GraphsynchronizerPackage;
import org.eclipse.stem.graphsynchronizer.SynchGraphPartitioner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphsynchronizerFactoryImpl extends EFactoryImpl implements GraphsynchronizerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphsynchronizerFactory init() {
		try {
			GraphsynchronizerFactory theGraphsynchronizerFactory = (GraphsynchronizerFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/graphsynchronizer/graphsynchronizer.ecore"); 
			if (theGraphsynchronizerFactory != null) {
				return theGraphsynchronizerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphsynchronizerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphsynchronizerFactoryImpl() {
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
			case GraphsynchronizerPackage.SYNCH_GRAPH_PARTITIONER: return createSynchGraphPartitioner();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchGraphPartitioner createSynchGraphPartitioner() {
		SynchGraphPartitionerImpl synchGraphPartitioner = new SynchGraphPartitionerImpl();
		return synchGraphPartitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphsynchronizerPackage getGraphsynchronizerPackage() {
		return (GraphsynchronizerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphsynchronizerPackage getPackage() {
		return GraphsynchronizerPackage.eINSTANCE;
	}

} //GraphsynchronizerFactoryImpl
