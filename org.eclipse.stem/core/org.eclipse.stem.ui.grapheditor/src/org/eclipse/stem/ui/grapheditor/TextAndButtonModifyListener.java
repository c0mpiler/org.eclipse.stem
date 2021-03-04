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

package org.eclipse.stem.ui.grapheditor;

import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphItem;
import org.eclipse.zest.core.widgets.GraphNode;

public class TextAndButtonModifyListener implements ModifyListener,
		SelectionListener {

	public static final int NODE_TITLE = 1;	
	public static final int EDGE_TITLE = NODE_TITLE + 1;
	public static final int MIGRATION_LABEL_RATE = EDGE_TITLE + 1;
	public static final int MIGRATION_LABEL_POPULATION = MIGRATION_LABEL_RATE + 1;
	public static final int MIGRATION_LABEL_ABSOLUTE = MIGRATION_LABEL_POPULATION + 1;
	public static final int MIGRATION_LABEL_PERIOD = MIGRATION_LABEL_ABSOLUTE + 1;
	public static final int COMMON_BORDER_LABEL_LENGTH = MIGRATION_LABEL_PERIOD + 1;
	public static final int AREA_LABEL_VALUE = COMMON_BORDER_LABEL_LENGTH + 1;
	public static final int POPULATION_LABEL_POPULATION = AREA_LABEL_VALUE + 1;
	public static final int POPULATION_LABEL_COUNT = POPULATION_LABEL_POPULATION + 1;
	public static final int POPULATION_LABEL_AREA = POPULATION_LABEL_COUNT + 1;
	public static final int ROAD_LABEL_NAME = POPULATION_LABEL_AREA + 1;
	public static final int ROAD_LABEL_CLASS = ROAD_LABEL_NAME + 1;
	public static final int ROAD_LABEL_CROSSINGS = ROAD_LABEL_CLASS + 1;
	public static final int PIPE_LABEL_POPULATION = ROAD_LABEL_CROSSINGS + 1;
	public static final int PIPE_LABEL_FLOW = PIPE_LABEL_POPULATION + 1;
	public static final int PIPE_LABEL_PERIOD = PIPE_LABEL_FLOW + 1;

	private int attribute;
	private Graph zestGraph;

	TextAndButtonModifyListener(Graph zestGraph, int attribute) {
		this.attribute = attribute;
		this.zestGraph = zestGraph;
	}

	public void modifyText(final ModifyEvent e) {
		Text text = (Text) e.widget;

		if (!text.isFocusControl()) {
			return;
		}

		String newValue = text.getText();
		NodeData nodeData = null;
		ConnectionData edgeData = null;

		if (zestGraph.getSelection().size() == 1) {
			GraphItem selection = (GraphItem) zestGraph.getSelection().get(0);

			if (selection instanceof GraphNode) {
				nodeData = (NodeData) selection.getData();
			}
			if (selection instanceof GraphConnection) {
				edgeData = (ConnectionData) selection.getData();
			}
		}

		try {
			if (attribute == NODE_TITLE) {
				nodeData.setNodeTitle(newValue);
			} else if (attribute == EDGE_TITLE) {
				edgeData.setEdgeTitle(newValue);
			} else if (attribute == MIGRATION_LABEL_RATE) {
				edgeData.setMigrationRate(Double.parseDouble(newValue));
			} else if (attribute == MIGRATION_LABEL_POPULATION) {
				edgeData.setMigrationPopulation(newValue);
			} else if (attribute == MIGRATION_LABEL_PERIOD) {
				edgeData.setMigrationPeriod(Long.parseLong(newValue));
			} else if (attribute == COMMON_BORDER_LABEL_LENGTH) {
				edgeData.setCommonBorderLength(Double.parseDouble(newValue));
			} else if (attribute == AREA_LABEL_VALUE) {
				nodeData.setAreaLabelValue(Double.parseDouble(newValue));
			} else if (attribute == POPULATION_LABEL_POPULATION) {
				nodeData.setPopulationLabelPopulation(newValue);
			} else if (attribute == POPULATION_LABEL_COUNT) {
				nodeData.setPopulationLabelCount(Double.parseDouble(newValue));
			} else if (attribute == POPULATION_LABEL_AREA) {
				nodeData.setPopulationLabelArea(Double.parseDouble(newValue));
			} else if (attribute == ROAD_LABEL_NAME) {
				edgeData.setRoadName(newValue);
			} else if (attribute == ROAD_LABEL_CLASS) {
				edgeData.setRoadClass(newValue);
			} else if (attribute == ROAD_LABEL_CROSSINGS) {
				edgeData.setRoadCrossings(Integer.parseInt(newValue));
			} else if (attribute == PIPE_LABEL_POPULATION) {
				edgeData.setPipePopulation(newValue);
			} else if (attribute == PIPE_LABEL_FLOW) {
				edgeData.setPipeFlow(Double.parseDouble(newValue));
			} else if (attribute == ROAD_LABEL_CROSSINGS) {
				edgeData.setPipePeriod(Long.parseLong(newValue));
			}
		} catch (NumberFormatException ex) {
			// do nothing
		}
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		Button button = (Button) e.widget;

		if (!button.isFocusControl()) {
			return;
		}

		boolean newValue = button.getSelection();
		ConnectionData edgeData = null;

		if (zestGraph.getSelection().size() == 1) {
			GraphItem selection = (GraphItem) zestGraph.getSelection().get(0);

			if (selection instanceof GraphConnection) {
				edgeData = (ConnectionData) selection.getData();
			}
		}

		if (attribute == MIGRATION_LABEL_ABSOLUTE) {
			edgeData.setMigrationAbsolute(newValue);
		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

}
