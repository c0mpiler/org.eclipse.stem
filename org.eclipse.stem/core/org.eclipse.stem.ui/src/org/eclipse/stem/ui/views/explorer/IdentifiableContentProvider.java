package org.eclipse.stem.ui.views.explorer;

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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.jface.viewers.IElementComparer;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.core.CorePlugin;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.experiment.Experiment;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.predicate.IdentifiablePredicateExpression;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.trigger.Trigger;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.Utility;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.progress.UIJob;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

/**
 * This class is a {@link ITreeContentProvider} for
 * {@link IdentifiableInstanceTreeNode}s which appear in the
 * {@link CommonNavigator} framework that is used to explore STEM Projects.
 */
public class IdentifiableContentProvider implements ITreeContentProvider,
		IResourceChangeListener, IResourceDeltaVisitor, BundleListener {

	public static Viewer viewer;

	/**
	 * Default Constructor
	 */
	public IdentifiableContentProvider() {
		 ResourcesPlugin.getWorkspace().addResourceChangeListener(this,
				IResourceChangeEvent.POST_CHANGE|IResourceChangeEvent.PRE_CLOSE|IResourceChangeEvent.PRE_DELETE);
		
		
		Activator.getDefault().getBundle().getBundleContext().addBundleListener(this);
	}
	

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object parentElement) {
		Object[] retValue = null;
		// Right kind of parent?
		if (parentElement instanceof IdentifiableTreeNode) {
			// Yes
			// if IdentifiableTreeNode
			final List<Identifiable> temp = new ArrayList<Identifiable>();

			final IdentifiableTreeNode itn = (IdentifiableTreeNode) parentElement;

			final IFolder folder = itn.getProject().getFolder(
					itn.getFolderName());

			// Does the folder exist?
			if (folder.exists()) {
				// Yes
				try {
					for (final IResource identifiableFile : folder.members()) {
						if(identifiableFile instanceof IFile) {
							IFile ifile = (IFile) identifiableFile;
							// exclude any operating system files starting with '.'
							if((ifile.getName().length()>0)&&( ifile.getName().charAt(0)!='.' ) && !ifile.getName().endsWith("~")) {
								try {
									final Identifiable identifiable = Utility.getIdentifiable((IFile) identifiableFile);
									if(identifiable != null) {
										temp.add(identifiable);
									}
								} catch (final Throwable t) {
									// here we want to protect the user and allow non STEM files in each Directory
									// Just catch any exception and continue
									Activator.logInformation("Error loading file "+ifile.getName()+" for display", t);
								}

							}
						} // if instanceOF IFILE else might be folder or some other object created outside of STEM ...
						
					}
				} catch (final CoreException ce) {
					Activator.logError("", ce);
				} // for each IResource folder.members()
			} // if folder exists

			retValue = temp.toArray();

		} else {
			retValue = new Object[0];
		}

		return retValue;
	} // getChildren

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		Object retValue = null;
		if (element instanceof IdentifiableInstanceTreeNode) {
			retValue = ((IdentifiableInstanceTreeNode) element).getParent();
		} // if IdentifiableInstanceTreeNode
		return retValue;
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
		Object[] children = getChildren(element);
		return children != null && children.length > 0;
	}

	/**
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		IdentifiableContentProvider.viewer = viewer;
		
		((StructuredViewer)viewer).setComparer(new IElementComparer() {
			
			public int hashCode(Object element) {
				return element.hashCode();
			}
			
			public boolean equals(Object a, Object b) {
				Object aRep=a, bRep=b;
				while(aRep instanceof DelegatingWrapperItemProvider)
					aRep = ((DelegatingWrapperItemProvider)aRep).getValue();
				while(bRep instanceof DelegatingWrapperItemProvider)
					bRep = ((DelegatingWrapperItemProvider)bRep).getValue();
				
				if(aRep instanceof Identifiable && bRep instanceof Identifiable) {
					URI aURI = ((Identifiable)aRep).getURI();
					URI bURI = ((Identifiable)bRep).getURI();
					if(aURI != null && bURI != null)
						return (aURI.toString().equals(bURI.toString()));
				}
				
				return aRep.equals(bRep);
			}
		});
	}

	/**
	 * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org
	 *      .eclipse.core.resources.IResourceChangeEvent)
	 */
	public void resourceChanged(final IResourceChangeEvent event) {
		// Fix for 395372. Check for deleted/closed projects and remove resources from resource set
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE || event.getType() == IResourceChangeEvent.PRE_DELETE) {
			IProject p = (IProject)event.getResource();
			org.eclipse.stem.core.Utility.unloadResourcesInProject(p);
			return;
		}
		
		try {
			event.getDelta().accept(this);
		} catch (final CoreException e) {
			Activator.logError("", e);
		}
	} // resourceChanged

	/**
	 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core
	 *      .resources.IResourceDelta)
	 */
	public boolean visit(final IResourceDelta delta) throws CoreException {
		
		final IResource source = delta.getResource(); 

	
		IPath path = delta.getFullPath();

/*		Activator.logInformation("Path: "+path);
		if((delta.getKind()&IResourceDelta.ADDED) == IResourceDelta.ADDED) Activator.logInformation("ADDED");
		if((delta.getKind()&IResourceDelta.ADDED_PHANTOM) == IResourceDelta.ADDED_PHANTOM) Activator.logInformation("ADDED_PHANTOM");
		if((delta.getKind()&IResourceDelta.ALL_WITH_PHANTOMS) == IResourceDelta.ALL_WITH_PHANTOMS) Activator.logInformation("ALL_WITH_PHANTOMS");
		if((delta.getKind()&IResourceDelta.CHANGED) == IResourceDelta.CHANGED) Activator.logInformation("CHANGED");
		if((delta.getKind()&IResourceDelta.CONTENT) == IResourceDelta.CONTENT) Activator.logInformation("CONTENT");
		if((delta.getKind()&IResourceDelta.COPIED_FROM) == IResourceDelta.COPIED_FROM) Activator.logInformation("COPIED_FROM");
		if((delta.getKind()&IResourceDelta.DESCRIPTION) == IResourceDelta.DESCRIPTION) Activator.logInformation("DESCRIPTION");
		if((delta.getKind()&IResourceDelta.ENCODING) == IResourceDelta.ENCODING) Activator.logInformation("ENCODING");
		if((delta.getKind()&IResourceDelta.LOCAL_CHANGED) == IResourceDelta.LOCAL_CHANGED) Activator.logInformation("LOCAL_CHANGED");
		if((delta.getKind()&IResourceDelta.MARKERS) == IResourceDelta.MARKERS) Activator.logInformation("MARKERS");
		if((delta.getKind()&IResourceDelta.MOVED_FROM) == IResourceDelta.MOVED_FROM) Activator.logInformation("MOVED_FROM");
		if((delta.getKind()&IResourceDelta.MOVED_TO) == IResourceDelta.MOVED_TO) Activator.logInformation("MOVED_TO");
		//if((delta.getKind()&IResourceDelta.NO_CHANGE) == IResourceDelta.NO_CHANGE) Activator.logInformation("NO_CHANGE");
		if((delta.getKind()&IResourceDelta.OPEN) == IResourceDelta.OPEN) Activator.logInformation("OPEN");
		if((delta.getKind()&IResourceDelta.REMOVED) == IResourceDelta.REMOVED) Activator.logInformation("REMOVED");
		if((delta.getKind()&IResourceDelta.REMOVED_PHANTOM) == IResourceDelta.REMOVED_PHANTOM) Activator.logInformation("REMOVED_PHANTOM");
		if((delta.getKind()&IResourceDelta.REPLACED) == IResourceDelta.REPLACED) Activator.logInformation("REPLACED");
		if((delta.getKind()&IResourceDelta.REMOVED_PHANTOM) == IResourceDelta.REMOVED_PHANTOM) Activator.logInformation("REMOVED_PHANTOM");
		if((delta.getKind()&IResourceDelta.REPLACED) == IResourceDelta.REPLACED) Activator.logInformation("REPLACED");
		if((delta.getKind()&IResourceDelta.SYNC) == IResourceDelta.SYNC) Activator.logInformation("SYNC");
		if((delta.getKind()&IResourceDelta.TYPE) == IResourceDelta.TYPE) Activator.logInformation("TYPE");
*/	
				
		
		URI uri = URI.createPlatformResourceURI(path.toString(), false);
		
		for(Resource r: org.eclipse.stem.core.Utility.resourceSet.getResources()) 
			if(r.getURI().equals(uri)) {
				r.setModified(true);
				break;
			}
		
		switch ( source.getType() ) { 
			case IResource.FOLDER: 
				final IFolder f = (IFolder)source; 
				new UIJob("Update Folder") { 
					public IStatus runInUIThread(IProgressMonitor monitor) { 
						if (viewer != null 
								&& !viewer.getControl().isDisposed()) {
							refreshViewer((CommonViewer)viewer, f);						
						} 
						return Status.OK_STATUS; 
					} 
				}.schedule(); 
				break;
		case IResource.ROOT: 
			new UIJob("Update Root") { 
				public IStatus runInUIThread(IProgressMonitor monitor) { 
					if (viewer != null 
							&& !viewer.getControl().isDisposed()) { 
						refreshViewer((CommonViewer)viewer, source);
					} 
					return Status.OK_STATUS; 
				} 
			}.schedule(); 
			break;
		case IResource.PROJECT: 
			final IProject project = (IProject)source; 
			new UIJob("Update Project") { 
				public IStatus runInUIThread(IProgressMonitor monitor) { 
					if (viewer != null 
							&& !viewer.getControl().isDisposed()) { 
						refreshViewer((CommonViewer)viewer, project);
					} 
					return Status.OK_STATUS; 
				} 
			}.schedule();  
			
			break;
		case IResource.FILE: 
			final IFile file = (IFile) source; 
			// When files are updated, we need to mark as modified other files that also needs to 
			// be refreshed since they are indirectly referencing the changed file
			this.markIndirectFiles(delta);
			new UIJob("Update File") { 
				public IStatus runInUIThread(IProgressMonitor monitor) 
				{ 
					if (viewer != null 
							&& !viewer.getControl().isDisposed()) { 
						refreshViewer((CommonViewer)viewer, file);
					} 
					return Status.OK_STATUS; 
				} 
			}.schedule(); 
			return false; 
		default: 
			break;
		}
		return true; 		
	} // visit


	
	private void refreshViewer(CommonViewer v, Object elm) {
		TreePath [] expPaths = v.getExpandedTreePaths();
		v.refresh(elm); 
		// The last element in the tree paths containing models, scenarios etc. have
		// potentially been reloaded in the viewer, so the values in expPaths are 
		// wrong. We need to find the new ones and expand those.
		
		ArrayList<TreeItem>allItems = new ArrayList<TreeItem>();
		getAllItems(v.getControl(), allItems);
		ArrayList<TreePath> newPathsToExpand = new ArrayList<TreePath>();
		for(TreePath tp:expPaths) {
			Object lastSeg = tp.getLastSegment();
			while(lastSeg instanceof DelegatingWrapperItemProvider)
				lastSeg = ((DelegatingWrapperItemProvider)lastSeg).getValue();


			if(lastSeg instanceof Identifiable) {
				// See if we can find the new identifiable object in the list of items
				boolean foundNewPath = false;
				for(TreeItem ti:allItems) {
					Object data = ti.getData();
					while(data instanceof DelegatingWrapperItemProvider)
						data = ((DelegatingWrapperItemProvider)data).getValue();
					
//					Activator.logInformation("Comparing "+data+" with "+lastSeg);
					if(data instanceof Identifiable && 
							((Identifiable)data).getURI().equals(((Identifiable)lastSeg).getURI()) &&
							!data.equals(lastSeg))
					{
						Object [] segments = new Object[tp.getSegmentCount()];
						int i = 0;
						for(i=0;i<tp.getSegmentCount()-1;++i) segments[i] = tp.getSegment(i);
						segments[i] = ti.getData();
						TreePath newPath = new TreePath(segments);
						newPathsToExpand.add(newPath);
						foundNewPath = true;
					}
				}
				if(!foundNewPath) {
					// Try and expand anyway using the old object
					Object [] segments = new Object[tp.getSegmentCount()];
					int i=0;
					for(i=0;i<tp.getSegmentCount();++i) segments[i] = tp.getSegment(i);
					TreePath newPath = new TreePath(segments);
					newPathsToExpand.add(newPath);
				}
			}
		}
		v.setExpandedTreePaths(expPaths);
		for(TreePath tp:newPathsToExpand)
			v.expandToLevel(tp, 1);
	}
	
	/*private void migrateIfNeeded(IProject project) {
		
	} */

	private void getAllItems(Object o, ArrayList<TreeItem>items) {
		
		if(o instanceof Tree)
			for(TreeItem t:((Tree)o).getItems()) {
				items.add(t);
				for(TreeItem t2:t.getItems())
					getAllItems(t2, items);
			}
		
		if(o instanceof TreeItem) 
			for(TreeItem t:((TreeItem)o).getItems()) {
				items.add(t);
				getAllItems(t, items);
			}
	}
	
	private static class MyRunnable implements Runnable {
		public IEditorReference [] references;
		public void run() {
			references = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();
		}
		public IEditorReference [] getReferences() {
			return references;
		}
	}
	/**
	 * In STEM, models contain other models and graphs, and scenarios contain other models etc. When a resource is changed, we need to see
	 * what other resources are potentially affected and need to be marked as modified
	 * 
	 * @param delta The delta
	 */
	
	private void markIndirectFiles(IResourceDelta delta) {
		URI uri = URI.createPlatformResourceURI(delta.getResource().getFullPath().toString(), false);
		//String filename = uri.lastSegment();
		String project = getProject(uri);
		String type = getType(uri);
		MyRunnable runnable = new MyRunnable();
		
		final IEditorReference [] editorReferences;
		Display.getDefault().syncExec(runnable);
		
		editorReferences = runnable.getReferences();
	
		
		// We need to get a snapshot of the resources currently in the resource set since 
		// the loop below could potentially add more elements to the list inside it.
		
		EList<Resource> resSnap = new BasicEList<Resource>();
		synchronized(org.eclipse.stem.core.Utility.resourceSet) {			
			for(Resource r:org.eclipse.stem.core.Utility.resourceSet.getResources()) resSnap.add(r);
		
			// The reason we do not release the synchronization lock here
			// is that Utility.getIdentifiable(...) could be called asynchronously
			// by the project explorer tree viewer, and the method will iterate
			// over the resources searching for a match. That loop need to be
			// protected by calls below adding new resources to the resource set.
			
			for(Resource r:resSnap) {
				String p_project = getProject(r.getURI());
				if(!project.equals(p_project)) continue;
				EList<EObject> content = r.getContents();
				if(content == null || content.size() == 0) continue;
				EObject first = content.get(0);
				URI u = ((Identifiable)first).getURI();
				
				
				if(u == null) continue;
				
				if(u.equals(uri)) {
					r.setModified(true);
					r.unload();
					continue;
				}
				String proj = getProject(u);
				if(proj == null) continue;
				if(!proj.equals(project)) continue; // wrong project
				boolean modified = false;
				if(type.equals("models")) {
					if(!(first instanceof Model) && !(first instanceof Scenario)
							&& !(first instanceof Experiment)) continue; // only models,scenarios and experiments contain other models				
					if(first instanceof Model)
						modified = checkModel((Model)first, uri);
					else if(first instanceof Scenario)
						modified = checkScenario((Scenario)first, uri);			
					else if(first instanceof Experiment)
						modified = checkExperiment((Experiment)first, uri);	
					if(modified) r.setModified(true);						
				} else if(type.equals("decorators")) {
					if(!(first instanceof Model) && !(first instanceof Scenario)) continue; // only models and scenarios contain decorators				
					if(first instanceof Model)
						modified = checkModelDecorators((Model)first, uri);
					else if(first instanceof Scenario)
						modified = checkScenarioDecorators((Scenario)first, uri);			
				} else if(type.equals("graphs")) {
					if(!(first instanceof Model) && !(first instanceof Scenario)) continue; // only models & scenarios  contain graphs		
					if(first instanceof Model) modified = checkModelGraphs((Model)first, uri);
					else modified = checkScenarioGraphs((Scenario)first, uri);
				}  else if (type.equals("predicates")) {
					if(!(first instanceof Scenario) && !(first instanceof Trigger)) continue; // Only scenarios & triggers & boolean expressions have predicates in them
					if(first instanceof Scenario) modified = checkScenarioPredicate((Scenario)first, uri);
					else modified = checkTriggerPredicate((Trigger)first, uri);
				} else if(type.equals("modifiers")) {
					if(!(first instanceof Scenario) && !(first instanceof Trigger)) continue; // Only scenarios & triggers have modifiers in them
					if(first instanceof Scenario) modified = checkScenarioModifier((Scenario)first, uri);
					else modified = checkTriggerModifier((Trigger)first, uri);
					
				} else if(type.equals("triggers")) {
					if(!(first instanceof Scenario)) continue; // Only scenarios have triggers in them
					modified = checkScenarioTriggers((Scenario)first, uri);
				}
				if(modified) 
					r.setModified(true);
			} // for each resource
			
			// Finally check any editors open that needs to be reloaded
			checkEditors(editorReferences, uri);
		}
	} // resourceSet is not thread safe
	
	private void checkEditors(IEditorReference [] editorReferences, URI uri) {
/*		for(IEditorReference ier:editorReferences) {
			Activator.logInformation(ier);
			try {
				IEditorInput input = ier.getEditorInput();
				FileEditorInput fei = (FileEditorInput)input;
				IEditorPart editor = ier.getEditor(false);
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
*/
	}
	
	private boolean checkModel(Model model, URI modifiedURI) {
		if(model == null || modifiedURI == null) 
			CorePlugin.logError("Null model", new Exception());
		if(model.getURI().lastSegment().equals(modifiedURI.lastSegment())) return true;
		for(Model m:model.getModels()) {
			boolean modified = checkModel(m, modifiedURI);
			if(modified) return true;
		}
		return false;
	}
	
	private boolean checkScenario(Scenario scenario, URI modifiedURI) {
		Model m = scenario.getModel();
		if(m == null) return false; // no model in scenario
		return checkModel(m, modifiedURI);
	}
	
	private boolean checkExperiment(Experiment experiment, URI modifiedURI) {
		Scenario scenario = experiment.getScenario();
		if(scenario == null) return false;
		return checkScenario(scenario, modifiedURI);
	}
	
	private boolean checkModelDecorators(Model model, URI modifiedURI) {
		if(model == null || modifiedURI == null) 
			CorePlugin.logError("Null model or decorator", new Exception());
		
		for(Decorator d:model.getNodeDecorators()) 
			if(d.getURI().lastSegment().equals(modifiedURI.lastSegment())) return true;
		
		
		// Check sub model
		for(Model m:model.getModels()) {
			boolean modified = checkModelDecorators(m, modifiedURI);
			if(modified) return true;
		}
		return false;
	}
	
	private boolean checkScenarioDecorators(Scenario scenario, URI modifiedURI) {
		Model m = scenario.getModel();
		if(m == null) return false;
		boolean modified =  checkModelDecorators(m, modifiedURI);
		if(modified) return true;
		// Check scenario decorator
		for(Decorator d:scenario.getScenarioDecorators()) 
			if(!d.eIsProxy() && d.getURI().lastSegment().equals(modifiedURI.lastSegment())) return true;
		return false;
	}
	
	private boolean checkModelGraphs(Model model, URI modifiedURI) {
		if(model == null || modifiedURI == null) 
			CorePlugin.logError("Null model or uri", new Exception());
		
		for(Graph g:model.getGraphs())
			if(g.getURI().lastSegment().equals(modifiedURI.lastSegment())) return true;
		
		// Check sub model
		for(Model m:model.getModels()) {
			boolean modified = checkModelGraphs(m, modifiedURI);
			if(modified) return true;
		}
		return false;
	}
	
	private boolean checkScenarioGraphs(Scenario scenario, URI modifiedURI) {
		if(scenario == null || modifiedURI == null) 
			CorePlugin.logError("Null model or uri", new Exception());
		
		Model m = scenario.getModel();
		
		return checkModelGraphs(m, modifiedURI);
	}

	
	private boolean checkScenarioPredicate(Scenario scenario, URI modifiedURI) {
		if(scenario == null || modifiedURI == null) 
			CorePlugin.logError("Null model or uri", new Exception());
		
		for(Decorator d : scenario.getScenarioDecorators())
			if(d instanceof Trigger) {
				Trigger tg = (Trigger)d;
				IdentifiablePredicateExpression ipe = (IdentifiablePredicateExpression)tg.getPredicate();
				if(ipe != null && ipe.getURI().equals(modifiedURI))
					return true;
			}
		
		return false;
	}
	
	private boolean checkTriggerPredicate(Trigger trigger, URI modifiedURI) {
		if(trigger == null || modifiedURI == null) 
			CorePlugin.logError("Null model or uri", new Exception());
		
	 	 IdentifiablePredicateExpression ipe = (IdentifiablePredicateExpression)trigger.getPredicate();
		 if(ipe != null && ipe.getURI().equals(modifiedURI))
					return true;
		
		return false;
	}

	private boolean checkScenarioModifier(Scenario scenario, URI modifiedURI) {
		if(scenario == null || modifiedURI == null) 
			CorePlugin.logError("Null model or uri", new Exception());
		
		for(Decorator d : scenario.getScenarioDecorators())
			if(d instanceof Trigger) {
				Trigger tg = (Trigger)d;
				for(Decorator dec:tg.getActions()) {
					if(dec.getURI().equals(modifiedURI))
						return true;
				}
			}
		
		return false;
	}
	
	private boolean checkScenarioTriggers(Scenario scenario, URI modifiedURI) {
		if(scenario == null || modifiedURI == null) 
			CorePlugin.logError("Null model or uri", new Exception());
		
		for(Decorator d : scenario.getScenarioDecorators())
			if(d instanceof Trigger) {
				Trigger tg = (Trigger)d;
				if(tg.getURI().equals(modifiedURI))
					return true;
			}
		
		return false;
	}
	
	private boolean checkTriggerModifier(Trigger trigger, URI modifiedURI) {
		if(trigger == null || modifiedURI == null) 
			CorePlugin.logError("Null model or uri", new Exception());
		
		 for(Decorator dec:trigger.getActions()) {
			 if(dec != null && dec.getURI() != null && dec.getURI().equals(modifiedURI))
				 return true;
		 }
		
		return false;
	}

	private String getProject(URI uri) {
		if(uri.toString().startsWith("platform:/resource")) {
			String s1 = uri.toString().substring(19); // "platform:/resource"
			int is = s1.indexOf("/");
			String project = s1.substring(0, is); 
			return project;
		} else if(uri.toString().startsWith("file:/")) {
			// Trickier, detect known folders
			String sURI = uri.toString();
			int ind = sURI.indexOf("/models/");
			if(ind == -1)
				ind = sURI.indexOf("/decorators/");
			if(ind == -1)
				ind = sURI.indexOf("/experiments/");
			if(ind == -1)
				ind = sURI.indexOf("/graphs/");
			if(ind == -1)
				ind = sURI.indexOf("/loggers/");
			if(ind == -1)
				ind = sURI.indexOf("/modifiers/");
			if(ind == -1)
				ind = sURI.indexOf("/predicates/");
			if(ind == -1)
				ind = sURI.indexOf("/sequencers/");
			if(ind == -1)
				ind = sURI.indexOf("/scenarios/");
			if(ind == -1)
				ind = sURI.indexOf("/triggers/");
			if(ind == -1)
				ind = sURI.indexOf("/solvers/");

			if(ind >= 0) {
				String uri2 = sURI.substring(0, ind);
				int i2 = uri2.lastIndexOf("/");
				if(i2 > -1) return uri2.substring(i2+1);
			}
		}
		return null;
	}
	
	private String getType(URI uri) {
		if(!uri.toString().startsWith("platform:/resource")) return null;

		String s1 = uri.toString().substring(19); // "platform:/resource"
		int is = s1.indexOf("/");
		String _project = s1.substring(is+1);
		int is2 = _project.indexOf("/");
		if(is2 == -1) return ""; // no type
		String type = _project.substring(0, is2);
		return type;
	}
	
	/**
	 * Invoked after a bundle had been loaded/unloaded/changed. We need to unload resources in the project explorer's resource set and 
	 * refresh the viewer
	 */
	public void bundleChanged(BundleEvent event) {
		if(event.getType() == BundleEvent.INSTALLED || event.getType() == BundleEvent.UNINSTALLED)
			org.eclipse.stem.core.Utility.unloadAllResources();
		
//		final Display display = DisplaySafeExecutor.safeGetDefaultDisplay();
//		// Is the display valid?
//		if (display != null) {
//			// Yes
//			display.asyncExec(new Runnable() {
//				public void run() {
//					viewer.refresh();
//				}
//			});
//		} // if		
	}
	
	public static Viewer getViewer()
	{
		return viewer;
	}
	
} // IdentifiableContentProvider
