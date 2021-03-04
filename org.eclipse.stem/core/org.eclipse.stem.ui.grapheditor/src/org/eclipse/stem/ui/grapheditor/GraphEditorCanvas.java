/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut f�r Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut f�r Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.ui.grapheditor;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.SWTEventDispatcher;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.graph.impl.EdgeImpl;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.definitions.adapters.spatial.SpatialProviderAdapter;
import org.eclipse.stem.definitions.adapters.spatial.geo.InlineLatLongDataProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.SegmentBuilder;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapterFactory;
import org.eclipse.stem.definitions.adapters.spatial.geo.PlatformLatLongDataProvider;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabel;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabelValue;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabel;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabel;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl;
import org.eclipse.stem.definitions.nodes.NodesFactory;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.definitions.transport.PipeTransportEdge;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabel;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabelValue;
import org.eclipse.stem.definitions.transport.TransportFactory;
import org.eclipse.stem.definitions.transport.TransportPackage;
import org.eclipse.stem.definitions.transport.impl.PipeTransportEdgeImpl;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.grapheditor.handlers.NewNodeDialog;
import org.eclipse.stem.ui.grapheditor.handlers.SaveInProjectDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphItem;
import org.eclipse.zest.core.widgets.GraphNode;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

/**
 * GraphEditorCanvas is main class of the GraphEditor. It provides the
 * visualization and manipulation of a single Graph or multiple Graphs contained
 * in a Model structure. For visualization the Zest library is used. The
 * transformation from LatLong coordinates to screen coordinates is as follows:
 * -------------- x = scaleX * longitude + translationX -----------------------
 * -------------- y = scaleY * latitude + translationY ------------------------
 */
public class GraphEditorCanvas {

	/**
	 * Size of nodes in Zest graph.
	 */
	private final int NODE_SIZE = 10;

	/**
	 * Initial scale when opening GraphEditor.
	 */
	private final double INITIAL_SCALE_FACTOR = 0.95;

	/**
	 * Main Shell that contains Graph visualization etc.
	 */
	private Shell shell;

	/**
	 * Project that contains the Graphs to visualize.
	 */
	private IProject project;

	/**
	 * List of all Models if a Model structure with Graphs is used.
	 */
	private List<Model> modelList;

	/**
	 * List of all Graphs to visualize.
	 */
	private List<Graph> graphList;

	/**
	 * Graph that contains Nodes and Edges from all Graphs in graphList.
	 */
	private Graph stemGraph;

	/**
	 * Zest Graph used to visualize stemGraph.
	 */
	private org.eclipse.zest.core.widgets.Graph zestGraph;

	/**
	 * Scaling for transformation from longitude to x in screen coordinates.
	 */
	private double scaleX;

	/**
	 * Scaling for transformation from latitude to y in screen coordinates.
	 */
	private double scaleY;

	/**
	 * Translation for transformation from longitude to x in screen coordinates.
	 */
	private double translationX;

	/**
	 * Translation for transformation from latitude to y in screen coordinates.
	 */
	private double translationY;

	/**
	 * Zoom factor, not used for transformation, but is just displayed in UI, is
	 * 1.0 for initial scale.
	 */
	private double zoomFactor;

	/**
	 * Last x-coordinate of cursor, when left mouse button was pressed.
	 */
	private int lastCursorX;

	/**
	 * Last y-coordinate of cursor, when left mouse button was pressed.
	 */
	private int lastCursorY;

	/**
	 * Is left mouse button pressed?
	 */
	private boolean leftMouseButtonPressed;

	/**
	 * Map with all GraphNodes (Nodes of Zest Graph). Key is the URI of the
	 * related STEM Node.
	 */
	private Map<URI, GraphNode> graphNodes;

	/**
	 * Map with all GraphConnections (Edges of Zest Graph). Key is the URI of
	 * the related STEM Edge.
	 */
	private Map<URI, GraphConnection> graphConnections;

	/**
	 * Map of the Polygon sets for all STEM nodes. Key is URI of the Node.
	 */
	private Map<URI, Set<Polygon>> graphPolygons;

	/**
	 * A stack containing the history of the center positions off all Nodes.
	 * Needed for undoing translation.
	 */
	private Deque<Map<URI, Point2D.Double>> centersHistory;

	/**
	 * Current center positions of all Nodes.
	 */
	private Map<URI, Point2D.Double> currentCenters;

	/**
	 * True is nodes moved, since the last update of currentCenters.
	 */
	private boolean centersMoved;

	/**
	 * DynamicText field displaying the location of a node.
	 */
	private DynamicText nodeCoordinatesText;

	/**
	 * DynamicText field displaying the location of the cursor.
	 */
	private DynamicText coordinatesText;

	/**
	 * DynamicText field displaying the zoom factor.
	 */
	private DynamicText zoomText;

	/**
	 * Button for undoing the last node translation.
	 */
	private Button undoButton;

	/**
	 * Combo for selecting NodeLabels.
	 */
	private Combo nodeLabelTypeCombo;

	/**
	 * Menu for removing NodeLabels.
	 */
	private Menu removeLabelMenu;

	/**
	 * Opens a new GraphEditor displaying all Graphs in graphList.
	 * 
	 * @param fileName
	 *            name of file that is displayed
	 * @param project
	 *            current project
	 * @param graphList
	 *            list of all Graphs
	 * @param modelList
	 *            list of all Models containing the Graphs, may be empty
	 */
	public GraphEditorCanvas(String fileName, IProject project,
			List<Graph> graphList, List<Model> modelList) {
		this.project = project;
		this.graphList = new ArrayList<Graph>();
		this.modelList = modelList;
		stemGraph = null;
		zoomFactor = 1.0;
		leftMouseButtonPressed = false;
		graphNodes = new HashMap<URI, GraphNode>();
		graphConnections = new HashMap<URI, GraphConnection>();
		graphPolygons = new HashMap<URI, Set<Polygon>>();
		centersHistory = new LinkedList<Map<URI, Point2D.Double>>();

		if (graphList == null || graphList.isEmpty()) {
			IWorkbenchWindow window = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();
			IStatus warning = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 1,
					"Error opening GraphEditor: " + fileName
							+ " does not contain graphs", null);
			ErrorDialog.openError(window.getShell(), null, null, warning);
			return;
		}

		for (Graph graph : graphList) {
			this.graphList.add((Graph) EcoreUtil.copy(graph));
		}

		for (Graph graph : graphList) {
			if (stemGraph == null) {
				stemGraph = (Graph) EcoreUtil.copy(graph);
			} else {
				stemGraph.addGraph((Graph) EcoreUtil.copy(graph), null);
			}
		}

		for (NodeLabel nodeLabel : stemGraph.getNodeLabels().values()) {
			Node node = stemGraph.getNode(nodeLabel
					.getURIOfIdentifiableToBeLabeled());

			if (!node.getLabels().contains(nodeLabel)) {
				node.getLabels().add(nodeLabel);
			}
		}

		createShell(fileName + " - STEM Graph Editor");

		for (Node node : stemGraph.getNodes().values()) {
			processNode(node);
		}

		for (Edge edge : stemGraph.getEdges().values()) {
			processEdge(edge);
		}

