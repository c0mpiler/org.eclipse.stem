/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.codegen;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.codegen.util.GIFEmitter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;

/**
 * EMF Code Generator Adapter for creating STEM Computational Models.  
 * This class provides functionality to generate various components
 * required for STEM computational models that are not normally 
 * handled by EMF.
 * 
 * This class is not intended to be instantiated directly by client.
 * It is instantiated by the generator adapter factory, which is invoked
 * by the EMF master code generator.
 *
 */
public class ModelGeneratorAdapter extends AbstractGeneratorAdapter 
{
	private static List<String> WARNING_LIST = new LinkedList<String>();
	
	public static final int PropertyStringProviderAdapterFactory = 0;
	public static final int PropertyEditorAdapter = 1;
	public static final int PropertyEditor = 2;
	public static final int PropertyEditorAdapterFactory = 3;
	public static final int WizardMessages = 4;
	public static final int WizardMessagesProperties = 5;
	public static final int RelativeValueProviderAdapterFactory = 6;

	/**
	 * Descriptors for the custom templates in the STEM Model Generator
	 */
	JETEmitterDescriptor[] descriptors = new JETEmitterDescriptor[] {
		new JETEmitterDescriptor(
				"editor/PropertyStringProviderAdapterFactory.javajet",
				"org.eclipse.emf.codegen.ecore.templates.editor.PropertyStringProviderAdapterFactory"),
		new JETEmitterDescriptor(
				"editor/PropertyEditorAdapter.javajet",
				"org.eclipse.emf.codegen.ecore.templates.editor.PropertyEditorAdapter"),
		new JETEmitterDescriptor(
				"editor/PropertyEditor.javajet",
				"org.eclipse.emf.codegen.ecore.templates.editor.PropertyEditor"),
		new JETEmitterDescriptor(
				"editor/PropertyEditorAdapterFactory.javajet",
				"org.eclipse.emf.codegen.ecore.templates.editor.PropertyEditorAdapterFactory"),
		new JETEmitterDescriptor(
				"editor/WizardMessages.javajet",
				"org.eclipse.emf.codegen.ecore.templates.editor.WizardMessages"),
		new JETEmitterDescriptor(
				"editor/WizardMessages.propertiesjet",
				"org.eclipse.emf.codegen.ecore.templates.editor.WizardMessagesProperties"),
		new JETEmitterDescriptor(
				"editor/RelativeValueProviderAdapterFactory.javajet",
				"org.eclipse.emf.codegen.ecore.templates.editor.RelativeValueProviderAdapterFactory")
	};

	public static final String EDIT_PROJECT_TYPE = "org.eclipse.emf.codegen.ecore.genmodel.generator.EditProject";

	public static final String EDITOR_PROJECT_TYPE = "org.eclipse.emf.codegen.ecore.genmodel.generator.EditorProject";

	/* (non-Javadoc)
	 * @see org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapter#canGenerate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean canGenerate(Object object, Object projectType) {
		if (EDITOR_PROJECT_TYPE.equals(projectType)) {
			if (object instanceof GenPackage) {
				STEMGenPackage pkg = STEMGenPackage.get((GenPackage)object);
				return pkg.hasComputationalModel();
			}
		}
		
		if (EDIT_PROJECT_TYPE.equals(projectType)) {
			if (object instanceof GenClass) {
				return STEMGenClass.get((GenClass)object).isComputationalModel();
			}
		}
		

		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapter#getUserTemplatePath()
	 */
	protected List<String> getUserTemplatePath() {
		List<String> templatePath = new ArrayList<String>();
		templatePath.add(Activator.getContext().getBundle()
				.getResource("templates").toString());

		String templateLocation = ((GenBase) generatingObject).getGenModel()
				.getTemplateDirectory();
		if (templateLocation != null && templateLocation.length() != 0) {
			if (templateLocation.indexOf(':') == -1) {
				templateLocation = URI.createPlatformResourceURI(
						templateLocation, true).toString();
			}
			templatePath.add(templateLocation);
		}

		return templatePath;
	}

	protected void addClasspathEntries(JETEmitter jetEmitter)
			throws JETException {
		jetEmitter.addVariable("EMF_CODEGEN", "org.eclipse.emf.codegen");
		jetEmitter.addVariable("EMF_CODEGEN_ECORE",
				"org.eclipse.emf.codegen.ecore");
		jetEmitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
		jetEmitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");
		jetEmitter.addVariable("STEM_CODEGEN", "org.eclipse.stem.model.codegen");

		super.addClasspathEntries(jetEmitter);
	}

