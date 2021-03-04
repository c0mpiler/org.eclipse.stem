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
package org.eclipse.stem.graphgenerators;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.stem.core.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsFactory
 * @model kind="package"
 * @generated
 */
public interface GraphgeneratorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphgenerators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/graphgenerators/graphgenerators.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.graphgenerators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphgeneratorsPackage eINSTANCE = org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.GraphGeneratorImpl <em>Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.GraphGeneratorImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getGraphGenerator()
	 * @generated
	 */
	int GRAPH_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_GENERATOR__URI = CommonPackage.IDENTIFIABLE__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_GENERATOR__TYPE_URI = CommonPackage.IDENTIFIABLE__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_GENERATOR__DUBLIN_CORE = CommonPackage.IDENTIFIABLE__DUBLIN_CORE;

	/**
	 * The number of structural features of the '<em>Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_GENERATOR_FEATURE_COUNT = CommonPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.LatticeGraphGeneratorImpl <em>Lattice Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.LatticeGraphGeneratorImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getLatticeGraphGenerator()
	 * @generated
	 */
	int LATTICE_GRAPH_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_GRAPH_GENERATOR__URI = GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_GRAPH_GENERATOR__TYPE_URI = GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_GRAPH_GENERATOR__DUBLIN_CORE = GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Use Nearest Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_GRAPH_GENERATOR__USE_NEAREST_NEIGHBORS = GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Next Nearest Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_GRAPH_GENERATOR__USE_NEXT_NEAREST_NEIGHBORS = GRAPH_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Periodic Boundaries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_GRAPH_GENERATOR__PERIODIC_BOUNDARIES = GRAPH_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lattice Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_GRAPH_GENERATOR_FEATURE_COUNT = GRAPH_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.SquareLatticeGraphGeneratorImpl <em>Square Lattice Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.SquareLatticeGraphGeneratorImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getSquareLatticeGraphGenerator()
	 * @generated
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR__URI = LATTICE_GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR__TYPE_URI = LATTICE_GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR__DUBLIN_CORE = LATTICE_GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Use Nearest Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR__USE_NEAREST_NEIGHBORS = LATTICE_GRAPH_GENERATOR__USE_NEAREST_NEIGHBORS;

	/**
	 * The feature id for the '<em><b>Use Next Nearest Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR__USE_NEXT_NEAREST_NEIGHBORS = LATTICE_GRAPH_GENERATOR__USE_NEXT_NEAREST_NEIGHBORS;

	/**
	 * The feature id for the '<em><b>Periodic Boundaries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR__PERIODIC_BOUNDARIES = LATTICE_GRAPH_GENERATOR__PERIODIC_BOUNDARIES;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR__XSIZE = LATTICE_GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR__YSIZE = LATTICE_GRAPH_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR__AREA = LATTICE_GRAPH_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Square Lattice Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_LATTICE_GRAPH_GENERATOR_FEATURE_COUNT = LATTICE_GRAPH_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.MigrationEdgeGraphGeneratorImpl <em>Migration Edge Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.MigrationEdgeGraphGeneratorImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getMigrationEdgeGraphGenerator()
	 * @generated
	 */
	int MIGRATION_EDGE_GRAPH_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_EDGE_GRAPH_GENERATOR__URI = GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_EDGE_GRAPH_GENERATOR__TYPE_URI = GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_EDGE_GRAPH_GENERATOR__DUBLIN_CORE = GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION = GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Migration Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE = GRAPH_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION = GRAPH_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Absolute Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES = GRAPH_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Migration Edge Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_EDGE_GRAPH_GENERATOR_FEATURE_COUNT = GRAPH_GENERATOR_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.MixingEdgeGraphGeneratorImpl <em>Mixing Edge Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.MixingEdgeGraphGeneratorImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getMixingEdgeGraphGenerator()
	 * @generated
	 */
	int MIXING_EDGE_GRAPH_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXING_EDGE_GRAPH_GENERATOR__URI = GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXING_EDGE_GRAPH_GENERATOR__TYPE_URI = GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXING_EDGE_GRAPH_GENERATOR__DUBLIN_CORE = GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXING_EDGE_GRAPH_GENERATOR__LOCATION = GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mixing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXING_EDGE_GRAPH_GENERATOR__MIXING_RATE = GRAPH_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXING_EDGE_GRAPH_GENERATOR__POPULATION = GRAPH_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Absolute Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXING_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES = GRAPH_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mixing Edge Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXING_EDGE_GRAPH_GENERATOR_FEATURE_COUNT = GRAPH_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.PlateCarreeGlobeGraphGeneratorImpl <em>Plate Carree Globe Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.PlateCarreeGlobeGraphGeneratorImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getPlateCarreeGlobeGraphGenerator()
	 * @generated
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR__URI = LATTICE_GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR__TYPE_URI = LATTICE_GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR__DUBLIN_CORE = LATTICE_GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Use Nearest Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR__USE_NEAREST_NEIGHBORS = LATTICE_GRAPH_GENERATOR__USE_NEAREST_NEIGHBORS;

	/**
	 * The feature id for the '<em><b>Use Next Nearest Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR__USE_NEXT_NEAREST_NEIGHBORS = LATTICE_GRAPH_GENERATOR__USE_NEXT_NEAREST_NEIGHBORS;

	/**
	 * The feature id for the '<em><b>Periodic Boundaries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR__PERIODIC_BOUNDARIES = LATTICE_GRAPH_GENERATOR__PERIODIC_BOUNDARIES;

	/**
	 * The feature id for the '<em><b>Angular Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR__ANGULAR_STEP = LATTICE_GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR__RADIUS = LATTICE_GRAPH_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plate Carree Globe Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_CARREE_GLOBE_GRAPH_GENERATOR_FEATURE_COUNT = LATTICE_GRAPH_GENERATOR_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl <em>Pajek Net Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getPajekNetGraphGenerator()
	 * @generated
	 */
	int PAJEK_NET_GRAPH_GENERATOR = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR__URI = GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR__TYPE_URI = GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR__DUBLIN_CORE = GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Data File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR__DATA_FILE = GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR = GRAPH_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE = GRAPH_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Region URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI = GRAPH_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Move Nodes To Containers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS = GRAPH_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Use Absolute Rates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES = GRAPH_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Pajek Net Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAJEK_NET_GRAPH_GENERATOR_FEATURE_COUNT = GRAPH_GENERATOR_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.ShapefileGraphGeneratorImpl <em>Shapefile Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.ShapefileGraphGeneratorImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getShapefileGraphGenerator()
	 * @generated
	 */
	int SHAPEFILE_GRAPH_GENERATOR = 7;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPEFILE_GRAPH_GENERATOR__URI = GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPEFILE_GRAPH_GENERATOR__TYPE_URI = GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPEFILE_GRAPH_GENERATOR__DUBLIN_CORE = GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Shapefiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPEFILE_GRAPH_GENERATOR__SHAPEFILES = GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shapefile Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPEFILE_GRAPH_GENERATOR_FEATURE_COUNT = GRAPH_GENERATOR_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.ShapefileImpl <em>Shapefile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.ShapefileImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getShapefile()
	 * @generated
	 */
	int SHAPEFILE = 8;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPEFILE__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPEFILE__ID = 1;

	/**
	 * The number of structural features of the '<em>Shapefile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPEFILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.RegionShapefileImpl <em>Region Shapefile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.RegionShapefileImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getRegionShapefile()
	 * @generated
	 */
	int REGION_SHAPEFILE = 9;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_SHAPEFILE__FILE_NAME = SHAPEFILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_SHAPEFILE__ID = SHAPEFILE__ID;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_SHAPEFILE__AREA = SHAPEFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Area Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_SHAPEFILE__AREA_UNIT = SHAPEFILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Population Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_SHAPEFILE__POPULATION_NAMES = SHAPEFILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Population Sizes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_SHAPEFILE__POPULATION_SIZES = SHAPEFILE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Region Shapefile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_SHAPEFILE_FEATURE_COUNT = SHAPEFILE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.RoadShapefileImpl <em>Road Shapefile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.RoadShapefileImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getRoadShapefile()
	 * @generated
	 */
	int ROAD_SHAPEFILE = 10;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_SHAPEFILE__FILE_NAME = SHAPEFILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_SHAPEFILE__ID = SHAPEFILE__ID;

	/**
	 * The feature id for the '<em><b>Road Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_SHAPEFILE__ROAD_CLASS = SHAPEFILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Road Shapefile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_SHAPEFILE_FEATURE_COUNT = SHAPEFILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.MigrationShapefileImpl <em>Migration Shapefile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.MigrationShapefileImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getMigrationShapefile()
	 * @generated
	 */
	int MIGRATION_SHAPEFILE = 11;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_SHAPEFILE__FILE_NAME = SHAPEFILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_SHAPEFILE__ID = SHAPEFILE__ID;

	/**
	 * The feature id for the '<em><b>Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_SHAPEFILE__POPULATION_NAME = SHAPEFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Migration Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_SHAPEFILE__MIGRATION_RATE = SHAPEFILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Migration Shapefile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_SHAPEFILE_FEATURE_COUNT = SHAPEFILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl <em>Seasonal Migration Edge Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getSeasonalMigrationEdgeGraphGenerator()
	 * @generated
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR = 12;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__URI = GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TYPE_URI = GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__DUBLIN_CORE = GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Location A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A = GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B = GRAPH_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Migration Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE = GRAPH_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION = GRAPH_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tolerance Angle A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A = GRAPH_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tolerance Angle B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B = GRAPH_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Seasonal Migration Edge Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR_FEATURE_COUNT = GRAPH_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.graphgenerators.AreaUnit <em>Area Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.graphgenerators.AreaUnit
	 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getAreaUnit()
	 * @generated
	 */
	int AREA_UNIT = 13;

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.GraphGenerator <em>Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Generator</em>'.
	 * @see org.eclipse.stem.graphgenerators.GraphGenerator
	 * @generated
	 */
	EClass getGraphGenerator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.LatticeGraphGenerator <em>Lattice Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lattice Graph Generator</em>'.
	 * @see org.eclipse.stem.graphgenerators.LatticeGraphGenerator
	 * @generated
	 */
	EClass getLatticeGraphGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.LatticeGraphGenerator#isUseNearestNeighbors <em>Use Nearest Neighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Nearest Neighbors</em>'.
	 * @see org.eclipse.stem.graphgenerators.LatticeGraphGenerator#isUseNearestNeighbors()
	 * @see #getLatticeGraphGenerator()
	 * @generated
	 */
	EAttribute getLatticeGraphGenerator_UseNearestNeighbors();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.LatticeGraphGenerator#isUseNextNearestNeighbors <em>Use Next Nearest Neighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Next Nearest Neighbors</em>'.
	 * @see org.eclipse.stem.graphgenerators.LatticeGraphGenerator#isUseNextNearestNeighbors()
	 * @see #getLatticeGraphGenerator()
	 * @generated
	 */
	EAttribute getLatticeGraphGenerator_UseNextNearestNeighbors();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.LatticeGraphGenerator#isPeriodicBoundaries <em>Periodic Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodic Boundaries</em>'.
	 * @see org.eclipse.stem.graphgenerators.LatticeGraphGenerator#isPeriodicBoundaries()
	 * @see #getLatticeGraphGenerator()
	 * @generated
	 */
	EAttribute getLatticeGraphGenerator_PeriodicBoundaries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator <em>Square Lattice Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square Lattice Graph Generator</em>'.
	 * @see org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator
	 * @generated
	 */
	EClass getSquareLatticeGraphGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator#getXSize <em>XSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XSize</em>'.
	 * @see org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator#getXSize()
	 * @see #getSquareLatticeGraphGenerator()
	 * @generated
	 */
	EAttribute getSquareLatticeGraphGenerator_XSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator#getYSize <em>YSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YSize</em>'.
	 * @see org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator#getYSize()
	 * @see #getSquareLatticeGraphGenerator()
	 * @generated
	 */
	EAttribute getSquareLatticeGraphGenerator_YSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator#getArea()
	 * @see #getSquareLatticeGraphGenerator()
	 * @generated
	 */
	EAttribute getSquareLatticeGraphGenerator_Area();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator <em>Migration Edge Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration Edge Graph Generator</em>'.
	 * @see org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator
	 * @generated
	 */
	EClass getMigrationEdgeGraphGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator#getLocation()
	 * @see #getMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getMigrationEdgeGraphGenerator_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator#getMigrationRate <em>Migration Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Migration Rate</em>'.
	 * @see org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator#getMigrationRate()
	 * @see #getMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getMigrationEdgeGraphGenerator_MigrationRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator#getPopulation()
	 * @see #getMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getMigrationEdgeGraphGenerator_Population();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator#isUseAbsoluteValues <em>Use Absolute Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Absolute Values</em>'.
	 * @see org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator#isUseAbsoluteValues()
	 * @see #getMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getMigrationEdgeGraphGenerator_UseAbsoluteValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator <em>Mixing Edge Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixing Edge Graph Generator</em>'.
	 * @see org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator
	 * @generated
	 */
	EClass getMixingEdgeGraphGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator#getLocation()
	 * @see #getMixingEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getMixingEdgeGraphGenerator_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator#getMixingRate <em>Mixing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mixing Rate</em>'.
	 * @see org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator#getMixingRate()
	 * @see #getMixingEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getMixingEdgeGraphGenerator_MixingRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator#getPopulation()
	 * @see #getMixingEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getMixingEdgeGraphGenerator_Population();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator#isUseAbsoluteValues <em>Use Absolute Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Absolute Values</em>'.
	 * @see org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator#isUseAbsoluteValues()
	 * @see #getMixingEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getMixingEdgeGraphGenerator_UseAbsoluteValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator <em>Plate Carree Globe Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plate Carree Globe Graph Generator</em>'.
	 * @see org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator
	 * @generated
	 */
	EClass getPlateCarreeGlobeGraphGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator#getAngularStep <em>Angular Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Step</em>'.
	 * @see org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator#getAngularStep()
	 * @see #getPlateCarreeGlobeGraphGenerator()
	 * @generated
	 */
	EAttribute getPlateCarreeGlobeGraphGenerator_AngularStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator#getRadius()
	 * @see #getPlateCarreeGlobeGraphGenerator()
	 * @generated
	 */
	EAttribute getPlateCarreeGlobeGraphGenerator_Radius();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator <em>Pajek Net Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pajek Net Graph Generator</em>'.
	 * @see org.eclipse.stem.graphgenerators.PajekNetGraphGenerator
	 * @generated
	 */
	EClass getPajekNetGraphGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getDataFile <em>Data File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data File</em>'.
	 * @see org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getDataFile()
	 * @see #getPajekNetGraphGenerator()
	 * @generated
	 */
	EAttribute getPajekNetGraphGenerator_DataFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getScalingFactor <em>Scaling Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling Factor</em>'.
	 * @see org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getScalingFactor()
	 * @see #getPajekNetGraphGenerator()
	 * @generated
	 */
	EAttribute getPajekNetGraphGenerator_ScalingFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getNodeSize <em>Node Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Size</em>'.
	 * @see org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getNodeSize()
	 * @see #getPajekNetGraphGenerator()
	 * @generated
	 */
	EAttribute getPajekNetGraphGenerator_NodeSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isUseRegionURI <em>Use Region URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Region URI</em>'.
	 * @see org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isUseRegionURI()
	 * @see #getPajekNetGraphGenerator()
	 * @generated
	 */
	EAttribute getPajekNetGraphGenerator_UseRegionURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isMoveNodesToContainers <em>Move Nodes To Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Nodes To Containers</em>'.
	 * @see org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isMoveNodesToContainers()
	 * @see #getPajekNetGraphGenerator()
	 * @generated
	 */
	EAttribute getPajekNetGraphGenerator_MoveNodesToContainers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isUseAbsoluteRates <em>Use Absolute Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Absolute Rates</em>'.
	 * @see org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isUseAbsoluteRates()
	 * @see #getPajekNetGraphGenerator()
	 * @generated
	 */
	EAttribute getPajekNetGraphGenerator_UseAbsoluteRates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.ShapefileGraphGenerator <em>Shapefile Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shapefile Graph Generator</em>'.
	 * @see org.eclipse.stem.graphgenerators.ShapefileGraphGenerator
	 * @generated
	 */
	EClass getShapefileGraphGenerator();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stem.graphgenerators.ShapefileGraphGenerator#getShapefiles <em>Shapefiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shapefiles</em>'.
	 * @see org.eclipse.stem.graphgenerators.ShapefileGraphGenerator#getShapefiles()
	 * @see #getShapefileGraphGenerator()
	 * @generated
	 */
	EReference getShapefileGraphGenerator_Shapefiles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.Shapefile <em>Shapefile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shapefile</em>'.
	 * @see org.eclipse.stem.graphgenerators.Shapefile
	 * @generated
	 */
	EClass getShapefile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.Shapefile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.stem.graphgenerators.Shapefile#getFileName()
	 * @see #getShapefile()
	 * @generated
	 */
	EAttribute getShapefile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.Shapefile#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.stem.graphgenerators.Shapefile#getId()
	 * @see #getShapefile()
	 * @generated
	 */
	EAttribute getShapefile_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.RegionShapefile <em>Region Shapefile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Shapefile</em>'.
	 * @see org.eclipse.stem.graphgenerators.RegionShapefile
	 * @generated
	 */
	EClass getRegionShapefile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.RegionShapefile#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see org.eclipse.stem.graphgenerators.RegionShapefile#getArea()
	 * @see #getRegionShapefile()
	 * @generated
	 */
	EAttribute getRegionShapefile_Area();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.RegionShapefile#getAreaUnit <em>Area Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Unit</em>'.
	 * @see org.eclipse.stem.graphgenerators.RegionShapefile#getAreaUnit()
	 * @see #getRegionShapefile()
	 * @generated
	 */
	EAttribute getRegionShapefile_AreaUnit();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.graphgenerators.RegionShapefile#getPopulationNames <em>Population Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Population Names</em>'.
	 * @see org.eclipse.stem.graphgenerators.RegionShapefile#getPopulationNames()
	 * @see #getRegionShapefile()
	 * @generated
	 */
	EAttribute getRegionShapefile_PopulationNames();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.graphgenerators.RegionShapefile#getPopulationSizes <em>Population Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Population Sizes</em>'.
	 * @see org.eclipse.stem.graphgenerators.RegionShapefile#getPopulationSizes()
	 * @see #getRegionShapefile()
	 * @generated
	 */
	EAttribute getRegionShapefile_PopulationSizes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.RoadShapefile <em>Road Shapefile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road Shapefile</em>'.
	 * @see org.eclipse.stem.graphgenerators.RoadShapefile
	 * @generated
	 */
	EClass getRoadShapefile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.RoadShapefile#getRoadClass <em>Road Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Road Class</em>'.
	 * @see org.eclipse.stem.graphgenerators.RoadShapefile#getRoadClass()
	 * @see #getRoadShapefile()
	 * @generated
	 */
	EAttribute getRoadShapefile_RoadClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.MigrationShapefile <em>Migration Shapefile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration Shapefile</em>'.
	 * @see org.eclipse.stem.graphgenerators.MigrationShapefile
	 * @generated
	 */
	EClass getMigrationShapefile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MigrationShapefile#getPopulationName <em>Population Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Name</em>'.
	 * @see org.eclipse.stem.graphgenerators.MigrationShapefile#getPopulationName()
	 * @see #getMigrationShapefile()
	 * @generated
	 */
	EAttribute getMigrationShapefile_PopulationName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.MigrationShapefile#getMigrationRate <em>Migration Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Migration Rate</em>'.
	 * @see org.eclipse.stem.graphgenerators.MigrationShapefile#getMigrationRate()
	 * @see #getMigrationShapefile()
	 * @generated
	 */
	EAttribute getMigrationShapefile_MigrationRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator <em>Seasonal Migration Edge Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seasonal Migration Edge Graph Generator</em>'.
	 * @see org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator
	 * @generated
	 */
	EClass getSeasonalMigrationEdgeGraphGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getLocationA <em>Location A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location A</em>'.
	 * @see org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getLocationA()
	 * @see #getSeasonalMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getSeasonalMigrationEdgeGraphGenerator_LocationA();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getLocationB <em>Location B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location B</em>'.
	 * @see org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getLocationB()
	 * @see #getSeasonalMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getSeasonalMigrationEdgeGraphGenerator_LocationB();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getMigrationRate <em>Migration Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Migration Rate</em>'.
	 * @see org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getMigrationRate()
	 * @see #getSeasonalMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getSeasonalMigrationEdgeGraphGenerator_MigrationRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getPopulation()
	 * @see #getSeasonalMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getSeasonalMigrationEdgeGraphGenerator_Population();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getToleranceAngleA <em>Tolerance Angle A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance Angle A</em>'.
	 * @see org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getToleranceAngleA()
	 * @see #getSeasonalMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleA();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getToleranceAngleB <em>Tolerance Angle B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance Angle B</em>'.
	 * @see org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getToleranceAngleB()
	 * @see #getSeasonalMigrationEdgeGraphGenerator()
	 * @generated
	 */
	EAttribute getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleB();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.stem.graphgenerators.AreaUnit <em>Area Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Area Unit</em>'.
	 * @see org.eclipse.stem.graphgenerators.AreaUnit
	 * @generated
	 */
	EEnum getAreaUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphgeneratorsFactory getGraphgeneratorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.GraphGeneratorImpl <em>Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.GraphGeneratorImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getGraphGenerator()
		 * @generated
		 */
		EClass GRAPH_GENERATOR = eINSTANCE.getGraphGenerator();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.LatticeGraphGeneratorImpl <em>Lattice Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.LatticeGraphGeneratorImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getLatticeGraphGenerator()
		 * @generated
		 */
		EClass LATTICE_GRAPH_GENERATOR = eINSTANCE.getLatticeGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>Use Nearest Neighbors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTICE_GRAPH_GENERATOR__USE_NEAREST_NEIGHBORS = eINSTANCE.getLatticeGraphGenerator_UseNearestNeighbors();

		/**
		 * The meta object literal for the '<em><b>Use Next Nearest Neighbors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTICE_GRAPH_GENERATOR__USE_NEXT_NEAREST_NEIGHBORS = eINSTANCE.getLatticeGraphGenerator_UseNextNearestNeighbors();

		/**
		 * The meta object literal for the '<em><b>Periodic Boundaries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTICE_GRAPH_GENERATOR__PERIODIC_BOUNDARIES = eINSTANCE.getLatticeGraphGenerator_PeriodicBoundaries();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.SquareLatticeGraphGeneratorImpl <em>Square Lattice Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.SquareLatticeGraphGeneratorImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getSquareLatticeGraphGenerator()
		 * @generated
		 */
		EClass SQUARE_LATTICE_GRAPH_GENERATOR = eINSTANCE.getSquareLatticeGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>XSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE_LATTICE_GRAPH_GENERATOR__XSIZE = eINSTANCE.getSquareLatticeGraphGenerator_XSize();

		/**
		 * The meta object literal for the '<em><b>YSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE_LATTICE_GRAPH_GENERATOR__YSIZE = eINSTANCE.getSquareLatticeGraphGenerator_YSize();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE_LATTICE_GRAPH_GENERATOR__AREA = eINSTANCE.getSquareLatticeGraphGenerator_Area();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.MigrationEdgeGraphGeneratorImpl <em>Migration Edge Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.MigrationEdgeGraphGeneratorImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getMigrationEdgeGraphGenerator()
		 * @generated
		 */
		EClass MIGRATION_EDGE_GRAPH_GENERATOR = eINSTANCE.getMigrationEdgeGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION = eINSTANCE.getMigrationEdgeGraphGenerator_Location();

		/**
		 * The meta object literal for the '<em><b>Migration Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE = eINSTANCE.getMigrationEdgeGraphGenerator_MigrationRate();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION = eINSTANCE.getMigrationEdgeGraphGenerator_Population();

		/**
		 * The meta object literal for the '<em><b>Use Absolute Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES = eINSTANCE.getMigrationEdgeGraphGenerator_UseAbsoluteValues();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.MixingEdgeGraphGeneratorImpl <em>Mixing Edge Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.MixingEdgeGraphGeneratorImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getMixingEdgeGraphGenerator()
		 * @generated
		 */
		EClass MIXING_EDGE_GRAPH_GENERATOR = eINSTANCE.getMixingEdgeGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIXING_EDGE_GRAPH_GENERATOR__LOCATION = eINSTANCE.getMixingEdgeGraphGenerator_Location();

		/**
		 * The meta object literal for the '<em><b>Mixing Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIXING_EDGE_GRAPH_GENERATOR__MIXING_RATE = eINSTANCE.getMixingEdgeGraphGenerator_MixingRate();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIXING_EDGE_GRAPH_GENERATOR__POPULATION = eINSTANCE.getMixingEdgeGraphGenerator_Population();

		/**
		 * The meta object literal for the '<em><b>Use Absolute Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIXING_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES = eINSTANCE.getMixingEdgeGraphGenerator_UseAbsoluteValues();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.PlateCarreeGlobeGraphGeneratorImpl <em>Plate Carree Globe Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.PlateCarreeGlobeGraphGeneratorImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getPlateCarreeGlobeGraphGenerator()
		 * @generated
		 */
		EClass PLATE_CARREE_GLOBE_GRAPH_GENERATOR = eINSTANCE.getPlateCarreeGlobeGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>Angular Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATE_CARREE_GLOBE_GRAPH_GENERATOR__ANGULAR_STEP = eINSTANCE.getPlateCarreeGlobeGraphGenerator_AngularStep();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATE_CARREE_GLOBE_GRAPH_GENERATOR__RADIUS = eINSTANCE.getPlateCarreeGlobeGraphGenerator_Radius();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl <em>Pajek Net Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getPajekNetGraphGenerator()
		 * @generated
		 */
		EClass PAJEK_NET_GRAPH_GENERATOR = eINSTANCE.getPajekNetGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>Data File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAJEK_NET_GRAPH_GENERATOR__DATA_FILE = eINSTANCE.getPajekNetGraphGenerator_DataFile();

		/**
		 * The meta object literal for the '<em><b>Scaling Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR = eINSTANCE.getPajekNetGraphGenerator_ScalingFactor();

		/**
		 * The meta object literal for the '<em><b>Node Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE = eINSTANCE.getPajekNetGraphGenerator_NodeSize();

		/**
		 * The meta object literal for the '<em><b>Use Region URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI = eINSTANCE.getPajekNetGraphGenerator_UseRegionURI();

		/**
		 * The meta object literal for the '<em><b>Move Nodes To Containers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS = eINSTANCE.getPajekNetGraphGenerator_MoveNodesToContainers();

		/**
		 * The meta object literal for the '<em><b>Use Absolute Rates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES = eINSTANCE.getPajekNetGraphGenerator_UseAbsoluteRates();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.ShapefileGraphGeneratorImpl <em>Shapefile Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.ShapefileGraphGeneratorImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getShapefileGraphGenerator()
		 * @generated
		 */
		EClass SHAPEFILE_GRAPH_GENERATOR = eINSTANCE.getShapefileGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>Shapefiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPEFILE_GRAPH_GENERATOR__SHAPEFILES = eINSTANCE.getShapefileGraphGenerator_Shapefiles();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.ShapefileImpl <em>Shapefile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.ShapefileImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getShapefile()
		 * @generated
		 */
		EClass SHAPEFILE = eINSTANCE.getShapefile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPEFILE__FILE_NAME = eINSTANCE.getShapefile_FileName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPEFILE__ID = eINSTANCE.getShapefile_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.RegionShapefileImpl <em>Region Shapefile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.RegionShapefileImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getRegionShapefile()
		 * @generated
		 */
		EClass REGION_SHAPEFILE = eINSTANCE.getRegionShapefile();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_SHAPEFILE__AREA = eINSTANCE.getRegionShapefile_Area();

		/**
		 * The meta object literal for the '<em><b>Area Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_SHAPEFILE__AREA_UNIT = eINSTANCE.getRegionShapefile_AreaUnit();

		/**
		 * The meta object literal for the '<em><b>Population Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_SHAPEFILE__POPULATION_NAMES = eINSTANCE.getRegionShapefile_PopulationNames();

		/**
		 * The meta object literal for the '<em><b>Population Sizes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_SHAPEFILE__POPULATION_SIZES = eINSTANCE.getRegionShapefile_PopulationSizes();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.RoadShapefileImpl <em>Road Shapefile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.RoadShapefileImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getRoadShapefile()
		 * @generated
		 */
		EClass ROAD_SHAPEFILE = eINSTANCE.getRoadShapefile();

		/**
		 * The meta object literal for the '<em><b>Road Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD_SHAPEFILE__ROAD_CLASS = eINSTANCE.getRoadShapefile_RoadClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.MigrationShapefileImpl <em>Migration Shapefile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.MigrationShapefileImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getMigrationShapefile()
		 * @generated
		 */
		EClass MIGRATION_SHAPEFILE = eINSTANCE.getMigrationShapefile();

		/**
		 * The meta object literal for the '<em><b>Population Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_SHAPEFILE__POPULATION_NAME = eINSTANCE.getMigrationShapefile_PopulationName();

		/**
		 * The meta object literal for the '<em><b>Migration Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_SHAPEFILE__MIGRATION_RATE = eINSTANCE.getMigrationShapefile_MigrationRate();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl <em>Seasonal Migration Edge Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getSeasonalMigrationEdgeGraphGenerator()
		 * @generated
		 */
		EClass SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR = eINSTANCE.getSeasonalMigrationEdgeGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>Location A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A = eINSTANCE.getSeasonalMigrationEdgeGraphGenerator_LocationA();

		/**
		 * The meta object literal for the '<em><b>Location B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B = eINSTANCE.getSeasonalMigrationEdgeGraphGenerator_LocationB();

		/**
		 * The meta object literal for the '<em><b>Migration Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE = eINSTANCE.getSeasonalMigrationEdgeGraphGenerator_MigrationRate();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION = eINSTANCE.getSeasonalMigrationEdgeGraphGenerator_Population();

		/**
		 * The meta object literal for the '<em><b>Tolerance Angle A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A = eINSTANCE.getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleA();

		/**
		 * The meta object literal for the '<em><b>Tolerance Angle B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B = eINSTANCE.getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleB();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.graphgenerators.AreaUnit <em>Area Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.graphgenerators.AreaUnit
		 * @see org.eclipse.stem.graphgenerators.impl.GraphgeneratorsPackageImpl#getAreaUnit()
		 * @generated
		 */
		EEnum AREA_UNIT = eINSTANCE.getAreaUnit();

	}

} //GraphgeneratorsPackage