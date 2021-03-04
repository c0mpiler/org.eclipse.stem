// ActiveBatchesView.java
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

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.jobs.batch.BatchManager;
import org.eclipse.stem.jobs.batch.BatchManagerEvent;
import org.eclipse.stem.jobs.batch.IBatch;
import org.eclipse.stem.jobs.batch.IBatchManagerListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * This class is an Eclipse {@link ViewPart} that displays the currently active
 * {@link IBatch}s and their status.
 * 
 * @see BatchManager
 */
public class ActiveBatchesView extends ViewPart {

	/**
	 * The identifier of the Active Batches View
	 */
	public static final String ID_ACTIVE_BATCHES_VIEW = "org.eclipse.stem.ui.views.activebatches"; //$NON-NLS-1$

	private ListViewer lv = null;

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(final Composite parent) {
		lv = new ListViewer(parent);
		lv.setContentProvider(new ActiveBatchesContentProvider());
		lv.setLabelProvider(new ActiveBatchesLabelProvider());
		lv.setInput(BatchManager.INSTANCE);

		// Provide our selection listener
		getSite().setSelectionProvider(lv);
	} // createPartControl

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// Nothing
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		getSite().setSelectionProvider(null);
		lv = null;
	} // dispose

	protected static class ActiveBatchesContentProvider implements
			IStructuredContentProvider, IBatchManagerListener {

		private ListViewer viewer = null;

		private BatchManager batchManager = null;

		/**
		 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
		 */
		public Object[] getElements(final Object inputElement) {
			return ((BatchManager) inputElement).getActiveBatches().toArray();
		} // getElements

		/**
		 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
		 */
		public void dispose() {
			viewer = null;
			batchManager = null;
		}

		/**
		 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
		 *      java.lang.Object, java.lang.Object)
		 */
		public void inputChanged(final Viewer viewer,
				final Object oldInput, final Object newInput) {
			this.viewer = (ListViewer) viewer;
			// Is our batch manager changing?
			if (batchManager != null) {
				// Yes
				batchManager.removeListener(this);
			}
			batchManager = (BatchManager) newInput;

			// Do we have a new batch manager to listen to?
			if (batchManager != null) {
				// Yes
				batchManager.addBatchManagerListener(this);
			}
		} // inputChanged

		/**
		 * @see org.eclipse.stem.jobs.batch.IBatchManagerListener#batchesChanged(org.eclipse.stem.jobs.batch.BatchManagerEvent)
		 */
		public void batchesChanged(final BatchManagerEvent event) {
			viewer.getList().setRedraw(false);
			try {
				viewer.remove(event.getBatchesRemoved());
				viewer.add(event.getBatchesAdded());
			} finally {
				viewer.getList().setRedraw(true);
			}

		} // batchesChanged

	} // ActiveBatchesContentProvider

	protected static class ActiveBatchesLabelProvider implements ILabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
		 */
		public Image getImage(final Object element) {
			return null;
		} // getImage

		/**
		 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
		 */
		public String getText(final Object element) {
			final IBatch batch = (IBatch) element;
			return batch.getNameWithSequenceNumber();
		} // getText

		/**
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
		 */
		public void addListener(final ILabelProviderListener listener) {
			// nothing
		}

		/**
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
		 */
		public void dispose() {
			// nothing
		}

		/**
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object,
		 *      java.lang.String)
		 */
		public boolean isLabelProperty(final Object element, final String property) {
			return false;
		}

		/**
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
		 */
		public void removeListener(final ILabelProviderListener listener) {
			// nothing
		}
	} // ActiveBatchesLabelProvider
} // ActiveBatchesView
