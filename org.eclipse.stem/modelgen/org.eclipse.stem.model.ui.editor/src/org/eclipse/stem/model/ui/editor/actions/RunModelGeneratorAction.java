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
package org.eclipse.stem.model.ui.editor.actions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.transform.ModelGenerator;
import org.eclipse.stem.model.ui.editor.ModelDiagramEditor;
import org.eclipse.stem.model.ui.editor.vismodel.provider.VisualMetamodelEditPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class RunModelGeneratorAction extends Action {
	protected ModelDiagramEditor editor;
	protected Package metamodel;

	protected boolean forceConfirm = false, saveConfirm = false;

	public RunModelGeneratorAction(ModelDiagramEditor editor) {
		this.editor = editor;
		this.metamodel = editor.getMetamodel();
	}

	private Shell getShell() {
		return editor.getSite().getShell();
	}

	/**
	 * @return Whether the user accepted force regeneration
	 */
	private boolean confirmForceRegen() {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				forceConfirm = MessageDialog
						.openConfirm(getShell(), "Regeneration not required",
								"The project does not need regeneration.  Run generator anyway?");
			}
		});

		return forceConfirm;
	}

	/**
	 * @return Whether the user accepted save-and-generate
	 */
	private boolean confirmSave() {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				saveConfirm = MessageDialog
						.openConfirm(
								getShell(),
								"Save Model",
								"You must save the metamodel before running the model generator.  Save and continue?");
			}
		});

		return saveConfirm;
	}

	/**
	 * Opens the metamodel error dialog
	 */
	private void openMetamodelErrorDialog() {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				MessageDialog.openError(getShell(), "Error",
						"No metamodel available to generate");
			}
		});
	}

	/**
	 * Runs various checks on the metamodel to decide if generation should proceed
	 * @param monitor
	 * @throws CoreException
	 */
	private void runValidateMetamodel(final IProgressMonitor monitor)
			throws CoreException {
        SubMonitor subMonitor = SubMonitor.convert(monitor, "Validating Metamodel", 10);
		try {
			
			
			// Check if editor needs to be saved
			if (editor.isDirty()) {
				// If user declines save, then cancel
				if (!confirmSave()) {
					subMonitor.setCanceled(true);
				}
			}

			if (subMonitor.isCanceled()) {
				return;
			}

			// Check that we have a valid metamodel
			if (editor.getMetamodel() == null) {
				openMetamodelErrorDialog();
				subMonitor.setCanceled(true);
			}

			if (subMonitor.isCanceled()) {
				return;
			}
			
			try {
				// Check to see if model structure is out of date, needs regeneration
				if (!editor.needsModelRegeneration(subMonitor.split(10))) {
					// If no, and user says don't force, then cancel
					if (!confirmForceRegen()) {
						subMonitor.setCanceled(true);
					}
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

			if (subMonitor.isCanceled()) {
				return;
			}
		} finally {
			//monitor.done();
		}

	}

	/**
	 * Execute steps to run the model generator
	 * @param monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	private void runModelGenerator(final IProgressMonitor monitor)
			throws CoreException, IOException {
        final SubMonitor subMonitor = SubMonitor.convert(monitor, "Running Model Generator", 10);
		try {
			// IF the editor has unsaved changes, then save 
			// the metamodel before continuing
			if (editor.isDirty()) {
				subMonitor.subTask("Saving metamodel");
				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						editor.doSave(subMonitor.split(1));
					}
				});

			}

			if (subMonitor.isCanceled()) {
				return;
			}

			// If all is good, then run the model generator
			ModelGenerator.run(metamodel, subMonitor.split(1));
		} finally {
			//monitor.done();
		}
	}

	@Override
	public void run() {
		try {
			ProgressMonitorDialog pmdialog = new ProgressMonitorDialog(
					getShell());

			pmdialog.run(true, true, new WorkspaceModifyOperation() {

				@Override
				protected void execute(final IProgressMonitor monitor)
						throws CoreException, InvocationTargetException,
						InterruptedException {
			        SubMonitor subMonitor = SubMonitor.convert(monitor, "Model Generator", 10);
					try {
						runValidateMetamodel(subMonitor.split(1));
						if (monitor.isCanceled()) {
							return;
						}
						runModelGenerator(subMonitor.split(9));
					} catch (Throwable t) {
						handleThrowable(t);
					} finally {
						//monitor.done();
					}
				}
			});
			
			if (!pmdialog.getProgressMonitor().isCanceled()) { 
				editor.reload();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		
		//editor.reload();
	}

	private void handleThrowable(Throwable t) {
		IStatus status = new Status(Status.ERROR,
				VisualMetamodelEditPlugin.PLUGIN_ID, t.getMessage(), t);

		VisualMetamodelEditPlugin.log(status);

		ErrorDialog.openError(getShell(), "Model Regeneration Error", null,
				status);
	}

}
