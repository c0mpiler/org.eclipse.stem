// NOPFeatureModifierEditCompositeAdapter.java
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.modifier.FeatureModifier;
import org.eclipse.stem.ui.wizards.NewModifierPage;
import org.eclipse.stem.ui.wizards.NewModifierPage.FeatureModifierEditComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/**
 * This class is a {@link FeatureModifierEditCompositeAdapter} for
 * {@link org.eclipse.stem.core.modifier.NOPModifier}s.
 */
public class NOPFeatureModifierEditCompositeAdapter extends
		FeatureModifierEditCompositeAdapter {

	/**
	 * @see org.eclipse.stem.ui.adapters.featuremodifiereditcomposite.FeatureModifierEditCompositeAdapter#createEditComposite(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.stem.core.common.Identifiable,
	 *      org.eclipse.stem.ui.wizards.NewModifierPage)
	 */
	@Override
	public FeatureModifierEditComposite createEditComposite(
			final Composite parent,
			final EObject target,
			final NewModifierPage parentNewModifierPage) {
		final FeatureModifierEditComposite retValue = new FeatureModifierEditComposite(
				parent, parentNewModifierPage, (FeatureModifier) getTarget()) {
			@Override
			protected boolean validate() {
				return true;
			}
		};
		retValue.setLayout(new RowLayout());

		final Label label = new Label(retValue, SWT.NONE);
		label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
		label.setText(getFeatureModifier().getTarget().eGet(
				getFeatureModifier().getEStructuralFeature()).toString());

		return retValue;
	} // createEditComposite

	/**
	 * This class is a {@link FeatureModifierEditCompositeAdapter} for
	 * {@link org.eclipse.stem.core.modifier.STEMTimeNOPModifier}s.
	 * 
	 * @see ExperimentFeatureModifierEditCompositeFactory#createSTEMTimeNOPModifierAdapter()
	 */
	public static class STEMTimeNOPFeatureModifierEditCompositeAdapter extends
			NOPFeatureModifierEditCompositeAdapter {

		/**
		 * @see org.eclipse.stem.ui.adapters.featuremodifiereditcomposite.FeatureModifierEditCompositeAdapter#createEditComposite(org.eclipse.swt.widgets.Composite,
		 *      org.eclipse.stem.core.common.Identifiable,
		 *      org.eclipse.stem.ui.wizards.NewModifierPage)
		 */
		@Override
		public FeatureModifierEditComposite createEditComposite(
				final Composite parent,
				final EObject target,
				final NewModifierPage parentNewModifierPage) {
			final FeatureModifierEditComposite retValue = new FeatureModifierEditComposite(
					parent, parentNewModifierPage,
					(FeatureModifier) getTarget()) {
				@Override
				protected boolean validate() {
					return true;
				}
			};
			retValue.setLayout(new RowLayout());

			final Label label = new Label(retValue, SWT.NONE);
			label.setText(getFeatureModifier().getTarget().eGet(
					getFeatureModifier().getEStructuralFeature()).toString());

			return retValue;
		} // createEditComposite

	} // STEMTimeNOPFeatureModifierEditCompositeAdapter

	/**
	 * This class is a {@link FeatureModifierEditCompositeAdapter} for
	 * {@link org.eclipse.stem.core.modifier.NOPModifier}s that are numeric like
	 * {@link org.eclipse.stem.core.modifier.IntegerNOPModifier},
	 * {@link org.eclipse.stem.core.modifier.LongNOPModifier} and
	 * {@link org.eclipse.stem.core.modifier.DoubleNOPModifier}.
	 * 
	 * @see ExperimentFeatureModifierEditCompositeFactory#createIntegerNOPModifierAdapter()
	 * @see ExperimentFeatureModifierEditCompositeFactory#createLongNOPModifierAdapter()
	 * @see ExperimentFeatureModifierEditCompositeFactory#createDoubleNOPModifierAdapter()
	 */
	public static class NumericNOPFeatureModifierEditCompositeAdapter extends
			NOPFeatureModifierEditCompositeAdapter {

		/**
		 * @see org.eclipse.stem.ui.adapters.featuremodifiereditcomposite.FeatureModifierEditCompositeAdapter#createEditComposite(org.eclipse.swt.widgets.Composite,
		 *      org.eclipse.stem.core.common.Identifiable,
		 *      org.eclipse.stem.ui.wizards.NewModifierPage)
		 */
		@Override
		public FeatureModifierEditComposite createEditComposite(
				final Composite parent,
				final EObject target,
				final NewModifierPage parentNewModifierPage) {
			final FeatureModifierEditComposite retValue = new FeatureModifierEditComposite(
					parent, parentNewModifierPage,
					(FeatureModifier) getTarget()) {
				@Override
				protected boolean validate() {
					return true;
				}
			};
			retValue.setLayout(new RowLayout());

			final Label toLabel = new Label(retValue, SWT.NONE);
			toLabel.setText(getFeatureModifier().getTarget().eGet(
					getFeatureModifier().getEStructuralFeature()).toString());

			return retValue;
		} // createEditComposite

	} // NumericNOPFeatureModifierEditCompositeAdapter

	/**
	 * This class is a {@link FeatureModifierEditCompositeAdapter} for
	 * {@link org.eclipse.stem.core.modifier.STEMTimeNOPModifier}s.
	 * 
	 * @see ExperimentFeatureModifierEditCompositeFactory#createSTEMTimeNOPModifierAdapter()
	 */
	public static class StringNOPFeatureModifierEditCompositeAdapter extends
			NOPFeatureModifierEditCompositeAdapter {

		/**
		 * @see org.eclipse.stem.ui.adapters.featuremodifiereditcomposite.FeatureModifierEditCompositeAdapter#createEditComposite(org.eclipse.swt.widgets.Composite,
		 *      org.eclipse.stem.core.common.Identifiable,
		 *      org.eclipse.stem.ui.wizards.NewModifierPage)
		 */
		@Override
		public FeatureModifierEditComposite createEditComposite(
				final Composite parent,
				final EObject target,
				final NewModifierPage parentNewModifierPage) {
			final FeatureModifierEditComposite retValue = new FeatureModifierEditComposite(
					parent, parentNewModifierPage,
					(FeatureModifier) getTarget()) {
				@Override
				protected boolean validate() {
					return true;
				}
			};
			retValue.setLayout(new RowLayout());

			final Label label = new Label(retValue, SWT.NONE);
			label.setText(getFeatureModifier().getTarget().eGet(
					getFeatureModifier().getEStructuralFeature()).toString());

			return retValue;
		} // createEditComposite

	} // StringNOPFeatureModifierEditCompositeAdapter

} // NOPFeatureModifierEditCompositeAdapter
