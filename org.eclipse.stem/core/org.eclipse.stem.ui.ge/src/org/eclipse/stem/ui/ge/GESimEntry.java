package org.eclipse.stem.ui.ge;
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
import java.util.Map;

import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.ui.ge.kml.StemKml;
import org.eclipse.stem.ui.ge.views.GEPreferencePage;


//-----------------------------------------------------------------
//SimEntry
//-----------------------------------------------------------------
/**
* SimEntry is special entry to describe a Simulation that we 
* are or were actively logging.
* 
* It holds information that is unique to the generation 
* of KML files for a specific simulation.
* 
* 
*/
public class GESimEntry {
	
	/**
	 * Name assigned to this Simulation entry 
	 *   SIMn where n is the simulation.getSequenceNumber()
	 */
	private String name = null;
	
	/**
	 * Simulation being watched
	 */
	private ISimulation simulation = null;
	
	/**
	 * SEIR value being mapped
	 */
	private Aspect aspectValue;
	/** 
	 * will GE files be written
	 */
	boolean active = false;
	
	/**
	 * StemKml control instance
	 */
	private StemKml stemKml = null;
	
	/**
	 * map of geographic data keyed by area id
	 */
	private Map<String, GEData> stemMap = null;
	/**
	 * directory where KML files are written.
	 * Note: there could be different log files being used 
	 * for simulations that run concurently.  
	 */	
	private String logFolder = null;
	
	/**
	 * Method used to display on GE
	 *   Defaults to Manual
	 */
	private int method = GEPreferencePage.M_MANUAL_DISPLAY;
	
	//int cycle = -1;

	/**
	 * Constructor
	 * 
	 * @param name  Unique name for a Simulation
	 * @param simulation  Instance of Simulation implementation
	 */
	public GESimEntry(String name,ISimulation simulation) {
		this.name = name;
		this.simulation = simulation;
		this.active = false;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @return the stemKml
	 */
	public StemKml getStemKml() {
		return stemKml;
	}
	/**
	 * @param stemKml the stemKml to set
	 */
	public void setStemKml(StemKml stemKml) {
		this.stemKml = stemKml;
	}
	/**
	 * @return the stemMap
	 */
	public Map<String, GEData> getStemMap() {
		return stemMap;
	}
	/**
	 * @param stemMap the stemMap to set
	 */
	public void setStemMap(Map<String, GEData> stemMap) {
		this.stemMap = stemMap;
	} 
	
	/**
	 * @return the logFolder
	 */
	public String getLogFolder() {
		return logFolder;
	}
	/**
	 * @param logFolder the logFolder to set
	 */
	public void setLogFolder(String logFolder) {
		this.logFolder = logFolder;
	}
	
	/**
	 * for debug info
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("GESimEntry: ");
		sb.append(name);
		sb.append(" active: "+active);
		sb.append(" to: "+logFolder);
		sb.append(" method: "+method);
		//sb.append(" Name: "+simulation.getName());
		return sb.toString();
	}
	/**
	 * Get the aspect that we want to display
	 * 
	 * @return the sEIRValue
	 */
	public Aspect getAspectToDisplay() {
		//GELog.debug(this.getClass(),"getAspectToDisplay: "+aspectValue);
		return aspectValue;
	}
	/**
	 * @param value the aspect that we want displayed
	 */
	public void setAspectToDisplay(Aspect value) {
		aspectValue = value;
	}
	/**
	 * @return the simulation
	 */
	public ISimulation getSimulation() {
		return simulation;
	}
	/**
	 * @return the method
	 */
	public int getMethod() {
		return method;
	}
	/**
	 * @param method the method to set
	 */
	public void setMethod(int method) {
		this.method = method;
	}
}  // class SimEntry

