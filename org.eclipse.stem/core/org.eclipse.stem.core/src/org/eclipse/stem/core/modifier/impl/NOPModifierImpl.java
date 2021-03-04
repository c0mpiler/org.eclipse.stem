package org.eclipse.stem.core.modifier.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.modifier.NOPModifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>NOP Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NOPModifierImpl extends FeatureModifierImpl implements
		NOPModifier {
	
	/**
	 * @see org.eclipse.stem.core.modifier.FeatureModifier#reset()
	 */
	public void reset() {
		// Nothing to do		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NOPModifierImpl() {
		super();
	}

	/**
	 * @see org.eclipse.stem.core.modifier.impl.FeatureModifierImpl#isComplete()
	 */
	@Override
	public boolean isComplete() {
		return true;
	}

	/**
	 * @see org.eclipse.stem.core.modifier.impl.FeatureModifierImpl#updateFeature(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public void updateFeature() {
		// do nothing
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModifierPackage.Literals.NOP_MODIFIER;
	}

} // NOPModifierImpl
