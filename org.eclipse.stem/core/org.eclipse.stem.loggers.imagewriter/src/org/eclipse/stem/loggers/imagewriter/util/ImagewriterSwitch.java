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
package org.eclipse.stem.loggers.imagewriter.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.SanityChecker;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.loggers.SimulationLogger;
import org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger;
import org.eclipse.stem.loggers.SynchronousLogger;
import org.eclipse.stem.loggers.imagewriter.AzimuthalEquidistantMapLogger;
import org.eclipse.stem.loggers.imagewriter.EquirectangularMapLogger;
import org.eclipse.stem.loggers.imagewriter.ImageWriterLogger;
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger;
import org.eclipse.stem.loggers.imagewriter.MercatorMapLogger;
import org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger;
import org.eclipse.stem.loggers.imagewriter.OrthographicMapLogger;
import org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger;

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
 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage
 * @generated
 */
public class ImagewriterSwitch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImagewriterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagewriterSwitch() {
		if (modelPackage == null) {
			modelPackage = ImagewriterPackage.eINSTANCE;
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
			case ImagewriterPackage.IMAGE_WRITER_LOGGER: {
				ImageWriterLogger imageWriterLogger = (ImageWriterLogger)theEObject;
				T1 result = caseImageWriterLogger(imageWriterLogger);
				if (result == null) result = caseSynchronousLogger(imageWriterLogger);
				if (result == null) result = caseSimulationLogger(imageWriterLogger);
				if (result == null) result = caseLogger(imageWriterLogger);
				if (result == null) result = caseIdentifiable(imageWriterLogger);
				if (result == null) result = caseComparable(imageWriterLogger);
				if (result == null) result = caseSanityChecker(imageWriterLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER: {
				ProjectedMapImageLogger projectedMapImageLogger = (ProjectedMapImageLogger)theEObject;
				T1 result = caseProjectedMapImageLogger(projectedMapImageLogger);
				if (result == null) result = caseSynchronousDecoratorPropertyLogger(projectedMapImageLogger);
				if (result == null) result = caseImageWriterLogger(projectedMapImageLogger);
				if (result == null) result = caseSynchronousLogger(projectedMapImageLogger);
				if (result == null) result = caseSimulationLogger(projectedMapImageLogger);
				if (result == null) result = caseLogger(projectedMapImageLogger);
				if (result == null) result = caseIdentifiable(projectedMapImageLogger);
				if (result == null) result = caseComparable(projectedMapImageLogger);
				if (result == null) result = caseSanityChecker(projectedMapImageLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImagewriterPackage.MAP_VIEW_IMAGE_WRITER_LOGGER: {
				MapViewImageWriterLogger mapViewImageWriterLogger = (MapViewImageWriterLogger)theEObject;
				T1 result = caseMapViewImageWriterLogger(mapViewImageWriterLogger);
				if (result == null) result = caseImageWriterLogger(mapViewImageWriterLogger);
				if (result == null) result = caseSynchronousLogger(mapViewImageWriterLogger);
				if (result == null) result = caseSimulationLogger(mapViewImageWriterLogger);
				if (result == null) result = caseLogger(mapViewImageWriterLogger);
				if (result == null) result = caseIdentifiable(mapViewImageWriterLogger);
				if (result == null) result = caseComparable(mapViewImageWriterLogger);
				if (result == null) result = caseSanityChecker(mapViewImageWriterLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImagewriterPackage.EQUIRECTANGULAR_MAP_LOGGER: {
				EquirectangularMapLogger equirectangularMapLogger = (EquirectangularMapLogger)theEObject;
				T1 result = caseEquirectangularMapLogger(equirectangularMapLogger);
				if (result == null) result = caseProjectedMapImageLogger(equirectangularMapLogger);
				if (result == null) result = caseSynchronousDecoratorPropertyLogger(equirectangularMapLogger);
				if (result == null) result = caseImageWriterLogger(equirectangularMapLogger);
				if (result == null) result = caseSynchronousLogger(equirectangularMapLogger);
				if (result == null) result = caseSimulationLogger(equirectangularMapLogger);
				if (result == null) result = caseLogger(equirectangularMapLogger);
				if (result == null) result = caseIdentifiable(equirectangularMapLogger);
				if (result == null) result = caseComparable(equirectangularMapLogger);
				if (result == null) result = caseSanityChecker(equirectangularMapLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImagewriterPackage.MERCATOR_MAP_LOGGER: {
				MercatorMapLogger mercatorMapLogger = (MercatorMapLogger)theEObject;
				T1 result = caseMercatorMapLogger(mercatorMapLogger);
				if (result == null) result = caseProjectedMapImageLogger(mercatorMapLogger);
				if (result == null) result = caseSynchronousDecoratorPropertyLogger(mercatorMapLogger);
				if (result == null) result = caseImageWriterLogger(mercatorMapLogger);
				if (result == null) result = caseSynchronousLogger(mercatorMapLogger);
				if (result == null) result = caseSimulationLogger(mercatorMapLogger);
				if (result == null) result = caseLogger(mercatorMapLogger);
				if (result == null) result = caseIdentifiable(mercatorMapLogger);
				if (result == null) result = caseComparable(mercatorMapLogger);
				if (result == null) result = caseSanityChecker(mercatorMapLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImagewriterPackage.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER: {
				OriginDependentProjectedMapImageLogger originDependentProjectedMapImageLogger = (OriginDependentProjectedMapImageLogger)theEObject;
				T1 result = caseOriginDependentProjectedMapImageLogger(originDependentProjectedMapImageLogger);
				if (result == null) result = caseProjectedMapImageLogger(originDependentProjectedMapImageLogger);
				if (result == null) result = caseSynchronousDecoratorPropertyLogger(originDependentProjectedMapImageLogger);
				if (result == null) result = caseImageWriterLogger(originDependentProjectedMapImageLogger);
				if (result == null) result = caseSynchronousLogger(originDependentProjectedMapImageLogger);
				if (result == null) result = caseSimulationLogger(originDependentProjectedMapImageLogger);
				if (result == null) result = caseLogger(originDependentProjectedMapImageLogger);
				if (result == null) result = caseIdentifiable(originDependentProjectedMapImageLogger);
				if (result == null) result = caseComparable(originDependentProjectedMapImageLogger);
				if (result == null) result = caseSanityChecker(originDependentProjectedMapImageLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImagewriterPackage.AZIMUTHAL_EQUIDISTANT_MAP_LOGGER: {
				AzimuthalEquidistantMapLogger azimuthalEquidistantMapLogger = (AzimuthalEquidistantMapLogger)theEObject;
				T1 result = caseAzimuthalEquidistantMapLogger(azimuthalEquidistantMapLogger);
				if (result == null) result = caseOriginDependentProjectedMapImageLogger(azimuthalEquidistantMapLogger);
				if (result == null) result = caseProjectedMapImageLogger(azimuthalEquidistantMapLogger);
				if (result == null) result = caseSynchronousDecoratorPropertyLogger(azimuthalEquidistantMapLogger);
				if (result == null) result = caseImageWriterLogger(azimuthalEquidistantMapLogger);
				if (result == null) result = caseSynchronousLogger(azimuthalEquidistantMapLogger);
				if (result == null) result = caseSimulationLogger(azimuthalEquidistantMapLogger);
				if (result == null) result = caseLogger(azimuthalEquidistantMapLogger);
				if (result == null) result = caseIdentifiable(azimuthalEquidistantMapLogger);
				if (result == null) result = caseComparable(azimuthalEquidistantMapLogger);
				if (result == null) result = caseSanityChecker(azimuthalEquidistantMapLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImagewriterPackage.ORTHOGRAPHIC_MAP_LOGGER: {
				OrthographicMapLogger orthographicMapLogger = (OrthographicMapLogger)theEObject;
				T1 result = caseOrthographicMapLogger(orthographicMapLogger);
				if (result == null) result = caseOriginDependentProjectedMapImageLogger(orthographicMapLogger);
				if (result == null) result = caseProjectedMapImageLogger(orthographicMapLogger);
				if (result == null) result = caseSynchronousDecoratorPropertyLogger(orthographicMapLogger);
				if (result == null) result = caseImageWriterLogger(orthographicMapLogger);
				if (result == null) result = caseSynchronousLogger(orthographicMapLogger);
				if (result == null) result = caseSimulationLogger(orthographicMapLogger);
				if (result == null) result = caseLogger(orthographicMapLogger);
				if (result == null) result = caseIdentifiable(orthographicMapLogger);
				if (result == null) result = caseComparable(orthographicMapLogger);
				if (result == null) result = caseSanityChecker(orthographicMapLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Writer Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Writer Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseImageWriterLogger(ImageWriterLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projected Map Image Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projected Map Image Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProjectedMapImageLogger(ProjectedMapImageLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map View Image Writer Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map View Image Writer Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMapViewImageWriterLogger(MapViewImageWriterLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equirectangular Map Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equirectangular Map Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEquirectangularMapLogger(EquirectangularMapLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mercator Map Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mercator Map Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMercatorMapLogger(MercatorMapLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Origin Dependent Projected Map Image Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Origin Dependent Projected Map Image Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOriginDependentProjectedMapImageLogger(OriginDependentProjectedMapImageLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Azimuthal Equidistant Map Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Azimuthal Equidistant Map Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAzimuthalEquidistantMapLogger(AzimuthalEquidistantMapLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orthographic Map Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orthographic Map Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOrthographicMapLogger(OrthographicMapLogger object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLogger(Logger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSimulationLogger(SimulationLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSynchronousLogger(SynchronousLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Decorator Property Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Decorator Property Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSynchronousDecoratorPropertyLogger(SynchronousDecoratorPropertyLogger object) {
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

} //ImagewriterSwitch
