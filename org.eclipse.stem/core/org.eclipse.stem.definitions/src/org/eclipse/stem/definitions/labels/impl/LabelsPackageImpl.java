package org.eclipse.stem.definitions.labels.impl;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.logger.LoggerPackage;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.sequencer.SequencerPackage;
import org.eclipse.stem.core.solver.SolverPackage;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.impl.EdgesPackageImpl;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.AreaLabelValue;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabel;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.DoubleLabelValue;
import org.eclipse.stem.definitions.labels.EarthScienceLabel;
import org.eclipse.stem.definitions.labels.EarthScienceLabelValue;
import org.eclipse.stem.definitions.labels.GenericLabelValue;
import org.eclipse.stem.definitions.labels.IntegerLabelValue;
import org.eclipse.stem.definitions.labels.KeyValueLabelValue;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.definitions.labels.LongLabelValue;
import org.eclipse.stem.definitions.labels.PhysicalRelationshipLabel;
import org.eclipse.stem.definitions.labels.PhysicalRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationship;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabel;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.StringLabelValue;
import org.eclipse.stem.definitions.labels.TransportMode;
import org.eclipse.stem.definitions.labels.TransportRelationshipLabel;
import org.eclipse.stem.definitions.labels.TransportRelationshipLabelValue;
import org.eclipse.stem.definitions.nodes.NodesPackage;
import org.eclipse.stem.definitions.nodes.impl.NodesPackageImpl;
import org.eclipse.stem.definitions.types.TypesPackage;
import org.eclipse.stem.definitions.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelsPackageImpl extends EPackageImpl implements LabelsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonBorderRelationshipLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonBorderRelationshipLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalRelationshipLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativePhysicalRelationshipLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativePhysicalRelationshipLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportRelationshipLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportRelationshipLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalRelationshipLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadTransportRelationshipLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadTransportRelationshipLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthScienceLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthScienceLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relativePhysicalRelationshipEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LabelsPackageImpl() {
		super(eNS_URI, LabelsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LabelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LabelsPackage init() {
		if (isInited) return (LabelsPackage)EPackage.Registry.INSTANCE.getEPackage(LabelsPackage.eNS_URI);

		// Obtain or create and register package
		LabelsPackageImpl theLabelsPackage = (LabelsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LabelsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LabelsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GraphPackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EdgesPackageImpl theEdgesPackage = (EdgesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EdgesPackage.eNS_URI) instanceof EdgesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EdgesPackage.eNS_URI) : EdgesPackage.eINSTANCE);
		NodesPackageImpl theNodesPackage = (NodesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodesPackage.eNS_URI) instanceof NodesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodesPackage.eNS_URI) : NodesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theLabelsPackage.createPackageContents();
		theEdgesPackage.createPackageContents();
		theNodesPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theLabelsPackage.initializePackageContents();
		theEdgesPackage.initializePackageContents();
		theNodesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLabelsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LabelsPackage.eNS_URI, theLabelsPackage);
		return theLabelsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaLabel() {
		return areaLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAreaLabel_CurrentAreaValue() {
		return (EReference)areaLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaLabelValue() {
		return areaLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaLabelValue_Area() {
		return (EAttribute)areaLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaLabelValue_AverageExtent() {
		return (EAttribute)areaLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommonBorderRelationshipLabel() {
		return commonBorderRelationshipLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommonBorderRelationshipLabelValue() {
		return commonBorderRelationshipLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonBorderRelationshipLabelValue_BorderLength() {
		return (EAttribute)commonBorderRelationshipLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalRelationshipLabel() {
		return physicalRelationshipLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPopulationLabel() {
		return populationLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopulationLabel_PopulationIdentifier() {
		return (EAttribute)populationLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPopulationLabel_CurrentPopulationValue() {
		return (EReference)populationLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopulationLabel_PopulatedArea() {
		return (EAttribute)populationLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopulationLabel_ValidYear() {
		return (EAttribute)populationLabelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPopulationLabelValue() {
		return populationLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopulationLabelValue_Count() {
		return (EAttribute)populationLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelativePhysicalRelationshipLabel() {
		return relativePhysicalRelationshipLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelativePhysicalRelationshipLabel_CurrentRelationship() {
		return (EReference)relativePhysicalRelationshipLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelativePhysicalRelationshipLabelValue() {
		return relativePhysicalRelationshipLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelativePhysicalRelationshipLabelValue_Adjacent() {
		return (EAttribute)relativePhysicalRelationshipLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelativePhysicalRelationshipLabelValue_Relationship() {
		return (EAttribute)relativePhysicalRelationshipLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportRelationshipLabel() {
		return transportRelationshipLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_TransportMode() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_PopulationIdentifier() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_TransportIdentifier() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransportRelationshipLabel_CurrentTransportRelationshipLabelValue() {
		return (EReference)transportRelationshipLabelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_RateTimePeriod() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_DepartureCapacity() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_MaximumDepartureCapacity() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_Capacity() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_MaximumCapacity() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_TransitTime() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabel_StartUpDelay() {
		return (EAttribute)transportRelationshipLabelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportRelationshipLabelValue() {
		return transportRelationshipLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportRelationshipLabelValue_AvailableDepartureCapacityProportion() {
		return (EAttribute)transportRelationshipLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalRelationshipLabelValue() {
		return physicalRelationshipLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoadTransportRelationshipLabel() {
		return roadTransportRelationshipLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoadTransportRelationshipLabelValue() {
		return roadTransportRelationshipLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoadTransportRelationshipLabelValue_RoadName() {
		return (EAttribute)roadTransportRelationshipLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoadTransportRelationshipLabelValue_RoadClass() {
		return (EAttribute)roadTransportRelationshipLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoadTransportRelationshipLabelValue_NumberCrossings() {
		return (EAttribute)roadTransportRelationshipLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEarthScienceLabel() {
		return earthScienceLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEarthScienceLabel_CurrentEarthScienceValue() {
		return (EReference)earthScienceLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEarthScienceLabelValue() {
		return earthScienceLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_DataType() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Units() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Mean() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Sd() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Min() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Max() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Median() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Skewness() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Kurtosis() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Rms() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Samplesize() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_Range() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEarthScienceLabelValue_ValidYear() {
		return (EAttribute)earthScienceLabelValueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericLabelValue() {
		return genericLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLabelValue_Value() {
		return (EAttribute)genericLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLabelValue_Unit() {
		return (EAttribute)genericLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLabelValue_Measure() {
		return (EAttribute)genericLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleLabelValue() {
		return doubleLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerLabelValue() {
		return integerLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLongLabelValue() {
		return longLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLabelValue() {
		return stringLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyValueLabelValue() {
		return keyValueLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelativePhysicalRelationship() {
		return relativePhysicalRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTransportMode() {
		return transportModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelsFactory getLabelsFactory() {
		return (LabelsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		areaLabelEClass = createEClass(AREA_LABEL);
		createEReference(areaLabelEClass, AREA_LABEL__CURRENT_AREA_VALUE);

		areaLabelValueEClass = createEClass(AREA_LABEL_VALUE);
		createEAttribute(areaLabelValueEClass, AREA_LABEL_VALUE__AREA);
		createEAttribute(areaLabelValueEClass, AREA_LABEL_VALUE__AVERAGE_EXTENT);

		commonBorderRelationshipLabelEClass = createEClass(COMMON_BORDER_RELATIONSHIP_LABEL);

		commonBorderRelationshipLabelValueEClass = createEClass(COMMON_BORDER_RELATIONSHIP_LABEL_VALUE);
		createEAttribute(commonBorderRelationshipLabelValueEClass, COMMON_BORDER_RELATIONSHIP_LABEL_VALUE__BORDER_LENGTH);

		physicalRelationshipLabelEClass = createEClass(PHYSICAL_RELATIONSHIP_LABEL);

		populationLabelEClass = createEClass(POPULATION_LABEL);
		createEAttribute(populationLabelEClass, POPULATION_LABEL__POPULATION_IDENTIFIER);
		createEReference(populationLabelEClass, POPULATION_LABEL__CURRENT_POPULATION_VALUE);
		createEAttribute(populationLabelEClass, POPULATION_LABEL__POPULATED_AREA);
		createEAttribute(populationLabelEClass, POPULATION_LABEL__VALID_YEAR);

		populationLabelValueEClass = createEClass(POPULATION_LABEL_VALUE);
		createEAttribute(populationLabelValueEClass, POPULATION_LABEL_VALUE__COUNT);

		relativePhysicalRelationshipLabelEClass = createEClass(RELATIVE_PHYSICAL_RELATIONSHIP_LABEL);
		createEReference(relativePhysicalRelationshipLabelEClass, RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__CURRENT_RELATIONSHIP);

		relativePhysicalRelationshipLabelValueEClass = createEClass(RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE);
		createEAttribute(relativePhysicalRelationshipLabelValueEClass, RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__ADJACENT);
		createEAttribute(relativePhysicalRelationshipLabelValueEClass, RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__RELATIONSHIP);

		transportRelationshipLabelEClass = createEClass(TRANSPORT_RELATIONSHIP_LABEL);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__TRANSPORT_MODE);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__POPULATION_IDENTIFIER);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__TRANSPORT_IDENTIFIER);
		createEReference(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__CURRENT_TRANSPORT_RELATIONSHIP_LABEL_VALUE);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__RATE_TIME_PERIOD);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__DEPARTURE_CAPACITY);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__MAXIMUM_DEPARTURE_CAPACITY);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__CAPACITY);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__MAXIMUM_CAPACITY);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__TRANSIT_TIME);
		createEAttribute(transportRelationshipLabelEClass, TRANSPORT_RELATIONSHIP_LABEL__START_UP_DELAY);

		transportRelationshipLabelValueEClass = createEClass(TRANSPORT_RELATIONSHIP_LABEL_VALUE);
		createEAttribute(transportRelationshipLabelValueEClass, TRANSPORT_RELATIONSHIP_LABEL_VALUE__AVAILABLE_DEPARTURE_CAPACITY_PROPORTION);

		physicalRelationshipLabelValueEClass = createEClass(PHYSICAL_RELATIONSHIP_LABEL_VALUE);

		roadTransportRelationshipLabelEClass = createEClass(ROAD_TRANSPORT_RELATIONSHIP_LABEL);

		roadTransportRelationshipLabelValueEClass = createEClass(ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE);
		createEAttribute(roadTransportRelationshipLabelValueEClass, ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE__ROAD_NAME);
		createEAttribute(roadTransportRelationshipLabelValueEClass, ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE__ROAD_CLASS);
		createEAttribute(roadTransportRelationshipLabelValueEClass, ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE__NUMBER_CROSSINGS);

		earthScienceLabelEClass = createEClass(EARTH_SCIENCE_LABEL);
		createEReference(earthScienceLabelEClass, EARTH_SCIENCE_LABEL__CURRENT_EARTH_SCIENCE_VALUE);

		earthScienceLabelValueEClass = createEClass(EARTH_SCIENCE_LABEL_VALUE);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__UNITS);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__MEAN);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__SD);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__MIN);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__MAX);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__MEDIAN);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__SKEWNESS);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__KURTOSIS);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__RMS);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__RANGE);
		createEAttribute(earthScienceLabelValueEClass, EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR);

		genericLabelValueEClass = createEClass(GENERIC_LABEL_VALUE);
		createEAttribute(genericLabelValueEClass, GENERIC_LABEL_VALUE__VALUE);
		createEAttribute(genericLabelValueEClass, GENERIC_LABEL_VALUE__UNIT);
		createEAttribute(genericLabelValueEClass, GENERIC_LABEL_VALUE__MEASURE);

		doubleLabelValueEClass = createEClass(DOUBLE_LABEL_VALUE);

		integerLabelValueEClass = createEClass(INTEGER_LABEL_VALUE);

		longLabelValueEClass = createEClass(LONG_LABEL_VALUE);

		stringLabelValueEClass = createEClass(STRING_LABEL_VALUE);

		keyValueLabelValueEClass = createEClass(KEY_VALUE_LABEL_VALUE);

		// Create enums
		relativePhysicalRelationshipEEnum = createEEnum(RELATIVE_PHYSICAL_RELATIONSHIP);
		transportModeEEnum = createEEnum(TRANSPORT_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter genericLabelValueEClass_T = addETypeParameter(genericLabelValueEClass, "T"); //$NON-NLS-1$

		// Set bounds for type parameters

		// Add supertypes to classes
		areaLabelEClass.getESuperTypes().add(theGraphPackage.getStaticNodeLabel());
		areaLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		commonBorderRelationshipLabelEClass.getESuperTypes().add(this.getPhysicalRelationshipLabel());
		commonBorderRelationshipLabelValueEClass.getESuperTypes().add(this.getPhysicalRelationshipLabelValue());
		physicalRelationshipLabelEClass.getESuperTypes().add(theGraphPackage.getStaticEdgeLabel());
		populationLabelEClass.getESuperTypes().add(theGraphPackage.getStaticNodeLabel());
		populationLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		relativePhysicalRelationshipLabelEClass.getESuperTypes().add(this.getPhysicalRelationshipLabel());
		relativePhysicalRelationshipLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		transportRelationshipLabelEClass.getESuperTypes().add(theGraphPackage.getDynamicEdgeLabel());
		transportRelationshipLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		physicalRelationshipLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		roadTransportRelationshipLabelEClass.getESuperTypes().add(this.getPhysicalRelationshipLabel());
		roadTransportRelationshipLabelValueEClass.getESuperTypes().add(this.getPhysicalRelationshipLabelValue());
		earthScienceLabelEClass.getESuperTypes().add(theGraphPackage.getStaticNodeLabel());
		earthScienceLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		genericLabelValueEClass.getESuperTypes().add(theGraphPackage.getLabelValue());
		EGenericType g1 = createEGenericType(this.getGenericLabelValue());
		EGenericType g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		doubleLabelValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenericLabelValue());
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		integerLabelValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenericLabelValue());
		g2 = createEGenericType(ecorePackage.getELongObject());
		g1.getETypeArguments().add(g2);
		longLabelValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenericLabelValue());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		stringLabelValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenericLabelValue());
		g2 = createEGenericType(ecorePackage.getEMap());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(ecorePackage.getEString());
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType(ecorePackage.getEJavaObject());
		g2.getETypeArguments().add(g3);
		keyValueLabelValueEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(areaLabelEClass, AreaLabel.class, "AreaLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAreaLabel_CurrentAreaValue(), this.getAreaLabelValue(), null, "currentAreaValue", null, 0, 1, AreaLabel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(areaLabelValueEClass, AreaLabelValue.class, "AreaLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAreaLabelValue_Area(), ecorePackage.getEDouble(), "area", null, 0, 1, AreaLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAreaLabelValue_AverageExtent(), ecorePackage.getEDouble(), "averageExtent", null, 0, 1, AreaLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(commonBorderRelationshipLabelEClass, CommonBorderRelationshipLabel.class, "CommonBorderRelationshipLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(commonBorderRelationshipLabelValueEClass, CommonBorderRelationshipLabelValue.class, "CommonBorderRelationshipLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCommonBorderRelationshipLabelValue_BorderLength(), ecorePackage.getEDouble(), "borderLength", null, 0, 1, CommonBorderRelationshipLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(physicalRelationshipLabelEClass, PhysicalRelationshipLabel.class, "PhysicalRelationshipLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(populationLabelEClass, PopulationLabel.class, "PopulationLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPopulationLabel_PopulationIdentifier(), ecorePackage.getEString(), "populationIdentifier", null, 0, 1, PopulationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPopulationLabel_CurrentPopulationValue(), this.getPopulationLabelValue(), null, "currentPopulationValue", null, 0, 1, PopulationLabel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPopulationLabel_PopulatedArea(), ecorePackage.getEDouble(), "populatedArea", "0", 0, 1, PopulationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getPopulationLabel_ValidYear(), ecorePackage.getEInt(), "validYear", "2006", 0, 1, PopulationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(populationLabelValueEClass, PopulationLabelValue.class, "PopulationLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPopulationLabelValue_Count(), ecorePackage.getEDouble(), "count", null, 0, 1, PopulationLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(relativePhysicalRelationshipLabelEClass, RelativePhysicalRelationshipLabel.class, "RelativePhysicalRelationshipLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRelativePhysicalRelationshipLabel_CurrentRelationship(), this.getRelativePhysicalRelationshipLabelValue(), null, "currentRelationship", null, 0, 1, RelativePhysicalRelationshipLabel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(relativePhysicalRelationshipLabelValueEClass, RelativePhysicalRelationshipLabelValue.class, "RelativePhysicalRelationshipLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRelativePhysicalRelationshipLabelValue_Adjacent(), ecorePackage.getEBoolean(), "adjacent", null, 0, 1, RelativePhysicalRelationshipLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRelativePhysicalRelationshipLabelValue_Relationship(), this.getRelativePhysicalRelationship(), "relationship", null, 0, 1, RelativePhysicalRelationshipLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transportRelationshipLabelEClass, TransportRelationshipLabel.class, "TransportRelationshipLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_TransportMode(), this.getTransportMode(), "transportMode", null, 0, 1, TransportRelationshipLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_PopulationIdentifier(), ecorePackage.getEString(), "populationIdentifier", null, 0, 1, TransportRelationshipLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_TransportIdentifier(), ecorePackage.getEString(), "transportIdentifier", null, 0, 1, TransportRelationshipLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransportRelationshipLabel_CurrentTransportRelationshipLabelValue(), this.getTransportRelationshipLabelValue(), null, "currentTransportRelationshipLabelValue", null, 0, 1, TransportRelationshipLabel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_RateTimePeriod(), ecorePackage.getELong(), "rateTimePeriod", null, 0, 1, TransportRelationshipLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_DepartureCapacity(), ecorePackage.getEInt(), "departureCapacity", null, 0, 1, TransportRelationshipLabel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_MaximumDepartureCapacity(), ecorePackage.getEInt(), "maximumDepartureCapacity", null, 0, 1, TransportRelationshipLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, TransportRelationshipLabel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_MaximumCapacity(), ecorePackage.getEInt(), "maximumCapacity", null, 0, 1, TransportRelationshipLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_TransitTime(), ecorePackage.getELong(), "transitTime", null, 0, 1, TransportRelationshipLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabel_StartUpDelay(), ecorePackage.getELong(), "startUpDelay", null, 0, 1, TransportRelationshipLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transportRelationshipLabelValueEClass, TransportRelationshipLabelValue.class, "TransportRelationshipLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTransportRelationshipLabelValue_AvailableDepartureCapacityProportion(), ecorePackage.getEDouble(), "availableDepartureCapacityProportion", "1.0", 0, 1, TransportRelationshipLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(physicalRelationshipLabelValueEClass, PhysicalRelationshipLabelValue.class, "PhysicalRelationshipLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(roadTransportRelationshipLabelEClass, RoadTransportRelationshipLabel.class, "RoadTransportRelationshipLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(roadTransportRelationshipLabelValueEClass, RoadTransportRelationshipLabelValue.class, "RoadTransportRelationshipLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRoadTransportRelationshipLabelValue_RoadName(), ecorePackage.getEString(), "roadName", "road", 0, 1, RoadTransportRelationshipLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRoadTransportRelationshipLabelValue_RoadClass(), ecorePackage.getEString(), "roadClass", "route", 0, 1, RoadTransportRelationshipLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRoadTransportRelationshipLabelValue_NumberCrossings(), ecorePackage.getEInt(), "numberCrossings", "1", 0, 1, RoadTransportRelationshipLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(earthScienceLabelEClass, EarthScienceLabel.class, "EarthScienceLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEarthScienceLabel_CurrentEarthScienceValue(), this.getEarthScienceLabelValue(), null, "currentEarthScienceValue", null, 0, 1, EarthScienceLabel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(earthScienceLabelValueEClass, EarthScienceLabelValue.class, "EarthScienceLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_DataType(), theEcorePackage.getEString(), "dataType", null, 0, 1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Units(), theEcorePackage.getEString(), "units", null, 0, 1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Mean(), theEcorePackage.getEDouble(), "mean", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Sd(), theEcorePackage.getEDouble(), "sd", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Min(), theEcorePackage.getEDouble(), "min", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Max(), theEcorePackage.getEDouble(), "max", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Median(), theEcorePackage.getEDouble(), "median", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Skewness(), theEcorePackage.getEDouble(), "skewness", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Kurtosis(), theEcorePackage.getEDouble(), "kurtosis", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Rms(), theEcorePackage.getEDouble(), "rms", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Samplesize(), theEcorePackage.getEDouble(), "samplesize", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_Range(), theEcorePackage.getEDouble(), "range", null, 0, -1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEarthScienceLabelValue_ValidYear(), theEcorePackage.getEInt(), "validYear", "0", 0, 1, EarthScienceLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(genericLabelValueEClass, GenericLabelValue.class, "GenericLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(genericLabelValueEClass_T);
		initEAttribute(getGenericLabelValue_Value(), g1, "value", null, 0, 1, GenericLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenericLabelValue_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, GenericLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenericLabelValue_Measure(), ecorePackage.getEString(), "measure", null, 0, 1, GenericLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(genericLabelValueEClass, null, "getJavaTypeClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(doubleLabelValueEClass, DoubleLabelValue.class, "DoubleLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(integerLabelValueEClass, IntegerLabelValue.class, "IntegerLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(longLabelValueEClass, LongLabelValue.class, "LongLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stringLabelValueEClass, StringLabelValue.class, "StringLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(keyValueLabelValueEClass, KeyValueLabelValue.class, "KeyValueLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.class, "RelativePhysicalRelationship"); //$NON-NLS-1$
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.UNSPECIFIED_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.ABOVE_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.BELOW_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.RIGHT_OF_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.LEFT_OF_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.NORTH_OF_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.SOUTH_OF_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.WEST_OF_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.EAST_OF_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.CONTAINS_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.CONTAINED_BY_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.OVERLAPS_LITERAL);
		addEEnumLiteral(relativePhysicalRelationshipEEnum, RelativePhysicalRelationship.ORBITS_LITERAL);

		initEEnum(transportModeEEnum, TransportMode.class, "TransportMode"); //$NON-NLS-1$
		addEEnumLiteral(transportModeEEnum, TransportMode.UNSPECIFIED_LITERAL);
		addEEnumLiteral(transportModeEEnum, TransportMode.AIR_LITERAL);
		addEEnumLiteral(transportModeEEnum, TransportMode.ROAD_LITERAL);
		addEEnumLiteral(transportModeEEnum, TransportMode.RAIL_LITERAL);
		addEEnumLiteral(transportModeEEnum, TransportMode.MARINE_LITERAL);
		addEEnumLiteral(transportModeEEnum, TransportMode.FOOT_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //LabelsPackageImpl
