package org.eclipse.stem.loggers.csv.logger.html;

/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation.
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author kaufman
 *
 */

public class HTMLdocument {
	
	/**
	 * Html Document header
	 */
	public final String HEADER = "<!DOCTYPE html>"+"\n";
	
	/**
	 * HTML tag <html>
	 */
	public final String HTML_START = "<html>";
	
	/**
	 * HTML tag </html>
	 */
	public final String HTML_STOP = "</html>";
	protected List<HtmlElement> contents = new ArrayList<HtmlElement>();
	private Html html = new Html();
	
	
	
	/**
	 * 
	 */
	public HTMLdocument() {
		contents.add(html);
	}
	
	/**
	 * add an element to the root (html) element
	 * @param element
	 */
	protected void add(HtmlElement element) {
		html.add(element);
	}
	
	
	/**
	 * 
	 * @return contents as a String
	 */
	protected String getContents() {
		StringBuffer buf = new StringBuffer(HEADER);
		for(int i = 0; i < contents.size(); i ++) {
			HtmlElement element = contents.get(i);
			buf.append(element.open());
			String data = element.getData();
			if(data != null) buf.append(data);
			buf.append(element.getContents(""));
			buf.append(element.close());
		}
	    return buf.toString();
	}

	
	/**
	 * 
	 * @param fileName
	 * @param doc
	 */
	protected void writeDocument(File file, String doc) throws IOException
	{
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(doc);
			fw.flush();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e) { 
					// ignore 
				}
			}
		}
	}

}
