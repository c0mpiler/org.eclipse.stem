/******************************************************************************* 
 * Copyright (c) 2016 Bundesinstitut f?r Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut f?r Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.graphgenerators.impl;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.definitions.Activator;
import org.eclipse.stem.definitions.adapters.spatial.geo.InlineLatLongDataProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.SegmentBuilder;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelImpl;
import org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl;
import org.eclipse.stem.definitions.nodes.NodesFactory;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.gis.shp.ShpPolyLine;
import org.eclipse.stem.gis.shp.ShpPolygon;
import org.eclipse.stem.gis.shp.ShpPolygonM;
import org.eclipse.stem.gis.shp.ShpPolygonZ;
import org.eclipse.stem.gis.shp.ShpRecord;
import org.eclipse.stem.gis.shp.type.Box;
import org.eclipse.stem.gis.shp.type.Part;
import org.eclipse.stem.graphgenerators.AreaUnit;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.MigrationShapefile;
import org.eclipse.stem.graphgenerators.RegionShapefile;
import org.eclipse.stem.graphgenerators.RoadShapefile;
import org.eclipse.stem.graphgenerators.Shapefile;
import org.eclipse.stem.graphgenerators.ShapefileGraphGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Shapefile Graph Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.ShapefileGraphGeneratorImpl#getShapefiles <em>Shapefiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapefileGraphGeneratorImpl extends GraphGeneratorImpl implements
		ShapefileGraphGenerator {
	
	/**
	 * The cached value of the '{@link #getShapefiles() <em>Shapefiles</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getShapefiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Shapefile> shapefiles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ShapefileGraphGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgeneratorsPackage.Literals.SHAPEFILE_GRAPH_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shapefile> getShapefiles() {
		if (shapefiles == null) {
			shapefiles = new EObjectResolvingEList<Shapefile>(Shapefile.class, this, GraphgeneratorsPackage.SHAPEFILE_GRAPH_GENERATOR__SHAPEFILES);
		}
		return shapefiles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphgeneratorsPackage.SHAPEFILE_GRAPH_GENERATOR__SHAPEFILES:
				return getShapefiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphgeneratorsPackage.SHAPEFILE_GRAPH_GENERATOR__SHAPEFILES:
				getShapefiles().clear();
				getShapefiles().addAll((Collection<? extends Shapefile>)newValue);
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
			case GraphgeneratorsPackage.SHAPEFILE_GRAPH_GENERATOR__SHAPEFILES:
				getShapefiles().clear();
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
			case GraphgeneratorsPackage.SHAPEFILE_GRAPH_GENERATOR__SHAPEFILES:
				return shapefiles != null && !shapefiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Graph getGraph() {
		Graph graph = GraphFactory.eINSTANCE.createGraph();
		List<Node> nodeList = new ArrayList<Node>();
		List<ShpPolyLine> polygonList = new ArrayList<ShpPolyLine>();
		DublinCore dc = graph.getDublinCore();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat(
				"E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		dc.populate();
		dc.setTitle("GIS Import");
		dc.setSource(this.getClass().getSimpleName());
		dc.setValid(formatter.format(c.getTime()));

		processRegionShapefiles(graph, nodeList, polygonList);
		processCommonBorderCreation(graph, nodeList, polygonList);
		processRoadShapefiles(graph, nodeList, polygonList);
		processMigrationShapefiles(graph, nodeList, polygonList);

		assert graph.sane();
		return graph;
	}

	/**
	 * This method iterates through all shapefiles that contain regions and
	 * creates a node for each region. These nodes are added to the graph.
	 * Additionally all polygons are added to polygonList, which is used by
	 * other methods.
	 * 
	 * @param graph
	 *            the graph to which the nodes are added
	 * @param nodeList
	 *            created nodes are added to this list
	 * @param polygonList
	 *            created polygons are added to this list
	 */
	private void processRegionShapefiles(Graph graph, List<Node> nodeList,
			List<ShpPolyLine> polygonList) {
		for (Shapefile s : shapefiles) {
			if (!(s instanceof RegionShapefile)) {
				continue;
			}

			RegionShapefile shapefile = (RegionShapefile) s;
			List<ShpRecord> shapeList = null;
			List<List<String>> data = null;
			List<String> columnNames = null;
			String regionID = shapefile.getId();
			String area = shapefile.getArea();
			AreaUnit areaUnit = shapefile.getAreaUnit();			
			List<String> populationNames = shapefile.getPopulationNames();
			List<String> populationSizes = shapefile.getPopulationSizes();

			try {
				Reader reader = new Reader(shapefile.getFileName());

				shapeList = reader.getShapeList();
				data = reader.getData();
				columnNames = reader.getColumnNames();
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (shapeList != null) {
				for (int i = 0; i < shapeList.size(); i++) {
					ShpRecord shape = shapeList.get(i);

					if (shape instanceof ShpPolygon || shape instanceof ShpPolygonM || shape instanceof ShpPolygonZ) {
						ShpPolyLine polygon = (ShpPolyLine) shape;

						adjustNumberOfFractionalDigits(polygon);

						String currentID = data.get(i).get(
								columnNames.indexOf(regionID.replaceFirst(
										"column:", "")));

						// Remove spaces from ID, cause it will be used as part
						// of URI
						currentID = currentID.replace(" ", "");

						Double currentArea = null;

						try {
							if (area.startsWith("column:")) {
								currentArea = Double.parseDouble(data.get(i)
										.get(columnNames.indexOf(area
												.replaceFirst("column:", ""))));
							} else {
								currentArea = Double.parseDouble(area);
							}

							if (areaUnit == AreaUnit.SQ_KM) {
								// no transform needed
							} else if (areaUnit == AreaUnit.SQ_M) {
								currentArea /= 1e6;
							} else if (areaUnit == AreaUnit.SQ_MILE) {
								currentArea *= 2.589988110336;
							}
						} catch (NumberFormatException e) {
						}

						Region regionNode = createRegionNode(currentID);
						LatLong nodeSegments = createSTEMPolygon(polygon);
						String spatialURIString = InlineLatLongDataProvider
								.createSpatialInlineURIString(nodeSegments);

						regionNode.getDublinCore().setSpatial(spatialURIString);
						nodeList.add(regionNode);
						graph.putNode(regionNode);
						polygonList.add(polygon);

						if (currentArea != null) {
							AreaLabel areaLabel = createAreaLabel(currentArea);

							areaLabel
									.setURIOfIdentifiableToBeLabeled(regionNode
											.getURI());
							areaLabel.setNode(regionNode);
							regionNode.getLabels().add(areaLabel);
							graph.getNodeLabels().put(areaLabel.getURI(),
									areaLabel);
						}

						for (int j = 0; j < populationNames.size(); j++) {
							String currentPopName;
							double currentPopSize;

							if (populationNames.get(j).startsWith("column:")) {
								currentPopName = data.get(i).get(
										columnNames.indexOf(populationNames
												.get(j).replaceFirst("column:",
														"")));
							} else {
								currentPopName = populationNames.get(j);
							}

							if (populationSizes.get(j).startsWith("column:")) {
								try {
									currentPopSize = Double.parseDouble(data
											.get(i)
											.get(columnNames
													.indexOf(populationSizes
															.get(j)
															.replaceFirst(
																	"column:",
																	""))));
								} catch (NumberFormatException e) {
									currentPopSize = 0.0;
								}
							} else {
								try {
									currentPopSize = Double
											.parseDouble(populationSizes.get(j));
								} catch (NumberFormatException e) {
									currentPopSize = 0.0;
								}
							}

							PopulationLabel popLabel = createPopulationLabel(
									currentPopName, currentPopSize);

							popLabel.setURIOfIdentifiableToBeLabeled(regionNode
									.getURI());
							popLabel.setNode(regionNode);
							regionNode.getLabels().add(popLabel);
							graph.getNodeLabels().put(popLabel.getURI(),
									popLabel);
						}
					} else {
						System.err
								.println("Region Shapefile contains non-polygon");
					}
				}// for entries in shapeList
			} else {
				Activator
						.logInformation("Warning, shape file contains null entries");
			}

		}
	}

	/**
	 * This method iterates through all shapefiles that contain roads. For each
	 * polyline representing a road it is checked which polygons are connected
	 * by this polyline and RoadTransporationEdges are created between the
	 * connected polygons. These edges are added to the graph.
	 * 
	 * @param graph
	 *            the graph to which the edges are added
	 * @param nodeList
	 *            list of all nodes created by processRegionShapefiles
	 * @param polygonList
	 *            list of all polygons created by processRegionShapefiles
	 */
	private void processRoadShapefiles(Graph graph, List<Node> nodeList,
			List<ShpPolyLine> polygonList) {
		for (Shapefile s : shapefiles) {
			if (!(s instanceof RoadShapefile)) {
				continue;
			}

			RoadShapefile shapefile = (RoadShapefile) s;
			List<ShpRecord> shapeList = null;
			List<List<String>> data = null;
			List<String> columnNames = null;
			String roadID = shapefile.getId();
			String roadClass = shapefile.getRoadClass();

			try {
				Reader reader = new Reader(shapefile.getFileName());

				shapeList = reader.getShapeList();
				data = reader.getData();
				columnNames = reader.getColumnNames();
			} catch (Exception e) {
				e.printStackTrace();
			}

			for (int i = 0; i < shapeList.size(); i++) {
				ShpRecord shape = shapeList.get(i);

				if (shape instanceof ShpPolyLine) {
					ShpPolyLine polyline = (ShpPolyLine) shape;

					adjustNumberOfFractionalDigits(polyline);

					Map<Point, Integer> crossings = getCrossings(polyline,
							polygonList);
					String currentID = data.get(i).get(
							columnNames.indexOf(roadID.replaceFirst("column:",
									"")));

					// Remove spaces from ID, cause it will be used as part of
					// URI
					currentID = currentID.replace(" ", "");

					String currentClass = null;

					if (roadClass.startsWith("column:")) {
						currentClass = data.get(i).get(
								columnNames.indexOf(roadClass.replaceFirst(
										"column:", "")));
					} else {
						currentClass = roadClass;
					}

					for (Entry<Point, Integer> entry : crossings.entrySet()) {
						int loc1 = entry.getKey().x;
						int loc2 = entry.getKey().y;
						int numCrossings = entry.getValue();

						graph.putEdge(createRoadTransportEdge(
								nodeList.get(loc1), nodeList.get(loc2),
								currentID, currentClass, numCrossings));
					}
				} else {
					System.err.println("Road Shapefile contains non-polyline");
				}
			}
		}
	}

	/**
	 * This method iterates through all shapefiles that contain polylines with
	 * migration data. For each of these polylines it is checked which polygons
	 * are connected by this polyline and MigrationEdges are created between the
	 * connected polygons. These edges are added to the graph.
	 * 
	 * @param graph
	 *            the graph to which the edges are added
	 * @param nodeList
	 *            list of all nodes created by processRegionShapefiles
	 * @param polygonList
	 *            list of all polygons created by processRegionShapefiles
	 */
	private void processMigrationShapefiles(Graph graph, List<Node> nodeList,
			List<ShpPolyLine> polygonList) {
		for (Shapefile s : shapefiles) {
			if (!(s instanceof MigrationShapefile)) {
				continue;
			}

			MigrationShapefile shapefile = (MigrationShapefile) s;
			List<ShpRecord> shapeList = null;
			List<List<String>> data = null;
			List<String> columnNames = null;
			String migrationID = shapefile.getId();
			String migrationPopulation = shapefile.getPopulationName();
			String migrationRate = shapefile.getMigrationRate();

			try {
				Reader reader = new Reader(shapefile.getFileName());

				shapeList = reader.getShapeList();
				data = reader.getData();
				columnNames = reader.getColumnNames();
			} catch (Exception e) {
				e.printStackTrace();
			}

			for (int i = 0; i < shapeList.size(); i++) {
				ShpRecord shape = shapeList.get(i);

				if (shape instanceof ShpPolyLine) {
					ShpPolyLine polyline = (ShpPolyLine) shape;

					adjustNumberOfFractionalDigits(polyline);

					Map<Point, Integer> crossings = getCrossings(polyline,
							polygonList);
					String currentID = data.get(i).get(
							columnNames.indexOf(migrationID.replaceFirst(
									"column:", "")));

					// Remove spaces from ID, cause it will be used as part of
					// URI
					currentID = currentID.replace(" ", "");

					String currentPopulation = null;
					double currentRate = 0.0;

					if (migrationPopulation.startsWith("column:")) {
						currentPopulation = data.get(i).get(
								columnNames.indexOf(migrationPopulation
										.replaceFirst("column:", "")));
					} else {
						currentPopulation = migrationPopulation;
					}

					if (migrationRate.startsWith("column:")) {
						currentRate = Double.parseDouble(data.get(i).get(
								columnNames.indexOf(migrationRate.replaceFirst(
										"column:", ""))));
					} else {
						currentRate = Double.parseDouble(migrationRate);
					}

					for (Entry<Point, Integer> entry : crossings.entrySet()) {
						int loc1 = entry.getKey().x;
						int loc2 = entry.getKey().y;
						int numCrossings = entry.getValue();

						graph.putEdge(createMigrationEdge(nodeList.get(loc1),
								nodeList.get(loc2), currentID,
								currentPopulation, numCrossings * currentRate));
						graph.putEdge(createMigrationEdge(nodeList.get(loc2),
								nodeList.get(loc1), currentID,
								currentPopulation, numCrossings * currentRate));
					}
				} else {
					System.err
							.println("Migration Shapefile contains non-polyline");
				}
			}
		}
	}

	/**
	 * This method creates a CommonBorderEdge between each pair of nodes whose
	 * polygons have a common border. The edges are add to the graph.
	 * 
	 * @param graph
	 *            the graph to which the edges are added
	 * @param nodeList
	 *            list of all nodes created by processRegionShapefiles
	 * @param polygonList
	 *            list of all polygons created by processRegionShapefiles
	 */
	private void processCommonBorderCreation(Graph graph,
			List<Node> nodeHolder, List<ShpPolyLine> polygonList) {
		int n = polygonList.size();
		List<Rectangle2D> boundingBoxList = new ArrayList<Rectangle2D>(n);

		for (ShpPolyLine p : polygonList) {
			Box b = p.getBoundingBox();

			boundingBoxList.add(new Rectangle2D.Double(b.getXMin(),
					b.getYMin(), b.getXMax() - b.getXMin(), b.getYMax()
							- b.getYMin()));
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				Rectangle2D intersection = boundingBoxList.get(i)
						.createIntersection(boundingBoxList.get(j));

				if (intersection.getWidth() >= 0.0
						&& intersection.getHeight() >= 0.0) {
					double borderLength = commonBorderLength(
							polygonList.get(i), polygonList.get(j));

					if (borderLength > 0) {
						graph.putEdge(createCommonBorderEdge(nodeHolder.get(i),
								nodeHolder.get(j), borderLength));
					}
				}
			}
		}
	}

	/**
	 * For each pair of polygons that are connected by the polyline, the number
	 * of crossing of the common border of the two polygons by the polyline is
	 * returned.
	 * 
	 * @param polyline
	 *            polyline for which the crossings are computed
	 * @param polygonList
	 *            list of all polygons created by processRegionShapefiles
	 * @return Map with polygon index pair as key (lower index is first value)
	 *         and number of crossing as value
	 */
	private Map<Point, Integer> getCrossings(ShpPolyLine polyline,
			List<ShpPolyLine> polygonList) {
		Map<Point, Integer> crossings = new HashMap<Point, Integer>();
		for (Part p : polyline.getParts()) {
			double[] xs = p.getXs();
			double[] ys = p.getYs();
			int lastContainingPolygon = -1;

			for (int i = 0; i < xs.length; i++) {
				int containingPolygon = getContainingPolygon(xs[i], ys[i],
						polygonList, lastContainingPolygon);

				if (containingPolygon != lastContainingPolygon
						&& containingPolygon != -1
						&& lastContainingPolygon != -1) {
					int loc1 = Math.min(lastContainingPolygon,
							containingPolygon);
					int loc2 = Math.max(lastContainingPolygon,
							containingPolygon);
					Integer n = crossings.get(new Point(loc1, loc2));

					if (n != null) {
						crossings.put(new Point(loc1, loc2), n + 1);
					} else {
						crossings.put(new Point(loc1, loc2), 1);
					}
				}

				lastContainingPolygon = containingPolygon;
			}
		}

		return crossings;
	}

	/**
	 * Returns the index of the polygons that contains the point (x/y). First
	 * the polygon with index guess is checked if guess != -1.
	 * 
	 * @param x
	 *            x-coordinate of the point
	 * @param y
	 *            y-coordinate of the point
	 * @param esriPolygonLists
	 *            list of all polygons created by processRegionShapefiles
	 * @param guess
	 *            index of polygon that is checked first
	 * @return index of the polygon that contains the point
	 */
	private int getContainingPolygon(double x, double y,
			List<ShpPolyLine> esriPolygonLists, int guess) {
		if (guess != -1) {
			ShpPolyLine list = esriPolygonLists.get(guess);

			for (Part p : list.getParts()) {
				if (isPointInPolygon(x, y, p)) {
					return guess;
				}
			}
		}

		for (int i = 0; i < esriPolygonLists.size(); i++) {
			ShpPolyLine list = esriPolygonLists.get(i);

			if (i == guess) {
				continue;
			}

			for (Part p : list.getParts()) {
				if (isPointInPolygon(x, y, p)) {
					return i;
				}
			}
		}

		return -1;
	}

	/**
	 * Converts the polygon to a STEM-type polygon.
	 * 
	 * @param polygon
	 *            polygon to convert
	 * @return STEM-type polygon
	 */
	private LatLong createSTEMPolygon(ShpPolyLine polygon) {
		LatLong retValue = new LatLong();

		for (Part p : polygon.getParts()) {
			SegmentBuilder sb = new SegmentBuilder();
			double[] xs = p.getXs();
			double[] ys = p.getYs();

			for (int i = 0; i < xs.length; i++) {
				double latitude = ys[i];
				double longitude = xs[i];

				sb.add(latitude, longitude);
			}

			retValue.add(sb.toSegment());
		}

		return retValue;
	}

	/**
	 * Creates a node for a region with the specified name.
	 * 
	 * @param regionName
	 *            name of the region
	 * @return region node
	 */
	private Region createRegionNode(String regionName) {
		Region node = NodesFactory.eINSTANCE.createRegion();

		node.getDublinCore().setTitle(regionName);
		node.setURI(STEMURI.createURI(Region.URI_TYPE_REGION_NODE_SEGMENT + "/"
				+ makeURICompatible(regionName)));

		return node;
	}

	/**
	 * Creates an area label.
	 * 
	 * @param area
	 *            area size
	 * @return area label
	 */
	private AreaLabel createAreaLabel(double area) {
		AreaLabel areaLabel = LabelsFactory.eINSTANCE.createAreaLabel();

		areaLabel.getCurrentAreaValue().setArea(area);

		return areaLabel;
	}

	/**
	 * Creates a population label for the specified population.
	 * 
	 * @param populationName
	 *            name of the population
	 * @param populationSize
	 *            size of the population
	 * @return population label
	 */
	private PopulationLabel createPopulationLabel(String populationName,
			double populationSize) {
		PopulationLabel popLabel = LabelsFactory.eINSTANCE
				.createPopulationLabel();

		popLabel.setPopulationIdentifier(populationName);
		popLabel.getCurrentPopulationValue().setCount(populationSize);

		return popLabel;
	}

	/**
	 * Creates a RoadTransportEdge between the specified nodes.
	 * 
	 * @param nodeA
	 *            first node
	 * @param nodeB
	 *            second node
	 * @param roadID
	 *            ID of the RoadTransportEdge
	 * @param roadClass
	 *            class of the RoadTransportEdge
	 * @param numCrossings
	 *            number of crossings of the RoadTransportEdge
	 * @return RoadTransportEdge
	 */
	private Edge createRoadTransportEdge(Node nodeA, Node nodeB, String roadID,
			String roadClass, int numCrossings) {
		Edge edge = RoadTransportRelationshipLabelImpl
				.createRoadTransportRelationship(nodeA, nodeB, roadID,
						roadClass, numCrossings);

		edge.setURI(STEMURI.createURI(Edge.URI_TYPE_EDGE_SEGMENT + "/"
				+ nodeA.getURI().lastSegment() + "_"
				+ nodeB.getURI().lastSegment() + "_"
				+ makeURICompatible(roadID)));
		edge.getDublinCore().setTitle(roadID);

		return edge;
	}

	/**
	 * Creates a MigrationEdge between the specified nodes.
	 * 
	 * @param nodeA
	 *            source node
	 * @param nodeB
	 *            destination node
	 * @param migrationID
	 *            ID of the MigrationEdge
	 * @param migrationPopulation
	 *            population identifier of the MigrationEdge
	 * @param migrationRate
	 *            migration rate of the MigrationEdge
	 * @return MigrationEdge
	 */
	private MigrationEdge createMigrationEdge(Node nodeA, Node nodeB,
			String migrationID, String migrationPopulation, double migrationRate) {
		MigrationEdge mEdge = EdgesFactory.eINSTANCE.createMigrationEdge();

		mEdge.setURI(STEMURI
				.createURI(MigrationEdge.URI_TYPE_MIGRATION_EDGE_SEGMENT + "/"
						+ nodeA.getURI().lastSegment() + "_"
						+ nodeB.getURI().lastSegment() + "_"
						+ makeURICompatible(migrationID)));
		mEdge.setNodeAURI(nodeA.getURI());
		mEdge.setNodeBURI(nodeB.getURI());
		mEdge.getLabel().setURIOfIdentifiableToBeLabeled(mEdge.getURI());
		mEdge.getLabel().getCurrentValue().setMigrationRate(migrationRate);
		mEdge.getDublinCore().setTitle(migrationID);
		mEdge.setPopulationIdentifier(migrationPopulation);

		return mEdge;
	}

	/**
	 * Creates a CommonBorderEdge between the specified nodes.
	 * 
	 * @param nodeA
	 *            first node
	 * @param nodeB
	 *            second node
	 * @param borderLength
	 *            length of the common border
	 * @return CommonBorderEdge
	 */
	private Edge createCommonBorderEdge(Node nodeA, Node nodeB,
			double borderLength) {
		Edge edge = CommonBorderRelationshipLabelImpl
				.createCommonBorderRelationship(nodeA, nodeB, borderLength);
		String sEdge = edge.getURI().toString();
		int last = sEdge.lastIndexOf("/");
		String sEdge1 = sEdge.substring(0, last);
		String sEdge2 = sEdge.substring(last, sEdge.length());
		URI newURI = URI.createURI(sEdge1 + "/relationship/commonborder"
				+ sEdge2);

		edge.setURI(newURI);
		edge.getDublinCore().setTitle(
				"Edge[(" + nodeA.getDublinCore().getTitle() + ")<->("
						+ nodeB.getDublinCore().getTitle() + ")]");

		return edge;
	}

	/**
	 * Computes the length of the common border between the specified polygons.
	 * 
	 * @param a
	 *            first polygon
	 * @param b
	 *            second polygon
	 * @return length of the common border
	 */
	private double commonBorderLength(ShpPolyLine a, ShpPolyLine b) {
		double border_length = 0;
		Set<Point2D.Double> bPoints = new HashSet<Point2D.Double>();

		for (Part p : b.getParts()) {
			double[] xs = p.getXs();
			double[] ys = p.getYs();

			for (int i = 0; i < xs.length; i++) {
				bPoints.add(new Point2D.Double(xs[i], ys[i]));
			}
		}

		for (Part p : a.getParts()) {
			double[] xs = p.getXs();
			double[] ys = p.getYs();
			Point2D.Double p1 = null;

			for (int i = 0; i < xs.length; i++) {
				Point2D.Double p2 = new Point2D.Double(xs[i], ys[i]);

				if (bPoints.contains(p2)) {
					if (p1 != null) {
						border_length += getDistanceInKM(p1.y, p1.x, p2.y,
								p2.x, false);
					}

					p1 = p2;
				} else {
					p1 = null;
				}
			}
		}

		return border_length;
	}

	/**
	 * Computes the distance in km between two points in latitude/longitude
	 * coordinates.
	 * 
	 * @param lat1
	 *            latitude of first point in degrees
	 * @param lon1
	 *            longitude of first point in degrees
	 * @param lat2
	 *            latitude of second point in degrees
	 * @param lon2
	 *            longitude of second point in degrees
	 * @param approx
	 *            true if an approximative solution should be computed (faster),
	 *            false otherwise
	 * @return distance between the point in km
	 */
	private double getDistanceInKM(double lat1, double lon1, double lat2,
			double lon2, boolean approx) {
		double value;

		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);

		if (approx) {
			double x = (lon2 - lon1) * Math.cos((lat1 + lat2) / 2);
			double y = (lat2 - lat1);

			value = Math.sqrt(x * x + y * y) * 6731;
		} else {
			value = Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1)
					* Math.cos(lat2) * Math.cos(lon2 - lon1)) * 6731;
		}

		if (Double.isNaN(value) || Double.isInfinite(value)) {
			value = 0.0;
		}

		return value;
	}

	/**
	 * Returns true if the point (x/y) is in the polygon poly.
	 * 
	 * @param x
	 *            x-coordinate of the point
	 * @param y
	 *            y-coordinate of the point
	 * @param poly
	 *            polygon
	 * @return true if the point is in the polygon polygon, false otherwise
	 */
	private boolean isPointInPolygon(double x, double y, Part poly) {
		double[] xs = poly.getXs();
		double[] ys = poly.getYs();
		int n = xs.length;
		int hits = 0;
		double x1 = xs[n - 1];
		double y1 = ys[n - 1];

		for (int i = 0; i < n; i++) {
			double x2 = xs[i];
			double y2 = ys[i];

			if (y == y2) {
				if (x < x2) {
					double y3 = ys[(i + 1) % n];

					if (y > Math.min(y1, y3) && y < Math.max(y1, y3)) {
						hits++;
					}
				}
			} else {
				if (y > Math.min(y1, y2) && y < Math.max(y1, y2)) {
					double xProjection = (x2 - x1) / (y2 - y1) * (y - y1) + x1;

					if (x < xProjection) {
						hits++;
					}
				}
			}

			x1 = x2;
			y1 = y2;
		}

		return hits % 2 != 0;
	}

	/**
	 * Formats string so that it can be used in URI.
	 * 
	 * @param s
	 *            string to format
	 * @return formatted string
	 */
	private String makeURICompatible(String s) {
		s = s.replaceAll("/", "");
		//s = s.replaceAll("-", "");

		return s;
	}

	/**
	 * Sets the number of fractional digits to the number used in LatLong.
	 * 
	 * @param poly
	 *            polyline to adjust
	 */
	private void adjustNumberOfFractionalDigits(ShpPolyLine poly) {
		double factor = Math.pow(10, LatLong.NUMBER_OF_FACTIONAL_DIGITS);

		for (Part p : poly.getParts()) {
			for (int i = 0; i < p.getPointCount(); i++) {
				p.getXs()[i] = Math.rint(p.getXs()[i] * factor) / factor;
				p.getYs()[i] = Math.rint(p.getYs()[i] * factor) / factor;
			}
		}
	}

}
