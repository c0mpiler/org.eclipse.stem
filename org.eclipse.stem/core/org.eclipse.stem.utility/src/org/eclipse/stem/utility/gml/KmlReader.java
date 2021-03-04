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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * create the gml from kml
 */
public class KmlReader {
	
	protected static Map<String,String> nameToIDMap = new HashMap<String,String>();
	
	/**
	 * 
	 * @return
	 */
	public static Map<String, String> getNameToIDMap() {
		return nameToIDMap;
	}

	protected static Map<String,Set<GmlPolygon>> polygonMap = new HashMap<String,Set<GmlPolygon>>();
	static Document doc;
	
	
	/**
	 * 
	 */
	public KmlReader() {
		// TODO Auto-generated constructor stub
	}


	
	/**
	 * reads in a kml file
	 * @param filename
	 * @param lvl 
	 * 
	 * @return a map of id to the set of polygons for the location
	 */
	@SuppressWarnings("nls")
	public Map<String, Set<GmlPolygon>> readKML(String filename, int lvl) {
		Map<String,Set<GmlPolygon>> locationMap = new HashMap<String,Set<GmlPolygon>>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(new File(filename));
		} catch (Exception e) {
			UtilLogger.logInformation("Error parsing file " + e.getMessage()); //$NON-NLS-1$
		}

		NodeList allPlaces = doc.getElementsByTagName("Placemark"); //$NON-NLS-1$
		
		for (int i = 0; i < allPlaces.getLength(); i++) {
			Element e = (Element) allPlaces.item(i);
			
		
			// get the name if there is one
		
			String id1 = "nullID1"; //$NON-NLS-1$
			String name = "nullName"; //$NON-NLS-1$
			String id = "nullID"; //$NON-NLS-1$
			//String population = "nullPop";
			//String area = "nullArea";
			
				// if reading for just one country
				NodeList list = e.getElementsByTagName("description"); //$NON-NLS-1$
				if ((list != null) && (list.getLength() >= 1)) {
					Element descriptionElt = (Element) list.item(0);
					String desc = descriptionElt.getTextContent();
					
					if (descriptionElt != null) {
						name = parseSegment("ADMIN_NAME", desc); //$NON-NLS-1$
						id1 = parseSegment("GMI_ADMIN", desc); //$NON-NLS-1$
						id=id1.replaceAll("MYS-", "MY-"); //$NON-NLS-1$ 
											
						UtilLogger.logInformation(" "); //$NON-NLS-1$
						UtilLogger.logInformation("got name= "+name); //$NON-NLS-1$
						UtilLogger.logInformation("got id= "+id); //$NON-NLS-1$
												
						nameToIDMap.put(name,id);
						
					}
				}
				GmlPolygon p = new GmlPolygon(name);
				if (!locationMap.containsKey(name)) {
					Set<GmlPolygon> polySet = new HashSet<GmlPolygon>();
					locationMap.put(name,polySet);
				}
				Set<GmlPolygon> polySet = locationMap.get(name);
				
				// get the polygons
				NodeList polygonList = e.getElementsByTagName("Polygon"); //$NON-NLS-1$
				if (polygonList != null) {
					for (int ii = 0; ii < polygonList.getLength(); ii++) {
						Element lineElt = (Element) polygonList.item(ii);
						// <coordinates>
						NodeList coordList = lineElt
								.getElementsByTagName("coordinates"); //$NON-NLS-1$

						if (coordList != null) {
							for (int jj = 0; jj < coordList.getLength(); jj++) {
								Element coords = (Element) coordList.item(jj);
								NodeList values = coords.getChildNodes();
								if (values != null) {
									for (int kk = 0; kk < values.getLength(); kk++) {
										Node node = values.item(kk);
										String val = node.getTextContent();
										p.addPoint(val);
									}// for all valuess
								}// if value ! null
							}// for all coords
						}// if coors ! null
					}// for all linesString
				}// if linelist ! null
				polySet.add(p);
				locationMap.put(name,polySet);
				
				
				UtilLogger.logInformation("done reading kml"); //$NON-NLS-1$
				
			
			
			
		} // for all nodes
		
		return locationMap;
	}// readKML()
	
	
	/**
	 * 
	 * @param attrRoot
	 * @param descr
	 * @return
	 */
	public String parseSegment(String attrRoot, String descr) {
		String retVal = "failed to parse "+attrRoot+" in "+descr; //$NON-NLS-1$ //$NON-NLS-2$
		String attr = attrRoot + "</B> ="; //$NON-NLS-1$
		int len = attr.length();
		int id1 = descr.indexOf(attr)+len;
		if(id1 >=0) {
			String temp = descr.substring(id1,descr.length()).trim();
			int id2 = temp.indexOf("<BR>"); //$NON-NLS-1$
			if(id2>=0) {
				retVal = temp.substring(0,id2);
			} else {
				retVal = temp;
			}
			
		}
		
		return retVal;
	}
	
	
	
	
	
	/**
	 * Create a newBufferedReader
	 * 
	 * @param fileName
	 *            the name of the file we want to open for reading
	 * 
	 * @return a reader to a given file
	 */
	static protected BufferedReader openReader(String file) {

		try {

			File f = new File(file);

			if (f.exists() == false) {
				return null;
			}

			return new BufferedReader(new FileReader(file));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * Indicate End-Of-File
	 * 
	 * @param buffer
	 *            A buffer of diva data
	 * 
	 * @return True if we have reached End-Of-File
	 */
	static protected boolean EOF(String buffer) {
		if (buffer == null || buffer.length() == 0)
			return true;
		return false;
	}
	
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String getTwoLetterCode(String id) {
		String retVal = id.substring(id.length()-2, id.length());
		return retVal;
	}


		

	
	
	
}
