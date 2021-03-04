package org.eclipse.stem.util.loggers.htmlgeneration;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author kaufman
 *
 */

public abstract class HtmlElement {
	
	protected String PREFIX = "<";
	protected String tag;
	protected String SUFFIX1 = ">"+"\n";
	protected String SUFFIX2 = ">";
	protected String close = "/";
	protected String start;
	protected String end;
	protected static final String INDENT = "  ";
	protected List<HtmlElement> contents = new ArrayList<HtmlElement>();
	protected Map<String,String> attributeValues = new HashMap<String,String>();
	
	protected String data = null;
	

	
	/**
	 * 
	 * @param tag
	 */
	public HtmlElement(String tag) {
		this.tag = tag;
	}
	
	/**
	 * 
	 * @param tag
	 * @param attr
	 * @param val
	 */
	public HtmlElement(String tag, String attr, String val) {
		this.tag = tag;
		attributeValues.put(attr,val);
	}
	
	/**
	 * 
	 * @param element
	 */
	public void add(HtmlElement element) {
		contents.add(element);
	}
	
	
	
	
	/**
	 * 
	 * @param indent
	 * @return the contents as a String
	 */
	public String getContents(String indent) {
		indent += INDENT;
		StringBuffer buf = new StringBuffer();
		for(int i = 0; i < contents.size(); i ++) {
			HtmlElement element = contents.get(i);
			buf.append(indent+element.open());
			String data = element.getData();
			if(data != null) buf.append(data);
			buf.append(element.getContents(indent));
			if(element.data==null) buf.append(indent);
			buf.append(element.close());
		}
	    return buf.toString();
	}
	
	

	/**
	 * 
	 * @return data
	 */
	public String getData() {
		 return data;
	}// open
	
	/**
	 * 
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	/**
	 * 
	 * @param attr
	 * @param value
	 */
	public void addAttribute(String attr, String value) {
		attributeValues.put(attr,value);
	}
	
	/**
	 * 
	 * @return opening tag
	 */
	public String open() {
		StringBuffer element = new StringBuffer ();
		element.append(PREFIX);
		element.append(tag);
		
		if(attributeValues.size() >=1) {
			Iterator<String> iter = attributeValues.keySet().iterator();
			while( (iter!=null)&&(iter.hasNext()) ) {
				String attr = iter.next();
				String value = "\""+attributeValues.get(attr)+"\"";
				element.append(" "+attr+"="+value);
			}
		}
		if(data==null) {
			element.append(SUFFIX1);
		} else {
			element.append(SUFFIX2);
		}
	    return element.toString();
	}// open
	
	/**
	 * 
	 * @return closing tag
	 */
	public String close() {
		StringBuffer element = new StringBuffer ();
		element.append(PREFIX);
		element.append(close);
		element.append(tag);
		element.append(SUFFIX1);
	    return element.toString();
	}// get contents

}
