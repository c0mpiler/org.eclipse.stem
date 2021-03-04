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
package org.eclipse.stem.model.ui.editor.controls;

import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.ui.editor.ModelDiagramEditor;
import org.eclipse.stem.model.ui.editor.VisualModelReconciler;
import org.eclipse.stem.model.ui.editor.actions.RunModelGeneratorAction;
import org.eclipse.stem.model.ui.editor.commands.ModelCreateCommand;
import org.eclipse.stem.model.ui.editor.commands.emf.EmfCommandWrapper;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelFactory;
import org.eclipse.stem.model.ui.editor.vismodel.provider.VisualMetamodelEditPlugin;
import org.eclipse.stem.model.ui.wizards.ModelCompartmentEditorDialog;
import org.eclipse.stem.model.ui.wizards.NewModelWizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class VisualEditorToolbar extends Composite {
	private ToolEntry selectTool;
	private ToolEntry drawTool;

	private ModelDiagramEditor editor;
	private ComboViewer modelViewer;
//	private Button addModelButton, editModelButton, generateModelButton,
//			addCompartmentButton;
//	private Button selectCompartmentButton, drawTransitionButton;

	private ToolItem runModelGeneratorButton, drawTransitionButton, selectButton, editModelButton, addModelButton,addCompartmentButton;
	
	private Image defaultImage;

	private void setupTools() {
		selectTool = new PanningSelectionToolEntry();
		drawTool = new ConnectionCreationToolEntry("Transition",
				"Create a solid-line connection", new CreationFactory() {
					public Object getNewObject() {
						return null;
					}

					public Object getObjectType() {
						return new Object();
					}
				}, ImageDescriptor.createFromFile(ModelDiagramEditor.class,
						"icons/connection_s16.gif"),
				ImageDescriptor.createFromFile(ModelDiagramEditor.class,
						"icons/connection_s24.gif"));

		defaultImage = new Image(getDisplay(), 20, 20);
		Color color = getDisplay().getSystemColor(SWT.COLOR_BLUE);
		GC gc = new GC(defaultImage);
		gc.setBackground(color);
		gc.fillRectangle(defaultImage.getBounds());
		gc.dispose();
	}

	// private CoolItem createCoolItem(Control control, CoolBar bar)
	// {
	// CoolItem item = new CoolItem(bar, SWT.NONE);
	// Point controlSize = control.computeSize(SWT.DEFAULT, SWT.DEFAULT);
	// item.setPreferredSize(item.computeSize(controlSize.x, controlSize.y));
	// item.setControl(control);
	// item.set
	// return item;
	// }

	public VisualEditorToolbar(final ModelDiagramEditor editor, Composite parent, int style) {
		super(parent, style);
		this.editor = editor;
		setupTools();

		final VisualMetamodelEditPlugin resourceLocator = VisualMetamodelEditPlugin.INSTANCE;
		
		setLayout(new GridLayout(3, false));

		final Label topBarLabel = new Label(this, SWT.NONE);
		topBarLabel.setText("Model");

		modelViewer = new ComboViewer(this, SWT.READ_ONLY);
		modelViewer.setContentProvider(new ArrayContentProvider());
		modelViewer.setLabelProvider(new LabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof ModelElement) {
					return ((ModelElement) element).getModel().getName();
				}
				return "";
			}

		});

		modelViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						editor.setDiagramElement(getSelectedModel());
					}
				});

		ToolBar toolbar = new ToolBar(this, SWT.NONE);

		editModelButton = new ToolItem(toolbar, SWT.PUSH);
		
		//editModelButton.setImage(defaultImage);
		editModelButton.setImage(ExtendedImageRegistry.INSTANCE.getImage(resourceLocator.getImage("EditModel.gif")));
		editModelButton.setToolTipText("Edit Model");
		editModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				launchEditModel();
			}
		});

		addModelButton = new ToolItem(toolbar, SWT.PUSH);
		addModelButton.setImage(ExtendedImageRegistry.INSTANCE.getImage(resourceLocator.getImage("AddModelIcon16")));
		addModelButton.setToolTipText("Add Model");
		addModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				launchAddModel();
			}
		});


		
		addCompartmentButton = new ToolItem(toolbar, SWT.PUSH);
		addCompartmentButton.setImage(ExtendedImageRegistry.INSTANCE.getImage(resourceLocator.getImage("AddCompartmentIcon24")));
		addCompartmentButton.setToolTipText("Add Compartment");
		addCompartmentButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				launchAddCompartment();
			}
		});
		

		new ToolItem(toolbar, SWT.SEPARATOR | SWT.VERTICAL);

		selectButton = new ToolItem(toolbar, SWT.CHECK);
		selectButton.setImage(
				ExtendedImageRegistry.INSTANCE.getImage(resourceLocator.getImage("SelectIcon20")));
		
		selectButton.setToolTipText("Select Compartment");
		selectButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!selectButton.getSelection()) {
					selectButton.setSelection(true);
				}
				editor.getEditingDomain().setActiveTool(selectTool.createTool());
				drawTransitionButton.setSelection(false);
			}
		});
		
		drawTransitionButton = new ToolItem(toolbar, SWT.CHECK);
		drawTransitionButton.setImage(
				ExtendedImageRegistry.INSTANCE.getImage(resourceLocator.getImage("DrawTransitionIcon20")));
		drawTransitionButton.setToolTipText("Draw New Transition");
		drawTransitionButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!drawTransitionButton.getSelection()) {
					drawTransitionButton.setSelection(true);
				}
				editor.getEditingDomain().setActiveTool(drawTool.createTool());
				selectButton.setSelection(false);
			}
		});
		
		
		new ToolItem(toolbar, SWT.SEPARATOR);

		
		runModelGeneratorButton = new ToolItem(toolbar, SWT.PUSH);
		runModelGeneratorButton.setImage(ExtendedImageRegistry.INSTANCE.getImage(resourceLocator.getImage("RunModelGeneratorIcon20")));
		runModelGeneratorButton.setToolTipText("Run Model Generator");
		runModelGeneratorButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				launchModelGenerator();
			}
		});
		
		
