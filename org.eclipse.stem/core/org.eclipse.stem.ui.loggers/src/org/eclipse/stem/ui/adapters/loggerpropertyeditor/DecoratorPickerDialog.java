/******************************************************************************
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
package org.eclipse.stem.ui.adapters.loggerpropertyeditor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.ui.Utility;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

/**
 * UI Widget for selecting compartments from a list of projects
 * and associated decorators.
 *
 */
public class DecoratorPickerDialog extends Dialog
{

	private static final String DECORATORS_FOLDER_NAME = "decorators"; //$NON-NLS-1$
	
	private IProject project;
	private Set<String> selectedDecoratorProperties = new HashSet<String>();
	private IntegrationDecorator selectedDecorator = null;
	
	private Shell shell;
	private Composite mainComposite;
	private ListViewer availablePropertiesList, selectedPropertiesList;
	private Combo projectList;
	private ComboViewer decoratorList;
	
	private boolean cancelPressed = false;
	
	
	public DecoratorPickerDialog(Shell parent, int style, IProject project, Set<String> selectedDecoratorProperties) {
		super(parent, style);
		this.project = project;
		
		
		if (selectedDecoratorProperties != null) {
			this.selectedDecoratorProperties.addAll(selectedDecoratorProperties);
		}
	}
	
	public Set<String> getSelectedProperties()
	{
		return selectedDecoratorProperties;
	}
	
	public boolean open () {
		Shell parent = getParent();
		shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.MAX | SWT.APPLICATION_MODAL);
		
