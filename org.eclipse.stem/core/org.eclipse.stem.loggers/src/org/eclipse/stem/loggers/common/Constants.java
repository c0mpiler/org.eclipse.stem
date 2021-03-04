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
package org.eclipse.stem.loggers.common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Fixed values for use in the Logger project
 *
 */
public interface Constants 
{
	public static final String SYSTEM_PATH_SEPARATOR = File.separator;
	public static final String SCENARIOS_URL_PREFIX = "platform:/resource/";
	public static final String BUILD_IN_SCENARIOS_PROJECT_FOLDER = "BuiltInScenarios";
	public static final String RECORDED_SIMULATIONS_FOLDER = "Recorded Simulations";
	public static final String EMPTY_STRING = "";
	public static final String[] EXCLUDED_DECORATOR_DEFAULTS = new String[] {
	"org.eclipse.stem.diseasemodels.standard.AggregatingSIDiseaseModel"};

	public static final SimpleDateFormat LOG_DATE_FORMATTER 
	= new SimpleDateFormat("EEE d MMM yyyy", Locale.getDefault());
	
	/**
	 * CSV Header Label for time column
	 */
	public static final String TIME_LABEL = "time";

	/**
	 * CSV Header Label for iteration column
	 */
	public static final String ITERATION_LABEL = "iteration";
	
	public static final String RUN_PARAMETER_FILE_NAME = "runparameters.csv";
	
	public static final String LOG_FILE_SUFFIX = "csv";

	public static final String[] EXCLUDED_NODE_DEFAULTS = new String[] {"node/transport/pipe"};


	public static final String LOCATION_ID_PREFIX = "/node/geo/region/";
	
	
}
