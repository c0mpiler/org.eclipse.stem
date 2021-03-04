package org.eclipse.stem.ui.widgets;

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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.wizards.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

public class RefactorWizard extends Wizard {

	@SuppressWarnings("unused")
	private String title;
	boolean cancelPressed = false;
	Identifiable identifiable;
	XMIResource resource;
	String value;
	IProject project;
	boolean delete = false; // If delete instead of rename
	boolean dependenciesLoadNeeded = true;

	String fullNewName;
	String newNamePrefix = Messages.getString("NEW_PREFIX");
	@SuppressWarnings("unused")
	private IWorkbench workbench;

	private boolean updateReferences = false;

	WizardPage namePage = null;
	WizardPage dependenciesPage = null;

	Button [] updateButtons;
	Label [] identLabels;

	Composite checkboxesAndAffectedObjectsComposite;
	Button updateRefButton;

	String IDENTIFIABLE_KEY = "IDENTIFIABLE";

	List<URI> changedResources = new ArrayList<URI>();

	public RefactorWizard (Identifiable ident, XMIResource res, boolean delete) {
		this.identifiable = ident;
		this.resource = res;
		this.delete = delete;
	}

	/**
	 * The wizard page where the new name is entered.
	 * @return The String[] with results, or null if cancel was pressed.
	 */
	public IWizardPage  getFirstPage () {
		if(namePage != null) return namePage;
		// final RefactorWizard self = this;

		WizardPage ret = new WizardPage(delete? Messages.getString("DELETE_TITLE"):Messages.getString("RENAME_TITLE")) {

			@Override
			public void createControl(Composite parent) {
				//final Shell shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
				//shell.setText(title);
				Composite container = new Composite(parent, SWT.NONE);
				GridLayout gl = new GridLayout();
				gl.numColumns = 2;
				container.setLayout(gl);

				if(!delete) {
					GridData lgd = new GridData();
					lgd.horizontalSpan = 1;
					Label nn_label = new Label(container, SWT.NONE);
					nn_label.setText(Messages.getString("REFACTOR_NEW_NAME_TITLE"));
					nn_label.setLayoutData(lgd);

					GridData gd = new GridData();
					gd.horizontalSpan = 1;
					final Text text = new Text(container, SWT.NONE);
					if(identifiable != null) {
						String val = newNamePrefix+identifiable.getURI().lastSegment();
						text.setText(val);
						fullNewName = getFullNewName(val);
						value = val;
					}
					text.setLayoutData(gd);
					gd.minimumWidth = 100;
					gd.grabExcessHorizontalSpace = true;

					final WizardPage p_self = this;
					text.addModifyListener(new ModifyListener() {

						public void modifyText(ModifyEvent arg0) {
							String newName = getFullNewName(text.getText());
							File f = new File(newName);
							if(f.exists() || text.getText().trim().equals("") || text.getText().equals(identifiable.getURI().lastSegment())) {
								p_self.setErrorMessage(Messages.getString("REFACTOR_INVALID_NAME"));
								p_self.setPageComplete(false);
							} else {
								//okayButton.setEnabled(true);
								value = text.getText();
								fullNewName = newName;
								p_self.setErrorMessage(null);
								p_self.setPageComplete(true);
							}
						}
					});
				} else {
					GridData lgd = new GridData();
					lgd.horizontalSpan = 1;
					Label nn_label = new Label(container, SWT.NONE);
					nn_label.setText(Messages.getString("REFACTOR_DELETE")+identifiable.getURI().toString());
					nn_label.setLayoutData(lgd);

				}

				GridData urGD = new GridData();
				urGD.horizontalSpan = 2;
				updateRefButton = new Button(container, SWT.CHECK);
				updateRefButton.setText(Messages.getString("REFACTOR_UPDATE_REFERENCES"));
				updateRefButton.setLayoutData(urGD);
				updateRefButton.setSelection(updateReferences);

				updateRefButton.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						updateReferences = updateRefButton.getSelection();
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						updateReferences = updateRefButton.getSelection();
					}
				});

