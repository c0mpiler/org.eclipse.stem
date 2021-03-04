package org.eclipse.stem.ui.ge.kml;
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
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Build the LookAt section of a KML document.
 * <pre>
 *    
 * </pre>
 * 
 *
 */
/*    
<LookAt>
<longitude>-122.0856375356631</longitude>
<latitude>37.42240551227282</latitude>
<range>305.8880792294568</range>
<tilt>46.72425699662645</tilt>
<heading>49.06133439171233</heading>
</LookAt>

*/   
public class LookAt {
   
    private Element _lookat = null;
    
    private Document _doc = null;
    /**
     * LookAt constructor
     * 
     * @param doc Document being built
     */
    public LookAt(Document doc) {
        _doc = doc;
        _lookat = _doc.createElement("LookAt");
          
        
    }
    
    /**
     * @return LookAt Element 
     */
    public Element getElement() {
        return _lookat;
    }

    /**
     * Add coordinates to the LookAt section
     * @param longitude
     * @param latitude 
     */
    public void setCoordinates(double longitude,
            double latitude) {
           
        Element e = KmlDoc.createAttr(_doc,"longitude",Double.toString(longitude));             
        _lookat.appendChild(e);
        e = KmlDoc.createAttr(_doc,"latitude",Double.toString(latitude));             
        _lookat.appendChild(e);

    }
    /**
     * Add a attributes to the LookAt section
     * @param coords as "longitude,latitude,altitude"
     *  
     */
    public void setCoordinates(String coords) {
        int i1 = coords.indexOf(",");
        int i2 = coords.lastIndexOf(",");
        String longitude = coords.substring(0,i1);
        String latitude = coords.substring(i1+1,i2);   
        Element e = KmlDoc.createAttr(_doc,"longitude",longitude);             
        _lookat.appendChild(e);
        e = KmlDoc.createAttr(_doc,"latitude",latitude);             
        _lookat.appendChild(e);

    }
    /**
     * Add a attributes to the LookAt section
     * @param range  Altitude of the eye
     */
    public void setRange(double range) {
           
        Element e = KmlDoc.createAttr(_doc,"range",Double.toString(range));             
        _lookat.appendChild(e);

    }
    
    /**
     * Add a attributes to the LookAt section
     * @param tilt
     */
    public void setTilt(double tilt) {
           
        Element e = KmlDoc.createAttr(_doc,"tilt",Double.toString(tilt));             
        _lookat.appendChild(e);

    } 
    
    /**
     * Add a attributes to the LookAt section
     * @param heading
     */
    public void setHeading(double heading) {
           
        Element e = KmlDoc.createAttr(_doc,"heading",Double.toString(heading));             
        _lookat.appendChild(e);
    }

    
} // end class
