package org.eclipse.stem.ui.populationmodels.standard.wizards;

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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.stem.populationmodels.standard.PopulationInitializer;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationInitializerPropertyEditor;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationInitializerPropertyEditorAdapter;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationInitializerPropertyEditorAdapterFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This class represents
 */
public class PopulationInitializerPropertyComposite extends Composite {

	private final Map<PopulationInitializer, PopulationInitializerPropertyEditor> initializerMap = new HashMap<PopulationInitializer, PopulationInitializerPropertyEditor>();

	private StackLayout stackLayout = null;

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public PopulationInitializerPropertyComposite(final Composite parent,
			final int style, final PopulationInitializer[] populationInitializers,
			ModifyListener projectValidator, IProject project) {
		super(parent, style);
		stackLayout = new StackLayout();
		setLayout(stackLayout);

		Label label;
		label = new Label(this, SWT.NONE);
		label.setText(PopulationModelWizardMessages.getString("DMPC3")); //$NON-NLS-1$
		PopulationInitializerPropertyEditor firstOne = null;
		// Any disease models?
		if (populationInitializers != null) {
			// Yes
			for (int i = 0; i < populationInitializers.length; i++) {

				PopulationInitializerPropertyEditorAdapter dmpea = (PopulationInitializerPropertyEditorAdapter) PopulationInitializerPropertyEditorAdapterFactory.INSTANCE
						.adapt(populationInitializers[i],
								PopulationInitializerPropertyEditorAdapter.class);

				final PopulationInitializerPropertyEditor dmpe = dmpea
						.createPopulationInitializerPropertyEditor(this, SWT.NONE,
								projectValidator, project);

				initializerMap.put(populationInitializers[i], dmpe);
				if (firstOne == null) {
					// Yes
					firstOne = dmpe;
				} // if
			} // for i
		} // if any disease models?

		stackLayout.topControl = firstOne;
	} // DiseaseModelPropertyComposite

	void displayPopulationInitializer(final PopulationInitializer initializer) {
		final PopulationInitializerPropertyEditor dmpe = initializerMap.get(initializer);
		// Did we find it?
		if (dmpe != null) {
			// Yes
			stackLayout.topControl = dmpe;
			layout();
		} // if
		else {
			Activator.logError(PopulationModelWizardMessages.getString("DMPC4") //$NON-NLS-1$
					+ initializer.getClass().getName() + "\"", null); //$NON-NLS-1$
		}
	} // displayDiseaseModel
	
	@Override
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
		return ((PopulationInitializerPropertyEditor) (stackLayout.topControl))
				.validate();
	} // validate

	/**
	 * @return
	 */
	public String getErrorMessage() {
		return ((PopulationInitializerPropertyEditor) (stackLayout.topControl))
				.getErrorMessage();
	}

	/**
	 * @param diseaseModel
	 */
	public void populatePopulationInitializer(PopulationInitializer populationInitializer) {
		((PopulationInitializerPropertyEditor) (stackLayout.topControl))
				.populate(populationInitializer);
	} // populatePopulationInitializer

} 
