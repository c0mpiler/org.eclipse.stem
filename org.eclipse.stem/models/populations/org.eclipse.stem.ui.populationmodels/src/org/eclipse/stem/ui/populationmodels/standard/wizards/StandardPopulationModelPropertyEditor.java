// StandardDiseaseModelPropertyEditor.java
package org.eclipse.stem.ui.populationmodels.standard.wizards;

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

import org.eclipse.core.resources.IProject;
import org.eclipse.stem.populationmodels.standard.AgeGroup;
import org.eclipse.stem.populationmodels.standard.AgingPopulationModel;
import org.eclipse.stem.populationmodels.standard.DemographicPopulationModel;
import org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationModel;
import org.eclipse.stem.populationmodels.standard.MosquitoPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationGroup;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.SeasonalPopulationModel;
import org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModel;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/**
 * This class is a {@link Composite} that presents the properties of a
 * {@link DiseaseModel} for editing.
 */
public class StandardPopulationModelPropertyEditor extends
		PopulationModelPropertyEditor {

	private ArrayList<Composite> groupComposites = new ArrayList<Composite>();
	private ArrayList<Text> groupIDComposites = new ArrayList<Text>();
	private ArrayList<Text> groupFracComposites = new ArrayList<Text>();
	private ArrayList<Text> groupFromAgeComposites = new ArrayList<Text>();
	private ArrayList<Text> groupToAgeComposites = new ArrayList<Text>();
	private ArrayList<Text> groupDeathFactorComposites = new ArrayList<Text>();

	private static double DEFAULT_POPULATION_FRACTION = 1.0;
	private static int DEFAULT_AGEGROUP_RANGE = 20;
	private static double DEFAULT_DEATH_FACTOR = 1.0;

	Group allGroups;

	String populationID;

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public StandardPopulationModelPropertyEditor(final Composite parent,
			final int style, final PopulationModel populationModel,
			final ModifyListener projectValidator, IProject project) {
		super(parent, style, populationModel, projectValidator, project);
		populationID = populationModel.getPopulationIdentifier();

		if (populationModel instanceof DemographicPopulationModel
				&& !(populationModel instanceof AgingPopulationModel)) {
			allGroups = new Group(this, SWT.NONE);
			allGroups.setLayout(new GridLayout(1, true));
			allGroups.setLayoutData(new GridData(GridData.FILL,
					GridData.CENTER, true, false, 3, 1));

			addPopulationGroupField(allGroups, projectValidator);

			final Button addButton = new Button(this, SWT.NONE);
			addButton.setText(PopulationModelWizardMessages
					.getString("addGroup"));
			addButton.setToolTipText(PopulationModelWizardMessages
					.getString("addGroupTT"));
			addButton.setLayoutData(new GridData(GridData.BEGINNING,
					GridData.BEGINNING, true, true, 3, 1));
			addButton.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent arg0) {
					addPopulationGroupField(allGroups, projectValidator);
					updateGui();
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent arg0) {
				}
			});
		} else if (populationModel instanceof AgingPopulationModel) {
			final Button hasMaxAgeButton = booleanMap
					.get(StandardPackage.Literals.AGING_POPULATION_MODEL__HAS_MAX_AGE);

			hasMaxAgeButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					updateTextFields();
				}
			});

			allGroups = new Group(this, SWT.NONE);
			allGroups.setLayout(new GridLayout(1, true));
			allGroups.setLayoutData(new GridData(GridData.FILL,
					GridData.CENTER, true, false, 3, 1));

			addAgeGroupField(allGroups, projectValidator);

			final Button addButton = new Button(this, SWT.NONE);
			addButton.setText(PopulationModelWizardMessages
					.getString("addGroup"));
			addButton.setToolTipText(PopulationModelWizardMessages
					.getString("addGroupTT"));
			addButton.setLayoutData(new GridData(GridData.BEGINNING,
					GridData.BEGINNING, true, true, 3, 1));
			addButton.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent arg0) {
					addAgeGroupField(allGroups, projectValidator);
					updateGui();
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent arg0) {
				}
			});

			final Button fractionsButton = new Button(this, SWT.NONE);
			fractionsButton.setText(PopulationModelWizardMessages
					.getString("setFractions"));
			fractionsButton.setToolTipText(PopulationModelWizardMessages
					.getString("setFractionsTT"));
			fractionsButton.setLayoutData(new GridData(GridData.BEGINNING,
					GridData.CENTER, true, true, 3, 1));
			fractionsButton.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					setFractionToEquilibrium();
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});

			final Button deathRatesButton = new Button(this, SWT.NONE);
			deathRatesButton.setText(PopulationModelWizardMessages
					.getString("setDeathRates"));
			deathRatesButton.setToolTipText(PopulationModelWizardMessages
					.getString("setDeathRatesTT"));
			deathRatesButton.setLayoutData(new GridData(GridData.BEGINNING,
					GridData.CENTER, true, true, 3, 1));
			deathRatesButton.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					setDeathRatesToEquilibrium();
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
		}
	} // StandardDiseaseModelPropertyEditor

	private void addPopulationGroupField(final Composite parent,
			final ModifyListener projectValidator) {
		Group groupInfo = new Group(parent, SWT.BORDER);
		groupInfo.setLayout(new GridLayout(11, false));
		groupInfo.setLayoutData(new GridData(GridData.FILL, GridData.CENTER,
				true, false));
		groupComposites.add(groupInfo);

		final Button removeButton = new Button(groupInfo, SWT.NONE);
		removeButton.setText(PopulationModelWizardMessages
				.getString("removeGroup"));
		removeButton.setToolTipText(PopulationModelWizardMessages
				.getString("removeGroupTT"));
		removeButton.setLayoutData(new GridData(GridData.BEGINNING,
				GridData.CENTER, true, false));
		removeButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				int ind = groupComposites.indexOf(removeButton.getParent());

				groupComposites.remove(ind);
				groupFracComposites.remove(ind);
				groupIDComposites.remove(ind);

				removeButton.getParent().dispose();
				updateGui();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
			}
		});

		Label label;
		Text text;

		label = new Label(groupInfo, SWT.NONE);
		label.setText(PopulationModelWizardMessages.getString("populationId"));
		label.setLayoutData(new GridData(GridData.END, GridData.CENTER, true,
				false));

		text = new Text(groupInfo, SWT.BORDER | SWT.TRAIL);
		text.setText(populationID + groupComposites.size());
		text.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true,
				false));
		text.addModifyListener(projectValidator);
		groupIDComposites.add(text);

		label = new Label(groupInfo, SWT.NONE);
		label.setText(PopulationModelWizardMessages
				.getString("populationIdFraction"));
		label.setLayoutData(new GridData(GridData.END, GridData.CENTER, true,
				false));

		text = new Text(groupInfo, SWT.BORDER | SWT.TRAIL);
		text.setText(DEFAULT_POPULATION_FRACTION + "");
		text.setLayoutData(new GridData(GridData.END, GridData.CENTER, true,
				false));
		text.addModifyListener(projectValidator);
		groupFracComposites.add(text);
		getParent().pack();
		getParent().layout();
	}

	private void addAgeGroupField(final Composite parent,
			final ModifyListener projectValidator) {
		Group groupInfo = new Group(parent, SWT.BORDER);
		groupInfo.setLayout(new GridLayout(11, false));
		groupInfo.setLayoutData(new GridData(GridData.FILL, GridData.CENTER,
				true, false));
		groupComposites.add(groupInfo);

		final Button removeButton = new Button(groupInfo, SWT.NONE);
		removeButton.setText(PopulationModelWizardMessages
				.getString("removeGroup"));
		removeButton.setToolTipText(PopulationModelWizardMessages
				.getString("removeGroupTT"));
		removeButton.setLayoutData(new GridData(GridData.BEGINNING,
				GridData.CENTER, true, false));
		removeButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				int ind = groupComposites.indexOf(removeButton.getParent());

				groupComposites.remove(ind);
				groupFracComposites.remove(ind);
				groupIDComposites.remove(ind);
				groupFromAgeComposites.remove(ind);
				groupToAgeComposites.remove(ind);
				groupDeathFactorComposites.remove(ind);

				updateTextFields();
				removeButton.getParent().dispose();
				updateGui();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
			}
		});

		Label label;
		Text text;

		label = new Label(groupInfo, SWT.NONE);
		label.setText(PopulationModelWizardMessages.getString("populationId"));
		label.setLayoutData(new GridData(GridData.END, GridData.CENTER, true,
				false));

		text = new Text(groupInfo, SWT.BORDER | SWT.TRAIL);
		text.setEditable(false);
		text.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true,
				false));
		text.addModifyListener(projectValidator);
		groupIDComposites.add(text);

		label = new Label(groupInfo, SWT.NONE);
		label.setText(PopulationModelWizardMessages
				.getString("populationIdFraction"));
		label.setLayoutData(new GridData(GridData.END, GridData.CENTER, true,
				false));

		text = new Text(groupInfo, SWT.BORDER | SWT.TRAIL);
		text.setText(DEFAULT_POPULATION_FRACTION + "");
		text.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true,
				false));
		text.addModifyListener(projectValidator);
		groupFracComposites.add(text);

		label = new Label(groupInfo, SWT.NONE);
		label.setText(PopulationModelWizardMessages.getString("fromAge"));
		label.setLayoutData(new GridData(GridData.END, GridData.CENTER, true,
				false));

		text = new Text(groupInfo, SWT.BORDER | SWT.TRAIL);
		text.setEditable(false);
		text.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true,
				false));
		text.addModifyListener(projectValidator);
		groupFromAgeComposites.add(text);

		label = new Label(groupInfo, SWT.NONE);
		label.setText(PopulationModelWizardMessages.getString("toAge"));
		label.setLayoutData(new GridData(GridData.END, GridData.CENTER, true,
				false));

		text = new Text(groupInfo, SWT.BORDER | SWT.TRAIL);
		text.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true,
				false));
		text.addModifyListener(projectValidator);
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				updateTextFields();
			}
		});
		groupToAgeComposites.add(text);

		label = new Label(groupInfo, SWT.NONE);
		label.setText(PopulationModelWizardMessages.getString("deathFactor"));
		label.setLayoutData(new GridData(GridData.END, GridData.CENTER, true,
				false));

		text = new Text(groupInfo, SWT.BORDER | SWT.TRAIL);
		text.setText(DEFAULT_DEATH_FACTOR + "");
		text.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true,
				false));
		text.addModifyListener(projectValidator);
		groupDeathFactorComposites.add(text);

		updateTextFields();
	}

	/**
	 * @param diseaseModel
	 *            the {@link DiseaseModel} instance to populate.
	 */
	@Override
	public void populate(final PopulationModel populationModel) {
		super.populate(populationModel);

		populationModel
				.setPopulationIdentifier(map
						.get(StandardPackage.Literals.POPULATION_MODEL__POPULATION_IDENTIFIER)
						.getText());
		populationModel.setName(map.get(
				StandardPackage.Literals.POPULATION_MODEL__NAME).getText());

		populationModel.setInitialRescalingFactor(Double.parseDouble(map.get(StandardPackage.Literals.POPULATION_MODEL__INITIAL_RESCALING_FACTOR).getText()));
		
		if (populationModel instanceof StandardPopulationModel) {
			StandardPopulationModel model = (StandardPopulationModel) populationModel;

			model.setBirthRate(Double
					.parseDouble(map
							.get(StandardPackage.Literals.STANDARD_POPULATION_MODEL__BIRTH_RATE)
							.getText()));
			model.setDeathRate(Double
					.parseDouble(map
							.get(StandardPackage.Literals.STANDARD_POPULATION_MODEL__DEATH_RATE)
							.getText()));
			model.setTimePeriod(Long
					.parseLong(map
							.get(StandardPackage.Literals.POPULATION_MODEL__TIME_PERIOD)
							.getText()));
		}

		if (populationModel instanceof SeasonalPopulationModel) {
			SeasonalPopulationModel model = (SeasonalPopulationModel) populationModel;

			model.setModulationAmplitude(Double
					.parseDouble(map
							.get(StandardPackage.Literals.SEASONAL_POPULATION_MODEL__MODULATION_AMPLITUDE)
							.getText()));
			model.setPhase(Double.parseDouble(map.get(
					StandardPackage.Literals.SEASONAL_POPULATION_MODEL__PHASE)
					.getText()));
		}

		if (populationModel instanceof MosquitoPopulationModel) {
			MosquitoPopulationModel model = (MosquitoPopulationModel) populationModel;

			model.setScalingFactor(Double
					.parseDouble(map
							.get(StandardPackage.Literals.MOSQUITO_POPULATION_MODEL__SCALING_FACTOR)
							.getText()));
			model.setTimePeriod(Long
					.parseLong(map
							.get(StandardPackage.Literals.POPULATION_MODEL__TIME_PERIOD)
							.getText()));
		}

		if (populationModel instanceof DemographicPopulationModel
				&& !(populationModel instanceof AgingPopulationModel)) {
			DemographicPopulationModel dpm = (DemographicPopulationModel) populationModel;

			// Add groups
			for (int i = 0; i < groupIDComposites.size(); ++i) {
				PopulationGroup newGroup = StandardFactory.eINSTANCE
						.createPopulationGroup();
				String id = groupIDComposites.get(i).getText();
				double fr = Double.parseDouble(groupFracComposites.get(i)
						.getText());
				newGroup.setIdentifier(id);
				newGroup.setFraction(fr);
				dpm.getPopulationGroups().add(newGroup);
			}
		}

		if (populationModel instanceof AgingPopulationModel) {
			AgingPopulationModel dpm = (AgingPopulationModel) populationModel;

			// Add groups
			for (int i = 0; i < groupIDComposites.size(); ++i) {
				AgeGroup newGroup = StandardFactory.eINSTANCE.createAgeGroup();

				newGroup.setIdentifier(groupIDComposites.get(i).getText());
				newGroup.setFraction(Double.parseDouble(groupFracComposites
						.get(i).getText()));
				newGroup.setFromAge(Integer.parseInt(groupFromAgeComposites
						.get(i).getText()));
				try {
					newGroup.setLimited(true);
					newGroup.setToAge(Integer.parseInt(groupToAgeComposites
							.get(i).getText()));
				} catch (NumberFormatException e) {
					newGroup.setLimited(false);
				}
				newGroup.setDeathFactor(Double
						.parseDouble(groupDeathFactorComposites.get(i)
								.getText()));
				dpm.getPopulationGroups().add(newGroup);
			}
		}
		
		if(populationModel instanceof ExternalDataSourcePopulationModel) {
			ExternalDataSourcePopulationModel model = (ExternalDataSourcePopulationModel) populationModel;

			Text txt = map.get(StandardPackage.Literals.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__DATA_PATH);
			if(txt!=null)
				model.setDataPath(txt.getText());
			
			Button button = booleanMap.get(StandardPackage.Literals.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__RESTART);
			if(button != null)
				model.setRestart(button.getSelection());
			
			txt = map.get(StandardPackage.Literals.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__BUFFER_SIZE);
			if(txt!=null)
				model.setBufferSize(Integer.parseInt(txt.getText().trim()));
			
		}
		
		if (populationModel instanceof SinModulatePopulationModel) {
			SinModulatePopulationModel model = (SinModulatePopulationModel) populationModel;

			model.setMaxBound(Double
					.parseDouble(map
							.get(StandardPackage.Literals.SIN_MODULATE_POPULATION_MODEL__MAX_BOUND)
							.getText()));
			model.setMinBound(Double
					.parseDouble(map
							.get(StandardPackage.Literals.SIN_MODULATE_POPULATION_MODEL__MIN_BOUND)
							.getText()));
			model.setPeriodSin(Double
					.parseDouble(map
							.get(StandardPackage.Literals.SIN_MODULATE_POPULATION_MODEL__PERIOD_SIN)
							.getText()));
			model.setPhaseShift(Double.parseDouble(map.get(
					StandardPackage.Literals.SIN_MODULATE_POPULATION_MODEL__PHASE_SHIFT)
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

		// Population Identifier
		text = map
				.get(StandardPackage.Literals.POPULATION_MODEL__POPULATION_IDENTIFIER);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr0"); //$NON-NLS-1$
				return false;
			}
		}

		// Rescaling factor
		text = map
				.get(StandardPackage.Literals.POPULATION_MODEL__INITIAL_RESCALING_FACTOR);
		if (text != null) {
			String val = text.getText();
			
			if (val == null || val.trim().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr27"); //$NON-NLS-1$
				return false;
			}
			double d=0;
			try {
				d = Double.parseDouble(val);
			} catch(Exception e) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr27"); //$NON-NLS-1$
				return false;
			}
			if(d<0) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr27"); //$NON-NLS-1$
				return false;
			}
		}

		
		// Background Mortality Rate
		text = map
				.get(StandardPackage.Literals.STANDARD_POPULATION_MODEL__DEATH_RATE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr4"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr5"); //$NON-NLS-1$
				return false;
			}
		}

		// Birth Rate
		text = map
				.get(StandardPackage.Literals.STANDARD_POPULATION_MODEL__BIRTH_RATE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr6"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr7"); //$NON-NLS-1$
				return false;
			}
		}

		// Time Period
		text = map
				.get(StandardPackage.Literals.POPULATION_MODEL__TIME_PERIOD);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr8"); //$NON-NLS-1$
				return false;
			} else if (!isValidLongValue(text.getText(), 0L)) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr9"); //$NON-NLS-1$
				return false;
			}
		}

		// Gain
		text = map
				.get(StandardPackage.Literals.STOCHASTIC_STANDARD_POPULATION_MODEL__GAIN);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr10"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr10"); //$NON-NLS-1$
				return false;
			}
		}

		// Modulation Amplitude
		text = map
				.get(StandardPackage.Literals.SEASONAL_POPULATION_MODEL__MODULATION_AMPLITUDE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr18"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText(), 0.0, 1.0)) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr18"); //$NON-NLS-1$
				return false;
			}
		}

		// Phase
		text = map
				.get(StandardPackage.Literals.SEASONAL_POPULATION_MODEL__PHASE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr19"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr19"); //$NON-NLS-1$
				return false;
			}
		}

		// Scaling Factor
		text = map
				.get(StandardPackage.Literals.MOSQUITO_POPULATION_MODEL__SCALING_FACTOR);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr20"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr20"); //$NON-NLS-1$
				return false;
			}
		}

		// Time Period
		text = map
				.get(StandardPackage.Literals.POPULATION_MODEL__TIME_PERIOD);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr21"); //$NON-NLS-1$
				return false;
			} else if (!isValidLongValue(text.getText())) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr21"); //$NON-NLS-1$
				return false;
			}
		}
		
				// max bound
				text = map
						.get(StandardPackage.Literals.SIN_MODULATE_POPULATION_MODEL__MAX_BOUND);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = PopulationModelWizardMessages
								.getString("NDizWizErr28"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = PopulationModelWizardMessages
								.getString("NDizWizErr30"); //$NON-NLS-1$
						return false;
					}
				}
				// min bound
				text = map
						.get(StandardPackage.Literals.MOSQUITO_POPULATION_MODEL__SCALING_FACTOR);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = PopulationModelWizardMessages
								.getString("NDizWizErr29"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = PopulationModelWizardMessages
								.getString("NDizWizErr30"); //$NON-NLS-1$
						return false;
					}
				}

				// Phase shift
				text = map
						.get(StandardPackage.Literals.SEASONAL_POPULATION_MODEL__PHASE);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = PopulationModelWizardMessages
								.getString("NDizWizErr19"); //$NON-NLS-1$
						return false;
					} else if (!isValidDoubleValue(text.getText())) {
						errorMessage = PopulationModelWizardMessages
								.getString("NDizWizErr19"); //$NON-NLS-1$
						return false;
					}
				}

				// Time Period
				text = map
						.get(StandardPackage.Literals.POPULATION_MODEL__TIME_PERIOD);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = PopulationModelWizardMessages
								.getString("NDizWizErr21"); //$NON-NLS-1$
						return false;
					} else if (!isValidLongValue(text.getText())) {
						errorMessage = PopulationModelWizardMessages
								.getString("NDizWizErr21"); //$NON-NLS-1$
						return false;
					}
				}


		// Check that the group fractions add up to < 1.0
		double sum = 0.0;
		for (Text t : groupFracComposites) {
			if (!isValidValue(t.getText(), 0)) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr13"); //$NON-NLS-1$
				return false;
			}
			sum += Double.parseDouble(t.getText());
		}
		if (sum > 1.0) {
			errorMessage = PopulationModelWizardMessages
					.getString("NDizWizErr11"); //$NON-NLS-1$
			return false;
		}

		// Check group IDs
		for (Text t : groupIDComposites) {
			if (t.getText().trim().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr12"); //$NON-NLS-1$
				return false;
			}
		}

		// Check toAge values
		int lastValue = -1;
		for (Text t : groupToAgeComposites) {
			if (t.getEditable()) {
				if (!isValidIntValue(t.getText(), 0)) {
					errorMessage = PopulationModelWizardMessages
							.getString("NDizWizErr22"); //$NON-NLS-1$
					return false;
				}
				if (Integer.parseInt(t.getText()) <= lastValue) {
					errorMessage = PopulationModelWizardMessages
							.getString("NDizWizErr22"); //$NON-NLS-1$
					return false;
				}
				lastValue = Integer.parseInt(t.getText());
			}
		}

		// Check death factor
		for (Text t : groupDeathFactorComposites) {
			if (!isValidValue(t.getText(), 0)) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr23"); //$NON-NLS-1$
				return false;
			}
		}

		text = map
				.get(StandardPackage.Literals.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__DATA_PATH);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr26"); //$NON-NLS-1$
				return false;
			}
		}

		text = map
				.get(StandardPackage.Literals.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__BUFFER_SIZE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr31"); //$NON-NLS-1$
				return false;
			}
			String intText = text.getText();
			try {
				int r = Integer.parseInt(intText);
				if(r<1) {
					errorMessage = PopulationModelWizardMessages
							.getString("NDizWizErr31"); //$NON-NLS-1$
					return false;
				}
			} catch(Exception e) {
				errorMessage = PopulationModelWizardMessages
						.getString("NDizWizErr31"); //$NON-NLS-1$
				return false;
			}
		}

		return true;
	} // validate

	private void updateGui() {
		pack();
		getParent().layout();
		getParent().getParent().getParent().layout();
	}

	private void updateTextFields() {
		Button hasMaxAgeButton = booleanMap
				.get(StandardPackage.Literals.AGING_POPULATION_MODEL__HAS_MAX_AGE);
		int n = groupToAgeComposites.size();

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (!groupFromAgeComposites.get(i).getText().equals("0")) {
					groupFromAgeComposites.get(i).setText("0");
				}
			} else {
				try {
					String age = (Integer.parseInt(groupToAgeComposites.get(
							i - 1).getText()) + 1)
							+ "";

					if (!groupFromAgeComposites.get(i).getText().equals(age)) {
						groupFromAgeComposites.get(i).setText(age);
					}
				} catch (NumberFormatException e) {
					// Ignore page will be invalidated
				}
			}

			if (i == n - 1 && !hasMaxAgeButton.getSelection()) {
				if (groupToAgeComposites.get(i).getEditable()) {
					groupToAgeComposites.get(i).setEditable(false);
				}

				if (!groupToAgeComposites.get(i).getText().equals(" ")) {
					groupToAgeComposites.get(i).setText(" ");
				}
			} else {
				if (!groupToAgeComposites.get(i).getEditable()) {
					groupToAgeComposites.get(i).setEditable(true);
				}

				if (groupToAgeComposites.get(i).getText().trim().equals("")) {
					try {
						int age = Integer.parseInt(groupFromAgeComposites
								.get(i).getText()) + DEFAULT_AGEGROUP_RANGE - 1;

						groupToAgeComposites.get(i).setText(age + "");
					} catch (NumberFormatException e) {
						// Ignore page will be invalidated
					}
				}
			}

			String id = populationID
					+ groupFromAgeComposites.get(i).getText().trim() + "-"
					+ groupToAgeComposites.get(i).getText().trim();

			if (!groupIDComposites.get(i).getText().equals(id)) {
				groupIDComposites.get(i).setText(id);
			}
		}
	}

	private void setFractionToEquilibrium() {
		double birthRate = Double.parseDouble(map.get(
				StandardPackage.Literals.STANDARD_POPULATION_MODEL__BIRTH_RATE)
				.getText());
		double deathRate = Double.parseDouble(map.get(
				StandardPackage.Literals.STANDARD_POPULATION_MODEL__DEATH_RATE)
				.getText());
		long timePeriod = Long
				.parseLong(map
						.get(StandardPackage.Literals.POPULATION_MODEL__TIME_PERIOD)
						.getText());

		int n = groupComposites.size();
		int[] ageRanges = new int[n];
		double[] deathRates = new double[n];
		double[] fractions = new double[n];

		for (int i = 0; i < n; i++) {
			try {
				ageRanges[i] = Integer.parseInt(groupToAgeComposites.get(i)
						.getText())
						- Integer.parseInt(groupFromAgeComposites.get(i)
								.getText()) + 1;
			} catch (NumberFormatException e) {
				ageRanges[i] = 0;
			}

			deathRates[i] = Double.parseDouble(groupDeathFactorComposites
					.get(i).getText()) * deathRate;
			fractions[i] = Double.parseDouble(groupFracComposites.get(i)
					.getText());
		}

		double years = (double) timePeriod / 31556952216.0;

		for (int step = 0; step < 1000000; step++) {
			double sum = 0.0;

			for (int i = 0; i < n; i++) {
				sum += fractions[i];
			}

			for (int i = n - 1; i >= 0; i--) {
				double arrivals = 0.0;
				double deparures = 0.0;

				if (i == 0) {
					arrivals = birthRate * sum;
				} else {
					arrivals = years / ageRanges[i - 1] * fractions[i - 1];
				}

				if (ageRanges[i] != 0) {
					deparures = (deathRates[i] + years / ageRanges[i])
							* fractions[i];
				} else {
					deparures = deathRates[i] * fractions[i];
				}

				fractions[i] += arrivals - deparures;
			}
		}

		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			sum += fractions[i];
		}

		for (int i = 0; i < n; i++) {
			groupFracComposites.get(i).setText((fractions[i] / sum) + "");
		}
	}

	private void setDeathRatesToEquilibrium() {
		double birthRate = Double.parseDouble(map.get(
				StandardPackage.Literals.STANDARD_POPULATION_MODEL__BIRTH_RATE)
				.getText());
		double deathRate = Double.parseDouble(map.get(
				StandardPackage.Literals.STANDARD_POPULATION_MODEL__DEATH_RATE)
				.getText());
		long timePeriod = Long
				.parseLong(map
						.get(StandardPackage.Literals.POPULATION_MODEL__TIME_PERIOD)
						.getText());

		int n = groupComposites.size();
		int[] ageRanges = new int[n];
		double[] fractions = new double[n];

		for (int i = 0; i < n; i++) {
			try {
				ageRanges[i] = Integer.parseInt(groupToAgeComposites.get(i)
						.getText())
						- Integer.parseInt(groupFromAgeComposites.get(i)
								.getText()) + 1;
			} catch (NumberFormatException e) {
				ageRanges[i] = 0;
			}

			fractions[i] = Double.parseDouble(groupFracComposites.get(i)
					.getText());
		}

		double years = (double) timePeriod / 31556952216.0;
		double sum = 0.0;
		double[] deathFactors = new double[n];

		for (int i = 0; i < n; i++) {
			sum += fractions[i];
		}

		for (int i = 0; i < n; i++) {
			double desiredDeaths = 0.0;

			if (i == 0) {
				desiredDeaths = birthRate * sum - years / ageRanges[i]
						* fractions[i];
			} else if (ageRanges[i] != 0) {
				desiredDeaths = years / ageRanges[i - 1] * fractions[i - 1]
						- years / ageRanges[i] * fractions[i];
			} else {
				desiredDeaths = years / ageRanges[i - 1] * fractions[i - 1];
			}

			deathFactors[i] = desiredDeaths / fractions[i] / deathRate;
		}

		for (int i = 0; i < n; i++) {
			groupDeathFactorComposites.get(i).setText(deathFactors[i] + "");
		}
	}
} // StandardPropertyModelPropertyEditor
