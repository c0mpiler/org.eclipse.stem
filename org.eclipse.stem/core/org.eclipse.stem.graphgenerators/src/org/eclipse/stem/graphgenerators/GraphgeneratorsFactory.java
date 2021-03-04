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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage
 * @generated
 */
public interface GraphgeneratorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphgeneratorsFactory eINSTANCE = org.eclipse.stem.graphgenerators.impl.GraphgeneratorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Square Lattice Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Square Lattice Graph Generator</em>'.
	 * @generated
	 */
	SquareLatticeGraphGenerator createSquareLatticeGraphGenerator();

	/**
	 * Returns a new object of class '<em>Migration Edge Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migration Edge Graph Generator</em>'.
	 * @generated
	 */
	MigrationEdgeGraphGenerator createMigrationEdgeGraphGenerator();

	/**
	 * Returns a new object of class '<em>Mixing Edge Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixing Edge Graph Generator</em>'.
	 * @generated
	 */
	MixingEdgeGraphGenerator createMixingEdgeGraphGenerator();

	/**
	 * Returns a new object of class '<em>Plate Carree Globe Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plate Carree Globe Graph Generator</em>'.
	 * @generated
	 */
	PlateCarreeGlobeGraphGenerator createPlateCarreeGlobeGraphGenerator();

	/**
	 * Returns a new object of class '<em>Pajek Net Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pajek Net Graph Generator</em>'.
	 * @generated
	 */
	PajekNetGraphGenerator createPajekNetGraphGenerator();

	/**
	 * Returns a new object of class '<em>Shapefile Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shapefile Graph Generator</em>'.
	 * @generated
	 */
	ShapefileGraphGenerator createShapefileGraphGenerator();

	/**
	 * Returns a new object of class '<em>Region Shapefile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Shapefile</em>'.
	 * @generated
	 */
	RegionShapefile createRegionShapefile();

	/**
	 * Returns a new object of class '<em>Road Shapefile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Road Shapefile</em>'.
	 * @generated
	 */
	RoadShapefile createRoadShapefile();

	/**
	 * Returns a new object of class '<em>Migration Shapefile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migration Shapefile</em>'.
	 * @generated
	 */
	MigrationShapefile createMigrationShapefile();

	/**
	 * Returns a new object of class '<em>Seasonal Migration Edge Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seasonal Migration Edge Graph Generator</em>'.
	 * @generated
	 */
	SeasonalMigrationEdgeGraphGenerator createSeasonalMigrationEdgeGraphGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraphgeneratorsPackage getGraphgeneratorsPackage();

} //GraphgeneratorsFactory
