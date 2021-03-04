// ModelsView.java
package org.eclipse.stem.ui.views;

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

import org.eclipse.stem.core.Constants;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.ISharedImages;
import org.eclipse.swt.graphics.Image;

/**
 * This class represents the eclipse view of the {@link org.eclipse.stem.core.model.Model}s that have been
 * imported into eclipse as plug-ins.
 */
public class ModelsView extends IdentifiablePluginView {

	/**
	 * The identifier of the Model View
	 */
	public static final String ID_MODELS_VIEW = "org.eclipse.stem.ui.views.models"; //$NON-NLS-1$

	/**
	 * Constructor
	 */
	public ModelsView() {
		super();
	}

	/**
	 * @see org.eclipse.stem.ui.views.IdentifiablePluginView#getIdentifiablePluginViewLabelContentProvider()
	 */
	@Override
	protected IdentifiablePluginViewLabelContentProvider getIdentifiablePluginViewLabelContentProvider() {
		return new ModelPluginViewLabelContentProvider();
	}

	/**
	 * @return the input model specific to this view
	 */
	@Override
	protected IdentifiableViewModel getInput() {
		return ModelViewModel.getModel();
	} // getInput

	/**
	 * This class represents a singleton instance of a model of the STEM
	 * {@link Model} that are plugged into the system.
	 */
	protected static class ModelViewModel extends IdentifiableViewModel {
		// The singleton instance
		private static ModelViewModel mvModel;

		private ModelViewModel() {
			super(Constants.ID_MODEL_EXTENSION_POINT);
		}

		/**
		 * @return the singleton instance of the ModelViewModel
		 */
		public static ModelViewModel getModel() {
			if (mvModel == null) {
				mvModel = new ModelViewModel();
			}
			return mvModel;
		} // getModel

	} // ModelViewsModel

	protected static class ModelPluginViewLabelContentProvider extends
			IdentifiablePluginViewLabelContentProvider {

		// This is the image used to represent models in the model view
		static Image modelIcon = null;

		// If true then we've never tried to get the icon
		static boolean modelIconFirstTime = true;

		/**
		 * @see org.eclipse.stem.ui.views.IdentifiablePluginView.IdentifiablePluginViewLabelContentProvider#getImage(java.lang.Object)
		 */
		@Override
		public Image getImage(final Object element) {
			return (element instanceof IdentifiableDelegate) ? getModelIcon()
					: super.getImage(element);
		} // getImage

		/**
		 * @return the icon to be used to represent models, or null if it can't
		 *         be loaded.
		 */
		private Image getModelIcon() {
			// Should we try to load the icon?
			if (modelIconFirstTime && modelIcon == null) {
				// Yes
				modelIconFirstTime = false;
				modelIcon = Activator.getDefault().getImageRegistry().get(
						ISharedImages.MODEL_ICON);
			} // if we should load the icon
			return modelIcon;
		} // getModelIcon

	} // ModelPluginViewLabelContentProvider
} // ModelsView
