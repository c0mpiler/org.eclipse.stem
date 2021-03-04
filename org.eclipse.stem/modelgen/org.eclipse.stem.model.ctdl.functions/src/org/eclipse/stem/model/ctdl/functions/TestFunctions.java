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
package org.eclipse.stem.model.ctdl.functions;

import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.model.STEMTime;

public class TestFunctions 
{	
	
	public static double test1Method(Node n)
	{
		return 0.0;
	}
	
	public static double test2Method(double x, Node n)
	{
		return 0.0;
	}
	
	public static double test3Method(double x, STEMTime time, Node n)
	{
		return 0.0;
	}
	
	public static double test4Method(STEMTime time, Node n, double x)
	{
		return 0.0;
	}
	
	public static double test5Method(double x, String y)
	{
		return 0.0;
	}
	
	public static double test6Method(double x, String y, boolean tf)
	{
		return 0.0;
	}
	
	public static String test7Method(double x)
	{
		return "";
	}
	
	public static double test8Method(STEMTime time, Node n, double x, Label label, LabelValue labelValue)
	{
		return 0.0;
	}
	
	public static double one()
	{
		return 1;
	}
	
	public static double add(double x, double y)
	{
		return x+y;
	}
	
	public static double subtract(double x, double y)
	{
		return x-y;
	}
	
	public static double multiply(double x, double y)
	{
		return x*y;
	}
	
	public static double divide(double x, double y)
	{
		return x/y;
	}
}
