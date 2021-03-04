// DiseaseModelView.java
package org.eclipse.stem.ui.views.disease;

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
import org.eclipse.stem.diseasemodels.Constants;
import org.eclipse.stem.ui.views.IdentifiableDelegate;
import org.eclipse.stem.ui.views.IdentifiablePluginView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * This class implements a view of the plugged in Diseases.
 */
public class DiseaseView extends IdentifiablePluginView {

	/**
	 * The identifier of the Sequencers View
	 */
	public static final String ID_DISEASE_MODEL_VIEW = "org.eclipse.stem.ui.views.diseases"; //$NON-NLS-1$

	/**
	 * Default Constructor
	 */
	public DiseaseView() {
		super();
	} // DiseaseView

	
	
	
	@Override
	public void createPartControl(Composite parent) {

		GridLayout gl = new GridLayout(1, false);
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		parent.setLayout(gl);
		
		// Container for tree viewer
		Composite viewMaster = new Composite(parent, SWT.NONE);	
		viewMaster.setLayout(new FillLayout());
		GridData viewMasterData =  new GridData(SWT.FILL, SWT.FILL, true, true);
		viewMaster.setLayoutData(viewMasterData);
		super.createPartControl(viewMaster);
	
		
		// Link with help text
		Link helpText = new Link(parent, SWT.WRAP );

		GridData gd = new GridData();
		gd.heightHint = 50;
		gd.grabExcessHorizontalSpace = true;
		helpText.setLayoutData(gd);

		helpText.setText(Messages.DiseaseView_HelpText);

		helpText.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				// Hack to launch an ext browser for the selected link
				org.eclipse.swt.program.Program.launch(event.text);
			}
		});

	}




	/**
	 * @see org.eclipse.stem.ui.views.ExecutablePluginView#getInput()
	 */
	@Override
	protected IdentifiableViewModel getInput() {
		return DiseaseViewModel.getModel();
	} // getInput

	/**
	 * @see org.eclipse.stem.ui.views.IdentifiablePluginView#getIdentifiablePluginViewLabelContentProvider()
	 */
	@Override
	protected IdentifiablePluginViewLabelContentProvider getIdentifiablePluginViewLabelContentProvider() {
		return new DiseaseViewTreeContentProvider();
	} // getIdentifiablePluginViewLabelContentProvider

	/**
	 * This class is the model of the plugged in <code>DiseaseModel</code>
	 */
	public static class DiseaseViewModel extends IdentifiableViewModel {

		private static DiseaseViewModel model = null;

		/**
		 * @param extensionPointID
		 */
		private DiseaseViewModel(String extensionPointID) {
			super(extensionPointID);
		} // DiseaseModelViewModel

		/**
		 * @return the singleton instance of the model
		 */
		public static DiseaseViewModel getModel() {
			// Do we need to make the model?
			if (model == null) {
				// Yes
				model = new DiseaseViewModel(
						Constants.ID_DISEASE_EXTENSION_POINT);
			}
			return model;
		} // getModel

	} // DiseaseViewModel

	/**
	 * This class is the content provider of the disease view.
	 */
	private static class DiseaseViewTreeContentProvider extends
			IdentifiablePluginViewLabelContentProvider {

		// This is the image used to represent diseases in the disease view
		static ImageDescriptor diseaseIcon = null;

		// If true then we've never tried to get the icon
		static boolean diseaseIconFirstTime = true;

		/**
		 * @see org.eclipse.stem.ui.views.IdentifiablePluginView.IdentifiablePluginViewLabelContentProvider#getImage(java.lang.Object)
		 */
		public Image getImage(Object element) {
			return (element instanceof IdentifiableDelegate) ? getDiseaseIcon()
					: super.getImage(element);
		} // getImage

		/**
		 * @return the icon to be used to represent diseases, or null if it
		 *         can't be loaded.
		 */
		private Image getDiseaseIcon() {
			// Should we try to load the icon?
			if (diseaseIconFirstTime && diseaseIcon == null) {
				// Yes
				diseaseIconFirstTime = false;
				diseaseIcon = 
				AbstractUIPlugin.imageDescriptorFromPlugin(
					"org.eclipse.stem.ui.diseasemodels"	, "icons/full/custom16/" + "disease.gif"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			} // if we should load the icon
			return diseaseIcon.createImage();
		} // getdiseaseIcon

		/**
		 * @see org.eclipse.stem.ui.views.IdentifiablePluginView.IdentifiablePluginViewLabelContentProvider#dispose()
		 */
		@Override
		public void dispose() {
			super.dispose();
			// TODO dispose of the image
		}

	} // DiseaseModelViewTreeContentProvider
} // DiseaseView