		shell.setMinimumSize( new Point(600, 400));
		shell.setLayout(new FillLayout());
		shell.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DPD_Title);
		
		shell.addListener(SWT.Resize, new Listener() {
		      public void handleEvent(Event e) {
		      }
		    });
		 
		// Main Layout & Composite
		GridLayout mainLayout = new GridLayout();
		mainLayout.numColumns = 3;
		mainLayout.makeColumnsEqualWidth = false;

		mainLayout.marginBottom = 0;
		mainLayout.marginTop = 0;
		mainLayout.verticalSpacing = 0;
		
		mainComposite = new Composite(shell, SWT.NONE);
		mainComposite.setLayout(mainLayout);
		
		
		// Project/Decorator selection lists
		createProjectDecoratorSelectorWidgets(mainComposite);
		
		// Compartment selection lists & buttons
		createCompartmentSelectorWidgets(mainComposite);

		// Dialog control buttons (OK/Cancel buttons)
		createDialogControlButtons(mainComposite);
		
		updateDecoratorsList();

		shell.pack();
		shell.open();

		Display display = parent.getDisplay();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) display.sleep();
		}
		return !cancelPressed;
	}// open()

	private void createProjectDecoratorSelectorWidgets(Composite parent)
	{
		Composite projectDecoratorSelectorComposite = new Composite(parent, SWT.NONE);

		GridData projectDecoratorSelectorCompositeData = new GridData();
		projectDecoratorSelectorCompositeData.grabExcessHorizontalSpace = true;
		projectDecoratorSelectorCompositeData.horizontalSpan = 3;
		projectDecoratorSelectorCompositeData.widthHint = 500;
		
		projectDecoratorSelectorComposite.setLayoutData(projectDecoratorSelectorCompositeData);
		
		GridLayout projectDecoratorSelectorLayout = new GridLayout(2, false);
		projectDecoratorSelectorComposite.setLayout(projectDecoratorSelectorLayout);
		
		Label projectLabel = new Label(projectDecoratorSelectorComposite, SWT.NONE);
		GridData projectLabelData = new GridData();
		projectLabelData.grabExcessHorizontalSpace = false;
		projectLabel.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DPD_Project);
		projectLabel.setLayoutData(projectLabelData);

		projectList = new Combo(projectDecoratorSelectorComposite, SWT.READ_ONLY);
		GridData projectListLayoutData = new GridData();
		projectListLayoutData.grabExcessHorizontalSpace = true;
		//projectListLayoutData.horizontalAlignment = GridData.FILL;
		projectList.setLayoutData(projectListLayoutData);
		
		String[] projectNames = getProjectList();
		projectList.setItems(projectNames);
		projectList.select(getProjectIndex(projectNames));
		projectList.setSize(projectList.computeSize(SWT.DEFAULT, SWT.DEFAULT, true));
		
		
		Label decoratorLabel = new Label(projectDecoratorSelectorComposite, SWT.NONE);
		GridData decoratorLabelData = new GridData();
		decoratorLabelData.grabExcessHorizontalSpace = false;
		decoratorLabel.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DPD_Decorator);
		decoratorLabel.setLayoutData(decoratorLabelData);
		
		decoratorList = new ComboViewer(projectDecoratorSelectorComposite, SWT.READ_ONLY);
		GridData decoratorListLayoutData = new GridData();
		decoratorListLayoutData.grabExcessHorizontalSpace = true;
		decoratorListLayoutData.minimumWidth = 300;
		//decoratorListLayoutData.horizontalAlignment = GridData.FILL;
		decoratorList.getCombo().setLayoutData(decoratorListLayoutData);
		decoratorList.getCombo().setSize(decoratorList.getCombo().computeSize(300, SWT.DEFAULT, true));
		
		projectList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedDecorator = null;
				updateDecoratorsList();
				updateAvailablePropertiesList();
			}
		});
		
		
		decoratorList.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selectedDecorator = null;
				Object selected = ((StructuredSelection)event.getSelection()).getFirstElement();
				if (selected instanceof IntegrationDecorator) {
					selectedDecorator = (IntegrationDecorator)selected;
				}
				updateAvailablePropertiesList();
				
			}
		});
		
		
		decoratorList.setContentProvider(new IStructuredContentProvider() {
		      public Object[] getElements(Object inputElement) {
		        return ((List<?>)inputElement).toArray();
		      }
		      
		      public void dispose() {
		      }

		      public void inputChanged(
		        Viewer viewer,
		        Object oldInput,
		        Object newInput) {
		      }
		    });
		    
		decoratorList.setLabelProvider(new LabelProvider() {
		      public Image getImage(Object element) {
		        return null;
		      }

		      public String getText(Object element) {
		    	IntegrationDecorator decorator = (IntegrationDecorator)element;
		    	return decorator.getURI().lastSegment();
		      }
		    });

	}
	
	private void createCompartmentSelectorWidgets(Composite parent)
	{
		// "Available Properties" label
		Label availablePropertiesLabel = new Label(parent, SWT.NONE);
		availablePropertiesLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
		availablePropertiesLabel.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DPD_AvailableProperties);
		
		// Grid filler
		Composite fillerComposite1 = new Composite(parent, SWT.NONE);
		fillerComposite1.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
		
		/// "Selected Properties" label
		Label selectedPropertiesLabel = new Label(parent, SWT.NONE);
		selectedPropertiesLabel.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT));
		selectedPropertiesLabel.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DPD_SelectedProperties);

		//////// Property Selector Controls //////////
		
		createAvailablePropertiesViewer(parent);
		createListControlButtons(parent);
		createSelectedPropertiesViewer(parent);
	}
	
	private void createDialogControlButtons(Composite parent)
	{
		Composite footerComposite = new Composite(parent, SWT.NONE);
		
		GridData footerLayoutData = new GridData();
		footerLayoutData.horizontalAlignment = SWT.END;
		footerLayoutData.grabExcessHorizontalSpace = true;
		footerLayoutData.horizontalSpan = 3;
		footerComposite.setLayoutData(footerLayoutData);
		
		RowLayout footerCompositeLayout = new RowLayout();
		footerCompositeLayout.fill = true;
		
		footerComposite.setLayout(footerCompositeLayout);
		
		final Button okayButton = new Button(footerComposite, SWT.NONE);
		okayButton.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DecoratorPickerDialog_DoneButton); 

		Button cancelButton = new Button(footerComposite, SWT.NONE);
		cancelButton.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DecoratorPickerDialog_CancelButton);

		okayButton.addSelectionListener( new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				cancelPressed=false;
				shell.dispose();
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
			}
		});
		
		cancelButton.addSelectionListener( new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				cancelPressed=true;
				shell.dispose();
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
			}
		});
	}
	
	private void createListControlButtons(Composite parent)
	{
		Composite listControlComposite = new Composite(parent, SWT.NONE);
		GridData listControlLayoutData = new GridData();
		listControlComposite.setLayoutData(listControlLayoutData);
		
		RowLayout listControlCompositeLayout = new RowLayout(SWT.VERTICAL);
		listControlCompositeLayout.justify = true;
		listControlCompositeLayout.pack = false;
		listControlComposite.setLayout(listControlCompositeLayout);
		
		Button addButton = new Button(listControlComposite, SWT.PUSH);
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addSelectedProperties(false);
			}
		});
		addButton.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DPD_AddButton);
		Button addAllButton = new Button(listControlComposite, SWT.PUSH);
		addAllButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				addSelectedProperties(true);
			}
		});
		addAllButton.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DPD_AddAllButton);
		Button removeButton = new Button(listControlComposite, SWT.PUSH);
		removeButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				removeSelectedProperties(false);
			}
		});
		removeButton.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DPD_RemoveButton);
		Button removeAllButton = new Button(listControlComposite, SWT.PUSH);
		removeAllButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				removeSelectedProperties(true);
			}
		});
		removeAllButton.setText(org.eclipse.stem.ui.adapters.loggerpropertyeditor.Messages.DPD_RemoveAllButton);
	}
	
	private void createSelectedPropertiesViewer(Composite parent)
	{
		selectedPropertiesList = new ListViewer(parent);

		org.eclipse.swt.widgets.List backingList = selectedPropertiesList.getList();
		backingList.setBounds(40, 20, 220, 100);
		GridData availablePropertiesListLayoutData = new GridData();
		availablePropertiesListLayoutData.widthHint = 500;
		availablePropertiesListLayoutData.heightHint = 300;
		availablePropertiesListLayoutData.grabExcessHorizontalSpace = true;
		availablePropertiesListLayoutData.grabExcessVerticalSpace = true;
		backingList.setLayoutData(availablePropertiesListLayoutData);
		
		
		selectedPropertiesList.setContentProvider(new IStructuredContentProvider() {
	      public Object[] getElements(Object inputElement) {
	    	  @SuppressWarnings("unchecked")
			Set<String> in = (Set<String>)inputElement;
	    	  
	        return in.toArray();
	      }
	      
	      public void dispose() {
	      }

	      public void inputChanged(
	        Viewer viewer,
	        Object oldInput,
	        Object newInput) {
	      }
	    });
	    
		selectedPropertiesList.setLabelProvider(new LabelProvider() {
	      public Image getImage(Object element) {
	        return null;
	      }

	      public String getText(Object element) {
	    	  String[] propertyElements = element.toString().split("\\#"); //$NON-NLS-1$
	    	  if (propertyElements.length > 1) {
	    		  String uri = propertyElements[0];
	    		  String property = propertyElements[1];
	    		  
	    		  
	    		  String[] uriElements = uri.split("\\/"); //$NON-NLS-1$
	    		  if (uriElements.length > 0) {
	    			  String project = uriElements[2];
	    			  String decorator = uriElements[4];
	    			  
	    			  return project + "/"+ decorator +":"+ property; //$NON-NLS-1$ //$NON-NLS-2$
	    		  }
	    	  }
	    	  
	    	  return element.toString();
	      }
	    });
	    
		selectedPropertiesList.addSelectionChangedListener(new ISelectionChangedListener() {
	      public void selectionChanged(SelectionChangedEvent event) {

	      }
	    });
		
		selectedPropertiesList.setInput(selectedDecoratorProperties);
		
		selectedPropertiesList.setComparator(new ViewerComparator(){
		      public int compare(Viewer viewer, Object e1, Object e2) {
		        return ((String)e1).compareTo((String)e2);
		      }
		    });
	}
	
	
	private void createAvailablePropertiesViewer(Composite parent)
	{
		availablePropertiesList = new ListViewer(parent);

		org.eclipse.swt.widgets.List backingList = availablePropertiesList.getList();
		backingList.setBounds(40, 20, 220, 100);
		GridData availablePropertiesListLayoutData = new GridData();
		availablePropertiesListLayoutData.widthHint = 200;
		availablePropertiesListLayoutData.heightHint = 300;
		availablePropertiesListLayoutData.grabExcessHorizontalSpace = true;
		availablePropertiesListLayoutData.grabExcessVerticalSpace = true;
		
		backingList.setLayoutData(availablePropertiesListLayoutData);
		
		
		availablePropertiesList.setContentProvider(new IStructuredContentProvider() {
	      public Object[] getElements(Object inputElement) {
	        return (String[])inputElement;
	      }
	      
	      public void dispose() {
	      }

	      public void inputChanged(
	        Viewer viewer,
	        Object oldInput,
	        Object newInput) {
	      }
	    });
	    
		availablePropertiesList.setLabelProvider(new LabelProvider() {
	      public Image getImage(Object element) {
	        return null;
	      }

	      public String getText(Object element) {
	    	  String[] elements = element.toString().split("\\#"); //$NON-NLS-1$
	    	  if (elements.length > 1) {
	    		  return elements[1];
	    	  } else {
	    		  return element.toString();
	    	  }
	      }
	    });
	    
		availablePropertiesList.addSelectionChangedListener(new ISelectionChangedListener() {
	      public void selectionChanged(SelectionChangedEvent event) {

	      }
	    });
	    
		availablePropertiesList.addFilter(new ViewerFilter() {
	      public boolean select(
	        Viewer viewer,
	        Object parentElement,
	        Object element) {
	    	  return !selectedDecoratorProperties.contains(element);
	        
	      }
	    });
	    

		availablePropertiesList.setComparator(new ViewerComparator(){
		      public int compare(Viewer viewer, Object e1, Object e2) {
			        return ((String)e1).compareTo((String)e2);
			      }
			    });
		
		
	}
	
	
	
	private String[] getProjectList()
	{
		IProject[] projectsArray = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		
		String[] projectNamesArray = new String[projectsArray.length];
		int idx = 0;
		for (IProject proj : projectsArray) {
			projectNamesArray[idx++] = proj.getName();
		}
		
		Arrays.sort(projectNamesArray);
		return projectNamesArray;
	}
	
	private int getProjectIndex(String[] projects)
	{
		if (project != null) {
			return Arrays.binarySearch(projects, project.getName());
		}
		if (projects.length > 0) {
			return 0;
		}
		return -1;
	}
	
	
	private void updateDecoratorsList()
	{
		int projectIdx = projectList.getSelectionIndex();
		if (projectIdx >= 0) {
			String projectName = projectList.getItem(projectIdx);
			if (projectName != null) {
				IProject selectedProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				if (selectedProject != null) {
					
					List<IntegrationDecorator> decorators = getDecoratorsForProject(selectedProject);
					decoratorList.setInput(decorators);
					
					decoratorList.getCombo().setSize(decoratorList.getCombo().computeSize(300, SWT.DEFAULT, true));
					
					if (decorators.size() > 0) {
						decoratorList.setSelection(new StructuredSelection(decorators.get(0)));
					}

					decoratorList.refresh(true);
					
					return;
				}
			}
		}
		decoratorList.setInput(null);
		
	}
	
	private String getStringForDecoratorProperty(IntegrationDecorator decorator, String property)
	{
		return decorator.getURI().toString() + "#" + property; //$NON-NLS-1$
	}
	
	
	private void removeSelectedProperties(boolean all)
	{
		if (all) {
			int itemCount = selectedPropertiesList.getList().getItemCount();
			for (int idx=0; idx<itemCount; idx++) {
				selectedDecoratorProperties.remove(selectedPropertiesList.getElementAt(idx));
			}
		} else {
			
			for (int idx : selectedPropertiesList.getList().getSelectionIndices()) {
				selectedDecoratorProperties.remove(selectedPropertiesList.getElementAt(idx));
			}
		}

		availablePropertiesList.refresh();
		selectedPropertiesList.refresh();
	}
	
	private void addSelectedProperties(boolean all)
	{
		if (all) {
			int itemCount = availablePropertiesList.getList().getItemCount();
			for (int idx=0; idx<itemCount; idx++) {
				selectedDecoratorProperties.add((String)availablePropertiesList.getElementAt(idx));
			}
		} else {
			for (int idx : availablePropertiesList.getList().getSelectionIndices()) {
				selectedDecoratorProperties.add((String)availablePropertiesList.getElementAt(idx));
			}
		}

		availablePropertiesList.refresh();
		selectedPropertiesList.refresh();
	}
	

	
	private IntegrationDecorator getSelectedDecorator()
	{
		return selectedDecorator;
	}
	
	private void updateAvailablePropertiesList()
	{
		availablePropertiesList.setInput(null);
		
		IntegrationDecorator decorator = getSelectedDecorator();
		if (decorator == null) {
			return;
		}
		
		availablePropertiesList.setInput(getPropertiesForDecorator(decorator));
	}
	
	
	private String[] getPropertiesForDecorator(IntegrationDecorator decorator)
	{
		List<String> props = new ArrayList<String>();
		
		EList<String> populationIds = decorator.getAllLabelIdentifiers();
		if (populationIds != null) {
			for (String popId : populationIds) {
				for (IItemPropertyDescriptor prop : decorator.getCompartments(popId)) {
					props.add(getStringForDecoratorProperty(decorator, popId + "/" + prop.getId(null))); //$NON-NLS-1$
				}
			}
		} else {
			for (IItemPropertyDescriptor prop : decorator.getCompartments(null)) {
				props.add(getStringForDecoratorProperty(decorator,prop.getId(null)));
			}
		}
		
		return props.toArray(new String[props.size()]);
	}	
	

	private List<IntegrationDecorator> getDecoratorsForProject(IProject project)
	{
		List<IntegrationDecorator> retVal = new ArrayList<IntegrationDecorator>();
		try {
			IFolder folder = project.getFolder(DECORATORS_FOLDER_NAME);
			if (folder.exists()) {
				IResource[] members = folder.members();
				if (members != null) {
					for (IResource resource : members) {
						if (resource instanceof IFile) {
							try {
								Identifiable id = Utility.getIdentifiable((IFile)resource);
								if (id instanceof IntegrationDecorator) {
									retVal.add((IntegrationDecorator)id);
								}
							} catch (Exception e) {
								
							}
						}
					}
				}
			}
		} catch (CoreException ce) {
			ce.printStackTrace();
		}
		
		return retVal;
		
	}
}
