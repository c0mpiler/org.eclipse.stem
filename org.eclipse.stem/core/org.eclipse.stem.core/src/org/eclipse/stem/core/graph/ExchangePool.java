package org.eclipse.stem.core.graph;

import org.eclipse.stem.core.STEMObjectPool;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

/**
 * Exchange objects are frequently created to share for instance results between population models and disease models.
 * This class contains a pool of Exchange instances to avoid excessive object creation
 * 
 */

public class ExchangePool {

	public static STEMObjectPool POOL = new STEMObjectPool(100, 100) {

		@Override
		protected Object createNewObject() {
			return GraphFactory.eINSTANCE.createExchange();
		}

		@Override
		protected void resetObject(Object o) {
			// Clear out
			Exchange e = (Exchange)o;
			e.getOtherLabels().clear();
			e.setSource(null);
			e.setTarget(null);
			e.setType(null);
			e.getForIncidence().clear();
		}
		
	};
}
