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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.loggers.imagewriter.AzimuthalEquidistantMapLogger;
import org.eclipse.stem.loggers.imagewriter.EquirectangularMapLogger;
import org.eclipse.stem.loggers.imagewriter.ImagewriterFactory;
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.imagewriter.MAP_PROJECTIONS;
import org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger;
import org.eclipse.stem.loggers.imagewriter.MercatorMapLogger;
import org.eclipse.stem.loggers.imagewriter.OrthographicMapLogger;
import org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection;
import org.eclipse.stem.ui.adapters.color.ColorProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImagewriterFactoryImpl extends EFactoryImpl implements ImagewriterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImagewriterFactory init() {
		try {
			ImagewriterFactory theImagewriterFactory = (ImagewriterFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/eclipse/stem/loggers/imagewriter");  //$NON-NLS-1$
			if (theImagewriterFactory != null) {
				return theImagewriterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImagewriterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagewriterFactoryImpl() {
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
			case ImagewriterPackage.MAP_VIEW_IMAGE_WRITER_LOGGER: return createMapViewImageWriterLogger();
			case ImagewriterPackage.EQUIRECTANGULAR_MAP_LOGGER: return createEquirectangularMapLogger();
			case ImagewriterPackage.MERCATOR_MAP_LOGGER: return createMercatorMapLogger();
			case ImagewriterPackage.AZIMUTHAL_EQUIDISTANT_MAP_LOGGER: return createAzimuthalEquidistantMapLogger();
			case ImagewriterPackage.ORTHOGRAPHIC_MAP_LOGGER: return createOrthographicMapLogger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
			case ImagewriterPackage.MAP_PROJECTIONS:
				return createMAP_PROJECTIONSFromString(eDataType, initialValue);
			case ImagewriterPackage.IMAP_PROJECTION:
				return createIMapProjectionFromString(eDataType, initialValue);
			case ImagewriterPackage.COLOR_PROVIDER:
				return createColorProviderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
			case ImagewriterPackage.MAP_PROJECTIONS:
				return convertMAP_PROJECTIONSToString(eDataType, instanceValue);
			case ImagewriterPackage.IMAP_PROJECTION:
				return convertIMapProjectionToString(eDataType, instanceValue);
			case ImagewriterPackage.COLOR_PROVIDER:
				return convertColorProviderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapViewImageWriterLogger createMapViewImageWriterLogger() {
		MapViewImageWriterLoggerImpl mapViewImageWriterLogger = new MapViewImageWriterLoggerImpl();
		return mapViewImageWriterLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquirectangularMapLogger createEquirectangularMapLogger() {
		EquirectangularMapLoggerImpl equirectangularMapLogger = new EquirectangularMapLoggerImpl();
		return equirectangularMapLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MercatorMapLogger createMercatorMapLogger() {
		MercatorMapLoggerImpl mercatorMapLogger = new MercatorMapLoggerImpl();
		return mercatorMapLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzimuthalEquidistantMapLogger createAzimuthalEquidistantMapLogger() {
		AzimuthalEquidistantMapLoggerImpl azimuthalEquidistantMapLogger = new AzimuthalEquidistantMapLoggerImpl();
		return azimuthalEquidistantMapLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrthographicMapLogger createOrthographicMapLogger() {
		OrthographicMapLoggerImpl orthographicMapLogger = new OrthographicMapLoggerImpl();
		return orthographicMapLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAP_PROJECTIONS createMAP_PROJECTIONSFromString(EDataType eDataType, String initialValue) {
		MAP_PROJECTIONS result = MAP_PROJECTIONS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMAP_PROJECTIONSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMapProjection createIMapProjectionFromString(EDataType eDataType, String initialValue) {
		return (IMapProjection)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIMapProjectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorProvider createColorProviderFromString(EDataType eDataType, String initialValue) {
		return (ColorProvider)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorProviderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagewriterPackage getImagewriterPackage() {
		return (ImagewriterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImagewriterPackage getPackage() {
		return ImagewriterPackage.eINSTANCE;
	}

} //ImagewriterFactoryImpl
