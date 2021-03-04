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

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * Given a map of gmlPolygons, export the spatial data to a gml file
 */
public class SpatialGmlExporter {
	
	private static Map<String,String> nameToIDMap = new HashMap<String,String>();
	
	static Document doc;
	
	
	private static final String MAP = "Map"; //$NON-NLS-1$
	private static final String TITLE = "title"; //$NON-NLS-1$
	private static final String SUBTITLE = "subTitle"; //$NON-NLS-1$
	private static final String UPDATED = "updated";//$NON-NLS-1$
	private static final String ENTRY = "entry";//$NON-NLS-1$
	private static final String WHERE = "georss:where";//$NON-NLS-1$
	private static final String POLYGON = "gml:Polygon";//$NON-NLS-1$
	private static final String ID = "gml:id";//$NON-NLS-1$

	private static final String BOUNDARY = "gml:outerBoundaryIs";//$NON-NLS-1$
	private static final String RING = "gml:LinearRing";//$NON-NLS-1$
	private static final String POSLIST = "gml:posList";//$NON-NLS-1$
	
	
	/**
	 * 
	 */
	public SpatialGmlExporter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test();
	}
	
	
	/** 
	 * Test the gmlExporter using data from a kml file.
	 */
	public static void test() {
		SpatialGmlExporter self = new SpatialGmlExporter();
		String dir = "./resources/"; //$NON-NLS-1$
		KmlReader kmlReader = new KmlReader();
		
		Map<String,Set<GmlPolygon>> polygonMap = kmlReader.readKML(dir+"test2.KML",1); //$NON-NLS-1$
		nameToIDMap = KmlReader.getNameToIDMap();
		
		String outFile = dir+"/TEST_2_MAP.xml"; //$NON-NLS-1$
		String threeLetterCode = "CAN"; //$NON-NLS-1$
		self.writeSpatialData(polygonMap, outFile, threeLetterCode, 1);
	}// test
	
	
	/**
	 * Given a map of gmlPolygons, writes the GML data to an xml file
	 * @param polygonMap
	 * @param outputFile
	 * @param threeLetterCode
	 * @param adminLevel
	 */
	public void writeSpatialData(Map<String,Set<GmlPolygon>> polygonMap, String outputFile, String threeLetterCode, int adminLevel) {
		writeGML(outputFile,threeLetterCode, adminLevel, polygonMap); 
	}
	
	
	/**
	 * Write the GML
	 * @param fileName
	 * @param countryCode
	 * @param level
	 */
	@SuppressWarnings("deprecation")
	private void writeGML(String fileName, String countryCode, int level, Map<String,Set<GmlPolygon>> polygonMap) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Document document = null;
		//int foundNames = 0;
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.newDocument();
		} catch (Exception e) {
			UtilLogger.logInformation("Error parsing file " + e.getMessage()); //$NON-NLS-1$
		}
		
		//Map Element
		Element root = document.createElement(MAP);
		document.appendChild(root);
		root.setAttribute("xmlns:gml", "http://www.opengis.net/gml"); //$NON-NLS-1$ //$NON-NLS-2$
		root.setAttribute("xmlns:georss", "http://www.georss.org/georss"); //$NON-NLS-1$ //$NON-NLS-2$
		// title
		Element titleElt = document.createElement(TITLE);
		titleElt.setTextContent(countryCode + " Level "+level+" map"); //$NON-NLS-1$ //$NON-NLS-2$
		root.appendChild(titleElt);
		// subtitle
		Element subTitleElt = document.createElement(SUBTITLE);
		subTitleElt.setTextContent("Administrative Boundaries"); //$NON-NLS-1$
		root.appendChild(subTitleElt);
		// updated
		Element updatedElt = document.createElement(UPDATED);
		Calendar cal = Calendar.getInstance();
		String date = cal.getTime().toLocaleString();
		updatedElt.setTextContent(date);
		root.appendChild(updatedElt);
		
		// ENTRY
		Element entryElt = document.createElement(ENTRY);
		root.appendChild(entryElt);
		// WHERE
		Element whereElt = document.createElement(WHERE);
		entryElt.appendChild(whereElt);
		
	
		Iterator<String> iter = polygonMap.keySet().iterator();
				
		while(iter.hasNext()) {
			
			String name = iter.next();
			UtilLogger.logInformation("writing... "+name); //$NON-NLS-1$
			Set<GmlPolygon> polySet = polygonMap.get(name);
			String id = nameToIDMap.get(name);
			Element polyElt = document.createElement(POLYGON);
			polyElt.setAttribute(ID, id);
			whereElt.appendChild(polyElt);
			Element boundaryElt = document.createElement(BOUNDARY);
			polyElt.appendChild(boundaryElt);
			
			Iterator<GmlPolygon> rings = polySet.iterator();
			while((rings!=null) && (rings.hasNext())) {
				GmlPolygon p = rings.next();
				Element ringElt = document.createElement(RING);
				boundaryElt.appendChild(ringElt);
				Element posListElt = document.createElement(POSLIST);
				String data = p.getData();
				posListElt.setTextContent(data);
				ringElt.appendChild(posListElt);
			}
		
		}// all polygons
		
		write(document,fileName);
		
		
	}// writeGML
	
	
	/**
	 * @param document 
	 * @param fileName 
	 * 
	 */
	private static synchronized void write(Document document, String fileName) 
	{
		//if(log.logFlag) log.logEnter("XmlUtilities.write(" + document + ", " + xmlFile + ")");
		try 
		{
			FileWriter fw = new FileWriter(fileName);
			writeDocument(document,fw);
			fw.close();
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//if(log.logFlag) log.logExit("XmlUtilities.write");
		return;
	}											// end write

	/**
	 * write xml document to java.io.Writer
	 * @param doc 
	 * @param w 
	 * @throws IOException 
	 */
	private static void writeDocument(Document doc, Writer w) throws IOException
	{
		XMLSerializer ser = new XMLSerializer(w, new OutputFormat(doc,"UTF-8",true));//$NON-NLS-1$
		ser.serialize(doc);
	}
	

} // SpatialGmlExporter
