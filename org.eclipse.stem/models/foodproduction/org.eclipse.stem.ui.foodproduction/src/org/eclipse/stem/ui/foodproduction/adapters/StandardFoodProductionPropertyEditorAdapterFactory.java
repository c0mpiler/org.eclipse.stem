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
package org.eclipse.stem.ui.foodproduction.adapters;

/*******************************************************************************

 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.foodproduction.util.FoodproductionAdapterFactory;

public class StandardFoodProductionPropertyEditorAdapterFactory extends
		FoodproductionAdapterFactory implements
		FoodProductionPropertyEditorAdapterFactory {

	public StandardFoodProductionPropertyEditorAdapterFactory() {
		super();
		FoodProductionPropertyEditorAdapterFactory.INSTANCE
				.addAdapterFactory(this);
	}

	@Override
	public Adapter createFoodTransformerAdapter() {
		return new StandardFoodProductionPropertyEditorAdapter();
	}

	public boolean isFactoryForType(Object type) {
		return type == FoodProductionPropertyEditorAdapter.class
				|| super.isFactoryForType(type);
	}

} // StandardFoodProductionPropertyEditorAdapterFactory