				this.setControl(container);
			}
		};
		namePage = ret;
		return ret;
	}
	private String getFullNewName(String nn) {
		URI oldURI = identifiable.getURI();
		String path = oldURI.toString();
		int ind  = path.lastIndexOf("/");
		String truncpath = "";
		if(ind != -1) truncpath = path.substring(0, ind+1);

		String newpath = truncpath+nn;
		return newpath;

	}
	/** 
	 * Retrieve the new name
	 * @return The String[] with results, or null if cancel was pressed.
	 */
	public IWizardPage  getDependenciesPage () {
		if(dependenciesPage != null) return dependenciesPage;
		WizardPage ret = new WizardPage(Messages.getString("REFACTOR_DEPENDENCIES_FOUND")) {

			@Override
			public void createControl(Composite parent) {
				//final Shell shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
				//shell.setText(title);
				Composite container = new Composite(parent, SWT.NONE);
				GridLayout gl = new GridLayout();
				gl.numColumns = 2;
				container.setLayout(gl);

				Label depLabel = new Label(container, SWT.NONE);
				GridData depGD = new GridData();
				depLabel.setLayoutData(depGD);
				depGD.horizontalSpan = 2;
				depLabel.setText(Messages.getString("REFACTOR_CHANGES_TO_BE_MADE"));

				checkboxesAndAffectedObjectsComposite = new Composite(container, SWT.NONE);
				GridData gdCheck = new GridData();
				gdCheck.horizontalSpan = 2;
				checkboxesAndAffectedObjectsComposite.setLayoutData(gdCheck);
				GridLayout gl2 = new GridLayout();
				gl2.numColumns = 2;
				checkboxesAndAffectedObjectsComposite.setLayout(gl2);

				this.setControl(container);
			}
		};

		dependenciesPage = ret;
		return ret;
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		this.workbench = workbench;
		setWindowTitle(Messages.getString("REFACTOR"));
		setHelpAvailable(true);

	} // init


	/**
	 * Create the {@link Wizard}'s pages.
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		setForcePreviousAndNextButtons(false);

		addPage(getFirstPage());
		addPage(getDependenciesPage());
	} // addPages

	/**
	 * @param page
	 *            the {@link IWizardPage} page currently being displayed.
	 * @return the next {@link IWizardPage} to be displayed to the user.
	 */
	@Override
	public IWizardPage getNextPage(final IWizardPage page) {
		final IWizardPage nextPage = super.getNextPage(page);

		if(nextPage == dependenciesPage) {
			try {
				fetchDependenciesAndBuildTable();
			} catch(CoreException ce) {
				Activator.logError("Exception fetching resources to modify", ce);
			}
		} else if(!updateReferences) {
			clearDependenciesUI();
		}
		return nextPage;
	} // getNextPage


	private void fetchDependenciesAndBuildTable() throws CoreException {
		if(dependenciesLoadNeeded && updateReferences) {
			changedResources = Utility.findReferences(this.identifiable);
			dependenciesLoadNeeded = false;
		}

		clearDependenciesUI();

		if(updateReferences) {
			updateButtons = new Button[changedResources.size()];
			identLabels = new Label[changedResources.size()];
	
			int i=0;
			
				for(URI uri :changedResources) {	
					updateButtons[i] = new Button(checkboxesAndAffectedObjectsComposite, SWT.CHECK);
					GridData gdButt = new GridData();
					gdButt.horizontalSpan = 1;
					updateButtons[i].setLayoutData(gdButt);
					updateButtons[i].setSelection(true);
	
					identLabels[i] = new Label(checkboxesAndAffectedObjectsComposite, SWT.NONE);
					identLabels[i].setText(uri.toString());
					GridData gdLab = new GridData();
					gdLab.horizontalSpan = 1;
					identLabels[i].setLayoutData(gdLab);
					++i;
				}
		}
		checkboxesAndAffectedObjectsComposite.getParent().redraw();
		checkboxesAndAffectedObjectsComposite.getParent().layout();
		checkboxesAndAffectedObjectsComposite.redraw();
		checkboxesAndAffectedObjectsComposite.layout();
		
	}

	private void clearDependenciesUI() {
		if(updateButtons != null) {
			for(Button b:updateButtons) b.dispose();
		}
		if(identLabels != null) {
			for(Label l:identLabels) l.dispose();
		}
	}

	
	

	/**
	 * 
	 * @param updateIdent
	 * @param oldURI
	 * @param newIdentifiable
	 */
	@SuppressWarnings("unchecked")
	private void processIdentifiable(Identifiable updateIdent, URI oldURI, Identifiable newIdentifiable) {
		EList<EStructuralFeature> attrs = updateIdent.eClass().getEStructuralFeatures();
		
		Resource thisResource = updateIdent.eResource();
		for(EStructuralFeature ea:attrs) {
			if(ea instanceof EReference) {	
				EReference ref = (EReference)ea;
				if(updateIdent.eIsSet(ref)) {
					Object val = updateIdent.eGet(ref, true);
					if(val instanceof EList) {
						EList<EObject> references = (EList<EObject>)val; 
						for(int index=0;index<references.size();++index) {
							EObject eo = references.get(index);
							if(eo.eIsProxy() || (eo.eResource() != thisResource && eo.eResource() != null)) {
								if(eo instanceof Identifiable && ((Identifiable)eo).getURI().equals(oldURI))
									if(!delete) {
										references.set(index, newIdentifiable); 
										break; // assume a single reference in the list (safe?)
									} else {
										references.remove(index);
										break;
									}
							} else if(eo instanceof Identifiable && !(eo instanceof Graph)) // identifiable in same document. Keep digging, but skip graphs
								processIdentifiable((Identifiable)eo, oldURI, newIdentifiable);
						}
					} else if(val instanceof EObject) {
						EObject eo = (EObject)val;
						if(eo.eIsProxy() || (eo.eResource() != thisResource && eo.eResource() != null)) {
							if(eo instanceof Identifiable && ((Identifiable)eo).getURI().equals(oldURI))
								if(!delete) updateIdent.eSet(ref, newIdentifiable);
								else {
									updateIdent.eUnset(ref);
								}
						} else  if(eo instanceof Identifiable && !(eo instanceof Graph)) // identifiable in same document. Keep digging, but skip graphs
							processIdentifiable((Identifiable)eo, oldURI, newIdentifiable);
					}
				}
			}
		}
	}

	@Override
	public boolean performFinish() {
		if(dependenciesLoadNeeded && updateReferences) {
			try {
				changedResources = Utility.findReferences(this.identifiable);
			} catch(CoreException ce) {
				Activator.logError(ce.getMessage(), ce);
			}
			dependenciesLoadNeeded = false;
		}
		
		URI oldIdURI = identifiable.getURI();
		if(!delete) { // rename
			URI oldURI = resource.getURI();
			String s_newURI = oldURI.toString().substring(0, oldURI.toString().indexOf(oldURI.lastSegment()));
			String s_newIdURI = oldIdURI.toString().substring(0, oldIdURI.toString().indexOf(oldIdURI.lastSegment()));

			URI newURI = URI.createURI(s_newURI+value);
			URI newIDURI = URI.createURI(s_newIdURI+value);

			Identifiable newIdent=null;
			try {
				ArrayList<Identifiable>newlist = new ArrayList<Identifiable>();
				newIdent = (Identifiable)EcoreUtil.copy(identifiable);
				newIdent.setURI(newIDURI);
				newlist.add(newIdent);
				Utility.serializeIdentifiables(newlist, newURI);
			} catch(Exception e) {
				Activator.logError(e.getMessage(), e);
			}
			try {
				int i=0;
				for(URI uri:changedResources) {
					if(updateButtons == null || updateButtons[i] == null || updateButtons[i].getSelection()) {
						Identifiable ident = Utility.getIdentifiable(uri);
						this.processIdentifiable(ident, oldIdURI, newIdent); // update
						ident.eResource().save(Utility.EMF_SAVE_OPTIONS);
					}
					++i;
				}
				// Finally delete the old resource that was renamed anyway
				resource.delete(null);
			} catch(IOException ioe) {
				Activator.logError(ioe.getMessage(), ioe);
			}
		} else { // delete


			try {
				int i=0;
				for(URI uri:changedResources) {
					if(updateButtons == null || updateButtons[i] == null || updateButtons[i].getSelection()) {
						Identifiable ident = Utility.getIdentifiable(uri);
						this.processIdentifiable(ident, oldIdURI, null); // delete links
						ident.eResource().save(Utility.EMF_SAVE_OPTIONS);
					}
					++i;
				}

				if(resource != null) resource.delete(null);
			} catch(IOException ioe) {
				Activator.logError(ioe.getMessage(), ioe);
			}

			return true;
		}
		return true;
	}
}
