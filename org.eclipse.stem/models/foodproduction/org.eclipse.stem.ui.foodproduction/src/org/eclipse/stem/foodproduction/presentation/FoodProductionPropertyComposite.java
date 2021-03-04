/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.foodproduction.presentation;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.stem.foodproduction.FoodTransformer;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.foodproduction.adapters.FoodProductionPropertyEditorAdapter;
import org.eclipse.stem.ui.foodproduction.adapters.FoodProductionPropertyEditorAdapterFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This class represents
 */
public class FoodProductionPropertyComposite extends Composite {

	private Map<FoodTransformer, FoodProductionPropertyEditor> modelMap = new HashMap<FoodTransformer, FoodProductionPropertyEditor>();

	private StackLayout stackLayout = null;

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public FoodProductionPropertyComposite(final Composite parent,
			final int style, final FoodTransformer[] foodTransformers,
			ModifyListener projectValidator, IProject project) {
		super(parent, style);
		stackLayout = new StackLayout();
		setLayout(stackLayout);

		Label label;
		label = new Label(this, SWT.NONE);
		label.setText(FoodProductionMessages.getString("FPPC1")); //$NON-NLS-1$
		FoodProductionPropertyEditor firstOne = null;
	
		if (foodTransformers != null) {
			// Yes
			for (FoodTransformer model : foodTransformers) {

				FoodProductionPropertyEditorAdapter fppea = (FoodProductionPropertyEditorAdapter) FoodProductionPropertyEditorAdapterFactory .INSTANCE
						.adapt(model,
								FoodProductionPropertyEditorAdapter.class);

				final FoodProductionPropertyEditor fppe = fppea
						.createFoodProductionPropertyEditor(this, SWT.NONE,
								projectValidator, project);

				modelMap.put(model, fppe);
				if (firstOne == null) {
					// Yes
					firstOne = fppe;
				} // if
			} // for i
		} //

		stackLayout.topControl = firstOne;
	} // FoodProductionModelPropertyComposite

	void displayFoodTransformer(final FoodTransformer foodTransformer) {
		final FoodProductionPropertyEditor fppe = modelMap.get(foodTransformer);
		// Did we find it?
		if (fppe != null) {
			// Yes
			stackLayout.topControl = fppe;
			layout();
		} // if
		else {
			Activator.logError(FoodProductionMessages.getString("FPPC2") //$NON-NLS-1$
					+ foodTransformer.getClass().getName() + "\"", null); //$NON-NLS-1$
		}
	} // displayFoodProducer
	
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	/**
	 * @return <code>true</code> if the contents of the composite are valid,
	 *         <code>false</code> otherwise.
	 */
	public boolean validate() {
		return ((StandardFoodProductionPropertyEditor) (stackLayout.topControl))
				.validate();
	} // validate

	/**
	 * @return
	 */
	public String getErrorMessage() {
		return ((StandardFoodProductionPropertyEditor) (stackLayout.topControl))
				.getErrorMessage();
	}

	/**
	 * @param diseaseModel
	 */
	public void populateFoodTransformer(FoodTransformer foodTransformer) {
		((StandardFoodProductionPropertyEditor) (stackLayout.topControl))
				.populate(foodTransformer);
	} // populateFoodProducer

} // FoodProductionModelPropertyComposite
