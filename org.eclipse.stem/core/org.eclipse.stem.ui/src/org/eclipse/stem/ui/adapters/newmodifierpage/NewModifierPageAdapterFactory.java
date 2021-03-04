// NewModifierPageAdapterFactory.java
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

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

/**
 * This class is an adapter factory that adapts
 * {@link org.eclipse.stem.core.common.Identifiable}s to
 * {@link org.eclipse.stem.ui.wizards.NewModifierPage}s.
 */
public interface NewModifierPageAdapterFactory {

	/**
	 * Singleton instance of the adapter factory.
	 */
	NewModifierPageAdatperFactoryImpl INSTANCE = new NewModifierPageAdatperFactoryImpl();

	/**
	 * This class is the {@link ComposedAdapterFactory} that other
	 * {@link NewModifierPageAdapterFactory}s add themselves to.
	 */
	class NewModifierPageAdatperFactoryImpl extends ComposedAdapterFactory
			implements NewModifierPageAdapterFactory {

		/**
		 * @see org.eclipse.emf.edit.provider.ComposedAdapterFactory#isFactoryForType(java.lang.Object)
		 */
		@Override
		public boolean isFactoryForType(Object type) {
			return type == NewModifierPageAdapter.class
					|| super.isFactoryForType(type);
		}

	} // IdentifiableNewModifierPageAdatperFactoryImpl

} // NewModifierPageAdapterFactory
