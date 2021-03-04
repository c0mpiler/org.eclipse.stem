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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.EdgeDecorator;
import org.eclipse.stem.core.model.GraphDecorator;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.NodeDecorator;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.sequencer.Sequencer;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.util.loggers.Activator;

/**
 * 
 * @author jhkauf
 *
 */
public class HtmlScenarioPage extends HTMLdocument {
	
	// readable labels
	private static final String DECORATOR_STRING 			= "Decorator";
	private static final String DUBLIN_CORE_STRING 			= "Dublin Core";
	private static final String MODEL_STRING 				= "Model";
	private static final String MODEL_GRAPH_STRING 			= "Graph";
	
	private static final String SCENARIO_STRING 			= "Scenario";
	private static final String SEQUENCER_STRING 			= "Sequencer";
	private static final String SOLVER_STRING 				= "Solver";
	private static final String STEM_SCENARIO_STRING 		= "STEM Scenario";
	
	// ID's
	private static final String DATA_ROW_ID_PREFIX 			= "DATA_ROW_";
	private static final String DUBLINCORE_ROW_ID_PREFIX 	= "DUBLINCORE_ROW_";
	private static final String TITLE_ROW_ID_PREFIX 		= "TITLE_ROW_";
	
	// colors
	private static final String COLOR_WHITE 				= "rgb(255, 255, 255)";
	private static final String COLOR_TITLE0 				= "rgb(200, 200, 255)";
	//private static final String COLOR_TITLE1 				= "rgb(102, 255, 255)";
	//private static final String COLOR_DATA 					= "rgb(202, 255, 255)";
	//private static final String COLOR_DUBLINCORE 			= "rgb(200, 255, 200)";
	//private static final String COLOR_DUBLINCORE_DATA		= "rgb(225, 255, 225)";
	
	// other
	private static final String FILENAME	 				= "ScenarioLog.html";
	private int 				indent 						= 0;	
	private static final String COLLAPSE 					= "-";
	private static final String EXPAND 					    = "+";
	private static final String[] CELL_WIDTH 				= {"100px","100px","200px"};
	private static final String INDENT_WIDTH 				= "80px";
	
	/**
	 * 
	 * @param scenario
	 * @param directoryName
	 */
	public HtmlScenarioPage(Scenario scenario, String directoryName) {
		super();
		
		createDocument(scenario);
		String fileName = directoryName + FILENAME;	
		this.writeDocument(fileName,this.getContents()); 
	}
	
