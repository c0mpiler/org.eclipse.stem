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
package org.eclipse.stem.ui.launcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simple class to read and parse command line options
 * passed to the Eclipse / STEM runtime.  Parses out 
 * arguments beginning with "-" into keys and space-separated
 * values following the key as a list of values.
 *
 */
public class CommandArgumentParser 
{
	public static final String NO_COMMAND_KEY = "NONE";

	/**
	 * Parses an array of command-line arguments into key/value 
	 * groupings of command keys (starting with '-') and the values that
	 * follow the keys.
	 * 
	 * @param args Array of command line arguments
	 * @return Parsed map of key/value commands
	 */
	public static Map<String,List<String>> parse(String[] args)
	{
		Map<String,List<String>> params = new HashMap<String,List<String>>();
		
		if (args != null && args.length > 0) {
			String currentParam = null;
			List<String> currentParamValues = null;
			
			for (String arg : args) {
				if (arg.charAt(0) == '-') {
					currentParam = arg.substring(1);
					currentParamValues = new ArrayList<String>();
					params.put(currentParam, currentParamValues);

				} else {
					if (currentParam == null) {
						currentParam = NO_COMMAND_KEY;
						currentParamValues = new ArrayList<String>();
						params.put(currentParam, currentParamValues);
					}
					
					currentParamValues.add(arg);
				}
			}
		}
		
		return Collections.unmodifiableMap(params);
	}

}
