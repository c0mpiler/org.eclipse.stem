package org.eclipse.stem.analysis.automaticexperiment;

import org.eclipse.stem.analysis.ErrorResult;

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

public interface SimplexAlgorithm {
	public final static double NO_LIMIT = -1;
	
	public void execute(final SimplexFunction fn,  final double[] startPoints, final double[] step, final double terminatingVariance, long maxIter);
	public double getMinimumFunctionValue();
	public ErrorResult getMinimumErrorResult();
	public double[] getMinimumParametersValues();
	public void setParameterLimits(final int parameterIndex, final double lowerBound, final double upperBound);
}
