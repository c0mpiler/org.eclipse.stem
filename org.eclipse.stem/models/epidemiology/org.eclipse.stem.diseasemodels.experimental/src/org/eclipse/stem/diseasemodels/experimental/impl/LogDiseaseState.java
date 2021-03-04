package org.eclipse.stem.diseasemodels.experimental.impl;

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

import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.stem.diseasemodels.Activator;

class LogDiseaseState {

	private static FileWriter fw;

	/**
	 * Constructor
	 * @param fileName
	 */
	public LogDiseaseState(String fileName) {
		try {
			fw = new FileWriter(fileName);
		} catch (IOException e) {
			Activator.logInformation("Error creating file writer "+e.getMessage(),e);
			e.printStackTrace();
			//System.exit(1);
		}
	}


	/**
	 * write string
	 * @param str
	 */
	public void write(String str) {
		try {
			//System.out.print(str);
			fw.write(str); 
		} catch (IOException e) {
			Activator.logInformation("Error writing to file writer ",e);
			e.printStackTrace();
			//System.exit(1);
		}// try
	} // write

	/**
	 * close
	 */
	public static void close() {

		try {
			fw.flush();
			fw.close();
		} catch (IOException e) {
			Activator.logInformation("Error closing file writer ",e);
			e.printStackTrace();
		}// try
	}


} // LogDiseaseState