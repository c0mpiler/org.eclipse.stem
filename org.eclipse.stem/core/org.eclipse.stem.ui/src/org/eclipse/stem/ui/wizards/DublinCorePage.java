// DublinCorePage.java
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

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.stem.core.common.CommonFactory;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.impl.DublinCoreImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * This class is the {@link WizardPage} that all {@link NewIdentifiableWizard}s
 * use to specify the details of a {@link DublinCore} instance. Each
 * {@link NewIdentifiableWizard} contains a {@link NewIdentifiablePage} and one
 * of these pages.
 * 
 * @see NewIdentifiablePage
 * @see NewIdentifiableWizard
 */
public class DublinCorePage extends WizardPage {

	/**
	 * This is the character displayed next to attribute names for those
	 * attributes that are required. It is applied to the attribute name in
	 * #createDCAttribute(Composite, String, String, boolean, boolean) if the
	 * appropriate flag is <code>true</code>.
	 */
	private static final String REQUIRED_FIELD_CHAR = "*"; //$NON-NLS-1$

	/**
	 * This {@link ModifyListener} is attached to those attributes whose
	 * contents need to be verified for correctness. Whenever one of those
	 * attributes changes, a call to {@link #validateDublinCorePage()} is made
	 * which then returns <code>true</code> or <code>false</code>. This
	 * value is passed to {@link #setPageComplete(boolean)} which then enables
	 * or disables the buttons at the bottom of the {@link DublinCorePage}. The
	 * attachment is done in the method
	 * {@link #createDCAttribute(Composite, String, String, boolean, boolean)}
	 * if the appropriate flag is <code>true</code>.
	 */
	private final ModifyListener dcValidator = new ModifyListener() {
		public void modifyText(final ModifyEvent e) {
			setPageComplete(validateDublinCorePage());
		}
	};

	/**
	 * Required, Validated
	 * 
	 * @see DublinCore#getTitle()
	 * @see #REQUIRED_FIELD_CHAR
	 * @see #dcValidator
	 * @see #validateDublinCorePage()
	 */
	protected Text titleTextField;

	

	/**
	 * @see DublinCore#getDescription()
	 */
	protected Text descriptionTextField;

	/**
	 * @see DublinCore#getCreator()
	 */
	protected Text creator;

	/**
	 * Validated
	 * 
	 * @see DublinCore#getDate()
	 * @see #dcValidator
	 * @see #validateDublinCorePage()
	 */
	protected Text date;

	/**
	 * Required
	 * 
	 * @see DublinCore#getFormat()
	 * @see #REQUIRED_FIELD_CHAR
	 */
	protected Text format;

	/**
	 * @see DublinCore#getPublisher()
	 */
	protected Text publisher;

	/**
	 * @see DublinCore#getCoverage()
	 */
	protected Text coverage;

	/**
	 * @see DublinCore#getContributor()
	 */
	protected Text contributor;

	/**
	 * @see DublinCore#getRelation()
	 */
	protected Text relation;

	/**
	 * @see DublinCore#getRights()
	 */
	protected Text rights;

	/**
	 * @see DublinCore#getSource()
	 */
	protected Text source;

	/**
	 * @see DublinCore#getSubject()
	 */
	protected Text subject;

	/**
	 * Required
	 * 
	 * @see DublinCore#getType()
	 * @see #REQUIRED_FIELD_CHAR
	 */
	protected Text type;

	/**
	 * @see DublinCore#getLanguage()
	 */
	protected Text language;

	/**
	 * @see DublinCore#getBibliographicCitation()
	 */
	protected Text bibliographicCitation;

	/**
	 * Validated
	 * 
	 * @see DublinCore#getCreated()
	 * @see #dcValidator
	 * @see #validateDublinCorePage()
	 */
	protected Text created;

	/**
	 * @see DublinCore#getLicense()
	 */
	protected Text license;

	/**
	 * @see DublinCore#getRequired()
	 */
	protected Text required;

