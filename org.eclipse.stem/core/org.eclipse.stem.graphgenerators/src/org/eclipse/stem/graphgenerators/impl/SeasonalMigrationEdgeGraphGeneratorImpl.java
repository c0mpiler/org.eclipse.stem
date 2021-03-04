/**
 */
package org.eclipse.stem.graphgenerators.impl;

import java.awt.Polygon;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.definitions.Activator;
import org.eclipse.stem.definitions.LocationUtility;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapter;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapterFactory;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabel;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabelValue;
import org.eclipse.stem.definitions.edges.impl.EdgesFactoryImpl;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.definitions.nodes.impl.RegionImpl;
import org.eclipse.stem.geography.centers.GeographicCenters;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seasonal Migration Edge Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl#getLocationA <em>Location A</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl#getLocationB <em>Location B</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl#getMigrationRate <em>Migration Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl#getToleranceAngleA <em>Tolerance Angle A</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.SeasonalMigrationEdgeGraphGeneratorImpl#getToleranceAngleB <em>Tolerance Angle B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeasonalMigrationEdgeGraphGeneratorImpl extends GraphGeneratorImpl implements SeasonalMigrationEdgeGraphGenerator {
	/**
	 * The default value of the '{@link #getLocationA() <em>Location A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationA()
	 * @generated
	 * @ordered
	 */
	protected static final URI LOCATION_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationA() <em>Location A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationA()
	 * @generated
	 * @ordered
	 */
	protected URI locationA = LOCATION_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationB() <em>Location B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationB()
	 * @generated
	 * @ordered
	 */
	protected static final URI LOCATION_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationB() <em>Location B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationB()
	 * @generated
	 * @ordered
	 */
	protected URI locationB = LOCATION_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getMigrationRate() <em>Migration Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double MIGRATION_RATE_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getMigrationRate() <em>Migration Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationRate()
	 * @generated
	 * @ordered
	 */
	protected double migrationRate = MIGRATION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_EDEFAULT = "human";

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected String population = POPULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getToleranceAngleA() <em>Tolerance Angle A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleranceAngleA()
	 * @generated
	 * @ordered
	 */
	protected static final double TOLERANCE_ANGLE_A_EDEFAULT = 15.0;

	/**
	 * The cached value of the '{@link #getToleranceAngleA() <em>Tolerance Angle A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleranceAngleA()
	 * @generated
	 * @ordered
	 */
	protected double toleranceAngleA = TOLERANCE_ANGLE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getToleranceAngleB() <em>Tolerance Angle B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleranceAngleB()
	 * @generated
	 * @ordered
	 */
	protected static final double TOLERANCE_ANGLE_B_EDEFAULT = 15.0;

	/**
	 * The cached value of the '{@link #getToleranceAngleB() <em>Tolerance Angle B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleranceAngleB()
	 * @generated
	 * @ordered
	 */
	protected double toleranceAngleB = TOLERANCE_ANGLE_B_EDEFAULT;
	
	
	private static final double DEG_TO_RADS = Math.PI/180.0;
	
	private static final double SQRT_TWO = Math.sqrt(2.0);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SeasonalMigrationEdgeGraphGeneratorImpl() {
		super();
	}

	
	/**
	 * Generate migration edges 
	 * Given two points A and B, and two angles toleranceAngleA and toleranceAngleB, this method draws a polygon containing A&B and the intersections of two rays 
	 * from A at +/- toleranceAngleA and
	 * from B at +/- toleranceAngleB and
	 * it then finds all common border edges that connect pairs of points AA,BB both contained in the polygon.
	 * For each pair AA-BB where AA is closer to A it created a directed migration edge from AA to BB
	 * For each pair AA-BB where AA is further from A than B it created a directed migration edge from BB to AA
	 * 
	 * For now they all get the same "Peak" migration rate.
	 * In the future we might want to base this on the directed angle AA<BB or some other measure.
	 * This is meant to be a "draft" graph of edges which the user can edit with the graph editor.
	 */
	@Override
	public Graph getGraph() {
		final Graph graph = GraphFactory.eINSTANCE.createGraph();
		final DublinCore dc = graph.getDublinCore();
		dc.populate();
		dc.setTitle(MigrationEdgeGraphGenerator.MIGRATION_EDGE_TYPE);
		dc.setSource(this.getClass().getSimpleName());
		Calendar c = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        String valid = formatter.format(c.getTime());
       	dc.setValid(valid);
       	
       	
       	URI uriA = this.getLocationA();
       	URI uriB = this.getLocationB();
       	String nodeURIA = uriA.lastSegment();
       	String nodeURIB = uriB.lastSegment();
        Node nodeA = LocationUtility.getNode(project, uriA);
        Node nodeB = LocationUtility.getNode(project, uriB);
        
        if((nodeA instanceof RegionImpl)&&(nodeB instanceof RegionImpl)) {
			
			double[] lat_lngA = GeographicCenters.getCenter(nodeURIA);
			double[] lat_lngB = GeographicCenters.getCenter(nodeURIB);
			// still null? Compute it
			if(lat_lngA==null) {
				// Get the lat/long of the center of the node
				final LatLongProviderAdapter latLongProviderA = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE.adapt(nodeA, LatLongProvider.class);
				lat_lngA = latLongProviderA.getCenter();
			}
			if(lat_lngB==null) {
				// Get the lat/long of the center of the node
				final LatLongProviderAdapter latLongProviderB = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE.adapt(nodeB, LatLongProvider.class);
				lat_lngB = latLongProviderB.getCenter();
			}
			
			// for now treat them as x,y points
			// TODO: we need to deal with - numbers and crossing 2pi (periodic boundaries)
			double directionalityAtoB = 1.0;
			double xA = lat_lngA[0];
			double yA = lat_lngA[1];
			double xB = lat_lngB[0];
			double yB = lat_lngB[1];
			if(lat_lngA[0] > lat_lngB[0]) {
				directionalityAtoB = -1.0;  // need to look outside the polygon TODO: Check this logic
				xB = lat_lngA[0];
				yB = lat_lngA[1];
				xA = lat_lngB[0];
				yA = lat_lngB[1];
			}
			
			
			// double xMid = (xA+xB)/2.0;
			// double yMid = (yA+yB)/2.0;
			double slope = (yB-yA)/(xB-xA);
			double intercept = yB - (slope*xB);
			
			double L = Math.sqrt(((xB-xA)*(xB-xA)) + ((yB-yA)*(yB-yA)) );
			double elevAngle = Math.asin((yB-yA)/L);
			
			// get the point along L where the two rays intersect in the rotated frame
			double denom = 1.0 + (Math.tan(DEG_TO_RADS*toleranceAngleA)/Math.tan(DEG_TO_RADS*toleranceAngleB));
			double L1 = L/denom; // distance along line where ray from A meets ray from B (above)
			// double L2 = L-L1;
			double h = L1*Math.tan(DEG_TO_RADS*toleranceAngleA); // height above line of intersection point
			
			// now get the cords along the line L
			// double xint = L1*Math.cos(elevAngle);
			// double yint = L1*Math.sin(elevAngle);
			
			// in the rotated frame the intersection point of the two lines is at the point (L1,h) relative to point A
			// this is the frame where L acts as the x axis.
			// in the normal frame we rotate back relative to origin A
			double alpha = -1.0 * elevAngle;
			double dx = L1*Math.cos(alpha) + h * Math.sin(alpha);
			double dy = (-1.0*L1*Math.sin(alpha))  + h * Math.cos(alpha);
			
			// so the upper intersection point is at
			double xUP = xA+dx;
			double yUP = yA+dy;
			
			// the LOWER Intersection point must be at (L1,-h) in the rotated frame. we still need to unrotate by alpha so... ( h ==> -h )
			double dx2 = L1*Math.cos(alpha) - h * Math.sin(alpha);
			double dy2 = (-1.0*L1*Math.sin(alpha))  - h * Math.cos(alpha);
			double xDOWN = xA+dx2;
			double yDOWN = yA+dy2;
			
			// now make a polygon (rhombus) from A to upper intersect to B to lower interesect and back to A
			
			double[] x = new double[4];
			double[] y = new double[4];
			x[0] = xA; x[1] = xUP;
			x[2] = xB; x[3] = xDOWN;
			y[0] = yA; y[1] = yUP;
			y[2] = yB; y[3] = yDOWN;
			Dpolygon dPoly = new Dpolygon(x,y);
			
			// gets ALL common border edges INSIDE the polygon region of interest. null location gets edges from the entire graph
			Set<Edge> allCommonBorderEdges = LocationUtility.getCommonBorderEdges(project, null);
			
			
			Activator.logInformation("This Generator Under Development: checking "+allCommonBorderEdges.size()+ "all edges");
			
	       	Set<Edge> containedCommonBorderEdges = filterEdges( allCommonBorderEdges , dPoly);
	       		       	
	       	Activator.logInformation("This Generator Under Development: filtered "+containedCommonBorderEdges.size()+ "contained edges");

	       	Iterator<Edge> iter = containedCommonBorderEdges.iterator();
			while((iter!=null)&&(iter.hasNext())){
	       	 		Edge e = iter.next();
					// int sourceLevel = Utility.keyLevel(e.getNodeAURI().lastSegment());
					// int targetLevel = Utility.keyLevel(e.getNodeBURI().lastSegment());
					URI sourceURI = e.getNodeAURI();
					URI targetURI = e.getNodeBURI();
					
					EdgesFactory ef = EdgesFactoryImpl.init();
					// we will only create one edge, not two
					// the order of nodes depends on which is closer to A and which is closer to B
					MigrationEdge mEdge1 = ef.createMigrationEdge();
					
					// The URI of the edge 1 
					URI edgeURI1 = mEdge1.getURI();
					     
					// the autogenerated edge uri is not correct. Need to replace it
					String s1 = edgeURI1.toString();
					int last = s1.lastIndexOf("/");
					String sEdge1 = s1.substring(0,last);
					String sEdge2 = s1.substring(last,s1.length());
					s1 = sEdge1+"/relationship/migration"+sEdge2;
					URI newURI = URI.createURI(s1);
					mEdge1.setURI(newURI);
					
					//  before:    medgeURI = stem://org.eclipse.stem/edge/migration/2911
					//	After:     medgeURI = stem://org.eclipse.stem/edge/migration/relationship/migration/2911
					  
					// now we need to set the uri for the label
					MigrationEdgeLabel label1 = mEdge1.getLabel();
					final DublinCore dc1 = mEdge1.getDublinCore();
					MigrationEdgeLabelValue melv1 = label1.getCurrentValue();
					melv1.setMigrationRate(directionalityAtoB*this.getMigrationRate());
					mEdge1.setUseAbsoluteValues(false);
					mEdge1.setPopulationIdentifier(this.getPopulation());
					
					// direction of the edge
					// ADD The URIs of the nodes connected by these two directed edges
					// if first node is closer to A and second node closer to be
					Node sourceNode= e.getA();
					Node targetNode = e.getB();
					double rA_source = getRange2(sourceNode, xA, yA);
					double rA_target = getRange2(targetNode, xA, yA);
					
					
					/////////////////////////////////////////////////////////
					// get distance from each node to the line connecting A&B
					double[] lat_lngSRC = GeographicCenters.getCenter(sourceURI.lastSegment());
					double[] lat_lngTRGT = GeographicCenters.getCenter(targetURI.lastSegment());
					// still null? Compute it
					if(lat_lngSRC==null) {
						// Get the lat/long of the center of the node
						final LatLongProviderAdapter latLongProviderA = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE.adapt(sourceNode, LatLongProvider.class);
						lat_lngSRC = latLongProviderA.getCenter();
					}
					if(lat_lngTRGT==null) {
						// Get the lat/long of the center of the node
						final LatLongProviderAdapter latLongProviderB = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE.adapt(targetNode, LatLongProvider.class);
						lat_lngTRGT = latLongProviderB.getCenter();
					}
					double srcDist = getDistanceToLine(lat_lngSRC, slope, intercept);
					double trgtDist = getDistanceToLine(lat_lngTRGT, slope, intercept);
					
					// get distance from each node to the line connecting A&B
					/////////////////////////////////////////////////////////
					
					if(rA_source != rA_target) {
						// A => B
						if(rA_source < rA_target) {
							mEdge1.setNodeAURI(sourceURI);
							mEdge1.setNodeBURI(targetURI);
							label1.setURI(createEdgeLabelURI(sourceURI, targetURI));
							dc1.setTitle(createEdgeTitle(sourceURI, targetURI));
							if(trgtDist>srcDist) {
								melv1.setMigrationRate(directionalityAtoB*this.getMigrationRate()/SQRT_TWO );
							}
						} else {
							mEdge1.setNodeAURI(targetURI);
							mEdge1.setNodeBURI(sourceURI);
							label1.setURI(createEdgeLabelURI(targetURI, sourceURI));
							dc1.setTitle(createEdgeTitle(targetURI, sourceURI));
							if(trgtDist<srcDist) {
								melv1.setMigrationRate(directionalityAtoB*this.getMigrationRate()/SQRT_TWO );
							}
						}
						
						
						
						//////////////////////
						graph.putEdge(mEdge1);
						//////////////////////
					
					}// if(rA_source != rA_target)
			}//for all contained edges
			
			
			
			
			

		} // IF NODES ARE REGION NODES
        else{
        	Activator.logInformation("Error: seasonal migration only works for region nodes defined in project");
        }
       	
       	
       	
		assert graph.sane();

		return graph;
		}// getGraph
	
	
	/**
	 * get the square of the "distance" from a note to a point x,y in lat/long space
	 * @param n
	 * @param x
	 * @param y
	 * @return
	 */
	public double getRange2(Node n, double x, double y) {
		LatLongProvider latLongProviderA = (LatLongProvider) LatLongProviderAdapterFactory.INSTANCE
				.adaptNew(n, LatLongProvider.class);
		double[] nodeCoords = latLongProviderA.getCenter();
		double r2 = (x-nodeCoords[0])*(x-nodeCoords[0]) + (y-nodeCoords[1])*(y-nodeCoords[1]);
		return r2;
	}
	
	/**
	 * 
	 * @param latlng
	 * @param m
	 * @param b
	 * @return
	 */
	public double getDistanceToLine(double[] latlng, double m, double b) {
		double numer = Math.abs(latlng[1] - (m*latlng[0]) - b);
		double denom = Math.sqrt((m*m)+1.0);
		return(numer/denom);
	}
	
	/**
	 * 
	 * @param commonBorderEdges
	 * @param p
	 * @return
	 */
	public Set<Edge> filterEdges(Set<Edge> allEdges, Dpolygon p) {
		Set<Edge> goodEdges = new HashSet<Edge>();
		for(Edge e:allEdges) {
			Node a = e.getA();
			Node b = e.getB();
			if((a instanceof Region)&&(b instanceof Region)) {
				LatLongProvider latLongProviderA = (LatLongProvider) LatLongProviderAdapterFactory.INSTANCE
						.adaptNew(a, LatLongProvider.class);
				double[] aCoords = latLongProviderA.getCenter();
				LatLongProvider latLongProviderB = (LatLongProvider) LatLongProviderAdapterFactory.INSTANCE
						.adaptNew(b, LatLongProvider.class);
				double[] bCoords = latLongProviderB.getCenter();
				
				if((p.contains(aCoords[0], aCoords[1])) &&(p.contains(bCoords[0], bCoords[1])) ) {
					goodEdges.add(e);
				}
				
			}else {
				// not region node
				Activator.logInformation("Warning: Graph does not contain Region Nodes");
				break;
			}
		}
		return goodEdges;
	}
	
	/**
	 * 
	 * @param uriA
	 * @param uriB
	 * @return
	 */
	private static URI createEdgeLabelURI(URI uriA, URI uriB) {
		
		//System.out.println("createEdgeLabelURI() : initially, uriA = "+uriA.toString());
		//System.out.println("createEdgeLabelURI() : initially, uriB = "+uriB.toString());
		
		String sA = uriA.lastSegment();
		String sB = uriB.lastSegment();
		
		// TODO is this still true??
		// MigrationEdgeLabelItemProvider
		// uses _ as a special character to separate the two nodes
		// so we need to replace it.
		sA=sA.replace('_','.');
		sB=sB.replace('_','.');
		String uriString = sA+"_"+sB;
		
		//System.out.println("createEdgeLabelURI() : FINALLY, uri = "+uriString);
		
        URI uri = STEMURI.createURI(uriString);
		return uri;
	} // createEdgeLabelURI
	
	/**
	 * @param x
	 *            the x of the node in the lattice
	 * @param y
	 *            the y of the node in the lattice
	 * @return a title for a node
	 */
	public static String createEdgeTitle(URI uriA, URI uriB) {
		String sA = uriA.lastSegment();
		String sB = uriB.lastSegment();
		final StringBuilder sb = new StringBuilder("MigrationEdge[(");
		sb.append(sA);
		sb.append(")<-->(");
		sb.append(sB);
		sb.append(")]");
		
		return sb.toString();
	} // createEdgeTitle
	/**
	 * IProject to create edges in
	 */
	private IProject project;
	
	/**
	 * get the current project
	 */
	public IProject getProject() {
		return project; 
	}
	
	/**
	 * set the current project
	 */
	public void setProject(IProject p) {
		this.project = p;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getLocationA() {
		return locationA;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationA(URI newLocationA) {
		URI oldLocationA = locationA;
		locationA = newLocationA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A, oldLocationA, locationA));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getLocationB() {
		return locationB;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationB(URI newLocationB) {
		URI oldLocationB = locationB;
		locationB = newLocationB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B, oldLocationB, locationB));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMigrationRate() {
		return migrationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMigrationRate(double newMigrationRate) {
		double oldMigrationRate = migrationRate;
		migrationRate = newMigrationRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE, oldMigrationRate, migrationRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(String newPopulation) {
		String oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION, oldPopulation, population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getToleranceAngleA() {
		return toleranceAngleA;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToleranceAngleA(double newToleranceAngleA) {
		double oldToleranceAngleA = toleranceAngleA;
		toleranceAngleA = newToleranceAngleA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A, oldToleranceAngleA, toleranceAngleA));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getToleranceAngleB() {
		return toleranceAngleB;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToleranceAngleB(double newToleranceAngleB) {
		double oldToleranceAngleB = toleranceAngleB;
		toleranceAngleB = newToleranceAngleB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B, oldToleranceAngleB, toleranceAngleB));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A:
				return getLocationA();
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B:
				return getLocationB();
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE:
				return getMigrationRate();
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION:
				return getPopulation();
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A:
				return getToleranceAngleA();
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B:
				return getToleranceAngleB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A:
				setLocationA((URI)newValue);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B:
				setLocationB((URI)newValue);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE:
				setMigrationRate((Double)newValue);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION:
				setPopulation((String)newValue);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A:
				setToleranceAngleA((Double)newValue);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B:
				setToleranceAngleB((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A:
				setLocationA(LOCATION_A_EDEFAULT);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B:
				setLocationB(LOCATION_B_EDEFAULT);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE:
				setMigrationRate(MIGRATION_RATE_EDEFAULT);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION:
				setPopulation(POPULATION_EDEFAULT);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A:
				setToleranceAngleA(TOLERANCE_ANGLE_A_EDEFAULT);
				return;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B:
				setToleranceAngleB(TOLERANCE_ANGLE_B_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A:
				return LOCATION_A_EDEFAULT == null ? locationA != null : !LOCATION_A_EDEFAULT.equals(locationA);
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B:
				return LOCATION_B_EDEFAULT == null ? locationB != null : !LOCATION_B_EDEFAULT.equals(locationB);
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE:
				return migrationRate != MIGRATION_RATE_EDEFAULT;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION:
				return POPULATION_EDEFAULT == null ? population != null : !POPULATION_EDEFAULT.equals(population);
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A:
				return toleranceAngleA != TOLERANCE_ANGLE_A_EDEFAULT;
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B:
				return toleranceAngleB != TOLERANCE_ANGLE_B_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (locationA: ");
		result.append(locationA);
		result.append(", locationB: ");
		result.append(locationB);
		result.append(", migrationRate: ");
		result.append(migrationRate);
		result.append(", population: ");
		result.append(population);
		result.append(", toleranceAngleA: ");
		result.append(toleranceAngleA);
		result.append(", toleranceAngleB: ");
		result.append(toleranceAngleB);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * inner class
	 * turns double x,y arrays to larger integers for polygon
	 * @author jhkauf
	 *
	 */
	public class Dpolygon {
		
		Polygon p;
		static final double RESCALE = 1000000.0;
		
		public Dpolygon(double[] x, double[] y) {
			int npoints = x.length;
			int[] ix = new int[npoints];
			int[] iy = new int[npoints];
			for (int i = 0; i < npoints; i ++) {
				ix[i] = (int)Math.round(RESCALE*x[i]);
				iy[i] = (int)Math.round(RESCALE*y[i]);
			}
			p = new Polygon(ix,iy,npoints);
		}// constructor
		
		/**
		 * determine containment
		 * @param x
		 * @param y
		 * @return
		 */
		public boolean contains(double x, double y) {
			int ix = (int)Math.round(RESCALE*x);
			int iy = (int)Math.round(RESCALE*y);
			return p.contains(ix, iy);
		}
	}// inner class Dpolygon
	

} //SeasonalMigrationEdgeGraphGeneratorImpl