	/**
	 * 
	 * @param scenario
	 */
	private void createDocument(Scenario scenario) {
		Head head = new Head();
		this.add(head);
		
		
		String jsContent = readJsFromFile();
		String cssContent = readCssFromFile();
		
		if (!"".equals(jsContent)) {
			Script jsContainer = new Script("type", "text/javascript");
			jsContainer.setData(jsContent);
			head.add(jsContainer);
		}
		
		if (!"".equals(cssContent)) {
			Style cssContainer = new Style("type", "text/css");
			cssContainer.setData(cssContent);
			head.add(cssContainer);
		}
		
		Model parentModel 				= scenario.getModel();
		EList<Decorator> decoratorList 	= scenario.getScenarioDecorators();
		Sequencer sequencer 			= scenario.getSequencer();
		Solver solver 					= scenario.getSolver();
		
		// set up the title
		String scenarioURI 				= scenario.getURI().toString();
		String scenarioTitle = getShortName(scenarioURI);
		Title title = new Title(scenarioTitle);
		head.add(title);
		
		Body body = new Body();
		body.addAttribute("onload", "collapseDublinCores();");
		this.add(body);

		
		Table table = new Table("style","text-align: left; width: 100%;");
		table.addAttribute("border", "4");
		table.addAttribute("cellpadding", "2");
		table.addAttribute("cellspacing", "5");
		body.add(table);
		
		Tbody tbody = new Tbody();
		table.add(tbody);
		table.setTbody(tbody);
		
		TR tr = new TR("id",TITLE_ROW_ID_PREFIX+scenarioTitle);
		tr.addAttribute("align","left");
		tbody.add(tr);
		TD td = new TD("style","background-color: "+COLOR_TITLE0+";");
		tr.add(td);
		Span span2 = new Span("style","font-weight: bold;");
		span2.setData(COLLAPSE+STEM_SCENARIO_STRING+": "+scenarioTitle);
		td.add(span2);
			
		
		
		// Add the scenario itself. the method adds it to the parent as well.
		Table scenarioTable = getNewTable(tbody);
		populateTablefromObject(scenarioTable.getTbody(), scenario, SCENARIO_STRING, null, true);
		// Add all the Scenario's decorators
		addSectionList(scenarioTable.getTbody(), decoratorList, DECORATOR_STRING, true);
		// Iterate through the Scenario's sequencer
		populateTablefromObject(scenarioTable.getTbody(), sequencer, SEQUENCER_STRING, null, true); 
		// Iterate through the Scenario's SOLVER
		populateTablefromObject(scenarioTable.getTbody(), solver, SOLVER_STRING, null, true); 
		
		
		// DESCEND into the Scenario's parent Model
		addModelContents(tbody, parentModel, true);
			
		
		
		
		/*
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
		*/
		
		this.writeDocument("/test.html",this.getContents()); 
		//System.out.println(doc.getContents());
	}// createDocument()
	
	
	/**
	 * 
	 * @param tbody
	 * @param model
	 * @param top
	 */
	public void addModelContents(final Tbody tbody, final Model model, boolean top) {
		// DESCEND into the Scenario's parent Model
		if(model!=null) {
			indent++;
			// create the model table and add to the parent itself
			final Table modelTable = getNewTable(tbody);
			
			populateTablefromObject(modelTable.getTbody(), model, MODEL_STRING, null, true );
			final Tbody modelTableBody = modelTable.getTbody();
			
			
			
			// The models decorators
			final EList<NodeDecorator> nodeDecoratorList = model.getNodeDecorators();
			if((nodeDecoratorList!=null)&&(nodeDecoratorList.size()>=1)) {
				addSectionList(modelTableBody, nodeDecoratorList, DECORATOR_STRING, true);
			}
			
			final EList<EdgeDecorator> edgeDecoratorList = model.getEdgeDecorators();
			if((edgeDecoratorList!=null)&&(edgeDecoratorList.size()>=1)) {
				addSectionList(modelTableBody, edgeDecoratorList, DECORATOR_STRING, true);
			}
			
			final EList<GraphDecorator> graphDecoratorList = model.getGraphDecorators();
			if((graphDecoratorList!=null)&&(graphDecoratorList.size()>=1)) {
				addSectionList(modelTableBody, graphDecoratorList, DECORATOR_STRING, true);
			}
			EList<Graph> graphList = model.getGraphs();
			if((graphList!=null)&&(graphList.size()>=1)) {
				addSectionList(modelTableBody, graphList, MODEL_GRAPH_STRING, true);
			}
			
			// Recurse into the model
			final EList<Model> modelList = model.getModels();
			if((modelList!=null)&&(modelList.size()>=1)&&(modelTableBody!=null)) {
				for(int i = 0; i < modelList.size(); i++) {
					Model innerModel = modelList.get(i);
					addModelContents(tbody, innerModel, false );
				}// for all models inside
			}
			
		}// model not null
	}//addModelContents
	
	/**
	 * 
	 * @param tbody
	 * @param eList
	 * @param type
	 * @param addDublinCore
	 */
	public void addSectionList(Tbody tbody, EList<?> eList, String type, boolean addDublinCore) {
		if(eList!=null) {
			for(int i = 0; i < eList.size(); i ++) {
				Object object = eList.get(i);
				// should always be true
				if(object instanceof EObject) {
					populateTablefromObject(tbody, (EObject) object, type, null, addDublinCore); 
				}
				
			}// for all identifiable
		}
	}// addSectionList
	
	
	
	
	