	/**
	 * @see DublinCore#getSpatial()
	 */
	protected Text spatial;

	/**
	 * Validated
	 * 
	 * @see DublinCore#getValid()
	 * @see #dcValidator
	 * @see #validateDublinCorePage()
	 */
	protected Text valid;

	/**
	 * Default Constructor
	 */
	protected DublinCorePage() {
		super(Messages.getString("NDublinCore.page_title")); //$NON-NLS-1$
		setTitle(Messages.getString("NDublinCore.page_title")); //$NON-NLS-1$
		setDescription(Messages.getString("NDublinCore.page_description")); //$NON-NLS-1$
	} // DublinCorePage

	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(final Composite parent) {
		// Creates a {@link Composite} and calls {@link
		// #setControl(org.eclipse.swt.widgets.Control)}

		// Page Composite
		final ScrolledComposite scrollComposite = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		final Composite pageComposite = new Composite(scrollComposite, SWT.None);
		final GridLayout pageCompositeLayout = new GridLayout();
		pageCompositeLayout.verticalSpacing = 12;
		pageCompositeLayout.numColumns = 2;
		pageCompositeLayout.marginHeight = 0;
		pageCompositeLayout.marginWidth = 0;
		pageComposite.setLayout(pageCompositeLayout);
		
		scrollComposite.setContent(pageComposite);
		scrollComposite.setExpandHorizontal(true);
		scrollComposite.setExpandVertical(true);

		final GridData pageCompositeLayoutData = new GridData();
		pageCompositeLayoutData.grabExcessVerticalSpace = true;
		pageCompositeLayoutData.verticalAlignment = GridData.FILL;
		pageCompositeLayoutData.horizontalAlignment = GridData.FILL;
		pageCompositeLayoutData.horizontalSpan = 1;
		pageComposite.setLayoutData(pageCompositeLayoutData);

		titleTextField = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.title"), //$NON-NLS-1$
				Messages.getString("NDublinCore.titleDesc"), //$NON-NLS-1$
				true, true);
		descriptionTextField = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.desc"), //$NON-NLS-1$
				Messages.getString("NDublinCore.descDesc"), //$NON-NLS-1$
				false, false);
		creator = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.creator"), //$NON-NLS-1$
				Messages.getString("NDublinCore.creatorDesc"), //$NON-NLS-1$
				false, false);
		date = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.date"), //$NON-NLS-1$
				Messages.getString("NDublinCore.dateDesc"), //$NON-NLS-1$
				false, true);
		valid = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.valid"), //$NON-NLS-1$
				Messages.getString("NDublinCore.validDesc"), //$NON-NLS-1$
				false, true);
		created = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.created"), //$NON-NLS-1$
				Messages.getString("NDublinCore.createdDesc"), //$NON-NLS-1$
				false, true);
		source = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.source"), //$NON-NLS-1$
				Messages.getString("NDublinCore.sourceDesc"), //$NON-NLS-1$
				false, false);

		publisher = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.publisher"), //$NON-NLS-1$
				Messages.getString("NDublinCore.publisherDesc"), //$NON-NLS-1$
				false, false);
		coverage = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.coverage"), //$NON-NLS-1$
				Messages.getString("NDublinCore.coverageDesc"), //$NON-NLS-1$
				false, false);
		contributor = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.contributor"), //$NON-NLS-1$
				Messages.getString("NDublinCore.contributorDesc"), //$NON-NLS-1$
				false, false);
		relation = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.relation"), //$NON-NLS-1$
				Messages.getString("NDublinCore.relationDesc"), false, //$NON-NLS-1$
				false);
		rights = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.rights"), //$NON-NLS-1$
				Messages.getString("NDublinCore.rightsDesc"), //$NON-NLS-1$
				false, false);

		subject = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.subject"), //$NON-NLS-1$
				Messages.getString("NDublinCore.subjectDesc"), //$NON-NLS-1$
				false, false);
		language = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.language"), //$NON-NLS-1$
				Messages.getString("NDublinCore.languageDesc"), //$NON-NLS-1$
				false, false);
		bibliographicCitation = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.citation"), //$NON-NLS-1$
				Messages.getString("NDublinCore.citationDesc"), false, false); //$NON-NLS-1$

		license = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.license"), //$NON-NLS-1$
				Messages.getString("NDublinCore.licensDesc"), //$NON-NLS-1$
				false, false);
		required = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.required"), //$NON-NLS-1$
				Messages.getString("NDublinCore.requiredDesc"), //$NON-NLS-1$
				false, false);
		spatial = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.spatial"), //$NON-NLS-1$
				Messages.getString("NDublinCore.spatialDesc"), //$NON-NLS-1$
				false, false);

		format = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.format"), //$NON-NLS-1$
				Messages.getString("NDublinCore.formatDesc"), //$NON-NLS-1$
				true, false);
		type = createDCAttribute(pageComposite, Messages
				.getString("NDublinCore.type"), //$NON-NLS-1$
				Messages.getString("NDublinCore.typeDesc"), //$NON-NLS-1$
				true, false);
		
		ModifyListener resizeListener = new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				scrollComposite.setMinSize(pageComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
			}
		};
		
		titleTextField.addModifyListener(resizeListener);
		descriptionTextField.addModifyListener(resizeListener);
		creator.addModifyListener(resizeListener);
		date.addModifyListener(resizeListener);
		format.addModifyListener(resizeListener);
		publisher.addModifyListener(resizeListener);
		coverage.addModifyListener(resizeListener);
		contributor.addModifyListener(resizeListener);
		relation.addModifyListener(resizeListener);
		rights.addModifyListener(resizeListener);
		source.addModifyListener(resizeListener);
		subject.addModifyListener(resizeListener);
		type.addModifyListener(resizeListener);
		language.addModifyListener(resizeListener);
		bibliographicCitation.addModifyListener(resizeListener);
		created.addModifyListener(resizeListener);
		license.addModifyListener(resizeListener);
		required.addModifyListener(resizeListener);
		spatial.addModifyListener(resizeListener);
		valid.addModifyListener(resizeListener);

		final Label requiredFieldLabel = new Label(pageComposite, SWT.NONE);
		requiredFieldLabel.setText(REQUIRED_FIELD_CHAR
				+ Messages.getString("NDublinCore.requiredField")); //$NON-NLS-1$
		final GridData requiredLabelLayoutData = new GridData();
		requiredLabelLayoutData.horizontalSpan = 2;
		requiredFieldLabel.setLayoutData(requiredLabelLayoutData);

		initializeDCAttributes();

		setPageComplete(validateDublinCorePage());
		setControl(scrollComposite);
	} // createControl

	/**
	 * Set the {@link #created} attribute to have the current date string and
	 * the {@link #creator} to be the value of the "user.name" system property.
	 */
	protected void initializeDCAttributes() {
		created.setText(DublinCoreImpl.createISO8601DateString(Calendar
				.getInstance().getTime()));
		creator.setText(System.getProperty("user.name")); 
		publisher.setText(Messages.getString("dc_publisher"));
		license.setText(Messages.getString("dc_license"));
	} // initializeDCFields

	/**
	 * @param attributeName
	 *            the name of the {@link DublinCore} attribute that will be seen
	 *            by the user.
	 * @param toolTip
	 *            the tool tip text for the attribute
	 * @param requiredField
	 *            if <code>true</code> then the attribute is visually marked
	 *            with the {@link #REQUIRED_FIELD_CHAR} as being "required"
	 * @param validatingField
	 *            if <code>true</code> the value of the attribute is examined
	 *            by {@link #validateDublinCorePage()} to validate the page
	 * @return a labeled text attribute
	 */
	private Text createDCAttribute(final Composite parent,
			final String attributeName, final String toolTip,
			final boolean requiredField, final boolean validatingField) {
		final Label attributeLabel = new Label(parent, SWT.NONE);
		attributeLabel.setText(attributeName + ":" //$NON-NLS-1$
				+ (requiredField ? REQUIRED_FIELD_CHAR : "")); //$NON-NLS-1$
		final GridData labelLayoutData = new GridData();
		labelLayoutData.horizontalSpan = 1;
		attributeLabel.setLayoutData(labelLayoutData);

		final Text retValue = new Text(parent, SWT.BORDER);
		retValue.setToolTipText(toolTip);
		final GridData layoutData = new GridData();
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.grabExcessHorizontalSpace = true;
		labelLayoutData.horizontalSpan = 1;
		retValue.setLayoutData(layoutData);

		// Is this attribute to be watched for validity?
		if (validatingField) {
			// Yes
			retValue.addModifyListener(dcValidator);
		}

		return retValue;
	} // createDCAttribute

	/**
	 * @return <code>true</code> if the values of the attributes of the
	 *         {@link DublinCorePage} are valid.
	 */
	protected boolean validateDublinCorePage() {
		boolean retValue = true;

		setErrorMessage(null);

		// Is there a title?
		
		// Title not mandatory any longer
//		if (title.getText() == null || title.getText().equals("")) { //$NON-NLS-1$
//			setErrorMessage(Messages.getString("NDublinCore.titleErr")); //$NON-NLS-1$
//			retValue = false;
//		} // if title

		// Is there a created date?
		if (retValue == true
				&& (created.getText() != null && !created.getText().equals(""))) { //$NON-NLS-1$
			// Yes
			// Is the format valid?
			if (!isValidDateString(created.getText())) {
				// No
				setErrorMessage(Messages.getString("NDublinCore.createdErr")); //$NON-NLS-1$
				retValue = false;
			}
		} // if created date

		// Is there a date?
		if (retValue == true
				&& (date.getText() != null && !date.getText().equals(""))) { //$NON-NLS-1$
			// Yes
			// Is the format valid?
			if (!isValidDateString(date.getText())) {
				// No
				setErrorMessage(Messages.getString("NDublinCore.dateErr")); //$NON-NLS-1$
				retValue = false;
			}
		} // if date

		// Is there a valid range
		if (retValue == true
				&& (valid.getText() != null && !valid.getText().equals(""))) { //$NON-NLS-1$
			// Yes
			// Is the format valid?
			if (!isValidValidDateString(valid.getText())) {
				// No
				setErrorMessage(Messages.getString("NDublinCore.validErr")); //$NON-NLS-1$
				retValue = false;
			}
		} // if date

		return retValue;
	} // validateDublinCorePage

	/**
	 * @param validDataRangeString
	 *            a date string that conforms to ISO&nbsp;8601 <a
	 *            href="http://www.w3.org/TR/NOTE-datetime">
	 *            http://www.w3.org/TR/NOTE-datetime</a>
	 * @return <code>true</code> if the valid date range string is properly
	 *         formatted, <code>false</code> otherwise.
	 */
	protected static boolean isValidValidDateString(
			final String validDataRangeString) {
		// TODO should probably test isEndBeforeStart as well
		return DublinCoreImpl.isValidStartDateValid(validDataRangeString)
				&& DublinCoreImpl.isValidEndDateValid(validDataRangeString);
	} // isValidValidDateString

	protected static boolean isValidDateString(final String dateString) {
		boolean retValue = false;
		final String trimedDateString = dateString.trim();
		try {
			// Is it the right length?
			if (trimedDateString.length() != "yyyy-dd-mm".length()) { //$NON-NLS-1$
				// No
				return false;
			}

			DublinCoreImpl.createDateFromISO8601DateString(dateString);
			// If there's no parse exception, the string is valid
			retValue = true;
		} catch (final ParseException e) {
			retValue = false;
		}
		return retValue;
	} // isValidDateString

	/**
	 * @param startDateString
	 *            a date string that conforms to ISO&nbsp;8601 <a
	 *            href="http://www.w3.org/TR/NOTE-datetime">
	 *            http://www.w3.org/TR/NOTE-datetime</a>
	 * @param endDateString
	 *            a date string that conforms to ISO&nbsp;8601 <a
	 *            href="http://www.w3.org/TR/NOTE-datetime">
	 *            http://www.w3.org/TR/NOTE-datetime</a>
	 * @return <code>true</code> if the date represented by
	 *         <code>endDateString</code> is before the date represented by
	 *         <code>startDateString</code>
	 */
	public static boolean isEndBeforeStart(final String startDateString,
			final String endDateString) {
		boolean retValue = false;
		try {
			final Date startDate = DublinCoreImpl
					.createDateFromISO8601DateString(startDateString);
			final Date endDate = DublinCoreImpl
					.createDateFromISO8601DateString(endDateString);
			retValue = endDate.before(startDate);
		} catch (final ParseException e) {
			retValue = true;
		} // catch
		return retValue;
	} // isEndBeforeStart
	
	
	/**
	 * 
	 * @param dublinCore
	 */
	public void updateDublinCorePage(DublinCore dublinCore) {
		
		
		///////////////////////////////////////////////////////////////////
		//
		// right now the plugin.xml sets the description, source, and title...
		//
		String str = dublinCore.getTitle();
		if(str != null) this.setTitleText(str);
		
		str = dublinCore.getDescription();
		if(str != null) this.setDescriptionText(str);
		
		str = dublinCore.getSource();
		if(str !=null) this.setSource(str);
		
		str = dublinCore.getPublisher();
		if(str !=null) this.setPublisher(str);
		
		str = dublinCore.getLicense();
		if(str !=null) this.setLicense(str);
		//
		///////////////////////////////////////////////////////////////////
	}

	/**
	 * @return a {@link DublinCore} instance initialized from the contents of
	 *         this {@link DublinCorePage}
	 */
	public DublinCore createDublinCore() {
		final DublinCore retValue = CommonFactory.eINSTANCE.createDublinCore();

		if (isSet(titleTextField.getText())) {
			retValue.setTitle(titleTextField.getText());
		}
		if (isSet(descriptionTextField.getText())) {
			retValue.setDescription(descriptionTextField.getText());
		}
		if (isSet(creator.getText())) {
			retValue.setCreator(creator.getText());
		}
		if (isSet(date.getText())) {
			retValue.setDate(date.getText());
		}
		if (isSet(format.getText())) {
			retValue.setFormat(format.getText());
		}
		if (isSet(publisher.getText())) {
			retValue.setPublisher(publisher.getText());
		}
		if (isSet(coverage.getText())) {
			retValue.setCoverage(coverage.getText());
		}
		if (isSet(contributor.getText())) {
			retValue.setContributor(contributor.getText());
		}
		if (isSet(relation.getText())) {
			retValue.setRelation(relation.getText());
		}
		if (isSet(rights.getText())) {
			retValue.setRights(rights.getText());
		}
		if (isSet(source.getText())) {
			retValue.setSource(source.getText());
		}
		if (isSet(subject.getText())) {
			retValue.setSubject(subject.getText());
		}
		if (isSet(type.getText())) {
			retValue.setType(type.getText());
		}
		if (isSet(language.getText())) {
			retValue.setBibliographicCitation(language.getText());
		}
		if (isSet(bibliographicCitation.getText())) {
			retValue.setBibliographicCitation(bibliographicCitation.getText());
		}
		if (isSet(created.getText())) {
			retValue.setCreated(created.getText());
		}
		if (isSet(license.getText())) {
			retValue.setLicense(license.getText());
		}
		if (isSet(required.getText())) {
			retValue.setRequired(required.getText());
		}
		if (isSet(spatial.getText())) {
			retValue.setSpatial(spatial.getText());
		}
		if (isSet(valid.getText())) {
			retValue.setValid(valid.getText());
		}

		return retValue;
	} // createDublinCore

	/**
	 * @param text
	 *            a String
	 * @return <code>true</code> if the string is not null nor the empty
	 *         string
	 * @see #createDublinCore()
	 */
	private boolean isSet(final String text) {
		return !(text == null || text.equals("")); //$NON-NLS-1$
	}
	
	
	/**
	 * 
	 * @param titlenSTR
	 */
	public void setTitleText(String titleSTR) {
		if(titleTextField != null)
		titleTextField.setText(titleSTR);
	}

	/**
	 * 
	 * @param descriptionSTR
	 */
	public void setDescriptionText(String descriptionSTR) {
		if(descriptionTextField != null)
		descriptionTextField.setText(descriptionSTR);
	}

	/**
	 * 
	 * @param creatorSTR
	 */
	public void setCreator(String creatorSTR) {
		if(creator != null)
		creator.setText(creatorSTR);
	}

	/**
	 * 
	 * @param dateSTR
	 */
	public void setDate(String dateSTR) {
		if(date != null)
		date.setText(dateSTR);
	}

	/**
	 * 
	 * @param formatSTR
	 */
	public void setFormat(String formatSTR) {
		if(format != null)
		format.setText(formatSTR);
	}

	/**
	 * 
	 * @param publisherSTR
	 */
	public void setPublisher(String publisherSTR) {
		if(publisher != null)
		publisher.setText(publisherSTR);
	}

	/**
	 * 
	 * @param coverageSTR
	 */
	public void setCoverage(String coverageSTR) {
		if(coverage != null)
		coverage.setText(coverageSTR);
	}

	/**
	 * 
	 * @param contributorSTR
	 */
	public void setContributor(String contributorSTR) {
		if(contributor != null)
		contributor.setText(contributorSTR);
	}

	/**
	 * 
	 * @param relationSTR
	 */
	public void setRelation(String relationSTR) {
		if(relation != null)
		relation.setText(relationSTR);
	}

	/**
	 * 
	 * @param rightsSTR
	 */
	public void setRights(String rightsSTR) {
		if(rights != null)
		rights.setText(rightsSTR);
	}

	/**
	 * 
	 * @param sourceSTR
	 */
	public void setSource(String sourceSTR) {
		if(source != null)
		source.setText(sourceSTR);
	}

	/**
	 * 
	 * @param subjectSTR
	 */
	public void setSubject(String subjectSTR) {
		if(subject != null)
		subject.setText(subjectSTR);
	}

	/**
	 * 
	 * @param typeSTR
	 */
	public void setType(String typeSTR) {
		if(type!= null)
		type.setText(typeSTR);
	}

	/**
	 * 
	 * @param languageSTR
	 */
	public void setLanguage(String languageSTR) {
		if(language != null)
		language.setText(languageSTR);
	}

	/**
	 * 
	 * @param bibliographicCitationSTR
	 */
	public void setBibliographicCitation(String bibliographicCitationSTR) {
		if(bibliographicCitation != null)
		bibliographicCitation.setText(bibliographicCitationSTR);
	}

	/**
	 * 
	 * @param createdSTR
	 */
	public void setCreated(String createdSTR) {
		if(created != null)
		created.setText(createdSTR);
	}

	/**
	 * 
	 * @param licenseSTR
	 */
	public void setLicense(String licenseSTR) {
		if(license != null)
		license.setText(licenseSTR);
	}

	/**
	 * 
	 * @param requiredSTR
	 */
	public void setRequired(String requiredSTR) {
		if(required != null)
		required.setText(requiredSTR);
	}

	/**
	 * 
	 * @param spatialSTR
	 */
	public void setSpatial(String spatialSTR) {
		if(spatial != null)
		spatial.setText(spatialSTR);
	}

	/**
	 * 
	 * @param validSTR
	 */
	public void setValid(String validSTR) {
		if(valid != null)
		valid.setText(validSTR);
	}
	
	
	
	
} // DublinCorePage
