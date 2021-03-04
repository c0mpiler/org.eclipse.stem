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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.loggers.SimulationLoggerPackage;

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
 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterFactory
 * @model kind="package"
 * @generated
 */
public interface ImagewriterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imagewriter"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/stem/loggers/imagewriter"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.loggers.imagewriter.model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImagewriterPackage eINSTANCE = org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.imagewriter.impl.ImageWriterLoggerImpl <em>Image Writer Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImageWriterLoggerImpl
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getImageWriterLogger()
	 * @generated
	 */
	int IMAGE_WRITER_LOGGER = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WRITER_LOGGER__URI = SimulationLoggerPackage.SYNCHRONOUS_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WRITER_LOGGER__TYPE_URI = SimulationLoggerPackage.SYNCHRONOUS_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WRITER_LOGGER__DUBLIN_CORE = SimulationLoggerPackage.SYNCHRONOUS_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WRITER_LOGGER__ENABLED = SimulationLoggerPackage.SYNCHRONOUS_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WRITER_LOGGER__STEP_MOD = SimulationLoggerPackage.SYNCHRONOUS_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY = SimulationLoggerPackage.SYNCHRONOUS_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WRITER_LOGGER__DATA_PATH = SimulationLoggerPackage.SYNCHRONOUS_LOGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image Writer Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WRITER_LOGGER_FEATURE_COUNT = SimulationLoggerPackage.SYNCHRONOUS_LOGGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl <em>Projected Map Image Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getProjectedMapImageLogger()
	 * @generated
	 */
	int PROJECTED_MAP_IMAGE_LOGGER = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__URI = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__TYPE_URI = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__DUBLIN_CORE = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__ENABLED = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__STEP_MOD = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__PROPERTIES = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__PROJECTION = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__WIDTH = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__HEIGHT = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Force Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fit To Shape Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Log Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__GAIN = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Color Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transparent Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Border Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Projected Map Image Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_MAP_IMAGE_LOGGER_FEATURE_COUNT = SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.imagewriter.impl.MapViewImageWriterLoggerImpl <em>Map View Image Writer Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.impl.MapViewImageWriterLoggerImpl
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getMapViewImageWriterLogger()
	 * @generated
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER__URI = IMAGE_WRITER_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER__TYPE_URI = IMAGE_WRITER_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER__DUBLIN_CORE = IMAGE_WRITER_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER__ENABLED = IMAGE_WRITER_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER__STEP_MOD = IMAGE_WRITER_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY = IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER__DATA_PATH = IMAGE_WRITER_LOGGER__DATA_PATH;

	/**
	 * The feature id for the '<em><b>Open Map View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER__OPEN_MAP_VIEW = IMAGE_WRITER_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map View Image Writer Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_IMAGE_WRITER_LOGGER_FEATURE_COUNT = IMAGE_WRITER_LOGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.imagewriter.impl.EquirectangularMapLoggerImpl <em>Equirectangular Map Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.impl.EquirectangularMapLoggerImpl
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getEquirectangularMapLogger()
	 * @generated
	 */
	int EQUIRECTANGULAR_MAP_LOGGER = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__URI = PROJECTED_MAP_IMAGE_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__TYPE_URI = PROJECTED_MAP_IMAGE_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__DUBLIN_CORE = PROJECTED_MAP_IMAGE_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__ENABLED = PROJECTED_MAP_IMAGE_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__STEP_MOD = PROJECTED_MAP_IMAGE_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__PROPERTIES = PROJECTED_MAP_IMAGE_LOGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__USE_DEFAULT_LOG_DIRECTORY = PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__DATA_PATH = PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__PROJECTION = PROJECTED_MAP_IMAGE_LOGGER__PROJECTION;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__WIDTH = PROJECTED_MAP_IMAGE_LOGGER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__HEIGHT = PROJECTED_MAP_IMAGE_LOGGER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Force Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__FORCE_ASPECT_RATIO = PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Fit To Shape Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__FIT_TO_SHAPE_BOUNDS = PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Log Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__LOG_SCALING = PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__GAIN = PROJECTED_MAP_IMAGE_LOGGER__GAIN;

	/**
	 * The feature id for the '<em><b>Color Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__COLOR_PROVIDER = PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER;

	/**
	 * The feature id for the '<em><b>Transparent Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__TRANSPARENT_BACKGROUND = PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Border Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER__BORDER_TRANSPARENCY = PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY;

	/**
	 * The number of structural features of the '<em>Equirectangular Map Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIRECTANGULAR_MAP_LOGGER_FEATURE_COUNT = PROJECTED_MAP_IMAGE_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.imagewriter.impl.MercatorMapLoggerImpl <em>Mercator Map Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.impl.MercatorMapLoggerImpl
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getMercatorMapLogger()
	 * @generated
	 */
	int MERCATOR_MAP_LOGGER = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__URI = PROJECTED_MAP_IMAGE_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__TYPE_URI = PROJECTED_MAP_IMAGE_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__DUBLIN_CORE = PROJECTED_MAP_IMAGE_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__ENABLED = PROJECTED_MAP_IMAGE_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__STEP_MOD = PROJECTED_MAP_IMAGE_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__PROPERTIES = PROJECTED_MAP_IMAGE_LOGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__USE_DEFAULT_LOG_DIRECTORY = PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__DATA_PATH = PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__PROJECTION = PROJECTED_MAP_IMAGE_LOGGER__PROJECTION;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__WIDTH = PROJECTED_MAP_IMAGE_LOGGER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__HEIGHT = PROJECTED_MAP_IMAGE_LOGGER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Force Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__FORCE_ASPECT_RATIO = PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Fit To Shape Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__FIT_TO_SHAPE_BOUNDS = PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Log Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__LOG_SCALING = PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__GAIN = PROJECTED_MAP_IMAGE_LOGGER__GAIN;

	/**
	 * The feature id for the '<em><b>Color Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__COLOR_PROVIDER = PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER;

	/**
	 * The feature id for the '<em><b>Transparent Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__TRANSPARENT_BACKGROUND = PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Border Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER__BORDER_TRANSPARENCY = PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY;

	/**
	 * The number of structural features of the '<em>Mercator Map Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCATOR_MAP_LOGGER_FEATURE_COUNT = PROJECTED_MAP_IMAGE_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.imagewriter.impl.OriginDependentProjectedMapImageLoggerImpl <em>Origin Dependent Projected Map Image Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.impl.OriginDependentProjectedMapImageLoggerImpl
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getOriginDependentProjectedMapImageLogger()
	 * @generated
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__URI = PROJECTED_MAP_IMAGE_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__TYPE_URI = PROJECTED_MAP_IMAGE_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__DUBLIN_CORE = PROJECTED_MAP_IMAGE_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ENABLED = PROJECTED_MAP_IMAGE_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__STEP_MOD = PROJECTED_MAP_IMAGE_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__PROPERTIES = PROJECTED_MAP_IMAGE_LOGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY = PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH = PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__PROJECTION = PROJECTED_MAP_IMAGE_LOGGER__PROJECTION;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__WIDTH = PROJECTED_MAP_IMAGE_LOGGER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__HEIGHT = PROJECTED_MAP_IMAGE_LOGGER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Force Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO = PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Fit To Shape Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS = PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Log Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING = PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__GAIN = PROJECTED_MAP_IMAGE_LOGGER__GAIN;

	/**
	 * The feature id for the '<em><b>Color Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER = PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER;

	/**
	 * The feature id for the '<em><b>Transparent Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND = PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Border Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY = PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Origin Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE = PROJECTED_MAP_IMAGE_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origin Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE = PROJECTED_MAP_IMAGE_LOGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Origin Dependent Projected Map Image Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER_FEATURE_COUNT = PROJECTED_MAP_IMAGE_LOGGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.imagewriter.impl.AzimuthalEquidistantMapLoggerImpl <em>Azimuthal Equidistant Map Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.impl.AzimuthalEquidistantMapLoggerImpl
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getAzimuthalEquidistantMapLogger()
	 * @generated
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__URI = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__TYPE_URI = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__DUBLIN_CORE = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__ENABLED = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__STEP_MOD = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__PROPERTIES = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__USE_DEFAULT_LOG_DIRECTORY = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__DATA_PATH = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__PROJECTION = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__PROJECTION;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__WIDTH = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__HEIGHT = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Force Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__FORCE_ASPECT_RATIO = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Fit To Shape Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__FIT_TO_SHAPE_BOUNDS = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Log Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__LOG_SCALING = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__GAIN = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__GAIN;

	/**
	 * The feature id for the '<em><b>Color Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__COLOR_PROVIDER = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER;

	/**
	 * The feature id for the '<em><b>Transparent Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__TRANSPARENT_BACKGROUND = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Border Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__BORDER_TRANSPARENCY = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Origin Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__ORIGIN_LATITUDE = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE;

	/**
	 * The feature id for the '<em><b>Origin Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER__ORIGIN_LONGITUDE = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE;

	/**
	 * The number of structural features of the '<em>Azimuthal Equidistant Map Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTHAL_EQUIDISTANT_MAP_LOGGER_FEATURE_COUNT = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.imagewriter.impl.OrthographicMapLoggerImpl <em>Orthographic Map Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.impl.OrthographicMapLoggerImpl
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getOrthographicMapLogger()
	 * @generated
	 */
	int ORTHOGRAPHIC_MAP_LOGGER = 7;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__URI = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__TYPE_URI = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__DUBLIN_CORE = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__ENABLED = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ENABLED;

	/**
	 * The feature id for the '<em><b>Step Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__STEP_MOD = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__STEP_MOD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__PROPERTIES = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Use Default Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__USE_DEFAULT_LOG_DIRECTORY = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__DATA_PATH = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__PROJECTION = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__PROJECTION;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__WIDTH = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__HEIGHT = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Force Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__FORCE_ASPECT_RATIO = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Fit To Shape Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__FIT_TO_SHAPE_BOUNDS = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Log Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__LOG_SCALING = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__GAIN = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__GAIN;

	/**
	 * The feature id for the '<em><b>Color Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__COLOR_PROVIDER = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER;

	/**
	 * The feature id for the '<em><b>Transparent Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__TRANSPARENT_BACKGROUND = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Border Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__BORDER_TRANSPARENCY = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Origin Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__ORIGIN_LATITUDE = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE;

	/**
	 * The feature id for the '<em><b>Origin Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER__ORIGIN_LONGITUDE = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE;

	/**
	 * The number of structural features of the '<em>Orthographic Map Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGRAPHIC_MAP_LOGGER_FEATURE_COUNT = ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS <em>MAP PROJECTIONS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getMAP_PROJECTIONS()
	 * @generated
	 */
	int MAP_PROJECTIONS = 8;


	/**
	 * The meta object id for the '<em>IMap Projection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getIMapProjection()
	 * @generated
	 */
	int IMAP_PROJECTION = 9;

	/**
	 * The meta object id for the '<em>Color Provider</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.ui.adapters.color.ColorProvider
	 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getColorProvider()
	 * @generated
	 */
	int COLOR_PROVIDER = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.imagewriter.ImageWriterLogger <em>Image Writer Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Writer Logger</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ImageWriterLogger
	 * @generated
	 */
	EClass getImageWriterLogger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ImageWriterLogger#isUseDefaultLogDirectory <em>Use Default Log Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Default Log Directory</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ImageWriterLogger#isUseDefaultLogDirectory()
	 * @see #getImageWriterLogger()
	 * @generated
	 */
	EAttribute getImageWriterLogger_UseDefaultLogDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ImageWriterLogger#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ImageWriterLogger#getDataPath()
	 * @see #getImageWriterLogger()
	 * @generated
	 */
	EAttribute getImageWriterLogger_DataPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger <em>Projected Map Image Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projected Map Image Logger</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger
	 * @generated
	 */
	EClass getProjectedMapImageLogger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getGain <em>Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gain</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getGain()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_Gain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getColorProvider <em>Color Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Provider</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getColorProvider()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_ColorProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isTransparentBackground <em>Transparent Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent Background</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isTransparentBackground()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_TransparentBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getBorderTransparency <em>Border Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Transparency</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getBorderTransparency()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_BorderTransparency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getWidth()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getHeight()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isForceAspectRatio <em>Force Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Aspect Ratio</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isForceAspectRatio()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_ForceAspectRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isFitToShapeBounds <em>Fit To Shape Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fit To Shape Bounds</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isFitToShapeBounds()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_FitToShapeBounds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isLogScaling <em>Log Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Scaling</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isLogScaling()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_LogScaling();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getProjection()
	 * @see #getProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getProjectedMapImageLogger_Projection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger <em>Map View Image Writer Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View Image Writer Logger</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger
	 * @generated
	 */
	EClass getMapViewImageWriterLogger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger#isOpenMapView <em>Open Map View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Map View</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger#isOpenMapView()
	 * @see #getMapViewImageWriterLogger()
	 * @generated
	 */
	EAttribute getMapViewImageWriterLogger_OpenMapView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.imagewriter.EquirectangularMapLogger <em>Equirectangular Map Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equirectangular Map Logger</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.EquirectangularMapLogger
	 * @generated
	 */
	EClass getEquirectangularMapLogger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.imagewriter.MercatorMapLogger <em>Mercator Map Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mercator Map Logger</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.MercatorMapLogger
	 * @generated
	 */
	EClass getMercatorMapLogger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger <em>Origin Dependent Projected Map Image Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Origin Dependent Projected Map Image Logger</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger
	 * @generated
	 */
	EClass getOriginDependentProjectedMapImageLogger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger#getOriginLatitude <em>Origin Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Latitude</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger#getOriginLatitude()
	 * @see #getOriginDependentProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getOriginDependentProjectedMapImageLogger_OriginLatitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger#getOriginLongitude <em>Origin Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Longitude</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger#getOriginLongitude()
	 * @see #getOriginDependentProjectedMapImageLogger()
	 * @generated
	 */
	EAttribute getOriginDependentProjectedMapImageLogger_OriginLongitude();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.imagewriter.AzimuthalEquidistantMapLogger <em>Azimuthal Equidistant Map Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Azimuthal Equidistant Map Logger</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.AzimuthalEquidistantMapLogger
	 * @generated
	 */
	EClass getAzimuthalEquidistantMapLogger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.loggers.imagewriter.OrthographicMapLogger <em>Orthographic Map Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orthographic Map Logger</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.OrthographicMapLogger
	 * @generated
	 */
	EClass getOrthographicMapLogger();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS <em>MAP PROJECTIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MAP PROJECTIONS</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS
	 * @generated
	 */
	EEnum getMAP_PROJECTIONS();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection <em>IMap Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IMap Projection</em>'.
	 * @see org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection
	 * @model instanceClass="org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection"
	 * @generated
	 */
	EDataType getIMapProjection();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.stem.ui.adapters.color.ColorProvider <em>Color Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Provider</em>'.
	 * @see org.eclipse.stem.ui.adapters.color.ColorProvider
	 * @model instanceClass="org.eclipse.stem.ui.adapters.color.ColorProvider"
	 * @generated
	 */
	EDataType getColorProvider();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImagewriterFactory getImagewriterFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.imagewriter.impl.ImageWriterLoggerImpl <em>Image Writer Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImageWriterLoggerImpl
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getImageWriterLogger()
		 * @generated
		 */
		EClass IMAGE_WRITER_LOGGER = eINSTANCE.getImageWriterLogger();

		/**
		 * The meta object literal for the '<em><b>Use Default Log Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY = eINSTANCE.getImageWriterLogger_UseDefaultLogDirectory();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_WRITER_LOGGER__DATA_PATH = eINSTANCE.getImageWriterLogger_DataPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl <em>Projected Map Image Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getProjectedMapImageLogger()
		 * @generated
		 */
		EClass PROJECTED_MAP_IMAGE_LOGGER = eINSTANCE.getProjectedMapImageLogger();

		/**
		 * The meta object literal for the '<em><b>Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__GAIN = eINSTANCE.getProjectedMapImageLogger_Gain();

		/**
		 * The meta object literal for the '<em><b>Color Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER = eINSTANCE.getProjectedMapImageLogger_ColorProvider();

		/**
		 * The meta object literal for the '<em><b>Transparent Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND = eINSTANCE.getProjectedMapImageLogger_TransparentBackground();

		/**
		 * The meta object literal for the '<em><b>Border Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY = eINSTANCE.getProjectedMapImageLogger_BorderTransparency();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__WIDTH = eINSTANCE.getProjectedMapImageLogger_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__HEIGHT = eINSTANCE.getProjectedMapImageLogger_Height();

		/**
		 * The meta object literal for the '<em><b>Force Aspect Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO = eINSTANCE.getProjectedMapImageLogger_ForceAspectRatio();

		/**
		 * The meta object literal for the '<em><b>Fit To Shape Bounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS = eINSTANCE.getProjectedMapImageLogger_FitToShapeBounds();

		/**
		 * The meta object literal for the '<em><b>Log Scaling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING = eINSTANCE.getProjectedMapImageLogger_LogScaling();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_MAP_IMAGE_LOGGER__PROJECTION = eINSTANCE.getProjectedMapImageLogger_Projection();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.imagewriter.impl.MapViewImageWriterLoggerImpl <em>Map View Image Writer Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.impl.MapViewImageWriterLoggerImpl
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getMapViewImageWriterLogger()
		 * @generated
		 */
		EClass MAP_VIEW_IMAGE_WRITER_LOGGER = eINSTANCE.getMapViewImageWriterLogger();

		/**
		 * The meta object literal for the '<em><b>Open Map View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_IMAGE_WRITER_LOGGER__OPEN_MAP_VIEW = eINSTANCE.getMapViewImageWriterLogger_OpenMapView();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.imagewriter.impl.EquirectangularMapLoggerImpl <em>Equirectangular Map Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.impl.EquirectangularMapLoggerImpl
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getEquirectangularMapLogger()
		 * @generated
		 */
		EClass EQUIRECTANGULAR_MAP_LOGGER = eINSTANCE.getEquirectangularMapLogger();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.imagewriter.impl.MercatorMapLoggerImpl <em>Mercator Map Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.impl.MercatorMapLoggerImpl
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getMercatorMapLogger()
		 * @generated
		 */
		EClass MERCATOR_MAP_LOGGER = eINSTANCE.getMercatorMapLogger();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.imagewriter.impl.OriginDependentProjectedMapImageLoggerImpl <em>Origin Dependent Projected Map Image Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.impl.OriginDependentProjectedMapImageLoggerImpl
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getOriginDependentProjectedMapImageLogger()
		 * @generated
		 */
		EClass ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER = eINSTANCE.getOriginDependentProjectedMapImageLogger();

		/**
		 * The meta object literal for the '<em><b>Origin Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE = eINSTANCE.getOriginDependentProjectedMapImageLogger_OriginLatitude();

		/**
		 * The meta object literal for the '<em><b>Origin Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE = eINSTANCE.getOriginDependentProjectedMapImageLogger_OriginLongitude();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.imagewriter.impl.AzimuthalEquidistantMapLoggerImpl <em>Azimuthal Equidistant Map Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.impl.AzimuthalEquidistantMapLoggerImpl
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getAzimuthalEquidistantMapLogger()
		 * @generated
		 */
		EClass AZIMUTHAL_EQUIDISTANT_MAP_LOGGER = eINSTANCE.getAzimuthalEquidistantMapLogger();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.imagewriter.impl.OrthographicMapLoggerImpl <em>Orthographic Map Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.impl.OrthographicMapLoggerImpl
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getOrthographicMapLogger()
		 * @generated
		 */
		EClass ORTHOGRAPHIC_MAP_LOGGER = eINSTANCE.getOrthographicMapLogger();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS <em>MAP PROJECTIONS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getMAP_PROJECTIONS()
		 * @generated
		 */
		EEnum MAP_PROJECTIONS = eINSTANCE.getMAP_PROJECTIONS();

		/**
		 * The meta object literal for the '<em>IMap Projection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getIMapProjection()
		 * @generated
		 */
		EDataType IMAP_PROJECTION = eINSTANCE.getIMapProjection();

		/**
		 * The meta object literal for the '<em>Color Provider</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.ui.adapters.color.ColorProvider
		 * @see org.eclipse.stem.loggers.imagewriter.impl.ImagewriterPackageImpl#getColorProvider()
		 * @generated
		 */
		EDataType COLOR_PROVIDER = eINSTANCE.getColorProvider();

	}

} //ImagewriterPackage
