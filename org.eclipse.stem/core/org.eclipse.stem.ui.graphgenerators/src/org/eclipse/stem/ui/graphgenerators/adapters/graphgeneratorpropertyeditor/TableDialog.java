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

package org.eclipse.stem.ui.graphgenerators.adapters.graphgeneratorpropertyeditor;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

/**
 * A dialog that can display table data.
 */
public class TableDialog {

	/**
	 * Creates a new TableDialog that displays the specified data with the
	 * specified column names.
	 * 
	 * @param parent
	 *            parent of this dialog
	 * @param title
	 *            title of the dialog
	 * @param columnNames
	 *            column names
	 * @param data
	 *            data to display
	 */
	public TableDialog(Shell parent, String title, List<String> columnNames,
			List<List<String>> data) {
		Shell shell = new Shell(parent, SWT.SHELL_TRIM);
		Table table = new Table(shell, SWT.BORDER);

		shell.setText(title);
		shell.setLayout(new FillLayout());
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		for (String column : columnNames) {
			TableColumn newColumnTableColumn = new TableColumn(table,
					SWT.CENTER);

			newColumnTableColumn.setWidth(80);
			newColumnTableColumn.setText(column);
		}

		for (List<String> row : data) {
			TableItem tableItem = new TableItem(table, SWT.CENTER);

			tableItem.setText(row.toArray(new String[0]));
		}

		shell.setSize(new Point(600, 400));
		shell.open();
	}

}
