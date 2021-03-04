// IdentfiableSpecificationFactory.java
package org.eclipse.stem.internal.data.specifications;

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

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is a factory that creates instances of
 * {@link IdentifiableSpecification}s
 */
public class IdentfiableSpecificationFactory {

	/**
	 * A static instance of the factory
	 */
	public static final IdentfiableSpecificationFactory INSTANCE = new IdentfiableSpecificationFactory();

	/**
	 * @param propertiesFile
	 *            a *.properties file that contains the properties that define a
	 *            {@link org.eclipse.stem.core.graph.Graph}
	 * @return a {@link IdentifiableSpecification} initialized from the
	 *         properties contained in the file.
	 */
	public IdentifiablePropertyFileSpecification createIdentifiablePropertyFileSpecification(
			final File propertiesFile) {
		IdentifiablePropertyFileSpecification retValue = null;

		if (propertiesFile.isFile() && propertiesFile.canRead()) {
			// Yes
			final Properties dataSetProperties = new Properties();
			BufferedInputStream propertiesInputStream = null;
			try {
				propertiesInputStream = new BufferedInputStream(
						new FileInputStream(propertiesFile));
				dataSetProperties.load(propertiesInputStream);
				propertiesInputStream.close();

				// The properties file contains the name of the class that knows
				// how to process the rest of the properties to create a Graph.
				String recordClassName = (String) dataSetProperties
						.get(IdentifiablePropertyFileSpecification.RECORD_CLASSNAME_PROPERTY);

				// Did we get the class name?
				if (recordClassName != null) {
					// Yes
					recordClassName = recordClassName.trim();
					try {
						retValue = (IdentifiablePropertyFileSpecification) Class
								.forName(recordClassName).newInstance();
						// Let the GraphRecord figure out what to do with the
						// rest of the properties.
						retValue.collectPropertyDataSet(dataSetProperties);
					} catch (final Exception e) {
						System.err
								.println("Error while reading the properties file \""
										+ propertiesFile.getName()
										+ "\", creating an instance of the class \""
										+ recordClassName
										+ "\" caused the following error.");
						e.printStackTrace();
					} catch (final Error e) {
						System.err
								.println("Error while reading the properties file \""
										+ propertiesFile.getName()
										+ "\", creating an instance of the class \""
										+ recordClassName
										+ "\" caused the following error.");
						e.printStackTrace();
					} // catch NoClassDefFoundError
				} // if got class name
				else {
					// No
					System.err
							.println("The properties file \""
									+ propertiesFile.getName()
									+ "\" did not contain the property \""
									+ IdentifiablePropertyFileSpecification.RECORD_CLASSNAME_PROPERTY
									+ "\" the defines the name of the class that processes the contents of the file.\"");
				}
			} catch (final FileNotFoundException e) {
				System.err.println(e.getMessage());
			} catch (final IOException e) {
				System.err.println(e.getMessage());
			}
		} // if can read the properties file
		else {
			System.err.println("The file \"" + propertiesFile.getAbsolutePath()
					+ "\" is not a file or can't be read.");
		}

		return retValue;
	} // createIdentifiablePropertyFileSpecification
} // IdentfiableSpecificationFactory
