package org.eclipse.stem.interventions.presentation;

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

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.graphgenerators.GraphGenerator;
import org.eclipse.stem.interventions.ControlGraphGenerator;
import org.eclipse.stem.interventions.InterventionsPackage;
import org.eclipse.stem.interventions.PeriodicControlGraphGenerator;
import org.eclipse.stem.ui.graphgenerators.adapters.graphgeneratorpropertyeditor.GraphGeneratorPropertyEditor;
import org.eclipse.stem.ui.interventions.nls.Messages;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class ControlGraphGeneratorPropertyEditor extends GraphGeneratorPropertyEditor {

	public ControlGraphGeneratorPropertyEditor(Composite parent, int style, IProject project) {
		super(parent,style, project);
	}

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public ControlGraphGeneratorPropertyEditor(final Composite parent, final int style,
			final GraphGenerator graphGenerator,
			final ModifyListener projectValidator, IProject project) {
		
		super(parent, style, graphGenerator, projectValidator, project);
		
	} // GraphGeneratorPropertyEditor

	/**
	 * @param graphGenerator
	 *            the {@link GraphGenerator} instance to populate.
	 */
	public Graph getGraph(final GraphGenerator graphGenerator) {
		for (final Map.Entry<EStructuralFeature, Text> entry : map.entrySet()) {
			if(entry.getKey().getEContainingClass().getClassifierID() == InterventionsPackage.CONTROL_GRAPH_GENERATOR) {
				switch (entry.getKey().getFeatureID()) {
					case InterventionsPackage.CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION:
						((ControlGraphGenerator)graphGenerator).setIsolationFraction(Double.parseDouble(entry.getValue().getText()));
						break;
					case InterventionsPackage.CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION:
						((ControlGraphGenerator)graphGenerator).setVaccinationFraction(Double.parseDouble(entry.getValue().getText()));
						break;
					case InterventionsPackage.CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
						((ControlGraphGenerator)graphGenerator).setPopulationIdentifier(entry.getValue().getText());
						break;
					case InterventionsPackage.CONTROL_GRAPH_GENERATOR__LOCATION:
						String txt = entry.getValue().getText();
						if(txt == null || txt.trim().equals(""))
							((ControlGraphGenerator)graphGenerator).setLocation(null);
						else 
							((ControlGraphGenerator)graphGenerator).setLocation(STEMURI.createURI(entry.getValue().getText()));
						break;
				}
			} else if(entry.getKey().getEContainingClass().getClassifierID() == InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR) {
				switch (entry.getKey().getFeatureID()) {
					case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__DATA_PATH:
					String p = entry.getValue().getText();
					((PeriodicControlGraphGenerator)graphGenerator).setDataPath(p);
					break;
				case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
					String i = entry.getValue().getText();
					((PeriodicControlGraphGenerator)graphGenerator).setPopulationIdentifier(i);
					break;
				case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__PERIOD:
					String pr = entry.getValue().getText();
					long period = Long.parseLong(pr);
					((PeriodicControlGraphGenerator)graphGenerator).setPeriod(period);
					break;
				}
			}
		}
		for (final Map.Entry<EStructuralFeature, Button> entry : booleanMap.entrySet()) {
			if(entry.getKey().getEContainingClass().getClassifierID() == InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR) {
				switch (entry.getKey().getFeatureID()) {
					case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__USE_VACCINATIONS:
						boolean b = entry.getValue().getSelection();
						((PeriodicControlGraphGenerator)graphGenerator).setUseVaccinations(b);
						break;
					case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__FRACTION:
						boolean b1 = entry.getValue().getSelection();
						((PeriodicControlGraphGenerator)graphGenerator).setFraction(b1);
						break;
				}
			}
		}
	 
		if(graphGenerator.eClass().getClassifierID() == InterventionsPackage.CONTROL_GRAPH_GENERATOR) 
		((ControlGraphGenerator)graphGenerator).setProject(project);
		
		return graphGenerator.getGraph();
	} // populate

	/**
	 * @return <code>true</code> if the contents are valid, <code>false</code>
	 *         otherwise.
	 */
	@Override
	public boolean validate() {
		boolean retValue = true;
		if (retValue) {
			// Yes
			final Text text = map
					.get(InterventionsPackage.Literals.CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION);
			if (text != null) {
				// Yes
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages
							.getString("CGGWizErr1"); //$NON-NLS-1$
				} // if
				else {
					// No
					// Is it a valid value?
					retValue = isValidDoubleValue(text.getText(), 0.0, 1.0);
					if (!retValue) {
						// No
						errorMessage = Messages
								.getString("CGGWizErr2"); //$NON-NLS-1$
					} // if
				}
			} // if text != null
		} 

		if (retValue) {
			// Yes
			final Text text = map
					.get(InterventionsPackage.Literals.CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION);
			if (text != null) {
				// Yes
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages
							.getString("CGGWizErr3"); //$NON-NLS-1$
				} // if
				else {
					// No
					// Is it a valid value?
					retValue = isValidDoubleValue(text.getText(), 0.0, 1.0);
					if (!retValue) {
						// No
						errorMessage = Messages
								.getString("CGGWizErr4"); //$NON-NLS-1$
					} // if
				}
			} // if text != null
		} 

		if (retValue) {
			// Yes
			final Text text = map
					.get(InterventionsPackage.Literals.CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER);
			if (text != null) {
				// Yes
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages
							.getString("CGGWizErr5"); //$NON-NLS-1$
				} // if
			} // if text != null
		} 

		return retValue;
	} // validate


	/**
	 * @param feature
	 * @return <code>true</code> if the feature is a dublin core feature that
	 *         is specified by a user.
	 */
	@Override
	protected boolean isUserSpecifiedProperty(final EStructuralFeature feature) {
		boolean retValue = false;
		final EClass containingClass = feature.getEContainingClass();
		if (containingClass.equals(InterventionsPackage.eINSTANCE.getControlGraphGenerator())
				|| containingClass.equals(InterventionsPackage.eINSTANCE.getPeriodicControlGraphGenerator())
				|| containingClass.getEAllSuperTypes().contains(
						InterventionsPackage.eINSTANCE.getControlGraphGenerator())) {
			// Yes
			retValue = true;
		} // 
		return retValue;
	} // isUserSpecifiedGraphGeneratorProperty
	
	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

} // ControlGraphGeneratorPropertyEditor
