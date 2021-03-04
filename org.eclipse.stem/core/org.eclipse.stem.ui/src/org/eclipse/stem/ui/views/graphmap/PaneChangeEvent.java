package org.eclipse.stem.ui.views.graphmap;

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

public class PaneChangeEvent {
	private Double scaleFactor;
	private Double transX;
	private Double transY;

	public PaneChangeEvent(Double scaleFactor, Double transX, Double transY) {
		this.transX = transX;
		this.transY = transY;
		this.scaleFactor = scaleFactor;
	}

	public Double getScaleFactor() {
		return this.scaleFactor;
	}

	public Double getTranformationX() {
		return this.transX;
	}

	public Double getTranformationY() {
		return this.transY;
	}
}
