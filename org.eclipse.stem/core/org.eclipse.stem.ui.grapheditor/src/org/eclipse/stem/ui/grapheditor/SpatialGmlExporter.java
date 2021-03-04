package org.eclipse.stem.ui.grapheditor;

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

import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Given a map of gmlPolygons, export the spatial data to a gml file
 */
public class SpatialGmlExporter {

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

	private static final String ISO_CODE = "ISO-8859-1"; //$NON-NLS-1$
	private static final String INDENT = "yes"; //$NON-NLS-1$

	/**
	 * Write the GML
	 * 
	 * @param fileName
	 * @param countryCode
	 * @param level
	 */
	@SuppressWarnings("deprecation")
	public static void writeGML(String fileName, URI graphURI,
			Map<URI, Set<Polygon>> polygonMap) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Document document = null;

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.newDocument();
		} catch (Exception e) {
			Activator.logInformation("Error parsing file " + e.getMessage()); //$NON-NLS-1$
		}

		// Map Element
		Element root = document.createElement(MAP);
		document.appendChild(root);
		root.setAttribute("xmlns:gml", "http://www.opengis.net/gml"); //$NON-NLS-1$ //$NON-NLS-2$
		root.setAttribute("xmlns:georss", "http://www.georss.org/georss"); //$NON-NLS-1$ //$NON-NLS-2$
		// title
		Element titleElt = document.createElement(TITLE);

		titleElt.setTextContent(graphURI.lastSegment() + "  map"); //$NON-NLS-1$ 
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

		Iterator<URI> iter = polygonMap.keySet().iterator();

		while (iter.hasNext()) {
			URI uri = iter.next();
			Set<Polygon> polySet = polygonMap.get(uri);
			Element polyElt = document.createElement(POLYGON);
			polyElt.setAttribute(ID, uri.lastSegment()); // id);
			whereElt.appendChild(polyElt);
			Element boundaryElt = document.createElement(BOUNDARY);
			polyElt.appendChild(boundaryElt);
			
			if (polySet == null) {
				continue;
			}

			Iterator<Polygon> rings = polySet.iterator();
			while ((rings != null) && (rings.hasNext())) {
				Polygon p = rings.next();
				Element ringElt = document.createElement(RING);
				boundaryElt.appendChild(ringElt);
				Element posListElt = document.createElement(POSLIST);
				String data = p.getData();
				posListElt.setTextContent(data);
				ringElt.appendChild(posListElt);
			}
		}// all polygons
		
		write(document, fileName);		

	}// writeGML

	/**
	 * A standard JAXP way to write a DOM document
	 * 
	 * @param document
	 * @param fileName
	 * 
	 */
	private static synchronized void write(Document document, String fileName) {
		// if(log.logFlag) log.logEnter("XmlUtilities.write(" + document + ", "
		// + xmlFile + ")");
		try {
			File file = new File(fileName);
			file.delete();

			FileWriter fw = new FileWriter(fileName);

			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(fw);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer serializer = tf.newTransformer();
			serializer.setOutputProperty(OutputKeys.ENCODING, ISO_CODE);
			serializer.setOutputProperty(OutputKeys.INDENT, INDENT);
			serializer.transform(domSource, streamResult);

			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// if(log.logFlag) log.logExit("XmlUtilities.write");
		return;
	} // end write

} // SpatialGmlExporter
