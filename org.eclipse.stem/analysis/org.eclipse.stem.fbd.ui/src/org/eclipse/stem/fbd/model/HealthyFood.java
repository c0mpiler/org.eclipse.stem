package org.eclipse.stem.fbd.model;

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

import org.eclipse.stem.fbd.model.retail.IDistributor;

/**
 * Needs more documentation.
 * @author ddoerr
 *
 */
public class HealthyFood implements Food {

	private IDistributor dist;
	private int distId;

	public HealthyFood(IDistributor dist) {
		this.dist = dist;
		this.distId = this.dist.getDistributorID();
	}

	public HealthyFood(int distId){
		this.distId = distId;
	}
	
	@Override
	public String getName() {
		return "Good Stuff";
	}

	@Override
	public IDistributor getDistributor() {
		return this.dist;
	}
	
	@Override
	public int getDistributorId(){
		return this.distId;
	}
}
