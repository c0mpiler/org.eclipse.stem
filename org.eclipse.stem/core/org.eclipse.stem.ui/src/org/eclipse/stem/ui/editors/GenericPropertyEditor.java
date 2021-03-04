package org.eclipse.stem.ui.editors;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.ui.Utility;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapter;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapterFactory;
import org.eclipse.stem.ui.editors.validation.EAnnotationConstraintValidator;
import org.eclipse.stem.ui.widgets.LocationPickerDialog;
import org.eclipse.stem.ui.wizards.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Producing a form given an identifiable object is common in STEM. This class
 * consolidates what used to be a handful of places we do this into a single
 * place.
 * 
 */

public abstract class GenericPropertyEditor extends Composite {
	
	/**
	 * Empty string constant
	 */
	public static final String EMPTY_STRING = "";
	
	/**
	 * Annotation source for feature constraints
	 */
	public static final String FEATURE_CONSTRAINT_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/modelparam/constraints";
	
	/**
	 * Cached validators for validating feature constraints
	 */
	private Map<EStructuralFeature,EAnnotationConstraintValidator> validators = new HashMap<EStructuralFeature,EAnnotationConstraintValidator>();
	
	
	protected final Map<EStructuralFeature, Text> map = new HashMap<EStructuralFeature, Text>();
	protected final Map<EStructuralFeature, Button> booleanMap = new HashMap<EStructuralFeature, Button>();
	protected final Map<EStructuralFeature, Combo> comboMap = new HashMap<EStructuralFeature, Combo>();
	
	protected String errorMessage;
	protected IProject project;
	protected PropertyStringProviderAdapter stringProvider;
	
