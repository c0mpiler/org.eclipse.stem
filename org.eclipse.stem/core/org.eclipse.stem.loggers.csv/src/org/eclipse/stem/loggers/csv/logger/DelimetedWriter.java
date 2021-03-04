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
package org.eclipse.stem.loggers.csv.logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Writer for writing delimeted data to a text file.  Options to 
 * this class include the types of entry and new line delimeters
 * as well as buffer size and the underlying writer to write to.
 * 
 * This class can be used to create comma-separated value loggers.
 *
 */
public class DelimetedWriter extends BufferedWriter
{
	/**
	 * Default new line delimeter.
	 */
	public static char[] DEFAULT_NEW_LINE_DELIMETER = new char[] {'\n'};
	
	/**
	 * Default entry delimeter.
	 */
	public static char[] DEFAULT_ENTRY_DELIMETER = new char[] {','};
	
	/**
	 * Default buffer size. 
	 */
	public static int DEFAULT_BUFFER_SIZE = 1024;
	
	private String entryDelimeter;
	private String newLineDelimeter;
	
	private boolean newLine = true;
	
	/**
	 * Creates a new writer for the given underlying writer and buffer size
	 * @param bufSize
	 * @param writer
	 * @throws IOException
	 */
	public DelimetedWriter(int bufSize, Writer writer) throws IOException
	{
		this(new String(DEFAULT_ENTRY_DELIMETER), new String(DEFAULT_NEW_LINE_DELIMETER), bufSize, writer);
	}
	
	public DelimetedWriter(String entryDelimeter, int bufSize, Writer writer) throws IOException
	{
		this(entryDelimeter, new String(DEFAULT_NEW_LINE_DELIMETER), bufSize, writer);
	}
	
	public DelimetedWriter(String entryDelimeter, String newLineDelimeter, int bufSize, Writer writer) throws IOException
	{
		super(writer, bufSize);
		
		this.entryDelimeter = entryDelimeter;
		this.newLineDelimeter = newLineDelimeter;
	}
	
	/**
	 * Whether the writer is currently on an empty line.  NOTE:  Only works when used in 
	 * conjunction with the writeEntry(...) and newLine() methods!!!
	 * 
	 * @return Whether the writer is currently on an empty line.
	 */
	public boolean isEmptyLine()
	{
		return newLine;
	}

	/**
	 * @param val
	 * @throws IOException
	 */
	public void writeEntry(int val) throws IOException
	{
		writeEntry(String.valueOf(val));
	}
	
	/**
	 * @param val
	 * @throws IOException
	 */
	public void writeEntry(double val) throws IOException
	{
		writeEntry(String.valueOf(val));
	}
	
	/**
	 * @param val
	 * @throws IOException
	 */
	public void writeEntry(float val) throws IOException
	{
		writeEntry(String.valueOf(val));
	}
	
	/**
	 * @param val
	 * @throws IOException
	 */
	public void writeEntry(byte[] val) throws IOException
	{
		writeEntry(new String(val));
	}
	
	/**
	 * @param val
	 * @throws IOException
	 */
	public void writeEntry(byte val) throws IOException
	{
		writeEntry(String.valueOf(val));
	}
	
	/**
	 * @param val
	 * @throws IOException
	 */
	public void writeEntry(long val) throws IOException
	{
		writeEntry(String.valueOf(val));
	}
		
	/**
	 * Writes a 
	 * 
	 * @param val
	 * @throws IOException
	 */
	public void writeEntry(char val) throws IOException
	{
		writeEntry(String.valueOf(val));
	}
	
	/**
	 * Writes a character (string) value of the given object
	 * to the writer. The entry is preceded by an entry delimeter if
	 * it is not the first item on a line.
	 * 
	 * @param val
	 * @throws IOException
	 */
	public void writeEntry(Object val) throws IOException
	{
//		String str = null;
//		if (val != null) {
//			str = val.toString();
//			str = str.replace(entryDelimeter, " "); //$NON-NLS-1$
//			str = str.replace(newLineDelimeter, " "); //$NON-NLS-1$
//		} else {
//			str = Constants.EMPTY_STRING;
//		}
		
		String str = null;
		if (val != null) {
			str = val.toString();
		} else {
			str = Constants.EMPTY_STRING;
		}
		
		if (newLine) {
			newLine = false;
		} else {
			super.write(entryDelimeter);
		}
		
		super.write(str);
	}

	/**
	 * Appends a new line separator.  Uses the configured 
	 * new line characters or the default if none is 
	 * specified.
	 */
	public void newLine() throws IOException
	{
		write(newLineDelimeter);
		newLine = true;
	}
	
	/**
	 * Writes a line of delimeted entries for the given list.  Each entry
	 * in the list is appended in order using the delimeter with a new line
	 * character added to the end. If the writer is not at a new line,
	 * then it will add a new line character before writing the entries.
	 *
	 * @param vals List of values to append as delimeted entries to the writer
	 * @throws IOException
	 */
	public void writeLine(List<?> vals) throws IOException
	{
		if (vals != null) {
			if (!isEmptyLine()) {
				newLine();
			}
			
			for (Object val : vals) {
				writeEntry(val);
			}
			newLine();
		}
		
	}
	
}
