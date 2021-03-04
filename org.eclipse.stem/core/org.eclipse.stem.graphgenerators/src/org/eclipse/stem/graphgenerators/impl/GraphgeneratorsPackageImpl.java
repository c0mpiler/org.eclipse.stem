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
package org.eclipse.stem.graphgenerators.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.stem.graphgenerators.AreaUnit;
import org.eclipse.stem.graphgenerators.GraphGenerator;
import org.eclipse.stem.graphgenerators.GraphgeneratorsFactory;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.LatticeGraphGenerator;
import org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.MigrationShapefile;
import org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.PajekNetGraphGenerator;
import org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator;
import org.eclipse.stem.graphgenerators.RegionShapefile;
import org.eclipse.stem.graphgenerators.RoadShapefile;
import org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.Shapefile;
import org.eclipse.stem.graphgenerators.ShapefileGraphGenerator;
import org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphgeneratorsPackageImpl extends EPackageImpl implements GraphgeneratorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latticeGraphGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareLatticeGraphGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationEdgeGraphGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixingEdgeGraphGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plateCarreeGlobeGraphGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pajekNetGraphGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapefileGraphGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapefileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionShapefileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadShapefileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationShapefileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonalMigrationEdgeGraphGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum areaUnitEEnum = null;

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
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphgeneratorsPackageImpl() {
		super(eNS_URI, GraphgeneratorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GraphgeneratorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphgeneratorsPackage init() {
		if (isInited) return (GraphgeneratorsPackage)EPackage.Registry.INSTANCE.getEPackage(GraphgeneratorsPackage.eNS_URI);

		// Obtain or create and register package
		GraphgeneratorsPackageImpl theGraphgeneratorsPackage = (GraphgeneratorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraphgeneratorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraphgeneratorsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGraphgeneratorsPackage.createPackageContents();

		// Initialize created meta-data
		theGraphgeneratorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphgeneratorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphgeneratorsPackage.eNS_URI, theGraphgeneratorsPackage);
		return theGraphgeneratorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphGenerator() {
		return graphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatticeGraphGenerator() {
		return latticeGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatticeGraphGenerator_UseNearestNeighbors() {
		return (EAttribute)latticeGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatticeGraphGenerator_UseNextNearestNeighbors() {
		return (EAttribute)latticeGraphGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatticeGraphGenerator_PeriodicBoundaries() {
		return (EAttribute)latticeGraphGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSquareLatticeGraphGenerator() {
		return squareLatticeGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquareLatticeGraphGenerator_XSize() {
		return (EAttribute)squareLatticeGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquareLatticeGraphGenerator_YSize() {
		return (EAttribute)squareLatticeGraphGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquareLatticeGraphGenerator_Area() {
		return (EAttribute)squareLatticeGraphGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigrationEdgeGraphGenerator() {
		return migrationEdgeGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigrationEdgeGraphGenerator_Location() {
		return (EAttribute)migrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigrationEdgeGraphGenerator_MigrationRate() {
		return (EAttribute)migrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigrationEdgeGraphGenerator_Population() {
		return (EAttribute)migrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigrationEdgeGraphGenerator_UseAbsoluteValues() {
		return (EAttribute)migrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMixingEdgeGraphGenerator() {
		return mixingEdgeGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMixingEdgeGraphGenerator_Location() {
		return (EAttribute)mixingEdgeGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMixingEdgeGraphGenerator_MixingRate() {
		return (EAttribute)mixingEdgeGraphGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMixingEdgeGraphGenerator_Population() {
		return (EAttribute)mixingEdgeGraphGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMixingEdgeGraphGenerator_UseAbsoluteValues() {
		return (EAttribute)mixingEdgeGraphGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlateCarreeGlobeGraphGenerator() {
		return plateCarreeGlobeGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlateCarreeGlobeGraphGenerator_AngularStep() {
		return (EAttribute)plateCarreeGlobeGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlateCarreeGlobeGraphGenerator_Radius() {
		return (EAttribute)plateCarreeGlobeGraphGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPajekNetGraphGenerator() {
		return pajekNetGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPajekNetGraphGenerator_DataFile() {
		return (EAttribute)pajekNetGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPajekNetGraphGenerator_ScalingFactor() {
		return (EAttribute)pajekNetGraphGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPajekNetGraphGenerator_NodeSize() {
		return (EAttribute)pajekNetGraphGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPajekNetGraphGenerator_UseRegionURI() {
		return (EAttribute)pajekNetGraphGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPajekNetGraphGenerator_MoveNodesToContainers() {
		return (EAttribute)pajekNetGraphGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPajekNetGraphGenerator_UseAbsoluteRates() {
		return (EAttribute)pajekNetGraphGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapefileGraphGenerator() {
		return shapefileGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapefileGraphGenerator_Shapefiles() {
		return (EReference)shapefileGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapefile() {
		return shapefileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapefile_FileName() {
		return (EAttribute)shapefileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapefile_Id() {
		return (EAttribute)shapefileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionShapefile() {
		return regionShapefileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionShapefile_Area() {
		return (EAttribute)regionShapefileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionShapefile_AreaUnit() {
		return (EAttribute)regionShapefileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionShapefile_PopulationNames() {
		return (EAttribute)regionShapefileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionShapefile_PopulationSizes() {
		return (EAttribute)regionShapefileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoadShapefile() {
		return roadShapefileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoadShapefile_RoadClass() {
		return (EAttribute)roadShapefileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigrationShapefile() {
		return migrationShapefileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigrationShapefile_PopulationName() {
		return (EAttribute)migrationShapefileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigrationShapefile_MigrationRate() {
		return (EAttribute)migrationShapefileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeasonalMigrationEdgeGraphGenerator() {
		return seasonalMigrationEdgeGraphGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalMigrationEdgeGraphGenerator_LocationA() {
		return (EAttribute)seasonalMigrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalMigrationEdgeGraphGenerator_LocationB() {
		return (EAttribute)seasonalMigrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalMigrationEdgeGraphGenerator_MigrationRate() {
		return (EAttribute)seasonalMigrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalMigrationEdgeGraphGenerator_Population() {
		return (EAttribute)seasonalMigrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleA() {
		return (EAttribute)seasonalMigrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleB() {
		return (EAttribute)seasonalMigrationEdgeGraphGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAreaUnit() {
		return areaUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgeneratorsFactory getGraphgeneratorsFactory() {
		return (GraphgeneratorsFactory)getEFactoryInstance();
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
		graphGeneratorEClass = createEClass(GRAPH_GENERATOR);

		latticeGraphGeneratorEClass = createEClass(LATTICE_GRAPH_GENERATOR);
		createEAttribute(latticeGraphGeneratorEClass, LATTICE_GRAPH_GENERATOR__USE_NEAREST_NEIGHBORS);
		createEAttribute(latticeGraphGeneratorEClass, LATTICE_GRAPH_GENERATOR__USE_NEXT_NEAREST_NEIGHBORS);
		createEAttribute(latticeGraphGeneratorEClass, LATTICE_GRAPH_GENERATOR__PERIODIC_BOUNDARIES);

		squareLatticeGraphGeneratorEClass = createEClass(SQUARE_LATTICE_GRAPH_GENERATOR);
		createEAttribute(squareLatticeGraphGeneratorEClass, SQUARE_LATTICE_GRAPH_GENERATOR__XSIZE);
		createEAttribute(squareLatticeGraphGeneratorEClass, SQUARE_LATTICE_GRAPH_GENERATOR__YSIZE);
		createEAttribute(squareLatticeGraphGeneratorEClass, SQUARE_LATTICE_GRAPH_GENERATOR__AREA);

		migrationEdgeGraphGeneratorEClass = createEClass(MIGRATION_EDGE_GRAPH_GENERATOR);
		createEAttribute(migrationEdgeGraphGeneratorEClass, MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION);
		createEAttribute(migrationEdgeGraphGeneratorEClass, MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE);
		createEAttribute(migrationEdgeGraphGeneratorEClass, MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION);
		createEAttribute(migrationEdgeGraphGeneratorEClass, MIGRATION_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES);

		mixingEdgeGraphGeneratorEClass = createEClass(MIXING_EDGE_GRAPH_GENERATOR);
		createEAttribute(mixingEdgeGraphGeneratorEClass, MIXING_EDGE_GRAPH_GENERATOR__LOCATION);
		createEAttribute(mixingEdgeGraphGeneratorEClass, MIXING_EDGE_GRAPH_GENERATOR__MIXING_RATE);
		createEAttribute(mixingEdgeGraphGeneratorEClass, MIXING_EDGE_GRAPH_GENERATOR__POPULATION);
		createEAttribute(mixingEdgeGraphGeneratorEClass, MIXING_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES);

		plateCarreeGlobeGraphGeneratorEClass = createEClass(PLATE_CARREE_GLOBE_GRAPH_GENERATOR);
		createEAttribute(plateCarreeGlobeGraphGeneratorEClass, PLATE_CARREE_GLOBE_GRAPH_GENERATOR__ANGULAR_STEP);
		createEAttribute(plateCarreeGlobeGraphGeneratorEClass, PLATE_CARREE_GLOBE_GRAPH_GENERATOR__RADIUS);

		pajekNetGraphGeneratorEClass = createEClass(PAJEK_NET_GRAPH_GENERATOR);
		createEAttribute(pajekNetGraphGeneratorEClass, PAJEK_NET_GRAPH_GENERATOR__DATA_FILE);
		createEAttribute(pajekNetGraphGeneratorEClass, PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR);
		createEAttribute(pajekNetGraphGeneratorEClass, PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE);
		createEAttribute(pajekNetGraphGeneratorEClass, PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI);
		createEAttribute(pajekNetGraphGeneratorEClass, PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS);
		createEAttribute(pajekNetGraphGeneratorEClass, PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES);

		shapefileGraphGeneratorEClass = createEClass(SHAPEFILE_GRAPH_GENERATOR);
		createEReference(shapefileGraphGeneratorEClass, SHAPEFILE_GRAPH_GENERATOR__SHAPEFILES);

		shapefileEClass = createEClass(SHAPEFILE);
		createEAttribute(shapefileEClass, SHAPEFILE__FILE_NAME);
		createEAttribute(shapefileEClass, SHAPEFILE__ID);

		regionShapefileEClass = createEClass(REGION_SHAPEFILE);
		createEAttribute(regionShapefileEClass, REGION_SHAPEFILE__AREA);
		createEAttribute(regionShapefileEClass, REGION_SHAPEFILE__AREA_UNIT);
		createEAttribute(regionShapefileEClass, REGION_SHAPEFILE__POPULATION_NAMES);
		createEAttribute(regionShapefileEClass, REGION_SHAPEFILE__POPULATION_SIZES);

		roadShapefileEClass = createEClass(ROAD_SHAPEFILE);
		createEAttribute(roadShapefileEClass, ROAD_SHAPEFILE__ROAD_CLASS);

		migrationShapefileEClass = createEClass(MIGRATION_SHAPEFILE);
		createEAttribute(migrationShapefileEClass, MIGRATION_SHAPEFILE__POPULATION_NAME);
		createEAttribute(migrationShapefileEClass, MIGRATION_SHAPEFILE__MIGRATION_RATE);

		seasonalMigrationEdgeGraphGeneratorEClass = createEClass(SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR);
		createEAttribute(seasonalMigrationEdgeGraphGeneratorEClass, SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A);
		createEAttribute(seasonalMigrationEdgeGraphGeneratorEClass, SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B);
		createEAttribute(seasonalMigrationEdgeGraphGeneratorEClass, SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE);
		createEAttribute(seasonalMigrationEdgeGraphGeneratorEClass, SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION);
		createEAttribute(seasonalMigrationEdgeGraphGeneratorEClass, SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A);
		createEAttribute(seasonalMigrationEdgeGraphGeneratorEClass, SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B);

		// Create enums
		areaUnitEEnum = createEEnum(AREA_UNIT);
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
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		graphGeneratorEClass.getESuperTypes().add(theCommonPackage.getIdentifiable());
		latticeGraphGeneratorEClass.getESuperTypes().add(this.getGraphGenerator());
		squareLatticeGraphGeneratorEClass.getESuperTypes().add(this.getLatticeGraphGenerator());
		migrationEdgeGraphGeneratorEClass.getESuperTypes().add(this.getGraphGenerator());
		mixingEdgeGraphGeneratorEClass.getESuperTypes().add(this.getGraphGenerator());
		plateCarreeGlobeGraphGeneratorEClass.getESuperTypes().add(this.getLatticeGraphGenerator());
		pajekNetGraphGeneratorEClass.getESuperTypes().add(this.getGraphGenerator());
		shapefileGraphGeneratorEClass.getESuperTypes().add(this.getGraphGenerator());
		regionShapefileEClass.getESuperTypes().add(this.getShapefile());
		roadShapefileEClass.getESuperTypes().add(this.getShapefile());
		migrationShapefileEClass.getESuperTypes().add(this.getShapefile());
		seasonalMigrationEdgeGraphGeneratorEClass.getESuperTypes().add(this.getGraphGenerator());

		// Initialize classes and features; add operations and parameters
		initEClass(graphGeneratorEClass, GraphGenerator.class, "GraphGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(graphGeneratorEClass, theGraphPackage.getGraph(), "getGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(latticeGraphGeneratorEClass, LatticeGraphGenerator.class, "LatticeGraphGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatticeGraphGenerator_UseNearestNeighbors(), theEcorePackage.getEBoolean(), "useNearestNeighbors", "true", 0, 1, LatticeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatticeGraphGenerator_UseNextNearestNeighbors(), theEcorePackage.getEBoolean(), "useNextNearestNeighbors", "false", 0, 1, LatticeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatticeGraphGenerator_PeriodicBoundaries(), theEcorePackage.getEBoolean(), "periodicBoundaries", "true", 0, 1, LatticeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(squareLatticeGraphGeneratorEClass, SquareLatticeGraphGenerator.class, "SquareLatticeGraphGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSquareLatticeGraphGenerator_XSize(), theEcorePackage.getEInt(), "xSize", "10", 0, 1, SquareLatticeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSquareLatticeGraphGenerator_YSize(), theEcorePackage.getEInt(), "ySize", "10", 0, 1, SquareLatticeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSquareLatticeGraphGenerator_Area(), theEcorePackage.getEDouble(), "area", "2025", 0, 1, SquareLatticeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(migrationEdgeGraphGeneratorEClass, MigrationEdgeGraphGenerator.class, "MigrationEdgeGraphGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMigrationEdgeGraphGenerator_Location(), theCommonPackage.getURI(), "location", null, 0, 1, MigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigrationEdgeGraphGenerator_MigrationRate(), theEcorePackage.getEDouble(), "migrationRate", "0.1", 0, 1, MigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigrationEdgeGraphGenerator_Population(), theEcorePackage.getEString(), "population", "human", 0, 1, MigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigrationEdgeGraphGenerator_UseAbsoluteValues(), theEcorePackage.getEBoolean(), "useAbsoluteValues", "0", 0, 1, MigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mixingEdgeGraphGeneratorEClass, MixingEdgeGraphGenerator.class, "MixingEdgeGraphGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMixingEdgeGraphGenerator_Location(), theCommonPackage.getURI(), "location", null, 0, 1, MixingEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMixingEdgeGraphGenerator_MixingRate(), theEcorePackage.getEDouble(), "mixingRate", "0.1", 0, 1, MixingEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMixingEdgeGraphGenerator_Population(), theEcorePackage.getEString(), "population", "human", 0, 1, MixingEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMixingEdgeGraphGenerator_UseAbsoluteValues(), theEcorePackage.getEBoolean(), "useAbsoluteValues", "0", 0, 1, MixingEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plateCarreeGlobeGraphGeneratorEClass, PlateCarreeGlobeGraphGenerator.class, "PlateCarreeGlobeGraphGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlateCarreeGlobeGraphGenerator_AngularStep(), theEcorePackage.getEInt(), "angularStep", "10", 0, 1, PlateCarreeGlobeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlateCarreeGlobeGraphGenerator_Radius(), theEcorePackage.getEDouble(), "radius", "6371.0", 1, 1, PlateCarreeGlobeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pajekNetGraphGeneratorEClass, PajekNetGraphGenerator.class, "PajekNetGraphGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPajekNetGraphGenerator_DataFile(), theEcorePackage.getEString(), "dataFile", "", 0, 1, PajekNetGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPajekNetGraphGenerator_ScalingFactor(), theEcorePackage.getEDouble(), "scalingFactor", "1", 0, 1, PajekNetGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPajekNetGraphGenerator_NodeSize(), theEcorePackage.getEDouble(), "nodeSize", "0.1", 0, 1, PajekNetGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPajekNetGraphGenerator_UseRegionURI(), theEcorePackage.getEBoolean(), "useRegionURI", "0", 0, 1, PajekNetGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPajekNetGraphGenerator_MoveNodesToContainers(), theEcorePackage.getEBoolean(), "moveNodesToContainers", "0", 0, 1, PajekNetGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPajekNetGraphGenerator_UseAbsoluteRates(), theEcorePackage.getEBoolean(), "useAbsoluteRates", "true", 0, 1, PajekNetGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapefileGraphGeneratorEClass, ShapefileGraphGenerator.class, "ShapefileGraphGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapefileGraphGenerator_Shapefiles(), this.getShapefile(), null, "shapefiles", null, 0, -1, ShapefileGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapefileEClass, Shapefile.class, "Shapefile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapefile_FileName(), theEcorePackage.getEString(), "fileName", null, 0, 1, Shapefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapefile_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Shapefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionShapefileEClass, RegionShapefile.class, "RegionShapefile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionShapefile_Area(), theEcorePackage.getEString(), "area", null, 0, 1, RegionShapefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionShapefile_AreaUnit(), this.getAreaUnit(), "areaUnit", null, 0, 1, RegionShapefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionShapefile_PopulationNames(), theEcorePackage.getEString(), "populationNames", null, 0, -1, RegionShapefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionShapefile_PopulationSizes(), theEcorePackage.getEString(), "populationSizes", null, 0, -1, RegionShapefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roadShapefileEClass, RoadShapefile.class, "RoadShapefile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoadShapefile_RoadClass(), theEcorePackage.getEString(), "roadClass", null, 0, 1, RoadShapefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(migrationShapefileEClass, MigrationShapefile.class, "MigrationShapefile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMigrationShapefile_PopulationName(), theEcorePackage.getEString(), "populationName", null, 0, 1, MigrationShapefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigrationShapefile_MigrationRate(), theEcorePackage.getEString(), "migrationRate", null, 0, 1, MigrationShapefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seasonalMigrationEdgeGraphGeneratorEClass, SeasonalMigrationEdgeGraphGenerator.class, "SeasonalMigrationEdgeGraphGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeasonalMigrationEdgeGraphGenerator_LocationA(), theCommonPackage.getURI(), "locationA", null, 0, 1, SeasonalMigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeasonalMigrationEdgeGraphGenerator_LocationB(), theCommonPackage.getURI(), "locationB", null, 0, 1, SeasonalMigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeasonalMigrationEdgeGraphGenerator_MigrationRate(), theEcorePackage.getEDouble(), "migrationRate", "0.1", 0, 1, SeasonalMigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeasonalMigrationEdgeGraphGenerator_Population(), theEcorePackage.getEString(), "population", "human", 0, 1, SeasonalMigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleA(), theEcorePackage.getEDouble(), "toleranceAngleA", "15", 0, 1, SeasonalMigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleB(), theEcorePackage.getEDouble(), "toleranceAngleB", "15", 0, 1, SeasonalMigrationEdgeGraphGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(areaUnitEEnum, AreaUnit.class, "AreaUnit");
		addEEnumLiteral(areaUnitEEnum, AreaUnit.SQ_KM);
		addEEnumLiteral(areaUnitEEnum, AreaUnit.SQ_M);
		addEEnumLiteral(areaUnitEEnum, AreaUnit.SQ_MILE);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphgeneratorsPackageImpl
