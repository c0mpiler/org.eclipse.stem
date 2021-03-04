package org.eclipse.stem.utility.gml;

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

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



/**
 * Helper Class for creating GML files
 * 
 */
public class GmlPolygon {
	
	
	String name = "undefined";//$NON-NLS-1$
	
	List<Double> lat = new ArrayList<Double>();
	List<Double> lng = new ArrayList<Double>();
	

	/**
	 * 
	 * @param name
	 * 
	 */
	public GmlPolygon(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @param dlatVal
	 * @param dlngVal
	 */
	public void addPoint(double dlatVal, double dlngVal) {
		//UtilLogger.logInformation("READ "+dlat+", "+dlng);
		double factor = 1000000.0;
		double dlat = dlatVal;
		double dlng = dlngVal;
		dlat *= factor;
		dlng *= factor;
		long ilat = Math.round(dlat);
		long ilng = Math.round(dlng);
		dlat = ilat;
		dlng = ilng;
		dlat /= factor;
		dlng /= factor;
		//UtilLogger.logInformation("rounded to "+dlat+", "+dlng);
		lat.add(Double.valueOf(dlat));
		lng.add(Double.valueOf(dlng));
	}// addpoint
	
	/**
	 * 
	 * @param tokensKML
	 */
	public void addPoint(String tokensKML) {
		StringTokenizer st = new StringTokenizer(tokensKML);
		String delim = "\r\n";//$NON-NLS-1$
		if (tokensKML.indexOf(delim) <= -1)
			delim = "\n";//$NON-NLS-1$
		while (st.hasMoreTokens()) {
			String valxyz = st.nextToken(delim).trim();
			StringTokenizer st2 = new StringTokenizer(valxyz);
			while (st2.hasMoreTokens()) {
				String lat = st2.nextToken(",");//$NON-NLS-1$
				String lng = st2.nextToken(",");//$NON-NLS-1$
				@SuppressWarnings("unused")
				String z = st2.nextToken(",");//$NON-NLS-1$

				double lt = (Double.valueOf(lat)).doubleValue();
				double lg = (Double.valueOf(lng)).doubleValue();
				lt *= 1000000.0;
				lg *= 1000000.0;
				int ilt = (int)Math.round(lt);
				int ilg = (int)Math.round(lg);
				lt = (double) ilt;
				lg = (double) ilg;
				lt /= 1000000.0;
				lg /= 1000000.0;
				this.addPoint(lt, lg);
			}
		}
	}// addpoint

	
	/**
	 * all lat long data as a single string for file output
	 * @return all lat long data as a single string
	 */
	public String getData() {
		String retVal = "";//$NON-NLS-1$
		for (int i = 0; i < lat.size(); i ++) {
			double lt = lat.get(i).doubleValue();
			double lg = lng.get(i).doubleValue();
			// this FIXES the order to what STEM expects vs KML
			retVal += lg+" "+lt;//$NON-NLS-1$
			if (i < lat.size()-1) retVal += " ";//$NON-NLS-1$
		}
		return retVal;
	}
	
	
}// gmlPolygon
