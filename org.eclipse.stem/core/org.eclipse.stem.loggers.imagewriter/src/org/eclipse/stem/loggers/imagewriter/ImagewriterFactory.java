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
package org.eclipse.stem.loggers.imagewriter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage
 * @generated
 */
public interface ImagewriterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImagewriterFactory eINSTANCE = org.eclipse.stem.loggers.imagewriter.impl.ImagewriterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Map View Image Writer Logger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map View Image Writer Logger</em>'.
	 * @generated
	 */
	MapViewImageWriterLogger createMapViewImageWriterLogger();

	/**
	 * Returns a new object of class '<em>Equirectangular Map Logger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equirectangular Map Logger</em>'.
	 * @generated
	 */
	EquirectangularMapLogger createEquirectangularMapLogger();

	/**
	 * Returns a new object of class '<em>Mercator Map Logger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mercator Map Logger</em>'.
	 * @generated
	 */
	MercatorMapLogger createMercatorMapLogger();

	/**
	 * Returns a new object of class '<em>Azimuthal Equidistant Map Logger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Azimuthal Equidistant Map Logger</em>'.
	 * @generated
	 */
	AzimuthalEquidistantMapLogger createAzimuthalEquidistantMapLogger();

	/**
	 * Returns a new object of class '<em>Orthographic Map Logger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orthographic Map Logger</em>'.
	 * @generated
	 */
	OrthographicMapLogger createOrthographicMapLogger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImagewriterPackage getImagewriterPackage();

} //ImagewriterFactory
