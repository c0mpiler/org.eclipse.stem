package org.eclipse.stem.definitions.functions;

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


import java.util.ArrayList;
import java.util.Calendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.EarthScienceLabel;

public class CTDLFunctions {

	private static String TYPE_TEMPERATURE = "temperature";
	private static String TYPE_NIGHTTEMPERATURE = "nighttemp";
	private static String TYPE_RAINFALL = "rainfall";
	private static String TYPE_NDVI = "vegetation";
	private static String TYPE_ELEVATION = "elevation";
	
	public final static double MISSING_DATA = 99999.0;
	
	/**
	 * area. The area functions. Return the area of the region (node), or -1 if there is no area label attached
	 * 
	 * @param node
	 * @return double The area of the region (node)
	 */
	
	public static double area(Node node)
	{
		EList<NodeLabel>labels = node.getLabels();
		
		for(int i=0;i<labels.size();++i) {
			NodeLabel lab = labels.get(i);
			if(lab instanceof AreaLabel) {
				AreaLabel aLab = (AreaLabel)lab;
				return aLab.getCurrentAreaValue().getArea();
			}
		}
		
		return -1.0;
	}

	/**
	 * Get the day time temperature.
	 * 
	 * @param node
	 * @param time
	 * @param timeDelta
	 * @param t
	 * @return double Daytime temperature
	 */
	public static double temperature(Node node, STEMTime time, long timeDelta, double t)
	{
		return getInterpolatedEarthScienceValue(node, time, timeDelta, t, TYPE_TEMPERATURE);
	}
	
	/**
	 * Get the night time temperature.
	 * 
	 * @param node
	 * @param time
	 * @param timeDelta
	 * @param t
	 * @return double Nighttime temperature
	 */
	public static double nighttemp(Node node, STEMTime time, long timeDelta, double t)
	{
		return getInterpolatedEarthScienceValue(node, time, timeDelta, t, TYPE_NIGHTTEMPERATURE);
	}
	
	/**
	 * Get the vegetation index
	 * 
	 * @param node
	 * @param time
	 * @param timeDelta
	 * @param t
	 * @return double NDVI vegetation index
	 */
	
	public static double ndvi(Node node, STEMTime time, long timeDelta, double t)
	{
		return getInterpolatedEarthScienceValue(node, time, timeDelta, t, TYPE_NDVI);
	}
	
	/**
	 * Get the rainfall index
	 * 
	 * @param node
	 * @param time
	 * @param timeDelta
	 * @param t
	 * @return double Rainfall (mm)
	 */
	
	public static double precipitation(Node node, STEMTime time, long timeDelta, double t)
	{
		return getInterpolatedEarthScienceValue(node, time, timeDelta, t, TYPE_RAINFALL);
	}
	
	/**
	 * Get the elevation (in m)
	 * 
	 * @param node
	 * @param time
	 * @param timeDelta
	 * @param t
	 * @return double Elevation (in meters)
	 */
	
	@SuppressWarnings("boxing")
	public static double elevation(Node node, STEMTime time, long timeDelta, double t)
	{
		DateInfo dInfo = getDateInfo(time, timeDelta, t); // not really needed
		EarthScienceLabel lab = getEarthScienceLabel(node, dInfo.year, TYPE_ELEVATION);
		if(lab == null)
			return MISSING_DATA;
		else return lab.getCurrentEarthScienceValue().getMean().get(0);
	}
	
	@SuppressWarnings("boxing")
	private static double getInterpolatedEarthScienceValue(Node node, STEMTime time, long timeDelta, double t, String type) {
		DateInfo dInfo = getDateInfo(time, timeDelta, t);
		
		EarthScienceLabel lab1 = getEarthScienceLabel(node, dInfo.year, type);
		if(lab1 == null)
			return MISSING_DATA;
		
		EarthScienceLabel lab2;
		if(dInfo.year != dInfo.next_month_year)
			 lab2 = getEarthScienceLabel(node, dInfo.year, type);
		else lab2 = lab1;
		
		double v1 = lab1.getCurrentEarthScienceValue().getMean().get(dInfo.month);
		double v2 = lab2.getCurrentEarthScienceValue().getMean().get(dInfo.next_month);
		
		if(v1 ==  MISSING_DATA) return MISSING_DATA;
		if(v2 == MISSING_DATA) return MISSING_DATA;
		
		return  (dInfo.fraction*v2) +(1.0-dInfo.fraction)*v1;
	}
	