//		ToolItem resetEditorButton = new ToolItem(toolbar, SWT.PUSH);
//		 
//		//resetEditorButton.setImage(defaultImage);
//		resetEditorButton.setImage(ExtendedImageRegistry.INSTANCE.getImage(resourceLocator.getImage("Reload.gif")));
//		resetEditorButton.setToolTipText("Reload Editor");
//		resetEditorButton.addSelectionListener(new SelectionAdapter() {
//
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				editor.reload();
//			}
//		});
		// toolbar.pack();

		setInput();
		selectButton.setSelection(true);
	}
	
	protected void setInput() {
		EList<ModelElement> models = editor.getVisualModel().getModelElements();
		modelViewer.setInput(models);
		if (models.size() > 0 && models.get(0) != null) {
			modelViewer.setSelection(new StructuredSelection(models.get(0)));
		}
	}

	public void inputChanged() {
		setInput();
	}

	private void launchModelGenerator() {
		RunModelGeneratorAction action = new RunModelGeneratorAction(editor);
		action.run();
	}

	private ModelElement getSelectedModel() {
		return (ModelElement) ((IStructuredSelection) modelViewer
				.getSelection()).getFirstElement();

	}

	private void launchAddCompartment() {
		ModelElement selected = getSelectedModel();
		if (selected == null) {
			return;
		}

		Compartment newCompartment = MetamodelFactory.eINSTANCE
				.createCompartment();

		ModelCompartmentEditorDialog compartmentEditorDialog = new ModelCompartmentEditorDialog(
				getShell(), SWT.NONE, selected.getModel().getCompartments(),
				newCompartment, null);

		if (compartmentEditorDialog.open() == Window.OK) {
			selected.getModel().getCompartments().getCompartments()
					.add(newCompartment);
			CompartmentElement ce = VisualMetamodelFactory.eINSTANCE
					.createCompartmentElement();
			ce.setCompartment(newCompartment);
			ce.setX(10);
			ce.setY(10);
			ce.setWidth(50);
			ce.setHeight(50);
			selected.getCompartmentElements().add(ce);
		}
	}

	private void launchEditModel() {
		ModelElement selected = getSelectedModel();
		if (selected == null || selected.getModel() == null) {
			return;
		}

		ModelParametersEditorDialog dialog = new ModelParametersEditorDialog(
				getShell(), selected.getModel());
		if (dialog.open() == Window.OK) {
			// TODO make this an actual command
			editor.getCommandStack().execute(new EmfCommandWrapper(UnexecutableCommand.INSTANCE));
		}
	}

	private void launchAddModel() {

		Model model = MetamodelFactory.eINSTANCE.createModel();

		NewModelWizard wizard = new NewModelWizard(model, editor.getMetamodel(), false, true);
		WizardDialog wizardDialog = new WizardDialog(getShell(), wizard);
		if (wizardDialog.open() == Window.OK) {
			// AddCommand.
			EditingDomain editingDomain = editor.getMetamodelEditingDomain();

			CompoundCommand command = new CompoundCommand();
			command.add(new EmfCommandWrapper(AddCommand.create(editingDomain,
					editor.getMetamodel(),
					MetamodelPackage.Literals.PACKAGE__MODELS, model)));
			command.add(new EmfCommandWrapper(AddCommand.create(editingDomain,
					editor.getMetamodel(),
					MetamodelPackage.Literals.PACKAGE__COMPARTMENT_GROUPS,
					model.getCompartments())));

			ModelElement me = VisualModelReconciler
					.initializeModelElement(model);
			command.add(new ModelCreateCommand(editor.getVisualModel(), me));

			editor.getCommandStack().execute(command);

			modelViewer.refresh();
			selectModel(me);
		}
	}

	public void selectModel(ModelElement me) {
		modelViewer.setSelection(new StructuredSelection(me));
	}
}
