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
 *     Bundesinstitut fur Risikobewertung
 *******************************************************************************/

package org.eclipse.stem.ui.views.graphmap;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.modifier.DoubleModifier;
import org.eclipse.stem.core.modifier.FeatureModifier;
import org.eclipse.stem.core.modifier.Modifier;
import org.eclipse.stem.core.predicate.And;
import org.eclipse.stem.core.predicate.ElapsedTimeTest;
import org.eclipse.stem.core.predicate.Not;
import org.eclipse.stem.core.predicate.Predicate;
import org.eclipse.stem.core.predicate.PredicateExpression;
import org.eclipse.stem.core.trigger.TriggerList;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapter;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapterFactory;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabel;
import org.eclipse.stem.definitions.edges.PopulationEdge;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.geography.centers.GeographicCenters;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.ISimulationListener;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapter;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapterFactory;
import org.eclipse.stem.ui.preferences.PreferenceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;

/**
 * This class represents a visualization of the geographic attributes of a
 * {@link org.eclipse.stem.jobs.simulation.org.eclipse.stem.jobs.simulation.Simulation}
 * .
 */
public class GraphMapControl extends Composite implements ISimulationListener,
		GeoViewOptionsBar.PropertySelectionListener {

	private ISimulation simulation;
	private GraphMapCanvas canvas;
	private String selectedEdge;
	private Job refreshJob;
	private boolean refreshPending;
	private StemPolygonList polygonsToDraw;
	private ColorProviderAdapter colorProviderAdapter;
	private GeoViewOptionsBar optionsBar;
	private Map<Decorator, DecoratorDisplayData> decoratorToDecoratorDisplayDataMap;
	private Map<LatLong, StemPolygonList> polygonListMap;
	private GraphMapView view;
	private boolean showOptionsBar;
	private FormData optionsBarFormData;
	private Composite topComposite;
	
	public GraphMapControl(Composite parent, int style, GraphMapView view) {
		super(parent, style);
		this.view = view;
		decoratorToDecoratorDisplayDataMap = new HashMap<Decorator, DecoratorDisplayData>();
		polygonListMap = new HashMap<LatLong, StemPolygonList>();

		canvas = new GraphMapCanvas(this, SWT.NONE, this.view);
		canvas.setColorProvider(colorProviderAdapter);
		canvas.addPaneChangeListener(new PaneChangeListener(this));

		setLayout(new FormLayout());

		topComposite = new Composite(this, SWT.NONE);
		topComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
		canvas.setGainScaleLabel(new Label(topComposite, SWT.RIGHT));

		optionsBar = new GeoViewOptionsBar(this, SWT.NONE, view);  
		optionsBar.addPropertySelectionListener(this);

		FormData topCompositeFormData = new FormData();
		topComposite.setLayoutData(topCompositeFormData);
		topCompositeFormData.top = new FormAttachment(0, 0);
		topCompositeFormData.left = new FormAttachment(0, 0);
		topCompositeFormData.right = new FormAttachment(100, 0);

		FormData geoRendererFormData = new FormData();
		canvas.setLayoutData(geoRendererFormData);
		geoRendererFormData.top = new FormAttachment(topComposite, 0);
		geoRendererFormData.bottom = new FormAttachment(optionsBar, 0);
		geoRendererFormData.left = new FormAttachment(0, 0);
		geoRendererFormData.right = new FormAttachment(100, 0);

		optionsBarFormData = new FormData();
		optionsBar.setLayoutData(optionsBarFormData);
		optionsBarFormData.bottom = new FormAttachment(100, 0);
		optionsBarFormData.left = new FormAttachment(0, 0);
		optionsBarFormData.right = new FormAttachment(100, 0);
		// XXX for now
		this.showOptionsBar = true;
		pack();
	}

	public ISimulation getSimulation() {
		return simulation;
	}

	/**
	 * Setting the {@link org.eclipse.stem.jobs.simulation.Simulation} has the
	 * side-effect of causing the control to remove itself as a listener from
	 * any previously set {@link org.eclipse.stem.jobs.simulation.Simulation}
	 * and adding itself as a listener to the new one. It will also cause the
	 * image to be initialized from the contents of the new
	 * {@link org.eclipse.stem.jobs.simulation.Simulation} as appropriate.
	 * 
	 * @param simulation
	 *            the {@link org.eclipse.stem.jobs.simulation.Simulation} whose
	 *            Lat/Long data will be rendered.
	 */
	public void setSimulation(ISimulation simulation) {
		// Any need to switch?
		if (this.simulation == simulation) {
			// No
			return;
		} // if no need to switch?

		// Should we remove ourselves as listeners from the current simulation?
		if (this.simulation != null) {
			// Yes
			this.simulation.removeSimulationListener(this);
		}

		this.simulation = simulation;

		// Was there a new simulation to switch to?
		if (this.simulation != null) {
			// Yes
			this.simulation.addSimulationListener(this);
			optionsBar.setSimulation(this.simulation);
			setGeoViewProperties();
		}
		refresh();
	}

	public void showOptionsBar(boolean toggle){
		this.showOptionsBar = toggle;
		if (this.showOptionsBar){
			optionsBarFormData.top = null;
			this.layout();
		} else{
			optionsBarFormData.top = new FormAttachment(100,0);
			this.layout();
		}
		redraw();
	}
	/**
	 * Update the contents of {@link #geographicRenderer} from the contents of
	 * the {@link #simulation}. This method should only be called by the UI
	 * thread otherwise it contains a race condition that can lock up the
	 * refreshing of the map canvas.
	 */
	public void refresh() {
		// This is complex and potential confusing code. The basic idea is that
		// we want to determine what to draw on the mapCanvas in a thread
		// separate from the UI thread, but we also want to capture a request to
		// refresh the mapCanvas that comes while a background Job is already
		// running. This request could have been generated because something
		// significant like a decorator or a property has changed and
		// we don't want to lose that switch.
		// We have two fields that capture the state of the refresh. The first
		// is the flag refreshPending which if true indicates that a call to
		// refreshMapCanvas was processed while a background Job was executing.
		// This flag is set instead of creating another background Job. The
		// second is the field refreshJob which is set to the background Job if
		// it is present and running.
		//
		// If we enter the method and refreshPending is true then we immediately
		// exit because a refresh job will be created and there's nothing more
		// for us to request. If, instead, refreshPending is false, then we
		// check to see if a refreshJob is already running. If so, we set
		// refreshPending to true, and exit. If not, we create the background
		// refresh job and assign it to the field refreshJob.
		//
		// In the background refreshing job we process the Lat/Long data and
		// then when done we add a Runnable on to the UI thread to redraw the
		// mapCanvas. That Runnable also checks to see if the refresh pending
		// flag is set and if so, resets the flag and then adds another Runnable
		// to the UI thread to re-enter the refreshMapCanvas method.
		//
		// There is a race condition in the method if called by other than the
		// UI thread. If a thread different from the UI thread were to call this
		// method then it could reach position "RC #2" in the code below and
		// then be preempted. The UI thread could then execute the test at "RC
		// #1" below and find that there is no refresh pending. It would exit
		// and then the other thread would resume at "RC #2" and set the
		// refreshPending flag. This would cause all subsequent method
		// invocations to immediately exit and the map canvas would never be
		// refreshed again.

		if (refreshJob != null) {
			refreshPending = true;
			return;
		}

		refreshJob = new Job(Messages.getString("IMView.MRefresh")) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				polygonsToDraw = createPolygonsToDraw(monitor);

				if (polygonsToDraw == null || polygonsToDraw.isEmpty()) {
					return Status.OK_STATUS;
				}

				try {
					if (PlatformUI.isWorkbenchRunning()) {
						Display display = Display.getDefault();

						if (!display.isDisposed()) {
							display.asyncExec(new Runnable() {

								@Override
								public void run() {
									if (!canvas.isDisposed()) {
										canvas.render(polygonsToDraw,
												simulation);
										refreshJob = null;

										if (refreshPending) {
											refreshPending = false;
											refresh();
										}
									} else {
										refreshJob = null;
									}
								}
							});
						}
					}
				} catch (NullPointerException npe) {
					// See 177966:
					// We ignore the exception, there's nothing to do
				} catch (SWTException se) {
					// Sometimes this happens when shutting down STEM with
					// simulations
					// still running. Nothing we can do about it, so just
					// ignore.
				}

				monitor.done();

				return Status.OK_STATUS;
			}
		};
		refreshJob.schedule();
	}

	@Override
	public void simulationChanged(SimulationEvent event) {
		switch (event.getSimulationState()) {
		case COMPLETED_CYCLE:
			// It could be that the propertySelector is not initialized
			// yet. This could happen if, when the simulation is first set, its
			// scenario was not completely initialized, and so didn't have a
			// canonical graph. If this is the case, we need to try again.

			if (!optionsBar.isInitialized()) {
				optionsBar.setSimulation(getSimulation());
			}

			refresh();
			break;
		case RESET:
			refresh();
			break;
		case RUNNING:
		case COMPLETED_SEQUENCE:
		case PAUSED:
		case STOPPED:
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		optionsBar.removePropertySelectionListener(this);

		if (simulation != null) {
			simulation.removeSimulationListener(this);
		}
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		canvas.addSelectionChangedListener(listener);
	}

	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		canvas.removeSelectionChangedListener(listener);
	}

	public Image getMapCanvasImage() {
		return canvas.getCanvasImage();
	}

	@Override
	public void propertySelected() {
		setGeoViewProperties();
		layout();
		refresh();
	}

	private void setGeoViewProperties() {
		Decorator decorator = optionsBar.getSelectedDecorator();
		if (decorator != null) {
			AdapterFactory adapterFactory = ColorProviderAdapterFactory.INSTANCE
					.getFactoryForType(optionsBar.getSelectedColorProvider());
		
			Adapter adapter = adapterFactory.adapt(decorator.getGraph(), optionsBar.getSelectedColorProvider());
		
			if (adapter instanceof ColorProviderAdapter) {
				colorProviderAdapter = (ColorProviderAdapter) adapter;
				colorProviderAdapter.setSelectedDecorator(optionsBar
						.getSelectedDecorator());
				colorProviderAdapter.setSelectedPopulationIdentifier(optionsBar
						.getSelectedPopulationIdentifier());
				canvas.setColorProvider(colorProviderAdapter);
				selectedEdge = optionsBar.getSelectedEdge();
	
				if (optionsBar.getSelectedProperty() != null) {
					colorProviderAdapter.setSelectedProperty(optionsBar
							.getSelectedProperty());
				}
			}
		}
	}

	/**
	 * This runs in the background {@link Job} created in {@link #refresh()}
	 * 
	 * @param decorator
	 *            the {@link Decorator} for whom that data is being retrieved.
	 * @param monitor
	 *            the progress monitor to use to report the progress of
	 *            obtaining the data
	 * @return the {@link DecoratorDisplayData} for the {@link Decorator}.
	 */
	private DecoratorDisplayData getDecoratorDisplayData(Decorator decorator,
			IProgressMonitor monitor) {
		DecoratorDisplayData retValue = decoratorToDecoratorDisplayDataMap
				.get(decorator);

		// Is there already an instance for this decorator?
		if (retValue == null) {
			retValue = new DecoratorDisplayData();
			decoratorToDecoratorDisplayDataMap.put(decorator, retValue);

			if (decorator instanceof TriggerList) {
				Graph graph = simulation.getScenario().getCanonicalGraph();
//				Node randomNode = null;
//
				for (Node node : graph.getNodes().values()) {
					retValue.addNode(node);
//					randomNode = node;
				}
//				if (randomNode != null) {
//					LatLongProviderAdapter latLongProvider = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE
//							.adapt(randomNode, LatLongProvider.class);
//
//					retValue.setLatLongProviderAdapter(latLongProvider);
//				}
			} else {
				if (decorator.getLabelsToUpdate() == null
						|| decorator.getLabelsToUpdate().isEmpty()) {
					return retValue;
				}

//				DynamicNodeLabel firstNodeLabel = (DynamicNodeLabel) decorator
//						.getLabelsToUpdate().get(0);
//				if (firstNodeLabel != null) {
//					Node node = firstNodeLabel.getNode();
//					LatLongProviderAdapter latLongProvider = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE
//							.adapt(node, LatLongProvider.class);
//
//					retValue.setLatLongProviderAdapter(latLongProvider);
//				}

				for (DynamicLabel label : decorator.getLabelsToUpdate()) {
					retValue.addNode(((DynamicNodeLabel) label).getNode());
				}
			}
		}

		// Does the instance have all of it's lat/long data retrieved yet?
		if (!retValue.hasAllLatLong()) {
			monitor.subTask(decorator.getDublinCore().getTitle());
			retValue.updateLatLong(monitor);
		}

		return retValue;
	}

	/**
	 * This runs in the background {@link Job} created in
	 * {@link #refreshMapCanvas()}.
	 * 
	 * @param monitor
	 *            progress monitor for obtaining the polygons
	 * @return a collection of polygon values to render in the
	 *         {@link #mapCanvas}
	 */
	private StemPolygonList createPolygonsToDraw(IProgressMonitor monitor) {
		Decorator selectedDecorator = optionsBar.getSelectedDecorator();
		String selectedPopulationIdentifier = optionsBar
				.getSelectedPopulationIdentifier();
		StemPolygonList retValue = new StemPolygonList();

		if (selectedDecorator == null) {
			return null;
		}

		DecoratorDisplayData displayData = getDecoratorDisplayData(
				selectedDecorator, monitor);

		if (displayData == null) {
			return null;
		}

		monitor.beginTask(selectedDecorator.getDublinCore().getTitle(),
				displayData.getNodeData().size());

		if (selectedDecorator instanceof TriggerList) {
			Map<URI, Double> nodeValues = getMigrationNodeValues();

			for (Map.Entry<Node, LatLong> labelData : displayData.getNodeData()
					.entrySet()) {
				// This is the Identifiable that will produce the lat/long data.
				Node node = labelData.getKey();
				LatLong latLong = labelData.getValue();

				monitor.subTask(node.getDublinCore().getTitle());

				if (latLong != null && latLong.size() > 0) {
					StemPolygonList stemPolygonsList = polygonListMap
							.get(latLong);
					Double value = nodeValues.get(node.getURI());

					if (stemPolygonsList == null) {
						stemPolygonsList = new StemPolygonList(latLong, node);
						polygonListMap.put(latLong, stemPolygonsList);
					}

					if (value != null) {
						stemPolygonsList.setValueToDisplay(value);
					} else {
						stemPolygonsList.setValueToDisplay(0.0);
					}

					retValue.addAll(stemPolygonsList);
				}

				monitor.worked(1);
			}
		} else {
			for (Map.Entry<Node, LatLong> labelData : displayData.getNodeData()
					.entrySet()) {
				// This is the Identifiable that will produce the lat/long data.
				Node node = labelData.getKey();
				LatLong latLong = labelData.getValue();

				boolean foundLabel = false;

				boolean success=true;
				do {
					success = true;
					try {
						for (NodeLabel lab : labelData.getKey().getLabels()) {
							if (lab instanceof DiseaseModelLabel
									&& ((DiseaseModelLabel) lab)
											.getPopulationModelLabel()
											.getPopulationIdentifier()
											.equals(selectedPopulationIdentifier)) {
								foundLabel = true;
								break;
							} else if (lab instanceof PopulationModelLabel
									&& ((PopulationModelLabel) lab)
											.getPopulationIdentifier().equals(
													selectedPopulationIdentifier)) {
								foundLabel = true;
								break;
							}
						}
					} catch(ConcurrentModificationException cme) { // Occational occurence. Retry if it happens
						success = false;
					}
				} while(!success);
				
				if (!foundLabel) {
					continue;
				}

				monitor.subTask(node.getDublinCore().getTitle());

				if (latLong != null && latLong.size() > 0) {
					StemPolygonList stemPolygonsList = polygonListMap
							.get(latLong);

					if (stemPolygonsList == null) {
						stemPolygonsList = new StemPolygonList(latLong, node);
						polygonListMap.put(latLong, stemPolygonsList);
					}

					stemPolygonsList.setValueToDisplay(Double.NaN);
					retValue.addAll(stemPolygonsList);
				}

				monitor.worked(1);
			}
		}

		if (selectedEdge == null) {
			return retValue;
		}

		Map<URI, Double> edgeValues = null;
		String selectedEdgeCopy = selectedEdge;

		if (selectedEdge.startsWith("triggered")) {
			selectedEdgeCopy = selectedEdge.replaceFirst("triggered", "");
			edgeValues = getMigrationEdgeValues(false);
		} else if (selectedEdge.startsWith("history")) {
			selectedEdgeCopy = selectedEdge.replaceFirst("history", "");
			edgeValues = getMigrationEdgeValues(true);
		}

		EMap<URI, Edge> allEdges = selectedDecorator.getGraph().getEdges();
		List<Edge> edges = new ArrayList<Edge>();

		for (URI uri : allEdges.keySet()) {
			if (uri.toString().startsWith(selectedEdgeCopy)) {
				Edge edge = allEdges.get(uri);

				if (edge instanceof PopulationEdge) {
					String popID = ((PopulationEdge) edge)
							.getPopulationIdentifier();

					if (selectedPopulationIdentifier.equals(popID)) {
						edges.add(edge);
					}
				} else {
					edges.add(edge);
				}
			}
		}

		if (edges.isEmpty()) {
			return retValue;
		}

		Set<URI> addedEdges = new HashSet<URI>();

		for (Edge nextEdge : edges) {
			Node nodeA = nextEdge.getA();
			Node nodeB = nextEdge.getB();

			if (nodeA == null || nodeB == null) {
				// It is possible that edges for air transport has a missing
				// node if sub model is not included in the scenario.
				continue;
			}

			String nodeAISOKey = nodeA.getURI().lastSegment();
			String nodeBISOKey = nodeB.getURI().lastSegment();
			double[] centerA = GeographicCenters.getCenter(nodeAISOKey);
			double[] centerB = GeographicCenters.getCenter(nodeBISOKey);

			if (centerA == null) {
				LatLongProviderAdapter latLongProviderA = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE
						.adapt(nodeA, LatLongProvider.class);

				//latLongProviderA.setTarget(nodeA);
				centerA = latLongProviderA.getCenter();
			}

			if (centerB == null) {
				LatLongProviderAdapter latLongProviderB = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE
						.adapt(nodeB, LatLongProvider.class);

				//latLongProviderB.setTarget(nodeB);
				centerB = latLongProviderB.getCenter();
			}

			if (centerA == null || centerB == null) {
				continue;
			}

			if (!addedEdges.contains(nextEdge.getURI())) {
				Segment edgeSegment = new Segment(new double[][] { centerA,
						centerB });
				StemPolygon stemPolygon = new StemPolygon(edgeSegment, nextEdge);

				if (edgeValues == null) {
					stemPolygon.setValueToDisplay(Double.NaN);
					retValue.add(stemPolygon);
					addedEdges.add(nextEdge.getURI());
				} else {
					Double value = edgeValues.get(nextEdge.getURI());

					if (value != null) {
						stemPolygon.setValueToDisplay(value);
						retValue.add(stemPolygon);
						addedEdges.add(nextEdge.getURI());
					}
				}
			}
		}

		return retValue;
	}

	private Map<URI, Double> getMigrationNodeValues() {
		EMap<URI, Edge> edges = simulation.getScenario().getCanonicalGraph()
				.getEdges();
		Map<URI, Double> edgeValues = getMigrationEdgeValues(true);
		Map<URI, Double> nodeValues = new HashMap<URI, Double>();

		for (URI edgeURI : edgeValues.keySet()) {
			double value = edgeValues.get(edgeURI);
			MigrationEdge edge = (MigrationEdge) edges.get(edgeURI);
			URI nodeURI = edge.getNodeBURI();
			Double oldValue = nodeValues.get(nodeURI);

			if (oldValue == null) {
				nodeValues.put(nodeURI, value);
			} else {
				nodeValues.put(nodeURI, oldValue + value);
			}
		}

		return nodeValues;
	}

	private Map<URI, Double> getMigrationEdgeValues(boolean history) {
		EMap<URI, Edge> edges = simulation.getScenario().getCanonicalGraph()
				.getEdges();
		Map<URI, EdgeLabel> edgeLabels = new HashMap<URI, EdgeLabel>();
		Map<URI, Double> edgeValues = new HashMap<URI, Double>();

		for (Edge edge : edges.values()) {
			EdgeLabel edgeLabel = edge.getLabel();

			edgeLabels.put(edgeLabel.getURI(), edgeLabel);
		}

		for (Decorator deco : simulation.getScenario().getScenarioDecorators()) {
			if (!(deco instanceof TriggerList)) {
				continue;
			}

			TriggerList triggerList = (TriggerList) deco;

			for (int i = 0; i < triggerList.getPredicateList().size(); i++) {
				Predicate predicate = triggerList.getPredicateList().get(i);
				Decorator action = triggerList.getActionList().get(i);
				Interval interval = getTimeInterval(predicate);
				long time = simulation.getScenario().getSequencer()
						.getCurrentTime().getTime().getTime();

				if (interval == null) {
					continue;
				}

				if (history && time < interval.startTime) {
					continue;
				} else if (!history
						&& (time < interval.startTime || time > interval.endTime)) {
					continue;
				}

				if (!(action instanceof Modifier)) {
					continue;
				}

				Modifier modifier = (Modifier) action;
				EdgeLabel label = edgeLabels.get(modifier.getTargetURI());

				if (label == null || !(label instanceof MigrationEdgeLabel)) {
					continue;
				}

				MigrationEdgeLabel migrationLabel = (MigrationEdgeLabel) label;

				for (FeatureModifier fm : modifier.getFeatureModifiers()) {
					if (!fm.getFeatureName().equals("migrationRate")) {
						continue;
					}

					double value = ((DoubleModifier) fm).getValue();
					URI edgeURI = migrationLabel
							.getURIOfIdentifiableToBeLabeled();
					Double oldValue = edgeValues.get(edgeURI);

					if (oldValue == null) {
						edgeValues.put(edgeURI, value);
					} else {
						edgeValues.put(edgeURI, oldValue + value);
					}
				}
			}
		}

		return edgeValues;
	}

	private Interval getTimeInterval(Predicate predicate) {
		if (!(predicate instanceof PredicateExpression)) {
			return null;
		}

		Predicate and = ((PredicateExpression) predicate).getPredicate();

		if (!(and instanceof And)) {
			return null;
		}

		EList<Predicate> operands = ((And) and).getOperands();

		if (operands.size() != 2) {
			return null;
		}

		ElapsedTimeTest timeTest1 = null;
		Not not = null;

		if (operands.get(0) instanceof ElapsedTimeTest
				&& operands.get(1) instanceof Not) {
			timeTest1 = (ElapsedTimeTest) operands.get(0);
			not = (Not) operands.get(1);
		} else if (operands.get(1) instanceof ElapsedTimeTest
				&& operands.get(0) instanceof Not) {
			timeTest1 = (ElapsedTimeTest) operands.get(1);
			not = (Not) operands.get(0);
		} else {
			return null;
		}

		if (!(not.getOperand() instanceof ElapsedTimeTest)) {
			return null;
		}

		ElapsedTimeTest timeTest2 = (ElapsedTimeTest) not.getOperand();
		long millis1 = timeTest1.getReferenceTime().getTime().getTime()
				+ timeTest1.getNumberofDays()
				* STEMTime.Units.DAY.getMilliseconds();
		long millis2 = timeTest2.getReferenceTime().getTime().getTime()
				+ timeTest2.getNumberofDays()
				* STEMTime.Units.DAY.getMilliseconds();

		return new Interval(millis1, millis2);
	}

	private class Interval {

		public long startTime;
		public long endTime;

		public Interval(long startTime, long endTime) {
			this.startTime = startTime;
			this.endTime = endTime;
		}

	}

	private class PaneChangeListener implements Observer {
		GraphMapControl thiss;

		public PaneChangeListener(GraphMapControl ctrl) {
			this.thiss = ctrl;
		}

		@Override
		public void update(Observable o, Object arg) {
			PaneChangeEvent e = (PaneChangeEvent) arg;
			int viewId = GraphMapRegistry.getInstance().getViewId(thiss.view);
			GraphMapPreferences prefs = GraphMapPreferences.getInstance();
			prefs.updatePreferenceState(viewId, thiss.getSimulation(),
					PreferenceConstants.GRAPHMAP_PERSISTANT_VIEW_TRANS_X,
					e.getTranformationX());
			prefs.updatePreferenceState(viewId, thiss.getSimulation(),
					PreferenceConstants.GRAPHMAP_PERSISTANT_VIEW_TRANS_Y,
					e.getTranformationY());
			prefs.updatePreferenceState(viewId, thiss.getSimulation(),
					PreferenceConstants.GRAPHMAP_PERSISTANT_VIEW_SCALE_FACTOR,
					e.getScaleFactor());
		}
	}
}
