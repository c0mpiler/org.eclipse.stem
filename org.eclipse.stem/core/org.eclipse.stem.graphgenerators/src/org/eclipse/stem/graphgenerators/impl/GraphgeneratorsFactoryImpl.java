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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.graphgenerators.AreaUnit;
import org.eclipse.stem.graphgenerators.GraphgeneratorsFactory;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.MigrationShapefile;
import org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.PajekNetGraphGenerator;
import org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator;
import org.eclipse.stem.graphgenerators.RegionShapefile;
import org.eclipse.stem.graphgenerators.RoadShapefile;
import org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.ShapefileGraphGenerator;
import org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphgeneratorsFactoryImpl extends EFactoryImpl implements GraphgeneratorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphgeneratorsFactory init() {
		try {
			GraphgeneratorsFactory theGraphgeneratorsFactory = (GraphgeneratorsFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/graphgenerators/graphgenerators.ecore"); 
			if (theGraphgeneratorsFactory != null) {
				return theGraphgeneratorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphgeneratorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgeneratorsFactoryImpl() {
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
			case GraphgeneratorsPackage.SQUARE_LATTICE_GRAPH_GENERATOR: return createSquareLatticeGraphGenerator();
			case GraphgeneratorsPackage.MIGRATION_EDGE_GRAPH_GENERATOR: return createMigrationEdgeGraphGenerator();
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR: return createMixingEdgeGraphGenerator();
			case GraphgeneratorsPackage.PLATE_CARREE_GLOBE_GRAPH_GENERATOR: return createPlateCarreeGlobeGraphGenerator();
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR: return createPajekNetGraphGenerator();
			case GraphgeneratorsPackage.SHAPEFILE_GRAPH_GENERATOR: return createShapefileGraphGenerator();
			case GraphgeneratorsPackage.REGION_SHAPEFILE: return createRegionShapefile();
			case GraphgeneratorsPackage.ROAD_SHAPEFILE: return createRoadShapefile();
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE: return createMigrationShapefile();
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR: return createSeasonalMigrationEdgeGraphGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GraphgeneratorsPackage.AREA_UNIT:
				return createAreaUnitFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GraphgeneratorsPackage.AREA_UNIT:
				return convertAreaUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SquareLatticeGraphGenerator createSquareLatticeGraphGenerator() {
		SquareLatticeGraphGeneratorImpl squareLatticeGraphGenerator = new SquareLatticeGraphGeneratorImpl();
		return squareLatticeGraphGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationEdgeGraphGenerator createMigrationEdgeGraphGenerator() {
		MigrationEdgeGraphGeneratorImpl migrationEdgeGraphGenerator = new MigrationEdgeGraphGeneratorImpl();
		return migrationEdgeGraphGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixingEdgeGraphGenerator createMixingEdgeGraphGenerator() {
		MixingEdgeGraphGeneratorImpl mixingEdgeGraphGenerator = new MixingEdgeGraphGeneratorImpl();
		return mixingEdgeGraphGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlateCarreeGlobeGraphGenerator createPlateCarreeGlobeGraphGenerator() {
		PlateCarreeGlobeGraphGeneratorImpl plateCarreeGlobeGraphGenerator = new PlateCarreeGlobeGraphGeneratorImpl();
		return plateCarreeGlobeGraphGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PajekNetGraphGenerator createPajekNetGraphGenerator() {
		PajekNetGraphGeneratorImpl pajekNetGraphGenerator = new PajekNetGraphGeneratorImpl();
		return pajekNetGraphGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapefileGraphGenerator createShapefileGraphGenerator() {
		ShapefileGraphGeneratorImpl shapefileGraphGenerator = new ShapefileGraphGeneratorImpl();
		return shapefileGraphGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionShapefile createRegionShapefile() {
		RegionShapefileImpl regionShapefile = new RegionShapefileImpl();
		return regionShapefile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadShapefile createRoadShapefile() {
		RoadShapefileImpl roadShapefile = new RoadShapefileImpl();
		return roadShapefile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationShapefile createMigrationShapefile() {
		MigrationShapefileImpl migrationShapefile = new MigrationShapefileImpl();
		return migrationShapefile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonalMigrationEdgeGraphGenerator createSeasonalMigrationEdgeGraphGenerator() {
		SeasonalMigrationEdgeGraphGeneratorImpl seasonalMigrationEdgeGraphGenerator = new SeasonalMigrationEdgeGraphGeneratorImpl();
		return seasonalMigrationEdgeGraphGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaUnit createAreaUnitFromString(EDataType eDataType, String initialValue) {
		AreaUnit result = AreaUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAreaUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgeneratorsPackage getGraphgeneratorsPackage() {
		return (GraphgeneratorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphgeneratorsPackage getPackage() {
		return GraphgeneratorsPackage.eINSTANCE;
	}

} //GraphgeneratorsFactoryImpl
