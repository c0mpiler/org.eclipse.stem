package org.eclipse.stem.tests.automaticexperiment;

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

import java.util.Arrays;

import org.eclipse.stem.analysis.AnalysisPackage;
import org.eclipse.stem.analysis.ErrorResult;
import org.eclipse.stem.analysis.automaticexperiment.NelderMeadAlgorithm;
import org.eclipse.stem.analysis.automaticexperiment.SimplexFunction;

import junit.framework.TestCase;

public class NelderMeadAlgorithmTest extends TestCase {
	boolean debug = false;
	
	public NelderMeadAlgorithmTest(String name) {
		super(name);
	}

	public void testExecute() {
		NelderMeadAlgorithm nelder = new NelderMeadAlgorithm();
		nelder.setParameterLimits(0, 0.0, 9999999.0);
		nelder.setParameterLimits(1, 0.0, 9999999.0);
		double[] initStart = { 1.8, 1.2 };
		double[] step = { 0.5, 0.5 };
		nelder.execute(new SampleFunction(), initStart, step, 0.01, -1);
		System.out.println("Results:");
		System.out.println("Minimum Parameters - " + Arrays.toString(nelder.getMinimumParametersValues()));
		System.out.println("Minimum Function Value - " + nelder.getMinimumFunctionValue());
		assertTrue(Math.round(nelder.getMinimumParametersValues()[0]) == 3);
		assertTrue(Math.round(nelder.getMinimumParametersValues()[1]) == 2);
		assertTrue(Math.round(nelder.getMinimumFunctionValue()) == -7);
	}
	
	class SampleFunction implements SimplexFunction {

		public ErrorResult getValue(double[] parameters) {
			//f(x,y) = -4x + x^2 - y - xy + y^2
			//Local minimum for this function is -7 at x=3 and y=2
			double x = parameters[0];
			double y = parameters[1];
			double result = -4 * x;
			result += Math.pow(x, 2);
			result -= y;
			result -= x * y;
			result += Math.pow(y, 2);
			if(debug) {
				System.out.println("Function value for x=" + x + ", y=" + y + " is: " + result);
			}
			
			ErrorResult res = AnalysisPackage.eINSTANCE.getAnalysisFactory().createErrorResult();
			res.setError(result);
			return res;
		}
		
		/**
		 * flush the logger ONLY when done
		 */
		@Override
		public void done() {
			return;	
		} //done
		
	}

}
