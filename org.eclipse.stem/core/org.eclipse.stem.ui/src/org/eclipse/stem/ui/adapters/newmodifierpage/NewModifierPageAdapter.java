// NewModifierPageAdapter.java
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
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.stem.ui.wizards.NewModifierPage;

/**
 * This class is extended by classes that adapt {@link Object}s to
 * {@link NewModifierPage}s.
 */
abstract public class NewModifierPageAdapter extends AdapterImpl implements
		Adapter {

	/**
	 * @return a {@link NewModifierPage}
	 */
	abstract public NewModifierPage createNewModifierPage();

	/**
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return type == NewModifierPageAdapter.class;
	}

} // NewModifierPageAdapter
