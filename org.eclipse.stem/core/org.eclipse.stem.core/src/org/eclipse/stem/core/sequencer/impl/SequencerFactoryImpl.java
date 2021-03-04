package org.eclipse.stem.core.sequencer.impl;

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
import org.eclipse.stem.core.sequencer.RealTimeSequencer;
import org.eclipse.stem.core.sequencer.SequencerFactory;
import org.eclipse.stem.core.sequencer.SequencerPackage;
import org.eclipse.stem.core.sequencer.SequentialSequencer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequencerFactoryImpl extends EFactoryImpl implements SequencerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SequencerFactory init() {
		try {
			SequencerFactory theSequencerFactory = (SequencerFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/core/sequencer.ecore"); //$NON-NLS-1$ 
			if (theSequencerFactory != null) {
				return theSequencerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SequencerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencerFactoryImpl() {
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
			case SequencerPackage.REAL_TIME_SEQUENCER: return createRealTimeSequencer();
			case SequencerPackage.SEQUENTIAL_SEQUENCER: return createSequentialSequencer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealTimeSequencer createRealTimeSequencer() {
		RealTimeSequencerImpl realTimeSequencer = new RealTimeSequencerImpl();
		return realTimeSequencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialSequencer createSequentialSequencer() {
		SequentialSequencerImpl sequentialSequencer = new SequentialSequencerImpl();
		return sequentialSequencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencerPackage getSequencerPackage() {
		return (SequencerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SequencerPackage getPackage() {
		return SequencerPackage.eINSTANCE;
	}

} //SequencerFactoryImpl
