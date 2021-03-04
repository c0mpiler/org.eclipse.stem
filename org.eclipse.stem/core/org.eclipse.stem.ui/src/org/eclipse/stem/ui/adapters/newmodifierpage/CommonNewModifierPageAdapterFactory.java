// DiseaseNewModifierPageAdapterFactory.java
package org.eclipse.stem.ui.adapters.newmodifierpage;

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.common.util.CommonAdapterFactory;
import org.eclipse.stem.ui.wizards.NewModifierPage;
import org.eclipse.ui.IStartup;

/**
 * This class is an {@link NewModifierPageAdapterFactory} that adapts
 * {@link DiseaseModel}s to {@link NewModifierPage}s.
 */
public class CommonNewModifierPageAdapterFactory extends
		CommonAdapterFactory implements NewModifierPageAdapterFactory, IStartup {

	/**
	 * Default constructor.
	 */
	public CommonNewModifierPageAdapterFactory() {
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
	public Adapter createDoubleValueAdapter() {
		return new CommonNewModifierPageAdapter();
	}

	@Override
	public Adapter createStringValueAdapter() {
		return new CommonNewModifierPageAdapter();
	}
	
/**
	 * This class adapts {@link DiseaseModel}s to {@link NewModifierPage}s
	 */
	private static class CommonNewModifierPageAdapter extends
			NewModifierPageAdapter {

		/**
		 * @see org.eclipse.stem.ui.adapters.newmodifierpage.NewModifierPageAdapter#createNewModifierPage()
		 */
		@Override
		public NewModifierPage createNewModifierPage() {
			return new NewModifierPage((EObject) getTarget()) {
				@Override
				protected boolean isUserSpecifiedProperty(
						final EStructuralFeature feature) {
					boolean retValue = false;
					final EClass containingClass = feature.getEContainingClass();
					// Is it a disease model property?
					if (containingClass.equals(CommonPackage.eINSTANCE.getDoubleValue())
							|| containingClass.getEAllSuperTypes().contains(
									CommonPackage.eINSTANCE.getDoubleValue()) || 
									containingClass.equals(CommonPackage.eINSTANCE.getStringValue())
									|| containingClass.getEAllSuperTypes().contains(
											CommonPackage.eINSTANCE.getStringValue())) {
									
						// Yes
						retValue = true;
					} // if a disease model property
					return retValue;
				} // isUserSpecifiedProperty

				@Override
				protected String getBottomText() {
					return "";
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
