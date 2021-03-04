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
package org.eclipse.stem.ui.wizards;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.loggers.imagewriter.Activator;
import org.eclipse.stem.loggers.imagewriter.ImageWriterLogger;
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.imagewriter.MapViewImageWriterLogger;
import org.eclipse.stem.loggers.imagewriter.OriginDependentProjectedMapImageLogger;
import org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger;
import org.eclipse.stem.ui.adapters.color.ColorProvider;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapterFactory;
import org.eclipse.stem.ui.adapters.loggerpropertyeditor.SimulationLoggerPropertyEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * This class is a {@link Composite} that presents the properties of a
 * {@link Logger} for editing.
 */
public class ImagewriterLoggerPropertyEditor extends SimulationLoggerPropertyEditor {

	private Combo colorProviderPicker;	
	private List<Class<? extends ColorProvider>> colorProviders = ColorProviderAdapterFactory.INSTANCE.getSupportedColorProviders();
	private List<String> colorProviderNames = ColorProviderAdapterFactory.INSTANCE.getSupportedColorProvidersNames();
	
	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public ImagewriterLoggerPropertyEditor(final Composite parent, final int style,
			final Logger logger,
			final ModifyListener projectValidator, final IProject project) {
		super(parent, style, logger, projectValidator, project);

		if (logger instanceof ProjectedMapImageLogger) {
			final Label label = new Label(this, SWT.NONE);
			label.setText(ImageWriterLoggerWizardMessages.getString("IWLPE_ColorProviderLabel")); //$NON-NLS-1$
			
			final GridData labelGD = new GridData(GridData.BEGINNING);
			labelGD.grabExcessHorizontalSpace = true;
			labelGD.horizontalAlignment = SWT.FILL;
			labelGD.horizontalIndent = 0;
			label.setLayoutData(labelGD);
	
			colorProviderPicker = new Combo(this, SWT.READ_ONLY);
			final GridData colorProviderGD = new GridData(GridData.END);
			colorProviderGD.grabExcessHorizontalSpace = false;
			colorProviderGD.horizontalAlignment = SWT.FILL;
			colorProviderGD.horizontalSpan = 2;
			colorProviderPicker.setItems(colorProviderNames.toArray(new String[0]));
			colorProviderPicker.select(0);
			
//			final Label labelSpacer = new Label(this, SWT.NONE);
//			labelSpacer.setText("");
//			final GridData labelSpacerGD = new GridData(GridData.END);
//			labelSpacerGD.verticalAlignment = GridData.CENTER;
//			labelSpacer.setLayoutData(labelSpacerGD);
		}
	}
	
	private Class<?> getSelectedColorProvider()
	{
		return colorProviders.get(colorProviderPicker.getSelectionIndex());
		
	}

	/**
	 * @param feature
	 * @return <code>true</code> if the feature is a dublin core feature that
	 *         is specified by a user.
	 */
	@Override
	public boolean isUserSpecifiedProperty(final EStructuralFeature feature) {
		return super.isUserSpecifiedProperty(feature);
	} 

	
	
	/**
	 * @param logger
	 *            the {@link Logger} instance to populate.
	 */
	public void populate(final Logger logger) {
		super.populate(logger);

		// Set values for the base image writer logger
		if (logger instanceof ImageWriterLogger) {
			ImageWriterLogger obj = (ImageWriterLogger)logger;

			obj.setDataPath(map
							.get(ImagewriterPackage.Literals.IMAGE_WRITER_LOGGER__DATA_PATH)
							.getText());
			
			obj.setUseDefaultLogDirectory(booleanMap
					.get(ImagewriterPackage.Literals.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY)
					.getSelection());
		}

		// Set values on the Map View Image Writer
		if (logger instanceof MapViewImageWriterLogger) {
			MapViewImageWriterLogger obj = (MapViewImageWriterLogger)logger;
			
			obj.setOpenMapView(booleanMap
					.get(ImagewriterPackage.Literals.MAP_VIEW_IMAGE_WRITER_LOGGER__OPEN_MAP_VIEW)
					.getSelection());
		}
		
		// Set values on the projected image logger
		if (logger instanceof ProjectedMapImageLogger) {
			ProjectedMapImageLogger obj = (ProjectedMapImageLogger)logger;

			try {
				Class<?> cp = getSelectedColorProvider();
				obj.setColorProvider(cp.asSubclass(ColorProvider.class));
			} catch (Exception e) {
				Activator.logWarning(ImageWriterLoggerWizardMessages.getString("IWLPE_InvalidColorProvider"), e); //$NON-NLS-1$
			}
			

			obj.setForceAspectRatio(booleanMap
					.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO)
					.getSelection());
			
			obj.setFitToShapeBounds(booleanMap
					.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS)
					.getSelection());
			