		if (graphNodes.isEmpty()) {
			IWorkbenchWindow window = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();
			IStatus warning = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 1,
					"Error opening GraphEditor: " + fileName
							+ " does not contain nodes", null);
			ErrorDialog.openError(window.getShell(), null, null, warning);
			return;
		}

		setInitialTransform();
		redraw();
		shell.open();

		while (!shell.isDisposed()) {
			while (!PlatformUI.getWorkbench().getDisplay()
					.readAndDispatch()) {
				PlatformUI.getWorkbench().getDisplay().sleep();
			}
		}
	}

	/**
	 * Initial creation of the Shell using specified title.
	 * 
	 * @param title
	 *            string in the title bar
	 */
	private void createShell(String title) {
		shell = new Shell(PlatformUI.getWorkbench().getDisplay());
		shell.setText(title);
		shell.setLayout(new GridLayout(1, true));

		zestGraph = new org.eclipse.zest.core.widgets.Graph(shell, SWT.NONE);
		zestGraph.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		zestGraph
				.setVerticalScrollBarVisibility(org.eclipse.zest.core.widgets.Graph.NEVER);
		zestGraph
				.setHorizontalScrollBarVisibility(org.eclipse.zest.core.widgets.Graph.NEVER);
		zestGraph.getViewport().setIgnoreScroll(true);
		zestGraph.addPaintListener(new PaintListener() {

			public void paintControl(PaintEvent e) {
				e.gc.setLineWidth(0);
				e.gc.setClipping(zestGraph.getBounds());
				e.gc.setForeground(ColorConstants.lightGray);

				for (Set<Polygon> polySet : graphPolygons.values()) {
					for (Polygon displayPolygon : polySet) {
						e.gc.drawPolygon(polygon2IntArray(displayPolygon));
					}
				}
			}
		});

		for (Listener l : zestGraph.getVerticalBar()
				.getListeners(SWT.Selection)) {
			zestGraph.getVerticalBar().removeListener(SWT.Selection, l);
			zestGraph.getVerticalBar().removeListener(SWT.Selection, l);
		}

		for (Listener l : zestGraph.getHorizontalBar().getListeners(
				SWT.Selection)) {
			zestGraph.getHorizontalBar().removeListener(SWT.Selection, l);
			zestGraph.getHorizontalBar().removeListener(SWT.Selection, l);
		}

		Composite dataComposite = new Composite(shell, SWT.NONE);
		Composite infoComposite = createInfoComposite(dataComposite);
		Composite bottomComposite = createButtonsComposite(dataComposite);

		dataComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false));
		dataComposite.setLayout(new GridLayout(1, true));
		infoComposite
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		bottomComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		addMenuBar();
		addZestGraphListeners();
		addZestGraphContextMenu();

		shell.setSize(800, 600);
	}

	/**
	 * Updates the Composites for the Node parameters, Edge parameters,
	 * NodeLabel parameters and EdgeLabel parameters.
	 * 
	 * @param selectedNodeLabel
	 *            index of the NodeLabel that should be selected in the ComboBox
	 */
	private void updateShell(int selectedNodeLabel) {
		boolean showNodeComposite = false;
		boolean showEdgeComposite = false;

		if (zestGraph.getSelection().size() == 1) {
			if (zestGraph.getSelection().get(0) instanceof GraphNode) {
				showNodeComposite = true;
			} else if (zestGraph.getSelection().get(0) instanceof GraphConnection) {
				showEdgeComposite = true;
			}
		}

		shell.getChildren()[1].dispose();

		Composite bottomComposite = new Composite(shell, SWT.NONE);

		bottomComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false));
		bottomComposite.setLayout(new GridLayout(1, true));

		if (showNodeComposite) {
			GraphNode selectedNode = (GraphNode) zestGraph.getSelection()
					.get(0);
			NodeData nodeData = (NodeData) selectedNode.getData();
			Composite nodeComposite = createNodeComposite(bottomComposite);

			nodeData.setActiveLabel(selectedNodeLabel);
			nodeComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true));

			if (!nodeData.getNodeLabels().isEmpty()) {
				Composite nodeLabelComposite = createNodeLabelComposite(bottomComposite);

				nodeLabelComposite.setLayoutData(new GridData(SWT.FILL,
						SWT.FILL, true, true));
			}
		}

		if (showEdgeComposite) {
			Composite edgeComposite = createEdgeComposite(bottomComposite);
			Composite edgeLabelComposite = createEdgeLabelComposite(bottomComposite);

			edgeComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true));
			edgeLabelComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true));
		}

		Composite infoComposite = createInfoComposite(bottomComposite);
		Composite buttonsComposite = createButtonsComposite(bottomComposite);

		infoComposite
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		buttonsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		addZestGraphContextMenu();
		shell.layout(true);

		if (showNodeComposite || showEdgeComposite) {
			checkSelectionVisible();
		}
	}

	/**
	 * Creates the Composite for Node parameters.
	 * 
	 * @param parent
	 *            parent of the Composite
	 * @return Composite for Node parameters
	 */
	private Composite createNodeComposite(Composite parent) {
		GraphNode selectedNode = (GraphNode) zestGraph.getSelection().get(0);
		NodeData nodeData = (NodeData) selectedNode.getData();
		Group nodeComposite = new Group(parent, SWT.NONE);

		nodeComposite.setText(GraphEditorMessages.getString("node"));
		nodeComposite.setLayout(new RowLayout(SWT.HORIZONTAL));

		DynamicText nodeTitleText = new DynamicText(nodeComposite,
				GraphEditorMessages.getString("title"), true);
		nodeTitleText.setText(nodeData.getNodeTitle());
		nodeTitleText.addModifyListener(new TextAndButtonModifyListener(
				zestGraph, TextAndButtonModifyListener.NODE_TITLE));

		DynamicText nodeURIText = new DynamicText(nodeComposite,
				GraphEditorMessages.getString("uri"), false);
		nodeURIText.setText(nodeData.getNodeURI().toString());

		nodeCoordinatesText = new DynamicText(nodeComposite,
				GraphEditorMessages.getString("coordinates"), false);
		nodeCoordinatesText.setText(formatLatLon(nodeData.getOrigY(),
				nodeData.getOrigX()));

		return nodeComposite;
	}

	/**
	 * Creates the Composite for NodeLabel parameters.
	 * 
	 * @param parent
	 *            parent of the Composite
	 * @return Composite for NodeLabel parameters
	 */
	private Composite createNodeLabelComposite(Composite parent) {
		GraphNode selectedNode = (GraphNode) zestGraph.getSelection().get(0);
		NodeData nodeData = (NodeData) selectedNode.getData();
		List<NodeLabel> nodeLabels = nodeData.getNodeLabels();
		NodeLabel nodeLabel = nodeLabels.get(nodeData.getActiveLabel());
		Group nodeLabelComposite = new Group(parent, SWT.NONE);

		nodeLabelComposite.setText(GraphEditorMessages.getString("nodeLabel"));
		nodeLabelComposite.setLayout(new RowLayout(SWT.HORIZONTAL));

		Composite nodeLabelTypeComposite = new Composite(nodeLabelComposite,
				SWT.BORDER);
		nodeLabelTypeComposite.setLayout(new GridLayout(2, false));
		Label nodeLabelTypeLabel = new Label(nodeLabelTypeComposite, SWT.NONE);
		nodeLabelTypeLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER,
				true, true));
		nodeLabelTypeLabel.setText(GraphEditorMessages.getString("labelType")
				+ ":");
		nodeLabelTypeCombo = new Combo(nodeLabelTypeComposite, SWT.READ_ONLY);
		nodeLabelTypeCombo.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER,
				true, true));
		nodeLabelTypeCombo.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				updateShell(((Combo) e.getSource()).getSelectionIndex());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		for (NodeLabel label : nodeLabels) {
			if (label instanceof AreaLabel) {
				nodeLabelTypeCombo.add(GraphEditorMessages
						.getString("areaLabel"));
			} else if (label instanceof PopulationLabel) {
				nodeLabelTypeCombo.add(GraphEditorMessages
						.getString("populationLabel")
						+ " ("
						+ ((PopulationLabel) label).getPopulationIdentifier()
						+ ")");
			}
		}

		nodeLabelTypeCombo.select(nodeData.getActiveLabel());

		if (nodeLabel instanceof AreaLabel) {
			AreaLabel areaLabel = (AreaLabel) nodeLabel;

			DynamicText labelAreaEdit = new DynamicText(nodeLabelComposite,
					GraphEditorMessages.getString("areaKM"), true);
			labelAreaEdit.setText(""
					+ areaLabel.getCurrentAreaValue().getArea());
			labelAreaEdit.addModifyListener(new TextAndButtonModifyListener(
					zestGraph, TextAndButtonModifyListener.AREA_LABEL_VALUE));
		} else if (nodeLabel instanceof PopulationLabel) {
			PopulationLabel populationLabel = (PopulationLabel) nodeLabel;

			DynamicText labelPopulationText = new DynamicText(
					nodeLabelComposite,
					GraphEditorMessages.getString("population"), true);
			labelPopulationText.setText(populationLabel
					.getPopulationIdentifier());
			labelPopulationText
					.addModifyListener(new TextAndButtonModifyListener(
							zestGraph,
							TextAndButtonModifyListener.POPULATION_LABEL_POPULATION));
			labelPopulationText.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					populationIdentifierChanged(
							nodeLabelTypeCombo.getSelectionIndex(),
							((Text) e.getSource()).getText());
				}
			});

			DynamicText labelCountEdit = new DynamicText(nodeLabelComposite,
					GraphEditorMessages.getString("populationCount"), true);
			labelCountEdit.setText(""
					+ populationLabel.getCurrentPopulationValue().getCount());
			labelCountEdit.addModifyListener(new TextAndButtonModifyListener(
					zestGraph,
					TextAndButtonModifyListener.POPULATION_LABEL_COUNT));

			DynamicText labelPopulatedEdit = new DynamicText(
					nodeLabelComposite,
					GraphEditorMessages.getString("populatedArea"), true);
			labelPopulatedEdit.setText("" + populationLabel.getPopulatedArea());
			labelPopulatedEdit
					.addModifyListener(new TextAndButtonModifyListener(
							zestGraph,
							TextAndButtonModifyListener.POPULATION_LABEL_AREA));
		}

		return nodeLabelComposite;
	}

	/**
	 * Creates the Composite for Edge parameters.
	 * 
	 * @param parent
	 *            parent of the Composite
	 * @return Composite for Edge parameters
	 */
	private Composite createEdgeComposite(Composite parent) {
		GraphConnection selectedEdge = (GraphConnection) zestGraph
				.getSelection().get(0);
		ConnectionData edgeData = (ConnectionData) selectedEdge.getData();
		Group edgeComposite = new Group(parent, SWT.NONE);

		edgeComposite.setText(GraphEditorMessages.getString("edge"));
		edgeComposite.setLayout(new RowLayout(SWT.HORIZONTAL));

		DynamicText edgeTitleText = new DynamicText(edgeComposite,
				GraphEditorMessages.getString("title"), true);
		edgeTitleText.setText(edgeData.getEdgeTitle());
		edgeTitleText.addModifyListener(new TextAndButtonModifyListener(
				zestGraph, TextAndButtonModifyListener.EDGE_TITLE));

		DynamicText nodeAURIText = new DynamicText(edgeComposite,
				GraphEditorMessages.getString("nodeA"), false);
		nodeAURIText.setText(edgeData.getNodeAURI().lastSegment());

		DynamicText nodeBURIText = new DynamicText(edgeComposite,
				GraphEditorMessages.getString("nodeB"), false);
		nodeBURIText.setText(edgeData.getNodeBURI().lastSegment());

		return edgeComposite;
	}

	/**
	 * Creates the Composite for EdgeLabel parameters.
	 * 
	 * @param parent
	 *            parent of the Composite
	 * @return Composite for EdgeLabel parameters
	 */
	private Composite createEdgeLabelComposite(Composite parent) {
		GraphConnection selectedEdge = (GraphConnection) zestGraph
				.getSelection().get(0);
		ConnectionData edgeData = (ConnectionData) selectedEdge.getData();
		EdgeLabel edgeLabel = edgeData.getEdgeLabel();
		Group edgeLabelComposite = new Group(parent, SWT.NONE);

		edgeLabelComposite.setText(GraphEditorMessages.getString("edgeLabel"));
		edgeLabelComposite.setLayout(new RowLayout(SWT.HORIZONTAL));

		if (edgeLabel instanceof MigrationEdgeLabel) {
			DynamicText edgeTypeText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("edgeType"), true);
			edgeTypeText
					.setText(GraphEditorMessages.getString("migrationEdge"));
			edgeTypeText.setEditable(false);

			DynamicText edgePopulationText = new DynamicText(
					edgeLabelComposite,
					GraphEditorMessages.getString("population"), true);
			edgePopulationText.setText(edgeData.getMigrationPopulation());
			edgePopulationText
					.addModifyListener(new TextAndButtonModifyListener(
							zestGraph,
							TextAndButtonModifyListener.MIGRATION_LABEL_POPULATION));

			Composite edgeAbsoluteComposite = new Composite(edgeLabelComposite,
					SWT.BORDER);
			edgeAbsoluteComposite.setLayout(new GridLayout());
			Button edgeAbsoluteButton = new Button(edgeAbsoluteComposite,
					SWT.CHECK);
			edgeAbsoluteButton.setLayoutData(new GridData(SWT.CENTER,
					SWT.CENTER, true, true));
			edgeAbsoluteButton.setText(GraphEditorMessages
					.getString("migrationAbsolute"));
			edgeAbsoluteButton.setSelection(edgeData.getMigrationAbsolute());
			edgeAbsoluteButton
					.addSelectionListener(new TextAndButtonModifyListener(
							zestGraph,
							TextAndButtonModifyListener.MIGRATION_LABEL_ABSOLUTE));

			DynamicText edgeRateText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("migrationRate"), true);
			edgeRateText.setText("" + edgeData.getMigrationRate());
			edgeRateText
					.addModifyListener(new TextAndButtonModifyListener(
							zestGraph,
							TextAndButtonModifyListener.MIGRATION_LABEL_RATE));

			DynamicText edgePeriodText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("period"), true);
			edgePeriodText.setText("" + edgeData.getMigrationPeriod());
			edgePeriodText.addModifyListener(new TextAndButtonModifyListener(
					zestGraph,
					TextAndButtonModifyListener.MIGRATION_LABEL_PERIOD));
		} else if (edgeLabel instanceof CommonBorderRelationshipLabel) {
			DynamicText edgeTypeText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("edgeType"), false);
			edgeTypeText.setText(GraphEditorMessages
					.getString("commonBorderEdge"));

			DynamicText edgeBorderText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("borderLength"), true);
			edgeBorderText.setText("" + edgeData.getCommonBorderLength());
			edgeBorderText.addModifyListener(new TextAndButtonModifyListener(
					zestGraph,
					TextAndButtonModifyListener.COMMON_BORDER_LABEL_LENGTH));
		} else if (edgeLabel instanceof RoadTransportRelationshipLabel) {
			DynamicText edgeTypeText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("edgeType"), false);
			edgeTypeText.setText(GraphEditorMessages.getString("roadEdge"));

			DynamicText edgeNameText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("roadName"), true);
			edgeNameText.setText(edgeData.getRoadName());
			edgeNameText.addModifyListener(new TextAndButtonModifyListener(
					zestGraph, TextAndButtonModifyListener.ROAD_LABEL_NAME));

			DynamicText edgeClassText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("roadClass"), true);
			edgeClassText.setText(edgeData.getRoadClass());
			edgeClassText.addModifyListener(new TextAndButtonModifyListener(
					zestGraph, TextAndButtonModifyListener.ROAD_LABEL_CLASS));

			DynamicText edgeCrossingsText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("numberCrossing"), true);
			edgeCrossingsText.setText("" + edgeData.getRoadCrossings());
			edgeCrossingsText
					.addModifyListener(new TextAndButtonModifyListener(
							zestGraph,
							TextAndButtonModifyListener.ROAD_LABEL_CROSSINGS));
		} else if (edgeLabel instanceof PipeTransportEdgeLabel) {
			DynamicText edgeTypeText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("edgeType"), false);
			edgeTypeText.setText(GraphEditorMessages.getString("pipeEdge"));

			DynamicText edgePopulationText = new DynamicText(
					edgeLabelComposite,
					GraphEditorMessages.getString("population"), true);
			edgePopulationText.setText(edgeData.getPipePopulation());
			edgePopulationText
					.addModifyListener(new TextAndButtonModifyListener(
							zestGraph,
							TextAndButtonModifyListener.PIPE_LABEL_POPULATION));

			DynamicText edgeFlowText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("pipeFlow"), true);
			edgeFlowText.setText("" + edgeData.getPipeFlow());
			edgeFlowText.addModifyListener(new TextAndButtonModifyListener(
					zestGraph, TextAndButtonModifyListener.PIPE_LABEL_FLOW));

			DynamicText edgePeriodText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("period"), true);
			edgePeriodText.setText("" + edgeData.getPipePeriod());
			edgePeriodText.addModifyListener(new TextAndButtonModifyListener(
					zestGraph, TextAndButtonModifyListener.PIPE_LABEL_PERIOD));
		} else if (edgeLabel instanceof RelativePhysicalRelationshipLabel) {
			DynamicText edgeTypeText = new DynamicText(edgeLabelComposite,
					GraphEditorMessages.getString("edgeType"), false);
			edgeTypeText.setText(GraphEditorMessages
					.getString("containmentEdge") + ":");
		}

		return edgeLabelComposite;
	}

	/**
	 * Creates a Composite that display the zoom factor and the LatLong
	 * coordinates of the cursor.
	 * 
	 * @param parent
	 *            parent of the Composite
	 * @return Composite created Composite
	 */
	private Composite createInfoComposite(Composite parent) {
		Group infoComposite = new Group(parent, SWT.NONE);
		Point2D.Double latLong = getLatLongFromCursorLocation(zestGraph
				.toControl(Display.getCurrent().getCursorLocation()));

		infoComposite.setText(GraphEditorMessages
				.getString("displayInformation"));
		infoComposite.setLayout(new RowLayout(SWT.HORIZONTAL));

		coordinatesText = new DynamicText(infoComposite,
				GraphEditorMessages.getString("coordinates"), false);
		coordinatesText.setText(formatLatLon(latLong.y, latLong.x));

		zoomText = new DynamicText(infoComposite,
				GraphEditorMessages.getString("zoom"), false);
		zoomText.setText(formatDouble(zoomFactor));

		return infoComposite;
	}

	/**
	 * Creates a Composite with Buttons for saving the Graph, quitting the
	 * GraphEditor and Undoing Node Translations.
	 * 
	 * @param parent
	 *            parent of the Composite
	 * @return Composite created Composite
	 */
	private Composite createButtonsComposite(Composite parent) {
		Composite toolBar = new Composite(parent, SWT.NONE);
		undoButton = new Button(toolBar, SWT.PUSH);
		Button saveButton = new Button(toolBar, SWT.PUSH);
		Button saveAsButton = new Button(toolBar, SWT.PUSH);
		Button quitButton = new Button(toolBar, SWT.PUSH);

		toolBar.setLayout(new RowLayout(SWT.HORIZONTAL));

		undoButton.setText(GraphEditorMessages.getString("undoTranslation"));
		saveButton.setText(GraphEditorMessages.getString("saveGraph"));
		saveAsButton.setText(GraphEditorMessages.getString("saveGraphAs"));
		quitButton.setText(GraphEditorMessages.getString("quit"));

		if (centersHistory.isEmpty()) {
			undoButton.setEnabled(false);
		}

		undoButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Map<URI, Point2D.Double> lastCenters = centersHistory
						.pollLast();

				if (lastCenters == null) {
					return;
				}

				if (centersHistory.isEmpty()) {
					undoButton.setEnabled(false);
				}

				for (GraphNode node : graphNodes.values()) {
					NodeData nodeData = (NodeData) node.getData();
					Point2D.Double lastCenter = lastCenters.get(nodeData
							.getNodeURI());
					double diffX = lastCenter.x - nodeData.getOrigX();
					double diffY = lastCenter.y - nodeData.getOrigY();

					if (diffX != 0 || diffY != 0) {
						addTranslationToNode(node, diffX, diffY);
					}
				}

				redraw();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		saveButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				saveGraphList();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		saveAsButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				saveStemGraphAs();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		quitButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		return toolBar;
	}

	/**
	 * Adds a menu bar to the shell.
	 */
	private void addMenuBar() {
		Menu menuBar = new Menu(shell, SWT.BAR);
		MenuItem fileMenuItem = new MenuItem(menuBar, SWT.CASCADE);
		Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
		MenuItem fileSaveItem = new MenuItem(fileMenu, SWT.PUSH);

		fileMenuItem.setText(GraphEditorMessages.getString("file"));
		fileMenuItem.setMenu(fileMenu);
		fileSaveItem.setText(GraphEditorMessages.getString("saveAs"));
		fileSaveItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.SAVE);

				dialog.setFilterNames(new String[] { "SVG Files" });
				dialog.setFilterExtensions(new String[] { "*.svg" });
				dialog.setFileName("graph.svg");

				String fileName = dialog.open();

				if (fileName != null) {
					saveZestGraphAsSVG(fileName);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		shell.setMenuBar(menuBar);
	}

	/**
	 * Adds Listeners to the Zest Graph for moving the mouse, dragging, using
	 * the mouse wheel and selecting nodes.
	 */
	private void addZestGraphListeners() {
		// This removes the dragging support of the Zest library. It would
		// interfere with our listeners.
		zestGraph.getLightweightSystem().setEventDispatcher(
				new SWTEventDispatcher() {
					public void dispatchMouseMoved(MouseEvent me) {
						// Do nothing
					}
				});

		zestGraph.addMouseListener(new MouseListener() {

			public void mouseDown(MouseEvent e) {
				if (e.button == 1) {
					IFigure figureUnderMouse = zestGraph.getFigureAt(e.x, e.y);

					if (figureUnderMouse == null) {
						zestGraph.setSelection(new GraphItem[0]);
						updateShell(0);
					}

					lastCursorX = Display.getCurrent().getCursorLocation().x;
					lastCursorY = Display.getCurrent().getCursorLocation().y;
					leftMouseButtonPressed = true;
					currentCenters = new HashMap<URI, Point2D.Double>();
					centersMoved = false;

					for (GraphNode node : graphNodes.values()) {
						NodeData nodeData = (NodeData) node.getData();
						Point2D.Double center = new Point2D.Double(nodeData
								.getOrigX(), nodeData.getOrigY());

						currentCenters.put(nodeData.getNodeURI(), center);
					}
				}
			}

			public void mouseUp(MouseEvent e) {
				if (e.button == 1) {
					leftMouseButtonPressed = false;

					if (centersMoved) {
						centersHistory.add(currentCenters);
						undoButton.setEnabled(true);
					}
				}
			}

			public void mouseDoubleClick(MouseEvent e) {
			}
		});

		zestGraph.addMouseMoveListener(new MouseMoveListener() {

			public void mouseMove(MouseEvent e) {
				Point xy = zestGraph.toControl(Display.getCurrent()
						.getCursorLocation());
				Point2D.Double latLong = getLatLongFromCursorLocation(xy);

				coordinatesText.setText(formatLatLon(latLong.y, latLong.x));

				if (!leftMouseButtonPressed) {
					return;
				}

				int x = Display.getCurrent().getCursorLocation().x;
				int y = Display.getCurrent().getCursorLocation().y;
				int diffX = x - lastCursorX;
				int diffY = y - lastCursorY;

				lastCursorX = x;
				lastCursorY = y;

				if (diffX == 0 && diffY == 0) {
					return;
				}

				if (zestGraph.getSelection().isEmpty()) {
					translationX += diffX;
					translationY += diffY;
					redraw();
				} else {
					List<GraphNode> selectedNodes = new ArrayList<GraphNode>();

					for (Object selectedItem : zestGraph.getSelection()) {
						if (selectedItem instanceof GraphNode) {
							selectedNodes.add((GraphNode) selectedItem);
						}
					}

					for (GraphNode node : selectedNodes) {
						addTranslationToNode(node, diffX / scaleX, diffY
								/ scaleY);
					}

					if (!selectedNodes.isEmpty()) {
						centersMoved = true;
						redraw();
					}

					if (zestGraph.getSelection().size() == 1
							&& zestGraph.getSelection().get(0) instanceof GraphNode) {
						GraphNode selectedNode = (GraphNode) zestGraph
								.getSelection().get(0);
						NodeData nodeData = (NodeData) selectedNode.getData();

						nodeCoordinatesText.setText(formatLatLon(
								nodeData.getOrigY(), nodeData.getOrigX()));
					}
				}
			}
		});

		zestGraph.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				updateShell(0);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		zestGraph.addMouseWheelListener(new MouseWheelListener() {

			public void mouseScrolled(MouseEvent e) {
				Point2D.Double p = getLatLongFromCursorLocation(zestGraph
						.toControl(Display.getCurrent().getCursorLocation()));

				if (e.count >= 0) {
					translationX -= 0.1 * scaleX * p.x;
					translationY -= 0.1 * scaleY * p.y;
					scaleX *= 1.1;
					scaleY *= 1.1;

					zoomFactor *= 1.1;
				} else {
					scaleX /= 1.1;
					scaleY /= 1.1;
					translationX += 0.1 * scaleX * p.x;
					translationY += 0.1 * scaleY * p.y;

					zoomFactor /= 1.1;
				}

				Point xy = zestGraph.toControl(Display.getCurrent()
						.getCursorLocation());
				Point2D.Double latLong = getLatLongFromCursorLocation(xy);

				coordinatesText.setText(formatLatLon(latLong.y, latLong.x));
				zoomText.setText(formatDouble(zoomFactor));
				redraw();
			}
		});
	}

	/**
	 * Adds a context menu to the Zest graph based on the current selection in
	 * the graph.
	 */
	private void addZestGraphContextMenu() {
		List<?> selection = zestGraph.getSelection();
		Menu menu = new Menu(zestGraph.getShell(), SWT.POP_UP);

		if (selection.isEmpty()) {
			createAddNodeItem(menu);
		} else if (selection.size() == 1
				&& selection.get(0) instanceof GraphNode) {
			createRemoveNodeItem(menu);
			createAddLabelItem(menu);
			createRemoveLabelItem(menu);
		} else if (selection.size() == 1
				&& selection.get(0) instanceof GraphConnection) {
			createRemoveEdgeItem(menu);
		} else if (selection.size() == 2
				&& selection.get(0) instanceof GraphNode
				&& selection.get(1) instanceof GraphNode) {
			createAddEdgeItem(menu);
		} else {
			MenuItem noOptionsItem = new MenuItem(menu, SWT.CASCADE);

			noOptionsItem.setText(GraphEditorMessages.getString("noActions"));
		}

		zestGraph.setMenu(menu);
	}

	/**
	 * Creates a context menu item to add a Node.
	 * 
	 * @param menu
	 *            the context menu
	 */
	private void createAddNodeItem(Menu menu) {
		MenuItem addNode = new MenuItem(menu, SWT.PUSH);

		addNode.setText(GraphEditorMessages.getString("addNode"));

		addNode.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				Point2D.Double p = getLatLongFromCursorLocation(zestGraph
						.toControl(Display.getCurrent().getCursorLocation()));
				NewNodeDialog dialog = new NewNodeDialog(shell);

				if (!dialog.hasResult()) {
					return;
				}

				String identifier = dialog.getIdentifier();
				double size = dialog.getSize();
				Node node = NodesFactory.eINSTANCE.createRegion();
				LatLong latlon = new LatLong();
				SegmentBuilder builder = new SegmentBuilder();

				builder.add(p.y - size / 2, p.x - size / 2);
				builder.add(p.y + size / 2, p.x - size / 2);
				builder.add(p.y + size / 2, p.x + size / 2);
				builder.add(p.y - size / 2, p.x + size / 2);
				builder.add(p.y - size / 2, p.x - size / 2);
				latlon.add(builder.toSegment());
				node.getDublinCore().setTitle("");
				node.setURI(STEMURI
						.createURI(Region.URI_TYPE_REGION_NODE_SEGMENT + "/"
								+ identifier));
				node.getDublinCore().setSpatial(
						InlineLatLongDataProvider
								.createSpatialInlineURIString(latlon));

				GraphNode gn = processNode(node);

				addNodeToStemGraph(node);
				zestGraph.setSelection(new GraphItem[] { gn });
				redraw();
				updateShell(0);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	/**
	 * Creates a context menu item to add a NodeLabel.
	 * 
	 * @param menu
	 *            the context menu
	 */
	private void createAddLabelItem(Menu menu) {
		MenuItem addLabelItem = new MenuItem(menu, SWT.CASCADE);
		Menu addLabelMenu = new Menu(zestGraph.getShell(), SWT.DROP_DOWN);
		MenuItem addAreaLabelItem = new MenuItem(addLabelMenu, SWT.PUSH);
		MenuItem addPopulationLabelItem = new MenuItem(addLabelMenu, SWT.PUSH);

		addLabelItem.setText(GraphEditorMessages.getString("addLabel"));
		addAreaLabelItem.setText(GraphEditorMessages.getString("addAreaLabel"));
		addPopulationLabelItem.setText(GraphEditorMessages
				.getString("addPopulationLabel"));
		addLabelItem.setMenu(addLabelMenu);

		addAreaLabelItem.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				addNodeLabel(LabelsPackage.Literals.AREA_LABEL);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		addPopulationLabelItem.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				addNodeLabel(LabelsPackage.Literals.POPULATION_LABEL);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	/**
	 * Creates a context menu item to add an Edge.
	 * 
	 * @param menu
	 *            the context menu
	 */
	private void createAddEdgeItem(Menu menu) {
		MenuItem addEdgeItem = new MenuItem(menu, SWT.CASCADE);
		Menu addEdgeMenu = new Menu(zestGraph.getShell(), SWT.DROP_DOWN);
		MenuItem addMigrationEdge = new MenuItem(addEdgeMenu, SWT.PUSH);
		MenuItem addCommonBorderEdge = new MenuItem(addEdgeMenu, SWT.PUSH);
		MenuItem addRoadTransportEdge = new MenuItem(addEdgeMenu, SWT.PUSH);
		MenuItem addPipeTransportEdge = new MenuItem(addEdgeMenu, SWT.PUSH);

		addEdgeItem.setText(GraphEditorMessages.getString("addEdge"));
		addMigrationEdge.setText(GraphEditorMessages
				.getString("addMigrationEdge"));
		addCommonBorderEdge.setText(GraphEditorMessages
				.getString("addCommonBorderEdge"));
		addRoadTransportEdge.setText(GraphEditorMessages
				.getString("addRoadEdge"));
		addPipeTransportEdge.setText(GraphEditorMessages
				.getString("addPipeEdge"));
		addEdgeItem.setMenu(addEdgeMenu);

		addCommonBorderEdge.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				addEdge(LabelsPackage.Literals.COMMON_BORDER_RELATIONSHIP_LABEL);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		addMigrationEdge.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				addEdge(EdgesPackage.Literals.MIGRATION_EDGE_LABEL);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		addRoadTransportEdge.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				addEdge(LabelsPackage.Literals.ROAD_TRANSPORT_RELATIONSHIP_LABEL);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		addPipeTransportEdge.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				addEdge(TransportPackage.Literals.PIPE_TRANSPORT_EDGE_LABEL);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	/**
	 * Creates a context menu item to remove a Node.
	 * 
	 * @param menu
	 *            the context menu
	 */
	private void createRemoveNodeItem(Menu menu) {
		MenuItem removeNode = new MenuItem(menu, SWT.PUSH);

		removeNode.setText(GraphEditorMessages.getString("removeNode"));

		removeNode.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				GraphNode selectedNode = (GraphNode) zestGraph.getSelection()
						.get(0);
				NodeData nodeData = (NodeData) selectedNode.getData();
				List<URI> edgesToRemove = new ArrayList<URI>();

				for (Map.Entry<URI, GraphConnection> entry : graphConnections
						.entrySet()) {
					if (selectedNode == entry.getValue().getSource()
							|| selectedNode == entry.getValue()
									.getDestination()) {
						entry.getValue().dispose();
						edgesToRemove.add(entry.getKey());
					}
				}

				for (URI edgeURI : edgesToRemove) {
					graphConnections.remove(edgeURI);
				}

				zestGraph.setSelection(new GraphItem[] {});
				graphNodes.remove(nodeData.getNodeURI());
				graphPolygons.remove(nodeData.getNodeURI());
				selectedNode.dispose();
				removeNodeFromStemGraph(nodeData.getNode());
				updateShell(0);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	/**
	 * Creates a context menu item to remove a NodeLabel.
	 * 
	 * @param menu
	 *            the context menu
	 */
	private void createRemoveLabelItem(Menu menu) {
		MenuItem removeLabelItem = new MenuItem(menu, SWT.CASCADE);
		GraphNode selectedNode = (GraphNode) zestGraph.getSelection().get(0);
		NodeData nodeData = (NodeData) selectedNode.getData();

		removeLabelMenu = new Menu(zestGraph.getShell(), SWT.DROP_DOWN);
		removeLabelItem.setText(GraphEditorMessages.getString("removeLabel"));
		removeLabelItem.setMenu(removeLabelMenu);

		for (NodeLabel label : nodeData.getNodeLabels()) {
			MenuItem item = new MenuItem(removeLabelMenu, SWT.PUSH);

			if (label instanceof AreaLabel) {
				item.setText(GraphEditorMessages.getString("areaLabel"));
			} else if (label instanceof PopulationLabel) {
				String population = ((PopulationLabel) label)
						.getPopulationIdentifier();

				item.setText(GraphEditorMessages.getString("populationLabel")
						+ " (" + population + ")");
			}

			item.addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					MenuItem item = (MenuItem) e.getSource();
					Menu menu = item.getParent();
					List<MenuItem> allItems = Arrays.asList(menu.getItems());
					int index = allItems.indexOf(item);
					List<?> selection = zestGraph.getSelection();
					GraphNode selectedNode = (GraphNode) selection.get(0);
					NodeData nodeData = (NodeData) selectedNode.getData();
					NodeLabel label = nodeData.getNodeLabels().get(index);

					removeNodeLabelFromStemGraph(label);
					updateShell(0);
				}

				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
		}
	}

	/**
	 * Creates a context menu item to remove an Edge.
	 * 
	 * @param menu
	 *            the context menu
	 */
	private void createRemoveEdgeItem(Menu menu) {
		MenuItem removeEdge = new MenuItem(menu, SWT.PUSH);

		removeEdge.setText(GraphEditorMessages.getString("removeEdge"));

		removeEdge.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				List<?> selectedItems = zestGraph.getSelection();
				GraphConnection selectedEdge = (GraphConnection) selectedItems
						.get(0);
				ConnectionData edgeData = (ConnectionData) selectedEdge
						.getData();

				zestGraph.setSelection(new GraphItem[] {});
				selectedEdge.dispose();
				removeEdgeFromStemGraph(edgeData.getEdge());
				updateShell(0);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	/**
	 * Updates the NodeLabel-ComboBox and the ContextMenu, when a population
	 * identifier changes.
	 * 
	 * @param index
	 *            index of the PopulationLabel in the list
	 * @param newValue
	 *            new value of the identifier
	 */
	private void populationIdentifierChanged(int index, String newValue) {
		String newString = GraphEditorMessages.getString("populationLabel")
				+ " (" + newValue + ")";

		nodeLabelTypeCombo.setItem(index, newString);
		removeLabelMenu.getItems()[index].setText(newString);
	}

	/**
	 * Reads the geographic information of a Node, computes the center and
	 * creates a Zest GraphNode for this Node.
	 * 
	 * @param node
	 *            Node to be processed
	 * @return created Zest GraphNode
	 */
	@SuppressWarnings("unlikely-arg-type")
	private GraphNode processNode(Node node) {
		LatLongProvider latLongProvider = (LatLongProvider) LatLongProviderAdapterFactory.INSTANCE
				.adaptNew(node, LatLongProvider.class);
		List<Segment> segments = latLongProvider.getLatLong().getSegments();
		Set<Polygon> displayPolys = new HashSet<Polygon>();
		int graphListIndex = 0;
		double largestPolygonArea = 0.0;
		Point2D.Double center = null;

		for (int i = 0; i < graphList.size(); i++) {
			if (graphList.get(i).getNodes().get(node.getURI()) != null) {
				graphListIndex = i;
				break;
			}
		}

		for (Segment segment_tmp : segments) {
			Polygon dPolygon = new Polygon(segment_tmp);

			displayPolys.add(dPolygon);

			if (dPolygon.getArea() > largestPolygonArea) {
				largestPolygonArea = dPolygon.getArea();
				center = dPolygon.getCentroid();
			}
		}

		node.eAdapters().remove(latLongProvider);

		if (center != null) {
			GraphNode graphCenterNode = new GraphNode(zestGraph, SWT.NONE, "");

			graphCenterNode.setData(new NodeData(node, center.x, center.y, 0,
					graphListIndex));
			setNodeColor(graphCenterNode);
			graphPolygons.put(node.getURI(), displayPolys);
			graphNodes.put(node.getURI(), graphCenterNode);

			return graphCenterNode;
		}

		return null;
	}

	/**
	 * Reads in an Edge and creates a Zest GraphConnection for this Edge.
	 * 
	 * @param node
	 *            Edge to be processed
	 * @return created Zest GraphConnection
	 */
	private GraphConnection processEdge(Edge edge) {
		URI nodeAURI = edge.getNodeAURI();
		URI nodeBURI = edge.getNodeBURI();
		URI edgeURI = edge.getURI();

		if (nodeAURI.toString().compareTo(nodeBURI.toString()) > 0) {
			URI mem = nodeAURI;

			nodeAURI = nodeBURI;
			nodeBURI = mem;
		}

		if ((graphNodes.get(nodeAURI) != null)
				&& (graphNodes.get(nodeBURI) != null)) {
			GraphConnection gc = new GraphConnection(zestGraph, SWT.NONE,
					graphNodes.get(nodeAURI), graphNodes.get(nodeBURI));

			gc.setData(new ConnectionData(edge, 0));
			setEdgeColor(gc);
			preventOverlay(gc);
			graphConnections.put(edgeURI, gc);

			return gc;
		}

		return null;
	}

	/**
	 * Creates a new NodeLabel of the specified class and adds it to the Graph.
	 * 
	 * @param labelClass
	 *            class of the NodeLabel
	 */
	private void addNodeLabel(EClass labelClass) {
		List<?> selectedItems = zestGraph.getSelection();
		GraphItem selectedNode = (GraphItem) selectedItems.get(0);
		NodeData nodeData = (NodeData) selectedNode.getData();
		NodeLabel label = null;

		if (labelClass == LabelsPackage.Literals.AREA_LABEL) {
			label = LabelsFactory.eINSTANCE.createAreaLabel();
			((AreaLabel) label).getCurrentAreaValue().setArea(0.0);
			label.setURIOfIdentifiableToBeLabeled(nodeData.getNodeURI());
			label.setNode(nodeData.getNode());
		} else if (labelClass == LabelsPackage.Literals.POPULATION_LABEL) {
			label = LabelsFactory.eINSTANCE.createPopulationLabel();
			((PopulationLabel) label).setPopulationIdentifier("");
			((PopulationLabel) label).setPopulatedArea(0.0);
			((PopulationLabel) label).getCurrentPopulationValue().setCount(0);
			label.setURIOfIdentifiableToBeLabeled(nodeData.getNodeURI());
			label.setNode(nodeData.getNode());
		}

		addNodeLabelToStemGraph(label);
		updateShell(nodeData.getNodeLabels().size() - 1);
	}

	/**
	 * Creates a new Edge whose Label is of the specified class and adds the
	 * Edge to the Graph.
	 * 
	 * @param labelClass
	 *            class of the EdgeLabel
	 */
	private void addEdge(EClass labelClass) {
		List<?> selectedItems = zestGraph.getSelection();
		GraphNode selectedNodeA = (GraphNode) selectedItems.get(0);
		GraphNode selectedNodeB = (GraphNode) selectedItems.get(1);
		NodeData nodeDataA = (NodeData) selectedNodeA.getData();
		NodeData nodeDataB = (NodeData) selectedNodeB.getData();
		Node nodeA = nodeDataA.getNode();
		Node nodeB = nodeDataB.getNode();
		Edge edge = null;

		if (labelClass == EdgesPackage.Literals.MIGRATION_EDGE_LABEL) {
			edge = createMigrationEdge(nodeA, nodeB);
		} else if (labelClass == LabelsPackage.Literals.COMMON_BORDER_RELATIONSHIP_LABEL) {
			edge = createCommonBorderEdge(nodeA, nodeB);
		} else if (labelClass == LabelsPackage.Literals.ROAD_TRANSPORT_RELATIONSHIP_LABEL) {
			edge = createRoadTransportEdge(nodeA, nodeB);
		} else if (labelClass == TransportPackage.Literals.PIPE_TRANSPORT_EDGE_LABEL) {
			edge = createPipeTransportEdge(nodeA, nodeB);
		}

		GraphConnection gc = processEdge(edge);

		addEdgeToStemGraph(edge);
		zestGraph.setSelection(new GraphItem[] { gc });
		updateShell(0);
	}

	/**
	 * Creates a new CommonBorderEdge between nodeA and nodeB.
	 * 
	 * @param nodeA
	 *            one Node
	 * @param nodeB
	 *            the other Node
	 * @return created CommonBorderEdge
	 */
	private Edge createCommonBorderEdge(Node nodeA, Node nodeB) {
		Edge cbrEdge = EdgeImpl.createEdge(nodeA, nodeB);
		CommonBorderRelationshipLabel cbrLabel = LabelsFactory.eINSTANCE
				.createCommonBorderRelationshipLabel();
		CommonBorderRelationshipLabelValue cbrLabelValue = (CommonBorderRelationshipLabelValue) cbrLabel
				.getCurrentValue();

		cbrEdge.setURI(getRandomURI(Edge.URI_TYPE_EDGE_SEGMENT
				+ "/relationship/commonborder"));
		cbrEdge.setLabel(cbrLabel);
		cbrEdge.getDublinCore().setTitle(
				createEdgeTitle(nodeA, nodeB, "Edge", false));
		cbrLabel.setURIOfIdentifiableToBeLabeled(cbrEdge.getURI());
		cbrLabelValue.setBorderLength(0.0);

		return cbrEdge;
	}

	/**
	 * Creates a new MigrationEdge from nodeA to nodeB.
	 * 
	 * @param nodeA
	 *            origin Node
	 * @param nodeB
	 *            destination Node
	 * @return created MigrationEdge
	 */
	private MigrationEdge createMigrationEdge(Node nodeA, Node nodeB) {
		MigrationEdge mEdge = EdgesFactory.eINSTANCE.createMigrationEdge();

		mEdge.setURI(getRandomURI(MigrationEdge.URI_TYPE_MIGRATION_EDGE_SEGMENT));
		mEdge.setNodeAURI(nodeA.getURI());
		mEdge.setNodeBURI(nodeB.getURI());
		mEdge.getLabel().setURIOfIdentifiableToBeLabeled(mEdge.getURI());
		mEdge.getLabel().getCurrentValue().setMigrationRate(0.0);
		mEdge.getDublinCore().setTitle(
				createEdgeTitle(nodeA, nodeB, "MigrationEdge", true));
		mEdge.setPopulationIdentifier("");

		return mEdge;
	}

	/**
	 * Creates a new RoadTransportEdge between nodeA and nodeB.
	 * 
	 * @param nodeA
	 *            one Node
	 * @param nodeB
	 *            the other Node
	 * @return created RoadTransportEdge
	 */
	private Edge createRoadTransportEdge(Node nodeA, Node nodeB) {
		Edge edge = RoadTransportRelationshipLabelImpl
				.createRoadTransportRelationship(nodeA, nodeB, "", "", 0);

		edge.setURI(getRandomURI(Edge.URI_TYPE_EDGE_SEGMENT + "/road"));
		edge.getLabel().setURIOfIdentifiableToBeLabeled(edge.getURI());
		edge.getDublinCore().setTitle(
				createEdgeTitle(nodeA, nodeB, "RoadEdge", false));

		return edge;
	}

	/**
	 * Creates a new PipeTransportEdge from nodeA to nodeB.
	 * 
	 * @param nodeA
	 *            origin Node
	 * @param nodeB
	 *            destination Node
	 * @return created PipeTransportEdge
	 */
	private Edge createPipeTransportEdge(Node nodeA, Node nodeB) {
		PipeTransportEdge edge = TransportFactory.eINSTANCE
				.createPipeTransportEdge();
		PipeTransportEdgeLabelValue edgeValue = TransportFactory.eINSTANCE
				.createPipeTransportEdgeLabelValue();

		edge.setURI(getRandomURI(PipeTransportEdgeImpl.URI_TYPE_PIPE_TRANSPORT_EDGE_SEGMENT));
		edge.setA(nodeA);
		edge.setB(nodeB);
		edge.setNodeAURI(nodeA.getURI());
		edge.setNodeBURI(nodeB.getURI());
		edge.getLabel().setURIOfIdentifiableToBeLabeled(edge.getURI());
		edge.getLabel().setCurrentValue(edgeValue);
		edge.getDublinCore().setTitle(
				createEdgeTitle(nodeA, nodeB, "Pipe", true));
		edge.setPopulationIdentifier("");
		edgeValue.setMaxFlow(0.0);
		edgeValue.setTimePeriod(86400000);

		return edge;
	}

	/**
	 * Adds the Node to stemGraph and to one of the Graphs in graphList.
	 * 
	 * @param node
	 *            Node to add
	 */
	private void addNodeToStemGraph(Node node) {
		stemGraph.getNodes().put(node.getURI(), node);
		graphList.get(0).getNodes()
				.put(node.getURI(), (Node) EcoreUtil.copy(node));
	}

	/**
	 * Adds the Edge to stemGraph and to one appropriate Graph in graphList.
	 * 
	 * @param edge
	 *            Edge to add
	 */
	private void addEdgeToStemGraph(Edge edge) {
		stemGraph.getEdges().put(edge.getURI(), edge);

		for (Graph graph : graphList) {
			if (graph.getNodes().containsKey(edge.getNodeAURI())) {
				graph.getEdges().put(edge.getURI(), EcoreUtil.copy(edge));
			}
		}
	}

	/**
	 * Adds the NodeLabel to stemGraph and to one appropriate Graph in
	 * graphList.
	 * 
	 * @param nodeLabel
	 *            NodeLabel to add
	 */
	private void addNodeLabelToStemGraph(NodeLabel nodeLabel) {
		NodeLabel nodeLabelCopy = EcoreUtil.copy(nodeLabel);
		URI nodeURI = nodeLabel.getURIOfIdentifiableToBeLabeled();

		stemGraph.getNodeLabels().put(nodeLabel.getURI(), nodeLabel);
		stemGraph.getNode(nodeURI).getLabels().add(nodeLabel);

		for (Graph graph : graphList) {
			if (graph.getNodes().containsKey(nodeURI)) {
				graph.getNodeLabels().put(nodeLabel.getURI(), nodeLabelCopy);
				graph.getNode(nodeURI).getLabels().add(nodeLabelCopy);
			}
		}
	}

	/**
	 * Removes the Node from stemGraph and from the Graphs in graphList that
	 * contains this Node. All NodeLabels of the Node and all Edges connected to
	 * this Node are also removed.
	 * 
	 * @param node
	 *            Node to remove
	 */
	private void removeNodeFromStemGraph(Node node) {
		URI nodeURI = node.getURI();
		List<URI> nodeLabelsToRemove = new ArrayList<URI>();
		List<URI> edgesToRemove = new ArrayList<URI>();

		for (NodeLabel nodeLabel : node.getLabels()) {
			nodeLabelsToRemove.add(nodeLabel.getURI());
		}

		for (Edge edge : stemGraph.getEdges().values()) {
			if (edge.getNodeAURI().equals(nodeURI)
					|| edge.getNodeBURI().equals(nodeURI)) {
				edgesToRemove.add(edge.getURI());
			}
		}

		for (URI nodeLabelURI : nodeLabelsToRemove) {
			stemGraph.getNodeLabels().removeKey(nodeLabelURI);
		}

		for (URI edgeURI : edgesToRemove) {
			stemGraph.getEdges().removeKey(edgeURI);
		}

		stemGraph.getNodes().removeKey(nodeURI);

		for (Graph graph : graphList) {
			for (URI nodeLabelURI : nodeLabelsToRemove) {
				graph.getNodeLabels().removeKey(nodeLabelURI);
			}

			for (URI edgeURI : edgesToRemove) {
				graph.getEdges().removeKey(edgeURI);
			}

			graph.getNodes().removeKey(nodeURI);
		}
	}

	/**
	 * Removes the Edge from stemGraph and from the Graphs in graphList that
	 * contains this Edge.
	 * 
	 * @param edge
	 *            Edge to remove
	 */
	private void removeEdgeFromStemGraph(Edge edge) {
		URI edgeURI = edge.getURI();

		stemGraph.getEdges().removeKey(edgeURI);

		for (Graph graph : graphList) {
			graph.getEdges().removeKey(edgeURI);
		}
	}

	/**
	 * Removes the NodeLabel from stemGraph and from the Graphs in graphList
	 * that contains this NodeLabel. The NodeLabel is also removed from the
	 * LabelList of its Node.
	 * 
	 * @param nodeLabel
	 *            NodeLabel to remove
	 */
	private void removeNodeLabelFromStemGraph(NodeLabel nodeLabel) {
		URI labelURI = nodeLabel.getURI();
		URI nodeURI = nodeLabel.getURIOfIdentifiableToBeLabeled();

		stemGraph.getNode(nodeURI).getLabels()
				.remove(stemGraph.getNodeLabel(labelURI));
		stemGraph.getNodeLabels().removeKey(labelURI);

		NodeLabel labelToRemove = null;

		for (Graph graph : graphList) {
			labelToRemove = graph.getNodeLabels().removeKey(labelURI);
		}

		for (Graph graph : graphList) {
			if (graph.getNodes().containsKey(nodeURI)) {
				graph.getNode(nodeURI).getLabels().remove(labelToRemove);
			}
		}
	}

	/**
	 * Saves the zestGraph and the polygons to the specified SVG file.
	 * 
	 * @param fileName
	 *            name of SVG file
	 */
	private void saveZestGraphAsSVG(String fileName) {
		try {
			Rectangle area = zestGraph.getClientArea();
			DOMImplementation domImpl = GenericDOMImplementation
					.getDOMImplementation();
			Document document = domImpl.createDocument(null, "svg", null);
			SVGGraphics2D svgGenerator = new SVGGraphics2D(document);
			Writer outsvg = new OutputStreamWriter(new FileOutputStream(
					fileName), "UTF-8");
			GraphicsToAWT swtGraphics = new GraphicsToAWT(svgGenerator,
					new Dimension(area.width, area.height));

			svgGenerator.setSVGCanvasSize(new java.awt.Dimension(area.width,
					area.height));
			zestGraph.getRootLayer().paint(swtGraphics);
			swtGraphics.setLineWidth(0);
			swtGraphics.setLineStyle(SWT.LINE_SOLID);
			swtGraphics.setForegroundColor(ColorConstants.lightGray);

			for (Set<Polygon> polySet : graphPolygons.values()) {
				for (Polygon displayPolygon : polySet) {
					swtGraphics.drawPolygon(polygon2IntArray(displayPolygon));
				}
			}

			svgGenerator.stream(outsvg, true);
			outsvg.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Saves the Graph to a single new file.
	 */
	private void saveStemGraphAs() {
		SaveInProjectDialog saveAsDialog = new SaveInProjectDialog(
				PlatformUI.getWorkbench().getDisplay().getActiveShell());

		saveAsDialog.open();

		if (saveAsDialog.getResult() == null) {
			return;
		}

		IFile saveAsFile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(saveAsDialog.getResult());

		saveGraph(stemGraph, saveAsFile.getProject(),
				URI.createPlatformResourceURI(saveAsFile.getFullPath()
						.toString(), false));

		PlatformLatLongDataProvider.flush();

		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			Activator.logError(e.getMessage(), e);
		}
	}

	/**
	 * Saves the Graph to its original files.
	 */
	private void saveGraphList() {
		for (Model model : modelList) {
			EList<Graph> modelGraphs = model.getGraphs();

			for (int i = 0; i < modelGraphs.size(); i++) {
				URI graphURI = modelGraphs.get(i).getURI();

				for (Graph graph : graphList) {
					if (graph.getURI().equals(graphURI)) {
						modelGraphs.set(i, graph);
						break;
					}
				}
			}
		}

		for (Graph graph : graphList) {
			saveGraph(graph, project, graph.getURI());
		}

		for (Model model : modelList) {
			if (model.getURI().isPlatformResource()) {
				List<Identifiable> identifiables = new ArrayList<Identifiable>();
				URI uri = model.getURI();

				identifiables.add(model);
				addContainments(identifiables, model);

				try {
					Utility.serializeIdentifiables(identifiables, uri);
				} catch (IOException e) {
					Activator.logError(e.getMessage(), e);
				}
			}
		}

		PlatformLatLongDataProvider.flush();

		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			Activator.logError(e.getMessage(), e);
		}
	}

	/**
	 * Adds all Graphs and Models, that are contained in model and that are no
	 * platform resources.
	 * 
	 * @param identifiables
	 *            List to add the containments to
	 * @param model
	 *            Model whose containments should be added
	 */
	private void addContainments(List<Identifiable> identifiables, Model model) {
		for (Graph subGraph : model.getGraphs()) {
			if (!subGraph.getURI().isPlatformResource()) {
				identifiables.add(subGraph);
			}
		}

		for (Model subModel : model.getModels()) {
			if (!subModel.getURI().isPlatformResource()) {
				identifiables.add(subModel);
				addContainments(identifiables, subModel);
			}
		}
	}

	/**
	 * Saves the geographic information of the Graph to a XML file and also
	 * saves the Graph itself to a file, if it is a platform resource.
	 * 
	 * @param graph
	 *            Graph to save
	 * @param project
	 *            project to save Graph in
	 * @param newURI
	 *            new URI of Graph
	 */
	private void saveGraph(Graph graph, IProject project, URI newURI) {
		graph.setURI(newURI);
		updateGraph(graph);
		graph.getDublinCore().setTitle("");

		String fileBaseName = graph.getURI().lastSegment()
				.substring(0, graph.getURI().lastSegment().lastIndexOf("."));
		String tail = project.getName() + "/.gml/" + fileBaseName + "_MAP.xml";
		Map<URI, Set<Polygon>> currentGraphPolygons = new HashMap<URI, Set<Polygon>>();

		if (!project.getFolder(".gml").exists()) {
			IProgressMonitor monitor = new NullProgressMonitor();

			try {
				project.getFolder(".gml").create(false, true, monitor);
			} catch (CoreException e) {
				Activator.logError(e.getMessage(), e);
			} finally {
				monitor.done();
			}
		}

		for (Node n : graph.getNodes().values()) {
			Set<Polygon> displayPolygons = graphPolygons.get(n.getURI());
			String spatialString = n.getDublinCore().getSpatial();

			if (spatialString
					.contains(SpatialProviderAdapter.STEM_SPATIAL_SCHEME_PREFIX
							+ "inline")) {
				LatLong latlon = new LatLong();

				for (Polygon p : displayPolygons) {
					SegmentBuilder sb = new SegmentBuilder();

					for (int i = 0; i < p.npoints; i++) {
						sb.add(p.y[i], p.x[i]);
					}

					latlon.add(sb.toSegment());
				}

				n.getDublinCore().setSpatial(
						InlineLatLongDataProvider
								.createSpatialInlineURIString(latlon));
			} else if (spatialString
					.contains(SpatialProviderAdapter.STEM_SPATIAL_SCHEME_PREFIX
							+ "platform")) {
				String newSpatialString = SpatialProviderAdapter.STEM_SPATIAL_SCHEME_PREFIX
						+ "platform:/resource/"
						+ tail
						+ "#"
						+ n.getURI().lastSegment();

				n.getDublinCore().setSpatial(newSpatialString);
				currentGraphPolygons.put(n.getURI(),
						graphPolygons.get(n.getURI()));
			}
		}

		if (!currentGraphPolygons.isEmpty()) {
			String spatialString = SpatialProviderAdapter.STEM_SPATIAL_SCHEME_PREFIX
					+ "platform:/resource/" + tail;
			String fileName = ResourcesPlugin.getWorkspace().getRoot()
					.getLocation().toString().concat("/" + tail);

			SpatialGmlExporter.writeGML(fileName, graph.getURI(),
					currentGraphPolygons);
			graph.getDublinCore().setSpatial(spatialString);
		}

		if (graph.getURI().isPlatformResource()) {
			try {
				Utility.serializeIdentifiable(graph, graph.getURI());
			} catch (IOException e) {
				Activator.logError(e.getMessage(), e);
			}
		}
	}

	/**
	 * Redraws the Zest graph;
	 */
	private void redraw() {
		for (GraphNode gn : graphNodes.values()) {
			NodeData nodeData = (NodeData) gn.getData();
			double origX = nodeData.getOrigX();
			double origY = nodeData.getOrigY();
			double displayX = origX * scaleX + translationX;
			double displayY = origY * scaleY + translationY;

			gn.setSize(NODE_SIZE, NODE_SIZE);
			gn.setLocation(displayX - NODE_SIZE / 2, displayY - NODE_SIZE / 2);
		}

		zestGraph.redraw();
	}

	/**
	 * Computes the intial transformation parameters (scaleX, scaleY,
	 * translationX, translationY).
	 */
	private void setInitialTransform() {
		Rectangle zestBounds = zestGraph.getClientArea();
		Rectangle2D.Double stemBounds = null;

		for (Set<Polygon> polygons : graphPolygons.values()) {
			for (Polygon p : polygons) {
				if (stemBounds == null) {
					stemBounds = p.getBounds();
				} else {
					stemBounds = (Rectangle2D.Double) stemBounds.createUnion(p
							.getBounds());
				}
			}
		}

		double scaleFactor = Math.min(zestBounds.width / stemBounds.width,
				zestBounds.height / stemBounds.height) * INITIAL_SCALE_FACTOR;
		double zestCenterX = zestBounds.x + zestBounds.width / 2;
		double zestCenterY = zestBounds.y + zestBounds.height / 2;
		double stemCenterX = stemBounds.getCenterX();
		double stemCenterY = stemBounds.getCenterY();

		scaleX = scaleFactor;
		scaleY = -scaleFactor; // y-axis points in opposite direction
		translationX = zestCenterX - scaleX * stemCenterX;
		translationY = zestCenterY - scaleY * stemCenterY;
	}

	/**
	 * Updates all the editable parameters of Nodes, Edges, NodeLabel and
	 * EdgeLabels in the Graph to the values in stemGraph.
	 * 
	 * @param graph
	 *            Graph to update
	 */
	private void updateGraph(Graph graph) {
		for (Node graphNode : graph.getNodes().values()) {
			Node stemGraphNode = stemGraph.getNode(graphNode.getURI());

			graphNode.getDublinCore().setTitle(
					stemGraphNode.getDublinCore().getTitle());
		}

		for (Edge graphEdge : graph.getEdges().values()) {
			Edge stemGraphEdge = stemGraph.getEdge(graphEdge.getURI());
			EdgeLabel graphLabel = graphEdge.getLabel();
			EdgeLabel stemGraphLabel = stemGraphEdge.getLabel();

			graphEdge.getDublinCore().setTitle(
					stemGraphEdge.getDublinCore().getTitle());

			if (graphLabel instanceof CommonBorderRelationshipLabel) {
				CommonBorderRelationshipLabelValue graphLabelValue = (CommonBorderRelationshipLabelValue) graphLabel
						.getCurrentValue();
				CommonBorderRelationshipLabelValue stemGraphLabelValue = (CommonBorderRelationshipLabelValue) stemGraphLabel
						.getCurrentValue();

				graphLabelValue.setBorderLength(stemGraphLabelValue
						.getBorderLength());
			} else if (graphLabel instanceof MigrationEdgeLabel) {
				MigrationEdge graphMigration = (MigrationEdge) graphEdge;
				MigrationEdge stemGraphMigration = (MigrationEdge) stemGraphEdge;
				MigrationEdgeLabelValue graphLabelValue = (MigrationEdgeLabelValue) graphEdge
						.getLabel().getCurrentValue();
				MigrationEdgeLabelValue stemGraphLabelValue = (MigrationEdgeLabelValue) stemGraphEdge
						.getLabel().getCurrentValue();

				graphMigration.setPopulationIdentifier(stemGraphMigration
						.getPopulationIdentifier());
				graphMigration.setUseAbsoluteValues(stemGraphMigration
						.isUseAbsoluteValues());
				graphLabelValue.setMigrationRate(stemGraphLabelValue
						.getMigrationRate());
				graphLabelValue.setTimePeriod(stemGraphLabelValue
						.getTimePeriod());
			} else if (graphLabel instanceof RoadTransportRelationshipLabel) {
				RoadTransportRelationshipLabelValue graphLabelValue = (RoadTransportRelationshipLabelValue) graphLabel
						.getCurrentValue();
				RoadTransportRelationshipLabelValue stemGraphLabelValue = (RoadTransportRelationshipLabelValue) stemGraphLabel
						.getCurrentValue();

				graphLabelValue.setRoadName(stemGraphLabelValue.getRoadName());
				graphLabelValue
						.setRoadClass(stemGraphLabelValue.getRoadClass());
				graphLabelValue.setNumberCrossings(stemGraphLabelValue
						.getNumberCrossings());
			} else if (graphLabel instanceof PipeTransportEdgeLabel) {
				PipeTransportEdge graphPipe = (PipeTransportEdge) graphEdge;
				PipeTransportEdge stemGraphPipe = (PipeTransportEdge) stemGraphEdge;
				PipeTransportEdgeLabelValue graphLabelValue = (PipeTransportEdgeLabelValue) graphEdge
						.getLabel().getCurrentValue();
				PipeTransportEdgeLabelValue stemGraphLabelValue = (PipeTransportEdgeLabelValue) stemGraphEdge
						.getLabel().getCurrentValue();

				graphPipe.setPopulationIdentifier(stemGraphPipe
						.getPopulationIdentifier());
				graphLabelValue.setMaxFlow(stemGraphLabelValue.getMaxFlow());
				graphLabelValue.setTimePeriod(stemGraphLabelValue
						.getTimePeriod());
			}
		}

		for (NodeLabel graphLabel : graph.getNodeLabels().values()) {
			NodeLabel stemGraphLabel = stemGraph.getNodeLabel(graphLabel
					.getURI());

			if (graphLabel instanceof PopulationLabel) {
				PopulationLabel graphPopLabel = (PopulationLabel) graphLabel;
				PopulationLabel stemGraphPopLabel = (PopulationLabel) stemGraphLabel;

				graphPopLabel.setPopulationIdentifier(stemGraphPopLabel
						.getPopulationIdentifier());
				graphPopLabel.getCurrentPopulationValue().setCount(
						stemGraphPopLabel.getCurrentPopulationValue()
								.getCount());
				graphPopLabel.setPopulatedArea(stemGraphPopLabel
						.getPopulatedArea());
			} else if (graphLabel instanceof AreaLabel) {
				AreaLabel graphAreaLabel = (AreaLabel) graphLabel;
				AreaLabel stemGraphAreaLabel = (AreaLabel) stemGraphLabel;

				graphAreaLabel.getCurrentAreaValue().setArea(
						stemGraphAreaLabel.getCurrentAreaValue().getArea());
			}
		}
	}

	/**
	 * Adds a translation to a GraphNode and its polygons.
	 * 
	 * @param node
	 *            GraphNode to translate
	 * @param dx
	 *            translation in x
	 * @param dy
	 *            translation in y
	 */
	private void addTranslationToNode(GraphNode node, double dx, double dy) {
		NodeData nodeData = (NodeData) node.getData();
		Set<Polygon> displayPolygons = graphPolygons.get(nodeData.getNodeURI());

		nodeData.setOrigX(nodeData.getOrigX() + dx);
		nodeData.setOrigY(nodeData.getOrigY() + dy);

		for (Polygon polygon : displayPolygons) {
			for (int i = 0; i < polygon.npoints; i++) {
				polygon.x[i] += dx;
				polygon.y[i] += dy;
			}
		}
	}

	/**
	 * Converts a Polygon to an integer array in order to draw the polygon.
	 * 
	 * @param poly
	 *            Polygon to convert
	 * @return integer array
	 */
	private int[] polygon2IntArray(Polygon poly) {
		if (poly.npoints == 0) {
			return new int[] { 0, 0 };
		}

		int[] points = new int[poly.npoints * 2];

		for (int i = 0; i < poly.npoints; i++) {
			points[i * 2] = (int) (poly.x[i] * scaleX + translationX);
			points[i * 2 + 1] = (int) (poly.y[i] * scaleY + translationY);
		}

		return points;
	}

	/**
	 * Creates an appropriate title string for an Edge.
	 * 
	 * @param nodeA
	 *            first Node of the Edge
	 * @param nodeB
	 *            second Node of the Edge
	 * @param typeName
	 *            name of the Type of the Edge
	 * @param directed
	 *            true if it is an directed Edge
	 * @return title string
	 */
	private String createEdgeTitle(Node nodeA, Node nodeB, String typeName,
			boolean directed) {
		String nA = nodeA.getDublinCore().getTitle();
		String nB = nodeB.getDublinCore().getTitle();
		String title = null;

		if (directed) {
			title = typeName + "[(" + nA + ")->(" + nB + ")]";
		} else {
			title = typeName + "[(" + nA + ")<->(" + nB + ")]";
		}

		return title;
	}

	/**
	 * Creates a random URI with the specified segment, that does not exists
	 * already.
	 * 
	 * @param segment
	 *            segment of the URI
	 * @return created URI
	 */
	@SuppressWarnings("unlikely-arg-type")
	private URI getRandomURI(String segment) {
		URI uri = null;
		boolean isDuplicate = true;

		while (isDuplicate) {
			uri = STEMURI.createURI(segment + "/"
					+ STEMURI.generateUniquePart());
			isDuplicate = stemGraph.getNodes().containsKey(uri)
					|| stemGraph.getEdges().contains(uri);
		}

		return uri;
	}

	/**
	 * Bends the GraphConnection if it is not the only edge between its nodes to
	 * avoid that two GraphConnections are drawn on top of each other.
	 * 
	 * @param connection
	 *            GraphConnection to bend
	 */
	private void preventOverlay(GraphConnection connection) {
		ConnectionData edgeData = (ConnectionData) connection.getData();
		List<GraphConnection> sameConnections = new ArrayList<GraphConnection>();
		int curveDepth = 0;

		for (GraphConnection c : graphConnections.values()) {
			GraphNode source1 = connection.getSource();
			GraphNode destination1 = connection.getDestination();
			GraphNode source2 = c.getSource();
			GraphNode destination2 = c.getDestination();

			if (source1 == source2 && destination1 == destination2) {
				if (!(c.equals(connection))) {
					sameConnections.add(c);
				}
			}
		}

		for (int i = 0; i < sameConnections.size(); i++) {
			boolean exists = false;

			for (GraphConnection c : sameConnections) {
				if (((ConnectionData) c.getData()).getCurveDepth() == curveDepth) {
					exists = true;
					break;
				}
			}

			if (!exists) {
				break;
			}

			curveDepth = NODE_SIZE * (int) Math.ceil((i + 1.0) / 2.0)
					* (int) Math.pow(-1, i);
		}

		edgeData.setCurveDepth(curveDepth);
		connection.setCurveDepth(curveDepth);
	}

	/**
	 * Converts from cursor coordinates to LatLong coordinates.
	 * 
	 * @param xy
	 *            point in cursor coordinates
	 * @return point in LatLong coordinates
	 */
	private Point2D.Double getLatLongFromCursorLocation(Point xy) {
		double lon = (xy.x - translationX) / scaleX;
		double lat = (xy.y - translationY) / scaleY;

		return new Point2D.Double(lon, lat);
	}

	/**
	 * Returns a formatted string with the LatLong values.
	 * 
	 * @param lat
	 *            latitude
	 * @param lon
	 *            longitude
	 * @return formatted string
	 */
	private String formatLatLon(double lat, double lon) {
		DecimalFormat df = new DecimalFormat("0.00",
				DecimalFormatSymbols.getInstance(Locale.US));

		return df.format(lat) + " " + df.format(lon);
	}

	/**
	 * Formats the double values.
	 * 
	 * @param value
	 *            value to format
	 * @return formatted string
	 */
	private String formatDouble(double value) {
		DecimalFormat df = new DecimalFormat("0.00",
				DecimalFormatSymbols.getInstance(Locale.US));

		return df.format(value);
	}

	/**
	 * Check if the selected GraphNode or GraphConnection is visible. It may
	 * occluded by the Composites that show up when something is selected. If it
	 * is occluded the whole Graph is translated to make it visible.
	 */
	private void checkSelectionVisible() {
		Object selectedItem = zestGraph.getSelection().get(0);
		int yMax = zestGraph.getSize().y;
		int yPos = 0;

		if (selectedItem instanceof GraphNode) {
			GraphNode node = (GraphNode) selectedItem;

			yPos = node.getLocation().y;
		} else if (selectedItem instanceof GraphConnection) {
			GraphConnection connection = (GraphConnection) selectedItem;
			GraphNode node1 = connection.getSource();
			GraphNode node2 = connection.getDestination();

			yPos = (node1.getLocation().y + node2.getLocation().y) / 2;
		}

		if (yPos + NODE_SIZE > yMax) {
			translationY += (yMax - NODE_SIZE - yPos);
			redraw();
		}
	}

	/**
	 * Addjusts the color of a GraphNode.
	 * 
	 * @param gn
	 *            GraphNode
	 */
	private void setNodeColor(GraphNode gn) {
		NodeData data = (NodeData) gn.getData();

		switch (data.getGraphListIndex()) {
		case 0:
			gn.setBackgroundColor(ColorConstants.black);
			return;
		case 1:
			gn.setBackgroundColor(ColorConstants.red);
			return;
		case 2:
			gn.setBackgroundColor(ColorConstants.green);
			return;
		case 3:
			gn.setBackgroundColor(ColorConstants.blue);
			return;
		case 4:
			gn.setBackgroundColor(ColorConstants.yellow);
			return;
		case 5:
			gn.setBackgroundColor(ColorConstants.orange);
			return;
		case 6:
			gn.setBackgroundColor(ColorConstants.cyan);
			return;
		}

		gn.setBackgroundColor(ColorConstants.black);
	}

	/**
	 * Addjusts the color of a GraphConnection.
	 * 
	 * @param gn
	 *            GraphConnection
	 */
	private void setEdgeColor(GraphConnection gc) {
		ConnectionData cd = (ConnectionData) gc.getData();
		EdgeLabel label = cd.getEdgeLabel();

		if (label instanceof MigrationEdgeLabel) {
			gc.setLineStyle(SWT.LINE_SOLID);
		} else if (label instanceof CommonBorderRelationshipLabel) {
			gc.setLineStyle(SWT.LINE_DOT);
		} else if (label instanceof RoadTransportRelationshipLabel) {
			gc.setLineStyle(SWT.LINE_DASH);
		} else if (label instanceof PipeTransportEdgeLabel) {
			gc.setLineStyle(SWT.LINE_DASHDOT);
		} else if (label instanceof RelativePhysicalRelationshipLabel) {
			gc.setLineStyle(SWT.LINE_DOT);
		}
	}

}
