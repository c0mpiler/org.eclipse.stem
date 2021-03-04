package org.eclipse.stem.ui.preferences;

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

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceConstants {

	/**
	 * The preference id for the name of the attribute to display when a
	 * visualization is first displayed. Used for Data Display Y axis.
	 */
	public static final String INITIAL_ATTRIBUTE_NAME_STRING_PREFERENCE = "org.eclipse.stem.ui.initialattributename";

	/**
	 * The preference id for the name of the attribute to display when a
	 * visualization is first displayed. Used for Phase Space Display X axis.
	 */
	public static final String INITIAL_ATTRIBUTE_NAME_STRING_PREFERENCE2 = "org.eclipse.stem.ui.initialattributename2";

	/**
	 * The preference ID for the translation X variable in the Graph Map class.
	 */
	public static final String GRAPHMAP_PERSISTANT_VIEW_TRANS_X = "org.eclipse.stem.ui.views.graphmap.translationx";
	/**
	 * The preference ID for the translation Y variable in the Graph Map class.
	 */
	public static final String GRAPHMAP_PERSISTANT_VIEW_TRANS_Y = "org.eclipse.stem.ui.views.graphmap.translationy";
	/**
	 * The preference ID for the scale X variable in the Graph Map class.
	 */
	public static final String GRAPHMAP_PERSISTANT_VIEW_SCALE_FACTOR = "org.eclipse.stem.ui.views.graphmap.scalefactor";
	/**
	 * The preference ID for the bounds of the last loaded map (x) in the Graph
	 * Map class.
	 */
	public static final String GRAPHMAP_PERSISTANT_VIEW_MAP_BOUNDS_X = "org.eclipse.stem.ui.views.graphmap.boundsx";
	/**
	 * The preference ID for the bounds of the last loaded map (y) in the Graph
	 * Map class.
	 */
	public static final String GRAPHMAP_PERSISTANT_VIEW_MAP_BOUNDS_Y = "org.eclipse.stem.ui.views.graphmap.boundsy";

	public static final String GRAPHMAP_PERSISTANT_DRAW_POLYGON_BORDERS = "org.eclipse.stem.ui.views.graphmap.drawpolygonborders";
	public static final String GRAPHMAP_PERSISTANT_USE_LOG_SCALING = "org.eclipse.stem.ui.views.graphmap.uselogscaling";
	public static final String GRAPHMAP_PERSISTANT_USE_LOG_EDGE_SCALING = "org.eclipse.stem.ui.views.graphmap.useedgelogscaling";
	public static final String GRAPHMAP_PERSISTANT_GAIN_FACTOR = "org.eclipse.stem.ui.views.graphmap.gainfactor";
	public static final String GRAPHMAP_PERSISTANT_EDGE_GAIN_FACTOR = "org.eclipse.stem.ui.views.graphmap.edgegainfactor";
	public static final String GRAPHMAP_PERSISTANT_ADJUST_EDGE_THICKNESS = "org.eclipse.stem.ui.views.graphmap.adjustedgethickness";
	public static final String GRAPHMAP_PERSISTANT_SHOW_OPTIONS_VIEW = "org.eclipse.stem.ui.views.graphmap.showoptionsview";

	public static final String GEOVIEW_EDGE_OPTION = "org.eclipse.stem.ui.views.graphmap.geoview.edge";

	public static final String GEOVIEW_DECORATOR_OPTION = "org.eclipse.stem.ui.views.graphmap.geoview.decorator";

	public static final String GEOVIEW_POPULATION_OPTION = "org.eclipse.stem.ui.views.graphmap.geoview.populationidentifier";

	public static final String GEOVIEW_COLORPROVIDER_OPTION = "org.eclipse.stem.ui.views.graphmap.geoview.colorprovider";

	public static final String GEOVIEW_COLORPROVIDER_PROPERTY_OPTION = "org.eclipse.stem.ui.views.graphmap.geoview.colorproviderproperty";

	/**
	 * The preference id for different foreground colors for various labels. If
	 * a label is not on the list, foreground color uses the default.
	 */
	public static final String FOREGROUND_COLOR_DEFAULT = "org.eclipse.stem.ui.views.geographic.map.preferences.foregrounddefaultcolor";
	/**
	 * The preference ID for a first user selectable color that can be chosen
	 * and assigned to a property (e.g., S) being visualized (eg in a time
	 * series plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_1 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorone";
	/**
	 * The preference ID for a second user selectable color that can be chosen
	 * and assigned to a property (e.g., E) being visualized (eg in a time
	 * series plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_2 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolortwo";
	/**
	 * The preference ID for a third user selectable color that can be chosen
	 * and assigned to a property (e.g., I) being visualized (eg in a time
	 * series plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_3 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorthee";
	/**
	 * The preference ID for a fourth user selectable color that can be chosen
	 * and assigned to a property (e.g., R) being visualized (eg in a time
	 * series plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_4 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorfour";
	/**
	 * The preference ID for a fifth user selectable color that can be chosen
	 * and assigned to a property (e.g., P) being visualized (eg in a time
	 * series plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_5 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorfive";
	/**
	 * The preference ID for a sixth user selectable color that can be chosen
	 * and assigned to a property (e.g., IR) being visualized (eg in a time
	 * series plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_6 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorsix";
	/**
	 * The preference ID for a seventh user selectable color that can be chosen
	 * and assigned to a property (e.g., ) being visualized (eg in a time series
	 * plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_7 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorseven";

	/**
	 * The preference ID for a seventh user selectable color that can be chosen
	 * and assigned to a property (e.g., ) being visualized (eg in a time series
	 * plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_8 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcoloreight";
	/**
	 * The preference ID for a seventh user selectable color that can be chosen
	 * and assigned to a property (e.g., ) being visualized (eg in a time series
	 * plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_9 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolornine";
	/**
	 * The preference ID for a seventh user selectable color that can be chosen
	 * and assigned to a property (e.g., ) being visualized (eg in a time series
	 * plot)
	 */
	public static final String FOREGROUND_COLOR_LABEL_10 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorten";

	/**
	 * The preference id for different strings representing various labels. If a
	 * label is not on the list, foreground color uses the default.
	 */
	public static final String FOREGROUND_STRING_LABEL_DEFAULT = "org.eclipse.stem.ui.views.geographic.map.preferences.foregrounddefaultstring";
	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_1 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringone";
	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_2 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringtwo";
	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_3 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringthee";
	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_4 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringfour";
	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_5 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringfive";
	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_6 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringsix";
	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_7 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringseven";

	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_8 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringeight";
	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_9 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringnine";
	/**
	 * A String label that defines the user selectable property to which a user
	 * selectable color can be assigned (e.g., when visualizing the property in
	 * a plot)
	 */
	public static final String FOREGROUND_STRING_LABEL_10 = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundstringten";

	/**
	 * This is the preference for how many threads to use when running a
	 * simulation
	 */
	public static final String SIMULATION_THREADS = "simulationThreads"; //$NON-NLS-1$

	/**
	 * This is the preference for which default solver to use
	 */
	public static final String DEFAULT_SOLVER = "defaultSolver"; //$NON-NLS-1$

} // PreferenceConstants
