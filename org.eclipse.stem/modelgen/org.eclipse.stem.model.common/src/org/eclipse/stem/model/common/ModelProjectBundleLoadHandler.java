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
package org.eclipse.stem.model.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IRegistryEventListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.core.CorePlugin;
import org.eclipse.stem.ui.views.explorer.IdentifiableContentProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

/**
 * <p>
 * Handles the automatic install/uninstall of workspace-based plug-in projects
 * into the running OSGi container for use with the model generation tools.
 * </p>
 */
final class ModelProjectBundleLoadHandler {

	private static final ModelProjectBundleLoadHandler INSTANCE = new ModelProjectBundleLoadHandler();

	private final List<IProject> changedProjects = Collections
			.synchronizedList(new ArrayList<IProject>());

	private final List<IProject> managedBundleProjects = new CopyOnWriteArrayList<IProject>();
	private final List<Bundle> managedBundles = new CopyOnWriteArrayList<Bundle>();

	private BundleContext bundleContext;
	
	boolean DEBUG = true;

	private ModelProjectBundleLoadHandler() {
	}

	static ModelProjectBundleLoadHandler getInstance() {
		return INSTANCE;
	}

	void start(BundleContext ctx) {
		this.bundleContext = ctx;
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				resourceListener,
				IResourceChangeEvent.PRE_CLOSE
						| IResourceChangeEvent.PRE_DELETE
						| IResourceChangeEvent.POST_CHANGE
						| IResourceChangeEvent.POST_BUILD
						| IResourceChangeEvent.PRE_BUILD);
		Job.getJobManager().addJobChangeListener(jobListener);
		loadProjects();

