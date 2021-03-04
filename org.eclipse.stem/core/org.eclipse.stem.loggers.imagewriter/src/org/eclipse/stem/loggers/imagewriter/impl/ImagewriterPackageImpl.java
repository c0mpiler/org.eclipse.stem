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
package org.eclipse.stem.loggers.imagewriter.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.loggers.SimulationLoggerPackage;
import org.eclipse.stem.loggers.imagewriter.AzimuthalEquidistantMapLogger;
import org.eclipse.stem.loggers.imagewriter.EquirectangularMapLogger;
import org.eclipse.stem.loggers.imagewriter.ImageWriterLogger;
import org.eclipse.stem.loggers.imagewriter.ImagewriterFactory;
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger;
import org.eclipse.stem.loggers.imagewriter.MercatorMapLogger;
import org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger;
import org.eclipse.stem.loggers.imagewriter.OrthographicMapLogger;
import org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger;
import org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection;
import org.eclipse.stem.ui.adapters.color.ColorProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImagewriterPackageImpl extends EPackageImpl implements ImagewriterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageWriterLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectedMapImageLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapViewImageWriterLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equirectangularMapLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mercatorMapLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originDependentProjectedMapImageLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass azimuthalEquidistantMapLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orthographicMapLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maP_PROJECTIONSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iMapProjectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorProviderEDataType = null;

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
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImagewriterPackageImpl() {
		super(eNS_URI, ImagewriterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImagewriterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImagewriterPackage init() {
		if (isInited) return (ImagewriterPackage)EPackage.Registry.INSTANCE.getEPackage(ImagewriterPackage.eNS_URI);

		// Obtain or create and register package
		ImagewriterPackageImpl theImagewriterPackage = (ImagewriterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImagewriterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImagewriterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimulationLoggerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theImagewriterPackage.createPackageContents();

		// Initialize created meta-data
		theImagewriterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImagewriterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImagewriterPackage.eNS_URI, theImagewriterPackage);
		return theImagewriterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageWriterLogger() {
		return imageWriterLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageWriterLogger_UseDefaultLogDirectory() {
		return (EAttribute)imageWriterLoggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageWriterLogger_DataPath() {
		return (EAttribute)imageWriterLoggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectedMapImageLogger() {
		return projectedMapImageLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_Gain() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_ColorProvider() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_TransparentBackground() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_BorderTransparency() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_Width() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_Height() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_ForceAspectRatio() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_FitToShapeBounds() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_LogScaling() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedMapImageLogger_Projection() {
		return (EAttribute)projectedMapImageLoggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapViewImageWriterLogger() {
		return mapViewImageWriterLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewImageWriterLogger_OpenMapView() {
		return (EAttribute)mapViewImageWriterLoggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquirectangularMapLogger() {
		return equirectangularMapLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMercatorMapLogger() {
		return mercatorMapLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOriginDependentProjectedMapImageLogger() {
		return originDependentProjectedMapImageLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOriginDependentProjectedMapImageLogger_OriginLatitude() {
		return (EAttribute)originDependentProjectedMapImageLoggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOriginDependentProjectedMapImageLogger_OriginLongitude() {
		return (EAttribute)originDependentProjectedMapImageLoggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAzimuthalEquidistantMapLogger() {
		return azimuthalEquidistantMapLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrthographicMapLogger() {
		return orthographicMapLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMAP_PROJECTIONS() {
		return maP_PROJECTIONSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIMapProjection() {
		return iMapProjectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorProvider() {
		return colorProviderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagewriterFactory getImagewriterFactory() {
		return (ImagewriterFactory)getEFactoryInstance();
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
		imageWriterLoggerEClass = createEClass(IMAGE_WRITER_LOGGER);
		createEAttribute(imageWriterLoggerEClass, IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY);
		createEAttribute(imageWriterLoggerEClass, IMAGE_WRITER_LOGGER__DATA_PATH);

		projectedMapImageLoggerEClass = createEClass(PROJECTED_MAP_IMAGE_LOGGER);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__PROJECTION);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__WIDTH);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__HEIGHT);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__GAIN);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND);
		createEAttribute(projectedMapImageLoggerEClass, PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY);

		mapViewImageWriterLoggerEClass = createEClass(MAP_VIEW_IMAGE_WRITER_LOGGER);
		createEAttribute(mapViewImageWriterLoggerEClass, MAP_VIEW_IMAGE_WRITER_LOGGER__OPEN_MAP_VIEW);

		equirectangularMapLoggerEClass = createEClass(EQUIRECTANGULAR_MAP_LOGGER);

		mercatorMapLoggerEClass = createEClass(MERCATOR_MAP_LOGGER);

		originDependentProjectedMapImageLoggerEClass = createEClass(ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER);
		createEAttribute(originDependentProjectedMapImageLoggerEClass, ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE);
		createEAttribute(originDependentProjectedMapImageLoggerEClass, ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE);

		azimuthalEquidistantMapLoggerEClass = createEClass(AZIMUTHAL_EQUIDISTANT_MAP_LOGGER);

		orthographicMapLoggerEClass = createEClass(ORTHOGRAPHIC_MAP_LOGGER);

		// Create enums
		maP_PROJECTIONSEEnum = createEEnum(MAP_PROJECTIONS);

		// Create data types
		iMapProjectionEDataType = createEDataType(IMAP_PROJECTION);
		colorProviderEDataType = createEDataType(COLOR_PROVIDER);
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
		SimulationLoggerPackage theSimulationLoggerPackage = (SimulationLoggerPackage)EPackage.Registry.INSTANCE.getEPackage(SimulationLoggerPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		imageWriterLoggerEClass.getESuperTypes().add(theSimulationLoggerPackage.getSynchronousLogger());
		projectedMapImageLoggerEClass.getESuperTypes().add(theSimulationLoggerPackage.getSynchronousDecoratorPropertyLogger());
		projectedMapImageLoggerEClass.getESuperTypes().add(this.getImageWriterLogger());
		mapViewImageWriterLoggerEClass.getESuperTypes().add(this.getImageWriterLogger());
		equirectangularMapLoggerEClass.getESuperTypes().add(this.getProjectedMapImageLogger());
		mercatorMapLoggerEClass.getESuperTypes().add(this.getProjectedMapImageLogger());
		originDependentProjectedMapImageLoggerEClass.getESuperTypes().add(this.getProjectedMapImageLogger());
		azimuthalEquidistantMapLoggerEClass.getESuperTypes().add(this.getOriginDependentProjectedMapImageLogger());
		orthographicMapLoggerEClass.getESuperTypes().add(this.getOriginDependentProjectedMapImageLogger());

		// Initialize classes and features; add operations and parameters
		initEClass(imageWriterLoggerEClass, ImageWriterLogger.class, "ImageWriterLogger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getImageWriterLogger_UseDefaultLogDirectory(), ecorePackage.getEBoolean(), "useDefaultLogDirectory", "true", 0, 1, ImageWriterLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getImageWriterLogger_DataPath(), ecorePackage.getEString(), "dataPath", null, 0, 1, ImageWriterLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(projectedMapImageLoggerEClass, ProjectedMapImageLogger.class, "ProjectedMapImageLogger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getIMapProjection());
		g2.setEUpperBound(g3);
		initEAttribute(getProjectedMapImageLogger_Projection(), g1, "projection", null, 1, 1, ProjectedMapImageLogger.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProjectedMapImageLogger_Width(), ecorePackage.getEInt(), "width", "1000", 1, 1, ProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProjectedMapImageLogger_Height(), ecorePackage.getEInt(), "height", "500", 1, 1, ProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProjectedMapImageLogger_ForceAspectRatio(), theEcorePackage.getEBoolean(), "forceAspectRatio", "true", 1, 1, ProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProjectedMapImageLogger_FitToShapeBounds(), theEcorePackage.getEBoolean(), "fitToShapeBounds", "true", 1, 1, ProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProjectedMapImageLogger_LogScaling(), ecorePackage.getEBoolean(), "logScaling", "true", 1, 1, ProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProjectedMapImageLogger_Gain(), ecorePackage.getEFloat(), "gain", "1.0", 1, 1, ProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getColorProvider());
		g2.setEUpperBound(g3);
		initEAttribute(getProjectedMapImageLogger_ColorProvider(), g1, "colorProvider", "org.eclipse.stem.ui.adapters.color.IntensityColorsLabelsMappingColorProviderAdapter", 0, 1, ProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProjectedMapImageLogger_TransparentBackground(), theEcorePackage.getEBoolean(), "transparentBackground", "false", 1, 1, ProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProjectedMapImageLogger_BorderTransparency(), theEcorePackage.getEInt(), "borderTransparency", "25", 1, 1, ProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		addEOperation(projectedMapImageLoggerEClass, this.getIMapProjection(), "getMapProjector", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(mapViewImageWriterLoggerEClass, MapViewImageWriterLogger.class, "MapViewImageWriterLogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMapViewImageWriterLogger_OpenMapView(), ecorePackage.getEBoolean(), "openMapView", "true", 0, 1, MapViewImageWriterLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(equirectangularMapLoggerEClass, EquirectangularMapLogger.class, "EquirectangularMapLogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(mercatorMapLoggerEClass, MercatorMapLogger.class, "MercatorMapLogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(originDependentProjectedMapImageLoggerEClass, OriginDependentProjectedMapImageLogger.class, "OriginDependentProjectedMapImageLogger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOriginDependentProjectedMapImageLogger_OriginLatitude(), theEcorePackage.getEDouble(), "originLatitude", "0.0", 0, 1, OriginDependentProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOriginDependentProjectedMapImageLogger_OriginLongitude(), theEcorePackage.getEDouble(), "originLongitude", "0.0", 0, 1, OriginDependentProjectedMapImageLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-2$

		initEClass(azimuthalEquidistantMapLoggerEClass, AzimuthalEquidistantMapLogger.class, "AzimuthalEquidistantMapLogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(orthographicMapLoggerEClass, OrthographicMapLogger.class, "OrthographicMapLogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(maP_PROJECTIONSEEnum, org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS.class, "MAP_PROJECTIONS"); //$NON-NLS-1$
		addEEnumLiteral(maP_PROJECTIONSEEnum, org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS.EQUIRECTANGULAR);
		addEEnumLiteral(maP_PROJECTIONSEEnum, org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS.MERCATOR);

		// Initialize data types
		initEDataType(iMapProjectionEDataType, IMapProjection.class, "IMapProjection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(colorProviderEDataType, ColorProvider.class, "ColorProvider", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //ImagewriterPackageImpl
