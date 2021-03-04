// DiseaseNewModifierPageAdapterFactory.java
package org.eclipse.stem.ui.diseasemodels.multipopulation.adapters;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage;
import org.eclipse.stem.diseasemodels.multipopulation.util.MultipopulationAdapterFactory;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.adapters.newmodifierpage.NewModifierPageAdapter;
import org.eclipse.stem.ui.adapters.newmodifierpage.NewModifierPageAdapterFactory;
import org.eclipse.stem.ui.wizards.DiseaseWizardMessages;
import org.eclipse.stem.ui.wizards.NewModifierPage;
import org.eclipse.ui.IStartup;

/**
 * This class is an {@link NewModifierPageAdapterFactory} that adapts
 * {@link DiseaseModel}s to {@link NewModifierPage}s.
 */
public class MultiDiseaseNewModifierPageAdapterFactory extends
		MultipopulationAdapterFactory implements NewModifierPageAdapterFactory, IStartup {

	/**
	 * Default constructor.
	 */
	public MultiDiseaseNewModifierPageAdapterFactory() {
		super();
		NewModifierPageAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @see org.eclipse.ui.IStartup#earlyStartup()
	 */
	public void earlyStartup() {
		// Nothing to do the constructor will do everything.		
	}

	/**
	 * @see org.eclipse.stem.core.scenario.util.ScenarioAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(final Object type) {
		return type == NewModifierPageAdapter.class || super.isFactoryForType(type);
	}


	@Override
	public Adapter createMultiPopulationSIDiseaseModelAdapter() {
		return new MultiDiseaseNewModifierPageAdapter();
	}

	@Override
	public Adapter createMultiPopulationSIRDiseaseModelAdapter() {
		return new MultiDiseaseNewModifierPageAdapter();
	}
	
	@Override
	public Adapter createMultiPopulationSEIRDiseaseModelAdapter() {
		return new MultiDiseaseNewModifierPageAdapter();
	}
	
	/**
	 * This class adapts {@link DiseaseModel}s to {@link NewModifierPage}s
	 */
	private static class MultiDiseaseNewModifierPageAdapter extends
			NewModifierPageAdapter {

		/**
		 * @see org.eclipse.stem.ui.adapters.newmodifierpage.NewModifierPageAdapter#createNewModifierPage()
		 */
		@Override
		public NewModifierPage createNewModifierPage() {
			return new NewModifierPage((Identifiable) getTarget()) {
				@Override
				protected boolean isUserSpecifiedProperty(
						final EStructuralFeature feature) {
					boolean retValue = false;
					final EClass containingClass = feature.getEContainingClass();
					// Is it a disease model property?
					if (containingClass.equals(MultipopulationPackage.eINSTANCE.getMultiPopulationSIDiseaseModel())
							|| containingClass.getEAllSuperTypes().contains(
									MultipopulationPackage.eINSTANCE.getMultiPopulationSIDiseaseModel())) {
						
						if(feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SIR_DISEASE_MODEL__POPULATION_GROUPS ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SIR_DISEASE_MODEL__RECOVERY_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SIR_DISEASE_MODEL__TRANSMISSION_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__POPULATION_GROUPS ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__RECOVERY_RATE ||
								feature.getFeatureID() == MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__TRANSMISSION_RATE)
							return false; // list and matrices can't be modified here
						
						// Yes
						retValue = true;
					} // if a disease model property
					return retValue;
				} // isUserSpecifiedProperty

				@Override
				protected String getBottomText() {
					return DiseaseWizardMessages.getString("PMTP_Def");
				}

				@Override
				protected boolean isModifiableProperty(
						final EStructuralFeature feature) {
					boolean retValue = super.isModifiableProperty(feature);

					return retValue;
				} // isModifiableProperty
			};
		} // createNewModifierPage

	} // MultiDiseaseNewModifierPageAdapter

} // MultiDiseaseNewModifierPageAdapterFactory