	private IItemPropertySource propertySource;
	private Identifiable identifiable;
	
	
	public GenericPropertyEditor(Composite parent, int style, IProject project) {
		super(parent, style);
		this.project = project;
	}

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public GenericPropertyEditor(final Composite parent, final int style,
			final Identifiable identifiable,
			final ModifyListener projectValidator, IProject project) {
		super(parent, style);
		this.project = project;
		this.identifiable = identifiable;
		
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		setLayout(gridLayout);

		// Get the adapter that will provide NLS'd names for the
		// properties of the disease model
		stringProvider = (PropertyStringProviderAdapter) PropertyStringProviderAdapterFactory.INSTANCE
				.adapt(identifiable, PropertyStringProvider.class);

		final ComposedAdapterFactory itemProviderFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		propertySource = (IItemPropertySource) itemProviderFactory
				.adapt(identifiable, IItemPropertySource.class);
		
		final List<IItemPropertyDescriptor> properties = propertySource
				.getPropertyDescriptors(identifiable);

		for (final IItemPropertyDescriptor descriptor : properties) {
			final EStructuralFeature feature = (EStructuralFeature) descriptor
					.getFeature(null);
			EClassifier classifier = feature.getEType();

			// Is this a disease model property that the user should specify?
			if (!isUserSpecifiedProperty(feature)) {
				continue;
			}

			if (classifier != EcorePackage.Literals.EBOOLEAN
					&& classifier != CommonPackage.Literals.URI
					&& classifier != EcorePackage.Literals.ESHORT
					&& classifier != EcorePackage.Literals.EINT
					&& classifier != EcorePackage.Literals.ELONG
					&& classifier != EcorePackage.Literals.EFLOAT
					&& classifier != EcorePackage.Literals.EDOUBLE
					&& classifier != EcorePackage.Literals.ESTRING
					&& classifier != ModelPackage.Literals.INTEGRATION_DECORATOR) {
				continue;
			}

			boolean isDataPath = false;
			boolean isURI = false;

			final Label label = new Label(this, SWT.NONE);
			label.setText(stringProvider.getPropertyName(descriptor));

			final GridData labelGD = new GridData(GridData.BEGINNING);
			labelGD.grabExcessHorizontalSpace = true;
			labelGD.horizontalAlignment = SWT.FILL;
			labelGD.horizontalIndent = 0;
			label.setLayoutData(labelGD);

			// Get a string value for the default value of the feature
			final String defaultValueString = getPropertyDefaultValueString(descriptor);

			if (classifier == EcorePackage.Literals.EBOOLEAN) {
				Composite radioComposite = new Composite(this, SWT.BORDER);
				FillLayout fillLayout = new FillLayout();
				fillLayout.type = SWT.HORIZONTAL;
				radioComposite.setLayout(fillLayout);
				final Button falseButton = new Button(radioComposite, SWT.RADIO);
				falseButton.setText(Messages.getString("NO"));//$NON-NLS-1$

				Button trueButton = new Button(radioComposite, SWT.RADIO);
				trueButton.setText(Messages.getString("YES"));//$NON-NLS-1$

				if (defaultValueString != null) {
					trueButton.setSelection(defaultValueString.equals("true"));
					falseButton
							.setSelection(!defaultValueString.equals("true"));
				} else {
					falseButton.setSelection(true);
					trueButton.setSelection(false);
				}

				booleanMap.put(feature, trueButton);
				falseButton.setToolTipText(stringProvider.getPropertyToolTip(descriptor));
				trueButton.setToolTipText(stringProvider.getPropertyToolTip(descriptor));
				
				final GridData cGD = new GridData(GridData.END);
				cGD.grabExcessHorizontalSpace = true;
				cGD.horizontalAlignment = SWT.FILL;
				radioComposite.setLayoutData(cGD);
			} else if (classifier == CommonPackage.Literals.URI) {
				// Bring up location picker for URI's
				isURI = true;

				final Text isokeyValueText = new Text(this, SWT.NONE);
				isokeyValueText.setToolTipText(stringProvider.getPropertyToolTip(descriptor));
				isokeyValueText.setText("");
				map.put(feature, isokeyValueText);

				final GridData gd_isoKeyLabelValue = new GridData(SWT.FILL,
						SWT.CENTER, true, false);
				isokeyValueText.setLayoutData(gd_isoKeyLabelValue);

				final Button locationButton = new Button(this, SWT.NONE);
				locationButton.setText(Messages.getString("NPickLoc"));
				final GridData lb_isoKeyLabel = new GridData(SWT.FILL,
						SWT.CENTER, true, false);
				locationButton.setLayoutData(lb_isoKeyLabel);

				locationButton.addSelectionListener(new SelectionListener() {

					public void widgetSelected(SelectionEvent arg0) {
						LocationPickerDialog lpDialog = new LocationPickerDialog(
								GenericPropertyEditor.this.getShell(),
								SWT.NONE, Messages.getString("NPickLocTitle"),
								isokeyValueText.getText(),
								GenericPropertyEditor.this.project);

						Object[] ret = lpDialog.open();
						if (ret != null) {
							if (ret[1] != null)
								isokeyValueText.setText(((URI) ret[1])
										.toString());
							else
								isokeyValueText.setText(STEMURI.createURI(
										"node/geo/region/" + ((String) ret[0]))
										.toString());
						}
					}

					public void widgetDefaultSelected(SelectionEvent arg0) {

					}
				});
			} else if (classifier == EcorePackage.Literals.ESHORT
					|| classifier == EcorePackage.Literals.EINT
					|| classifier == EcorePackage.Literals.ELONG
					|| classifier == EcorePackage.Literals.EFLOAT
					|| classifier == EcorePackage.Literals.EDOUBLE
					|| classifier == EcorePackage.Literals.ESTRING) {
				Text text = new Text(this, SWT.BORDER | SWT.TRAIL);
				if (defaultValueString != null)
					text.setText(defaultValueString);
				text.setToolTipText(stringProvider.getPropertyToolTip(descriptor));
				map.put(feature, text);

				final GridData textGD = new GridData(GridData.END);
				textGD.grabExcessHorizontalSpace = true;
				textGD.horizontalAlignment = SWT.FILL;
				text.setLayoutData(textGD);

				text.addModifyListener(projectValidator);

				if (feature.getName().startsWith("dataPath")) { //$NON-NLS-1$
					isDataPath = true;
					final Composite buttons = new Composite(this, SWT.NONE);
					final RowLayout buttonsLayout = new RowLayout();
					buttonsLayout.marginTop = 0;
					buttonsLayout.marginBottom = 0;
					buttons.setLayout(buttonsLayout);
					final Shell shell = this.getShell();

					final Button fileChooserButton = new Button(buttons,
							SWT.NONE);
					fileChooserButton.setText(Messages
							.getString("fileChooserButtonText")); //$NON-NLS-1$
					fileChooserButton.setToolTipText(Messages
							.getString("fileChooserButtonTooltipText")); //$NON-NLS-1$
					final Text _text = text;
					fileChooserButton
							.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(
										final SelectionEvent e) {
									final FileDialog fd = new FileDialog(shell,
											SWT.OPEN | SWT.MULTI);
									fd.setText(Messages
											.getString("fileChooserDialogTitle")); //$NON-NLS-1$
									final String[] extensionsFilter = {
											"*.txt", "*.csv" };
									fd.setFilterExtensions(extensionsFilter);

									// String format for single selected
									// file
									// will be:
									// "path/file_name"
									// For multi-files the format will be:
									// "path/file_name1" "file_name2"
									// "file_name3"...

									String selected = fd.open();
									final String[] selectedFiles = fd
											.getFileNames();
									if (selectedFiles.length > 1) { // if
										// multi-files
										// selected
										StringBuilder str = new StringBuilder(
												selected);
										for (int i = 1; i < selectedFiles.length; i++) {
											str.append(" \"");
											str.append(selectedFiles[i]);
											str.append("\"");
											// selected += " \""
											// + selectedFiles[i] + "\"";
										}
										selected = str.toString();
									}
									_text.setText(selected);
								} // widgetSelected
							} // SelectionAdapter
							);

					final Button dirChooserButton = new Button(buttons,
							SWT.NONE);
					dirChooserButton.setText(Messages
							.getString("dirChooserButtonText")); //$NON-NLS-1$
					dirChooserButton.setToolTipText(Messages
							.getString("dirChooserButtonTooltipText")); //$NON-NLS-1$
					dirChooserButton
							.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(
										final SelectionEvent e) {
									final DirectoryDialog dd = new DirectoryDialog(
											shell, SWT.OPEN);
									dd.setText(Messages
											.getString("dirChooserDialogTitle")); //$NON-NLS-1$
									final String pathName = dd.open();
									
									IPath rootPath = new Path(ResourcesPlugin.getWorkspace()
											.getRoot().getLocation().toFile().toString());

									
									if (pathName != null) {
										IPath path = new Path(pathName);


										if (rootPath.isPrefixOf(path)) {
											String relPath = path.makeRelativeTo(rootPath).toString();
											if (relPath.isEmpty()) 
												relPath = "/";
											_text.setText(URI.createPlatformResourceURI(relPath,
													false).toString());
										} else {
											_text.setText(pathName);
										}
									}
								} // widgetSelected
							} // SelectionAdapter
							);

