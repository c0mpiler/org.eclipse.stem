// SequencerNewModifierPageAdapterFactory.java
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.sequencer.util.SequencerAdapterFactory;
import org.eclipse.stem.ui.wizards.NewModifierPage;

/**
 * This class is an {@link NewModifierPageAdapterFactory} that
 * adapts {@link org.eclipse.stem.core.sequencer.SequentialSequencer}s to {@link NewModifierPage}s.
 */
public class SequencerNewModifierPageAdapterFactory extends
		SequencerAdapterFactory implements
		NewModifierPageAdapterFactory {

	/**
	 * Default Constructor
	 */
	public SequencerNewModifierPageAdapterFactory() {
		super();
		NewModifierPageAdapterFactory.INSTANCE
				.addAdapterFactory(this);
	}

	/**
	 * @see org.eclipse.stem.core.scenario.util.ScenarioAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(final Object type) {
		return type == NewModifierPage.class || super.isFactoryForType(type);
	}

	/**
	 * @see org.eclipse.stem.core.sequencer.util.SequencerAdapterFactory#createSequentialSequencerAdapter()
	 */
	@Override
	public Adapter createSequentialSequencerAdapter() {
		return new SequentialSequencerNewModifierPageAdapter();
	}

	/**
	 * @see org.eclipse.stem.core.sequencer.util.SequencerAdapterFactory#createRealTimeSequencerAdapter()
	 */
	@Override
	public Adapter createRealTimeSequencerAdapter() {
		return new RealTimeSequencerNewModifierPageAdapter();
	}

	/**
	 * This class adapts {@link SequentialSequencer}s to
	 * {@link NewModifierPage}s
	 */
	public static class SequentialSequencerNewModifierPageAdapter extends
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
					// TODO isUserSpecifiedProperty
					return true;
				}
			};
		} // createNewModifierPage

	} // SequentialSequencerNewModifierPageAdapter

	/**
	 * This class adapts {@link org.eclipse.stem.core.sequencer.RealTimeSequencer}s to {@link NewModifierPage}s
	 */
	public static class RealTimeSequencerNewModifierPageAdapter extends
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
					// TODO isUserSpecifiedProperty
					return true;
				}
			};
		} // createNewModifierPage

	} // RealTimeSequencerNewModifierPageAdapter

} // SequencerNewModifierPageAdapterFactory
