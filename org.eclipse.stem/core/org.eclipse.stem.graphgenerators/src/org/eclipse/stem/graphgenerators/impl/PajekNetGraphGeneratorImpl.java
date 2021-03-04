package org.eclipse.stem.graphgenerators.impl;

/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors: Armin Weiser, Matthias Filter, Christian Th�ns
 * Bundesinstitut f�r Risikobewertung
 * FG 43 - Epidemiologie und Zoonosen
 * Diedersdorfer Weg 1, 12277 Berlin
 *
 * IBM Corporation - initial API and implementation
 *******************************************************************************/

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.ModelFactory;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.modifier.DoubleModifier;
import org.eclipse.stem.core.modifier.Modifier;
import org.eclipse.stem.core.modifier.ModifierFactory;
import org.eclipse.stem.core.predicate.And;
import org.eclipse.stem.core.predicate.ElapsedTimeTest;
import org.eclipse.stem.core.predicate.IdentifiablePredicateExpression;
import org.eclipse.stem.core.predicate.Not;
import org.eclipse.stem.core.predicate.PredicateFactory;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.core.trigger.TriggerFactory;
import org.eclipse.stem.core.trigger.TriggerList;
import org.eclipse.stem.definitions.Activator;
import org.eclipse.stem.definitions.adapters.spatial.geo.InlineLatLongDataProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.SegmentBuilder;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapterFactory;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.nodes.NodesFactory;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.definitions.nodes.impl.RegionImpl;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.PajekNetGraphGenerator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Pajek Net Graph Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl#getDataFile <em>Data File</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl#getScalingFactor <em>Scaling Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl#getNodeSize <em>Node Size</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl#isUseRegionURI <em>Use Region URI</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl#isMoveNodesToContainers <em>Move Nodes To Containers</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.PajekNetGraphGeneratorImpl#isUseAbsoluteRates <em>Use Absolute Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PajekNetGraphGeneratorImpl extends GraphGeneratorImpl implements
		PajekNetGraphGenerator {

	private IProject project;

	private String fileName;

	/**
	 * The default value of the '{@link #getDataFile() <em>Data File</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataFile()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FILE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getDataFile() <em>Data File</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataFile()
	 * @generated
	 * @ordered
	 */
	protected String dataFile = DATA_FILE_EDEFAULT;
	/**
	 * The default value of the '{@link #getScalingFactor() <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getScalingFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALING_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getScalingFactor() <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getScalingFactor()
	 * @generated
	 * @ordered
	 */
	protected double scalingFactor = SCALING_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeSize() <em>Node Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNodeSize()
	 * @generated
	 * @ordered
	 */
	protected static final double NODE_SIZE_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getNodeSize() <em>Node Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNodeSize()
	 * @generated
	 * @ordered
	 */
	protected double nodeSize = NODE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseRegionURI() <em>Use Region URI</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isUseRegionURI()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_REGION_URI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseRegionURI() <em>Use Region URI</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isUseRegionURI()
	 * @generated
	 * @ordered
	 */
	protected boolean useRegionURI = USE_REGION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #isMoveNodesToContainers() <em>Move Nodes To Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveNodesToContainers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOVE_NODES_TO_CONTAINERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoveNodesToContainers() <em>Move Nodes To Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveNodesToContainers()
	 * @generated
	 * @ordered
	 */
	protected boolean moveNodesToContainers = MOVE_NODES_TO_CONTAINERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseAbsoluteRates() <em>Use Absolute Rates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAbsoluteRates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ABSOLUTE_RATES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseAbsoluteRates() <em>Use Absolute Rates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAbsoluteRates()
	 * @generated
	 * @ordered
	 */
	protected boolean useAbsoluteRates = USE_ABSOLUTE_RATES_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PajekNetGraphGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataFile() {
		return dataFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFile(String newDataFile) {
		String oldDataFile = dataFile;
		dataFile = newDataFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__DATA_FILE, oldDataFile, dataFile));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getScalingFactor() {
		return scalingFactor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalingFactor(double newScalingFactor) {
		double oldScalingFactor = scalingFactor;
		scalingFactor = newScalingFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR, oldScalingFactor, scalingFactor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getNodeSize() {
		return nodeSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeSize(double newNodeSize) {
		double oldNodeSize = nodeSize;
		nodeSize = newNodeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE, oldNodeSize, nodeSize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseRegionURI() {
		return useRegionURI;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseRegionURI(boolean newUseRegionURI) {
		boolean oldUseRegionURI = useRegionURI;
		useRegionURI = newUseRegionURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI, oldUseRegionURI, useRegionURI));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoveNodesToContainers() {
		return moveNodesToContainers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveNodesToContainers(boolean newMoveNodesToContainers) {
		boolean oldMoveNodesToContainers = moveNodesToContainers;
		moveNodesToContainers = newMoveNodesToContainers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS, oldMoveNodesToContainers, moveNodesToContainers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseAbsoluteRates() {
		return useAbsoluteRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseAbsoluteRates(boolean newUseAbsoluteRates) {
		boolean oldUseAbsoluteRates = useAbsoluteRates;
		useAbsoluteRates = newUseAbsoluteRates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES, oldUseAbsoluteRates, useAbsoluteRates));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__DATA_FILE:
				return getDataFile();
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR:
				return getScalingFactor();
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE:
				return getNodeSize();
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI:
				return isUseRegionURI();
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS:
				return isMoveNodesToContainers();
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES:
				return isUseAbsoluteRates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__DATA_FILE:
				setDataFile((String)newValue);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR:
				setScalingFactor((Double)newValue);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE:
				setNodeSize((Double)newValue);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI:
				setUseRegionURI((Boolean)newValue);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS:
				setMoveNodesToContainers((Boolean)newValue);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES:
				setUseAbsoluteRates((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__DATA_FILE:
				setDataFile(DATA_FILE_EDEFAULT);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR:
				setScalingFactor(SCALING_FACTOR_EDEFAULT);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE:
				setNodeSize(NODE_SIZE_EDEFAULT);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI:
				setUseRegionURI(USE_REGION_URI_EDEFAULT);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS:
				setMoveNodesToContainers(MOVE_NODES_TO_CONTAINERS_EDEFAULT);
				return;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES:
				setUseAbsoluteRates(USE_ABSOLUTE_RATES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__DATA_FILE:
				return DATA_FILE_EDEFAULT == null ? dataFile != null : !DATA_FILE_EDEFAULT.equals(dataFile);
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR:
				return scalingFactor != SCALING_FACTOR_EDEFAULT;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE:
				return nodeSize != NODE_SIZE_EDEFAULT;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI:
				return useRegionURI != USE_REGION_URI_EDEFAULT;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS:
				return moveNodesToContainers != MOVE_NODES_TO_CONTAINERS_EDEFAULT;
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES:
				return useAbsoluteRates != USE_ABSOLUTE_RATES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataFile: ");
		result.append(dataFile);
		result.append(", scalingFactor: ");
		result.append(scalingFactor);
		result.append(", nodeSize: ");
		result.append(nodeSize);
		result.append(", useRegionURI: ");
		result.append(useRegionURI);
		result.append(", moveNodesToContainers: ");
		result.append(moveNodesToContainers);
		result.append(", useAbsoluteRates: ");
		result.append(useAbsoluteRates);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

	/**
	 * Import PajekNets into Graphs for Pajek format see:
	 * http://vlado.fmf.uni-lj.si/pub/networks/pajek/doc/pajekman.pdf
	 * 
	 * we use compatible definitions of the pajek format only, which is:
	 * Vertices: vertexNumber label x y - the first 4 parameters are mandatory
	 * Arcs: v1 v2 value - all three parameters are mandatory
	 * 
	 * Data File: Pajek file to import Area: Default Area of each node if
	 * undefined
	 * 
	 */
	@Override
	public Graph getGraph() {
		Graph graph = null;
		File file = new File(getDataFile());

		if (file == null || !file.exists() || file.isDirectory()) {
			Activator.logError("Pajek importing: File cannot be found", null);
		}

		try {
			graph = getGraph(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return graph;
	}

	public void setGraphFileName(String fileName) {
		this.fileName = fileName;
	}

	private Graph getGraph(File pajekNETFileURI) throws IOException {
		if (isOldFormat(pajekNETFileURI)) {
			PajekNetGraphGeneratorImplOld gen = new PajekNetGraphGeneratorImplOld(
					pajekNETFileURI, getScalingFactor());

			return gen.getGraph();
		}

		Graph graph = GraphFactory.eINSTANCE.createGraph();
		DublinCore dc = graph.getDublinCore();
		SimpleDateFormat formatter = new SimpleDateFormat(
				"E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		BufferedReader reader = new BufferedReader(new FileReader(
				pajekNETFileURI));
		List<URI> nodeList = new ArrayList<URI>();
		TriggerList triggerList = TriggerFactory.eINSTANCE.createTriggerList();
		Map<URI, URI> containers = new HashMap<URI, URI>();
		int numNodes = 0;

		dc.populate();
		dc.setTitle("Pajek Import");
		dc.setSource(this.getClass().getSimpleName());
		dc.setValid(formatter.format(Calendar.getInstance().getTime()));
		triggerList.setURI(URI.createPlatformResourceURI(project.getName()
				+ "/triggers/" + fileName + ".trigger", false));

		// Read the number of nodes
		if ((numNodes = readNumberOfNodes(reader.readLine())) == -1) {
			String error = "Error reading number of nodes!";

			Activator.logError("Pajek importing " + pajekNETFileURI.getName()
					+ ": " + error, null);
			showErrorMessage("Pajek importing " + pajekNETFileURI.getName()
					+ ": " + error);
			reader.close();
			return null;
		}

		// Read nodes
		for (int i = 0; i < numNodes; i++) {
			if (!readRegionNode(reader.readLine(), i + 1, graph, nodeList)) {
				String error = "Error reading node at line " + (i + 2) + "!";

				Activator.logError(
						"Pajek importing " + pajekNETFileURI.getName() + ": "
								+ error, null);
				showErrorMessage("Pajek importing " + pajekNETFileURI.getName()
						+ ": " + error);
				reader.close();
				return null;
			}
		}

		// Read edge tag
		if (!readEdgeTag(reader.readLine())) {
			String error = "Error reading edge tag!";

			Activator.logError("Pajek importing " + pajekNETFileURI.getName()
					+ ": " + error, null);
			showErrorMessage("Pajek importing " + pajekNETFileURI.getName()
					+ ": " + error);
			reader.close();
			return null;
		}

		// Read edges
		for (int i = 0;; i++) {
			String line = reader.readLine();

			if (line == null || line.trim().isEmpty()) {
				break;
			}

			if (!readEdge(line, graph, nodeList, triggerList, containers)) {
				String error = "Error reading edge at line "
						+ (i + numNodes + 3) + "!";

				Activator.logError(
						"Pajek importing " + pajekNETFileURI.getName() + ": "
								+ error, null);
				showErrorMessage("Pajek importing " + pajekNETFileURI.getName()
						+ ": " + error);
				reader.close();
				return null;
			}
		}

		reader.close();

		if (isMoveNodesToContainers()) {
			moveNodesToContainers(graph, containers);
		}

		if (!triggerList.getPredicateList().isEmpty()) {
			try {
				Utility.serializeIdentifiable(triggerList, triggerList.getURI());
				project.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (IOException e) {
				Activator.logError(e.getMessage(), e);
			} catch (CoreException e) {
				Activator.logError(e.getMessage(), e);
			}
		}

		assert graph.sane();
		return graph;
	}

	private int readNumberOfNodes(String line) {
		if (line == null) {
			return -1;
		}

		String[] toks = line.split(" ");

		if (toks.length != 2 || !toks[0].equalsIgnoreCase("*vertices")) {
			return -1;
		}

		try {
			return Integer.parseInt(toks[1]);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	private void showErrorMessage(String message) {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStatus warning = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 1,
				message, null);
		ErrorDialog.openError(window.getShell(), null, null, warning);
	}

	private boolean readRegionNode(String line, int index, Graph graph,
			List<URI> nodeList) {
		if (line == null) {
			return false;
		}

		String[] toks = line.split(" ");

		if (toks.length == 2) {
			try {
				if (Integer.parseInt(toks[0]) != index) {
					return false;
				}

				if (toks[1].startsWith("stem://")) {
					nodeList.add(STEMURI.createURI(toks[1]));
				} else {
					nodeList.add(RegionImpl.createRegionNodeURI(toks[1]));
				}

				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}

		String name = "";
		double x = 0.0;
		double y = 0.0;

		try {
			name = toks[1];
			x = Double.parseDouble(toks[2]);
			y = Double.parseDouble(toks[3]);

			if (Integer.parseInt(toks[0]) != index) {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}

		Region node = NodesFactory.eINSTANCE.createRegion();
		DublinCore dc = node.getDublinCore();

		dc.setTitle(name);

		if (isUseRegionURI()) {
			node.setURI(STEMURI.createURI(Region.URI_TYPE_REGION_NODE_SEGMENT
					+ "/" + name));
		} else {
			node.setURI(STEMURI.createURI(Node.URI_TYPE_NODE_SEGMENT + "/"
					+ graph.getURI().lastSegment() + "/" + name));
		}

		int i = 4;

		while (i < toks.length) {
			try {
				if (toks[i].equalsIgnoreCase("popid")
						&& toks[i + 2].equalsIgnoreCase("popcount")) {
					PopulationLabel popLabel = LabelsFactory.eINSTANCE
							.createPopulationLabel();

					popLabel.setPopulationIdentifier(toks[i + 1]);
					popLabel.setURIOfIdentifiableToBeLabeled(node.getURI());
					popLabel.setNode(node);
					popLabel.getCurrentPopulationValue().setCount(
							Double.parseDouble(toks[i + 3]));

					node.getLabels().add(popLabel);
					graph.getNodeLabels().put(popLabel.getURI(), popLabel);
					i += 4;
				} else {
					return false;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				return false;
			} catch (NumberFormatException e) {
				return false;
			}
		}

		x *= getScalingFactor();
		y *= getScalingFactor();
		node.getDublinCore().setSpatial(createNodeSpatialString(x, y));

		graph.getNodes().put(node.getURI(), node);
		nodeList.add(node.getURI());

		return true;
	}

	private boolean readEdgeTag(String line) {
		return line != null
				&& (line.trim().equalsIgnoreCase("*edges") || line.trim()
						.equalsIgnoreCase("*arcs"));
	}

	private boolean readEdge(String line, Graph graph, List<URI> nodeList,
			TriggerList triggerList, Map<URI, URI> containers) {
		if (line == null) {
			return false;
		}

		String[] toks = line.split(" ");

		try {
			if (toks.length >= 6 && toks[2].equalsIgnoreCase("popid")
					&& toks[4].equalsIgnoreCase("rate")) {
				int id1 = Integer.parseInt(toks[0]) - 1;
				int id2 = Integer.parseInt(toks[1]) - 1;
				String population = toks[3];
				double rate = Double.parseDouble(toks[5]);
				MigrationEdge edge = EdgesFactory.eINSTANCE
						.createMigrationEdge();

				edge.setURI(STEMURI
						.createURI(MigrationEdge.URI_TYPE_MIGRATION_EDGE_SEGMENT
								+ "/"
								+ graph.getURI().lastSegment()
								+ "/"
								+ STEMURI.generateUniquePart()));
				edge.setNodeAURI(nodeList.get(id1));
				edge.setNodeBURI(nodeList.get(id2));
				edge.setPopulationIdentifier(population);
				edge.setUseAbsoluteValues(isUseAbsoluteRates());
				edge.getLabel().setURIOfIdentifiableToBeLabeled(edge.getURI());
				edge.getLabel().getCurrentValue().setMigrationRate(rate);
				edge.getDublinCore().setTitle(
						createEdgeTitle(nodeList.get(id1), nodeList.get(id2),
								"MigrationEdge", true));

				graph.getEdges().put(edge.getURI(), edge);

				if (toks.length == 6) {
					return true;
				}

				for (int i = 6; i < toks.length; i += 4) {
					if (toks[i].equalsIgnoreCase("date")
							&& toks[i + 2].equalsIgnoreCase("rate")) {
						SimpleDateFormat dateFormat = new SimpleDateFormat(
								"yyyy-MM-dd-hh-mm-ss");
						Date triggerDate = dateFormat.parse(toks[i + 1]
								+ "-00-00-00");
						double triggerRate = Double.parseDouble(toks[i + 3]);

						addToTriggerList(triggerList, edge, triggerDate,
								triggerRate);
					} else {
						return false;
					}
				}
			} else if (toks.length == 2) {
				int id1 = Integer.parseInt(toks[0]) - 1;
				int id2 = Integer.parseInt(toks[1]) - 1;

				containers.put(nodeList.get(id2), nodeList.get(id1));
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		} catch (ParseException e) {
			return false;
		}

		return true;
	}

	private void moveNodesToContainers(Graph graph, Map<URI, URI> containers) {
		Map<URI, LatLong> spatials = getSpatials();
		Map<LatLong, Set<Node>> containedNodes = new HashMap<LatLong, Set<Node>>();

		for (Map.Entry<URI, URI> entry : containers.entrySet()) {
			Node node = graph.getNode(entry.getKey());
			LatLong container = spatials.get(entry.getValue());

			if (node == null || container == null) {
				continue;
			}

			Set<Node> nodes = containedNodes.get(container);

			if (nodes == null) {
				containedNodes.put(container,
						new HashSet<Node>(Arrays.asList(node)));
			} else {
				nodes.add(node);
			}
		}

		for (Map.Entry<LatLong, Set<Node>> entry : containedNodes.entrySet()) {
			LatLong container = entry.getKey();
			Segment largestSegment = null;
			double largestArea = 0.0;

			for (Segment segment : container.getSegments()) {
				double area = getArea(segment);

				if (area > largestArea) {
					largestSegment = segment;
					largestArea = area;
				}
			}

			Point2D.Double centroid = getCentroid(largestSegment);
			Set<Node> nodeSet = entry.getValue();
			Set<Point2D.Double> locationSet = getNodeLocations(centroid,
					nodeSet.size());
			List<Node> nodeList = new ArrayList<Node>(nodeSet);
			List<Point2D.Double> locationList = new ArrayList<Point2D.Double>(
					locationSet);

			for (int i = 0; i < nodeList.size(); i++) {
				Node node = nodeList.get(i);
				Point2D.Double location = locationList.get(i);

				node.getDublinCore().setSpatial(
						createNodeSpatialString(location.x, location.y));
			}
		}
	}

	private void addToTriggerList(TriggerList triggerList, MigrationEdge edge,
			Date date, double rate) {
		IdentifiablePredicateExpression predicate = PredicateFactory.eINSTANCE
				.createIdentifiablePredicateExpression();
		And andPredicate = PredicateFactory.eINSTANCE.createAnd();
		Not notPredicate = PredicateFactory.eINSTANCE.createNot();
		ElapsedTimeTest timeTest1 = PredicateFactory.eINSTANCE
				.createElapsedTimeTest();
		ElapsedTimeTest timeTest2 = PredicateFactory.eINSTANCE
				.createElapsedTimeTest();
		Modifier modifier = ModifierFactory.eINSTANCE.createModifier();
		DoubleModifier featureModifier = ModifierFactory.eINSTANCE
				.createDoubleModifier();
		STEMTime date1 = ModelFactory.eINSTANCE.createSTEMTime();
		STEMTime date2 = ModelFactory.eINSTANCE.createSTEMTime();

		date1.setTime((Date) date.clone());
		date2.setTime((Date) date.clone());
		timeTest1.setNumberofDays(0);
		timeTest1.setReferenceTime(date1);
		timeTest1.setReferenceTimeValid(true);
		timeTest2.setNumberofDays(1);
		timeTest2.setReferenceTime(date2);
		timeTest2.setReferenceTimeValid(true);
		notPredicate.setOperand(timeTest2);
		andPredicate.getOperands().add(timeTest1);
		andPredicate.getOperands().add(notPredicate);
		predicate.setPredicate(andPredicate);

		featureModifier
				.setEStructuralFeature(EdgesPackage.Literals.MIGRATION_EDGE_LABEL_VALUE__MIGRATION_RATE);
		featureModifier.setTarget(edge.getLabel());
		featureModifier.setValue(rate);
		modifier.setTargetURI(edge.getLabel().getURI());
		modifier.getFeatureModifiers().add(featureModifier);

		triggerList.getPredicateList().add(predicate);
		triggerList.getActionList().add(modifier);
	}

	private String createNodeSpatialString(double x, double y) {
		LatLong latlon = new LatLong();
		SegmentBuilder sb = new SegmentBuilder();
		double size = getNodeSize();

		sb.add(y - size / 2, x - size / 2);
		sb.add(y - size / 2, x + size / 2);
		sb.add(y + size / 2, x + size / 2);
		sb.add(y + size / 2, x - size / 2);
		sb.add(y - size / 2, x - size / 2);
		latlon.add(sb.toSegment());

		return InlineLatLongDataProvider.createSpatialInlineURIString(latlon);
	}

	private String createEdgeTitle(URI nodeA, URI nodeB, String typeName,
			boolean directed) {
		String nA = nodeA.lastSegment();
		String nB = nodeB.lastSegment();
		String title = null;

		if (directed) {
			title = typeName + "[(" + nA + ")->(" + nB + ")]";
		} else {
			title = typeName + "[(" + nA + ")<->(" + nB + ")]";
		}

		return title;
	}

	private Map<URI, LatLong> getSpatials() {
		Map<URI, LatLong> latLongs = new HashMap<URI, LatLong>();
		List<Graph> graphList = new ArrayList<Graph>();
		IContainer modelFolder = project.getFolder("models");
		IContainer graphsFolder = project.getFolder("graphs");
		IResource[] models = null;
		IResource[] graphs = null;

		try {
			models = modelFolder.members();
			graphs = graphsFolder.members();
		} catch (Exception e) {
		}

		if (models != null) {
			for (IResource r : models) {
				if (!r.getName().endsWith(".model")) {
					continue;
				}

				try {
					URI uri = URI.createURI(r.getLocationURI().toString());
					Identifiable id = Utility.getIdentifiable(uri);

					graphList.add(((Model) id).getCanonicalGraphNoDecorate(
							STEMURI.createURI(""), null, null));
				} catch (ScenarioInitializationException e) {
					e.printStackTrace();
					return null;
				}
			}
		}

		if (graphs != null) {
			for (IResource r : graphs) {
				if (!r.getName().endsWith(".graph")) {
					continue;
				}

				URI uri = URI.createURI(r.getLocationURI().toString());
				Identifiable id = Utility.getIdentifiable(uri);

				graphList.add((Graph) id);
			}
		}

		for (Graph graph : graphList) {
			for (Node n : graph.getNodes().values()) {
				LatLongProvider latLongProvider = (LatLongProvider) LatLongProviderAdapterFactory.INSTANCE
						.adapt(n, LatLongProvider.class);

				latLongs.put(n.getURI(), latLongProvider.getLatLong());
			}
		}

		return latLongs;
	}

	private double getArea(Segment segment) {
		double area = 0.0;

		for (int i = 0; i < segment.size() - 1; i++) {
			double x1 = segment.longitude(i);
			double y1 = segment.latitude(i);
			double x2 = segment.longitude(i + 1);
			double y2 = segment.latitude(i + 1);

			area += x1 * y2 - x2 * y1;
		}

		area /= 2.0;

		return Math.abs(area);
	}

	private Point2D.Double getCentroid(Segment segment) {
		double area = 0.0;
		double cx = 0.0;
		double cy = 0.0;

		for (int i = 0; i < segment.size() - 1; i++) {
			double x1 = segment.longitude(i);
			double y1 = segment.latitude(i);
			double x2 = segment.longitude(i + 1);
			double y2 = segment.latitude(i + 1);
			double mem = x1 * y2 - x2 * y1;

			area += mem;
			cx += (x1 + x2) * mem;
			cy += (y1 + y2) * mem;
		}

		area /= 2.0;
		cx /= 6 * area;
		cy /= 6 * area;

		return new Point2D.Double(cx, cy);
	}

	private Set<Point2D.Double> getNodeLocations(Point2D.Double center, int n) {
		Set<Point2D.Double> locationSet = new HashSet<Point2D.Double>();
		double distance = getNodeSize() * 1.5;
		int i = 0;

		for (int d = 1;; d++) {
			for (int dx = -d; dx <= +d; dx++) {
				for (int dy = -d; dy <= +d; dy++) {
					if (dx == 0 && dy == 0) {
						continue;
					}

					double x = center.x + dx * distance;
					double y = center.y + dy * distance;
					Point2D.Double location = new Point2D.Double(x, y);

					if (!locationSet.contains(location)) {
						locationSet.add(location);
						i++;

						if (i == n) {
							return locationSet;
						}
					}
				}
			}
		}
	}

	private boolean isOldFormat(File pajekNETFileURI) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					pajekNETFileURI));

			reader.readLine();

			while (true) {
				String line = reader.readLine();

				if (line.contains("*Arcs")) {
					reader.close();
					return true;
				}

				if (line.contains("*Edges")) {
					break;
				}

				String[] tokens = line.replaceAll("\"[^\"]*\"", "id")
						.split(" ");

				if (tokens.length >= 5) {
					try {
						Double.parseDouble(tokens[4]);
						return true;
					} catch (NumberFormatException e) {
					}

					if (tokens[4].equals("triangle")
							|| tokens[4].equals("cross")
							|| tokens[4].equals("ellipse")
							|| tokens[4].equals("box")
							|| tokens[4].equals("diamond")
							|| tokens[4].equals("s_size")) {
						reader.close();
						return true;
					}
				}
			}

			while (true) {
				String line = reader.readLine();

				if (line == null) {
					break;
				}

				String[] tokens = line.replaceAll("\"[^\"]*\"", "id")
						.split(" ");

				if (tokens.length >= 3) {
					try {
						Double.parseDouble(tokens[2]);
						return true;
					} catch (NumberFormatException e) {
					}
				}
			}

			reader.close();
		} catch (Exception e) {
		}

		return false;
	}

} // PajekNetGraphGeneratorImpl
