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
package org.eclipse.stem.model.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.transform.ModelGenerator;
import org.eclipse.stem.model.ui.MetamodelEditorPlugin;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class ModelGeneratorWizard extends Wizard implements INewWizard {
	protected IStatus status;

	protected PackagePropertiesPage packagePage;
	protected GeneratorOptionsPage advancedOptionsPage;

	protected Package modelPackage;

	protected URI metamodelURI;
	protected IWorkbench workbench;
	
	public ModelGeneratorWizard(Package pkg) {
		super();
		setNeedsProgressMonitor(true);
		this.modelPackage = pkg;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
	}
	
	public void setPackage(Package pkg) {
		modelPackage = pkg;
		if (packagePage != null) {
			packagePage.setPackage(modelPackage);
		}
		if (advancedOptionsPage != null) {
			advancedOptionsPage.setPackage(modelPackage);
		}
	}

	@Override
	public void addPages() {
		packagePage = new PackagePropertiesPage(modelPackage);
		advancedOptionsPage = new GeneratorOptionsPage(modelPackage);
		addPage(packagePage);
		addPage(advancedOptionsPage);
	}


	@Override
	public boolean performFinish() {
		packagePage.applyChanges();

		boolean done = true;
		try {
			getContainer().run(true, true, new WorkspaceModifyOperation() {

				@Override
				protected void execute(IProgressMonitor monitor)
						throws CoreException, InvocationTargetException,
						InterruptedException {
					status = Status.OK_STATUS;
			        SubMonitor subMonitor = SubMonitor.convert(monitor, "Generating Models ", 100);

					try {

						ModelGenerator generator = new ModelGenerator(modelPackage);
						generator.transform(subMonitor.split(10));
						generator.generate(subMonitor.split(90));
						
						metamodelURI = generator.getMetaModel().eResource().getURI();
						
//						String pluginName = generator.getGeneratedModelPluginID();
					

//						MetamodelEditorPlugin.getPlugin().getBundle().getBundleContext().
						
//						IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
//						//IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//						
//						IWorkbenchPage page = window.getActivePage();
//						
//						IWorkbenchPart part = page.getActivePart();
//						
//						
//						IWorkspaceRoot wsr = ResourcesPlugin.getWorkspace().getRoot();
//						
//						IProject proj = wsr.getProject("org.eclipse.stem.diseasemodels.swinesalmonella");
//						if (proj.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
//							IJavaProject javaProject = JavaCore.create(proj);
//							
////							PlatformUI.getWorkbench().getViewRegistry().find("asdf").
//							
//
////							PlatformUI.getWorkbench().
//
//							final IStructuredSelection selection = new StructuredSelection(javaProject);
//							final OrganizeImportsAction action = new OrganizeImportsAction(part.getSite());
//
//							
//							Job job = new UIJob("asdf") {
//								
//								@Override
//								public IStatus runInUIThread(IProgressMonitor monitor) {
//									action.run((IStructuredSelection)selection);
//									return Status.OK_STATUS;
//								}
//							};
//							job.schedule();
////							job.join();
//							//printPackageInfos(javaProject);
//						}
						
						
					} catch (Throwable e) {
						status = new Status(Status.ERROR,
								MetamodelEditorPlugin.PLUGIN_ID,
								e.getMessage(), e);
						
						MetamodelEditorPlugin.log(status);
						
						throw new CoreException(status);
					} finally {
						//monitor.done();
					}
					
				}
			});

		} catch (Exception e) {
			// Nothing new to say for now
		} finally {
			if (status != null && status != Status.OK_STATUS) {
				done = false;
				ErrorDialog.openError(getShell(), "Error generating models",
						null, status);
			}
		}

		if (done && metamodelURI != null) {
			WizardHelper.openEditor(PlatformUI.getWorkbench(), metamodelURI);
		}
		
		return done;
	}





}