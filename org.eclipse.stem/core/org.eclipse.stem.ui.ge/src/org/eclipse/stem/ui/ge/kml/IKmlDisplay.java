package org.eclipse.stem.ui.ge.kml;

import java.util.Map;

import org.eclipse.stem.ui.ge.Aspect;
import org.eclipse.stem.ui.ge.GEData;

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

/**
 * IKMLDisplay defines the interface for classes that implement
 * the generation of KML files that will display the STEM
 * disease aspect on the GoogleEarth map.  
 * 
 * Implementations of IKmlDisplay have a single method 
 * "generatePolygons" which is passed all of the information 
 * needed to write the desired KML. 
 *
 */
public interface IKmlDisplay {
	

	 /**
     * Create the KML control file to display all of the 
     * polygon (county) areas
     *
     * <pre>
     * Information passed:
     * 
     * controlFilename:  The filename where the resulting KML is to be written.
     *    
     * geData:  A HashMap containing an entry for each geographical
     *          area being mapped by this simulation. It contains the 
     *          geographical borders (latlong) and values for 
     *          each Aspect. 
     *          
     * aspect:  The Aspect that the user wants displayed. 
     * 
     * 
     * </pre>
     * 
     * @param controlFileName File where KML will be written 
     * @param geData Map of GEData objects 
     * @param aspect  which type of map (population,susceptiple...
     * 
     */
    
	public void generatePolygons(String controlFileName, 
			Map<String,GEData> geData, Aspect aspect);
	
}