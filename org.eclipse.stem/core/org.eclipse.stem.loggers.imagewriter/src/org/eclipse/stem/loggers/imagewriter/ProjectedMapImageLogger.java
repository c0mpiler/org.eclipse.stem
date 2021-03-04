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

import org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger;
import org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection;
import org.eclipse.stem.ui.adapters.color.ColorProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projected Map Image Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isForceAspectRatio <em>Force Aspect Ratio</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isFitToShapeBounds <em>Fit To Shape Bounds</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isLogScaling <em>Log Scaling</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getGain <em>Gain</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getColorProvider <em>Color Provider</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isTransparentBackground <em>Transparent Background</em>}</li>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getBorderTransparency <em>Border Transparency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger()
 * @model abstract="true"
 * @generated
 */
public interface ProjectedMapImageLogger extends SynchronousDecoratorPropertyLogger, ImageWriterLogger {
	/**
	 * Returns the value of the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' attribute.
	 * @see #setProjection(Class)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_Projection()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Class<? extends IMapProjection> getProjection();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getProjection <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' attribute.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(Class<? extends IMapProjection> value);

	/**
	 * Returns the value of the '<em><b>Gain</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gain</em>' attribute.
	 * @see #setGain(float)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_Gain()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getGain();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' attribute.
	 * @see #getGain()
	 * @generated
	 */
	void setGain(float value);

	/**
	 * Returns the value of the '<em><b>Color Provider</b></em>' attribute.
	 * The default value is <code>"org.eclipse.stem.ui.adapters.color.IntensityColorsLabelsMappingColorProviderAdapter"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Provider</em>' attribute.
	 * @see #setColorProvider(Class)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_ColorProvider()
	 * @model default="org.eclipse.stem.ui.adapters.color.IntensityColorsLabelsMappingColorProviderAdapter"
	 * @generated
	 */
	Class<? extends ColorProvider> getColorProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getColorProvider <em>Color Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Provider</em>' attribute.
	 * @see #getColorProvider()
	 * @generated
	 */
	void setColorProvider(Class<? extends ColorProvider> value);

	/**
	 * Returns the value of the '<em><b>Transparent Background</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparent Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparent Background</em>' attribute.
	 * @see #setTransparentBackground(boolean)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_TransparentBackground()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTransparentBackground();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isTransparentBackground <em>Transparent Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparent Background</em>' attribute.
	 * @see #isTransparentBackground()
	 * @generated
	 */
	void setTransparentBackground(boolean value);

	/**
	 * Returns the value of the '<em><b>Border Transparency</b></em>' attribute.
	 * The default value is <code>"25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Transparency</em>' attribute.
	 * @see #setBorderTransparency(int)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_BorderTransparency()
	 * @model default="25" required="true"
	 * @generated
	 */
	int getBorderTransparency();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getBorderTransparency <em>Border Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Transparency</em>' attribute.
	 * @see #getBorderTransparency()
	 * @generated
	 */
	void setBorderTransparency(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.stem.loggers.imagewriter.IMapProjection"
	 * @generated
	 */
	IMapProjection getMapProjector();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_Width()
	 * @model default="1000" required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_Height()
	 * @model default="500" required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Force Aspect Ratio</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Aspect Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Aspect Ratio</em>' attribute.
	 * @see #setForceAspectRatio(boolean)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_ForceAspectRatio()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isForceAspectRatio();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isForceAspectRatio <em>Force Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Aspect Ratio</em>' attribute.
	 * @see #isForceAspectRatio()
	 * @generated
	 */
	void setForceAspectRatio(boolean value);

	/**
	 * Returns the value of the '<em><b>Fit To Shape Bounds</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fit To Shape Bounds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fit To Shape Bounds</em>' attribute.
	 * @see #setFitToShapeBounds(boolean)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_FitToShapeBounds()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isFitToShapeBounds();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isFitToShapeBounds <em>Fit To Shape Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fit To Shape Bounds</em>' attribute.
	 * @see #isFitToShapeBounds()
	 * @generated
	 */
	void setFitToShapeBounds(boolean value);

	/**
	 * Returns the value of the '<em><b>Log Scaling</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Scaling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Scaling</em>' attribute.
	 * @see #setLogScaling(boolean)
	 * @see org.eclipse.stem.loggers.imagewriter.ImagewriterPackage#getProjectedMapImageLogger_LogScaling()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isLogScaling();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger#isLogScaling <em>Log Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Scaling</em>' attribute.
	 * @see #isLogScaling()
	 * @generated
	 */
	void setLogScaling(boolean value);

} // ProjectedMapImageLogger
