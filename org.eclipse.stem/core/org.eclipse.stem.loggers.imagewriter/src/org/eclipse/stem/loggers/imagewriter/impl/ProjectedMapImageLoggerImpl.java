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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.jobs.simulation.SimulationState;
import org.eclipse.stem.loggers.LOGGER_EVENTS;
import org.eclipse.stem.loggers.imagewriter.ImageWriterLogger;
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger;
import org.eclipse.stem.loggers.imagewriter.logger.DecoratorPropertyImageWriter;
import org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection;
import org.eclipse.stem.loggers.impl.SynchronousDecoratorPropertyLoggerImpl;
import org.eclipse.stem.ui.adapters.color.ColorProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projected Map Image Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#isUseDefaultLogDirectory <em>Use Default Log Directory</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#isForceAspectRatio <em>Force Aspect Ratio</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#isFitToShapeBounds <em>Fit To Shape Bounds</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#isLogScaling <em>Log Scaling</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#getGain <em>Gain</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#getColorProvider <em>Color Provider</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#isTransparentBackground <em>Transparent Background</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.ProjectedMapImageLoggerImpl#getBorderTransparency <em>Border Transparency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProjectedMapImageLoggerImpl extends SynchronousDecoratorPropertyLoggerImpl implements ProjectedMapImageLogger {
	/**
	 * The default value of the '{@link #isUseDefaultLogDirectory() <em>Use Default Log Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDefaultLogDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_DEFAULT_LOG_DIRECTORY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseDefaultLogDirectory() <em>Use Default Log Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDefaultLogDirectory()
	 * @generated
	 * @ordered
	 */
	protected boolean useDefaultLogDirectory = USE_DEFAULT_LOG_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected String dataPath = DATA_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected Class<? extends IMapProjection> projection;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 500;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isForceAspectRatio() <em>Force Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORCE_ASPECT_RATIO_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isForceAspectRatio() <em>Force Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected boolean forceAspectRatio = FORCE_ASPECT_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #isFitToShapeBounds() <em>Fit To Shape Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFitToShapeBounds()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIT_TO_SHAPE_BOUNDS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFitToShapeBounds() <em>Fit To Shape Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFitToShapeBounds()
	 * @generated
	 * @ordered
	 */
	protected boolean fitToShapeBounds = FIT_TO_SHAPE_BOUNDS_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogScaling() <em>Log Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogScaling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_SCALING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLogScaling() <em>Log Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogScaling()
	 * @generated
	 * @ordered
	 */
	protected boolean logScaling = LOG_SCALING_EDEFAULT;

	/**
	 * The default value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected static final float GAIN_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected float gain = GAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColorProvider() <em>Color Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorProvider()
	 * @generated
	 * @ordered
	 */
	protected Class<? extends ColorProvider> colorProvider;

	/**
	 * The default value of the '{@link #isTransparentBackground() <em>Transparent Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransparentBackground()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPARENT_BACKGROUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransparentBackground() <em>Transparent Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransparentBackground()
	 * @generated
	 * @ordered
	 */
	protected boolean transparentBackground = TRANSPARENT_BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderTransparency() <em>Border Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_TRANSPARENCY_EDEFAULT = 25;

	/**
	 * The cached value of the '{@link #getBorderTransparency() <em>Border Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderTransparency()
	 * @generated
	 * @ordered
	 */
	protected int borderTransparency = BORDER_TRANSPARENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectedMapImageLoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseDefaultLogDirectory() {
		return useDefaultLogDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDefaultLogDirectory(boolean newUseDefaultLogDirectory) {
		boolean oldUseDefaultLogDirectory = useDefaultLogDirectory;
		useDefaultLogDirectory = newUseDefaultLogDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY, oldUseDefaultLogDirectory, useDefaultLogDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataPath() {
		return dataPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPath(String newDataPath) {
		String oldDataPath = dataPath;
		dataPath = newDataPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH, oldDataPath, dataPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<? extends IMapProjection> getProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(Class<? extends IMapProjection> newProjection) {
		Class<? extends IMapProjection> oldProjection = projection;
		projection = newProjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__PROJECTION, oldProjection, projection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGain() {
		return gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGain(float newGain) {
		float oldGain = gain;
		gain = newGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__GAIN, oldGain, gain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<? extends ColorProvider> getColorProvider() {
		return colorProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorProvider(Class<? extends ColorProvider> newColorProvider) {
		Class<? extends ColorProvider> oldColorProvider = colorProvider;
		colorProvider = newColorProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER, oldColorProvider, colorProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransparentBackground() {
		return transparentBackground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparentBackground(boolean newTransparentBackground) {
		boolean oldTransparentBackground = transparentBackground;
		transparentBackground = newTransparentBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND, oldTransparentBackground, transparentBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorderTransparency() {
		return borderTransparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderTransparency(int newBorderTransparency) {
		int oldBorderTransparency = borderTransparency;
		borderTransparency = newBorderTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY, oldBorderTransparency, borderTransparency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IMapProjection getMapProjector() {
		try {
			return getProjection().newInstance();
		} catch (Exception e) {
			
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForceAspectRatio() {
		return forceAspectRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceAspectRatio(boolean newForceAspectRatio) {
		boolean oldForceAspectRatio = forceAspectRatio;
		forceAspectRatio = newForceAspectRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO, oldForceAspectRatio, forceAspectRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFitToShapeBounds() {
		return fitToShapeBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitToShapeBounds(boolean newFitToShapeBounds) {
		boolean oldFitToShapeBounds = fitToShapeBounds;
		fitToShapeBounds = newFitToShapeBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS, oldFitToShapeBounds, fitToShapeBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogScaling() {
		return logScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogScaling(boolean newLogScaling) {
		boolean oldLogScaling = logScaling;
		logScaling = newLogScaling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING, oldLogScaling, logScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				return isUseDefaultLogDirectory();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH:
				return getDataPath();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__PROJECTION:
				return getProjection();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__WIDTH:
				return getWidth();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__HEIGHT:
				return getHeight();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO:
				return isForceAspectRatio();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS:
				return isFitToShapeBounds();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING:
				return isLogScaling();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__GAIN:
				return getGain();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER:
				return getColorProvider();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND:
				return isTransparentBackground();
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY:
				return getBorderTransparency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				setUseDefaultLogDirectory((Boolean)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH:
				setDataPath((String)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__PROJECTION:
				setProjection((Class<? extends IMapProjection>)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO:
				setForceAspectRatio((Boolean)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS:
				setFitToShapeBounds((Boolean)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING:
				setLogScaling((Boolean)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__GAIN:
				setGain((Float)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER:
				setColorProvider((Class<? extends ColorProvider>)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND:
				setTransparentBackground((Boolean)newValue);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY:
				setBorderTransparency((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				setUseDefaultLogDirectory(USE_DEFAULT_LOG_DIRECTORY_EDEFAULT);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__PROJECTION:
				setProjection((Class<? extends IMapProjection>)null);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO:
				setForceAspectRatio(FORCE_ASPECT_RATIO_EDEFAULT);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS:
				setFitToShapeBounds(FIT_TO_SHAPE_BOUNDS_EDEFAULT);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING:
				setLogScaling(LOG_SCALING_EDEFAULT);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__GAIN:
				setGain(GAIN_EDEFAULT);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER:
				setColorProvider((Class<? extends ColorProvider>)null);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND:
				setTransparentBackground(TRANSPARENT_BACKGROUND_EDEFAULT);
				return;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY:
				setBorderTransparency(BORDER_TRANSPARENCY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
				return useDefaultLogDirectory != USE_DEFAULT_LOG_DIRECTORY_EDEFAULT;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__PROJECTION:
				return projection != null;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO:
				return forceAspectRatio != FORCE_ASPECT_RATIO_EDEFAULT;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS:
				return fitToShapeBounds != FIT_TO_SHAPE_BOUNDS_EDEFAULT;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING:
				return logScaling != LOG_SCALING_EDEFAULT;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__GAIN:
				return gain != GAIN_EDEFAULT;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER:
				return colorProvider != null;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND:
				return transparentBackground != TRANSPARENT_BACKGROUND_EDEFAULT;
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY:
				return borderTransparency != BORDER_TRANSPARENCY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ImageWriterLogger.class) {
			switch (derivedFeatureID) {
				case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY: return ImagewriterPackage.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY;
				case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH: return ImagewriterPackage.IMAGE_WRITER_LOGGER__DATA_PATH;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ImageWriterLogger.class) {
			switch (baseFeatureID) {
				case ImagewriterPackage.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY: return ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY;
				case ImagewriterPackage.IMAGE_WRITER_LOGGER__DATA_PATH: return ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (useDefaultLogDirectory: "); //$NON-NLS-1$
		result.append(useDefaultLogDirectory);
		result.append(", dataPath: "); //$NON-NLS-1$
		result.append(dataPath);
		result.append(", projection: "); //$NON-NLS-1$
		result.append(projection);
		result.append(", width: "); //$NON-NLS-1$
		result.append(width);
		result.append(", height: "); //$NON-NLS-1$
		result.append(height);
		result.append(", forceAspectRatio: "); //$NON-NLS-1$
		result.append(forceAspectRatio);
		result.append(", fitToShapeBounds: "); //$NON-NLS-1$
		result.append(fitToShapeBounds);
		result.append(", logScaling: "); //$NON-NLS-1$
		result.append(logScaling);
		result.append(", gain: "); //$NON-NLS-1$
		result.append(gain);
		result.append(", colorProvider: "); //$NON-NLS-1$
		result.append(colorProvider);
		result.append(", transparentBackground: "); //$NON-NLS-1$
		result.append(transparentBackground);
		result.append(", borderTransparency: "); //$NON-NLS-1$
		result.append(borderTransparency);
		result.append(')');
		return result.toString();
	}

	
	DecoratorPropertyImageWriter writer;
	
	@Override
	public void simulationEvent(SimulationEvent event) 
	{
		if (SimulationState.COMPLETED_CYCLE.equals(event.getSimulationState())) {
			writer.log();
		}
	}

	@Override
	public void loggerEvent(ISimulation simulation, LOGGER_EVENTS event) 
	{
		if (LOGGER_EVENTS.LOGGER_STARTED.equals(event)) {
			writer = new DecoratorPropertyImageWriter(simulation, this);
			writer.start();
		}
	
		if (LOGGER_EVENTS.LOGGER_STOPPED.equals(event)) {
			if (writer != null) {
				writer.stop();
				writer = null;
			}
		}
	}

	
	
	
} //ProjectedMapImageLoggerImpl