	protected void generateWizardMessageProperties(STEMGenPackage stemGenerator,
			Monitor monitor) {

		GenPackage genPackage = stemGenerator.getGenPackage();

		URI targetDirectory = toURI(
				genPackage.getGenModel().getEditorDirectory()).appendSegments(
						genPackage.getPresentationPackageName().split("\\."));

		message = "Generating Wizard Message Properties";
		monitor.subTask(message);
		generateProperties(targetDirectory.toString() + "/messages.properties",
				getJETEmitter(descriptors, WizardMessagesProperties), 
				new Object[] { new Object[] { stemGenerator }},
				createMonitor(monitor, 1));

	}

	protected void generatePropertyStringProvider(STEMGenPackage stemGenerator,
			Monitor monitor) {

		
		GenPackage genPackage = stemGenerator.getGenPackage();

		message = "Generating Property String Provider";
		monitor.subTask(message);
		generateJava(genPackage.getGenModel().getEditorDirectory(),
				genPackage.getPresentationPackageName(), genPackage.getPrefix()
				+ "PropertyStringProviderAdapterFactory",
				getJETEmitter(descriptors, PropertyStringProviderAdapterFactory), 
				new Object[] { new Object[] { stemGenerator }},
				createMonitor(monitor, 1));
	}
	
	protected void generateRelativeValueProviders(STEMGenPackage stemGenerator,
			Monitor monitor) {

		
		GenPackage genPackage = stemGenerator.getGenPackage();

		message = "Generating Relative Value Providers";
		monitor.subTask(message);
		generateJava(genPackage.getGenModel().getEditorDirectory(),
				genPackage.getPresentationPackageName(), genPackage.getPrefix()
				+ "RelativeValueProviderAdapterFactory",
				getJETEmitter(descriptors, RelativeValueProviderAdapterFactory), 
				new Object[] { new Object[] { stemGenerator }},
				createMonitor(monitor, 1));
	}

	protected void generatePropertyEditorAdapter(STEMGenClass stemGenerator,
			Monitor monitor) {

		GenClass genClass = stemGenerator.getGenClass();
		GenPackage genPackage = genClass.getGenPackage();

		STEMGenClass adapterGenerator = STEMGenClass.get(genClass);
		
		message = "Generating Model Adapter";
		monitor.subTask(message);
		generateJava(genPackage.getGenModel().getEditorDirectory(),
				genPackage.getPresentationPackageName(), genClass.getName()
				+ "PropertyEditorAdapter",
				getJETEmitter(descriptors, PropertyEditorAdapter), 
				new Object[] { new Object[] { adapterGenerator }},
				createMonitor(monitor, 1));
	}


	protected void generateModelPropertyEditor(STEMGenClass stemGenerator,
			Monitor monitor) {

		GenClass genClass = stemGenerator.getGenClass();
		GenPackage genPackage = genClass.getGenPackage();
		
		message = "Generating Property Editor for "+ genClass.getName();
		monitor.subTask(message);
		generateJava(genPackage.getGenModel().getEditorDirectory(),
				genPackage.getPresentationPackageName(), genClass.getName()
				+ "PropertyEditor",
				getJETEmitter(descriptors, PropertyEditor), 
				new Object[] { new Object[] { stemGenerator }},
				createMonitor(monitor, 1));
	}

	protected void generateModelPropertyEditorAdapterFactory(STEMGenPackage stemGenerator,
			Monitor monitor) {

		GenPackage genPackage = stemGenerator.getGenPackage();

		message = "Generating Model Property Editor Adapter Factory";
		monitor.subTask(message);
		generateJava(genPackage.getGenModel().getEditorDirectory(),
				genPackage.getPresentationPackageName(), genPackage.getPrefix()
				+ "PropertyEditorAdapterFactory",
				getJETEmitter(descriptors, PropertyEditorAdapterFactory), 
				new Object[] { new Object[] { stemGenerator }},
				createMonitor(monitor, 1));
	}

	protected void generateModelWizardMessages(STEMGenPackage stemGenerator,
			Monitor monitor) {

		GenPackage genPackage = stemGenerator.getGenPackage();

		message = "Generating Model Wizard Messages";
		monitor.subTask(message);
		generateJava(genPackage.getGenModel().getEditorDirectory(),
				genPackage.getPresentationPackageName(), genPackage.getPrefix()
				+ "WizardMessages",
				getJETEmitter(descriptors, WizardMessages), 
				new Object[] { new Object[] { stemGenerator }},
				createMonitor(monitor, 1));
	}
	
