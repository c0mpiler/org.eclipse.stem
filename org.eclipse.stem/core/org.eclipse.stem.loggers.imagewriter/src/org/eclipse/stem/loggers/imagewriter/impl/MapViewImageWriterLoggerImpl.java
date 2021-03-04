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
package org.eclipse.stem.loggers.imagewriter.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.adapters.time.TimeProvider;
import org.eclipse.stem.adapters.time.TimeProviderAdapterFactory;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.jobs.DisplaySafeExecutor;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.jobs.simulation.SimulationEvent;
import org.eclipse.stem.jobs.simulation.SimulationState;
import org.eclipse.stem.loggers.LOGGER_EVENTS;
import org.eclipse.stem.loggers.imagewriter.Activator;
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger;
import org.eclipse.stem.ui.views.graphmap.GraphMapControl;
import org.eclipse.stem.ui.views.graphmap.GraphMapView;
import org.eclipse.stem.ui.views.graphmap.GraphMapViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map View Image Writer Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.imagewriter.impl.MapViewImageWriterLoggerImpl#isOpenMapView <em>Open Map View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapViewImageWriterLoggerImpl extends ImageWriterLoggerImpl implements MapViewImageWriterLogger {
	/**
	 * The default value of the '{@link #isOpenMapView() <em>Open Map View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenMapView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_MAP_VIEW_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOpenMapView() <em>Open Map View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenMapView()
	 * @generated
	 * @ordered
	 */
	protected boolean openMapView = OPEN_MAP_VIEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapViewImageWriterLoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagewriterPackage.Literals.MAP_VIEW_IMAGE_WRITER_LOGGER;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpenMapView() {
		return openMapView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenMapView(boolean newOpenMapView) {
		boolean oldOpenMapView = openMapView;
		openMapView = newOpenMapView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagewriterPackage.MAP_VIEW_IMAGE_WRITER_LOGGER__OPEN_MAP_VIEW, oldOpenMapView, openMapView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImagewriterPackage.MAP_VIEW_IMAGE_WRITER_LOGGER__OPEN_MAP_VIEW:
				return isOpenMapView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImagewriterPackage.MAP_VIEW_IMAGE_WRITER_LOGGER__OPEN_MAP_VIEW:
				setOpenMapView((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImagewriterPackage.MAP_VIEW_IMAGE_WRITER_LOGGER__OPEN_MAP_VIEW:
				setOpenMapView(OPEN_MAP_VIEW_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImagewriterPackage.MAP_VIEW_IMAGE_WRITER_LOGGER__OPEN_MAP_VIEW:
				return openMapView != OPEN_MAP_VIEW_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (openMapView: "); //$NON-NLS-1$
		result.append(openMapView);
		result.append(')');
		return result.toString();
	}
	
	
	private static final String MAP_VIEW_ID = "org.eclipse.stem.ui.views.graphmap"; //$NON-NLS-1$

	private GraphMapView getMapViewFromWorkbench()
	{
		
		IViewPart view = null;
		
		GraphMapView retValue = null;
		if (PlatformUI.isWorkbenchRunning()) {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			if (page != null) {
				
				// Try to find the view directly
				view = page.findView(MAP_VIEW_ID);

				// Try to find the view by reference
				if (view == null || !(view instanceof GraphMapView)) {
					IViewReference viewRef = page.findViewReference(MAP_VIEW_ID);
					if (viewRef != null) {
						view = viewRef.getView(true);
					}
				}
				
				// Still cannot find the map view.  it's probably open in a different perspective.
				// if the logger is configured to open the map view, then attempt to open it
				if ((view == null || !(view instanceof GraphMapView)) && isOpenMapView()) {
					try {
						if (isOpenMapView()) {
							view = page.showView(MAP_VIEW_ID);
						}
					} catch (PartInitException e) {
						Activator.logError("Error opening the map view for the map image logger", e); //$NON-NLS-1$
					}
				}
			}
		}
		
		if (view != null && view instanceof GraphMapView) {
			retValue = (GraphMapView)view;
		}
		
		return retValue;
	}
	
	
	
	
	private GraphMapControl getMapControlForSimulation()
	{
		GraphMapView view = getMapViewFromWorkbench();
		if (view != null && view.getSite().getSelectionProvider() instanceof GraphMapViewer) {
			GraphMapViewer viewer = (GraphMapViewer)view.getSite().getSelectionProvider();
			
			Control[] controls = ((Composite)viewer.getControl()).getChildren();
			for (Control control : controls) {
				if (control instanceof GraphMapControl
						&& simulation == ((GraphMapControl)control).getSimulation()) {
					return (GraphMapControl)control;
				}
			}
		}
		
		return null;
	}
	
	
	
	private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()); //$NON-NLS-1$
	
	private File logDirectory;
	
	private TimeProvider timeProvider;
	
	private ISimulation simulation;
	
	boolean beforeStart = false;
	
	private STEMTime getScenarioTime()
	{
		STEMTime time = getTimeProvider().getTime();
		if(time == null) {
			time = simulation.getScenario().getSequencer().getStartTime();
		}
		if(!beforeStart) {
			time = time.addIncrement(simulation.getScenario().getSequencer().getTimeDelta());
		}
		return time;
	}
	
	private TimeProvider getTimeProvider()
	{
		if (timeProvider == null) {
			timeProvider = (TimeProvider) TimeProviderAdapterFactory.INSTANCE
					.adapt(simulation.getScenario().getCanonicalGraph(), TimeProvider.class);
		}
		
		return timeProvider;
	}
	

	
	
	private File getImageFile() {
		
		if (logDirectory == null) {
			logDirectory = new File(getLogFileDirectory(simulation), "MapImages"); //$NON-NLS-1$
			logDirectory.mkdirs();
		}
		
		return new File(logDirectory, DATE_FORMATTER.format(getScenarioTime().getTime()) +".png"); //$NON-NLS-1$
	}
	
	
	private void saveSimulationImageFile(Image mapImage)
	{
		if (mapImage != null && !mapImage.isDisposed()) {
			try {
				File imageFile = getImageFile();
				ImageLoader loader = new ImageLoader();
				loader.data = new ImageData[] {mapImage.getImageData()};
				loader.save(imageFile.getAbsolutePath(), SWT.IMAGE_PNG);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerImpl#simulationEvent(org.eclipse.stem.jobs.simulation.SimulationEvent)
	 */
	@Override
	public void simulationEvent(final SimulationEvent event) 
	{
		if (!PlatformUI.isWorkbenchRunning()) {
			return;
		}
		if (SimulationState.COMPLETED_CYCLE.equals(event.getSimulationState())) {
			DisplaySafeExecutor.executeSync(new Runnable() {
				@Override
				public void run() {
					GraphMapControl control = getMapControlForSimulation();
					if (control != null) {
						Image image = control.getMapCanvasImage();
						saveSimulationImageFile(image);
					} else {
						Activator.logWarning(Messages.MVIWL_NoCanvasError, null);
					}
				}
			
			});
		
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.stem.loggers.impl.SimulationLoggerImpl#loggerEvent(org.eclipse.stem.jobs.simulation.ISimulation, org.eclipse.stem.loggers.LOGGER_EVENTS)
	 */
	@Override
	public void loggerEvent(ISimulation simulation, LOGGER_EVENTS event) 
	{		
		if (LOGGER_EVENTS.LOGGER_STARTED.equals(event)) {
			if (!PlatformUI.isWorkbenchRunning()) {
				Activator.logWarning(Messages.MVIWL_HeadlessError, null);
				return;
			}
			
			this.simulation = simulation;
		}
	}

} //MapViewImageWriterLoggerImpl
