// DiseaseNewModifierPageAdapterFactory.java
package org.eclipse.stem.ui.populationmodels.adapters;

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
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.util.StandardAdapterFactory;
import org.eclipse.stem.ui.adapters.newmodifierpage.NewModifierPageAdapter;
import org.eclipse.stem.ui.adapters.newmodifierpage.NewModifierPageAdapterFactory;
import org.eclipse.stem.ui.populationmodels.standard.wizards.PopulationModelWizardMessages;
import org.eclipse.stem.ui.wizards.NewModifierPage;
import org.eclipse.ui.IStartup;

/**
 * This class is an {@link NewModifierPageAdapterFactory} that adapts
 * {@link PopulationModel}s and {@link PopulationInitializer}s to {@link NewModifierPage}s.
 */
public class PopulationModelNewModifierPageAdapterFactory extends
		StandardAdapterFactory implements NewModifierPageAdapterFactory, IStartup {

	/**
	 * Default constructor.
	 */
	public PopulationModelNewModifierPageAdapterFactory() {
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
	public Adapter createPopulationModelAdapter() {
		return new PopulationModelNewModifierPageAdapter();
	}

	@Override
	public Adapter createStandardPopulationModelAdapter() {
		return new PopulationModelNewModifierPageAdapter();
	}

	@Override
	public Adapter createStochasticStandardPopulationModelAdapter() {
		return new PopulationModelNewModifierPageAdapter();
	}
	
	@Override
	public Adapter createSeasonalPopulationModelAdapter() {
		return new PopulationModelNewModifierPageAdapter();
	}
	
	
	@Override
	public Adapter createPopulationInitializerAdapter() {
		return new PopulationModelNewModifierPageAdapter();
	}

	@Override
	public Adapter createStandardPopulationInitializerAdapter() {
		return new PopulationModelNewModifierPageAdapter();
	}
	
	/**
	 * This class adapts {@link PopulationModel}s to {@link NewModifierPage}s
	 */
	private static class PopulationModelNewModifierPageAdapter extends
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
					if (containingClass.equals(ModelPackage.eINSTANCE.getIntegrationDecorator()) 
							|| containingClass.equals(StandardPackage.eINSTANCE.getPopulationModel())
							|| containingClass.getEAllSuperTypes().contains(
									StandardPackage.eINSTANCE.getPopulationModel()) ||
									containingClass.equals(StandardPackage.eINSTANCE.getPopulationInitializer()) ||
											containingClass.getEAllSuperTypes().contains(
													StandardPackage.eINSTANCE.getPopulationInitializer())) {
						
						if(feature.getFeatureID() == StandardPackage.DEMOGRAPHIC_POPULATION_MODEL__POPULATION_GROUPS)
							return false;

						// Yes
						retValue = true;
					} // if a population model property
					return retValue;
				} // isUserSpecifiedProperty

				@Override
				protected String getBottomText() {
					return PopulationModelWizardMessages.getString("PMTP_Def");
				}

				@Override
				protected boolean isModifiableProperty(
						final EStructuralFeature feature) {
					boolean retValue = super.isModifiableProperty(feature);

					return retValue;
				} // isModifiableProperty
			};
		} // createNewModifierPage

	} // 
} // 