	/**
	 * 
	 * @param table
	 * @param eObject
	 * @param description
	 * @param name
	 * @param addDublinCore
	 */
	private void populateTablefromObject(Tbody tbody, EObject eObject, String description, String name, boolean addDublinCore) {
		
		if(eObject != null) {
			

			// check the name
			if((eObject instanceof Identifiable)) {
				// IF the name is not forced, look it up
				if((name==null)||(name.length()==0)){
					Identifiable ident = (Identifiable) eObject;
					name = getShortName(ident.getURI().toString());
				}
			}
			
			String eClass = eObject.eClass().getName();
			
			TR trSpacer = new TR();
			
			tbody.add(trSpacer);
			indentTableRow(trSpacer);
			
			String rowId = TITLE_ROW_ID_PREFIX+name;
			
			TR tr = new TR("id",rowId);
			tr.addAttribute("class", "idHeader");
			indentTableRow(tr);
			tbody.add(tr);
			
			//the three HEADER columns
			for(int i = 0; i < 3; i ++) {
				TD td = new TD();
				//td.addAttribute("style", "width: "+CELL_WIDTH[i]+";");
				tr.add(td);
				
				//td.addAttribute("style","background-color: "+COLOR_TITLE1+";");
				if(i==0) {
					
					A anchor = new A(null,null);
					anchor.addAttribute("href", "#");
					anchor.addAttribute("onclick", "toggle(this);return false;");
					anchor.addAttribute("id", rowId+"_toggle");
					anchor.setData(COLLAPSE+description);
					td.add(anchor);
					//Span span = new Span("style","font-weight: bold;");
					//span.setData(COLLAPSE+description);
					//td.add(span);
				}
				
				if((name == null) ||(name.length()==0)){
					name = "name not set";
				}
					
				if(i==1){
//					Span span = new Span("style","font-weight: bold;");
//					span.setData(name);
//					td.add(span);
					td.setData(name);
				}
				
				if(i==2){
//					Span span = new Span("style","font-weight: bold;");
//					span.setData(eClass);
//					td.add(span);
					td.setData(eClass);
				}
				
			}
				
			
			EList<EAttribute> attrList = eObject.eClass().getEAllAttributes();
			
			if(attrList!=null){
				
				for(int i = 0; i < attrList.size(); i ++) {
					EAttribute feature = attrList.get(i);
					if(!feature.isTransient()) {
						
						String attribute = feature.getName();
						Object target = eObject.eGet(feature);
						if(target !=null) {
							String val = target.toString();
						
							if(val.length()>=1) {
								
								// label every data row with a unique ID
								String idSuffix = null;
								if(eObject instanceof Identifiable) {
									Identifiable ident = (Identifiable) eObject;
									idSuffix = ident.getURI().toString();
								}  else {
									double r = Math.random();
									r *= 1e8;
									idSuffix = "id"+((int)r);
								}
								idSuffix += "_"+attribute;
								
								TR tr2 = new TR("id",DATA_ROW_ID_PREFIX+i+"_"+idSuffix);
								
								tr2.addAttribute("class", "idBody");
								
								//tr2.addAttribute("align","left");
								indentTableRow(tr2);
								tbody.add(tr2);
								
								TD td1 = new TD("align","left");
								tr2.add(td1);
								
								
//								td1.addAttribute("style", "width: "+CELL_WIDTH[0]+";");
//								td1.addAttribute("style","background-color: "+COLOR_DATA+";");
								
								
								
								TD td2 = new TD("align","right");
								tr2.add(td2);
								td2.setData(attribute+":   ");
								
//								td2.addAttribute("style", "width: "+CELL_WIDTH[1]+";");
//								td2.addAttribute("style","background-color: "+COLOR_DATA+";");
//								Span span2 = new Span("style","font-weight: normal;");
//								span2.setData(attribute+":   ");
//								td2.add(span2);
								
								
								
								TD td3 = new TD("align","left");
								tr2.add(td3);
								td3.setData(val);
								
								//td3.addAttribute("style", "width: "+CELL_WIDTH[2]+";");
								//td3.addAttribute("style","background-color: "+COLOR_DATA+";");
//								Span span3 = new Span("style","font-weight: normal;");
//								span3.setData(val);
//								td3.add(span3);
								
								
								

								

							}// string length >0
						} // target attribute not null
					}// not transient?
					
				}// for all attributes
			}// attrList
			
			
			if(addDublinCore) {
				Identifiable ident= (Identifiable)eObject;
				
				DublinCore dc = ident.getDublinCore();
				if(ident != null) {
					addDCtoTable(dc, tbody);
				}
			}
			
			
		}// object not null
		
	} // populateTableFromObject
	

	
	/**
	 * 
	 * @param dublinCore
	 * @param tbody
	 */
	private void addDCtoTable(DublinCore dublinCore, Tbody tbody) {
	
		TR tr = new TR("align","center");
		tbody.add(tr);
		
			
		EList<EStructuralFeature> attrList = dublinCore.eClass().getEStructuralFeatures();
		if(attrList!=null){
			
			for(int i = 0; i < attrList.size(); i ++) {
				EAttribute attr = (EAttribute)attrList.get(i);
				Object obj = dublinCore.eGet(attr);
				if(obj != null) {
					String val = obj.toString();
					if(val.length()>=0) {
						
						// label every dublin core row with a unique ID
						String idSuffix = dublinCore.getIdentifier();
						if((idSuffix==null)||(idSuffix.length()==0)) {
							double r = Math.random();
							r *= 1e8;
							idSuffix = "id"+((int)r);
						}
						
						String rowId = DUBLINCORE_ROW_ID_PREFIX+i+"_"+idSuffix;
						
						TR tr2 = new TR("id",rowId);
						//tr2.addAttribute("align","left");
						tbody.add(tr2);

						// indentation
						indentTableRow(tr2);
						
						
						// col 1
						TD td1 = new TD();
						td1.addAttribute("style", "width: "+CELL_WIDTH[0]+";");
						td1.addAttribute("class", "dcHeader");
						
						//td1.addAttribute("style","background-color: "+COLOR_DUBLINCORE+";");
						if(i==0) {
							
							A anchor = new A("href", "#");
							anchor.addAttribute("onclick", "toggle(this);return false;");
							anchor.setData(EXPAND+DUBLIN_CORE_STRING);
							td1.add(anchor);
							
//							Span span1 = new Span("style","font-weight: normal;");
//							span1.setData(COLLAPSE+DUBLIN_CORE_STRING);
//							td1.add(span1);
						}
						tr2.add(td1);
						
						
						// col 2
						TD td2 = new TD("align","right");
						td2.addAttribute("style", "width: "+CELL_WIDTH[1]+";");
						//td2.addAttribute("style","background-color: "+COLOR_DUBLINCORE_DATA+";"); 	
						td2.addAttribute("class", "dcBody");
						td2.setData(attr.getName()+":   ");
						tr2.add(td2);
						
//						Span span2 = new Span("style","font-weight: normal;");
//						span2.setData(attr.getName()+":   ");
//						td2.add(span2);				
//						tr2.add(td2);
						
						
						// col 3
						TD td3 = new TD();
						td3.addAttribute("style", "width: "+CELL_WIDTH[2]+";");
						td3.addAttribute("class", "dcBody");
						//td3.addAttribute("style","background-color: "+COLOR_DUBLINCORE_DATA+";");
						td3.setData(val);
						tr2.add(td3);
						
						
//						Span span3 = new Span("style","font-weight: normal;");
//						span3.setData(val);
//						td3.add(span3);

					}
				}
				
			}
		} 
		
	}//addDCtoTable()
	
	
	/**
	 * make a new inner table
	 * @param parentTableBody
	 * @return a new table
	 */
	public Table getNewTable(Tbody parentTableBody) {
		Table newTable = new Table("style","text-align: left;");
		newTable.addAttribute("width", "100%");
		newTable.addAttribute("border", "0");
		newTable.addAttribute("frame", "box");
		newTable.addAttribute("cellpadding", "2");
		newTable.addAttribute("cellspacing", "2");
		Tbody newTbody = new Tbody();
		newTable.add(newTbody);
		newTable.setTbody(newTbody);
		
		
		TR trParent = new TR();
		parentTableBody.add(trParent);
		TD tdParent = new TD();
		trParent.add(tdParent);
		tdParent.add(newTable);
		
		
		// Spacer row
		TR trSpacer = new TR();
		newTbody.add(trSpacer);
		// indent spacer cols
		indentTableRow(trSpacer);
		// and three cols of data
		for(int i = 0; i < 3; i ++) {
			// the header line in its' own color
			TD td = new TD("style","background-color: "+COLOR_WHITE+";");
			td.addAttribute("style", "width: "+CELL_WIDTH[i]+";");
			trSpacer.add(td);
		}
		// fill any remaining space to the right
		TD td2 = new TD("style","background-color: "+COLOR_WHITE+";");
		trSpacer.add(td2);
		
		return newTable;
	}//getNewTable()
	
	
	/**
	 * 
	 * @param trSpacer
	 */
	public void indentTableRow(TR trSpacer) {
		// indent spacer cols
		for(int i = 0; i < indent; i ++) {
			// the header line in its' own color
			TD td = new TD();
			td.addAttribute("style", "width: "+INDENT_WIDTH+";");
			td.addAttribute("class", "blank");
			trSpacer.add(td);
		}
	}// indent table row
	
	/**
	 * 
	 * @param longName
	 * @return the short name
	 */
	public static String getShortName(String longName) {
		int idx = longName.lastIndexOf("/");
		String name = longName.substring(idx+1, longName.length());
		idx = name.indexOf(".");
		if(idx >=3) {
			name = name.substring(0,idx);
		}
		if((name==null)||(name.length()==0)) {
			name = "Name not set";
		}
		return name;
	}

	
	private String readJsFromFile()
	{
		return readFromFile("resources/source.js");
	}
	
	private String readCssFromFile()
	{
		return readFromFile("resources/source.css");
	}
	
	private String readFromFile(String fileName)
	{
		StringBuilder data = new StringBuilder();
		URL jsData = Activator.getDefault().getBundle().getResource(fileName);
		if (jsData != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new InputStreamReader(jsData.openStream()));
				char[] buf = new char[1024];
		        int bytesRead=0;
		        while((bytesRead=reader.read(buf)) != -1){
		        	data.append(buf, 0, bytesRead);
		        }
			} catch (IOException ioe) {
				// don't care
				ioe.printStackTrace();
			} finally {
				try {
					reader.close();
				} catch (Exception e) {
					// do nothing
				}
			}
		}
		
		return data.toString();
	}
	
	
}
