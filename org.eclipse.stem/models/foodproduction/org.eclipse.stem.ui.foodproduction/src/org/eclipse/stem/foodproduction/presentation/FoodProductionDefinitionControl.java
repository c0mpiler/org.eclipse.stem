/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/
package org.eclipse.stem.foodproduction.presentation;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.foodproduction.Activator;
import org.eclipse.stem.foodproduction.Constants;
import org.eclipse.stem.foodproduction.FoodTransformer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;

/**
 * This class represents the SWT control for defining a disease.
 */
public class FoodProductionDefinitionControl extends Composite {

	private static FoodTransformer[] foodTransformers = null;

	private final Combo combo;

	private final FoodProductionPropertyComposite foodProductionPropertyComposite;
	
	/**
	 * the DiseaseDefinitionControl combo must be able to update the NewDiseaseWizard
	 */
	private NewFoodTransformerWizard newFoodTransformerWizard = null;

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 * @param ndw a NewDiseaseWizard
	 */
	public FoodProductionDefinitionControl(final Composite parent, final int style,
			ModifyListener projectValidator, IProject project, NewFoodTransformerWizard nfpw) {
		super(parent, style);
		newFoodTransformerWizard = nfpw;
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		setLayout(gridLayout);

		final Label foodTransformerLabel = new Label(this, SWT.NONE);
		final GridData gd_diseaseModelLabel = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gd_diseaseModelLabel.widthHint = 100;
		foodTransformerLabel.setLayoutData(gd_diseaseModelLabel);
		foodTransformerLabel.setText(FoodProductionMessages.getString("FPC.0")); //$NON-NLS-1$

		combo = new Combo(this, SWT.READ_ONLY);
		combo.setTextLimit(30);
		final GridData gd_combo = new GridData(SWT.FILL, SWT.CENTER, true,
				false);
		gd_combo.widthHint = 303;
		combo.setLayoutData(gd_combo);

		combo.setToolTipText(FoodProductionMessages.getString("FPC.1")); //$NON-NLS-1$
		// Initialize the list of disease models available
		combo.setItems(getFoodTransformerNames(getFoodTransformers()));
		combo.select(0);
		combo.addModifyListener(projectValidator);

		Label separator = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData sepData = new GridData(SWT.FILL, SWT.TOP, true, false);
		sepData.horizontalSpan = 2;
		separator.setLayoutData(sepData);

		
		foodProductionPropertyComposite = new FoodProductionPropertyComposite(this,
				SWT.NONE, getFoodTransformers(), projectValidator, project);
		final GridData gd_diseaseModelPropertyControl = new GridData(SWT.FILL,
				SWT.CENTER, true, false, 2, 1);
		foodProductionPropertyComposite
				.setLayoutData(gd_diseaseModelPropertyControl);

		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				foodProductionPropertyComposite
						.displayFoodTransformer(getFoodTransformers()[combo
								.getSelectionIndex()]);
				
				// update the dublin core from the plugin defaults for the
				// newly selected disease model;
				newFoodTransformerWizard.newDublinCorePage.updateDublinCorePage(getSelectedFoodTransformer().getDublinCore());
				
				// layout();
			} // widgetSelected

		});
		//final DiseaseDefinitionControl self = this;
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.stem.doc.newdisease_contextid");
	}// DiseaseDefinitionControl

	
	
	/**
	 * @return an array of the {@link DiseaseModels}s defined in the system.
	 */
	private FoodTransformer[] getFoodTransformers() {
		if (foodTransformers == null) {
			final IExtensionRegistry registry = Platform.getExtensionRegistry();
			final IConfigurationElement[] fpConfigElements = registry
					.getConfigurationElementsFor(Constants.ID_FOOD_TRANSFORMER_EXTENSION_POINT);

			final List<FoodTransformer> temp = new ArrayList<FoodTransformer>();


			for (int i = 0; i < fpConfigElements.length; i++) {
				final IConfigurationElement element = fpConfigElements[i];
				FoodTransformer foodTransformer = null;
				// Does the element specify the class of the disease model?
				if (element.getName().equals(Constants.FOOD_TRANSFORMER_MODEL_ELEMENT)) {
					// Yes
					try {
						foodTransformer = (FoodTransformer) element.createExecutableExtension("class");
						temp.add(foodTransformer); //$NON-NLS-1$
					} catch (final CoreException e) {
						Activator.logError(
								FoodProductionMessages.getString("FPC.3"), e); //$NON-NLS-1$
					}
				} // if
			} // for each configuration element
			foodTransformers = temp.toArray(new FoodTransformer[] {});
		} // if foodProducer not created
		
		
		
		// now update the dublin cores with the default plugin.xml info
		for(FoodTransformer foodTransformer: foodTransformers) {
			if(foodTransformer != null) {
				// JHK getting DC info from the pluggin.xml
				DublinCore dublinCore = Activator.getPluginDublinCore(foodTransformer);
				if(dublinCore != null) {
					foodTransformer.setDublinCore(dublinCore);
				}
			}
		}

		return foodTransformers;
	} // getFoodProducers

	/**
	 * @return the names of the disease models
	 */
	private String[] getFoodTransformerNames(final FoodTransformer[] foodTransformers) {
		final String[] retValue = new String[foodTransformers.length];
		for (int i = 0; i < foodTransformers.length; i++) {
			String name = foodTransformers[i].getDublinCore().getTitle();
			// Was a name specified?
			if ((name == null) || name.equals("")) { //$NON-NLS-1$
				// No
				name = foodTransformers[i].getClass().getSimpleName();
			} // if

			retValue[i] = name;
		} // for i
		return retValue;
	} // getFoodProducerNames

	/**
	 * 
	 * @return
	 */
	FoodTransformer getSelectedFoodTransformer() {
		final FoodTransformer retValue = EcoreUtil.copy(getFoodTransformers()[combo.getSelectionIndex()]);
		foodProductionPropertyComposite.populateFoodTransformer(retValue);
		return retValue;
	} // getSelectedDiseaseModel

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	/**
	 * @return <code>true</code> if the contents of the control are valid,
	 *         <code>false</code> otherwise.
	 */
	public boolean validate() {
		return foodProductionPropertyComposite.validate();
	} // validate

	/**
	 * @return the error message set by {@link #validate()}
	 */
	public String getErrorMessage() {
		return foodProductionPropertyComposite.getErrorMessage();
	}

} // FoodProducerDefinitionControl