	@SuppressWarnings("boxing")
	private static EarthScienceLabel getEarthScienceLabel(Node node, int year, String type) {

		EList<NodeLabel>labels = node.getLabels();
		
		ArrayList<EarthScienceLabel> allLabels = new ArrayList<EarthScienceLabel>();
		ArrayList<Integer>allYears = new ArrayList<Integer>();
		ArrayList<Integer>allTwoDigYears = new ArrayList<Integer>();
		
		for(int i=0;i<labels.size();++i) {
			NodeLabel lab = labels.get(i);
			if(lab instanceof EarthScienceLabel && ((EarthScienceLabel)lab).getCurrentEarthScienceValue().getDataType().equals(type)) {
				EarthScienceLabel eLab = (EarthScienceLabel)lab;
				// Elevation is special, never changes
				if(type.equals(TYPE_ELEVATION))
					return eLab;
				allLabels.add(eLab);
				int esYear = eLab.getCurrentEarthScienceValue().getValidYear();
				allYears.add(esYear);
				int twoDigYear = esYear - (esYear/100)*100;
				allTwoDigYears.add(twoDigYear);
			}
		}
		// case 1. missing return null
		if(allLabels.size() == 0) return null;
		// case 2. If only single label, use it.
		if(allLabels.size() == 1) return allLabels.get(0);
		// case 3. If more than one label, see if we have the matching year. If so use it.
		if(allYears.indexOf(year) != -1) return allLabels.get(allYears.indexOf(year));
		// case 4. See if we have a matching two digit year.
		int twoDigYear = year - (year/100)*100;
		if(allTwoDigYears.indexOf(twoDigYear) != -1) return allLabels.get(allTwoDigYears.indexOf(twoDigYear));
		// case 5. Just return number one on the list
		return allLabels.get(0);
	}



	private static DateInfo getDateInfo(STEMTime time, long timeDelta, double t) {
		Calendar c = Calendar.getInstance();
		// Date now = time.getTime();
		
		long iPart;
		double fPart;

		// Get the fractional part
		iPart = (long) t;
		fPart = t - iPart;
		
		long fracMillis = (long)(timeDelta * fPart);
		
		STEMTime actualTime = time.addIncrement(fracMillis);
		c.setTime(actualTime.getTime());
		int month = c.get(Calendar.MONTH); // deprecated but still works
		int nextMonth = month+1;
		int year = c.get(Calendar.YEAR);
		int nextMonthYear = year;
		if (nextMonth > 11) {
			nextMonth = 0;
			nextMonthYear = year+1;
		}
		
		double dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		double hourOfDay = c.get(Calendar.HOUR_OF_DAY);
		double minOfHour = c.get(Calendar.MINUTE);
		double secondOfMinute = c.get(Calendar.SECOND);
		
		double daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH); 
		
		double preciseDayInMonth = dayOfMonth+hourOfDay/24.0+minOfHour/(24.0*60)+secondOfMinute/(24*60*60);
		
		// Fix for 1.4 RC2 
		// Substract one to get a number between 0 and 31
		preciseDayInMonth -= 1.0;
		
		double fraction = preciseDayInMonth/daysInMonth;
		
		DateInfo dInfo = new DateInfo();
		dInfo.year = year;
		dInfo.next_month_year = nextMonthYear;
		dInfo.month = month;
		dInfo.next_month = nextMonth;
		dInfo.fraction = fraction;
		return dInfo;
	}
	
	private static class DateInfo {
		public int year;
		public int next_month_year;
		public int month;
		public int next_month;
		public double fraction;
	}
}
