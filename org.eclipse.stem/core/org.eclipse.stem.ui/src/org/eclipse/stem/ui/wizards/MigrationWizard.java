// NewIdentifiableWizard.java
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


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.stem.jobs.DisplaySafeExecutor;
import org.eclipse.stem.ui.migration.MigrationTask;
import org.eclipse.stem.ui.migration.MigrationTasksScheduler;
import org.eclipse.stem.ui.migration.MigrationUtil;
import org.eclipse.stem.ui.versioning.VersioningUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Version;

/**
 * The migration wizard migrates projects in the STEM workspace to the current STEM version
 * 
 */
public class MigrationWizard extends Wizard implements
		INewWizard {

	IWorkbench workbench;
	WizardPage introPage;
	ProjectsPage foundProjectsPage;
	
	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(final IWorkbench workbench,
			final IStructuredSelection selection) {
		this.workbench = workbench;
		setWindowTitle(Messages.getString("migration.wizard.title"));
		//setHelpAvailable(true);
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
		introPage = createIntroPage();
		foundProjectsPage = createProjectsPage();
		
		addPage(introPage);
		addPage(foundProjectsPage);
	} // addPages

	private WizardPage createIntroPage() {
		return new IntroPage();
	}


	private ProjectsPage createProjectsPage() {
		return new ProjectsPage();
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = super.getNextPage(page);
		// just to make sure
		if(nextPage instanceof ProjectsPage) {
			// Figure out what projects needs to be migrated and populate the list
			List<IProject> projsToMigrate = getWorkspaceSTEMProjectsToMigrate();
			for(IProject p:projsToMigrate)
				((ProjectsPage)nextPage).addProjectToMigrate(p);
		}
		return nextPage;
	}
	
	private List<IProject> getWorkspaceSTEMProjectsToMigrate() {
		ArrayList<IProject> result = new ArrayList<IProject>();
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		for (IProject project : ws.getRoot().getProjects()) {
			if(MigrationUtil.checkMigrationNeeded(project)) {
				result.add(project);
			}
		}
		return result;
	}
	
	public class IntroPage extends WizardPage {

		/**
		 * Default Constructor
		 */
		protected IntroPage() {
			super(Messages.getString("migration.wizard.intropage.title")); //$NON-NLS-1$
			setTitle(Messages.getString("migration.wizard.intropage.title")); //$NON-NLS-1$
			setDescription(Messages.getString("migration.wizard.intropage.description")); //$NON-NLS-1$
		} // IntroPage

		/**
		 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		public void createControl(final Composite parent) {
			// Creates a {@link Composite} and calls {@link
			// #setControl(org.eclipse.swt.widgets.Control)}

			final Composite pageComposite = new Composite(parent, SWT.None);
			final GridLayout pageCompositeLayout = new GridLayout();
			pageCompositeLayout.verticalSpacing = 12;
			pageCompositeLayout.numColumns = 2;
			pageCompositeLayout.marginHeight = 0;
			pageCompositeLayout.marginWidth = 0;
			pageComposite.setLayout(pageCompositeLayout);
			
			
			final GridData pageCompositeLayoutData = new GridData();
			pageCompositeLayoutData.grabExcessVerticalSpace = true;
			pageCompositeLayoutData.verticalAlignment = GridData.FILL;
			pageCompositeLayoutData.horizontalAlignment = GridData.FILL;
			pageCompositeLayoutData.horizontalSpan = 1;
			pageComposite.setLayoutData(pageCompositeLayoutData);

			Label introLabelField = new Label(pageComposite, SWT.NONE);
					
			introLabelField.setText(Messages.getString("migration.wizard.intropage.instructions"));
					

			setPageComplete(true);
			setControl(pageComposite);
		} // createControl

	} // Intro page
	
	
	public class ProjectsPage extends WizardPage {

		/**
		 * Default Constructor
		 */
		protected ProjectsPage() {
			super(Messages.getString("migration.wizard.projectspage.title")); //$NON-NLS-1$
			setTitle(Messages.getString("migration.wizard.projectspage.title")); //$NON-NLS-1$
			setDescription(Messages.getString("migration.wizard.projectspage.description")); //$NON-NLS-1$
		} // IntroPage

		ArrayList<Button> migrateProjectsButtons = new ArrayList<Button>();
		ArrayList<IProject> migrateProjects = new ArrayList<IProject>();
		Composite pageComposite;
		
		/**
		 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		public void createControl(final Composite parent) {
			// Creates a {@link Composite} and calls {@link
			// #setControl(org.eclipse.swt.widgets.Control)}

			// Page Composite
			final ScrolledComposite scrollComposite = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
			pageComposite = new Composite(scrollComposite, SWT.None);
			final GridLayout pageCompositeLayout = new GridLayout();
			pageCompositeLayout.verticalSpacing = 12;
			pageCompositeLayout.numColumns = 1;
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
					
			pageCompositeLayout.verticalSpacing = 12;
			pageCompositeLayout.numColumns = 1;
			pageCompositeLayout.marginHeight = 0;
			pageCompositeLayout.marginWidth = 0;
			pageComposite.setLayout(pageCompositeLayout);
			
			
			pageCompositeLayoutData.grabExcessVerticalSpace = true;
			pageCompositeLayoutData.verticalAlignment = GridData.FILL;
			pageCompositeLayoutData.horizontalAlignment = GridData.FILL;
			pageCompositeLayoutData.horizontalSpan = 1;
			pageComposite.setLayoutData(pageCompositeLayoutData);
					
			setPageComplete(isCompleted());
			setControl(pageComposite);
		} // createControl
		
		public boolean isCompleted() {
			for(Button b:migrateProjectsButtons)
				if(b.getSelection()) return true;
			return false;
		}
		
		public void addProjectToMigrate(IProject project) {
			if(migrateProjects.contains(project))
				return;
			migrateProjects.add(project);
			
			Button newButton = new Button(pageComposite, SWT.CHECK);
			newButton.setText(project.getName());
			newButton.setSelection(true);
			
			GridData buttonLayoutData = new GridData();
			buttonLayoutData.horizontalSpan = 1;
			newButton.setLayoutData(buttonLayoutData);
			
			migrateProjectsButtons.add(newButton);
			newButton.addSelectionListener(new SelectionListener() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					setPageComplete(isCompleted());
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					setPageComplete(isCompleted());
				}
			});
			setPageComplete(isCompleted());
		}
		
		public List<IProject>getSelectedProjects() {
			ArrayList<IProject> result = new ArrayList<IProject>();
			for(int i=0;i<migrateProjectsButtons.size();++i) {
				if(migrateProjectsButtons.get(i).getSelection())
					result.add(migrateProjects.get(i));
			}
			return result;
		}
	} // 
	
	
	@Override
	public boolean performFinish() {
		final List<IProject> projectsToMigrate = foundProjectsPage.getSelectedProjects();
		
		DisplaySafeExecutor.executeSync(new Runnable() {
			
			@Override
			public void run() {
				
				Version stemVersion = VersioningUtil.getSTEMVersion();
				MigrationTasksScheduler scheduler = MigrationTasksScheduler.getInstance();
				for(IProject p:projectsToMigrate) {
					Version projVersion = VersioningUtil.getSTEMProjectVersion(p);
					List<MigrationTask> tasks = scheduler.getTasks(projVersion, stemVersion);
					for(MigrationTask task:tasks)
						task.executeTask(p);
				}
			}
		});
		
		return true;
	}

	
	/**
	 * Command handler to bring up migration wizard
	 */
	public static class MigrationWizardCommandHandler extends
			AbstractHandler implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final MigrationWizard wizard = new MigrationWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new WizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} // 
} // MigrationWizard