			obj.setLogScaling(booleanMap
					.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING)
					.getSelection());
			
			obj.setTransparentBackground(booleanMap
					.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND)
					.getSelection());
			
			obj.setGain(Float.parseFloat(map
					.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__GAIN)
					.getText()));
			
			obj.setBorderTransparency(Integer.parseInt(map
					.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY)
					.getText()));
			
			obj.setHeight(Integer.parseInt(map
					.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__HEIGHT)
					.getText()));
			
			obj.setWidth(Integer.parseInt(map
					.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__WIDTH)
					.getText()));
		}

		
		if (logger instanceof OriginDependentProjectedMapImageLogger) {
			OriginDependentProjectedMapImageLogger obj = (OriginDependentProjectedMapImageLogger)logger;		
			obj.setOriginLatitude(Double.parseDouble(map
					.get(ImagewriterPackage.Literals.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE)
					.getText()));
			
			obj.setOriginLongitude(Double.parseDouble(map
					.get(ImagewriterPackage.Literals.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE)
					.getText()));
		}

		
	} // populate

	/**
	 * @return <code>true</code> if the contents are valid, <code>false</code>
	 *         otherwise.
	 */
	@Override
	public boolean validate() {
		if (!super.validate()) {
			return false;
		}

		Text text;
		Button button;
		
		// If "use default log directory" is false, check that a string has been entered
		// for the log directory.
		button = booleanMap.get(ImagewriterPackage.Literals.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY);
		text = map
				.get(ImagewriterPackage.Literals.IMAGE_WRITER_LOGGER__DATA_PATH);
		if (text != null && button != null && !button.getSelection()) {
			if (text.getText().equals("")) { //$NON-NLS-1$
				errorMessage = ImageWriterLoggerWizardMessages.getString("IWLPE_InvalidLogDirectory"); //$NON-NLS-1$
				return false;
			}
		}
		

		text = map
				.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY);
		if (text != null && (text.getText().equals("") || !isValidIntValue(text.getText(), 0, 100))) { //$NON-NLS-1$
			errorMessage = ImageWriterLoggerWizardMessages.getString("IWLPE_InvalidBorderTransparencyValue"); //$NON-NLS-1$
			return false;
		}
		
		text = map
				.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__GAIN);
		if (text != null && (text.getText().equals("") || !isValidDoubleValue(text.getText(), 0.000000000001))) { //$NON-NLS-1$
			errorMessage = ImageWriterLoggerWizardMessages.getString("IWLPE_InvalidGainValue"); //$NON-NLS-1$
			return false;
		}
		
		text = map
				.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__HEIGHT);
		if (text != null && (text.getText().equals("") || !isValidIntValue(text.getText(), 1))) { //$NON-NLS-1$
			errorMessage = ImageWriterLoggerWizardMessages.getString("IWLPE_InvalidImageHeightValue"); //$NON-NLS-1$
			return false;
		}

		text = map
				.get(ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__WIDTH);
		if (text != null && (text.getText().equals("") || !isValidIntValue(text.getText(), 1))) { //$NON-NLS-1$
			errorMessage = ImageWriterLoggerWizardMessages.getString("IWLPE_InvalidImageWidthValue"); //$NON-NLS-1$
			return false;
		}
		
		text = map
				.get(ImagewriterPackage.Literals.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LATITUDE);
		if (text != null && (text.getText().equals("") || !isValidDoubleValue(text.getText(), -90.0, 90.0))) { //$NON-NLS-1$
			errorMessage = ImageWriterLoggerWizardMessages.getString("IWLPE_InvalidOriginLatitudeValue"); //$NON-NLS-1$
			return false;
		}

		text = map
				.get(ImagewriterPackage.Literals.ORIGIN_DEPENDENT_PROJECTED_MAP_IMAGE_LOGGER__ORIGIN_LONGITUDE);
		if (text != null && (text.getText().equals("") || !isValidDoubleValue(text.getText(), -180.0, 180.0))) { //$NON-NLS-1$
			errorMessage = ImageWriterLoggerWizardMessages.getString("IWLPE_InvalidOriginLongitudeValue"); //$NON-NLS-1$
			return false;
		}
		
		return true;
	} // validate

}
