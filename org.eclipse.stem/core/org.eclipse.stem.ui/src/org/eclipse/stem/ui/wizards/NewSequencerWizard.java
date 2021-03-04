// NewSequencerWizard.java
package org.eclipse.stem.ui.wizards;

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

import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.sequencer.SequencerPackage;

/**
 * This class is a {@link NewIdentifiableWizard} for that creates new STEM
 * {@link org.eclipse.stem.core.sequencer.Sequencer}s
 */
abstract public class NewSequencerWizard extends NewIdentifiableWizard {

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createDublinCorePage()
	 */
	@Override
	protected DublinCorePage createDublinCorePage() {
		return new DublinCorePage() {
			@Override
			protected void initializeDCAttributes() {
				super.initializeDCAttributes();
				format.setText(SequencerPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.SEQUENCER_TYPE_URI.toString());
				type.setEnabled(false);
				

				titleTextField.setText(Messages.getString("dc_title_seq"));
				source.setText(Messages.getString("dc_source_seq"));
				descriptionTextField.setText(Messages.getString("dc_desc_seq"));
			}
		};
	} // createDublinCorePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFolderName()
	 */
	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.SEQUENCERS_FOLDER_NAME;
	} // getFolderName

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFileNameExtension()
	 */
	@Override
	protected String getSerializationFileNameExtension() {
		return SequencerPackage.eNAME;
	}

	/**
	 * This class represents a Wizard page for specifying a
	 * {@link org.eclipse.stem.core.sequencer.Sequencer}
	 */
	abstract protected static class SequencerPage extends NewIdentifiablePage {
		/**
		 * @param pageName
		 *            the name of the page
		 */
		protected SequencerPage(final String pageName) {
			super(pageName);
		}

	} // SequencerPage

} // NewSequencerWizard
