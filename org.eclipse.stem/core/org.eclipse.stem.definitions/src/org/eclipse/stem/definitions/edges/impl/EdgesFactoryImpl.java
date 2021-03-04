package org.eclipse.stem.definitions.edges.impl;

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
import org.eclipse.stem.definitions.edges.*;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabel;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabelValue;
import org.eclipse.stem.definitions.edges.MixingEdge;
import org.eclipse.stem.definitions.edges.MixingEdgeLabel;
import org.eclipse.stem.definitions.edges.MixingEdgeLabelValue;
import org.eclipse.stem.definitions.edges.PopulationEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgesFactoryImpl extends EFactoryImpl implements EdgesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdgesFactory init() {
		try {
			EdgesFactory theEdgesFactory = (EdgesFactory)EPackage.Registry.INSTANCE.getEFactory(EdgesPackage.eNS_URI);
			if (theEdgesFactory != null) {
				return theEdgesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdgesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgesFactoryImpl() {
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
			case EdgesPackage.MIGRATION_EDGE: return createMigrationEdge();
			case EdgesPackage.MIGRATION_EDGE_LABEL: return createMigrationEdgeLabel();
			case EdgesPackage.MIGRATION_EDGE_LABEL_VALUE: return createMigrationEdgeLabelValue();
			case EdgesPackage.MIXING_EDGE: return createMixingEdge();
			case EdgesPackage.MIXING_EDGE_LABEL: return createMixingEdgeLabel();
			case EdgesPackage.MIXING_EDGE_LABEL_VALUE: return createMixingEdgeLabelValue();
			case EdgesPackage.POPULATION_EDGE: return createPopulationEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MigrationEdge createMigrationEdge() {
		MigrationEdgeImpl migrationEdge = new MigrationEdgeImpl();
		return migrationEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MigrationEdgeLabel createMigrationEdgeLabel() {
		MigrationEdgeLabelImpl migrationEdgeLabel = new MigrationEdgeLabelImpl();
		return migrationEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MigrationEdgeLabelValue createMigrationEdgeLabelValue() {
		MigrationEdgeLabelValueImpl migrationEdgeLabelValue = new MigrationEdgeLabelValueImpl();
		return migrationEdgeLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixingEdge createMixingEdge() {
		MixingEdgeImpl mixingEdge = new MixingEdgeImpl();
		return mixingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixingEdgeLabel createMixingEdgeLabel() {
		MixingEdgeLabelImpl mixingEdgeLabel = new MixingEdgeLabelImpl();
		return mixingEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixingEdgeLabelValue createMixingEdgeLabelValue() {
		MixingEdgeLabelValueImpl mixingEdgeLabelValue = new MixingEdgeLabelValueImpl();
		return mixingEdgeLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PopulationEdge createPopulationEdge() {
		PopulationEdgeImpl populationEdge = new PopulationEdgeImpl();
		return populationEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdgesPackage getEdgesPackage() {
		return (EdgesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdgesPackage getPackage() {
		return EdgesPackage.eINSTANCE;
	}

} //EdgesFactoryImpl