		IExtensionRegistry registry = Platform.getExtensionRegistry();
		registry.addListener(registryEventListener);
	}
	

	void stop() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		registry.removeListener(registryEventListener);
		Job.getJobManager().removeJobChangeListener(jobListener);
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(
				resourceListener);
		shutdownProjects();
		this.bundleContext = null;
	}

	private void shutdownProjects() {
		for (IProject project : managedBundleProjects) {
			if (ModelProjectUtils.isValidProject(project)) {
				handleStopProject(project);
			}
		}
	}

	private void loadProjects() {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		for (IProject project : ws.getRoot().getProjects()) {
			if (ModelProjectUtils.isValidProject(project)) {
				handleUpdatedProject(project);
			}
		}
	}
	
	private void updateBuilders(IProject project) throws CoreException {
		ModelProjectNature.updateBuilders(project);
	}

	private void installAndStartProjectBundle(IProject project) {
		if (!ModelProjectUtils.isValidProject(project)) {
			return;
		}
		// TODO This needs to differentiate between bundles installed
		// into the container when launched and those being installed and/or
		// updated
		// by this utility into the running container
		Bundle bundle = getBundleForProject(project);
		if (bundle != null) {
			// Bundle already exists, determine what we should do instead.
			// For now, we'll just update
			updateBundle(bundle);
		} else {
			printDebug("Installing bundle for "
					+ project.getFullPath().toString());
			Bundle newBundle = null;
			try {
				newBundle = bundleContext.installBundle(project
						.getLocationURI().toString());
				newBundle.start();
			} catch (BundleException be) {
				if (newBundle != null) {
					stopAndUninstallBundle(newBundle);
				}

				Activator.log(new Status(Status.ERROR, project.getName(),
						"Error installing project bundle into OSGi container",
						be));
			}
			printDebug("  ... bundle installed  "
					+ project.getFullPath().toString());
			managedBundleProjects.add(project);
			managedBundles.add(newBundle);
		}
	}

	private void updateBundle(Bundle bundle) {
		try {
			printDebug("Updating bundle for " + bundle.getLocation());
			bundle.update();
			printDebug("  ... bundle updated for "
					+ bundle.getLocation());
		} catch (BundleException be) {
			Activator.log(new Status(Status.ERROR, bundle.getSymbolicName(),
					"Error updating the installed bundle.", be));
		}
	}

	private void stopAndUninstallBundle(final Bundle bundle) {
		try {
			bundle.stop();
		} catch (BundleException e) {
			e.printStackTrace();
		}

		try {
			bundle.uninstall();
		} catch (BundleException e) {
			e.printStackTrace();
		}
	}

	private void handleUpdatedProject(IProject project) {
		if (!ModelProjectUtils.isValidProject(project)) {
			return;
		}

		
		try {
			updateBuilders(project);
			int severity = project.findMaxProblemSeverity(IMarker.PROBLEM,
					true, IResource.DEPTH_INFINITE);
			if (severity >= IMarker.SEVERITY_ERROR) {
				
				// TODO should we automatically try another rebuild if the first load of the 
				// workspace indicates an error condition
				project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD,
						"org.eclipse.stem.model.builder.MetamodelBuilder",
						Collections.<String, String> emptyMap(),
						new NullProgressMonitor());
				
				// Error building project. Should not take action to
				// install or update when this occurs
				Activator.log(new Status(Status.WARNING, project.getName(),
						"Error building project, cannot install", null));
			} else {
				installAndStartProjectBundle(project);
				// touchDecorators();
			}
		} catch (CoreException ce) {
			ce.printStackTrace();
		}

	}

	private void handleStopProject(IProject project) {
		if (!ModelProjectUtils.isValidProject(project)) {
			return;
		}

		// TODO This needs to differentiate between bundles installed
		// into the container when launched and those being installed and/or
		// updated
		// by this utility into the running container
		Bundle bundle = getBundleForProject(project);
		if (bundle != null) {
			managedBundleProjects.remove(project);
			managedBundles.remove(bundle);
			printDebug("Uninstalling bundle for "
					+ project.getFullPath().toString());
			stopAndUninstallBundle(bundle);
			printDebug("  ... bundle uninstalled for "
					+ project.getFullPath().toString());
		}
	}

	private Bundle getBundleForProject(IProject project) {
		Bundle b = Platform.getBundle(project.getName());
		if (b != null) {
			printDebug("Bundle location:" + b.getLocation());
			printDebug("Project location:"
					+ project.getLocation().toString());
			return b;
		}
		return null;
	}

	private Set<String> changedPlugins = new CopyOnWriteArraySet<String>();

	private void handleExtensionsAdded(IExtension[] added) {
		for (IExtension extension : added) {
			changedPlugins.add(extension.getContributor().getName());
		}
	}
	
	private final IResourceChangeListener resourceListener = new IResourceChangeListener() {

		@Override
		public void resourceChanged(final IResourceChangeEvent event) {

			if ((event.getType() == IResourceChangeEvent.PRE_CLOSE || event
					.getType() == IResourceChangeEvent.PRE_DELETE)
					&& event.getResource() instanceof IProject) {

				handleStopProject((IProject) event.getResource());
			} else if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
				try {
					if (event.getDelta() != null) {
						event.getDelta().accept(new IResourceDeltaVisitor() {

							@Override
							public boolean visit(IResourceDelta delta)
									throws CoreException {
								if (delta.getResource() instanceof IProject) {
									IProject proj = (IProject) delta
											.getResource();
									synchronized (changedProjects) {
										if (!changedProjects.contains(proj)) {
											changedProjects.add(proj);
										}
									}
									return false;
								}

								return true;
							}
						});
					}
				} catch (CoreException ce) {
					ce.printStackTrace();
				}
			}

		}

	};

	private final IRegistryEventListener registryEventListener = new IRegistryEventListener() {

		@Override
		public void removed(IExtensionPoint[] extensionPoints) {
		}

		@Override
		public void removed(IExtension[] extensions) {
		}

		@Override
		public void added(IExtensionPoint[] extensionPoints) {
		}

		@Override
		public void added(IExtension[] extensions) {
			handleExtensionsAdded(extensions);
		}
	};

	private final IJobChangeListener jobListener = new JobChangeAdapter() {
		@Override
		public void done(IJobChangeEvent event) {
			Job job = event.getJob();
			if (job.getName().equals("Registry event dispatcher")) {
				resourceUpdateJob.schedule();
				return;
			}

			if (job.belongsTo(CorePlugin.FAMILY_STEM_SIMULATION)) {
				printDebug("[Job Done] STEM Simulation");
			}

			if (job.belongsTo(ResourcesPlugin.FAMILY_AUTO_BUILD)
					|| job.belongsTo(ResourcesPlugin.FAMILY_MANUAL_BUILD)) {
				printDebug("build completed, scheduling bundle update");
				bundleLoaderJob.schedule();
			}
		}

	};

	private final UIJob resourceUpdateJob = new UIJob("Resource update job") {

		@Override
		public boolean belongsTo(Object family) {
			return super.belongsTo(family);
		}
		
		private void checkShouldUpdateResource(Resource r) {
			if (r.getContents().isEmpty()) {
				return;
			}
			EObject obj = r.getContents().get(0);
			if (obj != null) {
				
				if(obj instanceof org.eclipse.core.runtime.Plugin) {
					org.eclipse.core.runtime.Plugin plgin = (org.eclipse.core.runtime.Plugin)obj;
					Bundle br = plgin.getBundle();
				
					/*
				}
				ClassLoader cl = obj.getClass().getClassLoader();
				if (cl instanceof BundleClassLoader) {
					Bundle br = ((BundleClassLoader)cl).getBundle();
					*/
					
					if (changedPlugins.contains(br.getSymbolicName())) {
						try {
							r.unload();
							r.load(null);
						} catch (IOException e) {
							e.printStackTrace();
						}
						printDebug("Resource reloaded:  "+ r.getURI());
					}
				}
			}
		}
		
		private void checkResourceSet(ResourceSet rs) {
			synchronized(rs) {
				for (Resource r : rs.getResources()) {
					checkShouldUpdateResource(r);
				}
			}
		}
		
		private List<ResourceSet> getEditorResourceSets() {
			List<ResourceSet> resourceSets = new ArrayList<ResourceSet>();
			for (IEditorReference ref : PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage()
					.getEditorReferences()) {
				IEditorPart editor = ref.getEditor(false);
				if (editor instanceof IEditingDomainProvider) {
					resourceSets.add(((IEditingDomainProvider)editor).getEditingDomain().getResourceSet());
				}
			}
			return resourceSets;
		}

		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (!changedPlugins.isEmpty()) {
				checkResourceSet(org.eclipse.stem.core.Utility.resourceSet);
				for (ResourceSet rs : getEditorResourceSets()) {
					checkResourceSet(rs);
				}
				changedPlugins.clear();
				
				Viewer viewer = IdentifiableContentProvider.getViewer();
				if (viewer != null && !viewer.getControl().isDisposed()) {
					viewer.refresh();
				}
			}
			return Status.OK_STATUS;
		}
	};

	private final Job bundleLoaderJob = new Job("Bundle Loader Job") {

		@Override
		protected IStatus run(final IProgressMonitor monitor) {

			monitor.beginTask("Updating bundle packages", 4);
	        SubMonitor subMonitor = SubMonitor.convert(monitor, "Updating bundle packages", 4);


			printDebug("Starting bundle load job");
			try {
				printDebug("Waiting for build and simulation to complete...");
				getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD,
						subMonitor.split(1));
				getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD,
						subMonitor.split(1));
				getJobManager().join(CorePlugin.FAMILY_STEM_SIMULATION,
						subMonitor.split(1));
				printDebug("Done waiting for simulation and build to complete...");
			} catch (InterruptedException ie) {
				return Status.CANCEL_STATUS;
			}
			if (!monitor.isCanceled()) {
				synchronized (changedProjects) {
					for (IProject project : changedProjects) {
						handleUpdatedProject(project);
					}
					changedProjects.clear();
					monitor.worked(1);
				}

			}

			monitor.done();
			printDebug("Done updating bundles...");

			return Status.OK_STATUS;
		}

	};

	// private final BundleListener bundleListener = new BundleListener() {
	//
	// @Override
	// public void bundleChanged(BundleEvent event) {
	// if (managedBundles.contains(event.getBundle())) {
	//
	// String op = null;
	// switch (event.getType()) {
	// case BundleEvent.INSTALLED: op = "installed";break;
	// case BundleEvent.LAZY_ACTIVATION: op = "lazy activation";break;
	// case BundleEvent.RESOLVED: op = "resolved";break;
	// case BundleEvent.STARTED: op = "started";break;
	// case BundleEvent.STARTING: op = "starting";break;
	// case BundleEvent.STOPPED: op = "stopped";break;
	// case BundleEvent.STOPPING: op = "stopping";break;
	// case BundleEvent.UNINSTALLED: op = "uninstalled";break;
	// case BundleEvent.UNRESOLVED: op = "unresolved";break;
	// case BundleEvent.UPDATED: op = "updated";break;
	// }
	//
	// if (event.getType() == BundleEvent.STARTED) {
	// //touchDecorators();
	// printDebug("bundle event: "+ event + " => "+ op);
	//
	// try {
	// Thread.sleep(1000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// // for(Resource r:
	// org.eclipse.stem.core.Utility.resourceSet.getResources()) {
	// // r.setModified(true);
	// // }
	// }
	//
	// //printDebug("bundle event: "+ event + " => "+ op);
	// }
	// }
	// };
	//
	
	private void printDebug(String s) {
		if (DEBUG) {
			System.out.println(s);
		}
	}

}
