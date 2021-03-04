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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.model.codegen.descriptor.ModelGeneratorDescriptor;

/**
 * 
 * 
 */
public class ModelGeneratorDescriptors {
	private static ModelGeneratorDescriptors INSTANCE;
	private List<ModelGeneratorDescriptor> descriptors = new ArrayList<ModelGeneratorDescriptor>();

	private ModelGeneratorDescriptors() {
		init();
	}

	public synchronized static ModelGeneratorDescriptors getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ModelGeneratorDescriptors();
		}
		return INSTANCE;
	}

	private void init() {
		for (IConfigurationElement element : Platform
				.getExtensionRegistry()
				.getConfigurationElementsFor(
						CodeGenConstants.MODEL_TYPE_DESCRIPTOR_EXTENSION_POINT_ID)) {
			descriptors.add(new ModelGeneratorDescriptor(element));
		}
	}

	public List<ModelGeneratorDescriptor> getDescriptors() {
		return descriptors;
	}

	public ModelGeneratorDescriptor getDescriptorForEClass(EClass eClass) {
		for (ModelGeneratorDescriptor descriptor : getDescriptors()) {
			if (descriptor.isDescriptorFor(eClass)) {
				return descriptor;
			}
		}
		return null;
	}

	public ModelGeneratorDescriptor getDescriptorForGenClass(GenClass genClass) {
		for (ModelGeneratorDescriptor descriptor : getDescriptors()) {
			if (descriptor.isDescriptorFor(genClass)) {
				return descriptor;
			}
		}
		return null;
	}

	public List<ModelGeneratorDescriptor> getDescriptorsForGenPackage(
			GenPackage genPackage) {
		List<ModelGeneratorDescriptor> validDescriptors = new ArrayList<ModelGeneratorDescriptor>();
		for (GenClass genClass : genPackage.getGenClasses()) {
			ModelGeneratorDescriptor descriptor = getDescriptorForGenClass(genClass);
			if (descriptor != null && !validDescriptors.contains(descriptor)) {
				validDescriptors.add(descriptor);
			}
		}
		return validDescriptors;
	}

}