	protected void generateModelIcon(final STEMGenClass stemGenClass,
			Monitor monitor) {
		final GenClass genClass = stemGenClass.getGenClass();

		message = CodeGenEcorePlugin.INSTANCE.getString(
				"_UI_GeneratingItemIcon_message",
				new Object[] { genClass.getItemIconFileName() });
		monitor.subTask(message);
		generateGIF(genClass.getItemIconFileName(),

		new GIFEmitter("") {

			@Override
			public byte[] generateGIF(String key1, String key2) {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				InputStream is = null;
				try {
					URL u = new URL(stemGenClass.getIcon().toString());
					is = u.openStream();
					
					byte[] data = new byte[1024];
					int bytes;
					while ((bytes = is.read(data, 0, data.length)) != -1) {
					  baos.write(data, 0, bytes);
					}

					baos.flush();

					return baos.toByteArray();
				} catch (Exception e) {
					addWarning("Error loading icon for "+ genClass.getName());
					e.printStackTrace();
				} finally {
					try {
						is.close();
						baos.close();
					}catch (Exception e) {}
				}
				
				return new byte[0];
				
			}

		}, genClass.getName(), null, false, createMonitor(monitor, 1));

	}

	@Override
	protected Diagnostic doGenerate(Object object, Object projectType,
			Monitor monitor) throws Exception {

		
		if (EDITOR_PROJECT_TYPE.equals(projectType)) {
			GenModel genModel = ((GenBase)object).getGenModel();
			ensureProjectExists(genModel.getEditorDirectory(), object,
					EDITOR_PROJECT_TYPE, genModel.isUpdateClasspath(),
					createMonitor(monitor, 1));
			
			if (object instanceof GenPackage) {
				GenPackage genPackage = (GenPackage) object;
		
				STEMGenPackage stemGenerator = STEMGenPackage.get(genPackage);
	
				generatePropertyStringProvider(stemGenerator, monitor);
				generateWizardMessageProperties(stemGenerator, monitor);
				
				generateModelPropertyEditorAdapterFactory(stemGenerator, monitor);
				generateModelWizardMessages(stemGenerator, monitor);
				generateRelativeValueProviders(stemGenerator, monitor);
				
				for (STEMGenClass genClass : stemGenerator.getComputationalModelClasses()) {
					generatePropertyEditorAdapter(genClass, monitor);
					generateModelPropertyEditor(genClass, monitor);
				}
			}
		}
		
		
		if (EDIT_PROJECT_TYPE.equals(projectType)) {
			GenModel genModel = ((GenBase)object).getGenModel();
			ensureProjectExists(genModel.getEditDirectory(), object,
					EDIT_PROJECT_TYPE, genModel.isUpdateClasspath(),
					createMonitor(monitor, 1));
			
			if (object instanceof GenClass) {
				GenClass genClass = (GenClass)object;
				STEMGenClass stemGenClass = STEMGenClass.get(genClass);
				
				if (stemGenClass.isComputationalModel()) {
					generateModelIcon(stemGenClass, monitor);	
				}
			}
			
		}
		/*else if (object instanceof GenClass) {
			GenClass genClass = (GenClass)object;
			STEMGenClass stemGenerator = STEMGenClass.get(genClass);
			
		}*/
		
		return Diagnostic.OK_INSTANCE;
	}

	/**
	 * Creates the import manager and stores it on the <code>GenModel</code>, for use its in computing names.
	 */
	@Override
	protected void createImportManager(String packageName, String className)
	{
		super.createImportManager(packageName, className);
		updateImportManager();
	}

	/**
	 * Clears the import manager and removes it from the <code>GenModel</code>.
	 */
	@Override
	protected void clearImportManager()
	{
		super.clearImportManager();
		updateImportManager();
	}

	private void updateImportManager()
	{
		if (generatingObject != null)
		{
			((GenBase)generatingObject).getGenModel().setImportManager(importManager);
		}
	}
	
	
	public static void addWarning(String warningText)
	{
		System.err.println("[WARNING] "+ warningText);
		WARNING_LIST.add(warningText);
	}
	
	public static void pringWarnings()
	{
		if (WARNING_LIST.size() > 0) {
			System.out.println("Warnings from code generation:");
			for (String warning : WARNING_LIST) {
				System.out.println(" - " + warning);
			}
		}
	}

}
