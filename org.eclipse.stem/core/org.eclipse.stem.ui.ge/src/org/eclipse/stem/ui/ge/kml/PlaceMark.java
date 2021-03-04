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
import org.w3c.dom.Text;

/**
 * Build the PlaceMark section of a KML document.
 */
public class PlaceMark {
   
    private Element _placemark = null;
    
    private Document _doc = null;
    /**
     * PlaceMark constructor
     * @param doc 
     */
    public PlaceMark(Document doc) {
        _doc = doc;
        _placemark = _doc.createElement("Placemark");
       
        
    }
    
    /**
     * @return PlaceMark Element 
     */
    public Element getElement() {
        return _placemark;
    }
    
    /**
     * Add a description tag to the PlaceMark
     * @param description
     */
    public void setDescription(String description) {
       
        Element desc = _doc.createElement("description");
        Text t = _doc.createTextNode(description);
        desc.appendChild(t);        
        _placemark.appendChild(desc);
    }
    
    /**
     * Add a description tag to the PlaceMark
     * @param name
     */
    public void setName(String name) {
       
        Element nm = _doc.createElement("name");
        Text t = _doc.createTextNode(name);
        nm.appendChild(t);        
        _placemark.appendChild(nm);
    }
    
    /**
     * Add a visibility tag to the PlaceMark
     * @param value   Usually "0"
     */
    public void setVisibility(String value) {
        
        Element v = KmlDoc.createAttr(_doc,"visibility","0");     
        _placemark.appendChild(v);
          
    }
    
    /**
     * Add a styleUrl pointing to an existing Style 
     * @param style Style object
     */
    public void setStyleUrl(Style style) {
       String id = style.getId();
       Element url = KmlDoc.createAttr(_doc,"styleUrl","#"+id);            
       _placemark.appendChild(url);
       
    }
    /**
     * Add a section (i.e. LookAt) to the PlaceMark
     * @param element
     */
    public void appendChild(Element element) {            
        _placemark.appendChild(element);
    }
} // end class
