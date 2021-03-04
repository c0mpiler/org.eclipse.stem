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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage
 * @generated
 */
public class GraphgeneratorsSwitch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphgeneratorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgeneratorsSwitch() {
		if (modelPackage == null) {
			modelPackage = GraphgeneratorsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T1 doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GraphgeneratorsPackage.GRAPH_GENERATOR: {
				GraphGenerator graphGenerator = (GraphGenerator)theEObject;
				T1 result = caseGraphGenerator(graphGenerator);
				if (result == null) result = caseIdentifiable(graphGenerator);
				if (result == null) result = caseComparable(graphGenerator);
				if (result == null) result = caseSanityChecker(graphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.LATTICE_GRAPH_GENERATOR: {
				LatticeGraphGenerator latticeGraphGenerator = (LatticeGraphGenerator)theEObject;
				T1 result = caseLatticeGraphGenerator(latticeGraphGenerator);
				if (result == null) result = caseGraphGenerator(latticeGraphGenerator);
				if (result == null) result = caseIdentifiable(latticeGraphGenerator);
				if (result == null) result = caseComparable(latticeGraphGenerator);
				if (result == null) result = caseSanityChecker(latticeGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.SQUARE_LATTICE_GRAPH_GENERATOR: {
				SquareLatticeGraphGenerator squareLatticeGraphGenerator = (SquareLatticeGraphGenerator)theEObject;
				T1 result = caseSquareLatticeGraphGenerator(squareLatticeGraphGenerator);
				if (result == null) result = caseLatticeGraphGenerator(squareLatticeGraphGenerator);
				if (result == null) result = caseGraphGenerator(squareLatticeGraphGenerator);
				if (result == null) result = caseIdentifiable(squareLatticeGraphGenerator);
				if (result == null) result = caseComparable(squareLatticeGraphGenerator);
				if (result == null) result = caseSanityChecker(squareLatticeGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.MIGRATION_EDGE_GRAPH_GENERATOR: {
				MigrationEdgeGraphGenerator migrationEdgeGraphGenerator = (MigrationEdgeGraphGenerator)theEObject;
				T1 result = caseMigrationEdgeGraphGenerator(migrationEdgeGraphGenerator);
				if (result == null) result = caseGraphGenerator(migrationEdgeGraphGenerator);
				if (result == null) result = caseIdentifiable(migrationEdgeGraphGenerator);
				if (result == null) result = caseComparable(migrationEdgeGraphGenerator);
				if (result == null) result = caseSanityChecker(migrationEdgeGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR: {
				MixingEdgeGraphGenerator mixingEdgeGraphGenerator = (MixingEdgeGraphGenerator)theEObject;
				T1 result = caseMixingEdgeGraphGenerator(mixingEdgeGraphGenerator);
				if (result == null) result = caseGraphGenerator(mixingEdgeGraphGenerator);
				if (result == null) result = caseIdentifiable(mixingEdgeGraphGenerator);
				if (result == null) result = caseComparable(mixingEdgeGraphGenerator);
				if (result == null) result = caseSanityChecker(mixingEdgeGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.PLATE_CARREE_GLOBE_GRAPH_GENERATOR: {
				PlateCarreeGlobeGraphGenerator plateCarreeGlobeGraphGenerator = (PlateCarreeGlobeGraphGenerator)theEObject;
				T1 result = casePlateCarreeGlobeGraphGenerator(plateCarreeGlobeGraphGenerator);
				if (result == null) result = caseLatticeGraphGenerator(plateCarreeGlobeGraphGenerator);
				if (result == null) result = caseGraphGenerator(plateCarreeGlobeGraphGenerator);
				if (result == null) result = caseIdentifiable(plateCarreeGlobeGraphGenerator);
				if (result == null) result = caseComparable(plateCarreeGlobeGraphGenerator);
				if (result == null) result = caseSanityChecker(plateCarreeGlobeGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR: {
				PajekNetGraphGenerator pajekNetGraphGenerator = (PajekNetGraphGenerator)theEObject;
				T1 result = casePajekNetGraphGenerator(pajekNetGraphGenerator);
				if (result == null) result = caseGraphGenerator(pajekNetGraphGenerator);
				if (result == null) result = caseIdentifiable(pajekNetGraphGenerator);
				if (result == null) result = caseComparable(pajekNetGraphGenerator);
				if (result == null) result = caseSanityChecker(pajekNetGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.SHAPEFILE_GRAPH_GENERATOR: {
				ShapefileGraphGenerator shapefileGraphGenerator = (ShapefileGraphGenerator)theEObject;
				T1 result = caseShapefileGraphGenerator(shapefileGraphGenerator);
				if (result == null) result = caseGraphGenerator(shapefileGraphGenerator);
				if (result == null) result = caseIdentifiable(shapefileGraphGenerator);
				if (result == null) result = caseComparable(shapefileGraphGenerator);
				if (result == null) result = caseSanityChecker(shapefileGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.SHAPEFILE: {
				Shapefile shapefile = (Shapefile)theEObject;
				T1 result = caseShapefile(shapefile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.REGION_SHAPEFILE: {
				RegionShapefile regionShapefile = (RegionShapefile)theEObject;
				T1 result = caseRegionShapefile(regionShapefile);
				if (result == null) result = caseShapefile(regionShapefile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.ROAD_SHAPEFILE: {
				RoadShapefile roadShapefile = (RoadShapefile)theEObject;
				T1 result = caseRoadShapefile(roadShapefile);
				if (result == null) result = caseShapefile(roadShapefile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE: {
				MigrationShapefile migrationShapefile = (MigrationShapefile)theEObject;
				T1 result = caseMigrationShapefile(migrationShapefile);
				if (result == null) result = caseShapefile(migrationShapefile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR: {
				SeasonalMigrationEdgeGraphGenerator seasonalMigrationEdgeGraphGenerator = (SeasonalMigrationEdgeGraphGenerator)theEObject;
				T1 result = caseSeasonalMigrationEdgeGraphGenerator(seasonalMigrationEdgeGraphGenerator);
				if (result == null) result = caseGraphGenerator(seasonalMigrationEdgeGraphGenerator);
				if (result == null) result = caseIdentifiable(seasonalMigrationEdgeGraphGenerator);
				if (result == null) result = caseComparable(seasonalMigrationEdgeGraphGenerator);
				if (result == null) result = caseSanityChecker(seasonalMigrationEdgeGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphGenerator(GraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lattice Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lattice Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLatticeGraphGenerator(LatticeGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Square Lattice Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Square Lattice Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSquareLatticeGraphGenerator(SquareLatticeGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migration Edge Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migration Edge Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMigrationEdgeGraphGenerator(MigrationEdgeGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixing Edge Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixing Edge Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMixingEdgeGraphGenerator(MixingEdgeGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plate Carree Globe Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plate Carree Globe Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlateCarreeGlobeGraphGenerator(PlateCarreeGlobeGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pajek Net Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pajek Net Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePajekNetGraphGenerator(PajekNetGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shapefile Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shapefile Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseShapefileGraphGenerator(ShapefileGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shapefile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shapefile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseShapefile(Shapefile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Shapefile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Shapefile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRegionShapefile(RegionShapefile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Road Shapefile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Road Shapefile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRoadShapefile(RoadShapefile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migration Shapefile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migration Shapefile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMigrationShapefile(MigrationShapefile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seasonal Migration Edge Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seasonal Migration Edge Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSeasonalMigrationEdgeGraphGenerator(SeasonalMigrationEdgeGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseComparable(Comparable<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sanity Checker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sanity Checker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSanityChecker(SanityChecker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T1 defaultCase(EObject object) {
		return null;
	}

} //GraphgeneratorsSwitch
