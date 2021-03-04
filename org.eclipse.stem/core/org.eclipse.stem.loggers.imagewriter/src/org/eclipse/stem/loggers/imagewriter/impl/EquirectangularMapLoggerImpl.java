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
import org.eclipse.stem.loggers.imagewriter.EquirectangularMapLogger;
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.imagewriter.logger.projections.Equirectangular;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equirectangular Map Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EquirectangularMapLoggerImpl extends ProjectedMapImageLoggerImpl implements EquirectangularMapLogger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EquirectangularMapLoggerImpl() {
		super();
		setProjection(Equirectangular.class);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagewriterPackage.Literals.EQUIRECTANGULAR_MAP_LOGGER;
	}

} //EquirectangularMapLoggerImpl
