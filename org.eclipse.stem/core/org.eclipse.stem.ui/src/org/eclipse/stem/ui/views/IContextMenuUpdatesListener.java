package org.eclipse.stem.ui.views;

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

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;

/**
 * The interface defines a listener that get notifications about newly generated context
 * menus. Usually the listener will be a <code>ViewPart</code> that needs to register
 * the context menu so that externally defined additions to the menu will be added.
 */
public interface IContextMenuUpdatesListener {
	
	/**
	 * The method is being called when new context menu has been created.
	 * @param menuManager The new MenuManager
	 * @param selectionProvider The ISelectionProvider for the MenuManager
	 */
	public void onContextMenuUpdate(MenuManager menuManager, ISelectionProvider selectionProvider);

}
