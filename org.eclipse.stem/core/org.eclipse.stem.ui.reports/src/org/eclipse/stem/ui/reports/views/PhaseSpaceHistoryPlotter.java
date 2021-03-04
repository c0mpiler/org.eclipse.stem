// RelativeValueHistoryPlotter.java
package org.eclipse.stem.ui.reports.views;

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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.definitions.adapters.relativevalue.history.RelativeValueHistoryExtendedListener;
import org.eclipse.stem.definitions.adapters.relativevalue.history.RelativeValueHistoryProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.history.RelativeValueHistoryProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.history.RelativeValueHistoryProviderAdapterFactory;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationListener;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.jobs.simulation.SimulationState;
import org.eclipse.stem.ui.preferences.PreferenceConstants;
import org.eclipse.stem.ui.reports.Activator;
import org.eclipse.stem.ui.widgets.PropertySelector;
import org.eclipse.stem.ui.widgets.PropertySelector.PropertySelectionEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/**
 * This class represents
 */
public class PhaseSpaceHistoryPlotter extends ReportControl implements
		RelativeValueHistoryExtendedListener, ISimulationListener {

	PhaseSpaceCanvas phaseSpaceCanvas;
	PropertySelector propertySelectorX;
	PropertySelector propertySelectorY;

	ItemPropertyDescriptor selectedProperty1;
	ItemPropertyDescriptor selectedProperty2;

	private static final String X_AXIS_LABEL = "X Axis";

	private static final String Y_AXIS_LABEL = "Y Axis";
	
	boolean plotUpdateScheduled = false;

	/**
	 * @param parent
	 */
	public PhaseSpaceHistoryPlotter(final Composite parent) {
		super(parent, SWT.None);
		createContents();
	} // RelativeValueHistoryPlotter

	/**
	 * Create the contents of the plotter
	 */
	private void createContents() {
		setLayout(new FormLayout());

		identifiableTitle = new Label(this, SWT.NONE);
		phaseSpaceCanvas = new PhaseSpaceCanvas(this);
		propertySelectorX = new PropertySelector(this, SWT.NONE, true);
		propertySelectorX.setDisplayLabel(X_AXIS_LABEL);
		propertySelectorY = new PropertySelector(this, SWT.NONE, true);
		propertySelectorY.setDisplayLabel(Y_AXIS_LABEL);

		removeButton = new Button(this, SWT.NONE);
		removeButton.setText(REMOVE_TEXT);

		final FormData titleFormData = new FormData();
		identifiableTitle.setLayoutData(titleFormData);
		titleFormData.top = new FormAttachment(0, 0);
		titleFormData.left = new FormAttachment(0, 0);
		titleFormData.right = new FormAttachment(100, 0);

		final FormData chartFormData = new FormData();
		phaseSpaceCanvas.setLayoutData(chartFormData);
		chartFormData.top = new FormAttachment(identifiableTitle, 0);
		chartFormData.bottom = new FormAttachment(propertySelectorY, 0);
		chartFormData.left = new FormAttachment(0, 0);
		chartFormData.right = new FormAttachment(100, 0);

		// Property Selector
		final FormData propertySelectorFormDataY = new FormData();
		// propertySelectorFormData.top = new FormAttachment(timeSeriesCanvas,
		// 0);
		propertySelectorFormDataY.bottom = new FormAttachment(100, 0);
		propertySelectorFormDataY.left = new FormAttachment(0, 0);
		propertySelectorFormDataY.right = new FormAttachment(30, 0);
		propertySelectorY.setLayoutData(propertySelectorFormDataY);

		// Property Selector
		final FormData propertySelectorFormDataX = new FormData();
		// propertySelectorFormDataX.top = new FormAttachment(propertySelectorY,
		// 0);
		propertySelectorFormDataX.bottom = new FormAttachment(100, 0);
		propertySelectorFormDataX.left = new FormAttachment(propertySelectorY,
				0);
		propertySelectorFormDataX.right = new FormAttachment(60, 0);
		propertySelectorX.setLayoutData(propertySelectorFormDataX);

		// RemoveButton
		final FormData removeButtonFormData = new FormData();
		// propertySelectorFormDataX.top = new FormAttachment(propertySelectorY,
		// 0);
		removeButtonFormData.bottom = new FormAttachment(100, 0);
		removeButtonFormData.left = new FormAttachment(propertySelectorX, 0);
		removeButtonFormData.right = new FormAttachment(90, 0);
		removeButton.setLayoutData(removeButtonFormData);

		final PhaseSpaceHistoryPlotter self = this;
		
		// X listener
		propertySelectorX
				.addPropertySelectionListener(new PropertySelector.PropertySelectionListener() {

					/**
					 * @see org.eclipse.stem.ui.widgets.PropertySelector.PropertySelectionListener#propertySelected(org.eclipse.stem.ui.widgets.PropertySelector.PropertySelectionEvent)
					 */
					public void propertySelected(
							final PropertySelectionEvent propertySelectionEvent) {
						selectedDecorator = propertySelectionEvent
								.getDecorator();

						// get the X property from the event
						selectedProperty2 = propertySelectionEvent
								.getProperty();

						String selectedId = propertySelectionEvent.getId();
						
						List<DynamicLabel>allLabels = decoratorToLabelsMap.get(selectedDecorator);
						for(DynamicLabel lab:allLabels) {
							if(lab instanceof DiseaseModelLabel &&
									((DiseaseModelLabel)lab).getPopulationModelLabel().getPopulationIdentifier().equals(selectedId))
							{selectedDynamicLabel = lab;break;}
						}
				
						if(selectedDynamicLabel != null) {
							RelativeValueHistoryProviderAdapter rhvp = (RelativeValueHistoryProviderAdapter) RelativeValueHistoryProviderAdapterFactory.INSTANCE
							.adapt(selectedDynamicLabel,RelativeValueHistoryProvider.class);
							switchToRVHP(rhvp);
							self.phaseSpaceCanvas.setDataSourceAndRedraw(rhvp, selectedProperty2, selectedProperty1);
						}
					}
				});

		// Y listener
		propertySelectorY
				.addPropertySelectionListener(new PropertySelector.PropertySelectionListener() {

					/**
					 * @see org.eclipse.stem.ui.widgets.PropertySelector.PropertySelectionListener#propertySelected(org.eclipse.stem.ui.widgets.PropertySelector.PropertySelectionEvent)
					 */
					public void propertySelected(
							final PropertySelectionEvent propertySelectionEvent) {
						selectedDecorator = propertySelectionEvent
								.getDecorator();

						// get the Y property from the event
						selectedProperty1 = propertySelectionEvent
								.getProperty();

						String selectedId = propertySelectionEvent.getId();
						
						
						List<DynamicLabel>allLabels = decoratorToLabelsMap.get(selectedDecorator);
						for(DynamicLabel lab:allLabels) {
							if(lab instanceof DiseaseModelLabel &&
									((DiseaseModelLabel)lab).getPopulationModelLabel().getPopulationIdentifier().equals(selectedId))
							{selectedDynamicLabel = lab;break;}
						}
				
						if(selectedDynamicLabel != null) {
							RelativeValueHistoryProviderAdapter rhvp = (RelativeValueHistoryProviderAdapter) RelativeValueHistoryProviderAdapterFactory.INSTANCE
							.adapt(selectedDynamicLabel,
									RelativeValueHistoryProvider.class);
							switchToRVHP(rhvp);
							self.phaseSpaceCanvas.setDataSourceAndRedraw(rhvp, selectedProperty2, selectedProperty1);
						}
					}
				});

		removeButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(
					@SuppressWarnings("unused") final SelectionEvent e) {

				fireRemoveEvent(identifiable);
				remove();
			}
		});

	} // createContents

	/**
	 * to remove the control e.g. by a remove button event
	 */
	@Override
	@SuppressWarnings("cast")
	public void remove() {
		removeListeners.clear();
		switchToRVHP(null);
		relativeValueHistoryExtended(null);
		identifiableTitle.setText("");
		propertySelectorX
				.setDecorators((List<Decorator>) Collections.EMPTY_LIST);
		propertySelectorY
				.setDecorators((List<Decorator>) Collections.EMPTY_LIST);
		dispose();
	}

	/**
	 * @param identifiable
	 *            the {@link Identifiable} to be the source of the data to be
	 *            plotted.
	 */
	@Override
	public void setIdentifiable(final Identifiable identifiable) {

		// Same Identifiable?
		if (this.identifiable == identifiable) {
			// Yes
			return;
		} // if

		this.identifiable = identifiable;

		final List<Decorator> decorators = new ArrayList<Decorator>();
		decoratorToLabelsMap = new HashMap<Decorator, List<DynamicLabel>>();

		identifiableTitle.setText(identifiable.getDublinCore().getTitle());
		// Get the dynamic labels associated with this Identifiable
		// A node?
		if (identifiable instanceof Node) {
			// Yes
			final Node node = (Node) identifiable;
			for (final NodeLabel nodeLabel : node.getLabels()) {
				// Updated by a decorator?
				if (nodeLabel instanceof DynamicNodeLabel) {
					// Yes
					final DynamicNodeLabel dynamicNodeLabel = (DynamicNodeLabel) nodeLabel;
					// Can it provide relative values?
					final RelativeValueHistoryProviderAdapter rvhp = (RelativeValueHistoryProviderAdapter) RelativeValueHistoryProviderAdapterFactory.INSTANCE
							.adapt(nodeLabel,
									RelativeValueHistoryProvider.class);
					if (rvhp != null) {
						// Yes
						final Decorator decorator = dynamicNodeLabel
								.getDecorator();
						if (decorator != null) {
							if(decoratorToLabelsMap.get(decorator)!=null) {
								List<DynamicLabel>list = decoratorToLabelsMap.get(decorator);
								list.add(dynamicNodeLabel);
							} else {
								ArrayList<DynamicLabel>newList = new ArrayList<DynamicLabel>();
								newList.add(dynamicNodeLabel);
								decoratorToLabelsMap.put(decorator, newList);
							}
							if (!decorators.contains(decorator)) {
								decorators.add(decorator);
							}
						} else {
							Activator.logError("DynamicLabel \""
									+ dynamicNodeLabel.getDublinCore()
											.getTitle()
									+ "\" does not have a Decorator", null);
						}

					} // if RelativeValueHistoryProviderAdapter
				} // if DynamicNodeLabel
			} // for each NodeLabel
		} // if Node

		// IF POSSIBLE set the zeroth entry to be a disease model
		if((decorators!=null)&&(decorators.size() > 1)) {
			Decorator dec0 = decorators.get(0);
			if(!(dec0 instanceof DiseaseModel)){
				for(int i = 1; i < decorators.size(); i ++) {
					Decorator dec = decorators.get(i);
					if(dec instanceof DiseaseModel){
						decorators.set(0,dec);
						decorators.set(i,dec0);
						break;
					}
				}
			}
			
		}
		
		
		// new node... update the decorators
		propertySelectorX.setDecorators(decorators);
		propertySelectorY.setDecorators(decorators);

		try {
			// try to set the displayed decorator by the users ui label
			// preferences
			final IPreferenceStore preferenceStore = org.eclipse.stem.ui.Activator
					.getDefault().getPreferenceStore();
			final String yPreference = preferenceStore
					.getString(PreferenceConstants.INITIAL_ATTRIBUTE_NAME_STRING_PREFERENCE);
			final String xPreference = preferenceStore
					.getString(PreferenceConstants.INITIAL_ATTRIBUTE_NAME_STRING_PREFERENCE2);

			// we do not care about the return value, it's ok if the preference
			// is not there.
			propertySelectorY.setDisplayedProperty(yPreference);
			propertySelectorX.setDisplayedProperty(xPreference);

		} catch (final Exception e) {
			// if it fails do nothing
		}

	} // setIdentifiable

	/**
	 * @see org.eclipse.stem.definitions.adapters.relativevalue.history.RelativeValueHistoryExtendedListener#relativeValueHistoryExtended(org.eclipse.stem.definitions.adapters.relativevalue.history.RelativeValueHistoryProviderAdapter)
	 */
	public void relativeValueHistoryExtended(
			final RelativeValueHistoryProviderAdapter rvhp) {
		// The event notification doesn't come from the UI thread so we need to
		// add a Runnable to the UI thread's execution queue to give the new
		// source to the chart
		
		// If a plot update is already scheduled, then don't add another to the queue
		if (plotUpdateScheduled) {
			return;
		}

		
		final Display display = Display.getDefault();
		if (!display.isDisposed()) {
			// Yes
			try {
				plotUpdateScheduled = true;
				display.asyncExec(new Runnable() {
					public void run() {
						try {
						phaseSpaceCanvas.setDataSourceAndRedraw(rvhp,
								selectedProperty2, selectedProperty1);
						
						} finally {
							plotUpdateScheduled = false;
						}
					} // run
				}); // display.asyncExec
			} // try
			catch (final Exception e) {
				// Ignore there could be a race condition with the display being
				// disposed when the system is shut down with a running
				// simulation.
			} // catch Exception
		} // if
	}// relativeValueHistoryExtended

	/**
	 * @see org.eclipse.stem.jobs.simulation.ISimulationListener#simulationChanged(org.eclipse.stem.jobs.simulation.SimulationEvent)
	 */
	@SuppressWarnings("cast")
	public void simulationChanged(final SimulationEvent event) {
		// reset event
		if (event.getSimulationState() == SimulationState.RESET) {
			// Yes
			phaseSpaceCanvas.resetData();
		} // if
		// Is the Simulation stopping (i.e. being deleted?)
		if (event.getSimulationState() == SimulationState.STOPPED) {
			// Yes
			simulation.removeSimulationListener(this);
			simulation = null;
			switchToRVHP(null);
			relativeValueHistoryExtended(null);
			identifiableTitle.setText("");
			propertySelectorX
					.setDecorators((List<Decorator>) Collections.EMPTY_LIST);
			propertySelectorY
					.setDecorators((List<Decorator>) Collections.EMPTY_LIST);

		} // if
	} // simulationChanged

	/**
	 * Initialize the control from a
	 * {@link org.eclipse.stem.jobs.simulation.Simulation} instance.
	 * 
	 * @param simulation
	 *            the {@link org.eclipse.stem.jobs.simulation.Simulation}
	 *            whose state will be visualized in the control.
	 */
	@Override
	protected void initializeFromSimulation(final ISimulation simulation) {
		simulationNameLabel.setText(simulation.getName());
		propertySelectorX.setSimulation(simulation);
		propertySelectorY.setSimulation(simulation);
	} // initializeFromSimulation

	/**
	 * 
	 */
	@Override
	public void refresh2() {
		// nothing
	} // refresh2

	/**
	 * @see org.eclipse.swt.widgets.Widget#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		if (this.rvhp != null) {
			// Yes
			rvhp.removeExtensionListener(this);
		} // if
	} // dispose

	/**
	 * @see org.eclipse.stem.ui.reports.views.ReportControl#getIdentifiable()
	 */
	@Override
	public Identifiable getIdentifiable() {
		return identifiable;
	}

	/**
	 * This Control is associated with an Identifiable
	 * @see org.eclipse.stem.ui.reports.views.ReportControl#getControlType()
	 */
	public String getControlType() {
		return ReportControlFactory.IDENTIFABLE_TYPE;
	}
	
} // RelativeValueHistoryPlotter
