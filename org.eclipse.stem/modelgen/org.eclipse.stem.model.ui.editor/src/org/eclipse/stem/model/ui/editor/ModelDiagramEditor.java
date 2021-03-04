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
package org.eclipse.stem.model.ui.editor;

import java.io.IOException;
import java.util.Collections;
import java.util.EventObject;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.ui.parts.ContentOutlinePage;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.metamodel.provider.MetamodelItemProviderAdapterFactory;
import org.eclipse.stem.model.transform.MetamodelRegenerateValidator;
import org.eclipse.stem.model.ui.editor.VisualModelLoader.ModelLoadException;
import org.eclipse.stem.model.ui.editor.actions.RunModelGeneratorAction;
import org.eclipse.stem.model.ui.editor.commands.emf.DelegatingCommandStack;
import org.eclipse.stem.model.ui.editor.commands.emf.EmfCommandWrapper;
import org.eclipse.stem.model.ui.editor.controls.VisualEditorComposite;
import org.eclipse.stem.model.ui.editor.parts.ModelDiagramEditPartFactory;
import org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.provider.VisualMetamodelItemProviderAdapterFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.IPageSite;

public class ModelDiagramEditor extends GraphicalEditor implements IGotoMarker,
		CommandStackListener {

	private VisualModelLoader loader;
	private CanvasPackage vismodel;
	private Package metamodel;
	private ModelElement diagramElement;

	// Model selection listeners
	private List<ISelectionListener> modelListeners = new CopyOnWriteArrayList<ISelectionListener>();

	// SWT composite that contains editor controls
	private VisualEditorComposite editorComposite;

	public ModelDiagramEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}
	
	public void dispose()
	{
		editorComposite.dispose();
		super.dispose();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#configureGraphicalViewer()
	 */
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();

		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new ModelDiagramEditPartFactory());
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());
		viewer.setKeyHandler(new GraphicalViewerKeyHandler(viewer));

		ContextMenuProvider cmProvider = new ModelDiagramEditorContextMenuProvider(
				viewer, getActionRegistry());
		viewer.setContextMenu(cmProvider);
		getSite().registerContextMenu(cmProvider, viewer);

		if (diagramElement != null) {
			viewer.setContents(diagramElement);
		}
	}

	public DefaultEditDomain getEditingDomain() {
		return getEditDomain();
	}

	public CommandStack getCommandStack() {
		return super.getCommandStack();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#initializeGraphicalViewer()
	 */
	protected void initializeGraphicalViewer() {
		// GraphicalViewer viewer = getGraphicalViewer();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.ui.parts.GraphicalEditor#commandStackChanged(java.util
	 * .EventObject)
	 */
	public void commandStackChanged(EventObject event) {
		firePropertyChange(IEditorPart.PROP_DIRTY);
		super.commandStackChanged(event);
	}

	private CommandStackListener emfCommandStackAdapter = new CommandStackListener() {

		@Override
		public void commandStackChanged(EventObject event) {
			Object o = event.getSource();
			if (o instanceof BasicCommandStack) {
				org.eclipse.emf.common.command.Command lastCommand = ((BasicCommandStack) o)
						.getMostRecentCommand();
				getCommandStack().execute(new EmfCommandWrapper(lastCommand));
			}
			// getCommandStack().execute(new EmfCommandWrapper(emfCommand));
		}

	};

	protected IFile getInputFile() {
		IEditorInput input = getEditorInput();
		if (input instanceof IFileEditorInput) {
			return ((IFileEditorInput)input).getFile();
		}
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.
	 * IProgressMonitor)
	 */
	public void doSave(IProgressMonitor monitor) {

		// final WorkspaceModifyOperation operation = new
		// WorkspaceModifyOperation() {
		//
		// @Override
		// protected void execute(IProgressMonitor monitor)
		// throws CoreException, InvocationTargetException,
		// InterruptedException {
		//
		//monitor.beginTask("Saving Models", 10);
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Saving Models", 10);
		try {
			if (loader != null) {
				loader.save();
				subMonitor.worked(1);
				getCommandStack().markSaveLocation();
				subMonitor.worked(1);

				IEditorInput input = getEditorInput();
				if (input instanceof IFileEditorInput) {
					((IFileEditorInput) input)
							.getFile()
							.getProject()
							.build(IncrementalProjectBuilder.INCREMENTAL_BUILD,
									"org.eclipse.stem.model.builder.MetamodelBuilder",
									Collections.<String, String> emptyMap(),
									subMonitor.split(8));
				}
			}

		} catch (CoreException ce) {
			ce.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			//monitor.done();
		}

		// };
		//
		// try {
		// operation.run(monitor);
		// } catch (InterruptedException ie) {
		// // ignore
		// } catch (InvocationTargetException e) {
		// // ignore
		// }

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#doSaveAs()
	 */
	public void doSaveAs() {
		// For now, we're not going to allow Save As due to the complicated
		// nature of what we're saving
		// TODO Consider implementing Save As in the future
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
		// see doSaveAs()
		return false;
	}

	EditingDomain metamodelEditingDomain;

	public EditingDomain getMetamodelEditingDomain() {
		return metamodelEditingDomain;
	}

	protected void setInput(IEditorInput input) {
		super.setInput(input);

		if (loader != null) {
			loader.destroy();
			metamodelEditingDomain.getCommandStack()
					.removeCommandStackListener(emfCommandStackAdapter);
			loader = null;
		}

		try {
			loader = new VisualModelLoader((IFileEditorInput) input);
			loader.load();

			metamodel = loader.getMetamodel();
			vismodel = loader.getVisualModel();

			ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

			adapterFactory
					.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new VisualMetamodelItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new EcoreItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new MetamodelItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

			metamodelEditingDomain = new AdapterFactoryEditingDomain(
					adapterFactory, new DelegatingCommandStack(
							getCommandStack()), metamodel.eResource()
							.getResourceSet());

			// metamodelEditingDomain = loader.getMetamodelEditingDomain();
			metamodelEditingDomain.getCommandStack().addCommandStackListener(
					emfCommandStackAdapter);

			setPartName(metamodel.getName());
		} catch (ModelLoadException mle) {
			mle.printStackTrace();
			// TODO handle load exception
		}
	}

	public void reload() {
		// setEditDomain(new DefaultEditDomain(this));
		ModelElement prevSelectedModel = diagramElement;
		setInput(getEditorInput());
		if (editorComposite != null) {
			editorComposite.inputChanged();
		}

		if (vismodel != null && vismodel.getModelElements().size() > 0) {
			if (prevSelectedModel != null) {
				for (ModelElement currentModel : vismodel.getModelElements()) {
					Model m1 = currentModel.getModel();
					Model m2 = prevSelectedModel.getModel();
					if (m1 != null && m2 != null
							&& m1.getName().equals(m2.getName())) {
						setDiagramElement(currentModel);
					}
				}
			}
			setDiagramElement(vismodel.getModelElements().get(0));
		} else {
			setDiagramElement(null);
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		editorComposite = new VisualEditorComposite(this, parent, SWT.NONE);
		super.createPartControl(editorComposite.getCanvasComposite());
	}

	public CanvasPackage getVisualModel() {
		return vismodel;
	}

	public Package getMetamodel() {
		return metamodel;
	}

	public void setDiagramElement(ModelElement me) {
		diagramElement = me;
		if (getGraphicalViewer() != null) {
			getGraphicalViewer().setContents(diagramElement);
		}

		// do some other stuff
		fireModelSelected();
	}

	public void setSelection(ISelection selection) {
	}

	public void addModelSelectionListener(ISelectionListener listener) {
		modelListeners.add(listener);
	}

	public void removeModelSelectionListener(ISelectionListener listener) {
		modelListeners.remove(listener);
	}

	private void fireModelSelected() {
		final ISelection selection = new StructuredSelection(diagramElement);
		for (ISelectionListener listener : modelListeners) {
			listener.selectionChanged(this, selection);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.ui.parts.GraphicalEditor#selectionChanged(org.eclipse
	 * .ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		super.selectionChanged(part, selection);
	}

	@Override
	public void gotoMarker(IMarker marker) {
		// TODO Implement selecting the problematic model/transition when issued
		// this command
		// try {
		// } catch (CoreException ce) {
		// ce.printStackTrace();
		// }
		
		try {
			String markerType = marker.getType();
			
			if ("org.eclipse.stem.model.builder.ModelNeedsRegenerationErrorMarker".equals(markerType)) {
				RunModelGeneratorAction action = new RunModelGeneratorAction(this);
				action.run();
			}

		} catch (CoreException ce) {
			ce.printStackTrace();
		}
	}

	/**
	 * Checks whether the current metamodel is out of sync with the EMF
	 * structure and requires a regeneration of the Ecore, GenModel, and Java
	 * APIs
	 * 
	 * @return Whether a regeneration is needed
	 */
	public boolean needsModelRegeneration(IProgressMonitor monitor) throws CoreException, IOException {
		IFile metamodelFile = getInputFile();
		if (metamodelFile != null) {
			MetamodelRegenerateValidator regenValidator = new MetamodelRegenerateValidator(metamodel, metamodelFile);
			return regenValidator.checkNeedRegeneration(monitor);
		}
		return false;
	}

	public class ModelDiagramOutlinePage extends ContentOutlinePage {

		public ModelDiagramOutlinePage(EditPartViewer viewer) {
			super(viewer);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.gef.ui.parts.ContentOutlinePage#createControl(org.eclipse
		 * .swt.widgets.Composite)
		 */
		public void createControl(Composite parent) {
			getViewer().createControl(parent);
			getViewer().setEditDomain(getEditDomain());
			// getViewer().setEditPartFactory(
			// new ModelDiagramTreeEditPartFactory());
			getSelectionSynchronizer().addViewer(getViewer());
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.ui.part.Page#dispose()
		 */
		public void dispose() {
			getSelectionSynchronizer().removeViewer(getViewer());
			super.dispose();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gef.ui.parts.ContentOutlinePage#getControl()
		 */
		public Control getControl() {
			return getViewer().getControl();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.ui.part.Page#init(org.eclipse.ui.part.IPageSite)
		 */
		public void init(IPageSite pageSite) {
			super.init(pageSite);
		}
	}

}