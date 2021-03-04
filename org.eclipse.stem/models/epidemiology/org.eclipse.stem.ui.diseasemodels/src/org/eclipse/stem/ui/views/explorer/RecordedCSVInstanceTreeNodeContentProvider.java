// RecordedCSVInstanceTreeNodeContentProvider.java
package org.eclipse.stem.ui.views.explorer;

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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.stem.ui.wizards.NewSTEMProjectWizard;
import org.eclipse.ui.navigator.CommonNavigator;

/**
 * This class is a {@link RecordedInstanceTreeNodeContentProvider} for {@link
 * RecordedCSVInstanceTreeNode}s which appear in the {@link CommonNavigator}
 * framework that is used to explore STEM Projects.
 * 
 * @see RecordedCSVInstanceTreeNodeLabelProvider
 */
public class RecordedCSVInstanceTreeNodeContentProvider extends
		RecordedInstanceTreeNodeContentProvider {

	/**
	 * @see org.eclipse.stem.ui.views.explorer.
	 * 	RecordedInstanceTreeNodeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(final Object parentElement) {
		Object[] retValue = null;
		// Right parent?
		if (parentElement instanceof RecordedTreeNode) {
			// Yes
			final RecordedTreeNode parent = (RecordedTreeNode) parentElement;
			final IWorkspaceRoot root = ResourcesPlugin.getWorkspace()
			.getRoot();
			
			IPath projectPath = parent.getProject().getFullPath();
			IFolder csvFolder = root.getFolder(projectPath.append(NewSTEMProjectWizard.RECORDED_SIMULATIONS_FOLDER_NAME));

			// Is the csvFolder a readable directory?
			try {
				if (csvFolder.exists()) {
					// Yes
					final IResource[] csvSubFolders = csvFolder.members();
	
					// Create the nodes that will represent the files in the common
					// navigator framework
					final List<Object> temp = new ArrayList<Object>();
					for (IResource file : csvSubFolders) {
//						if(file instanceof IContainer)
//							temp.add(new RecordedCSVInstanceTreeNode(parent, file));
//						else temp.add(file);
						temp.add(file);
					} // for each File
					retValue = temp.toArray();
				} // if readable directory
			} catch(CoreException ce) {
				ce.printStackTrace();
				return null;
			}
		} // if RecordedTreeNode
		else if(parentElement instanceof RecordedCSVInstanceTreeNode) {
			// Yes
			final RecordedCSVInstanceTreeNode parent = (RecordedCSVInstanceTreeNode) parentElement;
			//final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			
			IResource file = parent.getFile();
			if(file instanceof IContainer) {
				IContainer cont = (IContainer)file;
						// Is the csvFolder a readable directory?
				try {
					if (cont.exists()) {
						// Yes
						final IResource[] csvSubFolders = cont.members();
		
						// Create the nodes that will represent the files in the common
						// navigator framework
						final List<Object> temp = new ArrayList<Object>();
						for (IResource f2 : csvSubFolders) {
							if(f2 instanceof IContainer)
								temp.add(new RecordedCSVInstanceTreeNode(parent, f2));
							else temp.add(f2);
						} // for each File
						retValue = temp.toArray();
					} // if readable directory
				} catch(CoreException ce) {
					ce.printStackTrace();
					return null;
				}
			}
		} else {
			return new Object[0];
		}
		return retValue;
	} // getChildren

	/**
	 * @see org.eclipse.stem.ui.views.explorer.
	 * 	RecordedInstanceTreeNodeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(final Object element) {
		Object[] children = getChildren(element);
		return children != null && children.length > 0;
	}

} // RecordedCSVInstanceTreeNodeContentProvider