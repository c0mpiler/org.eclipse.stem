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
package org.eclipse.stem.model.ui.wizards;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Shell;

public abstract class InheritedColumnLabelProvider extends ColumnLabelProvider
{
	int inheritedForegroundColor, inheritedBackgroundColor;
	Font cachedFont;
	
	public InheritedColumnLabelProvider(int inheritedForegroundColor, int inheritedBackgroundColor) 
	{
		this.inheritedBackgroundColor = inheritedBackgroundColor;
		this.inheritedForegroundColor = inheritedForegroundColor;
	}
	
	protected abstract Shell getShell();
	protected abstract boolean isInherited(Object obj);

	@Override
	public Font getFont(Object element) {
		Font font = super.getFont(element);
		if (isInherited(element)) {
			font = getInheritedFont(font);
		}
		
		return font;
	}
	
	private Font getInheritedFont(Font baseFont)
	{
		if (cachedFont == null) {
			if (baseFont == null) {
				baseFont = getShell().getDisplay().getSystemFont();
			}
			FontData fontData = baseFont.getFontData()[0];
			cachedFont = new Font(getShell().getDisplay(), new FontData(fontData.getName(), fontData
			    .getHeight(), SWT.ITALIC));
		}
		return cachedFont;
	}
	
	public Color getForeground(Object element) {
		if (inheritedForegroundColor != SWT.NONE && isInherited(element)) {
			return getShell().getDisplay().getSystemColor(inheritedForegroundColor);
		}
		return super.getForeground(element);
	}

	@Override
	public Color getBackground(Object element) {
		if (inheritedBackgroundColor != SWT.NONE && isInherited(element)) {
			return getShell().getDisplay().getSystemColor(inheritedBackgroundColor);
		}
		return super.getBackground(element);
	}
}
