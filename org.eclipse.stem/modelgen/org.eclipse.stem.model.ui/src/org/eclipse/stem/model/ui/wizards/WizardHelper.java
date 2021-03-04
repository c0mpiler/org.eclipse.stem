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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.stem.model.codegen.GeneratorUtils;
import org.eclipse.stem.model.codegen.ModelGeneratorDescriptors;
import org.eclipse.stem.model.codegen.descriptor.ModelGeneratorDescriptor;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.CompartmentType;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.metamodel.ModelParamConstraint;
import org.eclipse.stem.model.metamodel.ModelType;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.transform.EPackageManager;
import org.eclipse.stem.model.transform.MetamodelPackageManager;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.stem.model.ui.MetamodelEditorPlugin;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class WizardHelper {

	private static Map<ModelType, List<Model>> modelsByType;

	public static boolean openEditor(IWorkbench workbench, URI fileURI) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();

		try {
			final IPath path = new Path(fileURI.toPlatformString(true));
			IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			IDE.openEditor(page, f, true);
		} catch (PartInitException exception) {
			MessageDialog.openError(workbenchWindow.getShell(),
					"Error opening editor", exception.getMessage());
			return false;
		}

		return true;
	}

	public static Set<EClass> getEClassesForSuperType(EClass superType) {
		Set<EClass> matches = new HashSet<EClass>();
		for (Entry<String, Object> entry : EPackage.Registry.INSTANCE
				.entrySet()) {
			if (entry.getValue() instanceof EPackage) {
				getClassesFromEPackageForSuperType((EPackage) entry.getValue(),
						superType, matches);
			}
		}

		for (Entry<String, EPackage> entry : EPackageManager.getInstance()
				.getLoadedPackages().entrySet()) {

			getClassesFromEPackageForSuperType(entry.getValue(), superType,
					matches);

		}

		return matches;
	}

	// private static Map<ModelType, List<EClass>>
	// getTypesForSuperTypeByModelType(
	// EClass superType) {
	// Map<ModelType, List<EClass>> data = new HashMap<ModelType,
	// List<EClass>>();
	// preloadPackages();
	//
	// for (EClass clazz : getEClassesForSuperType(superType)) {
	// ModelType classModelType = getModelTypeForEClass(clazz);
	// if (classModelType != null) {
	// if (!data.containsKey(classModelType)) {
	// data.put(classModelType, new ArrayList<EClass>());
	// }
	// data.get(classModelType).add(clazz);
	// } else {
	// // Something's wrong. Print out an error
	// }
	// }
	//
	// return data;
	// }

	public static String[] getModelTypes() {
		ArrayList<String> values = new ArrayList<String>();
		for (ModelGeneratorDescriptor desc : ModelGeneratorDescriptors
				.getInstance().getDescriptors()) {
			values.add(desc.getModelType());
		}
		return (String[]) values.toArray(new String[values.size()]);

		// ModelType[] types = ModelType.values();
		// String[] typeStrings = new String[types.length];
		//
		// for (int idx=0; idx<types.length; idx++) {
		// typeStrings[idx] = types[idx].getLiteral();
		// }
		// return typeStrings;
	}

	private static Map<ModelType, List<Model>> getAllModelsByModelType(
			IProgressMonitor monitor) {
        SubMonitor subMonitor = SubMonitor.convert(monitor, "Main Task", 100);

		MetamodelPackageManager mgr = MetamodelPackageManager.getInstance();
		if (!mgr.isInitialized()) {
			mgr.loadAll(subMonitor.split(99));
		}

		Map<ModelType, List<Model>> modelsByType = new HashMap<ModelType, List<Model>>();

		for (Package pkg : MetamodelPackageManager.getInstance()
				.getLoadedPackages().values()) {
			for (Model model : pkg.getModels()) {
				List<Model> typeModels = modelsByType.get(model.getModelType());
				if (typeModels == null) {
					typeModels = new ArrayList<Model>();
					modelsByType.put(model.getModelType(), typeModels);
				}
				typeModels.add(model);
			}
		}
		subMonitor.worked(1);
		//monitor.done();

		return modelsByType;
	}

	public static ModelGeneratorDescriptor getDescriptorForModelType(
			ModelType type) {
		return null;
	}

	public static List<ModelGeneratorDescriptor> getModelGeneratorDescriptors() {
		return ModelGeneratorDescriptors.getInstance().getDescriptors();
	}

	public static ModelType getModelTypeForDescriptor(
			ModelGeneratorDescriptor descriptor) {
		return ModelType.get(descriptor.getModelType());
	}

	public static List<Model> getModelsForModelDescriptor(
			ModelGeneratorDescriptor descriptor, boolean reload,
			IProgressMonitor monitor) {
		if (reload || modelsByType == null) {
			modelsByType = getAllModelsByModelType(monitor);
		}

		return modelsByType.get(getModelTypeForDescriptor(descriptor));
	}

	public static List<Model> getModelsForModelType(ModelType modelType,
			boolean reload, IProgressMonitor monitor) {

        SubMonitor subMonitor = SubMonitor.convert(monitor, "Loading Metamodels", 1);

		if (reload || modelsByType == null) {
			modelsByType = getAllModelsByModelType(subMonitor.split(1));
		}

		return modelsByType.get(modelType);
	}

	public static List<CompartmentGroup> getCompartmentGroupsForModelType(
			ModelType modelType, boolean reload, IProgressMonitor monitor) {

		List<CompartmentGroup> compartmentGroups = new ArrayList<CompartmentGroup>();
		List<Model> models = getModelsForModelType(modelType, reload, monitor);
		for (Model model : models) {
			List<CompartmentGroup> pkgCgs = model.getContainerPackage()
					.getCompartmentGroups();
			for (CompartmentGroup cg : pkgCgs) {
				if (!compartmentGroups.contains(cg)) {
					compartmentGroups.add(cg);
				}
			}
		}
		return compartmentGroups;
	}

	private static boolean isChildOf(EClass subclass, EClass superClass) {
		boolean retVal = subclass.getEAllSuperTypes().contains(superClass);
		if (!retVal) {
			for (EClass cls : subclass.getEAllSuperTypes()) {
				retVal = superClass.getName().equals(cls.getName())
						&& superClass.getEPackage().getNsURI()
								.equals(cls.getEPackage().getNsURI());
				if (retVal) {
					break;
				}
			}
		}

		return retVal;
	}

	public static void getClassesFromEPackageForSuperType(EPackage pkg,
			EClass superType, Set<EClass> matches) {
		for (EPackage subPackage : pkg.getESubpackages()) {
			getClassesFromEPackageForSuperType(subPackage, superType, matches);
		}

		for (EClassifier classifier : pkg.getEClassifiers()) {
			if (classifier instanceof EClass) {
				if (isChildOf((EClass) classifier, superType)) {
					matches.add((EClass) classifier);
				}
			}
		}
	}

	// public static String getExtensionPointNameForModelType(ModelType
	// modelType) {
	// if (modelType == ModelType.DISEASE_MODEL) {
	// return DISEASE_MODEL_EXTENSION_POINT_NAME;
	// } else if (modelType == ModelType.POPULATION_MODEL) {
	// return POPULATION_MODEL_EXTENSION_POINT_NAME;
	// } else if (modelType == ModelType.FOOD_PRODUCTION_MODEL) {
	// return FOOD_PRODUCER_EXTENSION_POINT_NAME;
	// }
	//
	// return null;
	// }
	//
	// public static String getLabelOperationForModelType(ModelType modelType) {
	// if (modelType == ModelType.DISEASE_MODEL) {
	// return "createDiseaseModelLabel";
	// } else if (modelType == ModelType.POPULATION_MODEL) {
	// return "createPopulationModelLabel";
	// } else if (modelType == ModelType.FOOD_PRODUCTION_MODEL) {
	// return FOOD_PRODUCER_EXTENSION_POINT_NAME;
	// }
	//
	// return null;
	// }

	private static String getLabelOperationForModelType(ModelType modelType) {
		return "create" + modelType.getLiteral() + "Label";
	}

	public static EClass getLabelForModel(ModelType type, EClass model) {

		EClass retValue = null;
		try {
			// Class<?> clazz = model.getInstanceClass();
			EObject obj = EcoreUtil.create(model);
			// String s2 = model.getInstanceClassName();
			if (obj != null) {
				Method invoker = obj.getClass().getMethod(
						getLabelOperationForModelType(type), String.class);
				Object invokeResponse = invoker.invoke(obj,
						new Object[] { null });
				if (invokeResponse instanceof EObject) {
					retValue = ((EObject) invokeResponse).eClass();
				}
			} else {
				System.err.println("No instance class for " + model.getClass());
			}
		} catch (Throwable t) {
			// TODO Auto-generated catch block
			t.printStackTrace();
		}


		return retValue;
	}

	

	public static boolean isNullOrEmpty(String value) {
		return (value == null || value.isEmpty());
	}


	public static EDataType[] getDefaultCompartmentDataTypes() {
		return Constants.DEFAULT_COMPARTMENT_DATA_TYPES;
	}

	public static EClassifier[] getDefaultModelParamDataTypes() {
		return Constants.DEFAULT_PARAM_DATA_TYPES;
	}

	public static String getDefaultValueForDataType(EClassifier type) {
		if (type == EcorePackage.Literals.EDOUBLE
				|| type == EcorePackage.Literals.EFLOAT) {
			return "0.0";
		}

		if (type == EcorePackage.Literals.EINT
				|| type == EcorePackage.Literals.ESHORT
				|| type == EcorePackage.Literals.ELONG) {
			return "0";
		}

		if (type == EcorePackage.Literals.EBOOLEAN) {
			return "true";
		}

		return Constants.EMPTY_STRING;
	}

	public static String[] getAvailableConstraints(ModelParam param,
			ModelParamConstraint existingConstraint) {
		return Constants.DEFAULT_PARAM_CONSTRAINTS;
	}

	public static String safeGet(String value) {
		if (value == null) {
			return Constants.EMPTY_STRING;
		}
		return value;
	}

	public static String safeGet(Text field) {
		if (Constants.EMPTY_STRING.equals(field.getText().trim())) {
			return null;
		}
		return field.getText();
	}

	public static Package loadPackageFromUri(URI uri) throws Exception {
		Resource resource = new ResourceSetImpl().createResource(uri);
		resource.load(null);
		Package pkg = (Package) resource.getContents().get(0);

		return pkg;
	}

	public static void loadMetamodels(final boolean reload, IRunnableContext ctx) {
		if (reload || !MetamodelPackageManager.getInstance().isInitialized()) {
			try {
				ctx.run(true, true, new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor)
							throws InvocationTargetException,
							InterruptedException {
						MetamodelPackageManager.getInstance().loadAll(monitor);
					}
				});
			} catch (Exception e) {
				MetamodelEditorPlugin.log(new Status(Status.WARNING,
						MetamodelEditorPlugin.PLUGIN_ID, e.getMessage(), e));
			}
		}
	}

	public static void displayEcoreProjectSelectorDialog(Shell shell,
			IRunnableContext runContext) {
		final List<IProject> projects = new ArrayList<IProject>();

		try {
			runContext.run(true, true, new WorkspaceModifyOperation() {

				@Override
				protected void execute(IProgressMonitor monitor)
						throws CoreException, InvocationTargetException,
						InterruptedException {

					projects.addAll(EPackageManager.getInstance()
							.findECoresInWorkspace(monitor).keySet());
				}

			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Collections.sort(projects, new Comparator<IProject>() {
			@Override
			public int compare(IProject o1, IProject o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		final ListSelectionDialog dialog = new ListSelectionDialog(shell,
				projects, new WorkbenchContentProvider() {

					@Override
					public Object[] getChildren(Object element) {
						if (element instanceof Collection) {
							return ((Collection<?>) element).toArray();
						}
						return new Object[0];
					}

				}, new WorkbenchLabelProvider(),
				"Select the existing packages to load");
		dialog.setTitle("Open Resource");

		if (dialog.open() == Window.OK) {
			try {
				runContext.run(true, true, new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor monitor)
							throws CoreException, InvocationTargetException,
							InterruptedException {
						EPackageManager.getInstance().loadECoresFromProjects(
								getProjectsFromResult(dialog.getResult()),
								monitor);
					}
				});
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static List<IProject> getProjectsFromResult(Object[] results) {
		List<IProject> projects = new ArrayList<IProject>();
		if (results != null && results.length > 0) {
			for (Object result : results) {
				if (result instanceof IProject) {
					projects.add((IProject) result);
				}
			}
		}
		return projects;
	}

	public static List<ModelParam> getAllParametersForModel(Model model) {
		List<ModelParam> params = new ArrayList<ModelParam>();
		if (model != null) {
			params.addAll(getAllParametersForModel(model.getParentModel()));
			params.addAll(model.getParameters());
		}
		return params;
	}

	public static List<Compartment> getAllCompartmentsForGroup(
			CompartmentGroup cg) {
		List<Compartment> compartments = new ArrayList<Compartment>();
		if (cg != null) {
			compartments
					.addAll(getAllCompartmentsForGroup(cg.getParentGroup()));
			compartments.addAll(cg.getCompartments());

		}
		return compartments;
	}

	public static List<Compartment> getAllCompartmentsForModel(Model model) {
		return getAllCompartmentsForGroup(model.getCompartments());
	}

	public static List<Compartment> getAllIncidenceCompartmentsForModel(
			Model model) {
		List<Compartment> allCompartments = new ArrayList<Compartment>(
				getAllCompartmentsForModel(model));
		for (Iterator<Compartment> iter = allCompartments.iterator(); iter
				.hasNext();) {
			Compartment c = iter.next();
			if (c.getType() != CompartmentType.INCIDENCE) {
				iter.remove();
			}
		}
		return allCompartments;
	}

	public static String getFirstMatchingModelName(Package pkg) {
		List<String> modelNames = new ArrayList<String>();
		for (Model m : pkg.getModels()) {
			String name = m.getName();
			if (modelNames.contains(name)) {
				return name;
			}
			modelNames.add(name);
		}
		return null;
	}

	public static String formatToCapWords(String str) {
		return GeneratorUtils.formatToCapWords(str);
	}

	public static String formatToCamelCase(String str) {
		return GeneratorUtils.formatToCamelCase(str);
	}

	public static String formatToUpperCaseWordsNoSpaces(String str) {
		return GeneratorUtils.formatToUpperCaseWordsNoSpaces(str);
	}

	public static String formatToJavaPackageName(String str) {
		return GeneratorUtils.formatToJavaPackageName(str);
	}

	public static boolean isValidJavaPackageName(String str) {
		return GeneratorUtils.isValidJavaPackageName(str);
	}

	public static boolean isValidJavaName(String str) {
		return GeneratorUtils.isValidJavaName(str);
	}

}
