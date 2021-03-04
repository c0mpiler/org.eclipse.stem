// FeatureModifierFeatureModifierEditCompositeAdapterFactory.java
package org.eclipse.stem.ui.adapters.featuremodifiereditcomposite;

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

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

/**
 * This class is an adapter factory that adapts {@link org.eclipse.stem.core.modifier.FeatureModifier}s to
 * {@link org.eclipse.stem.ui.wizards.NewModifierPage.FeatureModifierEditComposite}s.
 */
public interface FeatureModifierFeatureModifierEditCompositeAdapterFactory {

	/**
	 * Singleton instance of the adapter factory.
	 */
	FeatureModifierEditCompositeAdapterFactoryImpl INSTANCE = new FeatureModifierEditCompositeAdapterFactoryImpl();

	/**
	 * This class is the {@link ComposedAdapterFactory} that other
	 * {@link FeatureModifierFeatureModifierEditCompositeAdapterFactory}s add
	 * themselves to.
	 */
	class FeatureModifierEditCompositeAdapterFactoryImpl extends
			ComposedAdapterFactory implements
			FeatureModifierFeatureModifierEditCompositeAdapterFactory {

		/**
		 * @see org.eclipse.emf.edit.provider.ComposedAdapterFactory#isFactoryForType(java.lang.Object)
		 */
		@Override
		public boolean isFactoryForType(final Object type) {
			return type == FeatureModifierEditCompositeAdapter.class;
		}
	} // FeatureModifierEditCompositeAdapterFactoryImpl

} // FeatureModifierFeatureModifierEditCompositeAdapterFactory
