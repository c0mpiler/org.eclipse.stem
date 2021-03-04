// PopulationModelView.java
package org.eclipse.stem.ui.views.populationmodel;

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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.stem.populationmodels.Constants;
import org.eclipse.stem.ui.views.IdentifiableDelegate;
import org.eclipse.stem.ui.views.IdentifiablePluginView;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * This class implements a view of the plugged in populaiton model.
 */
public class PopulationModelView extends IdentifiablePluginView {

	/**
	 * The identifier of the Sequencers View
	 */
	public static final String ID_POPULATION_MODEL_VIEW = "org.eclipse.stem.ui.views.populationmodels"; //$NON-NLS-1$

	/**
	 * Default Constructor
	 */
	public PopulationModelView() {
		super();
	} // PopulationView

	/**
	 * @see org.eclipse.stem.ui.views.ExecutablePluginView#getInput()
	 */
	@Override
	protected IdentifiableViewModel getInput() {
		return PopulationViewModel.getModel();
	} // getInput

	/**
	 * @see org.eclipse.stem.ui.views.IdentifiablePluginView#getIdentifiablePluginViewLabelContentProvider()
	 */
	@Override
	protected IdentifiablePluginViewLabelContentProvider getIdentifiablePluginViewLabelContentProvider() {
		return new PopulationViewTreeContentProvider();
	} // getIdentifiablePluginViewLabelContentProvider

	/**
	 * This class is the model of the plugged in <code>PopulationModel</code>
	 */
	public static class PopulationViewModel extends IdentifiableViewModel {

		private static PopulationViewModel model = null;

		/**
		 * @param extensionPointID
		 */
		private PopulationViewModel(String extensionPointID) {
			super(extensionPointID);
		} // PopulationModelViewModel

		/**
		 * @return the singleton instance of the model
		 */
		public static PopulationViewModel getModel() {
			// Do we need to make the model?
			if (model == null) {
				// Yes
				model = new PopulationViewModel(
						Constants.ID_POPULATION_MODEL_EXTENSION_POINT);
			}
			return model;
		} // getModel

	} // PopulaitonViewModel

	/**
	 * This class is the content provider of the population view.
	 */
	private static class PopulationViewTreeContentProvider extends
			IdentifiablePluginViewLabelContentProvider {

		// This is the image used to represent population models in the population view
		static ImageDescriptor populationIcon = null;

		// If true then we've never tried to get the icon
		static boolean populationIconFirstTime = true;

		/**
		 * @see org.eclipse.stem.ui.views.IdentifiablePluginView.IdentifiablePluginViewLabelContentProvider#getImage(java.lang.Object)
		 */
		public Image getImage(Object element) {
			return (element instanceof IdentifiableDelegate) ? getPopulationIcon()
					: super.getImage(element);
		} // getImage

		/**
		 * @return the icon to be used to represent population models, or null if it
		 *         can't be loaded.
		 */
		private Image getPopulationIcon() {
			// Should we try to load the icon?
			if (populationIconFirstTime && populationIcon == null) {
				// Yes
				populationIconFirstTime = false;
				populationIcon = 
				AbstractUIPlugin.imageDescriptorFromPlugin(
					"org.eclipse.stem.ui.populationmodels"	, "icons/full/custom16/" + "populationmodel.gif");
			} // if we should load the icon
			return populationIcon.createImage();
		} // getPopulationIcon

		/**
		 * @see org.eclipse.stem.ui.views.IdentifiablePluginView.IdentifiablePluginViewLabelContentProvider#dispose()
		 */
		@Override
		public void dispose() {
			super.dispose();
			// TODO dispose of the image
		}

	} // PopulationModelViewTreeContentProvider
} // PopulationView
