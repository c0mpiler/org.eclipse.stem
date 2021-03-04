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

package org.eclipse.stem.graphgenerators.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.stem.definitions.Activator;
import org.eclipse.stem.gis.ShapefileReader;
import org.eclipse.stem.gis.dbf.DbfFieldDef;
import org.eclipse.stem.gis.dbf.DbfRecord;
import org.eclipse.stem.gis.shp.ShpRecord;

/**
 * This class uses the org.eclipse.stem.gis project to read shapefiles. It
 * provides methods to get a list with all shapes contained in the file, to get
 * the names of the data columns and to get the data.
 */
public class Reader {

	/**
	 * List of all shapes
	 */
	private List<ShpRecord> records;

	/**
	 * List with column names
	 */
	private List<String> columnNames;

	/**
	 * Data list of rows
	 */
	private List<List<String>> data;

	/**
	 * Creates a reader with the specified shapefile.
	 * 
	 * @param shapefileName
	 *            name of the shapefile (*.shp)
	 * @throws IOException
	 */
	public Reader(String shapefileName) throws IOException {
		ShapefileReader reader = new ShapefileReader(new File(shapefileName));
		List<DbfFieldDef> fields = reader.getTableHeader()
				.getFieldDefinitions();

		records = new ArrayList<ShpRecord>();
		columnNames = new ArrayList<String>();
		data = new ArrayList<List<String>>();

		while (reader.hasMoreRecords()) {
			ShpRecord shp = reader.getNextRecord();
			DbfRecord dbfr = shp.getTableAttributes();
			if(dbfr!= null) {
				List<Object> dbfData = dbfr.getData();
				List<String> row = new ArrayList<String>();

				if((dbfData!=null)&&(dbfData.size()>0)&&(shp!=null)) {
					for (Object o : dbfData) {
						row.add(o.toString());
					}
					
					// if all data is valid
					records.add(shp);
					data.add(row);
				} else {
					Activator.logInformation("Warning: Shape file contains null entries. Null Entries Ignored");
				}
			}//dbfr!= null 
			else {
				Activator.logInformation("Warning: Shape file Table attributes are null. Null Entries Ignored");
			}
			
				
		}

		for (DbfFieldDef f : fields) {
			columnNames.add(f.getFieldName().trim());
		}
	}

	/**
	 * Return list of all shapes
	 * 
	 * @return list of all shapes
	 */
	public List<ShpRecord> getShapeList() {
		return records;
	}

	/**
	 * Returns list with column names
	 * 
	 * @return list with column names
	 */
	public List<String> getColumnNames() {
		return columnNames;
	}

	/**
	 * Returns data list of rows
	 * 
	 * @return data list of rows
	 */
	public List<List<String>> getData() {
		return data;
	}

}
