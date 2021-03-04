/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut für Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.ui.grapheditor;

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;
import org.eclipse.stem.definitions.transport.PipeTransportEdge;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabelValue;

public class ConnectionData {

	private Edge edge;
	private int curveDepth;

	public ConnectionData(Edge edge, int curveDepth) {
		this.edge = edge;
		this.curveDepth = curveDepth;
	}

	public Edge getEdge() {
		return edge;
	}

	public URI getURI() {
		return edge.getURI();
	}

	public URI getNodeAURI() {
		return edge.getNodeAURI();
	}

	public URI getNodeBURI() {
		return edge.getNodeBURI();
	}

	public EdgeLabel getEdgeLabel() {
		return edge.getLabel();
	}

	public String getEdgeTitle() {
		if (edge.getDublinCore().getTitle() != null) {
			return edge.getDublinCore().getTitle();
		} else {
			return "";
		}
	}

	public void setEdgeTitle(String edgeTitle) {
		edge.getDublinCore().setTitle(edgeTitle);
	}

	public double getCommonBorderLength() {
		CommonBorderRelationshipLabelValue borderValue = (CommonBorderRelationshipLabelValue) edge
				.getLabel().getCurrentValue();

		return borderValue.getBorderLength();
	}

	public void setCommonBorderLength(double value) {
		CommonBorderRelationshipLabelValue borderValue = (CommonBorderRelationshipLabelValue) edge
				.getLabel().getCurrentValue();

		borderValue.setBorderLength(value);
	}

	public String getMigrationPopulation() {
		MigrationEdge migrationEdge = (MigrationEdge) edge;

		if (migrationEdge.getPopulationIdentifier() != null) {
			return migrationEdge.getPopulationIdentifier();
		} else {
			return "";
		}
	}

	public void setMigrationPopulation(String value) {
		MigrationEdge migrationEdge = (MigrationEdge) edge;

		migrationEdge.setPopulationIdentifier(value);
	}
	
	public boolean getMigrationAbsolute() {
		MigrationEdge migrationEdge = (MigrationEdge) edge;

		return migrationEdge.isUseAbsoluteValues();
	}
	
	public void setMigrationAbsolute(boolean value) {
		MigrationEdge migrationEdge = (MigrationEdge) edge;

		migrationEdge.setUseAbsoluteValues(value);
	}

	public double getMigrationRate() {
		MigrationEdge migrationEdge = (MigrationEdge) edge;

		return migrationEdge.getLabel().getCurrentValue().getMigrationRate();
	}

	public void setMigrationRate(double value) {
		MigrationEdge migrationEdge = (MigrationEdge) edge;

		migrationEdge.getLabel().getCurrentValue().setMigrationRate(value);
	}

	public long getMigrationPeriod() {
		MigrationEdge migrationEdge = (MigrationEdge) edge;

		return migrationEdge.getLabel().getCurrentValue().getTimePeriod();
	}
	
	public void setMigrationPeriod(long value) {
		MigrationEdge migrationEdge = (MigrationEdge) edge;

		migrationEdge.getLabel().getCurrentValue().setTimePeriod(value);
	}

	public String getRoadName() {
		RoadTransportRelationshipLabelValue roadValue = (RoadTransportRelationshipLabelValue) edge
				.getLabel().getCurrentValue();

		if (roadValue.getRoadName() != null) {
			return roadValue.getRoadName();
		} else {
			return "";
		}
	}

	public void setRoadName(String roadName) {
		RoadTransportRelationshipLabelValue roadValue = (RoadTransportRelationshipLabelValue) edge
				.getLabel().getCurrentValue();

		roadValue.setRoadName(roadName);
	}

	public String getRoadClass() {
		RoadTransportRelationshipLabelValue roadValue = (RoadTransportRelationshipLabelValue) edge
				.getLabel().getCurrentValue();

		if (roadValue.getRoadClass() != null) {
			return roadValue.getRoadClass();
		} else {
			return "";
		}
	}

	public void setRoadClass(String roadClass) {
		RoadTransportRelationshipLabelValue roadValue = (RoadTransportRelationshipLabelValue) edge
				.getLabel().getCurrentValue();

		roadValue.setRoadClass(roadClass);
	}

	public int getRoadCrossings() {
		RoadTransportRelationshipLabelValue roadValue = (RoadTransportRelationshipLabelValue) edge
				.getLabel().getCurrentValue();

		return roadValue.getNumberCrossings();
	}

	public void setRoadCrossings(int crossings) {
		RoadTransportRelationshipLabelValue roadValue = (RoadTransportRelationshipLabelValue) edge
				.getLabel().getCurrentValue();

		roadValue.setNumberCrossings(crossings);
	}

	public String getPipePopulation() {
		PipeTransportEdge pipe = (PipeTransportEdge) edge;

		if (pipe.getPopulationIdentifier() != null) {
			return pipe.getPopulationIdentifier();
		} else {
			return "";
		}
	}

	public void setPipePopulation(String population) {
		PipeTransportEdge pipe = (PipeTransportEdge) edge;

		pipe.setPopulationIdentifier(population);
	}

	public double getPipeFlow() {
		PipeTransportEdgeLabelValue pipeValue = (PipeTransportEdgeLabelValue) edge
				.getLabel().getCurrentValue();

		return pipeValue.getMaxFlow();
	}

	public void setPipeFlow(double flow) {
		PipeTransportEdgeLabelValue pipeValue = (PipeTransportEdgeLabelValue) edge
				.getLabel().getCurrentValue();

		pipeValue.setMaxFlow(flow);
	}

	public long getPipePeriod() {
		PipeTransportEdgeLabelValue pipeValue = (PipeTransportEdgeLabelValue) edge
				.getLabel().getCurrentValue();

		return pipeValue.getTimePeriod();
	}

	public void setPipePeriod(long period) {
		PipeTransportEdgeLabelValue pipeValue = (PipeTransportEdgeLabelValue) edge
				.getLabel().getCurrentValue();

		pipeValue.setTimePeriod(period);
	}

	public int getCurveDepth() {
		return curveDepth;
	}

	public void setCurveDepth(int curveDepth) {
		this.curveDepth = curveDepth;
	}

}