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
package org.eclipse.stem.graphgenerators.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.SanityChecker;
import org.eclipse.stem.graphgenerators.GraphGenerator;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage
 * @generated
 */
public class GraphgeneratorsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphgeneratorsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgeneratorsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GraphgeneratorsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphgeneratorsSwitch<Adapter> modelSwitch =
		new GraphgeneratorsSwitch<Adapter>() {
			@Override
			public Adapter caseGraphGenerator(GraphGenerator object) {
				return createGraphGeneratorAdapter();
			}
			@Override
			public Adapter caseLatticeGraphGenerator(LatticeGraphGenerator object) {
				return createLatticeGraphGeneratorAdapter();
			}
			@Override
			public Adapter caseSquareLatticeGraphGenerator(SquareLatticeGraphGenerator object) {
				return createSquareLatticeGraphGeneratorAdapter();
			}
			@Override
			public Adapter caseMigrationEdgeGraphGenerator(MigrationEdgeGraphGenerator object) {
				return createMigrationEdgeGraphGeneratorAdapter();
			}
			@Override
			public Adapter caseMixingEdgeGraphGenerator(MixingEdgeGraphGenerator object) {
				return createMixingEdgeGraphGeneratorAdapter();
			}
			@Override
			public Adapter casePlateCarreeGlobeGraphGenerator(PlateCarreeGlobeGraphGenerator object) {
				return createPlateCarreeGlobeGraphGeneratorAdapter();
			}
			@Override
			public Adapter casePajekNetGraphGenerator(PajekNetGraphGenerator object) {
				return createPajekNetGraphGeneratorAdapter();
			}
			@Override
			public Adapter caseShapefileGraphGenerator(ShapefileGraphGenerator object) {
				return createShapefileGraphGeneratorAdapter();
			}
			@Override
			public Adapter caseShapefile(Shapefile object) {
				return createShapefileAdapter();
			}
			@Override
			public Adapter caseRegionShapefile(RegionShapefile object) {
				return createRegionShapefileAdapter();
			}
			@Override
			public Adapter caseRoadShapefile(RoadShapefile object) {
				return createRoadShapefileAdapter();
			}
			@Override
			public Adapter caseMigrationShapefile(MigrationShapefile object) {
				return createMigrationShapefileAdapter();
			}
			@Override
			public Adapter caseSeasonalMigrationEdgeGraphGenerator(SeasonalMigrationEdgeGraphGenerator object) {
				return createSeasonalMigrationEdgeGraphGeneratorAdapter();
			}
			@Override
			public <T> Adapter caseComparable(Comparable<T> object) {
				return createComparableAdapter();
			}
			@Override
			public Adapter caseSanityChecker(SanityChecker object) {
				return createSanityCheckerAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.GraphGenerator <em>Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.GraphGenerator
	 * @generated
	 */
	public Adapter createGraphGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.LatticeGraphGenerator <em>Lattice Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.LatticeGraphGenerator
	 * @generated
	 */
	public Adapter createLatticeGraphGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator <em>Square Lattice Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator
	 * @generated
	 */
	public Adapter createSquareLatticeGraphGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator <em>Migration Edge Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator
	 * @generated
	 */
	public Adapter createMigrationEdgeGraphGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator <em>Mixing Edge Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator
	 * @generated
	 */
	public Adapter createMixingEdgeGraphGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator <em>Plate Carree Globe Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator
	 * @generated
	 */
	public Adapter createPlateCarreeGlobeGraphGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator <em>Pajek Net Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.PajekNetGraphGenerator
	 * @generated
	 */
	public Adapter createPajekNetGraphGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.ShapefileGraphGenerator <em>Shapefile Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.ShapefileGraphGenerator
	 * @generated
	 */
	public Adapter createShapefileGraphGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.Shapefile <em>Shapefile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.Shapefile
	 * @generated
	 */
	public Adapter createShapefileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.RegionShapefile <em>Region Shapefile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.RegionShapefile
	 * @generated
	 */
	public Adapter createRegionShapefileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.RoadShapefile <em>Road Shapefile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.RoadShapefile
	 * @generated
	 */
	public Adapter createRoadShapefileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.MigrationShapefile <em>Migration Shapefile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.MigrationShapefile
	 * @generated
	 */
	public Adapter createMigrationShapefileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator <em>Seasonal Migration Edge Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator
	 * @generated
	 */
	public Adapter createSeasonalMigrationEdgeGraphGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Comparable
	 * @generated
	 */
	public Adapter createComparableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.common.SanityChecker <em>Sanity Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.common.SanityChecker
	 * @generated
	 */
	public Adapter createSanityCheckerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.common.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.common.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GraphgeneratorsAdapterFactory
