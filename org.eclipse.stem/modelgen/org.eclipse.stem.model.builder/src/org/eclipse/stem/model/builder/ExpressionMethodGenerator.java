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
package org.eclipse.stem.model.builder;

import java.io.InputStream;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.stem.model.codegen.xtext.ExpressionsClassGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.StringInputStream;

public class ExpressionMethodGenerator 
{	
	private GenClass labelGenClass;
	
	private GenClass modelGenClass;
	
	private GenClass labelValueGenClass;
	
	private IProject project;
	
	public ExpressionMethodGenerator(IProject project, GenClass modelGenClass, GenClass labelGenClass, GenClass labelValueGenClass)
	{
		this.modelGenClass = modelGenClass;
		this.labelGenClass = labelGenClass;
		this.labelValueGenClass = labelValueGenClass;
		this.project = project;
	}

	private ExpressionsClassGenerator getExpressionMethodGenerator()
	{
		return new ExpressionsClassGenerator();
	}

	public void generate(List<XtextResource> resources) {
		ExpressionsClassGenerator gen = getExpressionMethodGenerator();
		gen.setModelGenClass(modelGenClass);
		gen.setLabelGenClass(labelGenClass);
		gen.setLabelValueGenClass(labelValueGenClass);
		
		ImportManager importManager = new ImportManager(modelGenClass.getGenPackage().getClassPackageName());
		importManager.addMasterImport(modelGenClass.getGenPackage().getClassPackageName(), getExpressionsClassFileName());    
		gen.setImportManager(importManager);
		//EclipseResourceFileSystemAccess2 fsa = fileSystemAccessProvider.get();//new EclipseResourceFileSystemAccess2();
		//fsa.setProject(project);
		//fsa.setMonitor(new NullProgressMonitor());
		
		InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		gen.doGenerate(resources, fsa);

		String body = fsa.getTextFiles().values().iterator().next().toString();
		writeToFile(body);
	}
	
	protected IProject getProject()
	{
		return project;
	}
	
	protected void writeToFile(String body)
	{
		IPath expressionsFilePath = getExpressionsFilePath();
		IFile expressionsFile = project.getWorkspace().getRoot().getFile(expressionsFilePath);;
		
		InputStream is = new StringInputStream(body);
		try {
			if (expressionsFile.exists()) {
				expressionsFile.setContents(is, true, false, new NullProgressMonitor());
			} else {
				expressionsFile.create(is, true, new NullProgressMonitor());
			}
		} catch (CoreException ce) {
			ce.printStackTrace();
			// TODO Log to system log
		}
		
		try {
			getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException ce) {
			// ignore
		}
	}
	
	protected String getExpressionsClassFileName()
	{
		return modelGenClass.getName() + "Expressions.java";
	}
	
	protected IPath getExpressionsFilePath() {
		StringBuilder path = new StringBuilder();
		path.append("src/");
		path.append(modelGenClass.getGenPackage().getClassPackageName().replace('.', '/'));
		path.append("/");
		path.append(getExpressionsClassFileName());
		return project.getFullPath().append(path.toString());
	}
	
}
