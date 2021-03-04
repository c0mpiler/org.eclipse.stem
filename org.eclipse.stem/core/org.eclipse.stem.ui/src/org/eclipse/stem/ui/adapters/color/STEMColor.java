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
package org.eclipse.stem.ui.adapters.color;

import org.eclipse.swt.graphics.Device;

/**
 * Class to represent a RGBA color.  Mainly for porting between 
 * SWT and AWT system colors.
 * 
 */
public class STEMColor 
{
	private static final float MAX_BYTE_VALUE = 255f;
	
	private final float r;
	private final float g;
	private final float b;
	private final float a;
	
	/**
	 * Generic constructor for STEM Color
	 */
	public STEMColor()
	{
		this(0.0f, 0.0f, 0.0f);
	}
	
	
	/**
	 * Creates a STEM Color based on integer RGB values
	 * @param r Red color value 0-255
	 * @param g Green color value 0-255
	 * @param b Blue color value 0-255
	 */
	public STEMColor(int r, int g, int b)
	{
		this(r,g,b,255);
	}
	
	/**
	 * Creates a STEM Color based on integer RGBA values
	 * @param r Red color value 0-255
	 * @param g Green color value 0-255
	 * @param b Blue color value 0-255
	 * @param a Alpha level 0-255
	 */
	public STEMColor(int r, int g, int b, int a)
	{
		this(r/MAX_BYTE_VALUE, g/MAX_BYTE_VALUE, b/MAX_BYTE_VALUE, a/MAX_BYTE_VALUE);
	}
	
	/**
	 * Creates a STEM Color based on floating point RGB values
	 * @param r Red color value 0.0-1.0
	 * @param g Green color value 0.0-1.0
	 * @param b Blue color value 0.0-1.0
	 * 
	 */
	public STEMColor(float r, float g, float b)
	{
		this(0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	/**
	 * Creates a STEM Color based on floating point RGBA values
	 * @param r Red color value 0.0-1.0
	 * @param g Green color value 0.0-1.0
	 * @param b Blue color value 0.0-1.0
	 * @param a Alpha level 0.0-1.0
	 */
	public STEMColor(float r, float g, float b, float a)
	{
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}
	
	/**
	 * @return The red value of this color (0.0 - 1.0)
	 */
	public float getRed() 
	{
		return r;
	}

	/**
	 * @return The green value of this color (0.0 - 1.0)
	 */
	public float getGreen() 
	{
		return g;
	}

	/**
	 * @return The blue value of this color (0.0 - 1.0)
	 */
	public float getBlue() 
	{
		return b;
	}

	/**
	 * @return The alpha level of this color (0.0 - 1.0)
	 */
	public float getAlpha() 
	{
		return a;
	}

	
	/**
	 * Converts a Java AWT system color into a STEM color for the system
	 * 
	 * @param color Java AWT system color to convert
	 * @return Generic STEM Color
	 */
	public static STEMColor toSTEMColor(java.awt.Color color)
	{
		return new STEMColor(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
	}
	
	/**
	 * Converts an Eclipse SWT RGB value into a STEM color for the system
	 * 
	 * @param color Eclipse SWT RGB value to convert
	 * @return Generic STEM Color
	 */
	public static STEMColor toSTEMColor(org.eclipse.swt.graphics.RGB color)
	{
		return new STEMColor(color.red, color.green, color.blue);
	}
	
	/**
	 * Converts an Eclipse SWT Color into a STEM color for the system
	 * 
	 * @param color Eclipse SWT Color to convert
	 * @return Generic STEM Color
	 */
	public static STEMColor toSTEMColor(org.eclipse.swt.graphics.Color color)
	{
		return new STEMColor(color.getRed(), color.getGreen(), color.getBlue());
	}
	
	/**
	 * Converts a STEM Color to a Java AWT color for this system
	 * 
	 * @return A Java AWT system color that matches the STEM color
	 */
	public java.awt.Color toAWTColor()
	{
		return new java.awt.Color(r,g,b,a);
	}
	
	/**
	 * Converts a STEM Color to an Eclipse SWT color for the device specified
	 * 
	 * @param device The SWT Device that drives the color
	 * @return An Eclipse SWT color for the STEM Color and device specified
	 */
	public org.eclipse.swt.graphics.Color toSWTColor(Device device)
	{
		return new org.eclipse.swt.graphics.Color(device, (int)(r*MAX_BYTE_VALUE), (int)(g*MAX_BYTE_VALUE), (int)(b*MAX_BYTE_VALUE));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "STEMColor [r=" + r + ", g=" + g + ", b=" + b + ", a=" + a + "]";
	}
	
}
