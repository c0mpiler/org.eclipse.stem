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
package org.eclipse.stem.ui.views;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.loggers.LOGGER_EVENTS;
import org.eclipse.stem.loggers.SimulationLogger;
import org.eclipse.stem.loggers.manager.ISimulationLoggerManagerListener;
import org.eclipse.stem.loggers.manager.SimulationLoggerManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

/**
 * STEM UI View to display all loggers currently attached to 
 * active simulations.  The tree view allows for users to 
 * enable/disable a logger while running.
 *
 */
public class ActiveLoggersView extends ViewPart implements ISimulationLoggerManagerListener
{
	private static final SimulationLoggerManager LOGGER_MANAGER = SimulationLoggerManager.getManager();
	private TreeViewer viewer;
	
	/**
	 * EMF notifier for handling UI updates to reflect changes in the underlying
	 * logger models, such as enable/disable.
	 */
	private final Adapter labelUpdateAdapter = new AdapterImpl()
	{
		@Override
		public void notifyChanged(Notification notification) {
			if (viewer == null || viewer.getTree().isDisposed()) {
				((EObject)notification.getNotifier()).eAdapters().remove(this);
				return;
			}
			viewer.refresh(notification.getNotifier(), true);
		}
	};


	public ActiveLoggersView() {
	}
	
	@Override
	public void createPartControl(Composite parent) 
	{
		viewer = new TreeViewer(parent);
		viewer.setUseHashlookup(true);
		
		Tree baseTree = viewer.getTree();

		viewer.getTree().setHeaderVisible(true);
		viewer.getTree().setLinesVisible(true);		
		
		TreeColumn col1 = new TreeColumn(viewer.getTree(), SWT.LEFT);
		col1.setText(LoggerViewMessages.ALV_logger);
		col1.setWidth(200);
		
		TreeColumn col2 = new TreeColumn(baseTree, SWT.LEFT);
		col2.setText(LoggerViewMessages.ALV_type);
		col2.setWidth(150);
		
		TreeColumn col3 = new TreeColumn(baseTree, SWT.LEFT);
		col3.setText(LoggerViewMessages.ALV_status);
		col3.setWidth(100);
				
		getSite().setSelectionProvider(viewer);

		final MenuManager contextMenuManager = new MenuManager();
		contextMenuManager.setRemoveAllWhenShown(true);

		
		viewer.getControl().setMenu(
				contextMenuManager.createContextMenu(viewer.getControl()));
		getSite().registerContextMenu(contextMenuManager, viewer);

		
		viewer.setContentProvider(new ActiveLoggersContentProvider());
		viewer.setLabelProvider(new ActiveLoggersLabelProvider());
		viewer.setInput(SimulationLoggerManager.getManager().getActiveSimulations());
		viewer.expandAll();
		
		
		// populate the logger with existing simulations
		for (ISimulation sim : SimulationLoggerManager.getManager().getActiveSimulations()) {
			addSimulation(sim);
		}
	
		LOGGER_MANAGER.addListener(this);
	}
	
	private void addSimulation(ISimulation simulation)
	{
		Collection<SimulationLogger> loggers = LOGGER_MANAGER.getLoggersForSimulation(simulation);
		if (loggers != null) {
			for (final SimulationLogger logger : loggers) {
				logger.eAdapters().add(labelUpdateAdapter);
			}
		}
	}
	
	private void removeSimulation(ISimulation simulation)
	{	
		Collection<SimulationLogger> loggers = LOGGER_MANAGER.getLoggersForSimulation(simulation);
		if (simulation != null) {
			for (final SimulationLogger logger : loggers) {
				logger.eAdapters().remove(labelUpdateAdapter);
			}
		}
	}

	@Override
	public void setFocus() 
	{

	}
	
	public void dispose()
	{
		for (ISimulation sim : SimulationLoggerManager.getManager().getActiveSimulations()) {
			removeSimulation(sim);
		}
		
		LOGGER_MANAGER.removeListener(this);

		super.dispose();
	}
	

	public void simulationLoggerEvent(LOGGER_EVENTS event, Object[] targets) 
	{
		// Handle the addition/removal of loggers from the active loggers view
		if (LOGGER_EVENTS.SIMULATIONS_ADDED.equals(event)) {
			ISimulation[] sims = (ISimulation[]) targets;
			for (ISimulation sim : sims) {
				addSimulation(sim);
			}
		}
		
		if (LOGGER_EVENTS.SIMULATIONS_REMOVED.equals(event)) {
			ISimulation[] sims = (ISimulation[]) targets;
			for (ISimulation sim : sims) {
				removeSimulation(sim);
			}
		}
		
		viewer.refresh();
	}
	
	
	/**
	 * Content provider to populate the active loggers tree view
	 *
	 */
	private class ActiveLoggersContentProvider implements ITreeContentProvider
	{

		@Override
		public void dispose() 
		{
			
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) 
		{
			if (inputElement instanceof Collection) {
				return ((Collection<?>) inputElement).toArray();
			} else if (inputElement instanceof ISimulation) {
				Collection<?> loggers = LOGGER_MANAGER.getLoggersForSimulation((ISimulation)inputElement);
				if (loggers != null) {
					return loggers.toArray();
				}
			}

			return new Object[0];
		}

		@Override
		public Object[] getChildren(Object parentElement) 
		{				
			if (parentElement instanceof ISimulation) {
				Collection<?> loggers = LOGGER_MANAGER.getLoggersForSimulation((ISimulation)parentElement);
				if (loggers != null) {
					return loggers.toArray();
				}
			}

			return new Object[0];
		}

		@Override
		public Object getParent(Object element) 
		{
			return null;
		}

		@Override
		public boolean hasChildren(Object element) 
		{
			if (element instanceof ISimulation) {
				Collection<?> loggers = LOGGER_MANAGER.getLoggersForSimulation((ISimulation)element);
				return loggers != null && loggers.size() > 0;
			}
			return false;
		}
		
	}
	
	/**
	 * Label provider to populate the active loggers tree view
	 *
	 */
	private class ActiveLoggersLabelProvider implements ITableLabelProvider
	{

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
		 */
		public void addListener(ILabelProviderListener listener) 
		{
			
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
		 */
		public void dispose() {	}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
		 */
		public boolean isLabelProperty(Object element, String property) 
		{
			return false;
		}

		public void removeListener(ILabelProviderListener listener) { }

		@Override
		public Image getColumnImage(Object element, int columnIndex) 
		{
			return null;
		}

		public String getColumnText(Object element, int columnIndex) 
		{
			if (element instanceof ISimulation && columnIndex == 0) {
				ISimulation sim = (ISimulation)element;
				return sim.getNameWithSequenceNumber();
			} else if (element instanceof SimulationLogger) {
				SimulationLogger logger = (SimulationLogger)element;
				switch (columnIndex) {
				case 0: return logger.getURI().lastSegment();
				case 1: return logger.eClass().getName();
				case 2: return logger.isEnabled() ? LoggerViewMessages.ALV_enabled_message : LoggerViewMessages.ALV_disabled_message;
				}
			}

			return ""; //$NON-NLS-1$
		}
	}
}
