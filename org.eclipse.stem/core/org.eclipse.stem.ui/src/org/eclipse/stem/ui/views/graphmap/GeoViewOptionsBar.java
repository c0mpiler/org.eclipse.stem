// GeoViewOptionsBar.java
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.trigger.TriggerList;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.SimulationManager;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.ui.adapters.color.ColorProvider;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapterFactory;
import org.eclipse.stem.ui.adapters.color.IColorProviderAdapterFactory;
import org.eclipse.stem.ui.preferences.PreferenceConstants;
import org.eclipse.stem.ui.widgets.ColorProviderPropertiesComposite;
import org.eclipse.stem.ui.widgets.ColorProviderPropertiesComposite.PropertySelectionEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * This class is a compound SWT {@link org.eclipse.swt.widgets.Widget} that
 * allows for the selection of a {@link Decorator}s and
 * {@link org.eclipse.stem.ui.adapters.color.ColorProvider}s.
 */
public class GeoViewOptionsBar extends Composite implements SelectionListener {

	/**
	 * A list of {@link PropertySelectionListener}s to be notified about
	 * property selection events
	 */
	private List<PropertySelectionListener> selectionListeners = new CopyOnWriteArrayList<PropertySelectionListener>();
	/**
	 * Combo for selecting decorators
	 */
	private Combo decoratorsCombo;
	/**
	 * Combo for selecting decorators
	 */
	private Combo populationsCombo;

	/**
	 * Combo for selecting the color provider
	 */
	private Combo colorProvidersCombo;

	/**
	 * Combo for selecting edges
	 */
	private Combo edgesCombo;
	/**
	 * The composite that the selected color provider contributed
	 */
	private Composite colorProviderComposite;
	/**
	 * The composite with the colors legend (provided by the selected color
	 * provider)
	 */
	private Composite colorsLegendComposite;
	/**
	 * The group composite that gathers the widgets
	 */
	private Group geoViewOptionsGroup;
	/**
	 * The group composite that gathers the widgets
	 */
	private Group edgesGroup;
	/**
	 * List of available decorators
	 */
	private List<Decorator> decorators;
	/**
	 * List of available populations for the selected decorator
	 */
	private List<String> populationIdentifiers;

	/**
	 * List of available color providers
	 */
	private List<Class<? extends ColorProvider>> supportedColorProviders = null;
	/**
	 * List of available color providers names
	 */
	private List<String> supportedColorProvidersNames = null;
	/**
	 * Mapping between edge type and its URI prefix
	 */
	private Map<String, String> edgeTypeToUriPrefixMap = new HashMap<String, String>();
	/**
	 * The selected color provider
	 */
	private Class<? extends ColorProvider> selectedColorProvider = null;
	/**
	 * The selected decorator
	 */
	private Decorator selectedDecorator;
	/**
	 * The selected population identifier
	 */
	private String selectedPopulationIdentifier;
	/**
	 * The selected property
	 */
	private ItemPropertyDescriptor selectedProperty;

	private String edgePrefix;

	private GraphMapView view;

	private ISimulation sim;

