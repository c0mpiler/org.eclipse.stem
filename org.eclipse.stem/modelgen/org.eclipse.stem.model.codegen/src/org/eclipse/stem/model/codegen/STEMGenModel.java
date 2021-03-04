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

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;

/**
 * Wrapper for GenModel. Provides STEM-specific methods for STEM's Model
 * Generator.
 * 
 */
public class STEMGenModel {
	private GenModel genModel;

	public STEMGenModel(GenModel model) {
		this.genModel = model;
	}

	public static STEMGenModel get(GenModel model) {
		return new STEMGenModel(model);
	}

	public Set<String> getEditorRequiredPlugins() {
		Set<String> retVal = new HashSet<String>(genModel.getEditorRequiredPlugins());

		for (GenPackage genPackage : genModel.getUsedGenPackages()) {
			GenModel genModel = genPackage.getGenModel();
			if (genModel.hasEditorSupport()) {
				retVal.add(genModel.getEditorPluginID());
			}
		}
		
		// TODO this is a hack to avoid compile errors on regeneration of metamodels 
		// due to additions to manifest
		retVal.add("org.eclipse.emf.ecore.edit");

		for (GenPackage pkg : genModel.getGenPackages()) {
			retVal.addAll(STEMGenPackage.get(pkg).getContributingPlugins());
		}
		

		return retVal;
	}
	
	public org.eclipse.stem.model.metamodel.Package getMetamodel()
	{
		// get metamodel
		
		EPackage ePackage = genModel.getEcoreGenPackage().getEcorePackage();
		
		EAnnotation annotation = ePackage.getEAnnotation(CodeGenConstants.METAMODEL_URI_ANNOTATION_SOURCE);
		
		if (annotation != null) {
			String uri = annotation.getDetails().get("uri");
			try {
				return GeneratorUtils.loadMetamodel(URI.createURI(uri));
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		return null;
	}

}
