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
package org.eclipse.stem.loggers.imagewriter.logger;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.loggers.common.Constants;
import org.eclipse.stem.loggers.common.FileUtils;
import org.eclipse.stem.loggers.imagewriter.Activator;
import org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger;
import org.eclipse.stem.loggers.imagewriter.logger.draw.MapDrawer;
import org.eclipse.stem.loggers.imagewriter.logger.projections.Equirectangular;
import org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection;
import org.eclipse.stem.ui.adapters.color.AbstractRelativeValueColorProviderAdapterFactory;
import org.eclipse.stem.ui.adapters.color.ColorProvider;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapter;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapterFactory;

public class DecoratorPropertyImageWriter 
{
	private ProjectedMapImageLogger logger;
	private ISimulation simulation;
	private IMapProjection projection;
	
	private static final String imageFormat = "png"; //$NON-NLS-1$
	
	private boolean initialized = false;
	private boolean sane = false;
	
	MapDrawer drawer;
	int stepCount = 0;
	
	private final String defaultColorProvider = "org.eclipse.stem.ui.adapters.color.IntensityColorsLabelsMappingColorProvider"; //$NON-NLS-1$

	private List<DecoratorIdentifierProperty> compartmentsToLog = new ArrayList<DecoratorIdentifierProperty>();
	
	ColorProviderAdapter colorProviderAdapter;
	
	Map<Decorator, MapDrawer> mapDrawers = new HashMap<Decorator,MapDrawer>();
	
	public DecoratorPropertyImageWriter(ISimulation simulation, ProjectedMapImageLogger logger)
	{
		this.logger = logger;
		this.simulation = simulation;
	}
	
	
	protected void setup()
	{
		initialized = true;
		
		setupCompartments();
		
		if (compartmentsToLog.size() == 0) {
			Activator.logError(Messages.DPIW_NoCompartmentsError1+ logger.getURI() +Messages.DPIW_NoCompartmentsError2, null);
			return;
		}
		
		// Configure the map projection
		try {
			projection = logger.getMapProjector();
		} catch (Exception e) {
			Activator.logWarning(Messages.DPIW_NoProjectionError1+ logger.getURI() +Messages.DPIW_NoProjectionError2, e);
			projection = new Equirectangular();
		}
		
		
		for (DecoratorIdentifierProperty compartment : compartmentsToLog) {
			// Configure the color provider
			configureCompartmentColorProvider(compartment);

			if (compartment.getColorProvider() != null 
					&& mapDrawers.get(compartment.getDecorator()) == null) {
				mapDrawers.put(compartment.getDecorator(), 
						new MapDrawer(compartment.getDecorator(), logger, projection));
			}
		}
		
		if (mapDrawers.size() == 0) {
			Activator.logError(Messages.DPIW_NoMapDrawersError1+ logger.getURI() +Messages.DPIW_NoMapDrawersError2, null);
			return;
		}
		
		// If all checks succeed, we're ready to start logging
		sane = true;
	}

	private void setupCompartments()
	{
		// Configure the compartments we're going to log
		for (Decorator decorator : simulation.getScenario().getCanonicalGraph().getDecorators()) {
			if (decorator instanceof IntegrationDecorator) {
				Map<String,EList<String>> identifierProperties = logger.getDecoratorProperties(decorator.getURI());
				if (identifierProperties != null) {
					for (Entry<String,EList<String>> identifierProperty : identifierProperties.entrySet()) {
						String identifierName = identifierProperty.getKey();
						for (String property : identifierProperty.getValue()) {
							IItemPropertyDescriptor descriptor = getItemPropertyDescriptor((IntegrationDecorator)decorator, identifierName, property);
							if (descriptor != null) {
								compartmentsToLog.add(new DecoratorIdentifierProperty(decorator, identifierName, descriptor));
							}
						}
					}
				}
			}
		}
		
	}
	
