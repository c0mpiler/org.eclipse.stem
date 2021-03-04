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
package org.eclipse.stem.diseasemodels.vector.presentation;

import java.util.MissingResourceException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.vector.DengueModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class DengueModelPropertyEditor extends
		AbstractDengueModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public DengueModelPropertyEditor(Composite parent, int style,
			DiseaseModel model, ModifyListener projectValidator,
			IProject project) {
		super(parent, style, model, projectValidator, project);
	}

	/**
	 * @generated
	 */
	@Override
	public void populate(DiseaseModel object) {
		super.populate(object);

		DengueModel model = (DengueModel)object;
 		// Set value for Biting Rate SV (Double)
		try {
			Double bitingRateSVValue = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__BITING_RATE_SV).getText());
			model.setBitingRateSV(bitingRateSVValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Biting Rate IV (Double)
		try {
			Double bitingRateIVValue = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__BITING_RATE_IV).getText());
			model.setBitingRateIV(bitingRateIVValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Infectivity1 (Double)
		try {
			Double hostInfectivity1Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY1).getText());
			model.setHostInfectivity1(hostInfectivity1Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Infectivity2 (Double)
		try {
			Double hostInfectivity2Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY2).getText());
			model.setHostInfectivity2(hostInfectivity2Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Infectivity3 (Double)
		try {
			Double hostInfectivity3Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY3).getText());
			model.setHostInfectivity3(hostInfectivity3Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Infectivity4 (Double)
		try {
			Double hostInfectivity4Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY4).getText());
			model.setHostInfectivity4(hostInfectivity4Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Incubation Rate1 (Double)
		try {
			Double hostPrimaryIncubationRate1Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1).getText());
			model.setHostPrimaryIncubationRate1(hostPrimaryIncubationRate1Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Incubation Rate2 (Double)
		try {
			Double hostPrimaryIncubationRate2Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2).getText());
			model.setHostPrimaryIncubationRate2(hostPrimaryIncubationRate2Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Incubation Rate3 (Double)
		try {
			Double hostPrimaryIncubationRate3Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3).getText());
			model.setHostPrimaryIncubationRate3(hostPrimaryIncubationRate3Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Incubation Rate4 (Double)
		try {
			Double hostPrimaryIncubationRate4Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4).getText());
			model.setHostPrimaryIncubationRate4(hostPrimaryIncubationRate4Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Recovery Rate1 (Double)
		try {
			Double hostPrimaryRecoveryRate1Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1).getText());
			model.setHostPrimaryRecoveryRate1(hostPrimaryRecoveryRate1Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Recovery Rate2 (Double)
		try {
			Double hostPrimaryRecoveryRate2Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2).getText());
			model.setHostPrimaryRecoveryRate2(hostPrimaryRecoveryRate2Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Recovery Rate3 (Double)
		try {
			Double hostPrimaryRecoveryRate3Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3).getText());
			model.setHostPrimaryRecoveryRate3(hostPrimaryRecoveryRate3Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Recovery Rate4 (Double)
		try {
			Double hostPrimaryRecoveryRate4Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4).getText());
			model.setHostPrimaryRecoveryRate4(hostPrimaryRecoveryRate4Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Immunity Loss Rate1 (Double)
		try {
			Double hostPrimaryImmunityLossRate1Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1).getText());
			model.setHostPrimaryImmunityLossRate1(hostPrimaryImmunityLossRate1Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Immunity Loss Rate2 (Double)
		try {
			Double hostPrimaryImmunityLossRate2Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2).getText());
			model.setHostPrimaryImmunityLossRate2(hostPrimaryImmunityLossRate2Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Immunity Loss Rate3 (Double)
		try {
			Double hostPrimaryImmunityLossRate3Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3).getText());
			model.setHostPrimaryImmunityLossRate3(hostPrimaryImmunityLossRate3Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Immunity Loss Rate4 (Double)
		try {
			Double hostPrimaryImmunityLossRate4Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4).getText());
			model.setHostPrimaryImmunityLossRate4(hostPrimaryImmunityLossRate4Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Disease Death Rate1 (Double)
		try {
			Double hostPrimaryDiseaseDeathRate1Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1).getText());
			model.setHostPrimaryDiseaseDeathRate1(hostPrimaryDiseaseDeathRate1Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Disease Death Rate2 (Double)
		try {
			Double hostPrimaryDiseaseDeathRate2Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2).getText());
			model.setHostPrimaryDiseaseDeathRate2(hostPrimaryDiseaseDeathRate2Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Disease Death Rate3 (Double)
		try {
			Double hostPrimaryDiseaseDeathRate3Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3).getText());
			model.setHostPrimaryDiseaseDeathRate3(hostPrimaryDiseaseDeathRate3Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Primary Disease Death Rate4 (Double)
		try {
			Double hostPrimaryDiseaseDeathRate4Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4).getText());
			model.setHostPrimaryDiseaseDeathRate4(hostPrimaryDiseaseDeathRate4Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE12 (Double)
		try {
			Double hostADE12Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE12).getText());
			model.setHostADE12(hostADE12Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE13 (Double)
		try {
			Double hostADE13Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE13).getText());
			model.setHostADE13(hostADE13Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE14 (Double)
		try {
			Double hostADE14Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE14).getText());
			model.setHostADE14(hostADE14Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE21 (Double)
		try {
			Double hostADE21Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE21).getText());
			model.setHostADE21(hostADE21Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE23 (Double)
		try {
			Double hostADE23Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE23).getText());
			model.setHostADE23(hostADE23Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE24 (Double)
		try {
			Double hostADE24Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE24).getText());
			model.setHostADE24(hostADE24Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE31 (Double)
		try {
			Double hostADE31Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE31).getText());
			model.setHostADE31(hostADE31Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE32 (Double)
		try {
			Double hostADE32Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE32).getText());
			model.setHostADE32(hostADE32Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE34 (Double)
		try {
			Double hostADE34Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE34).getText());
			model.setHostADE34(hostADE34Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE41 (Double)
		try {
			Double hostADE41Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE41).getText());
			model.setHostADE41(hostADE41Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE42 (Double)
		try {
			Double hostADE42Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE42).getText());
			model.setHostADE42(hostADE42Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host ADE43 (Double)
		try {
			Double hostADE43Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE43).getText());
			model.setHostADE43(hostADE43Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate12 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate12Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12).getText());
			model.setHostSecondaryDiseaseDeathRate12(hostSecondaryDiseaseDeathRate12Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate13 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate13Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13).getText());
			model.setHostSecondaryDiseaseDeathRate13(hostSecondaryDiseaseDeathRate13Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate14 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate14Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14).getText());
			model.setHostSecondaryDiseaseDeathRate14(hostSecondaryDiseaseDeathRate14Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate21 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate21Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21).getText());
			model.setHostSecondaryDiseaseDeathRate21(hostSecondaryDiseaseDeathRate21Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate23 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate23Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23).getText());
			model.setHostSecondaryDiseaseDeathRate23(hostSecondaryDiseaseDeathRate23Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate24 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate24Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24).getText());
			model.setHostSecondaryDiseaseDeathRate24(hostSecondaryDiseaseDeathRate24Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate31 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate31Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31).getText());
			model.setHostSecondaryDiseaseDeathRate31(hostSecondaryDiseaseDeathRate31Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate32 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate32Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32).getText());
			model.setHostSecondaryDiseaseDeathRate32(hostSecondaryDiseaseDeathRate32Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate34 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate34Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34).getText());
			model.setHostSecondaryDiseaseDeathRate34(hostSecondaryDiseaseDeathRate34Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate41 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate41Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41).getText());
			model.setHostSecondaryDiseaseDeathRate41(hostSecondaryDiseaseDeathRate41Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate42 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate42Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42).getText());
			model.setHostSecondaryDiseaseDeathRate42(hostSecondaryDiseaseDeathRate42Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Disease Death Rate43 (Double)
		try {
			Double hostSecondaryDiseaseDeathRate43Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43).getText());
			model.setHostSecondaryDiseaseDeathRate43(hostSecondaryDiseaseDeathRate43Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate12 (Double)
		try {
			Double hostSecondaryRecoveryRate12Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12).getText());
			model.setHostSecondaryRecoveryRate12(hostSecondaryRecoveryRate12Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate13 (Double)
		try {
			Double hostSecondaryRecoveryRate13Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13).getText());
			model.setHostSecondaryRecoveryRate13(hostSecondaryRecoveryRate13Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate14 (Double)
		try {
			Double hostSecondaryRecoveryRate14Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14).getText());
			model.setHostSecondaryRecoveryRate14(hostSecondaryRecoveryRate14Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate21 (Double)
		try {
			Double hostSecondaryRecoveryRate21Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21).getText());
			model.setHostSecondaryRecoveryRate21(hostSecondaryRecoveryRate21Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate23 (Double)
		try {
			Double hostSecondaryRecoveryRate23Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23).getText());
			model.setHostSecondaryRecoveryRate23(hostSecondaryRecoveryRate23Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate24 (Double)
		try {
			Double hostSecondaryRecoveryRate24Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24).getText());
			model.setHostSecondaryRecoveryRate24(hostSecondaryRecoveryRate24Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate31 (Double)
		try {
			Double hostSecondaryRecoveryRate31Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31).getText());
			model.setHostSecondaryRecoveryRate31(hostSecondaryRecoveryRate31Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate32 (Double)
		try {
			Double hostSecondaryRecoveryRate32Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32).getText());
			model.setHostSecondaryRecoveryRate32(hostSecondaryRecoveryRate32Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate34 (Double)
		try {
			Double hostSecondaryRecoveryRate34Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34).getText());
			model.setHostSecondaryRecoveryRate34(hostSecondaryRecoveryRate34Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate41 (Double)
		try {
			Double hostSecondaryRecoveryRate41Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41).getText());
			model.setHostSecondaryRecoveryRate41(hostSecondaryRecoveryRate41Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate42 (Double)
		try {
			Double hostSecondaryRecoveryRate42Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42).getText());
			model.setHostSecondaryRecoveryRate42(hostSecondaryRecoveryRate42Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Recovery Rate43 (Double)
		try {
			Double hostSecondaryRecoveryRate43Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43).getText());
			model.setHostSecondaryRecoveryRate43(hostSecondaryRecoveryRate43Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate12 (Double)
		try {
			Double hostSecondaryIncubationRate12Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12).getText());
			model.setHostSecondaryIncubationRate12(hostSecondaryIncubationRate12Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate13 (Double)
		try {
			Double hostSecondaryIncubationRate13Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13).getText());
			model.setHostSecondaryIncubationRate13(hostSecondaryIncubationRate13Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate14 (Double)
		try {
			Double hostSecondaryIncubationRate14Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14).getText());
			model.setHostSecondaryIncubationRate14(hostSecondaryIncubationRate14Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate21 (Double)
		try {
			Double hostSecondaryIncubationRate21Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21).getText());
			model.setHostSecondaryIncubationRate21(hostSecondaryIncubationRate21Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate23 (Double)
		try {
			Double hostSecondaryIncubationRate23Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23).getText());
			model.setHostSecondaryIncubationRate23(hostSecondaryIncubationRate23Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate24 (Double)
		try {
			Double hostSecondaryIncubationRate24Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24).getText());
			model.setHostSecondaryIncubationRate24(hostSecondaryIncubationRate24Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate31 (Double)
		try {
			Double hostSecondaryIncubationRate31Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31).getText());
			model.setHostSecondaryIncubationRate31(hostSecondaryIncubationRate31Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate32 (Double)
		try {
			Double hostSecondaryIncubationRate32Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32).getText());
			model.setHostSecondaryIncubationRate32(hostSecondaryIncubationRate32Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate34 (Double)
		try {
			Double hostSecondaryIncubationRate34Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34).getText());
			model.setHostSecondaryIncubationRate34(hostSecondaryIncubationRate34Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate41 (Double)
		try {
			Double hostSecondaryIncubationRate41Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41).getText());
			model.setHostSecondaryIncubationRate41(hostSecondaryIncubationRate41Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate42 (Double)
		try {
			Double hostSecondaryIncubationRate42Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42).getText());
			model.setHostSecondaryIncubationRate42(hostSecondaryIncubationRate42Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Host Secondary Incubation Rate43 (Double)
		try {
			Double hostSecondaryIncubationRate43Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43).getText());
			model.setHostSecondaryIncubationRate43(hostSecondaryIncubationRate43Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector Infectivity1 (Double)
		try {
			Double vectorInfectivity1Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY1).getText());
			model.setVectorInfectivity1(vectorInfectivity1Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector Infectivity2 (Double)
		try {
			Double vectorInfectivity2Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY2).getText());
			model.setVectorInfectivity2(vectorInfectivity2Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector Infectivity3 (Double)
		try {
			Double vectorInfectivity3Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY3).getText());
			model.setVectorInfectivity3(vectorInfectivity3Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector Infectivity4 (Double)
		try {
			Double vectorInfectivity4Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY4).getText());
			model.setVectorInfectivity4(vectorInfectivity4Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector ADE1 (Double)
		try {
			Double vectorADE1Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE1).getText());
			model.setVectorADE1(vectorADE1Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector ADE2 (Double)
		try {
			Double vectorADE2Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE2).getText());
			model.setVectorADE2(vectorADE2Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector ADE3 (Double)
		try {
			Double vectorADE3Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE3).getText());
			model.setVectorADE3(vectorADE3Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector ADE4 (Double)
		try {
			Double vectorADE4Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE4).getText());
			model.setVectorADE4(vectorADE4Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector Incubation Rate1 (Double)
		try {
			Double vectorIncubationRate1Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE1).getText());
			model.setVectorIncubationRate1(vectorIncubationRate1Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector Incubation Rate2 (Double)
		try {
			Double vectorIncubationRate2Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE2).getText());
			model.setVectorIncubationRate2(vectorIncubationRate2Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector Incubation Rate3 (Double)
		try {
			Double vectorIncubationRate3Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE3).getText());
			model.setVectorIncubationRate3(vectorIncubationRate3Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector Incubation Rate4 (Double)
		try {
			Double vectorIncubationRate4Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE4).getText());
			model.setVectorIncubationRate4(vectorIncubationRate4Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Episilon1 (Double)
		try {
			Double episilon1Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__EPISILON1).getText());
			model.setEpisilon1(episilon1Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Episilon2 (Double)
		try {
			Double episilon2Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__EPISILON2).getText());
			model.setEpisilon2(episilon2Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Episilon3 (Double)
		try {
			Double episilon3Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__EPISILON3).getText());
			model.setEpisilon3(episilon3Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Episilon4 (Double)
		try {
			Double episilon4Value = Double.parseDouble(
				map.get(VectorPackage.Literals.DENGUE_MODEL__EPISILON4).getText());
			model.setEpisilon4(episilon4Value);
		} catch (NumberFormatException nfe) {
			// empty
		}
	}

	/**
	 * @generated
	 */
	@Override
	public boolean validate() {
		boolean valid = super.validate();

		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__BITING_RATE_SV);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__BITING_RATE_IV);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY1);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY2);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY3);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY4);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE12);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE13);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE14);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE21);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE23);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE24);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE31);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE32);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE34);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE41);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE42);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_ADE43);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY1);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY2);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY3);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY4);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE1);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE2);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE3);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE4);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE1);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE2);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE3);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE4);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__EPISILON1);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__EPISILON2);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__EPISILON3);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.DENGUE_MODEL__EPISILON4);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class DengueModelPropertyStringProviderAdapter
		extends AbstractDengueModelPropertyStringProviderAdapter {
		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 * @generated
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return VectorWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName(), "DengueModel");
			} catch (MissingResourceException e) {
				return super.getPropertyName(descriptor);
			}
		} // getPropertyName

		/**
		 * @param descriptor
		 * @return the NLS'd tool tip text that describes the property
		 * @generated
		 */
		public String getPropertyToolTip(
				IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return VectorWizardMessages.getString(feature
						.getName() + TT_SUFFIX, "DengueModel");
			} catch (MissingResourceException e) {
				return super.getPropertyToolTip(descriptor);
			}
		} // getPropertyToolTip

		/**
		 * @param descriptor
		 * @return the NLS'd text that represents the units of the
		 *         property
		 * @generated
		 */
		public String getPropertyUnits(
				IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return VectorWizardMessages.getString(feature
						.getName() + UNIT_SUFFIX, "DengueModel");
			} catch (MissingResourceException e) {
				return super.getPropertyUnits(descriptor);
			}
		} // getPropertyUnits
		
		/**
		 * @param descriptor
		 * @return the NLS'd text for a missing property error message
		 * @generated
		 */
		public String getPropertyMissing(
				IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return VectorWizardMessages.getString(feature
						.getName() + MISSING_SUFFIX, "DengueModel");
			} catch (MissingResourceException e) {
				return super.getPropertyMissing(descriptor);
			}
		} // getPropertyMissing
		
		/**
		 * @param descriptor
		 * @return the NLS'd text for a missing property error message
		 * @generated
		 */
		public String getPropertyInvalid(
				IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return VectorWizardMessages.getString(feature
						.getName() + INVALID_SUFFIX, "DengueModel");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}