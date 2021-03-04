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
package org.eclipse.stem.loggers.imagewriter.logger;

import java.awt.Shape;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.apache.commons.collections4.map.ReferenceMap;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapter;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapterFactory;
import org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection;

public class PolygonHandler 
{
	@SuppressWarnings("rawtypes")
	private static final Map<Class<? extends IMapProjection>, Map> cachedPolygons = 
			new HashMap<Class<? extends IMapProjection>, Map>();
	
	public static class ProjectedPolygons
	{
		public Identifiable identifiable;
		public List<Shape> polygons = new LinkedList<Shape>();
		public Rectangle2D bounds;
		public DynamicNodeLabel label;
		
		public ProjectedPolygons()
		{
			
		}
		
		public Rectangle2D getBoundingBox()
		{
			Rectangle2D bounds = null;
			
			for (Shape p : polygons) {
				if (bounds == null) {
					bounds = p.getBounds2D();
				} else {
					Rectangle2D shapeBounds = p.getBounds2D();
					bounds = bounds.createUnion(shapeBounds);
				}
			}
			
			return bounds;
		}
	}
	
	private static final ProjectedPolygons getProjectedPolygons(IMapProjection projection, Identifiable identifiable, LatLong points)
	{

		ProjectedPolygons polygons = new ProjectedPolygons();
		polygons.identifiable = identifiable;
		if (points != null) {
			for (LatLong.Segment segment : points.getSegments()) {
				if (segment.size() > 0) {
					int vertexCount = segment.size();
					Path2D.Float poly = new Path2D.Float(Path2D.WIND_EVEN_ODD, vertexCount);
					
					boolean started = false;
					for (int i = 0; i < vertexCount; i++) {
						double[] pt = projection.project(segment.latitude(i), segment.longitude(i));
						if (pt == null) {
							continue;
						}
						if (started) {
							poly.lineTo(pt[1], -pt[0]);
						} else {
							poly.moveTo(pt[1], -pt[0]);
							started = true;
						}
					}
					
					//poly.closePath();
					
					polygons.polygons.add(poly);//;new Polygon(xPoints, yPoints, vertexCount));
				}
			}
		}
		
		if (polygons.polygons.size() < 1) {
			polygons = null;
		}
		
		return polygons;
	}
	
	
	@SuppressWarnings("unchecked")
	public static ProjectedPolygons getPolygonsForProjection(IMapProjection projection, NodeLabel label)
	{
		
		@SuppressWarnings("rawtypes")
		Map projectionCache = cachedPolygons.get(projection.getClass());
		if (projectionCache == null) {
			// create a new map entry for the projection
			projectionCache = new ReferenceMap(ReferenceStrength.SOFT, ReferenceStrength.SOFT);
			cachedPolygons.put(projection.getClass(), projectionCache);
		}
		
		ProjectedPolygons retVal = null;
		
		Object obj = projectionCache.get(label.getIdentifiable().getURI());
		if (obj != null) {
			// We have an existing polygon set in cache.  return
			retVal = (ProjectedPolygons)obj;
			retVal.identifiable = label.getIdentifiable();
		} else {
			// The polygon is not cached.  We need to acquire the lat/lng data, project, and cache 
			LatLongProviderAdapter latLongProvider = 
					(LatLongProviderAdapter)LatLongProviderAdapterFactory.INSTANCE.adapt(label.getIdentifiable(), LatLongProvider.class);
			LatLong latLong = latLongProvider.getLatLong();
			
			retVal = getProjectedPolygons(projection, label.getIdentifiable(), latLong);
			if (retVal != null) {
				projectionCache.put(label.getIdentifiable().getURI(), retVal);
			}
		}
		
		return retVal;


	}
	
	
}
