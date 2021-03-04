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
package org.eclipse.stem.foodproduction.presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.CommonFactory;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.common.DoubleValue;
import org.eclipse.stem.core.common.DoubleValueList;
import org.eclipse.stem.core.common.DoubleValueMatrix;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.foodproduction.ConsumptionType;
import org.eclipse.stem.foodproduction.DiseaseCarryingTransformer;
import org.eclipse.stem.foodproduction.FoodConsumer;
import org.eclipse.stem.foodproduction.FoodProducer;
import org.eclipse.stem.foodproduction.FoodTransformer;
import org.eclipse.stem.foodproduction.FoodproductionPackage;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapter;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapterFactory;
import org.eclipse.stem.ui.widgets.MatrixEditorDialog;
import org.eclipse.stem.ui.widgets.MatrixEditorWidget.MatrixEditorValidator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("all")
public class StandardFoodProductionPropertyEditor extends
		FoodProductionPropertyEditor {

	protected final Map<EStructuralFeature, String[]> matrixMap = new HashMap<EStructuralFeature, String[]>();
	protected List<EAttribute> sourceCompartments;
	protected List<EAttribute> foodCompartments;
	protected Button relButton;
	protected Button absButton;
	protected Button perButton;

	static final String TARGET = "target"; // NOT NLS
	static final String SOURCE = "source"; // NOT NLS

	static Set<String> excludeSet = new HashSet<String>();
	static {
		excludeSet
				.add(StandardPackage.Literals.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE
						.getName());
		excludeSet
				.add(StandardPackage.Literals.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS
						.getName());
		excludeSet
				.add(StandardPackage.Literals.DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT
						.getName());
	}

	/**
	 * @param feature
	 * @return <code>true</code> if the feature is a dublin core feature that is
	 *         specified by a user.
	 */
	@Override
	public boolean isUserSpecifiedProperty(final EStructuralFeature feature) {
		boolean retValue = false;
		final EClass containingClass = feature.getEContainingClass();

		// Is it a foodproduction property?
		if (containingClass.getEPackage() == FoodproductionPackage.eINSTANCE) {
			// Yes
			if (feature == FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP
					|| feature == FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__SOURCE_ATTRIBUTES
					|| feature == FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__TARGET_ATTRIBUTES)
				retValue = false;
			else
				retValue = true;
		} // if a disease model property
		return retValue;
	} // isUserSpecifiedDiseaseModelProperty

	public StandardFoodProductionPropertyEditor(Composite parent, int style,
			IProject project) {
		super(parent, style, project);
	}

	public StandardFoodProductionPropertyEditor(final Composite parent,
			final int style, final FoodTransformer foodTransformer,
			final ModifyListener projectValidator, IProject project) {
		super(parent, style, foodTransformer, projectValidator, project);

		sourceCompartments = new ArrayList<EAttribute>();
		foodCompartments = new ArrayList<EAttribute>();
		populationChange();

		FoodproductionPackage pack = FoodproductionPackage.eINSTANCE;
		ModifyListener popChangeListener = new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				populationChange();
			}
		};

		map.get(pack.getFoodTransformer_SourcePopulationName())
				.addModifyListener(popChangeListener);
		map.get(pack.getFoodTransformer_TargetPopulationName())
				.addModifyListener(popChangeListener);

		final PropertyStringProviderAdapter pspa = (PropertyStringProviderAdapter) PropertyStringProviderAdapterFactory.INSTANCE
				.adapt(foodTransformer, PropertyStringProvider.class);
		final ComposedAdapterFactory itemProviderFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		final IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory
				.adapt(foodTransformer, IItemPropertySource.class);
		final List<IItemPropertyDescriptor> properties = propertySource
				.getPropertyDescriptors(foodTransformer);

		for (final IItemPropertyDescriptor descriptor : properties) {
			final EStructuralFeature feature = (EStructuralFeature) descriptor
					.getFeature(null);
			final EClassifier type = feature.getEType();

			if (type == CommonPackage.Literals.DOUBLE_VALUE_MATRIX) {
				Label label = new Label(this, SWT.NONE);
				label.setText(pspa.getPropertyName(descriptor));
				label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
						false));

				Button button = new Button(this, SWT.NONE);

				button.setImage(AbstractUIPlugin.imageDescriptorFromPlugin(
						"org.eclipse.stem.ui",
						"/icons/full/customobj16/Matrix.gif").createImage());

				button.setLayoutData(new GridData(GridData.END));
				button.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent arg0) {
						String title = pspa.getPropertyName(descriptor);
						String[] existingVals = matrixMap.get(feature);
						short cols = (short) foodCompartments.size();
						short rows = (short) sourceCompartments.size();

						String[] rownames = new String[rows];
						String[] colnames = new String[cols];

						int n = 0;
						for (EAttribute a : sourceCompartments)
							rownames[n++] = a.getName();
						n = 0;
						for (EAttribute a : foodCompartments)
							colnames[n++] = a.getName();

						boolean fixedSize = true;
						MatrixEditorValidator validator = getValidator(feature);

						if (existingVals == null
								&& (type.getClassifierID() == CommonPackage.DOUBLE_VALUE_LIST || type
										.getClassifierID() == CommonPackage.DOUBLE_VALUE_MATRIX)) {
							existingVals = new String[cols * rows];
							for (int i = 0; i < cols * rows; ++i)
								existingVals[i] = "0.0";
						}

						Shell shell = StandardFoodProductionPropertyEditor.this
								.getShell();
						MatrixEditorDialog dialog = new MatrixEditorDialog(
								shell, SWT.NONE, title, rows, cols, rownames,
								colnames, existingVals, fixedSize, validator);
						String[] res = dialog.open();

						if (res != null) {
							matrixMap.put(feature, res);
						}

					}

					@Override
					public void widgetDefaultSelected(SelectionEvent arg0) {
					}
				});

				final Label unitLabel = new Label(this, SWT.NONE);
				unitLabel.setText(pspa.getPropertyUnits(descriptor));
				unitLabel.setLayoutData(new GridData(SWT.END, SWT.CENTER,
						false, false));
			} else if (type == FoodproductionPackage.eINSTANCE
					.getConsumptionType()) {
				Label label = new Label(this, SWT.NONE);
				label.setText(FoodProductionMessages
						.getString("consumptionType"));
				label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
						false));

				Composite radioComposite = new Composite(this, SWT.BORDER);
				radioComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
				radioComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
						true, false));

				relButton = new Button(radioComposite, SWT.RADIO);
				relButton.setText(FoodProductionMessages
						.getString("relativeConsumption"));
				relButton.setSelection(false);

				absButton = new Button(radioComposite, SWT.RADIO);
				absButton.setText(FoodProductionMessages
						.getString("absoluteConsumption"));
				absButton.setSelection(false);

				perButton = new Button(radioComposite, SWT.RADIO);
				perButton.setText(FoodProductionMessages
						.getString("consumptionPerPerson"));
				perButton.setSelection(false);

				String defaultValue = FoodproductionPackage.Literals.FOOD_CONSUMER__CONSUMPTION_TYPE
						.getDefaultValueLiteral();

				if (defaultValue.equals("1")) {
					relButton.setSelection(true);
				} else if (defaultValue.equals("2")) {
					absButton.setSelection(true);
				} else if (defaultValue.equals("3")) {
					perButton.setSelection(true);
				}

				Label unitLabel = new Label(this, SWT.NONE);
				unitLabel.setText("");
				unitLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
						true, false));
			}
		}

	}

	public void populationChange() {
		// Register for selections in the source and food decorator and
		// extract the compartment names. The names will be used in the
		// matrix below

		final Combo sourceCombo = this.comboMap
				.get(FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR);
		final Combo foodCombo = this.comboMap
				.get(FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR);

		if (sourceCombo != null && foodCombo != null) {

			// 1. update the contents of both decorators so they only list
			// disease
			List<IntegrationDecorator> decoratorsList = getDecoratorsForProject(project);
			sourceCombo.removeAll();
			foodCombo.removeAll();
			int sourceCount = 0;
			int foodCount = 0;
			for (IntegrationDecorator idec : decoratorsList) {
				if (idec instanceof DiseaseModel) {
					DiseaseModel dm = (DiseaseModel) idec;
					EList<String> idenList = dm.getAllLabelIdentifiers();
					FoodproductionPackage pack = FoodproductionPackage.eINSTANCE;
					String sourcePop = map.get(
							pack.getFoodTransformer_SourcePopulationName())
							.getText();
					String targetPop = map.get(
							pack.getFoodTransformer_TargetPopulationName())
							.getText();

					if (idenList.contains(sourcePop)) {
						sourceCombo.add(dm.getDiseaseName());
						sourceCombo.setData("" + sourceCount, dm);
						sourceCount++;
					}
					if (idenList.contains(targetPop)) {
						foodCombo.add(dm.getDiseaseName());
						foodCombo.setData("" + foodCount, dm);
						foodCount++;
					}
				}
			}

			sourceCombo.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					// build the matrix
					String pop = map
							.get(FoodproductionPackage.Literals.FOOD_TRANSFORMER__SOURCE_POPULATION_NAME)
							.getText();
					comboSelection(sourceCombo, sourceCompartments, pop);
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// nothing
				}
			});

			foodCombo.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					// build the matrix
					String pop = map
							.get(FoodproductionPackage.Literals.FOOD_TRANSFORMER__TARGET_POPULATION_NAME)
							.getText();
					comboSelection(foodCombo, foodCompartments, pop);
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// nothing
				}
			});

			// init the combo
			if ((sourceCombo.getItems() != null)
					&& (sourceCombo.getItems().length > 0)) {
				sourceCombo.select(0);
				String pop = map
						.get(FoodproductionPackage.Literals.FOOD_TRANSFORMER__SOURCE_POPULATION_NAME)
						.getText();
				comboSelection(sourceCombo, sourceCompartments, pop);
			}

			// init the combo
			if ((foodCombo.getItems() != null)
					&& (foodCombo.getItems().length > 0)) {
				foodCombo.select(0);
				String pop = map
						.get(FoodproductionPackage.Literals.FOOD_TRANSFORMER__TARGET_POPULATION_NAME)
						.getText();
				comboSelection(foodCombo, foodCompartments, pop);
			}

		}
	}

	/**
	 * This code populates the matrix when either the sourceCombo or foodCombo
	 * are toggled
	 * 
	 * @param combo
	 * @param compartmentList
	 * @param population
	 */
	public void comboSelection(Combo combo, List<EAttribute> compartmentList,
			String population) {
		int index = combo.getSelectionIndex();
		String key = index + "";
		IntegrationDecorator id = (IntegrationDecorator) combo.getData(key);
		extractCompartments(id, compartmentList, population);
		initMatrix();
	}

	protected void extractCompartments(IntegrationDecorator id,
			List<EAttribute> target, String population) {
		DiseaseModel dm = (DiseaseModel) id;

		List<IItemPropertyDescriptor> compartments = id
				.getCompartments(population);

		target.clear();
		for (IItemPropertyDescriptor compartment : compartments) {
			EAttribute compartmentAttr = (EAttribute) compartment
					.getFeature(compartment);
			String attrStr = compartmentAttr.getName();
			if (!excludeSet.contains(attrStr))
				target.add((EAttribute) compartment.getFeature(compartment));
		}

	}

	/**
	 * getValidator. Validators subclass for more advanced validation (>0 etc.)
	 * 
	 * @param feature
	 * @return
	 */
	public MatrixEditorValidator getValidator(final EStructuralFeature feature) {
		EClassifier type = feature.getEType();
		MatrixEditorValidator validator = null;
		if (type == CommonPackage.Literals.DOUBLE_VALUE_MATRIX)
			validator = new MatrixEditorValidator() {

				@Override
				public boolean validateValue(String val) {
					if (val == null || val.trim().equals(""))
						return false;
					try {
						Double.parseDouble(val.trim());
					} catch (NumberFormatException nfe) {
						return false;
					}

					return true;
				}

				public boolean validateAllValues(List<Text> vals) {
					int nCols = foodCompartments.size();
					int nRows = sourceCompartments.size();
					if (vals.size() < nCols * nRows)
						return true; // Not finished building yet
					int runningIndex = 0;
					for (int r = 0; r < nRows; ++r) {
						double sum = 0.0;
						for (int c = 0; c < nCols; ++c) {
							double value = Double.parseDouble(vals.get(
									c + (nCols * r)).getText());
							sum += value;
						}
						if (sum != 1.0)
							return false;
					}
					return true;
				}
			};
		return validator;
	}

	/**
	 * Initialize the matrix given a new set of disease decorators
	 */
	private void initMatrix() {
		int row = 0;
		int col = 0;
		int nRows = sourceCompartments.size();
		int nCols = foodCompartments.size();
		String[] allCompartments = new String[nRows * nCols];
		if (nRows * nCols > 0) {
			for (EAttribute rowAttr : sourceCompartments) {
				String rowKey = rowAttr.getName();
				for (EAttribute colAttr : foodCompartments) {
					String colKey = colAttr.getName();
					int idx = col + (row * nCols);
					// default is the identity matrix
					if (colKey.equalsIgnoreCase(rowKey)) {
						allCompartments[idx] = "" + 1;
					} else {
						allCompartments[idx] = "" + 0;
					}
					col++;
				}// cols
				row++;
				col = 0;
			}// rows
		}
		matrixMap
				.put(FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP,
						allCompartments);
	}

	public void populate(FoodTransformer foodTransformer) {
		foodTransformer
				.setSourcePopulationName(map
						.get(FoodproductionPackage.Literals.FOOD_TRANSFORMER__SOURCE_POPULATION_NAME)
						.getText());
		foodTransformer
				.setTargetPopulationName(map
						.get(FoodproductionPackage.Literals.FOOD_TRANSFORMER__TARGET_POPULATION_NAME)
						.getText());
		foodTransformer.setTimePeriod(Long.parseLong(map.get(
				FoodproductionPackage.Literals.FOOD_TRANSFORMER__TIME_PERIOD)
				.getText()));

		String uri = map
				.get(FoodproductionPackage.Literals.FOOD_TRANSFORMER__TARGET_URI)
				.getText().trim();

		if (uri.equals("")) {
			foodTransformer.setTargetURI(null);
		} else {
			foodTransformer.setTargetURI(STEMURI.createURI(uri));
		}

		if (foodTransformer instanceof FoodProducer) {
			FoodProducer producer = (FoodProducer) foodTransformer;

			producer.setSourceProcessingRate(Double
					.parseDouble(map
							.get(FoodproductionPackage.Literals.FOOD_PRODUCER__SOURCE_PROCESSING_RATE)
							.getText()));
			producer.setFoodYieldPopulationMultiplier(Double
					.parseDouble(map
							.get(FoodproductionPackage.Literals.FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER)
							.getText()));
		}

		if (foodTransformer instanceof FoodConsumer) {
			FoodConsumer consumer = (FoodConsumer) foodTransformer;

			consumer.setConsumptionRate(Double
					.parseDouble(map
							.get(FoodproductionPackage.Literals.FOOD_CONSUMER__CONSUMPTION_RATE)
							.getText()));
			consumer.setWasteRate(Double.parseDouble(map.get(
					FoodproductionPackage.Literals.FOOD_CONSUMER__WASTE_RATE)
					.getText()));
			consumer.setMaxVolumeOfStocks(Double
					.parseDouble(map
							.get(FoodproductionPackage.Literals.FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS)
							.getText()));

			if (relButton.getSelection()) {
				consumer.setConsumptionType(ConsumptionType.RELATIVE_CONSUMPTION);
			} else if (absButton.getSelection()) {
				consumer.setConsumptionType(ConsumptionType.ABSOLUTE_CONSUMPTION);
			} else if (perButton.getSelection()) {
				consumer.setConsumptionType(ConsumptionType.CONSUMPTION_PER_PERSON);
			}
		}

		if (foodTransformer instanceof DiseaseCarryingTransformer) {
			DiseaseCarryingTransformer transformer = (DiseaseCarryingTransformer) foodTransformer;
			final Combo sourceCombo = this.comboMap
					.get(FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR);
			final Combo foodCombo = this.comboMap
					.get(FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR);
			String sourceSelection = "" + sourceCombo.getSelectionIndex();
			String foodSelection = "" + foodCombo.getSelectionIndex();

			transformer.setSourceDecorator((IntegrationDecorator) sourceCombo
					.getData(sourceSelection));
			transformer.setTargetDecorator((IntegrationDecorator) foodCombo
					.getData(foodSelection));

			// 1. make an empty matrix
			DoubleValueMatrix dvm = CommonFactory.eINSTANCE
					.createDoubleValueMatrix();

			transformer.getTargetAttributes().clear();
			transformer.getSourceAttributes().clear();

			// 2. fill it
			int row = 0;
			int col = 0;
			int nRows = sourceCompartments.size();
			int nCols = foodCompartments.size();
			String[] allCompartments = matrixMap
					.get(FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP);
			if (nRows * nCols > 0) {
				for (EAttribute rowAttr : sourceCompartments) {
					transformer.getSourceAttributes().add(rowAttr);
					String rowKey = rowAttr.getName();
					// add a DoubleValuelist for each row
					DoubleValueList dvl = CommonFactory.eINSTANCE
							.createDoubleValueList();
					dvl.setIdentifier(SOURCE + " " + rowKey);
					dvm.getValueLists().add(dvl);

					for (EAttribute colAttr : foodCompartments) {
						String colKey = colAttr.getName();
						int idx = col + (row * nCols);
						transformer.getTargetAttributes().add(colAttr);
						String val = allCompartments[idx].trim();
						double dbl = (Double.valueOf(val)).doubleValue();
						DoubleValue dval = CommonFactory.eINSTANCE
								.createDoubleValue();
						dval.setValue(dbl);
						dvl.getValues().add(dval);
						dval.setIdentifier(TARGET + " " + colKey);
						col++;
					}// cols
					row++;
					col = 0;
				}// rows
			}// if

			transformer.setStateTransitionsMap(dvm);
		}
	}

	public boolean validate() {

		boolean retValue = true;
		// SOURCE_POPULATION_NAME
		if (retValue) {
			// Yes
			final Text text = map
					.get(FoodproductionPackage.Literals.FOOD_TRANSFORMER__SOURCE_POPULATION_NAME);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = FoodProductionMessages
						.getString("FoodProd.NFoodWizErr0"); //$NON-NLS-1$
			} // if
		} // SOURCE_POPULATION_NAME

		// FOOD_PRODUCER__FOOD_POPULATION_NAME
		if (retValue) {
			// Yes
			final Text text = map
					.get(FoodproductionPackage.Literals.FOOD_TRANSFORMER__TARGET_POPULATION_NAME);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = FoodProductionMessages
						.getString("FoodProd.NFoodWizErr4"); //$NON-NLS-1$
			} // if
		} // FOOD_PRODUCER__FOOD_POPULATION_NAME

		return true;
	} // validate

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

} // StandardFoodProductionPropertyEditor
