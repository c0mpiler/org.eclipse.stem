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
package org.eclipse.stem.model.codegen.descriptor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

public class ModelGeneratorDescriptor
{
	protected Map<String,Object> descriptorData = new HashMap<String,Object>();
	protected String modelType;
	protected IConfigurationElement element;
	
	public ModelGeneratorDescriptor(IConfigurationElement element)
	{
		super();
		this.element = element;
		init();
	}
	
	private void init()
	{
		modelType = element.getAttribute("name");
		descriptorData.put("extensionPointId", element.getAttribute("extensionPointId"));
		descriptorData.put("iconPath", element.getAttribute("iconPath"));
		for (IConfigurationElement child : element.getChildren()) {
			processElement(child);
		}
	}
	
	private void processElement(IConfigurationElement element) {
		if (element.getAttribute("class") != null) {
			// "Class" string type
			descriptorData.put(element.getName(), new JavaClassDescriptor(element.getAttribute("class")));
		} else if (element.getAttribute("packageUri") != null && element.getAttribute("className") != null) {
			// EClass descriptor
			descriptorData.put(element.getName(), new EClassDescriptor(element.getAttribute("packageUri"), element.getAttribute("className")));
		} else {
			// Unknown type
			descriptorData.put(element.getName(), new UnknownElementDescriptor(element));
		}
	}
	
	public String getModelType()
	{
		return modelType;
	}
	
	public String getExtensionPointId()
	{
		return (String)descriptorData.get("extensionPointId");
	}
	
	public String getIconPath()
	{
		return (String)descriptorData.get("iconPath");
	}
	
	public URI getIconURI()
	{
		String pathName = "/" + element.getContributor().getName() + "/" + getIconPath();
		return URI.createPlatformPluginURI(pathName, true);
	}
	
	public EClassDescriptor getEClassDescriptor(String key)
	{
		Object obj = descriptorData.get(key);
		if (obj instanceof EClassDescriptor) {
			return (EClassDescriptor)obj;
		}
		return null;
	}
	
	public JavaClassDescriptor getJavaClassDescriptor(String key)
	{
		Object obj = descriptorData.get(key);
		if (obj instanceof JavaClassDescriptor) {
			return (JavaClassDescriptor)obj;
		}
		return null;
	}
	
	public EClassDescriptor getBaseModel()
	{
		return getEClassDescriptor("baseModel");
	}

	public EClassDescriptor getBaseLabel()
	{
		return getEClassDescriptor("baseLabel");
	}
	
	public EClassDescriptor getBaseLabelValue()
	{
		return getEClassDescriptor("baseLabelValue");
	}

	public JavaClassDescriptor getPropertyEditor()
	{
		return getJavaClassDescriptor("propertyEditor");
	}

	public JavaClassDescriptor getPropertyEditorComposite()
	{
		return getJavaClassDescriptor("propertyEditorComposite");
	}
	
	public JavaClassDescriptor getPropertyEditorAdapter()
	{
		return getJavaClassDescriptor("propertyEditorAdapter");
	}
	
	public JavaClassDescriptor getPropertyStringAdapter()
	{
		return getJavaClassDescriptor("propertyStringAdapter");
	}
	
	public JavaClassDescriptor getPropertyEditorAdapterFactory()
	{
		return getJavaClassDescriptor("propertyEditorAdapterFactory");
	}
	
	public JavaClassDescriptor getPropertyStringAdapterFactory()
	{
		return getJavaClassDescriptor("propertyStringAdapterFactory");
	}
	
	public JavaClassDescriptor getLabelRelativeValueProvider()
	{
		return getJavaClassDescriptor("labelRelativeValueProvider");
	}
	
	public JavaClassDescriptor getLabelValueRelativeValueProvider()
	{
		return getJavaClassDescriptor("labelValueRelativeValueProvider");
	}
	
	public boolean isDescriptorFor(GenClass genClass)
	{
		for (String key : descriptorData.keySet()) {
			if (isDescriptorFor(key, genClass)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isDescriptorFor(EClass eClass)
	{
		for (String key : descriptorData.keySet()) {
			if (isDescriptorFor(key, eClass)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isDescriptorFor(String dataKey, GenClass genClass)
	{
		Object obj = descriptorData.get(dataKey);
		if (obj instanceof EClassDescriptor) {
			if (((EClassDescriptor)obj).isSuperTypeOf(genClass)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isDescriptorFor(String dataKey, EClass eClass)
	{
		Object obj = descriptorData.get(dataKey);
		if (obj instanceof EClassDescriptor) {
			if (((EClassDescriptor)obj).isSuperTypeOf(eClass)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "ModelGeneratorDescriptor [modelType=" + modelType + "]"; //descriptorData=" + descriptorData
	}
}