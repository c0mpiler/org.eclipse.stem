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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage
 * @generated
 */
public class ImagewriterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImagewriterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagewriterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImagewriterPackage.eINSTANCE;
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
	protected ImagewriterSwitch<Adapter> modelSwitch =
		new ImagewriterSwitch<Adapter>() {
			@Override
			public Adapter caseImageWriterLogger(ImageWriterLogger object) {
				return createImageWriterLoggerAdapter();
			}
			@Override
			public Adapter caseProjectedMapImageLogger(ProjectedMapImageLogger object) {
				return createProjectedMapImageLoggerAdapter();
			}
			@Override
			public Adapter caseMapViewImageWriterLogger(MapViewImageWriterLogger object) {
				return createMapViewImageWriterLoggerAdapter();
			}
			@Override
			public Adapter caseEquirectangularMapLogger(EquirectangularMapLogger object) {
				return createEquirectangularMapLoggerAdapter();
			}
			@Override
			public Adapter caseMercatorMapLogger(MercatorMapLogger object) {
				return createMercatorMapLoggerAdapter();
			}
			@Override
			public Adapter caseOriginDependentProjectedMapImageLogger(OriginDependentProjectedMapImageLogger object) {
				return createOriginDependentProjectedMapImageLoggerAdapter();
			}
			@Override
			public Adapter caseAzimuthalEquidistantMapLogger(AzimuthalEquidistantMapLogger object) {
				return createAzimuthalEquidistantMapLoggerAdapter();
			}
			@Override
			public Adapter caseOrthographicMapLogger(OrthographicMapLogger object) {
				return createOrthographicMapLoggerAdapter();
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
			public Adapter caseLogger(Logger object) {
				return createLoggerAdapter();
			}
			@Override
			public Adapter caseSimulationLogger(SimulationLogger object) {
				return createSimulationLoggerAdapter();
			}
			@Override
			public Adapter caseSynchronousLogger(SynchronousLogger object) {
				return createSynchronousLoggerAdapter();
			}
			@Override
			public Adapter caseSynchronousDecoratorPropertyLogger(SynchronousDecoratorPropertyLogger object) {
				return createSynchronousDecoratorPropertyLoggerAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.imagewriter.ImageWriterLogger <em>Image Writer Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.imagewriter.ImageWriterLogger
	 * @generated
	 */
	public Adapter createImageWriterLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger <em>Projected Map Image Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger
	 * @generated
	 */
	public Adapter createProjectedMapImageLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger <em>Map View Image Writer Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger
	 * @generated
	 */
	public Adapter createMapViewImageWriterLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.imagewriter.EquirectangularMapLogger <em>Equirectangular Map Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.imagewriter.EquirectangularMapLogger
	 * @generated
	 */
	public Adapter createEquirectangularMapLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.imagewriter.MercatorMapLogger <em>Mercator Map Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.imagewriter.MercatorMapLogger
	 * @generated
	 */
	public Adapter createMercatorMapLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger <em>Origin Dependent Projected Map Image Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger
	 * @generated
	 */
	public Adapter createOriginDependentProjectedMapImageLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.imagewriter.AzimuthalEquidistantMapLogger <em>Azimuthal Equidistant Map Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.imagewriter.AzimuthalEquidistantMapLogger
	 * @generated
	 */
	public Adapter createAzimuthalEquidistantMapLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.imagewriter.OrthographicMapLogger <em>Orthographic Map Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.imagewriter.OrthographicMapLogger
	 * @generated
	 */
	public Adapter createOrthographicMapLoggerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.logger.Logger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.logger.Logger
	 * @generated
	 */
	public Adapter createLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.SimulationLogger <em>Simulation Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.SimulationLogger
	 * @generated
	 */
	public Adapter createSimulationLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.SynchronousLogger <em>Synchronous Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.SynchronousLogger
	 * @generated
	 */
	public Adapter createSynchronousLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger <em>Synchronous Decorator Property Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger
	 * @generated
	 */
	public Adapter createSynchronousDecoratorPropertyLoggerAdapter() {
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

} //ImagewriterAdapterFactory
