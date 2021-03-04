package org.eclipse.stem.ui.views.graphmap;

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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.stem.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class GraphMapPreferences {

	// get the path
	private static final IPath PATH = Activator.getDefault().getStateLocation();

	private static GraphMapPreferences instance;

	/**
	 * Constants for saving ReportViewPreferences
	 */
	public static final String GRAPHVIEWPREFERENCES_FILENAME = "GraphMapCanvas_Preferences.txt";

	/**
	 * root key element for the {@link DialogSettings} xml file
	 */
	private static final String ROOT_KEY = "root";
	/**
	 * scenario key lement for {@link DialogSettings} xml file
	 */
	public static final String SCENARIO_KEY = "scenario.uri";

	/**
	 * the user's preferences are stored in {@link DialogSettings}
	 */
	private DialogSettings masterSettings = null;

	/**
	 * This method uses {@link DialogSettings} to load and update the monitorSet
	 * which contains (filters) the valid list of preferred {@link Identifiable}
	 * s to display from the the state of the previously saved preference state.
	 * for {@link Simulation}s that are running
	 * 
	 * @param runningSimulations
	 */

	private GraphMapPreferences() {
		readMasterSettingsFromFile();
		PlatformUI.getWorkbench().addWorkbenchListener(
				new IWorkbenchListener() {

					@Override
					public boolean preShutdown(IWorkbench workbench,
							boolean forced) {
						GraphMapPreferences.this.saveMasterSettingsToFile();
						return true;
					}

					@Override
					public void postShutdown(IWorkbench workbench) {
						// sit quiet, don't do nothing.
					}
				});
	}

	public static synchronized GraphMapPreferences getInstance() {
		if (GraphMapPreferences.instance == null) {
			GraphMapPreferences.instance = new GraphMapPreferences();
		}
		return GraphMapPreferences.instance;
	}

	public int getNoOfPreferencesForScenario(String scenario) {
		IDialogSettings[] sections = masterSettings.getSections();
		int counter = 0;
		for (int i = 0; i < sections.length; i++) {
			if (scenario.equals(sections[i].get(SCENARIO_KEY))) {
				counter++;
			}
		}
		return counter;
	}

	public void updatePreferenceState(int viewId, ISimulation sim, String key,
			Object value) {
		IDialogSettings section = this.getPreferencesFor(viewId,
				sim.getScenario());

		while (section == null) {
			section = masterSettings
					.addNewSection(UUID.randomUUID().toString());
			section.put(SCENARIO_KEY, sim.getScenario().getURI().toString());
			section = this.getPreferencesFor(viewId, sim.getScenario());
		}
		// do something
		section.put(key, value.toString());
	}// updatePreferenceState

	public void disposePreferencesForActiveSimulations(int viewId) {

		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			StringWriter s = new StringWriter();
			masterSettings.save(s);
			Document doc = docBuilder.parse(new ByteArrayInputStream(s
					.toString().getBytes()));

			for (ISimulation sim : SimulationManager.getManager()
					.getActiveSimulations()) {
				IDialogSettings scenarioSec = this.getPreferencesFor(viewId,
						sim.getScenario());
				if (scenarioSec != null) {
					String name = scenarioSec.getName();
					// since preferences can't be deleted, one has to do it by
					// hand
					XPath xpath = XPathFactory.newInstance().newXPath();
					String expression = String.format(
							"/section/section[@name=\"%s\"]", name);
					Node secNode = (Node) xpath.evaluate(expression, doc,
							XPathConstants.NODE);
					Node p = secNode.getParentNode();
					p.removeChild(secNode);
				}
			}

			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			StreamResult result = new StreamResult(out);
			transformer.transform(source, result);
			this.masterSettings = new DialogSettings(ROOT_KEY);
			this.masterSettings.load(new StringReader(new String(out
					.toByteArray())));

		} catch (ParserConfigurationException e) {
			Activator.logError("Unable to dispose preferences", e);
		} catch (IOException e) {
			Activator.logError("Unable to dispose preferences", e);
			e.printStackTrace();
		} catch (SAXException e) {
			Activator.logError("Unable to dispose preferences", e);
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			Activator.logError("Unable to dispose preferences", e);
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			Activator.logError("Unable to dispose preferences", e);
			e.printStackTrace();
		} catch (TransformerException e) {
			Activator.logError("Unable to dispose preferences", e);
			e.printStackTrace();
		}
	}

	public IDialogSettings getPreferencesFor(int viewId, Scenario scenario) {

		IDialogSettings[] sections = masterSettings.getSections();
		int counter = 0;
		for (int i = 0; i < sections.length; i++) {
			if (scenario.getURI().toString()
					.equals(sections[i].get(SCENARIO_KEY))) {
				if (counter++ == viewId) {
					return sections[i];
				}
			}
		}
		return null;

	}

	public void saveMasterSettingsToFile() {
		try {
			masterSettings.save(this.getPrefFileName());
		} catch (IOException e) {
			Activator.logError("Unable to save preferences", e);
		}
	}

	/**
	 * get the {@link DialogSettings} from the file
	 */
	public void readMasterSettingsFromFile() {
		masterSettings = new DialogSettings(ROOT_KEY);

		final String filename = getPrefFileName();
		final File f = new File(filename);
		if (f.exists()) {
			try {
				masterSettings.load(filename);
			} catch (final IOException ioe) {
				Activator.logError(
						"exception loading file [" + ioe.getMessage() + "]",
						ioe);
			}
		} else {
			// else create it
			try {
				masterSettings.save(filename);
			} catch (final IOException ioe) {
				Activator.logError(
						"exception creating file [" + ioe.getMessage() + "]",
						ioe);
			}
		} // else if f !exists
	}// read master settings

	/**
	 * gets the preferences file name
	 * 
	 * @return file name containing the users preferences
	 */
	public String getPrefFileName() {
		// Get the right preference file
		final String filename = PATH.append(GRAPHVIEWPREFERENCES_FILENAME)
				.toOSString();
		return filename;
	}

	public class PreferencesChangedEvent {

		private int viewId;

		private IDialogSettings settings;

		public PreferencesChangedEvent(int viewId, IDialogSettings settings) {
			this.viewId = viewId;
			this.settings = settings;
		}

		public int getViewId() {
			return this.viewId;
		}

		public IDialogSettings getNewSettings() {
			return this.settings;
		}
	}
}