	/**
	 * Constructor
	 * 
	 * @param parent
	 *            the parent {@link Composite}
	 * @param style
	 *            an SWT style
	 */
	public GeoViewOptionsBar(Composite parent, int style, GraphMapView view) {
		super(parent, style);

		this.view = view;
		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.fill = true;
		this.setLayout(rowLayout);

		geoViewOptionsGroup = new Group(this, SWT.NONE);
		geoViewOptionsGroup.setLayout(new GridLayout());

		// //$NON-NLS-1$ //$NON-NLS-2$
		geoViewOptionsGroup.setText(Messages.getString("IMView.MProp"));
		geoViewOptionsGroup.setVisible(false);

		// Combo Box of Decorators
		decoratorsCombo = new Combo(geoViewOptionsGroup, SWT.DROP_DOWN
				| SWT.READ_ONLY | SWT.CENTER);
		decoratorsCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		// Combo Box of population identifiers
		populationsCombo = new Combo(geoViewOptionsGroup, SWT.DROP_DOWN
				| SWT.READ_ONLY | SWT.CENTER);
		populationsCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		// Combo Box of the color providers
		colorProvidersCombo = new Combo(geoViewOptionsGroup, SWT.DROP_DOWN
				| SWT.READ_ONLY | SWT.CENTER);
		colorProvidersCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));

		supportedColorProviders = ColorProviderAdapterFactory.INSTANCE
				.getSupportedColorProviders();
		supportedColorProvidersNames = ColorProviderAdapterFactory.INSTANCE
				.getSupportedColorProvidersNames();

		decoratorsCombo.addSelectionListener(this);
		populationsCombo.addSelectionListener(this);
		colorProvidersCombo.addSelectionListener(this);

		edgesGroup = new Group(this, SWT.NONE);
		edgesCombo = new Combo(edgesGroup, SWT.DROP_DOWN | SWT.READ_ONLY
				| SWT.CENTER);
		edgesCombo.add("");
		edgesCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		edgesGroup.setLayout(new GridLayout());
		edgesGroup.setVisible(false);
		edgesGroup.setText(Messages.getString("IMView.Edges"));
		edgesCombo.addSelectionListener(this);

		pack();
		setSimulation(null);
	} // PropertySelector

	/**
	 * @return <code>true</code> if the control has been initialized.
	 */
	public boolean isInitialized() {
		return !(decorators == null || decorators.isEmpty());
	} // isInitialized

	/**
	 * Initialize the control from a
	 * {@link org.eclipse.stem.jobs.simulation.Simulation} instance.
	 * 
	 * @param simulation
	 *            the {@link org.eclipse.stem.jobs.simulation.Simulation}
	 */
	public void setSimulation(ISimulation simulation) {
		this.sim = simulation;
		if (simulation == null)
			return;

		GraphMapPreferences prefs = GraphMapPreferences.getInstance();
		int viewId = GraphMapRegistry.getInstance().getViewId(this.view);
		IDialogSettings settings = prefs.getPreferencesFor(viewId,
				simulation.getScenario());

		setDecorators(getDecoratorsToDisplay(simulation), settings);
		if (decorators == null) {
			return;
		}
		setColorProviders(settings);
		geoViewOptionsGroup.setVisible(true);
		setEdges();

		if (settings != null
				&& settings.get(PreferenceConstants.GEOVIEW_EDGE_OPTION) != null) {
			this.edgePrefix = settings
					.get(PreferenceConstants.GEOVIEW_EDGE_OPTION);
			if (this.edgePrefix.isEmpty()) {
				this.edgePrefix = null;
			}
			int edgSelect = 0;
			String[] edgeTypes = edgesCombo.getItems();
			for (int i = 0; i < edgeTypes.length; i++) {
				if ((this.edgePrefix == null && edgeTypes[i].isEmpty())
						|| this.edgePrefix.equals(edgeTypeToUriPrefixMap
								.get(edgeTypes[i]))) {
					edgSelect = i;
					break;
				}
			}
			edgesCombo.select(edgSelect);

		}
		edgesGroup.setVisible(true);
		getInformation(simulation);

	} // setSimulation

	/**
	 * @param listener
	 */
	public void addPropertySelectionListener(PropertySelectionListener listener) {
		selectionListeners.add(listener);
	}

	/**
	 * @param listener
	 */
	public void removePropertySelectionListener(
			PropertySelectionListener listener) {
		selectionListeners.remove(listener);
	}

	public Class<? extends ColorProvider> getSelectedColorProvider() {
		return selectedColorProvider;
	}

	/**
	 * @return the selectedDecorator
	 */
	public Decorator getSelectedDecorator() {
		return selectedDecorator;
	}

	/**
	 * @return the selected population identifier
	 */
	public String getSelectedPopulationIdentifier() {
		return selectedPopulationIdentifier;
	}

	public ItemPropertyDescriptor getSelectedProperty() {
		return selectedProperty;
	}

	public String getSelectedEdge() {
		return edgePrefix;
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		GraphMapPreferences prefs = GraphMapPreferences.getInstance();
		int viewId = GraphMapRegistry.getInstance().getViewId(this.view);
// 		selectedProperty = null;
		if (e.getSource() == decoratorsCombo) {
			if (!decorators.isEmpty()) {
				// Yes
				Decorator tempDecorator = decorators.get(decoratorsCombo
						.getSelectionIndex());
				// Was there a change in selected Decorators?
				if (selectedDecorator != tempDecorator) {
					// Yes
					selectedDecorator = tempDecorator;
					List<String> popIds = getPopulationIdentifiers(selectedDecorator);
					populationIdentifiers = popIds;
					if (populationIdentifiers != null)
						selectedPopulationIdentifier = populationIdentifiers
								.get(0);

					initializeCombo(
							populationsCombo,
							getPopulationIdNames(popIds),
							getPopulationIdIndex(selectedPopulationIdentifier,
									populationIdentifiers));

					IDialogSettings settings = null;
					if (this.sim != null
							&& SimulationManager.getManager()
									.getActiveSimulations().contains(sim)) {
						prefs.updatePreferenceState(viewId, this.sim,
								PreferenceConstants.GEOVIEW_DECORATOR_OPTION,
								tempDecorator.getURI());
						prefs.updatePreferenceState(viewId, this.sim,
								PreferenceConstants.GEOVIEW_POPULATION_OPTION,
								selectedPopulationIdentifier);
						settings = prefs.getPreferencesFor(viewId,
								this.sim.getScenario());
					}
					updateColorProviderComposites(settings);
					firePropertySelectionEvent();
				} // if Decorators changed

			} // if any decorators
		} else if (e.getSource() == populationsCombo) {
			if (!populationIdentifiers.isEmpty()) {
				// Yes
				String tempPopId = populationIdentifiers.get(populationsCombo
						.getSelectionIndex());
				// Was there a change in selected Decorators?
				if (!selectedPopulationIdentifier.equals(tempPopId)) {
					// Yes
					selectedPopulationIdentifier = tempPopId;

					IDialogSettings settings = null;
					if (this.sim != null
							&& SimulationManager.getManager()
									.getActiveSimulations().contains(sim)) {
						prefs.updatePreferenceState(viewId, this.sim,
								PreferenceConstants.GEOVIEW_POPULATION_OPTION,
								selectedPopulationIdentifier);

						settings = prefs.getPreferencesFor(viewId,
								this.sim.getScenario());
					}
					updateColorProviderComposites(settings);
					firePropertySelectionEvent();
				} // if Decorators changed

			} // if any decorators
		} else if (e.getSource() == colorProvidersCombo) {
			selectedColorProvider = supportedColorProviders
					.get(colorProvidersCombo.getSelectionIndex());

			IDialogSettings settings = null;
			if (this.sim != null
					&& SimulationManager.getManager().getActiveSimulations()
							.contains(sim)) {
				prefs.updatePreferenceState(viewId, this.sim,
						PreferenceConstants.GEOVIEW_COLORPROVIDER_OPTION,
						selectedColorProvider.getSimpleName());
			}
			updateColorProviderComposites(settings);
			firePropertySelectionEvent();
		} else if (e.getSource() == edgesCombo) {
			String selectedEdges = edgesCombo.getText();
			if (selectedEdges == null || selectedEdges.equals("")) {
				edgePrefix = null;
				prefs.updatePreferenceState(viewId, this.sim,
						PreferenceConstants.GEOVIEW_EDGE_OPTION, "");
				firePropertySelectionEvent();
			} else {
				edgePrefix = edgeTypeToUriPrefixMap.get(selectedEdges);
				prefs.updatePreferenceState(viewId, this.sim,
						PreferenceConstants.GEOVIEW_EDGE_OPTION, edgePrefix);
				if (this.sim != null) {
					updateColorProviderComposites(prefs.getPreferencesFor(
							viewId, this.sim.getScenario()));
				}
				firePropertySelectionEvent();
			}
		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	/**
	 * Sets the {@link Decorator}s
	 * 
	 * @param decorators
	 *            {@link Decorator}s to set
	 */
	private void setDecorators(List<Decorator> decorators,
			IDialogSettings settings) {
		this.decorators = decorators;
		selectedDecorator = decorators.isEmpty() ? null : decorators.get(0);
		// If we have BOTH a population decorator and a disease decorator
		// try to initially select the disease by default

		if (decorators.size() >= 2
				&& !(selectedDecorator instanceof DiseaseModel)) {
			for (int i = 0; i < decorators.size(); i++) {
				if (decorators.get(i) instanceof DiseaseModel) {
					selectedDecorator = decorators.get(i);
					break;
				}
			}
		}

		if (settings != null
				&& settings.get(PreferenceConstants.GEOVIEW_DECORATOR_OPTION) != null) {
			String dec = settings
					.get(PreferenceConstants.GEOVIEW_DECORATOR_OPTION);

			for (int i = 0; i < decorators.size(); i++) {
				if (dec.equals(decorators.get(i).getURI().toString())) {
					selectedDecorator = decorators.get(i);
					break;
				}
			}
		}

		List<String> popIds = getPopulationIdentifiers(selectedDecorator);
		populationIdentifiers = popIds;
		if (populationIdentifiers != null)
			selectedPopulationIdentifier = populationIdentifiers.get(0);

		if (settings != null
				&& settings.get(PreferenceConstants.GEOVIEW_POPULATION_OPTION) != null) {
			selectedPopulationIdentifier = settings
					.get(PreferenceConstants.GEOVIEW_POPULATION_OPTION);
		}

		initializeCombo(decoratorsCombo, getDecoratorNames(decorators),
				getDecoratorIndex(selectedDecorator, decorators));

		initializeCombo(
				populationsCombo,
				getPopulationIdNames(popIds),
				getPopulationIdIndex(selectedPopulationIdentifier,
						populationIdentifiers));

	} // setDecorators

	/**
	 * @param decorators
	 */
	private void setColorProviders(IDialogSettings settings) {

		if (supportedColorProviders.isEmpty()) {
			// No color providers available
			return;
		}
		int selProvider = 0;
		for (int i = 0; i < supportedColorProvidersNames.size(); i++) {
			String providerName = supportedColorProvidersNames.get(i);
			Class<? extends ColorProvider> provider = supportedColorProviders.get(i);
			if (settings != null
					&& provider
							.getSimpleName()
							.equals(settings
									.get(PreferenceConstants.GEOVIEW_COLORPROVIDER_OPTION))) {
				selProvider = i;
			}
			colorProvidersCombo.add(providerName);
		}
		colorProvidersCombo.select(selProvider);
		selectedColorProvider = supportedColorProviders.get(selProvider);

		updateColorProviderComposites(settings);
	}

	private List<String> getPopulationIdentifiers(Decorator decorator) {
		if (decorator instanceof DiseaseModel) {
			return ((DiseaseModel) decorator).getAllLabelIdentifiers();
		} else if (decorator instanceof PopulationModel) {
			return ((PopulationModel) decorator).getAllLabelIdentifiers();
		}
		return null;
	}

	private void setEdges() {
		if (selectedDecorator == null)
			return;

		Set<URI> edgesURIs = selectedDecorator.getGraph().getEdges().keySet();
		Iterator<URI> iter = edgesURIs.iterator();
		while (iter.hasNext()) {
			URI nextUri = iter.next();
			String edgePrefix = nextUri.trimSegments(1).toString();
			String edgeType = org.eclipse.stem.ui.preferences.Messages
					.getString(edgePrefix);
			if (edgeType.startsWith("!") && edgeType.endsWith("!")) {
				edgePrefix = nextUri.trimSegments(2).toString();
				edgeType = org.eclipse.stem.ui.preferences.Messages
						.getString(edgePrefix);
			}

			if (!edgeTypeToUriPrefixMap.containsKey(edgeType)) {
				edgeTypeToUriPrefixMap.put(edgeType, edgePrefix);
				edgesCombo.add(edgeType);

				if (edgePrefix.equals("stem://org.eclipse.stem/edge/migration")) {
					String triggeredType = edgeType + " ("
							+ Messages.getString("IMView.Triggered") + ")";
					String triggeredHistoryType = edgeType + " ("
							+ Messages.getString("IMView.History") + ")";

					edgeTypeToUriPrefixMap.put(triggeredType, "triggered"
							+ edgePrefix);
					edgesCombo.add(triggeredType);
					edgeTypeToUriPrefixMap.put(triggeredHistoryType, "history"
							+ edgePrefix);
					edgesCombo.add(triggeredHistoryType);
				}
			}
		}
	}

	/**
	 * 
	 */
	private void updateColorProviderComposites(IDialogSettings settings) {
		if (colorProviderComposite != null) {
			colorProviderComposite.dispose();
		}
		if (colorsLegendComposite != null) {
			colorsLegendComposite.dispose();
		}
		AdapterFactory adapterFactory = ColorProviderAdapterFactory.INSTANCE
				.getFactoryForType(selectedColorProvider);
		if (adapterFactory instanceof IColorProviderAdapterFactory) {
			IColorProviderAdapterFactory selectedColorProviderAdapterFactory = (IColorProviderAdapterFactory) adapterFactory;

			colorProviderComposite = selectedColorProviderAdapterFactory
					.createPropertiesComposite(geoViewOptionsGroup, SWT.NONE,
							selectedDecorator, selectedPopulationIdentifier);
			// if there is no composite contribution from the selected color
			// provider then return
			if (colorProviderComposite == null) {
				return;
			}
			if (colorProviderComposite instanceof ColorProviderPropertiesComposite) {
				final ColorProviderPropertiesComposite pComp = (ColorProviderPropertiesComposite) this.colorProviderComposite;
				
				pComp.addPropertySelectionListener(new ColorProviderPropertiesComposite.PropertySelectionListener() {
					@Override
					public void propertySelected(PropertySelectionEvent propertySelectionEvent) {
						GeoViewOptionsBar.this.selectedProperty = propertySelectionEvent.getProperty();
						GeoViewOptionsBar.this.firePropertySelectionEvent();
					}
				});
				
				if (settings != null
						&& settings
								.get(PreferenceConstants.GEOVIEW_COLORPROVIDER_PROPERTY_OPTION) != null) {
					pComp.setInitialPropertyName(settings
							.get(PreferenceConstants.GEOVIEW_COLORPROVIDER_PROPERTY_OPTION));
					pComp.initialize(selectedDecorator,
							selectedPopulationIdentifier);

				} else {
					if (pComp.getSelectedProperty() != null) {
						GraphMapPreferences prefs = GraphMapPreferences
								.getInstance();
						int viewId = GraphMapRegistry.getInstance().getViewId(
								GeoViewOptionsBar.this.view);
						prefs.updatePreferenceState(
								viewId,
								GeoViewOptionsBar.this.sim,
								PreferenceConstants.GEOVIEW_COLORPROVIDER_PROPERTY_OPTION,
								pComp.getSelectedProperty().getDisplayName(null));
					}
				}
				pComp.addPropertySelectionListener(new ColorProviderPropertiesComposite.PropertySelectionListener() {
					public void propertySelected(
							ColorProviderPropertiesComposite.PropertySelectionEvent propertySelectionEvent) {
						ISimulation sim = GeoViewOptionsBar.this.sim;
						if (sim != null
								&& SimulationManager.getManager()
										.getActiveSimulations().contains(sim)) {
							GraphMapPreferences prefs = GraphMapPreferences
									.getInstance();
							int viewId = GraphMapRegistry.getInstance()
									.getViewId(GeoViewOptionsBar.this.view);
							prefs.updatePreferenceState(
									viewId,
									GeoViewOptionsBar.this.sim,
									PreferenceConstants.GEOVIEW_COLORPROVIDER_PROPERTY_OPTION,
									pComp.getSelectedProperty().getDisplayName(
											null));
						}
						selectedProperty = propertySelectionEvent.getProperty();
						firePropertySelectionEvent();
					}
				});
			}

			colorProviderComposite.setLayoutData(new GridData(SWT.FILL,
					SWT.FILL, true, true));

			geoViewOptionsGroup.layout();

			colorsLegendComposite = selectedColorProviderAdapterFactory
					.createColorsLegendComposite(this, SWT.NONE);
			if (colorsLegendComposite != null) {
				colorsLegendComposite.pack();
				colorsLegendComposite.layout();
			}

			this.layout();
		}
	}

	/**
	 * @param simulation
	 *            the simulation that contains {@link Decorator}s
	 * @return a {@link List} of the {@link Decorator}s whose properties
	 */
	private List<Decorator> getDecoratorsToDisplay(ISimulation simulation) {
		List<Decorator> retValue = new ArrayList<Decorator>();

		// Got Simulation?
		if (simulation != null) {
			// Yes
			Graph canonicalGraph = simulation.getScenario().getCanonicalGraph();
			// Is the canonicalGraph initialized yet?
			if (canonicalGraph != null) {
				// Yes
				// Go through the Decorators keeping the ones that the filter
				// says are ok.
				for (Object element : canonicalGraph.getDecorators()) {
					Decorator decorator = (Decorator) element;
					// Acceptable?
					if (accept(decorator)) {
						retValue.add(decorator);
					} else if (decorator instanceof TriggerList) {
						retValue.add(decorator);
					}
				} // for each decorator
			} // if got graph
		} // if got simulation
		return retValue;
	} // getDecoratorsToDisplay

	/**
	 * @param simulation
	 *            the simulation that contains {@link Decorator}s
	 */
	private void getInformation(ISimulation simulation) {
		// Got Simulation?
		if (simulation != null) {
			// Yes
			Graph canonicalGraph = simulation.getScenario().getCanonicalGraph();
			// Is the canonicalGraph initialized yet?
			if (canonicalGraph != null) {
				canonicalGraph.getGraphLabels();
				canonicalGraph
						.getNodeLabelsByTypeURI(URI
								.createURI("stemtype://org.eclipse.stem/label/population"));
			} // if got graph
		} // if got simulation
	} // getDecoratorsToDisplay

	/**
	 * @param combo
	 * @param names
	 * @param selectionIndex
	 */
	private void initializeCombo(Combo combo, String[] names, int selectionIndex) {
		combo.setItems(names);
		combo.select(selectionIndex);
	} // initializeCombo

	/**
	 * @param decorators
	 *            a list of {@link Decorator}s
	 * @return an array of the names of the {@link Decorators}.
	 */
	private String[] getDecoratorNames(List<Decorator> decorators) {
		List<String> retValue = new ArrayList<String>();
		if (decorators != null) {
			// Yes
			for (Decorator decorator : decorators) {
				ComposedAdapterFactory itemProviderFactory = new ComposedAdapterFactory(
						ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

				IItemLabelProvider lp = (IItemLabelProvider) itemProviderFactory
						.adapt(decorator, IItemLabelProvider.class);
				String title = lp.getText(decorator);
				title = title == null ? "null" : title;
				retValue.add(title);
			} // for each decorator
		} // if
		return retValue.toArray(new String[] {});
	} // getDecoratorNames

	/**
	 * @param popIds
	 *            a list of population ids
	 * @return an array of the names
	 */
	private String[] getPopulationIdNames(List<String> popIds) {
		List<String> retValue = new ArrayList<String>();
		if (popIds != null) {
			// Yes
			for (String decid : popIds) {
				String title = decid;
				title = title == null ? "null" : title;
				retValue.add(title);
			} // for each decorator
		} // if
		return retValue.toArray(new String[] {});
	} // getDecoratorNames

	/**
	 * @param selectedDecorator
	 * @param decorators
	 *            a list of {@link Decorator}s.
	 * @return the position (0 origin) of the selectedDecorator in decorators,
	 *         or 0, if the decorators list is empty.
	 */
	private int getDecoratorIndex(Decorator selectedDecorator,
			List<Decorator> decorators) {
		if (selectedDecorator != null && decorators != null
				&& !decorators.isEmpty()) {
			// Yes
			return decorators.indexOf(selectedDecorator);
		} // if
		return 0;
	} // getDecoratorIndex

	/**
	 */
	private int getPopulationIdIndex(String selectedPopId, List<String> popIds) {
		if (selectedPopId != null && popIds != null && !popIds.isEmpty()) {
			// Yes
			return popIds.indexOf(selectedPopId);
		} // if
		return 0;
	} // getDecoratorIndex

	private void firePropertySelectionEvent() {
		for (PropertySelectionListener listener : selectionListeners) {
			listener.propertySelected();
		} // for each PropertySelectionListener
	} // firePropertySelectionEvent

	private boolean accept(Decorator decorator) {
		EList<DynamicLabel> labels = decorator.getLabelsToUpdate();
		if (labels == null)
			return false;
		for (DynamicLabel l : labels) {
			RelativeValueProviderAdapter rvp = (RelativeValueProviderAdapter) RelativeValueProviderAdapterFactory.INSTANCE
					.adapt(l, RelativeValueProvider.class);
			if (rvp != null)
				return true;
		}

		return false;
	}

	/**
	 * This interface is implemented by classes that wish to be notified
	 * whenever a property is selected in this widget.
	 */
	public interface PropertySelectionListener {
		/**
		 * @param propertySelectionEvent
		 */
		public void propertySelected();
	} // PropertySelectionListener

}
