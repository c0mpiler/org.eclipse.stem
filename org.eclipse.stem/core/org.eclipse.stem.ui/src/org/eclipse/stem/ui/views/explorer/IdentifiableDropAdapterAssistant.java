// IdentifiableDropAdapterAssistant.java
package org.eclipse.stem.ui.views.explorer;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.ui.Activator;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.ui.navigator.CommonDropAdapter;
import org.eclipse.ui.navigator.CommonDropAdapterAssistant;

/**
 * This class represents
 */
public class IdentifiableDropAdapterAssistant extends CommonDropAdapterAssistant {

	/**
	 * @see org.eclipse.ui.navigator.CommonDropAdapterAssistant#isSupportedType(org.eclipse.swt.dnd.TransferData)
	 */
	@Override
	public boolean isSupportedType(TransferData transferType) {
		final boolean retValue = LocalSelectionTransfer.getTransfer()
				.isSupportedType(transferType);
		return retValue;
	}

	/**
	 * @see org.eclipse.ui.navigator.CommonDropAdapterAssistant#handleDrop(org.eclipse.ui.navigator.CommonDropAdapter,
	 *      org.eclipse.swt.dnd.DropTargetEvent, java.lang.Object)
	 */
	@Override
	public IStatus handleDrop(CommonDropAdapter dropAdapter,
			DropTargetEvent event, Object target) {
		IStatus retValue = Status.CANCEL_STATUS;
		// Structured Selection?
		if (event.data instanceof IStructuredSelection) {
			// Yes
			for (Object obj : ((IStructuredSelection) event.data).toList()) {
				if (obj instanceof String) {
					// Yes
					// These are URI's from IdentifablePluginView
					final String uriString = (String) obj;
					try {
						// We're going to deserialized the Identifiable, change
						// it's URI and then serialize it again in the new
						// location.
						final URI uri = URI.createURI(uriString);
						final Identifiable identifable = Utility
								.getIdentifiable(uri);
						
						// Fix problem reported by Matthias. Do not allow dragging of built-in scenarios.
						if(identifable instanceof Scenario)
							return retValue; // cancel
						
						// SED fix. We must do the copy here. If we do not do this, the identifiable
						// will be removed from the source ResourceSet when saved to the new location.
						
						List<Identifiable>resourcesToSave = new ArrayList<Identifiable>();
						final Identifiable identifiableCopy = this.copy(identifable, resourcesToSave);
						
						resourcesToSave.remove(resourcesToSave.size()-1); // Remove the top level model
						resourcesToSave.add(0, identifiableCopy);
						
						//final Identifiable identifiableCopy = EcoreUtil.copy(identifable);
						final DublinCore dc = identifiableCopy.getDublinCore();
						final URI serializationURI = createSerializationURI(
								uri, (IdentifiableTreeNode) target);
						identifiableCopy.setURI(serializationURI);
						dc.setTitle("Copy of \"" + dc.getTitle() + "\"");
						dc.setDescription("Copy of \"" + dc.getDescription()
								+ "\"");
						dc.populate();
						Utility.serializeIdentifiables(resourcesToSave,
								serializationURI);
						retValue = Status.OK_STATUS;
					} catch (Exception e) {
						Activator.logError(
								"Problem deserializing Identifiable from \""
										+ uriString + "\"", e);
					}
				} // if
			} // for each Object
		} // if IStructuredSelection

		// LocalSelectionTransfer.getTransfer().setSelection(null);
		return retValue;
	} // handleDrop

	/**
	 * Do a deep copy for models inlining sub-models and graphs. All other identifiables just copy the top level object
	 * 
	 * @param ident
	 * @return The copy
	 */
	private Identifiable copy(Identifiable ident, List<Identifiable> resourcesToSave) {
		if(ident instanceof Model) {
			Model m = (Model)EcoreUtil.copy(ident);
			// Sub models
			Collection<Model>subModels = EcoreUtil.copyAll(m.getModels());
			m.getModels().clear();
			// int i=0;
			for(Model sm:subModels) {
				Model newModel = (Model)this.copy(sm, resourcesToSave);
				m.getModels().add(newModel);
			}
			// Graphs
			Collection<Graph>subGraphs = EcoreUtil.copyAll(m.getGraphs());
			m.getGraphs().clear();
			// i=0;
			for(Graph sg:subGraphs) {
				Graph g = (Graph)this.copy(sg, resourcesToSave);
				m.getGraphs().add(g);
			}
			resourcesToSave.add(m);
			return m;
		}
		else {
			Identifiable ci = (Identifiable)EcoreUtil.copy(ident);
			resourcesToSave.add(ci);
			return ci;
		}
	}
	
	private URI createSerializationURI(URI uri, IdentifiableTreeNode treeNode) {
		final StringBuilder sb = new StringBuilder(treeNode.getProject()
				.getName());
		sb.append("/");
		sb.append(treeNode.getFolderName());
		sb.append("/");
		sb.append(uri.segment(uri.segmentCount() - 1));
		return URI.createPlatformResourceURI(sb.toString(), false);
	} // createSerializationURI

	/**
	 * @see org.eclipse.ui.navigator.CommonDropAdapterAssistant#validateDrop(java.lang.Object,
	 *      int, org.eclipse.swt.dnd.TransferData)
	 */
	@Override
	public IStatus validateDrop(Object target, int operation,
			TransferData transferType) {
		// IStatus retValue = Status.CANCEL_STATUS;
		//
		// if (LocalSelectionTransfer.getTransfer().equals(transferType)) {
		// // Yes
		// retValue = Status.OK_STATUS;
		// } // if
		// else if (LocalTransfer.getInstance().equals(transferType)) {
		// // Yes
		// retValue = Status.OK_STATUS;
		// } // if
		//
		// return retValue;
		return Status.OK_STATUS;
	} // validateDrop

} // IdentifiableDropAdapterAssistant