					final GridData fileBtnGD = new GridData(GridData.END);
					// fileChooserButton.setLayoutData(fileBtnGD);
					buttons.setLayoutData(fileBtnGD);
									
				} else if (feature.getName().startsWith("dataFile")) { //$NON-NLS-1$
					isDataPath = true;
					final Composite buttons = new Composite(this, SWT.NONE);
					final RowLayout buttonsLayout = new RowLayout();
					buttonsLayout.marginTop = 0;
					buttonsLayout.marginBottom = 0;
					buttons.setLayout(buttonsLayout);
					final Shell shell = this.getShell();

					final Button fileChooserButton = new Button(buttons,
							SWT.NONE);
					fileChooserButton.setText(Messages
							.getString("fileChooserButtonText")); //$NON-NLS-1$
					fileChooserButton.setToolTipText(Messages
							.getString("fileChooserButtonTooltipText")); //$NON-NLS-1$
					final Text _text = text;
					fileChooserButton
							.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(
										final SelectionEvent e) {
									final FileDialog fd = new FileDialog(shell,
											SWT.OPEN | SWT.SINGLE);
									fd.setText(Messages
											.getString("fileChooserDialogTitle")); //$NON-NLS-1$
									StringTokenizer tok = new StringTokenizer(
											feature.getName(), "_");
									Vector<String> v = new Vector<String>();
									tok.nextToken();
									while (tok.hasMoreTokens()) {
										v.add("*." + tok.nextToken());
									}
									v.add("*");
									final String[] extensionsFilter = new String[v
											.size()];
									fd.setFilterExtensions(v
											.toArray(extensionsFilter));

									_text.setText(fd.open());
								} // widgetSelected
							} // SelectionAdapter
							);

					final GridData fileBtnGD = new GridData(GridData.END);
					// fileChooserButton.setLayoutData(fileBtnGD);
					buttons.setLayoutData(fileBtnGD);
				}
			}
			 else if (feature instanceof EReference) { //$NON-NLS-1$
				EReference ref = (EReference)feature;
				EClassifier eClassifier = ref.getEType();
				if(eClassifier.getInstanceClass().equals(IntegrationDecorator.class)) {
					// add a combo box to pick integration decorators from the project
					
					Combo decoratorsCombo = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY | SWT.CENTER);
					List<IntegrationDecorator> decoratorsList = getDecoratorsForProject(project);
					
					int index = 0;
					for(IntegrationDecorator idec: decoratorsList) {
						decoratorsCombo.add(idec.getURI().toString());
						decoratorsCombo.setData(""+(index++), idec);
					}
					decoratorsCombo.setVisible(true);
					final GridData comboGD = new GridData(GridData.END);
					comboGD.grabExcessHorizontalSpace = true;
					comboGD.horizontalAlignment = SWT.FILL;
					decoratorsCombo.setLayoutData(comboGD);
					
					comboMap.put(feature, decoratorsCombo);
					
				}
			}
			
			if (!isDataPath && !isURI) {
				final Label unitLabel = new Label(this, SWT.NONE);
				unitLabel.setText(stringProvider.getPropertyUnits(descriptor));
				final GridData unitLabelGD = new GridData(GridData.END);
				unitLabelGD.verticalAlignment = GridData.CENTER;
				unitLabel.setLayoutData(unitLabelGD);
			}
		} // for each disease model property

	} // GraphGeneratorPropertyEditor
	
	
	
	
	
	/**
	 * 
	 * @param project
	 * @return
	 */
	public List<IntegrationDecorator> getDecoratorsForProject(IProject project)
	{
		List<IntegrationDecorator> retVal = new ArrayList<IntegrationDecorator>();
		try {
			IFolder folder = project.getFolder(Utility.DECORATORS_FOLDER_NAME);
			if (folder.exists()) {
				IResource[] members = folder.members();
				if (members != null) {
					for (IResource resource : members) {
						if (resource instanceof IFile) {
							try {
								Identifiable id = Utility.getIdentifiable((IFile)resource);
								if (id instanceof IntegrationDecorator) {
									retVal.add((IntegrationDecorator)id);
								}
							} catch (Exception e) {
								
							}
						}
					}
				}
			}
		} catch (CoreException ce) {
			ce.printStackTrace();
		}
		
		return retVal;
		
	}
	
	
	
	public void populate(EObject obj) {
		
		if (obj instanceof IntegrationDecorator) {
			IntegrationDecorator model = (IntegrationDecorator) obj;

			model.setAddStochasticNoise(booleanMap
							.get(ModelPackage.Literals.INTEGRATION_DECORATOR__ADD_STOCHASTIC_NOISE).getSelection());
			model.setRandomSeed(Long
					.parseLong(map
							.get(ModelPackage.Literals.INTEGRATION_DECORATOR__RANDOM_SEED)
							.getText()));
		}
	}

	public boolean validate() {
		boolean retValue = true;
		if (retValue) {
			// Yes
			final Text text = map
					.get(ModelPackage.Literals.INTEGRATION_DECORATOR__RANDOM_SEED);
			if(text != null) {
				retValue = isValidLongValue(text.getText(), 0);
				if (!retValue) {
					// Yes
					errorMessage = Messages.getString("NIdWiz.WizErrInvSeed"); //$NON-NLS-1$
				} // if
			}
		} // if
		
		return retValue;
	} // validate

	
	/**
	 * @param feature
	 * @return <code>true</code> if the feature is a dublin core feature that is
	 *         specified by a user.
	 */
	protected abstract boolean isUserSpecifiedProperty(
			final EStructuralFeature feature);

	protected boolean isValidLongValue(final String text) {
		boolean retValue = true;
		try {
			Long.parseLong(text);
		} catch (final NumberFormatException nfe) {
			retValue = false;
		} // catch ParseException
		return retValue;
	}
	
	/**
	 * @param text
	 * @param minValue
	 * @return
	 */
	protected boolean isValidLongValue(final String text, final long minValue) {
		boolean retValue = true;
		try {
			final double value = Long.parseLong(text);
			retValue = value >= minValue;
		} catch (final NumberFormatException nfe) {
			retValue = false;
		} // catch ParseException
		return retValue;
	}

	/**
	 * @param text
	 * @return
	 */
	protected boolean isValidPercentage(final String text) {
		boolean retValue = true;
		try {
			final double value = Double.parseDouble(text);
			retValue = value >= 0.0 && value <= 100.;
		} catch (final NumberFormatException nfe) {
			retValue = false;
		} // catch ParseException
		return retValue;
	}

	/**
	 * @param text
	 * @param minValue
	 * @return
	 */
	protected boolean isValidValue(final String text, final double minValue) {
		boolean retValue = true;
		try {
			final double value = Double.parseDouble(text);
			retValue = value >= minValue;
		} catch (final NumberFormatException nfe) {
			retValue = false;
		} // catch ParseException
		return retValue;
	} // isValidRate

	/**
	 * @param text
	 * @param minValue
	 * @return
	 */
	protected boolean isValidIntValue(final String text) {
		return isValidIntValue(text, Integer.MIN_VALUE, Integer.MAX_VALUE);
	} // isValidIntRate
	
	/**
	 * @param text
	 * @param minValue
	 * @return
	 */
	protected boolean isValidIntValue(final String text, final int minValue) {
		return isValidIntValue(text, minValue, Integer.MAX_VALUE);
	} // isValidIntRate
	
	protected boolean isValidIntValue(final String text, final int minValue, final int maxValue) {
		boolean retValue = true;
		try {
			final double value = Integer.parseInt(text);
			retValue = (value >= minValue && value <= maxValue);
		} catch (final NumberFormatException nfe) {
			retValue = false;
		} // catch ParseException
		return retValue;
	} // isValidIntRate
	
	protected boolean isValidDoubleValue(final String text) {
		boolean retValue = true;
		try {
			Double.parseDouble(text);
		} catch (final NumberFormatException nfe) {
			retValue = false;
		} // catch ParseException
		return retValue;
	} // isValidDoubleValue

	/**
	 * @param text
	 * @param minValue
	 * @return
	 */
	protected boolean isValidDoubleValue(final String text, final double minValue) {
		boolean retValue = true;
		try {
			final double value = Double.parseDouble(text);
			retValue = value >= minValue;
		} catch (final NumberFormatException nfe) {
			retValue = false;
		} // catch ParseException
		return retValue;
	} // isValidDoubleValue
	
	/**
	 * @param text
	 * @param minValue
	 * @return
	 */
	protected boolean isValidDoubleValue(final String text, final double minValue, final double maxValue) {
		boolean retValue = true;
		try {
			final double value = Double.parseDouble(text);
			retValue = value >= minValue && value <= maxValue;
		} catch (final NumberFormatException nfe) {
			retValue = false;
		} // catch ParseException
		return retValue;
	} // isValidDoubleValue

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	/**
	 * @param descriptor
	 * @return the string that represents the default value of the property
	 */
	protected String getPropertyDefaultValueString(
			final IItemPropertyDescriptor descriptor) {
		final EStructuralFeature feature = (EStructuralFeature) descriptor
				.getFeature(null);

		return feature.getDefaultValueLiteral();
	}

	/**
	 * @return the error message that describes the problem with the contents
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	
	
	/**
	 * Whether the specified feature is handled by the internal validator
	 * 
	 * @param feature
	 * @return
	 */
	public boolean typeIsHandledByValidator(EStructuralFeature feature)
	{
		EClassifier classifier = feature.getEType();
		boolean value = classifier.equals(EcorePackage.Literals.ESHORT)
				|| classifier.equals(EcorePackage.Literals.EINT)
				|| classifier.equals(EcorePackage.Literals.ELONG)
				|| classifier.equals(EcorePackage.Literals.EFLOAT)
				|| classifier.equals(EcorePackage.Literals.EDOUBLE)
				|| classifier.equals(EcorePackage.Literals.ESTRING);
		
		return value;
	}
	
	
	/**
	 * Validates the value of a given feature against any EAnnotation constraints
	 * that are defined as children of the feature in the Ecore model
	 * 
	 * @param feature
	 * @return Whether the value is valid
	 */
	protected boolean validateFeatureConstraint(EStructuralFeature feature)
	{
		// If the feature is of type supported by internal validation, then 
		// validate the value.  Otherwise, return true
		if (typeIsHandledByValidator(feature)) {
			Text data = map.get(feature);
			if (data != null) {
				return validateFeatureConstraint(feature, data.getText().trim());
			}
		}
		return true;
	}
	
	/**
	 * Gets the ItemPropertyDescriptor for the given feature
	 * @param feature
	 * @return The ItemPropertyDescriptor for the given feature
	 */
	private IItemPropertyDescriptor getDescriptorForFeature(EStructuralFeature feature) {
		return propertySource.getPropertyDescriptor(identifiable, feature);
	}	
	
	/**
	 * Validates the given value for a given feature against any EAnnotation constraints
	 * that are defined as children of the feature in the Ecore model
	 * 
	 * @param feature Feature to validate
	 * @param value String representing a value for feature to validate
	 * @return Whether the value is valid for the feature
	 */
	protected boolean validateFeatureConstraint(EStructuralFeature feature, String value)
	{
		// Check if the feature is required and present.  If required, and string is empty, then 
		// set the MISSING error message and return false
		if (feature.getLowerBound() > 0 && isNullOrEmpty(value)) {
			// Required field is missing
			errorMessage = stringProvider.getPropertyMissing(getDescriptorForFeature(feature));
			return false;
		}
		
		EAnnotation constraint = feature.getEAnnotation(FEATURE_CONSTRAINT_ANNOTATION_SOURCE);
		if (constraint != null) {
			// Get the validator for this feature / constraint from cache.  If not cached,
			// get new cache.
			EAnnotationConstraintValidator validator = validators.get(feature);
			if (validator == null) {
				validator = new EAnnotationConstraintValidator(constraint);
				validators.put(feature, validator);
			}
			
			// If validator returns false, then the value does not match the constraint.
			// Set the "INVALID" message and return false
			if (!validator.validate(value)) {
				errorMessage = stringProvider.getPropertyInvalid(getDescriptorForFeature(feature));
				return false;
			}
		}
		
		// Everything looks good
		return true;
	}
	
	private static boolean isNullOrEmpty(String value)
	{
		return (value == null || EMPTY_STRING.equals(value));
	}


} // GenericPropertyEditor
