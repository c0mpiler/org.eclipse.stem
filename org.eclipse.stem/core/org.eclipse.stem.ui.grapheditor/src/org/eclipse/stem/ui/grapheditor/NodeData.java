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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.PopulationLabel;

public class NodeData {

	private Node node;
	private double origX;
	private double origY;
	private int activeLabel;
	private int graphListIndex;

	public NodeData(Node node, double origX, double origY, int activeLabel,
			int graphListIndex) {
		this.node = node;
		this.origX = origX;
		this.origY = origY;
		this.activeLabel = activeLabel;
		this.graphListIndex = graphListIndex;
	}

	public Node getNode() {
		return node;
	}

	public URI getNodeURI() {
		return node.getURI();
	}

	public EList<NodeLabel> getNodeLabels() {
		return node.getLabels();
	}

	public String getNodeTitle() {
		if (node.getDublinCore().getTitle() != null) {
			return node.getDublinCore().getTitle();
		} else {
			return "";
		}
	}

	public void setNodeTitle(String nodeTitle) {
		node.getDublinCore().setTitle(nodeTitle);
	}

	public double getOrigX() {
		return origX;
	}

	public void setOrigX(double origX) {
		this.origX = origX;
	}

	public double getOrigY() {
		return origY;
	}

	public void setOrigY(double origY) {
		this.origY = origY;
	}

	public int getActiveLabel() {
		return activeLabel;
	}

	public void setActiveLabel(int activeLabel) {
		this.activeLabel = activeLabel;
	}

	public int getGraphListIndex() {
		return graphListIndex;
	}

	public double getAreaLabelValue() {
		AreaLabel areaLabel = (AreaLabel) node.getLabels().get(activeLabel);

		return areaLabel.getCurrentAreaValue().getArea();
	}

	public void setAreaLabelValue(double area) {
		AreaLabel areaLabel = (AreaLabel) node.getLabels().get(activeLabel);

		areaLabel.getCurrentAreaValue().setArea(area);
	}

	public String getPopulationLabelPopulation() {
		PopulationLabel populationLabel = (PopulationLabel) node.getLabels()
				.get(activeLabel);

		if (populationLabel.getPopulationIdentifier() != null) {
			return populationLabel.getPopulationIdentifier();
		} else {
			return "";
		}
	}

	public void setPopulationLabelPopulation(String population) {
		PopulationLabel populationLabel = (PopulationLabel) node.getLabels()
				.get(activeLabel);

		populationLabel.setPopulationIdentifier(population);
	}

	public double getPopulationLabelCount() {
		PopulationLabel populationLabel = (PopulationLabel) node.getLabels()
				.get(activeLabel);

		return populationLabel.getCurrentPopulationValue().getCount();
	}

	public void setPopulationLabelCount(double count) {
		PopulationLabel populationLabel = (PopulationLabel) node.getLabels()
				.get(activeLabel);

		populationLabel.getCurrentPopulationValue().setCount(count);
	}

	public double getPopulationLabelArea() {
		PopulationLabel populationLabel = (PopulationLabel) node.getLabels()
				.get(activeLabel);

		return populationLabel.getPopulatedArea();
	}

	public void setPopulationLabelArea(double area) {
		PopulationLabel populationLabel = (PopulationLabel) node.getLabels()
				.get(activeLabel);

		populationLabel.setPopulatedArea(area);
	}

}
