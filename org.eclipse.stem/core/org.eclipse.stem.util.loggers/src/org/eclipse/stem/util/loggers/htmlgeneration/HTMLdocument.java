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


import java.io.FileWriter;
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
	public void add(HtmlElement element) {
		html.add(element);
	}
	
	
	/**
	 * 
	 * @return contents as a String
	 */
	public String getContents() {
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
	 * for testing
	 * @param args
	 */
	public static void main(String[] args) {
		
		HTMLdocument doc = new HTMLdocument();
		
		Head head = new Head();
		doc.add(head);
		Title title = new Title("Simulation Summary");
		head.add(title);
		
		Body body = new Body();
		doc.add(body);
		Span span = new Span("style","font-weight: bold;");
		body.add(span);
		
		Table table = new Table("style","text-align: left; width: 100%;");
		table.addAttribute("border", "1");
		table.addAttribute("cellpadding", "2");
		table.addAttribute("cellspacing", "2");
		doc.add(table);
		
		Tbody tbody = new Tbody();
		table.add(tbody);
		
		TR tr = new TR("align","center");
		tbody.add(tr);
		
		TD td = new TD("style","background-color: rgb(102, 255, 255);");
		tr.add(td);
		
		Span span2 = new Span("style","font-weight: bold;");
		span2.setData("STEM Simulation Summary");
		td.add(span2);
		
		
		TR tr2 = new TR();
		tbody.add(tr2);
		TD td2 = new TD();
		tr2.add(td2);
		UL ul = new UL();
		td2.add(ul);
		
		LI li1 = new LI("modelA");
		LI li2 = new LI("modelB");
		ul.add(li1);
		UL ul2 = new UL();
		ul.add(ul2);
		ul2.add(li2);
		UL ul3 = new UL();
		ul2.add(ul3);
		LI li2a = new LI("decorator1");
		LI li2b = new LI("decorator2");
		ul3.add(li2a);
		ul3.add(li2b);
		LI li3 = new LI("sequencer");
		LI li4 = new LI("solver");
		ul.add(li3);
		ul.add(li4);
		
		doc.writeDocument("/Users/jhkauf/Desktop/test.html",doc.getContents()); 
		//System.out.println(doc.getContents());
	}// main
	
	
	/**
	 * 
	 * @param fileName
	 * @param doc
	 */
	public void writeDocument(String fileName, String doc) {
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(doc);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			System.out.println("Error writing file to "+fileName);
			e.printStackTrace();
		}
		
		
	}

}
