package org.eclipse.stem.ui.grapheditor.handlers;

/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 *    Bob Foster <bob@objfac.com>
 *     - Fix for bug 23025 - SaveAsDialog should not assume what is being saved is an IFile
 *    Benjamin Muskalla <b.muskalla@gmx.net>
 *     - Fix for bug 82541 - [Dialogs] SaveAsDialog should better handle closed projects
 *******************************************************************************/

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.osgi.util.TextProcessor;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.ui.Utility;
import org.eclipse.stem.ui.grapheditor.GraphEditorMessages;
import org.eclipse.stem.ui.views.explorer.IdentifiableTreeNode;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

/**
 * A standard "Save As" dialog which solicits a path from the user. The
 * <code>getResult</code> method returns the path. Note that the folder at the
 * specified path might not exist and might need to be created.
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 * 
 * @see org.eclipse.ui.dialogs.ContainerGenerator
 * @noextend This class is not intended to be subclassed by clients.
 */
public class SaveInProjectDialog extends TitleAreaDialog {

	private IPath result;

	private Text resourceNameField;
	private Button okButton;
	private Combo projectCombo;

	/**
	 * Creates a new Save As dialog for no specific file.
	 * 
	 * @param parentShell
	 *            the parent shell
	 */
	public SaveInProjectDialog(Shell parentShell) {
		super(parentShell);
	}

	/*
	 * (non-Javadoc) Method declared in Window.
	 */
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(GraphEditorMessages.getString("saveAs"));
	}

	/*
	 * (non-Javadoc) Method declared in Window.
	 */
	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitle(GraphEditorMessages.getString("saveAs"));
		setMessage(GraphEditorMessages.getString("saveToLocation"));

		okButton.setEnabled(false);
		resourceNameField.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				if (resourceNameField.getText().isEmpty()) {
					okButton.setEnabled(false);
				} else {
					okButton.setEnabled(true);
				}
			}
		});

		return contents;
	}

	/*
	 * (non-Javadoc) Method declared on Dialog.
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		okButton = createButton(parent, IDialogConstants.OK_ID,
				IDialogConstants.OK_LABEL, true);
		okButton.setEnabled(true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/*
	 * (non-Javadoc) Method declared on Dialog.
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		// top level composite
		Composite parentComposite = (Composite) super.createDialogArea(parent);

		// create a composite with standard margins and spacing
		Composite composite = new Composite(parentComposite, SWT.NONE);

		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setFont(parentComposite.getFont());

		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.GRAB_HORIZONTAL);
		data.widthHint = 250;

		Label selectProject = new Label(composite, SWT.None);
		selectProject.setText(GraphEditorMessages.getString("selectProject"));

		projectCombo = new Combo(composite, SWT.READ_ONLY);
		initializeProjectCombo(projectCombo);
		projectCombo.setLayoutData(data);

		new Label(composite, SWT.NONE);

		Label fileLabel = new Label(composite, SWT.None);
		fileLabel.setText(GraphEditorMessages.getString("nameOfGraphFile"));

		resourceNameField = new Text(composite, SWT.BORDER);
		resourceNameField.setLayoutData(data);

		return parentComposite;
	}

	/**
	 * Returns the full path entered by the user.
	 * <p>
	 * Note that the file and container might not exist and would need to be
	 * created. See the <code>IFile.create</code> method and the
	 * <code>ContainerGenerator</code> class.
	 * </p>
	 * 
	 * @return the path, or <code>null</code> if Cancel was pressed
	 */
	public IPath getResult() {
		return result;
	}

	/*
	 * (non-Javadoc) Method declared on Dialog.
	 */
	@Override
	protected void okPressed() {
		// Get new path.
		IProject pro = getSTEMProjects().get(projectCombo.getSelectionIndex());
		String projectPath = pro.getFullPath().toPortableString();
		String filePath = resourceNameField.getText();
		IPath path = new Path(TextProcessor.deprocess(projectPath + "/graphs/"
				+ filePath)).makeAbsolute();

		// If the user does not supply a file extension and if the save
		// as dialog was provided a default file name append the extension
		// of the default filename to the new name
		if (path.getFileExtension() == null) {
			path = path.addFileExtension("graph");
		}

		// If the path already exists then confirm overwrite.
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		if (file.exists()) {
			String[] buttons = new String[] { IDialogConstants.YES_LABEL,
					IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL };
			String question = NLS.bind(
					GraphEditorMessages.getString("replaceFile"),
					path.toString());
			MessageDialog d = new MessageDialog(getShell(), "Question", null,
					question, MessageDialog.QUESTION, buttons, 0) {
				protected int getShellStyle() {
					return super.getShellStyle() | SWT.SHEET;
				}
			};
			int overwrite = d.open();
			switch (overwrite) {
			case 0: // Yes
				break;
			case 1: // No
				return;
			case 2: // Cancel
			default:
				cancelPressed();
				return;
			}
		}

		// Store path and close.
		result = path;
		close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#isResizable()
	 */
	@Override
	protected boolean isResizable() {
		return true;
	}

	private void initializeProjectCombo(final Combo projectCombo) {

		IProject selectedProject = getWorkSpaceSelectedProject();

		if (selectedProject == null)
			selectedProject = getSTEMProjects().get(0);

		// Get the Projects that are STEM projects
		int index = 0;
		int i = 0;
		for (final IProject project : getSTEMProjects()) {
			// Is the STEM project selected?
			if (project.equals(selectedProject)) {
				// Yes
				index = i;
			}

			final String projectName = project.getName();
			projectCombo.add(projectName);
			i++;
		} // for each STEM project
		projectCombo.setFocus();
		projectCombo.select(index);
		// NewIdentifiablePage.lastProject = this.getSelectedProject();
	} // initializeProjectField

	private List<IProject> getSTEMProjects() {
		// Refresh
		List<IProject> stemProjects = Utility.getSTEMProjectsFromWorkspace();
		return stemProjects;
	} // getSTEMProjects

	private IProject getWorkSpaceSelectedProject() {
		IProject retValue = null;
		// Find the name of the currently selected project, if there is one
		final ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getSelectionService()
				.getSelection();
		// Structured Selection that might have a project?
		if (selection instanceof IStructuredSelection) {
			for (Object obj : ((IStructuredSelection) selection).toList()) {
				// Project?
				if (obj instanceof IProject) {
					retValue = (IProject) obj;
					break;
				}
				// File or Folder? (in a Project)
				else if (obj instanceof IResource) {
					// Yes
					retValue = ((IResource) obj).getProject();
					break;
				} // else if File or Folder
					// Identifiable?
				else if (obj instanceof Identifiable) {
					final IPath path = new Path(((Identifiable) obj).getURI()
							.toPlatformString(true));
					retValue = ResourcesPlugin.getWorkspace().getRoot()
							.getFile(path).getProject();
					break;
				} // else if Identifiable
					// IdentifiableTreeNode?
				else if (obj instanceof IdentifiableTreeNode) {
					retValue = ((IdentifiableTreeNode) obj).getProject();
					break;
				} // else if IdentifiableTreeNode

			} // for each selected object
		} // if structured selection

		return retValue;
	} // getWorkSpaceSelectedProject
}
