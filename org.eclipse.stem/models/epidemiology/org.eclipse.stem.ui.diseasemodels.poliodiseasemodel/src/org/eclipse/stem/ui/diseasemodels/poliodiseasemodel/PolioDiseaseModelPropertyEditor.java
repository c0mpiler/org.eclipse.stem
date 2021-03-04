package org.eclipse.stem.ui.diseasemodels.poliodiseasemodel;

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

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 *
 */
public class PolioDiseaseModelPropertyEditor extends
		StandardDiseaseModelPropertyEditor {

	/**
	 * @param parent
	 * @param style
	 * @param diseaseModel
	 * @param projectValidator
	 */
	public PolioDiseaseModelPropertyEditor(Composite parent, int style,
			DiseaseModel diseaseModel, ModifyListener projectValidator,
			IProject project) {
		super(parent, style, diseaseModel, projectValidator, project);
	} // ExampleDiseaseModelPropertyEditor

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#populate(org.eclipse.stem.diseasemodels.standard.DiseaseModel)
	 */
	@Override
	public void populate(DiseaseModel diseaseModel) {
		super.populate(diseaseModel);

		for (EAttribute attribute : diseaseModel.eClass().getEAllAttributes()) {
			if (attribute.eContainer().eContainer() == PolioPackage.eINSTANCE) {
				String value = map.get(attribute).getText();

				if (attribute.getEType() == EcorePackage.Literals.ESTRING) {
					diseaseModel.eSet(attribute, value);
				} else if (attribute.getEType() == EcorePackage.Literals.EDOUBLE) {
					diseaseModel.eSet(attribute, Double.parseDouble(value));
				}
			}
		}
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#validate()
	 */
	@Override
	public boolean validate() {
		boolean retValue = super.validate();

		// EfficacyVaccine
		if (retValue) {
			// Yes
			final Text text = map
					.get(PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage =PolioDiseaseWizardMessages.getString("OPVWizErr1"); //$NON-NLS-1$
			} // if
			else {
				// No
				// Is it a valid value?
				retValue = isValidDoubleValue(text.getText(), 0.0, 1.0);
				if (!retValue) {
					// No
					errorMessage = PolioDiseaseWizardMessages
							.getString("OPVWizErr2"); //$NON-NLS-1$
				} 
			}
		} 

		// ReversionRate
		if (retValue) {
			// Yes
			final Text text = map
					.get(PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = PolioDiseaseWizardMessages.getString("OPVWizErr3"); //$NON-NLS-1$
			} // if
			else {
				// No
				// Is it a valid value?
				retValue = isValidDoubleValue(text.getText(), 0.0, 1.0);
				if (!retValue) {
					// No
					errorMessage = PolioDiseaseWizardMessages
							.getString("OPVWizErr4"); //$NON-NLS-1$
				} 
			}
		} 

		// PartialSusceptibilityVaccine
		if (retValue) {
			// Yes
			final Text text = map
					.get(PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = PolioDiseaseWizardMessages.getString("OPVWizErr5"); //$NON-NLS-1$
			} // if
			else {
				// No
				// Is it a valid value?
				retValue = isValidDoubleValue(text.getText(), 0.0, 1.0);
				if (!retValue) {
					// No
					errorMessage = PolioDiseaseWizardMessages
							.getString("OPVWizErr6"); //$NON-NLS-1$
				}
			}
		} 

		// TransRateVaccine
		if (retValue) {
			// Yes
			final Text text = map
					.get(PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = PolioDiseaseWizardMessages.getString("OPVWizErr7"); //$NON-NLS-1$
			} // if
			else {
				// No
				// Is it a valid value?
				retValue = isValidDoubleValue(text.getText(), 0.0, 500.0);
				if (!retValue) {
					// No
					errorMessage = PolioDiseaseWizardMessages
							.getString("OPVWizErr8"); //$NON-NLS-1$
				} 
			}
		} 

		// IncubRateVaccine
		if (retValue) {
			// Yes
			final Text text = map
					.get(PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = PolioDiseaseWizardMessages.getString("OPVWizErr9"); //$NON-NLS-1$
			} // if
			else {
				// No
				// Is it a valid value?
				retValue = isValidDoubleValue(text.getText(), 0.0, 500);
				if (!retValue) {
					// No
					errorMessage = PolioDiseaseWizardMessages
							.getString("OPVWizErr10"); //$NON-NLS-1$
				} 
			}
		} 

		// InfectRecoveryRateVaccine
		if (retValue) {
			// Yes
			final Text text = map
					.get(PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = PolioDiseaseWizardMessages.getString("OPVWizErr11"); //$NON-NLS-1$
			} // if
			else {
				// No
				// Is it a valid value?
				retValue = isValidDoubleValue(text.getText(), 0.0, 500);
				if (!retValue) {
					// No
					errorMessage = PolioDiseaseWizardMessages
							.getString("OPVWizErr12"); //$NON-NLS-1$
				}
			}
		}

		// ParalyticFractionVaccine
		if (retValue) {
			// Yes
			final Text text = map
					.get(PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = PolioDiseaseWizardMessages.getString("OPVWizErr13"); //$NON-NLS-1$
			} // if
			else {
				// No
				// Is it a valid value?
				retValue = isValidDoubleValue(text.getText(), 0.0, 1.0);
				if (!retValue) {
					// No
					errorMessage = PolioDiseaseWizardMessages
							.getString("OPVWizErr14"); //$NON-NLS-1$
				} 
			}
		} 

		// ParalyticFractionWild
		if (retValue) {
			// Yes
			final Text text = map
					.get(PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = PolioDiseaseWizardMessages.getString("OPVWizErr15"); //$NON-NLS-1$
			} // if
			else {
				// No
				// Is it a valid value?
				retValue = isValidDoubleValue(text.getText(), 0.0, 1.0);
				if (!retValue) {
					// No
					errorMessage = PolioDiseaseWizardMessages
							.getString("OPVWizErr16"); //$NON-NLS-1$
				} 
			}
		} 

		

		return retValue;
	}

} // ExampleDiseaseModelPropertyEditor
