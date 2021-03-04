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
package org.eclipse.stem.evolvingcrossspeciesmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelFactory;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolvingCrossSpeciesModelFactoryImpl extends EFactoryImpl implements EvolvingCrossSpeciesModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvolvingCrossSpeciesModelFactory init() {
		try {
			EvolvingCrossSpeciesModelFactory theEvolvingCrossSpeciesModelFactory = (EvolvingCrossSpeciesModelFactory)EPackage.Registry.INSTANCE.getEFactory(EvolvingCrossSpeciesModelPackage.eNS_URI);
			if (theEvolvingCrossSpeciesModelFactory != null) {
				return theEvolvingCrossSpeciesModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvolvingCrossSpeciesModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingCrossSpeciesModelFactoryImpl() {
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
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL: return createEvolvingCrossSpeciesModelLabel();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE: return createEvolvingCrossSpeciesModelLabelValue();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL: return createEvolvingCrossSpeciesModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingCrossSpeciesModelLabel createEvolvingCrossSpeciesModelLabel() {
		EvolvingCrossSpeciesModelLabelImpl evolvingCrossSpeciesModelLabel = new EvolvingCrossSpeciesModelLabelImpl();
		return evolvingCrossSpeciesModelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingCrossSpeciesModelLabelValue createEvolvingCrossSpeciesModelLabelValue() {
		EvolvingCrossSpeciesModelLabelValueImpl evolvingCrossSpeciesModelLabelValue = new EvolvingCrossSpeciesModelLabelValueImpl();
		return evolvingCrossSpeciesModelLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingCrossSpeciesModel createEvolvingCrossSpeciesModel() {
		EvolvingCrossSpeciesModelImpl evolvingCrossSpeciesModel = new EvolvingCrossSpeciesModelImpl();
		return evolvingCrossSpeciesModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingCrossSpeciesModelPackage getEvolvingCrossSpeciesModelPackage() {
		return (EvolvingCrossSpeciesModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvolvingCrossSpeciesModelPackage getPackage() {
		return EvolvingCrossSpeciesModelPackage.eINSTANCE;
	}

} //EvolvingCrossSpeciesModelFactoryImpl