	private IItemPropertyDescriptor getItemPropertyDescriptor(IntegrationDecorator decorator, String populationIdentifier, String propertyName)
	{
		List<IItemPropertyDescriptor> properties = decorator.getCompartments(populationIdentifier);
		if (properties != null) {
			for (IItemPropertyDescriptor property : properties) {
				if (propertyName.equals(property.getId(null))) {
					return property;
				}
			}
		}
		
		return null;
	}
	
	
	private void configureCompartmentColorProvider(DecoratorIdentifierProperty compartment)
	{
		ColorProviderAdapter retVal = null;
		
		//@SuppressWarnings("rawtypes")
		List<Class<? extends ColorProvider>> supportedColorProviders = ColorProviderAdapterFactory.INSTANCE.getSupportedColorProviders();
		if (supportedColorProviders.size() > 0) {
		
			// Get the configured color provider from the logger instance
			Class<? extends ColorProvider> selectedColorProvider = logger.getColorProvider();
	
			// Check if the selected color provider is in the list of supported classes.  Otherwise, 
			// search through the list for a default
			if (selectedColorProvider == null 
					|| !supportedColorProviders.contains(selectedColorProvider)) {
				for (Class<? extends ColorProvider> clazz : supportedColorProviders) {
					if (clazz.getName().equals(defaultColorProvider)){
						selectedColorProvider = clazz;
					}
				}
				
				// If all else fails, just get the first one from the list
				selectedColorProvider = supportedColorProviders.get(0);
			}
	
			// Create the Color Adapter from the selected type
			final AdapterFactory adapterFactory = ColorProviderAdapterFactory.INSTANCE.getFactoryForType(selectedColorProvider);
			final Adapter adapter = adapterFactory.adapt(compartment.getDecorator().getGraph(), selectedColorProvider);
			if (adapter instanceof ColorProviderAdapter) {
				retVal = (ColorProviderAdapter) adapter;
	
				retVal.setSelectedDecorator(compartment.getDecorator());
				retVal.setSelectedPopulationIdentifier(compartment.getIdentifier());

				if (compartment.getProperty() instanceof ItemPropertyDescriptor &&
						retVal instanceof AbstractRelativeValueColorProviderAdapterFactory.PropertySelectionListener) {
					((AbstractRelativeValueColorProviderAdapterFactory.PropertySelectionListener)retVal).propertySelected((ItemPropertyDescriptor)compartment.getProperty());
				}

				compartment.setColorProvider(retVal);
			}
		}
	}

	
	public void start()
	{

	}
	
	public void stop()
	{
		for (MapDrawer drawer : mapDrawers.values()) {
			drawer.close();
		}
	}
	
	


	public void log()
	{
		if (!sane) {
			if (!initialized && simulation.getScenario().getSequencer().getCycle() >= 2) {
				setup();
			}
			return;
		}

		for (DecoratorIdentifierProperty compartment : compartmentsToLog) {
			MapDrawer drawer = mapDrawers.get(compartment.getDecorator());
			drawer.setColorProvider(compartment.getColorProvider());
			drawer.draw();
			drawer.save(getImageFileToLog(compartment), imageFormat);
		}
	}
	
	
	File baseLogDirectory;
	
	protected File getBaseLogDirectory()
	{
		if (baseLogDirectory == null) {
			StringBuilder directory = new StringBuilder();
			
			if (logger.isUseDefaultLogDirectory() || Constants.EMPTY_STRING.equals(logger.getDataPath())) {
				directory.append(FileUtils.getRootLoggingFolderForScenario(simulation.getScenario().getURI().toString()));
			} else {
				directory.append(logger.getDataPath());
			}
			
			directory.append(Constants.SYSTEM_PATH_SEPARATOR);
			directory.append(simulation.getUniqueIDString());
			directory.append(Constants.SYSTEM_PATH_SEPARATOR);
			
			baseLogDirectory = new File(directory.toString());
			baseLogDirectory.mkdirs();
		}
		
		return baseLogDirectory;

	}
		
	private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()); //$NON-NLS-1$
	
	
	protected File getImageFileToLog(DecoratorIdentifierProperty compartment)
	{
		File baseDir = getBaseLogDirectory();
		
		String dateString = DATE_FORMATTER.format(simulation.getScenario().getSequencer().getCurrentTime().getTime());
		
		StringBuilder sb = new StringBuilder(baseDir.toString());
		sb.append(Constants.SYSTEM_PATH_SEPARATOR);
		sb.append(logger.getURI().lastSegment());
		sb.append(Constants.SYSTEM_PATH_SEPARATOR);
		sb.append(compartment.getDecorator().getURI().lastSegment());
		sb.append(Constants.SYSTEM_PATH_SEPARATOR);
		sb.append(compartment.getIdentifier());
		
		File compartmentDirectory = new File(sb.toString());
		if (!compartmentDirectory.exists()) {
			compartmentDirectory.mkdirs();
		}		
		
		sb = new StringBuilder();
		sb.append(compartment.getProperty().getId(null));
		sb.append("_"); //$NON-NLS-1$
		sb.append(dateString);
		sb.append("."); //$NON-NLS-1$
		sb.append(imageFormat);
		
		return new File(compartmentDirectory, sb.toString());
	}
	
}
