/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut f�r Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut f�r Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.ui.wizards;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class NewExternalDataSourceDiseaseInitializerPage extends
		NewIdentifiablePage {

	/**
	 * This is the {@link Identifiable} for which the page is creating a
	 * {@link org.eclipse.stem.core.modifier.Modifier}.
	 */
	private DiseaseModel target;

	private Composite outerComposite;

	private Combo populationBox;

	private Text pathText;

	private Text rowText;

	private Button rescaleYesButton;

	private Button rescaleNoButton;

	/**
	 * Constructor
	 * 
	 * @param identifiable
	 *            the {@link Identifiable} for which the page is creating a
	 *            {@link org.eclipse.stem.core.modifier.Modifier}.
	 */
	protected NewExternalDataSourceDiseaseInitializerPage(
			final DiseaseModel target) {
		super(DiseaseWizardMessages
				.getString("NStandardDiseaseInitializerWiz.page_title"));
		setTitle(DiseaseWizardMessages
				.getString("NStandardDiseaseInitializerWiz.page_title"));
		setDescription(DiseaseWizardMessages
				.getString("NStandardDiseaseInitializerWiz.page_description"));
		this.target = target;
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard.NewIdentifiablePage#createSpecificComposite(org.eclipse.swt.widgets.Composite)
	 */
	@SuppressWarnings("boxing")
	@Override
	protected Composite createSpecificComposite(final Composite parent) {
		outerComposite = new Composite(parent, SWT.NONE);
		outerComposite.setLayout(new GridLayout(3, true));

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

		Label noPopulationLabel = new Label(outerComposite, SWT.NONE);
		noPopulationLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL,
				true, false));

		Label pathLabel = new Label(outerComposite, SWT.NONE);
		pathLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, true,
				false));
		pathLabel.setText(DiseaseWizardMessages
				.getString("NInitializerWiz.path"));

		pathText = new Text(outerComposite, SWT.BORDER | SWT.TRAIL);
		pathText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		pathText.addModifyListener(projectValidator);

		final Button dirChooserButton = new Button(outerComposite, SWT.NONE);
		final Shell shell = getShell();
		dirChooserButton.setText(Messages.getString("dirChooserButtonText"));
		dirChooserButton.setToolTipText(Messages
				.getString("dirChooserButtonTooltipText"));
		dirChooserButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				DirectoryDialog dd = new DirectoryDialog(shell, SWT.OPEN);
				IPath rootPath = new Path(ResourcesPlugin.getWorkspace()
						.getRoot().getLocation().toFile().toString());

				dd.setText(Messages.getString("dirChooserDialogTitle"));
				dd.setFilterPath(rootPath.toString());

				String pathName = dd.open();

				if (pathName != null) {
					IPath path = new Path(pathName);

					if (rootPath.isPrefixOf(path)) {
						String relPath = path.makeRelativeTo(rootPath)
								.toString();

						if (relPath.isEmpty()) {
							relPath = "/";
						}

						pathText.setText(URI.createPlatformResourceURI(relPath,
								false).toString());
					} else {
						pathText.setText(pathName);
					}
				}
			}
		});

		Label rowLabel = new Label(outerComposite, SWT.NONE);
		rowLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, true,
				false));
		rowLabel.setText(DiseaseWizardMessages.getString("NInitializerWiz.row"));

		rowText = new Text(outerComposite, SWT.BORDER | SWT.TRAIL);
		rowText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		rowText.addModifyListener(projectValidator);

		Label noRowLabel = new Label(outerComposite, SWT.NONE);
		noRowLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, true,
				false));

		Label rescaleLabel = new Label(outerComposite, SWT.NONE);
		rescaleLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, true,
				false));
		rescaleLabel.setText(DiseaseWizardMessages
				.getString("NInitializerWiz.rescale"));
		rescaleLabel.setToolTipText(DiseaseWizardMessages
				.getString("NInitializerWiz.rescale.tooltip"));

		Composite rescaleComposite = new Composite(outerComposite, SWT.NONE);
		rescaleComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false));
		rescaleComposite.setLayout(new FillLayout(SWT.HORIZONTAL));

		rescaleNoButton = new Button(rescaleComposite, SWT.RADIO);
		rescaleNoButton.setText(Messages.getString("NO"));
		rescaleYesButton = new Button(rescaleComposite, SWT.RADIO);
		rescaleYesButton.setText(Messages.getString("YES"));

		if ((Boolean) StandardPackage.eINSTANCE
				.getExternalDataSourceDiseaseInitializer_DoRescaling()
				.getDefaultValue()) {
			rescaleYesButton.setSelection(true);
		} else {
			rescaleNoButton.setSelection(true);
		}

		Label noRescaleLabel = new Label(outerComposite, SWT.NONE);
		noRescaleLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL,
				true, false));

		return outerComposite;
	}

	protected ExternalDataSourceDiseaseInitializer getExternalDataSourceDiseaseInitializer() {
		ExternalDataSourceDiseaseInitializer init = StandardFactory.eINSTANCE
				.createExternalDataSourceDiseaseInitializer();

		init.setDiseaseName(target.getDiseaseName());
		init.setPopulationIdentifier(populationBox.getText());
		init.setDataPath(pathText.getText());
		init.setRow(Integer.parseInt(rowText.getText()));
		init.setDoRescaling(rescaleYesButton.getSelection());

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

		if (pathText.getText().isEmpty()) {
			setErrorMessage(DiseaseWizardMessages
					.getString("NInitializerWiz.path.missing"));
			return false;
		}

		if (rowText.getText().isEmpty()) {
			setErrorMessage(DiseaseWizardMessages
					.getString("NInitializerWiz.row.missing"));
			return false;
		}

		return true;
	}
}
