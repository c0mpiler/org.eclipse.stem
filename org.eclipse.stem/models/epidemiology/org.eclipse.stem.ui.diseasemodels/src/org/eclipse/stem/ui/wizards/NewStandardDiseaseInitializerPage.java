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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl;
import org.eclipse.stem.ui.widgets.LocationPickerDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewStandardDiseaseInitializerPage extends NewIdentifiablePage {

	/**
	 * This is the {@link Identifiable} for which the page is creating a
	 * {@link org.eclipse.stem.core.modifier.Modifier}.
	 */
	private DiseaseModel target;

	private Composite outerComposite;

	private Combo populationBox;

	private Composite valuesComposite;

	private EList<Label> valueLabels;

	private EList<Text> valueTexts;

	private Button useFractionsButton;

	private Text locationText;

	private URI locationURI;

	/**
	 * Constructor
	 * 
	 * @param identifiable
	 *            the {@link Identifiable} for which the page is creating a
	 *            {@link org.eclipse.stem.core.modifier.Modifier}.
	 */
	protected NewStandardDiseaseInitializerPage(final DiseaseModel target) {
		super(DiseaseWizardMessages.getString("NStandardDiseaseInitializerWiz.page_title"));
		setTitle(DiseaseWizardMessages.getString("NStandardDiseaseInitializerWiz.page_title"));
		setDescription(DiseaseWizardMessages
				.getString("NStandardDiseaseInitializerWiz.page_description"));
		this.target = target;
		this.valueLabels = new BasicEList<Label>();
		this.valueTexts = new BasicEList<Text>();
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard.NewIdentifiablePage#createSpecificComposite(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Composite createSpecificComposite(final Composite parent) {
		outerComposite = new Composite(parent, SWT.NONE);
		outerComposite.setLayout(new GridLayout(2, true));

		Label populationLabel = new Label(outerComposite, SWT.NONE);
		populationLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL,
				true, false));
		populationLabel.setText(DiseaseWizardMessages
				.getString("NInitializerWiz.population"));

		populationBox = new Combo(outerComposite, SWT.READ_ONLY);
		populationBox.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false));
		EList<String> populations = target.getAllLabelIdentifiers();
		for (String p : populations) {
			populationBox.add(p);
		}
		populationBox.addModifyListener(projectValidator);
		populationBox.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				removeInitializerFields(outerComposite);
				addInitializerFields(outerComposite);
			}
		});

		valuesComposite = new Composite(outerComposite, SWT.NONE);
		valuesComposite.setLayout(new GridLayout(2, true));
		valuesComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 2, 1));

		Label percentageLabel = new Label(outerComposite, SWT.NONE);
		percentageLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL,
				true, false));
		percentageLabel.setText(DiseaseWizardMessages
				.getString("NInitializerWiz.valueType"));

		Composite radioComposite = new Composite(outerComposite, SWT.BORDER);
		radioComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
		radioComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false));
		Button useAbsoluteButton = new Button(radioComposite, SWT.RADIO);
		useAbsoluteButton.setText(DiseaseWizardMessages
				.getString("NInitializerWiz.absolute"));//$NON-NLS-1$
		useAbsoluteButton.setSelection(true);
		useFractionsButton = new Button(radioComposite, SWT.RADIO);
		useFractionsButton.setText(DiseaseWizardMessages
				.getString("NInitializerWiz.fractions"));//$NON-NLS-1$
		useFractionsButton.setSelection(false);
		useFractionsButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				setValuesToDefault();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		Button locationButton = new Button(outerComposite, SWT.PUSH);
		locationButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL,
				true, false));
		locationButton.setText(DiseaseWizardMessages
				.getString("NInitializerWiz.location"));
		locationButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent arg0) {
				LocationPickerDialog lpDialog = new LocationPickerDialog(
						NewStandardDiseaseInitializerPage.this.getShell(), SWT.NONE,
						DiseaseWizardMessages.getString("NInfWizPickLocTitle"),
						locationText.getText(), NewStandardDiseaseInitializerPage.this
								.getSelectedProject());
				Object[] ret = lpDialog.open();
				if (ret != null) {
					locationText.setText((String) ret[0]);
					locationURI = (URI) ret[1];
				}
			}

			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		locationText = new Text(outerComposite, SWT.BORDER | SWT.TRAIL);
		locationText
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		locationText.setEditable(false);
		locationText.addModifyListener(projectValidator);

		return outerComposite;
	}

	private void addInitializerFields(Composite parent) {
		String population = populationBox.getText();
		EList<EAttribute> attributes = target
				.createDiseaseModelLabelValue(population).eClass()
				.getEAllAttributes();

		DiseaseModelImpl diseaseImpl = (DiseaseModelImpl)target;
		
		for (EAttribute a : attributes) {
			if (a.isChangeable() && !DiseaseModelImpl.isDiseaseDeaths(a)
					&& !DiseaseModelImpl.isIncidence(a)) {
				Label label = new Label(valuesComposite, SWT.NONE);
				label.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, true,
						false));
				label.setText(a.getName());
				valueLabels.add(label);

				Text text = new Text(valuesComposite, SWT.BORDER | SWT.TRAIL);
				text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
				valueTexts.add(text);

				if (a.getName().equals("s")) {
					text.setEditable(false);
				} else {
					text.addModifyListener(new ModifyListener() {

						public void modifyText(ModifyEvent e) {
							if (useFractionsButton.getSelection()) {
								double v = 1.0 - addFractions();

								for (Text t : valueTexts) {
									if (!t.getEditable()) {
										t.setText(v + "");
										break;
									}
								}
							}
						}
					});
				}

				setValuesToDefault();
			}
		}

		for (Text text : valueTexts) {
			text.addModifyListener(projectValidator);
		}

		updateGUI();
	}

	private void removeInitializerFields(Composite parent) {
		for (Label l : valueLabels) {
			l.dispose();
		}

		for (Text t : valueTexts) {
			t.dispose();
		}

		valueLabels.clear();
		valueTexts.clear();
		updateGUI();
	}

	/**
	 * 
	 * @return
	 */
	protected StandardDiseaseInitializer getStandardDiseaseInitializer() {
		StandardDiseaseInitializer init = StandardFactory.eINSTANCE.createStandardDiseaseInitializer();

		init.setDiseaseName(target.getDiseaseName());
		init.setTargetISOKey(locationText.getText());
		init.setTargetURI(locationURI);
		init.setPopulationIdentifier(populationBox.getText());
		init.setUseFractions(useFractionsButton.getSelection());
		init.getCompartments().clear();
		init.getCompartmentValues().clear();

		for (Label l : valueLabels) {
			init.getCompartments().add(l.getText());
		}

		for (Text t : valueTexts) {
			if (!useFractionsButton.getSelection() && !t.getEditable()) {
				init.getCompartmentValues().add(Double.valueOf(0.0));
			} else {
				init.getCompartmentValues().add(Double.valueOf(Double.parseDouble(t.getText())));
			}
		}

		return init;
	}

	/**
	 * see org.eclipse.stem.ui.wizards.NewIdentifiablePage#validatePage()
	 */
	@Override
	public boolean validatePage() {
		if (!super.validatePage()) {
			return false;
		}

		if (populationBox.getText().isEmpty()) {
			setErrorMessage(DiseaseWizardMessages
					.getString("NInitializerWiz.population.missing"));
			return false;
		}

		if (!validateValues()) {
			setErrorMessage(DiseaseWizardMessages
					.getString("NInitializerWiz.values.invalid"));
			return false;
		}		

		return true;
	}

	private double addFractions() {
		double sum = 0.0;

		for (Text t : valueTexts) {
			double v = 0.0;

			if (!t.getEditable()) {
				continue;
			}

			try {
				v = Double.parseDouble(t.getText());
			} catch (NumberFormatException e) {
				return -1.0;
			}

			if (v < 0.0 || v > 1.0) {
				return -1.0;
			}

			sum += v;
		}

		if (sum < 0.0 || sum > 1.0) {
			return -1.0;
		}

		return sum;
	}

	private void setValuesToDefault() {
		for (Text t : valueTexts) {
			if (t.getEditable()) {
				t.setText("0.0");
			} else {
				if (useFractionsButton.getSelection()) {
					t.setText("1.0");
				} else {
					t.setText("");
				}
			}
		}
	}

	private boolean validateValues() {
		if (useFractionsButton.getSelection()) {
			return addFractions() != -1.0;
		} else {
			for (Text t : valueTexts) {
				if (t.getEditable()) {
					double v = 0.0;

					try {
						v = Double.parseDouble(t.getText());
					} catch (NumberFormatException e) {
						return false;
					}

					if (v < 0.0) {
						return false;
					}
				}
			}

			return true;
		}
	}

	private void updateGUI() {
		outerComposite.getParent().pack();
		outerComposite.getParent().getParent().layout();
		outerComposite.getParent().getParent().getParent().getParent().layout();
	}
}
